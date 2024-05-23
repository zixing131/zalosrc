package com.zing.zalo.p077ui.searchglobal;

import android.os.Bundle;
import com.zing.zalo.p077ui.searchdiscovery.SearchDiscoveryZInstantView;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import ga0.C19322f1;

/* renamed from: com.zing.zalo.ui.searchglobal.c */
/* loaded from: classes6.dex */
public final class C13027c {

    /* renamed from: a */
    public static final C13027c f67294a = new C13027c();

    private C13027c() {
    }

    /* renamed from: a */
    public static final void m73213a(C17487o0 c17487o0, Bundle bundle, String str) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(bundle, "extras");
        AbstractC19074t.m100208f(str, "sourcePosition");
        if (AbstractC19074t.m100204b(str, "10") && C19322f1.f95950a.m101143U()) {
            c17487o0.m93066i2(SearchDiscoveryZInstantView.class, bundle, 0, 2, true);
        } else {
            f67294a.m73214b(c17487o0, bundle);
        }
    }

    /* renamed from: b */
    public final void m73214b(C17487o0 c17487o0, Bundle bundle) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        AbstractC19074t.m100208f(bundle, "extras");
        SearchGlobalView.Companion.m73194c(c17487o0, bundle, 0, 2, true);
    }
}
