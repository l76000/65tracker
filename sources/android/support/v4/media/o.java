package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import e.o0;
import e.w0;
import java.util.List;

@w0
/* compiled from: MediaBrowserCompatApi21 */
class o {

    /* compiled from: MediaBrowserCompatApi21 */
    public interface a {
        void v();

        void w();

        void x();
    }

    /* compiled from: MediaBrowserCompatApi21 */
    public static class b<T extends a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a  reason: collision with root package name */
        public final T f357a;

        public b(T t9) {
            this.f357a = t9;
        }

        public final void onConnected() {
            this.f357a.v();
        }

        public final void onConnectionFailed() {
            this.f357a.x();
        }

        public final void onConnectionSuspended() {
            this.f357a.w();
        }
    }

    /* compiled from: MediaBrowserCompatApi21 */
    public static class c {
        public static Object a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }

        public static int b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }
    }

    /* compiled from: MediaBrowserCompatApi21 */
    public interface d {
        void a();

        void b(List list);
    }

    /* compiled from: MediaBrowserCompatApi21 */
    public static class e<T extends d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a  reason: collision with root package name */
        public final T f358a;

        public e(T t9) {
            this.f358a = t9;
        }

        public final void onChildrenLoaded(@o0 String str, List<MediaBrowser.MediaItem> list) {
            this.f358a.b(list);
        }

        public final void onError(@o0 String str) {
            this.f358a.a();
        }
    }

    public static void a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    public static Object b(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    public static Object c(a aVar) {
        return new b(aVar);
    }

    public static Object d(d dVar) {
        return new e(dVar);
    }

    public static void e(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    public static Bundle f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    public static String g(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    public static ComponentName h(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    public static Object i(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    public static boolean j(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    public static void k(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void l(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
