package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class yl4 implements km4 {

    /* renamed from: b */
    private final td4 f31014b;

    /* renamed from: c */
    private final long f31015c;

    /* renamed from: d */
    private long f31016d;

    /* renamed from: f */
    private int f31018f;

    /* renamed from: g */
    private int f31019g;

    /* renamed from: e */
    private byte[] f31017e = new byte[65536];

    /* renamed from: a */
    private final byte[] f31013a = new byte[4096];

    static {
        AbstractC4368bv.m20759b("media3.extractor");
    }

    public yl4(td4 td4Var, long j11, long j12) {
        this.f31014b = td4Var;
        this.f31016d = j11;
        this.f31015c = j12;
    }

    /* renamed from: m */
    private final int m28241m(byte[] bArr, int i11, int i12) {
        int i13 = this.f31019g;
        if (i13 == 0) {
            return 0;
        }
        int min = Math.min(i13, i12);
        System.arraycopy(this.f31017e, 0, bArr, i11, min);
        m28246s(min);
        return min;
    }

    /* renamed from: o */
    private final int m28242o(byte[] bArr, int i11, int i12, int i13, boolean z11) {
        if (!Thread.interrupted()) {
            int mo19942a = this.f31014b.mo19942a(bArr, i11 + i13, i12 - i13);
            if (mo19942a == -1) {
                if (i13 == 0 && z11) {
                    return -1;
                }
                throw new EOFException();
            }
            return i13 + mo19942a;
        }
        throw new InterruptedIOException();
    }

    /* renamed from: p */
    private final int m28243p(int i11) {
        int min = Math.min(this.f31019g, i11);
        m28246s(min);
        return min;
    }

    /* renamed from: q */
    private final void m28244q(int i11) {
        if (i11 != -1) {
            this.f31016d += i11;
        }
    }

    /* renamed from: r */
    private final void m28245r(int i11) {
        int i12 = this.f31018f + i11;
        int length = this.f31017e.length;
        if (i12 > length) {
            this.f31017e = Arrays.copyOf(this.f31017e, g92.m22322P(length + length, 65536 + i12, i12 + 524288));
        }
    }

    /* renamed from: s */
    private final void m28246s(int i11) {
        byte[] bArr;
        int i12 = this.f31019g - i11;
        this.f31019g = i12;
        this.f31018f = 0;
        byte[] bArr2 = this.f31017e;
        if (i12 < bArr2.length - 524288) {
            bArr = new byte[65536 + i12];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i11, bArr, 0, i12);
        this.f31017e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.km4, com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        int m28241m = m28241m(bArr, i11, i12);
        if (m28241m == 0) {
            m28241m = m28242o(bArr, i11, i12, 0, true);
        }
        m28244q(m28241m);
        return m28241m;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: b */
    public final void mo23960b(int i11) {
        m28247k(i11, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: c */
    public final int mo23961c(int i11) {
        int m28243p = m28243p(1);
        if (m28243p == 0) {
            m28243p = m28242o(this.f31013a, 0, Math.min(1, 4096), 0, true);
        }
        m28244q(m28243p);
        return m28243p;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: e */
    public final boolean mo23962e(byte[] bArr, int i11, int i12, boolean z11) {
        int m28241m = m28241m(bArr, i11, i12);
        while (m28241m < i12 && m28241m != -1) {
            m28241m = m28242o(bArr, i11, i12, m28241m, z11);
        }
        m28244q(m28241m);
        if (m28241m != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: f */
    public final boolean mo23963f(byte[] bArr, int i11, int i12, boolean z11) {
        if (!m28247k(i12, z11)) {
            return false;
        }
        System.arraycopy(this.f31017e, this.f31018f - i12, bArr, i11, i12);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: h */
    public final int mo23964h(byte[] bArr, int i11, int i12) {
        int min;
        m28245r(i12);
        int i13 = this.f31019g;
        int i14 = this.f31018f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            min = m28242o(this.f31017e, i14, i12, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f31019g += min;
        } else {
            min = Math.min(i12, i15);
        }
        System.arraycopy(this.f31017e, this.f31018f, bArr, i11, min);
        this.f31018f += min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: i */
    public final void mo23965i(byte[] bArr, int i11, int i12) {
        mo23962e(bArr, i11, i12, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: j */
    public final void mo23966j(byte[] bArr, int i11, int i12) {
        mo23963f(bArr, i11, i12, false);
    }

    /* renamed from: k */
    public final boolean m28247k(int i11, boolean z11) {
        m28245r(i11);
        int i12 = this.f31019g - this.f31018f;
        while (i12 < i11) {
            i12 = m28242o(this.f31017e, this.f31018f, i11, i12, z11);
            if (i12 == -1) {
                return false;
            }
            this.f31019g = this.f31018f + i12;
        }
        this.f31018f += i11;
        return true;
    }

    /* renamed from: l */
    public final boolean m28248l(int i11, boolean z11) {
        int m28243p = m28243p(i11);
        while (m28243p < i11 && m28243p != -1) {
            m28243p = m28242o(this.f31013a, -m28243p, Math.min(i11, m28243p + 4096), m28243p, false);
        }
        m28244q(m28243p);
        if (m28243p != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.km4
    /* renamed from: n */
    public final void mo23967n(int i11) {
        m28248l(i11, false);
    }

    @Override // com.google.android.gms.internal.ads.km4
    public final long zzd() {
        return this.f31015c;
    }

    @Override // com.google.android.gms.internal.ads.km4
    public final long zze() {
        return this.f31016d + this.f31018f;
    }

    @Override // com.google.android.gms.internal.ads.km4
    public final long zzf() {
        return this.f31016d;
    }

    @Override // com.google.android.gms.internal.ads.km4
    public final void zzj() {
        this.f31018f = 0;
    }
}
