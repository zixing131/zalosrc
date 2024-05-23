package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class pk4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: u */
    private static final pk4 f26243u = new pk4();

    /* renamed from: p */
    public volatile long f26244p = -9223372036854775807L;

    /* renamed from: q */
    private final Handler f26245q;

    /* renamed from: r */
    private final HandlerThread f26246r;

    /* renamed from: s */
    private Choreographer f26247s;

    /* renamed from: t */
    private int f26248t;

    private pk4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f26246r = handlerThread;
        handlerThread.start();
        Handler m22337c = g92.m22337c(handlerThread.getLooper(), this);
        this.f26245q = m22337c;
        m22337c.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static pk4 m25475a() {
        return f26243u;
    }

    /* renamed from: b */
    public final void m25476b() {
        this.f26245q.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void m25477c() {
        this.f26245q.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        this.f26244p = j11;
        Choreographer choreographer = this.f26247s;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f26247s;
                if (choreographer != null) {
                    int i12 = this.f26248t - 1;
                    this.f26248t = i12;
                    if (i12 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f26244p = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f26247s;
            if (choreographer2 != null) {
                int i13 = this.f26248t + 1;
                this.f26248t = i13;
                if (i13 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f26247s = Choreographer.getInstance();
        } catch (RuntimeException e11) {
            lr1.m24357f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e11);
        }
        return true;
    }
}
