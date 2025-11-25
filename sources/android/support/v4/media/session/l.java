package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import e.w0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@w0
/* compiled from: MediaSessionCompatApi21 */
class l {

    /* compiled from: MediaSessionCompatApi21 */
    public interface a {
        void i();

        void j();

        void k();

        void l();

        void m();

        void n(String str, Bundle bundle, ResultReceiver resultReceiver);

        void o(Object obj);

        void p();

        void q();

        void r();

        void s();

        boolean t(Intent intent);

        void u();

        void v();

        void w(String str, Bundle bundle);
    }

    /* compiled from: MediaSessionCompatApi21 */
    public static class b<T extends a> extends MediaSession.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final T f453a;

        public b(T t9) {
            this.f453a = t9;
        }

        public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.a(bundle);
            this.f453a.n(str, bundle, resultReceiver);
        }

        public final void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f453a.w(str, bundle);
        }

        public final void onFastForward() {
            this.f453a.v();
        }

        public final boolean onMediaButtonEvent(Intent intent) {
            if (this.f453a.t(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public final void onPause() {
            this.f453a.i();
        }

        public final void onPlay() {
            this.f453a.p();
        }

        public final void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f453a.q();
        }

        public final void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            this.f453a.r();
        }

        public final void onRewind() {
            this.f453a.l();
        }

        public final void onSeekTo(long j10) {
            this.f453a.m();
        }

        public final void onSetRating(Rating rating) {
            this.f453a.o(rating);
        }

        public final void onSkipToNext() {
            this.f453a.k();
        }

        public final void onSkipToPrevious() {
            this.f453a.s();
        }

        public final void onSkipToQueueItem(long j10) {
            this.f453a.u();
        }

        public final void onStop() {
            this.f453a.j();
        }
    }

    /* compiled from: MediaSessionCompatApi21 */
    public static class c {
        public static Object a(Object obj, long j10) {
            return new MediaSession.QueueItem((MediaDescription) obj, j10);
        }

        public static Object b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static Object b(Context context, String str) {
        return new MediaSession(context, str);
    }

    public static Parcelable c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    public static boolean d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                if (declaredField.get(obj) != null) {
                    return true;
                }
                return false;
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            Log.w("MediaSessionCompatApi21", "Failed to get mCallback object.");
        }
        return false;
    }

    public static boolean e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    public static void f(Object obj) {
        ((MediaSession) obj).release();
    }

    public static void g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    public static void h(Object obj, boolean z9) {
        ((MediaSession) obj).setActive(z9);
    }

    public static void i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    public static void j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    public static void k(Object obj, int i10) {
        ((MediaSession) obj).setFlags(i10);
    }

    public static void l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    public static void m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    public static void n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    public static void o(Object obj, int i10) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i10);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    public static void p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    public static void q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    public static void r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    public static void s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    public static Object t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    public static Object u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
