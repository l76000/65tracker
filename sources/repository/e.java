package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.LineRouteVersionResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: AnnouncementRepository */
class e implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11719a;

    public e(x0 x0Var) {
        this.f11719a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11719a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11719a;
        if (t9 != null) {
            try {
                LineRouteVersionResponse lineRouteVersionResponse = (LineRouteVersionResponse) new j().b(LineRouteVersionResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.K, c.f9716x));
                if (lineRouteVersionResponse.success.booleanValue()) {
                    x0Var.m(lineRouteVersionResponse.data);
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
