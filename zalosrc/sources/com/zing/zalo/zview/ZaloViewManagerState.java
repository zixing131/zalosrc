package com.zing.zalo.zview;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class ZaloViewManagerState implements Parcelable {
    public static final Parcelable.Creator<ZaloViewManagerState> CREATOR = new C17427a();

    /* renamed from: p */
    StackRecordState[] f88794p;

    /* renamed from: q */
    StackRecordState[] f88795q;

    /* renamed from: com.zing.zalo.zview.ZaloViewManagerState$a */
    /* loaded from: classes7.dex */
    class C17427a implements Parcelable.Creator {
        C17427a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ZaloViewManagerState createFromParcel(Parcel parcel) {
            return new ZaloViewManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ZaloViewManagerState[] newArray(int i11) {
            return new ZaloViewManagerState[i11];
        }
    }

    public ZaloViewManagerState() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedArray(this.f88794p, i11);
        parcel.writeTypedArray(this.f88795q, i11);
    }

    public ZaloViewManagerState(Parcel parcel) {
        Parcelable.Creator<StackRecordState> creator = StackRecordState.CREATOR;
        this.f88794p = (StackRecordState[]) parcel.createTypedArray(creator);
        this.f88795q = (StackRecordState[]) parcel.createTypedArray(creator);
    }
}
