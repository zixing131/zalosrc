package cd0;

import android.view.View;
import l30.AbstractC22055v0;
import p354n3.C23528a;
import p716zh.C31980jc;

/* renamed from: cd0.i */
/* loaded from: classes4.dex */
public class C3430i extends AbstractC3424c implements AbstractC22055v0.n {

    /* renamed from: w */
    public C31980jc f14399w;

    /* renamed from: k */
    public static C3430i m17229k(View view) {
        C3430i c3430i = new C3430i();
        if (view != null) {
            c3430i.m17192a(view);
        }
        return c3430i;
    }

    @Override // l30.AbstractC22055v0.n
    /* renamed from: p */
    public void mo17230p(C31980jc c31980jc, C23528a c23528a) {
        this.f14399w = c31980jc;
        if (AbstractC22055v0.m115113C(c31980jc)) {
            this.f14376p.setVisibility(0);
            AbstractC22055v0.m115131U(this.f14377q, c31980jc, c23528a, AbstractC22055v0.m115153m());
            this.f14377q.setAlpha(1.0f);
            if (c31980jc.f147033z) {
                this.f14379s.setVisibility(0);
                return;
            } else {
                this.f14379s.setVisibility(8);
                return;
            }
        }
        this.f14376p.setVisibility(8);
    }
}
