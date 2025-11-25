package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import e.q0;
import e2.c;
import e2.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class EWalletAddCardAsyncApi {
    protected final int REQUEST_TIMEOUT = 30000;
    protected final int RESPONSE_TIMEOUT = 50000;
    /* access modifiers changed from: private */
    public Long card_num;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    /* access modifiers changed from: private */
    public c eWallet;
    /* access modifiers changed from: private */
    public JSONObject eWalletJson = new JSONObject();
    private JSONObject electric_card = new JSONObject();
    String errorMsg = null;
    /* access modifiers changed from: private */
    public SetNiCardText mCallback;
    /* access modifiers changed from: private */
    public c monthlyCard;
    /* access modifiers changed from: private */
    public JSONObject monthlyCardJson = new JSONObject();
    /* access modifiers changed from: private */
    public Map<Integer, c> niCardMap = new HashMap();
    boolean result;
    /* access modifiers changed from: private */
    public int userGroup;
    /* access modifiers changed from: private */
    public final int userId;
    /* access modifiers changed from: private */
    public e userInfo;

    public interface SetNiCardText {
        void set(c cVar);
    }

    public EWalletAddCardAsyncApi(String str, String str2, int i10, Long l10, int i11) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.userId = i10;
        this.card_num = l10;
        this.userGroup = i11;
    }

    public void addEWallet() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x01f6 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00f1 */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x00f7 A[Catch:{ Exception -> 0x020e }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0107 A[Catch:{ Exception -> 0x020e }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r27 = this;
                    r1 = r27
                    java.lang.String r0 = "serial_no"
                    java.lang.String r2 = "user_id"
                    java.lang.String r3 = "status code "
                    java.lang.String r4 = ""
                    r5 = 0
                    org.apache.http.params.BasicHttpParams r6 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x020e }
                    r6.<init>()     // Catch:{ Exception -> 0x020e }
                    r7 = 30000(0x7530, float:4.2039E-41)
                    org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r6, r7)     // Catch:{ Exception -> 0x020e }
                    r7 = 50000(0xc350, float:7.0065E-41)
                    org.apache.http.params.HttpConnectionParams.setSoTimeout(r6, r7)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.impl.client.DefaultHttpClient r6 = a2.c.a(r6)     // Catch:{ Exception -> 0x020e }
                    java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x020e }
                    r8 = 1
                    r7.<init>(r8)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.message.BasicNameValuePair r9 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x020e }
                    java.lang.String r10 = "action"
                    java.lang.String r11 = "connect_with_existed_electronic_card"
                    r9.<init>(r10, r11)     // Catch:{ Exception -> 0x020e }
                    r7.add(r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.message.BasicNameValuePair r9 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x020e }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
                    r10.<init>(r4)     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r11 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    int r11 = r11.userId     // Catch:{ Exception -> 0x020e }
                    r10.append(r11)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x020e }
                    r9.<init>(r2, r10)     // Catch:{ Exception -> 0x020e }
                    r7.add(r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.message.BasicNameValuePair r9 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x020e }
                    java.lang.String r10 = "card_num"
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
                    r11.<init>(r4)     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r12 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    java.lang.Long r12 = r12.card_num     // Catch:{ Exception -> 0x020e }
                    r11.append(r12)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x020e }
                    r9.<init>(r10, r11)     // Catch:{ Exception -> 0x020e }
                    r7.add(r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.message.BasicNameValuePair r9 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x020e }
                    java.lang.String r10 = "userGroup"
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
                    r11.<init>(r4)     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r4 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    int r4 = r4.userGroup     // Catch:{ Exception -> 0x020e }
                    r11.append(r4)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r4 = r11.toString()     // Catch:{ Exception -> 0x020e }
                    r9.<init>(r10, r4)     // Catch:{ Exception -> 0x020e }
                    r7.add(r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.message.BasicNameValuePair r4 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x020e }
                    java.lang.String r9 = "ibfm"
                    java.lang.String r10 = "TM00000"
                    r4.<init>(r9, r10)     // Catch:{ Exception -> 0x020e }
                    r7.add(r4)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r4 = "/publicapi/v1/rest_options/android_add_or_connect_card.php"
                    java.net.URI r9 = new java.net.URI     // Catch:{ Exception -> 0x020e }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
                    r10.<init>()     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r11 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    java.lang.String r11 = r11.companyUrl     // Catch:{ Exception -> 0x020e }
                    r10.append(r11)     // Catch:{ Exception -> 0x020e }
                    r10.append(r4)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x020e }
                    r9.<init>(r4)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.client.methods.HttpPost r4 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x020e }
                    r4.<init>()     // Catch:{ Exception -> 0x020e }
                    r4.setURI(r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.client.entity.UrlEncodedFormEntity r9 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x020e }
                    java.lang.String r10 = "UTF-8"
                    r9.<init>(r7, r10)     // Catch:{ Exception -> 0x020e }
                    r4.setEntity(r9)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r7 = "X-Api-Authentication"
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r9 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    java.lang.String r9 = r9.companyApiKey     // Catch:{ Exception -> 0x020e }
                    r4.setHeader(r7, r9)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.HttpResponse r4 = r6.execute(r4)     // Catch:{ Exception -> 0x020e }
                    org.apache.http.StatusLine r6 = r4.getStatusLine()     // Catch:{ Exception -> 0x020e }
                    int r6 = r6.getStatusCode()     // Catch:{ Exception -> 0x020e }
                    r7 = 200(0xc8, float:2.8E-43)
                    if (r6 != r7) goto L_0x01fb
                    org.apache.http.HttpEntity r3 = r4.getEntity()     // Catch:{ Exception -> 0x020e }
                    java.lang.String r3 = org.apache.http.util.EntityUtils.toString(r3)     // Catch:{ Exception -> 0x020e }
                    org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x020e }
                    r4.<init>(r3)     // Catch:{ Exception -> 0x020e }
                    java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x020e }
                    java.lang.String r6 = "success"
                    boolean r6 = r4.getBoolean(r6)     // Catch:{ Exception -> 0x00f1 }
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x00f1 }
                L_0x00f1:
                    boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x020e }
                    if (r3 != 0) goto L_0x0107
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r0 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "msg"
                    java.lang.String r2 = r4.getString(r2)     // Catch:{ Exception -> 0x020e }
                    r0.errorMsg = r2     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r0 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    r0.result = r5     // Catch:{ Exception -> 0x020e }
                    goto L_0x0219
                L_0x0107:
                    java.lang.String r3 = "arr"
                    org.json.JSONObject r3 = r4.getJSONObject(r3)     // Catch:{ Exception -> 0x020e }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r4 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    e2.e r6 = new e2.e     // Catch:{ Exception -> 0x020e }
                    long r9 = r3.getLong(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.Long r10 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "login"
                    java.lang.String r11 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "first_name"
                    java.lang.String r12 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "last_name"
                    java.lang.String r13 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "jmbg"
                    java.lang.String r14 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "address"
                    java.lang.String r15 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "email"
                    java.lang.String r16 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "id_card_sn"
                    java.lang.String r17 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "group_id"
                    int r18 = r3.getInt(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "crm_contacts_customer_id"
                    java.lang.String r19 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "monthly_card_user_sn"
                    java.lang.String r20 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "prepaid_card_user_sn"
                    java.lang.String r21 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "have_crm"
                    boolean r22 = r3.getBoolean(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "jmbg_must"
                    int r23 = r3.getInt(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "valid_jmbg"
                    java.lang.String r24 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "value_jmbg"
                    java.lang.String r25 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "crm_contacts_type"
                    java.lang.String r26 = r3.getString(r2)     // Catch:{ Exception -> 0x020e }
                    r9 = r6
                    r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x020e }
                    e2.e unused = r4.userInfo = r6     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = "monthly_card"
                    org.json.JSONArray r2 = r3.getJSONArray(r2)     // Catch:{ Exception -> 0x01ba }
                    r4 = r5
                    r6 = r4
                L_0x0188:
                    int r7 = r2.length()     // Catch:{ Exception -> 0x01bb }
                    if (r4 >= r7) goto L_0x01bb
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r7 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01bb }
                    java.lang.Object r9 = r2.get(r4)     // Catch:{ Exception -> 0x01bb }
                    org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch:{ Exception -> 0x01bb }
                    org.json.JSONObject unused = r7.monthlyCardJson = r9     // Catch:{ Exception -> 0x01bb }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r7 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01bb }
                    org.json.JSONObject r7 = r7.monthlyCardJson     // Catch:{ Exception -> 0x01bb }
                    r7.getLong(r0)     // Catch:{ Exception -> 0x01bb }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r7 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01bb }
                    java.util.Map r7 = r7.niCardMap     // Catch:{ Exception -> 0x01bb }
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x01bb }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r10 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01bb }
                    e2.c r10 = r10.monthlyCard     // Catch:{ Exception -> 0x01bb }
                    r7.put(r9, r10)     // Catch:{ Exception -> 0x01bb }
                    int r6 = r6 + 1
                    int r4 = r4 + 1
                    goto L_0x0188
                L_0x01ba:
                    r6 = r5
                L_0x01bb:
                    java.lang.String r2 = "electronic_card"
                    org.json.JSONArray r2 = r3.getJSONArray(r2)     // Catch:{ Exception -> 0x01f6 }
                    r3 = r5
                L_0x01c2:
                    int r4 = r2.length()     // Catch:{ Exception -> 0x01f6 }
                    if (r3 >= r4) goto L_0x01f6
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r4 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01f6 }
                    java.lang.Object r7 = r2.get(r3)     // Catch:{ Exception -> 0x01f6 }
                    org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ Exception -> 0x01f6 }
                    org.json.JSONObject unused = r4.eWalletJson = r7     // Catch:{ Exception -> 0x01f6 }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r4 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01f6 }
                    org.json.JSONObject r4 = r4.eWalletJson     // Catch:{ Exception -> 0x01f6 }
                    r4.getLong(r0)     // Catch:{ Exception -> 0x01f6 }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r4 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01f6 }
                    java.util.Map r4 = r4.niCardMap     // Catch:{ Exception -> 0x01f6 }
                    int r7 = r3 + r6
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01f6 }
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r9 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x01f6 }
                    e2.c r9 = r9.eWallet     // Catch:{ Exception -> 0x01f6 }
                    r4.put(r7, r9)     // Catch:{ Exception -> 0x01f6 }
                    int r6 = r6 + 1
                    int r3 = r3 + 1
                    goto L_0x01c2
                L_0x01f6:
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r0 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    r0.result = r8     // Catch:{ Exception -> 0x020e }
                    goto L_0x0219
                L_0x01fb:
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r0 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this     // Catch:{ Exception -> 0x020e }
                    r0.result = r5     // Catch:{ Exception -> 0x020e }
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020e }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x020e }
                    r2.append(r6)     // Catch:{ Exception -> 0x020e }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x020e }
                    r0.errorMsg = r2     // Catch:{ Exception -> 0x020e }
                    goto L_0x0219
                L_0x020e:
                    r0 = move-exception
                    buslogic.app.api.apis.EWalletAddCardAsyncApi r2 = buslogic.app.api.apis.EWalletAddCardAsyncApi.this
                    r2.result = r5
                    java.lang.String r0 = r0.getMessage()
                    r2.errorMsg = r0
                L_0x0219:
                    android.os.Handler r0 = r1
                    buslogic.app.api.apis.EWalletAddCardAsyncApi$1$1 r2 = new buslogic.app.api.apis.EWalletAddCardAsyncApi$1$1
                    r2.<init>()
                    r0.post(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.EWalletAddCardAsyncApi.AnonymousClass1.run():void");
            }
        });
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

    public void setCallback(@q0 SetNiCardText setNiCardText) {
        this.mCallback = setNiCardText;
    }
}
