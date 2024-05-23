package com.zing.zalo.p077ui.backuprestore.settings;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.backuprestore.settings.a */
/* loaded from: classes5.dex */
public final class C11128a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f55994a;

    /* renamed from: b */
    private int f55995b;

    /* renamed from: c */
    private int f55996c;

    /* renamed from: d */
    private boolean f55997d;

    /* renamed from: e */
    private final boolean f55998e;

    /* renamed from: f */
    private final String f55999f;

    /* renamed from: g */
    private final String f56000g;

    /* renamed from: h */
    private boolean f56001h;

    /* renamed from: com.zing.zalo.ui.backuprestore.settings.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11128a m58233a(Bundle bundle) {
            if (bundle != null) {
                int i11 = bundle.getInt("EXTRA_SOURCE_ACTION", -1);
                boolean z11 = bundle.getBoolean("extra_req_sync_from_pc", false);
                String string = bundle.getString("extra_req_sync_from_pc_session", "");
                String string2 = bundle.getString("extra_req_sync_from_pc_name", "");
                boolean z12 = bundle.getBoolean("FORCE_PROCESSING_FLAG", false);
                AbstractC19074t.m100205c(string);
                AbstractC19074t.m100205c(string2);
                C11128a c11128a = new C11128a(0, 0, i11, false, z11, string, string2, z12, 11, null);
                C11128a.Companion.m58234b(c11128a, bundle);
                return c11128a;
            }
            return null;
        }

        /* renamed from: b */
        public final void m58234b(C11128a c11128a, Bundle bundle) {
            if (bundle != null && c11128a != null) {
                c11128a.m58230j(bundle.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1));
                c11128a.m58231k(bundle.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0));
                c11128a.m58229i(bundle.getBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT"));
            }
        }
    }

    public C11128a(int i11, int i12, int i13, boolean z11, boolean z12, String str, String str2, boolean z13) {
        AbstractC19074t.m100208f(str, "syncSession");
        AbstractC19074t.m100208f(str2, "pcName");
        this.f55994a = i11;
        this.f55995b = i12;
        this.f55996c = i13;
        this.f55997d = z11;
        this.f55998e = z12;
        this.f55999f = str;
        this.f56000g = str2;
        this.f56001h = z13;
    }

    /* renamed from: a */
    public final int m58221a() {
        return this.f55994a;
    }

    /* renamed from: b */
    public final int m58222b() {
        return this.f55995b;
    }

    /* renamed from: c */
    public final String m58223c() {
        return this.f56000g;
    }

    /* renamed from: d */
    public final int m58224d() {
        return this.f55996c;
    }

    /* renamed from: e */
    public final String m58225e() {
        return this.f55999f;
    }

    /* renamed from: f */
    public final boolean m58226f() {
        return this.f55997d;
    }

    /* renamed from: g */
    public final boolean m58227g() {
        return this.f55998e;
    }

    /* renamed from: h */
    public final boolean m58228h() {
        return this.f56001h;
    }

    /* renamed from: i */
    public final void m58229i(boolean z11) {
        this.f55997d = z11;
    }

    /* renamed from: j */
    public final void m58230j(int i11) {
        this.f55994a = i11;
    }

    /* renamed from: k */
    public final void m58231k(int i11) {
        this.f55995b = i11;
    }

    /* renamed from: l */
    public final void m58232l(boolean z11) {
        this.f56001h = z11;
    }

    public /* synthetic */ C11128a(int i11, int i12, int i13, boolean z11, boolean z12, String str, String str2, boolean z13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? -1 : i11, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) == 0 ? i13 : -1, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? false : z12, (i14 & 32) != 0 ? "" : str, (i14 & 64) == 0 ? str2 : "", (i14 & 128) == 0 ? z13 : false);
    }
}
