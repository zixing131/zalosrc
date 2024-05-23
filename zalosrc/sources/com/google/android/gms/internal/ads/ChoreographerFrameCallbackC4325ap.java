package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.ap */
/* loaded from: classes2.dex */
final class ChoreographerFrameCallbackC4325ap implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: u */
    private static final ChoreographerFrameCallbackC4325ap f17209u = new ChoreographerFrameCallbackC4325ap();

    /* renamed from: p */
    public volatile long f17210p;

    /* renamed from: q */
    private final Handler f17211q;

    /* renamed from: r */
    private final HandlerThread f17212r;

    /* renamed from: s */
    private Choreographer f17213s;

    /* renamed from: t */
    private int f17214t;

    private ChoreographerFrameCallbackC4325ap() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f17212r = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f17211q = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static ChoreographerFrameCallbackC4325ap m20204a() {
        return f17209u;
    }

    /* renamed from: b */
    public final void m20205b() {
        this.f17211q.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void m20206c() {
        this.f17211q.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f17210p = j11;
        this.f17213s.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return false;
                }
                int i12 = this.f17214t - 1;
                this.f17214t = i12;
                if (i12 == 0) {
                    this.f17213s.removeFrameCallback(this);
                    this.f17210p = 0L;
                }
                return true;
            }
            int i13 = this.f17214t + 1;
            this.f17214t = i13;
            if (i13 == 1) {
                this.f17213s.postFrameCallback(this);
            }
            return true;
        }
        this.f17213s = Choreographer.getInstance();
        return true;
    }
}
