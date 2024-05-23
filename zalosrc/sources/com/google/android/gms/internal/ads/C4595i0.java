package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.i0 */
/* loaded from: classes2.dex */
public final class C4595i0 {

    /* renamed from: a */
    protected final InterfaceC4928r f21977a;

    /* renamed from: b */
    private final int f21978b;

    /* renamed from: c */
    private final int f21979c;

    /* renamed from: d */
    private final long f21980d;

    /* renamed from: e */
    private final int f21981e;

    /* renamed from: f */
    private int f21982f;

    /* renamed from: g */
    private int f21983g;

    /* renamed from: h */
    private int f21984h;

    /* renamed from: i */
    private int f21985i;

    /* renamed from: j */
    private int f21986j;

    /* renamed from: k */
    private long[] f21987k;

    /* renamed from: l */
    private int[] f21988l;

    public C4595i0(int i11, int i12, long j11, int i13, InterfaceC4928r interfaceC4928r) {
        i12 = i12 != 1 ? 2 : i12;
        this.f21980d = j11;
        this.f21981e = i13;
        this.f21977a = interfaceC4928r;
        this.f21978b = m23085i(i11, i12 == 2 ? 1667497984 : 1651965952);
        this.f21979c = i12 == 2 ? m23085i(i11, 1650720768) : -1;
        this.f21987k = new long[512];
        this.f21988l = new int[512];
    }

    /* renamed from: i */
    private static int m23085i(int i11, int i12) {
        return ((i11 / 10) + 48) | (((i11 % 10) + 48) << 8) | i12;
    }

    /* renamed from: j */
    private final long m23086j(int i11) {
        return (this.f21980d * i11) / this.f21981e;
    }

    /* renamed from: k */
    private final C4816o m23087k(int i11) {
        return new C4816o(this.f21988l[i11] * m23086j(1), this.f21987k[i11]);
    }

    /* renamed from: a */
    public final C4704l m23088a(long j11) {
        int m23086j = (int) (j11 / m23086j(1));
        int m22319M = g92.m22319M(this.f21988l, m23086j, true, true);
        if (this.f21988l[m22319M] == m23086j) {
            C4816o m23087k = m23087k(m22319M);
            return new C4704l(m23087k, m23087k);
        }
        C4816o m23087k2 = m23087k(m22319M);
        int i11 = m22319M + 1;
        if (i11 < this.f21987k.length) {
            return new C4704l(m23087k2, m23087k(i11));
        }
        return new C4704l(m23087k2, m23087k2);
    }

    /* renamed from: b */
    public final void m23089b(long j11) {
        if (this.f21986j == this.f21988l.length) {
            long[] jArr = this.f21987k;
            this.f21987k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f21988l;
            this.f21988l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f21987k;
        int i11 = this.f21986j;
        jArr2[i11] = j11;
        this.f21988l[i11] = this.f21985i;
        this.f21986j = i11 + 1;
    }

    /* renamed from: c */
    public final void m23090c() {
        this.f21987k = Arrays.copyOf(this.f21987k, this.f21986j);
        this.f21988l = Arrays.copyOf(this.f21988l, this.f21986j);
    }

    /* renamed from: d */
    public final void m23091d() {
        this.f21985i++;
    }

    /* renamed from: e */
    public final void m23092e(int i11) {
        this.f21982f = i11;
        this.f21983g = i11;
    }

    /* renamed from: f */
    public final void m23093f(long j11) {
        if (this.f21986j == 0) {
            this.f21984h = 0;
        } else {
            this.f21984h = this.f21988l[g92.m22320N(this.f21987k, j11, true, true)];
        }
    }

    /* renamed from: g */
    public final boolean m23094g(int i11) {
        return this.f21978b == i11 || this.f21979c == i11;
    }

    /* renamed from: h */
    public final boolean m23095h(km4 km4Var) {
        boolean z11;
        int i11;
        int i12 = this.f21983g;
        int mo23297a = i12 - this.f21977a.mo23297a(km4Var, i12, false);
        this.f21983g = mo23297a;
        if (mo23297a == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f21982f > 0) {
                InterfaceC4928r interfaceC4928r = this.f21977a;
                long m23086j = m23086j(this.f21984h);
                if (Arrays.binarySearch(this.f21988l, this.f21984h) >= 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                interfaceC4928r.mo23302f(m23086j, i11, this.f21982f, 0, null);
            }
            this.f21984h++;
        }
        return z11;
    }
}
