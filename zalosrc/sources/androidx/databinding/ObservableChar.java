package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableChar extends AbstractC1668b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C1647a();
    static final long serialVersionUID = 1;

    /* renamed from: q */
    private char f6688q;

    /* renamed from: androidx.databinding.ObservableChar$a */
    /* loaded from: classes2.dex */
    class C1647a implements Parcelable.Creator {
        C1647a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ObservableChar[] newArray(int i11) {
            return new ObservableChar[i11];
        }
    }

    public ObservableChar(char c11) {
        this.f6688q = c11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f6688q);
    }
}
