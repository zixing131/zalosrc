package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xu2 {

    /* renamed from: a */
    private final Object f30628a;

    /* renamed from: b */
    private final String f30629b;

    /* renamed from: c */
    private final tc3 f30630c;

    /* renamed from: d */
    private final List f30631d;

    /* renamed from: e */
    private final tc3 f30632e;

    /* renamed from: f */
    final /* synthetic */ yu2 f30633f;

    /* JADX INFO: Access modifiers changed from: private */
    public xu2(yu2 yu2Var, Object obj, String str, tc3 tc3Var, List list, tc3 tc3Var2) {
        this.f30633f = yu2Var;
        this.f30628a = obj;
        this.f30629b = str;
        this.f30630c = tc3Var;
        this.f30631d = list;
        this.f30632e = tc3Var2;
    }

    /* renamed from: a */
    public final lu2 m28018a() {
        av2 av2Var;
        Object obj = this.f30628a;
        String str = this.f30629b;
        if (str == null) {
            str = this.f30633f.mo23054f(obj);
        }
        lu2 lu2Var = new lu2(obj, str, this.f30632e);
        av2Var = this.f30633f.f31222c;
        av2Var.mo20260Y(lu2Var);
        tc3 tc3Var = this.f30630c;
        ru2 ru2Var = new Runnable() { // from class: com.google.android.gms.internal.ads.ru2

            /* renamed from: q */
            public final /* synthetic */ lu2 f27388q;

            public /* synthetic */ ru2(lu2 lu2Var2) {
                r2 = lu2Var2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                av2 av2Var2;
                xu2 xu2Var = xu2.this;
                lu2 lu2Var2 = r2;
                av2Var2 = xu2Var.f30633f.f31222c;
                av2Var2.mo20259Q(lu2Var2);
            }
        };
        uc3 uc3Var = kl0.f23368f;
        tc3Var.zzc(ru2Var, uc3Var);
        kc3.m23886r(lu2Var2, new vu2(this, lu2Var2), uc3Var);
        return lu2Var2;
    }

    /* renamed from: b */
    public final xu2 m28019b(Object obj) {
        return this.f30633f.m28361b(obj, m28018a());
    }

    /* renamed from: c */
    public final xu2 m28020c(Class cls, qb3 qb3Var) {
        uc3 uc3Var;
        yu2 yu2Var = this.f30633f;
        Object obj = this.f30628a;
        String str = this.f30629b;
        tc3 tc3Var = this.f30630c;
        List list = this.f30631d;
        tc3 tc3Var2 = this.f30632e;
        uc3Var = yu2Var.f31220a;
        return new xu2(yu2Var, obj, str, tc3Var, list, kc3.m23875g(tc3Var2, cls, qb3Var, uc3Var));
    }

    /* renamed from: d */
    public final xu2 m28021d(tc3 tc3Var) {
        return m28024g(new qb3() { // from class: com.google.android.gms.internal.ads.su2
            public /* synthetic */ su2() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return tc3.this;
            }
        }, kl0.f23368f);
    }

    /* renamed from: e */
    public final xu2 m28022e(ju2 ju2Var) {
        return m28023f(new qb3() { // from class: com.google.android.gms.internal.ads.uu2
            public /* synthetic */ uu2() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return kc3.m23877i(ju2.this.zza(obj));
            }
        });
    }

    /* renamed from: f */
    public final xu2 m28023f(qb3 qb3Var) {
        uc3 uc3Var;
        uc3Var = this.f30633f.f31220a;
        return m28024g(qb3Var, uc3Var);
    }

    /* renamed from: g */
    public final xu2 m28024g(qb3 qb3Var, Executor executor) {
        return new xu2(this.f30633f, this.f30628a, this.f30629b, this.f30630c, this.f30631d, kc3.m23882n(this.f30632e, qb3Var, executor));
    }

    /* renamed from: h */
    public final xu2 m28025h(String str) {
        return new xu2(this.f30633f, this.f30628a, str, this.f30630c, this.f30631d, this.f30632e);
    }

    /* renamed from: i */
    public final xu2 m28026i(long j11, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        yu2 yu2Var = this.f30633f;
        Object obj = this.f30628a;
        String str = this.f30629b;
        tc3 tc3Var = this.f30630c;
        List list = this.f30631d;
        tc3 tc3Var2 = this.f30632e;
        scheduledExecutorService = yu2Var.f31221b;
        return new xu2(yu2Var, obj, str, tc3Var, list, kc3.m23883o(tc3Var2, j11, timeUnit, scheduledExecutorService));
    }

    public /* synthetic */ xu2(yu2 yu2Var, Object obj, String str, tc3 tc3Var, List list, tc3 tc3Var2, wu2 wu2Var) {
        this(yu2Var, obj, null, tc3Var, list, tc3Var2);
    }
}
