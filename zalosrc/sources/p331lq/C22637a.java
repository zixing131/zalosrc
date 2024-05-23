package p331lq;

import bo.C2966e1;
import bo.C3001l1;
import fn0.AbstractC19074t;

/* renamed from: lq.a */
/* loaded from: classes4.dex */
public final class C22637a extends AbstractC22639c {

    /* renamed from: f */
    private final C2966e1 f111025f = new C2966e1(new C3001l1());

    @Override // p331lq.AbstractC22639c
    /* renamed from: a */
    public void mo117197a(int i11) {
        if (i11 == 78) {
            m117205g().add(this.f111025f);
        } else {
            super.mo117197a(i11);
        }
    }

    /* renamed from: l */
    public final C3001l1 m117198l() {
        C3001l1 c3001l1 = this.f111025f.f11719q;
        AbstractC19074t.m100207e(c3001l1, "dataLastPost");
        return c3001l1;
    }

    /* renamed from: m */
    public final void m117199m(C3001l1 c3001l1) {
        AbstractC19074t.m100208f(c3001l1, "lastPostViewData");
        this.f111025f.f11719q = c3001l1;
    }
}
