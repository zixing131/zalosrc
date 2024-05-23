package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import fn0.AbstractC19074t;
import kotlinx.coroutines.Job;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes2.dex */
public final class C1789q {

    /* renamed from: a */
    private final AbstractC1785o f7378a;

    /* renamed from: b */
    private final AbstractC1785o.b f7379b;

    /* renamed from: c */
    private final C1771h f7380c;

    /* renamed from: d */
    private final InterfaceC1795t f7381d;

    public C1789q(AbstractC1785o abstractC1785o, AbstractC1785o.b bVar, C1771h c1771h, final Job job) {
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        AbstractC19074t.m100208f(bVar, "minState");
        AbstractC19074t.m100208f(c1771h, "dispatchQueue");
        AbstractC19074t.m100208f(job, "parentJob");
        this.f7378a = abstractC1785o;
        this.f7379b = bVar;
        this.f7380c = c1771h;
        InterfaceC1795t interfaceC1795t = new InterfaceC1795t() { // from class: androidx.lifecycle.p
            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public final void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                C1789q.m9349c(C1789q.this, job, interfaceC1801w, aVar);
            }
        };
        this.f7381d = interfaceC1795t;
        if (abstractC1785o.mo9336b() == AbstractC1785o.b.DESTROYED) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
            m9350b();
        } else {
            abstractC1785o.mo9335a(interfaceC1795t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m9349c(C1789q c1789q, Job job, InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC19074t.m100208f(c1789q, "this$0");
        AbstractC19074t.m100208f(job, "$parentJob");
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "<anonymous parameter 1>");
        if (interfaceC1801w.getLifecycle().mo9336b() == AbstractC1785o.b.DESTROYED) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
            c1789q.m9350b();
        } else if (interfaceC1801w.getLifecycle().mo9336b().compareTo(c1789q.f7379b) < 0) {
            c1789q.f7380c.m9290h();
        } else {
            c1789q.f7380c.m9291i();
        }
    }

    /* renamed from: b */
    public final void m9350b() {
        this.f7378a.mo9338d(this.f7381d);
        this.f7380c.m9289g();
    }
}
