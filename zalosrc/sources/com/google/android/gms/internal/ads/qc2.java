package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class qc2 implements rh2 {

    /* renamed from: a */
    private final Bundle f26716a;

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f26716a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f26716a);
        }
    }
}
