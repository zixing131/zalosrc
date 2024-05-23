package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.g6 */
/* loaded from: classes.dex */
public final class C5997g6 implements InterfaceC6110q9 {

    /* renamed from: a */
    final /* synthetic */ C6129s6 f34033a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5997g6(C6129s6 c6129s6) {
        this.f34033a = c6129s6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6110q9
    /* renamed from: a */
    public final void mo30946a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f34033a.m31439s("auto", "_err", bundle, str);
        } else {
            this.f34033a.m31437q("auto", "_err", bundle);
        }
    }
}
