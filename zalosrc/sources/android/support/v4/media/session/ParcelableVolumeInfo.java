package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0988a();

    /* renamed from: p */
    public int f3522p;

    /* renamed from: q */
    public int f3523q;

    /* renamed from: r */
    public int f3524r;

    /* renamed from: s */
    public int f3525s;

    /* renamed from: t */
    public int f3526t;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes2.dex */
    static class C0988a implements Parcelable.Creator {
        C0988a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f3522p = parcel.readInt();
        this.f3524r = parcel.readInt();
        this.f3525s = parcel.readInt();
        this.f3526t = parcel.readInt();
        this.f3523q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f3522p);
        parcel.writeInt(this.f3524r);
        parcel.writeInt(this.f3525s);
        parcel.writeInt(this.f3526t);
        parcel.writeInt(this.f3523q);
    }
}
