package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.FavouriteStationsIds;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: UserDataRepository */
class s0 implements d<ArrayList<FavouriteStationsIds>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11743a;

    public s0(x0 x0Var) {
        this.f11743a = x0Var;
    }

    public final void a(b<ArrayList<FavouriteStationsIds>> bVar, Throwable th) {
        this.f11743a.m(null);
    }

    public final void b(b<ArrayList<FavouriteStationsIds>> bVar, v<ArrayList<FavouriteStationsIds>> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11743a;
        if (t9 != null) {
            x0Var.m((ArrayList) t9);
        } else {
            x0Var.m(null);
        }
    }
}
