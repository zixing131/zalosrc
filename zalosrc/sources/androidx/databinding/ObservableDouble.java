package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableDouble extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C1648a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private double f6689q;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    /* loaded from: classes2.dex */
    class C1648a implements Parcelable.Creator {
        C1648a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableDouble[] newArray(int i11) {
            return new ObservableDouble[i11];
        }
    }

    public ObservableDouble(double d11) {
        this.f6689q = d11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeDouble(this.f6689q);
    }
}
