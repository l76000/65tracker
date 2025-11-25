package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.o;
import android.support.v4.media.p;
import android.support.v4.media.q;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import e.a1;
import e.o0;
import e.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f281b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: c  reason: collision with root package name */
    public static final String f282c = "android.media.browse.extra.PAGE";

    /* renamed from: d  reason: collision with root package name */
    public static final String f283d = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: e  reason: collision with root package name */
    public static final String f284e = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: f  reason: collision with root package name */
    public static final String f285f = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: g  reason: collision with root package name */
    public static final String f286g = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: h  reason: collision with root package name */
    public static final String f287h = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a  reason: collision with root package name */
    public final g f288a;

    public static class ItemReceiver extends android.support.v4.os.b {
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey(androidx.media.g.T)) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable(androidx.media.g.T);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    public static class SearchResultReceiver extends android.support.v4.os.b {
        public final void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey(androidx.media.g.U)) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(androidx.media.g.U);
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            throw null;
        }
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<j> f289a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f290b;

        public a(j jVar) {
            this.f289a = new WeakReference<>(jVar);
        }

        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f290b;
            if (weakReference != null && weakReference.get() != null) {
                WeakReference<j> weakReference2 = this.f289a;
                if (weakReference2.get() != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    j jVar = weakReference2.get();
                    Messenger messenger = this.f290b.get();
                    try {
                        int i10 = message.what;
                        if (i10 == 1) {
                            MediaSessionCompat.a(data.getBundle(androidx.media.b.f6765k));
                            jVar.c(messenger, data.getString(androidx.media.b.f6758d), (MediaSessionCompat.Token) data.getParcelable(androidx.media.b.f6760f));
                        } else if (i10 == 2) {
                            jVar.b(messenger);
                        } else if (i10 != 3) {
                            Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        } else {
                            Bundle bundle = data.getBundle(androidx.media.b.f6761g);
                            MediaSessionCompat.a(bundle);
                            MediaSessionCompat.a(data.getBundle(androidx.media.b.f6762h));
                            String string = data.getString(androidx.media.b.f6758d);
                            data.getParcelableArrayList(androidx.media.b.f6759e);
                            jVar.a(messenger, string, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                        if (message.what == 1) {
                            jVar.b(messenger);
                        }
                    }
                }
            }
        }
    }

    public static abstract class c {
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final Object f294a = p.a(new a());

        public class a implements p.a {
            public a() {
            }

            public final void a() {
                d.this.getClass();
            }

            public final void b(Parcel parcel) {
                d dVar = d.this;
                if (parcel == null) {
                    dVar.getClass();
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem createFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                dVar.getClass();
            }
        }
    }

    public interface e {
    }

    @w0
    public static class g extends f {
        public g(Context context, ComponentName componentName, b bVar) {
            super(context, componentName, bVar);
        }
    }

    @w0
    public static class h extends g {
        public h(Context context, ComponentName componentName, b bVar) {
            super(context, componentName, bVar);
        }
    }

    public static class i implements e, j {

        /* renamed from: a  reason: collision with root package name */
        public int f304a;

        /* renamed from: b  reason: collision with root package name */
        public a f305b;

        /* renamed from: c  reason: collision with root package name */
        public l f306c;

        /* renamed from: d  reason: collision with root package name */
        public Messenger f307d;

        /* renamed from: e  reason: collision with root package name */
        public String f308e;

        /* renamed from: f  reason: collision with root package name */
        public MediaSessionCompat.Token f309f;

        public class a implements ServiceConnection {

            /* renamed from: android.support.v4.media.MediaBrowserCompat$i$a$a  reason: collision with other inner class name */
            public class C0013a implements Runnable {
                public final void run() {
                    if (MediaBrowserCompat.f281b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + null + " binder=" + null);
                        throw null;
                    }
                    throw null;
                }
            }

            public class b implements Runnable {
                public final void run() {
                    if (MediaBrowserCompat.f281b) {
                        StringBuilder sb = new StringBuilder("MediaServiceConnection.onServiceDisconnected name=");
                        sb.append((Object) null);
                        sb.append(" this=");
                        sb.append(this);
                        sb.append(" mServiceConnection=");
                        throw null;
                    }
                    throw null;
                }
            }

            public final boolean a(String str) {
                throw null;
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                Thread.currentThread();
                throw null;
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                Thread.currentThread();
                throw null;
            }
        }

        public i() {
            throw null;
        }

        public static String f(int i10) {
            if (i10 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i10 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i10 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i10 != 4) {
                return h.k("UNKNOWN/", i10);
            }
            return "CONNECT_STATE_SUSPENDED";
        }

        public final void a(Messenger messenger, String str, Bundle bundle) {
            if (g(messenger, "onLoadChildren")) {
                if (MediaBrowserCompat.f281b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for null id=" + str);
                }
                throw null;
            }
        }

        public final void b(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for null");
            if (g(messenger, "onConnectFailed")) {
                if (this.f304a != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + f(this.f304a) + "... ignoring");
                    return;
                }
                e();
                throw null;
            }
        }

        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
            if (g(messenger, "onConnect")) {
                if (this.f304a != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + f(this.f304a) + "... ignoring");
                    return;
                }
                this.f308e = str;
                this.f309f = token;
                this.f304a = 3;
                if (MediaBrowserCompat.f281b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    d();
                }
                throw null;
            }
        }

        public final void d() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=null");
            Log.d("MediaBrowserCompat", "  mCallback=null");
            Log.d("MediaBrowserCompat", "  mRootHints=null");
            Log.d("MediaBrowserCompat", "  mState=" + f(this.f304a));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f305b);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f306c);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f307d);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f308e);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f309f);
        }

        public final void e() {
            if (this.f305b != null) {
                throw null;
            }
            this.f304a = 1;
            this.f305b = null;
            this.f306c = null;
            this.f307d = null;
            throw null;
        }

        public final boolean g(Messenger messenger, String str) {
            int i10;
            if (this.f307d == messenger && (i10 = this.f304a) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.f304a;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            StringBuilder w9 = h.w(str, " for null with mCallbacksMessenger=");
            w9.append(this.f307d);
            w9.append(" this=");
            w9.append(this);
            Log.i("MediaBrowserCompat", w9.toString());
            return false;
        }
    }

    public interface j {
        void a(Messenger messenger, String str, Bundle bundle);

        void b(Messenger messenger);

        void c(Messenger messenger, String str, MediaSessionCompat.Token token);
    }

    public static abstract class k {
    }

    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f310a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f311b;

        public l(IBinder iBinder, Bundle bundle) {
            this.f310a = new Messenger(iBinder);
            this.f311b = bundle;
        }

        public final void a(int i10, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f310a.send(obtain);
        }
    }

    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f312a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f313b = new ArrayList();

        public final void a(Bundle bundle) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f313b;
                if (i10 >= arrayList.size()) {
                    return;
                }
                if (androidx.media.a.a((Bundle) arrayList.get(i10), bundle)) {
                    n nVar = (n) this.f312a.get(i10);
                    return;
                }
                i10++;
            }
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        public final Object f314a;

        public class a implements o.d {
            public a() {
            }

            public final void a() {
                n.this.getClass();
            }

            public final void b(List list) {
                n.this.getClass();
                MediaItem.b(list);
            }
        }

        public class b extends a implements q.a {
            public b() {
                super();
            }

            public final void c(List list) {
                MediaItem.b(list);
                n.this.getClass();
            }

            public final void d() {
                n.this.getClass();
            }
        }

        public n() {
            new Binder();
            if (Build.VERSION.SDK_INT >= 26) {
                new q.b(new b());
            } else {
                this.f314a = o.d(new a());
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f288a = new h(context, componentName, bVar);
        } else {
            this.f288a = new g(context, componentName, bVar);
        }
    }

    public final void a() {
        o.a(this.f288a.f297b);
    }

    public final void b() {
        Messenger messenger;
        g gVar = this.f288a;
        l lVar = gVar.f301f;
        if (!(lVar == null || (messenger = gVar.f302g) == null)) {
            try {
                lVar.a(7, (Bundle) null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        o.e(gVar.f297b);
    }

    @o0
    public final MediaSessionCompat.Token c() {
        g gVar = this.f288a;
        if (gVar.f303h == null) {
            gVar.f303h = MediaSessionCompat.Token.b(o.i(gVar.f297b));
        }
        return gVar.f303h;
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int Q = 1;
        public static final int R = 2;
        public final int O;
        public final MediaDescriptionCompat P;

        public static class a implements Parcelable.Creator<MediaItem> {
            public final Object createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final Object[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        @a1
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public MediaItem(@o0 MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.O)) {
                this.O = i10;
                this.P = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.a(o.c.a(obj)), o.c.b(obj));
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.O + ", mDescription=" + this.P + '}';
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            this.P.writeToParcel(parcel, i10);
        }

        public MediaItem(Parcel parcel) {
            this.O = parcel.readInt();
            this.P = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f291a = o.c(new C0012b());

        /* renamed from: b  reason: collision with root package name */
        public a f292b;

        public interface a {
            void v();

            void w();

            void x();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        public class C0012b implements o.a {
            public C0012b() {
            }

            public final void v() {
                b bVar = b.this;
                a aVar = bVar.f292b;
                if (aVar != null) {
                    aVar.v();
                }
                bVar.a();
            }

            public final void w() {
                b bVar = b.this;
                a aVar = bVar.f292b;
                if (aVar != null) {
                    aVar.w();
                }
                bVar.c();
            }

            public final void x() {
                b bVar = b.this;
                a aVar = bVar.f292b;
                if (aVar != null) {
                    aVar.x();
                }
                bVar.b();
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    @w0
    public static class f implements e, j, b.a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f296a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f297b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f298c;

        /* renamed from: d  reason: collision with root package name */
        public final a f299d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        public final androidx.collection.b<String, m> f300e = new androidx.collection.b<>();

        /* renamed from: f  reason: collision with root package name */
        public l f301f;

        /* renamed from: g  reason: collision with root package name */
        public Messenger f302g;

        /* renamed from: h  reason: collision with root package name */
        public MediaSessionCompat.Token f303h;

        public f(Context context, ComponentName componentName, b bVar) {
            this.f296a = context;
            Bundle bundle = new Bundle();
            this.f298c = bundle;
            bundle.putInt(androidx.media.b.f6770p, 1);
            bVar.f292b = this;
            this.f297b = o.b(context, componentName, bVar.f291a, bundle);
        }

        public final void a(Messenger messenger, String str, Bundle bundle) {
            if (this.f302g == messenger) {
                m orDefault = this.f300e.getOrDefault(str, null);
                if (orDefault != null) {
                    orDefault.a(bundle);
                } else if (MediaBrowserCompat.f281b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        public final void v() {
            Object obj = this.f297b;
            Bundle f10 = o.f(obj);
            if (f10 != null) {
                f10.getInt(androidx.media.b.f6771q, 0);
                IBinder a10 = androidx.core.app.o.a(f10, androidx.media.b.f6772r);
                if (a10 != null) {
                    this.f301f = new l(a10, this.f298c);
                    a aVar = this.f299d;
                    Messenger messenger = new Messenger(aVar);
                    this.f302g = messenger;
                    aVar.getClass();
                    aVar.f290b = new WeakReference<>(messenger);
                    try {
                        l lVar = this.f301f;
                        Context context = this.f296a;
                        Messenger messenger2 = this.f302g;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString(androidx.media.b.f6763i, context.getPackageName());
                        bundle.putBundle(androidx.media.b.f6765k, lVar.f311b);
                        lVar.a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b v9 = b.a.v(androidx.core.app.o.a(f10, androidx.media.b.f6773s));
                if (v9 != null) {
                    this.f303h = MediaSessionCompat.Token.c(o.i(obj), v9);
                }
            }
        }

        public final void w() {
            this.f301f = null;
            this.f302g = null;
            this.f303h = null;
            a aVar = this.f299d;
            aVar.getClass();
            aVar.f290b = new WeakReference<>((Object) null);
        }

        public final void x() {
        }

        public final void b(Messenger messenger) {
        }

        public final void c(Messenger messenger, String str, MediaSessionCompat.Token token) {
        }
    }

    public static class CustomActionResultReceiver extends android.support.v4.os.b {
        public final void a(int i10, Bundle bundle) {
        }
    }
}
