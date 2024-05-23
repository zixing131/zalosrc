package p467r;

import p498s.C26057c;
import p562v.AbstractC27392e;

/* renamed from: r.a */
/* loaded from: classes2.dex */
public final class C25578a {

    /* renamed from: a */
    private final C25589l f122267a;

    private C25578a(C25589l c25589l) {
        this.f122267a = c25589l;
    }

    /* renamed from: a */
    public static C25578a m132129a(AbstractC25579b abstractC25579b) {
        C25589l c25589l = (C25589l) abstractC25579b;
        AbstractC27392e.m140336b(abstractC25579b, "AdSession is null");
        AbstractC27392e.m140343i(c25589l);
        AbstractC27392e.m140341g(c25589l);
        C25578a c25578a = new C25578a(c25589l);
        c25589l.m132176u().m146281h(c25578a);
        return c25578a;
    }

    /* renamed from: b */
    public void m132130b() {
        AbstractC27392e.m140341g(this.f122267a);
        AbstractC27392e.m140345k(this.f122267a);
        if (!this.f122267a.m132172q()) {
            try {
                this.f122267a.mo132138f();
            } catch (Exception unused) {
            }
        }
        if (this.f122267a.m132172q()) {
            this.f122267a.m132169m();
        }
    }

    /* renamed from: c */
    public void m132131c(C26057c c26057c) {
        AbstractC27392e.m140336b(c26057c, "VastProperties is null");
        AbstractC27392e.m140342h(this.f122267a);
        AbstractC27392e.m140345k(this.f122267a);
        this.f122267a.m132167h(c26057c.m134162a());
    }

    /* renamed from: d */
    public void m132132d() {
        AbstractC27392e.m140342h(this.f122267a);
        AbstractC27392e.m140345k(this.f122267a);
        this.f122267a.m132170o();
    }
}
