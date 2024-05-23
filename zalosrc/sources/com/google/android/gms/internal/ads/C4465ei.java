package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ei */
/* loaded from: classes2.dex */
public final class C4465ei extends Thread {

    /* renamed from: p */
    final /* synthetic */ AudioTrack f19638p;

    /* renamed from: q */
    final /* synthetic */ C4761mi f19639q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4465ei(C4761mi c4761mi, AudioTrack audioTrack) {
        this.f19639q = c4761mi;
        this.f19638p = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.f19638p.flush();
            this.f19638p.release();
        } finally {
            conditionVariable = this.f19639q.f24564e;
            conditionVariable.open();
        }
    }
}
