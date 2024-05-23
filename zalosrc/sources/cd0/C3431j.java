package cd0;

import com.zing.zalo.uidrawing.C16716d;
import l30.AbstractC22055v0;
import p354n3.C23528a;
import p716zh.C31980jc;

/* renamed from: cd0.j */
/* loaded from: classes4.dex */
public class C3431j extends AbstractC3425d implements AbstractC22055v0.n {

    /* renamed from: w */
    public C31980jc f14400w;

    /* renamed from: x */
    public boolean f14401x = false;

    /* renamed from: c */
    public static C3431j m17231c(C16716d c16716d) {
        C3431j c3431j = new C3431j();
        c3431j.m17194a(c16716d);
        return c3431j;
    }

    @Override // l30.AbstractC22055v0.n
    /* renamed from: p */
    public void mo17230p(C31980jc c31980jc, C23528a c23528a) {
        this.f14400w = c31980jc;
        if (AbstractC22055v0.m115113C(c31980jc)) {
            this.f14383p.mo44614b1(0);
            AbstractC22055v0.m115132V(this.f14385r, this.f14384q, c31980jc, c23528a, AbstractC22055v0.m115153m(), this.f14401x);
            this.f14385r.mo89158x0(1.0f);
            return;
        }
        this.f14383p.mo44614b1(8);
    }
}
