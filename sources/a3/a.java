package a3;

import com.facebook.b0;
import com.facebook.g0;
import e3.b;
import java.util.ArrayList;
import kotlin.jvm.internal.l0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements b0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f173a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f174b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f173a = i10;
        this.f174b = obj;
    }

    public final void b(g0 g0Var) {
        int i10 = this.f173a;
        Boolean bool = null;
        Object obj = this.f174b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                b bVar = b.f175a;
                l0.p(cVar, "$instrumentData");
                l0.p(g0Var, "response");
                try {
                    if (g0Var.f13551c == null) {
                        JSONObject jSONObject = g0Var.f13552d;
                        if (jSONObject != null) {
                            bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                        }
                        if (l0.g(bool, Boolean.TRUE)) {
                            cVar.getClass();
                            f fVar = f.f190a;
                            f.a(cVar.f178a);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            default:
                ArrayList<e3.a> arrayList = (ArrayList) obj;
                b bVar2 = b.f24012a;
                l0.p(arrayList, "$validReports");
                l0.p(g0Var, "response");
                try {
                    if (g0Var.f13551c == null) {
                        JSONObject jSONObject2 = g0Var.f13552d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (l0.g(bool, Boolean.TRUE)) {
                            for (e3.a aVar : arrayList) {
                                aVar.getClass();
                                f fVar2 = f.f190a;
                                f.a(aVar.f24009a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }
}
