package buslogic.app.api.apis;

import androidx.constraintlayout.helper.widget.a;
import e2.c;
import e2.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class EWalletAddCardApi {
    protected final int REQUEST_TIMEOUT = 10000;
    protected final int RESPONSE_TIMEOUT = 30000;
    private Long card_num;
    private final String companyApiKey;
    private final String companyUrl;
    private c eWallet;
    private JSONObject eWalletJson = new JSONObject();
    private JSONObject electric_card = new JSONObject();
    String errorMsg = null;
    private c monthlyCard;
    private JSONObject monthlyCardJson = new JSONObject();
    private Map<Integer, c> niCardMap = new HashMap();
    boolean result;
    private String sessionId;
    private int userGroup;
    private final int userId;
    private e userInfo;

    public EWalletAddCardApi(String str, String str2, int i10, Long l10, int i11, String str3) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.userId = i10;
        this.card_num = l10;
        this.userGroup = i11;
        this.sessionId = str3;
    }

    public void addEWallet() {
        Thread thread = new Thread(new a(1, this));
        thread.start();
        thread.join();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(5:11|12|13|14|101)(19:15|16|17|18|19|20|21|(34:25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|23|22)|98|73|77|79|80|(3:83|84|81)|99|85|87|88|102)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0125 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x012b A[Catch:{ Exception -> 0x039b }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02df A[Catch:{ Exception -> 0x0381 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callApi() {
        /*
            r51 = this;
            r1 = r51
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
            java.lang.String r0 = "user_id"
            r17 = r2
            java.lang.String r2 = "extended_dates"
            r18 = r2
            java.lang.String r2 = "status code "
            r19 = r2
            java.lang.String r2 = ""
            r20 = r3
            org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x039b }
            r3.<init>()     // Catch:{ Exception -> 0x039b }
            r21 = r4
            r4 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Exception -> 0x039b }
            r4 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Exception -> 0x039b }
            org.apache.http.impl.client.DefaultHttpClient r3 = a2.c.a(r3)     // Catch:{ Exception -> 0x039b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x039b }
            r22 = r5
            r5 = 1
            r4.<init>(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            r23 = r6
            java.lang.String r6 = "action"
            r24 = r8
            java.lang.String r8 = "connect_with_existed_electronic_card"
            r5.<init>(r6, r8)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r6.<init>(r2)     // Catch:{ Exception -> 0x039b }
            int r8 = r1.userId     // Catch:{ Exception -> 0x039b }
            r6.append(r8)     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x039b }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = "card_num"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r8.<init>(r2)     // Catch:{ Exception -> 0x039b }
            r25 = r7
            java.lang.Long r7 = r1.card_num     // Catch:{ Exception -> 0x039b }
            r8.append(r7)     // Catch:{ Exception -> 0x039b }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x039b }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = "userGroup"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r7.<init>(r2)     // Catch:{ Exception -> 0x039b }
            int r8 = r1.userGroup     // Catch:{ Exception -> 0x039b }
            r7.append(r8)     // Catch:{ Exception -> 0x039b }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x039b }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = "ibfm"
            java.lang.String r7 = "TM00000"
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = "session_id"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r7.<init>(r2)     // Catch:{ Exception -> 0x039b }
            java.lang.String r2 = r1.sessionId     // Catch:{ Exception -> 0x039b }
            r7.append(r2)     // Catch:{ Exception -> 0x039b }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x039b }
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x039b }
            r4.add(r5)     // Catch:{ Exception -> 0x039b }
            java.lang.String r2 = "/publicapi/v1/rest_options/android_add_or_connect_card.php"
            java.net.URI r5 = new java.net.URI     // Catch:{ Exception -> 0x039b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r6.<init>()     // Catch:{ Exception -> 0x039b }
            java.lang.String r7 = r1.companyUrl     // Catch:{ Exception -> 0x039b }
            r6.append(r7)     // Catch:{ Exception -> 0x039b }
            r6.append(r2)     // Catch:{ Exception -> 0x039b }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x039b }
            r5.<init>(r2)     // Catch:{ Exception -> 0x039b }
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x039b }
            r2.<init>()     // Catch:{ Exception -> 0x039b }
            r2.setURI(r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.client.entity.UrlEncodedFormEntity r5 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x039b }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x039b }
            r2.setEntity(r5)     // Catch:{ Exception -> 0x039b }
            java.lang.String r4 = "X-Api-Authentication"
            java.lang.String r5 = r1.companyApiKey     // Catch:{ Exception -> 0x039b }
            r2.setHeader(r4, r5)     // Catch:{ Exception -> 0x039b }
            org.apache.http.HttpResponse r2 = r3.execute(r2)     // Catch:{ Exception -> 0x039b }
            org.apache.http.StatusLine r3 = r2.getStatusLine()     // Catch:{ Exception -> 0x039b }
            int r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x039b }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0385
            org.apache.http.HttpEntity r2 = r2.getEntity()     // Catch:{ Exception -> 0x039b }
            java.lang.String r2 = org.apache.http.util.EntityUtils.toString(r2)     // Catch:{ Exception -> 0x039b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x039b }
            r3.<init>(r2)     // Catch:{ Exception -> 0x039b }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x039b }
            java.lang.String r4 = "success"
            boolean r4 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x0125 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0125 }
        L_0x0125:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x039b }
            if (r2 != 0) goto L_0x0138
            java.lang.String r0 = "msg"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x039b }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x039b }
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x0399 }
            goto L_0x03a5
        L_0x0138:
            java.lang.String r2 = "arr"
            org.json.JSONObject r2 = r3.getJSONObject(r2)     // Catch:{ Exception -> 0x039b }
            e2.e r3 = new e2.e     // Catch:{ Exception -> 0x039b }
            long r4 = r2.getLong(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.Long r27 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "login"
            java.lang.String r28 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "first_name"
            java.lang.String r29 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "last_name"
            java.lang.String r30 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "jmbg"
            java.lang.String r31 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "address"
            java.lang.String r32 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "email"
            java.lang.String r33 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "id_card_sn"
            java.lang.String r34 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "group_id"
            int r35 = r2.getInt(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "crm_contacts_customer_id"
            java.lang.String r36 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "monthly_card_user_sn"
            java.lang.String r37 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "prepaid_card_user_sn"
            java.lang.String r38 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "have_crm"
            boolean r39 = r2.getBoolean(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "jmbg_must"
            int r40 = r2.getInt(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "valid_jmbg"
            java.lang.String r41 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "value_jmbg"
            java.lang.String r42 = r2.getString(r0)     // Catch:{ Exception -> 0x039b }
            java.lang.String r43 = r2.getString(r15)     // Catch:{ Exception -> 0x039b }
            r26 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ Exception -> 0x039b }
            r1.userInfo = r3     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = "monthly_card"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ Exception -> 0x02cd }
            r3 = 0
            r4 = 0
        L_0x01b5:
            int r5 = r0.length()     // Catch:{ Exception -> 0x02c8 }
            if (r3 >= r5) goto L_0x02c8
            java.lang.Object r5 = r0.get(r3)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x02c8 }
            r1.monthlyCardJson = r5     // Catch:{ Exception -> 0x02c8 }
            e2.c r6 = new e2.c     // Catch:{ Exception -> 0x02c8 }
            long r7 = r5.getLong(r14)     // Catch:{ Exception -> 0x02c8 }
            java.lang.Long r27 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            long r7 = r5.getLong(r13)     // Catch:{ Exception -> 0x02c8 }
            java.lang.Long r28 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r29 = r5.getString(r12)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r30 = r5.getString(r11)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r31 = r5.getString(r10)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            java.lang.String r32 = r5.getString(r9)     // Catch:{ Exception -> 0x02c8 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c8 }
            r7 = r25
            java.lang.String r33 = r5.getString(r7)     // Catch:{ Exception -> 0x02c6 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c6 }
            r8 = r24
            java.lang.String r34 = r5.getString(r8)     // Catch:{ Exception -> 0x02c1 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c1 }
            r19 = r0
            r0 = r23
            java.lang.String r35 = r5.getString(r0)     // Catch:{ Exception -> 0x02bf }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02bf }
            r23 = r0
            r0 = r22
            java.lang.String r36 = r5.getString(r0)     // Catch:{ Exception -> 0x02bc }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02bc }
            r22 = r0
            r0 = r21
            java.lang.String r37 = r5.getString(r0)     // Catch:{ Exception -> 0x02b9 }
            r38 = 5
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02b9 }
            r21 = r0
            r0 = r20
            int r39 = r5.getInt(r0)     // Catch:{ Exception -> 0x02b6 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02b6 }
            r20 = r0
            r0 = r17
            java.lang.String r40 = r5.getString(r0)     // Catch:{ Exception -> 0x02b3 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02b3 }
            r17 = r0
            java.lang.String r0 = "sell_type"
            int r41 = r5.getInt(r0)     // Catch:{ Exception -> 0x02c1 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c1 }
            r5 = r18
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x02c1 }
            r25 = r7
            java.lang.String r7 = "date_start"
            java.lang.String r42 = r0.getString(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x02c3 }
            java.lang.String r7 = "date_end"
            java.lang.String r43 = r0.getString(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x02c3 }
            java.lang.String r7 = "date_from"
            java.lang.String r44 = r0.getString(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r0.getJSONObject(r5)     // Catch:{ Exception -> 0x02c3 }
            java.lang.String r7 = "date_to"
            java.lang.String r45 = r0.getString(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            java.lang.String r7 = "valid_button"
            org.json.JSONObject r46 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            java.lang.String r7 = "datefrom_init"
            java.lang.String r47 = r0.getString(r7)     // Catch:{ Exception -> 0x02c3 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x02c3 }
            r7 = r16
            java.lang.String r48 = r0.getString(r7)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r0 = "crm_accounts_name"
            java.lang.String r49 = r2.getString(r0)     // Catch:{ Exception -> 0x02d2 }
            java.lang.String r50 = r2.getString(r15)     // Catch:{ Exception -> 0x02d2 }
            r26 = r6
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ Exception -> 0x02d2 }
            r1.monthlyCard = r6     // Catch:{ Exception -> 0x02d2 }
            java.util.Map<java.lang.Integer, e2.c> r0 = r1.niCardMap     // Catch:{ Exception -> 0x02d2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02d2 }
            r18 = r5
            e2.c r5 = r1.monthlyCard     // Catch:{ Exception -> 0x02d2 }
            r0.put(r6, r5)     // Catch:{ Exception -> 0x02d2 }
            int r4 = r4 + 1
            int r3 = r3 + 1
            r16 = r7
            r24 = r8
            r0 = r19
            goto L_0x01b5
        L_0x02b3:
            r17 = r0
            goto L_0x02c1
        L_0x02b6:
            r20 = r0
            goto L_0x02c1
        L_0x02b9:
            r21 = r0
            goto L_0x02c1
        L_0x02bc:
            r22 = r0
            goto L_0x02c1
        L_0x02bf:
            r23 = r0
        L_0x02c1:
            r25 = r7
        L_0x02c3:
            r7 = r16
            goto L_0x02d2
        L_0x02c6:
            r25 = r7
        L_0x02c8:
            r7 = r16
            r8 = r24
            goto L_0x02d2
        L_0x02cd:
            r7 = r16
            r8 = r24
            r4 = 0
        L_0x02d2:
            java.lang.String r0 = "electronic_card"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ Exception -> 0x0381 }
            r2 = 0
        L_0x02d9:
            int r3 = r0.length()     // Catch:{ Exception -> 0x0381 }
            if (r2 >= r3) goto L_0x0381
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ Exception -> 0x0381 }
            r1.eWalletJson = r3     // Catch:{ Exception -> 0x0381 }
            e2.c r5 = new e2.c     // Catch:{ Exception -> 0x0381 }
            long r15 = r3.getLong(r14)     // Catch:{ Exception -> 0x0381 }
            java.lang.Long r27 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            long r15 = r3.getLong(r13)     // Catch:{ Exception -> 0x0381 }
            java.lang.Long r28 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r29 = r3.getString(r12)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r30 = r3.getString(r11)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r31 = r3.getString(r10)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r32 = r3.getString(r8)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r33 = r3.getString(r9)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r6 = r25
            java.lang.String r34 = r3.getString(r6)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r15 = r23
            java.lang.String r35 = r3.getString(r15)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r16 = r0
            r0 = r22
            java.lang.String r36 = r3.getString(r0)     // Catch:{ Exception -> 0x0381 }
            r37 = 1
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r22 = r0
            r0 = r21
            java.lang.String r38 = r3.getString(r0)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r21 = r0
            r0 = r20
            int r39 = r3.getInt(r0)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r20 = r0
            java.lang.String r0 = "card_user_sn"
            int r40 = r3.getInt(r0)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            r3 = r17
            java.lang.String r41 = r0.getString(r3)     // Catch:{ Exception -> 0x0381 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0381 }
            java.lang.String r42 = r0.getString(r7)     // Catch:{ Exception -> 0x0381 }
            r26 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x0381 }
            r1.eWallet = r5     // Catch:{ Exception -> 0x0381 }
            java.util.Map<java.lang.Integer, e2.c> r0 = r1.niCardMap     // Catch:{ Exception -> 0x0381 }
            int r5 = r2 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x0381 }
            r17 = r3
            e2.c r3 = r1.eWallet     // Catch:{ Exception -> 0x0381 }
            r0.put(r5, r3)     // Catch:{ Exception -> 0x0381 }
            int r2 = r2 + 1
            r25 = r6
            r23 = r15
            r0 = r16
            goto L_0x02d9
        L_0x0381:
            r0 = 1
            r1.result = r0     // Catch:{ Exception -> 0x039b }
            goto L_0x03a5
        L_0x0385:
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x0399 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x039b }
            r2 = r19
            r0.<init>(r2)     // Catch:{ Exception -> 0x039b }
            r0.append(r3)     // Catch:{ Exception -> 0x039b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x039b }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x039b }
            goto L_0x03a5
        L_0x0399:
            r0 = move-exception
            goto L_0x039d
        L_0x039b:
            r0 = move-exception
            r2 = 0
        L_0x039d:
            r1.result = r2
            java.lang.String r0 = r0.getMessage()
            r1.errorMsg = r0
        L_0x03a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.EWalletAddCardApi.callApi():void");
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public c getResponse() {
        return this.eWallet;
    }

    public Map<Integer, c> getResponseNicards() {
        return this.niCardMap;
    }

    public e getResponseUserInfo() {
        return this.userInfo;
    }
}
