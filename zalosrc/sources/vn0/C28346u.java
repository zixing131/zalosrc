package vn0;

import fn0.AbstractC19074t;
import pm0.C24838b0;
import pm0.C24844e0;
import pm0.C24867x;
import pm0.C24869z;

/* renamed from: vn0.u */
/* loaded from: classes7.dex */
public final class C28346u extends C28330m {

    /* renamed from: c */
    private final boolean f132108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28346u(InterfaceC28337p0 interfaceC28337p0, boolean z11) {
        super(interfaceC28337p0);
        AbstractC19074t.m100208f(interfaceC28337p0, "writer");
        this.f132108c = z11;
    }

    @Override // vn0.C28330m
    /* renamed from: d */
    public void mo142735d(byte b11) {
        boolean z11 = this.f132108c;
        String m129240g = C24867x.m129240g(C24867x.m129237c(b11));
        if (z11) {
            mo142744m(m129240g);
        } else {
            m142741j(m129240g);
        }
    }

    @Override // vn0.C28330m
    /* renamed from: h */
    public void mo142739h(int i11) {
        boolean z11 = this.f132108c;
        int m129260c = C24869z.m129260c(i11);
        if (z11) {
            mo142744m(AbstractC28338q.m142761a(m129260c));
        } else {
            m142741j(AbstractC28340r.m142768a(m129260c));
        }
    }

    @Override // vn0.C28330m
    /* renamed from: i */
    public void mo142740i(long j11) {
        String m142774a;
        String m142784a;
        boolean z11 = this.f132108c;
        long m129150c = C24838b0.m129150c(j11);
        if (z11) {
            m142784a = AbstractC28344t.m142784a(m129150c, 10);
            mo142744m(m142784a);
        } else {
            m142774a = AbstractC28342s.m142774a(m129150c, 10);
            m142741j(m142774a);
        }
    }

    @Override // vn0.C28330m
    /* renamed from: k */
    public void mo142742k(short s7) {
        boolean z11 = this.f132108c;
        String m129180g = C24844e0.m129180g(C24844e0.m129177c(s7));
        if (z11) {
            mo142744m(m129180g);
        } else {
            m142741j(m129180g);
        }
    }
}
