package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.c;
import e.o0;
import e.q0;

/* compiled from: PostMessageServiceConnection */
public abstract class o implements m, ServiceConnection {
    @q0

    /* renamed from: c  reason: collision with root package name */
    public c f1451c;

    public final void onServiceConnected(@o0 ComponentName componentName, @o0 IBinder iBinder) {
        this.f1451c = c.b.v(iBinder);
    }

    public final void onServiceDisconnected(@o0 ComponentName componentName) {
        this.f1451c = null;
    }
}
