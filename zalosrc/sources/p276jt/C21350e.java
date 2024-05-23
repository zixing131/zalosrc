package p276jt;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import et.AbstractC18594a;
import et.C18610q;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: jt.e */
/* loaded from: classes4.dex */
public class C21350e {

    /* renamed from: b */
    protected FloatBuffer f104014b;

    /* renamed from: c */
    protected FloatBuffer f104015c;

    /* renamed from: d */
    protected ShortBuffer f104016d;

    /* renamed from: e */
    protected short[] f104017e;

    /* renamed from: a */
    protected boolean f104013a = false;

    /* renamed from: f */
    protected int f104018f = -1;

    /* renamed from: g */
    protected boolean f104019g = true;

    /* renamed from: h */
    protected float f104020h = 1.0f;

    /* renamed from: i */
    Rect f104021i = new Rect();

    /* renamed from: a */
    public void m110592a() {
        m110593b();
    }

    /* renamed from: b */
    public void m110593b() {
        AbstractC26236a.m134898e(this.f104018f);
    }

    /* renamed from: c */
    float[] m110594c() {
        Rect rect = this.f104021i;
        float f11 = rect.left;
        float f12 = rect.right;
        float f13 = rect.bottom;
        float f14 = rect.top;
        PointF pointF = new PointF(f11, f14);
        PointF pointF2 = new PointF(f11, f13);
        PointF pointF3 = new PointF(f12, f13);
        PointF pointF4 = new PointF(f12, f14);
        return new float[]{pointF.x, pointF.y, 0.0f, pointF2.x, pointF2.y, 0.0f, pointF3.x, pointF3.y, 0.0f, pointF4.x, pointF4.y, 0.0f};
    }

    /* renamed from: d */
    void m110595d() {
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-16777216);
        int m98198e = AbstractC18594a.m98198e(createBitmap, null);
        this.f104018f = m98198e;
        if (m98198e > -1) {
            this.f104020h = 1.0f;
            this.f104013a = true;
            this.f104017e = new short[]{0, 1, 2, 0, 2, 3};
            this.f104014b = AbstractC26237b.m134918c(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f});
            this.f104016d = AbstractC26237b.m134919d(this.f104017e);
            this.f104015c = AbstractC26237b.m134917b(m110594c().length);
        }
    }

    /* renamed from: e */
    public void m110596e() {
        m110598g(false);
        m110592a();
    }

    /* renamed from: f */
    public void m110597f(float[] fArr, C18610q c18610q) {
        if (this.f104019g) {
            if (!this.f104013a) {
                m110595d();
            }
            if (this.f104013a) {
                if (this.f104020h < 1.0f) {
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                } else {
                    GLES20.glDisable(3042);
                }
                GLES20.glUseProgram(c18610q.f93578a);
                GLES20.glEnableVertexAttribArray(c18610q.f93581d);
                GLES20.glEnableVertexAttribArray(c18610q.f93582e);
                GLES20.glVertexAttribPointer(c18610q.f93581d, 3, 5126, false, 0, (Buffer) m110600i());
                GLES20.glVertexAttribPointer(c18610q.f93582e, 2, 5126, false, 0, (Buffer) this.f104014b);
                GLES20.glUniform1f(c18610q.f93587j, this.f104020h);
                GLES20.glUniformMatrix4fv(c18610q.f93580c, 1, false, fArr, 0);
                GLES20.glUniform1i(c18610q.f93583f, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f104018f);
                GLES20.glDrawElements(4, this.f104017e.length, 5123, this.f104016d);
                GLES20.glDisableVertexAttribArray(c18610q.f93581d);
                GLES20.glDisableVertexAttribArray(c18610q.f93582e);
                GLES20.glBindTexture(3553, 0);
            }
        }
    }

    /* renamed from: g */
    public void m110598g(boolean z11) {
        this.f104013a = z11;
    }

    /* renamed from: h */
    public void m110599h(int i11, int i12, int i13, int i14) {
        Rect rect = this.f104021i;
        rect.left = i11;
        rect.top = i12;
        rect.right = i13;
        rect.bottom = i14;
    }

    /* renamed from: i */
    FloatBuffer m110600i() {
        this.f104015c.clear();
        this.f104015c.put(m110594c());
        this.f104015c.position(0);
        return this.f104015c;
    }
}
