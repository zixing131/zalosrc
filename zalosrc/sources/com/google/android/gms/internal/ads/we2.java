package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class we2 implements sh2 {

    /* renamed from: a */
    private final uc3 f29896a;

    /* renamed from: b */
    private final dr2 f29897b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public we2(uc3 uc3Var, dr2 dr2Var) {
        this.f29896a = uc3Var;
        this.f29897b = dr2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ xe2 m27602a() {
        return new xe2("requester_type_2".equals(zzf.zzb(this.f29897b.f19398d)));
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f29896a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ve2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return we2.this.m27602a();
            }
        });
    }
}
