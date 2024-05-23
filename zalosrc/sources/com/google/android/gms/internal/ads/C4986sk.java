package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.sk */
/* loaded from: classes2.dex */
public final class C4986sk implements InterfaceC4614ij {

    /* renamed from: w */
    public static final InterfaceC4724lj f27728w = new C4912qk();

    /* renamed from: x */
    private static final int f27729x = AbstractC4916qo.m25831g("seig");

    /* renamed from: y */
    private static final byte[] f27730y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: j */
    private int f27740j;

    /* renamed from: k */
    private int f27741k;

    /* renamed from: l */
    private long f27742l;

    /* renamed from: m */
    private int f27743m;

    /* renamed from: n */
    private C4655jo f27744n;

    /* renamed from: o */
    private long f27745o;

    /* renamed from: q */
    private C4949rk f27747q;

    /* renamed from: r */
    private int f27748r;

    /* renamed from: s */
    private int f27749s;

    /* renamed from: t */
    private int f27750t;

    /* renamed from: u */
    private InterfaceC4687kj f27751u;

    /* renamed from: v */
    private boolean f27752v;

    /* renamed from: f */
    private final C4655jo f27736f = new C4655jo(16);

    /* renamed from: b */
    private final C4655jo f27732b = new C4655jo(AbstractC4582ho.f21849a);

    /* renamed from: c */
    private final C4655jo f27733c = new C4655jo(5);

    /* renamed from: d */
    private final C4655jo f27734d = new C4655jo();

    /* renamed from: e */
    private final C4655jo f27735e = new C4655jo(1);

    /* renamed from: g */
    private final byte[] f27737g = new byte[16];

    /* renamed from: h */
    private final Stack f27738h = new Stack();

    /* renamed from: i */
    private final LinkedList f27739i = new LinkedList();

    /* renamed from: a */
    private final SparseArray f27731a = new SparseArray();

    /* renamed from: p */
    private long f27746p = -9223372036854775807L;

