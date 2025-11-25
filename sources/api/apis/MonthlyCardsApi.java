package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import buslogic.app.api.allsecure_tokenization.b;
import com.facebook.a;
import com.facebook.internal.p0;
import com.facebook.internal.t0;
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

public class MonthlyCardsApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final String companyApiKey = "1688dc355af72ef09287";
    /* access modifiers changed from: private */
    public final String companyUrl = "https://online.bgnaplata.rs";
    /* access modifiers changed from: private */
    public setResponse mCallback;
    /* access modifiers changed from: private */
    public JSONObject responseJsonObject;
    /* access modifiers changed from: private */
    public final String sessionId;

    public interface setResponse {
        void set(JSONObject jSONObject);
    }

    public MonthlyCardsApi(String str) {
        this.sessionId = str;
    }

    public void callAllsecureFinalizeApi(b bVar, String str, String str2, String str3, String str4, String str5, String str6) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        final b bVar2 = bVar;
        final String str7 = str;
        final String str8 = str4;
        final String str9 = str5;
        final String str10 = str6;
        final String str11 = str3;
        final String str12 = str2;
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "finalize_transaction"));
                    arrayList.add(new BasicNameValuePair("transaction_token", "" + bVar2.f9677a));
                    arrayList.add(new BasicNameValuePair("amount", "" + str7));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + bVar2.f9678b));
                    arrayList.add(new BasicNameValuePair("card_type", "" + bVar2.f9679c));
                    arrayList.add(new BasicNameValuePair("expiration_month", "" + bVar2.f9680d));
                    arrayList.add(new BasicNameValuePair("expiration_year", "" + bVar2.f9681e));
                    arrayList.add(new BasicNameValuePair("first_name", "" + str8));
                    arrayList.add(new BasicNameValuePair("last_name", "" + str9));
                    arrayList.add(new BasicNameValuePair("email", "" + str10));
                    arrayList.add(new BasicNameValuePair("host", "" + MonthlyCardsApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("language", "" + str11));
                    arrayList.add(new BasicNameValuePair(FirebaseAnalytics.d.F, "" + str12));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public void callAllsecureValidationApi(b bVar, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        final b bVar2 = bVar;
        final String str9 = str;
        final int i11 = i10;
        final String str10 = str2;
        final String str11 = str3;
        final String str12 = str4;
        final String str13 = str5;
        final String str14 = str6;
        final String str15 = str7;
        final String str16 = str8;
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
                    arrayList.add(new BasicNameValuePair("transaction_token", "" + bVar2.f9677a));
                    arrayList.add(new BasicNameValuePair("amount", "" + str9));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + i11));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + bVar2.f9678b));
                    arrayList.add(new BasicNameValuePair("card_type", "" + bVar2.f9679c));
                    arrayList.add(new BasicNameValuePair("expiration_month", "" + bVar2.f9680d));
                    arrayList.add(new BasicNameValuePair("expiration_year", "" + bVar2.f9681e));
                    arrayList.add(new BasicNameValuePair("first_name", "" + str10));
                    arrayList.add(new BasicNameValuePair("last_name", "" + str11));
                    arrayList.add(new BasicNameValuePair("email", "" + str12));
                    arrayList.add(new BasicNameValuePair("host", "" + MonthlyCardsApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("first_address", "" + str13));
                    arrayList.add(new BasicNameValuePair("second_address", ""));
                    arrayList.add(new BasicNameValuePair("city", ""));
                    arrayList.add(new BasicNameValuePair(t0.B, ""));
                    arrayList.add(new BasicNameValuePair("region", ""));
                    arrayList.add(new BasicNameValuePair("phone_number", ""));
                    arrayList.add(new BasicNameValuePair("zip_number", ""));
                    arrayList.add(new BasicNameValuePair("card_holder", "" + str14));
                    arrayList.add(new BasicNameValuePair("card_remember", ""));
                    arrayList.add(new BasicNameValuePair("language", "" + str15));
                    arrayList.add(new BasicNameValuePair("card_sn", "" + str16));
                    arrayList.add(new BasicNameValuePair("no_bonus", t0.N));
                    arrayList.add(new BasicNameValuePair("advanceFunds", "decrease"));
                    arrayList.add(new BasicNameValuePair("payWithAndroid", t0.N));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public void extendWithAdvanceFunds(int i10, String str, String str2) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        final int i11 = i10;
        final String str3 = str2;
        final String str4 = str;
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                JSONObject unused = MonthlyCardsApi.this.responseJsonObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "extend_monthly_card_with_advance_funds"));
                    arrayList.add(new BasicNameValuePair("userId", "" + i11));
                    arrayList.add(new BasicNameValuePair("in_amount", "" + str3));
                    arrayList.add(new BasicNameValuePair("card_mifare_sn", "" + str4));
                    arrayList.add(new BasicNameValuePair("event_datetime", "2018-06-12 09:45:19"));
                    arrayList.add(new BasicNameValuePair("host", "" + MonthlyCardsApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_add_or_connect_card.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        JSONObject unused2 = MonthlyCardsApi.this.responseJsonObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(MonthlyCardsApi.this.responseJsonObject);
                    }
                });
            }
        });
    }

    public void getNewFixedAmount(final String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                JSONObject unused = MonthlyCardsApi.this.responseJsonObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_fixed_amount"));
                    arrayList.add(new BasicNameValuePair("card_mifare_sn", "" + str));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_additional_settings.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        JSONObject unused2 = MonthlyCardsApi.this.responseJsonObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(MonthlyCardsApi.this.responseJsonObject);
                    }
                });
            }
        });
    }

    public void getQrPayment(int i10, long j10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        final long j11 = j10;
        final int i11 = i10;
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                JSONObject unused = MonthlyCardsApi.this.responseJsonObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_qr_payment"));
                    arrayList.add(new BasicNameValuePair("cardNo", "" + j11));
                    arrayList.add(new BasicNameValuePair("userId", "" + i11));
                    arrayList.add(new BasicNameValuePair("image", "no"));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_additional_settings.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        JSONObject unused2 = MonthlyCardsApi.this.responseJsonObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(MonthlyCardsApi.this.responseJsonObject);
                    }
                });
            }
        });
    }

    public void getValidButton(int i10, String str, long j10) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        final int i11 = i10;
        final String str2 = str;
        final long j11 = j10;
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                JSONObject unused = MonthlyCardsApi.this.responseJsonObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_valid_monthly_button"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + i11));
                    arrayList.add(new BasicNameValuePair("card_user_sn", "" + str2));
                    arrayList.add(new BasicNameValuePair("serial_no", "" + j11));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + MonthlyCardsApi.this.sessionId));
                    URI uri = new URI(MonthlyCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_add_or_connect_card.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", MonthlyCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        JSONObject unused2 = MonthlyCardsApi.this.responseJsonObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        MonthlyCardsApi.this.mCallback.set(MonthlyCardsApi.this.responseJsonObject);
                    }
                });
            }
        });
    }

    public void setCallback(@q0 setResponse setresponse) {
        this.mCallback = setresponse;
    }
}
