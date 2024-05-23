package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class xy3 extends tu3 implements aw3 {
    private static final xy3 zzb;
    private int zze;
    private int zzf;
    private ky3 zzh;
    private oy3 zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private yu3 zzk = tu3.m26764t();
    private String zzl = "";
    private cv3 zzn = tu3.m26767w();

    static {
        xy3 xy3Var = new xy3();
        zzb = xy3Var;
        tu3.m26755A(xy3.class, xy3Var);
    }

    private xy3() {
    }

    /* renamed from: G */
    public static wy3 m28081G() {
        return (wy3) zzb.m26772C();
    }

    /* renamed from: J */
    public static /* synthetic */ void m28083J(xy3 xy3Var, int i11) {
        xy3Var.zze |= 1;
        xy3Var.zzf = i11;
    }

    /* renamed from: K */
    public static /* synthetic */ void m28084K(xy3 xy3Var, String str) {
        str.getClass();
        xy3Var.zze |= 2;
        xy3Var.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m28085L(xy3 xy3Var, ky3 ky3Var) {
        ky3Var.getClass();
        xy3Var.zzh = ky3Var;
        xy3Var.zze |= 4;
    }

    /* renamed from: M */
    public static /* synthetic */ void m28086M(xy3 xy3Var, String str) {
        str.getClass();
        cv3 cv3Var = xy3Var.zzn;
        if (!cv3Var.zzc()) {
            xy3Var.zzn = tu3.m26768x(cv3Var);
        }
        xy3Var.zzn.add(str);
    }

    /* renamed from: N */
    public static /* synthetic */ void m28087N(xy3 xy3Var, int i11) {
        xy3Var.zzm = i11 - 1;
        xy3Var.zze |= 64;
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
                            this.zzo = b11;
                            return null;
                        }
                        return zzb;
                    }
                    return new wy3(null);
                }
                return new xy3();
            }
            return tu3.m26770z(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", uy3.f29084a, "zzn"});
        }
        return Byte.valueOf(this.zzo);
    }

    /* renamed from: F */
    public final int m28088F() {
        return this.zzn.size();
    }

    /* renamed from: I */
    public final String m28089I() {
        return this.zzg;
    }
}
