package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class xb4 extends ha4 {

    /* renamed from: i */
    private int f30410i;

    /* renamed from: j */
    private boolean f30411j;

    /* renamed from: k */
    private byte[] f30412k;

    /* renamed from: l */
    private byte[] f30413l;

    /* renamed from: m */
    private int f30414m;

    /* renamed from: n */
    private int f30415n;

    /* renamed from: o */
    private int f30416o;

    /* renamed from: p */
    private boolean f30417p;

    /* renamed from: q */
    private long f30418q;

    public xb4() {
        byte[] bArr = g92.f20479f;
        this.f30412k = bArr;
        this.f30413l = bArr;
    }

    /* renamed from: k */
    private final int m27877k(long j11) {
        return (int) ((j11 * this.f21595b.f24444a) / 1000000);
    }

    /* renamed from: l */
    private final int m27878l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i11 = this.f30410i;
                return i11 * (position / i11);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: m */
    private final void m27879m(byte[] bArr, int i11) {
        m22776d(i11).put(bArr, 0, i11).flip();
        if (i11 > 0) {
            this.f30417p = true;
        }
    }

    /* renamed from: n */
    private final void m27880n(ByteBuffer byteBuffer, byte[] bArr, int i11) {
        int min = Math.min(byteBuffer.remaining(), this.f30416o);
        int i12 = this.f30416o - min;
        System.arraycopy(bArr, i11 - i12, this.f30413l, 0, i12);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f30413l, i12, min);
    }

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    public final void mo20072a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !m22777h()) {
            int i11 = this.f30414m;
            if (i11 != 0) {
                if (i11 != 1) {
                    int limit = byteBuffer.limit();
                    int m27878l = m27878l(byteBuffer);
                    byteBuffer.limit(m27878l);
                    this.f30418q += byteBuffer.remaining() / this.f30410i;
                    m27880n(byteBuffer, this.f30413l, this.f30416o);
                    if (m27878l < limit) {
                        m27879m(this.f30413l, this.f30416o);
                        this.f30414m = 0;
                        byteBuffer.limit(limit);
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m27878l2 = m27878l(byteBuffer);
                    int position2 = m27878l2 - byteBuffer.position();
                    byte[] bArr = this.f30412k;
                    int length = bArr.length;
                    int i12 = this.f30415n;
                    int i13 = length - i12;
                    if (m27878l2 < limit2 && position2 < i13) {
                        m27879m(bArr, i12);
                        this.f30415n = 0;
                        this.f30414m = 0;
                    } else {
                        int min = Math.min(position2, i13);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f30412k, this.f30415n, min);
                        int i14 = this.f30415n + min;
                        this.f30415n = i14;
                        byte[] bArr2 = this.f30412k;
                        if (i14 == bArr2.length) {
                            if (this.f30417p) {
                                m27879m(bArr2, this.f30416o);
                                long j11 = this.f30418q;
                                int i15 = this.f30415n;
                                int i16 = this.f30416o;
                                this.f30418q = j11 + ((i15 - (i16 + i16)) / this.f30410i);
                                i14 = i15;
                            } else {
                                this.f30418q += (i14 - this.f30416o) / this.f30410i;
                            }
                            m27880n(byteBuffer, this.f30412k, i14);
                            this.f30415n = 0;
                            this.f30414m = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f30412k.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > 1024) {
                            int i17 = this.f30410i;
                            position = ((limit4 / i17) * i17) + i17;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f30414m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    m22776d(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f30417p = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: c */
    public final m94 mo20073c(m94 m94Var) {
        if (m94Var.f24446c == 2) {
            if (this.f30411j) {
                return m94Var;
            }
            return m94.f24443e;
        }
        throw new zznf(m94Var);
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: e */
    protected final void mo20074e() {
        if (this.f30411j) {
            this.f30410i = this.f21595b.f24447d;
            int m27877k = m27877k(150000L) * this.f30410i;
            if (this.f30412k.length != m27877k) {
                this.f30412k = new byte[m27877k];
            }
            int m27877k2 = m27877k(20000L) * this.f30410i;
            this.f30416o = m27877k2;
            if (this.f30413l.length != m27877k2) {
                this.f30413l = new byte[m27877k2];
            }
        }
        this.f30414m = 0;
        this.f30418q = 0L;
        this.f30415n = 0;
        this.f30417p = false;
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: f */
    protected final void mo20075f() {
        int i11 = this.f30415n;
        if (i11 > 0) {
            m27879m(this.f30412k, i11);
        }
        if (!this.f30417p) {
            this.f30418q += this.f30416o / this.f30410i;
        }
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: g */
    protected final void mo20076g() {
        this.f30411j = false;
        this.f30416o = 0;
        byte[] bArr = g92.f20479f;
        this.f30412k = bArr;
        this.f30413l = bArr;
    }

    /* renamed from: i */
    public final long m27881i() {
        return this.f30418q;
    }

    /* renamed from: j */
    public final void m27882j(boolean z11) {
        this.f30411j = z11;
    }

    @Override // com.google.android.gms.internal.ads.ha4, com.google.android.gms.internal.ads.n94
    public final boolean zzg() {
        return this.f30411j;
    }
}
