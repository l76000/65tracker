package androidx.browser.trusted;

import e.o0;
import e.q0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: TokenContents */
final class i {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1464a;
    @q0

    /* renamed from: b  reason: collision with root package name */
    public String f1465b;
    @q0

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f1466c;

    public i(@o0 byte[] bArr) {
        this.f1464a = bArr;
    }

    @o0
    public static i a(String str, List<byte[]> list) {
        Collections.sort(list, new h());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] next : list) {
            dataOutputStream.writeInt(next.length);
            dataOutputStream.write(next);
        }
        dataOutputStream.flush();
        return new i(str, list, byteArrayOutputStream.toByteArray());
    }

    public final void b() {
        if (this.f1465b == null) {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.f1464a));
            this.f1465b = dataInputStream.readUTF();
            int readInt = dataInputStream.readInt();
            this.f1466c = new ArrayList(readInt);
            int i10 = 0;
            while (i10 < readInt) {
                int readInt2 = dataInputStream.readInt();
                byte[] bArr = new byte[readInt2];
                if (dataInputStream.read(bArr) == readInt2) {
                    this.f1466c.add(bArr);
                    i10++;
                } else {
                    throw new IllegalStateException("Could not read fingerprint");
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1464a, ((i) obj).f1464a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1464a);
    }

    public i(@o0 String str, @o0 List list, @o0 byte[] bArr) {
        this.f1464a = bArr;
        this.f1465b = str;
        this.f1466c = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            this.f1466c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
