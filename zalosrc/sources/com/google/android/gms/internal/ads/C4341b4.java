package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.b4 */
/* loaded from: classes2.dex */
public final class C4341b4 implements jm4, InterfaceC4779n {

    /* renamed from: x */
    public static final qm4 f17528x = new qm4() { // from class: com.google.android.gms.internal.ads.y3
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4341b4(0)};
        }
    };

    /* renamed from: i */
    private int f17537i;

    /* renamed from: j */
    private long f17538j;

    /* renamed from: k */
    private int f17539k;

    /* renamed from: l */
    private x02 f17540l;

    /* renamed from: n */
    private int f17542n;

    /* renamed from: o */
    private int f17543o;

    /* renamed from: p */
    private int f17544p;

    /* renamed from: s */
    private long[][] f17547s;

    /* renamed from: t */
    private int f17548t;

    /* renamed from: u */
    private long f17549u;

    /* renamed from: v */
    private int f17550v;

    /* renamed from: w */
    private zzadt f17551w;

    /* renamed from: h */
    private int f17536h = 0;

    /* renamed from: f */
    private final C4451e4 f17534f = new C4451e4();

    /* renamed from: g */
    private final List f17535g = new ArrayList();

    /* renamed from: d */
    private final x02 f17532d = new x02(16);

    /* renamed from: e */
    private final ArrayDeque f17533e = new ArrayDeque();

    /* renamed from: a */
    private final x02 f17529a = new x02(AbstractC4557h.f21470a);

    /* renamed from: b */
    private final x02 f17530b = new x02(4);

    /* renamed from: c */
    private final x02 f17531c = new x02();

    /* renamed from: m */
    private int f17541m = -1;

    /* renamed from: q */
    private mm4 f17545q = mm4.f24668c;

    /* renamed from: r */
    private C4304a4[] f17546r = new C4304a4[0];

    public C4341b4(int i11) {
    }

    /* renamed from: g */
    private static int m20388g(int i11) {
        if (i11 != 1751476579) {
            return i11 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: h */
    private static int m20389h(C4635j4 c4635j4, long j11) {
        int m23513a = c4635j4.m23513a(j11);
        if (m23513a == -1) {
            return c4635j4.m23514b(j11);
        }
        return m23513a;
    }

    /* renamed from: i */
    private static long m20390i(C4635j4 c4635j4, long j11, long j12) {
        int m20389h = m20389h(c4635j4, j11);
        if (m20389h == -1) {
            return j12;
        }
        return Math.min(c4635j4.f22621c[m20389h], j12);
    }

    /* renamed from: j */
    private final void m20391j() {
        this.f17536h = 0;
        this.f17539k = 0;
    }

    /* renamed from: k */
    private final void m20392k(long j11) {
        C4341b4 c4341b4;
        boolean z11;
        zzbq zzbqVar;
        zzbq zzbqVar2;
        zzbq zzbqVar3;
        long j12;
        List list;
        int i11;
        int i12;
        zzbq zzbqVar4;
        long j13;
        ArrayList arrayList;
        int i13;
        C4341b4 c4341b42 = this;
        while (!c4341b42.f17533e.isEmpty() && ((C4487f3) c4341b42.f17533e.peek()).f19943b == j11) {
            C4487f3 c4487f3 = (C4487f3) c4341b42.f17533e.pop();
            if (c4487f3.f21515a == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                if (c4341b42.f17550v == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ym4 ym4Var = new ym4();
                C4524g3 m21871d = c4487f3.m21871d(1969517665);
                if (m21871d != null) {
                    Pair m25634a = AbstractC4895q3.m25634a(m21871d);
                    zzbq zzbqVar5 = (zzbq) m25634a.first;
                    zzbq zzbqVar6 = (zzbq) m25634a.second;
                    if (zzbqVar5 != null) {
                        ym4Var.m28269b(zzbqVar5);
                    }
                    zzbqVar = zzbqVar6;
                    zzbqVar2 = zzbqVar5;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                C4487f3 m21870c = c4487f3.m21870c(1835365473);
                if (m21870c != null) {
                    zzbqVar3 = AbstractC4895q3.m25635b(m21870c);
                } else {
                    zzbqVar3 = null;
                }
                zzbq zzbqVar7 = zzbqVar3;
                List m25636c = AbstractC4895q3.m25636c(c4487f3, ym4Var, -9223372036854775807L, null, false, z11, new y43() { // from class: com.google.android.gms.internal.ads.z3
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj) {
                        C4525g4 c4525g4 = (C4525g4) obj;
                        qm4 qm4Var = C4341b4.f17528x;
                        return c4525g4;
                    }
                });
                int size = m25636c.size();
                long j14 = -9223372036854775807L;
                long j15 = -9223372036854775807L;
                int i14 = 0;
                int i15 = -1;
                while (true) {
                    j12 = 0;
                    if (i14 >= size) {
                        break;
                    }
                    C4635j4 c4635j4 = (C4635j4) m25636c.get(i14);
                    if (c4635j4.f22620b == 0) {
                        list = m25636c;
                        i11 = size;
                        arrayList = arrayList2;
                        j13 = j14;
                    } else {
                        C4525g4 c4525g4 = c4635j4.f22619a;
                        list = m25636c;
                        long j16 = c4525g4.f20391e;
                        if (j16 == j14) {
                            j16 = c4635j4.f22626h;
                        }
                        long max = Math.max(j15, j16);
                        i11 = size;
                        C4304a4 c4304a4 = new C4304a4(c4525g4, c4635j4, c4341b42.f17545q.mo21604i(i14, c4525g4.f20388b));
                        if ("audio/true-hd".equals(c4525g4.f20392f.f23099l)) {
                            i12 = c4635j4.f22623e * 16;
                        } else {
                            i12 = c4635j4.f22623e + 30;
                        }
                        C5004t1 m23809b = c4525g4.f20392f.m23809b();
                        m23809b.m26516l(i12);
                        if (c4525g4.f20388b == 2 && j16 > 0 && (i13 = c4635j4.f22620b) > 1) {
                            m23809b.m26505e(i13 / (((float) j16) / 1000000.0f));
                        }
                        int i16 = c4525g4.f20388b;
                        String[] strArr = AbstractC5155x3.f30313a;
                        if (i16 == 1 && ym4Var.m28268a()) {
                            m23809b.m26501c(ym4Var.f31039a);
                            m23809b.m26503d(ym4Var.f31040b);
                        }
                        int i17 = c4525g4.f20388b;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar;
                        if (c4341b42.f17535g.isEmpty()) {
                            zzbqVar4 = null;
                        } else {
                            zzbqVar4 = new zzbq(c4341b42.f17535g);
                        }
                        zzbqVarArr[1] = zzbqVar4;
                        ArrayList arrayList3 = arrayList2;
                        zzbq zzbqVar8 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i17 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar8 = zzbqVar2;
                            }
                        } else if (i17 == 2 && zzbqVar7 != null) {
                            for (int i18 = 0; i18 < zzbqVar7.m28707a(); i18++) {
                                zzbp m28708b = zzbqVar7.m28708b(i18);
                                if (m28708b instanceof zzadq) {
                                    zzadq zzadqVar = (zzadq) m28708b;
                                    if ("com.android.capture.fps".equals(zzadqVar.f31801p)) {
                                        zzbqVar8 = new zzbq(-9223372036854775807L, zzadqVar);
                                        j13 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j13 = -9223372036854775807L;
                        for (int i19 = 0; i19 < 2; i19++) {
                            zzbqVar8 = zzbqVar8.m28710d(zzbqVarArr[i19]);
                        }
                        if (zzbqVar8.m28707a() > 0) {
                            m23809b.m26517m(zzbqVar8);
                        }
                        c4304a4.f16913c.mo23300d(m23809b.m26529y());
                        if (c4525g4.f20388b == 2 && i15 == -1) {
                            i15 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(c4304a4);
                        j15 = max;
                    }
                    i14++;
                    c4341b42 = this;
                    j14 = j13;
                    arrayList2 = arrayList;
                    m25636c = list;
                    size = i11;
                }
                c4341b4 = c4341b42;
                c4341b4.f17548t = i15;
                c4341b4.f17549u = j15;
                C4304a4[] c4304a4Arr = (C4304a4[]) arrayList2.toArray(new C4304a4[0]);
                c4341b4.f17546r = c4304a4Arr;
                int length = c4304a4Arr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i21 = 0; i21 < c4304a4Arr.length; i21++) {
                    jArr[i21] = new long[c4304a4Arr[i21].f16912b.f22620b];
                    jArr2[i21] = c4304a4Arr[i21].f16912b.f22624f[0];
                }
                int i22 = 0;
                while (i22 < c4304a4Arr.length) {
                    long j17 = Long.MAX_VALUE;
                    int i23 = -1;
                    for (int i24 = 0; i24 < c4304a4Arr.length; i24++) {
                        if (!zArr[i24]) {
                            long j18 = jArr2[i24];
                            if (j18 <= j17) {
                                i23 = i24;
                                j17 = j18;
                            }
                        }
                    }
                    int i25 = iArr[i23];
                    long[] jArr3 = jArr[i23];
                    jArr3[i25] = j12;
                    C4635j4 c4635j42 = c4304a4Arr[i23].f16912b;
                    j12 += c4635j42.f22622d[i25];
                    int i26 = i25 + 1;
                    iArr[i23] = i26;
                    if (i26 < jArr3.length) {
                        jArr2[i23] = c4635j42.f22624f[i26];
                    } else {
                        zArr[i23] = true;
                        i22++;
                    }
                }
                c4341b4.f17547s = jArr;
                c4341b4.f17545q.zzC();
                c4341b4.f17545q.mo21603f(c4341b4);
                c4341b4.f17533e.clear();
                c4341b4.f17536h = 2;
            } else {
                c4341b4 = c4341b42;
                if (!c4341b4.f17533e.isEmpty()) {
                    ((C4487f3) c4341b4.f17533e.peek()).m21872e(c4487f3);
                }
            }
            c4341b42 = c4341b4;
        }
        if (c4341b42.f17536h != 2) {
            m20391j();
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return AbstractC4488f4.m21939b(km4Var, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        long j12;
        long j13;
        int m23514b;
        C4304a4[] c4304a4Arr = this.f17546r;
        if (c4304a4Arr.length == 0) {
            C4816o c4816o = C4816o.f25384c;
            return new C4704l(c4816o, c4816o);
        }
        int i11 = this.f17548t;
        long j14 = -1;
        if (i11 != -1) {
            C4635j4 c4635j4 = c4304a4Arr[i11].f16912b;
            int m20389h = m20389h(c4635j4, j11);
            if (m20389h == -1) {
                C4816o c4816o2 = C4816o.f25384c;
                return new C4704l(c4816o2, c4816o2);
            }
            long j15 = c4635j4.f22624f[m20389h];
            j12 = c4635j4.f22621c[m20389h];
            if (j15 < j11 && m20389h < c4635j4.f22620b - 1 && (m23514b = c4635j4.m23514b(j11)) != -1 && m23514b != m20389h) {
                j13 = c4635j4.f22624f[m23514b];
                j14 = c4635j4.f22621c[m23514b];
            } else {
                j13 = -9223372036854775807L;
            }
            j11 = j15;
        } else {
            j12 = Long.MAX_VALUE;
            j13 = -9223372036854775807L;
        }
        int i12 = 0;
        while (true) {
            C4304a4[] c4304a4Arr2 = this.f17546r;
            if (i12 >= c4304a4Arr2.length) {
                break;
            }
            if (i12 != this.f17548t) {
                C4635j4 c4635j42 = c4304a4Arr2[i12].f16912b;
                long m20390i = m20390i(c4635j42, j11, j12);
                if (j13 != -9223372036854775807L) {
                    j14 = m20390i(c4635j42, j13, j14);
                }
                j12 = m20390i;
            }
            i12++;
        }
        C4816o c4816o3 = new C4816o(j11, j12);
        if (j13 == -9223372036854775807L) {
            return new C4704l(c4816o3, c4816o3);
        }
        return new C4704l(c4816o3, new C4816o(j13, j14));
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f17545q = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f17533e.clear();
        this.f17539k = 0;
        this.f17541m = -1;
        this.f17542n = 0;
        this.f17543o = 0;
        this.f17544p = 0;
        if (j11 == 0) {
            m20391j();
            return;
        }
        for (C4304a4 c4304a4 : this.f17546r) {
            C4635j4 c4635j4 = c4304a4.f16912b;
            int m23513a = c4635j4.m23513a(j12);
            if (m23513a == -1) {
                m23513a = c4635j4.m23514b(j12);
            }
            c4304a4.f16915e = m23513a;
            C4965s c4965s = c4304a4.f16914d;
            if (c4965s != null) {
                c4965s.m26214b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x037d, code lost:            r3 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0084 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        while (true) {
            int i11 = this.f17536h;
            if (i11 != 0) {
                if (i11 != 1) {
                    long zzf = km4Var.zzf();
                    int i12 = this.f17541m;
                    if (i12 == -1) {
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        int i13 = 0;
                        int i14 = -1;
                        boolean z15 = true;
                        boolean z16 = true;
                        int i15 = -1;
                        while (true) {
                            C4304a4[] c4304a4Arr = this.f17546r;
                            if (i13 >= c4304a4Arr.length) {
                                break;
                            }
                            C4304a4 c4304a4 = c4304a4Arr[i13];
                            int i16 = c4304a4.f16915e;
                            C4635j4 c4635j4 = c4304a4.f16912b;
                            if (i16 != c4635j4.f22620b) {
                                long j14 = c4635j4.f22621c[i16];
                                long j15 = ((long[][]) g92.m22347h(this.f17547s))[i13][i16];
                                long j16 = j14 - zzf;
                                if (j16 < 0 || j16 >= 262144) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    if (!z16) {
                                        z12 = false;
                                    }
                                    z16 = z11;
                                    i14 = i13;
                                    j12 = j16;
                                    j13 = j15;
                                    if (j15 < j11) {
                                        z15 = z11;
                                        i15 = i13;
                                        j11 = j15;
                                    }
                                } else {
                                    z12 = z16;
                                }
                                if (z11 != z12 || j16 >= j12) {
                                    z16 = z12;
                                    if (j15 < j11) {
                                    }
                                }
                                z16 = z11;
                                i14 = i13;
                                j12 = j16;
                                j13 = j15;
                                if (j15 < j11) {
                                }
                            }
                            i13++;
                        }
                        if (j11 != Long.MAX_VALUE && z15 && j13 >= j11 + 10485760) {
                            i12 = i15;
                        } else {
                            i12 = i14;
                        }
                        this.f17541m = i12;
                        if (i12 == -1) {
                            return -1;
                        }
                    }
                    C4304a4 c4304a42 = this.f17546r[i12];
                    InterfaceC4928r interfaceC4928r = c4304a42.f16913c;
                    int i17 = c4304a42.f16915e;
                    C4635j4 c4635j42 = c4304a42.f16912b;
                    long j17 = c4635j42.f22621c[i17];
                    int i18 = c4635j42.f22622d[i17];
                    C4965s c4965s = c4304a42.f16914d;
                    long j18 = (j17 - zzf) + this.f17542n;
                    if (j18 >= 0 && j18 < 262144) {
                        if (c4304a42.f16911a.f20393g == 1) {
                            j18 += 8;
                            i18 -= 8;
                        }
                        km4Var.mo23967n((int) j18);
                        C4525g4 c4525g4 = c4304a42.f16911a;
                        int i19 = c4525g4.f20396j;
                        if (i19 != 0) {
                            byte[] m27777h = this.f17530b.m27777h();
                            m27777h[0] = 0;
                            m27777h[1] = 0;
                            m27777h[2] = 0;
                            int i21 = 4 - i19;
                            while (this.f17543o < i18) {
                                int i22 = this.f17544p;
                                if (i22 == 0) {
                                    km4Var.mo23965i(m27777h, i21, i19);
                                    this.f17542n += i19;
                                    this.f17530b.m27775f(0);
                                    int m27782m = this.f17530b.m27782m();
                                    if (m27782m >= 0) {
                                        this.f17544p = m27782m;
                                        this.f17529a.m27775f(0);
                                        interfaceC4928r.mo23301e(this.f17529a, 4);
                                        this.f17543o += 4;
                                        i18 += i21;
                                    } else {
                                        throw zzbu.m28711a("Invalid NAL length", null);
                                    }
                                } else {
                                    int mo23297a = interfaceC4928r.mo23297a(km4Var, i22, false);
                                    this.f17542n += mo23297a;
                                    this.f17543o += mo23297a;
                                    this.f17544p -= mo23297a;
                                }
                            }
                        } else {
                            if ("audio/ac4".equals(c4525g4.f20392f.f23099l)) {
                                if (this.f17543o == 0) {
                                    ml4.m24629b(i18, this.f17531c);
                                    interfaceC4928r.mo23301e(this.f17531c, 7);
                                    this.f17543o += 7;
                                }
                                i18 += 7;
                            } else if (c4965s != null) {
                                c4965s.m26216d(km4Var);
                            }
                            while (true) {
                                int i23 = this.f17543o;
                                if (i23 >= i18) {
                                    break;
                                }
                                int mo23297a2 = interfaceC4928r.mo23297a(km4Var, i18 - i23, false);
                                this.f17542n += mo23297a2;
                                this.f17543o += mo23297a2;
                                this.f17544p -= mo23297a2;
                            }
                        }
                        C4635j4 c4635j43 = c4304a42.f16912b;
                        long j19 = c4635j43.f22624f[i17];
                        int i24 = c4635j43.f22625g[i17];
                        if (c4965s != null) {
                            c4965s.m26215c(interfaceC4928r, j19, i24, i18, 0, null);
                            if (i17 + 1 == c4304a42.f16912b.f22620b) {
                                c4965s.m26213a(interfaceC4928r, null);
                            }
                        } else {
                            interfaceC4928r.mo23302f(j19, i24, i18, 0, null);
                        }
                        c4304a42.f16915e++;
                        this.f17541m = -1;
                        this.f17542n = 0;
                        this.f17543o = 0;
                        this.f17544p = 0;
                        return 0;
                    }
                    c4667k.f23035a = j17;
                    return 1;
                }
                long j21 = this.f17538j - this.f17539k;
                long zzf2 = km4Var.zzf() + j21;
                x02 x02Var = this.f17540l;
                if (x02Var != null) {
                    km4Var.mo23965i(x02Var.m27777h(), this.f17539k, (int) j21);
                    if (this.f17537i == 1718909296) {
                        x02Var.m27775f(8);
                        int m20388g = m20388g(x02Var.m27782m());
                        if (m20388g == 0) {
                            x02Var.m27776g(4);
                            while (true) {
                                if (x02Var.m27778i() > 0) {
                                    m20388g = m20388g(x02Var.m27782m());
                                    if (m20388g != 0) {
                                        break;
                                    }
                                } else {
                                    m20388g = 0;
                                    break;
                                }
                            }
                        }
                        this.f17550v = m20388g;
                    } else if (!this.f17533e.isEmpty()) {
                        ((C4487f3) this.f17533e.peek()).m21873f(new C4524g3(this.f17537i, x02Var));
                    }
                } else if (j21 < 262144) {
                    km4Var.mo23967n((int) j21);
                } else {
                    c4667k.f23035a = km4Var.zzf() + j21;
                    z13 = true;
                    m20392k(zzf2);
                    if (z13 && this.f17536h != 2) {
                        return 1;
                    }
                }
                z13 = false;
                m20392k(zzf2);
                if (z13) {
                    return 1;
                }
                continue;
            } else {
                if (this.f17539k == 0) {
                    if (!km4Var.mo23962e(this.f17532d.m27777h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f17539k = 8;
                    this.f17532d.m27775f(0);
                    this.f17538j = this.f17532d.m27762A();
                    this.f17537i = this.f17532d.m27782m();
                }
                long j22 = this.f17538j;
                if (j22 == 1) {
                    km4Var.mo23965i(this.f17532d.m27777h(), 8, 8);
                    this.f17539k += 8;
                    this.f17538j = this.f17532d.m27763B();
                } else if (j22 == 0) {
                    long zzd = km4Var.zzd();
                    if (zzd == -1) {
                        C4487f3 c4487f3 = (C4487f3) this.f17533e.peek();
                        if (c4487f3 != null) {
                            zzd = c4487f3.f19943b;
                        } else {
                            zzd = -1;
                        }
                    }
                    if (zzd != -1) {
                        this.f17538j = (zzd - km4Var.zzf()) + this.f17539k;
                    }
                }
                long j23 = this.f17538j;
                int i25 = this.f17539k;
                if (j23 >= i25) {
                    int i26 = this.f17537i;
                    if (i26 != 1836019574 && i26 != 1953653099 && i26 != 1835297121 && i26 != 1835626086 && i26 != 1937007212 && i26 != 1701082227 && i26 != 1835365473) {
                        if (i26 != 1835296868 && i26 != 1836476516 && i26 != 1751411826 && i26 != 1937011556 && i26 != 1937011827 && i26 != 1937011571 && i26 != 1668576371 && i26 != 1701606260 && i26 != 1937011555 && i26 != 1937011578 && i26 != 1937013298 && i26 != 1937007471 && i26 != 1668232756 && i26 != 1953196132 && i26 != 1718909296 && i26 != 1969517665 && i26 != 1801812339 && i26 != 1768715124) {
                            long zzf3 = km4Var.zzf();
                            long j24 = this.f17539k;
                            long j25 = zzf3 - j24;
                            if (this.f17537i == 1836086884) {
                                this.f17551w = new zzadt(0L, j25, -9223372036854775807L, j25 + j24, this.f17538j - j24);
                            }
                            this.f17540l = null;
                            this.f17536h = 1;
                        } else {
                            boolean z17 = false;
                            v71.m27175f(z17);
                            if (this.f17538j <= 2147483647L) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            v71.m27175f(z14);
                            x02 x02Var2 = new x02((int) this.f17538j);
                            System.arraycopy(this.f17532d.m27777h(), 0, x02Var2.m27777h(), 0, 8);
                            this.f17540l = x02Var2;
                            this.f17536h = 1;
                        }
                    } else {
                        long zzf4 = km4Var.zzf();
                        long j26 = this.f17538j;
                        long j27 = this.f17539k;
                        long j28 = (zzf4 + j26) - j27;
                        if (j26 != j27 && this.f17537i == 1835365473) {
                            this.f17531c.m27772c(8);
                            km4Var.mo23966j(this.f17531c.m27777h(), 0, 8);
                            AbstractC4895q3.m25637d(this.f17531c);
                            km4Var.mo23967n(this.f17531c.m27780k());
                            km4Var.zzj();
                        }
                        this.f17533e.push(new C4487f3(this.f17537i, j28));
                        if (this.f17538j == this.f17539k) {
                            m20392k(j28);
                        } else {
                            m20391j();
                        }
                    }
                } else {
                    throw zzbu.m28713c("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f17549u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}
