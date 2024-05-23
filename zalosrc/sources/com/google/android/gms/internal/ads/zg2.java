package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zg2 implements rh2 {

    /* renamed from: a */
    private final String f31499a;

    public zg2(String str) {
        this.f31499a = str;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f31499a)) {
            return;
        }
        bundle.putString("query_info", this.f31499a);
    }
}
