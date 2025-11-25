package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.RemoveUserCreditCardResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: UserDataRepository */
class o0 implements d<RemoveUserCreditCardResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11737a;

    public o0(x0 x0Var) {
        this.f11737a = x0Var;
    }

    public final void a(b<RemoveUserCreditCardResponse> bVar, Throwable th) {
        this.f11737a.m(null);
    }

    public final void b(b<RemoveUserCreditCardResponse> bVar, v<RemoveUserCreditCardResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11737a;
        if (t9 != null) {
            x0Var.m((RemoveUserCreditCardResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
