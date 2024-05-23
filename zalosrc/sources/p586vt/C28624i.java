package p586vt;

import f40.C18719a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p667y2.C30268e;
import pm0.C24848g0;

/* renamed from: vt.i */
/* loaded from: classes.dex */
public final class C28624i {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static C28624i f132713d;

    /* renamed from: a */
    private final C28622g f132714a;

    /* renamed from: b */
    private final C28628m f132715b;

    /* renamed from: c */
    private final Map f132716c;

    /* renamed from: vt.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28624i m143166a() {
            if (C28624i.f132713d == null) {
                synchronized (C28624i.class) {
                    try {
                        if (C28624i.f132713d == null) {
                            C28624i.f132713d = new C28624i();
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C28624i c28624i = C28624i.f132713d;
            AbstractC19074t.m100205c(c28624i);
            return c28624i;
        }

        /* renamed from: b */
        public final void m143167b(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            C18719a.m98709b(exc);
        }
    }

    /* renamed from: vt.i$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo143118a(AbstractC28617b abstractC28617b);

        /* renamed from: b */
        void mo143119b(AbstractC28617b abstractC28617b);

        /* renamed from: c */
        void mo143120c(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k);

        /* renamed from: d */
        void mo143121d(AbstractC28617b abstractC28617b);

        /* renamed from: e */
        void mo143122e(AbstractC28617b abstractC28617b);

        /* renamed from: f */
        void mo143123f(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k);
    }

    public C28624i() {
        C28622g c28622g = new C28622g();
        this.f132714a = c28622g;
        C28628m c28628m = new C28628m();
        this.f132715b = c28628m;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f132716c = concurrentHashMap;
        c28622g.m143153i(new C28616a(c28628m, concurrentHashMap));
    }

    /* renamed from: d */
    public static final C28624i m143158d() {
        return Companion.m143166a();
    }

    /* renamed from: c */
    public final void m143159c() {
        try {
            List<AbstractC28617b> m143184b = this.f132715b.m143184b();
            if (m143184b.isEmpty()) {
                return;
            }
            C18719a.m98713f("Check resume jobs: " + m143184b, null, 2, null);
            for (AbstractC28617b abstractC28617b : m143184b) {
                Integer num = (Integer) this.f132716c.get(abstractC28617b);
                if (num != null) {
                    if (num.intValue() != 1 && num.intValue() != 3 && num.intValue() != 5) {
                        AbstractC20110a.f98889a.mo104548a("DO resume job %s because job state exist in JobStateMap BUT value = %d", abstractC28617b.mo96986b(), Integer.valueOf(abstractC28617b.m143127f()));
                    } else {
                        AbstractC20110a.f98889a.mo104548a("NOT resume job %s because job state exist in JobStateMap AND value = %d", abstractC28617b.mo96986b(), Integer.valueOf(abstractC28617b.m143127f()));
                    }
                } else {
                    AbstractC20110a.f98889a.mo104548a("DO resume job %s because job not exist in JobStateMap", abstractC28617b.mo96987d());
                }
                this.f132714a.m143151e(abstractC28617b);
                return;
            }
        } catch (Exception e11) {
            Companion.m143167b(e11);
        }
    }

    /* renamed from: e */
    public final AbstractC28617b m143160e(String str) {
        try {
            return this.f132715b.m143183a(str);
        } catch (Exception e11) {
            Companion.m143167b(e11);
            return null;
        }
    }

    /* renamed from: f */
    public final List m143161f() {
        return this.f132715b.m143184b();
    }

    /* renamed from: g */
    public final boolean m143162g(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        if (abstractC28617b.m143127f() == 4) {
            this.f132714a.m143152g(abstractC28617b);
            return true;
        }
        AbstractC20110a.f98889a.mo104562v("Retry a job that not completed:%s", Integer.valueOf(abstractC28617b.m143127f()));
        return false;
    }

    /* renamed from: h */
    public final boolean m143163h(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            if (this.f132715b.m143185c(abstractC28617b)) {
                this.f132714a.m143154j(abstractC28617b);
                return true;
            }
            return false;
        } catch (Exception e11) {
            Companion.m143167b(e11);
            return true;
        }
    }

    /* renamed from: i */
    public final void m143164i(String str) {
        AbstractC19074t.m100208f(str, "queue");
        AbstractC20110a.f98889a.mo104548a("stopJob: Request stop job of queue %s", str);
        boolean z11 = false;
        for (Map.Entry entry : this.f132716c.entrySet()) {
            AbstractC28617b abstractC28617b = (AbstractC28617b) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104548a("Check job. Queue %s - state %d", abstractC28617b.mo96987d(), Integer.valueOf(intValue));
            if (AbstractC19074t.m100204b(abstractC28617b.mo96987d(), str)) {
                if (intValue == 1 || intValue == 3 || intValue == 5) {
                    aVar.mo104548a("stopJob: found a job of queue %s running with id %s", str, abstractC28617b.m143125c());
                    abstractC28617b.m143124a();
                    z11 = true;
                }
                this.f132716c.remove(abstractC28617b);
            }
        }
        if (!z11) {
            AbstractC20110a.f98889a.mo104548a("stopJob: found no job running of queue %s", str);
        }
    }

    /* renamed from: j */
    public final void m143165j(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "queue");
        try {
            this.f132715b.m143188f(str, z11);
        } catch (Exception e11) {
            Companion.m143167b(e11);
        }
    }
}
