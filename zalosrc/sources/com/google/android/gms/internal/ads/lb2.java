package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.AbstractC1388a;
import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class lb2 implements sh2 {

    /* renamed from: a */
    private final Context f23811a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb2(Context context) {
        this.f23811a = context;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        boolean z11;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21379t2)).booleanValue()) {
            if (AbstractC1388a.m6959a(this.f23811a, "com.google.android.gms.permission.AD_ID") == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return kc3.m23877i(new mb2(z11));
        }
        return kc3.m23877i(null);
    }
}
