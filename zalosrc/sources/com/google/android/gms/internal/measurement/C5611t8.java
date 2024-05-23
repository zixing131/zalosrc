package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.t8 */
/* loaded from: classes.dex */
public class C5611t8 extends AbstractC5594s8 {

    /* renamed from: t */
    protected final byte[] f32809t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5611t8(byte[] bArr) {
        bArr.getClass();
        this.f32809t = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: d */
    public byte mo29549d(int i11) {
        return this.f32809t[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: e */
    public byte mo29550e(int i11) {
        return this.f32809t[i11];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5679x8) || mo29551g() != ((AbstractC5679x8) obj).mo29551g()) {
            return false;
        }
        if (mo29551g() == 0) {
            return true;
        }
        if (obj instanceof C5611t8) {
            C5611t8 c5611t8 = (C5611t8) obj;
            int m30022r = m30022r();
            int m30022r2 = c5611t8.m30022r();
            if (m30022r != 0 && m30022r2 != 0 && m30022r != m30022r2) {
                return false;
            }
            int mo29551g = mo29551g();
            if (mo29551g <= c5611t8.mo29551g()) {
                if (mo29551g <= c5611t8.mo29551g()) {
                    byte[] bArr = this.f32809t;
                    byte[] bArr2 = c5611t8.f32809t;
                    c5611t8.mo29552u();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < mo29551g) {
                        if (bArr[i11] != bArr2[i12]) {
                            return false;
                        }
                        i11++;
                        i12++;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Ran off end of other: 0, " + mo29551g + ", " + c5611t8.mo29551g());
            }
            throw new IllegalArgumentException("Length too large: " + mo29551g + mo29551g());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: g */
    public int mo29551g() {
        return this.f32809t.length;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: j */
    protected final int mo29630j(int i11, int i12, int i13) {
        return AbstractC5290aa.m28883b(i11, this.f32809t, 0, i13);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: k */
    public final AbstractC5679x8 mo29631k(int i11, int i12) {
        int m30020p = AbstractC5679x8.m30020p(0, i12, mo29551g());
        if (m30020p == 0) {
            return AbstractC5679x8.f32911q;
        }
        return new C5560q8(this.f32809t, 0, m30020p);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: l */
    protected final String mo29632l(Charset charset) {
        return new String(this.f32809t, 0, mo29551g(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: m */
    public final void mo29633m(AbstractC5492m8 abstractC5492m8) {
        ((C5323c9) abstractC5492m8).m28971B(this.f32809t, 0, mo29551g());
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5679x8
    /* renamed from: n */
    public final boolean mo29634n() {
        return AbstractC5292ac.m28890e(this.f32809t, 0, mo29551g());
    }

    /* renamed from: u */
    protected int mo29552u() {
        return 0;
    }
}
