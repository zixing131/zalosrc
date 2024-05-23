package on0;

import fn0.AbstractC19074t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.t */
/* loaded from: classes.dex */
public abstract class AbstractC24339t extends AbstractC24338s {
    /* renamed from: j */
    public static Double m127104j(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        try {
            if (!C24331l.f117443b.m127018f(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static Float m127105k(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        try {
            if (!C24331l.f117443b.m127018f(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
