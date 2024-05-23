package b00;

import a00.C0018c;
import a00.InterfaceC0017b;
import java.util.Objects;
import p733zz.C32609a;

/* renamed from: b00.a */
/* loaded from: classes4.dex */
public class C2478a implements Comparable {

    /* renamed from: A */
    private C32609a f10088A;

    /* renamed from: p */
    private final double f10089p;

    /* renamed from: q */
    public C32609a f10090q;

    /* renamed from: r */
    public C32609a f10091r;

    /* renamed from: s */
    public C32609a f10092s;

    /* renamed from: t */
    public C32609a f10093t;

    /* renamed from: u */
    public C2480c f10094u;

    /* renamed from: v */
    public double f10095v;

    /* renamed from: w */
    public double f10096w;

    /* renamed from: x */
    private C32609a f10097x;

    /* renamed from: y */
    private C32609a f10098y;

    /* renamed from: z */
    private C32609a f10099z;

    public C2478a(C32609a c32609a, C32609a c32609a2, C32609a c32609a3, C32609a c32609a4) {
        this.f10089p = 0.0d;
        this.f10094u = null;
        this.f10090q = c32609a;
        this.f10091r = c32609a3;
        this.f10092s = c32609a2;
        this.f10093t = c32609a4;
    }

    /* renamed from: b */
    private double m12501b(C32609a c32609a, C32609a c32609a2) {
        return Math.min(Math.min((float) C32609a.m157939i(c32609a.f150703p, c32609a2.f150703p), (float) C32609a.m157939i(c32609a.f150703p, c32609a2.f150704q)), Math.min((float) C32609a.m157939i(c32609a.f150704q, c32609a2.f150703p), (float) C32609a.m157939i(c32609a.f150704q, c32609a2.f150704q)));
    }

    /* renamed from: e */
    private static InterfaceC0017b m12502e(C32609a c32609a, C32609a c32609a2, int i11, int i12) {
        InterfaceC0017b c0018c = new C0018c(0.0f, 0.0f);
        C32609a.a m157948k = c32609a.m157948k(c32609a2);
        if (m157948k.f150705a == C32609a.b.INTERSECTING) {
            c0018c = m157948k.f150706b;
            if (c0018c.getX() < 0.0f) {
                c0018c.mo34e(0.0f);
            } else if (c0018c.getX() >= i11) {
                c0018c.mo34e(i11 - 1);
            }
            if (c0018c.getY() < 0.0f) {
                c0018c.mo32b(0.0f);
            } else if (c0018c.getY() >= i12) {
                c0018c.mo32b(i12 - 1);
            }
        } else {
            System.out.println("Not intersecting: " + c32609a + " with " + c32609a2);
        }
        return c0018c;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2478a c2478a) {
        Objects.requireNonNull(c2478a);
        return Double.compare(0.0d, 0.0d);
    }

    /* renamed from: d */
    public void m12504d(int i11, int i12) {
        C2480c m12505g = m12505g(i11, i12);
        this.f10094u = m12505g;
        this.f10095v = new C2479b(m12505g.m12532p()).m12508j();
        this.f10096w = m12501b(this.f10097x, this.f10098y) + m12501b(this.f10097x, this.f10099z) + m12501b(this.f10088A, this.f10098y) + m12501b(this.f10088A, this.f10099z);
    }

    /* renamed from: g */
    public C2480c m12505g(int i11, int i12) {
        if (this.f10092s.m157941b().getY() < this.f10093t.m157941b().getY()) {
            this.f10097x = this.f10092s;
            this.f10088A = this.f10093t;
        } else {
            this.f10097x = this.f10093t;
            this.f10088A = this.f10092s;
        }
        if (this.f10090q.m157941b().getX() < this.f10091r.m157941b().getX()) {
            this.f10098y = this.f10090q;
            this.f10099z = this.f10091r;
        } else {
            this.f10098y = this.f10091r;
            this.f10099z = this.f10090q;
        }
        return new C2480c(m12502e(this.f10097x, this.f10098y, i11, i12), m12502e(this.f10097x, this.f10099z, i11, i12), m12502e(this.f10088A, this.f10099z, i11, i12), m12502e(this.f10088A, this.f10098y, i11, i12));
    }

    public String toString() {
        return "LineHolder{top=" + this.f10090q + ", bottom=" + this.f10091r + ", left=" + this.f10092s + ", right=" + this.f10093t + ", rank=0.0}";
    }

    public C2478a() {
        this.f10089p = 0.0d;
        this.f10090q = null;
        this.f10091r = null;
        this.f10092s = null;
        this.f10093t = null;
        this.f10094u = null;
    }
}
