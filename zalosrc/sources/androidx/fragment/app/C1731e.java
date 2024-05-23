package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import p665y0.C30245g;

/* renamed from: androidx.fragment.app.e */
/* loaded from: classes2.dex */
public class C1731e {

    /* renamed from: a */
    private static final C30245g f7040a = new C30245g();

    /* renamed from: b */
    public static boolean m8983b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m8984c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class m8984c(ClassLoader classLoader, String str) {
        C30245g c30245g = f7040a;
        Class cls = (Class) c30245g.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c30245g.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class m8985d(ClassLoader classLoader, String str) {
        try {
            return m8984c(classLoader, str);
        } catch (ClassCastException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        } catch (ClassNotFoundException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists", e12);
        }
    }

    /* renamed from: a */
    public Fragment mo8986a(ClassLoader classLoader, String str) {
        try {
            return (Fragment) m8985d(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e11) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (InstantiationException e12) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e12);
        } catch (NoSuchMethodException e13) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e13);
        } catch (InvocationTargetException e14) {
            throw new Fragment.InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e14);
        }
    }
}
