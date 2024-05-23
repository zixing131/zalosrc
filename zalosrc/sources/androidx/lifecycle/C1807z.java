package androidx.lifecycle;

import androidx.appcompat.widget.AbstractC1158c0;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import on0.AbstractC24341v;
import qm0.AbstractC25366r;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C1807z {

    /* renamed from: a */
    public static final C1807z f7431a = new C1807z();

    /* renamed from: b */
    private static final Map f7432b = new HashMap();

    /* renamed from: c */
    private static final Map f7433c = new HashMap();

    private C1807z() {
    }

    /* renamed from: a */
    private final InterfaceC1779l m9407a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            AbstractC19074t.m100207e(newInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC1158c0.m5500a(newInstance);
            return null;
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(e13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final Constructor m9408b(Class cls) {
        String str;
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r02 != null) {
                str = r02.getName();
            } else {
                str = "";
            }
            AbstractC19074t.m100207e(str, "fullPackage");
            if (str.length() != 0) {
                AbstractC19074t.m100207e(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                AbstractC19074t.m100207e(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            AbstractC19074t.m100207e(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m9409c = m9409c(canonicalName);
            if (str.length() != 0) {
                m9409c = str + '.' + m9409c;
            }
            Class<?> cls2 = Class.forName(m9409c);
            AbstractC19074t.m100206d(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: c */
    public static final String m9409c(String str) {
        String m127114D;
        AbstractC19074t.m100208f(str, "className");
        StringBuilder sb2 = new StringBuilder();
        m127114D = AbstractC24341v.m127114D(str, ".", "_", false, 4, null);
        sb2.append(m127114D);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    /* renamed from: d */
    private final int m9410d(Class cls) {
        Map map = f7432b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m9413g = m9413g(cls);
        map.put(cls, Integer.valueOf(m9413g));
        return m9413g;
    }

    /* renamed from: e */
    private final boolean m9411e(Class cls) {
        if (cls != null && InterfaceC1799v.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final InterfaceC1795t m9412f(Object obj) {
        AbstractC19074t.m100208f(obj, "object");
        boolean z11 = obj instanceof InterfaceC1795t;
        boolean z12 = obj instanceof InterfaceC1767f;
        if (z11 && z12) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1767f) obj, (InterfaceC1795t) obj);
        }
        if (z12) {
            return new DefaultLifecycleObserverAdapter((InterfaceC1767f) obj, null);
        }
        if (z11) {
            return (InterfaceC1795t) obj;
        }
        Class<?> cls = obj.getClass();
        C1807z c1807z = f7431a;
        if (c1807z.m9410d(cls) == 2) {
            Object obj2 = f7433c.get(cls);
            AbstractC19074t.m100205c(obj2);
            List list = (List) obj2;
            if (list.size() == 1) {
                c1807z.m9407a((Constructor) list.get(0), obj);
                return new SingleGeneratedAdapterObserver(null);
            }
            int size = list.size();
            InterfaceC1779l[] interfaceC1779lArr = new InterfaceC1779l[size];
            for (int i11 = 0; i11 < size; i11++) {
                f7431a.m9407a((Constructor) list.get(i11), obj);
                interfaceC1779lArr[i11] = null;
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC1779lArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private final int m9413g(Class cls) {
        ArrayList arrayList;
        List m131496e;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor m9408b = m9408b(cls);
        if (m9408b != null) {
            Map map = f7433c;
            m131496e = AbstractC25366r.m131496e(m9408b);
            map.put(cls, m131496e);
            return 2;
        }
        if (C1760c.f7298c.m9267d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m9411e(superclass)) {
            AbstractC19074t.m100207e(superclass, "superclass");
            if (m9410d(superclass) == 1) {
                return 1;
            }
            Object obj = f7433c.get(superclass);
            AbstractC19074t.m100205c(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        AbstractC19074t.m100207e(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (m9411e(cls2)) {
                AbstractC19074t.m100207e(cls2, "intrface");
                if (m9410d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f7433c.get(cls2);
                AbstractC19074t.m100205c(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f7433c.put(cls, arrayList);
        return 2;
    }
}
