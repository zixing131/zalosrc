package sk0;

import android.view.animation.Interpolator;

/* renamed from: sk0.d */
/* loaded from: classes7.dex */
public final class InterpolatorC26310d implements Interpolator {

    /* renamed from: a */
    private float f124961a;

    public InterpolatorC26310d(int i11) {
        this.f124961a = 1.0f / i11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return ((int) (f11 / r0)) * this.f124961a;
    }
}
