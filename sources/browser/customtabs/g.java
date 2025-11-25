package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.h;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.o;
import e.a1;
import e.o0;
import e.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CustomTabsIntent */
public final class g {
    public static final int A = 2;
    public static final String B = "androidx.browser.customtabs.extra.SHARE_STATE";
    @Deprecated
    public static final String C = "android.support.customtabs.extra.SHARE_MENU_ITEM";
    public static final String D = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS";
    public static final String E = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS";
    public static final String F = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT";
    public static final String G = "android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID";
    public static final String H = "android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS";
    public static final String I = "androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS";
    public static final String J = "androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR";
    public static final String K = "androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR";
    public static final String L = "android.support.customtabs.customaction.ID";
    public static final int M = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final String f1406c = "android.support.customtabs.extra.SESSION";
    @a1

    /* renamed from: d  reason: collision with root package name */
    public static final String f1407d = "android.support.customtabs.extra.SESSION_ID";

    /* renamed from: e  reason: collision with root package name */
    public static final int f1408e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f1409f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f1410g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final String f1411h = "androidx.browser.customtabs.extra.COLOR_SCHEME";

    /* renamed from: i  reason: collision with root package name */
    public static final String f1412i = "android.support.customtabs.extra.TOOLBAR_COLOR";

    /* renamed from: j  reason: collision with root package name */
    public static final String f1413j = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING";

    /* renamed from: k  reason: collision with root package name */
    public static final String f1414k = "android.support.customtabs.extra.CLOSE_BUTTON_ICON";

    /* renamed from: l  reason: collision with root package name */
    public static final String f1415l = "android.support.customtabs.extra.TITLE_VISIBILITY";

    /* renamed from: m  reason: collision with root package name */
    public static final int f1416m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1417n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final String f1418o = "android.support.customtabs.extra.ACTION_BUTTON_BUNDLE";

    /* renamed from: p  reason: collision with root package name */
    public static final String f1419p = "android.support.customtabs.extra.TOOLBAR_ITEMS";

    /* renamed from: q  reason: collision with root package name */
    public static final String f1420q = "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR";

    /* renamed from: r  reason: collision with root package name */
    public static final String f1421r = "android.support.customtabs.customaction.ICON";

    /* renamed from: s  reason: collision with root package name */
    public static final String f1422s = "android.support.customtabs.customaction.DESCRIPTION";

    /* renamed from: t  reason: collision with root package name */
    public static final String f1423t = "android.support.customtabs.customaction.PENDING_INTENT";

    /* renamed from: u  reason: collision with root package name */
    public static final String f1424u = "android.support.customtabs.extra.TINT_ACTION_BUTTON";

    /* renamed from: v  reason: collision with root package name */
    public static final String f1425v = "android.support.customtabs.extra.MENU_ITEMS";

    /* renamed from: w  reason: collision with root package name */
    public static final String f1426w = "android.support.customtabs.customaction.MENU_ITEM_TITLE";

    /* renamed from: x  reason: collision with root package name */
    public static final String f1427x = "android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE";

    /* renamed from: y  reason: collision with root package name */
    public static final int f1428y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f1429z = 1;
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final Intent f1430a;
    @q0

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f1431b = null;

    @a1
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CustomTabsIntent */
    public @interface b {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: CustomTabsIntent */
    public @interface c {
    }

    public g(@o0 Intent intent) {
        this.f1430a = intent;
    }

    @o0
    public static a a(@o0 Intent intent, int i10) {
        Bundle bundle;
        if (i10 < 0 || i10 > 2 || i10 == 0) {
            throw new IllegalArgumentException(h.k("Invalid colorScheme: ", i10));
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return a.a((Bundle) null);
        }
        a a10 = a.a(extras);
        SparseArray sparseParcelableArray = extras.getSparseParcelableArray(I);
        if (sparseParcelableArray == null || (bundle = (Bundle) sparseParcelableArray.get(i10)) == null) {
            return a10;
        }
        a a11 = a.a(bundle);
        Integer num = a11.f1390a;
        if (num == null) {
            num = a10.f1390a;
        }
        Integer num2 = a11.f1391b;
        if (num2 == null) {
            num2 = a10.f1391b;
        }
        Integer num3 = a11.f1392c;
        if (num3 == null) {
            num3 = a10.f1392c;
        }
        Integer num4 = a11.f1393d;
        if (num4 == null) {
            num4 = a10.f1393d;
        }
        return new a(num, num2, num3, num4);
    }

    public static int b() {
        return 5;
    }

    @o0
    public static Intent c(@q0 Intent intent) {
        if (intent == null) {
            intent = new Intent("android.intent.action.VIEW");
        }
        intent.addFlags(268435456);
        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        return intent;
    }

    public static boolean d(@o0 Intent intent) {
        if (!intent.getBooleanExtra("android.support.customtabs.extra.user_opt_out", false) || (intent.getFlags() & 268435456) == 0) {
            return false;
        }
        return true;
    }

    /* compiled from: CustomTabsIntent */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f1432a;

        /* renamed from: b  reason: collision with root package name */
        public final a.C0039a f1433b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1434c;

        public a() {
            this.f1432a = new Intent("android.intent.action.VIEW");
            this.f1433b = new a.C0039a();
            this.f1434c = true;
        }

        @o0
        public final g a() {
            Intent intent = this.f1432a;
            if (!intent.hasExtra(g.f1406c)) {
                Bundle bundle = new Bundle();
                o.b(bundle, g.f1406c, (IBinder) null);
                intent.putExtras(bundle);
            }
            intent.putExtra(g.H, this.f1434c);
            this.f1433b.getClass();
            intent.putExtras(new Bundle());
            intent.putExtra(g.B, 0);
            return new g(intent);
        }

        public a(@q0 k kVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f1432a = intent;
            this.f1433b = new a.C0039a();
            this.f1434c = true;
            if (kVar != null) {
                intent.setPackage(kVar.f1446c.getPackageName());
                IBinder asBinder = kVar.f1445b.asBinder();
                Bundle bundle = new Bundle();
                o.b(bundle, g.f1406c, asBinder);
                PendingIntent pendingIntent = kVar.f1447d;
                if (pendingIntent != null) {
                    bundle.putParcelable(g.f1407d, pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
