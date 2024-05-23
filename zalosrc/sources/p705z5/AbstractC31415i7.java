package p705z5;

import java.util.Objects;

/* renamed from: z5.i7 */
/* loaded from: classes2.dex */
abstract class AbstractC31415i7 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m152250a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Objects.toString(obj2);
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
