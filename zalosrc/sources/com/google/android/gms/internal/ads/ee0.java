package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ee0 extends mj0 {

    /* renamed from: p */
    final /* synthetic */ QueryInfoGenerationCallback f19604p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ee0(fe0 fe0Var, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.f19604p = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.nj0
    /* renamed from: x0 */
    public final void mo21700x0(String str, String str2, Bundle bundle) {
        this.f19604p.onSuccess(new QueryInfo(new zzeg(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.nj0
    public final void zzb(String str) {
        this.f19604p.onFailure(str);
    }
}
