package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w8 */
/* loaded from: classes2.dex */
public final class C5662w8 extends AbstractC5432j {

    /* renamed from: r */
    private final C5313c f32885r;

    public C5662w8(C5313c c5313c) {
        super("internal.eventLogger");
        this.f32885r = c5313c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        Map hashMap;
        AbstractC5608t5.m29617h(this.f32427p, 3, list);
        String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
        long m29610a = (long) AbstractC5608t5.m29610a(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue());
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(2));
        if (m29589b instanceof C5500n) {
            hashMap = AbstractC5608t5.m29616g((C5500n) m29589b);
        } else {
            hashMap = new HashMap();
        }
        this.f32885r.m28958e(zzi, m29610a, hashMap);
        return InterfaceC5551q.f32730d;
    }
}
