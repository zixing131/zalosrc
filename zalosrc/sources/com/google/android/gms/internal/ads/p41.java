package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class p41 implements zzo {

    /* renamed from: p */
    private final e91 f26060p;

    /* renamed from: q */
    private final AtomicBoolean f26061q = new AtomicBoolean(false);

    /* renamed from: r */
    private final AtomicBoolean f26062r = new AtomicBoolean(false);

    public p41(e91 e91Var) {
        this.f26060p = e91Var;
    }

    /* renamed from: b */
    private final void m25396b() {
        if (!this.f26062r.get()) {
            this.f26062r.set(true);
            this.f26060p.zza();
        }
    }

    /* renamed from: a */
    public final boolean m25397a() {
        return this.f26061q.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.f26060p.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        m25396b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i11) {
        this.f26061q.set(true);
        m25396b();
    }
}
