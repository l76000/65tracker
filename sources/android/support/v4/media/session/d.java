package android.support.v4.media.session;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import e.w0;

@w0
/* compiled from: MediaControllerCompatApi23 */
class d {

    /* compiled from: MediaControllerCompatApi23 */
    public static class a {
        public static void a(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }
}
