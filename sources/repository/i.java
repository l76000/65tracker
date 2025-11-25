package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.SellArticleResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: ArticlesRepository */
class i implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11725a;

    public i(x0 x0Var) {
        this.f11725a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11725a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11725a;
        if (t9 != null) {
            try {
                x0Var.m((SellArticleResponse) new j().b(SellArticleResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.F, c.f9711s)));
            } catch (Exception unused) {
                x0Var.m(null);
            }
        } else {
            x0Var.m(null);
        }
    }
}
