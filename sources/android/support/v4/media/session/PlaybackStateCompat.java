package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.p;
import android.text.TextUtils;
import e.a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final int A0 = 4;
    public static final int B0 = 5;
    public static final int C0 = 6;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final int D0 = 7;
    public static final int E0 = 8;
    public static final int F0 = 9;
    public static final int G0 = 10;
    public static final int H0 = 11;
    public static final long I0 = -1;
    public static final int J0 = -1;
    public static final int K0 = 0;
    public static final int L0 = 1;
    public static final int M0 = 2;
    public static final int N0 = 3;
    public static final int O0 = -1;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final int S0 = 0;
    public static final int T0 = 1;
    public static final int U0 = 2;
    public static final int V0 = 3;
    public static final int W0 = 4;
    public static final int X0 = 5;
    public static final int Y0 = 6;
    public static final int Z0 = 7;

    /* renamed from: a0  reason: collision with root package name */
    public static final long f420a0 = 1;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f421a1 = 8;

    /* renamed from: b0  reason: collision with root package name */
    public static final long f422b0 = 2;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f423b1 = 9;

    /* renamed from: c0  reason: collision with root package name */
    public static final long f424c0 = 4;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f425c1 = 10;

    /* renamed from: d0  reason: collision with root package name */
    public static final long f426d0 = 8;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f427d1 = 11;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f428e0 = 16;

    /* renamed from: f0  reason: collision with root package name */
    public static final long f429f0 = 32;

    /* renamed from: g0  reason: collision with root package name */
    public static final long f430g0 = 64;

    /* renamed from: h0  reason: collision with root package name */
    public static final long f431h0 = 128;

    /* renamed from: i0  reason: collision with root package name */
    public static final long f432i0 = 256;

    /* renamed from: j0  reason: collision with root package name */
    public static final long f433j0 = 512;

    /* renamed from: k0  reason: collision with root package name */
    public static final long f434k0 = 1024;

    /* renamed from: l0  reason: collision with root package name */
    public static final long f435l0 = 2048;

    /* renamed from: m0  reason: collision with root package name */
    public static final long f436m0 = 4096;

    /* renamed from: n0  reason: collision with root package name */
    public static final long f437n0 = 8192;

    /* renamed from: o0  reason: collision with root package name */
    public static final long f438o0 = 16384;

    /* renamed from: p0  reason: collision with root package name */
    public static final long f439p0 = 32768;

    /* renamed from: q0  reason: collision with root package name */
    public static final long f440q0 = 65536;

    /* renamed from: r0  reason: collision with root package name */
    public static final long f441r0 = 131072;

    /* renamed from: s0  reason: collision with root package name */
    public static final long f442s0 = 262144;
    @Deprecated

    /* renamed from: t0  reason: collision with root package name */
    public static final long f443t0 = 524288;

    /* renamed from: u0  reason: collision with root package name */
    public static final long f444u0 = 1048576;

    /* renamed from: v0  reason: collision with root package name */
    public static final long f445v0 = 2097152;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f446w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f447x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f448y0 = 2;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f449z0 = 3;
    public final int O;
    public final long P;
    public final long Q;
    public final float R;
    public final long S;
    public final int T;
    public final CharSequence U;
    public final long V;
    public final ArrayList W;
    public final long X;
    public final Bundle Y;
    public Object Z;

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public final Object[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {
        public c() {
            new ArrayList();
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

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.O = i10;
        this.P = j10;
        this.Q = j11;
        this.R = f10;
        this.S = j12;
        this.T = i11;
        this.U = charSequence;
        this.V = j13;
        this.W = new ArrayList(arrayList);
        this.X = j14;
        this.Y = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        Object obj2 = obj;
        ArrayList arrayList = null;
        if (obj2 == null) {
            return null;
        }
        List<Object> d10 = p.d(obj);
        if (d10 != null) {
            arrayList = new ArrayList(d10.size());
            for (Object a10 : d10) {
                arrayList.add(CustomAction.a(a10));
            }
        }
        Bundle a11 = q.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(p.i(obj), p.h(obj), p.c(obj), p.g(obj), p.a(obj), 0, p.e(obj), p.f(obj), arrayList, p.b(obj), a11);
        playbackStateCompat.Z = obj2;
        return playbackStateCompat;
    }

    public static int b(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        if (j10 == 512) {
            return 85;
        }
        return 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.O + ", position=" + this.P + ", buffered position=" + this.Q + ", speed=" + this.R + ", updated=" + this.V + ", actions=" + this.S + ", error code=" + this.T + ", error message=" + this.U + ", custom actions=" + this.W + ", active item id=" + this.X + "}";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeLong(this.P);
        parcel.writeFloat(this.R);
        parcel.writeLong(this.V);
        parcel.writeLong(this.Q);
        parcel.writeLong(this.S);
        TextUtils.writeToParcel(this.U, parcel, i10);
        parcel.writeTypedList(this.W);
        parcel.writeLong(this.X);
        parcel.writeBundle(this.Y);
        parcel.writeInt(this.T);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String O;
        public final CharSequence P;
        public final int Q;
        public final Bundle R;
        public Object S;

        public static class a implements Parcelable.Creator<CustomAction> {
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public final Object[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public static final class b {
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.O = str;
            this.P = charSequence;
            this.Q = i10;
            this.R = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(p.a.a(obj), p.a.d(obj), p.a.c(obj), p.a.b(obj));
            customAction.S = obj;
            return customAction;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.P + ", mIcon=" + this.Q + ", mExtras=" + this.R;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.O);
            TextUtils.writeToParcel(this.P, parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeBundle(this.R);
        }

        public CustomAction(Parcel parcel) {
            this.O = parcel.readString();
            this.P = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Q = parcel.readInt();
            this.R = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readLong();
        this.R = parcel.readFloat();
        this.V = parcel.readLong();
        this.Q = parcel.readLong();
        this.S = parcel.readLong();
        this.U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.W = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.X = parcel.readLong();
        this.Y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.T = parcel.readInt();
    }
}
