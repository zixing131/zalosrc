package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;

/* renamed from: com.google.android.gms.internal.ads.gu */
/* loaded from: classes2.dex */
public final class C4551gu extends tu3 implements aw3 {
    private static final C4551gu zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private C4960rv zzj;
    private C5181xt zzl;
    private C4367bu zzm;
    private C5070uu zzn;
    private C4329at zzo;
    private C4515fv zzp;
    private C4812nw zzq;
    private C4697kt zzr;
    private String zzg = "";
    private int zzi = 1000;
    private bv3 zzk = tu3.m26766v();

    static {
        C4551gu c4551gu = new C4551gu();
        zzb = c4551gu;
        tu3.m26755A(C4551gu.class, c4551gu);
    }

    private C4551gu() {
    }

    /* renamed from: H */
    public static C4514fu m22524H() {
        return (C4514fu) zzb.m26772C();
    }

    /* renamed from: K */
    public static /* synthetic */ void m22526K(C4551gu c4551gu, String str) {
        str.getClass();
        c4551gu.zze |= 2;
        c4551gu.zzg = str;
    }

    /* renamed from: L */
    public static /* synthetic */ void m22527L(C4551gu c4551gu, Iterable iterable) {
        int i11;
        bv3 bv3Var = c4551gu.zzk;
        if (!bv3Var.zzc()) {
            int size = bv3Var.size();
            if (size == 0) {
                i11 = 10;
            } else {
                i11 = size + size;
            }
            c4551gu.zzk = bv3Var.mo21159c(i11);
        }
        vs3.m27345i(iterable, c4551gu.zzk);
    }

    /* renamed from: N */
    public static /* synthetic */ void m22529N(C4551gu c4551gu, C5181xt c5181xt) {
        c5181xt.getClass();
        c4551gu.zzl = c5181xt;
        c4551gu.zze |= 32;
    }

    /* renamed from: O */
    public static /* synthetic */ void m22530O(C4551gu c4551gu, C4329at c4329at) {
        c4329at.getClass();
        c4551gu.zzo = c4329at;
        c4551gu.zze |= 256;
    }

    /* renamed from: P */
    public static /* synthetic */ void m22531P(C4551gu c4551gu, C4515fv c4515fv) {
        c4515fv.getClass();
        c4551gu.zzp = c4515fv;
        c4551gu.zze |= 512;
    }

    /* renamed from: R */
    public static /* synthetic */ void m22532R(C4551gu c4551gu, C4812nw c4812nw) {
        c4812nw.getClass();
        c4551gu.zzq = c4812nw;
        c4551gu.zze |= 1024;
    }

    /* renamed from: S */
    public static /* synthetic */ void m22533S(C4551gu c4551gu, C4697kt c4697kt) {
        c4697kt.getClass();
        c4551gu.zzr = c4697kt;
        c4551gu.zze |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
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
                    return new C4514fu(null);
                }
                return new C4551gu();
            }
            return tu3.m26770z(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", C4440du.f19419a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    /* renamed from: F */
    public final C4329at m22534F() {
        C4329at c4329at = this.zzo;
        if (c4329at == null) {
            return C4329at.m20234G();
        }
        return c4329at;
    }

    /* renamed from: G */
    public final C5181xt m22535G() {
        C5181xt c5181xt = this.zzl;
        if (c5181xt == null) {
            return C5181xt.m28009G();
        }
        return c5181xt;
    }

    /* renamed from: J */
    public final String m22536J() {
        return this.zzg;
    }
}
