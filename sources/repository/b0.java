package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.InAppRatingInfoModel;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class b0 implements d<InAppRatingInfoModel> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11712a;

    public b0(x0 x0Var) {
        this.f11712a = x0Var;
    }

    public final void a(b<InAppRatingInfoModel> bVar, Throwable th) {
        this.f11712a.m(null);
    }

    public final void b(b<InAppRatingInfoModel> bVar, v<InAppRatingInfoModel> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11712a;
        if (t9 == null || ((InAppRatingInfoModel) t9).getDate_time() == null) {
            x0Var.m(null);
        } else {
            x0Var.m((InAppRatingInfoModel) vVar.f39010b);
        }
    }
}
