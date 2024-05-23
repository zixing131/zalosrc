package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.na */
/* loaded from: classes2.dex */
public final class C5511na extends AbstractC5432j {

    /* renamed from: r */
    final /* synthetic */ InterfaceC5309bc f32688r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5511na(C5444jb c5444jb, String str, InterfaceC5309bc interfaceC5309bc) {
        super("getValue");
        this.f32688r = interfaceC5309bc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        AbstractC5608t5.m29617h("getValue", 2, list);
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        String zza = this.f32688r.zza(m29589b.zzi());
        if (zza != null) {
            return new C5619u(zza);
        }
        return m29589b2;
    }
}
