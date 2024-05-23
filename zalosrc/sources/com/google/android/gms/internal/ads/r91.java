package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public final class r91 extends kd1 implements x20 {

    /* renamed from: q */
    private final Bundle f27141q;

    public r91(Set set) {
        super(set);
        this.f27141q = new Bundle();
    }

    /* renamed from: B0 */
    public final synchronized Bundle m25997B0() {
        return new Bundle(this.f27141q);
    }

    @Override // com.google.android.gms.internal.ads.x20
    /* renamed from: G */
    public final synchronized void mo20209G(String str, Bundle bundle) {
        this.f27141q.putAll(bundle);
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.q91
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((rz2) obj).mo21779j();
            }
        });
    }
}
