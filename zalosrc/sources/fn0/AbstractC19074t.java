package fn0;

import java.util.Arrays;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: fn0.t */
/* loaded from: classes.dex */
public abstract class AbstractC19074t {
    /* renamed from: a */
    public static boolean m100203a(Float f11, float f12) {
        if (f11 != null && f11.floatValue() == f12) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m100204b(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m100205c(Object obj) {
        if (obj == null) {
            m100217o();
        }
    }

    /* renamed from: d */
    public static void m100206d(Object obj, String str) {
        if (obj == null) {
            m100218p(str);
        }
    }

    /* renamed from: e */
    public static void m100207e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m100214l(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m100208f(Object obj, String str) {
        if (obj == null) {
            m100219q(str);
        }
    }

    /* renamed from: g */
    public static int m100209g(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 == i12 ? 0 : 1;
    }

    /* renamed from: h */
    public static int m100210h(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    /* renamed from: i */
    private static String m100211i(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC19074t.class.getName();
        int i11 = 0;
        while (!stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        while (stackTrace[i11].getClassName().equals(name)) {
            i11++;
        }
        StackTraceElement stackTraceElement = stackTrace[i11];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: j */
    public static void m100212j() {
        m100220r();
    }

    /* renamed from: k */
    public static void m100213k(int i11, String str) {
        m100220r();
    }

    /* renamed from: l */
    private static Throwable m100214l(Throwable th2) {
        return m100215m(th2, AbstractC19074t.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static Throwable m100215m(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.equals(stackTrace[i12].getClassName())) {
                i11 = i12;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i11 + 1, length));
        return th2;
    }

    /* renamed from: n */
    public static String m100216n(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: o */
    public static void m100217o() {
        throw ((NullPointerException) m100214l(new NullPointerException()));
    }

    /* renamed from: p */
    public static void m100218p(String str) {
        throw ((NullPointerException) m100214l(new NullPointerException(str)));
    }

    /* renamed from: q */
    private static void m100219q(String str) {
        throw ((NullPointerException) m100214l(new NullPointerException(m100211i(str))));
    }

    /* renamed from: r */
    public static void m100220r() {
        m100221s("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: s */
    public static void m100221s(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: t */
    public static void m100222t(String str) {
        throw ((UninitializedPropertyAccessException) m100214l(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: u */
    public static void m100223u(String str) {
        m100222t("lateinit property " + str + " has not been initialized");
    }
}
