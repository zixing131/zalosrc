package p048c4;

/* renamed from: c4.d */
/* loaded from: classes.dex */
public abstract class AbstractC3271d {
    /* renamed from: a */
    public static void m16649a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m16650b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m16651c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
