package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class wj2 implements sh2 {

    /* renamed from: a */
    final ScheduledExecutorService f29943a;

    /* renamed from: b */
    final Context f29944b;

    /* renamed from: c */
    final sd0 f29945c;

    public wj2(sd0 sd0Var, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f29945c = sd0Var;
        this.f29943a = scheduledExecutorService;
        this.f29944b = context;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23881m(kc3.m23883o(kc3.m23877i(new Bundle()), ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21280j3)).longValue(), TimeUnit.MILLISECONDS, this.f29943a), new y43() { // from class: com.google.android.gms.internal.ads.vj2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return new xj2((Bundle) obj);
            }
        }, kl0.f23363a);
    }
}
