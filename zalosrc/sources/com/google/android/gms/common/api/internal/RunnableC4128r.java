package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C4148b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.r */
/* loaded from: classes2.dex */
public final class RunnableC4128r implements Runnable {

    /* renamed from: p */
    final /* synthetic */ C4081b0 f16429p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4128r(C4081b0 c4081b0) {
        this.f16429p = c4081b0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4148b c4148b;
        Context context;
        C4081b0 c4081b0 = this.f16429p;
        c4148b = c4081b0.f16242d;
        context = c4081b0.f16241c;
        c4148b.m19568a(context);
    }
}
