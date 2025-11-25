package buslogic.app.repository;

import androidx.lifecycle.x0;
import b2.a;
import buslogic.app.retrofit.ArticlesApiRequest;
import d2.d;

/* compiled from: ArticlesRepository */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArticlesApiRequest f11734a = ((ArticlesApiRequest) d.a().b(ArticlesApiRequest.class));

    public final x0 a(String str, String str2) {
        String str3;
        x0 x0Var = new x0();
        if (str.isEmpty()) {
            str3 = "display_in_smart_application";
        } else {
            str3 = "";
        }
        this.f11734a.getArticlesForSale("get_articles_for_sell", "android_kiosk_article", str3, str, str2).g0(new h(x0Var));
        return x0Var;
    }

    public final x0 b(String str) {
        x0 x0Var = new x0();
        this.f11734a.getArticleGroupation(a.f9621m, a.f9622n, str).g0(new m(x0Var));
        return x0Var;
    }

    public final x0 c(String str) {
        x0 x0Var = new x0();
        this.f11734a.getLastUserArticles("recently_engaged_elements", str).g0(new k(x0Var));
        return x0Var;
    }

    public final x0 d(String str, String str2) {
        x0 x0Var = new x0();
        this.f11734a.getUserArticles("articles_sell_log", str, str2).g0(new j(x0Var));
        return x0Var;
    }

    public final x0 e(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        x0 x0Var = new x0();
        this.f11734a.sendEmailForArticle("article_send_pdf", "ST000000", str, str2, str3, str4, str5, str6, str7).g0(new l(x0Var));
        return x0Var;
    }

    public final x0 f(String str) {
        x0 x0Var = new x0();
        this.f11734a.tradeArticle("article_trade", str).g0(new i(x0Var));
        return x0Var;
    }
}
