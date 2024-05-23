package com.zing.zalo.feed.formpostfeed.data;

import am.AbstractC0924m0;
import com.zing.zalo.feed.formpostfeed.data.TimelineFpfEntrySetting;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.formpostfeed.data.b */
/* loaded from: classes4.dex */
public final class C8454b {

    /* renamed from: a */
    private C8453a f45915a;

    /* renamed from: a */
    public final C8453a m44998a() {
        if (this.f45915a == null) {
            C8453a c8453a = new C8453a();
            String m3706c0 = AbstractC0924m0.m3706c0();
            if (m3706c0 != null && m3706c0.length() != 0) {
                TimelineFpfEntrySetting.Companion companion = TimelineFpfEntrySetting.Companion;
                AbstractC19074t.m100205c(m3706c0);
                c8453a.m44997e(companion.m44991b(m3706c0));
                c8453a.m44996d(AbstractC0924m0.m3588Y0());
            }
            this.f45915a = c8453a;
        }
        C8453a c8453a2 = this.f45915a;
        if (c8453a2 == null) {
            return new C8453a();
        }
        return c8453a2;
    }

    /* renamed from: b */
    public final void m44999b(C8453a c8453a) {
        AbstractC19074t.m100208f(c8453a, "config");
        this.f45915a = c8453a;
        AbstractC0924m0.m3254Me(c8453a.m44994b().toJsonString());
        AbstractC0924m0.m4378yh(c8453a.m44993a());
    }
}
