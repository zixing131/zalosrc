package com.zing.zalo.qrcode.p069ui.scan;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.qrcode.ui.scan.a */
/* loaded from: classes4.dex */
public final class C9255a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f49051a;

    /* renamed from: b */
    private final String f49052b;

    /* renamed from: c */
    private final String f49053c;

    /* renamed from: d */
    private final boolean f49054d;

    /* renamed from: e */
    private int f49055e;

    /* renamed from: com.zing.zalo.qrcode.ui.scan.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9255a m49429a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            boolean z11;
            int i11;
            if (bundle == null || (str = bundle.getString("qr_viewer_id")) == null) {
                str = "";
            }
            if (bundle == null || (str2 = bundle.getString("qr_viewer_name")) == null) {
                str2 = "";
            }
            if (bundle == null || (str3 = bundle.getString("extra_action_list_task_id")) == null) {
                str3 = "";
            }
            if (bundle != null) {
                z11 = bundle.getBoolean("extra_return_raw_qr_content", false);
            } else {
                z11 = false;
            }
            if (bundle != null) {
                i11 = bundle.getInt("extra_src", 0);
            } else {
                i11 = 0;
            }
            return new C9255a(str, str2, str3, z11, i11);
        }
    }

    public C9255a(String str, String str2, String str3, boolean z11, int i11) {
        AbstractC19074t.m100208f(str, "qrViewerID");
        AbstractC19074t.m100208f(str2, "qrViewerName");
        AbstractC19074t.m100208f(str3, "actionListTaskId");
        this.f49051a = str;
        this.f49052b = str2;
        this.f49053c = str3;
        this.f49054d = z11;
        this.f49055e = i11;
    }

    /* renamed from: a */
    public final String m49426a() {
        return this.f49053c;
    }

    /* renamed from: b */
    public final boolean m49427b() {
        return this.f49054d;
    }

    /* renamed from: c */
    public final int m49428c() {
        return this.f49055e;
    }
}
