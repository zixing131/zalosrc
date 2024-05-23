package me0;

import android.graphics.PointF;
import com.zing.zalo.imgdecor.model.model.PaintData;

/* renamed from: me0.m2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23140m2 {
    /* renamed from: a */
    public static double m118804a(PointF pointF, PointF pointF2) {
        double degrees = Math.toDegrees(Math.atan2(pointF.y - pointF2.y, pointF2.x - pointF.x));
        if (degrees < 0.0d) {
            return degrees + 360.0d;
        }
        return degrees;
    }

    /* renamed from: b */
    public static boolean m118805b(PointF[] pointFArr) {
        int i11 = 0;
        float f11 = 0.0f;
        while (i11 < 4) {
            PointF pointF = pointFArr[i11];
            float f12 = pointF.x;
            float f13 = pointF.y;
            int i12 = i11 + 1;
            PointF pointF2 = pointFArr[i12 % 4];
            float f14 = pointF2.x - f12;
            float f15 = pointF2.y - f13;
            PointF pointF3 = pointFArr[(i11 + 2) % 4];
            float f16 = (((pointF3.x * f15) - (pointF3.y * f14)) + (f14 * f13)) - (f15 * f12);
            if (i11 == 0) {
                f11 = f16;
            } else if ((f16 > 0.0f && f11 < 0.0f) || (f16 < 0.0f && f11 > 0.0f)) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    /* renamed from: c */
    public static double m118806c(PaintData.Position position, PaintData.Position position2) {
        return Math.sqrt(Math.pow(position2.f47739p - position.f47739p, 2.0d) + Math.pow(position2.f47740q - position.f47740q, 2.0d));
    }

    /* renamed from: d */
    public static float m118807d(float f11, float f12, float f13, float f14) {
        return (float) Math.sqrt(Math.pow(f13 - f11, 2.0d) + Math.pow(f14 - f12, 2.0d));
    }

    /* renamed from: e */
    public static boolean m118808e(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        boolean z11;
        boolean z12;
        float m118812i = m118812i(pointF, pointF2, pointF3);
        float m118812i2 = m118812i(pointF, pointF3, pointF4);
        float m118812i3 = m118812i(pointF, pointF4, pointF2);
        if (m118812i >= 0.0f && m118812i2 >= 0.0f && m118812i3 >= 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (m118812i <= 0.0f && m118812i2 <= 0.0f && m118812i3 <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 || !z12) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m118809f(PointF[] pointFArr) {
        PointF pointF = pointFArr[0];
        float f11 = pointF.x;
        PointF pointF2 = pointFArr[2];
        float f12 = pointF2.x;
        if (f11 > f12 && pointF.y > pointF2.y) {
            return true;
        }
        PointF pointF3 = pointFArr[1];
        float f13 = pointF3.x;
        PointF pointF4 = pointFArr[3];
        float f14 = pointF4.x;
        if ((f13 >= f14 || pointF3.y <= pointF4.y) && pointF.y <= pointF4.y && pointF3.y <= pointF2.y && f11 <= f13 && f14 <= f12) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m118810g(PointF[] pointFArr) {
        boolean z11 = false;
        while (m118809f(pointFArr)) {
            PointF pointF = pointFArr[0];
            float f11 = pointF.x;
            PointF pointF2 = pointFArr[2];
            float f12 = pointF2.x;
            if (f11 > f12 && pointF.y > pointF2.y) {
                m118811h(pointFArr, 0, 2);
            } else {
                PointF pointF3 = pointFArr[1];
                float f13 = pointF3.x;
                PointF pointF4 = pointFArr[3];
                float f14 = pointF4.x;
                if (f13 < f14 && pointF3.y > pointF4.y) {
                    m118811h(pointFArr, 1, 3);
                } else if (pointF.y > pointF4.y) {
                    m118811h(pointFArr, 0, 3);
                } else if (pointF3.y > pointF2.y) {
                    m118811h(pointFArr, 1, 2);
                } else if (f11 > f13) {
                    m118811h(pointFArr, 0, 1);
                } else if (f14 > f12) {
                    m118811h(pointFArr, 3, 2);
                }
            }
            z11 = true;
        }
        return z11;
    }

    /* renamed from: h */
    public static void m118811h(PointF[] pointFArr, int i11, int i12) {
        PointF pointF = pointFArr[i11];
        float f11 = pointF.x;
        float f12 = pointF.y;
        PointF pointF2 = pointFArr[i12];
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = f11;
        pointF2.y = f12;
    }

    /* renamed from: i */
    private static float m118812i(PointF pointF, PointF pointF2, PointF pointF3) {
        float f11 = pointF.x;
        float f12 = pointF3.x;
        float f13 = pointF2.y;
        float f14 = pointF3.y;
        return ((f11 - f12) * (f13 - f14)) - ((pointF2.x - f12) * (pointF.y - f14));
    }
}
