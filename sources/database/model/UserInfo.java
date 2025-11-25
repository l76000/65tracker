package buslogic.app.database.model;

public interface UserInfo {
    String getAddress();

    String getCrmContactsCustomerId();

    String getEmail();

    String getFirstName();

    int getGroupId();

    Long getId();

    String getIdCardSn();

    String getJmbg();

    int getJmbgMust();

    String getLastName();

    String getLogin();

    String getMonthlyCardUserSn();

    String getPrepaidCardUserSn();

    String getValidJmbg();

    String getValueJmbg();

    boolean isHaveCrm();
}
