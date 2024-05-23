package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ok2 implements sh2 {

    /* renamed from: a */
    private final uc3 f25677a;

    public ok2(uc3 uc3Var) {
        this.f25677a = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f25677a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.nk2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) zzay.zzc().m21823b(AbstractC4554gx.f21011I);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21021J)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, zzch.zza(str2));
                        }
                    }
                }
                return new pk2(hashMap);
            }
        });
    }
}
