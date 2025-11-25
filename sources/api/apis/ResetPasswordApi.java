package buslogic.app.api.apis;

import a2.c;
import androidx.constraintlayout.helper.widget.a;
import androidx.core.app.z;
import com.facebook.internal.p0;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class ResetPasswordApi {
    protected final int REQUEST_TIMEOUT = 3000;
    protected final int RESPONSE_TIMEOUT = 5000;
    private final String companyApiKey = "1688dc355af72ef09287";
    private final String companyUrl = "https://online.bgnaplata.rs";
    private final String email;
    private String errorMsg = null;
    boolean result;
    private final String sessionId;

    public ResetPasswordApi(String str, String str2) {
        this.email = str;
        this.sessionId = str2;
    }

    public void callApiResetPassword() {
        try {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 3000);
            HttpConnectionParams.setSoTimeout(basicHttpParams, 5000);
            DefaultHttpClient a10 = c.a(basicHttpParams);
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new BasicNameValuePair(p0.f13793a1, "reset_password"));
            arrayList.add(new BasicNameValuePair("email", "" + this.email));
            arrayList.add(new BasicNameValuePair("ibfm", "TM000001"));
            arrayList.add(new BasicNameValuePair("session_id", "" + this.sessionId));
            URI uri = new URI(this.companyUrl + "/api/api.php");
            HttpPost httpPost = new HttpPost();
            httpPost.setURI(uri);
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList, HTTP.UTF_8));
            httpPost.setHeader("X-Api-Authentication", this.companyApiKey);
            HttpResponse execute = a10.execute(httpPost);
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                JSONObject jSONObject = new JSONObject(EntityUtils.toString(execute.getEntity()));
                try {
                    Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("success"));
                    this.errorMsg = jSONObject.getString(z.f4097s0);
                    if (!valueOf.booleanValue()) {
                        this.result = false;
                    } else {
                        this.result = true;
                    }
                } catch (Exception unused) {
                    this.result = false;
                }
            } else {
                this.result = false;
                this.errorMsg = "status code " + statusCode;
            }
        } catch (Exception e10) {
            this.errorMsg = e10.getMessage();
            this.result = false;
        }
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public boolean getPass() {
        return this.result;
    }

    public void getPwReset() {
        Thread thread = new Thread(new a(5, this));
        thread.start();
        thread.join();
    }
}
