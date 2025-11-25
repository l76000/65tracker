package buslogic.app;

import buslogic.app.models.AddFavouriteStationResponse;
import retrofit2.b;
import retrofit2.d;
import retrofit2.v;
import x1.a;

/* compiled from: RequestManager */
class o implements d<AddFavouriteStationResponse> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f11707a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11708b;

    public o(a aVar, String str) {
        this.f11707a = aVar;
        this.f11708b = str;
    }

    public final void a(b<AddFavouriteStationResponse> bVar, Throwable th) {
        th.getMessage();
        this.f11707a.a();
    }

    public final void b(b<AddFavouriteStationResponse> bVar, v<AddFavouriteStationResponse> vVar) {
        boolean c10 = vVar.c();
        a aVar = this.f11707a;
        if (!c10) {
            String str = vVar.f39009a.Q;
            aVar.a();
            return;
        }
        aVar.b((AddFavouriteStationResponse) vVar.f39010b, this.f11708b);
    }
}
