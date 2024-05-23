package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.eb */
/* loaded from: classes2.dex */
public final class C4458eb extends tu3 implements aw3 {
    private static final C4458eb zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        C4458eb c4458eb = new C4458eb();
        zzb = c4458eb;
        tu3.m26755A(C4458eb.class, c4458eb);
    }

    private C4458eb() {
    }

    /* renamed from: F */
    public static C4421db m21662F() {
        return (C4421db) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m21664H(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 1;
        c4458eb.zzf = j11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m21665I(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 2;
        c4458eb.zzg = j11;
    }

    /* renamed from: J */
    public static /* synthetic */ void m21666J(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 4;
        c4458eb.zzh = j11;
    }

    /* renamed from: K */
    public static /* synthetic */ void m21667K(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 8;
        c4458eb.zzi = j11;
    }

    /* renamed from: L */
    public static /* synthetic */ void m21668L(C4458eb c4458eb) {
        c4458eb.zze &= -9;
        c4458eb.zzi = -1L;
    }

    /* renamed from: M */
    public static /* synthetic */ void m21669M(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 16;
        c4458eb.zzj = j11;
    }

    /* renamed from: N */
    public static /* synthetic */ void m21670N(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 32;
        c4458eb.zzk = j11;
    }

    /* renamed from: O */
    public static /* synthetic */ void m21671O(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 128;
        c4458eb.zzm = j11;
    }

    /* renamed from: P */
    public static /* synthetic */ void m21672P(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 256;
        c4458eb.zzn = j11;
    }

    /* renamed from: R */
    public static /* synthetic */ void m21673R(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 512;
        c4458eb.zzo = j11;
    }

    /* renamed from: S */
    public static /* synthetic */ void m21674S(C4458eb c4458eb, long j11) {
        c4458eb.zze |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        c4458eb.zzq = j11;
    }

    /* renamed from: T */
    public static /* synthetic */ void m21675T(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 4096;
        c4458eb.zzr = j11;
    }

    /* renamed from: U */
    public static /* synthetic */ void m21676U(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 8192;
        c4458eb.zzs = j11;
    }

    /* renamed from: V */
    public static /* synthetic */ void m21677V(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 16384;
        c4458eb.zzt = j11;
    }

    /* renamed from: W */
    public static /* synthetic */ void m21678W(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 32768;
        c4458eb.zzu = j11;
    }

    /* renamed from: X */
    public static /* synthetic */ void m21679X(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 65536;
        c4458eb.zzv = j11;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m21680Y(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 131072;
        c4458eb.zzw = j11;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m21681Z(C4458eb c4458eb, long j11) {
        c4458eb.zze |= 262144;
        c4458eb.zzx = j11;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m21682a0(C4458eb c4458eb, int i11) {
        c4458eb.zzl = i11 - 1;
        c4458eb.zze |= 64;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m21683b0(C4458eb c4458eb, int i11) {
        c4458eb.zzp = i11 - 1;
        c4458eb.zze |= 1024;
    }

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
                    return new C4421db(null);
                }
                return new C4458eb();
            }
            xu3 xu3Var = C4828ob.f25528a;
            return tu3.m26770z(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", xu3Var, "zzm", "zzn", "zzo", "zzp", xu3Var, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        return (byte) 1;
    }
}
