package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.h0 */
/* loaded from: classes2.dex */
abstract class AbstractC2016h0 {

    /* renamed from: a */
    private static Method f8583a;

    /* renamed from: b */
    private static boolean f8584b;

    /* renamed from: c */
    private static Field f8585c;

    /* renamed from: d */
    private static boolean f8586d;

    /* renamed from: b */
    private void m11013b() {
        if (!f8584b) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f8583a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f8584b = true;
        }
    }

    /* renamed from: a */
    public abstract void mo10983a(View view);

    /* renamed from: c */
    public abstract float mo10984c(View view);

    /* renamed from: d */
    public abstract void mo10985d(View view);

    /* renamed from: e */
    public abstract void mo10988e(View view, Matrix matrix);

    /* renamed from: f */
    public void mo10992f(View view, int i11, int i12, int i13, int i14) {
        m11013b();
        Method method = f8583a;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    /* renamed from: g */
    public abstract void mo10986g(View view, float f11);

    /* renamed from: h */
    public void mo11000h(View view, int i11) {
        if (!f8586d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f8585c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f8586d = true;
        }
        Field field = f8585c;
        if (field != null) {
            try {
                f8585c.setInt(view, i11 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: i */
    public abstract void mo10989i(View view, Matrix matrix);

    /* renamed from: j */
    public abstract void mo10990j(View view, Matrix matrix);
}
