package buslogic.app.models;

public class ArticleTrade {
    private String article_uid;
    private String credit_card_transactions_id;
    private String line_number;
    private String pay_opt_sel;
    private String payment_method;
    private String price;
    private String sell_type;
    private String session_id;
    private String userId;

    public ArticleTrade(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.price = str;
        this.line_number = str2;
        this.article_uid = str3;
        this.pay_opt_sel = str4;
        this.payment_method = str5;
        this.userId = str6;
        this.credit_card_transactions_id = str7;
        this.sell_type = str8;
        this.session_id = str9;
    }

    public String getArticle_uid() {
        return this.article_uid;
    }

    public String getCredit_card_transactions_id() {
        return this.credit_card_transactions_id;
    }

    public String getLine_number() {
        return this.line_number;
    }

    public String getPay_opt_sel() {
        return this.pay_opt_sel;
    }

    public String getPayment_method() {
        return this.payment_method;
    }

    public String getPrice() {
        return this.price;
    }

    public String getSell_type() {
        return this.sell_type;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setArticle_uid(String str) {
        this.article_uid = str;
    }

    public void setCredit_card_transactions_id(String str) {
        this.credit_card_transactions_id = str;
    }

    public void setLine_number(String str) {
        this.line_number = str;
    }

    public void setPay_opt_sel(String str) {
        this.pay_opt_sel = str;
    }

    public void setPayment_method(String str) {
        this.payment_method = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setSell_type(String str) {
        this.sell_type = str;
    }

    public void setSession_id(String str) {
        this.session_id = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
