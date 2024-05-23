package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ug4 implements InterfaceC4928r {

    /* renamed from: A */
    private boolean f28868A;

    /* renamed from: B */
    private boolean f28869B;

    /* renamed from: C */
    private kc4 f28870C;

    /* renamed from: a */
    private final og4 f28871a;

    /* renamed from: d */
    private final jc4 f28874d;

    /* renamed from: e */
    private final dc4 f28875e;

    /* renamed from: f */
    private tg4 f28876f;

    /* renamed from: g */
    private C4671k3 f28877g;

    /* renamed from: o */
    private int f28885o;

    /* renamed from: p */
    private int f28886p;

    /* renamed from: q */
    private int f28887q;

    /* renamed from: r */
    private int f28888r;

    /* renamed from: v */
    private boolean f28892v;

    /* renamed from: y */
    private C4671k3 f28895y;

    /* renamed from: z */
    private C4671k3 f28896z;

    /* renamed from: b */
    private final qg4 f28872b = new qg4();

    /* renamed from: h */
    private int f28878h = 1000;

    /* renamed from: i */
    private int[] f28879i = new int[1000];

    /* renamed from: j */
    private long[] f28880j = new long[1000];

    /* renamed from: m */
    private long[] f28883m = new long[1000];

    /* renamed from: l */
    private int[] f28882l = new int[1000];

    /* renamed from: k */
    private int[] f28881k = new int[1000];

    /* renamed from: n */
    private C4891q[] f28884n = new C4891q[1000];

    /* renamed from: c */
    private final bh4 f28873c = new bh4(new zb1() { // from class: com.google.android.gms.internal.ads.pg4
    });

    /* renamed from: s */
    private long f28889s = Long.MIN_VALUE;

    /* renamed from: t */
    private long f28890t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f28891u = Long.MIN_VALUE;

    /* renamed from: x */
    private boolean f28894x = true;

    /* renamed from: w */
    private boolean f28893w = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public ug4(jj4 jj4Var, jc4 jc4Var, dc4 dc4Var, byte[] bArr) {
        this.f28874d = jc4Var;
        this.f28875e = dc4Var;
        this.f28871a = new og4(jj4Var, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static /* synthetic */ void m26929A(sg4 sg4Var) {
        ic4 ic4Var = sg4Var.f27674b;
        int i11 = hc4.f21634a;
    }

    /* renamed from: L */
    private final int m26930L(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.f28883m[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.f28882l[i11] & 1) != 0) {
                i13 = i14;
                if (j12 == j11) {
                    break;
                }
            }
            i11++;
            if (i11 == this.f28878h) {
                i11 = 0;
            }
        }
        return i13;
    }

    /* renamed from: g */
    private final int m26931g(int i11) {
        int i12 = this.f28887q + i11;
        int i13 = this.f28878h;
        return i12 < i13 ? i12 : i12 - i13;
    }

    /* renamed from: h */
    private final synchronized int m26932h(h34 h34Var, il3 il3Var, boolean z11, boolean z12, qg4 qg4Var) {
        try {
            il3Var.f22218d = false;
            if (!m26940p()) {
                if (!z12 && !this.f28892v) {
                    C4671k3 c4671k3 = this.f28896z;
                    if (c4671k3 == null || (!z11 && c4671k3 == this.f28877g)) {
                        return -3;
                    }
                    m26937m(c4671k3, h34Var);
                    return -5;
                }
                il3Var.m22005c(4);
                return -4;
            }
            C4671k3 c4671k32 = ((sg4) this.f28873c.m20518a(this.f28886p + this.f28888r)).f27673a;
            if (!z11 && c4671k32 == this.f28877g) {
                int m26931g = m26931g(this.f28888r);
                if (!m26941q(m26931g)) {
                    il3Var.f22218d = true;
                    return -3;
                }
                il3Var.m22005c(this.f28882l[m26931g]);
                long j11 = this.f28883m[m26931g];
                il3Var.f22219e = j11;
                if (j11 < this.f28889s) {
                    il3Var.m22004a(Integer.MIN_VALUE);
                }
                qg4Var.f26773a = this.f28881k[m26931g];
                qg4Var.f26774b = this.f28880j[m26931g];
                qg4Var.f26775c = this.f28884n[m26931g];
                return -4;
            }
            m26937m(c4671k32, h34Var);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    private final synchronized long m26933i(long j11, boolean z11, boolean z12) {
        int i11;
        try {
            int i12 = this.f28885o;
            if (i12 != 0) {
                long[] jArr = this.f28883m;
                int i13 = this.f28887q;
                if (j11 >= jArr[i13]) {
                    if (z12 && (i11 = this.f28888r) != i12) {
                        i12 = i11 + 1;
                    }
                    int m26930L = m26930L(i13, i12, j11, false);
                    if (m26930L == -1) {
                        return -1L;
                    }
                    return m26935k(m26930L);
                }
            }
            return -1L;
        } finally {
        }
    }

    /* renamed from: j */
    private final synchronized long m26934j() {
        int i11 = this.f28885o;
        if (i11 == 0) {
            return -1L;
        }
        return m26935k(i11);
    }

    /* renamed from: k */
    private final long m26935k(int i11) {
        long j11 = this.f28890t;
        long j12 = Long.MIN_VALUE;
        if (i11 != 0) {
            int m26931g = m26931g(i11 - 1);
            for (int i12 = 0; i12 < i11; i12++) {
                j12 = Math.max(j12, this.f28883m[m26931g]);
                if ((this.f28882l[m26931g] & 1) != 0) {
                    break;
                }
                m26931g--;
                if (m26931g == -1) {
                    m26931g = this.f28878h - 1;
                }
            }
        }
        this.f28890t = Math.max(j11, j12);
        this.f28885o -= i11;
        int i13 = this.f28886p + i11;
        this.f28886p = i13;
        int i14 = this.f28887q + i11;
        this.f28887q = i14;
        int i15 = this.f28878h;
        if (i14 >= i15) {
            this.f28887q = i14 - i15;
        }
        int i16 = this.f28888r - i11;
        this.f28888r = i16;
        if (i16 < 0) {
            this.f28888r = 0;
        }
        this.f28873c.m20522e(i13);
        if (this.f28885o == 0) {
            int i17 = this.f28887q;
            if (i17 == 0) {
                i17 = this.f28878h;
            }
            return this.f28880j[i17 - 1] + this.f28881k[r12];
        }
        return this.f28880j[this.f28887q];
    }

    /* renamed from: l */
    private final synchronized void m26936l(long j11, int i11, long j12, int i12, C4891q c4891q) {
        boolean z11;
        boolean z12;
        try {
            int i13 = this.f28885o;
            if (i13 > 0) {
                if (this.f28880j[m26931g(i13 - 1)] + this.f28881k[r0] <= j12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                v71.m27173d(z12);
            }
            if ((536870912 & i11) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f28892v = z11;
            this.f28891u = Math.max(this.f28891u, j11);
            int m26931g = m26931g(this.f28885o);
            this.f28883m[m26931g] = j11;
            this.f28880j[m26931g] = j12;
            this.f28881k[m26931g] = i12;
            this.f28882l[m26931g] = i11;
            this.f28884n[m26931g] = c4891q;
            this.f28879i[m26931g] = 0;
            if (this.f28873c.m20523f() || !((sg4) this.f28873c.m20519b()).f27673a.equals(this.f28896z)) {
                ic4 ic4Var = ic4.f22142a;
                bh4 bh4Var = this.f28873c;
                int i14 = this.f28886p + this.f28885o;
                C4671k3 c4671k3 = this.f28896z;
                c4671k3.getClass();
                bh4Var.m20520c(i14, new sg4(c4671k3, ic4Var, null));
            }
            int i15 = this.f28885o + 1;
            this.f28885o = i15;
            int i16 = this.f28878h;
            if (i15 == i16) {
                int i17 = i16 + 1000;
                int[] iArr = new int[i17];
                long[] jArr = new long[i17];
                long[] jArr2 = new long[i17];
                int[] iArr2 = new int[i17];
                int[] iArr3 = new int[i17];
                C4891q[] c4891qArr = new C4891q[i17];
                int i18 = this.f28887q;
                int i19 = i16 - i18;
                System.arraycopy(this.f28880j, i18, jArr, 0, i19);
                System.arraycopy(this.f28883m, this.f28887q, jArr2, 0, i19);
                System.arraycopy(this.f28882l, this.f28887q, iArr2, 0, i19);
                System.arraycopy(this.f28881k, this.f28887q, iArr3, 0, i19);
                System.arraycopy(this.f28884n, this.f28887q, c4891qArr, 0, i19);
                System.arraycopy(this.f28879i, this.f28887q, iArr, 0, i19);
                int i21 = this.f28887q;
                System.arraycopy(this.f28880j, 0, jArr, i19, i21);
                System.arraycopy(this.f28883m, 0, jArr2, i19, i21);
                System.arraycopy(this.f28882l, 0, iArr2, i19, i21);
                System.arraycopy(this.f28881k, 0, iArr3, i19, i21);
                System.arraycopy(this.f28884n, 0, c4891qArr, i19, i21);
                System.arraycopy(this.f28879i, 0, iArr, i19, i21);
                this.f28880j = jArr;
                this.f28883m = jArr2;
                this.f28882l = iArr2;
                this.f28881k = iArr3;
                this.f28884n = c4891qArr;
                this.f28879i = iArr;
                this.f28887q = 0;
                this.f28878h = i17;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: m */
    private final void m26937m(C4671k3 c4671k3, h34 h34Var) {
        zzx zzxVar;
        C4671k3 c4671k32 = this.f28877g;
        kc4 kc4Var = null;
        if (c4671k32 == null) {
            zzxVar = null;
        } else {
            zzxVar = c4671k32.f23102o;
        }
        this.f28877g = c4671k3;
        zzx zzxVar2 = c4671k3.f23102o;
        h34Var.f21525a = c4671k3.m23810c(this.f28874d.mo21985b(c4671k3));
        h34Var.f21526b = this.f28870C;
        if (c4671k32 != null && g92.m22362t(zzxVar, zzxVar2)) {
            return;
        }
        if (c4671k3.f23102o != null) {
            kc4Var = new kc4(new zzpi(new zzpt(1), 6001));
        }
        this.f28870C = kc4Var;
        h34Var.f21526b = kc4Var;
    }

    /* renamed from: n */
    private final void m26938n() {
        if (this.f28870C != null) {
            this.f28870C = null;
            this.f28877g = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m26939o() {
        this.f28888r = 0;
        this.f28871a.m25193g();
    }

    /* renamed from: p */
    private final boolean m26940p() {
        return this.f28888r != this.f28885o;
    }

    /* renamed from: q */
    private final boolean m26941q(int i11) {
        if (this.f28870C != null) {
            return (this.f28882l[i11] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m26942r(C4671k3 c4671k3) {
        try {
            this.f28894x = false;
            if (g92.m22362t(c4671k3, this.f28896z)) {
                return false;
            }
            if (!this.f28873c.m20523f() && ((sg4) this.f28873c.m20519b()).f27673a.equals(c4671k3)) {
                this.f28896z = ((sg4) this.f28873c.m20519b()).f27673a;
            } else {
                this.f28896z = c4671k3;
            }
            C4671k3 c4671k32 = this.f28896z;
            this.f28868A = k70.m23848f(c4671k32.f23099l, c4671k32.f23096i);
            this.f28869B = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: B */
    public final void m26943B() {
        kc4 kc4Var = this.f28870C;
        if (kc4Var == null) {
        } else {
            throw kc4Var.m23887a();
        }
    }

    /* renamed from: C */
    public final void m26944C() {
        m26960z();
        m26938n();
    }

    /* renamed from: D */
    public final void m26945D() {
        m26946E(true);
        m26938n();
    }

    /* renamed from: E */
    public final void m26946E(boolean z11) {
        this.f28871a.m25192f();
        this.f28885o = 0;
        this.f28886p = 0;
        this.f28887q = 0;
        this.f28888r = 0;
        this.f28893w = true;
        this.f28889s = Long.MIN_VALUE;
        this.f28890t = Long.MIN_VALUE;
        this.f28891u = Long.MIN_VALUE;
        this.f28892v = false;
        this.f28873c.m20521d();
        if (z11) {
            this.f28895y = null;
            this.f28896z = null;
            this.f28894x = true;
        }
    }

    /* renamed from: F */
    public final void m26947F(long j11) {
        this.f28889s = j11;
    }

    /* renamed from: G */
    public final void m26948G(tg4 tg4Var) {
        this.f28876f = tg4Var;
    }

    /* renamed from: H */
    public final synchronized void m26949H(int i11) {
        boolean z11 = false;
        if (i11 >= 0) {
            try {
                if (this.f28888r + i11 <= this.f28885o) {
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v71.m27173d(z11);
        this.f28888r += i11;
    }

    /* renamed from: I */
    public final synchronized boolean m26950I() {
        return this.f28892v;
    }

    /* renamed from: J */
    public final synchronized boolean m26951J(boolean z11) {
        boolean z12 = true;
        if (!m26940p()) {
            if (!z11 && !this.f28892v) {
                C4671k3 c4671k3 = this.f28896z;
                if (c4671k3 != null) {
                    if (c4671k3 == this.f28877g) {
                        return false;
                    }
                } else {
                    z12 = false;
                }
            }
            return z12;
        }
        if (((sg4) this.f28873c.m20518a(this.f28886p + this.f28888r)).f27673a != this.f28877g) {
            return true;
        }
        return m26941q(m26931g(this.f28888r));
    }

    /* renamed from: K */
    public final synchronized boolean m26952K(long j11, boolean z11) {
        m26939o();
        int i11 = this.f28888r;
        int m26931g = m26931g(i11);
        if (!m26940p() || j11 < this.f28883m[m26931g] || (j11 > this.f28891u && !z11)) {
            return false;
        }
        int m26930L = m26930L(m26931g, this.f28885o - i11, j11, true);
        if (m26930L == -1) {
            return false;
        }
        this.f28889s = j11;
        this.f28888r += m26930L;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: a */
    public final /* synthetic */ int mo23297a(td4 td4Var, int i11, boolean z11) {
        return AbstractC4853p.m25365a(this, td4Var, i11, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: b */
    public final int mo23298b(td4 td4Var, int i11, boolean z11, int i12) {
        return this.f28871a.m25187a(td4Var, i11, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: c */
    public final void mo23299c(x02 x02Var, int i11, int i12) {
        this.f28871a.m25194h(x02Var, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: d */
    public final void mo23300d(C4671k3 c4671k3) {
        this.f28895y = c4671k3;
        boolean m26942r = m26942r(c4671k3);
        tg4 tg4Var = this.f28876f;
        if (tg4Var != null && m26942r) {
            tg4Var.mo22847h(c4671k3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: e */
    public final /* synthetic */ void mo23301e(x02 x02Var, int i11) {
        AbstractC4853p.m25366b(this, x02Var, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4928r
    /* renamed from: f */
    public final void mo23302f(long j11, int i11, int i12, int i13, C4891q c4891q) {
        int i14 = i11 & 1;
        if (this.f28893w) {
            if (i14 == 0) {
                return;
            } else {
                this.f28893w = false;
            }
        }
        if (this.f28868A) {
            if (j11 < this.f28889s) {
                return;
            }
            if (i14 == 0) {
                if (!this.f28869B) {
                    lr1.m24356e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f28896z)));
                    this.f28869B = true;
                }
                i11 |= 1;
            }
        }
        m26936l(j11, i11, (this.f28871a.m25188b() - i12) - i13, i12, c4891q);
    }

    /* renamed from: s */
    public final int m26953s() {
        return this.f28886p + this.f28888r;
    }

    /* renamed from: t */
    public final synchronized int m26954t(long j11, boolean z11) {
        int i11 = this.f28888r;
        int m26931g = m26931g(i11);
        if (m26940p() && j11 >= this.f28883m[m26931g]) {
            if (j11 > this.f28891u && z11) {
                return this.f28885o - i11;
            }
            int m26930L = m26930L(m26931g, this.f28885o - i11, j11, true);
            if (m26930L == -1) {
                return 0;
            }
            return m26930L;
        }
        return 0;
    }

    /* renamed from: u */
    public final int m26955u() {
        return this.f28886p + this.f28885o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:            if (r9 != 0) goto L14;     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m26956v(h34 h34Var, il3 il3Var, int i11, boolean z11) {
        boolean z12;
        if ((i11 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        int m26932h = m26932h(h34Var, il3Var, z12, z11, this.f28872b);
        if (m26932h == -4) {
            if (!il3Var.m22009g()) {
                int i12 = i11 & 1;
                if ((i11 & 4) == 0) {
                    if (i12 != 0) {
                        this.f28871a.m25190d(il3Var, this.f28872b);
                    } else {
                        this.f28871a.m25191e(il3Var, this.f28872b);
                        this.f28888r++;
                        return -4;
                    }
                }
            }
            return -4;
        }
        return m26932h;
    }

    /* renamed from: w */
    public final synchronized long m26957w() {
        return this.f28891u;
    }

    /* renamed from: x */
    public final synchronized C4671k3 m26958x() {
        if (this.f28894x) {
            return null;
        }
        return this.f28896z;
    }

    /* renamed from: y */
    public final void m26959y(long j11, boolean z11, boolean z12) {
        this.f28871a.m25189c(m26933i(j11, false, z12));
    }

    /* renamed from: z */
    public final void m26960z() {
        this.f28871a.m25189c(m26934j());
    }
}
