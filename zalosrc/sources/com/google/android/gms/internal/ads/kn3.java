package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class kn3 extends BroadcastReceiver implements Runnable {

    /* renamed from: p */
    private final lo3 f23406p;

    /* renamed from: q */
    private final Handler f23407q;

    /* renamed from: r */
    final /* synthetic */ mp3 f23408r;

    public kn3(mp3 mp3Var, Handler handler, lo3 lo3Var) {
        this.f23408r = mp3Var;
        this.f23407q = handler;
        this.f23406p = lo3Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f23407q.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
