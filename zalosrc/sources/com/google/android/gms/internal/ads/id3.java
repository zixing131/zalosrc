package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class id3 extends zb3 {

    /* renamed from: w */
    private tc3 f22154w;

    /* renamed from: x */
    private ScheduledFuture f22155x;

    private id3(tc3 tc3Var) {
        tc3Var.getClass();
        this.f22154w = tc3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public static tc3 m23230F(tc3 tc3Var, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        id3 id3Var = new id3(tc3Var);
        gd3 gd3Var = new gd3(id3Var);
        id3Var.f22155x = scheduledExecutorService.schedule(gd3Var, j11, timeUnit);
        tc3Var.zzc(gd3Var, xb3.INSTANCE);
        return id3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static /* synthetic */ ScheduledFuture m23232H(id3 id3Var, ScheduledFuture scheduledFuture) {
        id3Var.f22155x = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        tc3 tc3Var = this.f22154w;
        ScheduledFuture scheduledFuture = this.f22155x;
        if (tc3Var != null) {
            String str = "inputFuture=[" + tc3Var + "]";
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return str + ", remaining delay=[" + delay + " ms]";
                }
                return str;
            }
            return str;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: f */
    protected final void mo22404f() {
        m24526u(this.f22154w);
        ScheduledFuture scheduledFuture = this.f22155x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f22154w = null;
        this.f22155x = null;
    }
}
