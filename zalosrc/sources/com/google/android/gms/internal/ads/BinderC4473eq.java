package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzby;

/* renamed from: com.google.android.gms.internal.ads.eq */
/* loaded from: classes2.dex */
public final class BinderC4473eq extends zzby {

    /* renamed from: p */
    private final AppEventListener f19748p;

    public BinderC4473eq(AppEventListener appEventListener) {
        this.f19748p = appEventListener;
    }

    /* renamed from: N */
    public final AppEventListener m21777N() {
        return this.f19748p;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbz
    public final void zzc(String str, String str2) {
        this.f19748p.onAppEvent(str, str2);
    }
}
