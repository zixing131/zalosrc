package tn0;

import dn0.AbstractC18031a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import mn0.InterfaceC23364b;
import qn0.C25388c;
import qn0.InterfaceC25387b;
import qn0.InterfaceC25392g;

/* renamed from: tn0.y0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26846y0 {
    /* renamed from: a */
    private static final Object m137995a(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer m137996b(Class cls, KSerializer... kSerializerArr) {
        KSerializer kSerializer;
        Object obj;
        Field field;
        KSerializer m137999e;
        AbstractC19074t.m100208f(cls, "<this>");
        AbstractC19074t.m100208f(kSerializerArr, "args");
        if (cls.isEnum() && m138001g(cls)) {
            return m137997c(cls);
        }
        if (cls.isInterface() && (m137999e = m137999e(cls)) != null) {
            return m137999e;
        }
        KSerializer m138000f = m138000f(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (m138000f != null) {
            return m138000f;
        }
        KSerializer m137998d = m137998d(cls);
        if (m137998d != null) {
            return m137998d;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC19074t.m100207e(declaredClasses, "declaredClasses");
            int length = declaredClasses.length;
            int i11 = 0;
            Class<?> cls2 = null;
            boolean z11 = false;
            while (true) {
                if (i11 < length) {
                    Class<?> cls3 = declaredClasses[i11];
                    if (AbstractC19074t.m100204b(cls3.getSimpleName(), "$serializer")) {
                        if (z11) {
                            break;
                        }
                        z11 = true;
                        cls2 = cls3;
                    }
                    i11++;
                } else if (!z11) {
                }
            }
            cls2 = null;
            if (cls2 != null && (field = cls2.getField("INSTANCE")) != null) {
                obj = field.get(null);
            } else {
                obj = null;
            }
        } catch (NoSuchFieldException unused) {
        }
        if (obj instanceof KSerializer) {
            kSerializer = (KSerializer) obj;
            if (kSerializer == null) {
                return kSerializer;
            }
            if (!m138002h(cls)) {
                return null;
            }
            return new C25388c(AbstractC18031a.m95870c(cls));
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    /* renamed from: c */
    private static final KSerializer m137997c(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC19074t.m100207e(canonicalName, "canonicalName");
        AbstractC19074t.m100206d(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new C26833u(canonicalName, (Enum[]) enumConstants);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:            if (r5 == false) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:            if (r5 == false) goto L64;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final KSerializer m137998d(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC19074t.m100207e(declaredFields, "declaredFields");
        int length = declaredFields.length;
        Field field = null;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 < length) {
                Field field2 = declaredFields[i11];
                if (AbstractC19074t.m100204b(field2.getName(), "INSTANCE") && AbstractC19074t.m100204b(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z11) {
                        break;
                    }
                    field = field2;
                    z11 = true;
                }
                i11++;
            }
        }
        field = null;
        if (field == null) {
            return null;
        }
        Object obj = field.get(null);
        Method[] methods = cls.getMethods();
        AbstractC19074t.m100207e(methods, "methods");
        int length2 = methods.length;
        Method method = null;
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            if (i12 < length2) {
                Method method2 = methods[i12];
                if (AbstractC19074t.m100204b(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC19074t.m100207e(parameterTypes, "it.parameterTypes");
                    if (parameterTypes.length == 0 && AbstractC19074t.m100204b(method2.getReturnType(), KSerializer.class)) {
                        if (z12) {
                            break;
                        }
                        method = method2;
                        z12 = true;
                    }
                }
                i12++;
            }
        }
        method = null;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(obj, new Object[0]);
        if (!(invoke instanceof KSerializer)) {
            return null;
        }
        return (KSerializer) invoke;
    }

    /* renamed from: e */
    private static final KSerializer m137999e(Class cls) {
        InterfaceC25392g interfaceC25392g = (InterfaceC25392g) cls.getAnnotation(InterfaceC25392g.class);
        if (interfaceC25392g != null && !AbstractC19074t.m100204b(AbstractC19061k0.m100169b(interfaceC25392g.with()), AbstractC19061k0.m100169b(C25388c.class))) {
            return null;
        }
        return new C25388c(AbstractC18031a.m95870c(cls));
    }

    /* renamed from: f */
    private static final KSerializer m138000f(Class cls, KSerializer... kSerializerArr) {
        Class[] clsArr;
        Object m137995a = m137995a(cls);
        if (m137995a == null) {
            return null;
        }
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i11 = 0; i11 < length; i11++) {
                    clsArr2[i11] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = m137995a.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(m137995a, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (!(invoke instanceof KSerializer)) {
                return null;
            }
            return (KSerializer) invoke;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e11.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e11;
        }
    }

    /* renamed from: g */
    private static final boolean m138001g(Class cls) {
        if (cls.getAnnotation(InterfaceC25392g.class) == null && cls.getAnnotation(InterfaceC25387b.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private static final boolean m138002h(Class cls) {
        if (cls.getAnnotation(InterfaceC25387b.class) != null) {
            return true;
        }
        InterfaceC25392g interfaceC25392g = (InterfaceC25392g) cls.getAnnotation(InterfaceC25392g.class);
        if (interfaceC25392g != null && AbstractC19074t.m100204b(AbstractC19061k0.m100169b(interfaceC25392g.with()), AbstractC19061k0.m100169b(C25388c.class))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static final Void m138003i(Class cls) {
        AbstractC19074t.m100208f(cls, "<this>");
        throw new SerializationException(AbstractC26849z0.m138017d(AbstractC18031a.m95870c(cls)));
    }

    /* renamed from: j */
    public static final Object[] m138004j(ArrayList arrayList, InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(arrayList, "<this>");
        AbstractC19074t.m100208f(interfaceC23364b, "eClass");
        Object newInstance = Array.newInstance((Class<?>) AbstractC18031a.m95868a(interfaceC23364b), arrayList.size());
        AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        AbstractC19074t.m100207e(array, "toArray(java.lang.reflec….java, size) as Array<E>)");
        return array;
    }
}
