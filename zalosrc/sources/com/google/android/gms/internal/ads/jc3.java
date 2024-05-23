package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class jc3 {

    /* renamed from: a */
    private final boolean f22778a;

    /* renamed from: b */
    private final c83 f22779b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ jc3(boolean z11, c83 c83Var, hc3 hc3Var) {
        this.f22778a = z11;
        this.f22779b = c83Var;
    }

    /* renamed from: a */
    public final tc3 m23601a(Callable callable, Executor executor) {
        return new wb3(this.f22779b, this.f22778a, executor, callable);
    }
}
