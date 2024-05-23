package com.zing.zalo.p077ui.backuprestore.detail;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.backuprestore.detail.f */
/* loaded from: classes5.dex */
public final class C11007f implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f55612a;

    /* renamed from: b */
    private int f55613b;

    /* renamed from: c */
    private int f55614c;

    /* renamed from: d */
    private boolean f55615d;

    /* renamed from: e */
    private final boolean f55616e;

    /* renamed from: f */
    private final String f55617f;

    /* renamed from: g */
    private final String f55618g;

    /* renamed from: h */
    private boolean f55619h;

    /* renamed from: i */
    private int f55620i;

    /* renamed from: com.zing.zalo.ui.backuprestore.detail.f$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11007f m57475a(Bundle bundle) {
            if (bundle != null) {
                int i11 = bundle.getInt("EXTRA_SOURCE_ACTION", -1);
                boolean z11 = bundle.getBoolean("extra_req_sync_from_pc", false);
                String string = bundle.getString("extra_req_sync_from_pc_session", "");
                String string2 = bundle.getString("extra_req_sync_from_pc_name", "");
                boolean z12 = bundle.getBoolean("FORCE_PROCESSING_FLAG", false);
                int i12 = bundle.getInt("EXTRA_OPT_IN_WITH_NEXT_ACTION", 0);
                AbstractC19074t.m100205c(string);
                AbstractC19074t.m100205c(string2);
                C11007f c11007f = new C11007f(0, 0, i11, false, z11, string, string2, z12, i12, 11, null);
                C11007f.Companion.m57476b(c11007f, bundle);
                return c11007f;
            }
            return null;
        }

        /* renamed from: b */
        public final void m57476b(C11007f c11007f, Bundle bundle) {
            if (bundle != null && c11007f != null) {
                c11007f.m57472l(bundle.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1));
                c11007f.m57473m(bundle.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0));
                c11007f.m57471k(bundle.getBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT"));
            }
        }
    }

    public C11007f(int i11, int i12, int i13, boolean z11, boolean z12, String str, String str2, boolean z13, int i14) {
        AbstractC19074t.m100208f(str, "syncSession");
        AbstractC19074t.m100208f(str2, "pcName");
        this.f55612a = i11;
        this.f55613b = i12;
        this.f55614c = i13;
        this.f55615d = z11;
        this.f55616e = z12;
        this.f55617f = str;
        this.f55618g = str2;
        this.f55619h = z13;
        this.f55620i = i14;
    }

    /* renamed from: a */
    public final int m57461a() {
        return this.f55620i;
    }

    /* renamed from: b */
    public final int m57462b() {
        return this.f55612a;
    }

    /* renamed from: c */
    public final int m57463c() {
        return this.f55613b;
    }

    /* renamed from: d */
    public final String m57464d() {
        return this.f55618g;
    }

    /* renamed from: e */
    public final int m57465e() {
        return this.f55614c;
    }

    /* renamed from: f */
    public final String m57466f() {
        return this.f55617f;
    }

    /* renamed from: g */
    public final boolean m57467g() {
        return this.f55615d;
    }

    /* renamed from: h */
    public final boolean m57468h() {
        return this.f55616e;
    }

    /* renamed from: i */
    public final boolean m57469i() {
        return this.f55619h;
    }

    /* renamed from: j */
    public final void m57470j(int i11) {
        this.f55620i = i11;
    }

    /* renamed from: k */
    public final void m57471k(boolean z11) {
        this.f55615d = z11;
    }

    /* renamed from: l */
    public final void m57472l(int i11) {
        this.f55612a = i11;
    }

    /* renamed from: m */
    public final void m57473m(int i11) {
        this.f55613b = i11;
    }

    /* renamed from: n */
    public final void m57474n(boolean z11) {
        this.f55619h = z11;
    }

    public /* synthetic */ C11007f(int i11, int i12, int i13, boolean z11, boolean z12, String str, String str2, boolean z13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? -1 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) == 0 ? i13 : -1, (i15 & 8) != 0 ? false : z11, (i15 & 16) != 0 ? false : z12, (i15 & 32) != 0 ? "" : str, (i15 & 64) == 0 ? str2 : "", (i15 & 128) != 0 ? false : z13, (i15 & 256) == 0 ? i14 : 0);
    }
}
