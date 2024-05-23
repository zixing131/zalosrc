package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.y */
/* loaded from: classes2.dex */
abstract class AbstractC2035y {

    /* renamed from: a */
    private static boolean f8632a = true;

    /* renamed from: b */
    private static Method f8633b;

    /* renamed from: c */
    private static boolean f8634c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m11036a(ViewGroup viewGroup, int i11) {
        int childDrawingOrder;
        if (Build.VERSION.SDK_INT >= 29) {
            childDrawingOrder = viewGroup.getChildDrawingOrder(i11);
            return childDrawingOrder;
        }
        if (!f8634c) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                f8633b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f8634c = true;
        }
        Method method = f8633b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i11))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC2034x m11037b(ViewGroup viewGroup) {
        return new C2033w(viewGroup);
    }

    /* renamed from: c */
    private static void m11038c(ViewGroup viewGroup, boolean z11) {
        if (f8632a) {
            try {
                viewGroup.suppressLayout(z11);
            } catch (NoSuchMethodError unused) {
                f8632a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m11039d(ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z11);
        } else {
            m11038c(viewGroup, z11);
        }
    }
}
