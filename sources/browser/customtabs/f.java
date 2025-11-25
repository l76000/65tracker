package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: CustomTabsClient */
class f implements Runnable {
    public final /* synthetic */ String O;
    public final /* synthetic */ Bundle P;
    public final /* synthetic */ d Q;

    public f(d dVar, String str, Bundle bundle) {
        this.Q = dVar;
        this.O = str;
        this.P = bundle;
    }

    public final void run() {
        this.Q.f1405j.e(this.P, this.O);
    }
}
