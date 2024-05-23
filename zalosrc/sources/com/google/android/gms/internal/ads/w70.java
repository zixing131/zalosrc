package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w70 implements tl0 {

    /* renamed from: a */
    final /* synthetic */ g80 f29840a;

    /* renamed from: b */
    final /* synthetic */ kw2 f29841b;

    /* renamed from: c */
    final /* synthetic */ h80 f29842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w70(h80 h80Var, g80 g80Var, kw2 kw2Var) {
        this.f29842c = h80Var;
        this.f29840a = g80Var;
        this.f29841b = kw2Var;
    }

    @Override // com.google.android.gms.internal.ads.tl0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Object obj2;
        g80 g80Var;
        xw2 xw2Var;
        xw2 xw2Var2;
        g80 g80Var2;
        g80 g80Var3;
        obj2 = this.f29842c.f21572a;
        synchronized (obj2) {
            try {
                this.f29842c.f21580i = 0;
                h80 h80Var = this.f29842c;
                g80Var = h80Var.f21579h;
                if (g80Var != null) {
                    g80 g80Var4 = this.f29840a;
                    g80Var2 = h80Var.f21579h;
                    if (g80Var4 != g80Var2) {
                        zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                        g80Var3 = this.f29842c.f21579h;
                        g80Var3.m22294g();
                    }
                }
                this.f29842c.f21579h = this.f29840a;
                if (((Boolean) AbstractC4963ry.f27409d.m24091e()).booleanValue()) {
                    h80 h80Var2 = this.f29842c;
                    xw2Var = h80Var2.f21576e;
                    if (xw2Var != null) {
                        xw2Var2 = h80Var2.f21576e;
                        kw2 kw2Var = this.f29841b;
                        kw2Var.mo23067q(true);
                        xw2Var2.m28055b(kw2Var.zzj());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
