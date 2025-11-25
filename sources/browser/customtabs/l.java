package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.a;
import android.util.Log;
import androidx.core.app.o;
import e.o0;
import e.q0;

/* compiled from: CustomTabsSessionToken */
public class l {
    @q0

    /* renamed from: a  reason: collision with root package name */
    public final android.support.customtabs.a f1448a;
    @q0

    /* renamed from: b  reason: collision with root package name */
    public final PendingIntent f1449b;

    /* compiled from: CustomTabsSessionToken */
    public class a extends b {
        public a() {
        }

        public final void a(@q0 Bundle bundle, @o0 String str) {
            try {
                l.this.f1448a.f5(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @o0
        public final Bundle b(@q0 Bundle bundle, @o0 String str) {
            try {
                return l.this.f1448a.L4(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        public final void c(@q0 Bundle bundle) {
            try {
                l.this.f1448a.V4(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void d(int i10, @q0 Bundle bundle) {
            try {
                l.this.f1448a.W3(i10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void e(@q0 Bundle bundle, @o0 String str) {
            try {
                l.this.f1448a.y0(bundle, str);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        public final void f(int i10, @o0 Uri uri, boolean z9, @q0 Bundle bundle) {
            try {
                l.this.f1448a.Z4(i10, uri, z9, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public l(@q0 android.support.customtabs.a aVar, @q0 PendingIntent pendingIntent) {
        if (aVar == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f1448a = aVar;
        this.f1449b = pendingIntent;
        if (aVar != null) {
            new a();
        }
    }

    @o0
    public static l a() {
        return new l(new b(), (PendingIntent) null);
    }

    @q0
    public static l c(@o0 Intent intent) {
        Bundle extras = intent.getExtras();
        android.support.customtabs.a aVar = null;
        if (extras == null) {
            return null;
        }
        IBinder a10 = o.a(extras, g.f1406c);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(g.f1407d);
        if (a10 == null && pendingIntent == null) {
            return null;
        }
        if (a10 != null) {
            aVar = a.b.v(a10);
        }
        return new l(aVar, pendingIntent);
    }

    public final IBinder b() {
        android.support.customtabs.a aVar = this.f1448a;
        if (aVar != null) {
            return aVar.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public final boolean equals(Object obj) {
        boolean z9;
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        PendingIntent pendingIntent = lVar.f1449b;
        boolean z10 = true;
        PendingIntent pendingIntent2 = this.f1449b;
        if (pendingIntent2 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (pendingIntent != null) {
            z10 = false;
        }
        if (z9 != z10) {
            return false;
        }
        if (pendingIntent2 != null) {
            return pendingIntent2.equals(pendingIntent);
        }
        return b().equals(lVar.b());
    }

    public final int hashCode() {
        PendingIntent pendingIntent = this.f1449b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return b().hashCode();
    }

    /* compiled from: CustomTabsSessionToken */
    public static class b extends a.b {
        public final Bundle L4(Bundle bundle, String str) {
            return null;
        }

        public final IBinder asBinder() {
            return this;
        }

        public final void V4(Bundle bundle) {
        }

        public final void W3(int i10, Bundle bundle) {
        }

        public final void f5(Bundle bundle, String str) {
        }

        public final void y0(Bundle bundle, String str) {
        }

        public final void Z4(int i10, Uri uri, boolean z9, Bundle bundle) {
        }
    }
}
