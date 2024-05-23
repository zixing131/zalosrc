package com.zing.zalo.p077ui.mycloud.collection;

import android.os.Bundle;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.mycloud.collection.a */
/* loaded from: classes6.dex */
public final class C12554a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f65559a;

    /* renamed from: com.zing.zalo.ui.mycloud.collection.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12554a m70716a(Bundle bundle) {
            C12554a c12554a = new C12554a();
            if (bundle != null) {
                c12554a.m70715b(bundle.getLong("EXTRA_PARAM_COLLECTION_ID", 0L));
            }
            return c12554a;
        }
    }

    /* renamed from: a */
    public final long m70714a() {
        return this.f65559a;
    }

    /* renamed from: b */
    public final void m70715b(long j11) {
        this.f65559a = j11;
    }
}
