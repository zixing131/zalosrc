package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes2.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C1723a();

    /* renamed from: p */
    ArrayList f6999p;

    /* renamed from: q */
    ArrayList f7000q;

    /* renamed from: r */
    BackStackState[] f7001r;

    /* renamed from: s */
    String f7002s;

    /* renamed from: t */
    int f7003t;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    /* loaded from: classes2.dex */
    static class C1723a implements Parcelable.Creator {
        C1723a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i11) {
            return new FragmentManagerState[i11];
        }
    }

    public FragmentManagerState() {
        this.f7002s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedList(this.f6999p);
        parcel.writeStringList(this.f7000q);
        parcel.writeTypedArray(this.f7001r, i11);
        parcel.writeString(this.f7002s);
        parcel.writeInt(this.f7003t);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f7002s = null;
        this.f6999p = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f7000q = parcel.createStringArrayList();
        this.f7001r = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f7002s = parcel.readString();
        this.f7003t = parcel.readInt();
    }
}
