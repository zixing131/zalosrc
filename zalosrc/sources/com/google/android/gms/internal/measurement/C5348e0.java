package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
/* loaded from: classes2.dex */
public final class C5348e0 extends AbstractC5670x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C5348e0() {
        this.f32893a.add(EnumC5501n0.AND);
        this.f32893a.add(EnumC5501n0.NOT);
        this.f32893a.add(EnumC5501n0.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.m29990b(str);
                }
                AbstractC5608t5.m29617h(EnumC5501n0.OR.name(), 2, list);
                InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                if (m29589b.zzg().booleanValue()) {
                    return m29589b;
                }
                return c5590s4.m29589b((InterfaceC5551q) list.get(1));
            }
            AbstractC5608t5.m29617h(EnumC5501n0.NOT.name(), 1, list);
            return new C5381g(Boolean.valueOf(!c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzg().booleanValue()));
        }
        AbstractC5608t5.m29617h(EnumC5501n0.AND.name(), 2, list);
        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        if (!m29589b2.zzg().booleanValue()) {
            return m29589b2;
        }
        return c5590s4.m29589b((InterfaceC5551q) list.get(1));
    }
}
