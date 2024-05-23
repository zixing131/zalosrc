package com.zing.zalo.productcatalog.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm0.C24848g0;
import qm0.AbstractC25370t;

/* loaded from: classes4.dex */
public final class Product implements Parcelable {

    /* renamed from: p */
    private long f48501p;

    /* renamed from: q */
    private String f48502q;

    /* renamed from: r */
    private String f48503r;

    /* renamed from: s */
    private long f48504s;

    /* renamed from: t */
    private String f48505t;

    /* renamed from: u */
    private String f48506u;

    /* renamed from: v */
    private ArrayList f48507v;

    /* renamed from: w */
    private String f48508w;

    /* renamed from: x */
    private long f48509x;

    /* renamed from: y */
    private String f48510y;

    /* renamed from: z */
    private final List f48511z;
    public static final C9054a Companion = new C9054a(null);
    public static final Parcelable.Creator<Product> CREATOR = new C9055b();

    /* renamed from: com.zing.zalo.productcatalog.model.Product$a */
    /* loaded from: classes4.dex */
    public static final class C9054a {
        private C9054a() {
        }

        public /* synthetic */ C9054a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.model.Product$b */
    /* loaded from: classes4.dex */
    public static final class C9055b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Product createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong2 = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            long readLong3 = parcel.readLong();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                arrayList.add(ProductPhoto.CREATOR.createFromParcel(parcel));
                i11++;
                readInt = readInt;
            }
            return new Product(readLong, readString, readString2, readLong2, readString3, readString4, createStringArrayList, readString5, readLong3, readString6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final Product[] newArray(int i11) {
            return new Product[i11];
        }
    }

