package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class EditCatalogSource implements Parcelable {

    /* renamed from: p */
    private final int f48762p;

    /* loaded from: classes4.dex */
    public static final class CatalogManageContextMenuEdit extends EditCatalogSource {

        /* renamed from: q */
        public static final CatalogManageContextMenuEdit f48763q = new CatalogManageContextMenuEdit();
        public static final Parcelable.Creator<CatalogManageContextMenuEdit> CREATOR = new C9162a();

        /* renamed from: com.zing.zalo.productcatalog.utils.EditCatalogSource$CatalogManageContextMenuEdit$a */
        /* loaded from: classes4.dex */
        public static final class C9162a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageContextMenuEdit createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageContextMenuEdit.f48763q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageContextMenuEdit[] newArray(int i11) {
                return new CatalogManageContextMenuEdit[i11];
            }
        }

        private CatalogManageContextMenuEdit() {
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
    public static final class ProductManageContextMenuEdit extends EditCatalogSource {

        /* renamed from: q */
        public static final ProductManageContextMenuEdit f48764q = new ProductManageContextMenuEdit();
        public static final Parcelable.Creator<ProductManageContextMenuEdit> CREATOR = new C9163a();

        /* renamed from: com.zing.zalo.productcatalog.utils.EditCatalogSource$ProductManageContextMenuEdit$a */
        /* loaded from: classes4.dex */
        public static final class C9163a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuEdit createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuEdit.f48764q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuEdit[] newArray(int i11) {
                return new ProductManageContextMenuEdit[i11];
            }
        }

        private ProductManageContextMenuEdit() {
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
    public static final class Unknown extends EditCatalogSource {

        /* renamed from: q */
        public static final Unknown f48765q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9164a();

        /* renamed from: com.zing.zalo.productcatalog.utils.EditCatalogSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9164a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48765q;
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

    public /* synthetic */ EditCatalogSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48947a() {
        return this.f48762p;
    }

    private EditCatalogSource(int i11) {
        this.f48762p = i11;
    }
}
