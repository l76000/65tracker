package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.r;
import android.support.v4.media.s;
import e.a1;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final String X = "android.media.extra.BT_FOLDER_TYPE";
    public static final long Y = 0;
    public static final long Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final long f317a0 = 2;

    /* renamed from: b0  reason: collision with root package name */
    public static final long f318b0 = 3;

    /* renamed from: c0  reason: collision with root package name */
    public static final long f319c0 = 4;

    /* renamed from: d0  reason: collision with root package name */
    public static final long f320d0 = 5;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f321e0 = 6;

    /* renamed from: f0  reason: collision with root package name */
    public static final String f322f0 = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: g0  reason: collision with root package name */
    public static final long f323g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final long f324h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public static final long f325i0 = 2;
    @a1

    /* renamed from: j0  reason: collision with root package name */
    public static final String f326j0 = "android.support.v4.media.description.MEDIA_URI";
    @a1

    /* renamed from: k0  reason: collision with root package name */
    public static final String f327k0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public final String O;
    public final CharSequence P;
    public final CharSequence Q;
    public final CharSequence R;
    public final Bitmap S;
    public final Uri T;
    public final Bundle U;
    public final Uri V;
    public Object W;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(r.a(parcel));
        }

        public final Object[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f328a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f329b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f330c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f331d;

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f332e;

        /* renamed from: f  reason: collision with root package name */
        public Uri f333f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f334g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f335h;
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.O = str;
        this.P = charSequence;
        this.Q = charSequence2;
        this.R = charSequence3;
        this.S = bitmap;
        this.T = uri;
        this.U = bundle;
        this.V = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r11) {
        /*
            r0 = 0
            if (r11 == 0) goto L_0x007d
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.r.f(r11)
            r1.f328a = r2
            java.lang.CharSequence r2 = android.support.v4.media.r.h(r11)
            r1.f329b = r2
            java.lang.CharSequence r2 = android.support.v4.media.r.g(r11)
            r1.f330c = r2
            java.lang.CharSequence r2 = android.support.v4.media.r.b(r11)
            r1.f331d = r2
            android.graphics.Bitmap r2 = android.support.v4.media.r.d(r11)
            r1.f332e = r2
            android.net.Uri r2 = android.support.v4.media.r.e(r11)
            r1.f333f = r2
            android.os.Bundle r2 = android.support.v4.media.r.c(r11)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x003e
            android.support.v4.media.session.MediaSessionCompat.a(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x003f
        L_0x003e:
            r4 = r0
        L_0x003f:
            if (r4 == 0) goto L_0x0057
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0051
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0057:
            r0 = r2
        L_0x0058:
            r1.f334g = r0
            if (r4 == 0) goto L_0x005f
            r1.f335h = r4
            goto L_0x0065
        L_0x005f:
            android.net.Uri r0 = android.support.v4.media.s.a(r11)
            r1.f335h = r0
        L_0x0065:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            java.lang.String r3 = r1.f328a
            java.lang.CharSequence r4 = r1.f329b
            java.lang.CharSequence r5 = r1.f330c
            java.lang.CharSequence r6 = r1.f331d
            android.graphics.Bitmap r7 = r1.f332e
            android.net.Uri r8 = r1.f333f
            android.os.Bundle r9 = r1.f334g
            android.net.Uri r10 = r1.f335h
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.W = r11
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.P + ", " + this.Q + ", " + this.R;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        Object obj = this.W;
        if (obj == null) {
            Object b10 = r.a.b();
            r.a.g(b10, this.O);
            r.a.i(b10, this.P);
            r.a.h(b10, this.Q);
            r.a.c(b10, this.R);
            r.a.e(b10, this.S);
            r.a.f(b10, this.T);
            r.a.d(b10, this.U);
            s.a.a(b10, this.V);
            obj = r.a.a(b10);
            this.W = obj;
        }
        r.i(obj, parcel, i10);
    }
}
