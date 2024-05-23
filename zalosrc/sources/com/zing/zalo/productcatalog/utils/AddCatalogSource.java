package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class AddCatalogSource implements Parcelable {

    /* renamed from: p */
    private final int f48741p;

    /* loaded from: classes4.dex */
    public static final class CatalogBottomSheetEmptyView extends AddCatalogSource {

        /* renamed from: q */
        public static final CatalogBottomSheetEmptyView f48742q = new CatalogBottomSheetEmptyView();
        public static final Parcelable.Creator<CatalogBottomSheetEmptyView> CREATOR = new C9145a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddCatalogSource$CatalogBottomSheetEmptyView$a */
        /* loaded from: classes4.dex */
        public static final class C9145a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogBottomSheetEmptyView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogBottomSheetEmptyView.f48742q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogBottomSheetEmptyView[] newArray(int i11) {
                return new CatalogBottomSheetEmptyView[i11];
            }
        }

        private CatalogBottomSheetEmptyView() {
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

    /* loaded from: classes4.dex */
    public static final class CatalogManageBtnPlus extends AddCatalogSource {

        /* renamed from: q */
        public static final CatalogManageBtnPlus f48743q = new CatalogManageBtnPlus();
        public static final Parcelable.Creator<CatalogManageBtnPlus> CREATOR = new C9146a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddCatalogSource$CatalogManageBtnPlus$a */
        /* loaded from: classes4.dex */
        public static final class C9146a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageBtnPlus createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageBtnPlus.f48743q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageBtnPlus[] newArray(int i11) {
                return new CatalogManageBtnPlus[i11];
            }
        }

        private CatalogManageBtnPlus() {
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
    public static final class CatalogManageEmptyView extends AddCatalogSource {

        /* renamed from: q */
        public static final CatalogManageEmptyView f48744q = new CatalogManageEmptyView();
        public static final Parcelable.Creator<CatalogManageEmptyView> CREATOR = new C9147a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddCatalogSource$CatalogManageEmptyView$a */
        /* loaded from: classes4.dex */
        public static final class C9147a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageEmptyView createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageEmptyView.f48744q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageEmptyView[] newArray(int i11) {
                return new CatalogManageEmptyView[i11];
            }
        }

        private CatalogManageEmptyView() {
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

    /* loaded from: classes4.dex */
    public static final class Unknown extends AddCatalogSource {

        /* renamed from: q */
        public static final Unknown f48745q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9148a();

        /* renamed from: com.zing.zalo.productcatalog.utils.AddCatalogSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9148a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48745q;
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

    public /* synthetic */ AddCatalogSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48909a() {
        return this.f48741p;
    }

    private AddCatalogSource(int i11) {
        this.f48741p = i11;
    }
}
