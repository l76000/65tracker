package android.support.v4.media.session;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.o;
import androidx.core.app.p;
import e.a1;
import e.b0;
import e.o0;
import e.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class MediaControllerCompat {
    @a1

    /* renamed from: c  reason: collision with root package name */
    public static final String f360c = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @a1

    /* renamed from: d  reason: collision with root package name */
    public static final String f361d = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @a1

    /* renamed from: e  reason: collision with root package name */
    public static final String f362e = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @a1

    /* renamed from: f  reason: collision with root package name */
    public static final String f363f = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @a1

    /* renamed from: g  reason: collision with root package name */
    public static final String f364g = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @a1

    /* renamed from: h  reason: collision with root package name */
    public static final String f365h = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @a1

    /* renamed from: i  reason: collision with root package name */
    public static final String f366i = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a  reason: collision with root package name */
    public final e f367a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaSessionCompat.Token f368b;

    @w0
    public static class MediaControllerImplApi21 implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f369a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f370b = new Object();
        @b0

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f371c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final HashMap<a, a> f372d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        public final MediaSessionCompat.Token f373e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public final WeakReference<MediaControllerImplApi21> O;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.O = new WeakReference<>(mediaControllerImplApi21);
            }

            public final void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.O.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f370b) {
                        mediaControllerImplApi21.f373e.P = b.a.v(o.a(bundle, MediaSessionCompat.G));
                        mediaControllerImplApi21.f373e.Q = bundle.getBundle(MediaSessionCompat.H);
                        mediaControllerImplApi21.a();
                    }
                }
            }
        }

        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            public final void I4() {
                throw new AssertionError();
            }

            public final void N() {
                throw new AssertionError();
            }

            public final void V() {
                throw new AssertionError();
            }

            public final void Z() {
                throw new AssertionError();
            }

            public final void e4() {
                throw new AssertionError();
            }

            public final void m4() {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f373e = token;
            Object d10 = c.d(context, token.O);
            this.f369a = d10;
            if (d10 == null) {
                throw new RemoteException();
            } else if (token.P == null) {
                c.s(d10, MediaControllerCompat.f360c, (Bundle) null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @b0
        public final void a() {
            MediaSessionCompat.Token token = this.f373e;
            if (token.P != null) {
                ArrayList arrayList = this.f371c;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    a aVar2 = new a(aVar);
                    this.f372d.put(aVar, aVar2);
                    aVar.f375b = aVar2;
                    try {
                        token.P.x0(aVar2);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                }
                arrayList.clear();
            }
        }
    }

    public static class b extends p.a {

        /* renamed from: a  reason: collision with root package name */
        public final MediaControllerCompat f378a;

        public b(MediaControllerCompat mediaControllerCompat) {
            this.f378a = mediaControllerCompat;
        }
    }

    public interface c {
    }

    @w0
    public static class d extends MediaControllerImplApi21 {
        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    @w0
    public static class e extends d {
        public e(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    public static class f implements c {
        public f() {
            throw null;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public static final int f379a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f380b = 2;

        public g() {
            throw null;
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public static final String f381a = "android.media.session.extra.LEGACY_STREAM_TYPE";
    }

    public static class i extends h {
    }

    @w0
    public static class j extends i {
    }

    @w0
    public static class k extends j {
    }

    public static class l extends h {
    }

    public MediaControllerCompat(Context context, @o0 MediaSessionCompat mediaSessionCompat) {
        e eVar;
        new HashSet();
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token a10 = mediaSessionCompat.f406a.a();
            this.f368b = a10;
            try {
                eVar = new e(context, a10);
            } catch (RemoteException e10) {
                Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e10);
                eVar = null;
            }
            this.f367a = eVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public static MediaControllerCompat b(@o0 Activity activity) {
        if (activity instanceof p) {
            b bVar = (b) ((p) activity).O.getOrDefault(b.class, null);
            if (bVar != null) {
                return bVar.f378a;
            }
            return null;
        }
        Object g10 = c.g(activity);
        if (g10 == null) {
            return null;
        }
        try {
            return new MediaControllerCompat((Context) activity, MediaSessionCompat.Token.b(c.p(g10)));
        } catch (RemoteException e10) {
            Log.e("MediaControllerCompat", "Dead object in getMediaController.", e10);
            return null;
        }
    }

    public static void c(@o0 Activity activity, MediaControllerCompat mediaControllerCompat) {
        Object obj;
        if (activity instanceof p) {
            ((p) activity).O.put(b.class, new b(mediaControllerCompat));
        }
        if (mediaControllerCompat != null) {
            obj = c.d(activity, mediaControllerCompat.f368b.O);
        } else {
            obj = null;
        }
        c.t(activity, obj);
    }

    public final void a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            c.c(this.f367a.f369a, keyEvent);
            return;
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaControllerCompat(Context context, @o0 MediaSessionCompat.Token token) {
        new HashSet();
        if (token != null) {
            this.f368b = token;
            this.f367a = new e(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final Object f374a = c.b(new b(this));

        /* renamed from: b  reason: collision with root package name */
        public a f375b;

        public static class b implements c.a {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f376a;

            public b(a aVar) {
                this.f376a = new WeakReference<>(aVar);
            }

            public final void N() {
                a aVar = this.f376a.get();
            }

            public final void V() {
                a aVar = this.f376a.get();
            }

            public final void Z() {
                a aVar = this.f376a.get();
            }

            public final void a(Object obj) {
                if (this.f376a.get() != null) {
                    MediaMetadataCompat.a(obj);
                }
            }

            public final void b(List<?> list) {
                if (this.f376a.get() != null) {
                    MediaSessionCompat.QueueItem.b(list);
                }
            }

            public final void c(Object obj) {
                a aVar = this.f376a.get();
                if (aVar != null && aVar.f375b == null) {
                    PlaybackStateCompat.a(obj);
                }
            }

            public final void d() {
                a aVar = this.f376a.get();
            }

            public final void e() {
                a aVar = this.f376a.get();
            }
        }

        public static class c extends a.C0016a {

            /* renamed from: i  reason: collision with root package name */
            public final WeakReference<a> f377i;

            public c(a aVar) {
                this.f377i = new WeakReference<>(aVar);
            }

            public void I4() {
                a aVar = this.f377i.get();
            }

            public void N() {
                a aVar = this.f377i.get();
            }

            public void V() {
                a aVar = this.f377i.get();
            }

            public void Z() {
                a aVar = this.f377i.get();
            }

            public void e4() {
                a aVar = this.f377i.get();
            }

            public void m4() {
                a aVar = this.f377i.get();
            }
        }

        public final void binderDied() {
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        public class C0014a extends Handler {
            public final void handleMessage(Message message) {
            }
        }
    }
}
