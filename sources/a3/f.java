package a3;

import com.facebook.a;
import com.facebook.b0;
import com.facebook.internal.x0;
import com.facebook.z;
import e.a1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Iterator;
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
/* compiled from: InstrumentUtility.kt */
public final class f {
    @d

    /* renamed from: a  reason: collision with root package name */
    public static final f f190a = new f();
    @d

    /* renamed from: b  reason: collision with root package name */
    public static final String f191b = "analysis_log_";
    @d

    /* renamed from: c  reason: collision with root package name */
    public static final String f192c = "anr_log_";
    @d

    /* renamed from: d  reason: collision with root package name */
    public static final String f193d = "crash_log_";
    @d

    /* renamed from: e  reason: collision with root package name */
    public static final String f194e = "shield_log_";
    @d

    /* renamed from: f  reason: collision with root package name */
    public static final String f195f = "thread_check_log_";
    @d

    /* renamed from: g  reason: collision with root package name */
    public static final String f196g = "error_log_";

    @l
    public static final boolean a(@e String str) {
        File c10 = c();
        if (c10 == null || str == null) {
            return false;
        }
        return new File(c10, str).delete();
    }

    @e
    @l
    public static final String b(@e Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return String.valueOf(th.getCause());
    }

    @e
    @l
    public static final File c() {
        File file = new File(z.e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @e
    @l
    public static final String d(@d Thread thread) {
        l0.p(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        l0.o(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @e
    @l
    public static final String e(@e Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l0.o(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    @l
    public static final boolean f(@d StackTraceElement stackTraceElement) {
        l0.p(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        l0.o(className, "element.className");
        if (!j0.v0(className, "com.facebook", false, 2, (Object) null)) {
            String className2 = stackTraceElement.getClassName();
            l0.o(className2, "element.className");
            if (j0.v0(className2, "com.meta", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @l
    public static final boolean g(@e Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            l0.o(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                l0.o(stackTraceElement, "element");
                if (f(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    @l
    public static final boolean h(@e Thread thread) {
        StackTraceElement[] stackTrace;
        if (!(thread == null || (stackTrace = thread.getStackTrace()) == null)) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                l0.o(stackTraceElement, "element");
                if (f(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    l0.o(className, "element.className");
                    if (!j0.v0(className, "com.facebook.appevents.codeless", false, 2, (Object) null)) {
                        String className2 = stackTraceElement.getClassName();
                        l0.o(className2, "element.className");
                        if (!j0.v0(className2, "com.facebook.appevents.suggestedevents", false, 2, (Object) null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    l0.o(methodName, "element.methodName");
                    if (!j0.v0(methodName, "onClick", false, 2, (Object) null)) {
                        String methodName2 = stackTraceElement.getMethodName();
                        l0.o(methodName2, "element.methodName");
                        if (!j0.v0(methodName2, "onItemClick", false, 2, (Object) null)) {
                            String methodName3 = stackTraceElement.getMethodName();
                            l0.o(methodName3, "element.methodName");
                            if (!j0.v0(methodName3, "onTouch", false, 2, (Object) null)) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    @l
    @d
    public static final File[] i() {
        File c10 = c();
        if (c10 == null) {
            return new File[0];
        }
        File[] listFiles = c10.listFiles(new e(2));
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    @l
    @d
    public static final File[] j() {
        File c10 = c();
        if (c10 == null) {
            return new File[0];
        }
        File[] listFiles = c10.listFiles(new e(1));
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    @l
    @d
    public static final File[] k() {
        File c10 = c();
        if (c10 == null) {
            return new File[0];
        }
        File[] listFiles = c10.listFiles(new e(0));
        if (listFiles == null) {
            return new File[0];
        }
        return listFiles;
    }

    @e
    @l
    public static final JSONObject l(@e String str, boolean z9) {
        File c10 = c();
        if (!(c10 == null || str == null)) {
            try {
                return new JSONObject(x0.h0(new FileInputStream(new File(c10, str))));
            } catch (Exception unused) {
                if (z9) {
                    a(str);
                }
            }
        }
        return null;
    }

    @l
    public static final void m(@e String str, @d JSONArray jSONArray, @e b0.b bVar) {
        l0.p(jSONArray, "reports");
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                JSONObject t9 = x0.t();
                if (t9 != null) {
                    Iterator<String> keys = t9.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, t9.get(next));
                    }
                }
                b0.c cVar = b0.f13283j;
                s1 s1Var = s1.f37283a;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{z.f()}, 1));
                l0.o(format, "java.lang.String.format(format, *args)");
                cVar.getClass();
                b0.c.n((a) null, format, jSONObject, bVar).l();
            } catch (JSONException unused) {
            }
        }
    }

    @l
    public static final void n(@e String str, @e String str2) {
        File c10 = c();
        if (c10 != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(c10, str));
                byte[] bytes = str2.getBytes(kotlin.text.f.f37393b);
                l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
