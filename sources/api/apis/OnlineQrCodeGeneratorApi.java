package buslogic.app.api.apis;

import android.util.Log;
import com.facebook.a;
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

public class OnlineQrCodeGeneratorApi {
    protected final int REQUEST_TIMEOUT = 4;
    protected final int RESPONSE_TIMEOUT = 10;
    private final String companyApiKey;
    private final String companyUrl;
    /* access modifiers changed from: private */
    public checkQrCodeResponse mCallback;
    private final String mTransactionCode;
    private final int mUserId;
    private final String sessionId;

    public interface checkQrCodeResponse {
        void check(JSONObject jSONObject);
    }

    public OnlineQrCodeGeneratorApi(int i10, String str, String str2) {
        this.mUserId = i10;
        this.mTransactionCode = str;
        this.companyApiKey = "1688dc355af72ef09287";
        this.companyUrl = "https://online.bgnaplata.rs";
        this.sessionId = str2;
    }

    public void agreeOrCancel(String str) {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "update_agreed_online_qr_code_generator");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("generated_transaction_code", this.mTransactionCode);
        aVar.a("user_response", str);
        aVar.a("session_id", "" + this.sessionId);
        v b10 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        j0.a aVar3 = new j0.a();
        aVar3.i(this.companyUrl + "/publicapi/v1/rest_options/android_additional_options.php");
        aVar3.f(b10);
        aVar3.a(this.companyApiKey);
        h0Var.a(aVar3.b()).K(new i() {
            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject(o0Var.U.m()));
                    } catch (JSONException unused) {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                    }
                } else {
                    OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                }
            }

            public void onFailure(@o0 h hVar, IOException iOException) {
            }
        });
    }

    public void check() {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "check_online_qr_code_generator");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("generated_transaction_code", "" + this.mTransactionCode);
        aVar.a("session_id", "" + this.sessionId);
        v b10 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        j0.a aVar3 = new j0.a();
        aVar3.i(this.companyUrl + "/publicapi/v1/rest_options/android_additional_options.php");
        aVar3.f(b10);
        aVar3.a(this.companyApiKey);
        h0Var.a(aVar3.b()).K(new i() {
            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject(o0Var.U.m()));
                    } catch (JSONException unused) {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                    }
                } else {
                    OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                }
            }

            public void onFailure(@o0 h hVar, IOException iOException) {
            }
        });
    }

    public void checkFinished() {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "check_finished_online_qr_code_generator");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("generated_transaction_code", "" + this.mTransactionCode);
        aVar.a("session_id", "" + this.sessionId);
        v b10 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        j0.a aVar3 = new j0.a();
        aVar3.i(this.companyUrl + "/publicapi/v1/rest_options/android_additional_options.php");
        aVar3.f(b10);
        aVar3.a(this.companyApiKey);
        h0Var.a(aVar3.b()).K(new i() {
            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                Log.e("QR GENERATOR API", o0Var.Q);
                if (o0Var.c()) {
                    try {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject(o0Var.U.m()));
                    } catch (JSONException unused) {
                        OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                    }
                } else {
                    OnlineQrCodeGeneratorApi.this.mCallback.check(new JSONObject());
                }
            }

            public void onFailure(@o0 h hVar, IOException iOException) {
            }
        });
    }

    public void insert() {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "insert_online_qr_code_generator");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("generated_transaction_code", "" + this.mTransactionCode);
        aVar.a("session_id", "" + this.sessionId);
        v b10 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        j0.a aVar3 = new j0.a();
        aVar3.i(this.companyUrl + "/publicapi/v1/rest_options/android_additional_options.php");
        aVar3.f(b10);
        aVar3.a(this.companyApiKey);
        h0Var.a(aVar3.b()).K(new i() {
            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                Log.e("QR GENERATOR", o0Var.Q);
                if (o0Var.c()) {
                    o0Var.U.m();
                }
            }

            public void onFailure(@o0 h hVar, IOException iOException) {
            }
        });
    }

    public void setCallback(checkQrCodeResponse checkqrcoderesponse) {
        this.mCallback = checkqrcoderesponse;
    }
}
