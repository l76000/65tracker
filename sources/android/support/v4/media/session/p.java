package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import e.w0;
import java.util.Iterator;
import java.util.List;

@w0
/* compiled from: PlaybackStateCompatApi21 */
class p {

    /* compiled from: PlaybackStateCompatApi21 */
    public static final class a {
        public static String a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        public static Bundle b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        public static int c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static CharSequence d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static Object e(String str, CharSequence charSequence, int i10, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i10);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    public static long a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static long b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    public static long c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static List<Object> d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static CharSequence e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static float g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static int i(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static Object j(int i10, long j10, long j11, float f10, long j12, CharSequence charSequence, long j13, List<Object> list, long j14) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i10, j10, f10, j13);
        long j15 = j11;
        builder.setBufferedPosition(j11);
        long j16 = j12;
        builder.setActions(j12);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j14);
        return builder.build();
    }
}
