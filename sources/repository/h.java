package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.GetArticlesForSaleResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: ArticlesRepository */
class h implements d<GetArticlesForSaleResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11723a;

    public h(x0 x0Var) {
        this.f11723a = x0Var;
    }

    public final void a(b<GetArticlesForSaleResponse> bVar, Throwable th) {
        this.f11723a.m(null);
    }

    public final void b(b<GetArticlesForSaleResponse> bVar, v<GetArticlesForSaleResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11723a;
        if (t9 != null) {
            x0Var.m((GetArticlesForSaleResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
