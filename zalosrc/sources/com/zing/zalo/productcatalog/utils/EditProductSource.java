package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class EditProductSource implements Parcelable {

    /* renamed from: p */
    private final int f48766p;

    /* loaded from: classes4.dex */
    public static final class ProductManageContextMenuEdit extends EditProductSource {

        /* renamed from: q */
        public static final ProductManageContextMenuEdit f48767q = new ProductManageContextMenuEdit();
        public static final Parcelable.Creator<ProductManageContextMenuEdit> CREATOR = new C9165a();

        /* renamed from: com.zing.zalo.productcatalog.utils.EditProductSource$ProductManageContextMenuEdit$a */
        /* loaded from: classes4.dex */
        public static final class C9165a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuEdit createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuEdit.f48767q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuEdit[] newArray(int i11) {
                return new ProductManageContextMenuEdit[i11];
            }
        }

        private ProductManageContextMenuEdit() {
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
    public static final class Unknown extends EditProductSource {

        /* renamed from: q */
        public static final Unknown f48768q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9166a();

        /* renamed from: com.zing.zalo.productcatalog.utils.EditProductSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9166a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48768q;
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

    public /* synthetic */ EditProductSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48954a() {
        return this.f48766p;
    }

    private EditProductSource(int i11) {
        this.f48766p = i11;
    }
}
