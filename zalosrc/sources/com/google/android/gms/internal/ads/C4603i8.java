package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.i8 */
/* loaded from: classes2.dex */
public final class C4603i8 extends Thread {

    /* renamed from: p */
    private final BlockingQueue f22114p;

    /* renamed from: q */
    private final InterfaceC4566h8 f22115q;

    /* renamed from: r */
    private final InterfaceC5233z7 f22116r;

    /* renamed from: s */
    private volatile boolean f22117s = false;

    /* renamed from: t */
    private final C4492f8 f22118t;

    public C4603i8(BlockingQueue blockingQueue, InterfaceC4566h8 interfaceC4566h8, InterfaceC5233z7 interfaceC5233z7, C4492f8 c4492f8, byte[] bArr) {
        this.f22114p = blockingQueue;
        this.f22115q = interfaceC4566h8;
        this.f22116r = interfaceC5233z7;
        this.f22118t = c4492f8;
    }

    /* renamed from: b */
    private void m23135b() {
        AbstractC4788n8 abstractC4788n8 = (AbstractC4788n8) this.f22114p.take();
        SystemClock.elapsedRealtime();
        abstractC4788n8.zzt(3);
        try {
            abstractC4788n8.zzm("network-queue-take");
            abstractC4788n8.zzw();
            TrafficStats.setThreadStatsTag(abstractC4788n8.zzc());
            C4639j8 zza = this.f22115q.zza(abstractC4788n8);
            abstractC4788n8.zzm("network-http-complete");
            if (zza.f22718e && abstractC4788n8.zzv()) {
                abstractC4788n8.zzp("not-modified");
                abstractC4788n8.zzr();
                return;
            }
            C4937r8 zzh = abstractC4788n8.zzh(zza);
            abstractC4788n8.zzm("network-parse-complete");
            if (zzh.f27134b != null) {
                this.f22116r.mo21643a(abstractC4788n8.zzj(), zzh.f27134b);
                abstractC4788n8.zzm("network-cache-written");
            }
            abstractC4788n8.zzq();
            this.f22118t.m21965b(abstractC4788n8, zzh, null);
            abstractC4788n8.zzs(zzh);
        } catch (zzakm e11) {
            SystemClock.elapsedRealtime();
            this.f22118t.m21964a(abstractC4788n8, e11);
            abstractC4788n8.zzr();
        } catch (Exception e12) {
            AbstractC5048u8.m26868c(e12, "Unhandled exception %s", e12.toString());
            zzakm zzakmVar = new zzakm(e12);
            SystemClock.elapsedRealtime();
            this.f22118t.m21964a(abstractC4788n8, zzakmVar);
            abstractC4788n8.zzr();
        } finally {
            abstractC4788n8.zzt(4);
        }
    }

    /* renamed from: a */
    public final void m23136a() {
        this.f22117s = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m23135b();
            } catch (InterruptedException unused) {
                if (this.f22117s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC5048u8.m26867b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
