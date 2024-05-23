package p403ot;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26237b;

/* renamed from: ot.d */
/* loaded from: classes4.dex */
public class C24552d extends AbstractC24554f {

    /* renamed from: m */
    private static float f118210m = 5.0f;

    /* renamed from: f */
    private final float[] f118211f;

    /* renamed from: g */
    private final float[] f118212g = {0.24705882f, 0.79607844f, 0.8117647f, 1.0f};

    /* renamed from: h */
    private final String f118213h = "uniform mat4 uMVPMatrix;attribute vec4 vPosition;void main() {  gl_Position = uMVPMatrix * vPosition;}";

    /* renamed from: i */
    private final String f118214i = "precision mediump float;uniform vec4 vColor;void main() {  gl_FragColor = vColor;}";

    /* renamed from: j */
    private FloatBuffer f118215j;

    /* renamed from: k */
    private float[] f118216k;

    /* renamed from: l */
    private final int f118217l;

    public C24552d() {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f};
        this.f118211f = fArr;
        this.f118216k = fArr;
        this.f118217l = fArr.length / 2;
        this.f118215j = AbstractC26237b.m134918c(fArr);
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
    public void m127922f(float[] fArr) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f118235c);
        GLES20.glEnableVertexAttribArray(this.f118233a);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118215j);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118212g, 0);
        GLES20.glUniformMatrix4fv(m127930d("uMVPMatrix"), 1, false, fArr, 0);
        GLES20.glDrawArrays(1, 0, this.f118217l);
        GLES20.glLineWidth(f118210m);
        GLES20.glDisableVertexAttribArray(this.f118233a);
    }

    /* renamed from: g */
    public void m127923g(float[] fArr) {
        this.f118216k = fArr;
        this.f118215j.clear();
        this.f118215j.put(this.f118216k).position(0);
    }
}
