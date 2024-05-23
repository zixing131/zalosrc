package com.google.android.gms.internal.ads;

import java.util.Stack;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vj */
/* loaded from: classes2.dex */
public final class C5096vj {

    /* renamed from: a */
    private final byte[] f29342a = new byte[8];

    /* renamed from: b */
    private final Stack f29343b = new Stack();

    /* renamed from: c */
    private final C4430dk f29344c = new C4430dk();

    /* renamed from: d */
    private int f29345d;

    /* renamed from: e */
    private int f29346e;

    /* renamed from: f */
    private long f29347f;

    /* renamed from: g */
    private C5208yj f29348g;

    /* renamed from: d */
    private final long m27227d(C4577hj c4577hj, int i11) {
        c4577hj.m22921h(this.f29342a, 0, i11, false);
        long j11 = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = (j11 << 8) | (this.f29342a[i12] & 255);
        }
        return j11;
    }

    /* renamed from: a */
    public final void m27228a() {
        this.f29345d = 0;
        this.f29343b.clear();
        this.f29344c.m21430d();
    }

    /* renamed from: b */
    public final void m27229b(C5208yj c5208yj) {
        this.f29348g = c5208yj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x008b, code lost:            if (r0 == 1) goto L112;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m27230c(C4577hj c4577hj) {
        boolean z11;
        String str;
        double longBitsToDouble;
        int m21427b;
        int m21428c;
        long j11;
        int i11;
        if (this.f29348g != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        while (true) {
            if (!this.f29343b.isEmpty()) {
                long m22917d = c4577hj.m22917d();
                j11 = ((C5059uj) this.f29343b.peek()).f28954b;
                if (m22917d >= j11) {
                    C5208yj c5208yj = this.f29348g;
                    i11 = ((C5059uj) this.f29343b.pop()).f28953a;
                    c5208yj.f30965a.m20547f(i11);
                    return true;
                }
            }
            int i12 = this.f29345d;
            if (i12 == 0) {
                long m21431e = this.f29344c.m21431e(c4577hj, true, false, 4);
                if (m21431e == -2) {
                    c4577hj.m22918e();
                    while (true) {
                        c4577hj.m22920g(this.f29342a, 0, 4, false);
                        m21427b = C4430dk.m21427b(this.f29342a[0]);
                        if (m21427b != -1 && m21427b <= 4) {
                            m21428c = (int) C4430dk.m21428c(this.f29342a, m21427b, false);
                            C4357bk c4357bk = this.f29348g.f30965a;
                            if (C4357bk.m20535m(m21428c)) {
                                break;
                            }
                        }
                        c4577hj.m22922i(1, false);
                    }
                    c4577hj.m22922i(m21427b, false);
                    m21431e = m21428c;
                }
                if (m21431e == -1) {
                    return false;
                }
                this.f29346e = (int) m21431e;
                this.f29345d = 1;
            }
            this.f29347f = this.f29344c.m21431e(c4577hj, false, true, 8);
            this.f29345d = 2;
            C5208yj c5208yj2 = this.f29348g;
            int i13 = this.f29346e;
            C4357bk c4357bk2 = c5208yj2.f30965a;
            int m20534l = C4357bk.m20534l(i13);
            if (m20534l != 0) {
                if (m20534l != 1) {
                    if (m20534l != 2) {
                        if (m20534l != 3) {
                            if (m20534l != 4) {
                                long j12 = this.f29347f;
                                if (j12 != 4 && j12 != 8) {
                                    throw new zzasz("Invalid float size: " + j12);
                                }
                                int i14 = (int) j12;
                                long m27227d = m27227d(c4577hj, i14);
                                if (i14 == 4) {
                                    longBitsToDouble = Float.intBitsToFloat((int) m27227d);
                                } else {
                                    longBitsToDouble = Double.longBitsToDouble(m27227d);
                                }
                                c5208yj2.f30965a.m20548g(i13, longBitsToDouble);
                                this.f29345d = 0;
                                return true;
                            }
                            c4357bk2.m20552k(i13, (int) this.f29347f, c4577hj);
                            this.f29345d = 0;
                            return true;
                        }
                        long j13 = this.f29347f;
                        if (j13 <= 2147483647L) {
                            int i15 = (int) j13;
                            if (i15 == 0) {
                                str = "";
                            } else {
                                byte[] bArr = new byte[i15];
                                c4577hj.m22921h(bArr, 0, i15, false);
                                str = new String(bArr);
                            }
                            c5208yj2.f30965a.m20551j(i13, str);
                            this.f29345d = 0;
                            return true;
                        }
                        throw new zzasz("String element size: " + j13);
                    }
                    long j14 = this.f29347f;
                    if (j14 <= 8) {
                        c5208yj2.f30965a.m20549h(i13, m27227d(c4577hj, (int) j14));
                        this.f29345d = 0;
                        return true;
                    }
                    throw new zzasz("Invalid integer size: " + j14);
                }
                long m22917d2 = c4577hj.m22917d();
                this.f29343b.add(new C5059uj(i13, this.f29347f + m22917d2, null));
                this.f29348g.f30965a.m20550i(this.f29346e, m22917d2, this.f29347f);
                this.f29345d = 0;
                return true;
            }
            c4577hj.m22922i((int) this.f29347f, false);
            this.f29345d = 0;
        }
    }
}
