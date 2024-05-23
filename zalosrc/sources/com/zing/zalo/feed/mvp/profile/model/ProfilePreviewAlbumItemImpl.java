package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl$$serializer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;

@InterfaceC25392g
@Keep
/* loaded from: classes4.dex */
public final class ProfilePreviewAlbumItemImpl extends ProfilePreviewAlbumItem {
    private ThemeItemImpl _themeInfo;
    private SmartCropInfo cropInfo;
    private String desc;
    private String icon;

    /* renamed from: id */
    private long f46708id;
    private int privacyType;
    private int remain;
    private int size;
    private int theme;
    private String thumb;
    private String title;
    private int type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ProfilePreviewAlbumItemImpl> CREATOR = new C8671a();

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ProfilePreviewAlbumItemImpl$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItemImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8671a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ProfilePreviewAlbumItemImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ProfilePreviewAlbumItemImpl(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ProfilePreviewAlbumItemImpl[] newArray(int i11) {
            return new ProfilePreviewAlbumItemImpl[i11];
        }
    }

    public ProfilePreviewAlbumItemImpl() {
        this(null, 1, null);
    }

    public static /* synthetic */ ProfilePreviewAlbumItemImpl copy$default(ProfilePreviewAlbumItemImpl profilePreviewAlbumItemImpl, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = profilePreviewAlbumItemImpl.title;
        }
        return profilePreviewAlbumItemImpl.copy(str);
    }

    public static /* synthetic */ void getCropInfo$annotations() {
    }

    public static /* synthetic */ void getDesc$annotations() {
    }

    public static /* synthetic */ void getIcon$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getPrivacyType$annotations() {
    }

    public static /* synthetic */ void getRemain$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getTheme$annotations() {
    }

    public static /* synthetic */ void getThumb$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void get_themeInfo$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:            if (fn0.AbstractC19074t.m100204b(r1, (com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl) r2) == false) goto L137;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$app_release(ProfilePreviewAlbumItemImpl profilePreviewAlbumItemImpl, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || !AbstractC19074t.m100204b(profilePreviewAlbumItemImpl.getTitle(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 0, profilePreviewAlbumItemImpl.getTitle());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(profilePreviewAlbumItemImpl.getDesc(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, profilePreviewAlbumItemImpl.getDesc());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || profilePreviewAlbumItemImpl.getSize() != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 2, profilePreviewAlbumItemImpl.getSize());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || profilePreviewAlbumItemImpl.getRemain() != 1000) {
            interfaceC21886d.mo114033x(serialDescriptor, 3, profilePreviewAlbumItemImpl.getRemain());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || !AbstractC19074t.m100204b(profilePreviewAlbumItemImpl.getThumb(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 4, profilePreviewAlbumItemImpl.getThumb());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || !AbstractC19074t.m100204b(profilePreviewAlbumItemImpl.getIcon(), "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 5, profilePreviewAlbumItemImpl.getIcon());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || profilePreviewAlbumItemImpl.getType() != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 6, profilePreviewAlbumItemImpl.getType());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || profilePreviewAlbumItemImpl.getId() != 0) {
            interfaceC21886d.mo114022E(serialDescriptor, 7, profilePreviewAlbumItemImpl.getId());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || profilePreviewAlbumItemImpl.getTheme() != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 8, profilePreviewAlbumItemImpl.getTheme());
        }
        if (!interfaceC21886d.mo114019A(serialDescriptor, 9)) {
            ThemeItemImpl themeItemImpl = profilePreviewAlbumItemImpl._themeInfo;
            ThemeItem m46365a = ThemeItem.Companion.m46365a();
            AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
        }
        interfaceC21886d.mo114029i(serialDescriptor, 9, ThemeItemImpl$$serializer.INSTANCE, profilePreviewAlbumItemImpl._themeInfo);
        if (interfaceC21886d.mo114019A(serialDescriptor, 10) || !AbstractC19074t.m100204b(profilePreviewAlbumItemImpl.getCropInfo(), new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null))) {
            interfaceC21886d.mo114029i(serialDescriptor, 10, SmartCropInfo$$serializer.INSTANCE, profilePreviewAlbumItemImpl.getCropInfo());
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 11) || profilePreviewAlbumItemImpl.getPrivacyType() != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 11, profilePreviewAlbumItemImpl.getPrivacyType());
        }
    }

    public final String component1() {
        return this.title;
    }

    public final ProfilePreviewAlbumItemImpl copy(String str) {
        AbstractC19074t.m100208f(str, "title");
        return new ProfilePreviewAlbumItemImpl(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProfilePreviewAlbumItemImpl) && AbstractC19074t.m100204b(this.title, ((ProfilePreviewAlbumItemImpl) obj).title);
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public SmartCropInfo getCropInfo() {
        return this.cropInfo;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public String getDesc() {
        return this.desc;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public String getIcon() {
        return this.icon;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public long getId() {
        return this.f46708id;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public int getPrivacyType() {
        return this.privacyType;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public int getRemain() {
        return this.remain;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public int getSize() {
        return this.size;
    }

    public int getTheme() {
        return this.theme;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public ThemeItem getThemeInfo() {
        return this._themeInfo;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public String getThumb() {
        return this.thumb;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public String getTitle() {
        return this.title;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public int getType() {
        return this.type;
    }

    public final ThemeItemImpl get_themeInfo() {
        return this._themeInfo;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public void setCropInfo(SmartCropInfo smartCropInfo) {
        AbstractC19074t.m100208f(smartCropInfo, "<set-?>");
        this.cropInfo = smartCropInfo;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setDesc(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.desc = str;
    }

    public void setIcon(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.icon = str;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setId(long j11) {
        this.f46708id = j11;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setPrivacyType(int i11) {
        this.privacyType = i11;
    }

    public void setRemain(int i11) {
        this.remain = i11;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setSize(int i11) {
        this.size = i11;
    }

    public void setTheme(int i11) {
        this.theme = i11;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setThemeInfo(ThemeItem themeItem) {
        AbstractC19074t.m100208f(themeItem, "value");
        this._themeInfo = (ThemeItemImpl) themeItem;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setThumb(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.thumb = str;
    }

    @Override // com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem
    public void setTitle(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.title = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public final void set_themeInfo(ThemeItemImpl themeItemImpl) {
        AbstractC19074t.m100208f(themeItemImpl, "<set-?>");
        this._themeInfo = themeItemImpl;
    }

    public String toString() {
        return "ProfilePreviewAlbumItemImpl(title=" + this.title + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.title);
    }

    public /* synthetic */ ProfilePreviewAlbumItemImpl(int i11, String str, String str2, int i12, int i13, String str3, String str4, int i14, long j11, int i15, ThemeItemImpl themeItemImpl, SmartCropInfo smartCropInfo, int i16, AbstractC26805k1 abstractC26805k1) {
        ThemeItemImpl themeItemImpl2;
        if ((i11 & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i11 & 2) == 0) {
            this.desc = "";
        } else {
            this.desc = str2;
        }
        if ((i11 & 4) == 0) {
            this.size = 0;
        } else {
            this.size = i12;
        }
        this.remain = (i11 & 8) == 0 ? 1000 : i13;
        if ((i11 & 16) == 0) {
            this.thumb = "";
        } else {
            this.thumb = str3;
        }
        if ((i11 & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str4;
        }
        if ((i11 & 64) == 0) {
            this.type = 0;
        } else {
            this.type = i14;
        }
        this.f46708id = (i11 & 128) == 0 ? 0L : j11;
        if ((i11 & 256) == 0) {
            this.theme = 0;
        } else {
            this.theme = i15;
        }
        if ((i11 & 512) == 0) {
            ThemeItem m46365a = ThemeItem.Companion.m46365a();
            AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
            themeItemImpl2 = (ThemeItemImpl) m46365a;
        } else {
            themeItemImpl2 = themeItemImpl;
        }
        this._themeInfo = themeItemImpl2;
        this.cropInfo = (i11 & 1024) == 0 ? new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null) : smartCropInfo;
        if ((i11 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) == 0) {
            this.privacyType = 0;
        } else {
            this.privacyType = i16;
        }
    }

    public ProfilePreviewAlbumItemImpl(String str) {
        AbstractC19074t.m100208f(str, "title");
        this.title = str;
        this.desc = "";
        this.remain = 1000;
        this.thumb = "";
        this.icon = "";
        ThemeItem m46365a = ThemeItem.Companion.m46365a();
        AbstractC19074t.m100206d(m46365a, "null cannot be cast to non-null type com.zing.zalo.feed.mvp.profile.model.theme.ThemeItemImpl");
        this._themeInfo = (ThemeItemImpl) m46365a;
        this.cropInfo = new SmartCropInfo(0, 0, 0, 0, 15, (AbstractC19060k) null);
    }

    public /* synthetic */ ProfilePreviewAlbumItemImpl(String str, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
