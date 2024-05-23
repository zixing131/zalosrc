package com.zing.zalo.productcatalog.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class CatalogAddEditModel implements Parcelable {
    public static final Parcelable.Creator<CatalogAddEditModel> CREATOR = new C9053a();

    /* renamed from: p */
    private final long f48498p;

    /* renamed from: q */
    private final long f48499q;

    /* renamed from: r */
    private final String f48500r;

    /* renamed from: com.zing.zalo.productcatalog.model.CatalogAddEditModel$a */
    /* loaded from: classes4.dex */
    public static final class C9053a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CatalogAddEditModel createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CatalogAddEditModel(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CatalogAddEditModel[] newArray(int i11) {
            return new CatalogAddEditModel[i11];
        }
    }

    public CatalogAddEditModel(long j11, long j12, String str) {
        AbstractC19074t.m100208f(str, "name");
        this.f48498p = j11;
        this.f48499q = j12;
        this.f48500r = str;
    }

    /* renamed from: a */
    public final long m48470a() {
        return this.f48499q;
    }

    /* renamed from: b */
    public final String m48471b() {
        return this.f48500r;
    }

    /* renamed from: c */
    public final long m48472c() {
        return this.f48498p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAddEditModel)) {
            return false;
        }
        CatalogAddEditModel catalogAddEditModel = (CatalogAddEditModel) obj;
        return this.f48498p == catalogAddEditModel.f48498p && this.f48499q == catalogAddEditModel.f48499q && AbstractC19074t.m100204b(this.f48500r, catalogAddEditModel.f48500r);
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f48498p) * 31) + AbstractC2147g0.m11521a(this.f48499q)) * 31) + this.f48500r.hashCode();
    }

    public String toString() {
        return "CatalogAddEditModel(ownerId=" + this.f48498p + ", catalogId=" + this.f48499q + ", name=" + this.f48500r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f48498p);
        parcel.writeLong(this.f48499q);
        parcel.writeString(this.f48500r);
    }
}
