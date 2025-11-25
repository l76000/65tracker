package a3;

import com.facebook.internal.x0;
import e.a1;
import java.io.File;
import k9.e;
import kotlin.h0;
import kotlin.jvm.internal.l0;
import org.json.JSONArray;
import org.json.JSONObject;
import r8.l;

@h0
@a1
/* compiled from: InstrumentData.kt */
public final class c {
    @k9.d

    /* renamed from: h  reason: collision with root package name */
    public static final b f177h = new b();
    @k9.d

    /* renamed from: a  reason: collision with root package name */
    public final String f178a;
    @e

    /* renamed from: b  reason: collision with root package name */
    public final C0002c f179b;
    @e

    /* renamed from: c  reason: collision with root package name */
    public final JSONArray f180c;
    @e

    /* renamed from: d  reason: collision with root package name */
    public final String f181d;
    @e

    /* renamed from: e  reason: collision with root package name */
    public final String f182e;
    @e

    /* renamed from: f  reason: collision with root package name */
    public final String f183f;
    @e

    /* renamed from: g  reason: collision with root package name */
    public final Long f184g;

    @h0
    /* compiled from: InstrumentData.kt */
    public static final class a {
        @k9.d

        /* renamed from: a  reason: collision with root package name */
        public static final a f185a = new a();

        @l
        @k9.d
        public static final c a(@e String str, @e String str2) {
            return new c(str, str2);
        }

        @l
        @k9.d
        public static final c b(@e Throwable th, @k9.d C0002c cVar) {
            l0.p(cVar, "t");
            return new c(th, cVar);
        }

        @l
        @k9.d
        public static final c c(@k9.d JSONArray jSONArray) {
            l0.p(jSONArray, "features");
            return new c(jSONArray);
        }

        @l
        @k9.d
        public static final c d(@k9.d File file) {
            l0.p(file, com.facebook.share.internal.l.f15317c);
            return new c(file);
        }
    }

    @h0
    /* compiled from: InstrumentData.kt */
    public static final class b {
        public static final C0002c a(b bVar, String str) {
            bVar.getClass();
            if (j0.v0(str, f.f193d, false, 2, (Object) null)) {
                return C0002c.CrashReport;
            }
            if (j0.v0(str, f.f194e, false, 2, (Object) null)) {
                return C0002c.CrashShield;
            }
            if (j0.v0(str, f.f195f, false, 2, (Object) null)) {
                return C0002c.ThreadCheck;
            }
            if (j0.v0(str, f.f191b, false, 2, (Object) null)) {
                return C0002c.Analysis;
            }
            if (j0.v0(str, f.f192c, false, 2, (Object) null)) {
                return C0002c.AnrReport;
            }
            return C0002c.Unknown;
        }
    }

    @h0
    /* renamed from: a3.c$c  reason: collision with other inner class name */
    /* compiled from: InstrumentData.kt */
    public enum C0002c {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @h0
        /* renamed from: a3.c$c$a */
        /* compiled from: InstrumentData.kt */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f186a = null;

            static {
                int[] iArr = new int[C0002c.values().length];
                iArr[C0002c.Analysis.ordinal()] = 1;
                iArr[C0002c.AnrReport.ordinal()] = 2;
                iArr[C0002c.CrashReport.ordinal()] = 3;
                iArr[C0002c.CrashShield.ordinal()] = 4;
                iArr[C0002c.ThreadCheck.ordinal()] = 5;
                f186a = iArr;
            }
        }

