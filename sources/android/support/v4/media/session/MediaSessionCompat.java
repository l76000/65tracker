package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.l;
import android.support.v4.media.session.n;
import android.support.v4.media.session.o;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.core.app.o;
import androidx.media.a0;
import androidx.media.g0;
import e.a1;
import e.o0;
import e.q0;
import e.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {
    @a1
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @a1
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @a1
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @a1
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @a1
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @a1
    public static final String F = "android.support.v4.media.session.TOKEN";
    @a1
    public static final String G = "android.support.v4.media.session.EXTRA_BINDER";
    @a1
    public static final String H = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";

    /* renamed from: c  reason: collision with root package name */
    public static final int f382c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f383d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f384e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final String f385f = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: g  reason: collision with root package name */
    public static final String f386g = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: h  reason: collision with root package name */
    public static final String f387h = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: i  reason: collision with root package name */
    public static final String f388i = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: j  reason: collision with root package name */
    public static final String f389j = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: k  reason: collision with root package name */
    public static final String f390k = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: l  reason: collision with root package name */
    public static final int f391l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f392m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f393n = 2;
    @a1

    /* renamed from: o  reason: collision with root package name */
    public static final String f394o = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @a1

    /* renamed from: p  reason: collision with root package name */
    public static final String f395p = "android.support.v4.media.session.action.PREPARE";
    @a1

    /* renamed from: q  reason: collision with root package name */
    public static final String f396q = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @a1

    /* renamed from: r  reason: collision with root package name */
    public static final String f397r = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @a1

    /* renamed from: s  reason: collision with root package name */
    public static final String f398s = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @a1

    /* renamed from: t  reason: collision with root package name */
    public static final String f399t = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @a1

    /* renamed from: u  reason: collision with root package name */
    public static final String f400u = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @a1

    /* renamed from: v  reason: collision with root package name */
    public static final String f401v = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @a1

    /* renamed from: w  reason: collision with root package name */
    public static final String f402w = "android.support.v4.media.session.action.SET_RATING";
    @a1

    /* renamed from: x  reason: collision with root package name */
    public static final String f403x = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    @a1

    /* renamed from: y  reason: collision with root package name */
    public static final String f404y = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @a1

    /* renamed from: z  reason: collision with root package name */
    public static final String f405z = "android.support.v4.media.session.action.ARGUMENT_URI";

    /* renamed from: a  reason: collision with root package name */
    public final b f406a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaControllerCompat f407b;

    @a1
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public final ResultReceiver O;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public final Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final Object[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.O = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.O.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object O;
        public b P;
        public Bundle Q;

        public static class a implements Parcelable.Creator<Token> {
            public final Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null), (b) null, (Bundle) null);
            }

            public final Object[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token() {
            throw null;
        }

        public Token(Object obj, b bVar, Bundle bundle) {
            this.O = obj;
            this.P = bVar;
            this.Q = bundle;
        }

        @a1
        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            b v9 = b.a.v(o.a(bundle, MediaSessionCompat.G));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.H);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.F);
            if (token == null) {
                return null;
            }
            return new Token(token.O, v9, bundle2);
        }

        public static Token b(Object obj) {
            return c(obj, (b) null);
        }

        @a1
        public static Token c(Object obj, b bVar) {
            if (obj != null) {
                return new Token(l.u(obj), bVar, (Bundle) null);
            }
            return null;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.O;
            if (obj2 != null) {
                Object obj3 = token.O;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.O == null) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            Object obj = this.O;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.O, i10);
        }
    }

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f408a = o.a(new d());

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<b> f409b;

        /* renamed from: c  reason: collision with root package name */
        public C0015a f410c = null;

        /* renamed from: d  reason: collision with root package name */
        public boolean f411d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        public class C0015a extends Handler {
            public C0015a(Looper looper) {
                super(looper);
            }

            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    a.this.a((a0.b) message.obj);
                }
            }
        }

        @w0
        public class b implements l.a {
            public b() {
            }

            public final void i() {
                a.this.getClass();
            }

            public final void j() {
                a.this.getClass();
            }

            public final void k() {
                a.this.getClass();
            }

            public final void l() {
                a.this.getClass();
            }

            public final void m() {
                a.this.getClass();
            }

            public final void n(String str, Bundle bundle, ResultReceiver resultReceiver) {
                IBinder iBinder;
                try {
                    boolean equals = str.equals(MediaControllerCompat.f360c);
                    a aVar = a.this;
                    if (equals) {
                        e eVar = (e) aVar.f409b.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar.f417b;
                            b bVar = token.P;
                            if (bVar == null) {
                                iBinder = null;
                            } else {
                                iBinder = bVar.asBinder();
                            }
                            o.b(bundle2, MediaSessionCompat.G, iBinder);
                            bundle2.putBundle(MediaSessionCompat.H, token.Q);
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals(MediaControllerCompat.f361d)) {
                        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f365h);
                        aVar.getClass();
                    } else if (str.equals(MediaControllerCompat.f362e)) {
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f365h);
                        bundle.getInt(MediaControllerCompat.f366i);
                        aVar.getClass();
                    } else if (str.equals(MediaControllerCompat.f363f)) {
                        MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.f365h);
                        aVar.getClass();
                    } else if (str.equals(MediaControllerCompat.f364g)) {
                        e eVar2 = (e) aVar.f409b.get();
                    } else {
                        aVar.getClass();
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }

            public final void o(Object obj) {
                RatingCompat.a(obj);
                a.this.getClass();
            }

            public final void p() {
                a.this.getClass();
            }

            public final void q() {
                a.this.getClass();
            }

            public final void r() {
                a.this.getClass();
            }

            public final void s() {
                a.this.getClass();
            }

            public final boolean t(Intent intent) {
                KeyEvent keyEvent;
                int i10 = Build.VERSION.SDK_INT;
                a aVar = a.this;
                if (i10 >= 27) {
                    aVar.getClass();
                    return false;
                }
                b bVar = aVar.f409b.get();
                if (bVar == null || aVar.f410c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                    return false;
                }
                a0.b c10 = bVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() > 0) {
                        aVar.a(c10);
                    } else if (aVar.f411d) {
                        aVar.f410c.removeMessages(1);
                        aVar.f411d = false;
                        bVar.c0();
                    } else {
                        aVar.f411d = true;
                        C0015a aVar2 = aVar.f410c;
                        aVar2.sendMessageDelayed(aVar2.obtainMessage(1, c10), (long) ViewConfiguration.getDoubleTapTimeout());
                    }
                    return true;
                }
                aVar.a(c10);
                return false;
            }

            public final void u() {
                a.this.getClass();
            }

            public final void v() {
                a.this.getClass();
            }

            public final void w(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle.getBundle(MediaSessionCompat.B));
                boolean equals = str.equals(MediaSessionCompat.f394o);
                a aVar = a.this;
                if (equals) {
                    Uri uri = (Uri) bundle.getParcelable(MediaSessionCompat.f405z);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f395p)) {
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f396q)) {
                    bundle.getString(MediaSessionCompat.f403x);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f397r)) {
                    bundle.getString(MediaSessionCompat.f404y);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f398s)) {
                    Uri uri2 = (Uri) bundle.getParcelable(MediaSessionCompat.f405z);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f399t)) {
                    bundle.getBoolean(MediaSessionCompat.C);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f400u)) {
                    bundle.getInt(MediaSessionCompat.D);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f401v)) {
                    bundle.getInt(MediaSessionCompat.E);
                    aVar.getClass();
                } else if (str.equals(MediaSessionCompat.f402w)) {
                    RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable(MediaSessionCompat.A);
                    aVar.getClass();
                } else {
                    aVar.getClass();
                }
            }
        }

        @w0
        public class c extends b implements n.a {
            public c() {
                super();
            }

            public final void b() {
                a.this.getClass();
            }
        }

        @w0
        public class d extends c implements o.a {
            public d() {
                super();
            }

            public final void a() {
                a.this.getClass();
            }

            public final void c() {
                a.this.getClass();
            }

            public final void d() {
                a.this.getClass();
            }

            public final void e() {
                a.this.getClass();
            }
        }

        public final void a(a0.b bVar) {
            if (this.f411d) {
                this.f411d = false;
                this.f410c.removeMessages(1);
                b bVar2 = this.f409b.get();
                if (bVar2 != null) {
                    PlaybackStateCompat c02 = bVar2.c0();
                    if (c02 != null) {
                        int i10 = c02.O;
                    }
                    bVar2.b();
                    bVar2.b();
                }
            }
        }
    }

    public interface b {
        Token a();

        void b();

        a0.b c();

        PlaybackStateCompat c0();
    }

    @w0
    public static class c extends g {
    }

    @w0
    public static class d extends c {
    }

    public interface h {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public MediaSessionCompat(Context context, e eVar) {
        new ArrayList();
        this.f406a = eVar;
        if (!l.d(eVar.f416a)) {
            eVar.d(new h(), new Handler());
        }
        this.f407b = new MediaControllerCompat(context, this);
    }

    @a1
    public static void a(@q0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat b(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, new e(obj));
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int R = -1;
        public final MediaDescriptionCompat O;
        public final long P;
        public final Object Q;

        public static class a implements Parcelable.Creator<QueueItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final Object[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j10 != -1) {
                this.O = mediaDescriptionCompat;
                this.P = j10;
                this.Q = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(l.c.b(obj)), l.c.c(obj));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.O + ", Id=" + this.P + " }";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            this.O.writeToParcel(parcel, i10);
            parcel.writeLong(this.P);
        }

        public QueueItem(Parcel parcel) {
            this.O = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.P = parcel.readLong();
        }
    }

    @w0
    public static class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f416a;

        /* renamed from: b  reason: collision with root package name */
        public final Token f417b;

        /* renamed from: c  reason: collision with root package name */
        public final RemoteCallbackList<a> f418c = new RemoteCallbackList<>();

        public e(Object obj) {
            Object t9 = l.t(obj);
            this.f416a = t9;
            this.f417b = new Token(l.c(t9), new a(), (Bundle) null);
        }

        public final Token a() {
            return this.f417b;
        }

        public a0.b c() {
            return null;
        }

        public final PlaybackStateCompat c0() {
            return null;
        }

        public final void d(a aVar, Handler handler) {
            Object obj;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f408a;
            }
            l.i(this.f416a, obj, handler);
            if (aVar != null) {
                aVar.f409b = new WeakReference<>(this);
                a.C0015a aVar2 = aVar.f410c;
                if (aVar2 != null) {
                    aVar2.removeCallbacksAndMessages((Object) null);
                }
                aVar.f410c = new a.C0015a(handler.getLooper());
            }
        }

        public class a extends b.a {
            public a() {
            }

            public final void A2() {
                throw new AssertionError();
            }

            public final void B2() {
                throw new AssertionError();
            }

            public final void C0() {
                throw new AssertionError();
            }

            public final void D1() {
                throw new AssertionError();
            }

            public final void G2() {
                throw new AssertionError();
            }

            public final void H2() {
                throw new AssertionError();
            }

            public final boolean H3() {
                e.this.getClass();
                return false;
            }

            public final ParcelableVolumeInfo H4() {
                throw new AssertionError();
            }

            public final CharSequence L1() {
                throw new AssertionError();
            }

            public final void M2() {
                throw new AssertionError();
            }

            public final boolean P2(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public final void P3() {
                throw new AssertionError();
            }

            public final MediaMetadataCompat S() {
                throw new AssertionError();
            }

            public final void T0() {
                throw new AssertionError();
            }

            public final void T1(a aVar) {
                e.this.f418c.unregister(aVar);
            }

            public final void T3() {
                throw new AssertionError();
            }

            public final void W1(ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public final List<QueueItem> X3() {
                return null;
            }

            public final void Y4() {
                throw new AssertionError();
            }

            public final boolean Z0() {
                throw new AssertionError();
            }

            public final String a0() {
                throw new AssertionError();
            }

            public final PlaybackStateCompat c0() {
                e eVar = e.this;
                eVar.getClass();
                eVar.getClass();
                return null;
            }

            public final void c4() {
                throw new AssertionError();
            }

            public final String d5() {
                throw new AssertionError();
            }

            public final void e2() {
                throw new AssertionError();
            }

            public final PendingIntent f1() {
                throw new AssertionError();
            }

            public final void f2() {
                throw new AssertionError();
            }

            public final void f4() {
                throw new AssertionError();
            }

            public final Bundle getExtras() {
                throw new AssertionError();
            }

            public final int h1() {
                e.this.getClass();
                return 0;
            }

            public final long i0() {
                throw new AssertionError();
            }

            public final void k3() {
                throw new AssertionError();
            }

            public final void l1() {
                throw new AssertionError();
            }

            public final void l2() {
                throw new AssertionError();
            }

            public final void l4() {
                throw new AssertionError();
            }

            public final void next() {
                throw new AssertionError();
            }

            public final void pause() {
                throw new AssertionError();
            }

            public final void previous() {
                throw new AssertionError();
            }

            public final void r0() {
                throw new AssertionError();
            }

            public final void s2() {
                throw new AssertionError();
            }

            public final void s4() {
                throw new AssertionError();
            }

            public final void stop() {
                throw new AssertionError();
            }

            public final void t1() {
                throw new AssertionError();
            }

            public final void u1() {
                throw new AssertionError();
            }

            public final void x0(a aVar) {
                e eVar = e.this;
                eVar.getClass();
                String b10 = o.b(eVar.f416a);
                if (b10 == null) {
                    b10 = a0.b.f6753b;
                }
                eVar.f418c.register(aVar, new a0.b(b10, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            public final int x3() {
                e.this.getClass();
                return 0;
            }

            public final int z4() {
                e.this.getClass();
                return 0;
            }

            public final void I0() {
            }

            public final void a1() {
            }
        }

        public void b() {
        }
    }

    public static class g implements b {

        public class a extends g0.a {
        }

        public static final class b {
            public b() {
                throw null;
            }
        }

        public class d extends Handler {
            public d() {
                throw null;
            }

            public final void handleMessage(Message message) {
                throw null;
            }
        }

        public final Token a() {
            return null;
        }

        public final void b() {
            throw null;
        }

        public final a0.b c() {
            throw null;
        }

        public final PlaybackStateCompat c0() {
            throw null;
        }

        public class c extends b.a {
            public final void A2() {
                throw null;
            }

            public final void B2() {
                throw null;
            }

            public final void C0() {
                throw null;
            }

            public final void D1() {
                throw null;
            }

            public final void G2() {
                throw null;
            }

            public final void H2() {
                throw null;
            }

            public final boolean H3() {
                throw null;
            }

            public final ParcelableVolumeInfo H4() {
                throw null;
            }

            public final CharSequence L1() {
                throw null;
            }

            public final void M2() {
                throw null;
            }

            public final boolean P2(KeyEvent keyEvent) {
                throw null;
            }

            public final void P3() {
                throw null;
            }

            public final MediaMetadataCompat S() {
                throw null;
            }

            public final void T0() {
                throw null;
            }

            public final void T1(a aVar) {
                throw null;
            }

            public final void T3() {
                throw null;
            }

            public final void W1(ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver = resultReceiverWrapper.O;
                throw null;
            }

            public final List<QueueItem> X3() {
                throw null;
            }

            public final void Y4() {
                throw null;
            }

            public final boolean Z0() {
                throw null;
            }

            public final String a0() {
                throw null;
            }

            public final PlaybackStateCompat c0() {
                throw null;
            }

            public final void c4() {
                throw null;
            }

            public final String d5() {
                throw null;
            }

            public final void e2() {
                throw null;
            }

            public final PendingIntent f1() {
                throw null;
            }

            public final void f2() {
                throw null;
            }

            public final void f4() {
                throw null;
            }

            public final Bundle getExtras() {
                throw null;
            }

            public final int h1() {
                throw null;
            }

            public final long i0() {
                throw null;
            }

            public final void k3() {
                throw null;
            }

            public final void l1() {
                throw null;
            }

            public final void l2() {
                throw null;
            }

            public final void l4() {
                throw null;
            }

            public final void next() {
                throw null;
            }

            public final void pause() {
                throw null;
            }

            public final void previous() {
                throw null;
            }

            public final void r0() {
                throw null;
            }

            public final void s2() {
                throw null;
            }

            public final void s4() {
                throw null;
            }

            public final void stop() {
                throw null;
            }

            public final void t1() {
                throw null;
            }

            public final void u1() {
                throw null;
            }

            public final void x0(a aVar) {
                throw null;
            }

            public final int x3() {
                throw null;
            }

            public final int z4() {
                throw null;
            }

            public final void I0() {
            }

            public final void a1() {
            }
        }
    }

    @w0
    public static class f extends e {
        @o0
        public final a0.b c() {
            return new a0.b(((MediaSession) this.f416a).getCurrentControllerInfo());
        }

        public final void b() {
        }
    }
}
