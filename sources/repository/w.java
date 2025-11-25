package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.CardTypesResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class w implements d<CardTypesResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11749a;

    public w(x0 x0Var) {
        this.f11749a = x0Var;
    }

    public final void a(b<CardTypesResponse> bVar, Throwable th) {
        this.f11749a.m(null);
    }

    public final void b(b<CardTypesResponse> bVar, v<CardTypesResponse> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11749a;
        if (t9 == null || !((CardTypesResponse) t9).success) {
            x0Var.m(null);
        } else {
            x0Var.m(((CardTypesResponse) t9).arr);
        }
    }
}
