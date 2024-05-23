package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.tf */
/* loaded from: classes2.dex */
public final class C5618tf extends AbstractC5432j {

    /* renamed from: r */
    private final InterfaceC5329cf f32816r;

    public C5618tf(InterfaceC5329cf interfaceC5329cf) {
        super("internal.logger");
        this.f32816r = interfaceC5329cf;
        this.f32428q.put("log", new C5601sf(this, false, true));
        this.f32428q.put("silent", new C5293ad(this, "silent"));
        ((AbstractC5432j) this.f32428q.get("silent")).mo29100g("log", new C5601sf(this, true, true));
        this.f32428q.put("unmonitored", new C5311be(this, "unmonitored"));
        ((AbstractC5432j) this.f32428q.get("unmonitored")).mo29100g("log", new C5601sf(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        return InterfaceC5551q.f32730d;
    }
}
