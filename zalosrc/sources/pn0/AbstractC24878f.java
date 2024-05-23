package pn0;

import fn0.AbstractC19074t;
import p227i3.C20215s;
import p667y2.C30271h;

/* renamed from: pn0.f */
/* loaded from: classes7.dex */
abstract class AbstractC24878f extends AbstractC24877e {
    /* renamed from: d */
    public static final EnumC24876d m129370d(char c11, boolean z11) {
        if (!z11) {
            if (c11 == 'D') {
                return EnumC24876d.f119370w;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c11);
        }
        if (c11 == 'H') {
            return EnumC24876d.f119369v;
        }
        if (c11 == 'M') {
            return EnumC24876d.f119368u;
        }
        if (c11 == 'S') {
            return EnumC24876d.f119367t;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c11);
    }

    /* renamed from: e */
    public static final EnumC24876d m129371e(String str) {
        AbstractC19074t.m100208f(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return EnumC24876d.f119365r;
                                }
                            } else if (str.equals("ns")) {
                                return EnumC24876d.f119364q;
                            }
                        } else if (str.equals("ms")) {
                            return EnumC24876d.f119366s;
                        }
                    } else if (str.equals(C20215s.f99966b)) {
                        return EnumC24876d.f119367t;
                    }
                } else if (str.equals("m")) {
                    return EnumC24876d.f119368u;
                }
            } else if (str.equals(C30271h.f140642d)) {
                return EnumC24876d.f119369v;
            }
        } else if (str.equals("d")) {
            return EnumC24876d.f119370w;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
