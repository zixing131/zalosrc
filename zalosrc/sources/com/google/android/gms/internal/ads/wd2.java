package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class wd2 implements sh2 {

    /* renamed from: a */
    private final bn2 f29892a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wd2(bn2 bn2Var) {
        this.f29892a = bn2Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void m27601a(Bundle bundle) {
        bundle.putString("key_schema", this.f29892a.m20608a());
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        bn2 bn2Var = this.f29892a;
        rh2 rh2Var = null;
        if (bn2Var != null && bn2Var.m20608a() != null && !bn2Var.m20608a().isEmpty()) {
            rh2Var = new rh2() { // from class: com.google.android.gms.internal.ads.vd2
                @Override // com.google.android.gms.internal.ads.rh2
                /* renamed from: a */
                public final void mo20086a(Object obj) {
                    wd2.this.m27601a((Bundle) obj);
                }
            };
        }
        return kc3.m23877i(rh2Var);
    }
}
