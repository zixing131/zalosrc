package p638xa;

import com.google.zxing.EnumC6846a;
import com.google.zxing.EnumC6848c;
import com.google.zxing.InterfaceC6850e;
import java.util.Map;
import p054cb.C3389a;
import p664y.AbstractC30228a;
import p675ya.AbstractC30870i;
import p675ya.AbstractC30871j;
import p675ya.C30866e;
import p675ya.C30872k;
import p675ya.EnumC30873l;
import va.C27954b;

/* renamed from: xa.a */
/* loaded from: classes3.dex */
public final class C29553a implements InterfaceC6850e {
    /* renamed from: b */
    private static C27954b m146937b(C3389a c3389a, int i11, int i12) {
        C27954b c27954b;
        int m17062c = c3389a.m17062c();
        int m17061b = c3389a.m17061b();
        int max = Math.max(i11, m17062c);
        int max2 = Math.max(i12, m17061b);
        int min = Math.min(max / m17062c, max2 / m17061b);
        int i13 = (max - (m17062c * min)) / 2;
        int i14 = (max2 - (m17061b * min)) / 2;
        if (i12 >= m17061b && i11 >= m17062c) {
            c27954b = new C27954b(i11, i12);
        } else {
            c27954b = new C27954b(m17062c, m17061b);
            i13 = 0;
            i14 = 0;
        }
        c27954b.m140888b();
        int i15 = 0;
        while (i15 < m17061b) {
            int i16 = i13;
            int i17 = 0;
            while (i17 < m17062c) {
                if (c3389a.m17060a(i17, i15) == 1) {
                    c27954b.m140894i(i16, i14, min, min);
                }
                i17++;
                i16 += min;
            }
            i15++;
            i14 += min;
        }
        return c27954b;
    }

    /* renamed from: c */
    private static C27954b m146938c(C30866e c30866e, C30872k c30872k, int i11, int i12) {
        boolean z11;
        boolean z12;
        int m150077h = c30872k.m150077h();
        int m150076g = c30872k.m150076g();
        C3389a c3389a = new C3389a(c30872k.m150079j(), c30872k.m150078i());
        int i13 = 0;
        for (int i14 = 0; i14 < m150076g; i14++) {
            if (i14 % c30872k.f142443e == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < c30872k.m150079j(); i16++) {
                    if (i16 % 2 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c3389a.m17063d(i15, i13, z12);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < m150077h; i18++) {
                if (i18 % c30872k.f142442d == 0) {
                    c3389a.m17063d(i17, i13, true);
                    i17++;
                }
                c3389a.m17063d(i17, i13, c30866e.m150027e(i18, i14));
                int i19 = i17 + 1;
                int i21 = c30872k.f142442d;
                if (i18 % i21 == i21 - 1) {
                    if (i14 % 2 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    c3389a.m17063d(i19, i13, z11);
                    i17 += 2;
                } else {
                    i17 = i19;
                }
            }
            int i22 = i13 + 1;
            int i23 = c30872k.f142443e;
            if (i14 % i23 == i23 - 1) {
                int i24 = 0;
                for (int i25 = 0; i25 < c30872k.m150079j(); i25++) {
                    c3389a.m17063d(i24, i22, true);
                    i24++;
                }
                i13 += 2;
            } else {
                i13 = i22;
            }
        }
        return m146937b(c3389a, i11, i12);
    }

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (!str.isEmpty()) {
            if (enumC6846a == EnumC6846a.DATA_MATRIX) {
                if (i11 >= 0 && i12 >= 0) {
                    EnumC30873l enumC30873l = EnumC30873l.FORCE_NONE;
                    if (map != null) {
                        EnumC30873l enumC30873l2 = (EnumC30873l) map.get(EnumC6848c.DATA_MATRIX_SHAPE);
                        if (enumC30873l2 != null) {
                            enumC30873l = enumC30873l2;
                        }
                        AbstractC30228a.m149044a(map.get(EnumC6848c.MIN_SIZE));
                        AbstractC30228a.m149044a(map.get(EnumC6848c.MAX_SIZE));
                    }
                    String m150056b = AbstractC30871j.m150056b(str, enumC30873l, null, null);
                    C30872k m150072l = C30872k.m150072l(m150056b.length(), enumC30873l, null, null, true);
                    C30866e c30866e = new C30866e(AbstractC30870i.m150054c(m150056b, m150072l), m150072l.m150077h(), m150072l.m150076g());
                    c30866e.m150028h();
                    return m146938c(c30866e, m150072l, i11, i12);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i11 + 'x' + i12);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + enumC6846a);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
