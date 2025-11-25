package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import buslogic.app.ui.account.finance.i;
import com.facebook.a;
import com.facebook.internal.p0;
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
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import y1.b;

public class AllUserCreditCardsApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final String companyApiKey;
    /* access modifiers changed from: private */
    public final String companyUrl;
    /* access modifiers changed from: private */
    public SetCreditCardsCallback mCallback;
    /* access modifiers changed from: private */
    public final int mUserId;
    /* access modifiers changed from: private */
    public final String sessionId;

    public interface SetCreditCardsCallback {
        void set(ArrayList<i> arrayList);
    }

    public AllUserCreditCardsApi(String str, String str2, int i10, String str3) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.mUserId = i10;
        this.sessionId = str3;
    }

    public void callGetUserCreditCardsApi() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        newSingleThreadExecutor.execute(new Runnable() {
            public void run() {
                final JSONArray jSONArray = new JSONArray();
                try {
                    BasicHttpParams basicHttpParams = new BasicHttpParams();
                    HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
                    HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
                    DefaultHttpClient a10 = c.a(basicHttpParams);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_user_credit_cards"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + AllUserCreditCardsApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    arrayList.add(new BasicNameValuePair("session_id", "" + AllUserCreditCardsApi.this.sessionId));
                    URI uri = new URI(AllUserCreditCardsApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", AllUserCreditCardsApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONArray = new JSONArray(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        AllUserCreditCardsApi.this.mCallback.set(new b(jSONArray).f32045a);
                    }
                });
            }
        });
    }

    public void setCallback(@q0 SetCreditCardsCallback setCreditCardsCallback) {
        this.mCallback = setCreditCardsCallback;
    }
}
