package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import e.q0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VerifyEmailApi {
    protected final int REQUEST_TIMEOUT = 5000;
    protected final int RESPONSE_TIMEOUT = 9000;
    /* access modifiers changed from: private */
    public final String companyApiKey = "1688dc355af72ef09287";
    /* access modifiers changed from: private */
    public final String companyUrl = "https://online.bgnaplata.rs";
    /* access modifiers changed from: private */
    public String email;
    /* access modifiers changed from: private */
    public String errorMsg = null;
    /* access modifiers changed from: private */
    public SetEmailVerified mCallback;
    boolean result;
    /* access modifiers changed from: private */
    public final String sessionId;
    /* access modifiers changed from: private */
    public final String userName;

    public interface SetEmailVerified {
        void set(String str);
    }

    public VerifyEmailApi(String str, String str2) {
        this.userName = str;
        this.sessionId = str2;
    }

    public void sendEmailVerificationLink() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(1:11)(1:12)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00d0 */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x00d6 A[Catch:{ Exception -> 0x00ff }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x00db A[Catch:{ Exception -> 0x00ff }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = "status code "
                    java.lang.String r1 = ""
                    r2 = 0
                    org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x00ff }
                    r3.<init>()     // Catch:{ Exception -> 0x00ff }
                    r4 = 5000(0x1388, float:7.006E-42)
                    org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Exception -> 0x00ff }
                    r4 = 9000(0x2328, float:1.2612E-41)
                    org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.impl.client.DefaultHttpClient r3 = a2.c.a(r3)     // Catch:{ Exception -> 0x00ff }
                    java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ff }
                    r5 = 1
                    r4.<init>(r5)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r7 = "action"
                    java.lang.String r8 = "send_verification"
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x00ff }
                    r4.add(r6)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r7 = "username"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
                    r8.<init>(r1)     // Catch:{ Exception -> 0x00ff }
                    buslogic.app.api.apis.VerifyEmailApi r9 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r9 = r9.userName     // Catch:{ Exception -> 0x00ff }
                    r8.append(r9)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00ff }
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x00ff }
                    r4.add(r6)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r7 = "session_id"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
                    r8.<init>(r1)     // Catch:{ Exception -> 0x00ff }
                    buslogic.app.api.apis.VerifyEmailApi r1 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r1 = r1.sessionId     // Catch:{ Exception -> 0x00ff }
                    r8.append(r1)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x00ff }
                    r6.<init>(r7, r1)     // Catch:{ Exception -> 0x00ff }
                    r4.add(r6)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.message.BasicNameValuePair r1 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r6 = "ibfm"
                    java.lang.String r7 = "ST000000"
                    r1.<init>(r6, r7)     // Catch:{ Exception -> 0x00ff }
                    r4.add(r1)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r1 = "/api/api.php"
                    java.net.URI r6 = new java.net.URI     // Catch:{ Exception -> 0x00ff }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
                    r7.<init>()     // Catch:{ Exception -> 0x00ff }
                    buslogic.app.api.apis.VerifyEmailApi r8 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r8 = r8.companyUrl     // Catch:{ Exception -> 0x00ff }
                    r7.append(r8)     // Catch:{ Exception -> 0x00ff }
                    r7.append(r1)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x00ff }
                    r6.<init>(r1)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.client.methods.HttpPost r1 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x00ff }
                    r1.<init>()     // Catch:{ Exception -> 0x00ff }
                    r1.setURI(r6)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.client.entity.UrlEncodedFormEntity r6 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r7 = "UTF-8"
                    r6.<init>(r4, r7)     // Catch:{ Exception -> 0x00ff }
                    r1.setEntity(r6)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r4 = "X-Api-Authentication"
                    buslogic.app.api.apis.VerifyEmailApi r6 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r6 = r6.companyApiKey     // Catch:{ Exception -> 0x00ff }
                    r1.setHeader(r4, r6)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.HttpResponse r1 = r3.execute(r1)     // Catch:{ Exception -> 0x00ff }
                    org.apache.http.StatusLine r3 = r1.getStatusLine()     // Catch:{ Exception -> 0x00ff }
                    int r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x00ff }
                    r4 = 200(0xc8, float:2.8E-43)
                    if (r3 != r4) goto L_0x00eb
                    org.apache.http.HttpEntity r0 = r1.getEntity()     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r0 = org.apache.http.util.EntityUtils.toString(r0)     // Catch:{ Exception -> 0x00ff }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ff }
                    r1.<init>(r0)     // Catch:{ Exception -> 0x00ff }
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r3 = "success"
                    boolean r3 = r1.getBoolean(r3)     // Catch:{ Exception -> 0x00d0 }
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00d0 }
                L_0x00d0:
                    boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00ff }
                    if (r0 != 0) goto L_0x00db
                    buslogic.app.api.apis.VerifyEmailApi r0 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    r0.result = r2     // Catch:{ Exception -> 0x00ff }
                    goto L_0x0103
                L_0x00db:
                    buslogic.app.api.apis.VerifyEmailApi r0 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r3 = "email"
                    java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String unused = r0.email = r1     // Catch:{ Exception -> 0x00ff }
                    buslogic.app.api.apis.VerifyEmailApi r0 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    r0.result = r5     // Catch:{ Exception -> 0x00ff }
                    goto L_0x0103
                L_0x00eb:
                    buslogic.app.api.apis.VerifyEmailApi r1 = buslogic.app.api.apis.VerifyEmailApi.this     // Catch:{ Exception -> 0x00ff }
                    r1.result = r2     // Catch:{ Exception -> 0x00ff }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
                    r4.<init>(r0)     // Catch:{ Exception -> 0x00ff }
                    r4.append(r3)     // Catch:{ Exception -> 0x00ff }
                    java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x00ff }
                    java.lang.String unused = r1.errorMsg = r0     // Catch:{ Exception -> 0x00ff }
                    goto L_0x0103
                L_0x00ff:
                    buslogic.app.api.apis.VerifyEmailApi r0 = buslogic.app.api.apis.VerifyEmailApi.this
                    r0.result = r2
                L_0x0103:
                    android.os.Handler r0 = r1
                    buslogic.app.api.apis.VerifyEmailApi$1$1 r1 = new buslogic.app.api.apis.VerifyEmailApi$1$1
                    r1.<init>()
                    r0.post(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.VerifyEmailApi.AnonymousClass1.run():void");
            }
        });
    }

    public void setCallback(@q0 SetEmailVerified setEmailVerified) {
        this.mCallback = setEmailVerified;
    }
}
