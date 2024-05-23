package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nm */
/* loaded from: classes2.dex */
final class C4802nm {

    /* renamed from: i */
    private int f25253i;

    /* renamed from: j */
    private int f25254j;

    /* renamed from: k */
    private int f25255k;

    /* renamed from: l */
    private int f25256l;

    /* renamed from: q */
    private zzasw f25261q;

    /* renamed from: a */
    private int f25245a = 1000;

    /* renamed from: b */
    private int[] f25246b = new int[1000];

    /* renamed from: c */
    private long[] f25247c = new long[1000];

    /* renamed from: f */
    private long[] f25250f = new long[1000];

    /* renamed from: e */
    private int[] f25249e = new int[1000];

    /* renamed from: d */
    private int[] f25248d = new int[1000];

    /* renamed from: g */
    private C4948rj[] f25251g = new C4948rj[1000];

    /* renamed from: h */
    private zzasw[] f25252h = new zzasw[1000];

    /* renamed from: m */
    private long f25257m = Long.MIN_VALUE;

    /* renamed from: n */
    private long f25258n = Long.MIN_VALUE;

    /* renamed from: p */
    private boolean f25260p = true;

    /* renamed from: o */
    private boolean f25259o = true;

    /* renamed from: a */
    public final int m24948a() {
        return this.f25254j + this.f25253i;
    }

    /* renamed from: b */
    public final synchronized int m24949b(C4648jh c4648jh, C4392cj c4392cj, boolean z11, boolean z12, zzasw zzaswVar, C4765mm c4765mm) {
        long j11;
        if (!m24959l()) {
            if (z12) {
                c4392cj.m26968c(4);
                return -4;
            }
            zzasw zzaswVar2 = this.f25261q;
            if (zzaswVar2 == null || (!z11 && zzaswVar2 == zzaswVar)) {
                return -3;
            }
            c4648jh.f22819a = zzaswVar2;
            return -5;
        }
        if (!z11) {
            zzasw[] zzaswVarArr = this.f25252h;
            int i11 = this.f25255k;
            if (zzaswVarArr[i11] == zzaswVar) {
                if (c4392cj.f18447c == null) {
                    return -3;
                }
                c4392cj.f18448d = this.f25250f[i11];
                c4392cj.m26968c(this.f25249e[i11]);
                int[] iArr = this.f25248d;
                int i12 = this.f25255k;
                c4765mm.f24649a = iArr[i12];
                c4765mm.f24650b = this.f25247c[i12];
                c4765mm.f24652d = this.f25251g[i12];
                this.f25257m = Math.max(this.f25257m, c4392cj.f18448d);
                int i13 = this.f25253i - 1;
                this.f25253i = i13;
                int i14 = this.f25255k + 1;
                this.f25255k = i14;
                this.f25254j++;
                if (i14 == this.f25245a) {
                    i14 = 0;
                    this.f25255k = 0;
                }
                if (i13 > 0) {
                    j11 = this.f25247c[i14];
                } else {
                    j11 = c4765mm.f24650b + c4765mm.f24649a;
                }
                c4765mm.f24651c = j11;
                return -4;
            }
        }
        c4648jh.f22819a = this.f25252h[this.f25255k];
        return -5;
    }

    /* renamed from: c */
    public final synchronized long m24950c() {
        return Math.max(this.f25257m, this.f25258n);
    }

    /* renamed from: d */
    public final synchronized long m24951d() {
        if (!m24959l()) {
            return -1L;
        }
        int i11 = this.f25255k;
        int i12 = this.f25253i;
        int i13 = i11 + i12;
        int i14 = this.f25245a;
        int i15 = (i13 - 1) % i14;
        this.f25255k = i13 % i14;
        this.f25254j += i12;
        this.f25253i = 0;
        return this.f25247c[i15] + this.f25248d[i15];
    }

    /* renamed from: e */
    public final synchronized long m24952e(long j11, boolean z11) {
        if (m24959l()) {
            long[] jArr = this.f25250f;
            int i11 = this.f25255k;
            if (j11 >= jArr[i11]) {
                int i12 = 0;
                if (j11 > this.f25258n && !z11) {
                    return -1L;
                }
                int i13 = -1;
                while (i11 != this.f25256l && this.f25250f[i11] <= j11) {
                    if (1 == (this.f25249e[i11] & 1)) {
                        i13 = i12;
                    }
                    i11 = (i11 + 1) % this.f25245a;
                    i12++;
                }
                if (i13 == -1) {
                    return -1L;
                }
                int i14 = (this.f25255k + i13) % this.f25245a;
                this.f25255k = i14;
                this.f25254j += i13;
                this.f25253i -= i13;
                return this.f25247c[i14];
            }
        }
        return -1L;
    }

