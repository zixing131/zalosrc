package nm0;

/* renamed from: nm0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC23885b {
    /* renamed from: a */
    public static void m124956a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m124957b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m124958c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
