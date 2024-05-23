package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class je2 implements rh2 {

    /* renamed from: a */
    private final String f22791a;

    /* renamed from: b */
    private final String f22792b;

    /* renamed from: c */
    private final Bundle f22793c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ je2(String str, String str2, Bundle bundle, ie2 ie2Var) {
        this.f22791a = str;
        this.f22792b = str2;
        this.f22793c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f22791a);
        bundle.putString("fc_consent", this.f22792b);
        bundle.putBundle("iab_consent_info", this.f22793c);
    }
}
