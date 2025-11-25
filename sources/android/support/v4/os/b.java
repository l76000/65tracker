package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import e.a1;
import e.o0;

@SuppressLint({"BanParcelableUsage"})
@a1
/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public a O;

    /* compiled from: ResultReceiver */
    public class a implements Parcelable.Creator<b> {
        public final Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public final Object[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: android.support.v4.os.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    public class C0022b extends a.b {
        public C0022b() {
        }

        public final void q5(int i10, Bundle bundle) {
            b bVar = b.this;
            bVar.getClass();
            bVar.a(i10, bundle);
        }
    }

    /* compiled from: ResultReceiver */
    public class c implements Runnable {
        public c() {
            throw null;
        }

        public final void run() {
            throw null;
        }
    }

    public b(Parcel parcel) {
        this.O = a.b.v(parcel.readStrongBinder());
    }

    public final void b(int i10, Bundle bundle) {
        a aVar = this.O;
        if (aVar != null) {
            try {
                aVar.q5(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@o0 Parcel parcel, int i10) {
        synchronized (this) {
            if (this.O == null) {
                this.O = new C0022b();
            }
            parcel.writeStrongBinder(this.O.asBinder());
        }
    }

    public void a(int i10, Bundle bundle) {
    }
}
