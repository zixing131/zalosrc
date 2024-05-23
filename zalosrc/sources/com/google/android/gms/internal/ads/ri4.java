package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class ri4 extends oi4 {

    /* renamed from: A */
    private final int f27230A;

    /* renamed from: B */
    private final boolean f27231B;

    /* renamed from: C */
    private final int f27232C;

    /* renamed from: D */
    private final boolean f27233D;

    /* renamed from: E */
    private final boolean f27234E;

    /* renamed from: F */
    private final int f27235F;

    /* renamed from: t */
    private final boolean f27236t;

    /* renamed from: u */
    private final ai4 f27237u;

    /* renamed from: v */
    private final boolean f27238v;

    /* renamed from: w */
    private final boolean f27239w;

    /* renamed from: x */
    private final int f27240x;

    /* renamed from: y */
    private final int f27241y;

    /* renamed from: z */
    private final int f27242z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ri4(int i11, jt0 jt0Var, int i12, ai4 ai4Var, int i13, int i14, boolean z11) {
        super(i11, jt0Var, i12);
        int i15;
        boolean z12;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        String str;
        int i17;
        char c11;
        ai4 ai4Var2;
        boolean z16;
        C4671k3 c4671k3;
        int i18;
        int i19;
        float f11;
        int i21;
        this.f27237u = ai4Var;
        int i22 = 1;
        if (true != ai4Var.f17072F) {
            i15 = 16;
        } else {
            i15 = 24;
        }
        if (z11) {
            C4671k3 c4671k32 = this.f25656s;
            int i23 = c4671k32.f23104q;
            float f12 = c4671k32.f23106s;
            if (f12 == -1.0f || f12 <= 2.1474836E9f) {
                z12 = true;
                this.f27236t = z12;
                if (z11 && (((i18 = (c4671k3 = this.f25656s).f23104q) == -1 || i18 >= 0) && ((i19 = c4671k3.f23105r) == -1 || i19 >= 0))) {
                    f11 = c4671k3.f23106s;
                    if ((f11 != -1.0f || f11 >= 0.0f) && ((i21 = c4671k3.f23095h) == -1 || i21 >= 0)) {
                        z13 = true;
                        this.f27238v = z13;
                        this.f27239w = si4.m26330r(i13, false);
                        C4671k3 c4671k33 = this.f25656s;
                        this.f27240x = c4671k33.f23095h;
                        this.f27241y = c4671k33.m23808a();
                        int i24 = this.f25656s.f23092e;
                        this.f27230A = Integer.bitCount(0);
                        int i25 = this.f25656s.f23092e;
                        this.f27231B = true;
                        i16 = 0;
                        while (true) {
                            if (i16 >= ai4Var.f24921l.size()) {
                                String str2 = this.f25656s.f23099l;
                                if (str2 != null && str2.equals(ai4Var.f24921l.get(i16))) {
                                    break;
                                } else {
                                    i16++;
                                }
                            } else {
                                i16 = Integer.MAX_VALUE;
                                break;
                            }
                        }
                        this.f27242z = i16;
                        if ((i13 & 128) != 128) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        this.f27233D = z14;
                        if ((i13 & 64) != 64) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f27234E = z15;
                        C4671k3 c4671k34 = this.f25656s;
                        str = c4671k34.f23099l;
                        if (str != null) {
                            i17 = 3;
                            switch (str.hashCode()) {
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        c11 = 3;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            if (c11 != 0) {
                                if (c11 != 1) {
                                    if (c11 != 2) {
                                        if (c11 == 3) {
                                            i17 = 1;
                                        }
                                    } else {
                                        i17 = 2;
                                    }
                                }
                            } else {
                                i17 = 4;
                            }
                            this.f27235F = i17;
                            ai4Var2 = this.f27237u;
                            if (!si4.m26330r(i13, ai4Var2.f17080N) || (!(z16 = this.f27236t) && !ai4Var2.f17070D)) {
                                i22 = 0;
                            } else if (si4.m26330r(i13, false) && this.f27238v && z16 && c4671k34.f23095h != -1 && (i15 & i13) != 0) {
                                i22 = 2;
                            }
                            this.f27232C = i22;
                        }
                        i17 = 0;
                        this.f27235F = i17;
                        ai4Var2 = this.f27237u;
                        if (!si4.m26330r(i13, ai4Var2.f17080N)) {
                            if (si4.m26330r(i13, false)) {
                                i22 = 2;
                            }
                            this.f27232C = i22;
                        }
                        i22 = 0;
                        this.f27232C = i22;
                    }
                }
                z13 = false;
                this.f27238v = z13;
                this.f27239w = si4.m26330r(i13, false);
                C4671k3 c4671k332 = this.f25656s;
                this.f27240x = c4671k332.f23095h;
                this.f27241y = c4671k332.m23808a();
                int i242 = this.f25656s.f23092e;
                this.f27230A = Integer.bitCount(0);
                int i252 = this.f25656s.f23092e;
                this.f27231B = true;
                i16 = 0;
                while (true) {
                    if (i16 >= ai4Var.f24921l.size()) {
                    }
                    i16++;
                }
                this.f27242z = i16;
                if ((i13 & 128) != 128) {
                }
                this.f27233D = z14;
                if ((i13 & 64) != 64) {
                }
                this.f27234E = z15;
                C4671k3 c4671k342 = this.f25656s;
                str = c4671k342.f23099l;
                if (str != null) {
                }
                i17 = 0;
                this.f27235F = i17;
                ai4Var2 = this.f27237u;
                if (!si4.m26330r(i13, ai4Var2.f17080N)) {
                }
                i22 = 0;
                this.f27232C = i22;
            }
        }
        z12 = false;
        this.f27236t = z12;
        if (z11) {
            f11 = c4671k3.f23106s;
            if (f11 != -1.0f) {
            }
            z13 = true;
            this.f27238v = z13;
            this.f27239w = si4.m26330r(i13, false);
            C4671k3 c4671k3322 = this.f25656s;
            this.f27240x = c4671k3322.f23095h;
            this.f27241y = c4671k3322.m23808a();
            int i2422 = this.f25656s.f23092e;
            this.f27230A = Integer.bitCount(0);
            int i2522 = this.f25656s.f23092e;
            this.f27231B = true;
            i16 = 0;
            while (true) {
                if (i16 >= ai4Var.f24921l.size()) {
                }
                i16++;
            }
            this.f27242z = i16;
            if ((i13 & 128) != 128) {
            }
            this.f27233D = z14;
            if ((i13 & 64) != 64) {
            }
            this.f27234E = z15;
            C4671k3 c4671k3422 = this.f25656s;
            str = c4671k3422.f23099l;
            if (str != null) {
            }
            i17 = 0;
            this.f27235F = i17;
            ai4Var2 = this.f27237u;
            if (!si4.m26330r(i13, ai4Var2.f17080N)) {
            }
            i22 = 0;
            this.f27232C = i22;
        }
        z13 = false;
        this.f27238v = z13;
        this.f27239w = si4.m26330r(i13, false);
        C4671k3 c4671k33222 = this.f25656s;
        this.f27240x = c4671k33222.f23095h;
        this.f27241y = c4671k33222.m23808a();
        int i24222 = this.f25656s.f23092e;
        this.f27230A = Integer.bitCount(0);
        int i25222 = this.f25656s.f23092e;
        this.f27231B = true;
        i16 = 0;
        while (true) {
            if (i16 >= ai4Var.f24921l.size()) {
            }
            i16++;
        }
        this.f27242z = i16;
        if ((i13 & 128) != 128) {
        }
        this.f27233D = z14;
        if ((i13 & 64) != 64) {
        }
        this.f27234E = z15;
        C4671k3 c4671k34222 = this.f25656s;
        str = c4671k34222.f23099l;
        if (str != null) {
        }
        i17 = 0;
        this.f27235F = i17;
        ai4Var2 = this.f27237u;
        if (!si4.m26330r(i13, ai4Var2.f17080N)) {
        }
        i22 = 0;
        this.f27232C = i22;
    }

    /* renamed from: d */
    public static /* synthetic */ int m26081d(ri4 ri4Var, ri4 ri4Var2) {
        j93 j93Var;
        j93 mo22746a;
        j93 j93Var2;
        if (!ri4Var.f27236t || !ri4Var.f27239w) {
            j93Var = si4.f27707k;
            mo22746a = j93Var.mo22746a();
        } else {
            mo22746a = si4.f27707k;
        }
        r73 m25988i = r73.m25988i();
        Integer valueOf = Integer.valueOf(ri4Var.f27240x);
        Integer valueOf2 = Integer.valueOf(ri4Var2.f27240x);
        boolean z11 = ri4Var.f27237u.f24932w;
        j93Var2 = si4.f27708l;
        return m25988i.mo25416c(valueOf, valueOf2, j93Var2).mo25416c(Integer.valueOf(ri4Var.f27241y), Integer.valueOf(ri4Var2.f27241y), mo22746a).mo25416c(Integer.valueOf(ri4Var.f27240x), Integer.valueOf(ri4Var2.f27240x), mo22746a).mo25414a();
    }

    /* renamed from: e */
    public static /* synthetic */ int m26082e(ri4 ri4Var, ri4 ri4Var2) {
        r73 mo25416c = r73.m25988i().mo25417d(ri4Var.f27239w, ri4Var2.f27239w).mo25415b(ri4Var.f27230A, ri4Var2.f27230A).mo25417d(true, true).mo25417d(ri4Var.f27236t, ri4Var2.f27236t).mo25417d(ri4Var.f27238v, ri4Var2.f27238v).mo25416c(Integer.valueOf(ri4Var.f27242z), Integer.valueOf(ri4Var2.f27242z), j93.m23576c().mo22746a());
        boolean z11 = ri4Var.f27233D;
        r73 mo25417d = mo25416c.mo25417d(z11, ri4Var2.f27233D);
        boolean z12 = ri4Var.f27234E;
        r73 mo25417d2 = mo25417d.mo25417d(z12, ri4Var2.f27234E);
        if (z11 && z12) {
            mo25417d2 = mo25417d2.mo25415b(ri4Var.f27235F, ri4Var2.f27235F);
        }
        return mo25417d2.mo25414a();
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: b */
    public final int mo24607b() {
        return this.f27232C;
    }

    @Override // com.google.android.gms.internal.ads.oi4
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo24608c(oi4 oi4Var) {
        ri4 ri4Var = (ri4) oi4Var;
        if (g92.m22362t(this.f25656s.f23099l, ri4Var.f25656s.f23099l)) {
            boolean z11 = this.f27237u.f17073G;
            if (this.f27233D == ri4Var.f27233D && this.f27234E == ri4Var.f27234E) {
                return true;
            }
            return false;
        }
        return false;
    }
}
