package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.LineRouteData;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.v;

/* compiled from: AnnouncementRepository */
class d implements retrofit2.d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11715a;

    public d(x0 x0Var) {
        this.f11715a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11715a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11715a;
        if (t9 != null) {
            try {
                LineRouteData lineRouteData = (LineRouteData) new j().b(LineRouteData.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.O, c.B));
                if (lineRouteData.success.booleanValue()) {
                    x0Var.m(lineRouteData);
                } else {
                    x0Var.m(null);
                }
            } catch (Exception unused) {
                x0Var.m(null);
            }
        } else {
            x0Var.m(null);
        }
    }
}
