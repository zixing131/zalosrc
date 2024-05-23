package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tt3 extends vt3 {

    /* renamed from: f */
    private final InputStream f28540f;

    /* renamed from: g */
    private final byte[] f28541g;

    /* renamed from: h */
    private int f28542h;

    /* renamed from: i */
    private int f28543i;

    /* renamed from: j */
    private int f28544j;

    /* renamed from: k */
    private int f28545k;

    /* renamed from: l */
    private int f28546l;

    /* renamed from: m */
    private int f28547m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ tt3(InputStream inputStream, int i11, st3 st3Var) {
        super(null);
        this.f28547m = Integer.MAX_VALUE;
        dv3.m21551f(inputStream, "input");
        this.f28540f = inputStream;
        this.f28541g = new byte[4096];
        this.f28542h = 0;
        this.f28544j = 0;
        this.f28546l = 0;
    }

    /* renamed from: D */
    private final List m26741D(int i11) {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int min = Math.min(i11, 4096);
            byte[] bArr = new byte[min];
            int i12 = 0;
            while (i12 < min) {
                int read = this.f28540f.read(bArr, i12, min - i12);
                if (read != -1) {
                    this.f28546l += read;
                    i12 += read;
                } else {
                    throw zzgrq.m28825j();
                }
            }
            i11 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: E */
    private final void m26742E() {
        int i11 = this.f28542h + this.f28543i;
        this.f28542h = i11;
        int i12 = this.f28546l + i11;
        int i13 = this.f28547m;
        if (i12 <= i13) {
            this.f28543i = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f28543i = i14;
        this.f28542h = i11 - i14;
    }

    /* renamed from: F */
    private final void m26743F(int i11) {
        if (!m26744G(i11)) {
            if (i11 > (Integer.MAX_VALUE - this.f28546l) - this.f28544j) {
                throw zzgrq.m28824i();
            }
            throw zzgrq.m28825j();
        }
    }

    /* renamed from: G */
    private final boolean m26744G(int i11) {
        int i12 = this.f28544j;
        int i13 = this.f28542h;
        if (i12 + i11 > i13) {
            int i14 = this.f28546l;
            if (i11 > (Integer.MAX_VALUE - i14) - i12 || i14 + i12 + i11 > this.f28547m) {
                return false;
            }
            if (i12 > 0) {
                if (i13 > i12) {
                    byte[] bArr = this.f28541g;
                    System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                }
                i14 = this.f28546l + i12;
                this.f28546l = i14;
                i13 = this.f28542h - i12;
                this.f28542h = i13;
                this.f28544j = 0;
            }
            try {
                int read = this.f28540f.read(this.f28541g, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
                if (read != 0 && read >= -1 && read <= 4096) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f28542h += read;
                    m26742E();
                    if (this.f28542h >= i11) {
                        return true;
                    }
                    return m26744G(i11);
                }
                throw new IllegalStateException(String.valueOf(this.f28540f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (zzgrq e11) {
                e11.m28827k();
                throw e11;
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i11 + " bytes were already available in buffer");
    }

    /* renamed from: H */
    private final byte[] m26745H(int i11, boolean z11) {
        byte[] m26746I = m26746I(i11);
        if (m26746I != null) {
            return m26746I;
        }
        int i12 = this.f28544j;
        int i13 = this.f28542h;
        int i14 = i13 - i12;
        this.f28546l += i13;
        this.f28544j = 0;
        this.f28542h = 0;
        List<byte[]> m26741D = m26741D(i11 - i14);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f28541g, i12, bArr, 0, i14);
        for (byte[] bArr2 : m26741D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return bArr;
    }

    /* renamed from: I */
    private final byte[] m26746I(int i11) {
        if (i11 == 0) {
            return dv3.f19428d;
        }
        if (i11 >= 0) {
            int i12 = this.f28546l;
            int i13 = this.f28544j;
            int i14 = i12 + i13 + i11;
            if ((-2147483647) + i14 <= 0) {
                int i15 = this.f28547m;
                if (i14 <= i15) {
                    int i16 = this.f28542h - i13;
                    int i17 = i11 - i16;
                    if (i17 >= 4096) {
                        try {
                            if (i17 > this.f28540f.available()) {
                                return null;
                            }
                        } catch (zzgrq e11) {
                            e11.m28827k();
                            throw e11;
                        }
                    }
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f28541g, this.f28544j, bArr, 0, i16);
                    this.f28546l += this.f28542h;
                    this.f28544j = 0;
                    this.f28542h = 0;
                    while (i16 < i11) {
                        try {
                            int read = this.f28540f.read(bArr, i16, i11 - i16);
                            if (read != -1) {
                                this.f28546l += read;
                                i16 += read;
                            } else {
                                throw zzgrq.m28825j();
                            }
                        } catch (zzgrq e12) {
                            e12.m28827k();
                            throw e12;
                        }
                    }
                    return bArr;
                }
                m26747C((i15 - i12) - i13);
                throw zzgrq.m28825j();
            }
            throw zzgrq.m28824i();
        }
        throw zzgrq.m28822f();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: A */
    public final String mo25259A() {
        byte[] m26745H;
        int m26750L = m26750L();
        int i11 = this.f28544j;
        int i12 = this.f28542h;
        if (m26750L <= i12 - i11 && m26750L > 0) {
            m26745H = this.f28541g;
            this.f28544j = i11 + m26750L;
        } else {
            if (m26750L == 0) {
                return "";
            }
            i11 = 0;
            if (m26750L <= i12) {
                m26743F(m26750L);
                m26745H = this.f28541g;
                this.f28544j = m26750L;
            } else {
                m26745H = m26745H(m26750L, false);
            }
        }
        return nx3.m25038h(m26745H, i11, m26750L);
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: B */
    public final void mo25260B(int i11) {
        if (this.f28545k == i11) {
        } else {
            throw zzgrq.m28818b();
        }
    }

    /* renamed from: C */
    public final void m26747C(int i11) {
        int i12 = this.f28542h;
        int i13 = this.f28544j;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f28544j = i13 + i11;
            return;
        }
        if (i11 >= 0) {
            int i15 = this.f28546l;
            int i16 = i15 + i13;
            int i17 = this.f28547m;
            if (i16 + i11 <= i17) {
                this.f28546l = i16;
                this.f28542h = 0;
                this.f28544j = 0;
                while (i14 < i11) {
                    try {
                        long j11 = i11 - i14;
                        try {
                            long skip = this.f28540f.skip(j11);
                            if (skip >= 0 && skip <= j11) {
                                if (skip == 0) {
                                    break;
                                } else {
                                    i14 += (int) skip;
                                }
                            } else {
                                throw new IllegalStateException(String.valueOf(this.f28540f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (zzgrq e11) {
                            e11.m28827k();
                            throw e11;
                        }
                    } catch (Throwable th2) {
                        this.f28546l += i14;
                        m26742E();
                        throw th2;
                    }
                }
                this.f28546l += i14;
                m26742E();
                if (i14 < i11) {
                    int i18 = this.f28542h;
                    int i19 = i18 - this.f28544j;
                    this.f28544j = i18;
                    m26743F(1);
                    while (true) {
                        int i21 = i11 - i19;
                        int i22 = this.f28542h;
                        if (i21 > i22) {
                            i19 += i22;
                            this.f28544j = i22;
                            m26743F(1);
                        } else {
                            this.f28544j = i21;
                            return;
                        }
                    }
                }
            } else {
                m26747C((i17 - i15) - i13);
                throw zzgrq.m28825j();
            }
        } else {
            throw zzgrq.m28822f();
        }
    }

    /* renamed from: J */
    public final byte m26748J() {
        if (this.f28544j == this.f28542h) {
            m26743F(1);
        }
        byte[] bArr = this.f28541g;
        int i11 = this.f28544j;
        this.f28544j = i11 + 1;
        return bArr[i11];
    }

    /* renamed from: K */
    public final int m26749K() {
        int i11 = this.f28544j;
        if (this.f28542h - i11 < 4) {
            m26743F(4);
            i11 = this.f28544j;
        }
        byte[] bArr = this.f28541g;
        this.f28544j = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    /* renamed from: L */
    public final int m26750L() {
        int i11;
        int i12 = this.f28544j;
        int i13 = this.f28542h;
        if (i13 != i12) {
            byte[] bArr = this.f28541g;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f28544j = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b12 = bArr[i19];
                            int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f28544j = i15;
                return i11;
            }
        }
        return (int) m26753O();
    }

    /* renamed from: M */
    public final long m26751M() {
        int i11 = this.f28544j;
        if (this.f28542h - i11 < 8) {
            m26743F(8);
            i11 = this.f28544j;
        }
        byte[] bArr = this.f28541g;
        this.f28544j = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    /* renamed from: N */
    public final long m26752N() {
        long j11;
        long j12;
        int i11 = this.f28544j;
        int i12 = this.f28542h;
        if (i12 != i11) {
            byte[] bArr = this.f28541g;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f28544j = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b11;
                if (i15 < 0) {
                    j11 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j11 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j13 = (-2080896) ^ i19;
                            i14 = i18;
                            j11 = j13;
                        } else {
                            i16 = i11 + 5;
                            long j14 = i19 ^ (bArr[i18] << 28);
                            if (j14 >= 0) {
                                j11 = j14 ^ 266354560;
                            } else {
                                i14 = i11 + 6;
                                long j15 = (bArr[i16] << 35) ^ j14;
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    int i21 = i11 + 7;
                                    long j16 = j15 ^ (bArr[i14] << 42);
                                    if (j16 >= 0) {
                                        j11 = j16 ^ 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j15 = j16 ^ (bArr[i21] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i21 = i11 + 9;
                                            long j17 = (j15 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                i14 = i11 + 10;
                                                if (bArr[i21] >= 0) {
                                                    j11 = j17;
                                                }
                                            } else {
                                                j11 = j17;
                                            }
                                        }
                                    }
                                    i14 = i21;
                                }
                                j11 = j15 ^ j12;
                            }
                        }
                    }
                    i14 = i16;
                }
                this.f28544j = i14;
                return j11;
            }
        }
        return m26753O();
    }

    /* renamed from: O */
    final long m26753O() {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((m26748J() & 128) == 0) {
                return j11;
            }
        }
        throw zzgrq.m28821e();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: a */
    public final void mo25268a(int i11) {
        this.f28547m = i11;
        m26742E();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: b */
    public final boolean mo25269b() {
        if (this.f28544j == this.f28542h && !m26744G(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: c */
    public final boolean mo25270c() {
        if (m26752N() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: d */
    public final boolean mo25271d(int i11) {
        int mo25281r;
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            return false;
                        }
                        if (i12 == 5) {
                            m26747C(4);
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
                m26747C(m26750L());
                return true;
            }
            m26747C(8);
            return true;
        }
        if (this.f28542h - this.f28544j >= 10) {
            while (i13 < 10) {
                byte[] bArr = this.f28541g;
                int i14 = this.f28544j;
                this.f28544j = i14 + 1;
                if (bArr[i14] < 0) {
                    i13++;
                }
            }
            throw zzgrq.m28821e();
        }
        while (i13 < 10) {
            if (m26748J() < 0) {
                i13++;
            }
        }
        throw zzgrq.m28821e();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: i */
    public final double mo25272i() {
        return Double.longBitsToDouble(m26751M());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: j */
    public final float mo25273j() {
        return Float.intBitsToFloat(m26749K());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: k */
    public final int mo25274k() {
        return this.f28546l + this.f28544j;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: l */
    public final int mo25275l(int i11) {
        if (i11 >= 0) {
            int i12 = i11 + this.f28546l + this.f28544j;
            int i13 = this.f28547m;
            if (i12 <= i13) {
                this.f28547m = i12;
                m26742E();
                return i13;
            }
            throw zzgrq.m28825j();
        }
        throw zzgrq.m28822f();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: m */
    public final int mo25276m() {
        return m26750L();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: n */
    public final int mo25277n() {
        return m26749K();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: o */
    public final int mo25278o() {
        return m26750L();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: p */
    public final int mo25279p() {
        return m26749K();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: q */
    public final int mo25280q() {
        return vt3.m27352e(m26750L());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: r */
    public final int mo25281r() {
        if (mo25269b()) {
            this.f28545k = 0;
            return 0;
        }
        int m26750L = m26750L();
        this.f28545k = m26750L;
        if ((m26750L >>> 3) != 0) {
            return m26750L;
        }
        throw zzgrq.m28819c();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: s */
    public final int mo25282s() {
        return m26750L();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: t */
    public final long mo25283t() {
        return m26751M();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: u */
    public final long mo25284u() {
        return m26752N();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: v */
    public final long mo25285v() {
        return m26751M();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: w */
    public final long mo25286w() {
        return vt3.m27353f(m26752N());
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: x */
    public final long mo25287x() {
        return m26752N();
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: y */
    public final mt3 mo25288y() {
        int m26750L = m26750L();
        int i11 = this.f28542h;
        int i12 = this.f28544j;
        if (m26750L <= i11 - i12 && m26750L > 0) {
            mt3 m24727J = mt3.m24727J(this.f28541g, i12, m26750L);
            this.f28544j += m26750L;
            return m24727J;
        }
        if (m26750L != 0) {
            byte[] m26746I = m26746I(m26750L);
            if (m26746I != null) {
                return mt3.m24726I(m26746I);
            }
            int i13 = this.f28544j;
            int i14 = this.f28542h;
            int i15 = i14 - i13;
            this.f28546l += i14;
            this.f28544j = 0;
            this.f28542h = 0;
            List<byte[]> m26741D = m26741D(m26750L - i15);
            byte[] bArr = new byte[m26750L];
            System.arraycopy(this.f28541g, i13, bArr, 0, i15);
            for (byte[] bArr2 : m26741D) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i15, length);
                i15 += length;
            }
            return mt3.m24730M(bArr);
        }
        return mt3.f24751q;
    }

    @Override // com.google.android.gms.internal.ads.vt3
    /* renamed from: z */
    public final String mo25289z() {
        int m26750L = m26750L();
        if (m26750L > 0) {
            int i11 = this.f28542h;
            int i12 = this.f28544j;
            if (m26750L <= i11 - i12) {
                String str = new String(this.f28541g, i12, m26750L, dv3.f19426b);
                this.f28544j += m26750L;
                return str;
            }
        }
        if (m26750L == 0) {
            return "";
        }
        if (m26750L <= this.f28542h) {
            m26743F(m26750L);
            String str2 = new String(this.f28541g, this.f28544j, m26750L, dv3.f19426b);
            this.f28544j += m26750L;
            return str2;
        }
        return new String(m26745H(m26750L, false), dv3.f19426b);
    }
}
