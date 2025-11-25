package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* compiled from: IMediaControllerCallback */
public interface a extends IInterface {
    void I4();

    void N();

    void V();

    void Z();

    void e4();

    void m4();

    /* renamed from: android.support.v4.media.session.a$a  reason: collision with other inner class name */
    /* compiled from: IMediaControllerCallback */
    public static abstract class C0016a extends Binder implements a {

        /* renamed from: android.support.v4.media.session.a$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaControllerCallback */
        public static class C0017a implements a {

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f450i;

            public C0017a(IBinder iBinder) {
                this.f450i = iBinder;
            }

            public final void Z() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f450i.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f450i;
            }
        }

        public C0016a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0017a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readString();
                        if (parcel.readInt() != 0) {
                            Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        MediaControllerCompat.a aVar = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        Z();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            PlaybackStateCompat createFromParcel = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        MediaControllerCompat.a aVar2 = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            MediaMetadataCompat createFromParcel2 = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        I4();
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
                        e4();
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        N();
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        V();
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            ParcelableVolumeInfo createFromParcel3 = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        m4();
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        MediaControllerCompat.a aVar3 = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        MediaControllerCompat.a aVar4 = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        parcel.readInt();
                        MediaControllerCompat.a aVar5 = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        MediaControllerCompat.a aVar6 = ((MediaControllerCompat.a.c) this).f377i.get();
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
        }

        public final IBinder asBinder() {
            return this;
        }
    }
}
