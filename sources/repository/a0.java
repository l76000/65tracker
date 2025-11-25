package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.SendProblemReportResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class a0 implements d<SendProblemReportResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11710a;

    public a0(x0 x0Var) {
        this.f11710a = x0Var;
    }

    public final void a(b<SendProblemReportResponse> bVar, Throwable th) {
        this.f11710a.m(null);
    }

    public final void b(b<SendProblemReportResponse> bVar, v<SendProblemReportResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11710a;
        if (t9 != null) {
            x0Var.m((SendProblemReportResponse) t9);
        } else {
            x0Var.m(null);
        }
    }
}
