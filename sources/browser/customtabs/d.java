package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.customtabs.a;
import e.o0;
import e.q0;

/* compiled from: CustomTabsClient */
class d extends a.b {

    /* renamed from: i  reason: collision with root package name */
    public final Handler f1404i = new Handler(Looper.getMainLooper());

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f1405j = null;

    /* compiled from: CustomTabsClient */
    public class a implements Runnable {
        public final /* synthetic */ int O;
        public final /* synthetic */ Bundle P;

        public a(int i10, Bundle bundle) {
            this.O = i10;
            this.P = bundle;
        }

        public final void run() {
            d.this.f1405j.d(this.O, this.P);
        }
    }

    /* compiled from: CustomTabsClient */
    public class b implements Runnable {
        public final /* synthetic */ Bundle O;

        public b(Bundle bundle) {
            this.O = bundle;
        }

        public final void run() {
            d.this.f1405j.c(this.O);
        }
    }

    /* compiled from: CustomTabsClient */
    public class c implements Runnable {
        public final /* synthetic */ int O;
        public final /* synthetic */ Uri P;
        public final /* synthetic */ boolean Q;
        public final /* synthetic */ Bundle R;

        public c(int i10, Uri uri, boolean z9, Bundle bundle) {
            this.O = i10;
            this.P = uri;
            this.Q = z9;
            this.R = bundle;
        }

        public final void run() {
            d.this.f1405j.f(this.O, this.P, this.Q, this.R);
        }
    }

    public final Bundle L4(@q0 Bundle bundle, @o0 String str) {
        b bVar = this.f1405j;
        if (bVar == null) {
            return null;
        }
        return bVar.b(bundle, str);
    }

    public final void V4(Bundle bundle) {
        if (this.f1405j != null) {
            this.f1404i.post(new b(bundle));
        }
    }

    public final void W3(int i10, Bundle bundle) {
        if (this.f1405j != null) {
            this.f1404i.post(new a(i10, bundle));
        }
    }

    public final void Z4(int i10, Uri uri, boolean z9, @q0 Bundle bundle) {
        if (this.f1405j != null) {
            this.f1404i.post(new c(i10, uri, z9, bundle));
        }
    }

    public final void f5(Bundle bundle, String str) {
        if (this.f1405j != null) {
            this.f1404i.post(new e(this, str, bundle));
        }
    }

    public final void y0(Bundle bundle, String str) {
        if (this.f1405j != null) {
            this.f1404i.post(new f(this, str, bundle));
        }
    }
}
