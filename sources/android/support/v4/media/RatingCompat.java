package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import e.a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 4;
    public static final int W = 5;
    public static final int X = 6;
    public final int O;
    public final float P;
    public Object Q;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public final Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readFloat(), parcel.readInt());
        }

        public final Object[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @a1
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public RatingCompat(float f10, int i10) {
        this.O = i10;
        this.P = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = b(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = e(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = c(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = f(ratingStyle);
            }
            ratingCompat.Q = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat b(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(f10, 1);
    }

    public static RatingCompat c(float f10) {
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return new RatingCompat(f10, 6);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat d(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else if (i10 != 5) {
            Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
            return null;
        } else {
            f11 = 5.0f;
        }
        if (f10 >= 0.0f && f10 <= f11) {
            return new RatingCompat(f10, i10);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat e(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return new RatingCompat(f10, 2);
    }

    public static RatingCompat f(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(-1.0f, i10);
            default:
                return null;
        }
    }

    public final int describeContents() {
        return this.O;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.O);
        sb.append(" rating=");
        float f10 = this.P;
        if (f10 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f10);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeFloat(this.P);
    }
}
