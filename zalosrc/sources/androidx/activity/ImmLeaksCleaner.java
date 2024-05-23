package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class ImmLeaksCleaner implements InterfaceC1795t {

    /* renamed from: q */
    private static int f3576q;

    /* renamed from: r */
    private static Field f3577r;

    /* renamed from: s */
    private static Field f3578s;

    /* renamed from: t */
    private static Field f3579t;

    /* renamed from: p */
    private Activity f3580p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f3580p = activity;
    }

    /* renamed from: b */
    private static void m4655b() {
        try {
            f3576q = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f3578s = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f3579t = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f3577r = declaredField3;
            declaredField3.setAccessible(true);
            f3576q = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        if (aVar != AbstractC1785o.a.ON_DESTROY) {
            return;
        }
        if (f3576q == 0) {
            m4655b();
        }
        if (f3576q == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f3580p.getSystemService("input_method");
            try {
                Object obj = f3577r.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f3578s.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f3579t.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
