package buslogic.app.database;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.x0;
import androidx.room.b1;
import androidx.room.c1;
import androidx.room.h;
import androidx.room.i;
import androidx.sqlite.db.framework.c;
import app.ui.transport.arrivals.g;
import buslogic.app.a;
import buslogic.app.database.dao.LineForStationDao;
import buslogic.app.database.dao.StationsDao;
import buslogic.app.database.entity.StationsEntity;
import buslogic.app.models.LineForStation;
import e.k1;
import e.o0;
import j1.b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import o1.c;
import o1.d;

@h
public abstract class AppDatabase extends c1 {
    @k1
    public static final String DATABASE_NAME = "timetable";
    public static final String DATABASE_PATH = "/databases";
    public static final String FAVORITE_STATION_ID = "favorites_station_id_";
    private static final b MIGRATION_1_2 = new b(1, 2) {
        public void migrate(@o0 d dVar) {
        }
    };
    static final b MIGRATION_2_3 = new b(2, 3) {
        public void migrate(d dVar) {
        }
    };
    public static final String SHARED_PREF_NAME = "favorites";
    private static AppDatabase sInstance;
    /* access modifiers changed from: private */
    public static SharedPreferences sharedPreferences;
    private final x0<Boolean> mIsDatabaseCreated = new x0<>();
    private final x0<Boolean> mIsDatabaseUpdatedWithNewStationVersion = new x0<>();

