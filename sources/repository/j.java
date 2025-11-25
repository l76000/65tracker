package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.UserArticle;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: ArticlesRepository */
class j implements d<ArrayList<UserArticle>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11727a;

    public j(x0 x0Var) {
        this.f11727a = x0Var;
    }

    public final void a(b<ArrayList<UserArticle>> bVar, Throwable th) {
        this.f11727a.m(null);
    }

    public final void b(b<ArrayList<UserArticle>> bVar, v<ArrayList<UserArticle>> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11727a;
        if (t9 != null) {
            x0Var.m((ArrayList) t9);
        } else {
            x0Var.m(null);
        }
    }
}
