package buslogic.app;

import buslogic.app.models.AddFavouriteStationResponse;
import buslogic.app.models.CheckUserAccountDeleteResponse;
import buslogic.app.models.DeleteAccountResponse;
import buslogic.app.models.DeleteElectronicCardResponse;
import buslogic.app.models.DeleteMonthlyCardResponse;
import buslogic.app.models.MonthlyCardAutoRenewSettingsResponse;
import buslogic.app.models.PasswordChangeResponse;
import buslogic.app.models.RemoveFavouriteStationResponse;
import buslogic.app.models.SetPinnedFavouriteStationResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.l0;
import okhttp3.h0;
import okhttp3.logging.a;
import retrofit2.w;

/* compiled from: RequestManager */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final retrofit2.w f11694a;

    /* compiled from: RequestManager */
    public class a implements retrofit2.d<CheckUserAccountDeleteResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.c f11695a;

        public a(x1.c cVar) {
            this.f11695a = cVar;
        }

        public final void a(retrofit2.b<CheckUserAccountDeleteResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11695a.a();
        }

        public final void b(retrofit2.b<CheckUserAccountDeleteResponse> bVar, retrofit2.v<CheckUserAccountDeleteResponse> vVar) {
            boolean c10 = vVar.c();
            x1.c cVar = this.f11695a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                cVar.a();
                return;
            }
            cVar.b((CheckUserAccountDeleteResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public class b implements retrofit2.d<DeleteAccountResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.d f11696a;

        public b(x1.d dVar) {
            this.f11696a = dVar;
        }

        public final void a(retrofit2.b<DeleteAccountResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11696a.a();
        }

        public final void b(retrofit2.b<DeleteAccountResponse> bVar, retrofit2.v<DeleteAccountResponse> vVar) {
            boolean c10 = vVar.c();
            x1.d dVar = this.f11696a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                dVar.a();
                return;
            }
            dVar.b((DeleteAccountResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public class c implements retrofit2.d<DeleteMonthlyCardResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.f f11697a;

        public c(x1.f fVar) {
            this.f11697a = fVar;
        }

        public final void a(retrofit2.b<DeleteMonthlyCardResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11697a.a();
        }

        public final void b(retrofit2.b<DeleteMonthlyCardResponse> bVar, retrofit2.v<DeleteMonthlyCardResponse> vVar) {
            boolean c10 = vVar.c();
            x1.f fVar = this.f11697a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                fVar.a();
                return;
            }
            fVar.b((DeleteMonthlyCardResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public class d implements retrofit2.d<DeleteElectronicCardResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.e f11698a;

        public d(x1.e eVar) {
            this.f11698a = eVar;
        }

        public final void a(retrofit2.b<DeleteElectronicCardResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11698a.a();
        }

        public final void b(retrofit2.b<DeleteElectronicCardResponse> bVar, retrofit2.v<DeleteElectronicCardResponse> vVar) {
            boolean c10 = vVar.c();
            x1.e eVar = this.f11698a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                eVar.a();
                return;
            }
            eVar.b((DeleteElectronicCardResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public class e implements retrofit2.d<RemoveFavouriteStationResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.o f11699a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f11700b;

        public e(x1.o oVar, String str) {
            this.f11699a = oVar;
            this.f11700b = str;
        }

        public final void a(retrofit2.b<RemoveFavouriteStationResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11699a.a();
        }

        public final void b(retrofit2.b<RemoveFavouriteStationResponse> bVar, retrofit2.v<RemoveFavouriteStationResponse> vVar) {
            boolean c10 = vVar.c();
            x1.o oVar = this.f11699a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                oVar.a();
                return;
            }
            oVar.b((RemoveFavouriteStationResponse) vVar.f39010b, this.f11700b);
        }
    }

    /* compiled from: RequestManager */
    public class f implements retrofit2.d<SetPinnedFavouriteStationResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.q f11701a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f11702b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f11703c;

        public f(x1.q qVar, String str, String str2) {
            this.f11701a = qVar;
            this.f11702b = str;
            this.f11703c = str2;
        }

        public final void a(retrofit2.b<SetPinnedFavouriteStationResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11701a.a();
        }

        public final void b(retrofit2.b<SetPinnedFavouriteStationResponse> bVar, retrofit2.v<SetPinnedFavouriteStationResponse> vVar) {
            boolean c10 = vVar.c();
            x1.q qVar = this.f11701a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                qVar.a();
                return;
            }
            qVar.b((SetPinnedFavouriteStationResponse) vVar.f39010b, this.f11702b, this.f11703c);
        }
    }

    /* compiled from: RequestManager */
    public class g implements retrofit2.d<PasswordChangeResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.n f11704a;

        public g(x1.n nVar) {
            this.f11704a = nVar;
        }

        public final void a(retrofit2.b<PasswordChangeResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11704a.a();
        }

        public final void b(retrofit2.b<PasswordChangeResponse> bVar, retrofit2.v<PasswordChangeResponse> vVar) {
            boolean c10 = vVar.c();
            x1.n nVar = this.f11704a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                nVar.a();
                return;
            }
            nVar.b((PasswordChangeResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public class h implements retrofit2.d<MonthlyCardAutoRenewSettingsResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.m f11705a;

        public h(x1.m mVar) {
            this.f11705a = mVar;
        }

        public final void a(retrofit2.b<MonthlyCardAutoRenewSettingsResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11705a.a();
        }

        public final void b(retrofit2.b<MonthlyCardAutoRenewSettingsResponse> bVar, retrofit2.v<MonthlyCardAutoRenewSettingsResponse> vVar) {
            boolean c10 = vVar.c();
            x1.m mVar = this.f11705a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                mVar.a();
                return;
            }
            mVar.b((MonthlyCardAutoRenewSettingsResponse) vVar.f39010b);
        }
    }

    /* renamed from: buslogic.app.i$i  reason: collision with other inner class name */
    /* compiled from: RequestManager */
    public class C0182i implements retrofit2.d<MonthlyCardAutoRenewSettingsResponse> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ x1.p f11706a;

        public C0182i(x1.p pVar) {
            this.f11706a = pVar;
        }

        public final void a(retrofit2.b<MonthlyCardAutoRenewSettingsResponse> bVar, Throwable th) {
            th.getMessage();
            this.f11706a.a();
        }

        public final void b(retrofit2.b<MonthlyCardAutoRenewSettingsResponse> bVar, retrofit2.v<MonthlyCardAutoRenewSettingsResponse> vVar) {
            boolean c10 = vVar.c();
            x1.p pVar = this.f11706a;
            if (!c10) {
                String str = vVar.f39009a.Q;
                pVar.a();
                return;
            }
            pVar.b((MonthlyCardAutoRenewSettingsResponse) vVar.f39010b);
        }
    }

    /* compiled from: RequestManager */
    public interface j {
        @o9.o("/publicapi/v1/favourite_stations/favourite_stations.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<AddFavouriteStationResponse> a(@o9.c("action") String str, @o9.c("userId") String str2, @o9.c("stationId") String str3, @o9.c("isPinned") String str4);
    }

    /* compiled from: RequestManager */
    public interface k {
    }

    /* compiled from: RequestManager */
    public interface l {
        @o9.o("/api/api.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287", "Accept: application/json"})
        retrofit2.b<PasswordChangeResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2, @o9.c("new_password") String str3, @o9.c("ibfm") String str4);
    }

    /* compiled from: RequestManager */
    public interface m {
    }

    /* compiled from: RequestManager */
    public interface n {
        @o9.o("/api/api.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<CheckUserAccountDeleteResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2);
    }

    /* compiled from: RequestManager */
    public interface o {
        @o9.o("/api/api.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<DeleteAccountResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2);
    }

    /* compiled from: RequestManager */
    public interface p {
        @o9.o("/publicapi/v1/rest_options/android_add_or_connect_card.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<DeleteElectronicCardResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2, @o9.c("card_no") String str3);
    }

    /* compiled from: RequestManager */
    public interface q {
        @o9.o("/publicapi/v1/rest_options/android_add_or_connect_card.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<DeleteMonthlyCardResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2, @o9.c("card_no") String str3);
    }

    /* compiled from: RequestManager */
    public interface r {
    }

    /* compiled from: RequestManager */
    public interface s {
    }

    /* compiled from: RequestManager */
    public interface t {
    }

    /* compiled from: RequestManager */
    public interface u {
    }

    /* compiled from: RequestManager */
    public interface v {
    }

    /* compiled from: RequestManager */
    public interface w {
        @o9.o("/publicapi/v1/rest_options/android_add_or_connect_card.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<MonthlyCardAutoRenewSettingsResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2, @o9.c("card_user_sn") String str3);
    }

    /* compiled from: RequestManager */
    public interface x {
        @o9.o("/publicapi/v1/favourite_stations/favourite_stations.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<RemoveFavouriteStationResponse> a(@o9.c("action") String str, @o9.c("userId") String str2, @o9.c("stationId") String str3);
    }

    /* compiled from: RequestManager */
    public interface y {
        @o9.o("/publicapi/v1/rest_options/android_add_or_connect_card.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<MonthlyCardAutoRenewSettingsResponse> a(@o9.c("action") String str, @o9.c("user_id") String str2, @o9.c("card_user_sn") String str3, @o9.c("status") String str4);
    }

    /* compiled from: RequestManager */
    public interface z {
        @o9.o("/publicapi/v1/favourite_stations/favourite_stations.php")
        @o9.e
        @o9.k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
        retrofit2.b<SetPinnedFavouriteStationResponse> a(@o9.c("action") String str, @o9.c("userId") String str2, @o9.c("stationId") String str3, @o9.c("isPinned") String str4);
    }

    public i() {
        com.google.gson.j a10 = new com.google.gson.k().a();
        okhttp3.logging.a aVar = new okhttp3.logging.a();
        a.C0600a aVar2 = a.C0600a.BASIC;
        l0.p(aVar2, FirebaseAnalytics.d.f23396t);
        l0.p(aVar2, "<set-?>");
        aVar.f38574d = aVar2;
        h0 h0Var = new h0(new h0.a());
        w.b bVar = new w.b();
        bVar.b("https://online.bgnaplata.rs");
        bVar.a(retrofit2.converter.gson.a.d(a10));
        bVar.f39022b = h0Var;
        this.f11694a = bVar.c();
    }

    public final void a(x1.a aVar, String str, String str2) {
        ((j) this.f11694a.b(j.class)).a("add_favourite_station", str, str2, com.facebook.appevents.j.f13175d0).g0(new o(aVar, str2));
    }

    public final void b(x1.c cVar, String str) {
        ((n) this.f11694a.b(n.class)).a("check_if_user_is_deletable", str).g0(new a(cVar));
    }

    public final void c(x1.d dVar, String str) {
        ((o) this.f11694a.b(o.class)).a("delete_user_data", str).g0(new b(dVar));
    }

    public final void d(x1.e eVar, String str, String str2) {
        ((p) this.f11694a.b(p.class)).a("disconnect_with_existed_electronic_card", str, str2).g0(new d(eVar));
    }

    public final void e(x1.f fVar, String str, String str2) {
        ((q) this.f11694a.b(q.class)).a("disconnect_with_existed_card", str, str2).g0(new c(fVar));
    }

    public final void f(x1.m mVar, String str, String str2) {
        ((w) this.f11694a.b(w.class)).a("get_valid_automatic_extend_monthly_card", str, str2).g0(new h(mVar));
    }

    public final void g(x1.n nVar, String str, String str2) {
        ((l) this.f11694a.b(l.class)).a("change_password", str, str2, "TM000001").g0(new g(nVar));
    }

    public final void h(x1.o oVar, String str, String str2) {
        ((x) this.f11694a.b(x.class)).a("remove_favourite_station", str, str2).g0(new e(oVar, str2));
    }

    public final void i(x1.p pVar, String str, String str2, String str3) {
        ((y) this.f11694a.b(y.class)).a("change_valid_automatic_extend_monthly_card", str, str2, str3).g0(new C0182i(pVar));
    }

    public final void j(x1.q qVar, String str, String str2, String str3) {
        ((z) this.f11694a.b(z.class)).a("set_is_pinned", str, str2, str3).g0(new f(qVar, str2, str3));
    }
}
