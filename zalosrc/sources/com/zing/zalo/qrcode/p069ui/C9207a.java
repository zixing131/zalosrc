package com.zing.zalo.qrcode.p069ui;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.qrcode.ui.a */
/* loaded from: classes4.dex */
public final class C9207a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f48858a;

    /* renamed from: b */
    private String f48859b;

    /* renamed from: c */
    private String f48860c;

    /* renamed from: d */
    private String f48861d;

    /* renamed from: com.zing.zalo.qrcode.ui.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9207a m49097a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            int i11 = bundle.getInt("destination", 0);
            String string = bundle.getString("qr_viewer_id", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            String string2 = bundle.getString("qr_viewer_name", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            String string3 = bundle.getString("extra_action_list_task_id", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            return new C9207a(i11, string, string2, string3);
        }
    }

    public C9207a(int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "qrViewerID");
        AbstractC19074t.m100208f(str2, "qrName");
        AbstractC19074t.m100208f(str3, "taskId");
        this.f48858a = i11;
        this.f48859b = str;
        this.f48860c = str2;
        this.f48861d = str3;
    }

    /* renamed from: a */
    public final int m49094a() {
        return this.f48858a;
    }

    /* renamed from: b */
    public final String m49095b() {
        return this.f48860c;
    }

    /* renamed from: c */
    public final String m49096c() {
        return this.f48859b;
    }
}
