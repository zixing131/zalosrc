package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p230i6.InterfaceC20329u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.m2 */
/* loaded from: classes.dex */
public final class BinderC5486m2 extends AbstractBinderC5468l1 {

    /* renamed from: p */
    private final InterfaceC20329u f32526p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC5486m2(InterfaceC20329u interfaceC20329u) {
        this.f32526p = interfaceC20329u;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5485m1
    /* renamed from: T */
    public final void mo29330T(String str, String str2, Bundle bundle, long j11) {
        this.f32526p.mo31470a(str, str2, bundle, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5485m1
    public final int zzd() {
        return System.identityHashCode(this.f32526p);
    }
}
