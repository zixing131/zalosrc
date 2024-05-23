package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class j82 implements zzf {

    /* renamed from: a */
    private final t71 f22724a;

    /* renamed from: b */
    private final o81 f22725b;

    /* renamed from: c */
    private final rf1 f22726c;

    /* renamed from: d */
    private final kf1 f22727d;

    /* renamed from: e */
    private final yz0 f22728e;

    /* renamed from: f */
    final AtomicBoolean f22729f = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public j82(t71 t71Var, o81 o81Var, rf1 rf1Var, kf1 kf1Var, yz0 yz0Var) {
        this.f22724a = t71Var;
        this.f22725b = o81Var;
        this.f22726c = rf1Var;
        this.f22727d = kf1Var;
        this.f22728e = yz0Var;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (!this.f22729f.compareAndSet(false, true)) {
            return;
        }
        this.f22728e.zzl();
        this.f22727d.m23936B0(view);
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.f22729f.get()) {
            this.f22724a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.f22729f.get()) {
            this.f22725b.zza();
            this.f22726c.zza();
        }
    }
}
