package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.i9 */
/* loaded from: classes.dex */
public final class C6022i9 implements InterfaceC6110q9 {

    /* renamed from: a */
    final /* synthetic */ C6055l9 f34092a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6022i9(C6055l9 c6055l9) {
        this.f34092a = c6055l9;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6110q9
    /* renamed from: a */
    public final void mo30946a(String str, String str2, Bundle bundle) {
        C6127s4 c6127s4;
        C6127s4 c6127s42;
        if (TextUtils.isEmpty(str)) {
            C6055l9 c6055l9 = this.f34092a;
            c6127s4 = c6055l9.f34181l;
            if (c6127s4 != null) {
                c6127s42 = c6055l9.f34181l;
                c6127s42.mo31033c().m31197q().m31109b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f34092a.mo31037v().m31296z(new RunnableC6000g9(this, str, "_err", bundle));
    }
}
