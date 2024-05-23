package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.u */
/* loaded from: classes2.dex */
public abstract class AbstractC1606u {

    /* renamed from: a */
    private static boolean f6582a = false;

    /* renamed from: b */
    private static Method f6583b = null;

    /* renamed from: c */
    private static boolean f6584c = false;

    /* renamed from: d */
    private static Field f6585d;

    /* renamed from: androidx.core.view.u$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: w */
        boolean mo4894w(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m8203a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f6582a) {
            try {
                f6583b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f6582a = true;
        }
        Method method = f6583b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8204b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m8203a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC1579n0.m7882k(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    private static boolean m8205c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener m8208f = m8208f(dialog);
        if (m8208f != null && m8208f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (AbstractC1579n0.m7882k(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m8206d(View view, KeyEvent keyEvent) {
        return AbstractC1579n0.m7885l(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m8207e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo4894w(keyEvent);
        }
        if (callback instanceof Activity) {
            return m8204b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m8205c((Dialog) callback, keyEvent);
        }
        if ((view == null || !AbstractC1579n0.m7882k(view, keyEvent)) && !aVar.mo4894w(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m8208f(Dialog dialog) {
        if (!f6584c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f6585d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f6584c = true;
        }
        Field field = f6585d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
