package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.wk */
/* loaded from: classes2.dex */
public final class C5135wk implements InterfaceC4614ij, InterfaceC4911qj {

    /* renamed from: p */
    public static final InterfaceC4724lj f29953p = new C5060uk();

    /* renamed from: q */
    private static final int f29954q = AbstractC4916qo.m25831g("qt  ");

    /* renamed from: e */
    private int f29959e;

    /* renamed from: f */
    private int f29960f;

    /* renamed from: g */
    private long f29961g;

    /* renamed from: h */
    private int f29962h;

    /* renamed from: i */
    private C4655jo f29963i;

    /* renamed from: j */
    private int f29964j;

    /* renamed from: k */
    private int f29965k;

    /* renamed from: l */
    private InterfaceC4687kj f29966l;

    /* renamed from: m */
    private C5097vk[] f29967m;

    /* renamed from: n */
    private long f29968n;

    /* renamed from: o */
    private boolean f29969o;

    /* renamed from: c */
    private final C4655jo f29957c = new C4655jo(16);

    /* renamed from: d */
    private final Stack f29958d = new Stack();

    /* renamed from: a */
    private final C4655jo f29955a = new C4655jo(AbstractC4582ho.f21849a);

    /* renamed from: b */
    private final C4655jo f29956b = new C4655jo(4);

    /* renamed from: f */
    private final void m27639f() {
        this.f29959e = 0;
        this.f29962h = 0;
    }

