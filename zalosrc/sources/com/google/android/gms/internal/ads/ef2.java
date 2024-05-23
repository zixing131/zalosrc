package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ef2 implements sh2 {

    /* renamed from: a */
    private final uc3 f19618a;

    /* renamed from: b */
    private final cw1 f19619b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ef2(uc3 uc3Var, cw1 cw1Var) {
        this.f19618a = uc3Var;
        this.f19619b = cw1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ff2 m21701a() {
        return new ff2(this.f19619b.m21172c(), this.f19619b.m21184o(), zzt.zzs().zzl());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f19618a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.df2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ef2.this.m21701a();
            }
        });
    }
}
