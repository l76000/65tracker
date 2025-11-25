package buslogic.app.repository;

import androidx.lifecycle.x0;
import d2.d;
import d2.e;

/* compiled from: CardsRepository */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final e f11741a = ((e) d.a().b(e.class));

    public final x0 a(String str, String str2, String str3, String str4, String str5, String str6) {
        x0 x0Var = new x0();
        this.f11741a.b("buy_new_monthly_card_sell_log", str, "https://online.bgnaplata.rs", str2, str3, str4, str5, str6).g0(new p(x0Var));
        return x0Var;
    }

    public final x0 b(String str, String str2, String str3) {
        x0 x0Var = new x0();
        this.f11741a.a("create_new_monthly_ticket", str, "https://online.bgnaplata.rs", str2, str3).g0(new o(x0Var));
        return x0Var;
    }

    public final x0 c(String str, String str2) {
        x0 x0Var = new x0();
        this.f11741a.c("get_monthly_cards_sell_log_history", str, str2).g0(new q(x0Var));
        return x0Var;
    }
}