    /* renamed from: g */
    private final void m27640g(long j11) {
        zzaxh zzaxhVar;
        C4799nj c4799nj;
        zzaxh zzaxhVar2;
        C5209yk m25198a;
        while (!this.f29958d.isEmpty() && ((C4467ek) this.f29958d.peek()).f19652P0 == j11) {
            C4467ek c4467ek = (C4467ek) this.f29958d.pop();
            if (c4467ek.f20713a == AbstractC4541gk.f20625C) {
                ArrayList arrayList = new ArrayList();
                C4799nj c4799nj2 = new C4799nj();
                C4504fk m21733e = c4467ek.m21733e(AbstractC4541gk.f20622A0);
                if (m21733e != null) {
                    zzaxhVar = AbstractC4837ok.m25200c(m21733e, this.f29969o);
                    if (zzaxhVar != null) {
                        c4799nj2.m24931b(zzaxhVar);
                    }
                } else {
                    zzaxhVar = null;
                }
                long j12 = -9223372036854775807L;
                long j13 = Long.MAX_VALUE;
                int i11 = 0;
                while (i11 < c4467ek.f19654R0.size()) {
                    C4467ek c4467ek2 = (C4467ek) c4467ek.f19654R0.get(i11);
                    if (c4467ek2.f20713a == AbstractC4541gk.f20629E && (m25198a = AbstractC4837ok.m25198a(c4467ek2, c4467ek.m21733e(AbstractC4541gk.f20627D), -9223372036854775807L, null, this.f29969o)) != null) {
                        C4358bl m25199b = AbstractC4837ok.m25199b(m25198a, c4467ek2.m21732d(AbstractC4541gk.f20631F).m21732d(AbstractC4541gk.f20633G).m21732d(AbstractC4541gk.f20635H), c4799nj2);
                        if (m25199b.f17851a != 0) {
                            C5097vk c5097vk = new C5097vk(m25198a, m25199b, this.f29966l.mo20591f(i11, m25198a.f30971b));
                            zzasw m28690e = m25198a.f30975f.m28690e(m25199b.f17854d + 30);
                            if (m25198a.f30971b == 1) {
                                if (c4799nj2.m24930a()) {
                                    m28690e = m28690e.m28689d(c4799nj2.f25211a, c4799nj2.f25212b);
                                }
                                if (zzaxhVar != null) {
                                    m28690e = m28690e.m28691f(zzaxhVar);
                                }
                            }
                            c5097vk.f29378c.mo25798d(m28690e);
                            c4799nj = c4799nj2;
                            zzaxhVar2 = zzaxhVar;
                            long max = Math.max(j12, m25198a.f30974e);
                            arrayList.add(c5097vk);
                            long j14 = m25199b.f17852b[0];
                            if (j14 < j13) {
                                j12 = max;
                                j13 = j14;
                            } else {
                                j12 = max;
                            }
                            i11++;
                            c4799nj2 = c4799nj;
                            zzaxhVar = zzaxhVar2;
                        }
                    }
                    c4799nj = c4799nj2;
                    zzaxhVar2 = zzaxhVar;
                    i11++;
                    c4799nj2 = c4799nj;
                    zzaxhVar = zzaxhVar2;
                }
                this.f29968n = j12;
                this.f29967m = (C5097vk[]) arrayList.toArray(new C5097vk[arrayList.size()]);
                this.f29966l.zzb();
                this.f29966l.mo20587b(this);
                this.f29958d.clear();
                this.f29959e = 2;
            } else if (!this.f29958d.isEmpty()) {
                ((C4467ek) this.f29958d.peek()).m21734f(c4467ek);
            }
        }
        if (this.f29959e != 2) {
            m27639f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    /* renamed from: a */
    public final long mo22451a(long j11) {
        long j12 = Long.MAX_VALUE;
        for (C5097vk c5097vk : this.f29967m) {
            C4358bl c4358bl = c5097vk.f29377b;
            int m20566a = c4358bl.m20566a(j11);
            if (m20566a == -1) {
                m20566a = c4358bl.m20567b(j11);
            }
            long j13 = c4358bl.f17852b[m20566a];
            if (j13 < j12) {
                j12 = j13;
            }
        }
        return j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: b */
    public final int mo20543b(C4577hj c4577hj, C4836oj c4836oj) {
        C5097vk[] c5097vkArr;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        while (true) {
            int i11 = this.f29959e;
            if (i11 != 0) {
                if (i11 != 1) {
                    long j11 = Long.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        c5097vkArr = this.f29967m;
                        if (i12 >= c5097vkArr.length) {
                            break;
                        }
                        C5097vk c5097vk = c5097vkArr[i12];
                        int i14 = c5097vk.f29379d;
                        C4358bl c4358bl = c5097vk.f29377b;
                        if (i14 != c4358bl.f17851a) {
                            long j12 = c4358bl.f17852b[i14];
                            if (j12 < j11) {
                                i13 = i12;
                                j11 = j12;
                            }
                        }
                        i12++;
                    }
                    if (i13 == -1) {
                        return -1;
                    }
                    C5097vk c5097vk2 = c5097vkArr[i13];
                    InterfaceC4985sj interfaceC4985sj = c5097vk2.f29378c;
                    int i15 = c5097vk2.f29379d;
                    C4358bl c4358bl2 = c5097vk2.f29377b;
                    long j13 = c4358bl2.f17852b[i15];
                    int i16 = c4358bl2.f17853c[i15];
                    if (c5097vk2.f29376a.f30976g == 1) {
                        j13 += 8;
                        i16 -= 8;
                    }
                    long m22917d = (j13 - c4577hj.m22917d()) + this.f29964j;
                    if (m22917d >= 0 && m22917d < 262144) {
                        int i17 = (int) m22917d;
                        boolean z15 = false;
                        c4577hj.m22922i(i17, false);
                        int i18 = c5097vk2.f29376a.f30980k;
                        if (i18 == 0) {
                            while (true) {
                                int i19 = this.f29964j;
                                if (i19 >= i16) {
                                    break;
                                }
                                int mo25797c = interfaceC4985sj.mo25797c(c4577hj, i16 - i19, false);
                                this.f29964j += mo25797c;
                                this.f29965k -= mo25797c;
                            }
                        } else {
                            byte[] bArr = this.f29956b.f22891a;
                            bArr[0] = 0;
                            bArr[1] = 0;
                            bArr[2] = 0;
                            int i21 = 4 - i18;
                            while (this.f29964j < i16) {
                                int i22 = this.f29965k;
                                if (i22 == 0) {
                                    c4577hj.m22921h(this.f29956b.f22891a, i21, i18, z15);
                                    this.f29956b.m23686v(z15 ? 1 : 0);
                                    this.f29965k = this.f29956b.m23673i();
                                    this.f29955a.m23686v(z15 ? 1 : 0);
                                    interfaceC4985sj.mo25796b(this.f29955a, 4);
                                    this.f29964j += 4;
                                    i16 += i21;
                                } else {
                                    int mo25797c2 = interfaceC4985sj.mo25797c(c4577hj, i22, z15);
                                    this.f29964j += mo25797c2;
                                    this.f29965k -= mo25797c2;
                                    z15 = false;
                                }
                            }
                        }
                        int i23 = i16;
                        C4358bl c4358bl3 = c5097vk2.f29377b;
                        interfaceC4985sj.mo25795a(c4358bl3.f17855e[i15], c4358bl3.f17856f[i15], i23, 0, null);
                        c5097vk2.f29379d++;
                        this.f29964j = 0;
                        this.f29965k = 0;
                        return 0;
                    }
                    c4836oj.f25657a = j13;
                    return 1;
                }
                long j14 = this.f29961g;
                int i24 = this.f29962h;
                long j15 = j14 - i24;
                long m22917d2 = c4577hj.m22917d() + j15;
                C4655jo c4655jo = this.f29963i;
                if (c4655jo != null) {
                    c4577hj.m22921h(c4655jo.f22891a, i24, (int) j15, false);
                    if (this.f29960f == AbstractC4541gk.f20663b) {
                        C4655jo c4655jo2 = this.f29963i;
                        c4655jo2.m23686v(8);
                        if (c4655jo2.m23669e() != f29954q) {
                            c4655jo2.m23687w(4);
                            while (c4655jo2.m23665a() > 0) {
                                if (c4655jo2.m23669e() == f29954q) {
                                }
                            }
                            z12 = false;
                            this.f29969o = z12;
                        }
                        z12 = true;
                        this.f29969o = z12;
                    } else if (!this.f29958d.isEmpty()) {
                        ((C4467ek) this.f29958d.peek()).m21735g(new C4504fk(this.f29960f, this.f29963i));
                    }
                } else if (j15 < 262144) {
                    c4577hj.m22922i((int) j15, false);
                } else {
                    c4836oj.f25657a = c4577hj.m22917d() + j15;
                    z11 = true;
                    m27640g(m22917d2);
                    if (z11 && this.f29959e != 2) {
                        return 1;
                    }
                }
                z11 = false;
                m27640g(m22917d2);
                if (z11) {
                    return 1;
                }
                continue;
            } else {
                if (this.f29962h == 0) {
                    if (!c4577hj.m22921h(this.f29957c.f22891a, 0, 8, true)) {
                        return -1;
                    }
                    this.f29962h = 8;
                    this.f29957c.m23686v(0);
                    this.f29961g = this.f29957c.m23677m();
                    this.f29960f = this.f29957c.m23669e();
                }
                if (this.f29961g == 1) {
                    c4577hj.m22921h(this.f29957c.f22891a, 8, 8, false);
                    this.f29962h += 8;
                    this.f29961g = this.f29957c.m23678n();
                }
                int i25 = this.f29960f;
                if (i25 != AbstractC4541gk.f20625C && i25 != AbstractC4541gk.f20629E && i25 != AbstractC4541gk.f20631F && i25 != AbstractC4541gk.f20633G && i25 != AbstractC4541gk.f20635H && i25 != AbstractC4541gk.f20652Q) {
                    if (i25 != AbstractC4541gk.f20654S && i25 != AbstractC4541gk.f20627D && i25 != AbstractC4541gk.f20655T && i25 != AbstractC4541gk.f20656U && i25 != AbstractC4541gk.f20686m0 && i25 != AbstractC4541gk.f20688n0 && i25 != AbstractC4541gk.f20690o0 && i25 != AbstractC4541gk.f20653R && i25 != AbstractC4541gk.f20692p0 && i25 != AbstractC4541gk.f20694q0 && i25 != AbstractC4541gk.f20696r0 && i25 != AbstractC4541gk.f20698s0 && i25 != AbstractC4541gk.f20700t0 && i25 != AbstractC4541gk.f20651P && i25 != AbstractC4541gk.f20663b && i25 != AbstractC4541gk.f20622A0) {
                        this.f29963i = null;
                    } else {
                        if (this.f29962h == 8) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC4361bo.m20613e(z13);
                        if (this.f29961g <= 2147483647L) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        AbstractC4361bo.m20613e(z14);
                        C4655jo c4655jo3 = new C4655jo((int) this.f29961g);
                        this.f29963i = c4655jo3;
                        System.arraycopy(this.f29957c.f22891a, 0, c4655jo3.f22891a, 0, 8);
                    }
                    this.f29959e = 1;
                } else {
                    long m22917d3 = (c4577hj.m22917d() + this.f29961g) - this.f29962h;
                    this.f29958d.add(new C4467ek(this.f29960f, m22917d3));
                    if (this.f29961g == this.f29962h) {
                        m27640g(m22917d3);
                    } else {
                        m27639f();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: c */
    public final void mo20544c(long j11, long j12) {
        this.f29958d.clear();
        this.f29962h = 0;
        this.f29964j = 0;
        this.f29965k = 0;
        if (j11 == 0) {
            m27639f();
            return;
        }
        C5097vk[] c5097vkArr = this.f29967m;
        if (c5097vkArr != null) {
            for (C5097vk c5097vk : c5097vkArr) {
                C4358bl c4358bl = c5097vk.f29377b;
                int m20566a = c4358bl.m20566a(j12);
                if (m20566a == -1) {
                    m20566a = c4358bl.m20567b(j12);
                }
                c5097vk.f29379d = m20566a;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: d */
    public final void mo20545d(InterfaceC4687kj interfaceC4687kj) {
        this.f29966l = interfaceC4687kj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4614ij
    /* renamed from: e */
    public final boolean mo20546e(C4577hj c4577hj) {
        return AbstractC5172xk.m27896b(c4577hj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    public final long zza() {
        return this.f29968n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4911qj
    public final boolean zzc() {
        return true;
    }
}
