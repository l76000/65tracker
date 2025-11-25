package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.CardPriceGroup;
import java.util.ArrayList;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: SettingsRepository */
class x implements d<ArrayList<CardPriceGroup>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11750a;

    public x(x0 x0Var) {
        this.f11750a = x0Var;
    }

    public final void a(b<ArrayList<CardPriceGroup>> bVar, Throwable th) {
        this.f11750a.m(new ArrayList());
    }

    public final void b(b<ArrayList<CardPriceGroup>> bVar, v<ArrayList<CardPriceGroup>> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11750a;
        if (t9 != null) {
            x0Var.m((ArrayList) t9);
        } else {
            x0Var.m(new ArrayList());
        }
    }
}
