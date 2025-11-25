package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.GetInfoMessagesSettingsResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class y implements d<GetInfoMessagesSettingsResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11751a;

    public y(x0 x0Var) {
        this.f11751a = x0Var;
    }

    public final void a(b<GetInfoMessagesSettingsResponse> bVar, Throwable th) {
        this.f11751a.m(null);
    }

    public final void b(b<GetInfoMessagesSettingsResponse> bVar, v<GetInfoMessagesSettingsResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11751a;
        if (t9 != null) {
            x0Var.m((GetInfoMessagesSettingsResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
