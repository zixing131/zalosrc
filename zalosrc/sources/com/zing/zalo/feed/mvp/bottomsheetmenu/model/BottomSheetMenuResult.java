package com.zing.zalo.feed.mvp.bottomsheetmenu.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import io.C20637a;
import io.C20638b;

/* loaded from: classes4.dex */
public final class BottomSheetMenuResult implements Parcelable {
    public static final C8544a CREATOR = new C8544a(null);

    /* renamed from: p */
    private int f46199p;

    /* renamed from: q */
    private int f46200q;

    /* renamed from: r */
    private C20637a f46201r;

    /* renamed from: s */
    private String f46202s;

    /* renamed from: t */
    private BottomSheetMenuBundleDataPhotoViewfull f46203t;

    /* renamed from: u */
    private BottomSheetMenuBundleDataPrivacyQuickSetting f46204u;

    /* renamed from: v */
    private C20638b f46205v;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuResult$a */
    /* loaded from: classes4.dex */
    public static final class C8544a implements Parcelable.Creator {
        private C8544a() {
        }

        public /* synthetic */ C8544a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BottomSheetMenuResult createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BottomSheetMenuResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BottomSheetMenuResult[] newArray(int i11) {
            return new BottomSheetMenuResult[i11];
        }
    }

    public BottomSheetMenuResult() {
        this.f46202s = "";
    }

    /* renamed from: h */
    private final void m45564h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f46201r = new C20637a(str);
        }
    }

    /* renamed from: a */
    public final C20637a m45565a() {
        return this.f46201r;
    }

    /* renamed from: b */
    public final BottomSheetMenuBundleDataPhotoViewfull m45566b() {
        return this.f46203t;
    }

    /* renamed from: c */
    public final BottomSheetMenuBundleDataPrivacyQuickSetting m45567c() {
        return this.f46204u;
    }

    /* renamed from: d */
    public final C20638b m45568d() {
        return this.f46205v;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m45569e() {
        return this.f46200q;
    }

    /* renamed from: f */
    public final String m45570f() {
        return this.f46202s;
    }

    /* renamed from: g */
    public final int m45571g() {
        return this.f46199p;
    }

    /* renamed from: i */
    public final void m45572i(C20637a c20637a) {
        this.f46201r = c20637a;
    }

    /* renamed from: j */
    public final void m45573j(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        this.f46203t = bottomSheetMenuBundleDataPhotoViewfull;
    }

    /* renamed from: k */
    public final void m45574k(BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting) {
        this.f46204u = bottomSheetMenuBundleDataPrivacyQuickSetting;
    }

    /* renamed from: l */
    public final void m45575l(C20638b c20638b) {
        this.f46205v = c20638b;
    }

    /* renamed from: m */
    public final void m45576m(int i11) {
        this.f46200q = i11;
    }

    /* renamed from: n */
    public final void m45577n(String str) {
        this.f46202s = str;
    }

    /* renamed from: o */
    public final void m45578o(int i11) {
        this.f46199p = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeInt(this.f46199p);
        parcel.writeInt(this.f46200q);
        C20637a c20637a = this.f46201r;
        if (c20637a == null || (str = c20637a.m107554r()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f46202s);
        parcel.writeParcelable(this.f46203t, 0);
        parcel.writeParcelable(this.f46204u, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuResult(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.readInt();
        parcel.readInt();
        m45564h(parcel.readString());
        parcel.readString();
        parcel.readParcelable(BottomSheetMenuBundleDataPhotoViewfull.class.getClassLoader());
        parcel.readParcelable(BottomSheetMenuBundleDataPrivacyQuickSetting.class.getClassLoader());
    }
}
