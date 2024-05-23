package s20;

import android.view.VelocityTracker;
import fn0.AbstractC19074t;
import pm0.C24860q;

/* renamed from: s20.j */
/* loaded from: classes5.dex */
public abstract class AbstractC26108j {
    /* renamed from: a */
    private static final C24860q m134356a(VelocityTracker velocityTracker, float f11, int i11, int i12) {
        if ((f11 <= (-i11) && f11 >= (-i12)) || (f11 >= i11 && f11 <= i12)) {
            return new C24860q(Boolean.TRUE, Float.valueOf(f11));
        }
        return new C24860q(Boolean.FALSE, Float.valueOf(f11));
    }

    /* renamed from: b */
    public static final C24860q m134357b(VelocityTracker velocityTracker, int i11, int i12) {
        AbstractC19074t.m100208f(velocityTracker, "<this>");
        return m134356a(velocityTracker, velocityTracker.getXVelocity(), i11, i12);
    }

    /* renamed from: c */
    public static final C24860q m134358c(VelocityTracker velocityTracker, int i11, int i12) {
        AbstractC19074t.m100208f(velocityTracker, "<this>");
        return m134356a(velocityTracker, velocityTracker.getYVelocity(), i11, i12);
    }
}
