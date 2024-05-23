package p733zz;

import a00.C0018c;
import a00.InterfaceC0017b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: zz.a */
/* loaded from: classes4.dex */
public class C32609a implements Cloneable {

    /* renamed from: p */
    public InterfaceC0017b f150703p;

    /* renamed from: q */
    public InterfaceC0017b f150704q;

    /* renamed from: zz.a$a */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a */
        public b f150705a;

        /* renamed from: b */
        public InterfaceC0017b f150706b;

        a(b bVar) {
            this.f150705a = bVar;
        }

        a(InterfaceC0017b interfaceC0017b) {
            this.f150705a = b.INTERSECTING;
            this.f150706b = interfaceC0017b;
        }
    }

    /* renamed from: zz.a$b */
    /* loaded from: classes4.dex */
    public enum b {
        INTERSECTING,
        PARALLEL,
        COINCIDENT,
        NOT_INTERESECTING
    }

    public C32609a(InterfaceC0017b interfaceC0017b, InterfaceC0017b interfaceC0017b2) {
        this.f150703p = interfaceC0017b;
        this.f150704q = interfaceC0017b2;
    }

    /* renamed from: a */
    private static double m157938a(double d11, double d12) {
        double d13;
        if (d11 * d12 >= 0.0d) {
            return Math.abs(d11 - d12);
        }
        if (d11 < 0.0d) {
            d13 = d12 - d11;
        } else {
            d13 = d11 - d12;
        }
        if (d13 >= 90.0d) {
            return 180.0d - d13;
        }
        return d13;
    }

    /* renamed from: i */
    public static double m157939i(InterfaceC0017b interfaceC0017b, InterfaceC0017b interfaceC0017b2) {
        return Math.sqrt(((interfaceC0017b.getX() - interfaceC0017b2.getX()) * (interfaceC0017b.getX() - interfaceC0017b2.getX())) + ((interfaceC0017b.getY() - interfaceC0017b2.getY()) * (interfaceC0017b.getY() - interfaceC0017b2.getY())));
    }

    /* renamed from: r */
    private boolean m157940r(C32609a c32609a, int i11) {
        float f11 = i11;
        if (c32609a.m157954q(this.f150703p, f11) && c32609a.m157954q(this.f150704q, f11) && m157954q(c32609a.f150703p, f11) && m157954q(c32609a.f150704q, f11) && m157938a(c32609a.m157942c(), m157942c()) <= 8.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public InterfaceC0017b m157941b() {
        return new C0018c((this.f150703p.getX() + this.f150704q.getX()) / 2.0f, (this.f150703p.getY() + this.f150704q.getY()) / 2.0f);
    }

    /* renamed from: c */
    public double m157942c() {
        return Math.atan((this.f150704q.getY() - this.f150703p.getY()) / (this.f150704q.getX() - this.f150703p.getX()));
    }

    /* renamed from: e */
    public double m157943e() {
        return m157939i(this.f150703p, this.f150704q);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C32609a)) {
            return false;
        }
        C32609a c32609a = (C32609a) obj;
        if (!c32609a.f150703p.equals(this.f150703p) || !c32609a.f150704q.equals(this.f150704q)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public float m157944f(C32609a c32609a) {
        if (!c32609a.m157953p(this.f150703p, 15.0f) && !c32609a.m157953p(this.f150704q, 15.0f) && !m157953p(c32609a.f150703p, 15.0f) && !m157953p(c32609a.f150704q, 15.0f)) {
            return Math.min(Math.min((float) m157939i(c32609a.f150703p, this.f150703p), (float) m157939i(c32609a.f150703p, this.f150704q)), Math.min((float) m157939i(c32609a.f150704q, this.f150703p), (float) m157939i(c32609a.f150704q, this.f150704q)));
        }
        return 0.0f;
    }

    /* renamed from: g */
    public boolean m157945g(List list, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!m157940r((C32609a) it.next(), i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C32609a clone() {
        return new C32609a(this.f150703p.mo31a(), this.f150704q.mo31a());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f150703p, this.f150704q});
    }

    /* renamed from: j */
    public float m157947j(InterfaceC0017b interfaceC0017b) {
        if (this.f150703p.getX() == this.f150704q.getX()) {
            return Math.abs(this.f150703p.getX() - interfaceC0017b.getX());
        }
        if (this.f150703p.getY() == this.f150704q.getY()) {
            return Math.abs(this.f150703p.getY() - interfaceC0017b.getY());
        }
        float y11 = this.f150704q.getY() - this.f150703p.getY();
        float x11 = this.f150704q.getX() - this.f150703p.getX();
        return (float) (Math.abs(((interfaceC0017b.getX() * y11) - (interfaceC0017b.getY() * x11)) + ((this.f150704q.getX() * this.f150703p.getY()) - (this.f150703p.getX() * this.f150704q.getY()))) / Math.sqrt((y11 * y11) + (x11 * x11)));
    }

    /* renamed from: k */
    public a m157948k(C32609a c32609a) {
        float x11 = this.f150703p.getX() - this.f150704q.getX();
        float y11 = this.f150703p.getY() - this.f150704q.getY();
        float x12 = this.f150703p.getX() * this.f150704q.getY();
        float x13 = this.f150704q.getX() * this.f150703p.getY();
        float x14 = c32609a.f150703p.getX() - c32609a.f150704q.getX();
        float y12 = c32609a.f150703p.getY() - c32609a.f150704q.getY();
        float x15 = c32609a.f150703p.getX() * c32609a.f150704q.getY();
        float x16 = c32609a.f150704q.getX() * c32609a.f150703p.getY();
        float f11 = (x14 * y11) - (x11 * y12);
        if (f11 != 0.0f && (x11 != 0.0f || x14 != 0.0f)) {
            float f12 = ((x11 * (x15 - x16)) - (x14 * (x12 - x13))) / f11;
            if (x11 != 0.0f) {
                return new a(new C0018c(Math.round(f12), Math.round((r2 + (f12 * y11)) / x11)));
            }
            if (x14 != 0.0f) {
                return new a(new C0018c(Math.round(f12), Math.round((r6 + (f12 * y12)) / x14)));
            }
            return new a(b.NOT_INTERESECTING);
        }
        return new a(b.NOT_INTERESECTING);
    }

    /* renamed from: l */
    public double m157949l() {
        return (m157942c() * 180.0d) / 3.141592653589793d;
    }

    /* renamed from: m */
    public InterfaceC0017b m157950m() {
        return this.f150703p;
    }

    /* renamed from: n */
    public InterfaceC0017b m157951n() {
        return this.f150704q;
    }

    /* renamed from: o */
    public double m157952o() {
        return m157938a(m157949l(), 0.0d);
    }

    /* renamed from: p */
    public boolean m157953p(InterfaceC0017b interfaceC0017b, float f11) {
        float min = Math.min(this.f150703p.getX(), this.f150704q.getX());
        float max = Math.max(this.f150703p.getX(), this.f150704q.getX());
        if (m157954q(interfaceC0017b, f11) && interfaceC0017b.getX() + f11 > min && interfaceC0017b.getX() + f11 < max) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean m157954q(InterfaceC0017b interfaceC0017b, float f11) {
        if (m157947j(interfaceC0017b) < f11) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public void m157955s(InterfaceC0017b interfaceC0017b) {
        this.f150703p = interfaceC0017b;
    }

    public String toString() {
        return "Line(" + this.f150703p + "->" + this.f150704q + ")";
    }

    /* renamed from: u */
    public void m157956u(InterfaceC0017b interfaceC0017b) {
        this.f150704q = interfaceC0017b;
    }

    /* renamed from: v */
    public void m157957v() {
        if (this.f150703p.getX() > this.f150704q.getX()) {
            InterfaceC0017b interfaceC0017b = this.f150703p;
            m157955s(this.f150704q);
            m157956u(interfaceC0017b);
        }
    }

    /* renamed from: w */
    public void m157958w() {
        if (this.f150703p.getY() > this.f150704q.getY()) {
            InterfaceC0017b interfaceC0017b = this.f150703p;
            m157955s(this.f150704q);
            m157956u(interfaceC0017b);
        }
    }

    public C32609a(float f11, float f12, float f13, float f14) {
        this.f150703p = new C0018c(f11, f12);
        this.f150704q = new C0018c(f13, f14);
    }
}
