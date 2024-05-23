package p643xf;

import ag.AbstractC0784d;
import ag.C0798r;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.zing.zalo.imgdecor.model.model.PaintData;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: xf.b */
/* loaded from: classes3.dex */
public class C29609b extends AbstractC29608a {

    /* renamed from: F */
    private Bitmap f136710F;

    /* renamed from: G */
    private final Context f136711G;

    /* renamed from: I */
    private final float[] f136713I;

    /* renamed from: J */
    private final FloatBuffer f136714J;

    /* renamed from: L */
    private int[] f136716L;

    /* renamed from: H */
    private final C0798r f136712H = new C0798r();

    /* renamed from: M */
    private final Queue f136717M = new LinkedBlockingQueue();

    /* renamed from: N */
    private final List f136718N = new ArrayList();

    /* renamed from: K */
    private final FloatBuffer f136715K = AbstractC26237b.m134918c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    public C29609b(Context context, Bitmap bitmap, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        float[] fArr = new float[16];
        this.f136713I = fArr;
        this.f136710F = bitmap;
        this.f136711G = context.getApplicationContext();
        this.f136714J = floatBuffer == null ? AbstractC0784d.f2698A : floatBuffer;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        try {
            this.f136712H.m13459a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        int[] iArr = this.f136716L;
        if (iArr != null) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f136716L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        try {
            this.f136712H.m2016i(this.f136711G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Bitmap bitmap = this.f136710F;
        if (bitmap != null) {
            int[] iArr = new int[1];
            this.f136716L = iArr;
            AbstractC26236a.m134904k(iArr, 0, bitmap);
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        if (this.f136716L == null) {
            return;
        }
        this.f136718N.clear();
        while (this.f136717M.peek() != null) {
            this.f136718N.add((PaintData.Position) this.f136717M.poll());
        }
        this.f136712H.m13466h();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f136716L[0]);
        GLES20.glUniformMatrix4fv(this.f136712H.f2746e, 1, false, this.f136713I, 0);
        GLES20.glEnableVertexAttribArray(this.f136712H.f2747f);
        GLES20.glVertexAttribPointer(this.f136712H.f2747f, 2, 5126, false, 8, (Buffer) this.f136714J);
        GLES20.glEnableVertexAttribArray(this.f136712H.f2748g);
        GLES20.glVertexAttribPointer(this.f136712H.f2748g, 2, 5126, false, 0, (Buffer) this.f136715K);
        for (int i11 = 0; i11 < this.f136718N.size(); i11++) {
            PaintData.Position position = (PaintData.Position) this.f136718N.get(i11);
            GLES20.glUniform1f(this.f136712H.f2753l, position.f47741r);
            int i12 = this.f136712H.f2751j;
            float f11 = position.f47739p;
            float f12 = position.f47741r;
            GLES20.glUniform2f(i12, f11 - f12, position.f47740q - f12);
            int i13 = this.f136712H.f2752k;
            float f13 = position.f47739p;
            float f14 = position.f47741r;
            GLES20.glUniform2f(i13, f13 + f14, position.f47740q + f14);
            GLES20.glUniform2f(this.f136712H.f2750i, position.f47739p, position.f47740q);
            GLES20.glDrawArrays(5, 0, 4);
        }
        this.f136718N.clear();
        GLES20.glDisableVertexAttribArray(this.f136712H.f2747f);
        GLES20.glDisableVertexAttribArray(this.f136712H.f2748g);
        GLES20.glBindTexture(3553, 0);
        GLES20.glFinish();
    }

    @Override // ag.AbstractC0784d
    /* renamed from: W */
    public void mo1953W(float f11) {
    }

    /* renamed from: b0 */
    public void m147177b0(PaintData.Position position) {
        this.f136717M.add(position);
    }

    /* renamed from: c0 */
    public boolean m147178c0() {
        if (this.f136717M.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    public void m147179d0(Bitmap bitmap) {
        this.f136710F = bitmap;
        if (bitmap != null) {
            AbstractC26236a.m134915v(this.f136716L, 0, bitmap);
        }
    }
}
