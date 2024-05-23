package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ix1 implements j04 {

    /* renamed from: a */
    private final w04 f22536a;

    /* renamed from: b */
    private final w04 f22537b;

    /* renamed from: c */
    private final w04 f22538c;

    public ix1(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f22536a = w04Var;
        this.f22537b = w04Var2;
        this.f22538c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        final C4830od c4830od = (C4830od) this.f22536a.zzb();
        final Context m20710a = ((bt0) this.f22537b).m20710a();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        tc3 mo21339R = uc3Var.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.fx1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C4830od c4830od2 = C4830od.this;
                return c4830od2.m25160c().zzg(m20710a);
            }
        });
        r04.m25935b(mo21339R);
        return mo21339R;
    }
}
