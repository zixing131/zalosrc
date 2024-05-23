package com.zing.zalo.control.mediastore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import au.EnumC2363o;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class CreateMediaStoreParam implements Parcelable {

    /* renamed from: p */
    private String f42835p;

    /* renamed from: q */
    private EnumC2363o f42836q;

    /* renamed from: r */
    private MSFilterData f42837r;
    public static final C7916a Companion = new C7916a(null);
    public static final Parcelable.Creator<CreateMediaStoreParam> CREATOR = new C7917b();

    /* renamed from: com.zing.zalo.control.mediastore.CreateMediaStoreParam$a */
    /* loaded from: classes3.dex */
    public static final class C7916a {
        private C7916a() {
        }

        public /* synthetic */ C7916a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final CreateMediaStoreParam m40914a(Bundle bundle) {
            EnumC2363o enumC2363o;
            String string;
            AbstractC19074t.m100208f(bundle, "bundle");
            String str = "";
            if (bundle.containsKey("conversationId") && (string = bundle.getString("conversationId")) != null) {
                str = string;
            }
            if (bundle.containsKey("filterMode")) {
                EnumC2363o[] values = EnumC2363o.values();
                int length = values.length;
                for (int i11 = 0; i11 < length; i11++) {
                    enumC2363o = values[i11];
                    if (enumC2363o.ordinal() != bundle.getInt("filterMode")) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            enumC2363o = EnumC2363o.f9889p;
            MSFilterData mSFilterData = null;
            if (bundle.containsKey("filterData")) {
                Parcelable parcelable = bundle.getParcelable("filterData");
                if (parcelable instanceof MSFilterData) {
                    mSFilterData = (MSFilterData) parcelable;
                }
            }
            return new CreateMediaStoreParam(str, enumC2363o, mSFilterData);
        }
    }

    /* renamed from: com.zing.zalo.control.mediastore.CreateMediaStoreParam$b */
    /* loaded from: classes3.dex */
    public static final class C7917b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CreateMediaStoreParam createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new CreateMediaStoreParam(parcel.readString(), EnumC2363o.valueOf(parcel.readString()), (MSFilterData) parcel.readParcelable(CreateMediaStoreParam.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CreateMediaStoreParam[] newArray(int i11) {
            return new CreateMediaStoreParam[i11];
        }
    }

    public CreateMediaStoreParam(String str, EnumC2363o enumC2363o, MSFilterData mSFilterData) {
        AbstractC19074t.m100208f(str, "conversationId");
        AbstractC19074t.m100208f(enumC2363o, "filterMode");
        this.f42835p = str;
        this.f42836q = enumC2363o;
        this.f42837r = mSFilterData;
    }

    /* renamed from: a */
    public final String m40908a() {
        return this.f42835p;
    }

    /* renamed from: b */
    public final MSFilterData m40909b() {
        return this.f42837r;
    }

    /* renamed from: c */
    public final EnumC2363o m40910c() {
        return this.f42836q;
    }

    /* renamed from: d */
    public final void m40911d(MSFilterData mSFilterData) {
        this.f42837r = mSFilterData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m40912e(EnumC2363o enumC2363o) {
        AbstractC19074t.m100208f(enumC2363o, "<set-?>");
        this.f42836q = enumC2363o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateMediaStoreParam)) {
            return false;
        }
        CreateMediaStoreParam createMediaStoreParam = (CreateMediaStoreParam) obj;
        return AbstractC19074t.m100204b(this.f42835p, createMediaStoreParam.f42835p) && this.f42836q == createMediaStoreParam.f42836q && AbstractC19074t.m100204b(this.f42837r, createMediaStoreParam.f42837r);
    }

    /* renamed from: f */
    public final void m40913f(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "bundle");
        bundle.putString("conversationId", this.f42835p);
        bundle.putInt("filterMode", this.f42836q.ordinal());
        bundle.putParcelable("filterData", this.f42837r);
    }

    public int hashCode() {
        int hashCode = ((this.f42835p.hashCode() * 31) + this.f42836q.hashCode()) * 31;
        MSFilterData mSFilterData = this.f42837r;
        return hashCode + (mSFilterData == null ? 0 : mSFilterData.hashCode());
    }

    public String toString() {
        return "CreateMediaStoreParam(conversationId=" + this.f42835p + ", filterMode=" + this.f42836q + ", filterData=" + this.f42837r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f42835p);
        parcel.writeString(this.f42836q.name());
        parcel.writeParcelable(this.f42837r, i11);
    }

    public /* synthetic */ CreateMediaStoreParam(String str, EnumC2363o enumC2363o, MSFilterData mSFilterData, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? EnumC2363o.f9889p : enumC2363o, (i11 & 4) != 0 ? null : mSFilterData);
    }
}
