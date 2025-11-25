package buslogic.app.api.apis;

import androidx.constraintlayout.core.motion.utils.w;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TransactionsHistoryApi {
    protected final int REQUEST_TIMEOUT = 4;
    protected final int RESPONSE_TIMEOUT = 10;
    private final String companyApiKey;
    private final String companyUrl;
    /* access modifiers changed from: private */
    public getTransactionResponse mCallback;
    /* access modifiers changed from: private */
    public getTransactionResponseObject mCallbackObject;
    private final int mUserId;
    private final String sessionId;

    public interface getTransactionResponse {
        void get(JSONArray jSONArray);
    }

    public interface getTransactionResponseObject {
        void get(JSONObject jSONObject);
    }

    public TransactionsHistoryApi(int i10, String str) {
        this.mUserId = i10;
        this.companyApiKey = "1688dc355af72ef09287";
        this.companyUrl = "https://online.bgnaplata.rs";
        this.sessionId = str;
    }

    public void getAllTransactionsHistory(String str, String str2, int i10) {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "get_user_all_transactions");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("date_from", "" + str);
        aVar.a("date_to", "" + str2);
        aVar.a(w.c.R, "" + i10);
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
            public void onFailure(@o0 h hVar, IOException iOException) {
                TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
            }

            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        TransactionsHistoryApi.this.mCallback.get(new JSONArray(o0Var.U.m()));
                    } catch (JSONException unused) {
                        TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                    }
                } else {
                    TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                }
            }
        });
    }

    public void getPurchaseTransactionsHistory(String str, String str2, int i10) {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "get_user_purchase_transactions");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("date_from", "" + str);
        aVar.a("date_to", "" + str2);
        aVar.a(w.c.R, "" + i10);
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
            public void onFailure(@o0 h hVar, IOException iOException) {
                TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
            }

            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        TransactionsHistoryApi.this.mCallback.get(new JSONArray(o0Var.U.m()));
                    } catch (JSONException unused) {
                        TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                    }
                } else {
                    TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                }
            }
        });
    }

    public void getPurchaseTransactionsQrCode(String str) {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "get_all_qr_code_info");
        aVar.a("row_id", "" + str);
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
            public void onFailure(@o0 h hVar, IOException iOException) {
                TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
            }

            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        TransactionsHistoryApi.this.mCallbackObject.get(new JSONObject(o0Var.U.m()));
                    } catch (JSONException unused) {
                        TransactionsHistoryApi.this.mCallbackObject.get((JSONObject) null);
                    }
                } else {
                    TransactionsHistoryApi.this.mCallbackObject.get((JSONObject) null);
                }
            }
        });
    }

    public void getTransactionsHistory(String str, String str2, int i10) {
        h0 h0Var = new h0();
        v.a aVar = new v.a();
        aVar.a(p0.f13793a1, "get_user_credit_cards_transactions");
        aVar.a(a.f12936c0, "" + this.mUserId);
        aVar.a("date_from", "" + str);
        aVar.a("date_to", "" + str2);
        aVar.a(w.c.R, "" + i10);
        aVar.a("session_id", "" + this.sessionId);
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
                TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
            }

            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                if (o0Var.c()) {
                    try {
                        TransactionsHistoryApi.this.mCallback.get(new JSONArray(o0Var.U.m()));
                    } catch (JSONException unused) {
                        TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                    }
                } else {
                    TransactionsHistoryApi.this.mCallback.get((JSONArray) null);
                }
            }
        });
    }

    public void setCallback(getTransactionResponse gettransactionresponse) {
        this.mCallback = gettransactionresponse;
    }

    public void setCallbackObject(getTransactionResponseObject gettransactionresponseobject) {
        this.mCallbackObject = gettransactionresponseobject;
    }
}
