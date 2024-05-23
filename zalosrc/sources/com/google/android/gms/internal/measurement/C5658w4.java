package com.google.android.gms.internal.measurement;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w4 */
/* loaded from: classes.dex */
public final class C5658w4 extends AbstractC5612t9 implements InterfaceC5664wa {
    public static final /* synthetic */ int zza = 0;
    private static final C5658w4 zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private C5709z4 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private C5573r4 zzac;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private InterfaceC5714z9 zzh = AbstractC5612t9.m29640o();
    private InterfaceC5714z9 zzi = AbstractC5612t9.m29640o();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private InterfaceC5714z9 zzG = AbstractC5612t9.m29640o();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private InterfaceC5680x9 zzT = AbstractC5612t9.m29637l();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private InterfaceC5714z9 zzae = AbstractC5612t9.m29640o();
    private String zzaf = "";

    static {
        C5658w4 c5658w4 = new C5658w4();
        zzd = c5658w4;
        AbstractC5612t9.m29644v(C5658w4.class, c5658w4);
    }

    private C5658w4() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A0 */
    public static /* synthetic */ void m29855A0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 536870912;
        c5658w4.zzM = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D0 */
    public static /* synthetic */ void m29856D0(C5658w4 c5658w4, Iterable iterable) {
        c5658w4.m29897e1();
        AbstractC5407h8.m29186e(iterable, c5658w4.zzh);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public static /* synthetic */ void m29857E0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zzf |= 8192;
        c5658w4.zzad = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F0 */
    public static /* synthetic */ void m29858F0(C5658w4 c5658w4) {
        c5658w4.zzf &= -8193;
        c5658w4.zzad = zzd.zzad;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public static /* synthetic */ void m29859G0(C5658w4 c5658w4, Iterable iterable) {
        InterfaceC5714z9 interfaceC5714z9 = c5658w4.zzae;
        if (!interfaceC5714z9.zzc()) {
            c5658w4.zzae = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        AbstractC5407h8.m29186e(iterable, c5658w4.zzae);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I0 */
    public static /* synthetic */ void m29861I0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zzf |= 16384;
        c5658w4.zzaf = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J0 */
    public static /* synthetic */ void m29862J0(C5658w4 c5658w4, long j11) {
        c5658w4.zzf |= 32768;
        c5658w4.zzag = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public static /* synthetic */ void m29863K0(C5658w4 c5658w4, int i11) {
        c5658w4.m29897e1();
        c5658w4.zzh.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L0 */
    public static /* synthetic */ void m29864L0(C5658w4 c5658w4, int i11, C5370f5 c5370f5) {
        c5370f5.getClass();
        c5658w4.m29899f1();
        c5658w4.zzi.set(i11, c5370f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static /* synthetic */ void m29865M0(C5658w4 c5658w4, C5370f5 c5370f5) {
        c5370f5.getClass();
        c5658w4.m29899f1();
        c5658w4.zzi.add(c5370f5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N0 */
    public static /* synthetic */ void m29866N0(C5658w4 c5658w4, Iterable iterable) {
        c5658w4.m29899f1();
        AbstractC5407h8.m29186e(iterable, c5658w4.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O0 */
    public static /* synthetic */ void m29867O0(C5658w4 c5658w4, int i11) {
        c5658w4.m29899f1();
        c5658w4.zzi.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P0 */
    public static /* synthetic */ void m29868P0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 2;
        c5658w4.zzj = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q0 */
    public static /* synthetic */ void m29869Q0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 4;
        c5658w4.zzk = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static /* synthetic */ void m29870R(C5658w4 c5658w4) {
        c5658w4.zze &= Integer.MAX_VALUE;
        c5658w4.zzO = zzd.zzO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R0 */
    public static /* synthetic */ void m29871R0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 8;
        c5658w4.zzl = j11;
    }

    /* renamed from: R1 */
    public static C5641v4 m29872R1() {
        return (C5641v4) zzd.m29648h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public static /* synthetic */ void m29873S(C5658w4 c5658w4, int i11) {
        c5658w4.zzf |= 2;
        c5658w4.zzQ = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S0 */
    public static /* synthetic */ void m29874S0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 16;
        c5658w4.zzm = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public static /* synthetic */ void m29876T(C5658w4 c5658w4, int i11, C5471l4 c5471l4) {
        c5471l4.getClass();
        c5658w4.m29897e1();
        c5658w4.zzh.set(i11, c5471l4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T0 */
    public static /* synthetic */ void m29877T0(C5658w4 c5658w4) {
        c5658w4.zze &= -17;
        c5658w4.zzm = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public static /* synthetic */ void m29878U(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zzf |= 4;
        c5658w4.zzR = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U0 */
    public static /* synthetic */ void m29879U0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 32;
        c5658w4.zzn = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static /* synthetic */ void m29880V(C5658w4 c5658w4, C5709z4 c5709z4) {
        c5709z4.getClass();
        c5658w4.zzS = c5709z4;
        c5658w4.zzf |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V0 */
    public static /* synthetic */ void m29881V0(C5658w4 c5658w4) {
        c5658w4.zze &= -33;
        c5658w4.zzn = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static /* synthetic */ void m29882W(C5658w4 c5658w4, Iterable iterable) {
        int i11;
        InterfaceC5680x9 interfaceC5680x9 = c5658w4.zzT;
        if (!interfaceC5680x9.zzc()) {
            int size = interfaceC5680x9.size();
            if (size == 0) {
                i11 = 10;
            } else {
                i11 = size + size;
            }
            c5658w4.zzT = interfaceC5680x9.mo28992c(i11);
        }
        AbstractC5407h8.m29186e(iterable, c5658w4.zzT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W0 */
    public static /* synthetic */ void m29883W0(C5658w4 c5658w4, String str) {
        c5658w4.zze |= 64;
        c5658w4.zzo = "android";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static /* synthetic */ void m29884X(C5658w4 c5658w4, C5471l4 c5471l4) {
        c5471l4.getClass();
        c5658w4.m29897e1();
        c5658w4.zzh.add(c5471l4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X0 */
    public static /* synthetic */ void m29885X0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 128;
        c5658w4.zzp = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static /* synthetic */ void m29886Y(C5658w4 c5658w4, long j11) {
        c5658w4.zzf |= 16;
        c5658w4.zzU = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public static /* synthetic */ void m29887Y0(C5658w4 c5658w4) {
        c5658w4.zze &= -129;
        c5658w4.zzp = zzd.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static /* synthetic */ void m29888Z(C5658w4 c5658w4, long j11) {
        c5658w4.zzf |= 32;
        c5658w4.zzV = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public static /* synthetic */ void m29889Z0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 256;
        c5658w4.zzq = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public static /* synthetic */ void m29890a0(C5658w4 c5658w4, String str) {
        c5658w4.zzf |= 128;
        c5658w4.zzX = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a1 */
    public static /* synthetic */ void m29891a1(C5658w4 c5658w4) {
        c5658w4.zze &= -257;
        c5658w4.zzq = zzd.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1 */
    public static /* synthetic */ void m29892b1(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 512;
        c5658w4.zzr = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public static /* synthetic */ void m29893c0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        c5658w4.zzt = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c1 */
    public static /* synthetic */ void m29894c1(C5658w4 c5658w4, int i11) {
        c5658w4.zze |= 1024;
        c5658w4.zzs = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public static /* synthetic */ void m29895d0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 4096;
        c5658w4.zzu = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public static /* synthetic */ void m29896e0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 8192;
        c5658w4.zzv = str;
    }

    /* renamed from: e1 */
    private final void m29897e1() {
        InterfaceC5714z9 interfaceC5714z9 = this.zzh;
        if (!interfaceC5714z9.zzc()) {
            this.zzh = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public static /* synthetic */ void m29898f0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 16384;
        c5658w4.zzw = j11;
    }

    /* renamed from: f1 */
    private final void m29899f1() {
        InterfaceC5714z9 interfaceC5714z9 = this.zzi;
        if (!interfaceC5714z9.zzc()) {
            this.zzi = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* synthetic */ void m29900g0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 32768;
        c5658w4.zzx = 76003L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public static /* synthetic */ void m29901h0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 65536;
        c5658w4.zzy = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static /* synthetic */ void m29902i0(C5658w4 c5658w4) {
        c5658w4.zze &= -65537;
        c5658w4.zzy = zzd.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public static /* synthetic */ void m29903j0(C5658w4 c5658w4, boolean z11) {
        c5658w4.zze |= 131072;
        c5658w4.zzz = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public static /* synthetic */ void m29904k0(C5658w4 c5658w4) {
        c5658w4.zze &= -131073;
        c5658w4.zzz = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public static /* synthetic */ void m29905l0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 262144;
        c5658w4.zzA = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m0 */
    public static /* synthetic */ void m29906m0(C5658w4 c5658w4) {
        c5658w4.zze &= -262145;
        c5658w4.zzA = zzd.zzA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public static /* synthetic */ void m29907n0(C5658w4 c5658w4, long j11) {
        c5658w4.zze |= 524288;
        c5658w4.zzB = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public static /* synthetic */ void m29908p0(C5658w4 c5658w4, int i11) {
        c5658w4.zze |= ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
        c5658w4.zzC = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static /* synthetic */ void m29909q0(C5658w4 c5658w4, String str) {
        c5658w4.zze |= 2097152;
        c5658w4.zzD = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public static /* synthetic */ void m29910r0(C5658w4 c5658w4) {
        c5658w4.zze &= -2097153;
        c5658w4.zzD = zzd.zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s0 */
    public static /* synthetic */ void m29911s0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 4194304;
        c5658w4.zzE = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public static /* synthetic */ void m29912t0(C5658w4 c5658w4, boolean z11) {
        c5658w4.zze |= 8388608;
        c5658w4.zzF = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public static /* synthetic */ void m29913u0(C5658w4 c5658w4, Iterable iterable) {
        InterfaceC5714z9 interfaceC5714z9 = c5658w4.zzG;
        if (!interfaceC5714z9.zzc()) {
            c5658w4.zzG = AbstractC5612t9.m29641p(interfaceC5714z9);
        }
        AbstractC5407h8.m29186e(iterable, c5658w4.zzG);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public static /* synthetic */ void m29915w0(C5658w4 c5658w4, String str) {
        str.getClass();
        c5658w4.zze |= 16777216;
        c5658w4.zzH = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x0 */
    public static /* synthetic */ void m29916x0(C5658w4 c5658w4, int i11) {
        c5658w4.zze |= 33554432;
        c5658w4.zzI = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0 */
    public static /* synthetic */ void m29917y0(C5658w4 c5658w4, int i11) {
        c5658w4.zze |= 1;
        c5658w4.zzg = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0 */
    public static /* synthetic */ void m29918z0(C5658w4 c5658w4) {
        c5658w4.zze &= -268435457;
        c5658w4.zzL = zzd.zzL;
    }

    /* renamed from: A */
    public final String m29919A() {
        return this.zzt;
    }

    /* renamed from: A1 */
    public final int m29920A1() {
        return this.zzh.size();
    }

    /* renamed from: B */
    public final String m29921B() {
        return this.zzv;
    }

    /* renamed from: B0 */
    public final boolean m29922B0() {
        return this.zzz;
    }

    /* renamed from: B1 */
    public final int m29923B1() {
        return this.zzg;
    }

    /* renamed from: C */
    public final String m29924C() {
        return this.zzX;
    }

    /* renamed from: C0 */
    public final boolean m29925C0() {
        return this.zzF;
    }

    /* renamed from: C1 */
    public final int m29926C1() {
        return this.zzQ;
    }

    /* renamed from: D */
    public final String m29927D() {
        return this.zzq;
    }

    /* renamed from: D1 */
    public final int m29928D1() {
        return this.zzs;
    }

    /* renamed from: E */
    public final String m29929E() {
        return this.zzO;
    }

    /* renamed from: E1 */
    public final int m29930E1() {
        return this.zzi.size();
    }

    /* renamed from: F */
    public final String m29931F() {
        return this.zzH;
    }

    /* renamed from: F1 */
    public final long m29932F1() {
        return this.zzM;
    }

    /* renamed from: G */
    public final String m29933G() {
        return this.zzE;
    }

    /* renamed from: G1 */
    public final long m29934G1() {
        return this.zzB;
    }

    /* renamed from: H */
    public final String m29935H() {
        return this.zzD;
    }

    /* renamed from: H1 */
    public final long m29936H1() {
        return this.zzU;
    }

    /* renamed from: I */
    public final String m29937I() {
        return this.zzp;
    }

    /* renamed from: I1 */
    public final long m29938I1() {
        return this.zzl;
    }

    /* renamed from: J */
    public final String m29939J() {
        return this.zzo;
    }

    /* renamed from: J1 */
    public final long m29940J1() {
        return this.zzw;
    }

    /* renamed from: K1 */
    public final long m29941K1() {
        return this.zzn;
    }

    /* renamed from: L */
    public final String m29942L() {
        return this.zzy;
    }

    /* renamed from: L1 */
    public final long m29943L1() {
        return this.zzm;
    }

    /* renamed from: M */
    public final String m29944M() {
        return this.zzad;
    }

    /* renamed from: M1 */
    public final long m29945M1() {
        return this.zzk;
    }

    /* renamed from: N */
    public final String m29946N() {
        return this.zzr;
    }

    /* renamed from: N1 */
    public final long m29947N1() {
        return this.zzag;
    }

    /* renamed from: O */
    public final List m29948O() {
        return this.zzG;
    }

    /* renamed from: O1 */
    public final long m29949O1() {
        return this.zzj;
    }

    /* renamed from: P */
    public final List m29950P() {
        return this.zzh;
    }

    /* renamed from: P1 */
    public final long m29951P1() {
        return this.zzx;
    }

    /* renamed from: Q */
    public final List m29952Q() {
        return this.zzi;
    }

    /* renamed from: Q1 */
    public final C5471l4 m29953Q1(int i11) {
        return (C5471l4) this.zzh.get(i11);
    }

    /* renamed from: T1 */
    public final C5370f5 m29954T1(int i11) {
        return (C5370f5) this.zzi.get(i11);
    }

    /* renamed from: U1 */
    public final String m29955U1() {
        return this.zzR;
    }

    /* renamed from: V1 */
    public final String m29956V1() {
        return this.zzu;
    }

    /* renamed from: W1 */
    public final String m29957W1() {
        return this.zzA;
    }

    /* renamed from: b0 */
    public final int m29958b0() {
        return this.zzI;
    }

    /* renamed from: d1 */
    public final int m29959d1() {
        return this.zzC;
    }

    /* renamed from: g1 */
    public final boolean m29960g1() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: h1 */
    public final boolean m29961h1() {
        return (this.zze & ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) != 0;
    }

    /* renamed from: i1 */
    public final boolean m29962i1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: j1 */
    public final boolean m29963j1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: k1 */
    public final boolean m29964k1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: l1 */
    public final boolean m29965l1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: m1 */
    public final boolean m29966m1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: n1 */
    public final boolean m29967n1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: o1 */
    public final boolean m29968o1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: p1 */
    public final boolean m29969p1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: q1 */
    public final boolean m29970q1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: r1 */
    public final boolean m29971r1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: s1 */
    public final boolean m29972s1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: t1 */
    public final boolean m29973t1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: u1 */
    public final boolean m29974u1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: v1 */
    public final boolean m29975v1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: w1 */
    public final boolean m29976w1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: x1 */
    public final boolean m29977x1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: y1 */
    public final boolean m29978y1() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.AbstractC5612t9
    /* renamed from: z */
    public final Object mo28921z(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    AbstractC5318c4 abstractC5318c4 = null;
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new C5641v4(abstractC5318c4);
                }
                return new C5658w4();
            }
            return AbstractC5612t9.m29643r(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", C5471l4.class, "zzi", C5370f5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C5403h4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", C5335d4.f32333a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    /* renamed from: z1 */
    public final boolean m29979z1() {
        return (this.zze & 32768) != 0;
    }
}
