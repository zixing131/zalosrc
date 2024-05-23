package com.google.android.gms.internal.ads;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.ib */
/* loaded from: classes2.dex */
public final class C4606ib extends tu3 implements aw3 {
    private static final C4606ib zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private C4679kb zzN;
    private C4384cb zzaD;
    private long zzaJ;
    private long zzaM;
    private boolean zzaP;
    private long zzaR;
    private C4940rb zzaS;
    private long zzaT;
    private C4458eb zzaf;
    private C4532gb zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private C5014tb zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private cv3 zzag = tu3.m26767w();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private cv3 zzaA = tu3.m26767w();
    private int zzaB = 1000;
    private cv3 zzaC = tu3.m26767w();
    private String zzaE = "";
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaK = -1;
    private String zzaL = "";
    private String zzaN = "";
    private int zzaO = 2;
    private String zzaQ = "";
    private String zzaU = "";

    static {
        C4606ib c4606ib = new C4606ib();
        zzb = c4606ib;
        tu3.m26755A(C4606ib.class, c4606ib);
    }

    private C4606ib() {
    }

    /* renamed from: B0 */
    public static C4606ib m23153B0() {
        return zzb;
    }

    /* renamed from: C0 */
    public static C4606ib m23154C0(byte[] bArr, gu3 gu3Var) {
        return (C4606ib) tu3.m26763s(zzb, bArr, gu3Var);
    }

    /* renamed from: F */
    public static /* synthetic */ void m23155F(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 134217728;
        c4606ib.zzI = j11;
    }

