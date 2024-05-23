package p403ot;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import se0.AbstractC26237b;

/* renamed from: ot.a */
/* loaded from: classes4.dex */
public class C24549a extends AbstractC24554f {

    /* renamed from: p */
    public static float[] f118176p = {-500.0f, 50.0f, -500.0f, -50.0f, -200.0f, -50.0f, -200.0f, 50.0f, -200.0f, 100.0f, 0.0f, 0.0f, -200.0f, -100.0f};

    /* renamed from: q */
    private static float[] f118177q = {-500.0f, 50.0f, -500.0f, -50.0f, -200.0f, -50.0f, -200.0f, 50.0f};

    /* renamed from: r */
    private static float[] f118178r = {-200.0f, 100.0f, 0.0f, 0.0f, -200.0f, -100.0f};

    /* renamed from: f */
    private final short[] f118179f;

    /* renamed from: g */
    private final ShortBuffer f118180g;

    /* renamed from: h */
    private FloatBuffer f118181h;

    /* renamed from: i */
    private FloatBuffer f118182i;

    /* renamed from: j */
    private float[] f118183j;

    /* renamed from: k */
    private final int f118184k;

    /* renamed from: l */
    private float[] f118185l;

    /* renamed from: m */
    private final int f118186m;

    /* renamed from: n */
    private float[] f118187n;

    /* renamed from: o */
    private float f118188o;

    public C24549a() {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f118179f = sArr;
        float[] fArr = f118177q;
        this.f118183j = fArr;
        this.f118184k = fArr.length / 2;
        float[] fArr2 = f118178r;
        this.f118185l = fArr2;
        this.f118186m = fArr2.length / 2;
        this.f118188o = 10.0f;
        this.f118180g = AbstractC26237b.m134919d(sArr);
        this.f118181h = AbstractC26237b.m134918c(this.f118183j);
        this.f118182i = AbstractC26237b.m134918c(this.f118185l);
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: c */
    protected String mo127908c() {
        return "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}";
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: e */
    protected String mo127909e() {
        return "uniform mat4 uMVPMatrix;attribute vec4 vPosition;void main() {  gl_Position = uMVPMatrix * vPosition;}";
    }

    /* renamed from: f */
    public void m127910f(float[] fArr) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f118235c);
        GLES20.glEnableVertexAttribArray(this.f118233a);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118181h);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118187n, 0);
        int m127930d = m127930d("uMVPMatrix");
        GLES20.glUniformMatrix4fv(m127930d, 1, false, fArr, 0);
        GLES20.glDrawElements(4, this.f118179f.length, 5123, this.f118180g);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118182i);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118187n, 0);
        GLES20.glUniformMatrix4fv(m127930d, 1, false, fArr, 0);
        GLES20.glDrawArrays(4, 0, this.f118186m);
        GLES20.glDisableVertexAttribArray(this.f118233a);
    }

    /* renamed from: g */
    public void m127911g(float[] fArr) {
        this.f118187n = fArr;
    }

    /* renamed from: h */
    public void m127912h(float f11) {
        this.f118188o = f11;
    }

    /* renamed from: i */
    public void m127913i(float[] fArr) {
        float[] fArr2 = this.f118183j;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        float[] fArr3 = this.f118185l;
        fArr3[0] = fArr[8];
        fArr3[1] = fArr[9];
        fArr3[2] = fArr[10];
        fArr3[3] = fArr[11];
        fArr3[4] = fArr[12];
        fArr3[5] = fArr[13];
        this.f118181h.clear();
        this.f118181h.put(this.f118183j).position(0);
        this.f118182i.clear();
        this.f118182i.put(this.f118185l).position(0);
    }
}
