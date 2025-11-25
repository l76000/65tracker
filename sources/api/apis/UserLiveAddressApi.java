package buslogic.app.api.apis;

import a2.c;
import android.os.Handler;
import android.os.Looper;
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
import org.json.JSONException;
import org.json.JSONObject;

public class UserLiveAddressApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    /* access modifiers changed from: private */
    public final String companyApiKey = "1688dc355af72ef09287";
    /* access modifiers changed from: private */
    public final String companyUrl = "https://online.bgnaplata.rs";
    /* access modifiers changed from: private */
    public SetUserLiveAddressCallback mCallback;
    /* access modifiers changed from: private */
    public final int mUserId;
    /* access modifiers changed from: private */
    public final String sessionId;

    public interface SetUserLiveAddressCallback {
        void set(String str);
    }

    public UserLiveAddressApi(int i10, String str) {
        this.mUserId = i10;
        this.sessionId = str;
    }

    public void callGetUserLiveAddressApi() {
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
                    arrayList.add(new BasicNameValuePair(p0.f13793a1, "get_user_live_address"));
                    arrayList.add(new BasicNameValuePair(a.f12936c0, "" + UserLiveAddressApi.this.mUserId));
                    arrayList.add(new BasicNameValuePair("session_id", "" + UserLiveAddressApi.this.sessionId));
                    arrayList.add(new BasicNameValuePair("ibfm", "TM00000"));
                    URI uri = new URI(UserLiveAddressApi.this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php?" + URLEncodedUtils.format(arrayList, "utf-8"));
                    HttpPost httpPost = new HttpPost();
                    httpPost.setURI(uri);
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    httpPost.setHeader("X-Api-Authentication", UserLiveAddressApi.this.companyApiKey);
                    HttpResponse execute = a10.execute(httpPost);
                    if (execute.getStatusLine().getStatusCode() == 200) {
                        jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                }
                handler.post(new Runnable() {
                    public void run() {
                        String str;
                        try {
                            str = jSONObject.getString(com.facebook.appevents.integrity.a.f13054c);
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                            str = "";
                        }
                        UserLiveAddressApi.this.mCallback.set(str);
                    }
                });
            }
        });
    }

    public void setCallback(@q0 SetUserLiveAddressCallback setUserLiveAddressCallback) {
        this.mCallback = setUserLiveAddressCallback;
    }
}
