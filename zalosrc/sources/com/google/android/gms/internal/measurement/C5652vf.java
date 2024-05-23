package com.google.android.gms.internal.measurement;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.vf */
/* loaded from: classes2.dex */
public final class C5652vf extends AbstractC5432j {

    /* renamed from: r */
    private final C5720zf f32867r;

    public C5652vf(C5720zf c5720zf) {
        super("internal.registerCallback");
        this.f32867r = c5720zf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5432j
    /* renamed from: a */
    public final InterfaceC5551q mo28891a(C5590s4 c5590s4, List list) {
        int i11;
        AbstractC5608t5.m29617h(this.f32427p, 3, list);
        String zzi = c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzi();
        InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        if (m29589b instanceof C5534p) {
            InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(2));
            if (m29589b2 instanceof C5500n) {
                C5500n c5500n = (C5500n) m29589b2;
                if (c5500n.mo29099e(ZinstantMetaConstant.IMPRESSION_META_TYPE)) {
                    String zzi2 = c5500n.mo29101j(ZinstantMetaConstant.IMPRESSION_META_TYPE).zzi();
                    if (c5500n.mo29099e("priority")) {
                        i11 = AbstractC5608t5.m29611b(c5500n.mo29101j("priority").zzh().doubleValue());
                    } else {
                        i11 = 1000;
                    }
                    this.f32867r.m30115a(zzi, i11, (C5534p) m29589b, zzi2);
                    return InterfaceC5551q.f32730d;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
