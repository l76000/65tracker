package buslogic.app.models;

import java.util.ArrayList;

public class UserInfo {
    public String address;
    public String city;
    public String crm_contacts_customer_id;
    public ArrayList<ElectronicCard> electronic_card;
    public String email;
    public String first_name;
    public String group_id;
    public Boolean have_crm;
    public String id_card_sn;
    public String jmbg;
    public String jmbg_must;
    public String last_name;
    public String login;
    public ArrayList<MonthlyCard> monthly_card;
    public String monthly_card_user_sn;
    public String msg;
    public String prepaid_card_user_sn;
    public Boolean success;
    public String user_id;
    public String valid_jmbg;
    public String value_jmbg;

    public UserInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Boolean bool, String str13, String str14, String str15) {
        this.user_id = str;
        this.login = str2;
        this.first_name = str3;
        this.last_name = str4;
        this.jmbg = str5;
        this.address = str6;
        this.email = str7;
        this.id_card_sn = str8;
        this.group_id = str9;
        this.crm_contacts_customer_id = str10;
        this.monthly_card_user_sn = str11;
        this.prepaid_card_user_sn = str12;
        this.have_crm = bool;
        this.jmbg_must = str13;
        this.valid_jmbg = str14;
        this.value_jmbg = str15;
    }
}
