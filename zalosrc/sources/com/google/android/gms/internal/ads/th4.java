package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
final class th4 extends oi4 implements Comparable {

    /* renamed from: A */
    private final int f28345A;

    /* renamed from: B */
    private final boolean f28346B;

    /* renamed from: C */
    private final int f28347C;

    /* renamed from: D */
    private final int f28348D;

    /* renamed from: E */
    private final boolean f28349E;

    /* renamed from: F */
    private final int f28350F;

    /* renamed from: G */
    private final int f28351G;

    /* renamed from: H */
    private final int f28352H;

    /* renamed from: I */
    private final int f28353I;

    /* renamed from: J */
    private final boolean f28354J;

    /* renamed from: K */
    private final boolean f28355K;

    /* renamed from: t */
    private final int f28356t;

    /* renamed from: u */
    private final boolean f28357u;

    /* renamed from: v */
    private final String f28358v;

    /* renamed from: w */
    private final ai4 f28359w;

    /* renamed from: x */
    private final boolean f28360x;

    /* renamed from: y */
    private final int f28361y;

    /* renamed from: z */
    private final int f28362z;

    public th4(int i11, jt0 jt0Var, int i12, ai4 ai4Var, int i13, boolean z11, k53 k53Var) {
        super(i11, jt0Var, i12);
        int i14;
        int i15;
        boolean z12;
        int i16;
        boolean z13;
        boolean z14;
        boolean z15;
        this.f28359w = ai4Var;
        this.f28358v = si4.m26327n(this.f25656s.f23090c);
        int i17 = 0;
        this.f28360x = si4.m26330r(i13, false);
        int i18 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i18 < ai4Var.f24923n.size()) {
                i15 = si4.m26324j(this.f25656s, (String) ai4Var.f24923n.get(i18), false);
                if (i15 > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                i18 = Integer.MAX_VALUE;
                i15 = 0;
                break;
            }
        }
        this.f28362z = i18;
        this.f28361y = i15;
        int i19 = this.f25656s.f23092e;
        this.f28345A = Integer.bitCount(0);
        C4671k3 c4671k3 = this.f25656s;
        int i21 = c4671k3.f23092e;
        this.f28346B = true;
        if (1 != (c4671k3.f23091d & 1)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f28349E = z12;
        this.f28350F = c4671k3.f23112y;
        this.f28351G = c4671k3.f23113z;
        this.f28352H = c4671k3.f23095h;
        this.f28357u = k53Var.zza(c4671k3);
        String[] m22313G = g92.m22313G();
        int i22 = 0;
        while (true) {
            if (i22 < m22313G.length) {
                i16 = si4.m26324j(this.f25656s, m22313G[i22], false);
                if (i16 > 0) {
                    break;
                } else {
                    i22++;
                }
            } else {
                i22 = Integer.MAX_VALUE;
                i16 = 0;
                break;
            }
        }
        this.f28347C = i22;
        this.f28348D = i16;
        int i23 = 0;
        while (true) {
            if (i23 < ai4Var.f24927r.size()) {
                String str = this.f25656s.f23099l;
                if (str != null && str.equals(ai4Var.f24927r.get(i23))) {
                    i14 = i23;
                    break;
                }
                i23++;
            } else {
                break;
            }
        }
        this.f28353I = i14;
        if ((i13 & 128) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f28354J = z13;
        if ((i13 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f28355K = z14;
        ai4 ai4Var2 = this.f28359w;
        if (si4.m26330r(i13, ai4Var2.f17080N) && ((z15 = this.f28357u) || ai4Var2.f17074H)) {
            i17 = (!si4.m26330r(i13, false) || !z15 || this.f25656s.f23095h == -1 || (!ai4Var2.f17082P && z11)) ? 1 : 2;
        }
        this.f28356t = i17;
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: b */
    public final int mo24607b() {
        return this.f28356t;
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo24608c(oi4 oi4Var) {
        String str;
        th4 th4Var = (th4) oi4Var;
        boolean z11 = this.f28359w.f17077K;
        C4671k3 c4671k3 = this.f25656s;
        int i11 = c4671k3.f23112y;
        if (i11 != -1) {
            C4671k3 c4671k32 = th4Var.f25656s;
            if (i11 == c4671k32.f23112y && (str = c4671k3.f23099l) != null && TextUtils.equals(str, c4671k32.f23099l)) {
                boolean z12 = this.f28359w.f17076J;
                int i12 = this.f25656s.f23113z;
                if (i12 != -1 && i12 == th4Var.f25656s.f23113z && this.f28354J == th4Var.f28354J && this.f28355K == th4Var.f28355K) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(th4 th4Var) {
        j93 j93Var;
        j93 mo22746a;
        j93 j93Var2;
        if (!this.f28357u || !this.f28360x) {
            j93Var = si4.f27707k;
            mo22746a = j93Var.mo22746a();
        } else {
            mo22746a = si4.f27707k;
        }
        r73 mo25416c = r73.m25988i().mo25417d(this.f28360x, th4Var.f28360x).mo25416c(Integer.valueOf(this.f28362z), Integer.valueOf(th4Var.f28362z), j93.m23576c().mo22746a()).mo25415b(this.f28361y, th4Var.f28361y).mo25415b(this.f28345A, th4Var.f28345A).mo25417d(this.f28349E, th4Var.f28349E).mo25417d(true, true).mo25416c(Integer.valueOf(this.f28347C), Integer.valueOf(th4Var.f28347C), j93.m23576c().mo22746a()).mo25415b(this.f28348D, th4Var.f28348D).mo25417d(this.f28357u, th4Var.f28357u).mo25416c(Integer.valueOf(this.f28353I), Integer.valueOf(th4Var.f28353I), j93.m23576c().mo22746a());
        Integer valueOf = Integer.valueOf(this.f28352H);
        Integer valueOf2 = Integer.valueOf(th4Var.f28352H);
        boolean z11 = this.f28359w.f24932w;
        j93Var2 = si4.f27708l;
        r73 mo25416c2 = mo25416c.mo25416c(valueOf, valueOf2, j93Var2).mo25417d(this.f28354J, th4Var.f28354J).mo25417d(this.f28355K, th4Var.f28355K).mo25416c(Integer.valueOf(this.f28350F), Integer.valueOf(th4Var.f28350F), mo22746a).mo25416c(Integer.valueOf(this.f28351G), Integer.valueOf(th4Var.f28351G), mo22746a);
        Integer valueOf3 = Integer.valueOf(this.f28352H);
        Integer valueOf4 = Integer.valueOf(th4Var.f28352H);
        if (!g92.m22362t(this.f28358v, th4Var.f28358v)) {
            mo22746a = si4.f27708l;
        }
        return mo25416c2.mo25416c(valueOf3, valueOf4, mo22746a).mo25414a();
    }
}
