package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
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
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class AllSecureCheckStatusApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    /* access modifiers changed from: private */
    public CheckStatus mCallback;
    /* access modifiers changed from: private */
    public final String sessionId;
    /* access modifiers changed from: private */
    public final String transactionId;

    public interface CheckStatus {
        void status(JSONObject jSONObject);
    }

    public AllSecureCheckStatusApi(String str, String str2, String str3, String str4) {
        this.transactionId = str3;
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.sessionId = str4;
    }

    public void callAllSecureCheckStatusApi() {
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
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_status"));
                    arrayList.add(new BasicNameValuePair("row_id", "" + AllSecureCheckStatusApi.this.transactionId));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + AllSecureCheckStatusApi.this.sessionId));
                    URI uri = new URI(AllSecureCheckStatusApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", AllSecureCheckStatusApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        AllSecureCheckStatusApi.this.mCallback.status(jSONObject);
                    }
                });
            }
        });
    }

    public void setCallback(CheckStatus checkStatus) {
        this.mCallback = checkStatus;
    }
}
