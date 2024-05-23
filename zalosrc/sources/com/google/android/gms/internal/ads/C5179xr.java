package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4172d;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.xr */
/* loaded from: classes2.dex */
public final class C5179xr {

    /* renamed from: a */
    private ScheduledFuture f30588a = null;

    /* renamed from: b */
    private final Runnable f30589b = new RunnableC5030tr(this);

    /* renamed from: c */
    private final Object f30590c = new Object();

    /* renamed from: d */
    private C5253zr f30591d;

    /* renamed from: e */
    private Context f30592e;

    /* renamed from: f */
    private C4365bs f30593f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m27989h(C5179xr c5179xr) {
        synchronized (c5179xr.f30590c) {
            try {
                C5253zr c5253zr = c5179xr.f30591d;
                if (c5253zr == null) {
                    return;
                }
                if (c5253zr.isConnected() || c5179xr.f30591d.isConnecting()) {
                    c5179xr.f30591d.disconnect();
                }
                c5179xr.f30591d = null;
                c5179xr.f30593f = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m27991l() {
        synchronized (this.f30590c) {
            try {
                if (this.f30592e != null && this.f30591d == null) {
                    C5253zr m27994d = m27994d(new C5104vr(this), new C5142wr(this));
                    this.f30591d = m27994d;
                    m27994d.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    /* renamed from: a */
    public final long m27992a(zzbeb zzbebVar) {
        synchronized (this.f30590c) {
            try {
                if (this.f30593f == null) {
                    return -2L;
                }
                if (this.f30591d.m28588g()) {
                    try {
                        return this.f30593f.m20702E(zzbebVar);
                    } catch (RemoteException e11) {
                        yk0.zzh("Unable to call into cache service.", e11);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final zzbdy m27993b(zzbeb zzbebVar) {
        synchronized (this.f30590c) {
            if (this.f30593f == null) {
                return new zzbdy();
            }
            try {
                if (this.f30591d.m28588g()) {
                    return this.f30593f.m20704Q(zzbebVar);
                }
                return this.f30593f.m20703N(zzbebVar);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to call into cache service.", e11);
                return new zzbdy();
            }
        }
    }

    /* renamed from: d */
    protected final synchronized C5253zr m27994d(AbstractC4172d.a aVar, AbstractC4172d.b bVar) {
        return new C5253zr(this.f30592e, zzt.zzt().zzb(), aVar, bVar);
    }

    /* renamed from: i */
    public final void m27995i(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f30590c) {
            try {
                if (this.f30592e != null) {
                    return;
                }
                this.f30592e = context.getApplicationContext();
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21340p3)).booleanValue()) {
                    m27991l();
                } else {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21330o3)).booleanValue()) {
                        zzt.zzb().m24016c(new C5067ur(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public final void m27996j() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21350q3)).booleanValue()) {
            synchronized (this.f30590c) {
                try {
                    m27991l();
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21370s3)).booleanValue()) {
                        ScheduledFuture scheduledFuture = this.f30588a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f30588a = kl0.f23366d.schedule(this.f30589b, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21360r3)).longValue(), TimeUnit.MILLISECONDS);
                    } else {
                        m23 m23Var = zzs.zza;
                        m23Var.removeCallbacks(this.f30589b);
                        m23Var.postDelayed(this.f30589b, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21360r3)).longValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
