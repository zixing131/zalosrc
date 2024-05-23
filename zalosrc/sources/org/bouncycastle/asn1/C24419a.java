package org.bouncycastle.asn1;

import co0.AbstractC3634a;

/* renamed from: org.bouncycastle.asn1.a */
/* loaded from: classes7.dex */
public class C24419a extends AbstractC24444j {

    /* renamed from: b */
    private static final byte[] f117924b = {-1};

    /* renamed from: c */
    private static final byte[] f117925c = {0};

    /* renamed from: d */
    public static final C24419a f117926d = new C24419a(false);

    /* renamed from: e */
    public static final C24419a f117927e = new C24419a(true);

    /* renamed from: a */
    private byte[] f117928a;

    public C24419a(boolean z11) {
        this.f117928a = z11 ? f117924b : f117925c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static C24419a m127712m(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b11 = bArr[0];
        return b11 == 0 ? f117926d : (b11 & 255) == 255 ? f117927e : new C24419a(bArr);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    protected boolean mo127713f(AbstractC24444j abstractC24444j) {
        return (abstractC24444j instanceof C24419a) && this.f117928a[0] == ((C24419a) abstractC24444j).f117928a[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.m127776g(1, this.f117928a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return 3;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return this.f117928a[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    public String toString() {
        return this.f117928a[0] != 0 ? "TRUE" : "FALSE";
    }

    C24419a(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        byte b11 = bArr[0];
        if (b11 == 0) {
            this.f117928a = f117925c;
        } else if ((b11 & 255) == 255) {
            this.f117928a = f117924b;
        } else {
            this.f117928a = AbstractC3634a.m18320c(bArr);
        }
    }
}
