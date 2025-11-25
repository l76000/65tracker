package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.InAppRatingResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class s implements d<InAppRatingResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11742a;

    public s(x0 x0Var) {
        this.f11742a = x0Var;
    }

    public final void a(b<InAppRatingResponse> bVar, Throwable th) {
        this.f11742a.m(null);
    }

    public final void b(b<InAppRatingResponse> bVar, v<InAppRatingResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11742a;
        if (t9 != null) {
            x0Var.m((InAppRatingResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
