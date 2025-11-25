package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import e.o0;
import e.w0;

@w0
/* compiled from: MediaBrowserCompatApi23 */
class p {

    /* compiled from: MediaBrowserCompatApi23 */
    public interface a {
        void a();

        void b(Parcel parcel);
    }

    /* compiled from: MediaBrowserCompatApi23 */
    public static class b<T extends a> extends MediaBrowser.ItemCallback {

        /* renamed from: a  reason: collision with root package name */
        public final T f359a;

        public b(T t9) {
            this.f359a = t9;
        }

        public final void onError(@o0 String str) {
            this.f359a.a();
        }

        public final void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            T t9 = this.f359a;
            if (mediaItem == null) {
                t9.b((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            t9.b(obtain);
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static void b(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}
