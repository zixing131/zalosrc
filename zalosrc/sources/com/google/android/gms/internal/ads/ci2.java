package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class ci2 implements rh2 {

    /* renamed from: a */
    public final String f18437a;

    /* renamed from: b */
    public final int f18438b;

    /* renamed from: c */
    public final int f18439c;

    /* renamed from: d */
    public final int f18440d;

    /* renamed from: e */
    public final boolean f18441e;

    /* renamed from: f */
    public final int f18442f;

    public ci2(String str, int i11, int i12, int i13, boolean z11, int i14) {
        this.f18437a = str;
        this.f18438b = i11;
        this.f18439c = i12;
        this.f18440d = i13;
        this.f18441e = z11;
        this.f18442f = i14;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        boolean z11 = true;
        nr2.m24987f(bundle, "carrier", this.f18437a, !TextUtils.isEmpty(r0));
        int i11 = this.f18438b;
        if (i11 == -2) {
            z11 = false;
        }
        nr2.m24986e(bundle, "cnt", i11, z11);
        bundle.putInt("gnt", this.f18439c);
        bundle.putInt("pt", this.f18440d);
        Bundle m24982a = nr2.m24982a(bundle, "device");
        bundle.putBundle("device", m24982a);
        Bundle m24982a2 = nr2.m24982a(m24982a, "network");
        m24982a.putBundle("network", m24982a2);
        m24982a2.putInt("active_network_state", this.f18442f);
        m24982a2.putBoolean("active_network_metered", this.f18441e);
    }
}
