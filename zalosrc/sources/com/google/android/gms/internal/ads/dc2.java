package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class dc2 implements sh2 {

    /* renamed from: a */
    private final tc3 f19173a;

    /* renamed from: b */
    private final Executor f19174b;

    public dc2(tc3 tc3Var, Executor executor) {
        this.f19173a = tc3Var;
        this.f19174b = executor;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23882n(this.f19173a, new qb3() { // from class: com.google.android.gms.internal.ads.cc2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                final String str = (String) obj;
                return kc3.m23877i(new rh2() { // from class: com.google.android.gms.internal.ads.bc2
                    @Override // com.google.android.gms.internal.ads.rh2
                    /* renamed from: a */
                    public final void mo20086a(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f19174b);
    }
}
