package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class gg2 implements rh2 {

    /* renamed from: a */
    private final Bundle f20579a;

    public gg2(Bundle bundle) {
        this.f20579a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f20579a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
