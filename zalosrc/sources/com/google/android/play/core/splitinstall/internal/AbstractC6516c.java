package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.splitinstall.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC6516c {
    /* renamed from: a */
    public static C6514a m33393a(Object obj, String str, Class cls) {
        return new C6514a(obj, m33400h(obj, str), cls);
    }

    /* renamed from: b */
    public static C6515b m33394b(Object obj, String str, Class cls) {
        return new C6515b(obj, m33400h(obj, str), cls);
    }

    /* renamed from: c */
    public static Object m33395c(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to invoke default constructor on class %s", cls.getName()), e11);
        }
    }

    /* renamed from: d */
    public static Object m33396d(Object obj, String str, Class cls, Class cls2, Object obj2) {
        try {
            return cls.cast(m33401i(obj.getClass(), str, cls2).invoke(obj, obj2));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e11);
        }
    }

    /* renamed from: e */
    public static Object m33397e(Object obj, String str, Class cls, Class cls2, Object obj2, Class cls3, Object obj3, Class cls4, Object obj4) {
        try {
            return cls.cast(m33401i(obj.getClass(), str, cls2, cls3, cls4).invoke(obj, obj2, obj3, obj4));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to invoke method %s on an object of type %s", str, obj.getClass()), e11);
        }
    }

    /* renamed from: f */
    public static Object m33398f(Class cls, String str, Class cls2, Class cls3, Object obj) {
        try {
            return cls2.cast(m33401i(cls, "isDexOptNeeded", cls3).invoke(null, obj));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "isDexOptNeeded", cls), e11);
        }
    }

    /* renamed from: g */
    public static Object m33399g(Class cls, String str, Class cls2, Class cls3, Object obj, Class cls4, Object obj2) {
        try {
            return cls2.cast(m33401i(cls, "optimizedPathFor", cls3, cls4).invoke(null, obj, obj2));
        } catch (Exception e11) {
            throw new zzbl(String.format("Failed to invoke static method %s on type %s", "optimizedPathFor", cls), e11);
        }
    }

    /* renamed from: h */
    private static Field m33400h(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new zzbl(String.format("Failed to find a field named %s on an object of instance %s", str, obj.getClass().getName()));
    }

    /* renamed from: i */
    private static Method m33401i(Class cls, String str, Class... clsArr) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new zzbl(String.format("Could not find a method named %s with parameters %s in type %s", str, Arrays.asList(clsArr), cls));
    }
}
