package com.google.android.gms.internal.measurement;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* loaded from: classes2.dex */
public final class C5450k0 extends AbstractC5670x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C5450k0() {
        this.f32893a.add(EnumC5501n0.ADD);
        this.f32893a.add(EnumC5501n0.DIVIDE);
        this.f32893a.add(EnumC5501n0.MODULUS);
        this.f32893a.add(EnumC5501n0.MULTIPLY);
        this.f32893a.add(EnumC5501n0.NEGATE);
        this.f32893a.add(EnumC5501n0.POST_DECREMENT);
        this.f32893a.add(EnumC5501n0.POST_INCREMENT);
        this.f32893a.add(EnumC5501n0.PRE_DECREMENT);
        this.f32893a.add(EnumC5501n0.PRE_INCREMENT);
        this.f32893a.add(EnumC5501n0.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5670x
    /* renamed from: a */
    public final InterfaceC5551q mo28856a(String str, C5590s4 c5590s4, List list) {
        EnumC5501n0 enumC5501n0 = EnumC5501n0.ADD;
        int ordinal = AbstractC5608t5.m29614e(str).ordinal();
        if (ordinal != 0) {
            if (ordinal != 21) {
                if (ordinal != 59) {
                    if (ordinal != 52 && ordinal != 53) {
                        if (ordinal != 55 && ordinal != 56) {
                            switch (ordinal) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                    AbstractC5608t5.m29617h(EnumC5501n0.MODULUS.name(), 2, list);
                                    return new C5415i(Double.valueOf(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue() % c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()));
                                case 45:
                                    AbstractC5608t5.m29617h(EnumC5501n0.MULTIPLY.name(), 2, list);
                                    return new C5415i(Double.valueOf(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue() * c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()));
                                case 46:
                                    AbstractC5608t5.m29617h(EnumC5501n0.NEGATE.name(), 1, list);
                                    return new C5415i(Double.valueOf(-c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue()));
                                default:
                                    return super.m29990b(str);
                            }
                        }
                        AbstractC5608t5.m29617h(str, 1, list);
                        return c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    }
                    AbstractC5608t5.m29617h(str, 2, list);
                    InterfaceC5551q m29589b = c5590s4.m29589b((InterfaceC5551q) list.get(0));
                    c5590s4.m29589b((InterfaceC5551q) list.get(1));
                    return m29589b;
                }
                AbstractC5608t5.m29617h(EnumC5501n0.SUBTRACT.name(), 2, list);
                return new C5415i(Double.valueOf(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue() + new C5415i(Double.valueOf(-c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue())).zzh().doubleValue()));
            }
            AbstractC5608t5.m29617h(EnumC5501n0.DIVIDE.name(), 2, list);
            return new C5415i(Double.valueOf(c5590s4.m29589b((InterfaceC5551q) list.get(0)).zzh().doubleValue() / c5590s4.m29589b((InterfaceC5551q) list.get(1)).zzh().doubleValue()));
        }
        AbstractC5608t5.m29617h(EnumC5501n0.ADD.name(), 2, list);
        InterfaceC5551q m29589b2 = c5590s4.m29589b((InterfaceC5551q) list.get(0));
        InterfaceC5551q m29589b3 = c5590s4.m29589b((InterfaceC5551q) list.get(1));
        if (!(m29589b2 instanceof InterfaceC5483m) && !(m29589b2 instanceof C5619u) && !(m29589b3 instanceof InterfaceC5483m) && !(m29589b3 instanceof C5619u)) {
            return new C5415i(Double.valueOf(m29589b2.zzh().doubleValue() + m29589b3.zzh().doubleValue()));
        }
        return new C5619u(String.valueOf(m29589b2.zzi()).concat(String.valueOf(m29589b3.zzi())));
    }
}
