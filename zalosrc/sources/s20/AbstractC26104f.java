package s20;

import android.view.MotionEvent;
import fn0.AbstractC19074t;

/* renamed from: s20.f */
/* loaded from: classes5.dex */
public abstract class AbstractC26104f {
    /* renamed from: a */
    public static final MotionEvent m134330a(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "<this>");
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        AbstractC19074t.m100207e(obtain, "obtain(...)");
        return obtain;
    }

    /* renamed from: b */
    public static final boolean m134331b(MotionEvent motionEvent, MotionEvent motionEvent2, int i11, int i12) {
        float rawX;
        AbstractC19074t.m100208f(motionEvent, "<this>");
        AbstractC19074t.m100208f(motionEvent2, "that");
        float f11 = 0.0f;
        if (i12 == -1) {
            rawX = 0.0f;
        } else {
            rawX = motionEvent.getRawX() - motionEvent2.getRawX();
        }
        if (i12 != 1) {
            f11 = motionEvent.getRawY() - motionEvent2.getRawY();
        }
        if ((rawX * rawX) + (f11 * f11) >= i11 * i11) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m134332c(MotionEvent motionEvent, MotionEvent motionEvent2, int i11) {
        AbstractC19074t.m100208f(motionEvent, "<this>");
        AbstractC19074t.m100208f(motionEvent2, "that");
        return m134331b(motionEvent, motionEvent2, i11, 1);
    }

    /* renamed from: d */
    public static final boolean m134333d(MotionEvent motionEvent, MotionEvent motionEvent2, int i11) {
        AbstractC19074t.m100208f(motionEvent, "<this>");
        AbstractC19074t.m100208f(motionEvent2, "that");
        return m134331b(motionEvent, motionEvent2, i11, -1);
    }
}
