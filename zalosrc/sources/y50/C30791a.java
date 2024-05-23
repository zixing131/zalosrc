package y50;

import fn0.AbstractC19074t;
import y50.InterfaceC30793c;

/* renamed from: y50.a */
/* loaded from: classes5.dex */
public final class C30791a {

    /* renamed from: a */
    private final InterfaceC30793c f142099a;

    /* renamed from: b */
    private C30794d f142100b;

    /* renamed from: c */
    private final InterfaceC30793c.b f142101c;

    public C30791a(InterfaceC30793c interfaceC30793c) {
        AbstractC19074t.m100208f(interfaceC30793c, "listener");
        this.f142099a = interfaceC30793c;
        this.f142101c = new InterfaceC30793c.b();
    }

    /* renamed from: a */
    public final void m149741a(float f11, float f12) {
        C30794d c30794d = this.f142100b;
        C30794d c30794d2 = null;
        if (c30794d == null) {
            AbstractC19074t.m100223u("handler");
            c30794d = null;
        }
        c30794d.m149796t(f11, f12);
        C30794d c30794d3 = this.f142100b;
        if (c30794d3 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d3 = null;
        }
        if (c30794d3.m149788h() != -1) {
            C30794d c30794d4 = this.f142100b;
            if (c30794d4 == null) {
                AbstractC19074t.m100223u("handler");
                c30794d4 = null;
            }
            if (c30794d4.m149787g() != -1) {
                InterfaceC30793c.b bVar = this.f142101c;
                C30794d c30794d5 = this.f142100b;
                if (c30794d5 == null) {
                    AbstractC19074t.m100223u("handler");
                    c30794d5 = null;
                }
                bVar.m149768l(c30794d5.m149788h());
                InterfaceC30793c.b bVar2 = this.f142101c;
                C30794d c30794d6 = this.f142100b;
                if (c30794d6 == null) {
                    AbstractC19074t.m100223u("handler");
                } else {
                    c30794d2 = c30794d6;
                }
                bVar2.m149767k(c30794d2.m149787g());
                this.f142101c.m149770n(-1);
                this.f142101c.m149769m(-1);
                this.f142099a.mo61422K0(this.f142101c);
                return;
            }
        }
        this.f142099a.mo61427i1();
    }

    /* renamed from: b */
    public final boolean m149742b(float f11, float f12) {
        C30794d c30794d = this.f142100b;
        C30794d c30794d2 = null;
        if (c30794d == null) {
            AbstractC19074t.m100223u("handler");
            c30794d = null;
        }
        if (!c30794d.m149791o()) {
            return false;
        }
        C30794d c30794d3 = this.f142100b;
        if (c30794d3 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d3 = null;
        }
        int m149788h = c30794d3.m149788h();
        C30794d c30794d4 = this.f142100b;
        if (c30794d4 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d4 = null;
        }
        int m149787g = c30794d4.m149787g();
        C30794d c30794d5 = this.f142100b;
        if (c30794d5 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d5 = null;
        }
        c30794d5.m149792p(f11, f12);
        C30794d c30794d6 = this.f142100b;
        if (c30794d6 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d6 = null;
        }
        if (m149788h == c30794d6.m149788h()) {
            C30794d c30794d7 = this.f142100b;
            if (c30794d7 == null) {
                AbstractC19074t.m100223u("handler");
                c30794d7 = null;
            }
            if (m149787g == c30794d7.m149787g()) {
                return true;
            }
        }
        this.f142101c.m149770n(m149788h);
        this.f142101c.m149769m(m149787g);
        InterfaceC30793c.b bVar = this.f142101c;
        C30794d c30794d8 = this.f142100b;
        if (c30794d8 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d8 = null;
        }
        bVar.m149768l(c30794d8.m149788h());
        InterfaceC30793c.b bVar2 = this.f142101c;
        C30794d c30794d9 = this.f142100b;
        if (c30794d9 == null) {
            AbstractC19074t.m100223u("handler");
        } else {
            c30794d2 = c30794d9;
        }
        bVar2.m149767k(c30794d2.m149787g());
        this.f142099a.mo61423K2(this.f142101c);
        return true;
    }

    /* renamed from: c */
    public final boolean m149743c(float f11, float f12, boolean z11) {
        C30794d c30794d = this.f142100b;
        C30794d c30794d2 = null;
        if (c30794d == null) {
            AbstractC19074t.m100223u("handler");
            c30794d = null;
        }
        c30794d.m149797u();
        C30794d c30794d3 = this.f142100b;
        if (c30794d3 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d3 = null;
        }
        c30794d3.m149793q(f11, f12, z11);
        C30794d c30794d4 = this.f142100b;
        if (c30794d4 == null) {
            AbstractC19074t.m100223u("handler");
        } else {
            c30794d2 = c30794d4;
        }
        return c30794d2.m149791o();
    }

    /* renamed from: d */
    public final void m149744d(C30795e c30795e, int i11) {
        AbstractC19074t.m100208f(c30795e, "layout");
        C30794d c30794d = this.f142100b;
        C30794d c30794d2 = null;
        if (c30794d == null) {
            this.f142100b = new C30794d(c30795e);
        } else {
            if (c30794d == null) {
                AbstractC19074t.m100223u("handler");
                c30794d = null;
            }
            c30794d.m149795s(c30795e);
        }
        if (i11 < 0) {
            C30794d c30794d3 = this.f142100b;
            if (c30794d3 == null) {
                AbstractC19074t.m100223u("handler");
                c30794d3 = null;
            }
            c30794d3.m149794r(c30795e.m149815n().length());
        } else {
            C30794d c30794d4 = this.f142100b;
            if (c30794d4 == null) {
                AbstractC19074t.m100223u("handler");
                c30794d4 = null;
            }
            c30794d4.m149794r(i11);
        }
        InterfaceC30793c.b bVar = this.f142101c;
        C30794d c30794d5 = this.f142100b;
        if (c30794d5 == null) {
            AbstractC19074t.m100223u("handler");
            c30794d5 = null;
        }
        bVar.m149764h(c30794d5.m149786d());
        InterfaceC30793c.b bVar2 = this.f142101c;
        C30794d c30794d6 = this.f142100b;
        if (c30794d6 == null) {
            AbstractC19074t.m100223u("handler");
        } else {
            c30794d2 = c30794d6;
        }
        bVar2.m149771o(c30794d2.m149789i());
    }

    /* renamed from: e */
    public final boolean m149745e(float f11, float f12) {
        C30794d c30794d = this.f142100b;
        if (c30794d == null) {
            AbstractC19074t.m100223u("handler");
            c30794d = null;
        }
        return c30794d.m149790j(f11, f12);
    }

    /* renamed from: f */
    public final boolean m149746f() {
        C30794d c30794d = this.f142100b;
        C30794d c30794d2 = null;
        if (c30794d == null) {
            AbstractC19074t.m100223u("handler");
            c30794d = null;
        }
        if (!c30794d.m149791o()) {
            return false;
        }
        C30794d c30794d3 = this.f142100b;
        if (c30794d3 == null) {
            AbstractC19074t.m100223u("handler");
        } else {
            c30794d2 = c30794d3;
        }
        c30794d2.m149797u();
        return true;
    }
}
