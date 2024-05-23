package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class by1 {

    /* renamed from: a */
    private final ScheduledExecutorService f18045a;

    /* renamed from: b */
    private final uc3 f18046b;

    /* renamed from: c */
    private final sy1 f18047c;

    /* renamed from: d */
    private final d04 f18048d;

    public by1(ScheduledExecutorService scheduledExecutorService, uc3 uc3Var, sy1 sy1Var, d04 d04Var) {
        this.f18045a = scheduledExecutorService;
        this.f18046b = uc3Var;
        this.f18047c = sy1Var;
        this.f18048d = d04Var;
    }

    /* renamed from: a */
    public final /* synthetic */ tc3 m20770a(zzcbc zzcbcVar, int i11, Throwable th2) {
        return ((h02) this.f18048d.zzb()).m22663I3(zzcbcVar, i11);
    }

    /* renamed from: b */
    public final tc3 m20771b(zzcbc zzcbcVar) {
        tc3 tc3Var;
        String str = zzcbcVar.f32004s;
        zzt.zzp();
        if (zzs.zzy(str)) {
            tc3Var = kc3.m23876h(new zzedj(1));
        } else {
            sy1 sy1Var = this.f18047c;
            synchronized (sy1Var.f26996q) {
                try {
                    if (sy1Var.f26997r) {
                        tc3Var = sy1Var.f26995p;
                    } else {
                        sy1Var.f26997r = true;
                        sy1Var.f26999t = zzcbcVar;
                        sy1Var.f27000u.checkAvailabilityAndConnect();
                        sy1Var.f26995p.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.ry1
                            public /* synthetic */ ry1() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                sy1.this.m25918a();
                            }
                        }, kl0.f23368f);
                        tc3Var = sy1Var.f26995p;
                    }
                } finally {
                }
            }
        }
        return kc3.m23875g((ac3) kc3.m23883o(ac3.m20071D(tc3Var), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20976E4)).intValue(), TimeUnit.SECONDS, this.f18045a), Throwable.class, new qb3() { // from class: com.google.android.gms.internal.ads.ay1

            /* renamed from: b */
            public final /* synthetic */ zzcbc f17481b;

            /* renamed from: c */
            public final /* synthetic */ int f17482c;

            public /* synthetic */ ay1(zzcbc zzcbcVar2, int i11) {
                r2 = zzcbcVar2;
                r3 = i11;
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return by1.this.m20770a(r2, r3, (Throwable) obj);
            }
        }, this.f18046b);
    }
}
