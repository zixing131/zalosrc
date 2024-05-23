package wf;

import ag.AbstractC0784d;
import ag.C0794n;
import android.opengl.GLES20;
import android.opengl.Matrix;
import fn0.AbstractC19074t;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26236a;

/* renamed from: wf.a */
/* loaded from: classes3.dex */
public abstract class AbstractC28949a extends AbstractC28955g {

    /* renamed from: N */
    protected int[] f134006N;

    /* renamed from: O */
    protected final C0794n f134007O = new C0794n();

    /* renamed from: P */
    protected final float[] f134008P;

    /* renamed from: Q */
    protected boolean f134009Q;

    /* renamed from: R */
    private boolean f134010R;

    /* renamed from: S */
    protected FloatBuffer f134011S;

    /* renamed from: T */
    protected FloatBuffer f134012T;

    public AbstractC28949a() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.f134008P = fArr;
        FloatBuffer floatBuffer = AbstractC0784d.f2698A;
        AbstractC19074t.m100207e(floatBuffer, "CUBE_BUF");
        this.f134011S = floatBuffer;
        FloatBuffer floatBuffer2 = AbstractC0784d.f2700C;
        AbstractC19074t.m100207e(floatBuffer2, "RECTANGLE_TEX_BUF");
        this.f134012T = floatBuffer2;
    }

    @Override // wf.AbstractC28955g, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        int[] iArr;
        super.mo1905A();
        if (!this.f134010R && (iArr = this.f134006N) != null) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f134006N = null;
        }
        try {
            this.f134007O.m13459a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        AbstractC26236a.m134894a("OESTexture - onDestroy");
    }

    @Override // wf.AbstractC28955g, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        int[] iArr = new int[1];
        this.f134006N = iArr;
        AbstractC26236a.m134902i(iArr, 0);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        if (!this.f134009Q) {
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        this.f134007O.m13466h();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, m144597l0());
        GLES20.glUniformMatrix4fv(this.f134007O.f2741e, 1, false, this.f134008P, 0);
        GLES20.glEnableVertexAttribArray(this.f134007O.f2742f);
        GLES20.glVertexAttribPointer(this.f134007O.f2742f, 2, 5126, false, 8, (Buffer) this.f134011S);
        GLES20.glEnableVertexAttribArray(this.f134007O.f2743g);
        GLES20.glVertexAttribPointer(this.f134007O.f2743g, 2, 5126, false, 0, (Buffer) this.f134012T);
        float m1947K = m1947K();
        if (m1947K < 1.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("draw with alpha: ");
            sb2.append(m1947K);
        }
        GLES20.glUniform1f(this.f134007O.f2744h, m1947K);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f134007O.f2742f);
        GLES20.glDisableVertexAttribArray(this.f134007O.f2743g);
        GLES20.glBindTexture(36197, 0);
        GLES20.glDisable(3042);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        mo144598k0();
    }

    /* renamed from: l0 */
    public int m144597l0() {
        int[] iArr = this.f134006N;
        if (iArr != null) {
            return iArr[0];
        }
        return -1;
    }
}
