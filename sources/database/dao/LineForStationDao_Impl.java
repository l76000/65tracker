package buslogic.app.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.c1;
import androidx.room.f1;
import androidx.room.r;
import androidx.room.util.b;
import androidx.room.util.c;
import buslogic.app.models.LineForStation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import o1.i;

public final class LineForStationDao_Impl implements LineForStationDao {
    /* access modifiers changed from: private */
    public final c1 __db;
    private final r<LineForStation> __insertionAdapterOfLineForStation;

    public LineForStationDao_Impl(c1 c1Var) {
        this.__db = c1Var;
        this.__insertionAdapterOfLineForStation = new r<LineForStation>(c1Var) {
            public String createQuery() {
                return "INSERT OR IGNORE INTO `lines` (`id`,`line_number_for_display`,`vehicle_group`,`line_type`,`line_type_color_active`,`line_type_color_inactive`) VALUES (?,?,?,?,?,?)";
            }

            public void bind(i iVar, LineForStation lineForStation) {
                iVar.V(1, (long) lineForStation.getId());
                if (lineForStation.getLine_number_for_display() == null) {
                    iVar.D0(2);
                } else {
                    iVar.A(2, lineForStation.getLine_number_for_display());
                }
                if (lineForStation.getVehicle_group() == null) {
                    iVar.D0(3);
                } else {
                    iVar.A(3, lineForStation.getVehicle_group());
                }
                if (lineForStation.getLine_type() == null) {
                    iVar.D0(4);
                } else {
                    iVar.A(4, lineForStation.getLine_type());
                }
                if (lineForStation.getLine_type_color_active() == null) {
                    iVar.D0(5);
                } else {
                    iVar.A(5, lineForStation.getLine_type_color_active());
                }
                if (lineForStation.getLine_type_color_inactive() == null) {
                    iVar.D0(6);
                } else {
                    iVar.A(6, lineForStation.getLine_type_color_inactive());
                }
            }
        };
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    public LiveData<List<LineForStation>> getAllLines() {
        final f1 e10 = f1.e("SELECT * FROM lines", 0);
        return this.__db.getInvalidationTracker().b(new String[]{"lines"}, new Callable<List<LineForStation>>() {
            public void finalize() {
                e10.g();
            }

            public List<LineForStation> call() {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                Cursor f10 = c.f(LineForStationDao_Impl.this.__db, e10, false, (CancellationSignal) null);
                try {
                    int c10 = b.c(f10, "id");
                    int c11 = b.c(f10, "line_number_for_display");
                    int c12 = b.c(f10, "vehicle_group");
                    int c13 = b.c(f10, "line_type");
                    int c14 = b.c(f10, "line_type_color_active");
                    int c15 = b.c(f10, "line_type_color_inactive");
                    ArrayList arrayList = new ArrayList(f10.getCount());
                    while (f10.moveToNext()) {
                        LineForStation lineForStation = new LineForStation();
                        lineForStation.setId(f10.getInt(c10));
                        if (f10.isNull(c11)) {
                            str = null;
                        } else {
                            str = f10.getString(c11);
                        }
                        lineForStation.setLine_number_for_display(str);
                        if (f10.isNull(c12)) {
                            str2 = null;
                        } else {
                            str2 = f10.getString(c12);
                        }
                        lineForStation.setVehicle_group(str2);
                        if (f10.isNull(c13)) {
                            str3 = null;
                        } else {
                            str3 = f10.getString(c13);
                        }
                        lineForStation.setLine_type(str3);
                        if (f10.isNull(c14)) {
                            str4 = null;
                        } else {
                            str4 = f10.getString(c14);
                        }
                        lineForStation.setLine_type_color_active(str4);
                        if (f10.isNull(c15)) {
                            str5 = null;
                        } else {
                            str5 = f10.getString(c15);
                        }
                        lineForStation.setLine_type_color_inactive(str5);
                        arrayList.add(lineForStation);
                    }
                    return arrayList;
                } finally {
                    f10.close();
                }
            }
        });
    }

    public void insertAll(List<LineForStation> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfLineForStation.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
