package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zy1 implements ta1 {

    /* renamed from: p */
    private final Context f31720p;

    /* renamed from: q */
    private final dj0 f31721q;

    public zy1(Context context, dj0 dj0Var) {
        this.f31720p = context;
        this.f31721q = dj0Var;
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
        if (!TextUtils.isEmpty(tq2Var.f28473b.f27823b.f24016d)) {
            this.f31721q.m21420u(this.f31720p, tq2Var.f28472a.f26941a.f19398d);
            this.f31721q.m21416q(this.f31720p, tq2Var.f28473b.f27823b.f24016d);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
    }
}
