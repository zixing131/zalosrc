package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class DeleteCatalogSource implements Parcelable {

    /* renamed from: p */
    private final int f48753p;

    /* loaded from: classes4.dex */
    public static final class CatalogManageContextMenuDelete extends DeleteCatalogSource {

        /* renamed from: q */
        public static final CatalogManageContextMenuDelete f48754q = new CatalogManageContextMenuDelete();
        public static final Parcelable.Creator<CatalogManageContextMenuDelete> CREATOR = new C9155a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteCatalogSource$CatalogManageContextMenuDelete$a */
        /* loaded from: classes4.dex */
        public static final class C9155a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageContextMenuDelete createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageContextMenuDelete.f48754q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageContextMenuDelete[] newArray(int i11) {
                return new CatalogManageContextMenuDelete[i11];
            }
        }

        private CatalogManageContextMenuDelete() {
            super(2, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ProductManageContextMenuDelete extends DeleteCatalogSource {

        /* renamed from: q */
        public static final ProductManageContextMenuDelete f48755q = new ProductManageContextMenuDelete();
        public static final Parcelable.Creator<ProductManageContextMenuDelete> CREATOR = new C9156a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteCatalogSource$ProductManageContextMenuDelete$a */
        /* loaded from: classes4.dex */
        public static final class C9156a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDelete createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuDelete.f48755q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDelete[] newArray(int i11) {
                return new ProductManageContextMenuDelete[i11];
            }
        }

        private ProductManageContextMenuDelete() {
            super(1, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class Unknown extends DeleteCatalogSource {

        /* renamed from: q */
        public static final Unknown f48756q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9157a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteCatalogSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9157a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48756q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Unknown[] newArray(int i11) {
                return new Unknown[i11];
            }
        }

        private Unknown() {
            super(0, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ DeleteCatalogSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48931a() {
        return this.f48753p;
    }

    private DeleteCatalogSource(int i11) {
        this.f48753p = i11;
    }
}
