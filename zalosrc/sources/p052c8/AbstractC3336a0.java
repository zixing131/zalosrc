package p052c8;

/* renamed from: c8.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC3336a0 {
    /* renamed from: a */
    public static void m16811a(boolean z11, String str) {
        if (z11) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static Object m16812b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m16813c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m16814d(boolean z11, String str) {
        if (z11) {
        } else {
            throw new IllegalStateException(str);
        }
    }
}
