package android.support.v4.media.session;

import android.media.Rating;
import android.media.RemoteControlClient;
import android.support.v4.media.RatingCompat;

/* compiled from: MediaSessionCompat */
class j implements RemoteControlClient.OnMetadataUpdateListener {
    public j() {
        throw null;
    }

    public final void onMetadataUpdate(int i10, Object obj) {
        if (i10 == 268435457 && (obj instanceof Rating)) {
            RatingCompat.a(obj);
            throw null;
        }
    }
}
