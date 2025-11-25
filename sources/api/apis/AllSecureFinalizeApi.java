package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.motion.widget.f0;
import buslogic.app.api.allsecure_tokenization.b;
import com.facebook.internal.p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import e.q0;
import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class AllSecureFinalizeApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 30000;
    /* access modifiers changed from: private */
    public String companyApiKey;
    /* access modifiers changed from: private */
    public String companyUrl;
    /* access modifiers changed from: private */
    public String gTransactionId;
    /* access modifiers changed from: private */
    public String mAmount;
    /* access modifiers changed from: private */
    public CallbackForUrlCallbackResponse mCallback;
    /* access modifiers changed from: private */
    public String mDefaultLanguage;
    /* access modifiers changed from: private */
    public String mEmail;
    /* access modifiers changed from: private */
    public String mFirstName;
    /* access modifiers changed from: private */
    public String mLastName;
    /* access modifiers changed from: private */
    public b mToken;
    private String sessionId;
    private String uReferenceUuid;

    public interface CallbackForUrlCallbackResponse {
        void set(JSONObject jSONObject);
    }

    public AllSecureFinalizeApi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mAmount = str3;
        this.mFirstName = str5;
        this.mLastName = str6;
        this.mEmail = str7;
        this.uReferenceUuid = str9;
        this.mDefaultLanguage = str8;
        this.gTransactionId = str4;
        this.sessionId = str10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callAllsecureFinalizeWithRemeberedCardApi$0(JSONObject jSONObject) {
        this.mCallback.set(jSONObject);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callAllsecureFinalizeWithRemeberedCardApi$1(Handler handler) {
        JSONObject jSONObject = new JSONObject();
        try {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
            DefaultHttpClient a10 = c.a(basicHttpParams);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair(p0.f13793a1, "finalize_transaction"));
            arrayList.add(new BasicNameValuePair("amount", "" + this.mAmount));
            arrayList.add(new BasicNameValuePair("first_name", "" + this.mFirstName));
            arrayList.add(new BasicNameValuePair("last_name", "" + this.mLastName));
            arrayList.add(new BasicNameValuePair("email", "" + this.mEmail));
            arrayList.add(new BasicNameValuePair("host", "" + this.companyUrl));
            arrayList.add(new BasicNameValuePair("reference_uuid", "" + this.uReferenceUuid));
            arrayList.add(new BasicNameValuePair("language", "" + this.mDefaultLanguage));
            arrayList.add(new BasicNameValuePair(FirebaseAnalytics.d.F, "" + this.gTransactionId));
            arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
            arrayList.add(new BasicNameValuePair("session_id", "" + this.sessionId));
            URI uri = new URI(this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
            HttpPost httpPost = new HttpPost();
            httpPost.setURI(uri);
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
            httpPost.setHeader("X-Api-Authentication", this.companyApiKey);
            HttpResponse execute = a10.execute(httpPost);
            if (execute.getStatusLine().getStatusCode() == 200) {
                jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        handler.post(new f0(9, this, jSONObject));
    }

    public void callAllsecureFinalizeApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "finalize_transaction"));
                    arrayList.add(new BasicNameValuePair("transaction_token", "" + AllSecureFinalizeApi.this.mToken.f9677a));
                    arrayList.add(new BasicNameValuePair("amount", "" + AllSecureFinalizeApi.this.mAmount));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + AllSecureFinalizeApi.this.mToken.f9678b));
                    arrayList.add(new BasicNameValuePair("card_type", "" + AllSecureFinalizeApi.this.mToken.f9679c));
                    arrayList.add(new BasicNameValuePair("expiration_month", "" + AllSecureFinalizeApi.this.mToken.f9680d));
                    arrayList.add(new BasicNameValuePair("expiration_year", "" + AllSecureFinalizeApi.this.mToken.f9681e));
                    arrayList.add(new BasicNameValuePair("first_name", "" + AllSecureFinalizeApi.this.mFirstName));
                    arrayList.add(new BasicNameValuePair("last_name", "" + AllSecureFinalizeApi.this.mLastName));
                    arrayList.add(new BasicNameValuePair("email", "" + AllSecureFinalizeApi.this.mEmail));
                    arrayList.add(new BasicNameValuePair("host", "" + AllSecureFinalizeApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("language", "" + AllSecureFinalizeApi.this.mDefaultLanguage));
                    arrayList.add(new BasicNameValuePair(FirebaseAnalytics.d.F, "" + AllSecureFinalizeApi.this.gTransactionId));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    URI uri = new URI(AllSecureFinalizeApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", AllSecureFinalizeApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        AllSecureFinalizeApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public void callAllsecureFinalizeWithRemeberedCardApi() {
        Executors.newSingleThreadExecutor().execute(new f0(8, this, new Handler(Looper.getMainLooper())));
    }

    public void setCallback(@q0 CallbackForUrlCallbackResponse callbackForUrlCallbackResponse) {
        this.mCallback = callbackForUrlCallbackResponse;
    }

    public AllSecureFinalizeApi(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, b bVar, String str9) {
        this.mToken = bVar;
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mAmount = str3;
        this.mFirstName = str5;
        this.mLastName = str6;
        this.mEmail = str7;
        this.mDefaultLanguage = str8;
        this.gTransactionId = str4;
        this.sessionId = str9;
    }
}
