package beogradplus.helper;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.content.d;
import buslogic.app.ui.MainActivity;
import buslogic.app.ui.transport.stations.StationsFragment;
import com.google.android.gms.maps.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Locale;

/* compiled from: LocationTrack */
public class b extends Service implements LocationListener {
    public final Context O;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public Location S;
    public double T;
    public double U;
    public String V;
    public List<Address> W;
    public LocationManager X;
    public final c Y;
    public final StationsFragment Z;

    public b(MainActivity mainActivity, StationsFragment stationsFragment) {
        this.O = mainActivity;
        this.Z = stationsFragment;
        c cVar = stationsFragment.T0;
        this.Y = cVar;
        try {
            LocationManager locationManager = (LocationManager) mainActivity.getSystemService(FirebaseAnalytics.d.f23395s);
            this.X = locationManager;
            this.P = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled = this.X.isProviderEnabled("network");
            this.Q = isProviderEnabled;
            if (this.P || isProviderEnabled) {
                this.X.requestLocationUpdates("gps", 60000, 10.0f, this);
                this.X.registerGnssStatusCallback(new a(this));
                if (this.P) {
                    this.R = false;
                    if (d.a(mainActivity, "android.permission.ACCESS_FINE_LOCATION") == 0 || d.a(mainActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        LocationManager locationManager2 = this.X;
                        if (locationManager2 != null) {
                            Location lastKnownLocation = locationManager2.getLastKnownLocation("gps");
                            this.S = lastKnownLocation;
                            if (lastKnownLocation != null) {
                                this.R = true;
                                this.T = lastKnownLocation.getLatitude();
                                this.U = this.S.getLongitude();
                                List<Address> fromLocation = new Geocoder(mainActivity, Locale.getDefault()).getFromLocation(this.T, this.U, 1);
                                this.W = fromLocation;
                                this.V = fromLocation.get(0).getAddressLine(0);
                                if (cVar != null && !cVar.d()) {
                                    cVar.g(true);
                                }
                            }
                        }
                    } else {
                        this.R = false;
                    }
                }
                if (this.Q) {
                    this.R = false;
                    if (d.a(mainActivity, "android.permission.ACCESS_FINE_LOCATION") == 0 || d.a(mainActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        this.X.requestLocationUpdates("network", 60000, 10.0f, this);
                        LocationManager locationManager3 = this.X;
                        if (locationManager3 != null) {
                            Location lastKnownLocation2 = locationManager3.getLastKnownLocation("network");
                            this.S = lastKnownLocation2;
                            if (lastKnownLocation2 != null) {
                                this.R = true;
                                this.T = lastKnownLocation2.getLatitude();
                                this.U = this.S.getLongitude();
                                List<Address> fromLocation2 = new Geocoder(mainActivity, Locale.getDefault()).getFromLocation(this.T, this.U, 1);
                                this.W = fromLocation2;
                                this.V = fromLocation2.get(0).getAddressLine(0);
                                if (cVar != null && !cVar.d()) {
                                    cVar.g(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.R = false;
                }
            } else if (d.a(mainActivity, "android.permission.ACCESS_FINE_LOCATION") == 0 && d.a(mainActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0 && cVar != null && cVar.d()) {
                cVar.g(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onLocationChanged(Location location) {
        this.U = location.getLongitude();
        this.T = location.getLatitude();
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
