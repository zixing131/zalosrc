package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.AbstractC1404k;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g */
    private static final float f8368g = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    private float f8369a;

    /* renamed from: b */
    private float f8370b;

    /* renamed from: c */
    private float f8371c;

    /* renamed from: d */
    private float f8372d;

    /* renamed from: e */
    private float f8373e;

    /* renamed from: f */
    private float f8374f;

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8369a = 0.0f;
        this.f8370b = 0.0f;
        this.f8371c = 70.0f;
        this.f8372d = 0.0f;
        this.f8373e = 0.0f;
        this.f8374f = f8368g;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8600j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m10813d(AbstractC1404k.m7110f(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        m10812c(AbstractC1404k.m7110f(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        m10811b(AbstractC1404k.m7110f(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    private static float m10809e(float f11) {
        if (f11 >= 0.0f && f11 <= 90.0f) {
            return (float) Math.tan(Math.toRadians(f11 / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo10810a(float f11, float f12, float f13, float f14) {
        boolean z11;
        float f15;
        float f16;
        float f17;
        Path path = new Path();
        path.moveTo(f11, f12);
        float f18 = f13 - f11;
        float f19 = f14 - f12;
        float f21 = (f18 * f18) + (f19 * f19);
        float f22 = (f11 + f13) / 2.0f;
        float f23 = (f12 + f14) / 2.0f;
        float f24 = 0.25f * f21;
        if (f12 > f14) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (Math.abs(f18) < Math.abs(f19)) {
            float abs = Math.abs(f21 / (f19 * 2.0f));
            if (z11) {
                f16 = abs + f14;
                f15 = f13;
            } else {
                f16 = abs + f12;
                f15 = f11;
            }
            f17 = this.f8373e;
        } else {
            float f25 = f21 / (f18 * 2.0f);
            if (z11) {
                f16 = f12;
                f15 = f25 + f11;
            } else {
                f15 = f13 - f25;
                f16 = f14;
            }
            f17 = this.f8372d;
        }
        float f26 = f24 * f17 * f17;
        float f27 = f22 - f15;
        float f28 = f23 - f16;
        float f29 = (f27 * f27) + (f28 * f28);
        float f31 = this.f8374f;
        float f32 = f24 * f31 * f31;
        if (f29 >= f26) {
            if (f29 > f32) {
                f26 = f32;
            } else {
                f26 = 0.0f;
            }
        }
        if (f26 != 0.0f) {
            float sqrt = (float) Math.sqrt(f26 / f29);
            f15 = ((f15 - f22) * sqrt) + f22;
            f16 = f23 + (sqrt * (f16 - f23));
        }
        path.cubicTo((f11 + f15) / 2.0f, (f12 + f16) / 2.0f, (f15 + f13) / 2.0f, (f16 + f14) / 2.0f, f13, f14);
        return path;
    }

    /* renamed from: b */
    public void m10811b(float f11) {
        this.f8371c = f11;
        this.f8374f = m10809e(f11);
    }

    /* renamed from: c */
    public void m10812c(float f11) {
        this.f8369a = f11;
        this.f8372d = m10809e(f11);
    }

    /* renamed from: d */
    public void m10813d(float f11) {
        this.f8370b = f11;
        this.f8373e = m10809e(f11);
    }
}
