package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class yl2 implements z71, w91, rn2, zzo, ja1, m81, pf1 {

    /* renamed from: p */
    private final ks2 f31005p;

    /* renamed from: q */
    private final AtomicReference f31006q = new AtomicReference();

    /* renamed from: r */
    private final AtomicReference f31007r = new AtomicReference();

    /* renamed from: s */
    private final AtomicReference f31008s = new AtomicReference();

    /* renamed from: t */
    private final AtomicReference f31009t = new AtomicReference();

    /* renamed from: u */
    private final AtomicReference f31010u = new AtomicReference();

    /* renamed from: v */
    private final AtomicReference f31011v = new AtomicReference();

    /* renamed from: w */
    private yl2 f31012w = null;

    public yl2(ks2 ks2Var) {
        this.f31005p = ks2Var;
    }

    /* renamed from: j */
    public static yl2 m28225j(yl2 yl2Var) {
        yl2 yl2Var2 = new yl2(yl2Var.f31005p);
        yl2Var2.f31012w = yl2Var;
        return yl2Var2;
    }

    /* renamed from: G */
    public final void m28226G(InterfaceC4919qr interfaceC4919qr) {
        this.f31008s.set(interfaceC4919qr);
    }

    /* renamed from: Q */
    public final void m28227Q(C4807nr c4807nr) {
        this.f31007r.set(c4807nr);
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(final zze zzeVar) {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.mo20715a(zzeVar);
        } else {
            in2.m23309a(this.f31006q, new hn2() { // from class: com.google.android.gms.internal.ads.il2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((InterfaceC4770mr) obj).mo21783p4(zze.this);
                }
            });
            in2.m23309a(this.f31006q, new hn2() { // from class: com.google.android.gms.internal.ads.ol2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((InterfaceC4770mr) obj).zzb(zze.this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ja1
    /* renamed from: c */
    public final void mo22410c(final zzs zzsVar) {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.mo22410c(zzsVar);
        } else {
            in2.m23309a(this.f31011v, new hn2() { // from class: com.google.android.gms.internal.ads.ll2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((zzde) obj).zze(zzs.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.rn2
    /* renamed from: g */
    public final void mo24008g(rn2 rn2Var) {
        this.f31012w = (yl2) rn2Var;
    }

    /* renamed from: k */
    public final void m28228k(final InterfaceC4658jr interfaceC4658jr) {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.m28228k(interfaceC4658jr);
        } else {
            in2.m23309a(this.f31006q, new hn2() { // from class: com.google.android.gms.internal.ads.pl2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((InterfaceC4770mr) obj).mo21782a1(InterfaceC4658jr.this);
                }
            });
        }
    }

    /* renamed from: n */
    public final void m28229n(w91 w91Var) {
        this.f31009t.set(w91Var);
    }

    /* renamed from: o */
    public final void m28230o(zzo zzoVar) {
        this.f31010u.set(zzoVar);
    }

    /* renamed from: r */
    public final void m28231r(zzde zzdeVar) {
        this.f31011v.set(zzdeVar);
    }

    /* renamed from: t */
    public final void m28232t(InterfaceC4770mr interfaceC4770mr) {
        this.f31006q.set(interfaceC4770mr);
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final void mo22412z(final zze zzeVar) {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.mo22412z(zzeVar);
        } else {
            in2.m23309a(this.f31008s, new hn2() { // from class: com.google.android.gms.internal.ads.ul2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((InterfaceC4919qr) obj).zzd(zze.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzb();
            return;
        }
        in2.m23309a(this.f31010u, new hn2() { // from class: com.google.android.gms.internal.ads.ql2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzo) obj).zzb();
            }
        });
        in2.m23309a(this.f31008s, new hn2() { // from class: com.google.android.gms.internal.ads.sl2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((InterfaceC4919qr) obj).zzf();
            }
        });
        in2.m23309a(this.f31008s, new hn2() { // from class: com.google.android.gms.internal.ads.tl2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((InterfaceC4919qr) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzbC();
        } else {
            in2.m23309a(this.f31010u, new hn2() { // from class: com.google.android.gms.internal.ads.nl2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((zzo) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zze();
        } else {
            in2.m23309a(this.f31010u, new hn2() { // from class: com.google.android.gms.internal.ads.vl2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i11) {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzf(i11);
        } else {
            in2.m23309a(this.f31010u, new hn2() { // from class: com.google.android.gms.internal.ads.ml2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((zzo) obj).zzf(i11);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.w91
    public final void zzh() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzh();
        } else {
            in2.m23309a(this.f31009t, new hn2() { // from class: com.google.android.gms.internal.ads.xl2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((w91) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzj();
            return;
        }
        this.f31005p.m24024a();
        in2.m23309a(this.f31007r, new hn2() { // from class: com.google.android.gms.internal.ads.jl2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((C4807nr) obj).zze();
            }
        });
        in2.m23309a(this.f31008s, new hn2() { // from class: com.google.android.gms.internal.ads.kl2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((InterfaceC4919qr) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        yl2 yl2Var = this.f31012w;
        if (yl2Var != null) {
            yl2Var.zzq();
        } else {
            in2.m23309a(this.f31008s, new hn2() { // from class: com.google.android.gms.internal.ads.wl2
                @Override // com.google.android.gms.internal.ads.hn2
                public final void zza(Object obj) {
                    ((InterfaceC4919qr) obj).zzb();
                }
            });
        }
    }
}
