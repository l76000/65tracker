package buslogic.app.api.apis;

import androidx.constraintlayout.helper.widget.a;
import e2.b;
import org.json.JSONObject;

public class LoginByGoogleOrFacebookApi {
    protected final int REQUEST_TIMEOUT = 30000;
    protected final int RESPONSE_TIMEOUT = 50000;
    private final String companyApiKey = "1688dc355af72ef09287";
    private final String companyUrl = "https://online.bgnaplata.rs";
    private final String email;
    private String errorMsg = null;
    JSONObject jsonObject = new JSONObject();
    b loggedInUser;
    boolean result;
    private final String sessionId;

    public LoginByGoogleOrFacebookApi(String str, String str2) {
        this.email = str;
        this.sessionId = str2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:13|14|15|16|17|18|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0127 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callApi() {
        /*
            r35 = this;
            r0 = r35
            java.lang.String r1 = "crm_contacts_type"
            java.lang.String r2 = "jmbg"
            java.lang.String r3 = "phone_number"
            java.lang.String r4 = "last_name"
            java.lang.String r5 = "first_name"
            java.lang.String r6 = "real_name"
            java.lang.String r7 = "id"
            java.lang.String r8 = "email"
            java.lang.String r9 = ""
            r10 = 0
            org.apache.http.params.BasicHttpParams r11 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0167 }
            r11.<init>()     // Catch:{ Exception -> 0x0167 }
            r12 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r11, r12)     // Catch:{ Exception -> 0x0167 }
            r12 = 50000(0xc350, float:7.0065E-41)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r11, r12)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.impl.client.DefaultHttpClient r11 = a2.c.a(r11)     // Catch:{ Exception -> 0x0167 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0167 }
            r13 = 1
            r12.<init>(r13)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.message.BasicNameValuePair r14 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0167 }
            java.lang.String r15 = "action"
            java.lang.String r13 = "login_via_google"
            r14.<init>(r15, r13)     // Catch:{ Exception -> 0x0167 }
            r12.add(r14)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.message.BasicNameValuePair r13 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0167 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0167 }
            r14.<init>(r9)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r15 = r0.email     // Catch:{ Exception -> 0x0167 }
            r14.append(r15)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0167 }
            r13.<init>(r8, r14)     // Catch:{ Exception -> 0x0167 }
            r12.add(r13)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.message.BasicNameValuePair r13 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0167 }
            java.lang.String r14 = "ibfm"
            java.lang.String r15 = "TM00000"
            r13.<init>(r14, r15)     // Catch:{ Exception -> 0x0167 }
            r12.add(r13)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.message.BasicNameValuePair r13 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0167 }
            java.lang.String r14 = "session_id"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0167 }
            r15.<init>(r9)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = r0.sessionId     // Catch:{ Exception -> 0x0167 }
            r15.append(r9)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = r15.toString()     // Catch:{ Exception -> 0x0167 }
            r13.<init>(r14, r9)     // Catch:{ Exception -> 0x0167 }
            r12.add(r13)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = "/publicapi/v1/rest_options/android_login.php"
            java.net.URI r13 = new java.net.URI     // Catch:{ Exception -> 0x0167 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0167 }
            r14.<init>()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r15 = r0.companyUrl     // Catch:{ Exception -> 0x0167 }
            r14.append(r15)     // Catch:{ Exception -> 0x0167 }
            r14.append(r9)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x0167 }
            r13.<init>(r9)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.client.methods.HttpPost r9 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0167 }
            r9.<init>()     // Catch:{ Exception -> 0x0167 }
            r9.setURI(r13)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.client.entity.UrlEncodedFormEntity r13 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0167 }
            java.lang.String r14 = "UTF-8"
            r13.<init>(r12, r14)     // Catch:{ Exception -> 0x0167 }
            r9.setEntity(r13)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r12 = "X-Api-Authentication"
            java.lang.String r13 = r0.companyApiKey     // Catch:{ Exception -> 0x0167 }
            r9.setHeader(r12, r13)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.HttpResponse r9 = r11.execute(r9)     // Catch:{ Exception -> 0x0167 }
            org.apache.http.StatusLine r11 = r9.getStatusLine()     // Catch:{ Exception -> 0x0167 }
            int r11 = r11.getStatusCode()     // Catch:{ Exception -> 0x0167 }
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 != r12) goto L_0x0164
            org.apache.http.HttpEntity r9 = r9.getEntity()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = org.apache.http.util.EntityUtils.toString(r9)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x0167 }
            r11.<init>(r9)     // Catch:{ Exception -> 0x0167 }
            r0.jsonObject = r11     // Catch:{ Exception -> 0x0167 }
            java.lang.String r9 = "success"
            boolean r9 = r11.getBoolean(r9)     // Catch:{ Exception -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
            r9 = 1
        L_0x00cd:
            if (r9 != 0) goto L_0x00dd
            org.json.JSONObject r1 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r2 = "msg"
            java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0167 }
            r0.errorMsg = r1     // Catch:{ Exception -> 0x0167 }
            r0.result = r10     // Catch:{ Exception -> 0x0167 }
            goto L_0x0169
        L_0x00dd:
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "arr"
            org.json.JSONObject r9 = r9.getJSONObject(r11)     // Catch:{ Exception -> 0x0167 }
            r0.jsonObject = r9     // Catch:{ Exception -> 0x0167 }
            e2.b r11 = new e2.b     // Catch:{ Exception -> 0x0127 }
            int r17 = r9.getInt(r7)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r18 = r9.getString(r6)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r12 = "user_address"
            java.lang.String r19 = r9.getString(r12)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r20 = r9.getString(r5)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r21 = r9.getString(r4)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r22 = r9.getString(r8)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r23 = r9.getString(r3)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r24 = r9.getString(r2)     // Catch:{ Exception -> 0x0127 }
            org.json.JSONObject r9 = r0.jsonObject     // Catch:{ Exception -> 0x0127 }
            java.lang.String r25 = r9.getString(r1)     // Catch:{ Exception -> 0x0127 }
            r16 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0127 }
            r0.loggedInUser = r11     // Catch:{ Exception -> 0x0127 }
            goto L_0x0160
        L_0x0127:
            e2.b r9 = new e2.b     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r11 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            int r27 = r11.getInt(r7)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r7 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r28 = r7.getString(r6)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r6 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r29 = r6.getString(r5)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r5 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r30 = r5.getString(r4)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r4 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r31 = r4.getString(r8)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r4 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r32 = r4.getString(r3)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r3 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r33 = r3.getString(r2)     // Catch:{ Exception -> 0x0167 }
            org.json.JSONObject r2 = r0.jsonObject     // Catch:{ Exception -> 0x0167 }
            java.lang.String r34 = r2.getString(r1)     // Catch:{ Exception -> 0x0167 }
            r26 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x0167 }
            r0.loggedInUser = r9     // Catch:{ Exception -> 0x0167 }
        L_0x0160:
            r1 = 1
            r0.result = r1     // Catch:{ Exception -> 0x0167 }
            goto L_0x0169
        L_0x0164:
            r0.result = r10     // Catch:{ Exception -> 0x0167 }
            goto L_0x0169
        L_0x0167:
            r0.result = r10
        L_0x0169:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.LoginByGoogleOrFacebookApi.callApi():void");
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void getLogInUser() {
        Thread thread = new Thread(new a(3, this));
        thread.start();
        thread.join();
    }

    public boolean getPass() {
        return this.result;
    }

    public b getResponse() {
        return this.loggedInUser;
    }
}
