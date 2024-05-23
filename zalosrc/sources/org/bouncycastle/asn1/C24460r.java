package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.r */
/* loaded from: classes7.dex */
public class C24460r extends AbstractC24440h {

    /* renamed from: b */
    private AbstractC24440h[] f117997b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.bouncycastle.asn1.r$a */
    /* loaded from: classes7.dex */
    public class a implements Enumeration {

        /* renamed from: a */
        int f117998a = 0;

        a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f117998a < C24460r.this.f117997b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            AbstractC24440h[] abstractC24440hArr = C24460r.this.f117997b;
            int i11 = this.f117998a;
            this.f117998a = i11 + 1;
            return abstractC24440hArr[i11];
        }
    }

    public C24460r(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: p */
    private Vector m127806p() {
        Vector vector = new Vector();
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f117969a;
            if (i11 >= bArr.length) {
                return vector;
            }
            int i12 = i11 + 1000;
            int length = (i12 > bArr.length ? bArr.length : i12) - i11;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i11, bArr2, 0, length);
            vector.addElement(new C24447k0(bArr2));
            i11 = i12;
        }
    }

    /* renamed from: r */
    private static byte[] m127807r(AbstractC24440h[] abstractC24440hArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != abstractC24440hArr.length; i11++) {
            try {
                byteArrayOutputStream.write(((C24447k0) abstractC24440hArr[i11]).mo127768n());
            } catch (IOException e11) {
                throw new IllegalArgumentException("exception converting octets " + e11.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(abstractC24440hArr[i11].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: g */
    public void mo127714g(C24442i c24442i) {
        c24442i.mo127772c(36);
        c24442i.mo127772c(128);
        Enumeration m127808q = m127808q();
        while (m127808q.hasMoreElements()) {
            c24442i.mo127779j((InterfaceC32514a) m127808q.nextElement());
        }
        c24442i.mo127772c(0);
        c24442i.mo127772c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: h */
    public int mo127715h() {
        Enumeration m127808q = m127808q();
        int i11 = 0;
        while (m127808q.hasMoreElements()) {
            i11 += ((InterfaceC32514a) m127808q.nextElement()).mo11996c().mo127715h();
        }
        return i11 + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.AbstractC24444j
    /* renamed from: j */
    public boolean mo127716j() {
        return true;
    }

    @Override // org.bouncycastle.asn1.AbstractC24440h
    /* renamed from: n */
    public byte[] mo127768n() {
        return this.f117969a;
    }

    /* renamed from: q */
    public Enumeration m127808q() {
        return this.f117997b == null ? m127806p().elements() : new a();
    }

    public C24460r(AbstractC24440h[] abstractC24440hArr) {
        super(m127807r(abstractC24440hArr));
        this.f117997b = abstractC24440hArr;
    }
}
