package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.motion.widget.f0;
import e.q0;
import e2.c;
import e2.e;
import java.util.Map;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class NiCardExistingCardsApi {
    protected final int REQUEST_TIMEOUT = 5000;
    protected final int RESPONSE_TIMEOUT = 7000;
    private final String companyApiKey = "1688dc355af72ef09287";
    private final String companyUrl = "https://online.bgnaplata.rs";
    private final int eWalletCardType;
    private JSONObject eWalletJson = new JSONObject();
    private String errorMsg = null;
    /* access modifiers changed from: private */
    public SetNiCard mCallback;
    private JSONObject monthlyCardJson = new JSONObject();
    private final int monthlyCardType;
    private c niCard;
    /* access modifiers changed from: private */
    public Map<Integer, c> niCardMap;
    boolean result;
    private final String sessionId;
    private final int userId;
    private e userInfo;

    public interface SetNiCard {
        void set(e eVar, Map<Integer, c> map);
    }

    public NiCardExistingCardsApi(int i10, int i11, int i12, String str) {
        this.userId = i10;
        this.monthlyCardType = i11;
        this.eWalletCardType = i12;
        this.sessionId = str;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(1:11)(16:12|13|14|15|16|(34:20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|18|17)|89|68|72|74|75|(3:78|79|76)|90|80|82|83)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00fa */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0100 A[Catch:{ Exception -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x010d A[Catch:{ Exception -> 0x037c }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02bc A[Catch:{ Exception -> 0x0364 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$callApiExistingNiCard$0(android.os.Handler r51) {
        /*
            r50 = this;
            r1 = r50
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
            org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x037c }
            r3.<init>()     // Catch:{ Exception -> 0x037c }
            r21 = r4
            r4 = 5000(0x1388, float:7.006E-42)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Exception -> 0x037c }
            r4 = 7000(0x1b58, float:9.809E-42)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Exception -> 0x037c }
            org.apache.http.impl.client.DefaultHttpClient r3 = a2.c.a(r3)     // Catch:{ Exception -> 0x037c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x037c }
            r22 = r5
            r5 = 1
            r4.<init>(r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            r23 = r6
            java.lang.String r6 = "action"
            r24 = r8
            java.lang.String r8 = "get_user_info"
            r5.<init>(r6, r8)     // Catch:{ Exception -> 0x037c }
            r4.add(r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r6.<init>(r2)     // Catch:{ Exception -> 0x037c }
            int r8 = r1.userId     // Catch:{ Exception -> 0x037c }
            r6.append(r8)     // Catch:{ Exception -> 0x037c }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x037c }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x037c }
            r4.add(r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r5 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            java.lang.String r6 = "session_id"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r8.<init>(r2)     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = r1.sessionId     // Catch:{ Exception -> 0x037c }
            r8.append(r2)     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x037c }
            r5.<init>(r6, r2)     // Catch:{ Exception -> 0x037c }
            r4.add(r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.message.BasicNameValuePair r2 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x037c }
            java.lang.String r5 = "ibfm"
            java.lang.String r6 = "TM00000"
            r2.<init>(r5, r6)     // Catch:{ Exception -> 0x037c }
            r4.add(r2)     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = "/publicapi/v1/rest_options/android_add_or_connect_card.php"
            java.net.URI r5 = new java.net.URI     // Catch:{ Exception -> 0x037c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r6.<init>()     // Catch:{ Exception -> 0x037c }
            java.lang.String r8 = r1.companyUrl     // Catch:{ Exception -> 0x037c }
            r6.append(r8)     // Catch:{ Exception -> 0x037c }
            r6.append(r2)     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = r6.toString()     // Catch:{ Exception -> 0x037c }
            r5.<init>(r2)     // Catch:{ Exception -> 0x037c }
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x037c }
            r2.<init>()     // Catch:{ Exception -> 0x037c }
            r2.setURI(r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.client.entity.UrlEncodedFormEntity r5 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x037c }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x037c }
            r2.setEntity(r5)     // Catch:{ Exception -> 0x037c }
            java.lang.String r4 = "X-Api-Authentication"
            java.lang.String r5 = r1.companyApiKey     // Catch:{ Exception -> 0x037c }
            r2.setHeader(r4, r5)     // Catch:{ Exception -> 0x037c }
            org.apache.http.HttpResponse r2 = r3.execute(r2)     // Catch:{ Exception -> 0x037c }
            org.apache.http.StatusLine r3 = r2.getStatusLine()     // Catch:{ Exception -> 0x037c }
            int r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x037c }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x037c }
            r4.<init>()     // Catch:{ Exception -> 0x037c }
            r1.niCardMap = r4     // Catch:{ Exception -> 0x037c }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0368
            org.apache.http.HttpEntity r2 = r2.getEntity()     // Catch:{ Exception -> 0x037c }
            java.lang.String r2 = org.apache.http.util.EntityUtils.toString(r2)     // Catch:{ Exception -> 0x037c }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x037c }
            r3.<init>(r2)     // Catch:{ Exception -> 0x037c }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x037c }
            java.lang.String r4 = "success"
            boolean r4 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x00fa }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00fa }
        L_0x00fa:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x037c }
            if (r2 != 0) goto L_0x010d
            java.lang.String r0 = "msg"
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x037c }
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x037c }
            goto L_0x0386
        L_0x010d:
            e2.e r2 = new e2.e     // Catch:{ Exception -> 0x037c }
            long r4 = r3.getLong(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.Long r26 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "login"
            java.lang.String r27 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "first_name"
            java.lang.String r28 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "last_name"
            java.lang.String r29 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "jmbg"
            java.lang.String r30 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "address"
            java.lang.String r31 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "email"
            java.lang.String r32 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "id_card_sn"
            java.lang.String r33 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "group_id"
            int r34 = r3.getInt(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "crm_contacts_customer_id"
            java.lang.String r35 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "monthly_card_user_sn"
            java.lang.String r36 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "prepaid_card_user_sn"
            java.lang.String r37 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "have_crm"
            boolean r38 = r3.getBoolean(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "jmbg_must"
            int r39 = r3.getInt(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "valid_jmbg"
            java.lang.String r40 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "value_jmbg"
            java.lang.String r41 = r3.getString(r0)     // Catch:{ Exception -> 0x037c }
            java.lang.String r42 = r3.getString(r15)     // Catch:{ Exception -> 0x037c }
            r25 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ Exception -> 0x037c }
            r1.userInfo = r2     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = "monthly_card"
            org.json.JSONArray r0 = r3.getJSONArray(r0)     // Catch:{ Exception -> 0x02a6 }
            r2 = 0
            r4 = 0
        L_0x0184:
            int r5 = r0.length()     // Catch:{ Exception -> 0x029d }
            if (r2 >= r5) goto L_0x029d
            java.lang.Object r5 = r0.get(r2)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ Exception -> 0x029d }
            r1.monthlyCardJson = r5     // Catch:{ Exception -> 0x029d }
            e2.c r6 = new e2.c     // Catch:{ Exception -> 0x029d }
            long r25 = r5.getLong(r14)     // Catch:{ Exception -> 0x029d }
            java.lang.Long r26 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            long r27 = r5.getLong(r13)     // Catch:{ Exception -> 0x029d }
            java.lang.Long r27 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            java.lang.String r28 = r5.getString(r12)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            java.lang.String r29 = r5.getString(r11)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            java.lang.String r30 = r5.getString(r10)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            java.lang.String r31 = r5.getString(r9)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            java.lang.String r32 = r5.getString(r7)     // Catch:{ Exception -> 0x029d }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029d }
            r8 = r24
            java.lang.String r33 = r5.getString(r8)     // Catch:{ Exception -> 0x0296 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0296 }
            r19 = r0
            r0 = r23
            java.lang.String r34 = r5.getString(r0)     // Catch:{ Exception -> 0x0294 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0294 }
            r23 = r0
            r0 = r22
            java.lang.String r35 = r5.getString(r0)     // Catch:{ Exception -> 0x0291 }
            org.json.JSONObject r5 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0291 }
            r22 = r0
            r0 = r21
            java.lang.String r36 = r5.getString(r0)     // Catch:{ Exception -> 0x028e }
            int r5 = r1.monthlyCardType     // Catch:{ Exception -> 0x028e }
            r21 = r0
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0296 }
            r24 = r7
            r7 = r20
            int r38 = r0.getInt(r7)     // Catch:{ Exception -> 0x028b }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x028b }
            r20 = r7
            r7 = r17
            java.lang.String r39 = r0.getString(r7)     // Catch:{ Exception -> 0x0288 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0288 }
            r17 = r7
            java.lang.String r7 = "sell_type"
            int r40 = r0.getInt(r7)     // Catch:{ Exception -> 0x0298 }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x0298 }
            r7 = r18
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x0298 }
            r18 = r9
            java.lang.String r9 = "date_start"
            java.lang.String r41 = r0.getString(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x029a }
            java.lang.String r9 = "date_end"
            java.lang.String r42 = r0.getString(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x029a }
            java.lang.String r9 = "date_from"
            java.lang.String r43 = r0.getString(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x029a }
            java.lang.String r9 = "date_to"
            java.lang.String r44 = r0.getString(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            java.lang.String r9 = "valid_button"
            org.json.JSONObject r45 = r0.getJSONObject(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            java.lang.String r9 = "datefrom_init"
            java.lang.String r46 = r0.getString(r9)     // Catch:{ Exception -> 0x029a }
            org.json.JSONObject r0 = r1.monthlyCardJson     // Catch:{ Exception -> 0x029a }
            r9 = r16
            java.lang.String r47 = r0.getString(r9)     // Catch:{ Exception -> 0x02af }
            java.lang.String r0 = "crm_accounts_name"
            java.lang.String r48 = r3.getString(r0)     // Catch:{ Exception -> 0x02af }
            java.lang.String r49 = r3.getString(r15)     // Catch:{ Exception -> 0x02af }
            r25 = r6
            r37 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ Exception -> 0x02af }
            r1.niCard = r6     // Catch:{ Exception -> 0x02af }
            java.util.Map<java.lang.Integer, e2.c> r0 = r1.niCardMap     // Catch:{ Exception -> 0x02af }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x02af }
            e2.c r6 = r1.niCard     // Catch:{ Exception -> 0x02af }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x02af }
            int r4 = r4 + 1
            int r2 = r2 + 1
            r16 = r9
            r9 = r18
            r0 = r19
            r18 = r7
            r7 = r24
            r24 = r8
            goto L_0x0184
        L_0x0288:
            r17 = r7
            goto L_0x0298
        L_0x028b:
            r20 = r7
            goto L_0x0298
        L_0x028e:
            r21 = r0
            goto L_0x0296
        L_0x0291:
            r22 = r0
            goto L_0x0296
        L_0x0294:
            r23 = r0
        L_0x0296:
            r24 = r7
        L_0x0298:
            r18 = r9
        L_0x029a:
            r9 = r16
            goto L_0x02af
        L_0x029d:
            r18 = r9
            r9 = r16
            r8 = r24
            r24 = r7
            goto L_0x02af
        L_0x02a6:
            r18 = r9
            r9 = r16
            r8 = r24
            r24 = r7
            r4 = 0
        L_0x02af:
            java.lang.String r0 = "electronic_card"
            org.json.JSONArray r0 = r3.getJSONArray(r0)     // Catch:{ Exception -> 0x0364 }
            r2 = 0
        L_0x02b6:
            int r3 = r0.length()     // Catch:{ Exception -> 0x0364 }
            if (r2 >= r3) goto L_0x0364
            java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ Exception -> 0x0364 }
            r1.eWalletJson = r3     // Catch:{ Exception -> 0x0364 }
            e2.c r5 = new e2.c     // Catch:{ Exception -> 0x0364 }
            long r6 = r3.getLong(r14)     // Catch:{ Exception -> 0x0364 }
            java.lang.Long r26 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            long r6 = r3.getLong(r13)     // Catch:{ Exception -> 0x0364 }
            java.lang.Long r27 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            java.lang.String r28 = r3.getString(r12)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            java.lang.String r29 = r3.getString(r11)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            java.lang.String r30 = r3.getString(r10)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            java.lang.String r31 = r3.getString(r8)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r6 = r18
            java.lang.String r32 = r3.getString(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r7 = r24
            java.lang.String r33 = r3.getString(r7)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r15 = r23
            java.lang.String r34 = r3.getString(r15)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r3 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r16 = r0
            r0 = r22
            java.lang.String r35 = r3.getString(r0)     // Catch:{ Exception -> 0x0364 }
            int r3 = r1.eWalletCardType     // Catch:{ Exception -> 0x0364 }
            r22 = r0
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r18 = r6
            r6 = r21
            java.lang.String r37 = r0.getString(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r21 = r6
            r6 = r20
            int r38 = r0.getInt(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r20 = r6
            java.lang.String r6 = "card_user_sn"
            int r39 = r0.getInt(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            r6 = r17
            java.lang.String r40 = r0.getString(r6)     // Catch:{ Exception -> 0x0364 }
            org.json.JSONObject r0 = r1.eWalletJson     // Catch:{ Exception -> 0x0364 }
            java.lang.String r41 = r0.getString(r9)     // Catch:{ Exception -> 0x0364 }
            r25 = r5
            r36 = r3
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0364 }
            r1.niCard = r5     // Catch:{ Exception -> 0x0364 }
            java.util.Map<java.lang.Integer, e2.c> r0 = r1.niCardMap     // Catch:{ Exception -> 0x0364 }
            int r3 = r2 + r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0364 }
            e2.c r5 = r1.niCard     // Catch:{ Exception -> 0x0364 }
            r0.put(r3, r5)     // Catch:{ Exception -> 0x0364 }
            int r2 = r2 + 1
            r17 = r6
            r24 = r7
            r23 = r15
            r0 = r16
            goto L_0x02b6
        L_0x0364:
            r0 = 1
            r1.result = r0     // Catch:{ Exception -> 0x037c }
            goto L_0x0386
        L_0x0368:
            r2 = 0
            r1.result = r2     // Catch:{ Exception -> 0x037c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x037c }
            r2 = r19
            r0.<init>(r2)     // Catch:{ Exception -> 0x037c }
            r0.append(r3)     // Catch:{ Exception -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x037c }
            r1.errorMsg = r0     // Catch:{ Exception -> 0x037c }
            goto L_0x0386
        L_0x037c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r1.errorMsg = r0
            r2 = 0
            r1.result = r2
        L_0x0386:
            e2.e r0 = r1.userInfo
            buslogic.app.api.apis.NiCardExistingCardsApi$1 r2 = new buslogic.app.api.apis.NiCardExistingCardsApi$1
            r2.<init>(r0)
            r3 = r51
            r3.post(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.NiCardExistingCardsApi.lambda$callApiExistingNiCard$0(android.os.Handler):void");
    }

    public void callApiExistingNiCard() {
        Executors.newSingleThreadExecutor().execute(new f0(12, this, new Handler(Looper.getMainLooper())));
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public void setCallback(@q0 SetNiCard setNiCard) {
        this.mCallback = setNiCard;
    }
}
