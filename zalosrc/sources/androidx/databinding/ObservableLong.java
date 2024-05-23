package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableLong extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C1651a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private long f6692q;

    /* renamed from: androidx.databinding.ObservableLong$a */
    /* loaded from: classes2.dex */
    class C1651a implements Parcelable.Creator {
        C1651a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableLong[] newArray(int i11) {
            return new ObservableLong[i11];
        }
    }

    public ObservableLong(long j11) {
        this.f6692q = j11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f6692q);
    }
}
