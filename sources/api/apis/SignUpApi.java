package buslogic.app.api.apis;

import androidx.constraintlayout.helper.widget.a;
import e2.b;
import org.json.JSONObject;

public class SignUpApi {
    protected final int REQUEST_TIMEOUT = 10000;
    protected final int RESPONSE_TIMEOUT = 30000;
    private final String companyApiKey = "1688dc355af72ef09287";
    private final String companyUrl;
    private String defaultLanguage;
    String errorMsg = null;
    private String gEmail;
    private String gLastName = "Plus";
    private String gName = "Beograd";
    JSONObject jsonObject = new JSONObject();
    b loggedInUser;
    boolean result;
    private String sessionId;

    public SignUpApi(String str, String str2, String str3, String str4, String str5) {
        if (!str.equals("")) {
            this.gName = str;
        }
        if (!str2.equals("")) {
            this.gLastName = str2;
        }
        this.gEmail = str3;
        this.companyUrl = "https://online.bgnaplata.rs";
        this.defaultLanguage = str4;
        this.sessionId = str5;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(2:11|17)(2:12|18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x012c */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0132 A[Catch:{ Exception -> 0x0179 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x013f A[Catch:{ Exception -> 0x0179 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callApi() {
        /*
            r15 = this;
            java.lang.String r0 = "email"
            java.lang.String r1 = ""
            r2 = 0
            org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0179 }
            r3.<init>()     // Catch:{ Exception -> 0x0179 }
            r4 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Exception -> 0x0179 }
            r4 = 30000(0x7530, float:4.2039E-41)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.impl.client.DefaultHttpClient r3 = a2.c.a(r3)     // Catch:{ Exception -> 0x0179 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0179 }
            r5 = 1
            r4.<init>(r5)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "action"
            java.lang.String r8 = "register"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "name"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = r15.gName     // Catch:{ Exception -> 0x0179 }
            r8.append(r9)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "lastName"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = r15.gLastName     // Catch:{ Exception -> 0x0179 }
            r8.append(r9)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r7.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r15.gEmail     // Catch:{ Exception -> 0x0179 }
            r7.append(r8)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r0, r7)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "companyUrl"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = r15.companyUrl     // Catch:{ Exception -> 0x0179 }
            r8.append(r9)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "lang"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r9 = r15.defaultLanguage     // Catch:{ Exception -> 0x0179 }
            r8.append(r9)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "ibfm"
            java.lang.String r8 = "TM00000"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "platform"
            java.lang.String r8 = "android"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "session_id"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r15.sessionId     // Catch:{ Exception -> 0x0179 }
            r8.append(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r7, r1)     // Catch:{ Exception -> 0x0179 }
            r4.add(r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = "/publicapi/v1/rest_options/android_login.php"
            java.net.URI r6 = new java.net.URI     // Catch:{ Exception -> 0x0179 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0179 }
            r7.<init>()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r8 = r15.companyUrl     // Catch:{ Exception -> 0x0179 }
            r7.append(r8)     // Catch:{ Exception -> 0x0179 }
            r7.append(r1)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0179 }
            r6.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.client.methods.HttpPost r1 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0179 }
            r1.<init>()     // Catch:{ Exception -> 0x0179 }
            r1.setURI(r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.client.entity.UrlEncodedFormEntity r6 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0179 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r4, r7)     // Catch:{ Exception -> 0x0179 }
            r1.setEntity(r6)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "X-Api-Authentication"
            java.lang.String r6 = r15.companyApiKey     // Catch:{ Exception -> 0x0179 }
            r1.setHeader(r4, r6)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.HttpResponse r1 = r3.execute(r1)     // Catch:{ Exception -> 0x0179 }
            org.apache.http.StatusLine r3 = r1.getStatusLine()     // Catch:{ Exception -> 0x0179 }
            int r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x0179 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0176
            org.apache.http.HttpEntity r1 = r1.getEntity()     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = org.apache.http.util.EntityUtils.toString(r1)     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0179 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0179 }
            r15.jsonObject = r3     // Catch:{ Exception -> 0x0179 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "success"
            boolean r3 = r3.getBoolean(r4)     // Catch:{ Exception -> 0x012c }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x012c }
        L_0x012c:
            boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0179 }
            if (r1 != 0) goto L_0x013f
            org.json.JSONObject r0 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r1 = "msg"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x0179 }
            r15.errorMsg = r0     // Catch:{ Exception -> 0x0179 }
            r15.result = r2     // Catch:{ Exception -> 0x0179 }
            goto L_0x0182
        L_0x013f:
            e2.b r1 = new e2.b     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "id"
            int r7 = r3.getInt(r4)     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "real_name"
            java.lang.String r8 = r3.getString(r4)     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "first_name"
            java.lang.String r9 = r3.getString(r4)     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r4 = "last_name"
            java.lang.String r10 = r3.getString(r4)     // Catch:{ Exception -> 0x0179 }
            org.json.JSONObject r3 = r15.jsonObject     // Catch:{ Exception -> 0x0179 }
            java.lang.String r11 = r3.getString(r0)     // Catch:{ Exception -> 0x0179 }
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0179 }
            r15.loggedInUser = r1     // Catch:{ Exception -> 0x0179 }
            r15.result = r5     // Catch:{ Exception -> 0x0179 }
            goto L_0x0182
        L_0x0176:
            r15.result = r2     // Catch:{ Exception -> 0x0179 }
            goto L_0x0182
        L_0x0179:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r15.errorMsg = r0
            r15.result = r2
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.SignUpApi.callApi():void");
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public void getRegisteredUser() {
        Thread thread = new Thread(new a(6, this));
        thread.start();
        thread.join();
    }

    public b getResponse() {
        return this.loggedInUser;
    }
}
