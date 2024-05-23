package p605wc;

import fn0.AbstractC19074t;
import nh0.InterfaceC23792b;
import p421pc.C24720a;
import p484ri.C25804a;
import p543uc.InterfaceC27227e;
import sc.C26220b;
import si.C26263i;
import tc.C26627a;

/* renamed from: wc.a */
/* loaded from: classes3.dex */
public final class RunnableC28909a implements Runnable {

    /* renamed from: p */
    private final C25804a f133833p;

    /* renamed from: q */
    private final C24720a f133834q;

    /* renamed from: r */
    private final InterfaceC23792b f133835r;

    public RunnableC28909a(C25804a c25804a, C24720a c24720a, InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepo");
        AbstractC19074t.m100208f(c24720a, "backupRestoreConfigs");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f133833p = c25804a;
        this.f133834q = c24720a;
        this.f133835r = interfaceC23792b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f133834q.m128395L() || !this.f133834q.m128397N() || this.f133835r.mo124314i() - this.f133833p.m132997p() < this.f133834q.m128424t()) {
                return;
            }
            this.f133833p.m132985D(this.f133835r.mo124314i());
            String m132993i = this.f133833p.m132993i();
            if (m132993i.length() == 0) {
                return;
            }
            int m132996n = this.f133833p.m132996n();
            if (m132996n == 2) {
                C26220b.m134827j("Invalid Google Auth: backupEmail=" + C26627a.f126082a.m136728c(m132993i) + ", tokenState=" + m132996n, null, 2, null);
                this.f133833p.m132989H(System.currentTimeMillis());
                return;
            }
            C26220b.m134827j("Start check valid Google Auth: backupEmail=" + C26627a.f126082a.m136728c(m132993i) + ", tokenState=" + m132996n, null, 2, null);
            InterfaceC27227e m135061z = C26263i.m135061z(m132993i);
            if (m135061z == null) {
                return;
            }
            m135061z.mo98988f();
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }
}
