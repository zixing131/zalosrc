package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class ul4 {

    /* renamed from: a */
    protected final ol4 f28976a;

    /* renamed from: b */
    protected final tl4 f28977b;

    /* renamed from: c */
    protected ql4 f28978c;

    /* renamed from: d */
    private final int f28979d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ul4(rl4 rl4Var, tl4 tl4Var, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        this.f28977b = tl4Var;
        this.f28979d = i11;
        this.f28976a = new ol4(rl4Var, j11, 0L, j13, j14, j15, j16);
    }

    /* renamed from: f */
    protected static final int m26987f(km4 km4Var, long j11, C4667k c4667k) {
        if (j11 == km4Var.zzf()) {
            return 0;
        }
        c4667k.f23035a = j11;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m26988g(km4 km4Var, long j11) {
        long zzf = j11 - km4Var.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((yl4) km4Var).m28248l((int) zzf, false);
        return true;
    }

    /* renamed from: a */
    public final int m26989a(km4 km4Var, C4667k c4667k) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i11;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j21;
        long j22;
        while (true) {
            ql4 ql4Var = this.f28978c;
            v71.m27171b(ql4Var);
            j11 = ql4Var.f26859f;
            j12 = ql4Var.f26860g;
            j13 = ql4Var.f26861h;
            if (j12 - j11 <= this.f28979d) {
                m26991c(false, j11);
                return m26987f(km4Var, j11, c4667k);
            }
            if (!m26988g(km4Var, j13)) {
                return m26987f(km4Var, j13, c4667k);
            }
            km4Var.zzj();
            tl4 tl4Var = this.f28977b;
            j14 = ql4Var.f26855b;
            sl4 mo22710a = tl4Var.mo22710a(km4Var, j14);
            i11 = mo22710a.f27782a;
            if (i11 != -3) {
                if (i11 == -2) {
                    j21 = mo22710a.f27783b;
                    j22 = mo22710a.f27784c;
                    ql4.m25787h(ql4Var, j21, j22);
                } else {
                    if (i11 != -1) {
                        j15 = mo22710a.f27784c;
                        m26988g(km4Var, j15);
                        j16 = mo22710a.f27784c;
                        m26991c(true, j16);
                        j17 = mo22710a.f27784c;
                        return m26987f(km4Var, j17, c4667k);
                    }
                    j18 = mo22710a.f27783b;
                    j19 = mo22710a.f27784c;
                    ql4.m25786g(ql4Var, j18, j19);
                }
            } else {
                m26991c(false, j13);
                return m26987f(km4Var, j13, c4667k);
            }
        }
    }

    /* renamed from: b */
    public final InterfaceC4779n m26990b() {
        return this.f28976a;
    }

    /* renamed from: c */
    protected final void m26991c(boolean z11, long j11) {
        this.f28978c = null;
        this.f28977b.zzb();
    }

    /* renamed from: d */
    public final void m26992d(long j11) {
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        ql4 ql4Var = this.f28978c;
        if (ql4Var != null) {
            j16 = ql4Var.f26854a;
            if (j16 == j11) {
                return;
            }
        }
        long m25215g = this.f28976a.m25215g(j11);
        ol4 ol4Var = this.f28976a;
        j12 = ol4Var.f25687c;
        j13 = ol4Var.f25688d;
        j14 = ol4Var.f25689e;
        j15 = ol4Var.f25690f;
        this.f28978c = new ql4(j11, m25215g, 0L, j12, j13, j14, j15);
    }

    /* renamed from: e */
    public final boolean m26993e() {
        return this.f28978c != null;
    }
}
