package buslogic.app.database.model;

public interface EWallet {
    int getBlackListStatus();

    int getCardNo();

    Long getCardSN();

    int getCardUserSn();

    String getCardValidFrom();

    String getCardValidTo();

    String getCustomerFirstName();

    String getCustomerLastName();

    Long getId();

    String getMifareSn();

    String getRideDateFrom();

    String getRideDateTo();

    String getStatus();

    String getTemplateName();

    Boolean getValidButton();
}
