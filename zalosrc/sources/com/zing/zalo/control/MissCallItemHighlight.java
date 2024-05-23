package com.zing.zalo.control;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class MissCallItemHighlight implements Parcelable {
    public static final Parcelable.Creator<MissCallItemHighlight> CREATOR = new C7889a();

    /* renamed from: p */
    private String f42665p;

    /* renamed from: q */
    private String f42666q;

    /* renamed from: r */
    private String f42667r;

    /* renamed from: s */
    private int f42668s;

    /* renamed from: com.zing.zalo.control.MissCallItemHighlight$a */
    /* loaded from: classes3.dex */
    class C7889a implements Parcelable.Creator {
        C7889a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MissCallItemHighlight createFromParcel(Parcel parcel) {
            return new MissCallItemHighlight(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MissCallItemHighlight[] newArray(int i11) {
            return new MissCallItemHighlight[i11];
        }
    }

    public MissCallItemHighlight(Parcel parcel) {
        m40634a(parcel);
    }

    /* renamed from: a */
    private void m40634a(Parcel parcel) {
        this.f42665p = parcel.readString();
        this.f42666q = parcel.readString();
        this.f42667r = parcel.readString();
        this.f42668s = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f42665p);
        parcel.writeString(this.f42666q);
        parcel.writeString(this.f42667r);
        parcel.writeInt(this.f42668s);
    }
}
