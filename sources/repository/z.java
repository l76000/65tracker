package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.BusDistanceType;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class z implements d<BusDistanceType> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11752a;

    public z(x0 x0Var) {
        this.f11752a = x0Var;
    }

    public final void a(b<BusDistanceType> bVar, Throwable th) {
        this.f11752a.m(null);
    }

    public final void b(b<BusDistanceType> bVar, v<BusDistanceType> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11752a;
        if (t9 != null) {
            x0Var.m((BusDistanceType) t9);
        } else {
            x0Var.m(null);
        }
    }
}
