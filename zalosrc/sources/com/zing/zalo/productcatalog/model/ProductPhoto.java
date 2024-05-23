package com.zing.zalo.productcatalog.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Random;

/* loaded from: classes4.dex */
public final class ProductPhoto implements Parcelable {

    /* renamed from: p */
    private int f48512p;

    /* renamed from: q */
    private String f48513q;

    /* renamed from: r */
    private String f48514r;

    /* renamed from: s */
    private String f48515s;

    /* renamed from: t */
    private int f48516t;

    /* renamed from: u */
    private int f48517u;

    /* renamed from: v */
    private long f48518v;
    public static final C9056a Companion = new C9056a(null);
    public static final Parcelable.Creator<ProductPhoto> CREATOR = new C9057b();

    /* renamed from: com.zing.zalo.productcatalog.model.ProductPhoto$a */
    /* loaded from: classes4.dex */
    public static final class C9056a {
        private C9056a() {
        }

        public /* synthetic */ C9056a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.model.ProductPhoto$b */
    /* loaded from: classes4.dex */
    public static final class C9057b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductPhoto createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ProductPhoto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductPhoto[] newArray(int i11) {
            return new ProductPhoto[i11];
        }
    }

    public ProductPhoto(int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "localPath");
        AbstractC19074t.m100208f(str2, "remoteUrl");
        AbstractC19074t.m100208f(str3, "duplicateRemoteUrl");
        this.f48512p = i11;
        this.f48513q = str;
        this.f48514r = str2;
        this.f48515s = str3;
        this.f48516t = new Random().nextInt(Integer.MAX_VALUE);
        this.f48517u = 3;
    }

    /* renamed from: a */
    public final String m48502a() {
        if (this.f48513q.length() > 0) {
            return this.f48513q;
        }
        if (this.f48515s.length() > 0) {
            return this.f48515s;
        }
        return this.f48514r;
    }

    /* renamed from: b */
    public final String m48503b() {
        return this.f48515s;
    }

    /* renamed from: c */
    public final String m48504c() {
        return this.f48513q;
    }

    /* renamed from: d */
    public final int m48505d() {
        if (this.f48516t == 0) {
            this.f48516t = new Random().nextInt(Integer.MAX_VALUE);
        }
        return this.f48516t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m48506e() {
        int i11 = this.f48512p;
        if (i11 != 0) {
            if (i11 != 2) {
                return m48505d() + "-" + this.f48513q;
            }
            return this.f48515s;
        }
        return this.f48514r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPhoto)) {
            return false;
        }
        ProductPhoto productPhoto = (ProductPhoto) obj;
        return this.f48512p == productPhoto.f48512p && AbstractC19074t.m100204b(this.f48513q, productPhoto.f48513q) && AbstractC19074t.m100204b(this.f48514r, productPhoto.f48514r) && AbstractC19074t.m100204b(this.f48515s, productPhoto.f48515s);
    }

    /* renamed from: f */
    public final int m48507f() {
        return this.f48512p;
    }

    /* renamed from: g */
    public final int m48508g() {
        return this.f48517u;
    }

    /* renamed from: h */
    public final long m48509h() {
        return this.f48518v;
    }

    public int hashCode() {
        return (((((this.f48512p * 31) + this.f48513q.hashCode()) * 31) + this.f48514r.hashCode()) * 31) + this.f48515s.hashCode();
    }

    /* renamed from: i */
    public final String m48510i() {
        return this.f48514r;
    }

    /* renamed from: j */
    public final void m48511j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48513q = str;
    }

    /* renamed from: k */
    public final void m48512k(int i11) {
        this.f48517u = i11;
    }

    /* renamed from: l */
    public final void m48513l(long j11) {
        this.f48518v = j11;
    }

    /* renamed from: m */
    public final void m48514m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48514r = str;
    }

    public String toString() {
        return "ProductPhoto(photoSource=" + this.f48512p + ", localPath=" + this.f48513q + ", remoteUrl=" + this.f48514r + ", duplicateRemoteUrl=" + this.f48515s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f48512p);
        parcel.writeString(this.f48513q);
        parcel.writeString(this.f48514r);
        parcel.writeString(this.f48515s);
    }

    public /* synthetic */ ProductPhoto(int i11, String str, String str2, String str3, int i12, AbstractC19060k abstractC19060k) {
        this(i11, str, str2, (i12 & 8) != 0 ? "" : str3);
    }
}
