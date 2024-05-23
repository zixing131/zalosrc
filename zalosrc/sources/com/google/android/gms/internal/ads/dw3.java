package com.google.android.gms.internal.ads;

import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
final class dw3 implements tw3 {

    /* renamed from: a */
    private final zv3 f19433a;

    /* renamed from: b */
    private final xw3 f19434b;

    /* renamed from: c */
    private final boolean f19435c;

    /* renamed from: d */
    private final hu3 f19436d;

    private dw3(xw3 xw3Var, hu3 hu3Var, zv3 zv3Var) {
        this.f19434b = xw3Var;
        this.f19435c = hu3Var.mo23030h(zv3Var);
        this.f19436d = hu3Var;
        this.f19433a = zv3Var;
    }

    /* renamed from: h */
    public static dw3 m21557h(xw3 xw3Var, hu3 hu3Var, zv3 zv3Var) {
        return new dw3(xw3Var, hu3Var, zv3Var);
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: a */
    public final void mo21226a(Object obj) {
        this.f19434b.mo20341m(obj);
        this.f19436d.mo23027e(obj);
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: b */
    public final void mo21227b(Object obj, Object obj2) {
        vw3.m27401f(this.f19434b, obj, obj2);
        if (this.f19435c) {
            vw3.m27400e(this.f19436d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: c */
    public final boolean mo21228c(Object obj, Object obj2) {
        if (!this.f19434b.mo20332d(obj).equals(this.f19434b.mo20332d(obj2))) {
            return false;
        }
        if (!this.f19435c) {
            return true;
        }
        this.f19436d.mo23023a(obj);
        this.f19436d.mo23023a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: d */
    public final boolean mo21229d(Object obj) {
        this.f19436d.mo23023a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: e */
    public final void mo21230e(Object obj, kw3 kw3Var, gu3 gu3Var) {
        boolean zzO;
        xw3 xw3Var = this.f19434b;
        hu3 hu3Var = this.f19436d;
        Object mo20331c = xw3Var.mo20331c(obj);
        hu3Var.mo23024b(obj);
        while (kw3Var.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = kw3Var.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object mo23025c = hu3Var.mo23025c(gu3Var, this.f19433a, zzd >>> 3);
                        if (mo23025c != null) {
                            hu3Var.mo23028f(kw3Var, mo23025c, gu3Var, null);
                        } else {
                            zzO = xw3Var.m28056p(mo20331c, kw3Var);
                        }
                    } else {
                        zzO = kw3Var.zzO();
                    }
                    if (!zzO) {
                        xw3Var.mo20342n(obj, mo20331c);
                        return;
                    }
                } else {
                    int i11 = 0;
                    Object obj2 = null;
                    mt3 mt3Var = null;
                    while (kw3Var.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = kw3Var.zzd();
                        if (zzd2 == 16) {
                            i11 = kw3Var.zzj();
                            obj2 = hu3Var.mo23025c(gu3Var, this.f19433a, i11);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                hu3Var.mo23028f(kw3Var, obj2, gu3Var, null);
                            } else {
                                mt3Var = kw3Var.zzp();
                            }
                        } else if (!kw3Var.zzO()) {
                            break;
                        }
                    }
                    if (kw3Var.zzd() == 12) {
                        if (mt3Var != null) {
                            if (obj2 != null) {
                                hu3Var.mo23029g(mt3Var, obj2, gu3Var, null);
                            } else {
                                xw3Var.mo20339k(mo20331c, i11, mt3Var);
                            }
                        }
                    } else {
                        throw zzgrq.m28818b();
                    }
                }
            } catch (Throwable th2) {
                xw3Var.mo20342n(obj, mo20331c);
                throw th2;
            }
        }
        xw3Var.mo20342n(obj, mo20331c);
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: f */
    public final void mo21231f(Object obj, cu3 cu3Var) {
        this.f19436d.mo23023a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    /* renamed from: g */
    public final void mo21232g(Object obj, byte[] bArr, int i11, int i12, ys3 ys3Var) {
        tu3 tu3Var = (tu3) obj;
        if (tu3Var.zzc == yw3.m28369c()) {
            tu3Var.zzc = yw3.m28371e();
        }
        AbstractC30228a.m149044a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    public final int zza(Object obj) {
        xw3 xw3Var = this.f19434b;
        int mo20330b = xw3Var.mo20330b(xw3Var.mo20332d(obj));
        if (!this.f19435c) {
            return mo20330b;
        }
        this.f19436d.mo23023a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    public final int zzb(Object obj) {
        int hashCode = this.f19434b.mo20332d(obj).hashCode();
        if (!this.f19435c) {
            return hashCode;
        }
        this.f19436d.mo23023a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tw3
    public final Object zze() {
        return this.f19433a.mo26777g().mo25894i0();
    }
}
