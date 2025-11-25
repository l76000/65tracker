package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.MonthlyCardTransaction;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: CardsRepository */
class q implements d<ArrayList<MonthlyCardTransaction>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11740a;

    public q(x0 x0Var) {
        this.f11740a = x0Var;
    }

    public final void a(b<ArrayList<MonthlyCardTransaction>> bVar, Throwable th) {
        this.f11740a.m(null);
    }

    public final void b(b<ArrayList<MonthlyCardTransaction>> bVar, v<ArrayList<MonthlyCardTransaction>> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11740a;
        if (t9 != null) {
            x0Var.m((ArrayList) t9);
        } else {
            x0Var.m(null);
        }
    }
}
