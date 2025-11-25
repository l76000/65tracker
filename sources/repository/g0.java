package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.RetriveInfoResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: StationRepository */
class g0 implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11722a;

    public g0(x0 x0Var) {
        this.f11722a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11722a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11722a;
        if (t9 != null) {
            try {
                RetriveInfoResponse retriveInfoResponse = (RetriveInfoResponse) new j().b(RetriveInfoResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.N, c.A));
                if (retriveInfoResponse.success.booleanValue()) {
                    x0Var.m(retriveInfoResponse.data);
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
