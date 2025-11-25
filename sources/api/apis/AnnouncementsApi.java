package buslogic.app.api.apis;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.internal.p0;
import e.o0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l0;
import okhttp3.h;
import okhttp3.h0;
import okhttp3.i;
import okhttp3.j0;
import okhttp3.y;
import org.json.JSONException;
import org.json.JSONObject;

public class AnnouncementsApi {
    protected final int REQUEST_TIMEOUT = 4;
    protected final int RESPONSE_TIMEOUT = 10;
    private String companyApiKey;
    private String companyUrl;
    private String mAllStations;
    /* access modifiers changed from: private */
    public UpdateView mCallback;

    public interface UpdateView {
        void update(JSONObject jSONObject);
    }

    public AnnouncementsApi(String str, String str2, String str3) {
        this.mAllStations = str3;
        this.companyApiKey = str;
        this.companyUrl = str2;
    }

    public void getAnnouncements() {
        h0 h0Var = new h0();
        y.a k10 = y.h(this.companyUrl + "/publicapi/v1/announcement/announcement.php").k();
        k10.a("ibfm", "TM000001");
        k10.a("station_uids", "" + this.mAllStations);
        k10.a(p0.f13793a1, "get_line_numbers");
        j0.a aVar = new j0.a();
        y b10 = k10.b();
        l0.p(b10, "url");
        aVar.f38490a = b10;
        aVar.a(this.companyApiKey);
        j0 b11 = aVar.b();
        h0.a aVar2 = new h0.a(h0Var);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar2.a(4, timeUnit);
        new h0.a(h0Var).b(10, timeUnit);
        h0Var.a(b11).K(new i() {
            public void onResponse(@o0 h hVar, @o0 okhttp3.o0 o0Var) {
                Log.e("ANNOUNCEMENTS", o0Var.Q);
                if (o0Var.c()) {
                    try {
                        final JSONObject jSONObject = new JSONObject(o0Var.U.m());
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                AnnouncementsApi.this.mCallback.update(jSONObject);
                            }
                        });
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }

            public void onFailure(@o0 h hVar, IOException iOException) {
            }
        });
    }

    public void setCallBack(UpdateView updateView) {
        this.mCallback = updateView;
    }
}
