package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableParcelable<T extends Parcelable> extends AbstractC1675i implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C1652a();
    static final long serialVersionUID = 1;

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    /* loaded from: classes2.dex */
    class C1652a implements Parcelable.Creator {
        C1652a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableParcelable[] newArray(int i11) {
            return new ObservableParcelable[i11];
        }
    }

    public ObservableParcelable(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable((Parcelable) m8556e(), 0);
    }
}
