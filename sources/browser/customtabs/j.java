package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.b;
import e.o0;
import e.q0;

/* compiled from: CustomTabsServiceConnection */
public abstract class j implements ServiceConnection {
    @q0

    /* renamed from: c  reason: collision with root package name */
    public Context f1443c;

    /* compiled from: CustomTabsServiceConnection */
    public class a extends c {
        public a(b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    public abstract void a(@o0 ComponentName componentName, @o0 c cVar);

    public final void onServiceConnected(@o0 ComponentName componentName, @o0 IBinder iBinder) {
        if (this.f1443c != null) {
            a(componentName, new a(b.C0006b.v(iBinder), componentName));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
