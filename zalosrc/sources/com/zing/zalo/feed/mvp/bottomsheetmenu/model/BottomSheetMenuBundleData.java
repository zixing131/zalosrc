package com.zing.zalo.feed.mvp.bottomsheetmenu.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import io.C20637a;
import io.C20638b;

/* loaded from: classes4.dex */
public final class BottomSheetMenuBundleData implements Parcelable {
    public static final C8541a CREATOR = new C8541a(null);

    /* renamed from: p */
    private int f46168p;

    /* renamed from: q */
    private C20637a f46169q;

    /* renamed from: r */
    private String f46170r;

    /* renamed from: s */
    private BottomSheetMenuBundleDataPhotoViewfull f46171s;

    /* renamed from: t */
    private BottomSheetMenuBundleDataPrivacyQuickSetting f46172t;

    /* renamed from: u */
    private C20638b f46173u;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleData$a */
    /* loaded from: classes4.dex */
    public static final class C8541a implements Parcelable.Creator {
        private C8541a() {
        }

        public /* synthetic */ C8541a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BottomSheetMenuBundleData createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BottomSheetMenuBundleData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BottomSheetMenuBundleData[] newArray(int i11) {
            return new BottomSheetMenuBundleData[i11];
        }
    }

    public BottomSheetMenuBundleData() {
        this.f46170r = "";
    }

    /* renamed from: g */
    private final void m45500g(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f46169q = new C20637a(str);
        }
    }

    /* renamed from: a */
    public final C20637a m45501a() {
        return this.f46169q;
    }

    /* renamed from: b */
    public final BottomSheetMenuBundleDataPhotoViewfull m45502b() {
        return this.f46171s;
    }

    /* renamed from: c */
    public final BottomSheetMenuBundleDataPrivacyQuickSetting m45503c() {
        return this.f46172t;
    }

    /* renamed from: d */
    public final C20638b m45504d() {
        return this.f46173u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m45505e() {
        return this.f46168p;
    }

    /* renamed from: f */
    public final String m45506f() {
        return this.f46170r;
    }

    /* renamed from: h */
    public final void m45507h(C20637a c20637a) {
        this.f46169q = c20637a;
    }

    /* renamed from: i */
    public final void m45508i(BottomSheetMenuBundleDataPhotoViewfull bottomSheetMenuBundleDataPhotoViewfull) {
        this.f46171s = bottomSheetMenuBundleDataPhotoViewfull;
    }

    /* renamed from: j */
    public final void m45509j(BottomSheetMenuBundleDataPrivacyQuickSetting bottomSheetMenuBundleDataPrivacyQuickSetting) {
        this.f46172t = bottomSheetMenuBundleDataPrivacyQuickSetting;
    }

    /* renamed from: k */
    public final void m45510k(C20638b c20638b) {
        this.f46173u = c20638b;
    }

    /* renamed from: l */
    public final void m45511l(int i11) {
        this.f46168p = i11;
    }

    /* renamed from: m */
    public final void m45512m(String str) {
        this.f46170r = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        String str;
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.writeInt(this.f46168p);
        C20637a c20637a = this.f46169q;
        if (c20637a == null || (str = c20637a.m107554r()) == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.f46170r);
        parcel.writeParcelable(this.f46171s, 0);
        parcel.writeParcelable(this.f46172t, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuBundleData(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        parcel.readInt();
        m45500g(parcel.readString());
        parcel.readString();
        parcel.readParcelable(BottomSheetMenuBundleDataPhotoViewfull.class.getClassLoader());
        parcel.readParcelable(BottomSheetMenuBundleDataPrivacyQuickSetting.class.getClassLoader());
    }
}
