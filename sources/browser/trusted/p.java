package androidx.browser.trusted;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.StatusBarNotification;
import android.support.customtabs.trusted.a;
import android.support.customtabs.trusted.b;
import androidx.browser.trusted.r;
import androidx.core.app.e0;
import e.g;
import e.i;
import e.l0;
import e.o0;
import e.q0;
import java.util.Locale;

/* compiled from: TrustedWebActivityService */
public abstract class p extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String R = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String S = "android.support.customtabs.trusted.SMALL_ICON";
    public static final String T = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String U = "androidx.browser.trusted.SUCCESS";
    public static final int V = -1;
    public NotificationManager O;
    public int P = -1;
    public final b.C0009b Q = new a();

    /* compiled from: TrustedWebActivityService */
    public class a extends b.C0009b {
        public a() {
        }

        public final void A3(Bundle bundle) {
            k0();
            r.b a10 = r.b.a(bundle);
            String str = a10.f1478a;
            p pVar = p.this;
            pVar.b();
            pVar.O.cancel(str, a10.f1479b);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0043, code lost:
            if (r2 == false) goto L_0x004e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.os.Bundle J3(android.os.Bundle r9) {
            /*
                r8 = this;
                r8.k0()
                androidx.browser.trusted.r$d r9 = androidx.browser.trusted.r.d.a(r9)
                java.lang.String r0 = r9.f1481a
                androidx.browser.trusted.p r1 = androidx.browser.trusted.p.this
                r1.b()
                androidx.core.app.e0 r2 = androidx.core.app.e0.a(r1)
                android.app.NotificationManager r2 = r2.f3951a
                boolean r2 = r2.areNotificationsEnabled()
                r3 = 0
                if (r2 != 0) goto L_0x001c
                goto L_0x004e
            L_0x001c:
                int r2 = android.os.Build.VERSION.SDK_INT
                r4 = 1
                r5 = 26
                android.app.Notification r6 = r9.f1483c
                if (r2 < r5) goto L_0x0046
                java.lang.String r2 = r9.f1484d
                java.lang.String r5 = androidx.browser.trusted.p.a(r2)
                android.app.NotificationManager r7 = r1.O
                android.app.Notification r6 = androidx.browser.trusted.d.a(r1, r7, r6, r5, r2)
                android.app.NotificationManager r2 = r1.O
                android.app.NotificationChannel r2 = r2.getNotificationChannel(r5)
                if (r2 == 0) goto L_0x0042
                int r2 = r2.getImportance()
                if (r2 == 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r2 = r3
                goto L_0x0043
            L_0x0042:
                r2 = r4
            L_0x0043:
                if (r2 != 0) goto L_0x0046
                goto L_0x004e
            L_0x0046:
                android.app.NotificationManager r1 = r1.O
                int r9 = r9.f1482b
                r1.notify(r0, r9, r6)
                r3 = r4
            L_0x004e:
                android.os.Bundle r9 = new android.os.Bundle
                r9.<init>()
                java.lang.String r0 = "android.support.customtabs.trusted.NOTIFICATION_SUCCESS"
                r9.putBoolean(r0, r3)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.trusted.p.a.J3(android.os.Bundle):android.os.Bundle");
        }

        public final int T2() {
            k0();
            return p.this.d();
        }

        public final Bundle X2() {
            k0();
            p pVar = p.this;
            int d10 = pVar.d();
            Bundle bundle = new Bundle();
            if (d10 != -1) {
                bundle.putParcelable(p.T, BitmapFactory.decodeResource(pVar.getResources(), d10));
            }
            return bundle;
        }

        public final Bundle a3(Bundle bundle) {
            NotificationChannel f10;
            k0();
            String str = r.c.a(bundle).f1480a;
            p pVar = p.this;
            pVar.b();
            boolean z9 = false;
            if (e0.a(pVar).f3951a.areNotificationsEnabled() && (Build.VERSION.SDK_INT < 26 || (f10 = pVar.O.getNotificationChannel(p.a(str))) == null || f10.getImportance() != 0)) {
                z9 = true;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z9);
            return bundle2;
        }

        public final Bundle d1() {
            k0();
            p pVar = p.this;
            pVar.b();
            StatusBarNotification[] activeNotifications = pVar.O.getActiveNotifications();
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
            return bundle;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[LOOP:0: B:8:0x0028->B:23:0x0059, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0052 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void k0() {
            /*
                r11 = this;
                androidx.browser.trusted.p r0 = androidx.browser.trusted.p.this
                int r1 = r0.P
                r2 = -1
                if (r1 != r2) goto L_0x005c
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                int r2 = android.os.Binder.getCallingUid()
                java.lang.String[] r1 = r1.getPackagesForUid(r2)
                r2 = 0
                if (r1 != 0) goto L_0x0018
                java.lang.String[] r1 = new java.lang.String[r2]
            L_0x0018:
                androidx.browser.trusted.j r3 = r0.c()
                androidx.browser.trusted.g r3 = r3.a()
                android.content.pm.PackageManager r4 = r0.getPackageManager()
                if (r3 == 0) goto L_0x005c
                int r5 = r1.length
                r6 = r2
            L_0x0028:
                if (r6 >= r5) goto L_0x005c
                r7 = r1[r6]
                androidx.browser.trusted.i r8 = r3.f1463a
                int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
                r10 = 28
                if (r9 < r10) goto L_0x003e
                androidx.browser.trusted.e$a r9 = new androidx.browser.trusted.e$a     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
                r9.<init>()     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
                goto L_0x0043
            L_0x003a:
                r7 = move-exception
                goto L_0x0048
            L_0x003c:
                r7 = move-exception
                goto L_0x0048
            L_0x003e:
                androidx.browser.trusted.e$b r9 = new androidx.browser.trusted.e$b     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
                r9.<init>()     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
            L_0x0043:
                boolean r7 = r9.b(r7, r4, r8)     // Catch:{ IOException -> 0x003c, NameNotFoundException -> 0x003a }
                goto L_0x0050
            L_0x0048:
                java.lang.String r8 = "PackageIdentity"
                java.lang.String r9 = "Could not check if package matches token."
                android.util.Log.e(r8, r9, r7)
                r7 = r2
            L_0x0050:
                if (r7 == 0) goto L_0x0059
                int r1 = android.os.Binder.getCallingUid()
                r0.P = r1
                goto L_0x005c
            L_0x0059:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x005c:
                int r0 = r0.P
                int r1 = android.os.Binder.getCallingUid()
                if (r0 != r1) goto L_0x0065
                return
            L_0x0065:
                java.lang.SecurityException r0 = new java.lang.SecurityException
                java.lang.String r1 = "Caller is not verified as Trusted Web Activity provider."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.trusted.p.a.k0():void");
        }

        public final void u0(IBinder iBinder) {
            k0();
            if (iBinder != null) {
                a.b.v(iBinder);
            }
            p.this.getClass();
        }
    }

    public static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }

    public final void b() {
        if (this.O == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @o0
    @g
    public abstract j c();

    @g
    public final int d() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(S, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @q0
    @l0
    public final IBinder onBind(@q0 Intent intent) {
        return this.Q;
    }

    @i
    @l0
    public final void onCreate() {
        super.onCreate();
        this.O = (NotificationManager) getSystemService("notification");
    }

    @l0
    public final boolean onUnbind(@q0 Intent intent) {
        this.P = -1;
        return super.onUnbind(intent);
    }
}
