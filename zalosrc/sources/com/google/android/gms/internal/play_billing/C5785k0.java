package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.play_billing.k0 */
/* loaded from: classes2.dex */
public class C5785k0 extends AbstractC5779j0 {

    /* renamed from: t */
    protected final byte[] f33343t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5785k0(byte[] bArr) {
        bArr.getClass();
        this.f33343t = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: d */
    public byte mo30239d(int i11) {
        return this.f33343t[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: e */
    public byte mo30240e(int i11) {
        return this.f33343t[i11];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5803n0) || mo30241g() != ((AbstractC5803n0) obj).mo30241g()) {
            return false;
        }
        if (mo30241g() == 0) {
            return true;
        }
        if (obj instanceof C5785k0) {
            C5785k0 c5785k0 = (C5785k0) obj;
            int m30373r = m30373r();
            int m30373r2 = c5785k0.m30373r();
            if (m30373r != 0 && m30373r2 != 0 && m30373r != m30373r2) {
                return false;
            }
            int mo30241g = mo30241g();
            if (mo30241g <= c5785k0.mo30241g()) {
                if (mo30241g <= c5785k0.mo30241g()) {
                    byte[] bArr = this.f33343t;
                    byte[] bArr2 = c5785k0.f33343t;
                    c5785k0.mo30242u();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < mo30241g) {
                        if (bArr[i11] != bArr2[i12]) {
                            return false;
                        }
                        i11++;
                        i12++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo30241g + ", " + c5785k0.mo30241g());
            }
            throw new IllegalArgumentException("Length too large: " + mo30241g + mo30241g());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: g */
    public int mo30241g() {
        return this.f33343t.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: j */
    protected final int mo30308j(int i11, int i12, int i13) {
        return AbstractC5804n1.m30376b(i11, this.f33343t, 0, i13);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: k */
    public final AbstractC5803n0 mo30309k(int i11, int i12) {
        int m30371p = AbstractC5803n0.m30371p(0, i12, mo30241g());
        if (m30371p == 0) {
            return AbstractC5803n0.f33371q;
        }
        return new C5767h0(this.f33343t, 0, m30371p);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: l */
    protected final String mo30310l(Charset charset) {
        return new String(this.f33343t, 0, mo30241g(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: m */
    public final void mo30311m(AbstractC5743d0 abstractC5743d0) {
        ((C5833s0) abstractC5743d0).m30446B(this.f33343t, 0, mo30241g());
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5803n0
    /* renamed from: n */
    public final boolean mo30312n() {
        return AbstractC5800m3.m30366e(this.f33343t, 0, mo30241g());
    }

    /* renamed from: u */
    protected int mo30242u() {
        return 0;
    }
}
