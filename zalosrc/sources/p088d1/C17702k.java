package p088d1;

import java.util.Iterator;
import p045c1.C3182a;
import p045c1.C3186e;
import p088d1.C17697f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: d1.k */
/* loaded from: classes2.dex */
public class C17702k extends AbstractC17707p {
    public C17702k(C3186e c3186e) {
        super(c3186e);
    }

    /* renamed from: q */
    private void m93753q(C17697f c17697f) {
        this.f89783h.f89733k.add(c17697f);
        c17697f.f89734l.add(this.f89783h);
    }

    @Override // p088d1.AbstractC17707p, p088d1.InterfaceC17695d
    /* renamed from: a */
    public void mo93716a(InterfaceC17695d interfaceC17695d) {
        C3182a c3182a = (C3182a) this.f89777b;
        int m15991y1 = c3182a.m15991y1();
        Iterator it = this.f89783h.f89734l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((C17697f) it.next()).f89729g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (m15991y1 != 0 && m15991y1 != 2) {
            this.f89783h.mo93738d(i11 + c3182a.m15992z1());
        } else {
            this.f89783h.mo93738d(i12 + c3182a.m15992z1());
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: d */
    public void mo93717d() {
        C3186e c3186e = this.f89777b;
        if (c3186e instanceof C3182a) {
            this.f89783h.f89724b = true;
            C3182a c3182a = (C3182a) c3186e;
            int m15991y1 = c3182a.m15991y1();
            boolean m15990x1 = c3182a.m15990x1();
            int i11 = 0;
            if (m15991y1 != 0) {
                if (m15991y1 != 1) {
                    if (m15991y1 != 2) {
                        if (m15991y1 == 3) {
                            this.f89783h.f89727e = C17697f.a.BOTTOM;
                            while (i11 < c3182a.f13663V0) {
                                C3186e c3186e2 = c3182a.f13662U0[i11];
                                if (m15990x1 || c3186e2.m16068X() != 8) {
                                    C17697f c17697f = c3186e2.f13531f.f89784i;
                                    c17697f.f89733k.add(this.f89783h);
                                    this.f89783h.f89734l.add(c17697f);
                                }
                                i11++;
                            }
                            m93753q(this.f89777b.f13531f.f89783h);
                            m93753q(this.f89777b.f13531f.f89784i);
                            return;
                        }
                        return;
                    }
                    this.f89783h.f89727e = C17697f.a.TOP;
                    while (i11 < c3182a.f13663V0) {
                        C3186e c3186e3 = c3182a.f13662U0[i11];
                        if (m15990x1 || c3186e3.m16068X() != 8) {
                            C17697f c17697f2 = c3186e3.f13531f.f89783h;
                            c17697f2.f89733k.add(this.f89783h);
                            this.f89783h.f89734l.add(c17697f2);
                        }
                        i11++;
                    }
                    m93753q(this.f89777b.f13531f.f89783h);
                    m93753q(this.f89777b.f13531f.f89784i);
                    return;
                }
                this.f89783h.f89727e = C17697f.a.RIGHT;
                while (i11 < c3182a.f13663V0) {
                    C3186e c3186e4 = c3182a.f13662U0[i11];
                    if (m15990x1 || c3186e4.m16068X() != 8) {
                        C17697f c17697f3 = c3186e4.f13529e.f89784i;
                        c17697f3.f89733k.add(this.f89783h);
                        this.f89783h.f89734l.add(c17697f3);
                    }
                    i11++;
                }
                m93753q(this.f89777b.f13529e.f89783h);
                m93753q(this.f89777b.f13529e.f89784i);
                return;
            }
            this.f89783h.f89727e = C17697f.a.LEFT;
            while (i11 < c3182a.f13663V0) {
                C3186e c3186e5 = c3182a.f13662U0[i11];
                if (m15990x1 || c3186e5.m16068X() != 8) {
                    C17697f c17697f4 = c3186e5.f13529e.f89783h;
                    c17697f4.f89733k.add(this.f89783h);
                    this.f89783h.f89734l.add(c17697f4);
                }
                i11++;
            }
            m93753q(this.f89777b.f13529e.f89783h);
            m93753q(this.f89777b.f13529e.f89784i);
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: e */
    public void mo93718e() {
        C3186e c3186e = this.f89777b;
        if (c3186e instanceof C3182a) {
            int m15991y1 = ((C3182a) c3186e).m15991y1();
            if (m15991y1 != 0 && m15991y1 != 1) {
                this.f89777b.m16113q1(this.f89783h.f89729g);
            } else {
                this.f89777b.m16111p1(this.f89783h.f89729g);
            }
        }
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: f */
    public void mo93719f() {
        this.f89778c = null;
        this.f89783h.m93737c();
    }

    @Override // p088d1.AbstractC17707p
    /* renamed from: m */
    public boolean mo93721m() {
        return false;
    }
}
