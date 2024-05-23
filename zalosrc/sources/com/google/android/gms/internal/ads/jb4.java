package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class jb4 {

    /* renamed from: a */
    private final Handler f22750a = new Handler(Looper.myLooper());

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f22751b;

    /* renamed from: c */
    final /* synthetic */ ob4 f22752c;

    public jb4(ob4 ob4Var) {
        this.f22752c = ob4Var;
        this.f22751b = new gb4(this, ob4Var);
    }

    /* renamed from: a */
    public final void m23594a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.fb4

            /* renamed from: p */
            public final /* synthetic */ Handler f20084p;

            public /* synthetic */ fb4(Handler handler) {
                r1 = handler;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                r1.post(runnable);
            }
        }, this.f22751b);
    }

    /* renamed from: b */
    public final void m23595b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f22751b);
        this.f22750a.removeCallbacksAndMessages(null);
    }
}
