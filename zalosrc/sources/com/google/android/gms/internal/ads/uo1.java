package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class uo1 implements Callable {

    /* renamed from: a */
    private final zza f28999a;

    /* renamed from: b */
    private final nr0 f29000b;

    /* renamed from: c */
    private final Context f29001c;

    /* renamed from: d */
    private final dt1 f29002d;

    /* renamed from: e */
    private final rv2 f29003e;

    /* renamed from: f */
    private final n22 f29004f;

    /* renamed from: g */
    private final Executor f29005g;

    /* renamed from: h */
    private final C4830od f29006h;

    /* renamed from: i */
    private final zzcgv f29007i;

    /* renamed from: j */
    private final ox2 f29008j;

    public uo1(Context context, Executor executor, C4830od c4830od, zzcgv zzcgvVar, zza zzaVar, nr0 nr0Var, n22 n22Var, ox2 ox2Var, dt1 dt1Var, rv2 rv2Var) {
        this.f29001c = context;
        this.f29005g = executor;
        this.f29006h = c4830od;
        this.f29007i = zzcgvVar;
        this.f28999a = zzaVar;
        this.f29000b = nr0Var;
        this.f29004f = n22Var;
        this.f29008j = ox2Var;
        this.f29002d = dt1Var;
        this.f29003e = rv2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m27017a(uo1 uo1Var) {
        return uo1Var.f29001c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ C4830od m27018b(uo1 uo1Var) {
        return uo1Var.f29006h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ zza m27019c(uo1 uo1Var) {
        return uo1Var.f28999a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ zzcgv m27020d(uo1 uo1Var) {
        return uo1Var.f29007i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ nr0 m27021e(uo1 uo1Var) {
        return uo1Var.f29000b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ dt1 m27022f(uo1 uo1Var) {
        return uo1Var.f29002d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ n22 m27023g(uo1 uo1Var) {
        return uo1Var.f29004f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* bridge */ /* synthetic */ rv2 m27024h(uo1 uo1Var) {
        return uo1Var.f29003e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static /* bridge */ /* synthetic */ ox2 m27025i(uo1 uo1Var) {
        return uo1Var.f29008j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static /* bridge */ /* synthetic */ Executor m27026j(uo1 uo1Var) {
        return uo1Var.f29005g;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        xo1 xo1Var = new xo1(this);
        xo1Var.m27957h();
        return xo1Var;
    }
}
