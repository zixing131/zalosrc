package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mycloud.collection.d */
/* loaded from: classes6.dex */
public final class C12557d implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f65569a = "";

    /* renamed from: b */
    private long f65570b;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12557d m70740a(Bundle bundle) {
            C12557d c12557d = new C12557d();
            if (bundle != null) {
                c12557d.m70738c(bundle.getLong("EXTRA_PARAM_COLLECTION_ID", 0L));
                String string = bundle.getString("EXTRA_PARAM_ENTRY_POINT", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                c12557d.m70739d(string);
            }
            return c12557d;
        }
    }

    /* renamed from: a */
    public final long m70736a() {
        return this.f65570b;
    }

    /* renamed from: b */
    public final String m70737b() {
        return this.f65569a;
    }

    /* renamed from: c */
    public final void m70738c(long j11) {
        this.f65570b = j11;
    }

    /* renamed from: d */
    public final void m70739d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f65569a = str;
    }
}
