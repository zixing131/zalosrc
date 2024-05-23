package p633x5;

/* renamed from: x5.f */
/* loaded from: classes2.dex */
abstract class AbstractC29342f {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m146483a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
