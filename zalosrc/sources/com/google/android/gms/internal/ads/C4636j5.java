package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.j5 */
/* loaded from: classes2.dex */
public final class C4636j5 implements InterfaceC4822o5 {

    /* renamed from: v */
    private static final byte[] f22636v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f22637a;

    /* renamed from: b */
    private final wz1 f22638b = new wz1(new byte[7], 7);

    /* renamed from: c */
    private final x02 f22639c = new x02(Arrays.copyOf(f22636v, 10));

    /* renamed from: d */
    private final String f22640d;

    /* renamed from: e */
    private String f22641e;

    /* renamed from: f */
    private InterfaceC4928r f22642f;

    /* renamed from: g */
    private InterfaceC4928r f22643g;

    /* renamed from: h */
    private int f22644h;

    /* renamed from: i */
    private int f22645i;

    /* renamed from: j */
    private int f22646j;

    /* renamed from: k */
    private boolean f22647k;

    /* renamed from: l */
    private boolean f22648l;

    /* renamed from: m */
    private int f22649m;

    /* renamed from: n */
    private int f22650n;

    /* renamed from: o */
    private int f22651o;

    /* renamed from: p */
    private boolean f22652p;

    /* renamed from: q */
    private long f22653q;

    /* renamed from: r */
    private int f22654r;

    /* renamed from: s */
    private long f22655s;

    /* renamed from: t */
    private InterfaceC4928r f22656t;

    /* renamed from: u */
    private long f22657u;

    public C4636j5(boolean z11, String str) {
        m23523f();
        this.f22649m = -1;
        this.f22650n = -1;
        this.f22653q = -9223372036854775807L;
        this.f22655s = -9223372036854775807L;
        this.f22637a = z11;
        this.f22640d = str;
    }

    /* renamed from: d */
    public static boolean m23521d(int i11) {
        return (i11 & 65526) == 65520;
    }

    /* renamed from: e */
    private final void m23522e() {
        this.f22648l = false;
        m23523f();
    }

    /* renamed from: f */
    private final void m23523f() {
        this.f22644h = 0;
        this.f22645i = 0;
        this.f22646j = 256;
    }

    /* renamed from: g */
    private final void m23524g() {
        this.f22644h = 3;
        this.f22645i = 0;
    }

    /* renamed from: h */
    private final void m23525h(InterfaceC4928r interfaceC4928r, long j11, int i11, int i12) {
        this.f22644h = 4;
        this.f22645i = i11;
        this.f22656t = interfaceC4928r;
        this.f22657u = j11;
        this.f22654r = i12;
    }

