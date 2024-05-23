package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ax2 extends tu3 implements aw3 {
    private static final ax2 zzb;
    private int zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";

    static {
        ax2 ax2Var = new ax2();
        zzb = ax2Var;
        tu3.m26755A(ax2.class, ax2Var);
    }

    private ax2() {
    }

    /* renamed from: F */
    public static zw2 m20310F() {
        return (zw2) zzb.m26772C();
    }

    /* renamed from: H */
    public static /* synthetic */ void m20312H(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzi = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m20313I(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzj = str;
    }

    /* renamed from: J */
    public static /* synthetic */ void m20314J(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzk = str;
    }

    /* renamed from: N */
    public static /* synthetic */ void m20318N(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzq = str;
    }

    /* renamed from: O */
    public static /* synthetic */ void m20319O(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzr = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m20320P(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzs = str;
    }

    /* renamed from: T */
    public static /* synthetic */ void m20323T(ax2 ax2Var, String str) {
        str.getClass();
        ax2Var.zzu = str;
    }

    /* renamed from: W */
    public static /* synthetic */ void m20326W(ax2 ax2Var, int i11) {
        if (i11 != 1) {
            ax2Var.zzm = i11 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: X */
    public static /* synthetic */ void m20327X(ax2 ax2Var, int i11) {
        if (i11 != 1) {
            ax2Var.zzp = i11 - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
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
                    return new zw2(null);
                }
                return new ax2();
            }
            return tu3.m26770z(zzb, "\u0000\u0011\u0000\u0000\u0001\u0011\u0011\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        return (byte) 1;
    }
}
