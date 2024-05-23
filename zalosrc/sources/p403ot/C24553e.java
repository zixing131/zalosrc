package p403ot;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import se0.AbstractC26237b;

/* renamed from: ot.e */
/* loaded from: classes4.dex */
public class C24553e extends AbstractC24554f {

    /* renamed from: t */
    private static final float[] f118218t = {-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f};

    /* renamed from: f */
    private final short[] f118219f;

    /* renamed from: g */
    private FloatBuffer f118220g;

    /* renamed from: h */
    private ShortBuffer f118221h;

    /* renamed from: i */
    private float[] f118222i;

    /* renamed from: j */
    private final int f118223j;

    /* renamed from: k */
    private float f118224k;

    /* renamed from: l */
    private float f118225l;

    /* renamed from: m */
    private float f118226m;

    /* renamed from: n */
    private float f118227n;

    /* renamed from: o */
    private float[] f118228o;

    /* renamed from: p */
    private float f118229p;

    /* renamed from: q */
    private int f118230q;

    /* renamed from: r */
    private int f118231r;

    /* renamed from: s */
    private int f118232s;

    public C24553e() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f118219f = sArr;
        float[] fArr = f118218t;
        this.f118222i = fArr;
        this.f118223j = fArr.length / 2;
        this.f118229p = 10.0f;
        this.f118230q = 0;
        this.f118231r = 0;
        this.f118232s = 0;
        this.f118220g = AbstractC26237b.m134918c(fArr);
        this.f118221h = AbstractC26237b.m134919d(sArr);
        this.f118230q = m127930d("aLeftTop");
        this.f118231r = m127930d("aRightBot");
        this.f118232s = m127930d("aLineWidth");
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: c */
    protected String mo127908c() {
        return "precision mediump float;uniform vec4 vColor;uniform vec2 aLeftTop;\nuniform vec2 aRightBot;\nuniform float aLineWidth;\nvoid main() {    float x, y;\n    x = gl_FragCoord.x;\n    y = gl_FragCoord.y;\n    if(x >= aLeftTop.x && y <= aLeftTop.y && x <= aRightBot.x && y >= aRightBot.y)\n    { \n        if(x <= aLeftTop.x + aLineWidth || y >= aLeftTop.y - aLineWidth || x >= aRightBot.x - aLineWidth || y <= aRightBot.y + aLineWidth)\n            gl_FragColor = vColor;\n        else\n            gl_FragColor = vec4(0., 0., 0., 0.);\n    } \n    else\n        gl_FragColor = vec4(0., 0., 0., 0.);\n}";
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: e */
    protected String mo127909e() {
        return "uniform mat4 uMVPMatrix;attribute vec4 vPosition;void main() {  gl_Position = vPosition;}";
    }

    /* renamed from: f */
    public void m127924f(float[] fArr) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f118235c);
        GLES20.glEnableVertexAttribArray(this.f118233a);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118220g);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118228o, 0);
        GLES20.glUniform2f(this.f118230q, this.f118225l, this.f118224k);
        GLES20.glUniform2f(this.f118231r, this.f118227n, this.f118226m);
        GLES20.glUniform1f(this.f118232s, this.f118229p);
        GLES20.glDrawElements(4, this.f118219f.length, 5123, this.f118221h);
        GLES20.glDisableVertexAttribArray(this.f118233a);
    }

    /* renamed from: g */
    public void m127925g(float[] fArr) {
        this.f118228o = fArr;
    }

    /* renamed from: h */
    public void m127926h(float f11) {
        this.f118229p = f11;
    }

    /* renamed from: i */
    public void m127927i(float f11, float f12, float f13, float f14) {
        this.f118225l = f11;
        this.f118224k = f12;
        this.f118227n = f13;
        this.f118226m = f14;
    }
}
