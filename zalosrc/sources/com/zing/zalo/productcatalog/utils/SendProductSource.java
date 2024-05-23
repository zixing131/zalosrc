package com.zing.zalo.productcatalog.utils;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public abstract class SendProductSource implements Parcelable {

    /* renamed from: p */
    private final int f48774p;

    /* loaded from: classes4.dex */
    public static final class ActionCommon extends SendProductSource {

        /* renamed from: q */
        public static final ActionCommon f48775q = new ActionCommon();
        public static final Parcelable.Creator<ActionCommon> CREATOR = new C9171a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ActionCommon$a */
        /* loaded from: classes4.dex */
        public static final class C9171a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ActionCommon createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ActionCommon.f48775q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ActionCommon[] newArray(int i11) {
                return new ActionCommon[i11];
            }
        }

        private ActionCommon() {
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
    public static final class CatalogManageShareCatalog extends SendProductSource {

        /* renamed from: q */
        public static final CatalogManageShareCatalog f48776q = new CatalogManageShareCatalog();
        public static final Parcelable.Creator<CatalogManageShareCatalog> CREATOR = new C9172a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$CatalogManageShareCatalog$a */
        /* loaded from: classes4.dex */
        public static final class C9172a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CatalogManageShareCatalog createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return CatalogManageShareCatalog.f48776q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CatalogManageShareCatalog[] newArray(int i11) {
                return new CatalogManageShareCatalog[i11];
            }
        }

        private CatalogManageShareCatalog() {
            super(11, null);
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
    public static final class ChatForwardMsg extends SendProductSource {

        /* renamed from: q */
        public static final ChatForwardMsg f48777q = new ChatForwardMsg();
        public static final Parcelable.Creator<ChatForwardMsg> CREATOR = new C9173a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ChatForwardMsg$a */
        /* loaded from: classes4.dex */
        public static final class C9173a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChatForwardMsg createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ChatForwardMsg.f48777q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChatForwardMsg[] newArray(int i11) {
                return new ChatForwardMsg[i11];
            }
        }

        private ChatForwardMsg() {
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
    public static final class ChatManualPasteLink extends SendProductSource {

        /* renamed from: q */
        public static final ChatManualPasteLink f48778q = new ChatManualPasteLink();
        public static final Parcelable.Creator<ChatManualPasteLink> CREATOR = new C9174a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ChatManualPasteLink$a */
        /* loaded from: classes4.dex */
        public static final class C9174a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChatManualPasteLink createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ChatManualPasteLink.f48778q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChatManualPasteLink[] newArray(int i11) {
                return new ChatManualPasteLink[i11];
            }
        }

        private ChatManualPasteLink() {
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
    public static final class ChatPrefilledLink extends SendProductSource {

        /* renamed from: q */
        public static final ChatPrefilledLink f48779q = new ChatPrefilledLink();
        public static final Parcelable.Creator<ChatPrefilledLink> CREATOR = new C9175a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ChatPrefilledLink$a */
        /* loaded from: classes4.dex */
        public static final class C9175a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChatPrefilledLink createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ChatPrefilledLink.f48779q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChatPrefilledLink[] newArray(int i11) {
                return new ChatPrefilledLink[i11];
            }
        }

        private ChatPrefilledLink() {
            super(9, null);
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
    public static final class ChatSuggestCopiedLink extends SendProductSource {

        /* renamed from: q */
        public static final ChatSuggestCopiedLink f48780q = new ChatSuggestCopiedLink();
        public static final Parcelable.Creator<ChatSuggestCopiedLink> CREATOR = new C9176a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ChatSuggestCopiedLink$a */
        /* loaded from: classes4.dex */
        public static final class C9176a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChatSuggestCopiedLink createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ChatSuggestCopiedLink.f48780q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChatSuggestCopiedLink[] newArray(int i11) {
                return new ChatSuggestCopiedLink[i11];
            }
        }

        private ChatSuggestCopiedLink() {
            super(7, null);
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
    public static final class ProductBottomSheet extends SendProductSource {

        /* renamed from: q */
        public static final ProductBottomSheet f48781q = new ProductBottomSheet();
        public static final Parcelable.Creator<ProductBottomSheet> CREATOR = new C9177a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ProductBottomSheet$a */
        /* loaded from: classes4.dex */
        public static final class C9177a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductBottomSheet createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductBottomSheet.f48781q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductBottomSheet[] newArray(int i11) {
                return new ProductBottomSheet[i11];
            }
        }

        private ProductBottomSheet() {
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
    public static final class ProductManageContextMenuShare extends SendProductSource {

        /* renamed from: q */
        public static final ProductManageContextMenuShare f48782q = new ProductManageContextMenuShare();
        public static final Parcelable.Creator<ProductManageContextMenuShare> CREATOR = new C9178a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ProductManageContextMenuShare$a */
        /* loaded from: classes4.dex */
        public static final class C9178a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuShare createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageContextMenuShare.f48782q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageContextMenuShare[] newArray(int i11) {
                return new ProductManageContextMenuShare[i11];
            }
        }

        private ProductManageContextMenuShare() {
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
    public static final class ProductManageMultiSelect extends SendProductSource {

        /* renamed from: q */
        public static final ProductManageMultiSelect f48783q = new ProductManageMultiSelect();
        public static final Parcelable.Creator<ProductManageMultiSelect> CREATOR = new C9179a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ProductManageMultiSelect$a */
        /* loaded from: classes4.dex */
        public static final class C9179a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageMultiSelect.f48783q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageMultiSelect[] newArray(int i11) {
                return new ProductManageMultiSelect[i11];
            }
        }

        private ProductManageMultiSelect() {
            super(6, null);
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
    public static final class ProductManageShareCatalog extends SendProductSource {

        /* renamed from: q */
        public static final ProductManageShareCatalog f48784q = new ProductManageShareCatalog();
        public static final Parcelable.Creator<ProductManageShareCatalog> CREATOR = new C9180a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$ProductManageShareCatalog$a */
        /* loaded from: classes4.dex */
        public static final class C9180a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductManageShareCatalog createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return ProductManageShareCatalog.f48784q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProductManageShareCatalog[] newArray(int i11) {
                return new ProductManageShareCatalog[i11];
            }
        }

        private ProductManageShareCatalog() {
            super(10, null);
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
    public static final class Unknown extends SendProductSource {

        /* renamed from: q */
        public static final Unknown f48785q = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C9181a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$Unknown$a */
        /* loaded from: classes4.dex */
        public static final class C9181a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f48785q;
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

    /* loaded from: classes4.dex */
    public static final class WebViewMenu extends SendProductSource {

        /* renamed from: q */
        public static final WebViewMenu f48786q = new WebViewMenu();
        public static final Parcelable.Creator<WebViewMenu> CREATOR = new C9182a();

        /* renamed from: com.zing.zalo.productcatalog.utils.SendProductSource$WebViewMenu$a */
        /* loaded from: classes4.dex */
        public static final class C9182a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WebViewMenu createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                parcel.readInt();
                return WebViewMenu.f48786q;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WebViewMenu[] newArray(int i11) {
                return new WebViewMenu[i11];
            }
        }

        private WebViewMenu() {
            super(8, null);
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

    public /* synthetic */ SendProductSource(int i11, AbstractC19060k abstractC19060k) {
        this(i11);
    }

    /* renamed from: a */
    public final int m48968a() {
        return this.f48774p;
    }

    private SendProductSource(int i11) {
        this.f48774p = i11;
    }
}
