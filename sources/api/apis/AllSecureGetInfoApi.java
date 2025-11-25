package buslogic.app.api.apis;

import com.facebook.internal.p0;
import e.o0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.h;
import okhttp3.h0;
import okhttp3.i;
import okhttp3.j0;
import okhttp3.v;
import org.json.JSONException;
import org.json.JSONObject;

public class AllSecureGetInfoApi {
    protected final int REQUEST_TIMEOUT = 4;
    protected final int RESPONSE_TIMEOUT = 10;
    private final String companyApiKey;
    private final String companyUrl;
    /* access modifiers changed from: private */
    public setAllSecureInfo mCallback;
    private final String sessionId;

    public interface setAllSecureInfo {
        void set(JSONObject jSONObject);
    }

    public AllSecureGetInfoApi(String str, String str2, String str3) {
        this.companyApiKey = str;
        this.companyUrl = str2;
        this.sessionId = str3;
    }

    public void getInfo() {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "get_allsecure_info");
        aVar.a("session_id", this.sessionId);
        v b10 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        j0.a aVar3 = new j0.a();
        aVar3.i(this.companyUrl + "/publicapi/v1/rest_options/android_allsecure.php");
        aVar3.f(b10);
        aVar3.a(this.companyApiKey);
        h0Var.a(aVar3.b()).K(new i() {
            public void onFailure(@o0 h hVar, IOException iOException) {
                AllSecureGetInfoApi.this.mCallback.set((JSONObject) null);
            }

            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        AllSecureGetInfoApi.this.mCallback.set(new JSONObject(o0Var.U.m()));
                    } catch (JSONException unused) {
                        AllSecureGetInfoApi.this.mCallback.set((JSONObject) null);
                    }
                } else {
                    AllSecureGetInfoApi.this.mCallback.set((JSONObject) null);
                }
            }
        });
    }

    public void setCallback(setAllSecureInfo setallsecureinfo) {
        this.mCallback = setallsecureinfo;
    }
}
