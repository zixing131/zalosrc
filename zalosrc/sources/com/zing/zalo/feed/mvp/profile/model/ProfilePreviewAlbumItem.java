package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcelable;
import com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import pm0.C24848g0;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

/* loaded from: classes4.dex */
public abstract class ProfilePreviewAlbumItem implements Parcelable {
    public static final int DEFAULT_REMAIN_ITEM = 1000;
    public static final C8670b Companion = new C8670b(null);
    private static final AbstractC27323a json = AbstractC27336n.m139941b(null, C8669a.f46707q, 1, null);

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem$a */
    /* loaded from: classes4.dex */
    static final class C8669a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C8669a f46707q = new C8669a();

        C8669a() {
            super(1);
        }

        /* renamed from: a */
        public final void m46318a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46318a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem$b */
    /* loaded from: classes4.dex */
    public static final class C8670b {
        private C8670b() {
        }

        public /* synthetic */ C8670b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ProfilePreviewAlbumItem m46319a(String str) {
            AbstractC19074t.m100208f(str, "jsonString");
            try {
                return (ProfilePreviewAlbumItem) ProfilePreviewAlbumItem.json.m139867d(ProfilePreviewAlbumItemImpl.Companion.serializer(), str);
            } catch (Exception unused) {
                return m46320b();
            }
        }

        /* renamed from: b */
        public final ProfilePreviewAlbumItemImpl m46320b() {
            return new ProfilePreviewAlbumItemImpl(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: c */
        public final String m46321c(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
            AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            try {
                return ProfilePreviewAlbumItem.json.mo131597b(ProfilePreviewAlbumItemImpl.Companion.serializer(), (ProfilePreviewAlbumItemImpl) profilePreviewAlbumItem);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return "";
            }
        }
    }

    public abstract SmartCropInfo getCropInfo();

    public abstract String getDesc();

    public abstract String getIcon();

    public abstract long getId();

    public abstract int getPrivacyType();

    public abstract int getRemain();

    public abstract int getSize();

    public abstract ThemeItem getThemeInfo();

    public abstract String getThumb();

    public abstract String getTitle();

    public abstract int getType();

    public abstract void setDesc(String str);

    public abstract void setId(long j11);

    public abstract void setPrivacyType(int i11);

    public abstract void setSize(int i11);

    public abstract void setThemeInfo(ThemeItem themeItem);

    public abstract void setThumb(String str);

    public abstract void setTitle(String str);
}
