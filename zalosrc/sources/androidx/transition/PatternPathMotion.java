package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.graphics.AbstractC1424h;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes2.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: a */
    private Path f8457a;

    /* renamed from: b */
    private final Path f8458b = new Path();

    /* renamed from: c */
    private final Matrix f8459c = new Matrix();

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2026p.f8601k);
        try {
            String m7113i = AbstractC1404k.m7113i(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m7113i != null) {
                m10878c(AbstractC1424h.m7244e(m7113i));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private static float m10877b(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: a */
    public Path mo10810a(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float m10877b = m10877b(f15, f16);
        double atan2 = Math.atan2(f16, f15);
        this.f8459c.setScale(m10877b, m10877b);
        this.f8459c.postRotate((float) Math.toDegrees(atan2));
        this.f8459c.postTranslate(f11, f12);
        Path path = new Path();
        this.f8458b.transform(this.f8459c, path);
        return path;
    }

    /* renamed from: c */
    public void m10878c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f13 = fArr[0];
        float f14 = fArr[1];
        if (f13 == f11 && f14 == f12) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f8459c.setTranslate(-f13, -f14);
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float m10877b = 1.0f / m10877b(f15, f16);
        this.f8459c.postScale(m10877b, m10877b);
        this.f8459c.postRotate((float) Math.toDegrees(-Math.atan2(f16, f15)));
        path.transform(this.f8459c, this.f8458b);
        this.f8457a = path;
    }
}
