package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v42 implements c32 {

    /* renamed from: a */
    private final p21 f29185a;

    /* renamed from: b */
    private final c42 f29186b;

    /* renamed from: c */
    private final uc3 f29187c;

    /* renamed from: d */
    private final y71 f29188d;

    /* renamed from: e */
    private final ScheduledExecutorService f29189e;

    public v42(p21 p21Var, c42 c42Var, y71 y71Var, ScheduledExecutorService scheduledExecutorService, uc3 uc3Var) {
        this.f29185a = p21Var;
        this.f29186b = c42Var;
        this.f29188d = y71Var;
        this.f29189e = scheduledExecutorService;
        this.f29187c = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        if (tq2Var.f28472a.f26941a.m21534a() != null && this.f29186b.mo20789a(tq2Var, iq2Var)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(final tq2 tq2Var, final iq2 iq2Var) {
        return this.f29187c.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.s42
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return v42.this.m27164c(tq2Var, iq2Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ s11 m27164c(final tq2 tq2Var, final iq2 iq2Var) {
        return this.f29185a.mo21154b(new k41(tq2Var, iq2Var, null), new d31(tq2Var.f28472a.f26941a.m21534a(), new Runnable() { // from class: com.google.android.gms.internal.ads.t42
            @Override // java.lang.Runnable
            public final void run() {
                v42.this.m27165f(tq2Var, iq2Var);
            }
        })).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m27165f(tq2 tq2Var, iq2 iq2Var) {
        kc3.m23886r(kc3.m23883o(this.f29186b.mo20790b(tq2Var, iq2Var), iq2Var.f22305S, TimeUnit.SECONDS, this.f29189e), new u42(this), this.f29187c);
    }
}
