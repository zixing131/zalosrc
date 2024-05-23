package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dx1 {

    /* renamed from: a */
    private final uc3 f19438a;

    /* renamed from: b */
    private final uc3 f19439b;

    /* renamed from: c */
    private final oy1 f19440c;

    /* renamed from: d */
    private final d04 f19441d;

    public dx1(uc3 uc3Var, uc3 uc3Var2, oy1 oy1Var, d04 d04Var) {
        this.f19438a = uc3Var;
        this.f19439b = uc3Var2;
        this.f19440c = oy1Var;
        this.f19441d = d04Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tc3 m21558a(zzcbc zzcbcVar, int i11, zzedj zzedjVar) {
        return ((h02) this.f19441d.zzb()).m22665Q(zzcbcVar, i11);
    }

    /* renamed from: b */
    public final tc3 m21559b(final zzcbc zzcbcVar) {
        tc3 m23875g;
        String str = zzcbcVar.f32004s;
        zzt.zzp();
        if (zzs.zzy(str)) {
            m23875g = kc3.m23876h(new zzedj(1));
        } else {
            m23875g = kc3.m23875g(this.f19438a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ax1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return dx1.this.m21560c(zzcbcVar);
                }
            }), ExecutionException.class, new qb3() { // from class: com.google.android.gms.internal.ads.bx1
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return kc3.m23876h(((ExecutionException) obj).getCause());
                }
            }, this.f19439b);
        }
        final int callingUid = Binder.getCallingUid();
        return kc3.m23875g(m23875g, zzedj.class, new qb3() { // from class: com.google.android.gms.internal.ads.cx1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return dx1.this.m21558a(zzcbcVar, callingUid, (zzedj) obj);
            }
        }, this.f19439b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ InputStream m21560c(zzcbc zzcbcVar) {
        pl0 pl0Var;
        final oy1 oy1Var = this.f19440c;
        synchronized (oy1Var.f26996q) {
            try {
                if (oy1Var.f26997r) {
                    pl0Var = oy1Var.f26995p;
                } else {
                    oy1Var.f26997r = true;
                    oy1Var.f26999t = zzcbcVar;
                    oy1Var.f27000u.checkAvailabilityAndConnect();
                    oy1Var.f26995p.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.ny1
                        @Override // java.lang.Runnable
                        public final void run() {
                            oy1.this.m25918a();
                        }
                    }, kl0.f23368f);
                    pl0Var = oy1Var.f26995p;
                }
            } finally {
            }
        }
        return (InputStream) pl0Var.get(((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20976E4)).intValue(), TimeUnit.SECONDS);
    }
}
