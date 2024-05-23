package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.j */
/* loaded from: classes2.dex */
final class C4066j extends AbstractC4067k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4066j(int i11, int i12, Bundle bundle) {
        super(i11, 2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC4067k
    /* renamed from: a */
    public final void mo19170a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m19173d(null);
        } else {
            m19172c(new zzq(4, "Invalid response to one way request", null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC4067k
    /* renamed from: b */
    public final boolean mo19171b() {
        return true;
    }
}
