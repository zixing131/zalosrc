package org.bouncycastle.asn1;

import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.n */
/* loaded from: classes7.dex */
public abstract class AbstractC24452n extends AbstractC24444j implements InterfaceC32514a, InterfaceC32520g {

    /* renamed from: a */
    int f117984a;

    /* renamed from: b */
    boolean f117985b = false;

    /* renamed from: c */
    boolean f117986c;

    /* renamed from: d */
    InterfaceC32514a f117987d;

    public AbstractC24452n(boolean z11, int i11, InterfaceC32514a interfaceC32514a) {
        this.f117987d = null;
        this.f117986c = z11;
        this.f117984a = i11;
        if (!z11) {
            boolean z12 = interfaceC32514a.mo11996c() instanceof AbstractC24448l;
        }
        this.f117987d = interfaceC32514a;
    }

    @Override // zn0.InterfaceC32520g
    /* renamed from: b */
    public AbstractC24444j mo127742b() {
        return mo11996c();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (!(abstractC24444j instanceof AbstractC24452n)) {
            return false;
        }
        AbstractC24452n abstractC24452n = (AbstractC24452n) abstractC24444j;
        if (this.f117984a != abstractC24452n.f117984a || this.f117985b != abstractC24452n.f117985b || this.f117986c != abstractC24452n.f117986c) {
            return false;
        }
        InterfaceC32514a interfaceC32514a = this.f117987d;
        return interfaceC32514a == null ? abstractC24452n.f117987d == null : interfaceC32514a.mo11996c().equals(abstractC24452n.f117987d.mo11996c());
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        int i11 = this.f117984a;
        InterfaceC32514a interfaceC32514a = this.f117987d;
        return interfaceC32514a != null ? i11 ^ interfaceC32514a.hashCode() : i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        return new C24465t0(this.f117986c, this.f117984a, this.f117987d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        return new C24421a1(this.f117986c, this.f117984a, this.f117987d);
    }

    /* renamed from: m */
    public AbstractC24444j m127798m() {
        InterfaceC32514a interfaceC32514a = this.f117987d;
        if (interfaceC32514a != null) {
            return interfaceC32514a.mo11996c();
        }
        return null;
    }

    /* renamed from: n */
    public int m127799n() {
        return this.f117984a;
    }

    /* renamed from: o */
    public boolean m127800o() {
        return this.f117986c;
    }

    public String toString() {
        return "[" + this.f117984a + "]" + this.f117987d;
    }
}
