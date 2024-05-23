package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableBoolean extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C1645a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private boolean f6686q;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    /* loaded from: classes2.dex */
    class C1645a implements Parcelable.Creator {
        C1645a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z11 = true;
            if (parcel.readInt() != 1) {
                z11 = false;
            }
            return new ObservableBoolean(z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableBoolean[] newArray(int i11) {
            return new ObservableBoolean[i11];
        }
    }

    public ObservableBoolean(boolean z11) {
        this.f6686q = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6686q ? 1 : 0);
    }
}
