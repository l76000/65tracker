package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: ITrustedWebActivityCallback */
public interface a extends IInterface {

    /* renamed from: android.support.customtabs.trusted.a$a  reason: collision with other inner class name */
    /* compiled from: ITrustedWebActivityCallback */
    public static class C0007a implements a {
        public final IBinder asBinder() {
            return null;
        }
    }

    void E0();

    /* compiled from: ITrustedWebActivityCallback */
    public static abstract class b extends Binder implements a {

        /* renamed from: android.support.customtabs.trusted.a$b$a  reason: collision with other inner class name */
        /* compiled from: ITrustedWebActivityCallback */
        public static class C0008a implements a {

            /* renamed from: j  reason: collision with root package name */
            public static a f275j;

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f276i;

            public C0008a(IBinder iBinder) {
                this.f276i = iBinder;
            }

            public final IBinder asBinder() {
                return this.f276i;
            }
        }

        public b() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityCallback");
        }

        public static a d0() {
            return C0008a.f275j;
        }

        public static boolean j0(a aVar) {
            if (C0008a.f275j != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (aVar == null) {
                return false;
            } else {
                C0008a.f275j = aVar;
                return true;
            }
        }

        public static a v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0008a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 2) {
                parcel.enforceInterface("android.support.customtabs.trusted.ITrustedWebActivityCallback");
                parcel.readString();
                if (parcel.readInt() != 0) {
                    Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                E0();
                throw null;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("android.support.customtabs.trusted.ITrustedWebActivityCallback");
                return true;
            }
        }

        public final IBinder asBinder() {
            return this;
        }
    }
}
