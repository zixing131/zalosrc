package kotlinx.coroutines.internal;

import dn0.AbstractC18031a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24860q;
import pm0.C24861r;

/* loaded from: classes7.dex */
public final class ExceptionsConstructorKt {

    /* renamed from: a */
    private static final int f107364a = m113619e(Throwable.class, -1);

    /* renamed from: b */
    private static final CtorCache f107365b;

    static {
        CtorCache ctorCache;
        try {
            if (FastServiceLoaderKt.m113633a()) {
                ctorCache = WeakMapCtorCache.f107439a;
            } else {
                ctorCache = ClassValueCtorCache.f107347a;
            }
        } catch (Throwable unused) {
            ctorCache = WeakMapCtorCache.f107439a;
        }
        f107365b = ctorCache;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC18505l m113615a(Class cls) {
        return m113616b(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final InterfaceC18505l m113616b(Class cls) {
        Object obj;
        InterfaceC18505l interfaceC18505l;
        C24860q m129235a;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.f107370q;
        if (f107364a != m113619e(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i11];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 != 0) {
                if (length2 != 1) {
                    if (length2 != 2) {
                        m129235a = AbstractC24866w.m129235a(null, -1);
                    } else if (AbstractC19074t.m100204b(parameterTypes[0], String.class) && AbstractC19074t.m100204b(parameterTypes[1], Throwable.class)) {
                        m129235a = AbstractC24866w.m129235a(m113620f(new ExceptionsConstructorKt$createConstructor$1$1(constructor)), 3);
                    } else {
                        m129235a = AbstractC24866w.m129235a(null, -1);
                    }
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    if (AbstractC19074t.m100204b(cls2, String.class)) {
                        m129235a = AbstractC24866w.m129235a(m113620f(new ExceptionsConstructorKt$createConstructor$1$2(constructor)), 2);
                    } else if (AbstractC19074t.m100204b(cls2, Throwable.class)) {
                        m129235a = AbstractC24866w.m129235a(m113620f(new ExceptionsConstructorKt$createConstructor$1$3(constructor)), 1);
                    } else {
                        m129235a = AbstractC24866w.m129235a(null, -1);
                    }
                }
            } else {
                m129235a = AbstractC24866w.m129235a(m113620f(new ExceptionsConstructorKt$createConstructor$1$4(constructor)), 0);
            }
            arrayList.add(m129235a);
            i11++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((C24860q) obj).m129216d()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((C24860q) next).m129216d()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        C24860q c24860q = (C24860q) obj;
        if (c24860q != null && (interfaceC18505l = (InterfaceC18505l) c24860q.m129215c()) != null) {
            return interfaceC18505l;
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* renamed from: c */
    private static final int m113617c(Class cls, int i11) {
        do {
            int length = cls.getDeclaredFields().length;
            int i12 = 0;
            for (int i13 = 0; i13 < length; i13++) {
                if (!Modifier.isStatic(r0[i13].getModifiers())) {
                    i12++;
                }
            }
            i11 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i11;
    }

    /* renamed from: d */
    static /* synthetic */ int m113618d(Class cls, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return m113617c(cls, i11);
    }

    /* renamed from: e */
    private static final int m113619e(Class cls, int i11) {
        Object m129218b;
        AbstractC18031a.m95870c(cls);
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(Integer.valueOf(m113618d(cls, 0, 1, null)));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        Integer valueOf = Integer.valueOf(i11);
        if (C24861r.m129223g(m129218b)) {
            m129218b = valueOf;
        }
        return ((Number) m129218b).intValue();
    }

    /* renamed from: f */
    private static final InterfaceC18505l m113620f(InterfaceC18505l interfaceC18505l) {
        return new ExceptionsConstructorKt$safeCtor$1(interfaceC18505l);
    }
}
