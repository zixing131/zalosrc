package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class o81 extends kd1 {

    /* renamed from: q */
    private boolean f25493q;

    public o81(Set set) {
        super(set);
        this.f25493q = false;
    }

    public final synchronized void zza() {
        if (!this.f25493q) {
            m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.n81
                @Override // com.google.android.gms.internal.ads.jd1
                public final void zza(Object obj) {
                    ((q81) obj).zzl();
                }
            });
            this.f25493q = true;
        }
    }
}
