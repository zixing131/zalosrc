package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableFloat extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C1649a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private float f6690q;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    /* loaded from: classes2.dex */
    class C1649a implements Parcelable.Creator {
        C1649a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableFloat[] newArray(int i11) {
            return new ObservableFloat[i11];
        }
    }

    public ObservableFloat(float f11) {
        this.f6690q = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f6690q);
    }
}
