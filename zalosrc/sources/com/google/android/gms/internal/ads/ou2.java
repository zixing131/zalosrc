package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ou2 {

    /* renamed from: a */
    private final Object f25955a;

    /* renamed from: b */
    private final List f25956b;

    /* renamed from: c */
    final /* synthetic */ yu2 f25957c;

    public /* synthetic */ ou2(yu2 yu2Var, Object obj, List list, nu2 nu2Var) {
        this.f25957c = yu2Var;
        this.f25955a = obj;
        this.f25956b = list;
    }

    /* renamed from: a */
    public final xu2 m25330a(Callable callable) {
        uc3 uc3Var;
        jc3 m23871c = kc3.m23871c(this.f25956b);
        tc3 m23601a = m23871c.m23601a(mu2.f24760a, kl0.f23368f);
        yu2 yu2Var = this.f25957c;
        Object obj = this.f25955a;
        List list = this.f25956b;
        uc3Var = yu2Var.f31220a;
        return new xu2(yu2Var, obj, m23601a, list, m23871c.m23601a(callable, uc3Var));
    }
}
