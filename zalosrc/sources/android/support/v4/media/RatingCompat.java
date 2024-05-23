package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0974a();

    /* renamed from: p */
    private final int f3503p;

    /* renamed from: q */
    private final float f3504q;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes2.dex */
    static class C0974a implements Parcelable.Creator {
        C0974a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i11) {
            return new RatingCompat[i11];
        }
    }

    RatingCompat(int i11, float f11) {
        this.f3503p = i11;
        this.f3504q = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f3503p;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f3503p);
        sb2.append(" rating=");
        float f11 = this.f3504q;
        if (f11 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f11);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3503p);
        parcel.writeFloat(this.f3504q);
    }
}
