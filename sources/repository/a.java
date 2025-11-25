package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.AllSecureStatus;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: AllSecureRepository */
class a implements d<AllSecureStatus> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11709a;

    public a(x0 x0Var) {
        this.f11709a = x0Var;
    }

    public final void a(b<AllSecureStatus> bVar, Throwable th) {
        this.f11709a.m(null);
    }

    public final void b(b<AllSecureStatus> bVar, v<AllSecureStatus> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11709a;
        if (t9 != null) {
            x0Var.m((AllSecureStatus) t9);
        } else {
            x0Var.m(null);
        }
    }
}
