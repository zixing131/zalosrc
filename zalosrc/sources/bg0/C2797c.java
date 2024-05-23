package bg0;

import ag0.AbstractRunnableC0823i0;
import ag0.InterfaceC0806b1;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayDeque;
import java.util.Queue;
import p667y2.C30268e;
import pm0.C24848g0;

/* renamed from: bg0.c */
/* loaded from: classes.dex */
public class C2797c extends AbstractC2795a {

    /* renamed from: c */
    private final Queue f11160c;

    /* renamed from: d */
    private AbstractRunnableC0823i0 f11161d;

    /* renamed from: bg0.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Runnable f11163r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Runnable runnable) {
            super(0);
            this.f11163r = runnable;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m13485a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m13485a() {
            try {
                try {
                    this.f11163r.run();
                } catch (Exception e11) {
                    C2797c.this.mo12810i(e11);
                }
            } finally {
                C2797c.this.m13482h();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2797c(InterfaceC0806b1 interfaceC0806b1) {
        super(interfaceC0806b1);
        AbstractC19074t.m100208f(interfaceC0806b1, "executor");
        this.f11160c = new ArrayDeque();
    }

    /* renamed from: h */
    public final synchronized void m13482h() {
        try {
            AbstractRunnableC0823i0 abstractRunnableC0823i0 = (AbstractRunnableC0823i0) this.f11160c.poll();
            if (abstractRunnableC0823i0 != null) {
                m13467b().mo2040a(abstractRunnableC0823i0);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                abstractRunnableC0823i0 = null;
            }
            this.f11161d = abstractRunnableC0823i0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m13483f() {
        this.f11160c.clear();
    }

    @Override // bg0.InterfaceC2798d
    /* renamed from: g */
    public synchronized void mo13474a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "task");
        this.f11160c.offer(m13468c().mo240pC(runnable, new a(runnable)));
        if (this.f11161d == null) {
            m13482h();
        }
    }

    /* renamed from: i */
    public void mo12810i(Exception exc) {
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        throw exc;
    }
}
