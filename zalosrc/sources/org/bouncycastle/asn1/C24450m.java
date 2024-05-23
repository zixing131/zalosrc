package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import zn0.C32515b;
import zn0.InterfaceC32514a;
import zn0.InterfaceC32520g;

/* renamed from: org.bouncycastle.asn1.m */
/* loaded from: classes7.dex */
public class C24450m {

    /* renamed from: a */
    private final InputStream f117981a;

    /* renamed from: b */
    private final int f117982b;

    /* renamed from: c */
    private final byte[][] f117983c;

    public C24450m(InputStream inputStream) {
        this(inputStream, AbstractC24439g1.m127765c(inputStream));
    }

    /* renamed from: e */
    private void m127793e(boolean z11) {
        InputStream inputStream = this.f117981a;
        if (inputStream instanceof C24427c1) {
            ((C24427c1) inputStream).m127726d(z11);
        }
    }

    /* renamed from: a */
    InterfaceC32514a m127794a(int i11) {
        if (i11 == 4) {
            return new C24462s(this);
        }
        if (i11 == 8) {
            return new C24432e0(this);
        }
        if (i11 == 16) {
            return new C24466u(this);
        }
        if (i11 == 17) {
            return new C24470w(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i11));
    }

    /* renamed from: b */
    public InterfaceC32514a m127795b() {
        int read = this.f117981a.read();
        if (read == -1) {
            return null;
        }
        m127793e(false);
        int m127731s = C24428d.m127731s(this.f117981a, read);
        boolean z11 = (read & 32) != 0;
        int m127730q = C24428d.m127730q(this.f117981a, this.f117982b);
        if (m127730q < 0) {
            if (!z11) {
                throw new IOException("indefinite length primitive encoding encountered");
            }
            C24450m c24450m = new C24450m(new C24427c1(this.f117981a, this.f117982b), this.f117982b);
            return (read & 64) != 0 ? new C24456p(m127731s, c24450m) : (read & 128) != 0 ? new C24474y(true, m127731s, c24450m) : c24450m.m127794a(m127731s);
        }
        C24424b1 c24424b1 = new C24424b1(this.f117981a, m127730q);
        if ((read & 64) != 0) {
            return new C24420a0(z11, m127731s, c24424b1.m127720c());
        }
        if ((read & 128) != 0) {
            return new C24474y(z11, m127731s, new C24450m(c24424b1));
        }
        if (!z11) {
            if (m127731s == 4) {
                return new C24449l0(c24424b1);
            }
            try {
                return C24428d.m127727d(m127731s, c24424b1, this.f117983c);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        }
        if (m127731s == 4) {
            return new C24462s(new C24450m(c24424b1));
        }
        if (m127731s == 8) {
            return new C24432e0(new C24450m(c24424b1));
        }
        if (m127731s == 16) {
            return new C24457p0(new C24450m(c24424b1));
        }
        if (m127731s == 17) {
            return new C24461r0(new C24450m(c24424b1));
        }
        throw new IOException("unknown tag " + m127731s + " encountered");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC24444j m127796c(boolean z11, int i11) {
        if (!z11) {
            return new C24465t0(false, i11, new C24447k0(((C24424b1) this.f117981a).m127720c()));
        }
        C32515b m127797d = m127797d();
        return this.f117981a instanceof C24427c1 ? m127797d.m157480c() == 1 ? new C24472x(true, i11, m127797d.m157479b(0)) : new C24472x(false, i11, AbstractC24458q.m127803a(m127797d)) : m127797d.m157480c() == 1 ? new C24465t0(true, i11, m127797d.m157479b(0)) : new C24465t0(false, i11, AbstractC24435f0.m127749a(m127797d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C32515b m127797d() {
        C32515b c32515b = new C32515b();
        while (true) {
            InterfaceC32514a m127795b = m127795b();
            if (m127795b == null) {
                return c32515b;
            }
            c32515b.m157478a(m127795b instanceof InterfaceC32520g ? ((InterfaceC32520g) m127795b).mo127742b() : m127795b.mo11996c());
        }
    }

    public C24450m(InputStream inputStream, int i11) {
        this.f117981a = inputStream;
        this.f117982b = i11;
        this.f117983c = new byte[11];
    }
}
