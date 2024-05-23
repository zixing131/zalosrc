package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import zn0.C32515b;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32518e;

/* renamed from: org.bouncycastle.asn1.k */
/* loaded from: classes7.dex */
public abstract class AbstractC24446k extends AbstractC24444j {

    /* renamed from: a */
    protected Vector f117977a = new Vector();

    public AbstractC24446k() {
    }

    /* renamed from: m */
    public static AbstractC24446k m127783m(Object obj) {
        if (obj == null || (obj instanceof AbstractC24446k)) {
            return (AbstractC24446k) obj;
        }
        if (obj instanceof InterfaceC32518e) {
            return m127783m(((InterfaceC32518e) obj).mo11996c());
        }
        if (obj instanceof byte[]) {
            try {
                return m127783m(AbstractC24444j.m127781i((byte[]) obj));
            } catch (IOException e11) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e11.getMessage());
            }
        }
        if (obj instanceof InterfaceC32514a) {
            AbstractC24444j mo11996c = ((InterfaceC32514a) obj).mo11996c();
            if (mo11996c instanceof AbstractC24446k) {
                return (AbstractC24446k) mo11996c;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    /* renamed from: n */
    private InterfaceC32514a m127784n(Enumeration enumeration) {
        return (InterfaceC32514a) enumeration.nextElement();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (!(abstractC24444j instanceof AbstractC24446k)) {
            return false;
        }
        AbstractC24446k abstractC24446k = (AbstractC24446k) abstractC24444j;
        if (mo127748q() != abstractC24446k.mo127748q()) {
            return false;
        }
        Enumeration mo127747p = mo127747p();
        Enumeration mo127747p2 = abstractC24446k.mo127747p();
        while (mo127747p.hasMoreElements()) {
            InterfaceC32514a m127784n = m127784n(mo127747p);
            InterfaceC32514a m127784n2 = m127784n(mo127747p2);
            AbstractC24444j mo11996c = m127784n.mo11996c();
            AbstractC24444j mo11996c2 = m127784n2.mo11996c();
            if (mo11996c != mo11996c2 && !mo11996c.equals(mo11996c2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        Enumeration mo127747p = mo127747p();
        int mo127748q = mo127748q();
        while (mo127747p.hasMoreElements()) {
            mo127748q = (mo127748q * 17) ^ m127784n(mo127747p).hashCode();
        }
        return mo127748q;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return true;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        C24455o0 c24455o0 = new C24455o0();
        c24455o0.f117977a = this.f117977a;
        return c24455o0;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        C24475y0 c24475y0 = new C24475y0();
        c24475y0.f117977a = this.f117977a;
        return c24475y0;
    }

    /* renamed from: o */
    public InterfaceC32514a mo127746o(int i11) {
        return (InterfaceC32514a) this.f117977a.elementAt(i11);
    }

    /* renamed from: p */
    public Enumeration mo127747p() {
        return this.f117977a.elements();
    }

    /* renamed from: q */
    public int mo127748q() {
        return this.f117977a.size();
    }

    /* renamed from: r */
    public InterfaceC32514a[] m127785r() {
        InterfaceC32514a[] interfaceC32514aArr = new InterfaceC32514a[mo127748q()];
        for (int i11 = 0; i11 != mo127748q(); i11++) {
            interfaceC32514aArr[i11] = mo127746o(i11);
        }
        return interfaceC32514aArr;
    }

    public String toString() {
        return this.f117977a.toString();
    }

    public AbstractC24446k(C32515b c32515b) {
        for (int i11 = 0; i11 != c32515b.m157480c(); i11++) {
            this.f117977a.addElement(c32515b.m157479b(i11));
        }
    }
}
