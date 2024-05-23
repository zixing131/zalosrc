package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class tj2 implements sh2 {

    /* renamed from: a */
    final uc3 f28383a;

    /* renamed from: b */
    final List f28384b;

    /* renamed from: c */
    final C4924qw f28385c;

    public tj2(C4924qw c4924qw, uc3 uc3Var, List list, byte[] bArr) {
        this.f28385c = c4924qw;
        this.f28383a = uc3Var;
        this.f28384b = list;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f28383a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.sj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new uj2(tj2.this.f28384b);
            }
        });
    }
}
