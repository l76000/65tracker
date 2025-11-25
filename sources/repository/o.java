package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.CreateNewMonthlyCardResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: CardsRepository */
class o implements d<CreateNewMonthlyCardResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11736a;

    public o(x0 x0Var) {
        this.f11736a = x0Var;
    }

    public final void a(b<CreateNewMonthlyCardResponse> bVar, Throwable th) {
        this.f11736a.m(null);
    }

    public final void b(b<CreateNewMonthlyCardResponse> bVar, v<CreateNewMonthlyCardResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11736a;
        if (t9 != null) {
            x0Var.m((CreateNewMonthlyCardResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
