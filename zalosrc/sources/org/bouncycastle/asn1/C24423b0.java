package org.bouncycastle.asn1;

import co0.AbstractC3634a;

/* renamed from: org.bouncycastle.asn1.b0 */
/* loaded from: classes7.dex */
public class C24423b0 extends AbstractC24444j {

    /* renamed from: a */
    private char[] f117935a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C24423b0(char[] cArr) {
        this.f117935a = cArr;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    protected boolean mo127713f(AbstractC24444j abstractC24444j) {
        if (abstractC24444j instanceof C24423b0) {
            return AbstractC3634a.m18319b(this.f117935a, ((C24423b0) abstractC24444j).f117935a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.mo127772c(30);
        c24442i.m127778i(this.f117935a.length * 2);
        int i11 = 0;
        while (true) {
            char[] cArr = this.f117935a;
            if (i11 == cArr.length) {
                return;
            }
            char c11 = cArr[i11];
            c24442i.mo127772c((byte) (c11 >> '\b'));
            c24442i.mo127772c((byte) c11);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return AbstractC24439g1.m127763a(this.f117935a.length * 2) + 1 + (this.f117935a.length * 2);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        return AbstractC3634a.m18322e(this.f117935a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return false;
    }

    /* renamed from: m */
    public String m127718m() {
        return new String(this.f117935a);
    }

    public String toString() {
        return m127718m();
    }
}