        @k9.d
        public final String toString() {
            int i10 = a.f186a[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 == 4) {
                return "CrashShield";
            }
            if (i10 != 5) {
                return com.facebook.internal.a.f13612t;
            }
            return "ThreadCheck";
        }
    }

    @h0
    /* compiled from: InstrumentData.kt */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f187a;

        static {
            int[] iArr = new int[C0002c.values().length];
            iArr[C0002c.Analysis.ordinal()] = 1;
            iArr[C0002c.AnrReport.ordinal()] = 2;
            iArr[C0002c.CrashReport.ordinal()] = 3;
            iArr[C0002c.CrashShield.ordinal()] = 4;
            iArr[C0002c.ThreadCheck.ordinal()] = 5;
            f187a = iArr;
        }
    }

    public c(JSONArray jSONArray) {
        this.f179b = C0002c.Analysis;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f184g = valueOf;
        this.f180c = jSONArray;
        StringBuffer stringBuffer = new StringBuffer(f.f191b);
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l0.o(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f178a = stringBuffer2;
    }

    public final int a(@k9.d c cVar) {
        l0.p(cVar, "data");
        Long l10 = this.f184g;
        if (l10 == null) {
            return -1;
        }
        long longValue = l10.longValue();
        Long l11 = cVar.f184g;
        if (l11 == null) {
            return 1;
        }
        return l0.u(l11.longValue(), longValue);
    }

    public final boolean b() {
        int i10;
        C0002c cVar = this.f179b;
        if (cVar == null) {
            i10 = -1;
        } else {
            i10 = d.f187a[cVar.ordinal()];
        }
        Long l10 = this.f184g;
        if (i10 != 1) {
            String str = this.f183f;
            if (i10 != 2) {
                if (!(i10 == 3 || i10 == 4 || i10 == 5) || str == null || l10 == null) {
                    return false;
                }
            } else if (str == null || this.f182e == null || l10 == null) {
                return false;
            }
        } else if (this.f180c == null || l10 == null) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (b()) {
            f fVar = f.f190a;
            f.n(this.f178a, toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    @k9.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r6 = this;
            a3.c$c r0 = r6.f179b
            if (r0 != 0) goto L_0x0006
            r1 = -1
            goto L_0x000e
        L_0x0006:
            int[] r1 = a3.c.d.f187a
            int r2 = r0.ordinal()
            r1 = r1[r2]
        L_0x000e:
            r2 = 1
            java.lang.String r3 = "timestamp"
            java.lang.Long r4 = r6.f184g
            if (r1 == r2) goto L_0x005d
            r2 = 2
            if (r1 == r2) goto L_0x0022
            r2 = 3
            if (r1 == r2) goto L_0x0022
            r2 = 4
            if (r1 == r2) goto L_0x0022
            r2 = 5
            if (r1 == r2) goto L_0x0022
            goto L_0x0071
        L_0x0022:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "device_os_version"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch:{ JSONException -> 0x0071 }
            r1.put(r2, r5)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r2 = "device_model"
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0071 }
            r1.put(r2, r5)     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r2 = r6.f181d     // Catch:{ JSONException -> 0x0071 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r5 = "app_version"
            r1.put(r5, r2)     // Catch:{ JSONException -> 0x0071 }
        L_0x003e:
            if (r4 == 0) goto L_0x0043
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0071 }
        L_0x0043:
            java.lang.String r2 = r6.f182e     // Catch:{ JSONException -> 0x0071 }
            if (r2 == 0) goto L_0x004c
            java.lang.String r3 = "reason"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x0071 }
        L_0x004c:
            java.lang.String r2 = r6.f183f     // Catch:{ JSONException -> 0x0071 }
            if (r2 == 0) goto L_0x0055
            java.lang.String r3 = "callstack"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x0071 }
        L_0x0055:
            if (r0 == 0) goto L_0x0072
            java.lang.String r2 = "type"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0071 }
            goto L_0x0072
        L_0x005d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONArray r0 = r6.f180c     // Catch:{ JSONException -> 0x0071 }
            if (r0 == 0) goto L_0x006b
            java.lang.String r2 = "feature_names"
            r1.put(r2, r0)     // Catch:{ JSONException -> 0x0071 }
        L_0x006b:
            if (r4 == 0) goto L_0x0072
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x0071 }
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 != 0) goto L_0x0083
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "JSONObject().toString()"
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        L_0x0083:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "params.toString()"
            kotlin.jvm.internal.l0.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.c.toString():java.lang.String");
    }

    public c(Throwable th, C0002c cVar) {
        this.f179b = cVar;
        this.f181d = x0.p();
        this.f182e = f.b(th);
        this.f183f = f.e(th);
        Long valueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f184g = valueOf;
        StringBuffer stringBuffer = new StringBuffer();
        cVar.getClass();
        int i10 = C0002c.a.f186a[cVar.ordinal()];
        stringBuffer.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? com.facebook.internal.a.f13612t : f.f195f : f.f194e : f.f193d : f.f192c : f.f191b);
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l0.o(stringBuffer2, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.f178a = stringBuffer2;
    }

    public c(String str, String str2) {
        this.f179b = C0002c.AnrReport;
        this.f181d = x0.p();
        this.f182e = str;
        this.f183f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.f184g = valueOf;
        StringBuffer stringBuffer = new StringBuffer(f.f192c);
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        l0.o(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.f178a = stringBuffer2;
    }

    public c(File file) {
        String name = file.getName();
        l0.o(name, "file.name");
        this.f178a = name;
        this.f179b = b.a(f177h, name);
        JSONObject l10 = f.l(name, true);
        if (l10 != null) {
            this.f184g = Long.valueOf(l10.optLong("timestamp", 0));
            this.f181d = l10.optString("app_version", (String) null);
            this.f182e = l10.optString("reason", (String) null);
            this.f183f = l10.optString("callstack", (String) null);
            this.f180c = l10.optJSONArray("feature_names");
        }
    }
}
