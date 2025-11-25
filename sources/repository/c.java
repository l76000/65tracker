package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.AnnouncementResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: AnnouncementRepository */
class c implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11713a;

    public c(x0 x0Var) {
        this.f11713a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11713a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11713a;
        if (t9 != null) {
            try {
                AnnouncementResponse announcementResponse = (AnnouncementResponse) new j().b(AnnouncementResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, buslogic.app.c.G, buslogic.app.c.f9712t));
                if (announcementResponse.success.booleanValue()) {
                    x0Var.m(announcementResponse.data);
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
