package buslogic.app.database.model;

public interface MonthlyCard {
    int getBlackListStatus();

    String getCanProlongDateFrom();

    String getCanProlongDateTo();

    int getCardNo();

    Long getCardSN();

    int getCardUserSn();

    String getCardValidFrom();

    String getCardValidTo();

    String getCustomerFirstName();

    String getCustomerLastName();

    String getDateNewValidityFrom();

    String getDateNewValidityTo();

    Long getId();

    String getMifareSn();

    String getRideDateFrom();

    String getRideDateTo();

    String getStatus();

    String getTemplateName();

    Boolean getValidButton();
}
