package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.j2 */
/* loaded from: classes2.dex */
public final class C5435j2 extends AbstractRunnableC5469l2 {

    /* renamed from: t */
    final /* synthetic */ Long f32429t;

    /* renamed from: u */
    final /* synthetic */ String f32430u;

    /* renamed from: v */
    final /* synthetic */ String f32431v;

    /* renamed from: w */
    final /* synthetic */ Bundle f32432w;

    /* renamed from: x */
    final /* synthetic */ boolean f32433x;

    /* renamed from: y */
    final /* synthetic */ boolean f32434y;

    /* renamed from: z */
    final /* synthetic */ C5656w2 f32435z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5435j2(C5656w2 c5656w2, Long l11, String str, String str2, Bundle bundle, boolean z11, boolean z12) {
        super(c5656w2, true);
        this.f32435z = c5656w2;
        this.f32429t = l11;
        this.f32430u = str;
        this.f32431v = str2;
        this.f32432w = bundle;
        this.f32433x = z11;
        this.f32434y = z12;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC5469l2
    /* renamed from: a */
    final void mo28858a() {
        long longValue;
        InterfaceC5383g1 interfaceC5383g1;
        Long l11 = this.f32429t;
        if (l11 == null) {
            longValue = this.f32471p;
        } else {
            longValue = l11.longValue();
        }
        long j11 = longValue;
        interfaceC5383g1 = this.f32435z.f32881i;
        ((InterfaceC5383g1) AbstractC4205o.m19722k(interfaceC5383g1)).logEvent(this.f32430u, this.f32431v, this.f32432w, this.f32433x, this.f32434y, j11);
    }
}
