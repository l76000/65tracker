package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.b;

/* compiled from: IResultReceiver */
public interface a extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f454b = "android.support.v4.os.IResultReceiver";

    /* compiled from: IResultReceiver */
    public static class c {
    }

    void q5(int i10, Bundle bundle);

    /* compiled from: IResultReceiver */
    public static abstract class b extends Binder implements a {

        /* renamed from: android.support.v4.os.a$b$a  reason: collision with other inner class name */
        /* compiled from: IResultReceiver */
        public static class C0021a implements a {

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f455i;

            public C0021a(IBinder iBinder) {
                this.f455i = iBinder;
            }

            public final IBinder asBinder() {
                return this.f455i;
            }

            public final void q5(int i10, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f454b);
                    obtain.writeInt(i10);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f455i.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, a.f454b);
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f454b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0021a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            Object obj;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(a.f454b);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(a.f454b);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator.createFromParcel(parcel);
                } else {
                    obj = null;
                }
                ((b.C0022b) this).q5(readInt, (Bundle) obj);
                return true;
            }
        }

        public final IBinder asBinder() {
            return this;
        }
    }

    /* renamed from: android.support.v4.os.a$a  reason: collision with other inner class name */
    /* compiled from: IResultReceiver */
    public static class C0020a implements a {
        public final IBinder asBinder() {
            return null;
        }

        public final void q5(int i10, Bundle bundle) {
        }
    }
}
