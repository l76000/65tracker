package buslogic.app.api.apis;

import androidx.constraintlayout.helper.widget.a;
import buslogic.app.models.CardType;
import e2.c;
import e2.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class MonthlyCardAddCardApi {
    protected final int REQUEST_TIMEOUT = 10000;
    protected final int RESPONSE_TIMEOUT = 30000;
    private ArrayList<CardType> cardTypes;
    private Long card_num;
    private final String companyApiKey = "1688dc355af72ef09287";
    private final String companyUrl = "https://online.bgnaplata.rs";
    private c eWallet;
    private JSONObject eWalletJson = new JSONObject();
    private JSONObject electric_card = new JSONObject();
    String errorMsg = null;
    private String jmbg;
    private c monthlyCard;
    private JSONObject monthlyCardJson = new JSONObject();
    private Map<Integer, c> niCardMap = new HashMap();
    boolean result;
    private final String sessionId;
    private int userGroup;
    private final int userId;
    private e userInfo;

    public MonthlyCardAddCardApi(int i10, Long l10, int i11, String str, ArrayList<CardType> arrayList, String str2) {
        this.userId = i10;
        this.card_num = l10;
        this.userGroup = i11;
        this.cardTypes = arrayList;
        this.jmbg = str;
        this.sessionId = str2;
    }

    public void addMonthlyCard() {
        Thread thread = new Thread(new a(4, this));
        thread.start();
        thread.join();
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x02c0 A[Catch:{ Exception -> 0x0362 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callApi() {
        /*
            r52 = this;
            r1 = r52
            java.lang.String r0 = "card_no"
            java.lang.String r2 = "mifare_sn"
            java.lang.String r3 = "black_list_status"
            java.lang.String r4 = "template_name"
            java.lang.String r5 = "dateto"
            java.lang.String r6 = "datefrom"
            java.lang.String r7 = "card_valid_to"
            java.lang.String r8 = "status"
            java.lang.String r9 = "card_valid_from"
            java.lang.String r10 = "customer_jmbg"
            java.lang.String r11 = "customer_last_name"
            java.lang.String r12 = "customer_first_name"
            java.lang.String r13 = "serial_no"
            java.lang.String r14 = "id"
            java.lang.String r15 = "crm_contacts_type"
            r16 = r0
            java.lang.String r0 = "7/+kGvw165wYAjvJaYEbTA=="
            r17 = r2
            java.lang.String r2 = "ZsejI+9x52c+tqVnN22u7gmyVx4Jjh0aL7ytsVz9H6s="
            r18 = r3
            java.lang.String r3 = "jmbg"
            r19 = r4
            java.lang.String r4 = "user_id"
            r20 = r5
            java.lang.String r5 = "extended_dates"
            r21 = r5
            java.lang.String r5 = "status code "
            r22 = r5
            org.apache.http.params.BasicHttpParams r5 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x037c }
            r5.<init>()     // Catch:{ Exception -> 0x037c }
            r23 = r6
            r6 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r5, r6)     // Catch:{ Exception -> 0x037c }
            r6 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r5, r6)     // Catch:{ Exception -> 0x037c }
            org.apache.http.impl.client.DefaultHttpClient r5 = a2.c.a(r5)     // Catch:{ Exception -> 0x037c }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x037c }
            r24 = r8
            r8 = 1
            r6.<init>(r8)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r8 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            r25 = r7
            java.lang.String r7 = "action"
            r26 = r9
            java.lang.String r9 = "connect_card_and_merge_business_personal_account"
            r8.<init>(r7, r9)     // Catch:{ Exception -> 0x037c }
            r6.add(r8)     // Catch:{ Exception -> 0x037c }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x037c }
            r7.<init>()     // Catch:{ Exception -> 0x037c }
            int r8 = r1.userId     // Catch:{ Exception -> 0x037c }
            r7.put(r4, r8)     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = r1.jmbg     // Catch:{ Exception -> 0x037c }
            r7.put(r3, r8)     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = "card_num"
            java.lang.Long r9 = r1.card_num     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x037c }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = "userGroup"
            int r9 = r1.userGroup     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x037c }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = "session_id"
            java.lang.String r9 = r1.sessionId     // Catch:{ Exception -> 0x037c }
            r7.put(r8, r9)     // Catch:{ Exception -> 0x037c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x037c }
            java.lang.String r7 = buslogic.app.utils.b.b(r7, r2, r0)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r8 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = "base"
            r8.<init>(r9, r7)     // Catch:{ Exception -> 0x037c }
            r6.add(r8)     // Catch:{ Exception -> 0x037c }
            java.net.URI r7 = new java.net.URI     // Catch:{ Exception -> 0x037c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r8.<init>()     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = r1.companyUrl     // Catch:{ Exception -> 0x037c }
            r8.append(r9)     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = "/publicapi/v2/api.php"
            r8.append(r9)     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x037c }
            r7.<init>(r8)     // Catch:{ Exception -> 0x037c }
            org.apache.http.client.methods.HttpPost r8 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x037c }
            r8.<init>()     // Catch:{ Exception -> 0x037c }
            r8.setURI(r7)     // Catch:{ Exception -> 0x037c }
            org.apache.http.client.entity.UrlEncodedFormEntity r7 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x037c }
            java.lang.String r9 = "UTF-8"
            r7.<init>(r6, r9)     // Catch:{ Exception -> 0x037c }
            r8.setEntity(r7)     // Catch:{ Exception -> 0x037c }
            java.lang.String r6 = "X-Api-Authentication"
            java.lang.String r7 = r1.companyApiKey     // Catch:{ Exception -> 0x037c }
            r8.setHeader(r6, r7)     // Catch:{ Exception -> 0x037c }
            org.apache.http.HttpResponse r5 = r5.execute(r8)     // Catch:{ Exception -> 0x037c }
            org.apache.http.StatusLine r6 = r5.getStatusLine()     // Catch:{ Exception -> 0x037c }
            int r6 = r6.getStatusCode()     // Catch:{ Exception -> 0x037c }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x0366
            org.apache.http.HttpEntity r5 = r5.getEntity()     // Catch:{ Exception -> 0x037c }
            java.lang.String r5 = org.apache.http.util.EntityUtils.toString(r5)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = buslogic.app.utils.b.a(r5, r2, r0)     // Catch:{ Exception -> 0x037c }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x037c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "success"
            boolean r0 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x00fe }
            goto L_0x00ff
        L_0x00fe:
            r0 = 1
        L_0x00ff:
            if (r0 != 0) goto L_0x010e
            java.lang.String r0 = "msg"
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x037c }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x037c }
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x037a }
            goto L_0x0386
        L_0x010e:
            java.lang.String r0 = "arr"
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x037c }
            e2.e r2 = new e2.e     // Catch:{ Exception -> 0x037c }
            long r4 = r0.getLong(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.Long r28 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.String r4 = "login"
            java.lang.String r29 = r0.getString(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.String r4 = "first_name"
            java.lang.String r30 = r0.getString(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.String r4 = "last_name"
            java.lang.String r31 = r0.getString(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.String r32 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "address"
            java.lang.String r33 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "email"
            java.lang.String r34 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "id_card_sn"
            java.lang.String r35 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "group_id"
            int r36 = r0.getInt(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "crm_contacts_customer_id"
            java.lang.String r37 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "monthly_card_user_sn"
            java.lang.String r38 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "prepaid_card_user_sn"
            java.lang.String r39 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "have_crm"
            boolean r40 = r0.getBoolean(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "jmbg_must"
            int r41 = r0.getInt(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "valid_jmbg"
            java.lang.String r42 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r3 = "value_jmbg"
            java.lang.String r43 = r0.getString(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r44 = r0.getString(r15)     // Catch:{ Exception -> 0x037c }
            r27 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x037c }
            r1.userInfo = r2     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = "monthly_card"
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch:{ Exception -> 0x02ac }
            r3 = 0
            r4 = 0
        L_0x0189:
            int r5 = r2.length()     // Catch:{ Exception -> 0x02a5 }
            if (r3 >= r5) goto L_0x02a5
            java.lang.Object r5 = r2.get(r3)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x02a5 }
            r1.monthlyCardJson = r5     // Catch:{ Exception -> 0x02a5 }
            e2.c r6 = new e2.c     // Catch:{ Exception -> 0x02a5 }
            long r7 = r5.getLong(r14)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Long r28 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a5 }
            long r7 = r5.getLong(r13)     // Catch:{ Exception -> 0x02a5 }
            java.lang.Long r29 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r30 = r5.getString(r12)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r31 = r5.getString(r11)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a5 }
            java.lang.String r32 = r5.getString(r10)     // Catch:{ Exception -> 0x02a5 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a5 }
            r7 = r26
            java.lang.String r33 = r5.getString(r7)     // Catch:{ Exception -> 0x02a0 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02a0 }
            r8 = r25
            java.lang.String r34 = r5.getString(r8)     // Catch:{ Exception -> 0x029e }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029e }
            r9 = r24
            java.lang.String r35 = r5.getString(r9)     // Catch:{ Exception -> 0x0299 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0299 }
            r22 = r2
            r2 = r23
            java.lang.String r36 = r5.getString(r2)     // Catch:{ Exception -> 0x0297 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0297 }
            r23 = r2
            r2 = r20
            java.lang.String r37 = r5.getString(r2)     // Catch:{ Exception -> 0x0294 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0294 }
            r20 = r2
            r2 = r19
            java.lang.String r38 = r5.getString(r2)     // Catch:{ Exception -> 0x0291 }
            r39 = 5
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0291 }
            r19 = r2
            r2 = r18
            int r40 = r5.getInt(r2)     // Catch:{ Exception -> 0x028e }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x028e }
            r18 = r2
            r2 = r17
            java.lang.String r41 = r5.getString(r2)     // Catch:{ Exception -> 0x028b }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x028b }
            r17 = r2
            java.lang.String r2 = "sell_type"
            int r42 = r5.getInt(r2)     // Catch:{ Exception -> 0x0299 }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0299 }
            r5 = r21
            org.json.JSONObject r2 = r2.getJSONObject(r5)     // Catch:{ Exception -> 0x0299 }
            r25 = r8
            java.lang.String r8 = "date_start"
            java.lang.String r43 = r2.getString(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r2.getJSONObject(r5)     // Catch:{ Exception -> 0x029b }
            java.lang.String r8 = "date_end"
            java.lang.String r44 = r2.getString(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r2.getJSONObject(r5)     // Catch:{ Exception -> 0x029b }
            java.lang.String r8 = "date_from"
            java.lang.String r45 = r2.getString(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r2.getJSONObject(r5)     // Catch:{ Exception -> 0x029b }
            java.lang.String r8 = "date_to"
            java.lang.String r46 = r2.getString(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            java.lang.String r8 = "valid_button"
            org.json.JSONObject r47 = r2.getJSONObject(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            java.lang.String r8 = "datefrom_init"
            java.lang.String r48 = r2.getString(r8)     // Catch:{ Exception -> 0x029b }
            org.json.JSONObject r2 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029b }
            r8 = r16
            java.lang.String r49 = r2.getString(r8)     // Catch:{ Exception -> 0x02b3 }
            java.lang.String r2 = "crm_accounts_name"
            java.lang.String r50 = r0.getString(r2)     // Catch:{ Exception -> 0x02b3 }
            java.lang.String r51 = r0.getString(r15)     // Catch:{ Exception -> 0x02b3 }
            r27 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x02b3 }
            r1.monthlyCard = r6     // Catch:{ Exception -> 0x02b3 }
            java.util.Map<java.lang.Integer, e2.c> r2 = r1.niCardMap     // Catch:{ Exception -> 0x02b3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02b3 }
            r21 = r5
            e2.c r5 = r1.monthlyCard     // Catch:{ Exception -> 0x02b3 }
            r2.put(r6, r5)     // Catch:{ Exception -> 0x02b3 }
            int r4 = r4 + 1
            int r3 = r3 + 1
            r26 = r7
            r16 = r8
            r24 = r9
            r2 = r22
            goto L_0x0189
        L_0x028b:
            r17 = r2
            goto L_0x0299
        L_0x028e:
            r18 = r2
            goto L_0x0299
        L_0x0291:
            r19 = r2
            goto L_0x0299
        L_0x0294:
            r20 = r2
            goto L_0x0299
        L_0x0297:
            r23 = r2
        L_0x0299:
            r25 = r8
        L_0x029b:
            r8 = r16
            goto L_0x02b3
        L_0x029e:
            r25 = r8
        L_0x02a0:
            r8 = r16
            r9 = r24
            goto L_0x02b3
        L_0x02a5:
            r8 = r16
            r9 = r24
            r7 = r26
            goto L_0x02b3
        L_0x02ac:
            r8 = r16
            r9 = r24
            r7 = r26
            r4 = 0
        L_0x02b3:
            java.lang.String r2 = "electronic_card"
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ Exception -> 0x0362 }
            r2 = 0
        L_0x02ba:
            int r3 = r0.length()     // Catch:{ Exception -> 0x0362 }
            if (r2 >= r3) goto L_0x0362
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ Exception -> 0x0362 }
            r1.eWalletJson = r3     // Catch:{ Exception -> 0x0362 }
            e2.c r5 = new e2.c     // Catch:{ Exception -> 0x0362 }
            long r15 = r3.getLong(r14)     // Catch:{ Exception -> 0x0362 }
            java.lang.Long r27 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            long r15 = r3.getLong(r13)     // Catch:{ Exception -> 0x0362 }
            java.lang.Long r28 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r29 = r3.getString(r12)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r30 = r3.getString(r11)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r31 = r3.getString(r10)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r32 = r3.getString(r9)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r33 = r3.getString(r7)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r6 = r25
            java.lang.String r34 = r3.getString(r6)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r15 = r23
            java.lang.String r35 = r3.getString(r15)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r16 = r0
            r0 = r20
            java.lang.String r36 = r3.getString(r0)     // Catch:{ Exception -> 0x0362 }
            r37 = 1
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r20 = r0
            r0 = r19
            java.lang.String r38 = r3.getString(r0)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r19 = r0
            r0 = r18
            int r39 = r3.getInt(r0)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r18 = r0
            java.lang.String r0 = "card_user_sn"
            int r40 = r3.getInt(r0)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            r3 = r17
            java.lang.String r41 = r0.getString(r3)     // Catch:{ Exception -> 0x0362 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0362 }
            java.lang.String r42 = r0.getString(r8)     // Catch:{ Exception -> 0x0362 }
            r26 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0362 }
            r1.eWallet = r5     // Catch:{ Exception -> 0x0362 }
            java.util.Map<java.lang.Integer, e2.c> r0 = r1.niCardMap     // Catch:{ Exception -> 0x0362 }
            int r5 = r2 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0362 }
            r17 = r3
            e2.c r3 = r1.eWallet     // Catch:{ Exception -> 0x0362 }
            r0.put(r5, r3)     // Catch:{ Exception -> 0x0362 }
            int r2 = r2 + 1
            r25 = r6
            r23 = r15
            r0 = r16
            goto L_0x02ba
        L_0x0362:
            r0 = 1
            r1.result = r0     // Catch:{ Exception -> 0x037c }
            goto L_0x0386
        L_0x0366:
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x037a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r2 = r22
            r0.<init>(r2)     // Catch:{ Exception -> 0x037c }
            r0.append(r6)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x037c }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x037c }
            goto L_0x0386
        L_0x037a:
            r0 = move-exception
            goto L_0x037e
        L_0x037c:
            r0 = move-exception
            r2 = 0
        L_0x037e:
            r1.result = r2
            java.lang.String r0 = r0.getMessage()
            r1.errorMsg = r0
        L_0x0386:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.MonthlyCardAddCardApi.callApi():void");
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public c getResponse() {
        return this.monthlyCard;
    }

    public Map<Integer, c> getResponseNicards() {
        return this.niCardMap;
    }

    public e getResponseUserInfo() {
        return this.userInfo;
    }
}
