package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import p093d6.AbstractBinderC17783r;

/* renamed from: com.google.android.gms.internal.location.e */
/* loaded from: classes2.dex */
final class BinderC5271e extends AbstractBinderC17783r {

    /* renamed from: p */
    private final C4086d f32193p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5271e(C4086d c4086d) {
        this.f32193p = c4086d;
    }

    @Override // p093d6.InterfaceC17784s
    /* renamed from: M2 */
    public final void mo28841M2(LocationResult locationResult) {
        this.f32193p.m19392c(new C5269c(this, locationResult));
    }

    @Override // p093d6.InterfaceC17784s
    /* renamed from: P0 */
    public final void mo28842P0(LocationAvailability locationAvailability) {
        this.f32193p.m19392c(new C5270d(this, locationAvailability));
    }

    public final synchronized void zzc() {
        this.f32193p.m19390a();
    }
}
