package go0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* renamed from: go0.a */
/* loaded from: classes7.dex */
public class C19525a {

    /* renamed from: b */
    private int f96921b;

    /* renamed from: c */
    private int f96922c;

    /* renamed from: d */
    private int[] f96923d;

    /* renamed from: e */
    private C19527c f96924e;

    /* renamed from: l */
    private Timer f96931l;

    /* renamed from: u */
    private FloatBuffer f96940u;

    /* renamed from: a */
    private final int[] f96920a = {-4391009, -9830462, -16721665, -9337345, -3693, -18324, -32640};

    /* renamed from: f */
    private float[] f96925f = new float[16];

    /* renamed from: g */
    private float[] f96926g = new float[16];

    /* renamed from: h */
    private float[] f96927h = new float[16];

    /* renamed from: i */
    private int f96928i = 0;

    /* renamed from: j */
    private int f96929j = 0;

    /* renamed from: k */
    private int f96930k = 0;

    /* renamed from: m */
    private boolean f96932m = false;

    /* renamed from: n */
    private boolean f96933n = false;

    /* renamed from: o */
    private int f96934o = 0;

    /* renamed from: p */
    private float f96935p = 1.5f;

    /* renamed from: q */
    private float f96936q = 5.0f;

    /* renamed from: r */
    private int f96937r = 0;

    /* renamed from: s */
    private int f96938s = 0;

    /* renamed from: t */
    private float f96939t = 1.5f;

    /* renamed from: v */
    private Object f96941v = new Object();

    /* renamed from: w */
    private List f96942w = new ArrayList();

    /* renamed from: a */
    private void m102058a() {
        float min = Math.min(this.f96934o / this.f96936q, this.f96939t * 1.2f);
        this.f96939t = min;
        float f11 = this.f96935p;
        if (min < f11) {
            this.f96939t = f11;
        }
    }

    /* renamed from: c */
    private Path m102059c(float f11, int i11, float f12) {
        float f13 = f11 / 2.0f;
        float radians = (float) Math.toRadians(360.0f / i11);
        Path path = new Path();
        for (double d11 = 0.0d; d11 < 6.2831855f; d11 += radians) {
            float sin = (float) (Math.sin(d11) * 17.0d * Math.sin(d11) * Math.sin(d11));
            float cos = (float) (((((Math.cos(d11) * 13.5d) - (Math.cos(2.0d * d11) * 4.0d)) - (Math.cos(3.0d * d11) * 2.8d)) - (Math.cos(4.0d * d11) * 0.20000000298023224d)) - (Math.cos(5.0d * d11) * 0.20000000298023224d));
            if (d11 == 0.0d) {
                path.moveTo((sin * f12) + f13, f13 - (cos * f12));
            } else {
                path.lineTo((sin * f12) + f13, f13 - (cos * f12));
            }
        }
        path.close();
        return path;
    }

