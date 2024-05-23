package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class or3 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    private final Handler f25742a;

    /* renamed from: b */
    final /* synthetic */ qt3 f25743b;

    public or3(qt3 qt3Var, Handler handler) {
        this.f25743b = qt3Var;
        this.f25742a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i11) {
        this.f25742a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nq3

            /* renamed from: q */
            public final /* synthetic */ int f25307q;

            public /* synthetic */ nq3(int i112) {
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                or3 or3Var = or3.this;
                qt3.m25877c(or3Var.f25743b, r2);
            }
        });
    }
}