    /* renamed from: i */
    private final boolean m23526i(x02 x02Var, byte[] bArr, int i11) {
        int min = Math.min(x02Var.m27778i(), i11 - this.f22645i);
        x02Var.m27771b(bArr, this.f22645i, min);
        int i12 = this.f22645i + min;
        this.f22645i = i12;
        if (i12 == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static final boolean m23527j(byte b11, byte b12) {
        return m23521d((b12 & 255) | 65280);
    }

    /* renamed from: k */
    private static final boolean m23528k(x02 x02Var, byte[] bArr, int i11) {
        if (x02Var.m27778i() < i11) {
            return false;
        }
        x02Var.m27771b(bArr, 0, i11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20009a(x02 x02Var) {
        int i11;
        int i12;
        int i13;
        byte b11;
        int i14;
        int i15;
        boolean z11;
        this.f22642f.getClass();
        int i16 = g92.f20474a;
        while (x02Var.m27778i() > 0) {
            int i17 = this.f22644h;
            int i18 = 13;
            int i19 = 2;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            int min = Math.min(x02Var.m27778i(), this.f22654r - this.f22645i);
                            this.f22656t.mo23301e(x02Var, min);
                            int i21 = this.f22645i + min;
                            this.f22645i = i21;
                            int i22 = this.f22654r;
                            if (i21 == i22) {
                                long j11 = this.f22655s;
                                if (j11 != -9223372036854775807L) {
                                    this.f22656t.mo23302f(j11, 1, i22, 0, null);
                                    this.f22655s += this.f22657u;
                                }
                                m23523f();
                            }
                        } else {
                            if (true != this.f22647k) {
                                i11 = 5;
                            } else {
                                i11 = 7;
                            }
                            if (m23526i(x02Var, this.f22638b.f30280a, i11)) {
                                this.f22638b.m27751h(0);
                                if (!this.f22652p) {
                                    int m27746c = this.f22638b.m27746c(2) + 1;
                                    if (m27746c != 2) {
                                        lr1.m24356e("AdtsReader", "Detected audio object type: " + m27746c + ", but assuming AAC LC.");
                                    }
                                    this.f22638b.m27753j(5);
                                    int m27746c2 = this.f22638b.m27746c(3);
                                    int i23 = this.f22650n;
                                    byte[] bArr = {(byte) (((i23 >> 1) & 7) | 16), (byte) (((m27746c2 << 3) & 120) | ((i23 << 7) & 128))};
                                    fl4 m22466a = gl4.m22466a(bArr);
                                    C5004t1 c5004t1 = new C5004t1();
                                    c5004t1.m26511h(this.f22641e);
                                    c5004t1.m26523s("audio/mp4a-latm");
                                    c5004t1.m26508f0(m22466a.f20188c);
                                    c5004t1.m26506e0(m22466a.f20187b);
                                    c5004t1.m26524t(m22466a.f20186a);
                                    c5004t1.m26513i(Collections.singletonList(bArr));
                                    c5004t1.m26515k(this.f22640d);
                                    C4671k3 m26529y = c5004t1.m26529y();
                                    this.f22653q = 1024000000 / m26529y.f23113z;
                                    this.f22642f.mo23300d(m26529y);
                                    this.f22652p = true;
                                } else {
                                    this.f22638b.m27753j(10);
                                }
                                this.f22638b.m27753j(4);
                                int m27746c3 = this.f22638b.m27746c(13);
                                int i24 = m27746c3 - 7;
                                if (this.f22647k) {
                                    i12 = m27746c3 - 9;
                                } else {
                                    i12 = i24;
                                }
                                m23525h(this.f22642f, this.f22653q, 0, i12);
                            }
                        }
                    } else if (m23526i(x02Var, this.f22639c.m27777h(), 10)) {
                        this.f22643g.mo23301e(this.f22639c, 10);
                        this.f22639c.m27775f(6);
                        m23525h(this.f22643g, 0L, 10, 10 + this.f22639c.m27787r());
                    }
                } else if (x02Var.m27778i() != 0) {
                    wz1 wz1Var = this.f22638b;
                    wz1Var.f30280a[0] = x02Var.m27777h()[x02Var.m27780k()];
                    wz1Var.m27751h(2);
                    int m27746c4 = this.f22638b.m27746c(4);
                    int i25 = this.f22650n;
                    if (i25 != -1 && m27746c4 != i25) {
                        m23522e();
                    } else {
                        if (!this.f22648l) {
                            this.f22648l = true;
                            this.f22649m = this.f22651o;
                            this.f22650n = m27746c4;
                        }
                        m23524g();
                    }
                }
            } else {
                byte[] m27777h = x02Var.m27777h();
                int m27780k = x02Var.m27780k();
                int m27781l = x02Var.m27781l();
                while (true) {
                    if (m27780k < m27781l) {
                        i13 = m27780k + 1;
                        b11 = m27777h[m27780k];
                        int i26 = b11 & 255;
                        if (this.f22646j == 512 && m23527j((byte) -1, (byte) i26)) {
                            if (!this.f22648l) {
                                int i27 = m27780k - 1;
                                x02Var.m27775f(m27780k);
                                if (m23528k(x02Var, this.f22638b.f30280a, 1)) {
                                    this.f22638b.m27751h(4);
                                    int m27746c5 = this.f22638b.m27746c(1);
                                    int i28 = this.f22649m;
                                    if (i28 == -1 || m27746c5 == i28) {
                                        if (this.f22650n != -1) {
                                            if (!m23528k(x02Var, this.f22638b.f30280a, 1)) {
                                                break;
                                            }
                                            this.f22638b.m27751h(i19);
                                            if (this.f22638b.m27746c(4) == this.f22650n) {
                                                x02Var.m27775f(m27780k + 1);
                                            }
                                        }
                                        if (!m23528k(x02Var, this.f22638b.f30280a, 4)) {
                                            break;
                                        }
                                        this.f22638b.m27751h(14);
                                        int m27746c6 = this.f22638b.m27746c(i18);
                                        if (m27746c6 >= 7) {
                                            byte[] m27777h2 = x02Var.m27777h();
                                            int m27781l2 = x02Var.m27781l();
                                            int i29 = i27 + m27746c6;
                                            if (i29 < m27781l2) {
                                                byte b12 = m27777h2[i29];
                                                if (b12 == -1) {
                                                    int i31 = i29 + 1;
                                                    if (i31 == m27781l2) {
                                                        break;
                                                    }
                                                    byte b13 = m27777h2[i31];
                                                    if (m23527j((byte) -1, b13) && ((b13 & 8) >> 3) == m27746c5) {
                                                        break;
                                                    }
                                                } else if (b12 == 73) {
                                                    int i32 = i29 + 1;
                                                    if (i32 == m27781l2) {
                                                        break;
                                                    }
                                                    if (m27777h2[i32] == 68) {
                                                        int i33 = i29 + 2;
                                                        if (i33 == m27781l2) {
                                                            break;
                                                        } else if (m27777h2[i33] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        int i34 = this.f22646j;
                                        i14 = i34 | i26;
                                        if (i14 == 329) {
                                            if (i14 != 511) {
                                                if (i14 != 836) {
                                                    if (i14 != 1075) {
                                                        if (i34 != 256) {
                                                            this.f22646j = 256;
                                                            i18 = 13;
                                                            i19 = 2;
                                                        } else {
                                                            m27780k = i13;
                                                            i18 = 13;
                                                            i19 = 2;
                                                        }
                                                    } else {
                                                        this.f22644h = 2;
                                                        this.f22645i = 3;
                                                        this.f22654r = 0;
                                                        this.f22639c.m27775f(0);
                                                        x02Var.m27775f(i13);
                                                        break;
                                                    }
                                                } else {
                                                    i15 = 1024;
                                                }
                                            } else {
                                                i15 = 512;
                                            }
                                        } else {
                                            i15 = 768;
                                        }
                                        this.f22646j = i15;
                                        m27780k = i13;
                                        i18 = 13;
                                        i19 = 2;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i342 = this.f22646j;
                        i14 = i342 | i26;
                        if (i14 == 329) {
                        }
                        this.f22646j = i15;
                        m27780k = i13;
                        i18 = 13;
                        i19 = 2;
                    } else {
                        x02Var.m27775f(m27780k);
                        break;
                    }
                }
                this.f22651o = (b11 & 8) >> 3;
                if (1 != ((b11 & 1) ^ 1)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.f22647k = z11;
                if (!this.f22648l) {
                    this.f22644h = 1;
                    this.f22645i = 0;
                } else {
                    m23524g();
                }
                x02Var.m27775f(i13);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        this.f22641e = c4344b7.m20419b();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 1);
        this.f22642f = mo21604i;
        this.f22656t = mo21604i;
        if (this.f22637a) {
            c4344b7.m20420c();
            InterfaceC4928r mo21604i2 = mm4Var.mo21604i(c4344b7.m20418a(), 5);
            this.f22643g = mo21604i2;
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26511h(c4344b7.m20419b());
            c5004t1.m26523s("application/id3");
            mo21604i2.mo23300d(c5004t1.m26529y());
            return;
        }
        this.f22643g = new im4();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if (j11 != -9223372036854775807L) {
            this.f22655s = j11;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f22655s = -9223372036854775807L;
        m23522e();
    }
}
