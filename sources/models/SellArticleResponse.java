package buslogic.app.models;

import java.io.Serializable;

public class SellArticleResponse implements Serializable {
    public String msg;
    public SellArticle result;
    public Boolean success;
}
