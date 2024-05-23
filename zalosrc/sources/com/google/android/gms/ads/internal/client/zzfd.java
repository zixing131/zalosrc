package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.b20;

/* loaded from: classes2.dex */
public final class zzfd extends b20 {
    private final ShouldDelayBannerRenderingListener zza;

    public zzfd(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zza = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.c20
    public final boolean zzb(InterfaceC4271b interfaceC4271b) throws RemoteException {
        return this.zza.shouldDelayBannerRendering((Runnable) BinderC4273d.m19914Q(interfaceC4271b));
    }
}
