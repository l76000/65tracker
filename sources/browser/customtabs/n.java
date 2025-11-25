package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.customtabs.c;
import e.o0;
import e.q0;

/* compiled from: PostMessageService */
public class n extends Service {
    public final c.b O = new a();

    /* compiled from: PostMessageService */
    public class a extends c.b {
        public final void N2(@o0 android.support.customtabs.a aVar, @o0 String str, @q0 Bundle bundle) {
            aVar.y0(bundle, str);
        }

        public final void g2(@o0 android.support.customtabs.a aVar, @q0 Bundle bundle) {
            aVar.V4(bundle);
        }
    }

    @o0
    public final IBinder onBind(@q0 Intent intent) {
        return this.O;
    }
}
