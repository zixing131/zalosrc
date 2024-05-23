package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import java.util.Set;

/* loaded from: classes2.dex */
public final class t71 extends kd1 implements zza {
    public t71(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.s71
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((zza) obj).onAdClicked();
            }
        });
    }
}
