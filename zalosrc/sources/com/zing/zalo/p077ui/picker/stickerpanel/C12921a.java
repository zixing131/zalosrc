package com.zing.zalo.p077ui.picker.stickerpanel;

import android.os.Bundle;
import com.zing.zalo.adapters.C7110j8;
import com.zing.zalo.p077ui.widget.StickerIndicatorView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import y90.EnumC30861e;

/* renamed from: com.zing.zalo.ui.picker.stickerpanel.a */
/* loaded from: classes6.dex */
public final class C12921a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final EnumC30861e f66950a;

    /* renamed from: b */
    private final int f66951b;

    /* renamed from: c */
    private final boolean f66952c;

    /* renamed from: d */
    private final boolean f66953d;

    /* renamed from: e */
    private final StickerIndicatorView.C13538e f66954e;

    /* renamed from: f */
    private final C7110j8.d f66955f;

    /* renamed from: g */
    private final boolean f66956g;

    /* renamed from: h */
    private final int f66957h;

    /* renamed from: i */
    private final String f66958i;

    /* renamed from: j */
    private final boolean f66959j;

    /* renamed from: k */
    private final int f66960k;

    /* renamed from: l */
    private final int f66961l;

    /* renamed from: m */
    private final boolean f66962m;

    /* renamed from: n */
    private final int f66963n;

    /* renamed from: o */
    private final boolean f66964o;

    /* renamed from: p */
    private final boolean f66965p;

    /* renamed from: com.zing.zalo.ui.picker.stickerpanel.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12921a m72767a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            EnumC30861e enumC30861e = (EnumC30861e) bundle.getSerializable("EXTRA_PANEL_TYPE");
            if (enumC30861e == null) {
                enumC30861e = EnumC30861e.f142417p;
            }
            EnumC30861e enumC30861e2 = enumC30861e;
            int i11 = bundle.getInt("EXTRA_SYSTEM_EMOJI_COLUMN_COUNT", -1);
            boolean z11 = bundle.getBoolean("EXTRA_ENABLE_SETTING_ICON", true);
            boolean z12 = bundle.getBoolean("EXTRA_ENABLE_AUTO_PLAY_LOOP_ANIM", true);
            StickerIndicatorView.C13538e c13538e = (StickerIndicatorView.C13538e) bundle.getSerializable("EXTRA_INDICATOR_CUSTOM_STYLE");
            C7110j8.d dVar = (C7110j8.d) bundle.getSerializable("EXTRA_PAGER_CUSTOM_STYLE");
            boolean z13 = bundle.getBoolean("EXTRA_STICKER_ONLY_IN_RECENT_TAB");
            int i12 = bundle.getInt("EXTRA_SOURCE_FRAGMENT");
            String string = bundle.getString("EXTRA_AUTO_PLAY_PREFIX");
            if (string == null) {
                string = "";
            }
            return new C12921a(enumC30861e2, i11, z11, z12, c13538e, dVar, z13, i12, string, bundle.getBoolean("EXTRA_ENABLE_INDICATOR"), bundle.getInt("EXTRA_NORMAL_PANEL_COMPONENTS"), bundle.getInt("EXTRA_INDICATOR_BACKGROUND_COLOR_RES"), bundle.getBoolean("EXTRA_ENABLE_GO_TO_STORE_BTN", true), bundle.getInt("EXTRA_STICKER_PANEL_HEIGHT", -1), bundle.getBoolean("EXTRA_ENABLE_FORCE_JUMP_SEASONAL_TAB"), bundle.getBoolean("EXTRA_ENABLE_SEARCH_GIF_ICON", false));
        }
    }

    public C12921a(EnumC30861e enumC30861e, int i11, boolean z11, boolean z12, StickerIndicatorView.C13538e c13538e, C7110j8.d dVar, boolean z13, int i12, String str, boolean z14, int i13, int i14, boolean z15, int i15, boolean z16, boolean z17) {
        AbstractC19074t.m100208f(enumC30861e, "stickerPanelType");
        AbstractC19074t.m100208f(str, "autoPlayPrefix");
        this.f66950a = enumC30861e;
        this.f66951b = i11;
        this.f66952c = z11;
        this.f66953d = z12;
        this.f66954e = c13538e;
        this.f66955f = dVar;
        this.f66956g = z13;
        this.f66957h = i12;
        this.f66958i = str;
        this.f66959j = z14;
        this.f66960k = i13;
        this.f66961l = i14;
        this.f66962m = z15;
        this.f66963n = i15;
        this.f66964o = z16;
        this.f66965p = z17;
    }

    /* renamed from: a */
    public final String m72751a() {
        return this.f66958i;
    }

    /* renamed from: b */
    public final boolean m72752b() {
        return this.f66953d;
    }

    /* renamed from: c */
    public final boolean m72753c() {
        return this.f66964o;
    }

    /* renamed from: d */
    public final boolean m72754d() {
        return this.f66962m;
    }

    /* renamed from: e */
    public final boolean m72755e() {
        return this.f66959j;
    }

    /* renamed from: f */
    public final boolean m72756f() {
        return this.f66965p;
    }

    /* renamed from: g */
    public final boolean m72757g() {
        return this.f66952c;
    }

    /* renamed from: h */
    public final int m72758h() {
        return this.f66961l;
    }

    /* renamed from: i */
    public final StickerIndicatorView.C13538e m72759i() {
        return this.f66954e;
    }

    /* renamed from: j */
    public final int m72760j() {
        return this.f66960k;
    }

    /* renamed from: k */
    public final C7110j8.d m72761k() {
        return this.f66955f;
    }

    /* renamed from: l */
    public final boolean m72762l() {
        return this.f66956g;
    }

    /* renamed from: m */
    public final int m72763m() {
        return this.f66957h;
    }

    /* renamed from: n */
    public final int m72764n() {
        return this.f66963n;
    }

    /* renamed from: o */
    public final EnumC30861e m72765o() {
        return this.f66950a;
    }

    /* renamed from: p */
    public final int m72766p() {
        return this.f66951b;
    }
}
