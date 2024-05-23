package p586vt;

import com.zing.zalo.p062db.C7959d;
import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: vt.m */
/* loaded from: classes.dex */
public final class C28628m {
    public static final a Companion = new a(null);

    /* renamed from: vt.m$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: a */
    public final AbstractC28617b m143183a(String str) {
        return C7959d.Companion.m41850e().m41780e1(str);
    }

    /* renamed from: b */
    public final List m143184b() {
        return C7959d.Companion.m41850e().m41834w1();
    }

    /* renamed from: c */
    public final boolean m143185c(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        C18719a.m98714g("JobStorage", "saveJob: " + abstractC28617b.mo96987d() + " - " + abstractC28617b.m143125c() + " - " + abstractC28617b, null, 4, null);
        return C7959d.Companion.m41850e().m41753T2(abstractC28617b);
    }

    /* renamed from: d */
    public final void m143186d(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k, long j11) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        AbstractC19074t.m100208f(abstractC28626k, "jobResult");
        C18719a.m98713f("updateResultOfJob(): job=" + abstractC28617b + ", jobResult=" + abstractC28626k + ", jobId: " + abstractC28617b.m143125c(), null, 2, null);
        C7959d.Companion.m41850e().m41701F3(abstractC28617b, abstractC28626k, j11);
    }

    /* renamed from: e */
    public final void m143187e(AbstractC28617b abstractC28617b, int i11) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        C18719a.m98713f("updateStatusOfJob(): job=" + abstractC28617b + ", status=" + i11 + ", jobId: " + abstractC28617b.m143125c(), null, 2, null);
        C7959d.Companion.m41850e().m41708H3(abstractC28617b, i11);
    }

    /* renamed from: f */
    public final void m143188f(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "queue");
        C7959d.Companion.m41850e().m41721K3(str, z11);
    }
}
