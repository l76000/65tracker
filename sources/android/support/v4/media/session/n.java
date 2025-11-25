package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.l;
import e.w0;

@w0
/* compiled from: MediaSessionCompatApi23 */
class n {

    /* compiled from: MediaSessionCompatApi23 */
    public interface a extends l.a {
        void b();
    }

    /* compiled from: MediaSessionCompatApi23 */
    public static class b<T extends a> extends l.b<T> {
        public b(T t9) {
            super(t9);
        }

        public final void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f453a).b();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }
}
