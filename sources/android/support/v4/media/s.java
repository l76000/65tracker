package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import e.w0;

@w0
/* compiled from: MediaDescriptionCompatApi23 */
class s {

    /* compiled from: MediaDescriptionCompatApi23 */
    public static class a {
        public static void a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    public static Uri a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
