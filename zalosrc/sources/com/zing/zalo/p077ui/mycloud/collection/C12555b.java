package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mycloud.collection.b */
/* loaded from: classes6.dex */
public final class C12555b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f65560a;

    /* renamed from: b */
    private String f65561b = "";

    /* renamed from: com.zing.zalo.ui.mycloud.collection.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12555b m70721a(Bundle bundle) {
            C12555b c12555b = new C12555b();
            if (bundle != null) {
                c12555b.m70719c(bundle.getLong("extra_collection_id", 0L));
                String string = bundle.getString("extra_entry_point", "");
                AbstractC19074t.m100207e(string, "getString(...)");
                c12555b.m70720d(string);
            }
            return c12555b;
        }
    }

    /* renamed from: a */
    public final long m70717a() {
        return this.f65560a;
    }

    /* renamed from: b */
    public final String m70718b() {
        return this.f65561b;
    }

    /* renamed from: c */
    public final void m70719c(long j11) {
        this.f65560a = j11;
    }

    /* renamed from: d */
    public final void m70720d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f65561b = str;
    }
}
