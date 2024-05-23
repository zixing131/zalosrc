package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class td2 implements rh2 {

    /* renamed from: a */
    public final double f28290a;

    /* renamed from: b */
    public final boolean f28291b;

    public td2(double d11, boolean z11) {
        this.f28290a = d11;
        this.f28291b = z11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle m24982a = nr2.m24982a(bundle, "device");
        bundle.putBundle("device", m24982a);
        Bundle m24982a2 = nr2.m24982a(m24982a, "battery");
        m24982a.putBundle("battery", m24982a2);
        m24982a2.putBoolean("is_charging", this.f28291b);
        m24982a2.putDouble("battery_level", this.f28290a);
    }
}
