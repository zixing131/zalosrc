package sk0;

import android.view.animation.Interpolator;

/* renamed from: sk0.c */
/* loaded from: classes7.dex */
public final class InterpolatorC26309c implements Interpolator {

    /* renamed from: a */
    private float f124959a;

    /* renamed from: b */
    private float f124960b;

    public InterpolatorC26309c(int i11) {
        this.f124959a = 1.0f / i11;
        this.f124960b = 1.0f / (i11 + 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return (((int) Math.floor(f11 / this.f124959a)) + 1) * this.f124960b;
    }
}
