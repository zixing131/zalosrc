package p403ot;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26237b;

/* renamed from: ot.c */
/* loaded from: classes4.dex */
public class C24551c extends AbstractC24554f {

    /* renamed from: g */
    private final float[] f118202g;

    /* renamed from: i */
    private int f118204i;

    /* renamed from: j */
    private final FloatBuffer f118205j;

    /* renamed from: k */
    private float[] f118206k;

    /* renamed from: l */
    private final int f118207l;

    /* renamed from: h */
    private final float[] f118203h = {0.24705882f, 0.79607844f, 0.8117647f, 1.0f};

    /* renamed from: m */
    private final String f118208m = "uniform mat4 uMVPMatrix;attribute vec4 vPosition;varying vec2 v_xy;void main() {   gl_PointSize = 1.0;   gl_Position = uMVPMatrix * vPosition;   v_xy = vPosition.xy;}";

    /* renamed from: n */
    private final String f118209n = "precision mediump float;varying vec2 v_xy;uniform vec4 vColor;uniform int orientation;void main() {gl_FragColor = mod(orientation > 0 ? v_xy.y : v_xy.x, 20.0) >= 5.0 ? vColor : vec4(0., 0., 0., 0.);}";

    /* renamed from: f */
    private int f118201f = 0;

    public C24551c() {
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f};
        this.f118202g = fArr;
        this.f118204i = 0;
        this.f118206k = fArr;
        this.f118207l = fArr.length / 2;
        this.f118205j = AbstractC26237b.m134918c(fArr);
        this.f118204i = m127930d("orientation");
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: c */
    protected String mo127908c() {
        return "precision mediump float;varying vec2 v_xy;uniform vec4 vColor;uniform int orientation;void main() {gl_FragColor = mod(orientation > 0 ? v_xy.y : v_xy.x, 20.0) >= 5.0 ? vColor : vec4(0., 0., 0., 0.);}";
    }

    @Override // p403ot.AbstractC24554f
    /* renamed from: e */
    protected String mo127909e() {
        return "uniform mat4 uMVPMatrix;attribute vec4 vPosition;varying vec2 v_xy;void main() {   gl_PointSize = 1.0;   gl_Position = uMVPMatrix * vPosition;   v_xy = vPosition.xy;}";
    }

    /* renamed from: f */
    public void m127919f(float[] fArr) {
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.f118235c);
        GLES20.glEnableVertexAttribArray(this.f118233a);
        GLES20.glVertexAttribPointer(this.f118233a, 2, 5126, false, 8, (Buffer) this.f118205j);
        GLES20.glUniform4fv(this.f118234b, 1, this.f118203h, 0);
        GLES20.glUniform1i(this.f118204i, this.f118201f);
        GLES20.glUniformMatrix4fv(m127930d("uMVPMatrix"), 1, false, fArr, 0);
        GLES20.glDrawArrays(1, 0, this.f118207l);
        GLES20.glLineWidth(4.0f);
        GLES20.glDisableVertexAttribArray(this.f118233a);
    }

    /* renamed from: g */
    public void m127920g(int i11) {
        this.f118201f = i11;
    }

    /* renamed from: h */
    public void m127921h(float[] fArr) {
        this.f118206k = fArr;
        this.f118205j.clear();
        this.f118205j.put(this.f118206k).position(0);
    }
}
