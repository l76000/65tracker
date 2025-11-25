package buslogic.app.database.model;

public interface CardType {
    Long getCardSerialFrom();

    Long getCardSerialTo();

    int getCardType();

    String getChangedBy();

    String getDateTime();

    String getDescription();

    int getId();

    String getValidityFixedDateTo();

    int getValidityPeriod();
}
