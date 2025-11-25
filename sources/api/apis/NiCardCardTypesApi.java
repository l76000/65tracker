package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import e.q0;
import e2.d;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NiCardCardTypesApi {
    protected final int REQUEST_TIMEOUT = 5000;
    protected final int RESPONSE_TIMEOUT = 7000;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    String errorMsg = null;
    /* access modifiers changed from: private */
    public SetNiCardType mCallback;
    /* access modifiers changed from: private */
    public d niCardType;
    /* access modifiers changed from: private */
    public ArrayList<d> niCardTypeArrayList;
    boolean result = false;

    public interface SetNiCardType {
        void set(ArrayList<d> arrayList);
    }

    public NiCardCardTypesApi(String str, String str2) {
        this.companyApiKey = str;
        this.companyUrl = str2;
    }

    public void callApiNiCardType() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|7|8|9|(1:11)(4:12|(2:15|13)|22|16)) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x009e */
            /* JADX WARNING: Removed duplicated region for block: B:11:0x00a4 A[Catch:{ Exception -> 0x0119 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x00b3 A[Catch:{ Exception -> 0x0119 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                    r0 = 0
                    org.apache.http.params.BasicHttpParams r1 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0119 }
                    r1.<init>()     // Catch:{ Exception -> 0x0119 }
                    r2 = 5000(0x1388, float:7.006E-42)
                    org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r1, r2)     // Catch:{ Exception -> 0x0119 }
                    r2 = 7000(0x1b58, float:9.809E-42)
                    org.apache.http.params.HttpConnectionParams.setSoTimeout(r1, r2)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.impl.client.DefaultHttpClient r1 = a2.c.a(r1)     // Catch:{ Exception -> 0x0119 }
                    java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0119 }
                    r3 = 1
                    r2.<init>(r3)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.message.BasicNameValuePair r4 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r5 = "action"
                    java.lang.String r6 = "get_card_type_info"
                    r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0119 }
                    r2.add(r4)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.message.BasicNameValuePair r4 = new org.apache.http.message.BasicNameValuePair     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r5 = "ibfm"
                    java.lang.String r6 = "TM00000"
                    r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0119 }
                    r2.add(r4)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r4 = "/publicapi/v1/rest_options/android_add_or_connect_card.php"
                    java.net.URI r5 = new java.net.URI     // Catch:{ Exception -> 0x0119 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0119 }
                    r6.<init>()     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r7 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = r7.companyUrl     // Catch:{ Exception -> 0x0119 }
                    r6.append(r7)     // Catch:{ Exception -> 0x0119 }
                    r6.append(r4)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x0119 }
                    r5.<init>(r4)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.client.methods.HttpPost r4 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0119 }
                    r4.<init>()     // Catch:{ Exception -> 0x0119 }
                    r4.setURI(r5)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.client.entity.UrlEncodedFormEntity r5 = new org.apache.http.client.entity.UrlEncodedFormEntity     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r6 = "UTF-8"
                    r5.<init>(r2, r6)     // Catch:{ Exception -> 0x0119 }
                    r4.setEntity(r5)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r2 = "X-Api-Authentication"
                    buslogic.app.api.apis.NiCardCardTypesApi r5 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r5 = r5.companyApiKey     // Catch:{ Exception -> 0x0119 }
                    r4.setHeader(r2, r5)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.HttpResponse r1 = r1.execute(r4)     // Catch:{ Exception -> 0x0119 }
                    org.apache.http.StatusLine r2 = r1.getStatusLine()     // Catch:{ Exception -> 0x0119 }
                    int r2 = r2.getStatusCode()     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r4 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0119 }
                    r5.<init>()     // Catch:{ Exception -> 0x0119 }
                    java.util.ArrayList unused = r4.niCardTypeArrayList = r5     // Catch:{ Exception -> 0x0119 }
                    r4 = 200(0xc8, float:2.8E-43)
                    if (r2 != r4) goto L_0x0114
                    org.apache.http.HttpEntity r1 = r1.getEntity()     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r1 = org.apache.http.util.EntityUtils.toString(r1)     // Catch:{ Exception -> 0x0119 }
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0119 }
                    r2.<init>(r1)     // Catch:{ Exception -> 0x0119 }
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r4 = "success"
                    boolean r4 = r2.getBoolean(r4)     // Catch:{ Exception -> 0x009e }
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x009e }
                L_0x009e:
                    boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x0119 }
                    if (r1 != 0) goto L_0x00b3
                    buslogic.app.api.apis.NiCardCardTypesApi r1 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r3 = "msg"
                    java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x0119 }
                    r1.errorMsg = r2     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r1 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    r1.result = r0     // Catch:{ Exception -> 0x0119 }
                    goto L_0x0121
                L_0x00b3:
                    java.lang.String r1 = "arr"
                    org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch:{ Exception -> 0x0119 }
                    r2 = r0
                L_0x00ba:
                    int r4 = r1.length()     // Catch:{ Exception -> 0x0119 }
                    if (r2 >= r4) goto L_0x010f
                    java.lang.Object r4 = r1.get(r2)     // Catch:{ Exception -> 0x0119 }
                    org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r5 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    e2.d r6 = new e2.d     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "id"
                    r4.getInt(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "description"
                    r4.getString(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "card_type"
                    r4.getInt(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "validity_period"
                    r4.getInt(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "changed_by"
                    r4.getString(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "date_time"
                    r4.getString(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "validity_fixed_date_to"
                    r4.getString(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "card_serial_from"
                    r4.getLong(r7)     // Catch:{ Exception -> 0x0119 }
                    java.lang.String r7 = "card_serial_to"
                    r4.getLong(r7)     // Catch:{ Exception -> 0x0119 }
                    r6.<init>()     // Catch:{ Exception -> 0x0119 }
                    e2.d unused = r5.niCardType = r6     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r4 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    java.util.ArrayList r4 = r4.niCardTypeArrayList     // Catch:{ Exception -> 0x0119 }
                    buslogic.app.api.apis.NiCardCardTypesApi r5 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    e2.d r5 = r5.niCardType     // Catch:{ Exception -> 0x0119 }
                    r4.add(r2, r5)     // Catch:{ Exception -> 0x0119 }
                    int r2 = r2 + 1
                    goto L_0x00ba
                L_0x010f:
                    buslogic.app.api.apis.NiCardCardTypesApi r1 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    r1.result = r3     // Catch:{ Exception -> 0x0119 }
                    goto L_0x0121
                L_0x0114:
                    buslogic.app.api.apis.NiCardCardTypesApi r1 = buslogic.app.api.apis.NiCardCardTypesApi.this     // Catch:{ Exception -> 0x0119 }
                    r1.result = r0     // Catch:{ Exception -> 0x0119 }
                    goto L_0x0121
                L_0x0119:
                    r1 = move-exception
                    r1.getMessage()
                    buslogic.app.api.apis.NiCardCardTypesApi r1 = buslogic.app.api.apis.NiCardCardTypesApi.this
                    r1.result = r0
                L_0x0121:
                    android.os.Handler r0 = r1
                    buslogic.app.api.apis.NiCardCardTypesApi$1$1 r1 = new buslogic.app.api.apis.NiCardCardTypesApi$1$1
                    r1.<init>()
                    r0.post(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: buslogic.app.api.apis.NiCardCardTypesApi.AnonymousClass1.run():void");
            }
        });
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public void setCallback(@q0 SetNiCardType setNiCardType) {
        this.mCallback = setNiCardType;
    }
}
