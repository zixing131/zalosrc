package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class it3 extends ht3 {

    /* renamed from: t */
    protected final byte[] f22400t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public it3(byte[] bArr) {
        bArr.getClass();
        this.f22400t = bArr;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: A */
    public final ByteBuffer mo23392A() {
        return ByteBuffer.wrap(this.f22400t, mo22165Q(), mo22168p()).asReadOnlyBuffer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: B */
    public final void mo23393B(bt3 bt3Var) {
        bt3Var.mo20711a(this.f22400t, mo22165Q(), mo22168p());
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: C */
    public final boolean mo23394C() {
        int mo22165Q = mo22165Q();
        return nx3.m25040j(this.f22400t, mo22165Q, mo22168p() + mo22165Q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ht3
    /* renamed from: P */
    public final boolean mo23013P(mt3 mt3Var, int i11, int i12) {
        if (i12 <= mt3Var.mo22168p()) {
            int i13 = i11 + i12;
            if (i13 <= mt3Var.mo22168p()) {
                if (mt3Var instanceof it3) {
                    it3 it3Var = (it3) mt3Var;
                    byte[] bArr = this.f22400t;
                    byte[] bArr2 = it3Var.f22400t;
                    int mo22165Q = mo22165Q() + i12;
                    int mo22165Q2 = mo22165Q();
                    int mo22165Q3 = it3Var.mo22165Q() + i11;
                    while (mo22165Q2 < mo22165Q) {
                        if (bArr[mo22165Q2] != bArr2[mo22165Q3]) {
                            return false;
                        }
                        mo22165Q2++;
                        mo22165Q3++;
                    }
                    return true;
                }
                return mt3Var.mo23397w(i11, i13).equals(mo23397w(0, i12));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i11 + ", " + i12 + ", " + mt3Var.mo22168p());
        }
        throw new IllegalArgumentException("Length too large: " + i12 + mo22168p());
    }

    /* renamed from: Q */
    protected int mo22165Q() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.mt3
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mt3) || mo22168p() != ((mt3) obj).mo22168p()) {
            return false;
        }
        if (mo22168p() == 0) {
            return true;
        }
        if (obj instanceof it3) {
            it3 it3Var = (it3) obj;
            int m24733E = m24733E();
            int m24733E2 = it3Var.m24733E();
            if (m24733E != 0 && m24733E2 != 0 && m24733E != m24733E2) {
                return false;
            }
            return mo23013P(it3Var, 0, mo22168p());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: l */
    public byte mo22166l(int i11) {
        return this.f22400t[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: m */
    public byte mo22167m(int i11) {
        return this.f22400t[i11];
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: p */
    public int mo22168p() {
        return this.f22400t.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: r */
    public void mo22169r(byte[] bArr, int i11, int i12, int i13) {
        System.arraycopy(this.f22400t, i11, bArr, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: u */
    public final int mo23395u(int i11, int i12, int i13) {
        return dv3.m21549d(i11, this.f22400t, mo22165Q() + i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: v */
    public final int mo23396v(int i11, int i12, int i13) {
        int mo22165Q = mo22165Q() + i12;
        return nx3.m25036f(i11, this.f22400t, mo22165Q, i13 + mo22165Q);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: w */
    public final mt3 mo23397w(int i11, int i12) {
        int m24723D = mt3.m24723D(i11, i12, mo22168p());
        if (m24723D == 0) {
            return mt3.f24751q;
        }
        return new ft3(this.f22400t, mo22165Q() + i11, m24723D);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: x */
    public final vt3 mo23398x() {
        return vt3.m27355h(this.f22400t, mo22165Q(), mo22168p(), true);
    }

    @Override // com.google.android.gms.internal.ads.mt3
    /* renamed from: z */
    protected final String mo23399z(Charset charset) {
        return new String(this.f22400t, mo22165Q(), mo22168p(), charset);
    }
}
