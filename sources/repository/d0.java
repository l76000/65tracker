package buslogic.app.repository;

import android.content.Context;
import android.content.SharedPreferences;
import buslogic.app.models.Article;
import buslogic.app.models.ArticleDuration;
import buslogic.app.models.ArticleGroup;
import buslogic.app.models.CardPriceGroup;
import buslogic.app.models.CardType;
import buslogic.app.models.IndividualPaymentSettings;
import buslogic.app.models.LineRouteData;
import buslogic.app.models.PaymentOption;
import buslogic.app.models.UserArticle;
import com.google.gson.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: SharedPrefRepository */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f11716a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences.Editor f11717b;

    /* renamed from: c  reason: collision with root package name */
    public final j f11718c = new j();

    /* compiled from: SharedPrefRepository */
    public class a extends h7.a<ArrayList<ArticleGroup>> {
    }

    /* compiled from: SharedPrefRepository */
    public class b extends h7.a<ArrayList<Article>> {
    }

    /* compiled from: SharedPrefRepository */
    public class c extends h7.a<ArrayList<CardType>> {
    }

    /* compiled from: SharedPrefRepository */
    public class d extends h7.a<ArrayList<CardPriceGroup>> {
    }

    /* compiled from: SharedPrefRepository */
    public class e extends h7.a<List<UserArticle>> {
    }

    /* compiled from: SharedPrefRepository */
    public class f extends h7.a<HashMap<String, LineRouteData>> {
    }

    public d0(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b2.b.f9624a, 0);
        this.f11716a = sharedPreferences;
        this.f11717b = sharedPreferences.edit();
    }

    public final void a(UserArticle userArticle) {
        List<UserArticle> i10 = i();
        if (i10 == null) {
            i10 = new ArrayList<>();
        }
        for (UserArticle userArticle2 : i10) {
            if (userArticle2.id.equals(userArticle.id)) {
                return;
            }
        }
        i10.add(userArticle);
        q(b2.b.f9638o, this.f11718c.g(i10));
    }

    public final ArrayList<ArticleGroup> b() {
        return (ArrayList) this.f11718c.c(n(b2.b.f9628e), new a().f36920b);
    }

    public final ArrayList<Article> c() {
        return (ArrayList) this.f11718c.c(n(b2.b.f9631h), new b().f36920b);
    }

    public final Boolean d(String str) {
        return Boolean.valueOf(this.f11716a.getBoolean(str, false));
    }

    public final ArrayList<CardPriceGroup> e() {
        return (ArrayList) this.f11718c.c(n(b2.b.f9636m), new d().f36920b);
    }

    public final ArrayList<CardType> f() {
        return (ArrayList) this.f11718c.c(n(b2.b.f9635l), new c().f36920b);
    }

    public final IndividualPaymentSettings g() {
        String n10 = n(b2.b.f9633j);
        return (IndividualPaymentSettings) this.f11718c.b(IndividualPaymentSettings.class, n10);
    }

    public final UserArticle h() {
        List<UserArticle> i10 = i();
        ArrayList arrayList = new ArrayList();
        q(b2.b.f9638o, "");
        if (i10 != null && !i10.isEmpty()) {
            for (UserArticle next : i10) {
                if (buslogic.app.utils.c.a(next.ticket_duration)) {
                    arrayList.add(next);
                    a(next);
                }
            }
        }
        return buslogic.app.utils.c.g(arrayList);
    }

    public final List<UserArticle> i() {
        String n10 = n(b2.b.f9638o);
        if (n10 == null || n10.isEmpty()) {
            return new ArrayList();
        }
        return (List) this.f11718c.c(n10, new e().f36920b);
    }

    public final HashMap<String, LineRouteData> j() {
        return (HashMap) this.f11718c.c(n(b2.b.f9646w), new f().f36920b);
    }

    public final void k() {
        ArrayList arrayList = (ArrayList) this.f11718c.c(n(b2.b.f9629f), new e0().f36920b);
    }

    public final LineRouteData l(String str) {
        HashMap<String, LineRouteData> j10 = j();
        new ArrayList();
        LineRouteData lineRouteData = new LineRouteData();
        if (j10 == null || !j10.containsKey(str) || j10.get(str) == null) {
            return lineRouteData;
        }
        return j10.get(str);
    }

    public final String m() {
        return n(b2.b.f9647x);
    }

    public final String n(String str) {
        return this.f11716a.getString(str, "");
    }

    public final int o() {
        return Integer.valueOf(this.f11716a.getInt(b2.b.f9649z, 0)).intValue();
    }

    public final void p(String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        SharedPreferences.Editor editor = this.f11717b;
        editor.putBoolean(str, booleanValue);
        editor.commit();
    }

    public final void q(String str, String str2) {
        SharedPreferences.Editor editor = this.f11717b;
        editor.putString(str, str2);
        editor.commit();
    }

    public final void r(ArrayList<ArticleGroup> arrayList) {
        q(b2.b.f9628e, this.f11718c.g(arrayList));
    }

    public final void s(ArrayList<Article> arrayList) {
        q(b2.b.f9631h, this.f11718c.g(arrayList));
    }

    public final void t(ArrayList<ArticleDuration> arrayList) {
        q(b2.b.f9630g, this.f11718c.g(arrayList));
    }

    public final void u(ArrayList<PaymentOption> arrayList) {
        q(b2.b.f9629f, this.f11718c.g(arrayList));
    }
}
