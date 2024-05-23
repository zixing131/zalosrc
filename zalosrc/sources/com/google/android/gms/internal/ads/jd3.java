package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jd3 extends sc3 {

    /* renamed from: r */
    private final pb3 f22785r;

    /* renamed from: s */
    final /* synthetic */ ld3 f22786s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jd3(ld3 ld3Var, pb3 pb3Var) {
        this.f22786s = ld3Var;
        pb3Var.getClass();
        this.f22785r = pb3Var;
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: a */
    final /* bridge */ /* synthetic */ Object mo23602a() {
        tc3 zza = this.f22785r.zza();
        j53.m23534d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f22785r);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: b */
    final String mo23603b() {
        return this.f22785r.toString();
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: d */
    final void mo23604d(Throwable th2) {
        this.f22786s.mo20864h(th2);
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: e */
    final /* synthetic */ void mo23605e(Object obj) {
        this.f22786s.m24527w((tc3) obj);
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: f */
    final boolean mo23606f() {
        return this.f22786s.isDone();
    }
}
