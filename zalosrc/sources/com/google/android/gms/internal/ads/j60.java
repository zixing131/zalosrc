package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* loaded from: classes2.dex */
public final class j60 implements AdapterStatus {

    /* renamed from: a */
    private final AdapterStatus.State f22677a;

    /* renamed from: b */
    private final String f22678b;

    /* renamed from: c */
    private final int f22679c;

    public j60(AdapterStatus.State state, String str, int i11) {
        this.f22677a = state;
        this.f22678b = str;
        this.f22679c = i11;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f22678b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f22677a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f22679c;
    }
}
