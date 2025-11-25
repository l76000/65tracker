package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.UserInfo;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: UserDataRepository */
class j0 implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11728a;

    public j0(x0 x0Var) {
        this.f11728a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11728a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11728a;
        if (t9 != null) {
            try {
                x0Var.m((UserInfo) new j().b(UserInfo.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.H, c.f9713u)));
            } catch (Exception e10) {
                e10.printStackTrace();
                x0Var.m(null);
            }
        } else {
            x0Var.m(null);
        }
    }
}
