package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* renamed from: com.google.android.gms.cloudmessaging.l */
/* loaded from: classes2.dex */
final class C4068l extends AbstractC4067k {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C4068l(int i11, int i12, Bundle bundle) {
        super(i11, 1, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC4067k
    /* renamed from: a */
    public final void mo19170a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        m19173d(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.cloudmessaging.AbstractC4067k
    /* renamed from: b */
    public final boolean mo19171b() {
        return false;
    }
}
