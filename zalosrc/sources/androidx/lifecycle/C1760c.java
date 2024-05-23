package androidx.lifecycle;

import androidx.lifecycle.AbstractC1785o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
final class C1760c {

    /* renamed from: c */
    static C1760c f7298c = new C1760c();

    /* renamed from: a */
    private final Map f7299a = new HashMap();

    /* renamed from: b */
    private final Map f7300b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map f7301a = new HashMap();

        /* renamed from: b */
        final Map f7302b;

        a(Map map) {
            this.f7302b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1785o.a aVar = (AbstractC1785o.a) entry.getValue();
                List list = (List) this.f7301a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f7301a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m9268b(List list, InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m9270a(interfaceC1801w, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m9269a(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar, Object obj) {
            m9268b((List) this.f7301a.get(aVar), interfaceC1801w, aVar, obj);
            m9268b((List) this.f7301a.get(AbstractC1785o.a.ON_ANY), interfaceC1801w, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f7303a;

        /* renamed from: b */
        final Method f7304b;

        b(int i11, Method method) {
            this.f7303a = i11;
            this.f7304b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m9270a(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar, Object obj) {
            try {
                int i11 = this.f7303a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            this.f7304b.invoke(obj, interfaceC1801w, aVar);
                            return;
                        }
                        return;
                    }
                    this.f7304b.invoke(obj, interfaceC1801w);
                    return;
                }
                this.f7304b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to call observer method", e12.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f7303a == bVar.f7303a && this.f7304b.getName().equals(bVar.f7304b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f7303a * 31) + this.f7304b.getName().hashCode();
        }
    }

    C1760c() {
    }

    /* renamed from: a */
    private a m9263a(Class cls, Method[] methodArr) {
        int i11;
        a m9266c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m9266c = m9266c(superclass)) != null) {
            hashMap.putAll(m9266c.f7302b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m9266c(cls2).f7302b.entrySet()) {
                m9265e(hashMap, (b) entry.getKey(), (AbstractC1785o.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m9264b(cls);
        }
        boolean z11 = false;
        for (Method method : methodArr) {
            InterfaceC1766e0 interfaceC1766e0 = (InterfaceC1766e0) method.getAnnotation(InterfaceC1766e0.class);
            if (interfaceC1766e0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC1801w.class.isAssignableFrom(parameterTypes[0])) {
                        i11 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i11 = 0;
                }
                AbstractC1785o.a value = interfaceC1766e0.value();
                if (parameterTypes.length > 1) {
                    if (AbstractC1785o.a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == AbstractC1785o.a.ON_ANY) {
                            i11 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m9265e(hashMap, new b(i11, method), value, cls);
                    z11 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f7299a.put(cls, aVar);
        this.f7300b.put(cls, Boolean.valueOf(z11));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m9264b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e11) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
        }
    }

    /* renamed from: e */
    private void m9265e(Map map, b bVar, AbstractC1785o.a aVar, Class cls) {
        AbstractC1785o.a aVar2 = (AbstractC1785o.a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            throw new IllegalArgumentException("Method " + bVar.f7304b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        }
        if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a m9266c(Class cls) {
        a aVar = (a) this.f7299a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m9263a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m9267d(Class cls) {
        Boolean bool = (Boolean) this.f7300b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m9264b = m9264b(cls);
        for (Method method : m9264b) {
            if (((InterfaceC1766e0) method.getAnnotation(InterfaceC1766e0.class)) != null) {
                m9263a(cls, m9264b);
                return true;
            }
        }
        this.f7300b.put(cls, Boolean.FALSE);
        return false;
    }
}
