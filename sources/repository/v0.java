package buslogic.app.repository;

import androidx.lifecycle.x0;
import d2.d;
import d2.h;

/* compiled from: UserDataRepository */
public class v0 {

    /* renamed from: a  reason: collision with root package name */
    public final h f11748a = ((h) d.a().b(h.class));

    public final x0 a(String str, String str2) {
        x0 x0Var = new x0();
        this.f11748a.f("get_favourite_stations", str, str2).g0(new s0(x0Var));
        return x0Var;
    }

    public final x0 b(String str, String str2) {
        x0 x0Var = new x0();
        this.f11748a.b("get_user_credit_cards", str, "TM00000", str2).g0(new n0(x0Var));
        return x0Var;
    }

    public final x0 c(String str, String str2) {
        x0 x0Var = new x0();
        this.f11748a.d("get_user_total_finance", str, "https://online.bgnaplata.rs", "TM000001", str2).g0(new p0(x0Var));
        return x0Var;
    }

    public final x0 d(String str, String str2, String str3, String str4, String str5) {
        x0 x0Var = new x0();
        this.f11748a.a("deregister_credit_card", str, str2, str3, str4, "TM00000", str5).g0(new o0(x0Var));
        return x0Var;
    }

    public final x0 e(String str) {
        x0 x0Var = new x0();
        this.f11748a.c("amend_details", str).g0(new u0(x0Var));
        return x0Var;
    }

    public final x0 f(String str) {
        x0 x0Var = new x0();
        this.f11748a.g("monthly_detail", str).g0(new j0(x0Var));
        return x0Var;
    }

    public final x0 g(String str) {
        x0 x0Var = new x0();
        this.f11748a.h("verification_for_the_month", str).g0(new k0(x0Var));
        return x0Var;
    }

    public final x0 h(String str) {
        x0 x0Var = new x0();
        this.f11748a.e("verification_for_the_month_part2", str).g0(new l0(x0Var));
        return x0Var;
    }
}
