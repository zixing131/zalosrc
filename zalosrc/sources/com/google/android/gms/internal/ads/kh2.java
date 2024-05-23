package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class kh2 implements sh2 {

    /* renamed from: a */
    private final boolean f23322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kh2(bo2 bo2Var) {
        this.f23322a = bo2Var != null;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        jh2 jh2Var;
        if (this.f23322a) {
            jh2Var = new rh2() { // from class: com.google.android.gms.internal.ads.jh2
                @Override // com.google.android.gms.internal.ads.rh2
                /* renamed from: a */
                public final void mo20086a(Object obj) {
                    ((Bundle) obj).putBoolean("sdk_prefetch", true);
                }
            };
        } else {
            jh2Var = null;
        }
        return kc3.m23877i(jh2Var);
    }
}
