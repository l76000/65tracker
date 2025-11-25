package buslogic.app.api.apis;

import androidx.constraintlayout.helper.widget.a;
import e2.b;
import org.json.JSONObject;

public class LogInApi {
    protected final int REQUEST_TIMEOUT = 10000;
    protected final int RESPONSE_TIMEOUT = 30000;
    private final String companyApiKey;
    private final String companyUrl;
    private String errMsg;
    private final String gPassword;
    private final String gUsername;
    JSONObject jsonObject = new JSONObject();
    b loggedInUser;
    private boolean result;
    private final String sessionId;

    public LogInApi(String str, String str2, String str3) {
        this.gUsername = str;
        this.gPassword = str2;
        this.sessionId = str3;
        this.companyApiKey = "1688dc355af72ef09287";
        this.companyUrl = "https://online.bgnaplata.rs";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0133 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callApi() {
        /*
            r35 = this;
            r0 = r35
            java.lang.String r1 = "crm_contacts_type"
            java.lang.String r2 = "jmbg"
            java.lang.String r3 = "phone_number"
            java.lang.String r4 = "email"
            java.lang.String r5 = "last_name"
            java.lang.String r6 = "first_name"
            java.lang.String r7 = "real_name"
            java.lang.String r8 = "id"
            java.lang.String r9 = ""
            org.apache.http.params.BasicHttpParams r11 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0174 }
            r11.<init>()     // Catch:{ Exception -> 0x0174 }
            r12 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r11, r12)     // Catch:{ Exception -> 0x0174 }
            r12 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r11, r12)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.impl.client.DefaultHttpClient r11 = a2.c.a(r11)     // Catch:{ Exception -> 0x0174 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0174 }
            r13 = 1
            r12.<init>(r13)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.message.BasicNameValuePair r14 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0174 }
            java.lang.String r15 = "action"
            java.lang.String r13 = "login"
            r14.<init>(r15, r13)     // Catch:{ Exception -> 0x0174 }
            r12.add(r14)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.message.BasicNameValuePair r13 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0174 }
            java.lang.String r14 = "username"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r15.<init>(r9)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r10 = r0.gUsername     // Catch:{ Exception -> 0x0174 }
            r15.append(r10)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r10 = r15.toString()     // Catch:{ Exception -> 0x0174 }
            r13.<init>(r14, r10)     // Catch:{ Exception -> 0x0174 }
            r12.add(r13)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.message.BasicNameValuePair r10 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0174 }
            java.lang.String r13 = "password"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r14.<init>(r9)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r15 = r0.gPassword     // Catch:{ Exception -> 0x0174 }
            r14.append(r15)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0174 }
            r10.<init>(r13, r14)     // Catch:{ Exception -> 0x0174 }
            r12.add(r10)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.message.BasicNameValuePair r10 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0174 }
            java.lang.String r13 = "ibfm"
            java.lang.String r14 = "TM00000"
            r10.<init>(r13, r14)     // Catch:{ Exception -> 0x0174 }
            r12.add(r10)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.message.BasicNameValuePair r10 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0174 }
            java.lang.String r13 = "session_id"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r14.<init>(r9)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = r0.sessionId     // Catch:{ Exception -> 0x0174 }
            r14.append(r9)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = r14.toString()     // Catch:{ Exception -> 0x0174 }
            r10.<init>(r13, r9)     // Catch:{ Exception -> 0x0174 }
            r12.add(r10)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = "/publicapi/v1/rest_options/android_login.php"
            java.net.URI r10 = new java.net.URI     // Catch:{ Exception -> 0x0174 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0174 }
            r13.<init>()     // Catch:{ Exception -> 0x0174 }
            java.lang.String r14 = r0.companyUrl     // Catch:{ Exception -> 0x0174 }
            r13.append(r14)     // Catch:{ Exception -> 0x0174 }
            r13.append(r9)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = r13.toString()     // Catch:{ Exception -> 0x0174 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.client.methods.HttpPost r9 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0174 }
            r9.<init>()     // Catch:{ Exception -> 0x0174 }
            r9.setURI(r10)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.client.entity.UrlEncodedFormEntity r10 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0174 }
            java.lang.String r13 = "UTF-8"
            r10.<init>(r12, r13)     // Catch:{ Exception -> 0x0174 }
            r9.setEntity(r10)     // Catch:{ Exception -> 0x0174 }
            java.lang.String r10 = "X-Api-Authentication"
            java.lang.String r12 = r0.companyApiKey     // Catch:{ Exception -> 0x0174 }
            r9.setHeader(r10, r12)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.HttpResponse r9 = r11.execute(r9)     // Catch:{ Exception -> 0x0174 }
            org.apache.http.StatusLine r10 = r9.getStatusLine()     // Catch:{ Exception -> 0x0174 }
            int r10 = r10.getStatusCode()     // Catch:{ Exception -> 0x0174 }
            r11 = 200(0xc8, float:2.8E-43)
            if (r10 != r11) goto L_0x0170
            org.apache.http.HttpEntity r9 = r9.getEntity()     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = org.apache.http.util.EntityUtils.toString(r9)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ Exception -> 0x0174 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0174 }
            r0.jsonObject = r10     // Catch:{ Exception -> 0x0174 }
            java.lang.String r9 = "user_allowed"
            int r9 = r10.getInt(r9)     // Catch:{ Exception -> 0x0174 }
            if (r9 != 0) goto L_0x00f1
            r9 = 0
            r0.result = r9     // Catch:{ Exception -> 0x00ee }
            java.lang.String r1 = "email not verified"
            r0.errMsg = r1     // Catch:{ Exception -> 0x0174 }
            goto L_0x0177
        L_0x00ee:
            r1 = r9
            goto L_0x0175
        L_0x00f1:
            e2.b r9 = new e2.b     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            int r17 = r10.getInt(r8)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r18 = r10.getString(r7)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r11 = "user_address"
            java.lang.String r19 = r10.getString(r11)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r20 = r10.getString(r6)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r21 = r10.getString(r5)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r22 = r10.getString(r4)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r23 = r10.getString(r3)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r24 = r10.getString(r2)     // Catch:{ Exception -> 0x0133 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0133 }
            java.lang.String r25 = r10.getString(r1)     // Catch:{ Exception -> 0x0133 }
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0133 }
            r0.loggedInUser = r9     // Catch:{ Exception -> 0x0133 }
            goto L_0x016c
        L_0x0133:
            e2.b r9 = new e2.b     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r10 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            int r27 = r10.getInt(r8)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r8 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r28 = r8.getString(r7)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r7 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r29 = r7.getString(r6)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r6 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r30 = r6.getString(r5)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r5 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r31 = r5.getString(r4)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r4 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r32 = r4.getString(r3)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r3 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r33 = r3.getString(r2)     // Catch:{ Exception -> 0x0174 }
            org.json.JSONObject r2 = r0.jsonObject     // Catch:{ Exception -> 0x0174 }
            java.lang.String r34 = r2.getString(r1)     // Catch:{ Exception -> 0x0174 }
            r26 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x0174 }
            r0.loggedInUser = r9     // Catch:{ Exception -> 0x0174 }
        L_0x016c:
            r1 = 1
            r0.result = r1     // Catch:{ Exception -> 0x0174 }
            goto L_0x0177
        L_0x0170:
            r1 = 0
            r0.result = r1     // Catch:{ Exception -> 0x0175 }
            goto L_0x0177
        L_0x0174:
            r1 = 0
        L_0x0175:
            r0.result = r1
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.LogInApi.callApi():void");
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void getLogInUser() {
        Thread thread = new Thread(new a(2, this));
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
