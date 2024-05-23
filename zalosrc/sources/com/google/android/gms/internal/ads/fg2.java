package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class fg2 implements sh2 {

    /* renamed from: a */
    private final uc3 f20109a;

    /* renamed from: b */
    private final Bundle f20110b;

    public fg2(uc3 uc3Var, Bundle bundle) {
        this.f20109a = uc3Var;
        this.f20110b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ gg2 m22021a() {
        return new gg2(this.f20110b);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f20109a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.eg2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fg2.this.m22021a();
            }
        });
    }
}
