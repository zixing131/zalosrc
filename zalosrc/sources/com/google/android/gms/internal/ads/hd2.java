package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class hd2 implements rh2 {

    /* renamed from: a */
    final String f21636a;

    /* renamed from: b */
    final int f21637b;

    public hd2(String str, int i11) {
        this.f21636a = str;
        this.f21637b = i11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f21636a) && this.f21637b != -1) {
            Bundle m24982a = nr2.m24982a(bundle, "pii");
            bundle.putBundle("pii", m24982a);
            m24982a.putString("pvid", this.f21636a);
            m24982a.putInt("pvid_s", this.f21637b);
        }
    }
}
