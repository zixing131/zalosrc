package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class jf2 implements rh2 {

    /* renamed from: a */
    public final Bundle f22800a;

    public jf2(Bundle bundle) {
        this.f22800a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle m24982a = nr2.m24982a(bundle, "device");
        m24982a.putBundle("android_mem_info", this.f22800a);
        bundle.putBundle("device", m24982a);
    }
}
