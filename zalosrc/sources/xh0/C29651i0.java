package xh0;

import fn0.AbstractC19074t;
import java.util.Comparator;
import java.util.List;
import qm0.AbstractC25376w;

/* renamed from: xh0.i0 */
/* loaded from: classes7.dex */
public final class C29651i0 {

    /* renamed from: a */
    public static final C29651i0 f136908a = new C29651i0();

    private C29651i0() {
    }

    /* renamed from: b */
    public static final C29645f0 m147400b(List list, int i11, int i12) {
        AbstractC19074t.m100208f(list, "supportedSize");
        final float f11 = i12 / i11;
        int i13 = 1;
        if (!list.isEmpty()) {
            AbstractC25376w.m131534w(list, new Comparator() { // from class: xh0.h0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m147401c;
                    m147401c = C29651i0.m147401c(f11, (C29645f0) obj, (C29645f0) obj2);
                    return m147401c;
                }
            });
            C29645f0 c29645f0 = (C29645f0) list.get(0);
            int size = list.size();
            if (1 < size) {
                while (true) {
                    int i14 = i13 + 1;
                    C29645f0 c29645f02 = (C29645f0) list.get(i13);
                    float abs = Math.abs(f11 - (c29645f02.f136895a / c29645f02.f136896b));
                    if (c29645f0.f136895a * c29645f0.f136896b < c29645f02.f136895a * c29645f02.f136896b && abs < 0.3d) {
                        c29645f0 = c29645f02;
                    }
                    if (i14 >= size) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return c29645f0;
        }
        throw new IllegalArgumentException("SupportedSize is empty!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final int m147401c(float f11, C29645f0 c29645f0, C29645f0 c29645f02) {
        float f12;
        float f13;
        int i11 = c29645f0.f136895a;
        float f14 = i11 / c29645f0.f136896b;
        int i12 = c29645f02.f136895a;
        float f15 = i12 / c29645f02.f136896b;
        if (f14 < f11) {
            f12 = f11 / f14;
        } else {
            f12 = f14 / f11;
        }
        if (f15 < f11) {
            f13 = f11 / f15;
        } else {
            f13 = f15 / f11;
        }
        if (f12 < f13) {
            return -1;
        }
        if (f12 > f13) {
            return 1;
        }
        return AbstractC19074t.m100209g(i12, i11);
    }
}
