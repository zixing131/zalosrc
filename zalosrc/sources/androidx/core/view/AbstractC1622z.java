package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.z */
/* loaded from: classes2.dex */
public abstract class AbstractC1622z {
    /* renamed from: a */
    public static int m8273a(MotionEvent motionEvent, int i11) {
        return motionEvent.findPointerIndex(i11);
    }

    /* renamed from: b */
    public static int m8274b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    /* renamed from: c */
    public static int m8275c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: d */
    public static int m8276d(MotionEvent motionEvent, int i11) {
        return motionEvent.getPointerId(i11);
    }

    /* renamed from: e */
    public static float m8277e(MotionEvent motionEvent, int i11) {
        return motionEvent.getX(i11);
    }

    /* renamed from: f */
    public static float m8278f(MotionEvent motionEvent, int i11) {
        return motionEvent.getY(i11);
    }

    /* renamed from: g */
    public static boolean m8279g(MotionEvent motionEvent, int i11) {
        if ((motionEvent.getSource() & i11) == i11) {
            return true;
        }
        return false;
    }
}
