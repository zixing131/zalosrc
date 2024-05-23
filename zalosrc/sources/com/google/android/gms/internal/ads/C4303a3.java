package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.a3 */
/* loaded from: classes2.dex */
public final class C4303a3 implements jm4 {

    /* renamed from: q */
    public static final qm4 f16884q = new qm4() { // from class: com.google.android.gms.internal.ads.y2
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4303a3(0)};
        }
    };

    /* renamed from: r */
    private static final InterfaceC5041u1 f16885r = new InterfaceC5041u1() { // from class: com.google.android.gms.internal.ads.z2
    };

    /* renamed from: e */
    private final InterfaceC4928r f16890e;

    /* renamed from: f */
    private mm4 f16891f;

    /* renamed from: g */
    private InterfaceC4928r f16892g;

    /* renamed from: h */
    private InterfaceC4928r f16893h;

    /* renamed from: i */
    private int f16894i;

    /* renamed from: j */
    private zzbq f16895j;

    /* renamed from: l */
    private long f16897l;

    /* renamed from: m */
    private long f16898m;

    /* renamed from: n */
    private int f16899n;

    /* renamed from: o */
    private InterfaceC4376c3 f16900o;

    /* renamed from: p */
    private boolean f16901p;

    /* renamed from: a */
    private final x02 f16886a = new x02(10);

    /* renamed from: b */
    private final C4409d f16887b = new C4409d();

    /* renamed from: c */
    private final ym4 f16888c = new ym4();

    /* renamed from: k */
    private long f16896k = -9223372036854775807L;

    /* renamed from: d */
    private final an4 f16889d = new an4();

    public C4303a3(int i11) {
        im4 im4Var = new im4();
        this.f16890e = im4Var;
        this.f16893h = im4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0078  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m19962d(km4 km4Var) {
        int i11;
        int i12;
        C4450e3 m21608a;
        InterfaceC4376c3 interfaceC4376c3;
        int i13;
        int i14;
        zzbq zzbqVar;
        C5154x2 c5154x2;
        InterfaceC4376c3 m19964h;
        long j11;
        if (this.f16894i == 0) {
            try {
                m19967k(km4Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f16900o == null) {
            x02 x02Var = new x02(this.f16887b.f19043c);
            ((yl4) km4Var).mo23963f(x02Var.m27777h(), 0, this.f16887b.f19043c, false);
            C4409d c4409d = this.f16887b;
            if ((c4409d.f19041a & 1) != 0) {
                if (c4409d.f19045e != 1) {
                    i11 = 36;
                    if (x02Var.m27781l() >= i11 + 4) {
                        x02Var.m27775f(i11);
                        int m27782m = x02Var.m27782m();
                        if (m27782m != 1483304551) {
                            if (m27782m == 1231971951) {
                                i12 = 1231971951;
                            }
                        } else {
                            i12 = m27782m;
                        }
                        InterfaceC4376c3 interfaceC4376c32 = null;
                        if (i12 == 1483304551 && i12 != 1231971951) {
                            if (i12 == 1447187017) {
                                interfaceC4376c3 = C4413d3.m21251a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                                ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                            } else {
                                km4Var.zzj();
                                interfaceC4376c3 = null;
                            }
                        } else {
                            m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                            if (m21608a != null && !this.f16888c.m28268a()) {
                                km4Var.zzj();
                                yl4 yl4Var = (yl4) km4Var;
                                yl4Var.m28247k(i11 + 141, false);
                                yl4Var.mo23963f(this.f16886a.m27777h(), 0, 3, false);
                                this.f16886a.m27775f(0);
                                ym4 ym4Var = this.f16888c;
                                int m27790u = this.f16886a.m27790u();
                                i13 = m27790u >> 12;
                                i14 = m27790u & 4095;
                                if (i13 <= 0 || i14 > 0) {
                                    ym4Var.f31039a = i13;
                                    ym4Var.f31040b = i14;
                                }
                            }
                            ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                            if (m21608a == null && !m21608a.zzh() && i12 == 1231971951) {
                                interfaceC4376c3 = m19964h(km4Var, false);
                            } else {
                                interfaceC4376c3 = m21608a;
                            }
                        }
                        zzbqVar = this.f16895j;
                        long zzf = km4Var.zzf();
                        if (zzbqVar != null) {
                            int m28707a = zzbqVar.m28707a();
                            for (int i15 = 0; i15 < m28707a; i15++) {
                                zzbp m28708b = zzbqVar.m28708b(i15);
                                if (m28708b instanceof zzadh) {
                                    zzadh zzadhVar = (zzadh) m28708b;
                                    int m28707a2 = zzbqVar.m28707a();
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < m28707a2) {
                                            zzbp m28708b2 = zzbqVar.m28708b(i16);
                                            if (m28708b2 instanceof zzadl) {
                                                zzadl zzadlVar = (zzadl) m28708b2;
                                                if (zzadlVar.f31786p.equals("TLEN")) {
                                                    j11 = g92.m22344f0(Long.parseLong(zzadlVar.f31798r));
                                                    break;
                                                }
                                            }
                                            i16++;
                                        } else {
                                            j11 = -9223372036854775807L;
                                            break;
                                        }
                                    }
                                    c5154x2 = C5154x2.m27810a(zzf, zzadhVar, j11);
                                    if (this.f16901p) {
                                        m19964h = new C4340b3();
                                    } else {
                                        if (c5154x2 != null) {
                                            interfaceC4376c32 = c5154x2;
                                        } else if (interfaceC4376c3 != null) {
                                            interfaceC4376c32 = interfaceC4376c3;
                                        }
                                        if (interfaceC4376c32 != null) {
                                            interfaceC4376c32.zzh();
                                            m19964h = interfaceC4376c32;
                                        } else {
                                            m19964h = m19964h(km4Var, false);
                                        }
                                    }
                                    this.f16900o = m19964h;
                                    this.f16891f.mo21603f(m19964h);
                                    InterfaceC4928r interfaceC4928r = this.f16893h;
                                    C5004t1 c5004t1 = new C5004t1();
                                    c5004t1.m26523s(this.f16887b.f19042b);
                                    c5004t1.m26516l(4096);
                                    c5004t1.m26506e0(this.f16887b.f19045e);
                                    c5004t1.m26524t(this.f16887b.f19044d);
                                    c5004t1.m26501c(this.f16888c.f31039a);
                                    c5004t1.m26503d(this.f16888c.f31040b);
                                    c5004t1.m26517m(this.f16895j);
                                    interfaceC4928r.mo23300d(c5004t1.m26529y());
                                    this.f16898m = km4Var.zzf();
                                }
                            }
                        }
                        c5154x2 = null;
                        if (this.f16901p) {
                        }
                        this.f16900o = m19964h;
                        this.f16891f.mo21603f(m19964h);
                        InterfaceC4928r interfaceC4928r2 = this.f16893h;
                        C5004t1 c5004t12 = new C5004t1();
                        c5004t12.m26523s(this.f16887b.f19042b);
                        c5004t12.m26516l(4096);
                        c5004t12.m26506e0(this.f16887b.f19045e);
                        c5004t12.m26524t(this.f16887b.f19044d);
                        c5004t12.m26501c(this.f16888c.f31039a);
                        c5004t12.m26503d(this.f16888c.f31040b);
                        c5004t12.m26517m(this.f16895j);
                        interfaceC4928r2.mo23300d(c5004t12.m26529y());
                        this.f16898m = km4Var.zzf();
                    }
                    if (x02Var.m27781l() >= 40) {
                        x02Var.m27775f(36);
                        if (x02Var.m27782m() == 1447187017) {
                            i12 = 1447187017;
                            InterfaceC4376c3 interfaceC4376c322 = null;
                            if (i12 == 1483304551) {
                            }
                            m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                            if (m21608a != null) {
                                km4Var.zzj();
                                yl4 yl4Var2 = (yl4) km4Var;
                                yl4Var2.m28247k(i11 + 141, false);
                                yl4Var2.mo23963f(this.f16886a.m27777h(), 0, 3, false);
                                this.f16886a.m27775f(0);
                                ym4 ym4Var2 = this.f16888c;
                                int m27790u2 = this.f16886a.m27790u();
                                i13 = m27790u2 >> 12;
                                i14 = m27790u2 & 4095;
                                if (i13 <= 0) {
                                }
                                ym4Var2.f31039a = i13;
                                ym4Var2.f31040b = i14;
                            }
                            ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                            if (m21608a == null) {
                            }
                            interfaceC4376c3 = m21608a;
                            zzbqVar = this.f16895j;
                            long zzf2 = km4Var.zzf();
                            if (zzbqVar != null) {
                            }
                            c5154x2 = null;
                            if (this.f16901p) {
                            }
                            this.f16900o = m19964h;
                            this.f16891f.mo21603f(m19964h);
                            InterfaceC4928r interfaceC4928r22 = this.f16893h;
                            C5004t1 c5004t122 = new C5004t1();
                            c5004t122.m26523s(this.f16887b.f19042b);
                            c5004t122.m26516l(4096);
                            c5004t122.m26506e0(this.f16887b.f19045e);
                            c5004t122.m26524t(this.f16887b.f19044d);
                            c5004t122.m26501c(this.f16888c.f31039a);
                            c5004t122.m26503d(this.f16888c.f31040b);
                            c5004t122.m26517m(this.f16895j);
                            interfaceC4928r22.mo23300d(c5004t122.m26529y());
                            this.f16898m = km4Var.zzf();
                        }
                    }
                    i12 = 0;
                    InterfaceC4376c3 interfaceC4376c3222 = null;
                    if (i12 == 1483304551) {
                    }
                    m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                    if (m21608a != null) {
                    }
                    ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                    if (m21608a == null) {
                    }
                    interfaceC4376c3 = m21608a;
                    zzbqVar = this.f16895j;
                    long zzf22 = km4Var.zzf();
                    if (zzbqVar != null) {
                    }
                    c5154x2 = null;
                    if (this.f16901p) {
                    }
                    this.f16900o = m19964h;
                    this.f16891f.mo21603f(m19964h);
                    InterfaceC4928r interfaceC4928r222 = this.f16893h;
                    C5004t1 c5004t1222 = new C5004t1();
                    c5004t1222.m26523s(this.f16887b.f19042b);
                    c5004t1222.m26516l(4096);
                    c5004t1222.m26506e0(this.f16887b.f19045e);
                    c5004t1222.m26524t(this.f16887b.f19044d);
                    c5004t1222.m26501c(this.f16888c.f31039a);
                    c5004t1222.m26503d(this.f16888c.f31040b);
                    c5004t1222.m26517m(this.f16895j);
                    interfaceC4928r222.mo23300d(c5004t1222.m26529y());
                    this.f16898m = km4Var.zzf();
                }
                i11 = 21;
                if (x02Var.m27781l() >= i11 + 4) {
                }
                if (x02Var.m27781l() >= 40) {
                }
                i12 = 0;
                InterfaceC4376c3 interfaceC4376c32222 = null;
                if (i12 == 1483304551) {
                }
                m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                if (m21608a != null) {
                }
                ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                if (m21608a == null) {
                }
                interfaceC4376c3 = m21608a;
                zzbqVar = this.f16895j;
                long zzf222 = km4Var.zzf();
                if (zzbqVar != null) {
                }
                c5154x2 = null;
                if (this.f16901p) {
                }
                this.f16900o = m19964h;
                this.f16891f.mo21603f(m19964h);
                InterfaceC4928r interfaceC4928r2222 = this.f16893h;
                C5004t1 c5004t12222 = new C5004t1();
                c5004t12222.m26523s(this.f16887b.f19042b);
                c5004t12222.m26516l(4096);
                c5004t12222.m26506e0(this.f16887b.f19045e);
                c5004t12222.m26524t(this.f16887b.f19044d);
                c5004t12222.m26501c(this.f16888c.f31039a);
                c5004t12222.m26503d(this.f16888c.f31040b);
                c5004t12222.m26517m(this.f16895j);
                interfaceC4928r2222.mo23300d(c5004t12222.m26529y());
                this.f16898m = km4Var.zzf();
            } else {
                if (c4409d.f19045e == 1) {
                    i11 = 13;
                    if (x02Var.m27781l() >= i11 + 4) {
                    }
                    if (x02Var.m27781l() >= 40) {
                    }
                    i12 = 0;
                    InterfaceC4376c3 interfaceC4376c322222 = null;
                    if (i12 == 1483304551) {
                    }
                    m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                    if (m21608a != null) {
                    }
                    ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                    if (m21608a == null) {
                    }
                    interfaceC4376c3 = m21608a;
                    zzbqVar = this.f16895j;
                    long zzf2222 = km4Var.zzf();
                    if (zzbqVar != null) {
                    }
                    c5154x2 = null;
                    if (this.f16901p) {
                    }
                    this.f16900o = m19964h;
                    this.f16891f.mo21603f(m19964h);
                    InterfaceC4928r interfaceC4928r22222 = this.f16893h;
                    C5004t1 c5004t122222 = new C5004t1();
                    c5004t122222.m26523s(this.f16887b.f19042b);
                    c5004t122222.m26516l(4096);
                    c5004t122222.m26506e0(this.f16887b.f19045e);
                    c5004t122222.m26524t(this.f16887b.f19044d);
                    c5004t122222.m26501c(this.f16888c.f31039a);
                    c5004t122222.m26503d(this.f16888c.f31040b);
                    c5004t122222.m26517m(this.f16895j);
                    interfaceC4928r22222.mo23300d(c5004t122222.m26529y());
                    this.f16898m = km4Var.zzf();
                }
                i11 = 21;
                if (x02Var.m27781l() >= i11 + 4) {
                }
                if (x02Var.m27781l() >= 40) {
                }
                i12 = 0;
                InterfaceC4376c3 interfaceC4376c3222222 = null;
                if (i12 == 1483304551) {
                }
                m21608a = C4450e3.m21608a(km4Var.zzd(), km4Var.zzf(), this.f16887b, x02Var);
                if (m21608a != null) {
                }
                ((yl4) km4Var).m28248l(this.f16887b.f19043c, false);
                if (m21608a == null) {
                }
                interfaceC4376c3 = m21608a;
                zzbqVar = this.f16895j;
                long zzf22222 = km4Var.zzf();
                if (zzbqVar != null) {
                }
                c5154x2 = null;
                if (this.f16901p) {
                }
                this.f16900o = m19964h;
                this.f16891f.mo21603f(m19964h);
                InterfaceC4928r interfaceC4928r222222 = this.f16893h;
                C5004t1 c5004t1222222 = new C5004t1();
                c5004t1222222.m26523s(this.f16887b.f19042b);
                c5004t1222222.m26516l(4096);
                c5004t1222222.m26506e0(this.f16887b.f19045e);
                c5004t1222222.m26524t(this.f16887b.f19044d);
                c5004t1222222.m26501c(this.f16888c.f31039a);
                c5004t1222222.m26503d(this.f16888c.f31040b);
                c5004t1222222.m26517m(this.f16895j);
                interfaceC4928r222222.mo23300d(c5004t1222222.m26529y());
                this.f16898m = km4Var.zzf();
            }
        } else {
            long j12 = this.f16898m;
            if (j12 != 0) {
                long zzf3 = km4Var.zzf();
                if (zzf3 < j12) {
                    ((yl4) km4Var).m28248l((int) (j12 - zzf3), false);
                }
            }
        }
        int i17 = this.f16899n;
        if (i17 == 0) {
            km4Var.zzj();
            if (m19966j(km4Var)) {
                return -1;
            }
            this.f16886a.m27775f(0);
            int m27782m2 = this.f16886a.m27782m();
            if (m19965i(m27782m2, this.f16894i) && AbstractC4446e.m21585b(m27782m2) != -1) {
                this.f16887b.m21245a(m27782m2);
                if (this.f16896k == -9223372036854775807L) {
                    this.f16896k = this.f16900o.mo20373d(km4Var.zzf());
                }
                i17 = this.f16887b.f19043c;
                this.f16899n = i17;
            } else {
                ((yl4) km4Var).m28248l(1, false);
                this.f16894i = 0;
                return 0;
            }
        }
        int mo23297a = this.f16893h.mo23297a(km4Var, i17, true);
        if (mo23297a == -1) {
            return -1;
        }
        int i18 = this.f16899n - mo23297a;
        this.f16899n = i18;
        if (i18 <= 0) {
            this.f16893h.mo23302f(m19963g(this.f16897l), 1, this.f16887b.f19043c, 0, null);
            this.f16897l += this.f16887b.f19047g;
            this.f16899n = 0;
            return 0;
        }
        return 0;
    }

    /* renamed from: g */
    private final long m19963g(long j11) {
        return this.f16896k + ((j11 * 1000000) / this.f16887b.f19044d);
    }

    /* renamed from: h */
    private final InterfaceC4376c3 m19964h(km4 km4Var, boolean z11) {
        ((yl4) km4Var).mo23963f(this.f16886a.m27777h(), 0, 4, false);
        this.f16886a.m27775f(0);
        this.f16887b.m21245a(this.f16886a.m27782m());
        return new C5116w2(km4Var.zzd(), km4Var.zzf(), this.f16887b, false);
    }

    /* renamed from: i */
    private static boolean m19965i(int i11, long j11) {
        return ((long) (i11 & (-128000))) == (j11 & (-128000));
    }

    /* renamed from: j */
    private final boolean m19966j(km4 km4Var) {
        InterfaceC4376c3 interfaceC4376c3 = this.f16900o;
        if (interfaceC4376c3 != null) {
            long zzb = interfaceC4376c3.zzb();
            if (zzb != -1 && km4Var.zze() > zzb - 4) {
                return true;
            }
        }
        try {
            if (!km4Var.mo23963f(this.f16886a.m27777h(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m19967k(km4 km4Var, boolean z11) {
        int i11;
        int i12;
        int i13;
        int m21585b;
        if (true != z11) {
            i11 = 131072;
        } else {
            i11 = 32768;
        }
        km4Var.zzj();
        if (km4Var.zzf() == 0) {
            zzbq m20194a = this.f16889d.m20194a(km4Var, null);
            this.f16895j = m20194a;
            if (m20194a != null) {
                this.f16888c.m28269b(m20194a);
            }
            i13 = (int) km4Var.zze();
            if (!z11) {
                ((yl4) km4Var).m28248l(i13, false);
            }
            i12 = 0;
        } else {
            i12 = 0;
            i13 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (m19966j(km4Var)) {
                if (i14 <= 0) {
                    throw new EOFException();
                }
            } else {
                this.f16886a.m27775f(0);
                int m27782m = this.f16886a.m27782m();
                if ((i12 != 0 && !m19965i(m27782m, i12)) || (m21585b = AbstractC4446e.m21585b(m27782m)) == -1) {
                    int i16 = i15 + 1;
                    if (i15 == i11) {
                        if (z11) {
                            return false;
                        }
                        throw zzbu.m28711a("Searched too many bytes.", null);
                    }
                    if (z11) {
                        km4Var.zzj();
                        ((yl4) km4Var).m28247k(i13 + i16, false);
                    } else {
                        ((yl4) km4Var).m28248l(1, false);
                    }
                    i15 = i16;
                    i12 = 0;
                    i14 = 0;
                } else {
                    i14++;
                    if (i14 == 1) {
                        this.f16887b.m21245a(m27782m);
                        i12 = m27782m;
                    } else if (i14 == 4) {
                        break;
                    }
                    ((yl4) km4Var).m28247k(m21585b - 4, false);
                }
            }
        }
        if (z11) {
            ((yl4) km4Var).m28248l(i13 + i15, false);
        } else {
            km4Var.zzj();
        }
        this.f16894i = i12;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        return m19967k(km4Var, true);
    }

    /* renamed from: b */
    public final void m19969b() {
        this.f16901p = true;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f16891f = mm4Var;
        InterfaceC4928r mo21604i = mm4Var.mo21604i(0, 1);
        this.f16892g = mo21604i;
        this.f16893h = mo21604i;
        this.f16891f.zzC();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f16894i = 0;
        this.f16896k = -9223372036854775807L;
        this.f16897l = 0L;
        this.f16899n = 0;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        v71.m27171b(this.f16892g);
        int i11 = g92.f20474a;
        return m19962d(km4Var);
    }
}
