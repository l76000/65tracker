package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.LastUserArticleResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: ArticlesRepository */
class k implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11729a;

    public k(x0 x0Var) {
        this.f11729a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11729a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11729a;
        if (t9 != null) {
            LastUserArticleResponse lastUserArticleResponse = (LastUserArticleResponse) new j().b(LastUserArticleResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.I, c.f9714v));
            if (lastUserArticleResponse.success.booleanValue()) {
                x0Var.m(lastUserArticleResponse.last_articles);
            } else {
                x0Var.m(null);
            }
        } else {
            x0Var.m(null);
        }
    }
}
