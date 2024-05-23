package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class sy1 extends qy1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public sy1(Context context) {
        this.f27000u = new af0(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        synchronized (this.f26996q) {
            try {
                if (!this.f26998s) {
                    this.f26998s = true;
                    try {
                        try {
                            this.f27000u.m20100g().mo21366y3(this.f26999t, new py1(this));
                        } catch (Throwable th2) {
                            zzt.zzo().m22945t(th2, "RemoteSignalsClientTask.onConnected");
                            this.f26995p.zze(new zzedj(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f26995p.zze(new zzedj(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
