package ao0;

import bo0.C3066a;
import java.util.Enumeration;
import org.bouncycastle.asn1.AbstractC24440h;
import org.bouncycastle.asn1.AbstractC24444j;
import org.bouncycastle.asn1.AbstractC24446k;
import org.bouncycastle.asn1.AbstractC24448l;
import org.bouncycastle.asn1.AbstractC24452n;
import org.bouncycastle.asn1.C24431e;
import org.bouncycastle.asn1.C24447k0;
import org.bouncycastle.asn1.C24455o0;
import org.bouncycastle.asn1.C24465t0;
import zn0.AbstractC32516c;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: ao0.b */
/* loaded from: classes7.dex */
public class C2269b extends AbstractC32516c {

    /* renamed from: a */
    private AbstractC24440h f9620a;

    /* renamed from: b */
    private C3066a f9621b;

    /* renamed from: c */
    private AbstractC24448l f9622c;

    public C2269b(C3066a c3066a, InterfaceC32514a interfaceC32514a) {
        this(c3066a, interfaceC32514a, null);
    }

    /* renamed from: f */
    public static C2269b m11995f(Object obj) {
        if (obj instanceof C2269b) {
            return (C2269b) obj;
        }
        if (obj != null) {
            return new C2269b(AbstractC24446k.m127783m(obj));
        }
        return null;
    }

    @Override // zn0.AbstractC32516c, zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        C32515b c32515b = new C32515b();
        c32515b.m157478a(new C24431e(0L));
        c32515b.m157478a(this.f9621b);
        c32515b.m157478a(this.f9620a);
        if (this.f9622c != null) {
            c32515b.m157478a(new C24465t0(false, 0, this.f9622c));
        }
        return new C24455o0(c32515b);
    }

    /* renamed from: g */
    public InterfaceC32514a m11997g() {
        return AbstractC24444j.m127781i(this.f9620a.mo127768n());
    }

    public C2269b(C3066a c3066a, InterfaceC32514a interfaceC32514a, AbstractC24448l abstractC24448l) {
        this.f9620a = new C24447k0(interfaceC32514a.mo11996c().m157482e("DER"));
        this.f9621b = c3066a;
        this.f9622c = abstractC24448l;
    }

    public C2269b(AbstractC24446k abstractC24446k) {
        Enumeration mo127747p = abstractC24446k.mo127747p();
        if (((C24431e) mo127747p.nextElement()).m127741m().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.f9621b = C3066a.m14740f(mo127747p.nextElement());
        this.f9620a = AbstractC24440h.m127766m(mo127747p.nextElement());
        if (mo127747p.hasMoreElements()) {
            this.f9622c = AbstractC24448l.m127787n((AbstractC24452n) mo127747p.nextElement(), false);
        }
    }
}
