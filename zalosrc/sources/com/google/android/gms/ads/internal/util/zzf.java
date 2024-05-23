package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.m23;

/* loaded from: classes2.dex */
public final class zzf extends m23 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e11) {
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.m23
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzs.zzI(com.google.android.gms.ads.internal.zzt.zzo().m22932c(), th2);
            throw th2;
        }
    }
}
