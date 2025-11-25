package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.models.InAppRatingRequestModel;
import d2.d;
import d2.g;

/* compiled from: SettingsRepository */
public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f11714a = ((g) d.a().b(g.class));

    public final x0 a(String str) {
        x0 x0Var = new x0();
        this.f11714a.g("get_displaying_additional_menu_settings", str).g0(new t(x0Var));
        return x0Var;
    }

    public final x0 b(String str) {
        x0 x0Var = new x0();
        this.f11714a.c("get_bus_distance_type", str).g0(new z(x0Var));
        return x0Var;
    }

    public final x0 c(String str) {
        x0 x0Var = new x0();
        this.f11714a.h("get_card_price_groups", str).g0(new x(x0Var));
        return x0Var;
    }

    public final x0 d(String str) {
        x0 x0Var = new x0();
        this.f11714a.f("get_card_type_info", str).g0(new w(x0Var));
        return x0Var;
    }

    public final x0 e(String str) {
        x0 x0Var = new x0();
        this.f11714a.b("get_displaying_and_active_settings", str).g0(new u(x0Var));
        return x0Var;
    }

    public final x0 f(String str) {
        x0 x0Var = new x0();
        this.f11714a.d("get_individual_payment_settings", str).g0(new v(x0Var));
        return x0Var;
    }

    public final x0 g(String str) {
        x0 x0Var = new x0();
        this.f11714a.e("get_info_passenger_messages_settings", str).g0(new y(x0Var));
        return x0Var;
    }

    public final x0 h(InAppRatingRequestModel inAppRatingRequestModel) {
        x0 x0Var = new x0();
        this.f11714a.a(inAppRatingRequestModel.getAction(), inAppRatingRequestModel.getSession_id(), inAppRatingRequestModel.getUser_id()).g0(new b0(x0Var));
        return x0Var;
    }

    public final x0 i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        x0 x0Var = new x0();
        this.f11714a.i("problem_report", str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12).g0(new a0(x0Var));
        return x0Var;
    }

    public final x0 j(InAppRatingRequestModel inAppRatingRequestModel) {
        x0 x0Var = new x0();
        this.f11714a.j(inAppRatingRequestModel.getAction(), inAppRatingRequestModel.getSession_id(), inAppRatingRequestModel.getUser_id()).g0(new s(x0Var));
        return x0Var;
    }
}
