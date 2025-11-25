package buslogic.app.database;

import androidx.room.c1;
import androidx.room.d0;
import androidx.room.d1;
import androidx.room.e1;
import androidx.room.i;
import androidx.room.util.c;
import androidx.room.util.h;
import buslogic.app.database.dao.LineForStationDao;
import buslogic.app.database.dao.LineForStationDao_Impl;
import buslogic.app.database.dao.StationsDao;
import buslogic.app.database.dao.StationsDao_Impl;
import e.o0;
import j1.a;
import j1.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.d;
import o1.e;

public final class AppDatabase_Impl extends AppDatabase {
    private volatile LineForStationDao _lineForStationDao;
    private volatile StationsDao _stationsDao;

    public void clearAllTables() {
        super.assertNotMainThread();
        d i02 = super.getOpenHelper().i0();
        try {
            super.beginTransaction();
            i02.z("DELETE FROM `stations`");
            i02.z("DELETE FROM `stationsFts`");
            i02.z("DELETE FROM `lines`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            i02.l0("PRAGMA wal_checkpoint(FULL)").close();
            if (!i02.K0()) {
                i02.z("VACUUM");
            }
        }
    }

    public d0 createInvalidationTracker() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("stationsFts", "stations");
        return new d0(this, hashMap, new HashMap(0), "stations", "stationsFts", "lines");
    }

