package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.FinanceTabSettingsResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class u implements d<FinanceTabSettingsResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11745a;

    public u(x0 x0Var) {
        this.f11745a = x0Var;
    }

    public final void a(b<FinanceTabSettingsResponse> bVar, Throwable th) {
        this.f11745a.m(null);
    }

    public final void b(b<FinanceTabSettingsResponse> bVar, v<FinanceTabSettingsResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11745a;
        if (t9 != null) {
            x0Var.m((FinanceTabSettingsResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
