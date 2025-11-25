package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.a;
import android.support.customtabs.b;
import androidx.browser.customtabs.l;
import e.a1;
import e.k1;
import e.o0;
import e.q0;
import java.util.ArrayList;

/* compiled from: CustomTabsSession */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final android.support.customtabs.b f1444a;

    /* renamed from: b  reason: collision with root package name */
    public final android.support.customtabs.a f1445b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f1446c;
    @q0

    /* renamed from: d  reason: collision with root package name */
    public final PendingIntent f1447d = null;

    /* compiled from: CustomTabsSession */
    public static class a extends b.C0006b {
        public final Bundle F2(Bundle bundle, String str) {
            return null;
        }

        public final boolean G3(android.support.customtabs.a aVar, Uri uri, Bundle bundle, ArrayList arrayList) {
            return false;
        }

        public final boolean S3(android.support.customtabs.a aVar, Bundle bundle) {
            return false;
        }

        public final int c3(android.support.customtabs.a aVar, String str, Bundle bundle) {
            return 0;
        }

        public final boolean h4(android.support.customtabs.a aVar, Uri uri) {
            return false;
        }

        public final boolean m2(int i10, Uri uri, Bundle bundle, android.support.customtabs.a aVar) {
            return false;
        }

        public final boolean m3(android.support.customtabs.a aVar) {
            return false;
        }

        public final boolean p3(android.support.customtabs.a aVar, Uri uri, Bundle bundle) {
            return false;
        }

        public final boolean q2(long j10) {
            return false;
        }

        public final boolean t3(android.support.customtabs.a aVar, Bundle bundle) {
            return false;
        }

        public final boolean v1(int i10, Uri uri, Bundle bundle, android.support.customtabs.a aVar) {
            return false;
        }
    }

    @a1
    /* compiled from: CustomTabsSession */
    public static class b {
    }

    public k(android.support.customtabs.b bVar, a.b bVar2, ComponentName componentName) {
        this.f1444a = bVar;
        this.f1445b = bVar2;
        this.f1446c = componentName;
    }

    @o0
    @k1
    public static k a(@o0 ComponentName componentName) {
        return new k(new a(), new l.b(), componentName);
    }
}
