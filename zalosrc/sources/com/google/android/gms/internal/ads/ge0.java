package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ge0 extends ce0 {

    /* renamed from: p */
    final /* synthetic */ UpdateImpressionUrlsCallback f20564p;

    public ge0(le0 le0Var, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f20564p = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: c */
    public final void mo20484c(String str) {
        this.f20564p.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: t0 */
    public final void mo20485t0(List list) {
        this.f20564p.onSuccess(list);
    }
}
