package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class te2 implements rh2 {

    /* renamed from: a */
    public final String f28293a;

    /* renamed from: b */
    public final boolean f28294b;

    public te2(String str, boolean z11) {
        this.f28293a = str;
        this.f28294b = z11;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.f28293a);
        if (this.f28294b) {
            bundle.putString("de", "1");
        }
    }
}
