package com.google.android.gms.internal.ads;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zu */
/* loaded from: classes2.dex */
public final class C5256zu extends tu3 implements aw3 {
    private static final zu3 zzb = new C5182xu();
    private static final C5256zu zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private yu3 zzk = tu3.m26764t();
    private C5070uu zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        C5256zu c5256zu = new C5256zu();
        zze = c5256zu;
        tu3.m26755A(C5256zu.class, c5256zu);
    }

    private C5256zu() {
    }

    /* renamed from: F */
    public static /* synthetic */ void m28617F(C5256zu c5256zu, int i11) {
        c5256zu.zzn = i11 - 1;
        c5256zu.zzf |= 64;
    }

    /* renamed from: G */
    public static /* synthetic */ void m28618G(C5256zu c5256zu, int i11) {
        c5256zu.zzo = i11 - 1;
        c5256zu.zzf |= 128;
    }

    /* renamed from: H */
    public static /* synthetic */ void m28619H(C5256zu c5256zu, int i11) {
        c5256zu.zzq = i11 - 1;
        c5256zu.zzf |= 512;
    }

    /* renamed from: N */
    public static C5219yu m28620N() {
        return (C5219yu) zze.m26772C();
    }

    /* renamed from: P */
    public static C5256zu m28622P(byte[] bArr) {
        return (C5256zu) tu3.m26760p(zze, bArr);
    }

    /* renamed from: T */
    public static /* synthetic */ void m28623T(C5256zu c5256zu, long j11) {
        c5256zu.zzf |= 1;
        c5256zu.zzg = j11;
    }

    /* renamed from: U */
    public static /* synthetic */ void m28624U(C5256zu c5256zu, long j11) {
        c5256zu.zzf |= 4;
        c5256zu.zzi = j11;
    }

    /* renamed from: V */
    public static /* synthetic */ void m28625V(C5256zu c5256zu, long j11) {
        c5256zu.zzf |= 8;
        c5256zu.zzj = j11;
    }

    /* renamed from: W */
    public static /* synthetic */ void m28626W(C5256zu c5256zu, Iterable iterable) {
        yu3 yu3Var = c5256zu.zzk;
        if (!yu3Var.zzc()) {
            c5256zu.zzk = tu3.m26765u(yu3Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c5256zu.zzk.mo27068f(((EnumC4809nt) it.next()).m25008b());
        }
    }

    /* renamed from: X */
    public static /* synthetic */ void m28627X(C5256zu c5256zu, C5070uu c5070uu) {
        c5070uu.getClass();
        c5256zu.zzl = c5070uu;
        c5256zu.zzf |= 16;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m28628Y(C5256zu c5256zu, int i11) {
        c5256zu.zzf |= 256;
        c5256zu.zzp = i11;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m28629Z(C5256zu c5256zu, EnumC4478ev enumC4478ev) {
        c5256zu.zzr = enumC4478ev.m21815b();
        c5256zu.zzf |= 1024;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m28630a0(C5256zu c5256zu, long j11) {
        c5256zu.zzf |= ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        c5256zu.zzs = j11;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m28631g0(C5256zu c5256zu, int i11) {
        c5256zu.zzh = i11 - 1;
        c5256zu.zzf |= 2;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m28632h0(C5256zu c5256zu, int i11) {
        c5256zu.zzm = i11 - 1;
        c5256zu.zzf |= 32;
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
                        return zze;
                    }
                    return new C5219yu(null);
                }
                return new C5256zu();
            }
            xu3 xu3Var = C4440du.f19419a;
            return tu3.m26770z(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", xu3Var, "zzi", "zzj", "zzk", EnumC4809nt.m25007d(), "zzl", "zzm", xu3Var, "zzn", xu3Var, "zzo", xu3Var, "zzp", "zzq", xu3Var, "zzr", EnumC4478ev.m21814d(), "zzs"});
        }
        return (byte) 1;
    }

    /* renamed from: I */
    public final int m28633I() {
        return this.zzp;
    }

    /* renamed from: J */
    public final long m28634J() {
        return this.zzj;
    }

    /* renamed from: K */
    public final long m28635K() {
        return this.zzi;
    }

    /* renamed from: L */
    public final long m28636L() {
        return this.zzg;
    }

    /* renamed from: M */
    public final C5070uu m28637M() {
        C5070uu c5070uu = this.zzl;
        if (c5070uu == null) {
            return C5070uu.m27053H();
        }
        return c5070uu;
    }

    /* renamed from: R */
    public final EnumC4478ev m28638R() {
        EnumC4478ev m21813c = EnumC4478ev.m21813c(this.zzr);
        if (m21813c == null) {
            return EnumC4478ev.UNSPECIFIED;
        }
        return m21813c;
    }

    /* renamed from: S */
    public final List m28639S() {
        return new av3(this.zzk, zzb);
    }

    /* renamed from: b0 */
    public final int m28640b0() {
        int m21804a = AbstractC4477eu.m21804a(this.zzn);
        if (m21804a == 0) {
            return 1;
        }
        return m21804a;
    }

    /* renamed from: c0 */
    public final int m28641c0() {
        int m21804a = AbstractC4477eu.m21804a(this.zzo);
        if (m21804a == 0) {
            return 1;
        }
        return m21804a;
    }

    /* renamed from: d0 */
    public final int m28642d0() {
        int m21804a = AbstractC4477eu.m21804a(this.zzq);
        if (m21804a == 0) {
            return 1;
        }
        return m21804a;
    }

    /* renamed from: e0 */
    public final int m28643e0() {
        int m21804a = AbstractC4477eu.m21804a(this.zzh);
        if (m21804a == 0) {
            return 1;
        }
        return m21804a;
    }

    /* renamed from: f0 */
    public final int m28644f0() {
        int m21804a = AbstractC4477eu.m21804a(this.zzm);
        if (m21804a == 0) {
            return 1;
        }
        return m21804a;
    }
}
