package sk0;

import android.view.animation.Interpolator;

/* renamed from: sk0.f */
/* loaded from: classes7.dex */
public final class InterpolatorC26312f implements Interpolator {

    /* renamed from: a */
    private float f124964a;

    public InterpolatorC26312f(int i11) {
        this.f124964a = 1.0f / i11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return (((int) (f11 / r0)) + 1) * this.f124964a;
    }
}
