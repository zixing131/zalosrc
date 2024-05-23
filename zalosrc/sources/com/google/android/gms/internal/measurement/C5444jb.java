package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.jb */
/* loaded from: classes2.dex */
public final class C5444jb extends AbstractC5432j {

    /* renamed from: r */
    private final InterfaceC5309bc f32443r;

    public C5444jb(String str, InterfaceC5309bc interfaceC5309bc) {
        super("internal.remoteConfig");
        this.f32443r = interfaceC5309bc;
        this.f32428q.put("getValue", new C5511na(this, "getValue", interfaceC5309bc));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        return InterfaceC5551q.f32730d;
    }
}
