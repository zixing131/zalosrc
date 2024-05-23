package p276jt;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import et.AbstractC18594a;
import et.C18610q;
import im.C20612c;
import im.C20622m;
import java.nio.Buffer;
import org.json.JSONObject;
import se0.AbstractC26236a;

/* renamed from: jt.i */
/* loaded from: classes4.dex */
public class C21354i extends AbstractC21351f {

    /* renamed from: U */
    public int f104060U;

    /* renamed from: V */
    public int f104061V;

    /* renamed from: W */
    private int f104062W;

    /* renamed from: X */
    private String f104063X;

    /* renamed from: Y */
    private Bitmap f104064Y;

    /* renamed from: Z */
    final Object f104065Z;

    public C21354i() {
        super(0, 0, 1.0f, 0.0f);
        this.f104062W = -1;
        this.f104065Z = new Object();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f104062W;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f104062W = -1;
        }
    }

    /* renamed from: A0 */
    public void m110641A0(Bitmap bitmap, String str) {
        if (bitmap != null) {
            synchronized (this.f104065Z) {
                try {
                    Bitmap bitmap2 = this.f104064Y;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f104064Y = bitmap;
                    this.f104063X = str;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m110612o0(bitmap.getWidth(), this.f104064Y.getHeight());
            m1952U(new Runnable() { // from class: jt.h
                public /* synthetic */ RunnableC21353h() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21354i.this.m1996y();
                }
            });
        }
    }

    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        synchronized (this.f104065Z) {
            try {
                if (this.f104064Y != null) {
                    Rect rect = new Rect();
                    this.f104029M = rect;
                    this.f104062W = AbstractC18594a.m98198e(this.f104064Y, rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        if (this.f104062W == -1) {
            return;
        }
        synchronized (this.f104065Z) {
            try {
                Bitmap bitmap = this.f104064Y;
                if (bitmap != null && !bitmap.isRecycled()) {
                    AbstractC26236a.m134914u(this.f104062W, this.f104064Y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: a0 */
    public boolean mo110602a0(float f11, float f12, int i11) {
        if (this.f104035S && this.f104029M != null) {
            double radians = Math.toRadians(-this.f104025I);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f13 = f11 - this.f104022F;
            float f14 = f12 - this.f104023G;
            float f15 = (f13 * cos) - (f14 * sin);
            float f16 = (f13 * sin) + (f14 * cos);
            float f17 = this.f104029M.left;
            float f18 = this.f104024H;
            float f19 = i11;
            if (f15 > (f17 * f18) - f19 && f15 < (r8.right * f18) + f19 && f16 > (r8.bottom * f18) - f19 && f16 < (r8.top * f18) + f19) {
                if (i11 != 0) {
                    return true;
                }
                int i12 = (int) ((f15 / f18) + this.f104028L.right);
                int height = (int) (this.f104064Y.getHeight() - (this.f104028L.bottom + (f16 / f18)));
                if (i12 < 0 || i12 >= this.f104064Y.getWidth() || height < 0 || height >= this.f104064Y.getHeight() || this.f104064Y.isRecycled() || this.f104064Y.getPixel(i12, height) == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: d0 */
    public JSONObject mo110584d0() {
        JSONObject mo110584d0 = super.mo110584d0();
        mo110584d0.put("id", this.f104060U);
        mo110584d0.put("cid", this.f104061V);
        mo110584d0.put("p", this.f104063X);
        return mo110584d0;
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
        GLES20.glBindTexture(3553, this.f104062W);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c18610q.f93581d);
        GLES20.glDisableVertexAttribArray(c18610q.f93582e);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f
    /* renamed from: m0 */
    public void mo110586m0(JSONObject jSONObject) {
        super.mo110586m0(jSONObject);
        this.f104060U = jSONObject.optInt("id");
        this.f104061V = jSONObject.optInt("cid");
        this.f104063X = jSONObject.getString("p");
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: v0 */
    public void mo110587v0(C20612c c20612c) {
        c20612c.m107300x().add(new C20622m(this.f104060U, this.f104061V));
    }

    /* renamed from: w0 */
    public Bitmap m110642w0() {
        return this.f104064Y;
    }

    /* renamed from: x0 */
    public String m110643x0() {
        return this.f104063X;
    }

    /* renamed from: y0 */
    public void m110644y0() {
        if (this.f104062W == -1) {
            synchronized (this.f104065Z) {
                try {
                    Bitmap bitmap = this.f104064Y;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Rect rect = new Rect();
                        this.f104029M = rect;
                        this.f104062W = AbstractC18594a.m98198e(this.f104064Y, rect);
                    }
                } finally {
                }
            }
            return;
        }
        synchronized (this.f104065Z) {
            try {
                Bitmap bitmap2 = this.f104064Y;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    AbstractC26236a.m134914u(this.f104062W, this.f104064Y);
                }
            } finally {
            }
        }
    }

    /* renamed from: z0 */
    public void m110645z0(Bitmap bitmap) {
        m110641A0(bitmap, null);
    }

    public C21354i(int i11, int i12, int i13, int i14, float f11, Bitmap bitmap, String str) {
        this(i13, i14, f11, 0.0f, bitmap, str);
        this.f104060U = i11;
        this.f104061V = i12;
    }

    public C21354i(int i11, int i12, float f11, float f12, Bitmap bitmap, String str) {
        super(i11, i12, f11, f12);
        this.f104062W = -1;
        this.f104065Z = new Object();
        m110641A0(bitmap, str);
    }
}
