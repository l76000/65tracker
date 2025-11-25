package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* compiled from: IMediaSession */
public interface b extends IInterface {
    void A2();

    void B2();

    void C0();

    void D1();

    void G2();

    void H2();

    boolean H3();

    ParcelableVolumeInfo H4();

    void I0();

    CharSequence L1();

    void M2();

    boolean P2(KeyEvent keyEvent);

    void P3();

    MediaMetadataCompat S();

    void T0();

    void T1(a aVar);

    void T3();

    void W1(MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    List<MediaSessionCompat.QueueItem> X3();

    void Y4();

    boolean Z0();

    String a0();

    void a1();

    PlaybackStateCompat c0();

    void c4();

    String d5();

    void e2();

    PendingIntent f1();

    void f2();

    void f4();

    Bundle getExtras();

    int h1();

    long i0();

    void k3();

    void l1();

    void l2();

    void l4();

    void next();

    void pause();

    void previous();

    void r0();

    void s2();

    void s4();

    void stop();

    void t1();

    void u1();

    void x0(a aVar);

    int x3();

    int z4();

    /* compiled from: IMediaSession */
    public static abstract class a extends Binder implements b {

        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* compiled from: IMediaSession */
        public static class C0018a implements b {

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f451i;

            public C0018a(IBinder iBinder) {
                this.f451i = iBinder;
            }

            public final boolean P2(KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z9 = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f451i.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z9 = false;
                    }
                    return z9;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f451i;
            }

            public final void x0(a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f451i.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0018a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.KeyEvent} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 51
                java.lang.String r1 = "android.support.v4.media.session.IMediaSession"
                r2 = 1
                if (r5 == r0) goto L_0x03a3
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x039f
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x0375;
                    case 2: goto L_0x0358;
                    case 3: goto L_0x0346;
                    case 4: goto L_0x0334;
                    case 5: goto L_0x0326;
                    case 6: goto L_0x0318;
                    case 7: goto L_0x030a;
                    case 8: goto L_0x02f3;
                    case 9: goto L_0x02e5;
                    case 10: goto L_0x02ce;
                    case 11: goto L_0x02bb;
                    case 12: goto L_0x02a8;
                    case 13: goto L_0x029e;
                    case 14: goto L_0x0283;
                    case 15: goto L_0x0268;
                    case 16: goto L_0x0242;
                    case 17: goto L_0x0235;
                    case 18: goto L_0x022b;
                    case 19: goto L_0x0221;
                    case 20: goto L_0x0217;
                    case 21: goto L_0x020d;
                    case 22: goto L_0x0203;
                    case 23: goto L_0x01f9;
                    case 24: goto L_0x01ec;
                    case 25: goto L_0x01d4;
                    case 26: goto L_0x01b9;
                    case 27: goto L_0x01a0;
                    case 28: goto L_0x0189;
                    case 29: goto L_0x017b;
                    case 30: goto L_0x0164;
                    case 31: goto L_0x014d;
                    case 32: goto L_0x013f;
                    case 33: goto L_0x0135;
                    case 34: goto L_0x011a;
                    case 35: goto L_0x00ff;
                    case 36: goto L_0x00d9;
                    case 37: goto L_0x00cb;
                    case 38: goto L_0x00be;
                    case 39: goto L_0x00b1;
                    case 40: goto L_0x00a4;
                    case 41: goto L_0x008c;
                    case 42: goto L_0x0071;
                    case 43: goto L_0x0059;
                    case 44: goto L_0x004c;
                    case 45: goto L_0x003e;
                    case 46: goto L_0x0031;
                    case 47: goto L_0x0023;
                    case 48: goto L_0x0016;
                    default: goto L_0x0011;
                }
            L_0x0011:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0016:
                r6.enforceInterface(r1)
                r6.readInt()
                r4.f2()
                r7.writeNoException()
                return r2
            L_0x0023:
                r6.enforceInterface(r1)
                int r5 = r4.x3()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0031:
                r6.enforceInterface(r1)
                r6.readInt()
                r4.l1()
                r7.writeNoException()
                return r2
            L_0x003e:
                r6.enforceInterface(r1)
                boolean r5 = r4.H3()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x004c:
                r6.enforceInterface(r1)
                r6.readInt()
                r4.t1()
                r7.writeNoException()
                return r2
            L_0x0059:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x006a
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.MediaDescriptionCompat r5 = (android.support.v4.media.MediaDescriptionCompat) r5
            L_0x006a:
                r4.l2()
                r7.writeNoException()
                return r2
            L_0x0071:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0082
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.MediaDescriptionCompat r5 = (android.support.v4.media.MediaDescriptionCompat) r5
            L_0x0082:
                r6.readInt()
                r4.C0()
                r7.writeNoException()
                return r2
            L_0x008c:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x009d
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.MediaDescriptionCompat r5 = (android.support.v4.media.MediaDescriptionCompat) r5
            L_0x009d:
                r4.T0()
                r7.writeNoException()
                return r2
            L_0x00a4:
                r6.enforceInterface(r1)
                r6.readInt()
                r4.a1()
                r7.writeNoException()
                return r2
            L_0x00b1:
                r6.enforceInterface(r1)
                r6.readInt()
                r4.s2()
                r7.writeNoException()
                return r2
            L_0x00be:
                r6.enforceInterface(r1)
                r4.I0()
                r7.writeNoException()
                r7.writeInt(r0)
                return r2
            L_0x00cb:
                r6.enforceInterface(r1)
                int r5 = r4.z4()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x00d9:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ea
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
            L_0x00ea:
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f8
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x00f8:
                r4.M2()
                r7.writeNoException()
                return r2
            L_0x00ff:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0113
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0113:
                r4.P3()
                r7.writeNoException()
                return r2
            L_0x011a:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x012e
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x012e:
                r4.B2()
                r7.writeNoException()
                return r2
            L_0x0135:
                r6.enforceInterface(r1)
                r4.u1()
                r7.writeNoException()
                return r2
            L_0x013f:
                r6.enforceInterface(r1)
                int r5 = r4.h1()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x014d:
                r6.enforceInterface(r1)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0160
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x0163
            L_0x0160:
                r7.writeInt(r0)
            L_0x0163:
                return r2
            L_0x0164:
                r6.enforceInterface(r1)
                java.lang.CharSequence r5 = r4.L1()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0177
                r7.writeInt(r2)
                android.text.TextUtils.writeToParcel(r5, r7, r2)
                goto L_0x017a
            L_0x0177:
                r7.writeInt(r0)
            L_0x017a:
                return r2
            L_0x017b:
                r6.enforceInterface(r1)
                java.util.List r5 = r4.X3()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r2
            L_0x0189:
                r6.enforceInterface(r1)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.c0()
                r7.writeNoException()
                if (r5 == 0) goto L_0x019c
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x019f
            L_0x019c:
                r7.writeInt(r0)
            L_0x019f:
                return r2
            L_0x01a0:
                r6.enforceInterface(r1)
                android.support.v4.media.MediaMetadataCompat r5 = r4.S()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01b5
                r7.writeInt(r2)
                android.os.Bundle r5 = r5.O
                r7.writeBundle(r5)
                goto L_0x01b8
            L_0x01b5:
                r7.writeInt(r0)
            L_0x01b8:
                return r2
            L_0x01b9:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01cd
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x01cd:
                r4.s4()
                r7.writeNoException()
                return r2
            L_0x01d4:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x01e5
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5
            L_0x01e5:
                r4.H2()
                r7.writeNoException()
                return r2
            L_0x01ec:
                r6.enforceInterface(r1)
                r6.readLong()
                r4.l4()
                r7.writeNoException()
                return r2
            L_0x01f9:
                r6.enforceInterface(r1)
                r4.f4()
                r7.writeNoException()
                return r2
            L_0x0203:
                r6.enforceInterface(r1)
                r4.e2()
                r7.writeNoException()
                return r2
            L_0x020d:
                r6.enforceInterface(r1)
                r4.previous()
                r7.writeNoException()
                return r2
            L_0x0217:
                r6.enforceInterface(r1)
                r4.next()
                r7.writeNoException()
                return r2
            L_0x0221:
                r6.enforceInterface(r1)
                r4.stop()
                r7.writeNoException()
                return r2
            L_0x022b:
                r6.enforceInterface(r1)
                r4.pause()
                r7.writeNoException()
                return r2
            L_0x0235:
                r6.enforceInterface(r1)
                r6.readLong()
                r4.A2()
                r7.writeNoException()
                return r2
            L_0x0242:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0253
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
            L_0x0253:
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0261
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0261:
                r4.c4()
                r7.writeNoException()
                return r2
            L_0x0268:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x027c
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x027c:
                r4.r0()
                r7.writeNoException()
                return r2
            L_0x0283:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0297
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0297:
                r4.D1()
                r7.writeNoException()
                return r2
            L_0x029e:
                r6.enforceInterface(r1)
                r4.T3()
                r7.writeNoException()
                return r2
            L_0x02a8:
                r6.enforceInterface(r1)
                r6.readInt()
                r6.readInt()
                r6.readString()
                r4.k3()
                r7.writeNoException()
                return r2
            L_0x02bb:
                r6.enforceInterface(r1)
                r6.readInt()
                r6.readInt()
                r6.readString()
                r4.G2()
                r7.writeNoException()
                return r2
            L_0x02ce:
                r6.enforceInterface(r1)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.H4()
                r7.writeNoException()
                if (r5 == 0) goto L_0x02e1
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x02e4
            L_0x02e1:
                r7.writeInt(r0)
            L_0x02e4:
                return r2
            L_0x02e5:
                r6.enforceInterface(r1)
                long r5 = r4.i0()
                r7.writeNoException()
                r7.writeLong(r5)
                return r2
            L_0x02f3:
                r6.enforceInterface(r1)
                android.app.PendingIntent r5 = r4.f1()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0306
                r7.writeInt(r2)
                r5.writeToParcel(r7, r2)
                goto L_0x0309
            L_0x0306:
                r7.writeInt(r0)
            L_0x0309:
                return r2
            L_0x030a:
                r6.enforceInterface(r1)
                java.lang.String r5 = r4.a0()
                r7.writeNoException()
                r7.writeString(r5)
                return r2
            L_0x0318:
                r6.enforceInterface(r1)
                java.lang.String r5 = r4.d5()
                r7.writeNoException()
                r7.writeString(r5)
                return r2
            L_0x0326:
                r6.enforceInterface(r1)
                boolean r5 = r4.Z0()
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0334:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.v4.media.session.a.C0016a.v(r5)
                r4.T1(r5)
                r7.writeNoException()
                return r2
            L_0x0346:
                r6.enforceInterface(r1)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.a r5 = android.support.v4.media.session.a.C0016a.v(r5)
                r4.x0(r5)
                r7.writeNoException()
                return r2
            L_0x0358:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x036a
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x036a:
                boolean r5 = r4.P2(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r2
            L_0x0375:
                r6.enforceInterface(r1)
                r6.readString()
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0389
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x0389:
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0398
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r5 = android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r3 = (android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r3
            L_0x0398:
                r4.W1(r3)
                r7.writeNoException()
                return r2
            L_0x039f:
                r7.writeString(r1)
                return r2
            L_0x03a3:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03b4
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.v4.media.RatingCompat) r5
            L_0x03b4:
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03c2
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
            L_0x03c2:
                r4.Y4()
                r7.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.b.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public final IBinder asBinder() {
            return this;
        }
    }
}
