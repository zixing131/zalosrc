package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ov2 {

    /* renamed from: a */
    private final Executor f25965a;

    /* renamed from: b */
    private final cl0 f25966b;

    public ov2(Executor executor, cl0 cl0Var) {
        this.f25965a = executor;
        this.f25966b = cl0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m25334a(String str) {
        this.f25966b.zza(str);
    }

    /* renamed from: b */
    public final void m25335b(final String str) {
        this.f25965a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nv2
            @Override // java.lang.Runnable
            public final void run() {
                ov2.this.m25334a(str);
            }
        });
    }
}
