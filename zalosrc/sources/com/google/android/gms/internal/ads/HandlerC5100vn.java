package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import s00.AbstractC26080o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vn */
/* loaded from: classes2.dex */
public final class HandlerC5100vn extends Handler implements Runnable {

    /* renamed from: p */
    private final InterfaceC5138wn f29409p;

    /* renamed from: q */
    private final InterfaceC5063un f29410q;

    /* renamed from: r */
    public final int f29411r;

    /* renamed from: s */
    private final long f29412s;

    /* renamed from: t */
    private IOException f29413t;

    /* renamed from: u */
    private int f29414u;

    /* renamed from: v */
    private volatile Thread f29415v;

    /* renamed from: w */
    private volatile boolean f29416w;

    /* renamed from: x */
    final /* synthetic */ C5249zn f29417x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5100vn(C5249zn c5249zn, Looper looper, InterfaceC5138wn interfaceC5138wn, InterfaceC5063un interfaceC5063un, int i11, long j11) {
        super(looper);
        this.f29417x = c5249zn;
        this.f29409p = interfaceC5138wn;
        this.f29410q = interfaceC5063un;
        this.f29411r = i11;
        this.f29412s = j11;
    }

    /* renamed from: d */
    private final void m27310d() {
        ExecutorService executorService;
        HandlerC5100vn handlerC5100vn;
        this.f29413t = null;
        C5249zn c5249zn = this.f29417x;
        executorService = c5249zn.f31595a;
        handlerC5100vn = c5249zn.f31596b;
        executorService.execute(handlerC5100vn);
    }

    /* renamed from: a */
    public final void m27311a(boolean z11) {
        this.f29416w = z11;
        this.f29413t = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z11) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f29409p.zzb();
            if (this.f29415v != null) {
                this.f29415v.interrupt();
            }
            if (!z11) {
                return;
            }
        }
        this.f29417x.f31596b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f29410q.mo20593h(this.f29409p, elapsedRealtime, elapsedRealtime - this.f29412s, true);
    }

    /* renamed from: b */
    public final void m27312b(int i11) {
        IOException iOException = this.f29413t;
        if (iOException != null && this.f29414u > i11) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void m27313c(long j11) {
        HandlerC5100vn handlerC5100vn;
        boolean z11;
        handlerC5100vn = this.f29417x.f31596b;
        if (handlerC5100vn == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        this.f29417x.f31596b = this;
        if (j11 > 0) {
            sendEmptyMessageDelayed(0, j11);
        } else {
            m27310d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f29416w) {
            return;
        }
        int i11 = message.what;
        if (i11 == 0) {
            m27310d();
            return;
        }
        if (i11 != 4) {
            this.f29417x.f31596b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.f29412s;
            if (this.f29409p.zze()) {
                this.f29410q.mo20593h(this.f29409p, elapsedRealtime, j11, false);
                return;
            }
            int i12 = message.what;
            int i13 = 1;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f29413t = iOException;
                        int mo20596k = this.f29410q.mo20596k(this.f29409p, elapsedRealtime, j11, iOException);
                        if (mo20596k == 3) {
                            this.f29417x.f31597c = this.f29413t;
                            return;
                        } else {
                            if (mo20596k != 2) {
                                if (mo20596k != 1) {
                                    i13 = 1 + this.f29414u;
                                }
                                this.f29414u = i13;
                                m27313c(Math.min((i13 - 1) * 1000, AbstractC26080o.a.f124275b));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                this.f29410q.mo20594i(this.f29409p, elapsedRealtime, j11);
                return;
            }
            this.f29410q.mo20593h(this.f29409p, elapsedRealtime, j11, false);
            return;
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29415v = Thread.currentThread();
            if (!this.f29409p.zze()) {
                AbstractC4841oo.m25224a("load:" + this.f29409p.getClass().getSimpleName());
                try {
                    this.f29409p.zzc();
                    AbstractC4841oo.m25225b();
                } catch (Throwable th2) {
                    AbstractC4841oo.m25225b();
                    throw th2;
                }
            }
            if (!this.f29416w) {
                sendEmptyMessage(2);
            }
        } catch (IOException e11) {
            if (!this.f29416w) {
                obtainMessage(3, e11).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f29416w) {
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        } catch (InterruptedException unused) {
            AbstractC4361bo.m20613e(this.f29409p.zze());
            if (!this.f29416w) {
                sendEmptyMessage(2);
            }
        } catch (Exception e13) {
            if (!this.f29416w) {
                obtainMessage(3, new zzazz(e13)).sendToTarget();
            }
        } catch (OutOfMemoryError e14) {
            if (!this.f29416w) {
                obtainMessage(3, new zzazz(e14)).sendToTarget();
            }
        }
    }
}
