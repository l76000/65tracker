package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.AdditionalTabsSettings;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class t implements d<AdditionalTabsSettings> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11744a;

    public t(x0 x0Var) {
        this.f11744a = x0Var;
    }

    public final void a(b<AdditionalTabsSettings> bVar, Throwable th) {
        this.f11744a.m(null);
    }

    public final void b(b<AdditionalTabsSettings> bVar, v<AdditionalTabsSettings> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11744a;
        if (t9 != null) {
            x0Var.m((AdditionalTabsSettings) t9);
        } else {
            x0Var.m(null);
        }
    }
}
