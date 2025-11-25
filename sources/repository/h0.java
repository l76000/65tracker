package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.GetCitiesExtendedResponse;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: StationRepository */
class h0 implements d<GetCitiesExtendedResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11724a;

    public h0(x0 x0Var) {
        this.f11724a = x0Var;
    }

    public final void a(b<GetCitiesExtendedResponse> bVar, Throwable th) {
        this.f11724a.m(new GetCitiesExtendedResponse(new ArrayList(), new ArrayList()));
    }

    public final void b(b<GetCitiesExtendedResponse> bVar, v<GetCitiesExtendedResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11724a;
        if (t9 != null) {
            x0Var.m((GetCitiesExtendedResponse) t9);
        } else {
            x0Var.m(new GetCitiesExtendedResponse(new ArrayList(), new ArrayList()));
        }
    }
}
