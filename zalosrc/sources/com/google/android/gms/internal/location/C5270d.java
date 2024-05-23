package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C4086d;
import com.google.android.gms.location.LocationAvailability;
import p093d6.AbstractC17762d;

/* renamed from: com.google.android.gms.internal.location.d */
/* loaded from: classes2.dex */
final class C5270d implements C4086d.b {

    /* renamed from: a */
    final /* synthetic */ LocationAvailability f32192a;

    public C5270d(BinderC5271e binderC5271e, LocationAvailability locationAvailability) {
        this.f32192a = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.C4086d.b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19394a(Object obj) {
        ((AbstractC17762d) obj).m93909a(this.f32192a);
    }

    @Override // com.google.android.gms.common.api.internal.C4086d.b
    /* renamed from: b */
    public final void mo19395b() {
    }
}