    private static void addDelay() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException unused) {
        }
    }

    private static AppDatabase buildDatabase(final Context context, final a aVar) {
        Executor executor;
        c1.a<AppDatabase> a10 = b1.a(context, AppDatabase.class, DATABASE_NAME);
        AnonymousClass1 r12 = new c1.b() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void lambda$onCreate$0(Context context, a aVar) {
                AppDatabase instance = AppDatabase.getInstance(context, aVar);
                DataStationsGenerator dataStationsGenerator = new DataStationsGenerator();
                ArrayList<StationsEntity> populateDatabase = dataStationsGenerator.populateDatabase();
                ArrayList arrayList = new ArrayList();
                if (populateDatabase != null) {
                    for (StationsEntity next : populateDatabase) {
                        try {
                            SharedPreferences access$000 = AppDatabase.sharedPreferences;
                            next.setFavourite(access$000.getInt(AppDatabase.FAVORITE_STATION_ID + next.getStationId(), 0));
                            arrayList.add(next);
                        } catch (Exception unused) {
                            arrayList.add(next);
                        }
                    }
                    AppDatabase.insertData(instance, arrayList, dataStationsGenerator.getLines());
                    instance.setDatabaseUpdatedWithNewStationVersion();
                    instance.setDatabaseCreated();
                }
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void lambda$onOpen$1(Context context, a aVar) {
                AppDatabase instance = AppDatabase.getInstance(context, aVar);
                DataStationsGenerator dataStationsGenerator = new DataStationsGenerator();
                ArrayList<StationsEntity> populateDatabase = dataStationsGenerator.populateDatabase();
                ArrayList arrayList = new ArrayList();
                if (populateDatabase != null) {
                    for (StationsEntity next : populateDatabase) {
                        try {
                            SharedPreferences access$000 = AppDatabase.sharedPreferences;
                            next.setFavourite(access$000.getInt(AppDatabase.FAVORITE_STATION_ID + next.getStationId(), 0));
                            arrayList.add(next);
                        } catch (Exception unused) {
                            arrayList.add(next);
                        }
                    }
                    AppDatabase.insertData(instance, arrayList, dataStationsGenerator.getLines());
                    instance.setDatabaseUpdatedWithNewStationVersion();
                    instance.setDatabaseCreated();
                }
            }

            public void onCreate(@o0 d dVar) {
                super.onCreate(dVar);
                a aVar = a.this;
                aVar.f9670a.execute(new a(context, aVar, 1));
            }

            public void onDestructiveMigration(@o0 d dVar) {
                super.onDestructiveMigration(dVar);
            }

            public void onOpen(@o0 d dVar) {
                super.onOpen(dVar);
                a aVar = a.this;
                aVar.f9670a.execute(new a(context, aVar, 0));
            }
        };
        if (a10.f7658d == null) {
            a10.f7658d = new ArrayList<>();
        }
        a10.f7658d.add(r12);
        b[] bVarArr = {MIGRATION_1_2, MIGRATION_2_3};
        if (a10.f7666l == null) {
            a10.f7666l = new HashSet();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            b bVar = bVarArr[i10];
            a10.f7666l.add(Integer.valueOf(bVar.startVersion));
            a10.f7666l.add(Integer.valueOf(bVar.endVersion));
        }
        a10.f7665k.a(bVarArr);
        a10.f7663i = false;
        a10.f7664j = true;
        a10.f7661g = true;
        if (a10.f7657c != null) {
            Class<T> cls = a10.f7655a;
            if (cls != null) {
                Executor executor2 = a10.f7659e;
                if (executor2 == null && a10.f7660f == null) {
                    Executor a11 = androidx.arch.core.executor.a.a();
                    a10.f7660f = a11;
                    a10.f7659e = a11;
                } else if (executor2 != null && a10.f7660f == null) {
                    a10.f7660f = executor2;
                } else if (executor2 == null && (executor = a10.f7660f) != null) {
                    a10.f7659e = executor;
                }
                c cVar = new c();
                Context context2 = a10.f7657c;
                String str = a10.f7656b;
                c1.d dVar = a10.f7665k;
                ArrayList<c1.b> arrayList = a10.f7658d;
                boolean z9 = a10.f7661g;
                c1.c cVar2 = a10.f7662h;
                cVar2.getClass();
                if (cVar2 == c1.c.AUTOMATIC) {
                    ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                    if (activityManager == null || c.b.b(activityManager)) {
                        cVar2 = c1.c.TRUNCATE;
                    } else {
                        cVar2 = c1.c.WRITE_AHEAD_LOGGING;
                    }
                }
                i iVar = new i(context2, str, cVar, dVar, arrayList, z9, cVar2, a10.f7659e, a10.f7660f, a10.f7663i, a10.f7664j);
                c1 c1Var = (c1) b1.b(cls, "_Impl");
                c1Var.init(iVar);
                return (AppDatabase) c1Var;
            }
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        throw new IllegalArgumentException("Cannot provide null context for the database.");
    }

    public static AppDatabase getInstance(Context context, a aVar) {
        if (sInstance == null) {
            synchronized (AppDatabase.class) {
                if (sInstance == null) {
                    sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, 0);
                    AppDatabase buildDatabase = buildDatabase(context.getApplicationContext(), aVar);
                    sInstance = buildDatabase;
                    buildDatabase.updateDatabaseCreated(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public static void insertData(AppDatabase appDatabase, List<StationsEntity> list, List<LineForStation> list2) {
        appDatabase.runInTransaction((Runnable) new g(1, appDatabase, list, list2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$insertData$1(AppDatabase appDatabase, List list, List list2) {
        appDatabase.stationsDao().insertAll(list);
        appDatabase.linesDao().insertAll(list2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$populateDatabaseAgain$0(Context context, a aVar) {
        AppDatabase instance = getInstance(context, aVar);
        DataStationsGenerator dataStationsGenerator = new DataStationsGenerator();
        ArrayList<StationsEntity> populateDatabase = dataStationsGenerator.populateDatabase();
        ArrayList arrayList = new ArrayList();
        if (populateDatabase != null) {
            for (StationsEntity next : populateDatabase) {
                try {
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    next.setFavourite(sharedPreferences2.getInt(FAVORITE_STATION_ID + next.getStationId(), 0));
                    arrayList.add(next);
                } catch (Exception unused) {
                    arrayList.add(next);
                }
            }
            insertData(instance, arrayList, dataStationsGenerator.getLines());
            instance.setDatabaseUpdatedWithNewStationVersion();
            instance.setDatabaseCreated();
        }
    }

    private static void populateDatabaseAgain(Context context, a aVar) {
        aVar.f9670a.execute(new a(context, aVar, 2));
    }

    public static void repopulateDatabaseAgain(Context context, a aVar) {
        AppDatabase appDatabase;
        File file = new File(new File(android.support.v4.media.h.s(new StringBuilder(), context.getApplicationInfo().dataDir, DATABASE_PATH)), DATABASE_NAME);
        if (!file.exists() || !context.getDatabasePath(DATABASE_NAME).exists() || (appDatabase = sInstance) == null) {
            buildDatabase(context, aVar);
            return;
        }
        try {
            appDatabase.clearAllTables();
            populateDatabaseAgain(context, aVar);
        } catch (Exception unused) {
            file.delete();
            buildDatabase(context, aVar);
        }
    }

    /* access modifiers changed from: private */
    public void setDatabaseCreated() {
        this.mIsDatabaseCreated.j(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public void setDatabaseUpdatedWithNewStationVersion() {
        this.mIsDatabaseUpdatedWithNewStationVersion.j(Boolean.TRUE);
    }

    private void updateDatabaseCreated(Context context) {
        if (context.getDatabasePath(DATABASE_NAME).exists()) {
            setDatabaseCreated();
        }
    }

    public LiveData<Boolean> getDatabaseCreated() {
        return this.mIsDatabaseCreated;
    }

    public LiveData<Boolean> isDatabaseUpdatedWithNewStationVersion() {
        return this.mIsDatabaseUpdatedWithNewStationVersion;
    }

    public abstract LineForStationDao linesDao();

    public abstract StationsDao stationsDao();
}