    public e createOpenHelper(i iVar) {
        e1 e1Var = new e1(iVar, new e1.a(6) {
            public void createAllTables(d dVar) {
                dVar.z("CREATE TABLE IF NOT EXISTS `stations` (`id` INTEGER NOT NULL, `stationId` INTEGER NOT NULL, `stationName` TEXT, `stationNameLatin` TEXT, `slugs` TEXT, `cityId` INTEGER NOT NULL, `stationLatitude` REAL NOT NULL, `stationLongitude` REAL NOT NULL, `favourite` INTEGER NOT NULL, `stationIdOrg` TEXT, `pinned` INTEGER NOT NULL, `lines` TEXT, `busColor` TEXT, `tramColor` TEXT, `trolleybusColor` TEXT, PRIMARY KEY(`id`))");
                dVar.z("CREATE VIRTUAL TABLE IF NOT EXISTS `stationsFts` USING FTS4(`stationId` INTEGER NOT NULL, `stationName` TEXT, `stationNameLatin` TEXT, content=`stations`)");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_BEFORE_UPDATE BEFORE UPDATE ON `stations` BEGIN DELETE FROM `stationsFts` WHERE `docid`=OLD.`rowid`; END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_BEFORE_DELETE BEFORE DELETE ON `stations` BEGIN DELETE FROM `stationsFts` WHERE `docid`=OLD.`rowid`; END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_AFTER_UPDATE AFTER UPDATE ON `stations` BEGIN INSERT INTO `stationsFts`(`docid`, `stationId`, `stationName`, `stationNameLatin`) VALUES (NEW.`rowid`, NEW.`stationId`, NEW.`stationName`, NEW.`stationNameLatin`); END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_AFTER_INSERT AFTER INSERT ON `stations` BEGIN INSERT INTO `stationsFts`(`docid`, `stationId`, `stationName`, `stationNameLatin`) VALUES (NEW.`rowid`, NEW.`stationId`, NEW.`stationName`, NEW.`stationNameLatin`); END");
                dVar.z("CREATE TABLE IF NOT EXISTS `lines` (`id` INTEGER NOT NULL, `line_number_for_display` TEXT, `vehicle_group` TEXT, `line_type` TEXT, `line_type_color_active` TEXT, `line_type_color_inactive` TEXT, PRIMARY KEY(`id`))");
                dVar.z(d1.f7697d);
                dVar.z("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '79099f4966dd0edab9a51b6f666d695c')");
            }

            public void dropAllTables(d dVar) {
                dVar.z("DROP TABLE IF EXISTS `stations`");
                dVar.z("DROP TABLE IF EXISTS `stationsFts`");
                dVar.z("DROP TABLE IF EXISTS `lines`");
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c1.b) AppDatabase_Impl.this.mCallbacks.get(i10)).onDestructiveMigration(dVar);
                    }
                }
            }

            public void onCreate(d dVar) {
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c1.b) AppDatabase_Impl.this.mCallbacks.get(i10)).onCreate(dVar);
                    }
                }
            }

            public void onOpen(d dVar) {
                d unused = AppDatabase_Impl.this.mDatabase = dVar;
                AppDatabase_Impl.this.internalInitInvalidationTracker(dVar);
                if (AppDatabase_Impl.this.mCallbacks != null) {
                    int size = AppDatabase_Impl.this.mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((c1.b) AppDatabase_Impl.this.mCallbacks.get(i10)).onOpen(dVar);
                    }
                }
            }

            public void onPostMigrate(d dVar) {
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_BEFORE_UPDATE BEFORE UPDATE ON `stations` BEGIN DELETE FROM `stationsFts` WHERE `docid`=OLD.`rowid`; END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_BEFORE_DELETE BEFORE DELETE ON `stations` BEGIN DELETE FROM `stationsFts` WHERE `docid`=OLD.`rowid`; END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_AFTER_UPDATE AFTER UPDATE ON `stations` BEGIN INSERT INTO `stationsFts`(`docid`, `stationId`, `stationName`, `stationNameLatin`) VALUES (NEW.`rowid`, NEW.`stationId`, NEW.`stationName`, NEW.`stationNameLatin`); END");
                dVar.z("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_stationsFts_AFTER_INSERT AFTER INSERT ON `stations` BEGIN INSERT INTO `stationsFts`(`docid`, `stationId`, `stationName`, `stationNameLatin`) VALUES (NEW.`rowid`, NEW.`stationId`, NEW.`stationName`, NEW.`stationNameLatin`); END");
            }

            public void onPreMigrate(d dVar) {
                c.b(dVar);
            }

            public e1.b onValidateSchema(d dVar) {
                d dVar2 = dVar;
                HashMap hashMap = new HashMap(15);
                hashMap.put("id", new h.a(1, 1, "id", "INTEGER", (String) null, true));
                hashMap.put("stationId", new h.a(0, 1, "stationId", "INTEGER", (String) null, true));
                hashMap.put("stationName", new h.a(0, 1, "stationName", "TEXT", (String) null, false));
                hashMap.put("stationNameLatin", new h.a(0, 1, "stationNameLatin", "TEXT", (String) null, false));
                hashMap.put("slugs", new h.a(0, 1, "slugs", "TEXT", (String) null, false));
                hashMap.put("cityId", new h.a(0, 1, "cityId", "INTEGER", (String) null, true));
                hashMap.put("stationLatitude", new h.a(0, 1, "stationLatitude", "REAL", (String) null, true));
                hashMap.put("stationLongitude", new h.a(0, 1, "stationLongitude", "REAL", (String) null, true));
                hashMap.put("favourite", new h.a(0, 1, "favourite", "INTEGER", (String) null, true));
                hashMap.put("stationIdOrg", new h.a(0, 1, "stationIdOrg", "TEXT", (String) null, false));
                hashMap.put("pinned", new h.a(0, 1, "pinned", "INTEGER", (String) null, true));
                hashMap.put("lines", new h.a(0, 1, "lines", "TEXT", (String) null, false));
                hashMap.put("busColor", new h.a(0, 1, "busColor", "TEXT", (String) null, false));
                hashMap.put("tramColor", new h.a(0, 1, "tramColor", "TEXT", (String) null, false));
                hashMap.put("trolleybusColor", new h.a(0, 1, "trolleybusColor", "TEXT", (String) null, false));
                h hVar = new h("stations", hashMap, new HashSet(0), new HashSet(0));
                h a10 = h.a(dVar2, "stations");
                if (!hVar.equals(a10)) {
                    return new e1.b("stations(buslogic.app.database.entity.StationsEntity).\n Expected:\n" + hVar + "\n Found:\n" + a10, false);
                }
                HashSet hashSet = new HashSet(3);
                hashSet.add("stationId");
                hashSet.add("stationName");
                hashSet.add("stationNameLatin");
                androidx.room.util.e eVar = new androidx.room.util.e(hashSet);
                androidx.room.util.e b10 = androidx.room.util.e.b(dVar2, "stationsFts");
                if (!eVar.equals(b10)) {
                    return new e1.b("stationsFts(buslogic.app.database.entity.StationsFtsEntity).\n Expected:\n" + eVar + "\n Found:\n" + b10, false);
                }
                HashMap hashMap2 = new HashMap(6);
                hashMap2.put("id", new h.a(1, 1, "id", "INTEGER", (String) null, true));
                hashMap2.put("line_number_for_display", new h.a(0, 1, "line_number_for_display", "TEXT", (String) null, false));
                hashMap2.put("vehicle_group", new h.a(0, 1, "vehicle_group", "TEXT", (String) null, false));
                hashMap2.put("line_type", new h.a(0, 1, "line_type", "TEXT", (String) null, false));
                hashMap2.put("line_type_color_active", new h.a(0, 1, "line_type_color_active", "TEXT", (String) null, false));
                hashMap2.put("line_type_color_inactive", new h.a(0, 1, "line_type_color_inactive", "TEXT", (String) null, false));
                h hVar2 = new h("lines", hashMap2, new HashSet(0), new HashSet(0));
                h a11 = h.a(dVar2, "lines");
                if (hVar2.equals(a11)) {
                    return new e1.b((String) null, true);
                }
                return new e1.b("lines(buslogic.app.models.LineForStation).\n Expected:\n" + hVar2 + "\n Found:\n" + a11, false);
            }
        });
        e.b.a a10 = e.b.a(iVar.f7751b);
        a10.f27365b = iVar.f7752c;
        a10.f27366c = e1Var;
        return iVar.f7750a.a(a10.a());
    }

    public List<b> getAutoMigrations(@o0 Map<Class<? extends a>, a> map) {
        return Arrays.asList(new b[0]);
    }

    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(StationsDao.class, StationsDao_Impl.getRequiredConverters());
        hashMap.put(LineForStationDao.class, LineForStationDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public LineForStationDao linesDao() {
        LineForStationDao lineForStationDao;
        if (this._lineForStationDao != null) {
            return this._lineForStationDao;
        }
        synchronized (this) {
            if (this._lineForStationDao == null) {
                this._lineForStationDao = new LineForStationDao_Impl(this);
            }
            lineForStationDao = this._lineForStationDao;
        }
        return lineForStationDao;
    }

    public StationsDao stationsDao() {
        StationsDao stationsDao;
        if (this._stationsDao != null) {
            return this._stationsDao;
        }
        synchronized (this) {
            if (this._stationsDao == null) {
                this._stationsDao = new StationsDao_Impl(this);
            }
            stationsDao = this._stationsDao;
        }
        return stationsDao;
    }
}
