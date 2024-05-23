package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import zn0.C32515b;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.l */
/* loaded from: classes7.dex */
public abstract class AbstractC24448l extends AbstractC24444j {

    /* renamed from: a */
    private Vector f117978a;

    /* renamed from: b */
    private boolean f117979b;

    public AbstractC24448l() {
        this.f117978a = new Vector();
        this.f117979b = false;
    }

    /* renamed from: m */
    private byte[] m127786m(InterfaceC32514a interfaceC32514a) {
        try {
            return interfaceC32514a.mo11996c().m157482e("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* renamed from: n */
    public static AbstractC24448l m127787n(AbstractC24452n abstractC24452n, boolean z11) {
        if (z11) {
            if (abstractC24452n.m127800o()) {
                return (AbstractC24448l) abstractC24452n.m127798m();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (abstractC24452n.m127800o()) {
            return abstractC24452n instanceof C24472x ? new C24468v(abstractC24452n.m127798m()) : new C24477z0(abstractC24452n.m127798m());
        }
        if (abstractC24452n.m127798m() instanceof AbstractC24448l) {
            return (AbstractC24448l) abstractC24452n.m127798m();
        }
        if (abstractC24452n.m127798m() instanceof AbstractC24446k) {
            AbstractC24446k abstractC24446k = (AbstractC24446k) abstractC24452n.m127798m();
            return abstractC24452n instanceof C24472x ? new C24468v(abstractC24446k.m127785r()) : new C24477z0(abstractC24446k.m127785r());
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + abstractC24452n.getClass().getName());
    }

    /* renamed from: o */
    private InterfaceC32514a m127788o(Enumeration enumeration) {
        InterfaceC32514a interfaceC32514a = (InterfaceC32514a) enumeration.nextElement();
        return interfaceC32514a == null ? C24443i0.f117974a : interfaceC32514a;
    }

    /* renamed from: q */
    private boolean m127789q(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i11 = 0; i11 != min; i11++) {
            byte b11 = bArr[i11];
            byte b12 = bArr2[i11];
            if (b11 != b12) {
                return (b11 & 255) < (b12 & 255);
            }
        }
        return min == bArr.length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (!(abstractC24444j instanceof AbstractC24448l)) {
            return false;
        }
        AbstractC24448l abstractC24448l = (AbstractC24448l) abstractC24444j;
        if (m127791r() != abstractC24448l.m127791r()) {
            return false;
        }
        Enumeration m127790p = m127790p();
        Enumeration m127790p2 = abstractC24448l.m127790p();
        while (m127790p.hasMoreElements()) {
            InterfaceC32514a m127788o = m127788o(m127790p);
            InterfaceC32514a m127788o2 = m127788o(m127790p2);
            AbstractC24444j mo11996c = m127788o.mo11996c();
            AbstractC24444j mo11996c2 = m127788o2.mo11996c();
            if (mo11996c != mo11996c2 && !mo11996c.equals(mo11996c2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        Enumeration m127790p = m127790p();
        int m127791r = m127791r();
        while (m127790p.hasMoreElements()) {
            m127791r = (m127791r * 17) ^ m127788o(m127790p).hashCode();
        }
        return m127791r;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return true;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        if (this.f117979b) {
            C24459q0 c24459q0 = new C24459q0();
            c24459q0.f117978a = this.f117978a;
            return c24459q0;
        }
        Vector vector = new Vector();
        for (int i11 = 0; i11 != this.f117978a.size(); i11++) {
            vector.addElement(this.f117978a.elementAt(i11));
        }
        C24459q0 c24459q02 = new C24459q0();
        c24459q02.f117978a = vector;
        c24459q02.m127792s();
        return c24459q02;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        C24477z0 c24477z0 = new C24477z0();
        c24477z0.f117978a = this.f117978a;
        return c24477z0;
    }

    /* renamed from: p */
    public Enumeration m127790p() {
        return this.f117978a.elements();
    }

    /* renamed from: r */
    public int m127791r() {
        return this.f117978a.size();
    }

    /* renamed from: s */
    protected void m127792s() {
        if (this.f117979b) {
            return;
        }
        this.f117979b = true;
        if (this.f117978a.size() > 1) {
            int size = this.f117978a.size() - 1;
            boolean z11 = true;
            while (z11) {
                int i11 = 0;
                byte[] m127786m = m127786m((InterfaceC32514a) this.f117978a.elementAt(0));
                z11 = false;
                int i12 = 0;
                while (i12 != size) {
                    int i13 = i12 + 1;
                    byte[] m127786m2 = m127786m((InterfaceC32514a) this.f117978a.elementAt(i13));
                    if (m127789q(m127786m, m127786m2)) {
                        m127786m = m127786m2;
                    } else {
                        Object elementAt = this.f117978a.elementAt(i12);
                        Vector vector = this.f117978a;
                        vector.setElementAt(vector.elementAt(i13), i12);
                        this.f117978a.setElementAt(elementAt, i13);
                        i11 = i12;
                        z11 = true;
                    }
                    i12 = i13;
                }
                size = i11;
            }
        }
    }

    public String toString() {
        return this.f117978a.toString();
    }

    public AbstractC24448l(InterfaceC32514a interfaceC32514a) {
        Vector vector = new Vector();
        this.f117978a = vector;
        this.f117979b = false;
        vector.addElement(interfaceC32514a);
    }

    public AbstractC24448l(C32515b c32515b, boolean z11) {
        this.f117978a = new Vector();
        this.f117979b = false;
        for (int i11 = 0; i11 != c32515b.m157480c(); i11++) {
            this.f117978a.addElement(c32515b.m157479b(i11));
        }
        if (z11) {
            m127792s();
        }
    }

    public AbstractC24448l(InterfaceC32514a[] interfaceC32514aArr, boolean z11) {
        this.f117978a = new Vector();
        this.f117979b = false;
        for (int i11 = 0; i11 != interfaceC32514aArr.length; i11++) {
            this.f117978a.addElement(interfaceC32514aArr[i11]);
        }
        if (z11) {
            m127792s();
        }
    }
}
