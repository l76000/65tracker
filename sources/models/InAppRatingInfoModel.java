package buslogic.app.models;

public class InAppRatingInfoModel {
    private String date_time;
    private String session_id;
    private boolean success;
    private String user_id;

    public String getDate_time() {
        return this.date_time;
    }

    public String getSession_id() {
        return this.session_id;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public boolean isSuccess() {
        return this.success;
    }
}
