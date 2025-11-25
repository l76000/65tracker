package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: ITrustedWebActivityService */
public interface b extends IInterface {

    /* compiled from: ITrustedWebActivityService */
    public static class a implements b {
        public final IBinder asBinder() {
            return null;
        }
    }

    void A3(Bundle bundle);

    Bundle J3(Bundle bundle);

    int T2();

    Bundle X2();

    Bundle a3(Bundle bundle);

    Bundle d1();

    void u0(IBinder iBinder);

    /* renamed from: android.support.customtabs.trusted.b$b  reason: collision with other inner class name */
    /* compiled from: ITrustedWebActivityService */
    public static abstract class C0009b extends Binder implements b {

        /* renamed from: android.support.customtabs.trusted.b$b$a */
        /* compiled from: ITrustedWebActivityService */
        public static class a implements b {

            /* renamed from: j  reason: collision with root package name */
            public static b f277j;

            /* renamed from: i  reason: collision with root package name */
            public final IBinder f278i;

            public a(IBinder iBinder) {
                this.f278i = iBinder;
            }

            public final IBinder asBinder() {
                return this.f278i;
            }
        }

        public C0009b() {
            attachInterface(this, "android.support.customtabs.trusted.ITrustedWebActivityService");
        }

        public static b d0() {
            return a.f277j;
        }

        public static boolean j0(b bVar) {
            if (a.f277j != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (bVar == null) {
                return false;
            } else {
                a.f277j = bVar;
                return true;
            }
        }

        public static b v(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.trusted.ITrustedWebActivityService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) {
            /*
                r3 = this;
                r0 = 9
                r1 = 1
                java.lang.String r2 = "android.support.customtabs.trusted.ITrustedWebActivityService"
                if (r4 == r0) goto L_0x00a2
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r0) goto L_0x009e
                r0 = 0
                switch(r4) {
                    case 2: goto L_0x007e;
                    case 3: goto L_0x0065;
                    case 4: goto L_0x0057;
                    case 5: goto L_0x0046;
                    case 6: goto L_0x0026;
                    case 7: goto L_0x0015;
                    default: goto L_0x0010;
                }
            L_0x0010:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0015:
                r5.enforceInterface(r2)
                android.os.Bundle r4 = r3.X2()
                r6.writeNoException()
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                return r1
            L_0x0026:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0038
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0038:
                android.os.Bundle r4 = r3.a3(r0)
                r6.writeNoException()
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                return r1
            L_0x0046:
                r5.enforceInterface(r2)
                android.os.Bundle r4 = r3.d1()
                r6.writeNoException()
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                return r1
            L_0x0057:
                r5.enforceInterface(r2)
                int r4 = r3.T2()
                r6.writeNoException()
                r6.writeInt(r4)
                return r1
            L_0x0065:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0077
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0077:
                r3.A3(r0)
                r6.writeNoException()
                return r1
            L_0x007e:
                r5.enforceInterface(r2)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0090
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x0090:
                android.os.Bundle r4 = r3.J3(r0)
                r6.writeNoException()
                r6.writeInt(r1)
                r4.writeToParcel(r6, r1)
                return r1
            L_0x009e:
                r6.writeString(r2)
                return r1
            L_0x00a2:
                r5.enforceInterface(r2)
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b6
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L_0x00b6:
                android.os.IBinder r4 = r5.readStrongBinder()
                r3.u0(r4)
                r6.writeNoException()
                r4 = 0
                r6.writeInt(r4)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.trusted.b.C0009b.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public final IBinder asBinder() {
            return this;
        }
    }
}
