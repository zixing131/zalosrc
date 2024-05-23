package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class y42 extends mg0 implements h91 {

    /* renamed from: p */
    private ng0 f30758p;

    /* renamed from: q */
    private g91 f30759q;

    /* renamed from: r */
    private ag1 f30760r;

    @Override // com.google.android.gms.internal.ads.h91
    /* renamed from: E */
    public final synchronized void mo22745E(g91 g91Var) {
        this.f30759q = g91Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: F */
    public final synchronized void mo24285F(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ng0Var.mo24285F(interfaceC4271b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: F0 */
    public final synchronized void mo24286F0(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27585r.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: F1 */
    public final synchronized void mo24287F1(InterfaceC4271b interfaceC4271b, zzcce zzcceVar) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27586s.mo23710n(zzcceVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: H */
    public final synchronized void mo24910H(InterfaceC4271b interfaceC4271b, int i11) {
        ag1 ag1Var = this.f30760r;
        if (ag1Var != null) {
            yk0.zzj("Fail to initialize adapter ".concat(String.valueOf(((r72) ag1Var).f27128c.f19948a)));
        }
    }

    /* renamed from: I3 */
    public final synchronized void m28124I3(ag1 ag1Var) {
        this.f30760r = ag1Var;
    }

    /* renamed from: Q */
    public final synchronized void m28125Q(ng0 ng0Var) {
        this.f30758p = ng0Var;
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: j0 */
    public final synchronized void mo24288j0(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27586s.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    /* renamed from: l3 */
    public final synchronized void mo24911l3(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27585r.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final synchronized void zze(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27584q.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final synchronized void zzg(InterfaceC4271b interfaceC4271b, int i11) {
        g91 g91Var = this.f30759q;
        if (g91Var != null) {
            g91Var.mo20821a(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final synchronized void zzi(InterfaceC4271b interfaceC4271b) {
        g91 g91Var = this.f30759q;
        if (g91Var != null) {
            g91Var.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final synchronized void zzj(InterfaceC4271b interfaceC4271b) {
        ng0 ng0Var = this.f30758p;
        if (ng0Var != null) {
            ((s72) ng0Var).f27583p.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final synchronized void zzl(InterfaceC4271b interfaceC4271b) {
        Executor executor;
        ag1 ag1Var = this.f30760r;
        if (ag1Var != null) {
            executor = ((r72) ag1Var).f27129d.f28252b;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.q72

                /* renamed from: q */
                public final /* synthetic */ tq2 f26671q;

                /* renamed from: r */
                public final /* synthetic */ iq2 f26672r;

                /* renamed from: s */
                public final /* synthetic */ f32 f26673s;

                public /* synthetic */ q72(tq2 tq2Var, iq2 iq2Var, f32 f32Var) {
                    r2 = tq2Var;
                    r3 = iq2Var;
                    r4 = f32Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    r72 r72Var = r72.this;
                    tq2 tq2Var = r2;
                    iq2 iq2Var = r3;
                    f32 f32Var = r4;
                    t72 t72Var = r72Var.f27129d;
                    t72.m26584e(tq2Var, iq2Var, f32Var);
                }
            });
        }
    }
}
