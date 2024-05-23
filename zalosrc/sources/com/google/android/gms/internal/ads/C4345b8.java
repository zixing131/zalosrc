package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.b8 */
/* loaded from: classes2.dex */
public final class C4345b8 extends Thread {

    /* renamed from: v */
    private static final boolean f17656v = AbstractC5048u8.f28785a;

    /* renamed from: p */
    private final BlockingQueue f17657p;

    /* renamed from: q */
    private final BlockingQueue f17658q;

    /* renamed from: r */
    private final InterfaceC5233z7 f17659r;

    /* renamed from: s */
    private volatile boolean f17660s = false;

    /* renamed from: t */
    private final C5085v8 f17661t;

    /* renamed from: u */
    private final C4492f8 f17662u;

    public C4345b8(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, InterfaceC5233z7 interfaceC5233z7, C4492f8 c4492f8, byte[] bArr) {
        this.f17657p = blockingQueue;
        this.f17658q = blockingQueue2;
        this.f17659r = interfaceC5233z7;
        this.f17662u = c4492f8;
        this.f17661t = new C5085v8(this, blockingQueue2, c4492f8, null);
    }

    /* renamed from: c */
    private void m20430c() {
        AbstractC4788n8 abstractC4788n8 = (AbstractC4788n8) this.f17657p.take();
        abstractC4788n8.zzm("cache-queue-take");
        abstractC4788n8.zzt(1);
        try {
            abstractC4788n8.zzw();
            C5196y7 zza = this.f17659r.zza(abstractC4788n8.zzj());
            if (zza == null) {
                abstractC4788n8.zzm("cache-miss");
                if (!this.f17661t.m27180b(abstractC4788n8)) {
                    this.f17658q.put(abstractC4788n8);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza.m28137a(currentTimeMillis)) {
                abstractC4788n8.zzm("cache-hit-expired");
                abstractC4788n8.zze(zza);
                if (!this.f17661t.m27180b(abstractC4788n8)) {
                    this.f17658q.put(abstractC4788n8);
                }
                return;
            }
            abstractC4788n8.zzm("cache-hit");
            C4937r8 zzh = abstractC4788n8.zzh(new C4639j8(zza.f30820a, zza.f30826g));
            abstractC4788n8.zzm("cache-hit-parsed");
            if (!zzh.m25992c()) {
                abstractC4788n8.zzm("cache-parsing-failed");
                this.f17659r.mo21644b(abstractC4788n8.zzj(), true);
                abstractC4788n8.zze(null);
                if (!this.f17661t.m27180b(abstractC4788n8)) {
                    this.f17658q.put(abstractC4788n8);
                }
                return;
            }
            if (zza.f30825f < currentTimeMillis) {
                abstractC4788n8.zzm("cache-hit-refresh-needed");
                abstractC4788n8.zze(zza);
                zzh.f27136d = true;
                if (!this.f17661t.m27180b(abstractC4788n8)) {
                    this.f17662u.m21965b(abstractC4788n8, zzh, new RunnableC4308a8(this, abstractC4788n8));
                } else {
                    this.f17662u.m21965b(abstractC4788n8, zzh, null);
                }
            } else {
                this.f17662u.m21965b(abstractC4788n8, zzh, null);
            }
        } finally {
            abstractC4788n8.zzt(2);
        }
    }

    /* renamed from: b */
    public final void m20431b() {
        this.f17660s = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f17656v) {
            AbstractC5048u8.m26869d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f17659r.zzb();
        while (true) {
            try {
                m20430c();
            } catch (InterruptedException unused) {
                if (this.f17660s) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC5048u8.m26867b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
