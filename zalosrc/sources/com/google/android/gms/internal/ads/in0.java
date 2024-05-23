package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

/* loaded from: classes2.dex */
public final class in0 implements Runnable {

    /* renamed from: p */
    private final zzcim f22232p;

    /* renamed from: q */
    private boolean f22233q = false;

    public in0(zzcim zzcimVar) {
        this.f22232p = zzcimVar;
    }

    /* renamed from: c */
    private final void m23303c() {
        m23 m23Var = zzs.zza;
        m23Var.removeCallbacks(this);
        m23Var.postDelayed(this, 250L);
    }

    /* renamed from: a */
    public final void m23304a() {
        this.f22233q = true;
        this.f22232p.m28778y();
    }

    /* renamed from: b */
    public final void m23305b() {
        this.f22233q = false;
        m23303c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f22233q) {
            this.f22232p.m28778y();
            m23303c();
        }
    }
}
