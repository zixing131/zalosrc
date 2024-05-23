package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import zn0.C32515b;

/* renamed from: org.bouncycastle.asn1.d0 */
/* loaded from: classes7.dex */
public class C24429d0 extends AbstractC24444j {

    /* renamed from: a */
    private C24437g f117950a;

    /* renamed from: b */
    private C24431e f117951b;

    /* renamed from: c */
    private AbstractC24444j f117952c;

    /* renamed from: d */
    private int f117953d;

    /* renamed from: e */
    private AbstractC24444j f117954e;

    public C24429d0(C32515b c32515b) {
        int i11 = 0;
        AbstractC24444j m127738m = m127738m(c32515b, 0);
        if (m127738m instanceof C24437g) {
            this.f117950a = (C24437g) m127738m;
            m127738m = m127738m(c32515b, 1);
            i11 = 1;
        }
        if (m127738m instanceof C24431e) {
            this.f117951b = (C24431e) m127738m;
            i11++;
            m127738m = m127738m(c32515b, i11);
        }
        if (!(m127738m instanceof C24465t0)) {
            this.f117952c = m127738m;
            i11++;
            m127738m = m127738m(c32515b, i11);
        }
        if (c32515b.m157480c() != i11 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(m127738m instanceof C24465t0)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        C24465t0 c24465t0 = (C24465t0) m127738m;
        m127739n(c24465t0.m127799n());
        this.f117954e = c24465t0.m127798m();
    }

    /* renamed from: m */
    private AbstractC24444j m127738m(C32515b c32515b, int i11) {
        if (c32515b.m157480c() > i11) {
            return c32515b.m157479b(i11).mo11996c();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    /* renamed from: n */
    private void m127739n(int i11) {
        if (i11 >= 0 && i11 <= 2) {
            this.f117953d = i11;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i11);
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: f */
    boolean mo127713f(AbstractC24444j abstractC24444j) {
        AbstractC24444j abstractC24444j2;
        C24431e c24431e;
        C24437g c24437g;
        if (!(abstractC24444j instanceof C24429d0)) {
            return false;
        }
        if (this == abstractC24444j) {
            return true;
        }
        C24429d0 c24429d0 = (C24429d0) abstractC24444j;
        C24437g c24437g2 = this.f117950a;
        if (c24437g2 != null && ((c24437g = c24429d0.f117950a) == null || !c24437g.equals(c24437g2))) {
            return false;
        }
        C24431e c24431e2 = this.f117951b;
        if (c24431e2 != null && ((c24431e = c24429d0.f117951b) == null || !c24431e.equals(c24431e2))) {
            return false;
        }
        AbstractC24444j abstractC24444j3 = this.f117952c;
        if (abstractC24444j3 == null || ((abstractC24444j2 = c24429d0.f117952c) != null && abstractC24444j2.equals(abstractC24444j3))) {
            return this.f117954e.equals(c24429d0.f117954e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C24437g c24437g = this.f117950a;
        if (c24437g != null) {
            byteArrayOutputStream.write(c24437g.m157482e("DER"));
        }
        C24431e c24431e = this.f117951b;
        if (c24431e != null) {
            byteArrayOutputStream.write(c24431e.m157482e("DER"));
        }
        AbstractC24444j abstractC24444j = this.f117952c;
        if (abstractC24444j != null) {
            byteArrayOutputStream.write(abstractC24444j.m157482e("DER"));
        }
        byteArrayOutputStream.write(new C24465t0(true, this.f117953d, this.f117954e).m157482e("DER"));
        c24442i.m127775f(32, 8, byteArrayOutputStream.toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        return m157481d().length;
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j, zn0.AbstractC32516c
    public int hashCode() {
        C24437g c24437g = this.f117950a;
        int hashCode = c24437g != null ? c24437g.hashCode() : 0;
        C24431e c24431e = this.f117951b;
        if (c24431e != null) {
            hashCode ^= c24431e.hashCode();
        }
        AbstractC24444j abstractC24444j = this.f117952c;
        if (abstractC24444j != null) {
            hashCode ^= abstractC24444j.hashCode();
        }
        return hashCode ^ this.f117954e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return true;
    }
}
