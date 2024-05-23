package com.zing.zalo.report_v2.reportsummary;

import com.zing.zalo.report_v2.model.ReportInfoCollected;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import p205hc.InterfaceC19968g;
import p458qr.C25470c;

/* renamed from: com.zing.zalo.report_v2.reportsummary.a */
/* loaded from: classes4.dex */
public final class C9346a implements InterfaceC19968g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private ReportInfoCollected f49484a;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9346a m50318a(C25470c c25470c) {
            C19059j0 c19059j0 = new C19059j0();
            if (c25470c != null) {
                C9346a c9346a = new C9346a();
                c9346a.m50317b((ReportInfoCollected) c25470c.m131941d("EXTRA_KEY_REPORT_COLLECT_INFO"));
                c19059j0.f94941p = c9346a;
            }
            return (C9346a) c19059j0.f94941p;
        }

        /* renamed from: b */
        public final void m50319b(C25470c c25470c, C9346a c9346a) {
            AbstractC19074t.m100208f(c25470c, "outState");
            AbstractC19074t.m100208f(c9346a, "reportSavedState");
            c25470c.m131947j("EXTRA_KEY_REPORT_COLLECT_INFO", c9346a.m50316a());
        }
    }

    /* renamed from: a */
    public final ReportInfoCollected m50316a() {
        return this.f49484a;
    }

    /* renamed from: b */
    public final void m50317b(ReportInfoCollected reportInfoCollected) {
        this.f49484a = reportInfoCollected;
    }
}
