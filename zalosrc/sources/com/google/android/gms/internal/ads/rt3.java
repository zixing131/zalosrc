package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class rt3 extends vt3 {

    /* renamed from: f */
    private final Iterable f27376f;

    /* renamed from: g */
    private final Iterator f27377g;

    /* renamed from: h */
    private ByteBuffer f27378h;

    /* renamed from: i */
    private int f27379i;

    /* renamed from: j */
    private int f27380j;

    /* renamed from: k */
    private int f27381k;

    /* renamed from: l */
    private int f27382l;

    /* renamed from: m */
    private int f27383m;

    /* renamed from: n */
    private long f27384n;

    /* renamed from: o */
    private long f27385o;

    /* renamed from: p */
    private long f27386p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rt3(Iterable iterable, int i11, boolean z11, pt3 pt3Var) {
        super(null);
        this.f27381k = Integer.MAX_VALUE;
        this.f27379i = i11;
        this.f27376f = iterable;
        this.f27377g = iterable.iterator();
        this.f27383m = 0;
        if (i11 == 0) {
            this.f27378h = dv3.f19429e;
            this.f27384n = 0L;
            this.f27385o = 0L;
            this.f27386p = 0L;
            return;
        }
        m26182H();
    }

    /* renamed from: D */
    private final int m26178D() {
        return (int) (((this.f27379i - this.f27383m) - this.f27384n) + this.f27385o);
    }

    /* renamed from: E */
    private final void m26179E() {
        if (this.f27377g.hasNext()) {
            m26182H();
            return;
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: F */
    private final void m26180F(byte[] bArr, int i11, int i12) {
        if (i12 <= m26178D()) {
            int i13 = i12;
            while (i13 > 0) {
                if (this.f27386p - this.f27384n == 0) {
                    m26179E();
                }
                int min = Math.min(i13, (int) (this.f27386p - this.f27384n));
                long j11 = min;
                ix3.m23461w(this.f27384n, bArr, i12 - i13, j11);
                i13 -= min;
                this.f27384n += j11;
            }
            return;
        }
        if (i12 <= 0) {
        } else {
            throw zzgrq.m28825j();
        }
    }

    /* renamed from: G */
    private final void m26181G() {
        int i11 = this.f27379i + this.f27380j;
        this.f27379i = i11;
        int i12 = this.f27381k;
        if (i11 <= i12) {
            this.f27380j = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f27380j = i13;
        this.f27379i = i11 - i13;
    }

    /* renamed from: H */
    private final void m26182H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f27377g.next();
        this.f27378h = byteBuffer;
        this.f27383m += (int) (this.f27384n - this.f27385o);
        long position = byteBuffer.position();
        this.f27384n = position;
        this.f27385o = position;
        this.f27386p = this.f27378h.limit();
        long m23451m = ix3.m23451m(this.f27378h);
        this.f27384n += m23451m;
        this.f27385o += m23451m;
        this.f27386p += m23451m;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: A */
    public final String mo25259A() {
        int m26186K = m26186K();
        if (m26186K > 0) {
            long j11 = m26186K;
            long j12 = this.f27386p;
            long j13 = this.f27384n;
            if (j11 <= j12 - j13) {
                String m25037g = nx3.m25037g(this.f27378h, (int) (j13 - this.f27385o), m26186K);
                this.f27384n += j11;
                return m25037g;
            }
        }
        if (m26186K >= 0 && m26186K <= m26178D()) {
            byte[] bArr = new byte[m26186K];
            m26180F(bArr, 0, m26186K);
            return nx3.m25038h(bArr, 0, m26186K);
        }
        if (m26186K == 0) {
            return "";
        }
        if (m26186K <= 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: B */
    public final void mo25260B(int i11) {
        if (this.f27382l == i11) {
        } else {
            throw zzgrq.m28818b();
        }
    }

    /* renamed from: C */
    public final void m26183C(int i11) {
        if (i11 >= 0 && i11 <= ((this.f27379i - this.f27383m) - this.f27384n) + this.f27385o) {
            while (i11 > 0) {
                if (this.f27386p - this.f27384n == 0) {
                    m26179E();
                }
                int min = Math.min(i11, (int) (this.f27386p - this.f27384n));
                i11 -= min;
                this.f27384n += min;
            }
            return;
        }
        if (i11 < 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }

    /* renamed from: I */
    public final byte m26184I() {
        if (this.f27386p - this.f27384n == 0) {
            m26179E();
        }
        long j11 = this.f27384n;
        this.f27384n = 1 + j11;
        return ix3.m23447i(j11);
    }

    /* renamed from: J */
    public final int m26185J() {
        int m26184I;
        byte m26184I2;
        long j11 = this.f27386p;
        long j12 = this.f27384n;
        if (j11 - j12 >= 4) {
            this.f27384n = 4 + j12;
            m26184I = (ix3.m23447i(j12) & 255) | ((ix3.m23447i(1 + j12) & 255) << 8) | ((ix3.m23447i(2 + j12) & 255) << 16);
            m26184I2 = ix3.m23447i(j12 + 3);
        } else {
            m26184I = (m26184I() & 255) | ((m26184I() & 255) << 8) | ((m26184I() & 255) << 16);
            m26184I2 = m26184I();
        }
        return m26184I | ((m26184I2 & 255) << 24);
    }

    /* renamed from: K */
    public final int m26186K() {
        int i11;
        long j11 = this.f27384n;
        if (this.f27386p != j11) {
            long j12 = j11 + 1;
            byte m23447i = ix3.m23447i(j11);
            if (m23447i >= 0) {
                this.f27384n++;
                return m23447i;
            }
            if (this.f27386p - this.f27384n >= 10) {
                long j13 = 2 + j11;
                int m23447i2 = (ix3.m23447i(j12) << 7) ^ m23447i;
                if (m23447i2 < 0) {
                    i11 = m23447i2 ^ (-128);
                } else {
                    long j14 = 3 + j11;
                    int m23447i3 = (ix3.m23447i(j13) << 14) ^ m23447i2;
                    if (m23447i3 >= 0) {
                        i11 = m23447i3 ^ 16256;
                    } else {
                        long j15 = 4 + j11;
                        int m23447i4 = m23447i3 ^ (ix3.m23447i(j14) << 21);
                        if (m23447i4 < 0) {
                            i11 = (-2080896) ^ m23447i4;
                        } else {
                            j14 = 5 + j11;
                            byte m23447i5 = ix3.m23447i(j15);
                            int i12 = (m23447i4 ^ (m23447i5 << 28)) ^ 266354560;
                            if (m23447i5 < 0) {
                                j15 = 6 + j11;
                                if (ix3.m23447i(j14) < 0) {
                                    j14 = 7 + j11;
                                    if (ix3.m23447i(j15) < 0) {
                                        j15 = 8 + j11;
                                        if (ix3.m23447i(j14) < 0) {
                                            j14 = 9 + j11;
                                            if (ix3.m23447i(j15) < 0) {
                                                long j16 = j11 + 10;
                                                if (ix3.m23447i(j14) >= 0) {
                                                    i11 = i12;
                                                    j13 = j16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i12;
                            }
                            i11 = i12;
                        }
                        j13 = j15;
                    }
                    j13 = j14;
                }
                this.f27384n = j13;
                return i11;
            }
        }
        return (int) m26189N();
    }

    /* renamed from: L */
    public final long m26187L() {
        long m26184I;
        byte m26184I2;
        long j11 = this.f27386p;
        long j12 = this.f27384n;
        if (j11 - j12 >= 8) {
            this.f27384n = 8 + j12;
            m26184I = (ix3.m23447i(j12) & 255) | ((ix3.m23447i(1 + j12) & 255) << 8) | ((ix3.m23447i(2 + j12) & 255) << 16) | ((ix3.m23447i(3 + j12) & 255) << 24) | ((ix3.m23447i(4 + j12) & 255) << 32) | ((ix3.m23447i(5 + j12) & 255) << 40) | ((ix3.m23447i(6 + j12) & 255) << 48);
            m26184I2 = ix3.m23447i(j12 + 7);
        } else {
            m26184I = (m26184I() & 255) | ((m26184I() & 255) << 8) | ((m26184I() & 255) << 16) | ((m26184I() & 255) << 24) | ((m26184I() & 255) << 32) | ((m26184I() & 255) << 40) | ((m26184I() & 255) << 48);
            m26184I2 = m26184I();
        }
        return m26184I | ((m26184I2 & 255) << 56);
    }

    /* renamed from: M */
    public final long m26188M() {
        long j11;
        long j12;
        long j13 = this.f27384n;
        if (this.f27386p != j13) {
            long j14 = j13 + 1;
            byte m23447i = ix3.m23447i(j13);
            if (m23447i >= 0) {
                this.f27384n++;
                return m23447i;
            }
            if (this.f27386p - this.f27384n >= 10) {
                long j15 = 2 + j13;
                int m23447i2 = (ix3.m23447i(j14) << 7) ^ m23447i;
                if (m23447i2 < 0) {
                    j11 = m23447i2 ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int m23447i3 = (ix3.m23447i(j15) << 14) ^ m23447i2;
                    if (m23447i3 >= 0) {
                        j11 = m23447i3 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int m23447i4 = m23447i3 ^ (ix3.m23447i(j16) << 21);
                        if (m23447i4 < 0) {
                            j11 = (-2080896) ^ m23447i4;
                            j15 = j17;
                        } else {
                            j16 = 5 + j13;
                            long m23447i5 = (ix3.m23447i(j17) << 28) ^ m23447i4;
                            if (m23447i5 >= 0) {
                                j11 = 266354560 ^ m23447i5;
                            } else {
                                long j18 = 6 + j13;
                                long m23447i6 = m23447i5 ^ (ix3.m23447i(j16) << 35);
                                if (m23447i6 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    long j19 = 7 + j13;
                                    long m23447i7 = m23447i6 ^ (ix3.m23447i(j18) << 42);
                                    if (m23447i7 >= 0) {
                                        j11 = 4363953127296L ^ m23447i7;
                                    } else {
                                        j18 = 8 + j13;
                                        m23447i6 = m23447i7 ^ (ix3.m23447i(j19) << 49);
                                        if (m23447i6 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            j19 = 9 + j13;
                                            long m23447i8 = (m23447i6 ^ (ix3.m23447i(j18) << 56)) ^ 71499008037633920L;
                                            if (m23447i8 < 0) {
                                                long j21 = j13 + 10;
                                                if (ix3.m23447i(j19) >= 0) {
                                                    j11 = m23447i8;
                                                    j15 = j21;
                                                }
                                            } else {
                                                j11 = m23447i8;
                                            }
                                        }
                                    }
                                    j15 = j19;
                                }
                                j11 = j12 ^ m23447i6;
                                j15 = j18;
                            }
                        }
                    }
                    j15 = j16;
                }
                this.f27384n = j15;
                return j11;
            }
        }
        return m26189N();
    }

    /* renamed from: N */
    final long m26189N() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((m26184I() & 128) == 0) {
                return j11;
            }
        }
        throw zzgrq.m28821e();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: a */
    public final void mo25268a(int i11) {
        this.f27381k = i11;
        m26181G();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: b */
    public final boolean mo25269b() {
        return (((long) this.f27383m) + this.f27384n) - this.f27385o == ((long) this.f27379i);
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: c */
    public final boolean mo25270c() {
        if (m26188M() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: d */
    public final boolean mo25271d(int i11) {
        int mo25281r;
        int i12 = i11 & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            m26183C(4);
                            return true;
                        }
                        throw zzgrq.m28817a();
                    }
                    do {
                        mo25281r = mo25281r();
                        if (mo25281r == 0) {
                            break;
                        }
                    } while (mo25271d(mo25281r));
                    mo25260B(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                m26183C(m26186K());
                return true;
            }
            m26183C(8);
            return true;
        }
        for (int i13 = 0; i13 < 10; i13++) {
            if (m26184I() >= 0) {
                return true;
            }
        }
        throw zzgrq.m28821e();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: i */
    public final double mo25272i() {
        return Double.longBitsToDouble(m26187L());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: j */
    public final float mo25273j() {
        return Float.intBitsToFloat(m26185J());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: k */
    public final int mo25274k() {
        return (int) ((this.f27383m + this.f27384n) - this.f27385o);
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: l */
    public final int mo25275l(int i11) {
        if (i11 >= 0) {
            int mo25274k = i11 + mo25274k();
            int i12 = this.f27381k;
            if (mo25274k <= i12) {
                this.f27381k = mo25274k;
                m26181G();
                return i12;
            }
            throw zzgrq.m28825j();
        }
        throw zzgrq.m28822f();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: m */
    public final int mo25276m() {
        return m26186K();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: n */
    public final int mo25277n() {
        return m26185J();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: o */
    public final int mo25278o() {
        return m26186K();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: p */
    public final int mo25279p() {
        return m26185J();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: q */
    public final int mo25280q() {
        return vt3.m27352e(m26186K());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: r */
    public final int mo25281r() {
        if (mo25269b()) {
            this.f27382l = 0;
            return 0;
        }
        int m26186K = m26186K();
        this.f27382l = m26186K;
        if ((m26186K >>> 3) != 0) {
            return m26186K;
        }
        throw zzgrq.m28819c();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: s */
    public final int mo25282s() {
        return m26186K();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: t */
    public final long mo25283t() {
        return m26187L();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: u */
    public final long mo25284u() {
        return m26188M();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: v */
    public final long mo25285v() {
        return m26187L();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: w */
    public final long mo25286w() {
        return vt3.m27353f(m26188M());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: x */
    public final long mo25287x() {
        return m26188M();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: y */
    public final mt3 mo25288y() {
        int m26186K = m26186K();
        if (m26186K > 0) {
            long j11 = m26186K;
            long j12 = this.f27386p;
            long j13 = this.f27384n;
            if (j11 <= j12 - j13) {
                byte[] bArr = new byte[m26186K];
                ix3.m23461w(j13, bArr, 0L, j11);
                this.f27384n += j11;
                return mt3.m24730M(bArr);
            }
        }
        if (m26186K > 0 && m26186K <= m26178D()) {
            byte[] bArr2 = new byte[m26186K];
            m26180F(bArr2, 0, m26186K);
            return mt3.m24730M(bArr2);
        }
        if (m26186K == 0) {
            return mt3.f24751q;
        }
        if (m26186K < 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: z */
    public final String mo25289z() {
        int m26186K = m26186K();
        if (m26186K > 0) {
            long j11 = m26186K;
            long j12 = this.f27386p;
            long j13 = this.f27384n;
            if (j11 <= j12 - j13) {
                byte[] bArr = new byte[m26186K];
                ix3.m23461w(j13, bArr, 0L, j11);
                String str = new String(bArr, dv3.f19426b);
                this.f27384n += j11;
                return str;
            }
        }
        if (m26186K > 0 && m26186K <= m26178D()) {
            byte[] bArr2 = new byte[m26186K];
            m26180F(bArr2, 0, m26186K);
            return new String(bArr2, dv3.f19426b);
        }
        if (m26186K == 0) {
            return "";
        }
        if (m26186K < 0) {
            throw zzgrq.m28822f();
        }
        throw zzgrq.m28825j();
    }
}
