package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class he0 extends ce0 {

    /* renamed from: p */
    final /* synthetic */ UpdateClickUrlCallback f21648p;

    public he0(le0 le0Var, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f21648p = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: c */
    public final void mo20484c(String str) {
        this.f21648p.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: t0 */
    public final void mo20485t0(List list) {
        this.f21648p.onSuccess((Uri) list.get(0));
    }
}
