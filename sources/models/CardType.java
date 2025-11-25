package buslogic.app.models;

public class CardType {
    public String allowed_number_of_active_cards_at_the_same_time;
    public String card_serial_from;
    public String card_serial_to;
    public String card_type;
    public String changed_by;
    public String date_time;
    public String description;
    public String id;
    public String number_of_active_cards_per_user;
    public String number_of_warnings_before_blocking;
    public String validity_fixed_date_to;
    public String validity_period;

    public CardType(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.id = str;
        this.description = str2;
        this.card_type = str3;
        this.validity_period = str4;
        this.changed_by = str5;
        this.date_time = str6;
        this.validity_fixed_date_to = str7;
        this.card_serial_from = str8;
        this.card_serial_to = str9;
        this.number_of_active_cards_per_user = str10;
        this.number_of_warnings_before_blocking = str11;
        this.allowed_number_of_active_cards_at_the_same_time = str12;
    }

    public String getAllowed_number_of_active_cards_at_the_same_time() {
        return this.allowed_number_of_active_cards_at_the_same_time;
    }

    public String getCard_serial_from() {
        return this.card_serial_from;
    }

    public String getCard_serial_to() {
        return this.card_serial_to;
    }

    public String getCard_type() {
        return this.card_type;
    }

    public String getChanged_by() {
        return this.changed_by;
    }

    public String getDate_time() {
        return this.date_time;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getNumber_of_active_cards_per_user() {
        return this.number_of_active_cards_per_user;
    }

    public String getNumber_of_warnings_before_blocking() {
        return this.number_of_warnings_before_blocking;
    }

    public String getValidity_fixed_date_to() {
        return this.validity_fixed_date_to;
    }

    public String getValidity_period() {
        return this.validity_period;
    }

    public void setAllowed_number_of_active_cards_at_the_same_time(String str) {
        this.allowed_number_of_active_cards_at_the_same_time = str;
    }

    public void setCard_serial_from(String str) {
        this.card_serial_from = str;
    }

    public void setCard_serial_to(String str) {
        this.card_serial_to = str;
    }

    public void setCard_type(String str) {
        this.card_type = str;
    }

    public void setChanged_by(String str) {
        this.changed_by = str;
    }

    public void setDate_time(String str) {
        this.date_time = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setNumber_of_active_cards_per_user(String str) {
        this.number_of_active_cards_per_user = str;
    }

    public void setNumber_of_warnings_before_blocking(String str) {
        this.number_of_warnings_before_blocking = str;
    }

    public void setValidity_fixed_date_to(String str) {
        this.validity_fixed_date_to = str;
    }

    public void setValidity_period(String str) {
        this.validity_period = str;
    }

    public CardType(String str, String str2, String str3, String str4, String str5) {
        this.description = str;
        this.card_type = str2;
        this.validity_period = str3;
        this.card_serial_from = str4;
        this.card_serial_to = str5;
    }
}