    public Product(long j11, String str, String str2, long j12, String str3, String str4, ArrayList arrayList, String str5, long j13, String str6, List list) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "description");
        AbstractC19074t.m100208f(str3, "price");
        AbstractC19074t.m100208f(str4, "currencyUnit");
        AbstractC19074t.m100208f(arrayList, "photos");
        AbstractC19074t.m100208f(str5, "urlPath");
        AbstractC19074t.m100208f(str6, "ownerId");
        AbstractC19074t.m100208f(list, "localPhotos");
        this.f48501p = j11;
        this.f48502q = str;
        this.f48503r = str2;
        this.f48504s = j12;
        this.f48505t = str3;
        this.f48506u = str4;
        this.f48507v = arrayList;
        this.f48508w = str5;
        this.f48509x = j13;
        this.f48510y = str6;
        this.f48511z = list;
    }

    /* renamed from: B */
    public final void m48475B(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48505t = str;
    }

    /* renamed from: C */
    public final void m48476C(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48508w = str;
    }

    /* renamed from: a */
    public final ProductPhoto m48477a(String str) {
        AbstractC19074t.m100208f(str, "localPath");
        ProductPhoto productPhoto = new ProductPhoto(1, str, "", null, 8, null);
        synchronized (this) {
            this.f48511z.add(productPhoto);
        }
        return productPhoto;
    }

    /* renamed from: b */
    public final void m48478b(Product product) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(product, "other");
        if (this == product) {
            return;
        }
        this.f48502q = product.f48502q;
        this.f48503r = product.f48503r;
        this.f48504s = product.f48504s;
        this.f48505t = product.f48505t;
        this.f48506u = product.f48506u;
        synchronized (product) {
            arrayList = new ArrayList(product.f48507v);
        }
        synchronized (this) {
            this.f48507v.clear();
            this.f48507v.addAll(arrayList);
        }
        this.f48508w = product.f48508w;
        this.f48509x = product.f48509x;
        this.f48510y = product.f48510y;
    }

    /* renamed from: c */
    public final List m48479c() {
        ArrayList arrayList;
        int m131511r;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                ArrayList arrayList2 = this.f48507v;
                m131511r = AbstractC25370t.m131511r(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(m131511r);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new ProductPhoto(0, "", (String) it.next(), null, 8, null));
                }
                arrayList.addAll(arrayList3);
                arrayList.addAll(this.f48511z);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final long m48480d() {
        return this.f48509x;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final long m48481e() {
        return this.f48504s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return this.f48501p == product.f48501p && AbstractC19074t.m100204b(this.f48502q, product.f48502q) && AbstractC19074t.m100204b(this.f48503r, product.f48503r) && this.f48504s == product.f48504s && AbstractC19074t.m100204b(this.f48505t, product.f48505t) && AbstractC19074t.m100204b(this.f48506u, product.f48506u) && AbstractC19074t.m100204b(this.f48507v, product.f48507v) && AbstractC19074t.m100204b(this.f48508w, product.f48508w) && this.f48509x == product.f48509x && AbstractC19074t.m100204b(this.f48510y, product.f48510y) && AbstractC19074t.m100204b(this.f48511z, product.f48511z);
    }

    /* renamed from: f */
    public final String m48482f() {
        return this.f48506u;
    }

    /* renamed from: g */
    public final String m48483g() {
        return this.f48503r;
    }

    /* renamed from: h */
    public final int m48484h() {
        int size;
        synchronized (this) {
            size = this.f48507v.size() + this.f48511z.size();
        }
        return size;
    }

    public int hashCode() {
        return (((((((((((((((((((AbstractC2147g0.m11521a(this.f48501p) * 31) + this.f48502q.hashCode()) * 31) + this.f48503r.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f48504s)) * 31) + this.f48505t.hashCode()) * 31) + this.f48506u.hashCode()) * 31) + this.f48507v.hashCode()) * 31) + this.f48508w.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f48509x)) * 31) + this.f48510y.hashCode()) * 31) + this.f48511z.hashCode();
    }

    /* renamed from: i */
    public final long m48485i() {
        return this.f48501p;
    }

    /* renamed from: j */
    public final String m48486j() {
        return "[id:" + this.f48501p + ", catalogId:" + this.f48509x + ", ownerId:" + this.f48510y + ", name:" + this.f48502q + "]";
    }

    /* renamed from: k */
    public final List m48487k() {
        return this.f48511z;
    }

    /* renamed from: l */
    public final String m48488l() {
        return this.f48502q;
    }

    /* renamed from: m */
    public final String m48489m() {
        return this.f48510y;
    }

    /* renamed from: n */
    public final ArrayList m48490n() {
        return this.f48507v;
    }

    /* renamed from: o */
    public final String m48491o() {
        return this.f48505t;
    }

    /* renamed from: p */
    public final String m48492p() {
        return this.f48508w;
    }

    /* renamed from: q */
    public final void m48493q(ProductPhoto productPhoto) {
        AbstractC19074t.m100208f(productPhoto, "productPhoto");
        synchronized (this) {
            try {
                if (productPhoto.m48510i().length() > 0) {
                    this.f48507v.remove(productPhoto.m48510i());
                }
                Iterator it = this.f48511z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((ProductPhoto) it.next()).m48505d() == productPhoto.m48505d()) {
                        it.remove();
                        break;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    public final void m48494t(long j11) {
        this.f48509x = j11;
    }

    public String toString() {
        return "Product(id=" + this.f48501p + ", name=" + this.f48502q + ", description=" + this.f48503r + ", createTime=" + this.f48504s + ", price=" + this.f48505t + ", currencyUnit=" + this.f48506u + ", photos=" + this.f48507v + ", urlPath=" + this.f48508w + ", catalogId=" + this.f48509x + ", ownerId=" + this.f48510y + ", localPhotos=" + this.f48511z + ")";
    }

    /* renamed from: u */
    public final void m48495u(long j11) {
        this.f48504s = j11;
    }

    /* renamed from: w */
    public final void m48496w(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48506u = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeLong(this.f48501p);
        parcel.writeString(this.f48502q);
        parcel.writeString(this.f48503r);
        parcel.writeLong(this.f48504s);
        parcel.writeString(this.f48505t);
        parcel.writeString(this.f48506u);
        parcel.writeStringList(this.f48507v);
        parcel.writeString(this.f48508w);
        parcel.writeLong(this.f48509x);
        parcel.writeString(this.f48510y);
        List list = this.f48511z;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ProductPhoto) it.next()).writeToParcel(parcel, i11);
        }
    }

    /* renamed from: x */
    public final void m48497x(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48503r = str;
    }

    /* renamed from: y */
    public final void m48498y(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48502q = str;
    }

    /* renamed from: z */
    public final void m48499z(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f48510y = str;
    }

    public /* synthetic */ Product(long j11, String str, String str2, long j12, String str3, String str4, ArrayList arrayList, String str5, long j13, String str6, List list, int i11, AbstractC19060k abstractC19060k) {
        this(j11, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0L : j12, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? "" : str4, (i11 & 64) != 0 ? new ArrayList() : arrayList, (i11 & 128) != 0 ? "" : str5, (i11 & 256) != 0 ? 0L : j13, (i11 & 512) != 0 ? "" : str6, (i11 & 1024) != 0 ? new ArrayList() : list);
    }
}
