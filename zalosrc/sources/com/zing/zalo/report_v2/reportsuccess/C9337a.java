package com.zing.zalo.report_v2.reportsuccess;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.report_v2.reportsuccess.a */
/* loaded from: classes4.dex */
public final class C9337a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f49467a;

    /* renamed from: b */
    private final String f49468b;

    /* renamed from: com.zing.zalo.report_v2.reportsuccess.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9337a m50283a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("report_uid");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("object_name");
            if (string2 != null) {
                str = string2;
            }
            return new C9337a(string, str);
        }
    }

    public C9337a(String str, String str2) {
        AbstractC19074t.m100208f(str, "reportUid");
        AbstractC19074t.m100208f(str2, "reportObjectName");
        this.f49467a = str;
        this.f49468b = str2;
    }

    /* renamed from: a */
    public final String m50281a() {
        return this.f49468b;
    }

    /* renamed from: b */
    public final String m50282b() {
        return this.f49467a;
    }
}
