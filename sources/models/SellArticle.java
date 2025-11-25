package buslogic.app.models;

import java.io.Serializable;

public class SellArticle implements Serializable {
    public SellArticleFiscalLog fiscal_log;
    public SellArticleJournalLog journal_log;
    public String ticket_duration;
    public String ticket_res_sale_id;
}
