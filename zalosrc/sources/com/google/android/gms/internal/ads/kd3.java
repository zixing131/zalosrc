package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class kd3 extends sc3 {

    /* renamed from: r */
    private final Callable f23220r;

    /* renamed from: s */
    final /* synthetic */ ld3 f23221s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kd3(ld3 ld3Var, Callable callable) {
        this.f23221s = ld3Var;
        callable.getClass();
        this.f23220r = callable;
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: a */
    final Object mo23602a() {
        return this.f23220r.call();
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: b */
    final String mo23603b() {
        return this.f23220r.toString();
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: d */
    final void mo23604d(Throwable th2) {
        this.f23221s.mo20864h(th2);
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: e */
    final void mo23605e(Object obj) {
        this.f23221s.mo20863g(obj);
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: f */
    final boolean mo23606f() {
        return this.f23221s.isDone();
    }
}
