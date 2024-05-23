package com.zing.zalo.p077ui.searchdiscovery;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.searchdiscovery.a */
/* loaded from: classes6.dex */
public final class C13003a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f67188a;

    /* renamed from: b */
    private final String f67189b;

    /* renamed from: com.zing.zalo.ui.searchdiscovery.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C13003a m72976a(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("EXTRA_OPEN_SOURCE_POSITION", "0");
                String string2 = bundle.getString("EXTRA_OPEN_SOURCE_ACTION", "0");
                AbstractC19074t.m100205c(string);
                AbstractC19074t.m100205c(string2);
                return new C13003a(string, string2);
            }
            return null;
        }
    }

    public C13003a(String str, String str2) {
        AbstractC19074t.m100208f(str, "sourcePosition");
        AbstractC19074t.m100208f(str2, "sourceAction");
        this.f67188a = str;
        this.f67189b = str2;
    }

    /* renamed from: a */
    public final String m72974a() {
        return this.f67189b;
    }

    /* renamed from: b */
    public final String m72975b() {
        return this.f67188a;
    }
}
