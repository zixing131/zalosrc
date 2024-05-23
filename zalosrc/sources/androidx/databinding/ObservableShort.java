package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableShort extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C1653a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private short f6693q;

    /* renamed from: androidx.databinding.ObservableShort$a */
    /* loaded from: classes2.dex */
    class C1653a implements Parcelable.Creator {
        C1653a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableShort[] newArray(int i11) {
            return new ObservableShort[i11];
        }
    }

    public ObservableShort(short s7) {
        this.f6693q = s7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6693q);
    }
}
