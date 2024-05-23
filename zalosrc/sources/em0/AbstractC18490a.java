package em0;

import android.graphics.Point;
import fn0.AbstractC19074t;

/* renamed from: em0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC18490a {
    /* renamed from: a */
    public static final float[] m97866a(Point[] pointArr) {
        int i11;
        AbstractC19074t.m100208f(pointArr, "<this>");
        int length = pointArr.length * 2;
        float[] fArr = new float[length];
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 % 2 == 0) {
                i11 = pointArr[i12 / 2].x;
            } else {
                i11 = pointArr[i12 / 2].y;
            }
            fArr[i12] = i11;
        }
        return fArr;
    }
}
