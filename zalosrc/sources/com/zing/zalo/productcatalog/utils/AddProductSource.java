package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class AddProductSource implements Parcelable {

    /* renamed from: p */
    private final int f48746p;

    /* loaded from: classes4.dex */
    public static final class CatalogManageBtnAddProduct extends AddProductSource {

        /* renamed from: q */
        public static final CatalogManageBtnAddProduct f48747q = new CatalogManageBtnAddProduct();
        public static final Parcelable.Creator<CatalogManageBtnAddProduct> CREATOR = new C9149a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$CatalogManageBtnAddProduct$a */
        /* loaded from: classes4.dex */
        public static final class C9149a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageBtnAddProduct createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageBtnAddProduct.f48747q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageBtnAddProduct[] newArray(int i11) {
                return new CatalogManageBtnAddProduct[i11];
            }
        }

        private CatalogManageBtnAddProduct() {
            super(4, null);
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
    public static final class ProductBottomSheetEmptyView extends AddProductSource {

        /* renamed from: q */
        public static final ProductBottomSheetEmptyView f48748q = new ProductBottomSheetEmptyView();
        public static final Parcelable.Creator<ProductBottomSheetEmptyView> CREATOR = new C9150a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$ProductBottomSheetEmptyView$a */
        /* loaded from: classes4.dex */
        public static final class C9150a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductBottomSheetEmptyView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductBottomSheetEmptyView.f48748q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductBottomSheetEmptyView[] newArray(int i11) {
                return new ProductBottomSheetEmptyView[i11];
            }
        }

        private ProductBottomSheetEmptyView() {
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
    public static final class ProductManageBtnPlus extends AddProductSource {

        /* renamed from: q */
        public static final ProductManageBtnPlus f48749q = new ProductManageBtnPlus();
        public static final Parcelable.Creator<ProductManageBtnPlus> CREATOR = new C9151a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$ProductManageBtnPlus$a */
        /* loaded from: classes4.dex */
        public static final class C9151a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageBtnPlus createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageBtnPlus.f48749q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageBtnPlus[] newArray(int i11) {
                return new ProductManageBtnPlus[i11];
            }
        }

        private ProductManageBtnPlus() {
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
    public static final class ProductManageContextMenuDuplicate extends AddProductSource {

        /* renamed from: q */
        public static final ProductManageContextMenuDuplicate f48750q = new ProductManageContextMenuDuplicate();
        public static final Parcelable.Creator<ProductManageContextMenuDuplicate> CREATOR = new C9152a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$ProductManageContextMenuDuplicate$a */
        /* loaded from: classes4.dex */
        public static final class C9152a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDuplicate createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuDuplicate.f48750q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDuplicate[] newArray(int i11) {
                return new ProductManageContextMenuDuplicate[i11];
            }
        }

        private ProductManageContextMenuDuplicate() {
            super(5, null);
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
    public static final class ProductManageEmptyView extends AddProductSource {

        /* renamed from: q */
        public static final ProductManageEmptyView f48751q = new ProductManageEmptyView();
        public static final Parcelable.Creator<ProductManageEmptyView> CREATOR = new C9153a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$ProductManageEmptyView$a */
        /* loaded from: classes4.dex */
        public static final class C9153a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageEmptyView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageEmptyView.f48751q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageEmptyView[] newArray(int i11) {
                return new ProductManageEmptyView[i11];
            }
        }

        private ProductManageEmptyView() {
            super(3, null);
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
    public static final class Unknown extends AddProductSource {

        /* renamed from: q */
        public static final Unknown f48752q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9154a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddProductSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9154a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48752q;
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

    public /* synthetic */ AddProductSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48918a() {
        return this.f48746p;
    }

    private AddProductSource(int i11) {
        this.f48746p = i11;
    }
}
