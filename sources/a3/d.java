package a3;

import com.facebook.appevents.m;
import com.facebook.internal.s;
import com.facebook.z;
import e.a1;
import kotlin.h0;
import r8.l;

@h0
@a1
/* compiled from: InstrumentManager.kt */
public final class d {
    @k9.d

    /* renamed from: a  reason: collision with root package name */
    public static final d f188a = new d();

    @l
    public static final void a() {
        if (z.j()) {
            s sVar = s.f13873a;
            s.a(s.b.CrashReport, new m(2));
            s.a(s.b.ErrorReport, new m(3));
            s.a(s.b.AnrReport, new m(4));
        }
    }
}
