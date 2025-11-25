package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final Object[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo() {
        throw null;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.O = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.P = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.P);
    }
}
