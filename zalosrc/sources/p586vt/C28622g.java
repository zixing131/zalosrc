package p586vt;

import f40.C18719a;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19074t;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p586vt.C28624i;

/* renamed from: vt.g */
/* loaded from: classes.dex */
public final class C28622g {

    /* renamed from: a */
    private ThreadPoolExecutor f132710a;

    /* renamed from: b */
    public C28624i.b f132711b;

    public C28622g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("JobManagerPool"));
        this.f132710a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* renamed from: f */
    public static final void m143147f(C28622g c28622g, AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(c28622g, "this$0");
        AbstractC19074t.m100208f(abstractC28617b, "$job");
        c28622g.m143150d().mo143118a(abstractC28617b);
        AbstractC28626k m143132l = abstractC28617b.m143132l();
        if (m143132l.mo96995c()) {
            c28622g.m143150d().mo143120c(abstractC28617b, m143132l);
        } else {
            c28622g.m143150d().mo143123f(abstractC28617b, m143132l);
        }
    }

    /* renamed from: h */
    public static final void m143148h(C28622g c28622g, AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(c28622g, "this$0");
        AbstractC19074t.m100208f(abstractC28617b, "$job");
        c28622g.m143150d().mo143121d(abstractC28617b);
        AbstractC28626k m143132l = abstractC28617b.m143132l();
        if (m143132l.mo96995c()) {
            c28622g.m143150d().mo143120c(abstractC28617b, m143132l);
        } else {
            c28622g.m143150d().mo143123f(abstractC28617b, m143132l);
        }
    }

    /* renamed from: k */
    public static final void m143149k(C28622g c28622g, AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(c28622g, "this$0");
        AbstractC19074t.m100208f(abstractC28617b, "$job");
        c28622g.m143150d().mo143119b(abstractC28617b);
        AbstractC28626k m143132l = abstractC28617b.m143132l();
        if (m143132l.mo96995c()) {
            c28622g.m143150d().mo143120c(abstractC28617b, m143132l);
        } else {
            c28622g.m143150d().mo143123f(abstractC28617b, m143132l);
        }
    }

    /* renamed from: d */
    public final C28624i.b m143150d() {
        C28624i.b bVar = this.f132711b;
        if (bVar != null) {
            return bVar;
        }
        AbstractC19074t.m100223u("jobCallback");
        return null;
    }

    /* renamed from: e */
    public final void m143151e(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        C18719a.m98713f("resumeJob(): job=" + abstractC28617b, null, 2, null);
        m143150d().mo143122e(abstractC28617b);
        this.f132710a.submit(new Runnable() { // from class: vt.e

            /* renamed from: q */
            public final /* synthetic */ AbstractC28617b f132707q;

            public /* synthetic */ RunnableC28620e(AbstractC28617b abstractC28617b2) {
                r2 = abstractC28617b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28622g.m143147f(C28622g.this, r2);
            }
        });
    }

    /* renamed from: g */
    public final void m143152g(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        C18719a.m98713f("retryJob(): job=" + abstractC28617b, null, 2, null);
        m143150d().mo143122e(abstractC28617b);
        this.f132710a.submit(new Runnable() { // from class: vt.f

            /* renamed from: q */
            public final /* synthetic */ AbstractC28617b f132709q;

            public /* synthetic */ RunnableC28621f(AbstractC28617b abstractC28617b2) {
                r2 = abstractC28617b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28622g.m143148h(C28622g.this, r2);
            }
        });
    }

    /* renamed from: i */
    public final void m143153i(C28624i.b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f132711b = bVar;
    }

    /* renamed from: j */
    public final void m143154j(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        C18719a.m98713f("submitJob(): job=" + abstractC28617b, null, 2, null);
        m143150d().mo143122e(abstractC28617b);
        this.f132710a.submit(new Runnable() { // from class: vt.d

            /* renamed from: q */
            public final /* synthetic */ AbstractC28617b f132705q;

            public /* synthetic */ RunnableC28619d(AbstractC28617b abstractC28617b2) {
                r2 = abstractC28617b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28622g.m143149k(C28622g.this, r2);
            }
        });
    }
}