    public C4986sk(int i11, AbstractC4804no abstractC4804no, C5209yk c5209yk) {
        m26345f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzauv m26344a(List list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            C4504fk c4504fk = (C4504fk) list.get(i11);
            int i12 = c4504fk.f20713a;
            int i13 = AbstractC4541gk.f20657V;
            if (i12 == i13) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c4504fk.f20142P0.f22891a;
                C4655jo c4655jo = new C4655jo(bArr);
                if (c4655jo.m23668d() >= 32) {
                    c4655jo.m23686v(0);
                    if (c4655jo.m23669e() == c4655jo.m23665a() + 4 && c4655jo.m23669e() == i13) {
                        int m22461b = AbstractC4541gk.m22461b(c4655jo.m23669e());
                        if (m22461b > 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unsupported pssh version: ");
                            sb2.append(m22461b);
                        } else {
                            UUID uuid2 = new UUID(c4655jo.m23676l(), c4655jo.m23676l());
                            if (m22461b == 1) {
                                c4655jo.m23687w(c4655jo.m23673i() * 16);
                            }
                            int m23673i = c4655jo.m23673i();
                            if (m23673i == c4655jo.m23665a()) {
                                byte[] bArr2 = new byte[m23673i];
                                c4655jo.m23681q(bArr2, 0, m23673i);
                                create = Pair.create(uuid2, bArr2);
                                if (create != null) {
                                    uuid = null;
                                } else {
                                    uuid = (UUID) create.first;
                                }
                                if (uuid == null) {
                                    arrayList.add(new zzauu(uuid, "video/mp4", bArr, false));
                                }
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid == null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzauv(arrayList);
    }

    /* renamed from: f */
    private final void m26345f() {
        this.f27740j = 0;
        this.f27743m = 0;
    }

    /* renamed from: g */
    private static void m26346g(C4655jo c4655jo, int i11, C4321al c4321al) {
        boolean z11;
        c4655jo.m23686v(i11 + 8);
        int m22460a = AbstractC4541gk.m22460a(c4655jo.m23669e());
        if ((m22460a & 1) == 0) {
            if ((m22460a & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int m23673i = c4655jo.m23673i();
            int i12 = c4321al.f17161e;
            if (m23673i == i12) {
                Arrays.fill(c4321al.f17169m, 0, m23673i, z11);
                c4321al.m20169a(c4655jo.m23665a());
                c4655jo.m23681q(c4321al.f17172p.f22891a, 0, c4321al.f17171o);
                c4321al.f17172p.m23686v(0);
                c4321al.f17173q = false;
                return;
            }
            throw new zzasz("Length mismatch: " + m23673i + ", " + i12);
        }
        throw new zzasz("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x0632, code lost:            m26345f();     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0636, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0358  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m26347h(long j11) {
        C5209yk m25198a;
        long m23678n;
        C4986sk c4986sk;
        C4467ek c4467ek;
        SparseArray sparseArray;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C4321al c4321al;
        int size;
        int i16;
        byte[] bArr2;
        long m23678n2;
        boolean z11;
        int i17;
        boolean z12;
        C4467ek c4467ek2;
        int i18;
        byte[] bArr3;
        int i19;
        C4467ek c4467ek3;
        C4321al c4321al2;
        List list;
        C4949rk c4949rk;
        int i21;
        int i22;
        int i23;
        long j12;
        int i24;
        int[] iArr;
        int[] iArr2;
        long j13;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        boolean z13;
        loop0: while (true) {
            C4986sk c4986sk2 = this;
            while (!c4986sk2.f27738h.isEmpty() && ((C4467ek) c4986sk2.f27738h.peek()).f19652P0 == j11) {
                C4467ek c4467ek4 = (C4467ek) c4986sk2.f27738h.pop();
                int i34 = c4467ek4.f20713a;
                int i35 = 12;
                int i36 = 8;
                boolean z14 = true;
                if (i34 == AbstractC4541gk.f20625C) {
                    zzauv m26344a = m26344a(c4467ek4.f19653Q0);
                    C4467ek m21732d = c4467ek4.m21732d(AbstractC4541gk.f20647N);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = m21732d.f19653Q0.size();
                    long j14 = -9223372036854775807L;
                    int i37 = 0;
                    while (i37 < size2) {
                        C4504fk c4504fk = (C4504fk) m21732d.f19653Q0.get(i37);
                        int i38 = c4504fk.f20713a;
                        if (i38 == AbstractC4541gk.f20711z) {
                            C4655jo c4655jo = c4504fk.f20142P0;
                            c4655jo.m23686v(i35);
                            Pair create = Pair.create(Integer.valueOf(c4655jo.m23669e()), new C4875pk(c4655jo.m23673i() - 1, c4655jo.m23673i(), c4655jo.m23673i(), c4655jo.m23669e()));
                            sparseArray2.put(((Integer) create.first).intValue(), (C4875pk) create.second);
                        } else if (i38 == AbstractC4541gk.f20649O) {
                            C4655jo c4655jo2 = c4504fk.f20142P0;
                            c4655jo2.m23686v(8);
                            if (AbstractC4541gk.m22461b(c4655jo2.m23669e()) == 0) {
                                m23678n = c4655jo2.m23677m();
                            } else {
                                m23678n = c4655jo2.m23678n();
                            }
                            j14 = m23678n;
                        }
                        i37++;
                        i35 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = c4467ek4.f19654R0.size();
                    for (int i39 = 0; i39 < size3; i39++) {
                        C4467ek c4467ek5 = (C4467ek) c4467ek4.f19654R0.get(i39);
                        if (c4467ek5.f20713a == AbstractC4541gk.f20629E && (m25198a = AbstractC4837ok.m25198a(c4467ek5, c4467ek4.m21733e(AbstractC4541gk.f20627D), j14, m26344a, false)) != null) {
                            sparseArray3.put(m25198a.f30970a, m25198a);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (c4986sk2.f27731a.size() == 0) {
                        for (int i41 = 0; i41 < size4; i41++) {
                            C5209yk c5209yk = (C5209yk) sparseArray3.valueAt(i41);
                            C4949rk c4949rk2 = new C4949rk(c4986sk2.f27751u.mo20591f(i41, c5209yk.f30971b));
                            c4949rk2.m26095a(c5209yk, (C4875pk) sparseArray2.get(c5209yk.f30970a));
                            c4986sk2.f27731a.put(c5209yk.f30970a, c4949rk2);
                            c4986sk2.f27746p = Math.max(c4986sk2.f27746p, c5209yk.f30974e);
                        }
                        c4986sk2.f27751u.zzb();
                    } else {
                        if (c4986sk2.f27731a.size() != size4) {
                            z14 = false;
                        }
                        AbstractC4361bo.m20613e(z14);
                        for (int i42 = 0; i42 < size4; i42++) {
                            C5209yk c5209yk2 = (C5209yk) sparseArray3.valueAt(i42);
                            ((C4949rk) c4986sk2.f27731a.get(c5209yk2.f30970a)).m26095a(c5209yk2, (C4875pk) sparseArray2.get(c5209yk2.f30970a));
                        }
                    }
                } else {
                    if (i34 == AbstractC4541gk.f20643L) {
                        SparseArray sparseArray4 = c4986sk2.f27731a;
                        byte[] bArr4 = c4986sk2.f27737g;
                        int size5 = c4467ek4.f19654R0.size();
                        int i43 = 0;
                        while (i43 < size5) {
                            C4467ek c4467ek6 = (C4467ek) c4467ek4.f19654R0.get(i43);
                            if (c4467ek6.f20713a == AbstractC4541gk.f20645M) {
                                C4655jo c4655jo3 = c4467ek6.m21733e(AbstractC4541gk.f20709y).f20142P0;
                                c4655jo3.m23686v(i36);
                                int m22460a = AbstractC4541gk.m22460a(c4655jo3.m23669e());
                                C4949rk c4949rk3 = (C4949rk) sparseArray4.get(c4655jo3.m23669e());
                                if (c4949rk3 == null) {
                                    c4949rk3 = null;
                                } else {
                                    if ((m22460a & 1) != 0) {
                                        long m23678n3 = c4655jo3.m23678n();
                                        C4321al c4321al3 = c4949rk3.f27273a;
                                        c4321al3.f17158b = m23678n3;
                                        c4321al3.f17159c = m23678n3;
                                    }
                                    C4875pk c4875pk = c4949rk3.f27276d;
                                    int m23673i = (m22460a & 2) != 0 ? c4655jo3.m23673i() - 1 : c4875pk.f26236a;
                                    if ((m22460a & 8) != 0) {
                                        i13 = c4655jo3.m23673i();
                                    } else {
                                        i13 = c4875pk.f26237b;
                                    }
                                    if ((m22460a & 16) != 0) {
                                        i14 = c4655jo3.m23673i();
                                    } else {
                                        i14 = c4875pk.f26238c;
                                    }
                                    if ((m22460a & 32) != 0) {
                                        i15 = c4655jo3.m23673i();
                                    } else {
                                        i15 = c4875pk.f26239d;
                                    }
                                    c4949rk3.f27273a.f17157a = new C4875pk(m23673i, i13, i14, i15);
                                }
                                if (c4949rk3 != null) {
                                    C4321al c4321al4 = c4949rk3.f27273a;
                                    long j15 = c4321al4.f17174r;
                                    c4949rk3.m26096b();
                                    int i44 = AbstractC4541gk.f20707x;
                                    if (c4467ek6.m21733e(i44) != null) {
                                        C4655jo c4655jo4 = c4467ek6.m21733e(i44).f20142P0;
                                        c4655jo4.m23686v(i36);
                                        if (AbstractC4541gk.m22461b(c4655jo4.m23669e()) == z14) {
                                            j15 = c4655jo4.m23678n();
                                        } else {
                                            j15 = c4655jo4.m23677m();
                                        }
                                    }
                                    List list2 = c4467ek6.f19653Q0;
                                    int size6 = list2.size();
                                    int i45 = 0;
                                    int i46 = 0;
                                    int i47 = 0;
                                    while (i47 < size6) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        C4504fk c4504fk2 = (C4504fk) list2.get(i47);
                                        int i48 = size5;
                                        long j16 = j15;
                                        if (c4504fk2.f20713a == AbstractC4541gk.f20621A) {
                                            C4655jo c4655jo5 = c4504fk2.f20142P0;
                                            c4655jo5.m23686v(12);
                                            int m23673i2 = c4655jo5.m23673i();
                                            if (m23673i2 > 0) {
                                                i45 += m23673i2;
                                                i46++;
                                            }
                                        }
                                        i47++;
                                        size5 = i48;
                                        sparseArray4 = sparseArray5;
                                        j15 = j16;
                                    }
                                    sparseArray = sparseArray4;
                                    i11 = size5;
                                    long j17 = j15;
                                    c4949rk3.f27279g = 0;
                                    c4949rk3.f27278f = 0;
                                    c4949rk3.f27277e = 0;
                                    C4321al c4321al5 = c4949rk3.f27273a;
                                    c4321al5.f17160d = i46;
                                    c4321al5.f17161e = i45;
                                    int[] iArr3 = c4321al5.f17163g;
                                    if (iArr3 == null || iArr3.length < i46) {
                                        c4321al5.f17162f = new long[i46];
                                        c4321al5.f17163g = new int[i46];
                                    }
                                    int[] iArr4 = c4321al5.f17164h;
                                    if (iArr4 == null || iArr4.length < i45) {
                                        int i49 = (i45 * 125) / 100;
                                        c4321al5.f17164h = new int[i49];
                                        c4321al5.f17165i = new int[i49];
                                        c4321al5.f17166j = new long[i49];
                                        c4321al5.f17167k = new boolean[i49];
                                        c4321al5.f17169m = new boolean[i49];
                                    }
                                    int i51 = 0;
                                    int i52 = 0;
                                    int i53 = 0;
                                    while (i51 < size6) {
                                        C4504fk c4504fk3 = (C4504fk) list2.get(i51);
                                        if (c4504fk3.f20713a == AbstractC4541gk.f20621A) {
                                            int i54 = i53 + 1;
                                            C4655jo c4655jo6 = c4504fk3.f20142P0;
                                            c4655jo6.m23686v(8);
                                            int m22460a2 = AbstractC4541gk.m22460a(c4655jo6.m23669e());
                                            C5209yk c5209yk3 = c4949rk3.f27275c;
                                            list = list2;
                                            C4321al c4321al6 = c4949rk3.f27273a;
                                            C4875pk c4875pk2 = c4321al6.f17157a;
                                            i21 = size6;
                                            c4321al6.f17163g[i53] = c4655jo6.m23673i();
                                            long[] jArr = c4321al6.f17162f;
                                            c4467ek2 = c4467ek4;
                                            long j18 = c4321al6.f17158b;
                                            jArr[i53] = j18;
                                            if ((m22460a2 & 1) != 0) {
                                                i19 = i43;
                                                c4467ek3 = c4467ek6;
                                                c4321al2 = c4321al4;
                                                jArr[i53] = j18 + c4655jo6.m23669e();
                                            } else {
                                                i19 = i43;
                                                c4467ek3 = c4467ek6;
                                                c4321al2 = c4321al4;
                                            }
                                            int i55 = m22460a2 & 4;
                                            int i56 = c4875pk2.f26239d;
                                            if (i55 != 0) {
                                                i56 = c4655jo6.m23673i();
                                            }
                                            int i57 = m22460a2 & 256;
                                            int i58 = m22460a2 & 512;
                                            int i59 = m22460a2 & 1024;
                                            int i61 = m22460a2 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                                            long[] jArr2 = c5209yk3.f30978i;
                                            if (jArr2 != null) {
                                                i22 = i56;
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i23 = i51;
                                                    j12 = AbstractC4916qo.m25834j(c5209yk3.f30979j[0], 1000L, c5209yk3.f30972c);
                                                    int[] iArr5 = c4321al6.f17164h;
                                                    int[] iArr6 = c4321al6.f17165i;
                                                    long[] jArr3 = c4321al6.f17166j;
                                                    c4949rk = c4949rk3;
                                                    boolean[] zArr = c4321al6.f17167k;
                                                    i18 = i23;
                                                    i24 = c4321al6.f17163g[i53] + i52;
                                                    long j19 = c5209yk3.f30972c;
                                                    if (i53 <= 0) {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j13 = c4321al6.f17174r;
                                                    } else {
                                                        iArr = iArr5;
                                                        iArr2 = iArr6;
                                                        j13 = j17;
                                                    }
                                                    while (i52 < i24) {
                                                        if (i57 != 0) {
                                                            i25 = c4655jo6.m23673i();
                                                        } else {
                                                            i25 = c4875pk2.f26237b;
                                                        }
                                                        if (i58 != 0) {
                                                            i26 = i24;
                                                            i27 = c4655jo6.m23673i();
                                                        } else {
                                                            i26 = i24;
                                                            i27 = c4875pk2.f26238c;
                                                        }
                                                        if (i52 == 0) {
                                                            if (i55 != 0) {
                                                                i28 = i55;
                                                                i29 = i22;
                                                                i52 = 0;
                                                                if (i61 == 0) {
                                                                    i31 = i57;
                                                                    i32 = i58;
                                                                    i33 = i59;
                                                                    iArr2[i52] = (int) ((c4655jo6.m23669e() * 1000) / j19);
                                                                } else {
                                                                    i31 = i57;
                                                                    i32 = i58;
                                                                    i33 = i59;
                                                                    iArr2[i52] = 0;
                                                                }
                                                                jArr3[i52] = AbstractC4916qo.m25834j(j13, 1000L, j19) - j12;
                                                                iArr[i52] = i27;
                                                                if (1 == (((i29 >> 16) & 1) ^ 1)) {
                                                                    z13 = false;
                                                                } else {
                                                                    z13 = true;
                                                                }
                                                                zArr[i52] = z13;
                                                                j13 += i25;
                                                                i52++;
                                                                i24 = i26;
                                                                i55 = i28;
                                                                i57 = i31;
                                                                i58 = i32;
                                                                i59 = i33;
                                                            } else {
                                                                i52 = 0;
                                                            }
                                                        }
                                                        if (i59 != 0) {
                                                            i28 = i55;
                                                            i29 = c4655jo6.m23669e();
                                                        } else {
                                                            i28 = i55;
                                                            i29 = c4875pk2.f26239d;
                                                        }
                                                        if (i61 == 0) {
                                                        }
                                                        jArr3[i52] = AbstractC4916qo.m25834j(j13, 1000L, j19) - j12;
                                                        iArr[i52] = i27;
                                                        if (1 == (((i29 >> 16) & 1) ^ 1)) {
                                                        }
                                                        zArr[i52] = z13;
                                                        j13 += i25;
                                                        i52++;
                                                        i24 = i26;
                                                        i55 = i28;
                                                        i57 = i31;
                                                        i58 = i32;
                                                        i59 = i33;
                                                    }
                                                    c4321al6.f17174r = j13;
                                                    i53 = i54;
                                                    i52 = i24;
                                                }
                                            } else {
                                                i22 = i56;
                                                bArr3 = bArr4;
                                            }
                                            i23 = i51;
                                            j12 = 0;
                                            int[] iArr52 = c4321al6.f17164h;
                                            int[] iArr62 = c4321al6.f17165i;
                                            long[] jArr32 = c4321al6.f17166j;
                                            c4949rk = c4949rk3;
                                            boolean[] zArr2 = c4321al6.f17167k;
                                            i18 = i23;
                                            i24 = c4321al6.f17163g[i53] + i52;
                                            long j192 = c5209yk3.f30972c;
                                            if (i53 <= 0) {
                                            }
                                            while (i52 < i24) {
                                            }
                                            c4321al6.f17174r = j13;
                                            i53 = i54;
                                            i52 = i24;
                                        } else {
                                            c4467ek2 = c4467ek4;
                                            i18 = i51;
                                            bArr3 = bArr4;
                                            i19 = i43;
                                            c4467ek3 = c4467ek6;
                                            c4321al2 = c4321al4;
                                            list = list2;
                                            c4949rk = c4949rk3;
                                            i21 = size6;
                                        }
                                        i51 = i18 + 1;
                                        list2 = list;
                                        size6 = i21;
                                        c4467ek4 = c4467ek2;
                                        i43 = i19;
                                        c4467ek6 = c4467ek3;
                                        c4321al4 = c4321al2;
                                        bArr4 = bArr3;
                                        c4949rk3 = c4949rk;
                                    }
                                    c4467ek = c4467ek4;
                                    byte[] bArr5 = bArr4;
                                    i12 = i43;
                                    C4321al c4321al7 = c4321al4;
                                    C4949rk c4949rk4 = c4949rk3;
                                    C4504fk m21733e = c4467ek6.m21733e(AbstractC4541gk.f20668d0);
                                    if (m21733e != null) {
                                        c4321al = c4321al7;
                                        C5246zk c5246zk = c4949rk4.f27275c.f30977h[c4321al.f17157a.f26236a];
                                        C4655jo c4655jo7 = m21733e.f20142P0;
                                        int i62 = c5246zk.f31540a;
                                        c4655jo7.m23686v(8);
                                        if ((AbstractC4541gk.m22460a(c4655jo7.m23669e()) & 1) == 1) {
                                            c4655jo7.m23687w(8);
                                        }
                                        int m23671g = c4655jo7.m23671g();
                                        int m23673i3 = c4655jo7.m23673i();
                                        int i63 = c4321al.f17161e;
                                        if (m23673i3 == i63) {
                                            if (m23671g == 0) {
                                                boolean[] zArr3 = c4321al.f17169m;
                                                i17 = 0;
                                                for (int i64 = 0; i64 < m23673i3; i64++) {
                                                    int m23671g2 = c4655jo7.m23671g();
                                                    i17 += m23671g2;
                                                    if (m23671g2 > i62) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    zArr3[i64] = z12;
                                                }
                                            } else {
                                                if (m23671g > i62) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                i17 = m23671g * m23673i3;
                                                Arrays.fill(c4321al.f17169m, 0, m23673i3, z11);
                                            }
                                            c4321al.m20169a(i17);
                                        } else {
                                            throw new zzasz("Length mismatch: " + m23673i3 + ", " + i63);
                                        }
                                    } else {
                                        c4321al = c4321al7;
                                    }
                                    C4504fk m21733e2 = c4467ek6.m21733e(AbstractC4541gk.f20670e0);
                                    if (m21733e2 != null) {
                                        C4655jo c4655jo8 = m21733e2.f20142P0;
                                        c4655jo8.m23686v(8);
                                        int m23669e = c4655jo8.m23669e();
                                        if ((AbstractC4541gk.m22460a(m23669e) & 1) == 1) {
                                            c4655jo8.m23687w(8);
                                        }
                                        int m23673i4 = c4655jo8.m23673i();
                                        if (m23673i4 == 1) {
                                            long j21 = c4321al.f17159c;
                                            if (AbstractC4541gk.m22461b(m23669e) == 0) {
                                                m23678n2 = c4655jo8.m23677m();
                                            } else {
                                                m23678n2 = c4655jo8.m23678n();
                                            }
                                            c4321al.f17159c = j21 + m23678n2;
                                        } else {
                                            throw new zzasz("Unexpected saio entry count: " + m23673i4);
                                        }
                                    }
                                    C4504fk m21733e3 = c4467ek6.m21733e(AbstractC4541gk.f20678i0);
                                    if (m21733e3 != null) {
                                        m26346g(m21733e3.f20142P0, 0, c4321al);
                                    }
                                    C4504fk m21733e4 = c4467ek6.m21733e(AbstractC4541gk.f20672f0);
                                    C4504fk m21733e5 = c4467ek6.m21733e(AbstractC4541gk.f20674g0);
                                    if (m21733e4 != null && m21733e5 != null) {
                                        C4655jo c4655jo9 = m21733e4.f20142P0;
                                        C4655jo c4655jo10 = m21733e5.f20142P0;
                                        c4655jo9.m23686v(8);
                                        int m23669e2 = c4655jo9.m23669e();
                                        int m23669e3 = c4655jo9.m23669e();
                                        int i65 = f27729x;
                                        if (m23669e3 == i65) {
                                            if (AbstractC4541gk.m22461b(m23669e2) == 1) {
                                                c4655jo9.m23687w(4);
                                            }
                                            if (c4655jo9.m23669e() == 1) {
                                                c4655jo10.m23686v(8);
                                                int m23669e4 = c4655jo10.m23669e();
                                                if (c4655jo10.m23669e() == i65) {
                                                    int m22461b = AbstractC4541gk.m22461b(m23669e4);
                                                    if (m22461b == 1) {
                                                        if (c4655jo10.m23677m() == 0) {
                                                            throw new zzasz("Variable length decription in sgpd found (unsupported)");
                                                        }
                                                    } else if (m22461b >= 2) {
                                                        c4655jo10.m23687w(4);
                                                    }
                                                    if (c4655jo10.m23677m() == 1) {
                                                        c4655jo10.m23687w(2);
                                                        if (c4655jo10.m23671g() == 1) {
                                                            int m23671g3 = c4655jo10.m23671g();
                                                            byte[] bArr6 = new byte[16];
                                                            c4655jo10.m23681q(bArr6, 0, 16);
                                                            c4321al.f17168l = true;
                                                            c4321al.f17170n = new C5246zk(true, m23671g3, bArr6);
                                                        }
                                                        size = c4467ek6.f19653Q0.size();
                                                        i16 = 0;
                                                        while (i16 < size) {
                                                            C4504fk c4504fk4 = (C4504fk) c4467ek6.f19653Q0.get(i16);
                                                            if (c4504fk4.f20713a == AbstractC4541gk.f20676h0) {
                                                                C4655jo c4655jo11 = c4504fk4.f20142P0;
                                                                c4655jo11.m23686v(8);
                                                                bArr2 = bArr5;
                                                                c4655jo11.m23681q(bArr2, 0, 16);
                                                                if (Arrays.equals(bArr2, f27730y)) {
                                                                    m26346g(c4655jo11, 16, c4321al);
                                                                }
                                                            } else {
                                                                bArr2 = bArr5;
                                                            }
                                                            i16++;
                                                            bArr5 = bArr2;
                                                        }
                                                        bArr = bArr5;
                                                        i36 = 8;
                                                        i43 = i12 + 1;
                                                        bArr4 = bArr;
                                                        size5 = i11;
                                                        sparseArray4 = sparseArray;
                                                        c4467ek4 = c4467ek;
                                                        z14 = true;
                                                    } else {
                                                        throw new zzasz("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                }
                                            } else {
                                                throw new zzasz("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                    }
                                    size = c4467ek6.f19653Q0.size();
                                    i16 = 0;
                                    while (i16 < size) {
                                    }
                                    bArr = bArr5;
                                    i36 = 8;
                                    i43 = i12 + 1;
                                    bArr4 = bArr;
                                    size5 = i11;
                                    sparseArray4 = sparseArray;
                                    c4467ek4 = c4467ek;
                                    z14 = true;
                                }
                            }
                            c4467ek = c4467ek4;
                            sparseArray = sparseArray4;
                            bArr = bArr4;
                            i11 = size5;
                            i12 = i43;
                            i43 = i12 + 1;
                            bArr4 = bArr;
                            size5 = i11;
                            sparseArray4 = sparseArray;
                            c4467ek4 = c4467ek;
                            z14 = true;
                        }
                        zzauv m26344a2 = m26344a(c4467ek4.f19653Q0);
                        if (m26344a2 != null) {
                            c4986sk = this;
                            int size7 = c4986sk.f27731a.size();
                            for (int i66 = 0; i66 < size7; i66++) {
                                C4949rk c4949rk5 = (C4949rk) c4986sk.f27731a.valueAt(i66);
                                c4949rk5.f27274b.mo25798d(c4949rk5.f27275c.f30975f.m28688c(m26344a2));
                            }
                        }
                    } else {
                        c4986sk = c4986sk2;
                        if (!c4986sk.f27738h.isEmpty()) {
                            ((C4467ek) c4986sk.f27738h.peek()).m21734f(c4467ek4);
                        }
                    }
                    c4986sk2 = c4986sk;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x0078, code lost:            r2 = r24.f27747q;        r3 = r2.f27273a;        r5 = r3.f17164h;        r9 = r2.f27277e;        r5 = r5[r9];        r24.f27748r = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0086, code lost:            if (r3.f17168l == false) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0088, code lost:            r5 = r3.f17172p;        r10 = r3.f17157a.f26236a;        r11 = r3.f17170n;     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0090, code lost:            if (r11 == null) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0093, code lost:            r11 = r2.f27275c.f30977h[r10];     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0099, code lost:            r10 = r11.f31540a;        r3 = r3.f17169m[r9];        r9 = r24.f27735e;        r11 = r9.f22891a;     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00a3, code lost:            if (true == r3) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00a5, code lost:            r12 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x00a9, code lost:            r11[0] = (byte) (r12 | r10);        r9.m23686v(0);        r2 = r2.f27274b;        r2.mo25796b(r24.f27735e, 1);        r2.mo25796b(r5, r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00ba, code lost:            if (r3 != false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00bc, code lost:            r10 = r10 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x00ce, code lost:            r24.f27749s = r10;        r5 = r24.f27748r + r10;        r24.f27748r = r5;     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x00df, code lost:            if (r24.f27747q.f27275c.f30976g != 1) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x00e1, code lost:            r24.f27748r = r5 - 8;        r1.m22922i(8, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00e8, code lost:            r24.f27740j = 4;        r24.f27750t = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x00ed, code lost:            r2 = r24.f27747q;        r3 = r2.f27273a;        r5 = r2.f27275c;        r9 = r2.f27274b;        r2 = r2.f27277e;        r6 = r5.f30980k;     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x00f9, code lost:            if (r6 != 0) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x00fb, code lost:            r4 = r24.f27749s;        r6 = r24.f27748r;     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x00ff, code lost:            if (r4 >= r6) goto L301;     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0101, code lost:            r24.f27749s += r9.mo25797c(r1, r6 - r4, false);     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0162, code lost:            r10 = (r3.f17166j[r2] + r3.f17165i[r2]) * 1000;        r1 = r3.f17168l;     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0172, code lost:            if (true == r1) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0174, code lost:            r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0178, code lost:            r12 = r4 | (r3.f17167k[r2] ? 1 : 0);     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x017e, code lost:            if (r1 == false) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0180, code lost:            r1 = r3.f17170n;     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0182, code lost:            if (r1 != null) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0184, code lost:            r1 = r5.f30977h[r3.f17157a.f26236a];     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x018c, code lost:            r2 = r24.f27747q;     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0190, code lost:            if (r1 == r2.f27281i) goto L75;     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0192, code lost:            r2 = new com.google.android.gms.internal.ads.C4948rj(1, r1.f31541b);     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0199, code lost:            r15 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x01a0, code lost:            r2 = r24.f27747q;        r2.f27280h = r15;        r2.f27281i = r1;        r9.mo25795a(r10, r12, r24.f27748r, 0, r15);     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01b2, code lost:            if (r24.f27739i.isEmpty() == false) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x01b4, code lost:            r1 = r24.f27747q;        r1.f27277e++;        r2 = r1.f27278f + 1;        r1.f27278f = r2;        r3 = r3.f17163g;        r4 = r1.f27279g;     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x01c6, code lost:            if (r2 != r3[r4]) goto L82;     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x01c8, code lost:            r1.f27279g = r4 + 1;        r1.f27278f = 0;        r24.f27747q = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x01d0, code lost:            r24.f27740j = 3;     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x01d3, code lost:            return 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x01d4, code lost:            p664y.AbstractC30228a.m149044a(r24.f27739i.removeFirst());     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x01de, code lost:            throw null;     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x019b, code lost:            r2 = r2.f27280h;     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x019e, code lost:            r1 = null;        r15 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0176, code lost:            r4 = 1073741824;     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x010c, code lost:            r10 = r24.f27733c.f22891a;        r10[0] = 0;        r10[1] = 0;        r10[2] = 0;        r4 = r6 + 1;        r6 = 4 - r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x011f, code lost:            if (r24.f27749s >= r24.f27748r) goto L303;     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0121, code lost:            r11 = r24.f27750t;     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0123, code lost:            if (r11 != 0) goto L302;     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0153, code lost:            r11 = r9.mo25797c(r1, r11, false);        r24.f27749s += r11;        r24.f27750t -= r11;     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0125, code lost:            r1.m22921h(r10, r6, r4, false);        r24.f27733c.m23686v(0);        r24.f27750t = r24.f27733c.m23673i() - 1;        r24.f27732b.m23686v(0);        r9.mo25796b(r24.f27732b, 4);        r9.mo25796b(r24.f27733c, 1);        r24.f27749s += 5;        r24.f27748r += r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x00be, code lost:            r3 = r5.m23674j();        r5.m23687w(-2);        r3 = (r3 * 6) + 2;        r2.mo25796b(r5, r3);        r10 = (r10 + 1) + r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x00a7, code lost:            r12 = 128;     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x00d7, code lost:            r24.f27749s = 0;     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo20543b(C4577hj c4577hj, C4836oj c4836oj) {
        long m23678n;
        long m23678n2;
        C4577hj c4577hj2 = c4577hj;
        while (true) {
            int i11 = this.f27740j;
            int i12 = 0;
            if (i11 != 0) {
                if (i11 != 1) {
                    long j11 = Long.MAX_VALUE;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            break;
                        }
                        if (this.f27747q != null) {
                            break;
                        }
                        SparseArray sparseArray = this.f27731a;
                        int size = sparseArray.size();
                        C4949rk c4949rk = null;
                        for (int i13 = 0; i13 < size; i13++) {
                            C4949rk c4949rk2 = (C4949rk) sparseArray.valueAt(i13);
                            int i14 = c4949rk2.f27279g;
                            C4321al c4321al = c4949rk2.f27273a;
                            if (i14 != c4321al.f17160d) {
                                long j12 = c4321al.f17162f[i14];
                                if (j12 < j11) {
                                    c4949rk = c4949rk2;
                                    j11 = j12;
                                }
                            }
                        }
                        if (c4949rk == null) {
                            int m22917d = (int) (this.f27745o - c4577hj.m22917d());
                            if (m22917d >= 0) {
                                c4577hj2.m22922i(m22917d, false);
                                m26345f();
                            } else {
                                throw new zzasz("Offset to end of mdat was negative.");
                            }
                        } else {
                            int m22917d2 = (int) (c4949rk.f27273a.f17162f[c4949rk.f27279g] - c4577hj.m22917d());
                            if (m22917d2 < 0) {
                                m22917d2 = 0;
                            }
                            c4577hj2.m22922i(m22917d2, false);
                            this.f27747q = c4949rk;
                        }
                    } else {
                        int size2 = this.f27731a.size();
                        C4949rk c4949rk3 = null;
                        for (int i15 = 0; i15 < size2; i15++) {
                            C4321al c4321al2 = ((C4949rk) this.f27731a.valueAt(i15)).f27273a;
                            if (c4321al2.f17173q) {
                                long j13 = c4321al2.f17159c;
                                if (j13 < j11) {
                                    c4949rk3 = (C4949rk) this.f27731a.valueAt(i15);
                                    j11 = j13;
                                }
                            }
                        }
                        if (c4949rk3 == null) {
                            this.f27740j = 3;
                        } else {
                            int m22917d3 = (int) (j11 - c4577hj.m22917d());
                            if (m22917d3 >= 0) {
                                c4577hj2.m22922i(m22917d3, false);
                                C4321al c4321al3 = c4949rk3.f27273a;
                                c4577hj2.m22921h(c4321al3.f17172p.f22891a, 0, c4321al3.f17171o, false);
                                c4321al3.f17172p.m23686v(0);
                                c4321al3.f17173q = false;
                            } else {
                                throw new zzasz("Offset to encryption data was negative.");
                            }
                        }
                    }
                } else {
                    int i16 = ((int) this.f27742l) - this.f27743m;
                    C4655jo c4655jo = this.f27744n;
                    if (c4655jo != null) {
                        c4577hj2.m22921h(c4655jo.f22891a, 8, i16, false);
                        C4504fk c4504fk = new C4504fk(this.f27741k, this.f27744n);
                        long m22917d4 = c4577hj.m22917d();
                        if (!this.f27738h.isEmpty()) {
                            ((C4467ek) this.f27738h.peek()).m21735g(c4504fk);
                        } else {
                            if (c4504fk.f20713a == AbstractC4541gk.f20623B) {
                                C4655jo c4655jo2 = c4504fk.f20142P0;
                                c4655jo2.m23686v(8);
                                int m23669e = c4655jo2.m23669e();
                                c4655jo2.m23687w(4);
                                long m23677m = c4655jo2.m23677m();
                                if (AbstractC4541gk.m22461b(m23669e) == 0) {
                                    m23678n = c4655jo2.m23677m();
                                    m23678n2 = c4655jo2.m23677m();
                                } else {
                                    m23678n = c4655jo2.m23678n();
                                    m23678n2 = c4655jo2.m23678n();
                                }
                                long j14 = m22917d4 + m23678n2;
                                long j15 = m23678n;
                                long m25834j = AbstractC4916qo.m25834j(j15, 1000000L, m23677m);
                                c4655jo2.m23687w(2);
                                int m23674j = c4655jo2.m23674j();
                                int[] iArr = new int[m23674j];
                                long[] jArr = new long[m23674j];
                                long[] jArr2 = new long[m23674j];
                                long[] jArr3 = new long[m23674j];
                                long j16 = m25834j;
                                while (i12 < m23674j) {
                                    int m23669e2 = c4655jo2.m23669e();
                                    if ((m23669e2 & Integer.MIN_VALUE) == 0) {
                                        long m23677m2 = c4655jo2.m23677m();
                                        iArr[i12] = m23669e2 & Integer.MAX_VALUE;
                                        jArr[i12] = j14;
                                        jArr3[i12] = j16;
                                        j15 += m23677m2;
                                        int i17 = m23674j;
                                        long[] jArr4 = jArr2;
                                        long[] jArr5 = jArr3;
                                        j16 = AbstractC4916qo.m25834j(j15, 1000000L, m23677m);
                                        jArr4[i12] = j16 - jArr5[i12];
                                        c4655jo2.m23687w(4);
                                        j14 += iArr[i12];
                                        i12++;
                                        jArr = jArr;
                                        jArr3 = jArr5;
                                        jArr2 = jArr4;
                                        m23674j = i17;
                                    } else {
                                        throw new zzasz("Unhandled indirect reference");
                                    }
                                }
                                Pair create = Pair.create(Long.valueOf(m25834j), new C4540gj(iArr, jArr, jArr2, jArr3));
                                ((Long) create.first).longValue();
                                this.f27751u.mo20587b((InterfaceC4911qj) create.second);
                                this.f27752v = true;
                            }
                            c4577hj2 = c4577hj;
                        }
                    } else {
                        c4577hj2.m22922i(i16, false);
                    }
                    m26347h(c4577hj.m22917d());
                }
            } else {
                if (this.f27743m == 0) {
                    if (!c4577hj2.m22921h(this.f27736f.f22891a, 0, 8, true)) {
                        return -1;
                    }
                    this.f27743m = 8;
                    this.f27736f.m23686v(0);
                    this.f27742l = this.f27736f.m23677m();
                    this.f27741k = this.f27736f.m23669e();
                }
                long j17 = this.f27742l;
                if (j17 == 1) {
                    c4577hj2.m22921h(this.f27736f.f22891a, 8, 8, false);
                    this.f27743m += 8;
                    j17 = this.f27736f.m23678n();
                    this.f27742l = j17;
                }
                long j18 = this.f27743m;
                if (j17 >= j18) {
                    long m22917d5 = c4577hj.m22917d() - j18;
                    if (this.f27741k == AbstractC4541gk.f20643L) {
                        int size3 = this.f27731a.size();
                        for (int i18 = 0; i18 < size3; i18++) {
                            C4321al c4321al4 = ((C4949rk) this.f27731a.valueAt(i18)).f27273a;
                            c4321al4.f17159c = m22917d5;
                            c4321al4.f17158b = m22917d5;
                        }
                    }
                    int i19 = this.f27741k;
                    if (i19 == AbstractC4541gk.f20677i) {
                        this.f27747q = null;
                        this.f27745o = m22917d5 + this.f27742l;
                        if (!this.f27752v) {
                            this.f27751u.mo20587b(new C4874pj(this.f27746p));
                            this.f27752v = true;
                        }
                        this.f27740j = 2;
                    } else if (i19 != AbstractC4541gk.f20625C && i19 != AbstractC4541gk.f20629E && i19 != AbstractC4541gk.f20631F && i19 != AbstractC4541gk.f20633G && i19 != AbstractC4541gk.f20635H && i19 != AbstractC4541gk.f20643L && i19 != AbstractC4541gk.f20645M && i19 != AbstractC4541gk.f20647N && i19 != AbstractC4541gk.f20652Q) {
                        if (i19 != AbstractC4541gk.f20655T && i19 != AbstractC4541gk.f20654S && i19 != AbstractC4541gk.f20627D && i19 != AbstractC4541gk.f20623B && i19 != AbstractC4541gk.f20656U && i19 != AbstractC4541gk.f20707x && i19 != AbstractC4541gk.f20709y && i19 != AbstractC4541gk.f20651P && i19 != AbstractC4541gk.f20711z && i19 != AbstractC4541gk.f20621A && i19 != AbstractC4541gk.f20657V && i19 != AbstractC4541gk.f20668d0 && i19 != AbstractC4541gk.f20670e0 && i19 != AbstractC4541gk.f20678i0 && i19 != AbstractC4541gk.f20676h0 && i19 != AbstractC4541gk.f20672f0 && i19 != AbstractC4541gk.f20674g0 && i19 != AbstractC4541gk.f20653R && i19 != AbstractC4541gk.f20649O && i19 != AbstractC4541gk.f20634G0) {
                            if (this.f27742l <= 2147483647L) {
                                this.f27744n = null;
                                this.f27740j = 1;
                            } else {
                                throw new zzasz("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        } else if (this.f27743m == 8) {
                            long j19 = this.f27742l;
                            if (j19 <= 2147483647L) {
                                C4655jo c4655jo3 = new C4655jo((int) j19);
                                this.f27744n = c4655jo3;
                                System.arraycopy(this.f27736f.f22891a, 0, c4655jo3.f22891a, 0, 8);
                                this.f27740j = 1;
                            } else {
                                throw new zzasz("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw new zzasz("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else {
                        long m22917d6 = (c4577hj.m22917d() + this.f27742l) - 8;
                        this.f27738h.add(new C4467ek(i19, m22917d6));
                        if (this.f27742l == this.f27743m) {
                            m26347h(m22917d6);
                        } else {
                            m26345f();
                        }
                    }
                } else {
                    throw new zzasz("Atom size less than header length (unsupported).");
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: c */
    public final void mo20544c(long j11, long j12) {
        int size = this.f27731a.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C4949rk) this.f27731a.valueAt(i11)).m26096b();
        }
        this.f27739i.clear();
        this.f27738h.clear();
        m26345f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: d */
    public final void mo20545d(InterfaceC4687kj interfaceC4687kj) {
        this.f27751u = interfaceC4687kj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: e */
    public final boolean mo20546e(C4577hj c4577hj) {
        return AbstractC5172xk.m27895a(c4577hj);
    }
}
