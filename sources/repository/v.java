package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.IndividualPaymentSettings;
import retrofit2.b;
import retrofit2.d;

/* compiled from: SettingsRepository */
class v implements d<IndividualPaymentSettings> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11747a;

    public v(x0 x0Var) {
        this.f11747a = x0Var;
    }

    public final void a(b<IndividualPaymentSettings> bVar, Throwable th) {
        this.f11747a.m(null);
    }

    public final void b(b<IndividualPaymentSettings> bVar, retrofit2.v<IndividualPaymentSettings> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11747a;
        if (t9 != null) {
            x0Var.m((IndividualPaymentSettings) t9);
        } else {
            x0Var.m(null);
        }
    }
}
