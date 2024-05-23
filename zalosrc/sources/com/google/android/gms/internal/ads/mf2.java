package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class mf2 implements sh2 {

    /* renamed from: a */
    private final uc3 f24498a;

    /* renamed from: b */
    private final hq2 f24499b;

    public mf2(uc3 uc3Var, hq2 hq2Var) {
        this.f24498a = uc3Var;
        this.f24499b = hq2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ nf2 m24560a() {
        return new nf2(this.f24499b);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f24498a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.lf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return mf2.this.m24560a();
            }
        });
    }
}
