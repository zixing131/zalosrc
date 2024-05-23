package com.zing.zalo.feed.mvp.profile.model.theme;

import android.os.Parcelable;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import pm0.C24848g0;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

/* loaded from: classes4.dex */
public abstract class ThemeItem implements Parcelable {
    public static final int THEME_ID_DEFAULT = 0;
    public static final C8684b Companion = new C8684b(null);
    private static final AbstractC27323a json = AbstractC27336n.m139941b(null, C8683a.f46723q, 1, null);

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem$a */
    /* loaded from: classes4.dex */
    static final class C8683a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C8683a f46723q = new C8683a();

        C8683a() {
            super(1);
        }

        /* renamed from: a */
        public final void m46364a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m46364a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.theme.ThemeItem$b */
    /* loaded from: classes4.dex */
    public static final class C8684b {
        private C8684b() {
        }

        public /* synthetic */ C8684b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ThemeItem m46365a() {
            return new ThemeItemImpl(0, (DecorItemImpl) null, (DecorItemImpl) null, (DecorAlbumImpl) null, (DecorAlbumImpl) null, (ContentImpl) null, (ContentImpl) null, 127, (AbstractC19060k) null);
        }

        /* renamed from: b */
        public final ThemeItem m46366b(String str) {
            AbstractC19074t.m100208f(str, "data");
            try {
                AbstractC27323a abstractC27323a = ThemeItem.json;
                abstractC27323a.mo131586a();
                return (ThemeItem) abstractC27323a.m139867d(ThemeItemImpl.Companion.serializer(), str);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return m46365a();
            }
        }
    }

    public static final ThemeItem parseFromJson(String str) {
        return Companion.m46366b(str);
    }

    public abstract int getAlbumCaptionColor();

    public abstract Content getContent();

    public abstract DecorAlbum getDecorAlbum();

    public abstract DecorItem getDecorItem();

    public abstract int getId();

    public abstract int getLineDividerColor();

    public final boolean isThemeDefault() {
        if (getId() == 0) {
            return true;
        }
        return false;
    }

    public abstract JSONObject toJsonObject();
}
