package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;
import bo.C3000l0;
import bo.C3020p0;
import bo.InterfaceC2946a1;

/* loaded from: classes3.dex */
public class FeedContentMessagePopup implements Parcelable {
    public static final Parcelable.Creator<FeedContentMessagePopup> CREATOR = new C7878a();

    /* renamed from: p */
    public C3020p0 f42531p;

    /* renamed from: q */
    public C3000l0 f42532q;

    /* renamed from: r */
    public InterfaceC2946a1 f42533r;

    /* renamed from: com.zing.zalo.control.FeedContentMessagePopup$a */
    /* loaded from: classes3.dex */
    class C7878a implements Parcelable.Creator {
        C7878a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FeedContentMessagePopup createFromParcel(Parcel parcel) {
            return new FeedContentMessagePopup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FeedContentMessagePopup[] newArray(int i11) {
            return new FeedContentMessagePopup[i11];
        }
    }

    public FeedContentMessagePopup(Parcel parcel) {
        this.f42531p = (C3020p0) parcel.readValue(C3020p0.class.getClassLoader());
        this.f42532q = (C3000l0) parcel.readValue(C3000l0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeValue(this.f42531p);
        parcel.writeValue(this.f42532q);
    }
}
