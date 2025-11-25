package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.n;
import android.util.Log;
import e.w0;
import java.lang.reflect.InvocationTargetException;

@w0
/* compiled from: MediaSessionCompatApi24 */
class o {

    /* compiled from: MediaSessionCompatApi24 */
    public interface a extends n.a {
        void a();

        void c();

        void d();

        void e();
    }

    /* compiled from: MediaSessionCompatApi24 */
    public static class b<T extends a> extends n.b<T> {
        public b(T t9) {
            super(t9);
        }

        public final void onPrepare() {
            ((a) this.f453a).e();
        }

        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f453a).d();
        }

        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f453a).a();
        }

        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            ((a) this.f453a).c();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static String b(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            Log.e("MediaSessionCompatApi24", "Cannot execute MediaSession.getCallingPackage()", e10);
            return null;
        }
    }
}
