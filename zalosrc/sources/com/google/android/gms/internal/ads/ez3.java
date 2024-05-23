package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class ez3 extends tu3 implements aw3 {
    private static final ez3 zzb;
    private dz3 zzA;
    private ey3 zzC;
    private vx3 zzE;
    private int zze;
    private int zzf;
    private int zzg;
    private ay3 zzk;
    private ry3 zzo;
    private boolean zzp;
    private boolean zzs;
    private boolean zzt;
    private az3 zzv;
    private boolean zzw;
    private byte zzF = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private cv3 zzl = tu3.m26767w();
    private cv3 zzm = tu3.m26767w();
    private String zzn = "";
    private cv3 zzq = tu3.m26767w();
    private String zzr = "";
    private mt3 zzu = mt3.f24751q;
    private String zzx = "";
    private cv3 zzy = tu3.m26767w();
    private cv3 zzz = tu3.m26767w();
    private cv3 zzB = tu3.m26767w();
    private String zzD = "";

    static {
        ez3 ez3Var = new ez3();
        zzb = ez3Var;
        tu3.m26755A(ez3.class, ez3Var);
    }

    private ez3() {
    }

    /* renamed from: F */
    public static xx3 m21838F() {
        return (xx3) zzb.m26772C();
    }

    /* renamed from: K */
    public static /* synthetic */ void m21840K(ez3 ez3Var, String str) {
        str.getClass();
        ez3Var.zze |= 4;
        ez3Var.zzh = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m21841L(ez3 ez3Var, String str) {
        str.getClass();
        ez3Var.zze |= 8;
        ez3Var.zzi = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m21842M(ez3 ez3Var, ay3 ay3Var) {
        ay3Var.getClass();
        ez3Var.zzk = ay3Var;
        ez3Var.zze |= 32;
    }

    /* renamed from: N */
    public static /* synthetic */ void m21843N(ez3 ez3Var, xy3 xy3Var) {
        xy3Var.getClass();
        cv3 cv3Var = ez3Var.zzl;
        if (!cv3Var.zzc()) {
            ez3Var.zzl = tu3.m26768x(cv3Var);
        }
        ez3Var.zzl.add(xy3Var);
    }

    /* renamed from: O */
    public static /* synthetic */ void m21844O(ez3 ez3Var, String str) {
        ez3Var.zze |= 64;
        ez3Var.zzn = str;
    }

    /* renamed from: P */
    public static /* synthetic */ void m21845P(ez3 ez3Var) {
        ez3Var.zze &= -65;
        ez3Var.zzn = zzb.zzn;
    }

    /* renamed from: R */
    public static /* synthetic */ void m21846R(ez3 ez3Var, ry3 ry3Var) {
        ry3Var.getClass();
        ez3Var.zzo = ry3Var;
        ez3Var.zze |= 128;
    }

    /* renamed from: S */
    public static /* synthetic */ void m21847S(ez3 ez3Var, az3 az3Var) {
        az3Var.getClass();
        ez3Var.zzv = az3Var;
        ez3Var.zze |= 8192;
    }

    /* renamed from: T */
    public static /* synthetic */ void m21848T(ez3 ez3Var, Iterable iterable) {
        cv3 cv3Var = ez3Var.zzy;
        if (!cv3Var.zzc()) {
            ez3Var.zzy = tu3.m26768x(cv3Var);
        }
        vs3.m27345i(iterable, ez3Var.zzy);
    }

    /* renamed from: U */
    public static /* synthetic */ void m21849U(ez3 ez3Var, Iterable iterable) {
        cv3 cv3Var = ez3Var.zzz;
        if (!cv3Var.zzc()) {
            ez3Var.zzz = tu3.m26768x(cv3Var);
        }
        vs3.m27345i(iterable, ez3Var.zzz);
    }

    /* renamed from: V */
    public static /* synthetic */ void m21850V(ez3 ez3Var, int i11) {
        ez3Var.zzf = i11 - 1;
        ez3Var.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.tu3
    /* renamed from: D */
    public final Object mo20044D(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            byte b11 = 1;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            if (obj == null) {
                                b11 = 0;
                            }
                            this.zzF = b11;
                            return null;
                        }
                        return zzb;
                    }
                    return new xx3(null);
                }
                return new ez3();
            }
            return tu3.m26770z(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", xy3.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", sy3.f28061a, "zzg", wx3.f30252a, "zzk", "zzn", "zzo", "zzu", "zzm", iz3.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", oz3.class, "zzC", "zzD", "zzE"});
        }
        return Byte.valueOf(this.zzF);
    }

    /* renamed from: H */
    public final String m21851H() {
        return this.zzn;
    }

    /* renamed from: I */
    public final String m21852I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final List m21853J() {
        return this.zzl;
    }
}
