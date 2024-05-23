package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class MoveProductSource implements Parcelable {

    /* renamed from: p */
    private final int f48769p;

    /* loaded from: classes4.dex */
    public static final class ProductEditView extends MoveProductSource {

        /* renamed from: q */
        public static final ProductEditView f48770q = new ProductEditView();
        public static final Parcelable.Creator<ProductEditView> CREATOR = new C9167a();

        /* renamed from: com.zing.zalo.productcatalog.utils.MoveProductSource$ProductEditView$a */
        /* loaded from: classes4.dex */
        public static final class C9167a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductEditView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductEditView.f48770q;
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
    public static final class ProductManageContextMenu extends MoveProductSource {

        /* renamed from: q */
        public static final ProductManageContextMenu f48771q = new ProductManageContextMenu();
        public static final Parcelable.Creator<ProductManageContextMenu> CREATOR = new C9168a();

        /* renamed from: com.zing.zalo.productcatalog.utils.MoveProductSource$ProductManageContextMenu$a */
        /* loaded from: classes4.dex */
        public static final class C9168a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenu createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenu.f48771q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenu[] newArray(int i11) {
                return new ProductManageContextMenu[i11];
            }
        }

        private ProductManageContextMenu() {
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
    public static final class ProductManageMultiSelect extends MoveProductSource {

        /* renamed from: q */
        public static final ProductManageMultiSelect f48772q = new ProductManageMultiSelect();
        public static final Parcelable.Creator<ProductManageMultiSelect> CREATOR = new C9169a();

        /* renamed from: com.zing.zalo.productcatalog.utils.MoveProductSource$ProductManageMultiSelect$a */
        /* loaded from: classes4.dex */
        public static final class C9169a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageMultiSelect.f48772q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect[] newArray(int i11) {
                return new ProductManageMultiSelect[i11];
            }
        }

        private ProductManageMultiSelect() {
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
    public static final class Unknown extends MoveProductSource {

        /* renamed from: q */
        public static final Unknown f48773q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9170a();

        /* renamed from: com.zing.zalo.productcatalog.utils.MoveProductSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9170a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48773q;
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

    public /* synthetic */ MoveProductSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48959a() {
        return this.f48769p;
    }

    private MoveProductSource(int i11) {
        this.f48769p = i11;
    }
}
