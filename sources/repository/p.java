package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.BuyMonthlyCardResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: CardsRepository */
class p implements d<BuyMonthlyCardResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11738a;

    public p(x0 x0Var) {
        this.f11738a = x0Var;
    }

    public final void a(b<BuyMonthlyCardResponse> bVar, Throwable th) {
        this.f11738a.m(null);
    }

    public final void b(b<BuyMonthlyCardResponse> bVar, v<BuyMonthlyCardResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11738a;
        if (t9 != null) {
            x0Var.m((BuyMonthlyCardResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
