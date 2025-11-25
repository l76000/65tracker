package buslogic.app.retrofit;

import androidx.annotation.Keep;
import buslogic.app.models.ArticleGroupationResponse;
import buslogic.app.models.GetArticlesForSaleResponse;
import buslogic.app.models.UserArticle;
import java.util.ArrayList;
import o9.c;
import o9.e;
import o9.k;
import o9.o;
import retrofit2.b;

@Keep
public interface ArticlesApiRequest {
    public static final String COMPANY_API_KEY = "1688dc355af72ef09287";
    public static final String COMPANY_URL = "https://online.bgnaplata.rs";

    @o("/publicapi/v1/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<ArticleGroupationResponse> getArticleGroupation(@c("action") String str, @c("type") String str2, @c("session_id") String str3);

    @o("/publicapi/v1/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<GetArticlesForSaleResponse> getArticlesForSale(@c("action") String str, @c("flag") String str2, @c("display_in_status") String str3, @c("groupation") String str4, @c("session_id") String str5);

    @o("/publicapi/v2/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<String> getLastUserArticles(@c("action") String str, @c("base") String str2);

    @o("/publicapi/v1/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<ArrayList<UserArticle>> getUserArticles(@c("action") String str, @c("userId") String str2, @c("session_id") String str3);

    @o("/publicapi/v1/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<Boolean> sendEmailForArticle(@c("action") String str, @c("ibfm") String str2, @c("user_id") String str3, @c("payment_type") String str4, @c("journal_id") String str5, @c("ticket_res_sale_id") String str6, @c("email") String str7, @c("article_name") String str8, @c("article_group") String str9);

    @o("/publicapi/v2/api.php")
    @e
    @k({"Content-Type: application/x-www-form-urlencoded", "X-Api-Authentication: 1688dc355af72ef09287"})
    b<String> tradeArticle(@c("action") String str, @c("base") String str2);
}
