package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
/* loaded from: classes2.dex */
public final class C5653w extends AbstractC5670x {
    public C5653w() {
        this.f32893a.add(EnumC5501n0.BITWISE_AND);
        this.f32893a.add(EnumC5501n0.BITWISE_LEFT_SHIFT);
        this.f32893a.add(EnumC5501n0.BITWISE_NOT);
        this.f32893a.add(EnumC5501n0.BITWISE_OR);
        this.f32893a.add(EnumC5501n0.BITWISE_RIGHT_SHIFT);
        this.f32893a.add(EnumC5501n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f32893a.add(EnumC5501n0.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        switch (AbstractC5608t5.m29614e(str).ordinal()) {
            case 4:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_AND.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) & AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue())));
            case 5:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) << ((int) (AbstractC5608t5.m29613d(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_NOT.name(), 1, list);
                return new C5415i(Double.valueOf(~AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue())));
            case 7:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_OR.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) | AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue())));
            case 8:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) >> ((int) (AbstractC5608t5.m29613d(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29613d(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) >>> ((int) (AbstractC5608t5.m29613d(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                AbstractC5608t5.m29617h(EnumC5501n0.BITWISE_XOR.name(), 2, list);
                return new C5415i(Double.valueOf(AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()) ^ AbstractC5608t5.m29611b(c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue())));
            default:
                return super.m29990b(str);
        }
    }
}
