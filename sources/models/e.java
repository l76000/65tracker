package buslogic.app;

import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import buslogic.app.database.entity.StationsEntity;
import buslogic.app.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements y0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f9720b;

    public /* synthetic */ e(f fVar, int i10) {
        this.f9719a = i10;
        this.f9720b = fVar;
    }

    public final void a(Object obj) {
        int i10 = this.f9719a;
        f fVar = this.f9720b;
        switch (i10) {
            case 0:
                List list = (List) obj;
                fVar.f9726d.j(list);
                if (fVar.f9727e.e() != null && list != null && !list.isEmpty()) {
                    f.f9722j.j(Boolean.TRUE);
                    fVar.f9723a.getDatabaseCreated().g(new f.a());
                    return;
                }
                return;
            case 1:
                List list2 = (List) obj;
                fVar.f9727e.j(list2);
                ArrayList arrayList = new ArrayList(list2);
                x0<List<StationsEntity>> x0Var = fVar.f9726d;
                if (x0Var.e() != null && !x0Var.e().isEmpty() && !arrayList.isEmpty()) {
                    f.f9722j.j(Boolean.TRUE);
                    fVar.f9723a.getDatabaseCreated().g(new f.b());
                    return;
                }
                return;
            case 2:
                List list3 = (List) obj;
                if (fVar.f9723a.getDatabaseCreated().e() != null) {
                    fVar.f9724b.j(list3);
                    return;
                }
                return;
            default:
                List list4 = (List) obj;
                if (fVar.f9723a.getDatabaseCreated().e() != null) {
                    fVar.f9725c.j(list4);
                    return;
                }
                return;
        }
    }
}
