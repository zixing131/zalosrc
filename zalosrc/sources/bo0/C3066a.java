package bo0;

import org.bouncycastle.asn1.AbstractC24444j;
import org.bouncycastle.asn1.AbstractC24446k;
import org.bouncycastle.asn1.C24437g;
import org.bouncycastle.asn1.C24443i0;
import org.bouncycastle.asn1.C24455o0;
import zn0.AbstractC32516c;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: bo0.a */
/* loaded from: classes7.dex */
public class C3066a extends AbstractC32516c {

    /* renamed from: a */
    private C24437g f12394a;

    /* renamed from: b */
    private InterfaceC32514a f12395b;

    /* renamed from: c */
    private boolean f12396c;

    public C3066a(String str) {
        this.f12396c = false;
        this.f12394a = new C24437g(str);
    }

    /* renamed from: f */
    public static C3066a m14740f(Object obj) {
        return (obj == null || (obj instanceof C3066a)) ? (C3066a) obj : obj instanceof C24437g ? new C3066a((C24437g) obj) : obj instanceof String ? new C3066a((String) obj) : new C3066a(AbstractC24446k.m127783m(obj));
    }

    @Override // zn0.AbstractC32516c, zn0.InterfaceC32514a
    /* renamed from: c */
    public AbstractC24444j mo11996c() {
        C32515b c32515b = new C32515b();
        c32515b.m157478a(this.f12394a);
        if (this.f12396c) {
            InterfaceC32514a interfaceC32514a = this.f12395b;
            if (interfaceC32514a == null) {
                interfaceC32514a = C24443i0.f117974a;
            }
            c32515b.m157478a(interfaceC32514a);
        }
        return new C24455o0(c32515b);
    }

    public C3066a(C24437g c24437g) {
        this.f12396c = false;
        this.f12394a = c24437g;
    }

    public C3066a(C24437g c24437g, InterfaceC32514a interfaceC32514a) {
        this.f12396c = true;
        this.f12394a = c24437g;
        this.f12395b = interfaceC32514a;
    }

    public C3066a(AbstractC24446k abstractC24446k) {
        InterfaceC32514a interfaceC32514a;
        this.f12396c = false;
        if (abstractC24446k.mo127748q() < 1 || abstractC24446k.mo127748q() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC24446k.mo127748q());
        }
        this.f12394a = C24437g.m127754r(abstractC24446k.mo127746o(0));
        if (abstractC24446k.mo127748q() == 2) {
            this.f12396c = true;
            interfaceC32514a = abstractC24446k.mo127746o(1);
        } else {
            interfaceC32514a = null;
        }
        this.f12395b = interfaceC32514a;
    }
}
