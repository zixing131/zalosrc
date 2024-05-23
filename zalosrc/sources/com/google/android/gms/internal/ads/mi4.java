package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class mi4 extends oi4 implements Comparable {

    /* renamed from: A */
    private final int f24589A;

    /* renamed from: B */
    private final boolean f24590B;

    /* renamed from: t */
    private final int f24591t;

    /* renamed from: u */
    private final boolean f24592u;

    /* renamed from: v */
    private final boolean f24593v;

    /* renamed from: w */
    private final boolean f24594w;

    /* renamed from: x */
    private final int f24595x;

    /* renamed from: y */
    private final int f24596y;

    /* renamed from: z */
    private final int f24597z;

    public mi4(int i11, jt0 jt0Var, int i12, ai4 ai4Var, int i13, String str) {
        super(i11, jt0Var, i12);
        boolean z11;
        boolean z12;
        c83 c83Var;
        int i14;
        boolean z13;
        boolean z14;
        int i15 = 0;
        this.f24592u = si4.m26330r(i13, false);
        int i16 = this.f25656s.f23091d;
        int i17 = ai4Var.f24930u;
        if (1 != (i16 & 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f24593v = z11;
        if ((i16 & 2) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f24594w = z12;
        if (ai4Var.f24928s.isEmpty()) {
            c83Var = c83.m20833x("");
        } else {
            c83Var = ai4Var.f24928s;
        }
        int i18 = 0;
        while (true) {
            if (i18 < c83Var.size()) {
                i14 = si4.m26324j(this.f25656s, (String) c83Var.get(i18), false);
                if (i14 > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                i18 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.f24595x = i18;
        this.f24596y = i14;
        int i19 = this.f25656s.f23092e;
        int bitCount = Integer.bitCount(0);
        this.f24597z = bitCount;
        int i21 = this.f25656s.f23092e;
        this.f24590B = false;
        if (si4.m26327n(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int m26324j = si4.m26324j(this.f25656s, str, z13);
        this.f24589A = m26324j;
        if (i14 > 0 || ((ai4Var.f24928s.isEmpty() && bitCount > 0) || this.f24593v || (this.f24594w && m26324j > 0))) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (si4.m26330r(i13, ai4Var.f17080N) && z14) {
            i15 = 1;
        }
        this.f24591t = i15;
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: b */
    public final int mo24607b() {
        return this.f24591t;
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo24608c(oi4 oi4Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mi4 mi4Var) {
        j93 mo22746a;
        r73 mo25417d = r73.m25988i().mo25417d(this.f24592u, mi4Var.f24592u).mo25416c(Integer.valueOf(this.f24595x), Integer.valueOf(mi4Var.f24595x), j93.m23576c().mo22746a()).mo25415b(this.f24596y, mi4Var.f24596y).mo25415b(this.f24597z, mi4Var.f24597z).mo25417d(this.f24593v, mi4Var.f24593v);
        Boolean valueOf = Boolean.valueOf(this.f24594w);
        Boolean valueOf2 = Boolean.valueOf(mi4Var.f24594w);
        if (this.f24596y == 0) {
            mo22746a = j93.m23576c();
        } else {
            mo22746a = j93.m23576c().mo22746a();
        }
        r73 mo25415b = mo25417d.mo25416c(valueOf, valueOf2, mo22746a).mo25415b(this.f24589A, mi4Var.f24589A);
        if (this.f24597z == 0) {
            mo25415b = mo25415b.mo25418e(false, false);
        }
        return mo25415b.mo25414a();
    }
}
