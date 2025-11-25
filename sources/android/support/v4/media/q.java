package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.o;
import android.support.v4.media.session.MediaSessionCompat;
import e.o0;
import e.w0;
import java.util.List;

@w0
/* compiled from: MediaBrowserCompatApi26 */
class q {

    /* compiled from: MediaBrowserCompatApi26 */
    public interface a extends o.d {
        void c(List list);

        void d();
    }

    /* compiled from: MediaBrowserCompatApi26 */
    public static class b<T extends a> extends o.e<T> {
        public b(MediaBrowserCompat.n.b bVar) {
            super(bVar);
        }

        public final void onChildrenLoaded(@o0 String str, List<MediaBrowser.MediaItem> list, @o0 Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f358a).c(list);
        }

        public final void onError(@o0 String str, @o0 Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f358a).d();
        }
    }

    public static void a(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    public static void b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}
