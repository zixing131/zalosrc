package p403ot;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import se0.AbstractC26237b;

/* renamed from: ot.b */
/* loaded from: classes4.dex */
public class C24550b extends AbstractC24554f {

    /* renamed from: q */
    private static float[] f118189q = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: f */
    private final short[] f118190f;

    /* renamed from: h */
    private ShortBuffer f118192h;

    /* renamed from: i */
    private float f118193i;

    /* renamed from: j */
    private float f118194j;

    /* renamed from: k */
    private float f118195k;

    /* renamed from: l */
    private float[] f118196l;

    /* renamed from: n */
    private int f118198n;

    /* renamed from: o */
    private int f118199o;

    /* renamed from: p */
    private int f118200p;

    /* renamed from: m */
    private float f118197m = 10.0f;

    /* renamed from: g */
    private FloatBuffer f118191g = AbstractC26237b.m134918c(f118189q);

    public C24550b() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f118190f = sArr;
        this.f118198n = 0;
        this.f118199o = 0;
        this.f118200p = 0;
        this.f118192h = AbstractC26237b.m134919d(sArr);
        this.f118198n = m127930d("aCirclePosition");
        this.f118199o = m127930d("aRadius");
        this.f118200p = m127930d("aLineWidth");
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: c */
    protected String mo127908c() {
        return "precision highp float;\nuniform vec2 aCirclePosition;\nuniform float aRadius; \nuniform vec4 vColor; \nuniform float aLineWidth;\nconst float threshold = 0.005;\nvoid main() \n{ \n    float d, dist;\n    dist = distance(aCirclePosition, gl_FragCoord.xy);\n    if(dist == 0.)\n        dist = 1.;\n    d = aRadius / dist;\n    if(d >= 1.)\n    {\n        if(dist >= aRadius - aLineWidth)\n            gl_FragColor = vColor;\n        else\n            gl_FragColor = vec4(0., 0., 0., 0.);\n    }\n    else\n        gl_FragColor = vec4(0., 0., 0., 0.);\n} \n";
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: e */
    protected String mo127909e() {
        return "attribute vec2 vPosition; \nvoid main() \n{ \n    gl_Position = vec4(vPosition, 0., 1.); \n} \n";
    }

    /* renamed from: f */
    public void m127914f(float[] fArr) {
        GLES20.glUseProgram(this.f118235c);
        GLES20.glEnableVertexAttribArray(this.f118233a);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118191g);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118196l, 0);
        GLES20.glUniform2f(this.f118198n, this.f118193i, this.f118194j);
        GLES20.glUniform1f(this.f118199o, this.f118195k);
        GLES20.glUniform1f(this.f118200p, this.f118197m);
        GLES20.glDrawElements(4, this.f118190f.length, 5123, this.f118192h);
        GLES20.glDisableVertexAttribArray(this.f118233a);
    }

    /* renamed from: g */
    public void m127915g(float f11, float f12) {
        this.f118193i = f11;
        this.f118194j = f12;
    }

    /* renamed from: h */
    public void m127916h(float[] fArr) {
        this.f118196l = fArr;
    }

    /* renamed from: i */
    public void m127917i(float f11) {
        this.f118197m = f11;
    }

    /* renamed from: j */
    public void m127918j(float f11) {
        this.f118195k = f11;
    }
}
