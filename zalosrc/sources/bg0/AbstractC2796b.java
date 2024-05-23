package bg0;

import ag0.AbstractRunnableC0823i0;
import ag0.InterfaceC0806b1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import qm0.AbstractC25363p0;

/* renamed from: bg0.b */
/* loaded from: classes6.dex */
public abstract class AbstractC2796b extends AbstractC2795a {

    /* renamed from: c */
    private final Map f11154c;

    /* renamed from: d */
    private AbstractRunnableC0823i0 f11155d;

    /* renamed from: bg0.b$a */
    /* loaded from: classes6.dex */
    public static class a implements Runnable {

        /* renamed from: p */
        private final int f11156p;

        /* renamed from: q */
        private final Runnable f11157q;

        public a(int i11, Runnable runnable) {
            AbstractC19074t.m100208f(runnable, "task");
            this.f11156p = i11;
            this.f11157q = runnable;
        }

        /* renamed from: a */
        public final int m13479a() {
            return this.f11156p;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11157q.run();
        }
    }

    /* renamed from: bg0.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ a f11159r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f11159r = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m13480a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m13480a() {
            try {
                try {
                    this.f11159r.run();
                } catch (Exception e11) {
                    AbstractC2796b.this.mo13477j(e11);
                }
            } finally {
                AbstractC2796b.this.m13472h();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2796b(InterfaceC0806b1 interfaceC0806b1) {
        super(interfaceC0806b1);
        HashMap m131406k;
        AbstractC19074t.m100208f(interfaceC0806b1, "executor");
        m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a(1, new ArrayDeque()), AbstractC24866w.m129235a(5, new ArrayDeque()), AbstractC24866w.m129235a(10, new ArrayDeque()));
        this.f11154c = m131406k;
    }

    /* renamed from: h */
    public final synchronized void m13472h() {
        try {
            AbstractRunnableC0823i0 abstractRunnableC0823i0 = (AbstractRunnableC0823i0) m13473i(10).poll();
            AbstractRunnableC0823i0 abstractRunnableC0823i02 = null;
            if (abstractRunnableC0823i0 != null) {
                m13467b().mo2040a(abstractRunnableC0823i0);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                abstractRunnableC0823i0 = (AbstractRunnableC0823i0) m13473i(5).poll();
                if (abstractRunnableC0823i0 != null) {
                    m13467b().mo2040a(abstractRunnableC0823i0);
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } else {
                    abstractRunnableC0823i0 = null;
                }
            }
            if (abstractRunnableC0823i0 == null) {
                abstractRunnableC0823i0 = (AbstractRunnableC0823i0) m13473i(1).poll();
                if (abstractRunnableC0823i0 != null) {
                    m13467b().mo2040a(abstractRunnableC0823i0);
                    C24848g0 c24848g03 = C24848g0.f119245a;
                }
                this.f11155d = abstractRunnableC0823i02;
            }
            abstractRunnableC0823i02 = abstractRunnableC0823i0;
            this.f11155d = abstractRunnableC0823i02;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    private final Queue m13473i(int i11) {
        Object obj = this.f11154c.get(Integer.valueOf(i11));
        AbstractC19074t.m100205c(obj);
        return (Queue) obj;
    }

    /* renamed from: f */
    public final synchronized void m13475f() {
        Iterator it = this.f11154c.values().iterator();
        while (it.hasNext()) {
            ((Queue) it.next()).clear();
        }
    }

    @Override // bg0.InterfaceC2798d
    /* renamed from: g */
    public synchronized void mo13474a(a aVar) {
        AbstractC19074t.m100208f(aVar, "task");
        m13473i(aVar.m13479a()).offer(m13468c().mo240pC(aVar, new b(aVar)));
        if (this.f11155d == null) {
            m13472h();
        }
    }

    /* renamed from: j */
    public abstract void mo13477j(Exception exc);

    /* renamed from: k */
    public final synchronized int m13478k() {
        int i11;
        Iterator it = this.f11154c.values().iterator();
        i11 = 0;
        while (it.hasNext()) {
            i11 += ((Queue) it.next()).size();
        }
        return i11;
    }
}
