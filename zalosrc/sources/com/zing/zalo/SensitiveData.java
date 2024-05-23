package com.zing.zalo;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class SensitiveData implements Parcelable {
    public static final C6915a CREATOR = new C6915a(null);

    /* renamed from: p */
    private final String f37895p;

    /* renamed from: q */
    private final String f37896q;

    /* renamed from: r */
    private SensitiveExtraData f37897r;

    /* renamed from: com.zing.zalo.SensitiveData$a */
    /* loaded from: classes.dex */
    public static final class C6915a implements Parcelable.Creator {
        private C6915a() {
        }

        public /* synthetic */ C6915a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SensitiveData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new SensitiveData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SensitiveData[] newArray(int i11) {
            return new SensitiveData[i11];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SensitiveData(String str, String str2) {
        this(str, str2, null, 4, null);
        AbstractC19074t.m100208f(str, "sourceId");
        AbstractC19074t.m100208f(str2, "feature");
    }

    /* renamed from: a */
    public final SensitiveExtraData m35526a() {
        return this.f37897r;
    }

    /* renamed from: b */
    public final String m35527b() {
        return this.f37896q;
    }

    /* renamed from: c */
    public final String m35528c() {
        return this.f37895p;
    }

    /* renamed from: d */
    public final void m35529d(SensitiveExtraData sensitiveExtraData) {
        this.f37897r = sensitiveExtraData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensitiveData)) {
            return false;
        }
        SensitiveData sensitiveData = (SensitiveData) obj;
        return AbstractC19074t.m100204b(this.f37895p, sensitiveData.f37895p) && AbstractC19074t.m100204b(this.f37896q, sensitiveData.f37896q) && AbstractC19074t.m100204b(this.f37897r, sensitiveData.f37897r);
    }

    public int hashCode() {
        int hashCode = ((this.f37895p.hashCode() * 31) + this.f37896q.hashCode()) * 31;
        SensitiveExtraData sensitiveExtraData = this.f37897r;
        return hashCode + (sensitiveExtraData == null ? 0 : sensitiveExtraData.hashCode());
    }

    public String toString() {
        return "SensitiveData(sourceId=" + this.f37895p + ", feature=" + this.f37896q + ", extraData=" + this.f37897r + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeString(this.f37895p);
        parcel.writeString(this.f37896q);
        parcel.writeParcelable(this.f37897r, i11);
    }

    public SensitiveData(String str, String str2, SensitiveExtraData sensitiveExtraData) {
        AbstractC19074t.m100208f(str, "sourceId");
        AbstractC19074t.m100208f(str2, "feature");
        this.f37895p = str;
        this.f37896q = str2;
        this.f37897r = sensitiveExtraData;
    }

    public /* synthetic */ SensitiveData(String str, String str2, SensitiveExtraData sensitiveExtraData, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, (i11 & 4) != 0 ? null : sensitiveExtraData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SensitiveData(Parcel parcel) {
        this(r0, r1, (SensitiveExtraData) parcel.readParcelable(SensitiveExtraData.class.getClassLoader()));
        AbstractC19074t.m100208f(parcel, "parcel");
        String readString = parcel.readString();
        AbstractC19074t.m100205c(readString);
        String readString2 = parcel.readString();
        AbstractC19074t.m100205c(readString2);
    }
}
