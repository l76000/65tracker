package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.ArticleGroupationResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: ArticlesRepository */
class m implements d<ArticleGroupationResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11733a;

    public m(x0 x0Var) {
        this.f11733a = x0Var;
    }

    public final void a(b<ArticleGroupationResponse> bVar, Throwable th) {
        this.f11733a.m(null);
    }

    public final void b(b<ArticleGroupationResponse> bVar, v<ArticleGroupationResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11733a;
        if (t9 != null) {
            x0Var.m((ArticleGroupationResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
