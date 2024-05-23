package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zb2 implements rh2 {

    /* renamed from: a */
    private final String f31433a;

    public zb2(String str) {
        this.f31433a = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f31433a;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
