package com.zing.zalo.control.mediastore;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class MSFilterData implements Parcelable {
    public static final C7918a CREATOR = new C7918a(null);

    /* renamed from: p */
    private String f42838p;

    /* renamed from: q */
    private String f42839q;

    /* renamed from: com.zing.zalo.control.mediastore.MSFilterData$a */
    /* loaded from: classes3.dex */
    public static final class C7918a implements Parcelable.Creator {
        private C7918a() {
        }

        public /* synthetic */ C7918a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MSFilterData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new MSFilterData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MSFilterData[] newArray(int i11) {
            return new MSFilterData[i11];
        }
    }

    public MSFilterData(String str, String str2) {
        this.f42838p = str;
        this.f42839q = str2;
    }

    /* renamed from: a */
    public final String m40917a() {
        return "collectionId: " + this.f42838p;
    }

    /* renamed from: b */
    public final String m40918b() {
        return this.f42838p;
    }

    /* renamed from: c */
    public final String m40919c() {
        return this.f42839q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MSFilterData)) {
            return false;
        }
        MSFilterData mSFilterData = (MSFilterData) obj;
        return AbstractC19074t.m100204b(this.f42838p, mSFilterData.f42838p) && AbstractC19074t.m100204b(this.f42839q, mSFilterData.f42839q);
    }

    public int hashCode() {
        String str = this.f42838p;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f42839q;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MSFilterData(collectionId=" + this.f42838p + ", title=" + this.f42839q + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "dest");
        parcel.writeString(this.f42838p);
        parcel.writeString(this.f42839q);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MSFilterData(Parcel parcel) {
        this(parcel.readString(), parcel.readString());
        AbstractC19074t.m100208f(parcel, "parcel");
    }
}
