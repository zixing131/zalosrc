package sk0;

import android.view.animation.Interpolator;

/* renamed from: sk0.e */
/* loaded from: classes7.dex */
public final class InterpolatorC26311e implements Interpolator {

    /* renamed from: a */
    private float f124962a;

    /* renamed from: b */
    private float f124963b;

    public InterpolatorC26311e(int i11) {
        this.f124962a = 1.0f / i11;
        this.f124963b = 1.0f / (i11 - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return ((int) Math.floor(f11 / this.f124962a)) * this.f124963b;
    }
}
