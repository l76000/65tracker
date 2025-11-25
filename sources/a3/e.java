package a3;

import android.support.v4.media.h;
import androidx.core.app.z;
import e3.b;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s1;
import kotlin.text.p;
import l6.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f189a;

    public /* synthetic */ e(int i10) {
        this.f189a = i10;
    }

    public final boolean accept(File file, String str) {
        switch (this.f189a) {
            case 0:
                f fVar = f.f190a;
                l0.o(str, "name");
                s1 s1Var = s1.f37283a;
                return new p(h.t(new Object[]{f.f193d, f.f194e, f.f195f}, 3, "^(%s|%s|%s)[0-9]+.json$", "java.lang.String.format(format, *args)")).d(str);
            case 1:
                f fVar2 = f.f190a;
                l0.o(str, "name");
                s1 s1Var2 = s1.f37283a;
                return new p(h.t(new Object[]{f.f191b}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).d(str);
            case 2:
                f fVar3 = f.f190a;
                l0.o(str, "name");
                s1 s1Var3 = s1.f37283a;
                return new p(h.t(new Object[]{f.f192c}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).d(str);
            case 3:
                b bVar = b.f24012a;
                l0.o(str, "name");
                s1 s1Var4 = s1.f37283a;
                return new p(h.t(new Object[]{f.f196g}, 1, "^%s[0-9]+.json$", "java.lang.String.format(format, *args)")).d(str);
            case 4:
                Charset charset = a.f37758d;
                if (!str.startsWith(z.f4101u0) || str.endsWith("_")) {
                    return false;
                }
                return true;
            default:
                Charset charset2 = a.f37758d;
                return str.startsWith(z.f4101u0);
        }
    }
}
