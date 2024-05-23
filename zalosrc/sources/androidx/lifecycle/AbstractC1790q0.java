package androidx.lifecycle;

import android.app.Application;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import qm0.AbstractC25358n;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;

/* renamed from: androidx.lifecycle.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC1790q0 {

    /* renamed from: a */
    private static final List f7382a;

    /* renamed from: b */
    private static final List f7383b;

    static {
        List m131505m;
        List m131496e;
        m131505m = AbstractC25368s.m131505m(Application.class, C1780l0.class);
        f7382a = m131505m;
        m131496e = AbstractC25366r.m131496e(C1780l0.class);
        f7383b = m131496e;
    }

    /* renamed from: c */
    public static final Constructor m9353c(Class cls, List list) {
        List m131381c0;
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC19074t.m100207e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC19074t.m100207e(parameterTypes, "constructor.parameterTypes");
            m131381c0 = AbstractC25358n.m131381c0(parameterTypes);
            if (AbstractC19074t.m100204b(list, m131381c0)) {
                AbstractC19074t.m100206d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == m131381c0.size() && m131381c0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final AbstractC1796t0 m9354d(Class cls, Constructor constructor, Object... objArr) {
        AbstractC19074t.m100208f(cls, "modelClass");
        AbstractC19074t.m100208f(constructor, "constructor");
        AbstractC19074t.m100208f(objArr, "params");
        try {
            return (AbstractC1796t0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Failed to access " + cls, e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e13.getCause());
        }
    }
}