    /* renamed from: f */
    public final synchronized zzasw m24953f() {
        if (this.f25260p) {
            return null;
        }
        return this.f25261q;
    }

    /* renamed from: g */
    public final void m24954g() {
        this.f25254j = 0;
        this.f25255k = 0;
        this.f25256l = 0;
        this.f25253i = 0;
        this.f25259o = true;
    }

    /* renamed from: h */
    public final synchronized void m24955h(long j11, int i11, long j12, int i12, C4948rj c4948rj) {
        try {
            if (this.f25259o) {
                if ((i11 & 1) == 0) {
                    return;
                } else {
                    this.f25259o = false;
                }
            }
            AbstractC4361bo.m20613e(!this.f25260p);
            m24956i(j11);
            long[] jArr = this.f25250f;
            int i13 = this.f25256l;
            jArr[i13] = j11;
            long[] jArr2 = this.f25247c;
            jArr2[i13] = j12;
            this.f25248d[i13] = i12;
            this.f25249e[i13] = i11;
            this.f25251g[i13] = c4948rj;
            this.f25252h[i13] = this.f25261q;
            this.f25246b[i13] = 0;
            int i14 = this.f25253i + 1;
            this.f25253i = i14;
            int i15 = this.f25245a;
            if (i14 == i15) {
                int i16 = i15 + 1000;
                int[] iArr = new int[i16];
                long[] jArr3 = new long[i16];
                long[] jArr4 = new long[i16];
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                C4948rj[] c4948rjArr = new C4948rj[i16];
                zzasw[] zzaswVarArr = new zzasw[i16];
                int i17 = this.f25255k;
                int i18 = i15 - i17;
                System.arraycopy(jArr2, i17, jArr3, 0, i18);
                System.arraycopy(this.f25250f, this.f25255k, jArr4, 0, i18);
                System.arraycopy(this.f25249e, this.f25255k, iArr2, 0, i18);
                System.arraycopy(this.f25248d, this.f25255k, iArr3, 0, i18);
                System.arraycopy(this.f25251g, this.f25255k, c4948rjArr, 0, i18);
                System.arraycopy(this.f25252h, this.f25255k, zzaswVarArr, 0, i18);
                System.arraycopy(this.f25246b, this.f25255k, iArr, 0, i18);
                int i19 = this.f25255k;
                System.arraycopy(this.f25247c, 0, jArr3, i18, i19);
                System.arraycopy(this.f25250f, 0, jArr4, i18, i19);
                System.arraycopy(this.f25249e, 0, iArr2, i18, i19);
                System.arraycopy(this.f25248d, 0, iArr3, i18, i19);
                System.arraycopy(this.f25251g, 0, c4948rjArr, i18, i19);
                System.arraycopy(this.f25252h, 0, zzaswVarArr, i18, i19);
                System.arraycopy(this.f25246b, 0, iArr, i18, i19);
                this.f25247c = jArr3;
                this.f25250f = jArr4;
                this.f25249e = iArr2;
                this.f25248d = iArr3;
                this.f25251g = c4948rjArr;
                this.f25252h = zzaswVarArr;
                this.f25246b = iArr;
                this.f25255k = 0;
                int i21 = this.f25245a;
                this.f25256l = i21;
                this.f25253i = i21;
                this.f25245a = i16;
                return;
            }
            int i22 = i13 + 1;
            this.f25256l = i22;
            if (i22 == i15) {
                this.f25256l = 0;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public final synchronized void m24956i(long j11) {
        this.f25258n = Math.max(this.f25258n, j11);
    }

    /* renamed from: j */
    public final void m24957j() {
        this.f25257m = Long.MIN_VALUE;
        this.f25258n = Long.MIN_VALUE;
    }

    /* renamed from: k */
    public final synchronized boolean m24958k(zzasw zzaswVar) {
        if (zzaswVar == null) {
            this.f25260p = true;
            return false;
        }
        this.f25260p = false;
        if (AbstractC4916qo.m25839o(zzaswVar, this.f25261q)) {
            return false;
        }
        this.f25261q = zzaswVar;
        return true;
    }

    /* renamed from: l */
    public final synchronized boolean m24959l() {
        return this.f25253i != 0;
    }
}
