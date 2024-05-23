package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1638j {

    /* renamed from: a */
    private static Method f6671a;

    /* renamed from: b */
    private static boolean f6672b;

    /* renamed from: c */
    private static Field f6673c;

    /* renamed from: d */
    private static boolean f6674d;

    /* renamed from: androidx.core.widget.j$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static void m8404a(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
            popupWindow.showAsDropDown(view, i11, i12, i13);
        }
    }

    /* renamed from: androidx.core.widget.j$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static boolean m8405a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        static int m8406b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        static void m8407c(PopupWindow popupWindow, boolean z11) {
            popupWindow.setOverlapAnchor(z11);
        }

        /* renamed from: d */
        static void m8408d(PopupWindow popupWindow, int i11) {
            popupWindow.setWindowLayoutType(i11);
        }
    }

    /* renamed from: a */
    public static void m8401a(PopupWindow popupWindow, boolean z11) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m8407c(popupWindow, z11);
            return;
        }
        if (!f6674d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f6673c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f6674d = true;
        }
        Field field = f6673c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z11));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: b */
    public static void m8402b(PopupWindow popupWindow, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.m8408d(popupWindow, i11);
            return;
        }
        if (!f6672b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f6671a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f6672b = true;
        }
        Method method = f6671a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i11));
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: c */
    public static void m8403c(PopupWindow popupWindow, View view, int i11, int i12, int i13) {
        a.m8404a(popupWindow, view, i11, i12, i13);
    }
}
