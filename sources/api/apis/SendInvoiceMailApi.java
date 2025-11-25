package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import com.facebook.a;
import com.facebook.internal.p0;
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

public class SendInvoiceMailApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final String companyApiKey = "1688dc355af72ef09287";
    /* access modifiers changed from: private */
    public final String companyUrl = "https://online.bgnaplata.rs";
    /* access modifiers changed from: private */
    public final String mAmount;
    /* access modifiers changed from: private */
    public final String mBankAuthorizationCode;
    /* access modifiers changed from: private */
    public final String mCardHolder;
    /* access modifiers changed from: private */
    public final String mCardType;
    /* access modifiers changed from: private */
    public final String mInvoiceId;
    /* access modifiers changed from: private */
    public final String mLastFourDigits;
    /* access modifiers changed from: private */
    public final int mUserId;
    /* access modifiers changed from: private */
    public final String sessionId;

    public SendInvoiceMailApi(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.mUserId = i10;
        this.mInvoiceId = str;
        this.mAmount = str2;
        this.mCardType = str3;
        this.mLastFourDigits = str4;
        this.mBankAuthorizationCode = str5;
        this.mCardHolder = str6;
        this.sessionId = str7;
    }

    public void sendInvoiceErrorMailApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "send_invoice_mail"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + SendInvoiceMailApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("invoice_num", "" + SendInvoiceMailApi.this.mInvoiceId));
                    arrayList.add(new BasicNameValuePair("amount", "" + SendInvoiceMailApi.this.mAmount));
                    arrayList.add(new BasicNameValuePair("card_type", "" + SendInvoiceMailApi.this.mCardType));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + SendInvoiceMailApi.this.mLastFourDigits));
                    arrayList.add(new BasicNameValuePair("bank_authorization_code", "" + SendInvoiceMailApi.this.mBankAuthorizationCode));
                    arrayList.add(new BasicNameValuePair("card_holder", "" + SendInvoiceMailApi.this.mCardHolder));
                    arrayList.add(new BasicNameValuePair("host", "" + SendInvoiceMailApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("success", "ERORR"));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + SendInvoiceMailApi.this.sessionId));
                    URI uri = new URI(SendInvoiceMailApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", SendInvoiceMailApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                    }
                });
            }
        });
    }

    public void sendInvoiceSuccessMailApi(final String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "send_invoice_mail"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + SendInvoiceMailApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("invoice_num", "" + SendInvoiceMailApi.this.mInvoiceId));
                    arrayList.add(new BasicNameValuePair("amount", "" + SendInvoiceMailApi.this.mAmount));
                    arrayList.add(new BasicNameValuePair("card_type", "" + SendInvoiceMailApi.this.mCardType));
                    arrayList.add(new BasicNameValuePair("last_four_digits", "" + SendInvoiceMailApi.this.mLastFourDigits));
                    arrayList.add(new BasicNameValuePair("bank_authorization_code", "" + SendInvoiceMailApi.this.mBankAuthorizationCode));
                    arrayList.add(new BasicNameValuePair("card_holder", "" + SendInvoiceMailApi.this.mCardHolder));
                    arrayList.add(new BasicNameValuePair("host", "" + SendInvoiceMailApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("success", "OK"));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("bonuses_amount", str));
                    arrayList.add(new BasicNameValuePair("session_id", "" + SendInvoiceMailApi.this.sessionId));
                    URI uri = new URI(SendInvoiceMailApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
                    httpPost.setHeader("X-Api-Authentication", SendInvoiceMailApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                    }
                });
            }
        });
    }
}
