package androidx.browser.trusted;

import android.app.Notification;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: TrustedWebActivityServiceConnection */
public final class r {

    /* compiled from: TrustedWebActivityServiceConnection */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Parcelable[] f1477a;

        public a(Parcelable[] parcelableArr) {
            this.f1477a = parcelableArr;
        }

        public static a a(Bundle bundle) {
            r.a(bundle, "android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS");
            return new a(bundle.getParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS"));
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f1478a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1479b;

        public b(String str, int i10) {
            this.f1478a = str;
            this.f1479b = i10;
        }

        public static b a(Bundle bundle) {
            r.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            r.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            return new b(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"));
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f1480a;

        public c(String str) {
            this.f1480a = str;
        }

        public static c a(Bundle bundle) {
            r.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new c(bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f1481a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1482b;

        /* renamed from: c  reason: collision with root package name */
        public final Notification f1483c;

        /* renamed from: d  reason: collision with root package name */
        public final String f1484d;

        public d(int i10, Notification notification, String str, String str2) {
            this.f1481a = str;
            this.f1482b = i10;
            this.f1483c = notification;
            this.f1484d = str2;
        }

        public static d a(Bundle bundle) {
            r.a(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
            r.a(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
            r.a(bundle, "android.support.customtabs.trusted.NOTIFICATION");
            r.a(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
            return new d(bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
        }
    }

    /* compiled from: TrustedWebActivityServiceConnection */
    public static class e {
        public e(boolean z9) {
        }

        public static e a(Bundle bundle) {
            r.a(bundle, "android.support.customtabs.trusted.NOTIFICATION_SUCCESS");
            return new e(bundle.getBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS"));
        }
    }

    public r() {
        throw null;
    }

    public static void a(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("Bundle must contain ".concat(str));
        }
    }
}
