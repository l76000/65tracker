package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import e.q0;
import e2.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EWalletStatusApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final int cardSn;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    /* access modifiers changed from: private */
    public a eWalletStatus;
    /* access modifiers changed from: private */
    public String errorMsg = null;
    /* access modifiers changed from: private */
    public SetNiCardText mCallback;
    boolean result;
    /* access modifiers changed from: private */
    public final String sessionId;

    public interface SetNiCardText {
        void set(a aVar);
    }

    public EWalletStatusApi(String str, String str2, int i10, String str3) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.cardSn = i10;
        this.sessionId = str3;
    }

    public void callApiEWalletStatus() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(1:11)(1:12)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x00d0 */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x00d6 A[Catch:{ Exception -> 0x0127 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x00e6 A[Catch:{ Exception -> 0x0127 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = "status code "
                    java.lang.String r1 = ""
                    r2 = 0
                    org.apache.http.params.BasicHttpParams r3 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0127 }
                    r3.<init>()     // Catch:{ Exception -> 0x0127 }
                    r4 = 3000(0xbb8, float:4.204E-42)
                    org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r3, r4)     // Catch:{ Exception -> 0x0127 }
                    r4 = 5000(0x1388, float:7.006E-42)
                    org.apache.http.params.HttpConnectionParams.setSoTimeout(r3, r4)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.impl.client.DefaultHttpClient r3 = a2.c.a(r3)     // Catch:{ Exception -> 0x0127 }
                    java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0127 }
                    r5 = 1
                    r4.<init>(r5)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = "action"
                    java.lang.String r8 = "get_electronic_wallet_status"
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0127 }
                    r4.add(r6)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = "card_sn"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
                    r8.<init>(r1)     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r9 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    int r9 = r9.cardSn     // Catch:{ Exception -> 0x0127 }
                    r8.append(r9)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0127 }
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0127 }
                    r4.add(r6)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = "ibfm"
                    java.lang.String r8 = "TM00000"
                    r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0127 }
                    r4.add(r6)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.message.BasicNameValuePair r6 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = "session_id"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
                    r8.<init>(r1)     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r1 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r1 = r1.sessionId     // Catch:{ Exception -> 0x0127 }
                    r8.append(r1)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r1 = r8.toString()     // Catch:{ Exception -> 0x0127 }
                    r6.<init>(r7, r1)     // Catch:{ Exception -> 0x0127 }
                    r4.add(r6)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r1 = "/publicapi/v1/rest_options/android_add_or_connect_card.php"
                    java.net.URI r6 = new java.net.URI     // Catch:{ Exception -> 0x0127 }
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
                    r7.<init>()     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r8 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r8 = r8.companyUrl     // Catch:{ Exception -> 0x0127 }
                    r7.append(r8)     // Catch:{ Exception -> 0x0127 }
                    r7.append(r1)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x0127 }
                    r6.<init>(r1)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.client.methods.HttpPost r1 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0127 }
                    r1.<init>()     // Catch:{ Exception -> 0x0127 }
                    r1.setURI(r6)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.client.entity.UrlEncodedFormEntity r6 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r7 = "UTF-8"
                    r6.<init>(r4, r7)     // Catch:{ Exception -> 0x0127 }
                    r1.setEntity(r6)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r4 = "X-Api-Authentication"
                    buslogic.app.api.apis.EWalletStatusApi r6 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r6 = r6.companyApiKey     // Catch:{ Exception -> 0x0127 }
                    r1.setHeader(r4, r6)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.HttpResponse r1 = r3.execute(r1)     // Catch:{ Exception -> 0x0127 }
                    org.apache.http.StatusLine r3 = r1.getStatusLine()     // Catch:{ Exception -> 0x0127 }
                    int r3 = r3.getStatusCode()     // Catch:{ Exception -> 0x0127 }
                    r4 = 200(0xc8, float:2.8E-43)
                    if (r3 != r4) goto L_0x0113
                    org.apache.http.HttpEntity r0 = r1.getEntity()     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r0 = org.apache.http.util.EntityUtils.toString(r0)     // Catch:{ Exception -> 0x0127 }
                    org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0127 }
                    r1.<init>(r0)     // Catch:{ Exception -> 0x0127 }
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r3 = "success"
                    boolean r3 = r1.getBoolean(r3)     // Catch:{ Exception -> 0x00d0 }
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x00d0 }
                L_0x00d0:
                    boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0127 }
                    if (r0 != 0) goto L_0x00e6
                    buslogic.app.api.apis.EWalletStatusApi r0 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r3 = "msg"
                    java.lang.String r1 = r1.getString(r3)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String unused = r0.errorMsg = r1     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r0 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    r0.result = r2     // Catch:{ Exception -> 0x0127 }
                    goto L_0x012b
                L_0x00e6:
                    java.lang.String r0 = "arr"
                    org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r1 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    e2.a r3 = new e2.a     // Catch:{ Exception -> 0x0127 }
                    int unused = r1.cardSn     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r4 = "log_datetime"
                    r0.getString(r4)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r4 = "Iznos_Pre_Transakcije"
                    r0.getDouble(r4)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r4 = "Iznos_Poslednje_Transakcije"
                    r0.getDouble(r4)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r4 = "Stanje"
                    double r6 = r0.getDouble(r4)     // Catch:{ Exception -> 0x0127 }
                    r3.<init>(r6)     // Catch:{ Exception -> 0x0127 }
                    e2.a unused = r1.eWalletStatus = r3     // Catch:{ Exception -> 0x0127 }
                    buslogic.app.api.apis.EWalletStatusApi r0 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    r0.result = r5     // Catch:{ Exception -> 0x0127 }
                    goto L_0x012b
                L_0x0113:
                    buslogic.app.api.apis.EWalletStatusApi r1 = buslogic.app.api.apis.EWalletStatusApi.this     // Catch:{ Exception -> 0x0127 }
                    r1.result = r2     // Catch:{ Exception -> 0x0127 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127 }
                    r4.<init>(r0)     // Catch:{ Exception -> 0x0127 }
                    r4.append(r3)     // Catch:{ Exception -> 0x0127 }
                    java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0127 }
                    java.lang.String unused = r1.errorMsg = r0     // Catch:{ Exception -> 0x0127 }
                    goto L_0x012b
                L_0x0127:
                    buslogic.app.api.apis.EWalletStatusApi r0 = buslogic.app.api.apis.EWalletStatusApi.this
                    r0.result = r2
                L_0x012b:
                    android.os.Handler r0 = r1
                    buslogic.app.api.apis.EWalletStatusApi$1$1 r1 = new buslogic.app.api.apis.EWalletStatusApi$1$1
                    r1.<init>()
                    r0.post(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.EWalletStatusApi.AnonymousClass1.run():void");
            }
        });
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public void setCallback(@q0 SetNiCardText setNiCardText) {
        this.mCallback = setNiCardText;
    }
}
