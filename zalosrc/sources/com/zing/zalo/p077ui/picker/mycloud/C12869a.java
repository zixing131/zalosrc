package com.zing.zalo.p077ui.picker.mycloud;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;
import p461qu.AbstractC25495a;

/* renamed from: com.zing.zalo.ui.picker.mycloud.a */
/* loaded from: classes6.dex */
public final class C12869a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f66860a;

    /* renamed from: b */
    private String f66861b = "0";

    /* renamed from: com.zing.zalo.ui.picker.mycloud.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12869a m72568a(Bundle bundle) {
            String str;
            C12869a c12869a = new C12869a();
            if (bundle != null) {
                c12869a.m72566c(bundle.getString("CONVERSATION_ID"));
                String m72564a = c12869a.m72564a();
                if (m72564a == null) {
                    m72564a = "";
                }
                if (AbstractC25495a.m132079d(m72564a)) {
                    str = "2";
                } else if (AbstractC25495a.m132086k(m72564a)) {
                    str = "3";
                } else if (AbstractC25495a.m132078c(m72564a)) {
                    str = "4";
                } else {
                    str = "1";
                }
                c12869a.m72567d(str);
            }
            return c12869a;
        }
    }

    /* renamed from: a */
    public final String m72564a() {
        return this.f66860a;
    }

    /* renamed from: b */
    public final String m72565b() {
        return this.f66861b;
    }

    /* renamed from: c */
    public final void m72566c(String str) {
        this.f66860a = str;
    }

    /* renamed from: d */
    public final void m72567d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f66861b = str;
    }
}
