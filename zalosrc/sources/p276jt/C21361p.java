package p276jt;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import et.C18610q;
import java.nio.Buffer;
import se0.AbstractC26236a;

/* renamed from: jt.p */
/* loaded from: classes4.dex */
public class C21361p extends AbstractC21351f {

    /* renamed from: U */
    public int f104129U;

    /* renamed from: V */
    public int f104130V;

    /* renamed from: W */
    public int f104131W;

    /* renamed from: X */
    public int f104132X;

    /* renamed from: Y */
    public int f104133Y;

    /* renamed from: Z */
    public int f104134Z;

    /* renamed from: a0 */
    int f104135a0;

    /* renamed from: b0 */
    int f104136b0;

    /* renamed from: c0 */
    int f104137c0;

    /* renamed from: d0 */
    String f104138d0;

    /* renamed from: e0 */
    String f104139e0;

    public C21361p(int i11, int i12, float f11, Bitmap bitmap) {
        super(i11, i12, f11, 0.0f);
        this.f104137c0 = -1;
        this.f104138d0 = "uniform mat4 u_MVPMatrix;attribute vec4 a_Position;attribute vec2 a_texCoord;varying vec2 v_texCoord;void main() {  gl_Position = u_MVPMatrix * a_Position;  v_texCoord = a_texCoord;}";
        this.f104139e0 = "precision mediump float;uniform float alphaFactor;uniform sampler2D u_texture;varying vec2 v_texCoord;void main() {   lowp vec4 textureColor = texture2D(u_texture, v_texCoord);   gl_FragColor = vec4(textureColor.rgb, textureColor.a * alphaFactor);}";
        m110612o0(bitmap.getWidth(), bitmap.getHeight());
        this.f104135a0 = AbstractC26236a.m134897d(this.f104138d0);
        int m134895b = AbstractC26236a.m134895b(this.f104139e0);
        this.f104136b0 = m134895b;
        int m134907n = AbstractC26236a.m134907n(this.f104135a0, m134895b);
        this.f104129U = m134907n;
        this.f104130V = GLES20.glGetUniformLocation(m134907n, "u_MVPMatrix");
        this.f104131W = GLES20.glGetAttribLocation(this.f104129U, "a_Position");
        this.f104132X = GLES20.glGetAttribLocation(this.f104129U, "a_texCoord");
        this.f104133Y = GLES20.glGetUniformLocation(this.f104129U, "u_texture");
        this.f104134Z = GLES20.glGetUniformLocation(this.f104129U, "alphaFactor");
        int[] iArr = new int[1];
        AbstractC26236a.m134904k(iArr, 0, bitmap);
        int i13 = iArr[0];
        if (i13 != 0) {
            this.f104137c0 = i13;
            return;
        }
        throw new RuntimeException("Can not init overlay object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f104137c0;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f104137c0 = -1;
        }
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: k0 */
    protected void mo110585k0(float[] fArr, C18610q c18610q) {
        if (m1947K() < 1.0f) {
            GLES20.glBlendFunc(770, 771);
        } else {
            GLES20.glBlendFunc(1, 771);
        }
        GLES20.glEnable(3042);
        GLES20.glUseProgram(this.f104129U);
        GLES20.glEnableVertexAttribArray(this.f104131W);
        GLES20.glEnableVertexAttribArray(this.f104132X);
        GLES20.glVertexAttribPointer(this.f104131W, 2, 5126, false, 0, (Buffer) m110617u0());
        GLES20.glVertexAttribPointer(this.f104132X, 2, 5126, false, 0, (Buffer) this.f104026J);
        GLES20.glUniform1f(this.f104134Z, m1947K());
        GLES20.glUniformMatrix4fv(this.f104130V, 1, false, fArr, 0);
        GLES20.glUniform1i(this.f104133Y, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f104137c0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f104131W);
        GLES20.glDisableVertexAttribArray(this.f104132X);
        GLES20.glBindTexture(3553, 0);
    }
}
