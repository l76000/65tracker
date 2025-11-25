package buslogic.app.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.c1;
import androidx.room.f1;
import androidx.room.n1;
import androidx.room.q;
import androidx.room.r;
import androidx.room.util.b;
import androidx.room.util.c;
import buslogic.app.database.entity.StationsEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o1.i;

public final class StationsDao_Impl implements StationsDao {
    /* access modifiers changed from: private */
    public final c1 __db;
    private final r<StationsEntity> __insertionAdapterOfStationsEntity;
    private final n1 __preparedStmtOfRemoveFavouriteStations;
    private final n1 __preparedStmtOfUpdateStations;
    private final q<StationsEntity> __updateAdapterOfStationsEntity;

    public StationsDao_Impl(c1 c1Var) {
        this.__db = c1Var;
        this.__insertionAdapterOfStationsEntity = new r<StationsEntity>(c1Var) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `stations` (`id`,`stationId`,`stationName`,`stationNameLatin`,`slugs`,`cityId`,`stationLatitude`,`stationLongitude`,`favourite`,`stationIdOrg`,`pinned`,`lines`,`busColor`,`tramColor`,`trolleybusColor`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(i iVar, StationsEntity stationsEntity) {
                iVar.V(1, (long) stationsEntity.getId());
                iVar.V(2, (long) stationsEntity.getStationId());
                if (stationsEntity.getStationName() == null) {
                    iVar.D0(3);
                } else {
                    iVar.A(3, stationsEntity.getStationName());
                }
                if (stationsEntity.getStationNameLatin() == null) {
                    iVar.D0(4);
                } else {
                    iVar.A(4, stationsEntity.getStationNameLatin());
                }
                if (stationsEntity.getSlugs() == null) {
                    iVar.D0(5);
                } else {
                    iVar.A(5, stationsEntity.getSlugs());
                }
                iVar.V(6, (long) stationsEntity.getCityId());
                iVar.A0(stationsEntity.getStationLatitude(), 7);
                iVar.A0(stationsEntity.getStationLongitude(), 8);
                iVar.V(9, (long) stationsEntity.getFavourite());
                if (stationsEntity.getStationIdOrg() == null) {
                    iVar.D0(10);
                } else {
                    iVar.A(10, stationsEntity.getStationIdOrg());
                }
                iVar.V(11, (long) stationsEntity.getPinned());
                if (stationsEntity.getLines() == null) {
                    iVar.D0(12);
                } else {
                    iVar.A(12, stationsEntity.getLines());
                }
                if (stationsEntity.getBusColor() == null) {
                    iVar.D0(13);
                } else {
                    iVar.A(13, stationsEntity.getBusColor());
                }
                if (stationsEntity.getTramColor() == null) {
                    iVar.D0(14);
                } else {
                    iVar.A(14, stationsEntity.getTramColor());
                }
                if (stationsEntity.getTrolleybusColor() == null) {
                    iVar.D0(15);
                } else {
                    iVar.A(15, stationsEntity.getTrolleybusColor());
                }
            }
        };
        this.__updateAdapterOfStationsEntity = new q<StationsEntity>(c1Var) {
            public String createQuery() {
                return "UPDATE OR REPLACE `stations` SET `id` = ?,`stationId` = ?,`stationName` = ?,`stationNameLatin` = ?,`slugs` = ?,`cityId` = ?,`stationLatitude` = ?,`stationLongitude` = ?,`favourite` = ?,`stationIdOrg` = ?,`pinned` = ?,`lines` = ?,`busColor` = ?,`tramColor` = ?,`trolleybusColor` = ? WHERE `id` = ?";
            }

            public void bind(i iVar, StationsEntity stationsEntity) {
                iVar.V(1, (long) stationsEntity.getId());
                iVar.V(2, (long) stationsEntity.getStationId());
                if (stationsEntity.getStationName() == null) {
                    iVar.D0(3);
                } else {
                    iVar.A(3, stationsEntity.getStationName());
                }
                if (stationsEntity.getStationNameLatin() == null) {
                    iVar.D0(4);
                } else {
                    iVar.A(4, stationsEntity.getStationNameLatin());
                }
                if (stationsEntity.getSlugs() == null) {
                    iVar.D0(5);
                } else {
                    iVar.A(5, stationsEntity.getSlugs());
                }
                iVar.V(6, (long) stationsEntity.getCityId());
                iVar.A0(stationsEntity.getStationLatitude(), 7);
                iVar.A0(stationsEntity.getStationLongitude(), 8);
                iVar.V(9, (long) stationsEntity.getFavourite());
                if (stationsEntity.getStationIdOrg() == null) {
                    iVar.D0(10);
                } else {
                    iVar.A(10, stationsEntity.getStationIdOrg());
                }
                iVar.V(11, (long) stationsEntity.getPinned());
                if (stationsEntity.getLines() == null) {
                    iVar.D0(12);
                } else {
                    iVar.A(12, stationsEntity.getLines());
                }
                if (stationsEntity.getBusColor() == null) {
                    iVar.D0(13);
                } else {
                    iVar.A(13, stationsEntity.getBusColor());
                }
                if (stationsEntity.getTramColor() == null) {
                    iVar.D0(14);
                } else {
                    iVar.A(14, stationsEntity.getTramColor());
                }
                if (stationsEntity.getTrolleybusColor() == null) {
                    iVar.D0(15);
                } else {
                    iVar.A(15, stationsEntity.getTrolleybusColor());
                }
                iVar.V(16, (long) stationsEntity.getId());
            }
        };
        this.__preparedStmtOfUpdateStations = new n1(c1Var) {
            public String createQuery() {
                return "UPDATE stations SET favourite = ?, pinned = ? WHERE stationId = ?";
            }
        };
        this.__preparedStmtOfRemoveFavouriteStations = new n1(c1Var) {
            public String createQuery() {
                return "UPDATE stations SET favourite = 0, pinned = 0";
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public LiveData<List<StationsEntity>> getFS() {
        final f1 e10 = f1.e("SELECT * FROM stations WHERE favourite = 1", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public LiveData<Integer> getPinnedCount() {
        final f1 e10 = f1.e("SELECT COUNT(pinned) FROM stations WHERE pinned = 1", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<Integer>() {
            public void finalize() {
                e10.g();
            }

            public Integer call() {
                Integer num = null;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    if (f10.moveToFirst()) {
                        if (!f10.isNull(0)) {
                            num = Integer.valueOf(f10.getInt(0));
                        }
                    }
                    return num;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public LiveData<List<StationsEntity>> getPinnedStations() {
        final f1 e10 = f1.e("SELECT * FROM stations WHERE pinned = 1", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public int getRowCount() {
        int i10 = 0;
        f1 e10 = f1.e("SELECT COUNT(*) FROM stations", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor f10 = c.f(this.__db, e10, false, (CancellationSignal) null);
        try {
            if (f10.moveToFirst()) {
                i10 = f10.getInt(0);
            }
            return i10;
        } finally {
            f10.close();
            e10.g();
        }
    }

    public String getStationIdOrg(int i10) {
        f1 e10 = f1.e("SELECT stationIdOrg FROM stations WHERE stationId = ?", 1);
        e10.V(1, (long) i10);
        this.__db.assertNotSuspendingTransaction();
        String str = null;
        Cursor f10 = c.f(this.__db, e10, false, (CancellationSignal) null);
        try {
            if (f10.moveToFirst()) {
                if (!f10.isNull(0)) {
                    str = f10.getString(0);
                }
            }
            return str;
        } finally {
            f10.close();
            e10.g();
        }
    }

    public void insertAll(List<StationsEntity> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfStationsEntity.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public LiveData<List<StationsEntity>> loadAllStations() {
        final f1 e10 = f1.e("SELECT * FROM stations", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public int loadFavoriteStatus(int i10) {
        f1 e10 = f1.e("SELECT favourite FROM stations WHERE stationId = ?", 1);
        e10.V(1, (long) i10);
        this.__db.assertNotSuspendingTransaction();
        int i11 = 0;
        Cursor f10 = c.f(this.__db, e10, false, (CancellationSignal) null);
        try {
            if (f10.moveToFirst()) {
                i11 = f10.getInt(0);
            }
            return i11;
        } finally {
            f10.close();
            e10.g();
        }
    }

    public LiveData<List<StationsEntity>> loadFavorites() {
        final f1 e10 = f1.e("SELECT * FROM stations WHERE favourite = 1", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public LiveData<StationsEntity> loadStation(int i10) {
        final f1 e10 = f1.e("select * from stations where stationId = ?", 1);
        e10.V(1, (long) i10);
        return this.__db.getInvalidationTracker().b(new String[]{"stations"}, new Callable<StationsEntity>() {
            public void finalize() {
                e10.g();
            }

            public StationsEntity call() {
                StationsEntity stationsEntity;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    if (f10.moveToFirst()) {
                        int i10 = c24;
                        StationsEntity stationsEntity2 = new StationsEntity();
                        stationsEntity2.setId(f10.getInt(c10));
                        stationsEntity2.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity2.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity2.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity2.setSlugs(str3);
                        stationsEntity2.setCityId(f10.getInt(c15));
                        stationsEntity2.setStationLatitude(f10.getDouble(c16));
                        stationsEntity2.setStationLongitude(f10.getDouble(c17));
                        stationsEntity2.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity2.setStationIdOrg(str4);
                        stationsEntity2.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity2.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity2.setBusColor(str6);
                        if (f10.isNull(c23)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(c23);
                        }
                        stationsEntity2.setTramColor(str7);
                        int i11 = i10;
                        if (f10.isNull(i11)) {
                            str8 = null;
                        } else {
                            str8 = f10.getString(i11);
                        }
                        stationsEntity2.setTrolleybusColor(str8);
                        stationsEntity = stationsEntity2;
                    } else {
                        stationsEntity = null;
                    }
                    return stationsEntity;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public StationsEntity loadStationSync(int i10) {
        f1 f1Var;
        StationsEntity stationsEntity;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        f1 e10 = f1.e("select * from stations where id = ?", 1);
        e10.V(1, (long) i10);
        this.__db.assertNotSuspendingTransaction();
        Cursor f10 = c.f(this.__db, e10, false, (CancellationSignal) null);
        try {
            int c10 = b.c(f10, "id");
            int c11 = b.c(f10, "stationId");
            int c12 = b.c(f10, "stationName");
            int c13 = b.c(f10, "stationNameLatin");
            int c14 = b.c(f10, "slugs");
            int c15 = b.c(f10, "cityId");
            int c16 = b.c(f10, "stationLatitude");
            int c17 = b.c(f10, "stationLongitude");
            int c18 = b.c(f10, "favourite");
            int c19 = b.c(f10, "stationIdOrg");
            int c20 = b.c(f10, "pinned");
            int c21 = b.c(f10, "lines");
            int c22 = b.c(f10, "busColor");
            int c23 = b.c(f10, "tramColor");
            f1Var = e10;
            try {
                int c24 = b.c(f10, "trolleybusColor");
                if (f10.moveToFirst()) {
                    int i11 = c24;
                    StationsEntity stationsEntity2 = new StationsEntity();
                    stationsEntity2.setId(f10.getInt(c10));
                    stationsEntity2.setStationId(f10.getInt(c11));
                    if (f10.isNull(c12)) {
                        str = null;
                    } else {
                        str = f10.getString(c12);
                    }
                    stationsEntity2.setStationName(str);
                    if (f10.isNull(c13)) {
                        str2 = null;
                    } else {
                        str2 = f10.getString(c13);
                    }
                    stationsEntity2.setStationNameLatin(str2);
                    if (f10.isNull(c14)) {
                        str3 = null;
                    } else {
                        str3 = f10.getString(c14);
                    }
                    stationsEntity2.setSlugs(str3);
                    stationsEntity2.setCityId(f10.getInt(c15));
                    stationsEntity2.setStationLatitude(f10.getDouble(c16));
                    stationsEntity2.setStationLongitude(f10.getDouble(c17));
                    stationsEntity2.setFavourite(f10.getInt(c18));
                    if (f10.isNull(c19)) {
                        str4 = null;
                    } else {
                        str4 = f10.getString(c19);
                    }
                    stationsEntity2.setStationIdOrg(str4);
                    stationsEntity2.setPinned(f10.getInt(c20));
                    if (f10.isNull(c21)) {
                        str5 = null;
                    } else {
                        str5 = f10.getString(c21);
                    }
                    stationsEntity2.setLines(str5);
                    if (f10.isNull(c22)) {
                        str6 = null;
                    } else {
                        str6 = f10.getString(c22);
                    }
                    stationsEntity2.setBusColor(str6);
                    if (f10.isNull(c23)) {
                        str7 = null;
                    } else {
                        str7 = f10.getString(c23);
                    }
                    stationsEntity2.setTramColor(str7);
                    int i12 = i11;
                    if (f10.isNull(i12)) {
                        str8 = null;
                    } else {
                        str8 = f10.getString(i12);
                    }
                    stationsEntity2.setTrolleybusColor(str8);
                    stationsEntity = stationsEntity2;
                } else {
                    stationsEntity = null;
                }
                f10.close();
                f1Var.g();
                return stationsEntity;
            } catch (Throwable th) {
                th = th;
                f10.close();
                f1Var.g();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            f1Var = e10;
            f10.close();
            f1Var.g();
            throw th;
        }
    }

    public void removeFavouriteStations() {
        this.__db.assertNotSuspendingTransaction();
        i acquire = this.__preparedStmtOfRemoveFavouriteStations.acquire();
        this.__db.beginTransaction();
        try {
            acquire.G();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveFavouriteStations.release(acquire);
        }
    }

    public LiveData<List<StationsEntity>> searchAllStations(String str, String str2, String str3) {
        final f1 e10 = f1.e("SELECT stations.* FROM stations JOIN stationsFts ON (stations.id = stationsFts.rowid) WHERE stationsFts.stationNameLatin LIKE ? OR stations.stationIdOrg LIKE ? ORDER BY CASE WHEN stationsFts.stationNameLatin = ? OR stations.stationIdOrg = ? THEN 1 WHEN stationsFts.stationNameLatin LIKE ? OR stations.stationIdOrg LIKE ? THEN 2 ELSE 3 END", 6);
        if (str == null) {
            e10.D0(1);
        } else {
            e10.A(1, str);
        }
        if (str == null) {
            e10.D0(2);
        } else {
            e10.A(2, str);
        }
        if (str2 == null) {
            e10.D0(3);
        } else {
            e10.A(3, str2);
        }
        if (str2 == null) {
            e10.D0(4);
        } else {
            e10.A(4, str2);
        }
        if (str3 == null) {
            e10.D0(5);
        } else {
            e10.A(5, str3);
        }
        if (str3 == null) {
            e10.D0(6);
        } else {
            e10.A(6, str3);
        }
        return this.__db.getInvalidationTracker().b(new String[]{"stations", "stationsFts"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public LiveData<List<StationsEntity>> searchFavoriteStations(String str) {
        final f1 e10 = f1.e("SELECT stations.* FROM stations JOIN stationsFts ON (stations.id = stationsFts.rowid) WHERE stations.favourite = 1 AND stationsFts.stationName LIKE ?", 1);
        if (str == null) {
            e10.D0(1);
        } else {
            e10.A(1, str);
        }
        return this.__db.getInvalidationTracker().b(new String[]{"stations", "stationsFts"}, new Callable<List<StationsEntity>>() {
            public void finalize() {
                e10.g();
            }

            public List<StationsEntity> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                String str8;
                Cursor f10 = c.f(StationsDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "stationId");
                    int c12 = b.c(f10, "stationName");
                    int c13 = b.c(f10, "stationNameLatin");
                    int c14 = b.c(f10, "slugs");
                    int c15 = b.c(f10, "cityId");
                    int c16 = b.c(f10, "stationLatitude");
                    int c17 = b.c(f10, "stationLongitude");
                    int c18 = b.c(f10, "favourite");
                    int c19 = b.c(f10, "stationIdOrg");
                    int c20 = b.c(f10, "pinned");
                    int c21 = b.c(f10, "lines");
                    int c22 = b.c(f10, "busColor");
                    int c23 = b.c(f10, "tramColor");
                    int c24 = b.c(f10, "trolleybusColor");
                    int i10 = c23;
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        StationsEntity stationsEntity = new StationsEntity();
                        ArrayList arrayList2 = arrayList;
                        stationsEntity.setId(f10.getInt(c10));
                        stationsEntity.setStationId(f10.getInt(c11));
                        if (f10.isNull(c12)) {
                            str = null;
                        } else {
                            str = f10.getString(c12);
                        }
                        stationsEntity.setStationName(str);
                        if (f10.isNull(c13)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c13);
                        }
                        stationsEntity.setStationNameLatin(str2);
                        if (f10.isNull(c14)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c14);
                        }
                        stationsEntity.setSlugs(str3);
                        stationsEntity.setCityId(f10.getInt(c15));
                        int i11 = c10;
                        stationsEntity.setStationLatitude(f10.getDouble(c16));
                        stationsEntity.setStationLongitude(f10.getDouble(c17));
                        stationsEntity.setFavourite(f10.getInt(c18));
                        if (f10.isNull(c19)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c19);
                        }
                        stationsEntity.setStationIdOrg(str4);
                        stationsEntity.setPinned(f10.getInt(c20));
                        if (f10.isNull(c21)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c21);
                        }
                        stationsEntity.setLines(str5);
                        if (f10.isNull(c22)) {
                            str6 = null;
                        } else {
                            str6 = f10.getString(c22);
                        }
                        stationsEntity.setBusColor(str6);
                        int i12 = i10;
                        if (f10.isNull(i12)) {
                            str7 = null;
                        } else {
                            str7 = f10.getString(i12);
                        }
                        stationsEntity.setTramColor(str7);
                        int i13 = c24;
                        if (f10.isNull(i13)) {
                            i10 = i12;
                            str8 = null;
                        } else {
                            i10 = i12;
                            str8 = f10.getString(i13);
                        }
                        stationsEntity.setTrolleybusColor(str8);
                        ArrayList arrayList3 = arrayList2;
                        arrayList3.add(stationsEntity);
                        c24 = i13;
                        arrayList = arrayList3;
                        c10 = i11;
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public void updateFavourite(StationsEntity stationsEntity) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfStationsEntity.handle(stationsEntity);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void updateStations(int i10, int i11, int i12) {
        this.__db.assertNotSuspendingTransaction();
        i acquire = this.__preparedStmtOfUpdateStations.acquire();
        acquire.V(1, (long) i11);
        acquire.V(2, (long) i12);
        acquire.V(3, (long) i10);
        this.__db.beginTransaction();
        try {
            acquire.G();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateStations.release(acquire);
        }
    }
}
