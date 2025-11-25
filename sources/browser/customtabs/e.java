package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabsClient */
class e implements Runnable {
    public final /* synthetic */ String O;
    public final /* synthetic */ Bundle P;
    public final /* synthetic */ d Q;

    public e(d dVar, String str, Bundle bundle) {
        this.Q = dVar;
        this.O = str;
        this.P = bundle;
    }

    public final void run() {
        this.Q.f1405j.a(this.P, this.O);
    }
}
