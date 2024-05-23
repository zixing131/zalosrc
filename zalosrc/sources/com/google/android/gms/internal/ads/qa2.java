package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class qa2 implements ja1 {

    /* renamed from: p */
    private final AtomicReference f26702p = new AtomicReference();

    /* renamed from: a */
    public final void m25675a(zzde zzdeVar) {
        this.f26702p.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.ja1
    /* renamed from: c */
    public final void mo22410c(final zzs zzsVar) {
        in2.m23309a(this.f26702p, new hn2() { // from class: com.google.android.gms.internal.ads.pa2
            @Override // com.google.android.gms.internal.ads.hn2
            public final void zza(Object obj) {
                ((zzde) obj).zze(zzs.this);
            }
        });
    }
}