    /* renamed from: d */
    private int m102060d(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glBindTexture(3553, 0);
            return iArr[0];
        }
        return -1;
    }

    /* renamed from: e */
    private void m102061e() {
        float f11 = this.f96939t * 0.992f;
        this.f96939t = f11;
        float f12 = this.f96935p;
        if (f11 < f12) {
            this.f96939t = f12;
        }
    }

    /* renamed from: g */
    private void m102062g() {
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(10.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            Path m102059c = m102059c(128.0f, 180, 3.2f);
            this.f96923d = new int[this.f96920a.length];
            Bitmap createBitmap = Bitmap.createBitmap(128, 128, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            for (int i11 = 0; i11 < this.f96920a.length; i11++) {
                paint.setColor(-1);
                paint.setStyle(Paint.Style.STROKE);
                canvas.drawPath(m102059c, paint);
                paint.setColor(this.f96920a[i11]);
                paint.setStyle(Paint.Style.FILL);
                canvas.drawPath(m102059c, paint);
                this.f96923d[i11] = m102060d(createBitmap);
            }
            createBitmap.recycle();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m102063b() {
        try {
            synchronized (this.f96941v) {
                try {
                    if (!this.f96933n) {
                        this.f96928i++;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m102064f() {
        try {
            synchronized (this.f96941v) {
                try {
                    this.f96933n = true;
                    Timer timer = this.f96931l;
                    if (timer != null) {
                        timer.cancel();
                        this.f96932m = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public void m102065h() {
        try {
            if (this.f96933n) {
                return;
            }
            int i11 = this.f96938s;
            if (i11 > 0) {
                this.f96938s = i11 - 1;
                return;
            }
            GLES20.glBlendFunc(770, 771);
            GLES20.glEnable(3042);
            GLES20.glUseProgram(C19527c.f96966c);
            GLES20.glEnableVertexAttribArray(C19527c.f96968e);
            GLES20.glEnableVertexAttribArray(C19527c.f96969f);
            GLES20.glVertexAttribPointer(C19527c.f96969f, 2, 5126, false, 0, (Buffer) this.f96940u);
            GLES20.glUniformMatrix4fv(C19527c.f96967d, 1, false, this.f96927h, 0);
            GLES20.glUniform1i(C19527c.f96970g, 0);
            GLES20.glActiveTexture(33984);
            m102061e();
            this.f96937r++;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f96942w.size(); i13++) {
                C19526b c19526b = (C19526b) this.f96942w.get(i13);
                if (c19526b.f96965w) {
                    c19526b.m102072c(this.f96939t);
                } else {
                    if (this.f96928i > 0 && this.f96937r > 5) {
                        c19526b.m102073d(this.f96929j, this.f96930k, this.f96921b, this.f96922c);
                        this.f96937r = 0;
                        this.f96928i--;
                        m102058a();
                    }
                }
                i12++;
            }
            if (this.f96928i > 0) {
                int i14 = this.f96921b;
                if (i14 > 0 && this.f96922c > 0) {
                    if (this.f96937r > 5) {
                        int[] iArr = this.f96923d;
                        if (iArr != null) {
                            C19526b c19526b2 = new C19526b((i14 * 9) / 10, this.f96930k, iArr);
                            c19526b2.m102074e(128, 128);
                            c19526b2.m102073d(this.f96929j, this.f96930k, this.f96921b, this.f96922c);
                            this.f96942w.add(c19526b2);
                        }
                        this.f96937r = 0;
                        this.f96928i--;
                    }
                    m102058a();
                }
                i12++;
            }
            this.f96934o = i12;
            synchronized (this.f96941v) {
                try {
                    if (i12 == 0) {
                        Timer timer = this.f96931l;
                        if (timer != null) {
                            timer.cancel();
                            this.f96932m = false;
                        }
                    } else if (!this.f96932m) {
                        this.f96932m = true;
                    }
                } finally {
                }
            }
            GLES20.glBindTexture(3553, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m102066i(int i11, int i12) {
        GLES20.glViewport(0, 0, i11, i12);
        GLES20.glUseProgram(C19527c.f96966c);
        Matrix.orthoM(this.f96925f, 0, 0.0f, i11, 0.0f, i12, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f96926g, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f96927h, 0, this.f96925f, 0, this.f96926g, 0);
    }

    /* renamed from: j */
    public void m102067j() {
        C19527c c19527c = new C19527c();
        this.f96924e = c19527c;
        c19527c.m102075a();
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f96940u = asFloatBuffer;
        asFloatBuffer.put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        m102062g();
    }

    /* renamed from: k */
    public void m102068k(int i11, int i12, int i13, int i14) {
        this.f96929j = i11;
        this.f96930k = i12;
        this.f96921b = i13;
        this.f96922c = i14;
        float f11 = i14;
        float f12 = f11 / 1200.0f;
        this.f96935p = f12;
        this.f96939t = f12;
        this.f96936q = 9000.0f / f11;
    }
}
