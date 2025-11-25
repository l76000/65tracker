package a;

import android.graphics.Bitmap;
import androidx.core.view.s0;
import com.google.zxing.a;
import com.google.zxing.f;
import com.google.zxing.j;
import java.util.EnumMap;
import n7.b;
import org.apache.http.protocol.HTTP;

/* compiled from: QRGEncoder */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f34a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public String f35b = null;

    /* renamed from: c  reason: collision with root package name */
    public a f36c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f37d;

    public c(String str, int i10) {
        boolean z9 = false;
        this.f37d = false;
        this.f34a = i10;
        this.f36c = a.QR_CODE;
        if (str != null && str.length() > 0) {
            this.f35b = str;
        }
        String str2 = this.f35b;
        if (str2 != null && str2.length() > 0) {
            z9 = true;
        }
        this.f37d = z9;
    }

    public final Bitmap a() {
        String str;
        int i10;
        EnumMap enumMap = null;
        if (!this.f37d) {
            return null;
        }
        String str2 = this.f35b;
        int i11 = 0;
        while (true) {
            if (i11 >= str2.length()) {
                str = null;
                break;
            } else if (str2.charAt(i11) > 255) {
                str = HTTP.UTF_8;
                break;
            } else {
                i11++;
            }
        }
        if (str != null) {
            enumMap = new EnumMap(f.class);
            enumMap.put(f.CHARACTER_SET, str);
        }
        j jVar = new j();
        String str3 = this.f35b;
        a aVar = this.f36c;
        int i12 = this.f34a;
        b a10 = jVar.a(str3, aVar, i12, i12, enumMap);
        int i13 = a10.O;
        int i14 = a10.P;
        int[] iArr = new int[(i13 * i14)];
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i15 * i13;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = i16 + i17;
                if (a10.b(i17, i15)) {
                    i10 = s0.f4911s;
                } else {
                    i10 = -1;
                }
                iArr[i18] = i10;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i13, 0, 0, i13, i14);
        return createBitmap;
    }
}
