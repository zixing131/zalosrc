package kg;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: kg.f */
/* loaded from: classes3.dex */
public class C21709f {

    /* renamed from: o */
    private static int f105425o;

    /* renamed from: a */
    private C21711h f105426a;

    /* renamed from: b */
    private boolean f105427b;

    /* renamed from: c */
    private final String f105428c;

    /* renamed from: g */
    private double f105432g;

    /* renamed from: h */
    private double f105433h;

    /* renamed from: n */
    private final AbstractC21705b f105439n;

    /* renamed from: d */
    private final a f105429d = new a();

    /* renamed from: e */
    private final a f105430e = new a();

    /* renamed from: f */
    private final a f105431f = new a();

    /* renamed from: i */
    private boolean f105434i = true;

    /* renamed from: j */
    private double f105435j = 0.005d;

    /* renamed from: k */
    private double f105436k = 0.005d;

    /* renamed from: l */
    private double f105437l = 0.0d;

    /* renamed from: m */
    private final CopyOnWriteArraySet f105438m = new CopyOnWriteArraySet();

    /* renamed from: kg.f$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        double f105440a;

        /* renamed from: b */
        double f105441b;

        private a() {
        }

        /* synthetic */ a(AbstractC21708e abstractC21708e) {
            this();
        }
    }

    public C21709f(AbstractC21705b abstractC21705b) {
        if (abstractC21705b != null) {
            this.f105439n = abstractC21705b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("spring:");
            int i11 = f105425o;
            f105425o = i11 + 1;
            sb2.append(i11);
            this.f105428c = sb2.toString();
            m112048u(C21711h.f105450c);
            return;
        }
        throw new IllegalArgumentException("Spring cannot be created outside of a BaseSpringSystem");
    }

    /* renamed from: e */
    private double m112028e(a aVar) {
        return Math.abs(this.f105433h - aVar.f105440a);
    }

    /* renamed from: k */
    private void m112029k(double d11) {
        a aVar = this.f105429d;
        double d12 = aVar.f105440a * d11;
        a aVar2 = this.f105430e;
        double d13 = 1.0d - d11;
        aVar.f105440a = d12 + (aVar2.f105440a * d13);
        aVar.f105441b = (aVar.f105441b * d11) + (aVar2.f105441b * d13);
    }

    /* renamed from: a */
    public C21709f m112030a(InterfaceC21713j interfaceC21713j) {
        if (interfaceC21713j != null) {
            this.f105438m.add(interfaceC21713j);
            return this;
        }
        throw new IllegalArgumentException("newListener is required");
    }

    /* renamed from: b */
    public void m112031b(double d11) {
        double d12;
        boolean z11;
        boolean z12;
        boolean m112039l = m112039l();
        if (m112039l && this.f105434i) {
            return;
        }
        double d13 = 0.064d;
        if (d11 <= 0.064d) {
            d13 = d11;
        }
        this.f105437l += d13;
        C21711h c21711h = this.f105426a;
        double d14 = c21711h.f105452b;
        double d15 = c21711h.f105451a;
        a aVar = this.f105429d;
        double d16 = aVar.f105440a;
        double d17 = aVar.f105441b;
        a aVar2 = this.f105431f;
        double d18 = aVar2.f105440a;
        double d19 = aVar2.f105441b;
        while (true) {
            d12 = this.f105437l;
            if (d12 < 0.001d) {
                break;
            }
            double d21 = d12 - 0.001d;
            this.f105437l = d21;
            if (d21 < 0.001d) {
                a aVar3 = this.f105430e;
                aVar3.f105440a = d16;
                aVar3.f105441b = d17;
            }
            double d22 = this.f105433h;
            double d23 = ((d22 - d18) * d14) - (d15 * d17);
            double d24 = d17 + (d23 * 0.001d * 0.5d);
            double d25 = ((d22 - (((d17 * 0.001d) * 0.5d) + d16)) * d14) - (d15 * d24);
            double d26 = d17 + (d25 * 0.001d * 0.5d);
            double d27 = ((d22 - (d16 + ((d24 * 0.001d) * 0.5d))) * d14) - (d15 * d26);
            double d28 = d16 + (d26 * 0.001d);
            double d29 = d17 + (d27 * 0.001d);
            d16 += (d17 + ((d24 + d26) * 2.0d) + d29) * 0.16666666666666666d * 0.001d;
            d17 += (d23 + ((d25 + d27) * 2.0d) + (((d22 - d28) * d14) - (d15 * d29))) * 0.16666666666666666d * 0.001d;
            d18 = d28;
            d19 = d29;
        }
        a aVar4 = this.f105431f;
        aVar4.f105440a = d18;
        aVar4.f105441b = d19;
        a aVar5 = this.f105429d;
        aVar5.f105440a = d16;
        aVar5.f105441b = d17;
        if (d12 > 0.0d) {
            m112029k(d12 / 0.001d);
        }
        boolean z13 = true;
        if (!m112039l() && (!this.f105427b || !m112040m())) {
            z11 = m112039l;
        } else {
            if (d14 > 0.0d) {
                double d31 = this.f105433h;
                this.f105432g = d31;
                this.f105429d.f105440a = d31;
            } else {
                double d32 = this.f105429d.f105440a;
                this.f105433h = d32;
                this.f105432g = d32;
            }
            m112049v(0.0d);
            z11 = true;
        }
        if (this.f105434i) {
            this.f105434i = false;
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11) {
            this.f105434i = true;
        } else {
            z13 = false;
        }
        Iterator it = this.f105438m.iterator();
        while (it.hasNext()) {
            InterfaceC21713j interfaceC21713j = (InterfaceC21713j) it.next();
            if (z12) {
                interfaceC21713j.mo39828b(this);
            }
            interfaceC21713j.mo39827a(this);
            if (z13) {
                interfaceC21713j.mo39829c(this);
            }
        }
    }

    /* renamed from: c */
    public void m112032c() {
        this.f105438m.clear();
        this.f105439n.m112020e(this);
    }

    /* renamed from: d */
    public double m112033d() {
        return this.f105429d.f105440a;
    }

    /* renamed from: f */
    public double m112034f() {
        return this.f105433h;
    }

    /* renamed from: g */
    public String m112035g() {
        return this.f105428c;
    }

    /* renamed from: h */
    public C21711h m112036h() {
        return this.f105426a;
    }

    /* renamed from: i */
    public double m112037i() {
        return this.f105432g;
    }

    /* renamed from: j */
    public double m112038j() {
        return this.f105429d.f105441b;
    }

    /* renamed from: l */
    public boolean m112039l() {
        if (Math.abs(this.f105429d.f105441b) <= this.f105435j && (m112028e(this.f105429d) <= this.f105436k || this.f105426a.f105452b == 0.0d)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m112040m() {
        if (this.f105426a.f105452b > 0.0d && ((this.f105432g < this.f105433h && m112033d() > this.f105433h) || (this.f105432g > this.f105433h && m112033d() < this.f105433h))) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public C21709f m112041n() {
        this.f105438m.clear();
        return this;
    }

    /* renamed from: o */
    public C21709f m112042o(InterfaceC21713j interfaceC21713j) {
        if (interfaceC21713j != null) {
            this.f105438m.remove(interfaceC21713j);
            return this;
        }
        throw new IllegalArgumentException("listenerToRemove is required");
    }

    /* renamed from: p */
    public C21709f m112043p() {
        a aVar = this.f105429d;
        double d11 = aVar.f105440a;
        this.f105433h = d11;
        this.f105431f.f105440a = d11;
        aVar.f105441b = 0.0d;
        return this;
    }

    /* renamed from: q */
    public C21709f m112044q(double d11) {
        return m112045r(d11, true);
    }

    /* renamed from: r */
    public C21709f m112045r(double d11, boolean z11) {
        this.f105432g = d11;
        this.f105429d.f105440a = d11;
        this.f105439n.m112016a(m112035g());
        Iterator it = this.f105438m.iterator();
        while (it.hasNext()) {
            ((InterfaceC21713j) it.next()).mo39827a(this);
        }
        if (z11) {
            m112043p();
        }
        return this;
    }

    /* renamed from: s */
    public C21709f m112046s(double d11) {
        if (this.f105433h == d11 && m112039l()) {
            return this;
        }
        this.f105432g = m112033d();
        this.f105433h = d11;
        this.f105439n.m112016a(m112035g());
        Iterator it = this.f105438m.iterator();
        while (it.hasNext()) {
            ((InterfaceC21713j) it.next()).mo39830e(this);
        }
        return this;
    }

    /* renamed from: t */
    public C21709f m112047t(boolean z11) {
        this.f105427b = z11;
        return this;
    }

    /* renamed from: u */
    public C21709f m112048u(C21711h c21711h) {
        if (c21711h != null) {
            this.f105426a = c21711h;
            return this;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    /* renamed from: v */
    public C21709f m112049v(double d11) {
        a aVar = this.f105429d;
        if (d11 == aVar.f105441b) {
            return this;
        }
        aVar.f105441b = d11;
        this.f105439n.m112016a(m112035g());
        return this;
    }

    /* renamed from: w */
    public C21709f m112050w(double d11) {
        if (this.f105433h == d11 && m112039l()) {
            return this;
        }
        this.f105433h = d11;
        this.f105432g = d11;
        a aVar = this.f105429d;
        aVar.f105440a = d11;
        this.f105431f.f105440a = d11;
        aVar.f105441b = 0.0d;
        this.f105439n.m112016a(m112035g());
        Iterator it = this.f105438m.iterator();
        while (it.hasNext()) {
            ((InterfaceC21713j) it.next()).mo39830e(this);
        }
        return this;
    }

    /* renamed from: x */
    public boolean m112051x() {
        if (m112039l() && m112052y()) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean m112052y() {
        return this.f105434i;
    }
}
