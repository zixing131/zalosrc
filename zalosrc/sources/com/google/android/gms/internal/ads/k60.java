package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k60 implements InitializationStatus {

    /* renamed from: a */
    private final Map f23156a;

    public k60(Map map) {
        this.f23156a = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        return this.f23156a;
    }
}
