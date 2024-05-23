package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x70 implements rl0 {

    /* renamed from: a */
    final /* synthetic */ g80 f30377a;

    /* renamed from: b */
    final /* synthetic */ kw2 f30378b;

    /* renamed from: c */
    final /* synthetic */ h80 f30379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x70(h80 h80Var, g80 g80Var, kw2 kw2Var) {
        this.f30379c = h80Var;
        this.f30377a = g80Var;
        this.f30378b = kw2Var;
    }

    @Override // com.google.android.gms.internal.ads.rl0
    public final void zza() {
        Object obj;
        xw2 xw2Var;
        xw2 xw2Var2;
        obj = this.f30379c.f21572a;
        synchronized (obj) {
            try {
                this.f30379c.f21580i = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                this.f30377a.m22294g();
                if (((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
                    h80 h80Var = this.f30379c;
                    xw2Var = h80Var.f21576e;
                    if (xw2Var != null) {
                        xw2Var2 = h80Var.f21576e;
                        kw2 kw2Var = this.f30378b;
                        kw2Var.mo23067q(false);
                        xw2Var2.m28055b(kw2Var.zzj());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
