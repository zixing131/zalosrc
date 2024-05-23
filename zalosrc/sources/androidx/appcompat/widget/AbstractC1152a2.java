package androidx.appcompat.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.a2 */
/* loaded from: classes2.dex */
public abstract class AbstractC1152a2 {

    /* renamed from: a */
    private static Method f4584a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f4584a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f4584a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static void m5458a(View view, Rect rect, Rect rect2) {
        Method method = f4584a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m5459b(View view) {
        if (AbstractC1579n0.m7812G(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m5460c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
