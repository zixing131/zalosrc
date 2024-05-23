package wm0;

import fn0.AbstractC19074t;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wm0.i */
/* loaded from: classes7.dex */
public final class C29101i {

    /* renamed from: a */
    public static final C29101i f134920a = new C29101i();

    /* renamed from: b */
    private static final a f134921b = new a(null, null, null);

    /* renamed from: c */
    private static a f134922c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wm0.i$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        public final Method f134923a;

        /* renamed from: b */
        public final Method f134924b;

        /* renamed from: c */
        public final Method f134925c;

        public a(Method method, Method method2, Method method3) {
            this.f134923a = method;
            this.f134924b = method2;
            this.f134925c = method3;
        }
    }

    private C29101i() {
    }

    /* renamed from: a */
    private final a m145356a(AbstractC29093a abstractC29093a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC29093a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC29093a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f134922c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f134921b;
            f134922c = aVar2;
            return aVar2;
        }
    }

    /* renamed from: b */
    public final String m145357b(AbstractC29093a abstractC29093a) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC19074t.m100208f(abstractC29093a, "continuation");
        a aVar = f134922c;
        if (aVar == null) {
            aVar = m145356a(abstractC29093a);
        }
        if (aVar == f134921b) {
            return null;
        }
        Method method = aVar.f134923a;
        if (method != null) {
            obj = method.invoke(abstractC29093a.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar.f134924b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar.f134925c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (!(obj3 instanceof String)) {
            return null;
        }
        return (String) obj3;
    }
}
