package p166fq;

import android.view.animation.Interpolator;

/* renamed from: fq.b */
/* loaded from: classes4.dex */
public final class InterpolatorC19105b implements Interpolator {

    /* renamed from: a */
    private final double f95099a = 2.0943951023931953d;

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 != 0.0f && f11 != 1.0f) {
            return (float) ((Math.pow(2.0d, f11 * (-10.0d)) * Math.sin(((f11 * 10) - 0.75d) * this.f95099a)) + 1);
        }
        return f11;
    }
}
