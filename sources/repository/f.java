package buslogic.app.repository;

import androidx.lifecycle.x0;
import buslogic.app.c;
import buslogic.app.models.LineNumbersResponse;
import com.google.gson.j;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;

/* compiled from: AnnouncementRepository */
class f implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f11720a;

    public f(x0 x0Var) {
        this.f11720a = x0Var;
    }

    public final void a(b<String> bVar, Throwable th) {
        this.f11720a.m(null);
    }

    public final void b(b<String> bVar, v<String> vVar) {
        T t9 = vVar.f39010b;
        x0 x0Var = this.f11720a;
        if (t9 != null) {
            try {
                LineNumbersResponse lineNumbersResponse = (LineNumbersResponse) new j().b(LineNumbersResponse.class, buslogic.app.utils.b.a((String) vVar.f39010b, c.J, c.f9715w));
                if (lineNumbersResponse.success.booleanValue()) {
                    x0Var.m(lineNumbersResponse.data);
                } else {
                    x0Var.m(null);
                }
            } catch (Exception unused) {
                x0Var.m(null);
            }
        } else {
            x0Var.m(null);
        }
    }
}
