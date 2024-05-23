package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import s00.AbstractC26080o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class sj4 extends Handler implements Runnable {

    /* renamed from: p */
    private final tj4 f27719p;

    /* renamed from: q */
    private final long f27720q;

    /* renamed from: r */
    private pj4 f27721r;

    /* renamed from: s */
    private IOException f27722s;

    /* renamed from: t */
    private int f27723t;

    /* renamed from: u */
    private Thread f27724u;

    /* renamed from: v */
    private boolean f27725v;

    /* renamed from: w */
    private volatile boolean f27726w;

    /* renamed from: x */
    final /* synthetic */ wj4 f27727x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj4(wj4 wj4Var, Looper looper, tj4 tj4Var, pj4 pj4Var, int i11, long j11) {
        super(looper);
        this.f27727x = wj4Var;
        this.f27719p = tj4Var;
        this.f27721r = pj4Var;
        this.f27720q = j11;
    }

    /* renamed from: d */
    private final void m26340d() {
        ExecutorService executorService;
        sj4 sj4Var;
        this.f27722s = null;
        wj4 wj4Var = this.f27727x;
        executorService = wj4Var.f29950a;
        sj4Var = wj4Var.f29951b;
        sj4Var.getClass();
        executorService.execute(sj4Var);
    }

    /* renamed from: a */
    public final void m26341a(boolean z11) {
        this.f27726w = z11;
        this.f27722s = null;
        if (hasMessages(0)) {
            this.f27725v = true;
            removeMessages(0);
            if (!z11) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f27725v = true;
                    this.f27719p.zzg();
                    Thread thread = this.f27724u;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z11) {
            this.f27727x.f29951b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            pj4 pj4Var = this.f27721r;
            pj4Var.getClass();
            pj4Var.mo22848m(this.f27719p, elapsedRealtime, elapsedRealtime - this.f27720q, true);
            this.f27721r = null;
        }
    }

    /* renamed from: b */
    public final void m26342b(int i11) {
        IOException iOException = this.f27722s;
        if (iOException != null && this.f27723t > i11) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void m26343c(long j11) {
        sj4 sj4Var;
        boolean z11;
        sj4Var = this.f27727x.f29951b;
        if (sj4Var == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        this.f27727x.f29951b = this;
        if (j11 > 0) {
            sendEmptyMessageDelayed(0, j11);
        } else {
            m26340d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i11;
        int i12;
        int i13;
        long j11;
        long min;
        if (this.f27726w) {
            return;
        }
        int i14 = message.what;
        if (i14 == 0) {
            m26340d();
            return;
        }
        if (i14 != 3) {
            this.f27727x.f29951b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = elapsedRealtime - this.f27720q;
            pj4 pj4Var = this.f27721r;
            pj4Var.getClass();
            if (this.f27725v) {
                pj4Var.mo22848m(this.f27719p, elapsedRealtime, j12, false);
                return;
            }
            int i15 = message.what;
            if (i15 != 1) {
                if (i15 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.f27722s = iOException;
                    int i16 = this.f27723t + 1;
                    this.f27723t = i16;
                    rj4 mo22844c = pj4Var.mo22844c(this.f27719p, elapsedRealtime, j12, iOException, i16);
                    i11 = mo22844c.f27271a;
                    if (i11 != 3) {
                        i12 = mo22844c.f27271a;
                        if (i12 != 2) {
                            i13 = mo22844c.f27271a;
                            if (i13 == 1) {
                                this.f27723t = 1;
                            }
                            j11 = mo22844c.f27272b;
                            if (j11 != -9223372036854775807L) {
                                min = mo22844c.f27272b;
                            } else {
                                min = Math.min((this.f27723t - 1) * 1000, AbstractC26080o.a.f124275b);
                            }
                            m26343c(min);
                            return;
                        }
                        return;
                    }
                    this.f27727x.f29952c = this.f27722s;
                    return;
                }
                return;
            }
            try {
                pj4Var.mo22846e(this.f27719p, elapsedRealtime, j12);
                return;
            } catch (RuntimeException e11) {
                lr1.m24354c("LoadTask", "Unexpected exception handling load completed", e11);
                this.f27727x.f29952c = new zzwv(e11);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        try {
            synchronized (this) {
                z11 = !this.f27725v;
                this.f27724u = Thread.currentThread();
            }
            if (z11) {
                String str = "load:" + this.f27719p.getClass().getSimpleName();
                int i11 = g92.f20474a;
                Trace.beginSection(str);
                try {
                    this.f27719p.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f27724u = null;
                Thread.interrupted();
            }
            if (!this.f27726w) {
                sendEmptyMessage(1);
            }
        } catch (IOException e11) {
            if (!this.f27726w) {
                obtainMessage(2, e11).sendToTarget();
            }
        } catch (Exception e12) {
            if (!this.f27726w) {
                lr1.m24354c("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new zzwv(e12)).sendToTarget();
            }
        } catch (OutOfMemoryError e13) {
            if (!this.f27726w) {
                lr1.m24354c("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new zzwv(e13)).sendToTarget();
            }
        } catch (Error e14) {
            if (!this.f27726w) {
                lr1.m24354c("LoadTask", "Unexpected error loading stream", e14);
                obtainMessage(3, e14).sendToTarget();
            }
            throw e14;
        }
    }
}
