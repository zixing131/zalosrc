package p643xf;

import ag.AbstractC0784d;
import ag.C0793m;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import ho0.AbstractC20110a;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import se0.AbstractC26236a;

/* renamed from: xf.j */
/* loaded from: classes3.dex */
public class C29617j extends AbstractC29608a {

    /* renamed from: F */
    private final Bitmap f136750F;

    /* renamed from: G */
    private final Context f136751G;

    /* renamed from: I */
    private final float[] f136753I;

    /* renamed from: J */
    private final FloatBuffer f136754J;

    /* renamed from: K */
    private final FloatBuffer f136755K;

    /* renamed from: L */
    private int[] f136756L;

    /* renamed from: P */
    private final a f136760P;

    /* renamed from: H */
    private final C0793m f136752H = new C0793m();

    /* renamed from: M */
    private float f136757M = 1.0f;

    /* renamed from: N */
    private boolean f136758N = false;

    /* renamed from: O */
    private boolean f136759O = true;

    /* renamed from: xf.j$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: j */
        void mo38280j();
    }

    public C29617j(Context context, Bitmap bitmap, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, a aVar) {
        float[] fArr = new float[16];
        this.f136753I = fArr;
        this.f136750F = bitmap;
        this.f136751G = context.getApplicationContext();
        this.f136760P = aVar;
        this.f136755K = floatBuffer2 == null ? AbstractC0784d.f2700C : floatBuffer2;
        this.f136754J = floatBuffer == null ? AbstractC0784d.f2698A : floatBuffer;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        try {
            this.f136752H.m13459a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        int[] iArr = this.f136756L;
        if (iArr != null) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f136756L = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        try {
            this.f136752H.m2005i(this.f136751G);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        Bitmap bitmap = this.f136750F;
        if (bitmap != null) {
            int[] iArr = new int[1];
            this.f136756L = iArr;
            AbstractC26236a.m134904k(iArr, 0, bitmap);
        }
        this.f136759O = true;
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        if (this.f136756L == null) {
            return;
        }
        if (this.f136759O) {
            this.f136759O = false;
            AbstractC20110a.m104535d("first event onDrawFrame", new Object[0]);
            if (this.f136758N) {
                mo1953W(0.0f);
                m1955Y(250);
            }
            a aVar = this.f136760P;
            if (aVar != null) {
                aVar.mo38280j();
            }
        }
        this.f136752H.m13466h();
        GLES20.glDisable(3042);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f136756L[0]);
        GLES20.glUniformMatrix4fv(this.f136752H.f2736e, 1, false, this.f136753I, 0);
        GLES20.glEnableVertexAttribArray(this.f136752H.f2737f);
        GLES20.glVertexAttribPointer(this.f136752H.f2737f, 2, 5126, false, 8, (Buffer) this.f136754J);
        GLES20.glEnableVertexAttribArray(this.f136752H.f2738g);
        GLES20.glVertexAttribPointer(this.f136752H.f2738g, 2, 5126, false, 0, (Buffer) this.f136755K);
        GLES20.glUniform1f(this.f136752H.f2739h, this.f136757M);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f136752H.f2737f);
        GLES20.glDisableVertexAttribArray(this.f136752H.f2738g);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisable(3042);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: W */
    public void mo1953W(float f11) {
        super.mo1953W(f11);
        this.f136757M = f11;
    }

    /* renamed from: b0 */
    public Bitmap m147204b0() {
        return this.f136750F;
    }

    /* renamed from: c0 */
    public void m147205c0(boolean z11) {
        this.f136758N = z11 && this.f2708x;
    }
}