    /* renamed from: G */
    public static /* synthetic */ void m23156G(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zze |= 268435456;
        c4606ib.zzJ = str;
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m23157G0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zze |= 1;
        c4606ib.zzh = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m23158H(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 536870912;
        c4606ib.zzK = j11;
    }

    /* renamed from: H0 */
    public static /* synthetic */ void m23159H0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zze |= 2;
        c4606ib.zzi = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23160I(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 1073741824;
        c4606ib.zzL = j11;
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m23161I0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 4;
        c4606ib.zzj = j11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m23162J(C4606ib c4606ib, long j11) {
        c4606ib.zze |= Integer.MIN_VALUE;
        c4606ib.zzM = j11;
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m23163J0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 16;
        c4606ib.zzl = j11;
    }

    /* renamed from: K */
    public static /* synthetic */ void m23164K(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 2;
        c4606ib.zzO = j11;
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m23165K0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 32;
        c4606ib.zzm = j11;
    }

    /* renamed from: L */
    public static /* synthetic */ void m23166L(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 4;
        c4606ib.zzP = j11;
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m23167L0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 1024;
        c4606ib.zzr = j11;
    }

    /* renamed from: M */
    public static /* synthetic */ void m23168M(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 8;
        c4606ib.zzQ = j11;
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m23169M0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        c4606ib.zzs = j11;
    }

    /* renamed from: N */
    public static /* synthetic */ void m23170N(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 16;
        c4606ib.zzR = j11;
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m23171N0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 8192;
        c4606ib.zzu = j11;
    }

    /* renamed from: O */
    public static /* synthetic */ void m23172O(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 32;
        c4606ib.zzS = j11;
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m23173O0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 16384;
        c4606ib.zzv = j11;
    }

    /* renamed from: P */
    public static /* synthetic */ void m23174P(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 64;
        c4606ib.zzT = j11;
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m23175P0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 32768;
        c4606ib.zzw = j11;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m23176Q0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 65536;
        c4606ib.zzx = j11;
    }

    /* renamed from: R */
    public static /* synthetic */ void m23177R(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zzf |= 128;
        c4606ib.zzU = str;
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m23178R0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 524288;
        c4606ib.zzA = j11;
    }

    /* renamed from: S */
    public static /* synthetic */ void m23179S(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zzf |= 256;
        c4606ib.zzV = str;
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m23180S0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE;
        c4606ib.zzB = j11;
    }

    /* renamed from: T */
    public static /* synthetic */ void m23181T(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 4096;
        c4606ib.zzZ = j11;
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m23182T0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 2097152;
        c4606ib.zzC = j11;
    }

    /* renamed from: U */
    public static /* synthetic */ void m23183U(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 8192;
        c4606ib.zzaa = j11;
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m23184U0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zze |= 4194304;
        c4606ib.zzD = str;
    }

    /* renamed from: V */
    public static /* synthetic */ void m23185V(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 16384;
        c4606ib.zzab = j11;
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m23186V0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zze |= 16777216;
        c4606ib.zzF = str;
    }

    /* renamed from: W */
    public static /* synthetic */ void m23187W(C4606ib c4606ib, C4458eb c4458eb) {
        c4458eb.getClass();
        c4606ib.zzaf = c4458eb;
        c4606ib.zzf |= 262144;
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m23188W0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 33554432;
        c4606ib.zzG = j11;
    }

    /* renamed from: X */
    public static /* synthetic */ void m23189X(C4606ib c4606ib, C4458eb c4458eb) {
        c4458eb.getClass();
        cv3 cv3Var = c4606ib.zzag;
        if (!cv3Var.zzc()) {
            c4606ib.zzag = tu3.m26768x(cv3Var);
        }
        c4606ib.zzag.add(c4458eb);
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m23190X0(C4606ib c4606ib, long j11) {
        c4606ib.zze |= 67108864;
        c4606ib.zzH = j11;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m23192Z(C4606ib c4606ib, C4532gb c4532gb) {
        c4532gb.getClass();
        c4606ib.zzah = c4532gb;
        c4606ib.zzf |= 524288;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m23193a0(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 2097152;
        c4606ib.zzaj = j11;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m23194b0(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 4194304;
        c4606ib.zzak = j11;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m23195c0(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 8388608;
        c4606ib.zzal = j11;
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m23196d0(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 67108864;
        c4606ib.zzao = j11;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m23197e0(C4606ib c4606ib, long j11) {
        c4606ib.zzf |= 134217728;
        c4606ib.zzap = j11;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m23198f0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zzf |= 268435456;
        c4606ib.zzaq = str;
    }

    /* renamed from: g0 */
    public static C4939ra m23199g0() {
        return (C4939ra) zzb.m26772C();
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m23200h0(C4606ib c4606ib, long j11) {
        c4606ib.zzg |= 512;
        c4606ib.zzaF = j11;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m23201j0(C4606ib c4606ib, long j11) {
        c4606ib.zzg |= 1024;
        c4606ib.zzaG = j11;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m23202k0(C4606ib c4606ib, long j11) {
        c4606ib.zzg |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        c4606ib.zzaH = j11;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m23203l0(C4606ib c4606ib, long j11) {
        c4606ib.zzg |= 4096;
        c4606ib.zzaI = j11;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m23204m0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zzg |= 32768;
        c4606ib.zzaL = str;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m23205n0(C4606ib c4606ib, String str) {
        str.getClass();
        c4606ib.zzg |= 131072;
        c4606ib.zzaN = str;
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m23206o0(C4606ib c4606ib, boolean z11) {
        c4606ib.zzg |= 524288;
        c4606ib.zzaP = z11;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m23207p0(C4606ib c4606ib, long j11) {
        c4606ib.zzg |= 2097152;
        c4606ib.zzaR = j11;
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m23208u0(C4606ib c4606ib, int i11) {
        c4606ib.zzX = i11 - 1;
        c4606ib.zzf |= 1024;
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m23209v0(C4606ib c4606ib, int i11) {
        c4606ib.zzY = i11 - 1;
        c4606ib.zzf |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m23210w0(C4606ib c4606ib, int i11) {
        c4606ib.zzae = i11 - 1;
        c4606ib.zzf |= 131072;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m23211x0(C4606ib c4606ib, int i11) {
        c4606ib.zzax = i11 - 1;
        c4606ib.zzg |= 8;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m23212y0(C4606ib c4606ib, int i11) {
        c4606ib.zzay = i11 - 1;
        c4606ib.zzg |= 16;
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m23213z0(C4606ib c4606ib, int i11) {
        c4606ib.zzaO = 5;
        c4606ib.zzg |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new C4939ra(null);
                }
                return new C4606ib();
            }
            xu3 xu3Var = C4828ob.f25528a;
            return tu3.m26770z(zzb, "\u0001\\\u0000\u0003\u0001Į\\\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂP\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈQ\u0019ဂU\u001aဌR\u001bဈ\u0016\u001cဇS\u001dဈ\u0018\u001eဈT\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOÉဉVĭဂWĮဈX", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaM", "zzB", "zzC", "zzaN", "zzaR", "zzaO", C5124wa.f29851a, "zzD", "zzaP", "zzF", "zzaQ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", C4458eb.class, "zzS", "zzT", "zzU", "zzV", "zzX", xu3Var, "zzY", xu3Var, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", xu3Var, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", C4791nb.f25122a, "zzat", C4866pb.f26149a, "zzaq", "zzau", C4976sa.f27600a, "zzav", "zzaw", "zzam", "zzan", "zzax", xu3Var, "zzW", "zzE", "zzay", xu3Var, "zzaz", "zzaA", C4311ab.class, "zzaB", xu3Var, "zzaC", C5050ua.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaS", "zzaT", "zzaU"});
        }
        return (byte) 1;
    }

    /* renamed from: D0 */
    public final C4940rb m23214D0() {
        C4940rb c4940rb = this.zzaS;
        if (c4940rb == null) {
            return C4940rb.m26059H();
        }
        return c4940rb;
    }

    /* renamed from: E0 */
    public final String m23215E0() {
        return this.zzaN;
    }

    /* renamed from: F0 */
    public final String m23216F0() {
        return this.zzD;
    }

    /* renamed from: q0 */
    public final boolean m23217q0() {
        return this.zzaP;
    }

    /* renamed from: r0 */
    public final boolean m23218r0() {
        return (this.zze & 4194304) != 0;
    }

    /* renamed from: s0 */
    public final boolean m23219s0() {
        return (this.zzg & 4194304) != 0;
    }

    /* renamed from: t0 */
    public final int m23220t0() {
        int m27873a = AbstractC5162xa.m27873a(this.zzaO);
        if (m27873a == 0) {
            return 3;
        }
        return m27873a;
    }
}
