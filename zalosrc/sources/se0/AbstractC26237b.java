package se0;

import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import p276jt.C21362q;

/* renamed from: se0.b */
/* loaded from: classes4.dex */
public abstract class AbstractC26237b {

    /* renamed from: a */
    public static final float[] f124626a = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: b */
    public static final float[] f124627b = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};

    /* renamed from: c */
    public static final float[] f124628c = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: d */
    public static final float[] f124629d = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: e */
    public static final float[] f124630e = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: f */
    public static final float[] f124631f = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    /* renamed from: g */
    public static final float[] f124632g = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    /* renamed from: h */
    public static final float[] f124633h = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public static float[] m134916a(int i11, Rect rect, Point point, int i12, int i13, int i14, float f11, float f12) {
        float min;
        Point point2 = point;
        int width = rect.width();
        int height = rect.height();
        if (point2 == null || point2.equals(0, 0)) {
            point2 = new Point(rect.centerX(), rect.centerY());
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, point2.x, point2.y, 0.0f);
        if (i14 != 0) {
            Matrix.rotateM(fArr, 0, i14, 0.0f, 0.0f, 1.0f);
        }
        if (i11 == 1) {
            if (i14 != 90 && i14 != 270) {
                min = Math.max(Math.abs(width / i12), Math.abs(height / i13));
            } else {
                min = Math.max(Math.abs(width / i13), Math.abs(height / i12));
            }
        } else if (i14 != 90 && i14 != 270) {
            min = Math.min(width / i12, height / i13);
        } else {
            min = Math.min(width / i13, height / i12);
        }
        Matrix.scaleM(fArr, 0, Math.round(i12 * min * f12), Math.round(i13 * min * f11), 1.0f);
        return fArr;
    }

    /* renamed from: b */
    public static FloatBuffer m134917b(int i11) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        return allocateDirect.asFloatBuffer();
    }

    /* renamed from: c */
    public static FloatBuffer m134918c(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: d */
    public static ShortBuffer m134919d(short[] sArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.position(0);
        return asShortBuffer;
    }

    /* renamed from: e */
    private static float m134920e(float f11) {
        return f11 == 0.0f ? 1.0f : 0.0f;
    }

    /* renamed from: f */
    public static C21362q m134921f() {
        return new C21362q(0.0d, 0.0d, 1.0d, 1.0d);
    }

    /* renamed from: g */
    public static float[] m134922g(int i11, boolean z11, boolean z12) {
        float[] fArr;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    fArr = f124630e;
                } else {
                    fArr = f124633h;
                }
            } else {
                fArr = f124632g;
            }
        } else {
            fArr = f124631f;
        }
        if (z11) {
            fArr = new float[]{m134920e(fArr[0]), fArr[1], m134920e(fArr[2]), fArr[3], m134920e(fArr[4]), fArr[5], m134920e(fArr[6]), fArr[7]};
        }
        if (z12) {
            return new float[]{fArr[0], m134920e(fArr[1]), fArr[2], m134920e(fArr[3]), fArr[4], m134920e(fArr[5]), fArr[6], m134920e(fArr[7])};
        }
        return fArr;
    }

    /* renamed from: h */
    public static float[] m134923h(C21362q c21362q, int i11) {
        if (i11 != 0) {
            if (i11 != 90) {
                if (i11 != 180) {
                    if (i11 != 270) {
                        double d11 = c21362q.f104140a;
                        double d12 = c21362q.f104143d;
                        double d13 = c21362q.f104142c;
                        double d14 = c21362q.f104141b;
                        return new float[]{(float) d11, (float) d12, (float) d13, (float) d12, (float) d11, (float) d14, (float) d13, (float) d14};
                    }
                    float f11 = (float) c21362q.f104141b;
                    float f12 = 1.0f - ((float) c21362q.f104142c);
                    float f13 = (float) c21362q.f104143d;
                    float f14 = 1.0f - ((float) c21362q.f104140a);
                    return new float[]{f13, f14, f13, f12, f11, f14, f11, f12};
                }
                float f15 = 1.0f - ((float) c21362q.f104142c);
                float f16 = 1.0f - ((float) c21362q.f104143d);
                float f17 = 1.0f - ((float) c21362q.f104140a);
                float f18 = 1.0f - ((float) c21362q.f104141b);
                return new float[]{f17, f16, f15, f16, f17, f18, f15, f18};
            }
            float f19 = 1.0f - ((float) c21362q.f104143d);
            float f21 = (float) c21362q.f104140a;
            float f22 = 1.0f - ((float) c21362q.f104141b);
            float f23 = (float) c21362q.f104142c;
            return new float[]{f19, f21, f19, f23, f22, f21, f22, f23};
        }
        float f24 = (float) c21362q.f104140a;
        float f25 = (float) c21362q.f104141b;
        float f26 = (float) c21362q.f104142c;
        float f27 = (float) c21362q.f104143d;
        return new float[]{f24, f27, f26, f27, f24, f25, f26, f25};
    }

    /* renamed from: i */
    public static boolean m134924i(C21362q c21362q) {
        if (c21362q.f104140a == 0.0d && c21362q.f104141b == 0.0d && c21362q.f104142c == 1.0d && c21362q.f104143d == 1.0d) {
            return true;
        }
        return false;
    }
}
