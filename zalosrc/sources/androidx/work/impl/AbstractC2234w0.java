package androidx.work.impl;

import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2241j0;
import androidx.work.C2138c;
import androidx.work.C2149h0;
import androidx.work.EnumC2242k;
import androidx.work.InterfaceC2257y;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p535u2.C26976w;
import p535u2.InterfaceC26954c0;
import p535u2.InterfaceC26977x;
import p565v2.AbstractC27446d;
import p565v2.RunnableC27444c;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;

/* renamed from: androidx.work.impl.w0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2234w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.w0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ AbstractC2241j0 f9383q;

        /* renamed from: r */
        final /* synthetic */ C2221r0 f9384r;

        /* renamed from: s */
        final /* synthetic */ String f9385s;

        /* renamed from: t */
        final /* synthetic */ C2218q f9386t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2241j0 abstractC2241j0, C2221r0 c2221r0, String str, C2218q c2218q) {
            super(0);
            this.f9383q = abstractC2241j0;
            this.f9384r = c2221r0;
            this.f9385s = str;
            this.f9386t = c2218q;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m11817a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m11817a() {
            List m131496e;
            m131496e = AbstractC25366r.m131496e(this.f9383q);
            new RunnableC27444c(new C2184c0(this.f9384r, this.f9385s, EnumC2242k.KEEP, m131496e), this.f9386t).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.w0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f9387q = new b();

        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(C26976w c26976w) {
            AbstractC19074t.m100208f(c26976w, "spec");
            if (c26976w.m138982m()) {
                return "Periodic";
            }
            return "OneTime";
        }
    }

    /* renamed from: c */
    public static final InterfaceC2257y m11812c(final C2221r0 c2221r0, final String str, final AbstractC2241j0 abstractC2241j0) {
        AbstractC19074t.m100208f(c2221r0, "<this>");
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(abstractC2241j0, "workRequest");
        final C2218q c2218q = new C2218q();
        final a aVar = new a(abstractC2241j0, c2221r0, str, c2218q);
        c2221r0.m11741x().mo143751c().execute(new Runnable() { // from class: androidx.work.impl.u0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2234w0.m11813d(C2221r0.this, str, c2218q, aVar, abstractC2241j0);
            }
        });
        return c2218q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m11813d(C2221r0 c2221r0, String str, C2218q c2218q, InterfaceC18494a interfaceC18494a, AbstractC2241j0 abstractC2241j0) {
        Object m131206f0;
        AbstractC19074t.m100208f(c2221r0, "$this_enqueueUniquelyNamedPeriodic");
        AbstractC19074t.m100208f(str, "$name");
        AbstractC19074t.m100208f(c2218q, "$operation");
        AbstractC19074t.m100208f(interfaceC18494a, "$enqueueNew");
        AbstractC19074t.m100208f(abstractC2241j0, "$workRequest");
        InterfaceC26977x mo11565L = c2221r0.m11740w().mo11565L();
        List mo139016r = mo11565L.mo139016r(str);
        if (mo139016r.size() <= 1) {
            m131206f0 = AbstractC25332a0.m131206f0(mo139016r);
            C26976w.b bVar = (C26976w.b) m131206f0;
            if (bVar == null) {
                interfaceC18494a.mo12V4();
                return;
            }
            C26976w mo139008j = mo11565L.mo139008j(bVar.f127520a);
            if (mo139008j == null) {
                c2218q.m11725a(new InterfaceC2257y.b.a(new IllegalStateException("WorkSpec with " + bVar.f127520a + ", that matches a name \"" + str + "\", wasn't found")));
                return;
            }
            if (!mo139008j.m138982m()) {
                m11814e(c2218q, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                return;
            }
            if (bVar.f127521b == C2149h0.c.CANCELLED) {
                mo11565L.mo139000b(bVar.f127520a);
                interfaceC18494a.mo12V4();
                return;
            }
            C26976w m138972e = C26976w.m138972e(abstractC2241j0.m11861d(), bVar.f127520a, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388606, null);
            try {
                C2226u m11737t = c2221r0.m11737t();
                AbstractC19074t.m100207e(m11737t, "processor");
                WorkDatabase m11740w = c2221r0.m11740w();
                AbstractC19074t.m100207e(m11740w, "workDatabase");
                C2138c m11735p = c2221r0.m11735p();
                AbstractC19074t.m100207e(m11735p, "configuration");
                List m11738u = c2221r0.m11738u();
                AbstractC19074t.m100207e(m11738u, "schedulers");
                m11815f(m11737t, m11740w, m11735p, m11738u, m138972e, abstractC2241j0.m11860c());
                c2218q.m11725a(InterfaceC2257y.f9481a);
                return;
            } catch (Throwable th2) {
                c2218q.m11725a(new InterfaceC2257y.b.a(th2));
                return;
            }
        }
        m11814e(c2218q, "Can't apply UPDATE policy to the chains of work.");
    }

    /* renamed from: e */
    private static final void m11814e(C2218q c2218q, String str) {
        c2218q.m11725a(new InterfaceC2257y.b.a(new UnsupportedOperationException(str)));
    }

    /* renamed from: f */
    private static final AbstractC2151i0.a m11815f(C2226u c2226u, final WorkDatabase workDatabase, C2138c c2138c, final List list, final C26976w c26976w, final Set set) {
        final String str = c26976w.f127497a;
        final C26976w mo139008j = workDatabase.mo11565L().mo139008j(str);
        if (mo139008j != null) {
            if (mo139008j.f127498b.m11545c()) {
                return AbstractC2151i0.a.NOT_APPLIED;
            }
            if (!(mo139008j.m138982m() ^ c26976w.m138982m())) {
                final boolean m11767k = c2226u.m11767k(str);
                if (!m11767k) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2233w) it.next()).mo11640a(str);
                    }
                }
                workDatabase.m338D(new Runnable() { // from class: androidx.work.impl.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2234w0.m11816g(WorkDatabase.this, mo139008j, c26976w, list, str, set, m11767k);
                    }
                });
                if (!m11767k) {
                    AbstractC2239z.m11855h(c2138c, workDatabase, list);
                }
                if (m11767k) {
                    return AbstractC2151i0.a.APPLIED_FOR_NEXT_RUN;
                }
                return AbstractC2151i0.a.APPLIED_IMMEDIATELY;
            }
            b bVar = b.f9387q;
            throw new UnsupportedOperationException("Can't update " + ((String) bVar.mo205i9(mo139008j)) + " Worker to " + ((String) bVar.mo205i9(c26976w)) + " Worker. Update operation must preserve worker's type.");
        }
        throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m11816g(WorkDatabase workDatabase, C26976w c26976w, C26976w c26976w2, List list, String str, Set set, boolean z11) {
        AbstractC19074t.m100208f(workDatabase, "$workDatabase");
        AbstractC19074t.m100208f(c26976w, "$oldWorkSpec");
        AbstractC19074t.m100208f(c26976w2, "$newWorkSpec");
        AbstractC19074t.m100208f(list, "$schedulers");
        AbstractC19074t.m100208f(str, "$workSpecId");
        AbstractC19074t.m100208f(set, "$tags");
        InterfaceC26977x mo11565L = workDatabase.mo11565L();
        InterfaceC26954c0 mo11566M = workDatabase.mo11566M();
        C26976w m138972e = C26976w.m138972e(c26976w2, null, c26976w.f127498b, null, null, null, null, 0L, 0L, 0L, null, c26976w.f127507k, null, 0L, c26976w.f127510n, 0L, 0L, false, null, c26976w.m138978i(), c26976w.m138975f() + 1, c26976w.m138976g(), c26976w.m138977h(), 0, 4447229, null);
        if (c26976w2.m138977h() == 1) {
            m138972e.m138984o(c26976w2.m138976g());
            m138972e.m138985p(m138972e.m138977h() + 1);
        }
        mo11565L.mo139003e(AbstractC27446d.m140484d(list, m138972e));
        mo11566M.mo138915c(str);
        mo11566M.mo138916d(str, set);
        if (!z11) {
            mo11565L.mo139015q(str, -1L);
            workDatabase.mo11564K().mo138965b(str);
        }
    }
}
