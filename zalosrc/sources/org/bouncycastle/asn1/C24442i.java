package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import zn0.InterfaceC32514a;

/* renamed from: org.bouncycastle.asn1.i */
/* loaded from: classes7.dex */
public class C24442i {

    /* renamed from: a */
    private OutputStream f117971a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.bouncycastle.asn1.i$a */
    /* loaded from: classes7.dex */
    public class a extends C24442i {

        /* renamed from: b */
        private boolean f117972b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f117972b = true;
        }

        @Override // org.bouncycastle.asn1.C24442i
        /* renamed from: c */
        public void mo127772c(int i11) {
            if (this.f117972b) {
                this.f117972b = false;
            } else {
                super.mo127772c(i11);
            }
        }
    }

    public C24442i(OutputStream outputStream) {
        this.f117971a = outputStream;
    }

    /* renamed from: a */
    public C24442i mo127770a() {
        return new C24451m0(this.f117971a);
    }

    /* renamed from: b */
    public C24442i mo127771b() {
        return new C24473x0(this.f117971a);
    }

    /* renamed from: c */
    public void mo127772c(int i11) {
        this.f117971a.write(i11);
    }

    /* renamed from: d */
    public void m127773d(byte[] bArr) {
        this.f117971a.write(bArr);
    }

    /* renamed from: e */
    void m127774e(byte[] bArr, int i11, int i12) {
        this.f117971a.write(bArr, i11, i12);
    }

    /* renamed from: f */
    public void m127775f(int i11, int i12, byte[] bArr) {
        m127780k(i11, i12);
        m127778i(bArr.length);
        m127773d(bArr);
    }

    /* renamed from: g */
    public void m127776g(int i11, byte[] bArr) {
        mo127772c(i11);
        m127778i(bArr.length);
        m127773d(bArr);
    }

    /* renamed from: h */
    public void m127777h(AbstractC24444j abstractC24444j) {
        if (abstractC24444j == null) {
            throw new IOException("null object detected");
        }
        abstractC24444j.mo127714g(new a(this.f117971a));
    }

    /* renamed from: i */
    public void m127778i(int i11) {
        if (i11 <= 127) {
            mo127772c((byte) i11);
            return;
        }
        int i12 = i11;
        int i13 = 1;
        while (true) {
            i12 >>>= 8;
            if (i12 == 0) {
                break;
            } else {
                i13++;
            }
        }
        mo127772c((byte) (i13 | 128));
        for (int i14 = (i13 - 1) * 8; i14 >= 0; i14 -= 8) {
            mo127772c((byte) (i11 >> i14));
        }
    }

    /* renamed from: j */
    public void mo127779j(InterfaceC32514a interfaceC32514a) {
        if (interfaceC32514a == null) {
            throw new IOException("null object detected");
        }
        interfaceC32514a.mo11996c().mo127714g(this);
    }

    /* renamed from: k */
    public void m127780k(int i11, int i12) {
        if (i12 < 31) {
            mo127772c(i11 | i12);
            return;
        }
        mo127772c(i11 | 31);
        if (i12 < 128) {
            mo127772c(i12);
            return;
        }
        byte[] bArr = new byte[5];
        int i13 = 4;
        bArr[4] = (byte) (i12 & 127);
        do {
            i12 >>= 7;
            i13--;
            bArr[i13] = (byte) ((i12 & 127) | 128);
        } while (i12 > 127);
        m127774e(bArr, i13, 5 - i13);
    }
}
