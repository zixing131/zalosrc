package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ub3 extends vb3 {

    /* renamed from: t */
    private final Callable f28814t;

    /* renamed from: u */
    final /* synthetic */ wb3 f28815u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub3(wb3 wb3Var, Callable callable, Executor executor) {
        super(wb3Var, executor);
        this.f28815u = wb3Var;
        callable.getClass();
        this.f28814t = callable;
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: a */
    final Object mo23602a() {
        return this.f28814t.call();
    }

    @Override // com.google.android.gms.internal.ads.sc3
    /* renamed from: b */
    final String mo23603b() {
        return this.f28814t.toString();
    }

    @Override // com.google.android.gms.internal.ads.vb3
    /* renamed from: h */
    final void mo26912h(Object obj) {
        this.f28815u.mo20863g(obj);
    }
}
