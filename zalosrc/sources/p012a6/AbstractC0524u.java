package p012a6;

/* renamed from: a6.u */
/* loaded from: classes2.dex */
abstract class AbstractC0524u {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m876a(int i11, String str) {
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m877b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
