package org.bouncycastle.asn1;

import java.util.Enumeration;
import zn0.InterfaceC32514a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.bouncycastle.asn1.e1 */
/* loaded from: classes7.dex */
public class C24433e1 extends AbstractC24446k {

    /* renamed from: b */
    private byte[] f117959b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24433e1(byte[] bArr) {
        this.f117959b = bArr;
    }

    /* renamed from: s */
    private void m127743s() {
        C24430d1 c24430d1 = new C24430d1(this.f117959b);
        while (c24430d1.hasMoreElements()) {
            this.f117977a.addElement(c24430d1.nextElement());
        }
        this.f117959b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        byte[] bArr = this.f117959b;
        if (bArr != null) {
            c24442i.m127776g(48, bArr);
        } else {
            super.mo127745l().mo127714g(c24442i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        byte[] bArr = this.f117959b;
        return bArr != null ? AbstractC24439g1.m127763a(bArr.length) + 1 + this.f117959b.length : super.mo127745l().mo127715h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24446k, org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: k */
    public AbstractC24444j mo127744k() {
        if (this.f117959b != null) {
            m127743s();
        }
        return super.mo127744k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24446k, org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: l */
    public AbstractC24444j mo127745l() {
        if (this.f117959b != null) {
            m127743s();
        }
        return super.mo127745l();
    }

    @Override // org.bouncycastle.asn1.AbstractC24446k
    /* renamed from: o */
    public synchronized InterfaceC32514a mo127746o(int i11) {
        try {
            if (this.f117959b != null) {
                m127743s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.mo127746o(i11);
    }

    @Override // org.bouncycastle.asn1.AbstractC24446k
    /* renamed from: p */
    public synchronized Enumeration mo127747p() {
        byte[] bArr = this.f117959b;
        if (bArr == null) {
            return super.mo127747p();
        }
        return new C24430d1(bArr);
    }

    @Override // org.bouncycastle.asn1.AbstractC24446k
    /* renamed from: q */
    public synchronized int mo127748q() {
        try {
            if (this.f117959b != null) {
                m127743s();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.mo127748q();
    }
}
