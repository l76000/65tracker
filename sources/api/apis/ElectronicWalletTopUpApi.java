package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import com.facebook.a;
import com.facebook.internal.p0;
import e.q0;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class ElectronicWalletTopUpApi {
    protected final int REQUEST_TIMEOUT = 5000;
    protected final int RESPONSE_TIMEOUT = 6000;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    /* access modifiers changed from: private */
    public Boolean isSocketTimeout = Boolean.FALSE;
    /* access modifiers changed from: private */
    public String mAmount;
    /* access modifiers changed from: private */
    public GetElectronicWalletResponse mCallback;
    /* access modifiers changed from: private */
    public final int mCardSn;
    /* access modifiers changed from: private */
    public int mUserId;
    /* access modifiers changed from: private */
    public String sessionId;

    public interface GetElectronicWalletResponse {
        void set(JSONObject jSONObject);
    }

    public ElectronicWalletTopUpApi(String str, String str2, int i10, int i11, String str3, String str4) {
        this.mUserId = i10;
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mCardSn = i11;
        this.mAmount = str3;
        this.sessionId = str4;
    }

    public void addElectronicWalletTopUpApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 5000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 6000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "prepaid_cards_add_log_online"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + ElectronicWalletTopUpApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("card_sn", "" + ElectronicWalletTopUpApi.this.mCardSn));
                    arrayList.add(new BasicNameValuePair("in_amount", "" + ElectronicWalletTopUpApi.this.mAmount));
                    arrayList.add(new BasicNameValuePair("host", "" + ElectronicWalletTopUpApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + ElectronicWalletTopUpApi.this.sessionId));
                    URI uri = new URI(ElectronicWalletTopUpApi.this.companyUrl + "/publicapi/v1/rest_options/android_prepaid_cards_log_online.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", ElectronicWalletTopUpApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (SocketTimeoutException unused) {
                    Boolean unused2 = ElectronicWalletTopUpApi.this.isSocketTimeout = Boolean.TRUE;
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        ElectronicWalletTopUpApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public void getElectronicWalletTopUpApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 5000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 6000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_prepaid_cards_reserved_funds"));
                    arrayList.add(new BasicNameValuePair("card_sn", "" + ElectronicWalletTopUpApi.this.mCardSn));
                    arrayList.add(new BasicNameValuePair("host", "" + ElectronicWalletTopUpApi.this.companyUrl));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
                    URI uri = new URI(ElectronicWalletTopUpApi.this.companyUrl + "/publicapi/v1/rest_options/android_prepaid_cards_log_online.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", ElectronicWalletTopUpApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (SocketTimeoutException | ConnectTimeoutException unused) {
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        ElectronicWalletTopUpApi.this.mCallback.set(jSONObject);
                    }
                });
            }
        });
    }

    public boolean getIsSocketTimeout() {
        return this.isSocketTimeout.booleanValue();
    }

    public void setCallback(@q0 GetElectronicWalletResponse getElectronicWalletResponse) {
        this.mCallback = getElectronicWalletResponse;
    }

    public ElectronicWalletTopUpApi(String str, String str2, int i10, String str3) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mCardSn = i10;
        this.sessionId = str3;
    }
}
