package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import e.a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
    public static final String Q = "android.media.metadata.TITLE";
    public static final String R = "android.media.metadata.ARTIST";
    public static final String S = "android.media.metadata.DURATION";
    public static final String T = "android.media.metadata.ALBUM";
    public static final String U = "android.media.metadata.AUTHOR";
    public static final String V = "android.media.metadata.WRITER";
    public static final String W = "android.media.metadata.COMPOSER";
    public static final String X = "android.media.metadata.COMPILATION";
    public static final String Y = "android.media.metadata.DATE";
    public static final String Z = "android.media.metadata.YEAR";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f336a0 = "android.media.metadata.GENRE";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f337b0 = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f338c0 = "android.media.metadata.NUM_TRACKS";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f339d0 = "android.media.metadata.DISC_NUMBER";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f340e0 = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: f0  reason: collision with root package name */
    public static final String f341f0 = "android.media.metadata.ART";

    /* renamed from: g0  reason: collision with root package name */
    public static final String f342g0 = "android.media.metadata.ART_URI";

    /* renamed from: h0  reason: collision with root package name */
    public static final String f343h0 = "android.media.metadata.ALBUM_ART";

    /* renamed from: i0  reason: collision with root package name */
    public static final String f344i0 = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f345j0 = "android.media.metadata.USER_RATING";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f346k0 = "android.media.metadata.RATING";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f347l0 = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f348m0 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: n0  reason: collision with root package name */
    public static final String f349n0 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: o0  reason: collision with root package name */
    public static final String f350o0 = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: p0  reason: collision with root package name */
    public static final String f351p0 = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: q0  reason: collision with root package name */
    public static final String f352q0 = "android.media.metadata.MEDIA_ID";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f353r0 = "android.media.metadata.MEDIA_URI";

    /* renamed from: s0  reason: collision with root package name */
    public static final String f354s0 = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: t0  reason: collision with root package name */
    public static final String f355t0 = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: u0  reason: collision with root package name */
    public static final String f356u0 = "android.media.metadata.DOWNLOAD_STATUS";
    public final Bundle O;
    public Object P;

    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public final Object[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {
        public c() {
            new Bundle();
        }
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    static {
        androidx.collection.b bVar = new androidx.collection.b();
        bVar.put(Q, 1);
        bVar.put(R, 1);
        bVar.put(S, 0);
        bVar.put(T, 1);
        bVar.put(U, 1);
        bVar.put(V, 1);
        bVar.put(W, 1);
        bVar.put(X, 1);
        bVar.put(Y, 1);
        bVar.put(Z, 0);
        bVar.put(f336a0, 1);
        bVar.put(f337b0, 0);
        bVar.put(f338c0, 0);
        bVar.put(f339d0, 0);
        bVar.put(f340e0, 1);
        bVar.put(f341f0, 2);
        bVar.put(f342g0, 1);
        bVar.put(f343h0, 2);
        bVar.put(f344i0, 1);
        bVar.put(f345j0, 3);
        bVar.put(f346k0, 3);
        bVar.put(f347l0, 1);
        bVar.put(f348m0, 1);
        bVar.put(f349n0, 1);
        bVar.put(f350o0, 2);
        bVar.put(f351p0, 1);
        bVar.put(f352q0, 1);
        bVar.put(f354s0, 0);
        bVar.put(f353r0, 1);
        bVar.put(f355t0, 0);
        bVar.put(f356u0, 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.O = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        t.g(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.P = obj;
        return createFromParcel;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.O);
    }
}
