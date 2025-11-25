package buslogic.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import buslogic.app.database.AppDatabase;
import buslogic.app.database.entity.StationsEntity;
import buslogic.app.models.LineForStation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DataRepository */
public class f {

    /* renamed from: i  reason: collision with root package name */
    public static f f9721i;

    /* renamed from: j  reason: collision with root package name */
    public static final v0<Boolean> f9722j = new v0<>();

    /* renamed from: a  reason: collision with root package name */
    public final AppDatabase f9723a;

    /* renamed from: b  reason: collision with root package name */
    public final v0<List<StationsEntity>> f9724b;

    /* renamed from: c  reason: collision with root package name */
    public final v0<List<StationsEntity>> f9725c;

    /* renamed from: d  reason: collision with root package name */
    public final x0<List<StationsEntity>> f9726d = new x0<>();

    /* renamed from: e  reason: collision with root package name */
    public final x0<List<LineForStation>> f9727e = new x0<>();

    /* renamed from: f  reason: collision with root package name */
    public final SharedPreferences.Editor f9728f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f9729g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<String> f9730h = new ArrayList<>();

    /* compiled from: DataRepository */
    public class a implements y0<Boolean> {
        public a() {
        }

        public final void a(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                f.this.f9723a.getDatabaseCreated().k(this);
            }
        }
    }

    /* compiled from: DataRepository */
    public class b implements y0<Boolean> {
        public b() {
        }

        public final void a(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                f.this.f9723a.getDatabaseCreated().k(this);
            }
        }
    }

    public f(Context context, AppDatabase appDatabase) {
        this.f9723a = appDatabase;
        v0<List<StationsEntity>> v0Var = new v0<>();
        this.f9724b = v0Var;
        v0<List<StationsEntity>> v0Var2 = new v0<>();
        this.f9725c = v0Var2;
        this.f9728f = context.getSharedPreferences(AppDatabase.SHARED_PREF_NAME, 0).edit();
        v0<Boolean> v0Var3 = f9722j;
        v0Var3.n(appDatabase.stationsDao().loadAllStations(), new e(this, 0));
        v0Var3.n(appDatabase.linesDao().getAllLines(), new e(this, 1));
        v0Var.n(appDatabase.stationsDao().loadFavorites(), new e(this, 2));
        v0Var2.n(appDatabase.stationsDao().getPinnedStations(), new e(this, 3));
    }

    public static f a(Context context, AppDatabase appDatabase) {
        if (f9721i == null) {
            synchronized (f.class) {
                if (f9721i == null) {
                    f9721i = new f(context, appDatabase);
                }
            }
        }
        return f9721i;
    }

    public final void b() {
        v0<List<StationsEntity>> v0Var = this.f9724b;
        if (v0Var.e() != null && !v0Var.e().isEmpty()) {
            for (StationsEntity stationId : v0Var.e()) {
                this.f9728f.putInt(AppDatabase.FAVORITE_STATION_ID + stationId.getStationId(), 0).commit();
            }
            ArrayList arrayList = new ArrayList();
            x0<List<StationsEntity>> x0Var = this.f9726d;
            if (x0Var.e() != null) {
                for (StationsEntity stationsEntity : x0Var.e()) {
                    stationsEntity.setFavourite(0);
                    stationsEntity.setPinned(0);
                    arrayList.add(stationsEntity);
                }
                x0Var.j(arrayList);
            }
        }
        this.f9723a.stationsDao().removeFavouriteStations();
    }

    public final void c(int i10, int i11, int i12) {
        x0<List<StationsEntity>> x0Var = this.f9726d;
        if (x0Var.e() != null) {
            Iterator it = x0Var.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StationsEntity stationsEntity = (StationsEntity) it.next();
                if (stationsEntity.getStationId() == i10) {
                    stationsEntity.setFavourite(i11);
                    stationsEntity.setPinned(i12);
                    break;
                }
            }
        }
        this.f9723a.stationsDao().updateStations(i10, i11, i12);
        this.f9728f.putInt(AppDatabase.FAVORITE_STATION_ID + i10, i11).commit();
    }
}
