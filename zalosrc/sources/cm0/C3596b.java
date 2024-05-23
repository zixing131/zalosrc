package cm0;

import bm0.AbstractC2848b;
import bm0.AbstractC2849c;
import cm0.C3595a;
import em0.AbstractC18491b;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import la.C22166a;
import p294ka.AbstractC21632c;
import p294ka.C21631b;
import p294ka.InterfaceC21630a;
import p342m6.AbstractC22888j;
import p385oa.C24141a;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: cm0.b */
/* loaded from: classes7.dex */
public final class C3596b extends AbstractC2849c {

    /* renamed from: p */
    private final C21631b.a f15206p;

    /* renamed from: q */
    private final Object f15207q;

    /* renamed from: r */
    private InterfaceC21630a f15208r;

    public C3596b() {
        C21631b.a m111563c = new C21631b.a().m111562b(0, new int[0]).m111563c(AbstractC2848b.m13733a());
        AbstractC19074t.m100207e(m111563c, "Builder()\n        .setBa…tExecutor(directExecutor)");
        this.f15206p = m111563c;
        this.f15207q = new Object();
    }

    /* renamed from: h */
    private final InterfaceC21630a m18216h() {
        InterfaceC21630a interfaceC21630a;
        synchronized (this.f15207q) {
            try {
                if (this.f15208r == null) {
                    InterfaceC21630a m111564a = AbstractC21632c.m111564a(this.f15206p.m111561a());
                    AbstractC19074t.m100207e(m111564a, "getClient(options.build())");
                    this.f15208r = m111564a;
                }
                interfaceC21630a = this.f15208r;
                AbstractC19074t.m100205c(interfaceC21630a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC21630a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15207q) {
            try {
                InterfaceC21630a interfaceC21630a = this.f15208r;
                if (interfaceC21630a != null) {
                    interfaceC21630a.close();
                }
                this.f15208r = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bm0.AbstractC2849c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List mo13738f(C24141a c24141a) {
        int m131511r;
        AbstractC19074t.m100208f(c24141a, "inputImage");
        AbstractC25368s.m131502j();
        AbstractC22888j mo34568X3 = m18216h().mo34568X3(c24141a);
        AbstractC19074t.m100207e(mo34568X3, "scanner.process(inputImage)");
        List list = (List) AbstractC18491b.m97867a(mo34568X3, 1000L, TimeUnit.MILLISECONDS);
        AbstractC19074t.m100207e(list, "barcodeList");
        List<C22166a> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (C22166a c22166a : list2) {
            C3595a.a aVar = C3595a.Companion;
            AbstractC19074t.m100207e(c22166a, "barcode");
            arrayList.add(aVar.m18212a(c22166a));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void m18218o(C3595a.b bVar) {
        AbstractC19074t.m100208f(bVar, "format");
        this.f15206p.m111562b(bVar.m18214c(), new int[0]);
        synchronized (this.f15207q) {
            this.f15208r = null;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
