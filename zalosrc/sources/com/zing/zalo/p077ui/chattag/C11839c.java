package com.zing.zalo.p077ui.chattag;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.chattag.c */
/* loaded from: classes5.dex */
public final class C11839c implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f61628a = "";

    /* renamed from: com.zing.zalo.ui.chattag.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C11839c m65802a(Bundle bundle) {
            C11839c c11839c = new C11839c();
            if (bundle != null) {
                String string = bundle.getString("EXTRA_ENTRY_POINT", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                c11839c.m65801b(string);
            }
            return c11839c;
        }
    }

    /* renamed from: a */
    public final String m65800a() {
        return this.f61628a;
    }

    /* renamed from: b */
    public final void m65801b(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f61628a = str;
    }
}
