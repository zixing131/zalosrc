package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class se2 implements sh2 {

    /* renamed from: a */
    private final uc3 f27653a;

    public se2(uc3 uc3Var) {
        this.f27653a = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f27653a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.re2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new te2(zzt.zzs().zzb(), zzt.zzs().zzm());
            }
        });
    }
}
