package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class wc2 implements sh2 {

    /* renamed from: a */
    private final uc3 f29877a;

    /* renamed from: b */
    private final dr2 f29878b;

    /* renamed from: c */
    private final zzcgv f29879c;

    /* renamed from: d */
    private final lk0 f29880d;

    public wc2(uc3 uc3Var, dr2 dr2Var, zzcgv zzcgvVar, lk0 lk0Var) {
        this.f29877a = uc3Var;
        this.f29878b = dr2Var;
        this.f29879c = zzcgvVar;
        this.f29880d = lk0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ xc2 m27589a() {
        return new xc2(this.f29878b.f19404j, this.f29879c, this.f29880d.m24319i());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f29877a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.vc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wc2.this.m27589a();
            }
        });
    }
}
