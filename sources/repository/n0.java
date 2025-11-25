package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.UserCreditCard;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: UserDataRepository */
class n0 implements d<ArrayList<UserCreditCard>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11735a;

    public n0(x0 x0Var) {
        this.f11735a = x0Var;
    }

    public final void a(b<ArrayList<UserCreditCard>> bVar, Throwable th) {
        this.f11735a.m(new ArrayList());
    }

    public final void b(b<ArrayList<UserCreditCard>> bVar, v<ArrayList<UserCreditCard>> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11735a;
        if (t9 != null) {
            x0Var.m((ArrayList) t9);
        } else {
            x0Var.m(new ArrayList());
        }
    }
}
