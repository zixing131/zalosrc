package p083cq;

import aq.C2288h;
import bg0.C2797c;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p185gc.AbstractC19381e;
import pm0.C24848g0;
import vg.C28023b6;

/* renamed from: cq.b */
/* loaded from: classes4.dex */
public final class C17555b extends AbstractC19381e {

    /* renamed from: a */
    private final C2288h f89441a;

    /* renamed from: b */
    private final C2797c f89442b;

    public C17555b(C2288h c2288h, C2797c c2797c) {
        AbstractC19074t.m100208f(c2288h, "repository");
        AbstractC19074t.m100208f(c2797c, "serialTaskDispatcher");
        this.f89441a = c2288h;
        this.f89442b = c2797c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m93497e(C17555b c17555b) {
        AbstractC19074t.m100208f(c17555b, "this$0");
        c17555b.f89441a.mo12067k();
    }

    @Override // p185gc.AbstractC19381e
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo93498b() {
        m93499d();
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    protected void m93499d() {
        try {
            C28023b6.m141250h0().m141396y();
            C28023b6.m141250h0().m141375r();
            C28023b6.m141250h0().m141305O();
            C28023b6.m141250h0().m141381t();
            C28023b6.m141250h0().m141384u();
            this.f89442b.mo13474a(new Runnable() { // from class: cq.a
                @Override // java.lang.Runnable
                public final void run() {
                    C17555b.m93497e(C17555b.this);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
