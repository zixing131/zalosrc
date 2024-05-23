package go0;

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: go0.b */
/* loaded from: classes7.dex */
public class C19526b {

    /* renamed from: a */
    private float f96943a;

    /* renamed from: b */
    private float f96944b;

    /* renamed from: c */
    private float f96945c;

    /* renamed from: d */
    private float f96946d;

    /* renamed from: e */
    private float f96947e;

    /* renamed from: f */
    private float f96948f;

    /* renamed from: g */
    private float f96949g;

    /* renamed from: h */
    private float f96950h;

    /* renamed from: i */
    private double f96951i;

    /* renamed from: j */
    private int f96952j;

    /* renamed from: k */
    private int f96953k;

    /* renamed from: l */
    private float f96954l;

    /* renamed from: m */
    private float f96955m;

    /* renamed from: n */
    private float f96956n;

    /* renamed from: o */
    private int f96957o;

    /* renamed from: p */
    private boolean f96958p;

    /* renamed from: q */
    private FloatBuffer f96959q;

    /* renamed from: r */
    private ShortBuffer f96960r;

    /* renamed from: s */
    private short[] f96961s;

    /* renamed from: t */
    private RectF f96962t;

    /* renamed from: u */
    private int[] f96963u;

    /* renamed from: v */
    private float f96964v;

    /* renamed from: w */
    public boolean f96965w;

    public C19526b(int i11, int i12, int[] iArr) {
        this(i11, i12, 1.0f, 0.0f, iArr);
    }

    /* renamed from: a */
    private float[] m102069a() {
        RectF rectF = this.f96962t;
        float f11 = rectF.left;
        float f12 = this.f96947e;
        float f13 = f11 * f12;
        float f14 = rectF.right * f12;
        float f15 = rectF.bottom * f12;
        float f16 = rectF.top * f12;
        PointF pointF = new PointF(f13, f16);
        PointF pointF2 = new PointF(f13, f15);
        PointF pointF3 = new PointF(f14, f15);
        PointF pointF4 = new PointF(f14, f16);
        double radians = Math.toRadians(this.f96956n);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f17 = f13 * cos;
        float f18 = f16 * sin;
        pointF.x = f17 - f18;
        float f19 = f13 * sin;
        float f21 = f16 * cos;
        pointF.y = f19 + f21;
        float f22 = f15 * sin;
        pointF2.x = f17 - f22;
        float f23 = f15 * cos;
        pointF2.y = f19 + f23;
        float f24 = cos * f14;
        pointF3.x = f24 - f22;
        float f25 = f14 * sin;
        pointF3.y = f23 + f25;
        pointF4.x = f24 - f18;
        pointF4.y = f25 + f21;
        float f26 = pointF.x;
        float f27 = this.f96945c;
        pointF.x = f26 + f27;
        float f28 = pointF.y;
        float f29 = this.f96946d;
        pointF.y = f28 + f29;
        pointF2.x += f27;
        pointF2.y += f29;
        pointF3.x += f27;
        pointF3.y += f29;
        float f31 = pointF4.x + f27;
        pointF4.x = f31;
        float f32 = pointF4.y + f29;
        pointF4.y = f32;
        return new float[]{pointF.x, pointF.y, 0.0f, pointF2.x, pointF2.y, 0.0f, pointF3.x, pointF3.y, 0.0f, f31, f32, 0.0f};
    }

    /* renamed from: b */
    private void m102070b() {
        if (this.f96963u != null) {
            this.f96958p = true;
            short[] sArr = {0, 1, 2, 0, 2, 3};
            this.f96961s = sArr;
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
            this.f96960r = asShortBuffer;
            asShortBuffer.put(this.f96961s).position(0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(m102069a().length * 4);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.f96959q = allocateDirect.asFloatBuffer();
        }
    }

    /* renamed from: f */
    private FloatBuffer m102071f() {
        this.f96959q.clear();
        this.f96959q.put(m102069a());
        this.f96959q.position(0);
        return this.f96959q;
    }

    /* renamed from: c */
    public void m102072c(float f11) {
        try {
            if (this.f96965w) {
                if (!this.f96958p) {
                    m102070b();
                }
                if (this.f96958p) {
                    this.f96946d += this.f96944b + f11;
                    double d11 = this.f96951i + this.f96943a;
                    this.f96951i = d11;
                    this.f96945c = (float) (this.f96952j + (this.f96949g * Math.cos(d11)));
                    float f12 = this.f96946d;
                    float f13 = this.f96954l;
                    if (f12 < f13) {
                        int i11 = this.f96953k;
                        this.f96947e = ((f12 - i11) / (f13 - i11)) * this.f96948f;
                        this.f96964v = ((f12 - i11) / (f13 - i11)) * 0.5f;
                    } else {
                        float f14 = this.f96955m;
                        if (f12 > f14) {
                            float f15 = this.f96950h;
                            this.f96964v = ((f15 - f12) / (f15 - f14)) * 0.5f;
                        } else {
                            this.f96947e = this.f96948f;
                            this.f96964v = 0.5f;
                        }
                    }
                    if (f12 > this.f96950h) {
                        this.f96965w = false;
                    }
                    GLES20.glVertexAttribPointer(C19527c.f96968e, 3, 5126, false, 0, (Buffer) m102071f());
                    GLES20.glUniform1f(C19527c.f96971h, this.f96964v);
                    GLES20.glBindTexture(3553, this.f96963u[this.f96957o]);
                    GLES20.glDrawElements(4, this.f96961s.length, 5123, this.f96960r);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m102073d(int i11, int i12, int i13, int i14) {
        double d11;
        this.f96952j = i11;
        this.f96953k = i12;
        this.f96964v = 0.0f;
        this.f96965w = true;
        this.f96949g = i13 / 30.0f;
        this.f96950h = i14 / 2.0f;
        if (Math.random() > 0.5d) {
            d11 = 1.5707963267948966d;
        } else {
            d11 = -1.5707963267948966d;
        }
        this.f96951i = d11;
        this.f96943a = (float) (0.015707963267948967d - ((Math.random() * 3.141592653589793d) / 150.0d));
        this.f96944b = (float) ((Math.random() * i14) / 2000.0d);
        float f11 = this.f96950h;
        int i15 = this.f96953k;
        this.f96954l = (f11 / 10.0f) + i15;
        this.f96955m = ((f11 - i15) / 2.0f) + i15;
        this.f96948f = ((float) (i13 / ((Math.random() * 2.5d) + 9.0d))) / this.f96962t.width();
        this.f96957o = ((int) (Math.random() * 100.0d)) % this.f96963u.length;
        this.f96945c = this.f96952j;
        this.f96946d = this.f96953k;
    }

    /* renamed from: e */
    public void m102074e(int i11, int i12) {
        float f11 = i11 / 2.0f;
        float f12 = i12 / 2.0f;
        this.f96962t = new RectF(-f11, f12, f11, -f12);
    }

    public C19526b(int i11, int i12, float f11, float f12, int[] iArr) {
        this.f96958p = false;
        this.f96964v = 0.0f;
        this.f96965w = false;
        this.f96952j = i11;
        this.f96953k = i12;
        this.f96947e = f11;
        this.f96956n = f12;
        this.f96963u = iArr;
    }
}
