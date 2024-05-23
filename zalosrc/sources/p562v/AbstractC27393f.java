package p562v;

import android.view.View;

/* renamed from: v.f */
/* loaded from: classes2.dex */
public abstract class AbstractC27393f {
    /* renamed from: a */
    public static float m140348a(View view) {
        return view.getZ();
    }

    /* renamed from: b */
    public static View m140349b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m140350c(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            view = m140349b(view);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m140351d(View view) {
        return m140352e(view) == null;
    }

    /* renamed from: e */
    public static String m140352e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }
}
