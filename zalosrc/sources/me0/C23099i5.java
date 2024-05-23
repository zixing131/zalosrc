package me0;

import fn0.AbstractC19074t;
import on0.AbstractC24340u;

/* renamed from: me0.i5 */
/* loaded from: classes4.dex */
public final class C23099i5 {

    /* renamed from: a */
    public static final C23099i5 f112173a = new C23099i5();

    private C23099i5() {
    }

    /* renamed from: a */
    public static final int m118475a(String str) {
        AbstractC19074t.m100208f(str, "value");
        return m118477c(str, 0, 2, null);
    }

    /* renamed from: b */
    public static final int m118476b(String str, int i11) {
        Integer m127107m;
        AbstractC19074t.m100208f(str, "value");
        m127107m = AbstractC24340u.m127107m(str);
        if (m127107m != null) {
            return m127107m.intValue();
        }
        return i11;
    }

    /* renamed from: c */
    public static /* synthetic */ int m118477c(String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m118476b(str, i11);
    }
}
