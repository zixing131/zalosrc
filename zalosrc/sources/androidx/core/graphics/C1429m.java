package androidx.core.graphics;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.m */
/* loaded from: classes2.dex */
public class C1429m extends C1428l {
    @Override // androidx.core.graphics.C1428l
    /* renamed from: i */
    protected Typeface mo7282i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f6251g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f6257m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // androidx.core.graphics.C1428l
    /* renamed from: u */
    protected Method mo7286u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
