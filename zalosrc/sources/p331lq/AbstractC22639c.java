package p331lq;

import bo.C2966e1;
import bo.C2977g2;
import bo.C3010n0;
import bo.C3054x;
import bo.C3062z;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lq.c */
/* loaded from: classes4.dex */
public abstract class AbstractC22639c {

    /* renamed from: a */
    private final List f111026a = new ArrayList();

    /* renamed from: b */
    private final C2966e1 f111027b = new C2966e1(new C3062z());

    /* renamed from: c */
    private final C2966e1 f111028c = new C2966e1(new C3010n0(0));

    /* renamed from: d */
    private final C2966e1 f111029d = new C2966e1(new C3054x(false));

    /* renamed from: e */
    private final C2966e1 f111030e = new C2966e1(new C2977g2(0));

    /* renamed from: a */
    public void mo117197a(int i11) {
        if (i11 != 84) {
            switch (i11) {
                case 70:
                    this.f111026a.add(this.f111030e);
                    return;
                case 71:
                    this.f111026a.add(this.f111027b);
                    return;
                case 72:
                    this.f111026a.add(this.f111028c);
                    return;
                default:
                    return;
            }
        }
        this.f111026a.add(this.f111029d);
    }

    /* renamed from: b */
    public final void m117200b() {
        this.f111026a.clear();
    }

    /* renamed from: c */
    public final C3054x m117201c() {
        C3054x c3054x = this.f111029d.f11725w;
        AbstractC19074t.m100207e(c3054x, "emptyContentData");
        return c3054x;
    }

    /* renamed from: d */
    public final C3062z m117202d() {
        C3062z c3062z = this.f111027b.f11711i;
        AbstractC19074t.m100207e(c3062z, "mFakeHeightViewData");
        return c3062z;
    }

    /* renamed from: e */
    public final int m117203e() {
        if (this.f111026a.contains(this.f111028c)) {
            return this.f111028c.f11709g.m14426a();
        }
        return 0;
    }

    /* renamed from: f */
    public final List m117204f() {
        return this.f111026a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final List m117205g() {
        return this.f111026a;
    }

    /* renamed from: h */
    public final void m117206h(C3054x c3054x) {
        AbstractC19074t.m100208f(c3054x, "emptyContentData");
        this.f111029d.f11725w = c3054x;
    }

    /* renamed from: i */
    public final void m117207i(C3062z c3062z) {
        AbstractC19074t.m100208f(c3062z, "fakeHeightViewData");
        this.f111027b.f11711i = c3062z;
    }

    /* renamed from: j */
    public final void m117208j(C3010n0 c3010n0) {
        AbstractC19074t.m100208f(c3010n0, "footerData");
        this.f111028c.f11709g = c3010n0;
    }

    /* renamed from: k */
    public final void m117209k(C2977g2 c2977g2) {
        AbstractC19074t.m100208f(c2977g2, "multiStateData");
        this.f111030e.f11710h = c2977g2;
    }
}
