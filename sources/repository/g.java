package buslogic.app.repository;

import androidx.lifecycle.x0;
import d2.b;
import d2.c;

/* compiled from: AnnouncementRepository */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final c f11721a;

    public g(String str) {
        this.f11721a = (c) b.a(str).b(c.class);
    }

    public final x0 a(String str) {
        x0 x0Var = new x0();
        this.f11721a.b("data_bulletin", str).g0(new c(x0Var));
        return x0Var;
    }

    public final x0 b(String str) {
        x0 x0Var = new x0();
        this.f11721a.d("line_number_getter", str).g0(new f(x0Var));
        return x0Var;
    }

    public final x0 c(String str) {
        x0 x0Var = new x0();
        this.f11721a.f("line_route_revision", str).g0(new e(x0Var));
        return x0Var;
    }

    public final x0 d(String str) {
        x0 x0Var = new x0();
        this.f11721a.e("route_insight", str).g0(new d(x0Var));
        return x0Var;
    }
}
