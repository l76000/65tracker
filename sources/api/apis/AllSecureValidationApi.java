package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.motion.widget.f0;
import buslogic.app.api.allsecure_tokenization.b;
import buslogic.app.ui.account.finance.e0;
import buslogic.app.ui.account.finance.i;
import com.facebook.a;
import com.facebook.internal.p0;
import com.facebook.internal.t0;
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

public class AllSecureValidationApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public String companyApiKey;
    /* access modifiers changed from: private */
    public String companyUrl;
    /* access modifiers changed from: private */
    public String mAdvanceFunds;
    /* access modifiers changed from: private */
    public String mAmount;
    /* access modifiers changed from: private */
    public SetInvoiceInfo mCallback;
    private String mCardExpirationMonth;
    private String mCardExpirationYear;
    /* access modifiers changed from: private */
    public String mCardHolder;
    private String mCardLastFourDigits;
    /* access modifiers changed from: private */
    public boolean mCardRemeber;
    private String mCardType;
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
    /* access modifiers changed from: private */
    public e0 mUserAddress;
    /* access modifiers changed from: private */
    public int mUserId;
    /* access modifiers changed from: private */
    public String sessionId;
    private String uReferenceUuid;

    public interface SetInvoiceInfo {
        void set(JSONObject jSONObject);
    }

    public AllSecureValidationApi(String str, String str2, String str3, String str4, String str5, String str6, int i10, i iVar, String str7, String str8, String str9) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mAmount = str3;
        this.mFirstName = str4;
        this.mLastName = str5;
        this.mEmail = str6;
        this.mUserId = i10;
        this.uReferenceUuid = iVar.f12034f;
        this.mCardType = iVar.f12031c;
        this.mCardHolder = iVar.f12029a;
        this.mCardLastFourDigits = iVar.f12030b;
        this.mCardExpirationMonth = iVar.f12033e;
        this.mCardExpirationYear = iVar.f12032d;
        this.mDefaultLanguage = str7;
        this.mAdvanceFunds = str8;
        this.sessionId = str9;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callAllsecureValidationWithRememberedCardApi$0(JSONObject jSONObject) {
        this.mCallback.set(jSONObject);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$callAllsecureValidationWithRememberedCardApi$1(Handler handler) {
        JSONObject jSONObject = new JSONObject();
        try {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
            DefaultHttpClient a10 = c.a(basicHttpParams);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair(p0.f13793a1, "validate_transaction"));
            arrayList.add(new BasicNameValuePair("amount", "" + this.mAmount));
            arrayList.add(new BasicNameValuePair(a.f12936c0, "" + this.mUserId));
            arrayList.add(new BasicNameValuePair("first_name", "" + this.mFirstName));
            arrayList.add(new BasicNameValuePair("last_name", "" + this.mLastName));
            arrayList.add(new BasicNameValuePair("email", "" + this.mEmail));
            arrayList.add(new BasicNameValuePair("host", "" + this.companyUrl));
            arrayList.add(new BasicNameValuePair("reference_uuid", "" + this.uReferenceUuid));
            arrayList.add(new BasicNameValuePair("language", "" + this.mDefaultLanguage));
            arrayList.add(new BasicNameValuePair("advanceFunds", "" + this.mAdvanceFunds));
            arrayList.add(new BasicNameValuePair("payWithAndroid", t0.N));
            arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
            arrayList.add(new BasicNameValuePair("card_type", "" + this.mCardType));
            arrayList.add(new BasicNameValuePair("last_four_digits", "" + this.mCardLastFourDigits));
            arrayList.add(new BasicNameValuePair("expiration_month", "" + this.mCardExpirationMonth));
            arrayList.add(new BasicNameValuePair("expiration_year", "" + this.mCardExpirationYear));
            arrayList.add(new BasicNameValuePair("card_holder", "" + this.mCardHolder));
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
        handler.post(new f0(11, this, jSONObject));
    }

    public void callAllsecureValidationApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "validate_transaction"));
                    arrayList.add(new BasicNameValuePair("transaction_token", "" + AllSecureValidationApi.this.mToken.f9677a));
                    arrayList.add(new BasicNameValuePair("amount", "" + AllSecureValidationApi.this.mAmount));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + AllSecureValidationApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + AllSecureValidationApi.this.mToken.f9678b));
                    arrayList.add(new BasicNameValuePair("card_type", "" + AllSecureValidationApi.this.mToken.f9679c));
                    arrayList.add(new BasicNameValuePair("expiration_month", "" + AllSecureValidationApi.this.mToken.f9680d));
                    arrayList.add(new BasicNameValuePair("expiration_year", "" + AllSecureValidationApi.this.mToken.f9681e));
                    arrayList.add(new BasicNameValuePair("first_name", "" + AllSecureValidationApi.this.mFirstName));
                    arrayList.add(new BasicNameValuePair("last_name", "" + AllSecureValidationApi.this.mLastName));
                    arrayList.add(new BasicNameValuePair("email", "" + AllSecureValidationApi.this.mEmail));
                    arrayList.add(new BasicNameValuePair("host", "" + AllSecureValidationApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("first_address", "" + AllSecureValidationApi.this.mUserAddress.f12006a));
                    arrayList.add(new BasicNameValuePair("second_address", "" + AllSecureValidationApi.this.mUserAddress.f12007b));
                    arrayList.add(new BasicNameValuePair("city", "" + AllSecureValidationApi.this.mUserAddress.f12008c));
                    arrayList.add(new BasicNameValuePair(t0.B, "" + AllSecureValidationApi.this.mUserAddress.f12010e));
                    arrayList.add(new BasicNameValuePair("region", "" + AllSecureValidationApi.this.mUserAddress.f12009d));
                    arrayList.add(new BasicNameValuePair("phone_number", "" + AllSecureValidationApi.this.mUserAddress.f12012g));
                    arrayList.add(new BasicNameValuePair("zip_number", "" + AllSecureValidationApi.this.mUserAddress.f12011f));
                    arrayList.add(new BasicNameValuePair("card_holder", "" + AllSecureValidationApi.this.mCardHolder));
                    arrayList.add(new BasicNameValuePair("card_remember", "" + AllSecureValidationApi.this.mCardRemeber));
                    arrayList.add(new BasicNameValuePair("language", "" + AllSecureValidationApi.this.mDefaultLanguage));
                    arrayList.add(new BasicNameValuePair("advanceFunds", "" + AllSecureValidationApi.this.mAdvanceFunds));
                    arrayList.add(new BasicNameValuePair("payWithAndroid", t0.N));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + AllSecureValidationApi.this.sessionId));
                    URI uri = new URI(AllSecureValidationApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", AllSecureValidationApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        AllSecureValidationApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public void callAllsecureValidationWithRememberedCardApi() {
        Executors.newSingleThreadExecutor().execute(new f0(10, this, new Handler(Looper.getMainLooper())));
    }

    public void setCallback(@q0 SetInvoiceInfo setInvoiceInfo) {
        this.mCallback = setInvoiceInfo;
    }

    public AllSecureValidationApi(String str, String str2, b bVar, String str3, String str4, e0 e0Var, String str5, String str6, String str7, int i10, boolean z9, String str8, String str9, String str10) {
        this.mToken = bVar;
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mAmount = str3;
        this.mUserAddress = e0Var;
        this.mFirstName = str5;
        this.mLastName = str6;
        this.mEmail = str7;
        this.mUserId = i10;
        this.mCardHolder = str4;
        this.mCardRemeber = z9;
        this.mDefaultLanguage = str8;
        this.mAdvanceFunds = str9;
        this.sessionId = str10;
    }
}
