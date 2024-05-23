package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.ha */
/* loaded from: classes2.dex */
public final class C4568ha extends tu3 implements aw3 {
    private static final C4568ha zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private cv3 zzq = tu3.m26767w();

    static {
        C4568ha c4568ha = new C4568ha();
        zzb = c4568ha;
        tu3.m26755A(C4568ha.class, c4568ha);
    }

    private C4568ha() {
    }

    /* renamed from: F */
    public static C4383ca m22747F() {
        return (C4383ca) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m22749H(C4568ha c4568ha, long j11) {
        c4568ha.zze |= 2;
        c4568ha.zzg = j11;
    }

    /* renamed from: I */
    public static /* synthetic */ void m22750I(C4568ha c4568ha, String str) {
        str.getClass();
        c4568ha.zze |= 4;
        c4568ha.zzh = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m22751J(C4568ha c4568ha, String str) {
        str.getClass();
        c4568ha.zze |= 8;
        c4568ha.zzi = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m22752K(C4568ha c4568ha, String str) {
        c4568ha.zze |= 16;
        c4568ha.zzj = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m22753L(C4568ha c4568ha, String str) {
        c4568ha.zze |= 1024;
        c4568ha.zzp = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m22754M(C4568ha c4568ha, String str) {
        str.getClass();
        c4568ha.zze |= 1;
        c4568ha.zzf = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m22755N(C4568ha c4568ha, int i11) {
        c4568ha.zzr = i11 - 1;
        c4568ha.zze |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
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
                    return new C4383ca(null);
                }
                return new C4568ha();
            }
            return tu3.m26770z(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", C4457ea.class, "zzr", C4494fa.f20076a});
        }
        return (byte) 1;
    }
}
