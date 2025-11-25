package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.UserFinanceResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: UserDataRepository */
class p0 implements d<UserFinanceResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11739a;

    public p0(x0 x0Var) {
        this.f11739a = x0Var;
    }

    public final void a(b<UserFinanceResponse> bVar, Throwable th) {
        this.f11739a.m(null);
    }

    public final void b(b<UserFinanceResponse> bVar, v<UserFinanceResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11739a;
        if (t9 != null) {
            x0Var.m((UserFinanceResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
