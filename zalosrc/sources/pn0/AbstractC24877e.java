package pn0;

import fn0.AbstractC19074t;

/* renamed from: pn0.e */
/* loaded from: classes7.dex */
abstract class AbstractC24877e {
    /* renamed from: a */
    public static final double m129367a(double d11, EnumC24876d enumC24876d, EnumC24876d enumC24876d2) {
        AbstractC19074t.m100208f(enumC24876d, "sourceUnit");
        AbstractC19074t.m100208f(enumC24876d2, "targetUnit");
        long convert = enumC24876d2.m129366c().convert(1L, enumC24876d.m129366c());
        if (convert > 0) {
            return d11 * convert;
        }
        return d11 / enumC24876d.m129366c().convert(1L, enumC24876d2.m129366c());
    }

    /* renamed from: b */
    public static final long m129368b(long j11, EnumC24876d enumC24876d, EnumC24876d enumC24876d2) {
        AbstractC19074t.m100208f(enumC24876d, "sourceUnit");
        AbstractC19074t.m100208f(enumC24876d2, "targetUnit");
        return enumC24876d2.m129366c().convert(j11, enumC24876d.m129366c());
    }

    /* renamed from: c */
    public static final long m129369c(long j11, EnumC24876d enumC24876d, EnumC24876d enumC24876d2) {
        AbstractC19074t.m100208f(enumC24876d, "sourceUnit");
        AbstractC19074t.m100208f(enumC24876d2, "targetUnit");
        return enumC24876d2.m129366c().convert(j11, enumC24876d.m129366c());
    }
}
