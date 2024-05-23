package lt;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import et.AbstractC18594a;
import et.C18610q;
import java.nio.Buffer;
import org.json.JSONObject;
import p276jt.AbstractC21351f;
import se0.AbstractC26236a;

/* renamed from: lt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC22646b extends AbstractC21351f {

    /* renamed from: U */
    final Object f111051U;

    /* renamed from: V */
    Bitmap f111052V;

    /* renamed from: W */
    float f111053W;

    /* renamed from: X */
    int f111054X;

    public AbstractC22646b() {
        super(0, 0, 1.0f, 0.0f);
        this.f111051U = new Object();
        this.f111054X = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f111054X;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f111054X = -1;
        }
        synchronized (this.f111051U) {
            this.f111052V = null;
        }
    }

    /* renamed from: A0 */
    public void m117218A0(Bitmap bitmap) {
        synchronized (this.f111051U) {
            try {
                if (this.f111052V != bitmap) {
                    this.f111052V = bitmap;
                    m110612o0(bitmap.getWidth(), this.f111052V.getHeight());
                    if (m1992u()) {
                        m117223z0();
                    }
                    m1952U(new Runnable() { // from class: lt.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC22646b.this.m1996y();
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: B0 */
    public void m117219B0(float f11, int i11) {
        super.mo110614r0(this.f111053W + ((int) (f11 * i11)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        m117223z0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        m117223z0();
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: k0 */
    protected void mo110585k0(float[] fArr, C18610q c18610q) {
        if (!this.f104035S) {
            return;
        }
        if (m1947K() < 1.0f) {
            GLES20.glBlendFunc(770, 771);
        } else {
            GLES20.glBlendFunc(1, 771);
        }
        GLES20.glUseProgram(c18610q.f93578a);
        GLES20.glEnableVertexAttribArray(c18610q.f93581d);
        GLES20.glEnableVertexAttribArray(c18610q.f93582e);
        GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110617u0());
        GLES20.glVertexAttribPointer(c18610q.f93582e, 2, 5126, false, 0, (Buffer) this.f104026J);
        GLES20.glUniform1f(c18610q.f93587j, m1947K());
        GLES20.glUniformMatrix4fv(c18610q.f93580c, 1, false, fArr, 0);
        GLES20.glUniform1i(c18610q.f93583f, 0);
        GLES20.glActiveTexture(33984);
        int i11 = this.f111054X;
        if (i11 != -1) {
            GLES20.glBindTexture(3553, i11);
            GLES20.glDrawArrays(5, 0, 4);
        }
        GLES20.glDisableVertexAttribArray(c18610q.f93581d);
        GLES20.glDisableVertexAttribArray(c18610q.f93582e);
        GLES20.glBindTexture(3553, 0);
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: m0 */
    public void mo110586m0(JSONObject jSONObject) {
        try {
            super.mo110586m0(jSONObject);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: r0 */
    public void mo110614r0(float f11) {
        super.mo110614r0(f11);
        this.f111053W = f11;
    }

    /* renamed from: w0 */
    public boolean m117220w0(float f11, float f12) {
        if (this.f104029M == null) {
            return false;
        }
        double radians = Math.toRadians(-this.f104025I);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f13 = f11 - this.f104022F;
        float f14 = f12 - this.f104023G;
        float f15 = (f13 * cos) - (f14 * sin);
        float f16 = (f13 * sin) + (f14 * cos);
        float f17 = this.f104029M.left;
        float f18 = this.f104024H;
        if (f15 <= f17 * f18 || f15 >= r8.right * f18 || f16 <= r8.bottom * f18 || f16 >= r8.top * f18) {
            return false;
        }
        float f19 = f16 / f18;
        RectF rectF = this.f104028L;
        int i11 = (int) ((f15 / f18) + rectF.right);
        float height = rectF.height();
        RectF rectF2 = this.f104028L;
        int i12 = (int) (height - (rectF2.bottom + f19));
        if (i11 < 0 || i11 >= rectF2.width() || i12 < 0 || i12 >= this.f104028L.height()) {
            return false;
        }
        Bitmap bitmap = this.f111052V;
        if (bitmap != null && !bitmap.isRecycled() && this.f111052V.getPixel(i11, i12) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x0 */
    public int m117221x0() {
        RectF rectF = this.f104028L;
        if (rectF != null) {
            return Math.abs((int) rectF.height());
        }
        return 0;
    }

    /* renamed from: y0 */
    public int m117222y0() {
        RectF rectF = this.f104028L;
        if (rectF != null) {
            return (int) rectF.width();
        }
        return 0;
    }

    /* renamed from: z0 */
    void m117223z0() {
        if (this.f111054X == -1) {
            synchronized (this.f111051U) {
                try {
                    Bitmap bitmap = this.f111052V;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Rect rect = new Rect();
                        this.f104029M = rect;
                        this.f111054X = AbstractC18594a.m98198e(this.f111052V, rect);
                        this.f111052V = null;
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (this.f111051U) {
            try {
                Bitmap bitmap2 = this.f111052V;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    AbstractC26236a.m134914u(this.f111054X, this.f111052V);
                }
                this.f111052V = null;
            } finally {
            }
        }
    }
}
