package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.g */
/* loaded from: classes2.dex */
class C2013g implements InterfaceC2009e {

    /* renamed from: q */
    private static Class f8569q;

    /* renamed from: r */
    private static boolean f8570r;

    /* renamed from: s */
    private static Method f8571s;

    /* renamed from: t */
    private static boolean f8572t;

    /* renamed from: u */
    private static Method f8573u;

    /* renamed from: v */
    private static boolean f8574v;

    /* renamed from: p */
    private final View f8575p;

    private C2013g(View view) {
        this.f8575p = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC2009e m11001b(View view, ViewGroup viewGroup, Matrix matrix) {
        m11002c();
        Method method = f8571s;
        if (method != null) {
            try {
                return new C2013g((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m11002c() {
        if (!f8572t) {
            try {
                m11003d();
                Method declaredMethod = f8569q.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
                f8571s = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f8572t = true;
        }
    }

    /* renamed from: d */
    private static void m11003d() {
        if (!f8570r) {
            try {
                f8569q = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f8570r = true;
        }
    }

    /* renamed from: e */
    private static void m11004e() {
        if (!f8574v) {
            try {
                m11003d();
                Method declaredMethod = f8569q.getDeclaredMethod("removeGhost", View.class);
                f8573u = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f8574v = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m11005f(View view) {
        m11004e();
        Method method = f8573u;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    @Override // androidx.transition.InterfaceC2009e
    /* renamed from: a */
    public void mo10991a(ViewGroup viewGroup, View view) {
    }

    @Override // androidx.transition.InterfaceC2009e
    public void setVisibility(int i11) {
        this.f8575p.setVisibility(i11);
    }
}
