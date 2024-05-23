package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.x6 */
/* loaded from: classes2.dex */
public final class C5158x6 implements jm4 {

    /* renamed from: q */
    public static final qm4 f30347q = new qm4() { // from class: com.google.android.gms.internal.ads.u6
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C5158x6(0)};
        }
    };

    /* renamed from: a */
    private final List f30348a;

    /* renamed from: b */
    private final x02 f30349b;

    /* renamed from: c */
    private final SparseIntArray f30350c;

    /* renamed from: d */
    private final InterfaceC4307a7 f30351d;

    /* renamed from: e */
    private final SparseArray f30352e;

    /* renamed from: f */
    private final SparseBooleanArray f30353f;

    /* renamed from: g */
    private final SparseBooleanArray f30354g;

    /* renamed from: h */
    private final C5009t6 f30355h;

    /* renamed from: i */
    private C4972s6 f30356i;

    /* renamed from: j */
    private mm4 f30357j;

    /* renamed from: k */
    private int f30358k;

    /* renamed from: l */
    private boolean f30359l;

    /* renamed from: m */
    private boolean f30360m;

    /* renamed from: n */
    private boolean f30361n;

    /* renamed from: o */
    private int f30362o;

    /* renamed from: p */
    private int f30363p;

    public C5158x6(int i11) {
        this(1, 0, 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:            r1 = r1 + 1;     */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo19968a(km4 km4Var) {
        byte[] m27777h = this.f30349b.m27777h();
        yl4 yl4Var = (yl4) km4Var;
        yl4Var.mo23963f(m27777h, 0, 940, false);
        int i11 = 0;
        while (i11 < 188) {
            for (int i12 = 0; i12 < 5; i12++) {
                if (m27777h[(i12 * 188) + i11] != 71) {
                    break;
                }
            }
            yl4Var.m28248l(i11, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f30357j = mm4Var;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        C4972s6 c4972s6;
        int size = this.f30348a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a72 a72Var = (a72) this.f30348a.get(i11);
            if (a72Var.m20017e() != -9223372036854775807L) {
                long m20015c = a72Var.m20015c();
                if (m20015c != -9223372036854775807L) {
                    if (m20015c != 0) {
                        if (m20015c == j12) {
                        }
                    }
                }
            }
            a72Var.m20018f(j12);
        }
        if (j12 != 0 && (c4972s6 = this.f30356i) != null) {
            c4972s6.m26992d(j12);
        }
        this.f30349b.m27772c(0);
        this.f30350c.clear();
        for (int i12 = 0; i12 < this.f30352e.size(); i12++) {
            ((InterfaceC4380c7) this.f30352e.valueAt(i12)).zzc();
        }
        this.f30362o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0194, code lost:            if (r1 == false) goto L88;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        ?? r32;
        int i11;
        InterfaceC4380c7 interfaceC4380c7;
        int i12;
        long j11;
        boolean z11;
        long zzd = km4Var.zzd();
        if (this.f30359l) {
            if (zzd != -1) {
                C5009t6 c5009t6 = this.f30355h;
                if (!c5009t6.m26572d()) {
                    return c5009t6.m26569a(km4Var, c4667k, this.f30363p);
                }
            }
            if (!this.f30360m) {
                this.f30360m = true;
                C5009t6 c5009t62 = this.f30355h;
                if (c5009t62.m26570b() != -9223372036854775807L) {
                    j11 = 0;
                    C4972s6 c4972s6 = new C4972s6(c5009t62.m26571c(), c5009t62.m26570b(), zzd, this.f30363p, 112800);
                    this.f30356i = c4972s6;
                    this.f30357j.mo21603f(c4972s6.m26990b());
                } else {
                    j11 = 0;
                    this.f30357j.mo21603f(new C4741m(c5009t62.m26570b(), 0L));
                }
            } else {
                j11 = 0;
            }
            if (this.f30361n) {
                z11 = false;
                this.f30361n = false;
                mo19971e(j11, j11);
                if (km4Var.zzf() != j11) {
                    c4667k.f23035a = j11;
                    return 1;
                }
            } else {
                z11 = false;
            }
            C4972s6 c4972s62 = this.f30356i;
            r32 = z11;
            if (c4972s62 != null) {
                r32 = z11;
                if (c4972s62.m26993e()) {
                    return c4972s62.m26989a(km4Var, c4667k);
                }
            }
        } else {
            r32 = 0;
        }
        x02 x02Var = this.f30349b;
        byte[] m27777h = x02Var.m27777h();
        if (9400 - x02Var.m27780k() < 188) {
            int m27778i = x02Var.m27778i();
            if (m27778i > 0) {
                System.arraycopy(m27777h, x02Var.m27780k(), m27777h, r32, m27778i);
            }
            this.f30349b.m27773d(m27777h, m27778i);
        }
        while (true) {
            x02 x02Var2 = this.f30349b;
            if (x02Var2.m27778i() < 188) {
                int m27781l = x02Var2.m27781l();
                int mo19942a = km4Var.mo19942a(m27777h, m27781l, 9400 - m27781l);
                if (mo19942a == -1) {
                    return -1;
                }
                this.f30349b.m27774e(m27781l + mo19942a);
            } else {
                int m27780k = x02Var2.m27780k();
                int m27781l2 = x02Var2.m27781l();
                int m21275a = AbstractC4417d7.m21275a(x02Var2.m27777h(), m27780k, m27781l2);
                this.f30349b.m27775f(m21275a);
                int i13 = m21275a + 188;
                if (i13 > m27781l2) {
                    this.f30362o += m21275a - m27780k;
                } else {
                    this.f30362o = r32;
                }
                x02 x02Var3 = this.f30349b;
                int m27781l3 = x02Var3.m27781l();
                if (i13 > m27781l3) {
                    return r32;
                }
                int m27782m = x02Var3.m27782m();
                if ((8388608 & m27782m) != 0) {
                    this.f30349b.m27775f(i13);
                    return r32;
                }
                if ((4194304 & m27782m) != 0) {
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                int i14 = (m27782m >> 8) & 8191;
                int i15 = m27782m & 32;
                if ((m27782m & 16) != 0) {
                    interfaceC4380c7 = (InterfaceC4380c7) this.f30352e.get(i14);
                } else {
                    interfaceC4380c7 = null;
                }
                if (interfaceC4380c7 == null) {
                    this.f30349b.m27775f(i13);
                    return r32;
                }
                int i16 = m27782m & 15;
                int i17 = this.f30350c.get(i14, i16 - 1);
                this.f30350c.put(i14, i16);
                if (i17 == i16) {
                    this.f30349b.m27775f(i13);
                    return r32;
                }
                if (i16 != ((i17 + 1) & 15)) {
                    interfaceC4380c7.zzc();
                }
                if (i15 != 0) {
                    int m27788s = this.f30349b.m27788s();
                    if ((this.f30349b.m27788s() & 64) != 0) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    i11 |= i12;
                    this.f30349b.m27776g(m27788s - 1);
                }
                boolean z12 = this.f30359l;
                if (z12 || !this.f30354g.get(i14, r32)) {
                    this.f30349b.m27774e(i13);
                    interfaceC4380c7.mo20811a(this.f30349b, i11);
                    this.f30349b.m27774e(m27781l3);
                }
                if (this.f30359l && zzd != -1) {
                    this.f30361n = true;
                }
                this.f30349b.m27775f(i13);
                return r32;
            }
        }
    }

    public C5158x6(int i11, int i12, int i13) {
        a72 a72Var = new a72(0L);
        this.f30351d = new C4673k5(0);
        this.f30348a = Collections.singletonList(a72Var);
        this.f30349b = new x02(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f30353f = sparseBooleanArray;
        this.f30354g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f30352e = sparseArray;
        this.f30350c = new SparseIntArray();
        this.f30355h = new C5009t6(112800);
        this.f30357j = mm4.f24668c;
        this.f30363p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f30352e.put(sparseArray2.keyAt(i14), (InterfaceC4380c7) sparseArray2.valueAt(i14));
        }
        this.f30352e.put(0, new C4860p6(new C5083v6(this)));
    }
}
