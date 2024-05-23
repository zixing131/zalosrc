package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.b */
/* loaded from: classes2.dex */
abstract class AbstractC2003b {

    /* renamed from: a */
    private static Method f8540a;

    /* renamed from: b */
    private static Method f8541b;

    /* renamed from: c */
    private static boolean f8542c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10966a(Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            if (z11) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (i11 != 28) {
            if (!f8542c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f8540a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f8541b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8542c = true;
            }
            if (z11) {
                try {
                    Method method2 = f8540a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException(e11.getCause());
                }
            }
            if (!z11 && (method = f8541b) != null) {
                method.invoke(canvas, new Object[0]);
                return;
            }
            return;
        }
        throw new IllegalStateException("This method doesn't work on Pie!");
    }
}
