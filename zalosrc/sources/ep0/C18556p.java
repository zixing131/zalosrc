package ep0;

import android.view.View;
import kg.AbstractC21707d;
import kg.AbstractC21717n;
import kg.C21709f;

/* renamed from: ep0.p */
/* loaded from: classes7.dex */
public class C18556p extends AbstractC21707d {

    /* renamed from: p */
    private final View f93269p;

    /* renamed from: q */
    private final double f93270q;

    public C18556p(View view) {
        this.f93269p = view;
        this.f93270q = 0.85d;
    }

    @Override // kg.AbstractC21707d, kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        float m112064b = (float) AbstractC21717n.m112064b(c21709f.m112033d(), 0.0d, 1.0d, 1.0d, this.f93270q);
        this.f93269p.setScaleX(m112064b);
        this.f93269p.setScaleY(m112064b);
    }

    public C18556p(View view, double d11) {
        this.f93269p = view;
        this.f93270q = d11;
    }
}
