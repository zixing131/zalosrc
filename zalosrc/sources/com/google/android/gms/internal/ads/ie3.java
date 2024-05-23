package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ie3 {

    /* renamed from: a */
    private final pp3 f22159a;

    private ie3(pp3 pp3Var) {
        this.f22159a = pp3Var;
    }

    /* renamed from: e */
    public static ie3 m23234e(String str, byte[] bArr, int i11) {
        int i12;
        op3 m25504F = pp3.m25504F();
        m25504F.m25242q(str);
        m25504F.m25243r(mt3.m24726I(bArr));
        int i13 = i11 - 1;
        if (i13 != 0) {
            if (i13 != 1) {
                i12 = 5;
            } else {
                i12 = 4;
            }
        } else {
            i12 = 3;
        }
        m25504F.m25244s(i12);
        return new ie3((pp3) m25504F.m25898n());
    }

    /* renamed from: a */
    public final pp3 m23235a() {
        return this.f22159a;
    }

    /* renamed from: b */
    public final String m23236b() {
        return this.f22159a.m25511J();
    }

    /* renamed from: c */
    public final byte[] m23237c() {
        return this.f22159a.m25510I().m24738k();
    }

    /* renamed from: d */
    public final int m23238d() {
        int m25512M = this.f22159a.m25512M() - 2;
        int i11 = 1;
        if (m25512M != 1) {
            i11 = 2;
            if (m25512M != 2) {
                i11 = 3;
                if (m25512M != 3) {
                    if (m25512M == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i11;
    }
}
