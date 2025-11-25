package beogradplus.helper;

import android.location.GnssStatus;
import androidx.core.content.d;
import com.google.android.gms.maps.c;

/* compiled from: LocationTrack */
class a extends GnssStatus.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f9665a;

    public a(b bVar) {
        this.f9665a = bVar;
    }

    public final void onFirstFix(int i10) {
        super.onFirstFix(i10);
        b bVar = this.f9665a;
        if (bVar.Y == null) {
            return;
        }
        if (d.a(bVar.O, "android.permission.ACCESS_FINE_LOCATION") == 0 || d.a(bVar.O, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            bVar.Y.g(true);
        }
    }

    public final void onStarted() {
        super.onStarted();
        b bVar = this.f9665a;
        c cVar = bVar.Y;
        if (cVar != null && !cVar.d()) {
            if (d.a(bVar.O, "android.permission.ACCESS_FINE_LOCATION") == 0 || d.a(bVar.O, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                bVar.Y.g(true);
                bVar.Z.x0();
            }
        }
    }

    public final void onStopped() {
        super.onStopped();
        b bVar = this.f9665a;
        if (bVar.Y == null) {
            return;
        }
        if (d.a(bVar.O, "android.permission.ACCESS_FINE_LOCATION") == 0 || d.a(bVar.O, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            bVar.Y.g(false);
        }
    }
}
