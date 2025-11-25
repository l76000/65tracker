package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f279a = "android.support.v4.app.INotificationSideChannel";

    /* compiled from: INotificationSideChannel */
    public static class c {
    }

    void H1(String str);

    void R4(int i10, Notification notification, String str, String str2);

    void X1(int i10, String str, String str2);

    /* compiled from: INotificationSideChannel */
    public static abstract class b extends Binder implements a {

        /* renamed from: android.support.v4.app.a$b$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        public static class C0011a implements a {

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f280i;

            public C0011a(IBinder iBinder) {
                this.f280i = iBinder;
            }

            public final void H1(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f279a);
                    obtain.writeString(str);
                    this.f280i.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void R4(int i10, Notification notification, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f279a);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f280i.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final void X1(int i10, String str, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f279a);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    this.f280i.transact(2, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f280i;
            }
        }

        public b() {
            attachInterface(this, a.f279a);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f279a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0011a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Object obj;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f279a);
            }
            if (i10 != 1598968902) {
                if (i10 == 1) {
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    String readString2 = parcel.readString();
                    Parcelable.Creator creator = Notification.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    R4(readInt, (Notification) obj, readString, readString2);
                } else if (i10 == 2) {
                    X1(parcel.readInt(), parcel.readString(), parcel.readString());
                } else if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    H1(parcel.readString());
                }
                return true;
            }
            parcel2.writeString(a.f279a);
            return true;
        }

        public final IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static class C0010a implements a {
        public final IBinder asBinder() {
            return null;
        }

        public final void H1(String str) {
        }

        public final void X1(int i10, String str, String str2) {
        }

        public final void R4(int i10, Notification notification, String str, String str2) {
        }
    }
}
