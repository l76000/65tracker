package a3;

import a3.c;
import com.facebook.a;
import com.facebook.b0;
import com.facebook.f0;
import com.facebook.internal.s;
import com.facebook.internal.x0;
import com.facebook.z;
import e.a1;
import e.k1;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import k9.d;
import k9.e;
import kotlin.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r8.l;

@h0
@a1
/* compiled from: ExceptionAnalyzer.kt */
public final class b {
    @d

    /* renamed from: a  reason: collision with root package name */
    public static final b f175a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f176b;

    @l
    public static final void a() {
        f176b = true;
        if (z.j()) {
            f175a.getClass();
            if (!x0.M()) {
                File[] j10 = f.j();
                ArrayList arrayList = new ArrayList();
                int length = j10.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = j10[i10];
                    i10++;
                    c d10 = c.a.d(file);
                    if (d10.b()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("crash_shield", d10.toString());
                            b0.c cVar = b0.f13283j;
                            s1 s1Var = s1.f37283a;
                            String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{z.f()}, 1));
                            l0.o(format, "java.lang.String.format(format, *args)");
                            a aVar = new a(0, d10);
                            cVar.getClass();
                            arrayList.add(b0.c.n((a) null, format, jSONObject, aVar));
                        } catch (JSONException unused) {
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    f0 f0Var = new f0((Collection<b0>) arrayList);
                    b0.f13283j.getClass();
                    b0.c.h(f0Var);
                }
            }
        }
    }

    @l
    public static final void b(@e Throwable th) {
        if (f176b && !c() && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            l0.o(stackTrace, "e.stackTrace");
            for (StackTraceElement className : stackTrace) {
                s sVar = s.f13873a;
                String className2 = className.getClassName();
                l0.o(className2, "it.className");
                s.b c10 = s.c(className2);
                if (c10 != s.b.Unknown) {
                    s.b(c10);
                    hashSet.add(c10.toString());
                }
            }
            if (z.j() && (!hashSet.isEmpty())) {
                c.a aVar = c.a.f185a;
                c.a.c(new JSONArray(hashSet)).c();
            }
        }
    }

    @l
    @k1
    public static final boolean c() {
        return false;
    }
}
