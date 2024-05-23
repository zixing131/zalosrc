package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableInt extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C1650a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private int f6691q;

    /* renamed from: androidx.databinding.ObservableInt$a */
    /* loaded from: classes2.dex */
    class C1650a implements Parcelable.Creator {
        C1650a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableInt[] newArray(int i11) {
            return new ObservableInt[i11];
        }
    }

    public ObservableInt(int i11) {
        this.f6691q = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6691q);
    }
}
