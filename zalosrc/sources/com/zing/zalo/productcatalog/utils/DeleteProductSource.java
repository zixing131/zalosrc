package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class DeleteProductSource implements Parcelable {

    /* renamed from: p */
    private final int f48757p;

    /* loaded from: classes4.dex */
    public static final class ProductEditView extends DeleteProductSource {

        /* renamed from: q */
        public static final ProductEditView f48758q = new ProductEditView();
        public static final Parcelable.Creator<ProductEditView> CREATOR = new C9158a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteProductSource$ProductEditView$a */
        /* loaded from: classes4.dex */
        public static final class C9158a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductEditView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductEditView.f48758q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductEditView[] newArray(int i11) {
                return new ProductEditView[i11];
            }
        }

        private ProductEditView() {
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
    public static final class ProductManageContextMenuDelete extends DeleteProductSource {

        /* renamed from: q */
        public static final ProductManageContextMenuDelete f48759q = new ProductManageContextMenuDelete();
        public static final Parcelable.Creator<ProductManageContextMenuDelete> CREATOR = new C9159a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteProductSource$ProductManageContextMenuDelete$a */
        /* loaded from: classes4.dex */
        public static final class C9159a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDelete createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuDelete.f48759q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuDelete[] newArray(int i11) {
                return new ProductManageContextMenuDelete[i11];
            }
        }

        private ProductManageContextMenuDelete() {
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
    public static final class ProductManageMultiSelect extends DeleteProductSource {

        /* renamed from: q */
        public static final ProductManageMultiSelect f48760q = new ProductManageMultiSelect();
        public static final Parcelable.Creator<ProductManageMultiSelect> CREATOR = new C9160a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteProductSource$ProductManageMultiSelect$a */
        /* loaded from: classes4.dex */
        public static final class C9160a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageMultiSelect.f48760q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect[] newArray(int i11) {
                return new ProductManageMultiSelect[i11];
            }
        }

        private ProductManageMultiSelect() {
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
    public static final class Unknown extends DeleteProductSource {

        /* renamed from: q */
        public static final Unknown f48761q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9161a();

        /* renamed from: com.zing.zalo.productcatalog.utils.DeleteProductSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9161a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48761q;
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

    public /* synthetic */ DeleteProductSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48938a() {
        return this.f48757p;
    }

    private DeleteProductSource(int i11) {
        this.f48757p = i11;
    }
}
