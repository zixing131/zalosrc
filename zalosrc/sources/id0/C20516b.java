package id0;

import com.zing.zalo.uidrawing.C16719g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: id0.b */
/* loaded from: classes4.dex */
public class C20516b {

    /* renamed from: h */
    public static final InterfaceC20519e f100795h = new C20520f();

    /* renamed from: a */
    long f100796a = 400;

    /* renamed from: b */
    InterfaceC20519e f100797b = f100795h;

    /* renamed from: c */
    List f100798c = new ArrayList();

    /* renamed from: d */
    private C20515a f100799d;

    /* renamed from: e */
    private C20524j f100800e;

    /* renamed from: f */
    private C20522h f100801f;

    /* renamed from: g */
    private C20523i f100802g;

    /* renamed from: i */
    private C20516b m106584i() {
        return this;
    }

    /* renamed from: a */
    public boolean mo106585a(C16719g c16719g, long j11) {
        boolean z11 = false;
        if (j11 >= 0 && j11 < this.f100796a) {
            float m106591g = m106591g(j11);
            for (AbstractC20521g abstractC20521g : this.f100798c) {
                z11 |= abstractC20521g.mo106580d(c16719g, abstractC20521g.mo106578a(m106591g));
            }
        }
        if (z11) {
            c16719g.invalidate();
        }
        return z11;
    }

    /* renamed from: b */
    public void mo106586b(C16719g c16719g) {
        if (c16719g != null) {
            for (AbstractC20521g abstractC20521g : this.f100798c) {
                abstractC20521g.mo106580d(c16719g, abstractC20521g.f100808b);
            }
        }
    }

    /* renamed from: c */
    public C20516b mo106587c(float f11) {
        if (this.f100799d == null) {
            C20515a c20515a = new C20515a();
            this.f100799d = c20515a;
            this.f100798c.add(c20515a);
        }
        this.f100799d.m106604b(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: d */
    public C20516b m106588d(float f11) {
        if (this.f100801f == null) {
            C20522h c20522h = new C20522h();
            this.f100801f = c20522h;
            this.f100798c.add(c20522h);
        }
        this.f100801f.m106604b(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: e */
    public C20516b m106589e(float f11) {
        if (this.f100802g == null) {
            C20523i c20523i = new C20523i();
            this.f100802g = c20523i;
            this.f100798c.add(c20523i);
        }
        this.f100802g.m106604b(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: f */
    public C20516b m106590f(int i11) {
        if (this.f100800e == null) {
            C20524j c20524j = new C20524j();
            this.f100800e = c20524j;
            this.f100798c.add(c20524j);
        }
        this.f100800e.m106604b(Integer.valueOf(i11));
        return m106584i();
    }

    /* renamed from: g */
    public float m106591g(long j11) {
        InterfaceC20519e interfaceC20519e = this.f100797b;
        if (interfaceC20519e != null) {
            return interfaceC20519e.mo106603a(this.f100796a, j11);
        }
        return f100795h.mo106603a(this.f100796a, j11);
    }

    /* renamed from: h */
    public void mo106592h(C16719g c16719g) {
        if (c16719g != null) {
            for (AbstractC20521g abstractC20521g : this.f100798c) {
                if (abstractC20521g.f100807a == null) {
                    abstractC20521g.f100807a = abstractC20521g.mo106579c(c16719g);
                }
                if (abstractC20521g.f100808b == null) {
                    abstractC20521g.f100808b = abstractC20521g.mo106579c(c16719g);
                }
            }
        }
    }

    /* renamed from: j */
    public C20516b m106593j(long j11) {
        this.f100796a = j11;
        return m106584i();
    }

    /* renamed from: k */
    public C20516b mo106594k(float f11) {
        if (this.f100799d == null) {
            C20515a c20515a = new C20515a();
            this.f100799d = c20515a;
            this.f100798c.add(c20515a);
        }
        this.f100799d.m106605e(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: l */
    public C20516b m106595l(float f11) {
        if (this.f100801f == null) {
            C20522h c20522h = new C20522h();
            this.f100801f = c20522h;
            this.f100798c.add(c20522h);
        }
        this.f100801f.m106605e(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: m */
    public C20516b m106596m(float f11) {
        if (this.f100802g == null) {
            C20523i c20523i = new C20523i();
            this.f100802g = c20523i;
            this.f100798c.add(c20523i);
        }
        this.f100802g.m106605e(Float.valueOf(f11));
        return m106584i();
    }

    /* renamed from: n */
    public C20516b m106597n(int i11) {
        if (this.f100800e == null) {
            C20524j c20524j = new C20524j();
            this.f100800e = c20524j;
            this.f100798c.add(c20524j);
        }
        this.f100800e.m106605e(Integer.valueOf(i11));
        return m106584i();
    }
}
