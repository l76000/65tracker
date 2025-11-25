package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.b;
import androidx.collection.o;
import e.a1;
import e.o0;
import e.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: CustomTabsService */
public abstract class i extends Service {
    public static final String Q = "android.support.customtabs.action.CustomTabsService";
    public static final String R = "androidx.browser.customtabs.category.NavBarColorCustomization";
    public static final String S = "androidx.browser.customtabs.category.ColorSchemeCustomization";
    public static final String T = "androidx.browser.trusted.category.TrustedWebActivities";
    public static final String U = "androidx.browser.trusted.category.WebShareTargetV2";
    public static final String V = "androidx.browser.trusted.category.ImmersiveMode";
    public static final String W = "android.support.customtabs.otherurls.URL";
    public static final String X = "androidx.browser.customtabs.SUCCESS";
    public static final int Y = 0;
    public static final int Z = -1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f1437a0 = -2;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f1438b0 = -3;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f1439c0 = 1;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f1440d0 = 2;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1441e0 = 1;
    public final o<IBinder, IBinder.DeathRecipient> O = new o<>();
    public final b.C0006b P = new a();

    /* compiled from: CustomTabsService */
    public class a extends b.C0006b {
        public a() {
        }

        @q0
        public static PendingIntent k0(@q0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(g.f1407d);
            bundle.remove(g.f1407d);
            return pendingIntent;
        }

        public final Bundle F2(@q0 Bundle bundle, @o0 String str) {
            return i.this.a();
        }

        public final boolean G3(@q0 android.support.customtabs.a aVar, @q0 Uri uri, @q0 Bundle bundle, @q0 ArrayList arrayList) {
            new l(aVar, k0(bundle));
            return i.this.b();
        }

        public final boolean S3(@o0 android.support.customtabs.a aVar, @q0 Bundle bundle) {
            new l(aVar, k0(bundle));
            return i.this.g();
        }

        public final int c3(@o0 android.support.customtabs.a aVar, @o0 String str, @q0 Bundle bundle) {
            new l(aVar, k0(bundle));
            return i.this.d();
        }

        public final boolean h4(@o0 android.support.customtabs.a aVar, @o0 Uri uri) {
            new l(aVar, (PendingIntent) null);
            return i.this.f();
        }

        public final boolean m2(int i10, @o0 Uri uri, @q0 Bundle bundle, @o0 android.support.customtabs.a aVar) {
            new l(aVar, k0(bundle));
            return i.this.e();
        }

        public final boolean m3(@o0 android.support.customtabs.a aVar) {
            return r5(aVar, (PendingIntent) null);
        }

        public final boolean p3(@o0 android.support.customtabs.a aVar, @o0 Uri uri, @o0 Bundle bundle) {
            new l(aVar, k0(bundle));
            return i.this.f();
        }

        public final boolean q2(long j10) {
            return i.this.i();
        }

        public final boolean r5(@o0 android.support.customtabs.a aVar, @q0 PendingIntent pendingIntent) {
            try {
                h hVar = new h(this, new l(aVar, pendingIntent));
                synchronized (i.this.O) {
                    aVar.asBinder().linkToDeath(hVar, 0);
                    i.this.O.put(aVar.asBinder(), hVar);
                }
                return i.this.c();
            } catch (RemoteException unused) {
                return false;
            }
        }

        public final boolean t3(@o0 android.support.customtabs.a aVar, @q0 Bundle bundle) {
            return r5(aVar, k0(bundle));
        }

        public final boolean v1(int i10, @o0 Uri uri, @q0 Bundle bundle, @o0 android.support.customtabs.a aVar) {
            new l(aVar, k0(bundle));
            return i.this.h();
        }
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CustomTabsService */
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CustomTabsService */
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CustomTabsService */
    public @interface d {
    }

    @q0
    public abstract Bundle a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract int d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    @o0
    public final IBinder onBind(@q0 Intent intent) {
        return this.P;
    }
}
