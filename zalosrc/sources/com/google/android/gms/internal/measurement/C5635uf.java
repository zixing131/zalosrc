package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.uf */
/* loaded from: classes2.dex */
public final class C5635uf extends AbstractC5432j {

    /* renamed from: r */
    private final Callable f32844r;

    public C5635uf(String str, Callable callable) {
        super("internal.appMetadata");
        this.f32844r = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        try {
            return AbstractC5643v6.m29774b(this.f32844r.call());
        } catch (Exception unused) {
            return InterfaceC5551q.f32730d;
        }
    }
}
