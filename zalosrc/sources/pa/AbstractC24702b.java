package pa;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: pa.b */
/* loaded from: classes3.dex */
public abstract class AbstractC24702b {
    /* renamed from: a */
    public static int m128272a(int i11) {
        if (i11 != 0) {
            if (i11 != 90) {
                if (i11 != 180) {
                    if (i11 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Invalid rotation: " + i11);
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public static void m128273b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            Point point = pointArr[i11];
            int i12 = i11 + i11;
            fArr[i12] = point.x;
            fArr[i12 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i13 = 0; i13 < pointArr.length; i13++) {
            int i14 = i13 + i13;
            pointArr[i13].set((int) fArr[i14], (int) fArr[i14 + 1]);
        }
    }

    /* renamed from: c */
    public static void m128274c(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
