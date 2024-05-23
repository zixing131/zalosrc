package com.zing.zalo.feed.mvp.bottomsheetmenu.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class BottomSheetMenuBundleDataPrivacyQuickSetting implements Parcelable {
    public static final C8543a CREATOR = new C8543a(null);

    /* renamed from: p */
    private ContactProfile f46196p;

    /* renamed from: q */
    private Boolean f46197q;

    /* renamed from: r */
    private Boolean f46198r;

    /* renamed from: com.zing.zalo.feed.mvp.bottomsheetmenu.model.BottomSheetMenuBundleDataPrivacyQuickSetting$a */
    /* loaded from: classes4.dex */
    public static final class C8543a implements Parcelable.Creator {
        private C8543a() {
        }

        public /* synthetic */ C8543a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BottomSheetMenuBundleDataPrivacyQuickSetting createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new BottomSheetMenuBundleDataPrivacyQuickSetting(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BottomSheetMenuBundleDataPrivacyQuickSetting[] newArray(int i11) {
            return new BottomSheetMenuBundleDataPrivacyQuickSetting[i11];
        }
    }

    public BottomSheetMenuBundleDataPrivacyQuickSetting() {
        Boolean bool = Boolean.FALSE;
        this.f46197q = bool;
        this.f46198r = bool;
    }

    /* renamed from: a */
    public final ContactProfile m45556a() {
        return this.f46196p;
    }

    /* renamed from: b */
    public final Boolean m45557b() {
        return this.f46198r;
    }

    /* renamed from: c */
    public final Boolean m45558c() {
        return this.f46197q;
    }

    /* renamed from: d */
    public final void m45559d(Boolean bool) {
        this.f46198r = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m45560e(ContactProfile contactProfile) {
        this.f46196p = contactProfile;
    }

    /* renamed from: f */
    public final void m45561f(Boolean bool) {
        this.f46197q = bool;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        AbstractC19074t.m100208f(parcel, "parcel");
        ContactProfile contactProfile = this.f46196p;
        if (contactProfile == null) {
            contactProfile = null;
        }
        int i13 = 0;
        parcel.writeParcelable(contactProfile, 0);
        Boolean bool = this.f46197q;
        if (bool != null && AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        parcel.writeInt(i12);
        Boolean bool2 = this.f46198r;
        if (bool2 != null && AbstractC19074t.m100204b(bool2, Boolean.TRUE)) {
            i13 = 1;
        }
        parcel.writeInt(i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetMenuBundleDataPrivacyQuickSetting(Parcel parcel) {
        this();
        AbstractC19074t.m100208f(parcel, "parcel");
        this.f46196p = (ContactProfile) parcel.readParcelable(ContactProfile.class.getClassLoader());
        this.f46197q = Boolean.valueOf(parcel.readInt() == 1);
        this.f46198r = Boolean.valueOf(parcel.readInt() == 1);
    }
}
