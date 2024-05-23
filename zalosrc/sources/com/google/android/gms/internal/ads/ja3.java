package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ja3 extends la3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ja3(tc3 tc3Var, Class cls, qb3 qb3Var) {
        super(tc3Var, cls, qb3Var);
    }

    @Override // com.google.android.gms.internal.ads.la3
    /* renamed from: E */
    final /* bridge */ /* synthetic */ Object mo23579E(Object obj, Throwable th2) {
        qb3 qb3Var = (qb3) obj;
        tc3 zza = qb3Var.zza(th2);
        j53.m23534d(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qb3Var);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.la3
    /* renamed from: F */
    final /* synthetic */ void mo23580F(Object obj) {
        m24527w((tc3) obj);
    }
}
