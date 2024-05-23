package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.w3 */
/* loaded from: classes2.dex */
public final class C5117w3 implements jm4 {

    /* renamed from: E */
    public static final qm4 f29740E = new qm4() { // from class: com.google.android.gms.internal.ads.s3
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C5117w3(0, null)};
        }
    };

    /* renamed from: F */
    private static final byte[] f29741F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final C4671k3 f29742G;

    /* renamed from: D */
    private boolean f29746D;

    /* renamed from: f */
    private final byte[] f29752f;

    /* renamed from: g */
    private final x02 f29753g;

    /* renamed from: l */
    private int f29758l;

    /* renamed from: m */
    private int f29759m;

    /* renamed from: n */
    private long f29760n;

    /* renamed from: o */
    private int f29761o;

    /* renamed from: p */
    private x02 f29762p;

    /* renamed from: q */
    private long f29763q;

    /* renamed from: r */
    private int f29764r;

    /* renamed from: v */
    private C5080v3 f29768v;

    /* renamed from: w */
    private int f29769w;

    /* renamed from: x */
    private int f29770x;

    /* renamed from: y */
    private int f29771y;

    /* renamed from: z */
    private boolean f29772z;

    /* renamed from: a */
    private final List f29747a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h */
    private final C4596i1 f29754h = new C4596i1();

    /* renamed from: i */
    private final x02 f29755i = new x02(16);

    /* renamed from: c */
    private final x02 f29749c = new x02(AbstractC4557h.f21470a);

    /* renamed from: d */
    private final x02 f29750d = new x02(5);

    /* renamed from: e */
    private final x02 f29751e = new x02();

    /* renamed from: j */
    private final ArrayDeque f29756j = new ArrayDeque();

    /* renamed from: k */
    private final ArrayDeque f29757k = new ArrayDeque();

    /* renamed from: b */
    private final SparseArray f29748b = new SparseArray();

    /* renamed from: t */
    private long f29766t = -9223372036854775807L;

    /* renamed from: s */
    private long f29765s = -9223372036854775807L;

    /* renamed from: u */
    private long f29767u = -9223372036854775807L;

    /* renamed from: A */
    private mm4 f29743A = mm4.f24668c;

    /* renamed from: B */
    private InterfaceC4928r[] f29744B = new InterfaceC4928r[0];

    /* renamed from: C */
    private InterfaceC4928r[] f29745C = new InterfaceC4928r[0];

    static {
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26523s("application/x-emsg");
        f29742G = c5004t1.m26529y();
    }

    public C5117w3(int i11, a72 a72Var) {
        byte[] bArr = new byte[16];
        this.f29752f = bArr;
        this.f29753g = new x02(bArr);
    }

    /* renamed from: b */
    private static int m27517b(int i11) {
        if (i11 >= 0) {
            return i11;
        }
        throw zzbu.m28711a("Unexpected negative value: " + i11, null);
    }

    /* renamed from: d */
    private static zzx m27518d(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            C4524g3 c4524g3 = (C4524g3) list.get(i11);
            if (c4524g3.f21515a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m27777h = c4524g3.f20375b.m27777h();
                UUID m21262a = AbstractC4414d4.m21262a(m27777h);
                if (m21262a == null) {
                    lr1.m24356e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(m21262a, null, "video/mp4", m27777h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx(arrayList);
    }

    /* renamed from: g */
    private final void m27519g() {
        this.f29758l = 0;
        this.f29761o = 0;
    }

    /* renamed from: h */
    private static void m27520h(x02 x02Var, int i11, C4599i4 c4599i4) {
        boolean z11;
        x02Var.m27775f(i11 + 8);
        int m27782m = x02Var.m27782m();
        if ((m27782m & 1) == 0) {
            if ((m27782m & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int m27791v = x02Var.m27791v();
            if (m27791v == 0) {
                Arrays.fill(c4599i4.f22050l, 0, c4599i4.f22043e, false);
                return;
            }
            int i12 = c4599i4.f22043e;
            if (m27791v == i12) {
                Arrays.fill(c4599i4.f22050l, 0, m27791v, z11);
                c4599i4.m23122a(x02Var.m27778i());
                x02 x02Var2 = c4599i4.f22052n;
                x02Var.m27771b(x02Var2.m27777h(), 0, x02Var2.m27781l());
                c4599i4.f22052n.m27775f(0);
                c4599i4.f22053o = false;
                return;
            }
            throw zzbu.m28711a("Senc sample count " + m27791v + " is different from fragment sample count" + i12, null);
        }
        throw zzbu.m28713c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x031d  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m27521i(long j11) {
        boolean z11;
        C5117w3 c5117w3;
        String str;
        SparseArray sparseArray;
        C4487f3 c4487f3;
        int i11;
        int i12;
        byte[] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        byte[] bArr2;
        byte[] bArr3;
        long m27763B;
        boolean z12;
        int i17;
        boolean z13;
        boolean z14;
        int i18;
        C4487f3 c4487f32;
        byte[] bArr4;
        C4599i4 c4599i4;
        List list;
        int i19;
        int i21;
        C4487f3 c4487f33;
        int i22;
        C5080v3 c5080v3;
        long j12;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        x02 x02Var;
        int i34;
        C4932r3 c4932r3;
        long j13;
        C5080v3 c5080v32;
        boolean z15;
        long m27762A;
        final C5117w3 c5117w32 = this;
        while (!c5117w32.f29756j.isEmpty() && ((C4487f3) c5117w32.f29756j.peek()).f19943b == j11) {
            C4487f3 c4487f34 = (C4487f3) c5117w32.f29756j.pop();
            int i35 = c4487f34.f21515a;
            int i36 = 12;
            int i37 = 8;
            if (i35 == 1836019574) {
                zzx m27518d = m27518d(c4487f34.f19944c);
                C4487f3 m21870c = c4487f34.m21870c(1836475768);
                m21870c.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = m21870c.f19944c.size();
                long j14 = -9223372036854775807L;
                int i38 = 0;
                while (i38 < size) {
                    C4524g3 c4524g3 = (C4524g3) m21870c.f19944c.get(i38);
                    int i39 = c4524g3.f21515a;
                    if (i39 == 1953654136) {
                        x02 x02Var2 = c4524g3.f20375b;
                        x02Var2.m27775f(i36);
                        Pair create = Pair.create(Integer.valueOf(x02Var2.m27782m()), new C4932r3(x02Var2.m27782m() - 1, x02Var2.m27782m(), x02Var2.m27782m(), x02Var2.m27782m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (C4932r3) create.second);
                    } else if (i39 == 1835362404) {
                        x02 x02Var3 = c4524g3.f20375b;
                        x02Var3.m27775f(8);
                        if (AbstractC4561h3.m22689a(x02Var3.m27782m()) == 0) {
                            j14 = x02Var3.m27762A();
                        } else {
                            j14 = x02Var3.m27763B();
                        }
                    }
                    i38++;
                    i36 = 12;
                }
                List m25636c = AbstractC4895q3.m25636c(c4487f34, new ym4(), j14, m27518d, false, false, new y43() { // from class: com.google.android.gms.internal.ads.t3
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj) {
                        return (C4525g4) obj;
                    }
                });
                int size2 = m25636c.size();
                if (c5117w32.f29748b.size() == 0) {
                    for (int i41 = 0; i41 < size2; i41++) {
                        C4635j4 c4635j4 = (C4635j4) m25636c.get(i41);
                        C4525g4 c4525g4 = c4635j4.f22619a;
                        c5117w32.f29748b.put(c4525g4.f20387a, new C5080v3(c5117w32.f29743A.mo21604i(i41, c4525g4.f20388b), c4635j4, m27522j(sparseArray2, c4525g4.f20387a)));
                        c5117w32.f29766t = Math.max(c5117w32.f29766t, c4525g4.f20391e);
                    }
                    c5117w32.f29743A.zzC();
                } else {
                    if (c5117w32.f29748b.size() == size2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v71.m27175f(z11);
                    for (int i42 = 0; i42 < size2; i42++) {
                        C4635j4 c4635j42 = (C4635j4) m25636c.get(i42);
                        C4525g4 c4525g42 = c4635j42.f22619a;
                        ((C5080v3) c5117w32.f29748b.get(c4525g42.f20387a)).m27142h(c4635j42, m27522j(sparseArray2, c4525g42.f20387a));
                    }
                }
            } else {
                if (i35 == 1836019558) {
                    SparseArray sparseArray3 = c5117w32.f29748b;
                    byte[] bArr5 = c5117w32.f29752f;
                    int size3 = c4487f34.f19945d.size();
                    int i43 = 0;
                    while (i43 < size3) {
                        C4487f3 c4487f35 = (C4487f3) c4487f34.f19945d.get(i43);
                        if (c4487f35.f21515a == 1953653094) {
                            C4524g3 m21871d = c4487f35.m21871d(1952868452);
                            m21871d.getClass();
                            x02 x02Var4 = m21871d.f20375b;
                            x02Var4.m27775f(i37);
                            int m27782m = x02Var4.m27782m();
                            C5080v3 c5080v33 = (C5080v3) sparseArray3.get(x02Var4.m27782m());
                            if (c5080v33 == null) {
                                c5080v33 = null;
                            } else {
                                if ((m27782m & 1) != 0) {
                                    long m27763B2 = x02Var4.m27763B();
                                    C4599i4 c4599i42 = c5080v33.f29141b;
                                    c4599i42.f22040b = m27763B2;
                                    c4599i42.f22041c = m27763B2;
                                }
                                C4932r3 c4932r32 = c5080v33.f29144e;
                                int m27782m2 = (m27782m & 2) != 0 ? x02Var4.m27782m() - 1 : c4932r32.f27060a;
                                if ((m27782m & 8) != 0) {
                                    i13 = x02Var4.m27782m();
                                } else {
                                    i13 = c4932r32.f27061b;
                                }
                                if ((m27782m & 16) != 0) {
                                    i14 = x02Var4.m27782m();
                                } else {
                                    i14 = c4932r32.f27062c;
                                }
                                if ((m27782m & 32) != 0) {
                                    i15 = x02Var4.m27782m();
                                } else {
                                    i15 = c4932r32.f27063d;
                                }
                                c5080v33.f29141b.f22039a = new C4932r3(m27782m2, i13, i14, i15);
                            }
                            if (c5080v33 != null) {
                                C4599i4 c4599i43 = c5080v33.f29141b;
                                long j15 = c4599i43.f22054p;
                                boolean z16 = c4599i43.f22055q;
                                c5080v33.m27143i();
                                c5080v33.f29151l = true;
                                C4524g3 m21871d2 = c4487f35.m21871d(1952867444);
                                if (m21871d2 != null) {
                                    x02 x02Var5 = m21871d2.f20375b;
                                    x02Var5.m27775f(i37);
                                    if (AbstractC4561h3.m22689a(x02Var5.m27782m()) == 1) {
                                        m27762A = x02Var5.m27763B();
                                    } else {
                                        m27762A = x02Var5.m27762A();
                                    }
                                    c4599i43.f22054p = m27762A;
                                    c4599i43.f22055q = true;
                                } else {
                                    c4599i43.f22054p = j15;
                                    c4599i43.f22055q = z16;
                                }
                                List list2 = c4487f35.f19944c;
                                int size4 = list2.size();
                                int i44 = 0;
                                int i45 = 0;
                                int i46 = 0;
                                while (true) {
                                    i16 = 1953658222;
                                    if (i44 >= size4) {
                                        break;
                                    }
                                    C4524g3 c4524g32 = (C4524g3) list2.get(i44);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (c4524g32.f21515a == 1953658222) {
                                        x02 x02Var6 = c4524g32.f20375b;
                                        x02Var6.m27775f(12);
                                        int m27791v = x02Var6.m27791v();
                                        if (m27791v > 0) {
                                            i46 += m27791v;
                                            i45++;
                                        }
                                    }
                                    i44++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                c5080v33.f29147h = 0;
                                c5080v33.f29146g = 0;
                                c5080v33.f29145f = 0;
                                C4599i4 c4599i44 = c5080v33.f29141b;
                                c4599i44.f22042d = i45;
                                c4599i44.f22043e = i46;
                                if (c4599i44.f22045g.length < i45) {
                                    c4599i44.f22044f = new long[i45];
                                    c4599i44.f22045g = new int[i45];
                                }
                                if (c4599i44.f22046h.length < i46) {
                                    int i47 = (i46 * 125) / 100;
                                    c4599i44.f22046h = new int[i47];
                                    c4599i44.f22047i = new long[i47];
                                    c4599i44.f22048j = new boolean[i47];
                                    c4599i44.f22050l = new boolean[i47];
                                }
                                int i48 = 0;
                                int i49 = 0;
                                int i51 = 0;
                                while (i48 < size4) {
                                    C4524g3 c4524g33 = (C4524g3) list2.get(i48);
                                    if (c4524g33.f21515a == i16) {
                                        int i52 = i51 + 1;
                                        x02 x02Var7 = c4524g33.f20375b;
                                        x02Var7.m27775f(8);
                                        int m27782m3 = x02Var7.m27782m();
                                        list = list2;
                                        C4525g4 c4525g43 = c5080v33.f29143d.f22619a;
                                        i19 = size3;
                                        C4599i4 c4599i45 = c5080v33.f29141b;
                                        i22 = size4;
                                        C4932r3 c4932r33 = c4599i45.f22039a;
                                        int i53 = g92.f20474a;
                                        c4599i45.f22045g[i51] = x02Var7.m27791v();
                                        long[] jArr = c4599i45.f22044f;
                                        c4487f32 = c4487f34;
                                        bArr4 = bArr5;
                                        long j16 = c4599i45.f22040b;
                                        jArr[i51] = j16;
                                        if ((m27782m3 & 1) != 0) {
                                            i18 = i48;
                                            jArr[i51] = j16 + x02Var7.m27782m();
                                        } else {
                                            i18 = i48;
                                        }
                                        int i54 = m27782m3 & 4;
                                        int i55 = c4932r33.f27063d;
                                        if (i54 != 0) {
                                            i55 = x02Var7.m27782m();
                                        }
                                        int i56 = m27782m3 & 256;
                                        int i57 = m27782m3 & 512;
                                        int i58 = m27782m3 & 1024;
                                        int i59 = m27782m3 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                                        int i61 = i55;
                                        long[] jArr2 = c4525g43.f20394h;
                                        if (jArr2 != null) {
                                            i21 = i43;
                                            c4487f33 = c4487f35;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j12 = ((long[]) g92.m22347h(c4525g43.f20395i))[0];
                                                int[] iArr = c4599i45.f22046h;
                                                long[] jArr3 = c4599i45.f22047i;
                                                boolean[] zArr = c4599i45.f22048j;
                                                c4599i4 = c4599i43;
                                                i23 = c4599i45.f22045g[i51] + i49;
                                                C5080v3 c5080v34 = c5080v33;
                                                long j17 = c4525g43.f20389c;
                                                i24 = i49;
                                                long j18 = c4599i45.f22054p;
                                                while (i24 < i23) {
                                                    if (i56 != 0) {
                                                        i25 = i56;
                                                        i26 = x02Var7.m27782m();
                                                    } else {
                                                        i25 = i56;
                                                        i26 = c4932r33.f27061b;
                                                    }
                                                    m27517b(i26);
                                                    if (i57 != 0) {
                                                        i27 = i57;
                                                        i28 = x02Var7.m27782m();
                                                    } else {
                                                        i27 = i57;
                                                        i28 = c4932r33.f27062c;
                                                    }
                                                    m27517b(i28);
                                                    if (i58 != 0) {
                                                        i29 = i54;
                                                        i31 = x02Var7.m27782m();
                                                    } else {
                                                        i29 = i54;
                                                        if (i24 == 0) {
                                                            if (i54 != 0) {
                                                                i31 = i61;
                                                                i24 = 0;
                                                            } else {
                                                                i24 = 0;
                                                            }
                                                        }
                                                        i31 = c4932r33.f27063d;
                                                    }
                                                    if (i59 != 0) {
                                                        i32 = i23;
                                                        i33 = i58;
                                                        x02Var = x02Var7;
                                                        i34 = x02Var7.m27782m();
                                                    } else {
                                                        i32 = i23;
                                                        i33 = i58;
                                                        x02Var = x02Var7;
                                                        i34 = 0;
                                                    }
                                                    long m22346g0 = g92.m22346g0((i34 + j18) - j12, 1000000L, j17);
                                                    jArr3[i24] = m22346g0;
                                                    int i62 = i59;
                                                    if (!c4599i45.f22055q) {
                                                        c5080v32 = c5080v34;
                                                        c4932r3 = c4932r33;
                                                        j13 = j17;
                                                        jArr3[i24] = m22346g0 + c5080v32.f29143d.f22626h;
                                                    } else {
                                                        c4932r3 = c4932r33;
                                                        j13 = j17;
                                                        c5080v32 = c5080v34;
                                                    }
                                                    iArr[i24] = i28;
                                                    if (1 != (((i31 >> 16) & 1) ^ 1)) {
                                                        z15 = false;
                                                    } else {
                                                        z15 = true;
                                                    }
                                                    zArr[i24] = z15;
                                                    j18 += i26;
                                                    i24++;
                                                    c5080v34 = c5080v32;
                                                    i59 = i62;
                                                    c4932r33 = c4932r3;
                                                    j17 = j13;
                                                    i56 = i25;
                                                    i57 = i27;
                                                    i54 = i29;
                                                    i23 = i32;
                                                    x02Var7 = x02Var;
                                                    i58 = i33;
                                                }
                                                int i63 = i23;
                                                c5080v3 = c5080v34;
                                                c4599i45.f22054p = j18;
                                                i51 = i52;
                                                i49 = i63;
                                            }
                                        } else {
                                            i21 = i43;
                                            c4487f33 = c4487f35;
                                        }
                                        j12 = 0;
                                        int[] iArr2 = c4599i45.f22046h;
                                        long[] jArr32 = c4599i45.f22047i;
                                        boolean[] zArr2 = c4599i45.f22048j;
                                        c4599i4 = c4599i43;
                                        i23 = c4599i45.f22045g[i51] + i49;
                                        C5080v3 c5080v342 = c5080v33;
                                        long j172 = c4525g43.f20389c;
                                        i24 = i49;
                                        long j182 = c4599i45.f22054p;
                                        while (i24 < i23) {
                                        }
                                        int i632 = i23;
                                        c5080v3 = c5080v342;
                                        c4599i45.f22054p = j182;
                                        i51 = i52;
                                        i49 = i632;
                                    } else {
                                        i18 = i48;
                                        c4487f32 = c4487f34;
                                        bArr4 = bArr5;
                                        c4599i4 = c4599i43;
                                        list = list2;
                                        i19 = size3;
                                        i21 = i43;
                                        c4487f33 = c4487f35;
                                        i22 = size4;
                                        c5080v3 = c5080v33;
                                    }
                                    i48 = i18 + 1;
                                    c5080v33 = c5080v3;
                                    list2 = list;
                                    size3 = i19;
                                    size4 = i22;
                                    c4487f34 = c4487f32;
                                    bArr5 = bArr4;
                                    i43 = i21;
                                    c4487f35 = c4487f33;
                                    c4599i43 = c4599i4;
                                    i16 = 1953658222;
                                }
                                c4487f3 = c4487f34;
                                byte[] bArr6 = bArr5;
                                C4599i4 c4599i46 = c4599i43;
                                i11 = size3;
                                i12 = i43;
                                C4487f3 c4487f36 = c4487f35;
                                C4525g4 c4525g44 = c5080v33.f29143d.f22619a;
                                C4932r3 c4932r34 = c4599i46.f22039a;
                                c4932r34.getClass();
                                C4562h4 m22277a = c4525g44.m22277a(c4932r34.f27060a);
                                C4524g3 m21871d3 = c4487f36.m21871d(1935763834);
                                if (m21871d3 != null) {
                                    m22277a.getClass();
                                    x02 x02Var8 = m21871d3.f20375b;
                                    int i64 = m22277a.f21530d;
                                    x02Var8.m27775f(8);
                                    if ((x02Var8.m27782m() & 1) == 1) {
                                        x02Var8.m27776g(8);
                                    }
                                    int m27788s = x02Var8.m27788s();
                                    int m27791v2 = x02Var8.m27791v();
                                    int i65 = c4599i46.f22043e;
                                    if (m27791v2 <= i65) {
                                        if (m27788s == 0) {
                                            boolean[] zArr3 = c4599i46.f22050l;
                                            i17 = 0;
                                            for (int i66 = 0; i66 < m27791v2; i66++) {
                                                int m27788s2 = x02Var8.m27788s();
                                                i17 += m27788s2;
                                                if (m27788s2 > i64) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                zArr3[i66] = z14;
                                            }
                                            z13 = false;
                                        } else {
                                            if (m27788s > i64) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            i17 = m27788s * m27791v2;
                                            z13 = false;
                                            Arrays.fill(c4599i46.f22050l, 0, m27791v2, z12);
                                        }
                                        Arrays.fill(c4599i46.f22050l, m27791v2, c4599i46.f22043e, z13);
                                        if (i17 > 0) {
                                            c4599i46.m23122a(i17);
                                        }
                                    } else {
                                        throw zzbu.m28711a("Saiz sample count " + m27791v2 + " is greater than fragment sample count" + i65, null);
                                    }
                                }
                                C4524g3 m21871d4 = c4487f36.m21871d(1935763823);
                                if (m21871d4 != null) {
                                    x02 x02Var9 = m21871d4.f20375b;
                                    x02Var9.m27775f(8);
                                    int m27782m4 = x02Var9.m27782m();
                                    if ((m27782m4 & 1) == 1) {
                                        x02Var9.m27776g(8);
                                    }
                                    int m27791v3 = x02Var9.m27791v();
                                    if (m27791v3 == 1) {
                                        long j19 = c4599i46.f22041c;
                                        if (AbstractC4561h3.m22689a(m27782m4) == 0) {
                                            m27763B = x02Var9.m27762A();
                                        } else {
                                            m27763B = x02Var9.m27763B();
                                        }
                                        c4599i46.f22041c = j19 + m27763B;
                                    } else {
                                        throw zzbu.m28711a("Unexpected saio entry count: " + m27791v3, null);
                                    }
                                }
                                C4524g3 m21871d5 = c4487f36.m21871d(1936027235);
                                if (m21871d5 != null) {
                                    m27520h(m21871d5.f20375b, 0, c4599i46);
                                }
                                if (m22277a != null) {
                                    str2 = m22277a.f21528b;
                                } else {
                                    str2 = null;
                                }
                                x02 x02Var10 = null;
                                x02 x02Var11 = null;
                                for (int i67 = 0; i67 < c4487f36.f19944c.size(); i67++) {
                                    C4524g3 c4524g34 = (C4524g3) c4487f36.f19944c.get(i67);
                                    x02 x02Var12 = c4524g34.f20375b;
                                    int i68 = c4524g34.f21515a;
                                    if (i68 == 1935828848) {
                                        x02Var12.m27775f(12);
                                        if (x02Var12.m27782m() == 1936025959) {
                                            x02Var10 = x02Var12;
                                        }
                                    } else if (i68 == 1936158820) {
                                        x02Var12.m27775f(12);
                                        if (x02Var12.m27782m() == 1936025959) {
                                            x02Var11 = x02Var12;
                                        }
                                    }
                                }
                                if (x02Var10 != null && x02Var11 != null) {
                                    x02Var10.m27775f(8);
                                    int m27782m5 = x02Var10.m27782m();
                                    x02Var10.m27776g(4);
                                    if (AbstractC4561h3.m22689a(m27782m5) == 1) {
                                        x02Var10.m27776g(4);
                                    }
                                    if (x02Var10.m27782m() == 1) {
                                        x02Var11.m27775f(8);
                                        int m22689a = AbstractC4561h3.m22689a(x02Var11.m27782m());
                                        x02Var11.m27776g(4);
                                        if (m22689a == 1) {
                                            if (x02Var11.m27762A() == 0) {
                                                throw zzbu.m28713c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (m22689a >= 2) {
                                            x02Var11.m27776g(4);
                                        }
                                        if (x02Var11.m27762A() == 1) {
                                            x02Var11.m27776g(1);
                                            int m27788s3 = x02Var11.m27788s();
                                            int i69 = (m27788s3 & 240) >> 4;
                                            int i71 = m27788s3 & 15;
                                            if (x02Var11.m27788s() == 1) {
                                                int m27788s4 = x02Var11.m27788s();
                                                byte[] bArr7 = new byte[16];
                                                x02Var11.m27771b(bArr7, 0, 16);
                                                if (m27788s4 == 0) {
                                                    int m27788s5 = x02Var11.m27788s();
                                                    byte[] bArr8 = new byte[m27788s5];
                                                    x02Var11.m27771b(bArr8, 0, m27788s5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                c4599i46.f22049k = true;
                                                c4599i46.f22051m = new C4562h4(true, str2, m27788s4, bArr7, i69, i71, bArr3);
                                            }
                                        } else {
                                            throw zzbu.m28713c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbu.m28713c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = c4487f36.f19944c.size();
                                int i72 = 0;
                                while (i72 < size5) {
                                    C4524g3 c4524g35 = (C4524g3) c4487f36.f19944c.get(i72);
                                    if (c4524g35.f21515a == 1970628964) {
                                        x02 x02Var13 = c4524g35.f20375b;
                                        x02Var13.m27775f(8);
                                        bArr2 = bArr6;
                                        x02Var13.m27771b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f29741F)) {
                                            m27520h(x02Var13, 16, c4599i46);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i72++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i11;
                                c4487f34 = c4487f3;
                                i37 = 8;
                                i43 = i12 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        c4487f3 = c4487f34;
                        i11 = size3;
                        i12 = i43;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i11;
                        c4487f34 = c4487f3;
                        i37 = 8;
                        i43 = i12 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx m27518d2 = m27518d(c4487f34.f19944c);
                    c5117w3 = this;
                    if (m27518d2 != null) {
                        int size6 = c5117w3.f29748b.size();
                        for (int i73 = 0; i73 < size6; i73++) {
                            C5080v3 c5080v35 = (C5080v3) c5117w3.f29748b.valueAt(i73);
                            C4525g4 c4525g45 = c5080v35.f29143d.f22619a;
                            C4932r3 c4932r35 = c5080v35.f29141b.f22039a;
                            int i74 = g92.f20474a;
                            C4562h4 m22277a2 = c4525g45.m22277a(c4932r35.f27060a);
                            if (m22277a2 != null) {
                                str = m22277a2.f21528b;
                            } else {
                                str = null;
                            }
                            zzx m28836b = m27518d2.m28836b(str);
                            C5004t1 m23809b = c5080v35.f29143d.f22619a.f20392f.m23809b();
                            m23809b.m26500b(m28836b);
                            c5080v35.f29140a.mo23300d(m23809b.m26529y());
                        }
                    }
                    if (c5117w3.f29765s != -9223372036854775807L) {
                        int size7 = c5117w3.f29748b.size();
                        for (int i75 = 0; i75 < size7; i75++) {
                            C5080v3 c5080v36 = (C5080v3) c5117w3.f29748b.valueAt(i75);
                            long j21 = c5117w3.f29765s;
                            int i76 = c5080v36.f29145f;
                            while (true) {
                                C4599i4 c4599i47 = c5080v36.f29141b;
                                if (i76 < c4599i47.f22043e && c4599i47.f22047i[i76] < j21) {
                                    if (c4599i47.f22048j[i76]) {
                                        c5080v36.f29148i = i76;
                                    }
                                    i76++;
                                }
                            }
                        }
                        c5117w3.f29765s = -9223372036854775807L;
                    }
                } else {
                    c5117w3 = c5117w32;
                    if (!c5117w3.f29756j.isEmpty()) {
                        ((C4487f3) c5117w3.f29756j.peek()).m21872e(c4487f34);
                    }
                }
                c5117w32 = c5117w3;
            }
        }
        m27519g();
    }

    /* renamed from: j */
    private static final C4932r3 m27522j(SparseArray sparseArray, int i11) {
        if (sparseArray.size() == 1) {
            return (C4932r3) sparseArray.valueAt(0);
        }
        C4932r3 c4932r3 = (C4932r3) sparseArray.get(i11);
        c4932r3.getClass();
        return c4932r3;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return AbstractC4488f4.m21938a(km4Var);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f29743A = mm4Var;
        m27519g();
        InterfaceC4928r[] interfaceC4928rArr = new InterfaceC4928r[2];
        this.f29744B = interfaceC4928rArr;
        int i11 = 0;
        InterfaceC4928r[] interfaceC4928rArr2 = (InterfaceC4928r[]) g92.m22312F(interfaceC4928rArr, 0);
        this.f29744B = interfaceC4928rArr2;
        for (InterfaceC4928r interfaceC4928r : interfaceC4928rArr2) {
            interfaceC4928r.mo23300d(f29742G);
        }
        this.f29745C = new InterfaceC4928r[this.f29747a.size()];
        int i12 = 100;
        while (i11 < this.f29745C.length) {
            int i13 = i12 + 1;
            InterfaceC4928r mo21604i = this.f29743A.mo21604i(i12, 3);
            mo21604i.mo23300d((C4671k3) this.f29747a.get(i11));
            this.f29745C[i11] = mo21604i;
            i11++;
            i12 = i13;
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        int size = this.f29748b.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C5080v3) this.f29748b.valueAt(i11)).m27143i();
        }
        this.f29757k.clear();
        this.f29764r = 0;
        this.f29765s = j12;
        this.f29756j.clear();
        m27519g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x0099, code lost:            r4 = 6;     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x009c, code lost:            if (r33.f29758l != 3) goto L62;     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x009e, code lost:            r3 = r2.m27137b();        r33.f29769w = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00a8, code lost:            if (r2.f29145f >= r2.f29148i) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00aa, code lost:            ((com.google.android.gms.internal.ads.yl4) r1).m28248l(r3, false);        r1 = r2.m27141f();     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b3, code lost:            if (r1 != null) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00b6, code lost:            r3 = r2.f29141b.f22052n;        r1 = r1.f21530d;     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00bc, code lost:            if (r1 == 0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00be, code lost:            r3.m27776g(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00c9, code lost:            if (r2.f29141b.m23123b(r2.f29145f) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00cb, code lost:            r3.m27776g(r3.m27792w() * 6);     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d8, code lost:            if (r2.m27144k() != false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00da, code lost:            r33.f29768v = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00dc, code lost:            r33.f29758l = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00de, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e7, code lost:            if (r2.f29143d.f22619a.f20393g != 1) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x00e9, code lost:            r33.f29769w = r3 - 8;        ((com.google.android.gms.internal.ads.yl4) r1).m28248l(8, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0103, code lost:            if ("audio/ac4".equals(r2.f29143d.f22619a.f20392f.f23099l) == false) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0105, code lost:            r33.f29770x = r2.m27138c(r33.f29769w, 7);        com.google.android.gms.internal.ads.ml4.m24629b(r33.f29769w, r33.f29753g);        r2.f29140a.mo23301e(r33.f29753g, 7);        r3 = r33.f29770x + 7;        r33.f29770x = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x012a, code lost:            r33.f29769w += r3;        r33.f29758l = 4;        r33.f29771y = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0122, code lost:            r3 = r2.m27138c(r33.f29769w, 0);        r33.f29770x = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0134, code lost:            r3 = r2.f29143d.f22619a;        r5 = r2.f29140a;        r10 = r2.m27140e();        r6 = r3.f20396j;     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0140, code lost:            if (r6 != 0) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0142, code lost:            r3 = r33.f29770x;        r4 = r33.f29769w;     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0146, code lost:            if (r3 >= r4) goto L393;     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0148, code lost:            r33.f29770x += r5.mo23297a(r1, r4 - r3, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0236, code lost:            r20 = r2.m27136a();        r1 = r2.m27141f();     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x023e, code lost:            if (r1 == null) goto L100;     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0240, code lost:            r23 = r1.f21529c;     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0247, code lost:            r5.mo23302f(r10, r20, r33.f29769w, 0, r23);     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025a, code lost:            if (r33.f29757k.isEmpty() != false) goto L394;     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x025c, code lost:            r1 = (com.google.android.gms.internal.ads.C5043u3) r33.f29757k.removeFirst();        r33.f29764r -= r1.f28722c;        r3 = r1.f28720a;     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x026f, code lost:            if (r1.f28721b == false) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0271, code lost:            r3 = r3 + r10;     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0272, code lost:            r5 = r33.f29744B;        r6 = r5.length;        r8 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0276, code lost:            if (r8 >= r6) goto L397;     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0278, code lost:            r5[r8].mo23302f(r3, 1, r1.f28722c, r33.f29764r, null);        r8 = r8 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0290, code lost:            if (r2.m27144k() != false) goto L113;     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0292, code lost:            r33.f29768v = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0294, code lost:            r33.f29758l = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0245, code lost:            r23 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0153, code lost:            r13 = r33.f29750d.m27777h();        r13[0] = 0;        r13[1] = 0;        r13[2] = 0;        r14 = r6 + 1;        r6 = 4 - r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0169, code lost:            if (r33.f29770x >= r33.f29769w) goto L399;     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016b, code lost:            r12 = r33.f29771y;     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x016f, code lost:            if (r12 != 0) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0171, code lost:            ((com.google.android.gms.internal.ads.yl4) r1).mo23962e(r13, r6, r14, r9);        r33.f29750d.m27775f(r9);        r12 = r33.f29750d.m27782m();     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0182, code lost:            if (r12 <= 0) goto L398;     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0184, code lost:            r33.f29771y = r12 - 1;        r33.f29749c.m27775f(r9);        r5.mo23301e(r33.f29749c, 4);        r5.mo23301e(r33.f29750d, r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x019b, code lost:            if (r33.f29745C.length <= 0) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x019d, code lost:            r12 = r3.f20392f.f23099l;        r17 = r13[4];        r9 = com.google.android.gms.internal.ads.AbstractC4557h.f21470a;     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01ab, code lost:            if ("video/avc".equals(r12) == false) goto L82;     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01af, code lost:            if ((r17 & 31) == r4) goto L81;     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01b2, code lost:            r9 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x01c3, code lost:            r33.f29772z = r9;        r33.f29770x += 5;        r33.f29769w += r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01d0, code lost:            r9 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01b8, code lost:            if ("video/hevc".equals(r12) == false) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01bf, code lost:            if (((r17 & 126) >> r8) != 39) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01c2, code lost:            r9 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01d9, code lost:            throw com.google.android.gms.internal.ads.zzbu.m28711a("Invalid NAL length", null);     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01dc, code lost:            if (r33.f29772z == false) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x01de, code lost:            r33.f29751e.m27772c(r12);        ((com.google.android.gms.internal.ads.yl4) r1).mo23962e(r33.f29751e.m27777h(), 0, r33.f29771y, false);        r5.mo23301e(r33.f29751e, r33.f29771y);        r4 = r33.f29771y;        r8 = r33.f29751e;        r8 = com.google.android.gms.internal.ads.AbstractC4557h.m22650b(r8.m27777h(), r8.m27781l());        r33.f29751e.m27775f("video/hevc".equals(r3.f20392f.f23099l) ? 1 : 0);        r33.f29751e.m27774e(r8);        com.google.android.gms.internal.ads.vl4.m27303a(r10, r33.f29751e, r33.f29745C);     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0229, code lost:            r33.f29770x += r4;        r33.f29771y -= r4;        r4 = 6;        r8 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0223, code lost:            r4 = r5.mo23297a(r1, r12, false);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        boolean z11;
        boolean z12;
        long m22346g0;
        long m27762A;
        String str;
        String str2;
        long j11;
        long j12;
        long m27763B;
        long m27763B2;
        km4 km4Var2 = km4Var;
        while (true) {
            int i11 = this.f29758l;
            int i12 = 1;
            ?? r92 = 0;
            if (i11 == 0) {
                if (this.f29761o == 0) {
                    if (!km4Var2.mo23962e(this.f29755i.m27777h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f29761o = 8;
                    this.f29755i.m27775f(0);
                    this.f29760n = this.f29755i.m27762A();
                    this.f29759m = this.f29755i.m27782m();
                }
                long j13 = this.f29760n;
                if (j13 == 1) {
                    ((yl4) km4Var2).mo23962e(this.f29755i.m27777h(), 8, 8, false);
                    this.f29761o += 8;
                    this.f29760n = this.f29755i.m27763B();
                } else if (j13 == 0) {
                    long zzd = km4Var.zzd();
                    if (zzd == -1) {
                        zzd = !this.f29756j.isEmpty() ? ((C4487f3) this.f29756j.peek()).f19943b : -1L;
                    }
                    if (zzd != -1) {
                        this.f29760n = (zzd - km4Var.zzf()) + this.f29761o;
                    }
                }
                long j14 = this.f29760n;
                long j15 = this.f29761o;
                if (j14 >= j15) {
                    long zzf = km4Var.zzf() - j15;
                    int i13 = this.f29759m;
                    if ((i13 == 1836019558 || i13 == 1835295092) && !this.f29746D) {
                        this.f29743A.mo21603f(new C4741m(this.f29766t, zzf));
                        this.f29746D = true;
                    }
                    if (this.f29759m == 1836019558) {
                        int size = this.f29748b.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            C4599i4 c4599i4 = ((C5080v3) this.f29748b.valueAt(i14)).f29141b;
                            c4599i4.f22041c = zzf;
                            c4599i4.f22040b = zzf;
                        }
                    }
                    int i15 = this.f29759m;
                    if (i15 == 1835295092) {
                        this.f29768v = null;
                        this.f29763q = zzf + this.f29760n;
                        this.f29758l = 2;
                    } else if (i15 == 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1836019558 || i15 == 1953653094 || i15 == 1836475768 || i15 == 1701082227) {
                        long zzf2 = (km4Var.zzf() + this.f29760n) - 8;
                        this.f29756j.push(new C4487f3(i15, zzf2));
                        if (this.f29760n == this.f29761o) {
                            m27521i(zzf2);
                        } else {
                            m27519g();
                        }
                    } else if (i15 == 1751411826 || i15 == 1835296868 || i15 == 1836476516 || i15 == 1936286840 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1668576371 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1937011571 || i15 == 1952867444 || i15 == 1952868452 || i15 == 1953196132 || i15 == 1953654136 || i15 == 1953658222 || i15 == 1886614376 || i15 == 1935763834 || i15 == 1935763823 || i15 == 1936027235 || i15 == 1970628964 || i15 == 1935828848 || i15 == 1936158820 || i15 == 1701606260 || i15 == 1835362404 || i15 == 1701671783) {
                        if (this.f29761o != 8) {
                            throw zzbu.m28713c("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j16 = this.f29760n;
                        if (j16 <= 2147483647L) {
                            x02 x02Var = new x02((int) j16);
                            System.arraycopy(this.f29755i.m27777h(), 0, x02Var.m27777h(), 0, 8);
                            this.f29762p = x02Var;
                            this.f29758l = 1;
                        } else {
                            throw zzbu.m28713c("Leaf atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        if (this.f29760n > 2147483647L) {
                            throw zzbu.m28713c("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.f29762p = null;
                        this.f29758l = 1;
                    }
                } else {
                    throw zzbu.m28713c("Atom size less than header length (unsupported).");
                }
            } else if (i11 != 1) {
                long j17 = Long.MAX_VALUE;
                if (i11 != 2) {
                    C5080v3 c5080v3 = this.f29768v;
                    if (c5080v3 != null) {
                        break;
                    }
                    SparseArray sparseArray = this.f29748b;
                    int size2 = sparseArray.size();
                    long j18 = Long.MAX_VALUE;
                    C5080v3 c5080v32 = null;
                    for (int i16 = 0; i16 < size2; i16++) {
                        C5080v3 c5080v33 = (C5080v3) sparseArray.valueAt(i16);
                        z11 = c5080v33.f29151l;
                        if (z11 || c5080v33.f29145f != c5080v33.f29143d.f22620b) {
                            z12 = c5080v33.f29151l;
                            if (!z12 || c5080v33.f29147h != c5080v33.f29141b.f22042d) {
                                long m27139d = c5080v33.m27139d();
                                if (m27139d < j18) {
                                    c5080v32 = c5080v33;
                                    j18 = m27139d;
                                }
                            }
                        }
                    }
                    if (c5080v32 == null) {
                        int zzf3 = (int) (this.f29763q - km4Var.zzf());
                        if (zzf3 >= 0) {
                            ((yl4) km4Var2).m28248l(zzf3, false);
                            m27519g();
                        } else {
                            throw zzbu.m28711a("Offset to end of mdat was negative.", null);
                        }
                    } else {
                        int m27139d2 = (int) (c5080v32.m27139d() - km4Var.zzf());
                        if (m27139d2 < 0) {
                            lr1.m24356e("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            m27139d2 = 0;
                        }
                        ((yl4) km4Var2).m28248l(m27139d2, false);
                        this.f29768v = c5080v32;
                        c5080v3 = c5080v32;
                    }
                } else {
                    int size3 = this.f29748b.size();
                    C5080v3 c5080v34 = null;
                    for (int i17 = 0; i17 < size3; i17++) {
                        C4599i4 c4599i42 = ((C5080v3) this.f29748b.valueAt(i17)).f29141b;
                        if (c4599i42.f22053o) {
                            long j19 = c4599i42.f22041c;
                            if (j19 < j17) {
                                c5080v34 = (C5080v3) this.f29748b.valueAt(i17);
                                j17 = j19;
                            }
                        }
                    }
                    if (c5080v34 == null) {
                        this.f29758l = 3;
                    } else {
                        int zzf4 = (int) (j17 - km4Var.zzf());
                        if (zzf4 >= 0) {
                            yl4 yl4Var = (yl4) km4Var2;
                            yl4Var.m28248l(zzf4, false);
                            C4599i4 c4599i43 = c5080v34.f29141b;
                            x02 x02Var2 = c4599i43.f22052n;
                            yl4Var.mo23962e(x02Var2.m27777h(), 0, x02Var2.m27781l(), false);
                            c4599i43.f22052n.m27775f(0);
                            c4599i43.f22053o = false;
                        } else {
                            throw zzbu.m28711a("Offset to encryption data was negative.", null);
                        }
                    }
                }
            } else {
                int i18 = ((int) this.f29760n) - this.f29761o;
                x02 x02Var3 = this.f29762p;
                if (x02Var3 != null) {
                    ((yl4) km4Var2).mo23962e(x02Var3.m27777h(), 8, i18, false);
                    C4524g3 c4524g3 = new C4524g3(this.f29759m, x02Var3);
                    long zzf5 = km4Var.zzf();
                    if (this.f29756j.isEmpty()) {
                        int i19 = c4524g3.f21515a;
                        if (i19 == 1936286840) {
                            x02 x02Var4 = c4524g3.f20375b;
                            x02Var4.m27775f(8);
                            int m27782m = x02Var4.m27782m();
                            x02Var4.m27776g(4);
                            long m27762A2 = x02Var4.m27762A();
                            if (AbstractC4561h3.m22689a(m27782m) == 0) {
                                m27763B = x02Var4.m27762A();
                                m27763B2 = x02Var4.m27762A();
                            } else {
                                m27763B = x02Var4.m27763B();
                                m27763B2 = x02Var4.m27763B();
                            }
                            long j21 = zzf5 + m27763B2;
                            long m22346g02 = g92.m22346g0(m27763B, 1000000L, m27762A2);
                            x02Var4.m27776g(2);
                            int m27792w = x02Var4.m27792w();
                            int[] iArr = new int[m27792w];
                            long[] jArr = new long[m27792w];
                            long[] jArr2 = new long[m27792w];
                            long[] jArr3 = new long[m27792w];
                            long j22 = m22346g02;
                            int i21 = 0;
                            while (i21 < m27792w) {
                                int m27782m2 = x02Var4.m27782m();
                                if ((m27782m2 & Integer.MIN_VALUE) == 0) {
                                    long m27762A3 = x02Var4.m27762A();
                                    iArr[i21] = m27782m2 & Integer.MAX_VALUE;
                                    jArr[i21] = j21;
                                    jArr3[i21] = j22;
                                    long j23 = m27763B + m27762A3;
                                    long[] jArr4 = jArr3;
                                    int i22 = i21;
                                    long[] jArr5 = jArr2;
                                    j22 = g92.m22346g0(j23, 1000000L, m27762A2);
                                    jArr5[i22] = j22 - jArr4[i22];
                                    x02Var4.m27776g(4);
                                    j21 += r1[i22];
                                    i21 = i22 + 1;
                                    iArr = iArr;
                                    jArr = jArr;
                                    jArr2 = jArr5;
                                    jArr3 = jArr4;
                                    m27792w = m27792w;
                                    m27763B = j23;
                                } else {
                                    throw zzbu.m28711a("Unhandled indirect reference", null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(m22346g02), new wl4(iArr, jArr, jArr2, jArr3));
                            this.f29767u = ((Long) create.first).longValue();
                            this.f29743A.mo21603f((InterfaceC4779n) create.second);
                            this.f29746D = true;
                        } else if (i19 == 1701671783) {
                            x02 x02Var5 = c4524g3.f20375b;
                            if (this.f29744B.length != 0) {
                                x02Var5.m27775f(8);
                                int m22689a = AbstractC4561h3.m22689a(x02Var5.m27782m());
                                if (m22689a == 0) {
                                    String m27765D = x02Var5.m27765D((char) 0);
                                    m27765D.getClass();
                                    String m27765D2 = x02Var5.m27765D((char) 0);
                                    m27765D2.getClass();
                                    long m27762A4 = x02Var5.m27762A();
                                    long m22346g03 = g92.m22346g0(x02Var5.m27762A(), 1000000L, m27762A4);
                                    long j24 = this.f29767u;
                                    long j25 = j24 != -9223372036854775807L ? j24 + m22346g03 : -9223372036854775807L;
                                    m22346g0 = g92.m22346g0(x02Var5.m27762A(), 1000L, m27762A4);
                                    m27762A = x02Var5.m27762A();
                                    str = m27765D;
                                    str2 = m27765D2;
                                    j11 = m22346g03;
                                    j12 = j25;
                                } else if (m22689a != 1) {
                                    lr1.m24356e("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m22689a);
                                } else {
                                    long m27762A5 = x02Var5.m27762A();
                                    long m22346g04 = g92.m22346g0(x02Var5.m27763B(), 1000000L, m27762A5);
                                    long m22346g05 = g92.m22346g0(x02Var5.m27762A(), 1000L, m27762A5);
                                    long m27762A6 = x02Var5.m27762A();
                                    String m27765D3 = x02Var5.m27765D((char) 0);
                                    m27765D3.getClass();
                                    String m27765D4 = x02Var5.m27765D((char) 0);
                                    m27765D4.getClass();
                                    m22346g0 = m22346g05;
                                    m27762A = m27762A6;
                                    str = m27765D3;
                                    str2 = m27765D4;
                                    j11 = -9223372036854775807L;
                                    j12 = m22346g04;
                                }
                                byte[] bArr = new byte[x02Var5.m27778i()];
                                x02Var5.m27771b(bArr, 0, x02Var5.m27778i());
                                x02 x02Var6 = new x02(this.f29754h.m23106a(new zzacf(str, str2, m22346g0, m27762A, bArr)));
                                int m27778i = x02Var6.m27778i();
                                for (InterfaceC4928r interfaceC4928r : this.f29744B) {
                                    x02Var6.m27775f(0);
                                    interfaceC4928r.mo23301e(x02Var6, m27778i);
                                }
                                if (j12 == -9223372036854775807L) {
                                    this.f29757k.addLast(new C5043u3(j11, true, m27778i));
                                    this.f29764r += m27778i;
                                } else if (this.f29757k.isEmpty()) {
                                    for (InterfaceC4928r interfaceC4928r2 : this.f29744B) {
                                        interfaceC4928r2.mo23302f(j12, 1, m27778i, 0, null);
                                    }
                                } else {
                                    this.f29757k.addLast(new C5043u3(j12, false, m27778i));
                                    this.f29764r += m27778i;
                                }
                            }
                        }
                        km4Var2 = km4Var;
                    } else {
                        ((C4487f3) this.f29756j.peek()).m21873f(c4524g3);
                    }
                } else {
                    ((yl4) km4Var2).m28248l(i18, false);
                }
                m27521i(km4Var.zzf());
            }
        }
    }
}
