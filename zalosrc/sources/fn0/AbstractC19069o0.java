package fn0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import en0.InterfaceC18512s;
import en0.InterfaceC18513t;
import gn0.InterfaceC19517a;
import gn0.InterfaceC19518b;
import gn0.InterfaceC19519c;
import gn0.InterfaceC19520d;
import gn0.InterfaceC19521e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import pm0.InterfaceC24847g;

/* renamed from: fn0.o0 */
/* loaded from: classes7.dex */
public abstract class AbstractC19069o0 {
    /* renamed from: a */
    public static Collection m100184a(Object obj) {
        if ((obj instanceof InterfaceC19517a) && !(obj instanceof InterfaceC19518b)) {
            m100198o(obj, "kotlin.collections.MutableCollection");
        }
        return m100189f(obj);
    }

    /* renamed from: b */
    public static Iterable m100185b(Object obj) {
        if ((obj instanceof InterfaceC19517a) && !(obj instanceof InterfaceC19519c)) {
            m100198o(obj, "kotlin.collections.MutableIterable");
        }
        return m100190g(obj);
    }

    /* renamed from: c */
    public static List m100186c(Object obj) {
        if ((obj instanceof InterfaceC19517a) && !(obj instanceof InterfaceC19520d)) {
            m100198o(obj, "kotlin.collections.MutableList");
        }
        return m100191h(obj);
    }

    /* renamed from: d */
    public static Map m100187d(Object obj) {
        if ((obj instanceof InterfaceC19517a) && !(obj instanceof InterfaceC19521e)) {
            m100198o(obj, "kotlin.collections.MutableMap");
        }
        return m100192i(obj);
    }

    /* renamed from: e */
    public static Object m100188e(Object obj, int i11) {
        if (obj != null && !m100194k(obj, i11)) {
            m100198o(obj, "kotlin.jvm.functions.Function" + i11);
        }
        return obj;
    }

    /* renamed from: f */
    public static Collection m100189f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e11) {
            throw m100197n(e11);
        }
    }

    /* renamed from: g */
    public static Iterable m100190g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e11) {
            throw m100197n(e11);
        }
    }

    /* renamed from: h */
    public static List m100191h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e11) {
            throw m100197n(e11);
        }
    }

    /* renamed from: i */
    public static Map m100192i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e11) {
            throw m100197n(e11);
        }
    }

    /* renamed from: j */
    public static int m100193j(Object obj) {
        if (obj instanceof InterfaceC19068o) {
            return ((InterfaceC19068o) obj).mo100147Lp();
        }
        if (obj instanceof InterfaceC18494a) {
            return 0;
        }
        if (obj instanceof InterfaceC18505l) {
            return 1;
        }
        if (obj instanceof InterfaceC18509p) {
            return 2;
        }
        if (obj instanceof InterfaceC18510q) {
            return 3;
        }
        if (obj instanceof InterfaceC18511r) {
            return 4;
        }
        if (obj instanceof InterfaceC18512s) {
            return 5;
        }
        if (obj instanceof InterfaceC18513t) {
            return 6;
        }
        return -1;
    }

    /* renamed from: k */
    public static boolean m100194k(Object obj, int i11) {
        if ((obj instanceof InterfaceC24847g) && m100193j(obj) == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m100195l(Object obj) {
        if ((obj instanceof List) && (!(obj instanceof InterfaceC19517a) || (obj instanceof InterfaceC19520d))) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static Throwable m100196m(Throwable th2) {
        return AbstractC19074t.m100215m(th2, AbstractC19069o0.class.getName());
    }

    /* renamed from: n */
    public static ClassCastException m100197n(ClassCastException classCastException) {
        throw ((ClassCastException) m100196m(classCastException));
    }

    /* renamed from: o */
    public static void m100198o(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        m100199p(name + " cannot be cast to " + str);
    }

    /* renamed from: p */
    public static void m100199p(String str) {
        throw m100197n(new ClassCastException(str));
    }
}
