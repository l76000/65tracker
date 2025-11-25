package buslogic.app.models;

public class InAppRatingRequestModel {
    private final String action;
    private final String session_id;
    private final String user_id;

    public InAppRatingRequestModel(String str, String str2, String str3) {
        this.action = str;
        this.session_id = str2;
        this.user_id = str3;
    }

    public String getAction() {
        return this.action;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String getUser_id() {
        return this.user_id;
    }
}
