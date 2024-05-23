package wf;

import ag.AbstractC0784d;
import ag.C0793m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p643xf.AbstractC29608a;
import p679yf.C30923c;
import se0.AbstractC26236a;

/* renamed from: wf.e */
/* loaded from: classes3.dex */
public class C28953e extends AbstractC29608a {

    /* renamed from: F */
    private Bitmap f134019F;

    /* renamed from: G */
    private Context f134020G;

    /* renamed from: J */
    private int[] f134023J;

    /* renamed from: K */
    private C30923c f134024K;

    /* renamed from: L */
    private RectF f134025L;

    /* renamed from: H */
    private C0793m f134021H = new C0793m();

    /* renamed from: I */
    private float[] f134022I = new float[16];

    /* renamed from: M */
    private PointF f134026M = new PointF();

    /* renamed from: N */
    private PointF f134027N = new PointF();

    /* renamed from: O */
    private PointF f134028O = new PointF();

    /* renamed from: P */
    private PointF f134029P = new PointF();

    /* renamed from: Q */
    private FloatBuffer f134030Q = AbstractC0784d.f2699B;

    /* renamed from: R */
    private FloatBuffer f134031R = AbstractC0784d.f2700C;

    public C28953e(Context context, Bitmap bitmap, C30923c c30923c) {
        this.f134020G = context;
        this.f134019F = bitmap;
        this.f134024K = c30923c;
        Matrix.setIdentityM(this.f134022I, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        try {
            this.f134021H.m13459a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        int[] iArr = this.f134023J;
        if (iArr != null) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f134023J = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        try {
            this.f134021H.m2005i(this.f134020G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Bitmap bitmap = this.f134019F;
        if (bitmap != null) {
            int[] iArr = new int[1];
            this.f134023J = iArr;
            AbstractC26236a.m134904k(iArr, 0, bitmap);
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        if (this.f134023J == null) {
            return;
        }
        this.f134021H.m13466h();
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f134023J[0]);
        GLES20.glUniformMatrix4fv(this.f134021H.f2736e, 1, false, this.f134022I, 0);
        GLES20.glEnableVertexAttribArray(this.f134021H.f2737f);
        GLES20.glVertexAttribPointer(this.f134021H.f2737f, 2, 5126, false, 8, (Buffer) this.f134030Q);
        GLES20.glEnableVertexAttribArray(this.f134021H.f2738g);
        GLES20.glVertexAttribPointer(this.f134021H.f2738g, 2, 5126, false, 0, (Buffer) this.f134031R);
        GLES20.glUniform1f(this.f134021H.f2739h, 1.0f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f134021H.f2737f);
        GLES20.glDisableVertexAttribArray(this.f134021H.f2738g);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: b0 */
    void m144606b0(int i11, int i12) {
        float f11 = i11 / 2.0f;
        float f12 = i12 / 2.0f;
        this.f134025L = new RectF(-f11, -f12, f11, f12);
    }

    /* renamed from: c0 */
    public void m144607c0(C30923c c30923c) {
        if (c30923c != null) {
            float[] fArr = new float[16];
            float[] fArr2 = new float[16];
            Matrix.orthoM(fArr, 0, 0.0f, c30923c.f142619a, 0.0f, c30923c.f142620b, 0.0f, 100.0f);
            Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
            Matrix.multiplyMM(this.f134022I, 0, fArr, 0, fArr2, 0);
            m144606b0(this.f134019F.getWidth(), this.f134019F.getHeight());
            m144608d0();
        }
    }

    /* renamed from: d0 */
    void m144608d0() {
        float width = this.f134024K.f142619a / this.f134019F.getWidth();
        C30923c c30923c = this.f134024K;
        int i11 = c30923c.f142619a / 2;
        int i12 = c30923c.f142620b / 2;
        RectF rectF = this.f134025L;
        float f11 = rectF.left * width;
        float f12 = rectF.right * width;
        float f13 = rectF.top * width;
        float f14 = rectF.bottom * width;
        double radians = Math.toRadians(0.0f);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        PointF pointF = this.f134026M;
        float f15 = f11 * cos;
        float f16 = f13 * sin;
        pointF.x = f15 - f16;
        float f17 = f11 * sin;
        float f18 = f13 * cos;
        pointF.y = f17 + f18;
        PointF pointF2 = this.f134027N;
        float f19 = f12 * cos;
        pointF2.x = f19 - f16;
        float f21 = f12 * sin;
        pointF2.y = f18 + f21;
        PointF pointF3 = this.f134028O;
        float f22 = sin * f14;
        pointF3.x = f15 - f22;
        float f23 = f14 * cos;
        pointF3.y = f17 + f23;
        PointF pointF4 = this.f134029P;
        pointF4.x = f19 - f22;
        pointF4.y = f21 + f23;
        float f24 = i11;
        pointF.x += f24;
        float f25 = i12;
        pointF.y += f25;
        pointF2.x += f24;
        pointF2.y += f25;
        pointF3.x += f24;
        pointF3.y += f25;
        float f26 = pointF4.x + f24;
        pointF4.x = f26;
        float f27 = pointF4.y + f25;
        pointF4.y = f27;
        float[] fArr = {pointF.x, pointF.y, pointF2.x, pointF2.y, pointF3.x, pointF3.y, f26, f27};
        this.f134030Q.clear();
        this.f134030Q.put(fArr);
        this.f134030Q.position(0);
    }
}
