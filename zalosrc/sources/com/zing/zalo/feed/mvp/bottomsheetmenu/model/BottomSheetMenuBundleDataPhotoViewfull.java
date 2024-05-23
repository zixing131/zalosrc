package com.zing.zalo.feed.mvp.bottomsheetmenu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.control.ItemAlbumMobile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class BottomSheetMenuBundleDataPhotoViewfull implements Parcelable {
    public static final C8542a CREATOR = new C8542a(null);

    /* renamed from: A */
    private boolean f46174A;

    /* renamed from: B */
    private boolean f46175B;

    /* renamed from: C */
    private String f46176C;

    /* renamed from: D */
    private int f46177D;

    /* renamed from: E */
    private boolean f46178E;

    /* renamed from: F */
    private int f46179F;

    /* renamed from: G */
    private boolean f46180G;

    /* renamed from: H */
    private boolean f46181H;

    /* renamed from: I */
    private boolean f46182I;

    /* renamed from: J */
    private boolean f46183J;

    /* renamed from: K */
    private boolean f46184K;

    /* renamed from: p */
    private int f46185p;

    /* renamed from: q */
    private ItemAlbumMobile f46186q;

    /* renamed from: r */
    private String f46187r;

    /* renamed from: s */
    private String f46188s;

    /* renamed from: t */
    private boolean f46189t;

    /* renamed from: u */
    private boolean f46190u;

    /* renamed from: v */
    private boolean f46191v;

    /* renamed from: w */
    private boolean f46192w;

    /* renamed from: x */
    private boolean f46193x;

    /* renamed from: y */
    private boolean f46194y;

    /* renamed from: z */
    private boolean f46195z;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPhotoViewfull$a */
    /* loaded from: classes4.dex */
    public static final class C8542a implements Parcelable.Creator {
        private C8542a() {
        }

        public /* synthetic */ C8542a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BottomSheetMenuBundleDataPhotoViewfull createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BottomSheetMenuBundleDataPhotoViewfull(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BottomSheetMenuBundleDataPhotoViewfull[] newArray(int i11) {
            return new BottomSheetMenuBundleDataPhotoViewfull[i11];
        }
    }

    public BottomSheetMenuBundleDataPhotoViewfull() {
        this.f46187r = "";
        this.f46188s = "";
        this.f46176C = "";
    }

    /* renamed from: B */
    public final void m45515B(boolean z11) {
        this.f46190u = z11;
    }

    /* renamed from: C */
    public final void m45516C(boolean z11) {
        this.f46194y = z11;
    }

    /* renamed from: D */
    public final void m45517D(boolean z11) {
        this.f46192w = z11;
    }

    /* renamed from: F */
    public final void m45518F(boolean z11) {
        this.f46175B = z11;
    }

    /* renamed from: H */
    public final void m45519H(ItemAlbumMobile itemAlbumMobile) {
        this.f46186q = itemAlbumMobile;
    }

    /* renamed from: I */
    public final void m45520I(boolean z11) {
        this.f46189t = z11;
    }

    /* renamed from: J */
    public final void m45521J(boolean z11) {
        this.f46174A = z11;
    }

    /* renamed from: K */
    public final void m45522K(String str) {
        this.f46176C = str;
    }

    /* renamed from: M */
    public final void m45523M(boolean z11) {
        this.f46183J = z11;
    }

    /* renamed from: N */
    public final void m45524N(int i11) {
        this.f46179F = i11;
    }

    /* renamed from: O */
    public final void m45525O(boolean z11) {
        this.f46184K = z11;
    }

    /* renamed from: Q */
    public final void m45526Q(String str) {
        this.f46187r = str;
    }

    /* renamed from: R */
    public final void m45527R(boolean z11) {
        this.f46180G = z11;
    }

    /* renamed from: S */
    public final void m45528S(boolean z11) {
        this.f46178E = z11;
    }

    /* renamed from: T */
    public final void m45529T(boolean z11) {
        this.f46181H = z11;
    }

    /* renamed from: U */
    public final void m45530U(boolean z11) {
        this.f46182I = z11;
    }

    /* renamed from: a */
    public final int m45531a() {
        return this.f46185p;
    }

    /* renamed from: b */
    public final int m45532b() {
        return this.f46177D;
    }

    /* renamed from: c */
    public final String m45533c() {
        return this.f46188s;
    }

    /* renamed from: d */
    public final ItemAlbumMobile m45534d() {
        return this.f46186q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m45535e() {
        return this.f46179F;
    }

    /* renamed from: f */
    public final String m45536f() {
        return this.f46187r;
    }

    /* renamed from: g */
    public final boolean m45537g() {
        return this.f46195z;
    }

    /* renamed from: h */
    public final boolean m45538h() {
        return this.f46193x;
    }

    /* renamed from: i */
    public final boolean m45539i() {
        return this.f46191v;
    }

    /* renamed from: j */
    public final boolean m45540j() {
        return this.f46190u;
    }

    /* renamed from: k */
    public final boolean m45541k() {
        return this.f46194y;
    }

    /* renamed from: l */
    public final boolean m45542l() {
        return this.f46192w;
    }

    /* renamed from: m */
    public final boolean m45543m() {
        return this.f46189t;
    }

    /* renamed from: n */
    public final boolean m45544n() {
        return this.f46174A;
    }

    /* renamed from: o */
    public final boolean m45545o() {
        return this.f46183J;
    }

    /* renamed from: p */
    public final boolean m45546p() {
        return this.f46184K;
    }

    /* renamed from: q */
    public final boolean m45547q() {
        return this.f46178E;
    }

    /* renamed from: t */
    public final void m45548t(int i11) {
        this.f46185p = i11;
    }

    /* renamed from: u */
    public final void m45549u(int i11) {
        this.f46177D = i11;
    }

    /* renamed from: w */
    public final void m45550w(String str) {
        this.f46188s = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeInt(this.f46185p);
        parcel.writeParcelable(this.f46186q, 0);
        parcel.writeString(this.f46187r);
        parcel.writeString(this.f46188s);
        parcel.writeInt(this.f46189t ? 1 : 0);
        parcel.writeInt(this.f46190u ? 1 : 0);
        parcel.writeInt(this.f46191v ? 1 : 0);
        parcel.writeInt(this.f46192w ? 1 : 0);
        parcel.writeInt(this.f46193x ? 1 : 0);
        parcel.writeInt(this.f46194y ? 1 : 0);
        parcel.writeInt(this.f46195z ? 1 : 0);
        parcel.writeInt(this.f46174A ? 1 : 0);
        parcel.writeInt(this.f46175B ? 1 : 0);
        parcel.writeString(this.f46176C);
        parcel.writeInt(this.f46177D);
        parcel.writeInt(this.f46178E ? 1 : 0);
        parcel.writeInt(this.f46179F);
        parcel.writeInt(this.f46180G ? 1 : 0);
        parcel.writeInt(this.f46181H ? 1 : 0);
        parcel.writeInt(this.f46182I ? 1 : 0);
        parcel.writeInt(this.f46183J ? 1 : 0);
        parcel.writeInt(this.f46184K ? 1 : 0);
    }

    /* renamed from: x */
    public final void m45551x(boolean z11) {
        this.f46195z = z11;
    }

    /* renamed from: y */
    public final void m45552y(boolean z11) {
        this.f46193x = z11;
    }

    /* renamed from: z */
    public final void m45553z(boolean z11) {
        this.f46191v = z11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuBundleDataPhotoViewfull(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.readInt();
        parcel.readParcelable(ItemAlbumMobile.class.getClassLoader());
        parcel.readString();
        parcel.readString();
        this.f46189t = parcel.readInt() == 1;
        this.f46190u = parcel.readInt() == 1;
        this.f46191v = parcel.readInt() == 1;
        this.f46192w = parcel.readInt() == 1;
        this.f46193x = parcel.readInt() == 1;
        this.f46194y = parcel.readInt() == 1;
        this.f46195z = parcel.readInt() == 1;
        this.f46174A = parcel.readInt() == 1;
        this.f46175B = parcel.readInt() == 1;
        parcel.readString();
        parcel.readInt();
        this.f46178E = parcel.readInt() == 1;
        this.f46179F = parcel.readInt();
        this.f46180G = parcel.readInt() == 1;
        this.f46181H = parcel.readInt() == 1;
        this.f46182I = parcel.readInt() == 1;
        this.f46183J = parcel.readInt() == 1;
        this.f46184K = parcel.readInt() == 1;
    }
}
