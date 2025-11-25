package buslogic.app.models;

public class UserCreditCard {
    public String card_holder;
    public String card_type;
    private boolean checked;
    public String date_time;
    public String expiration_month;
    public String expiration_year;
    public String id;
    public String last_four_digits;
    public String reference_uuid;
    public String user_id;

    public String getCardHolder() {
        return this.card_holder;
    }

    public String getCardType() {
        return this.card_type;
    }

    public String getDateTime() {
        return this.date_time;
    }

    public String getExpirationMonth() {
        return this.expiration_month;
    }

    public String getExpirationYear() {
        return this.expiration_year;
    }

    public String getId() {
        return this.id;
    }

    public String getLastFourDigits() {
        return this.last_four_digits;
    }

    public String getReferenceUuid() {
        return this.reference_uuid;
    }

    public String getUserId() {
        return this.user_id;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setCardHolder(String str) {
        this.card_holder = str;
    }

    public void setCardType(String str) {
        this.card_type = str;
    }

    public void setChecked(boolean z9) {
        this.checked = z9;
    }

    public void setDateTime(String str) {
        this.date_time = str;
    }

    public void setExpirationMonth(String str) {
        this.expiration_month = str;
    }

    public void setExpirationYear(String str) {
        this.expiration_year = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastFourDigits(String str) {
        this.last_four_digits = str;
    }

    public void setReferenceUuid(String str) {
        this.reference_uuid = str;
    }

    public void setUserId(String str) {
        this.user_id = str;
    }
}
