package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gk4 extends HandlerThread implements Handler.Callback {

    /* renamed from: p */
    private be1 f20719p;

    /* renamed from: q */
    private Handler f20720q;

    /* renamed from: r */
    private Error f20721r;

    /* renamed from: s */
    private RuntimeException f20722s;

    /* renamed from: t */
    private zzxj f20723t;

    public gk4() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* renamed from: a */
    public final zzxj m22464a(int i11) {
        boolean z11;
        start();
        this.f20720q = new Handler(getLooper(), this);
        this.f20719p = new be1(this.f20720q, null);
        synchronized (this) {
            z11 = false;
            this.f20720q.obtainMessage(1, i11, 0).sendToTarget();
            while (this.f20723t == null && this.f20722s == null && this.f20721r == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f20722s;
        if (runtimeException == null) {
            Error error = this.f20721r;
            if (error == null) {
                zzxj zzxjVar = this.f20723t;
                zzxjVar.getClass();
                return zzxjVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void m22465b() {
        Handler handler = this.f20720q;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z11;
        int i11 = message.what;
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    return true;
                }
                try {
                    be1 be1Var = this.f20719p;
                    be1Var.getClass();
                    be1Var.m20488c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i12 = message.arg1;
                be1 be1Var2 = this.f20719p;
                be1Var2.getClass();
                be1Var2.m20487b(i12);
                SurfaceTexture m20486a = this.f20719p.m20486a();
                if (i12 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f20723t = new zzxj(this, m20486a, z11, null);
                synchronized (this) {
                    notify();
                }
            } catch (zzdk e11) {
                lr1.m24354c("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                this.f20722s = new IllegalStateException(e11);
                synchronized (this) {
                    notify();
                }
            } catch (Error e12) {
                lr1.m24354c("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                this.f20721r = e12;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e13) {
                lr1.m24354c("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                this.f20722s = e13;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
