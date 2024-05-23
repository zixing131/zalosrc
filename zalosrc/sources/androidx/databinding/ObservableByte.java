package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableByte extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C1646a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private byte f6687q;

    /* renamed from: androidx.databinding.ObservableByte$a */
    /* loaded from: classes2.dex */
    class C1646a implements Parcelable.Creator {
        C1646a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableByte[] newArray(int i11) {
            return new ObservableByte[i11];
        }
    }

    public ObservableByte(byte b11) {
        this.f6687q = b11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f6687q);
    }
}
