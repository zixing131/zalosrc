package p276jt;

import ag.C0789i;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import et.C18610q;
import im.C20612c;
import im.C20622m;
import java.nio.Buffer;
import org.json.JSONObject;
import p148f3.C18711c;
import se0.AbstractC26237b;

/* renamed from: jt.d */
/* loaded from: classes4.dex */
public class C21349d extends AbstractC21351f {

    /* renamed from: U */
    public int f104007U;

    /* renamed from: V */
    public int f104008V;

    /* renamed from: W */
    private int f104009W;

    /* renamed from: X */
    private int f104010X;

    /* renamed from: Y */
    private C0789i f104011Y;

    /* renamed from: Z */
    private Bitmap f104012Z;

    public C21349d() {
        this(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        this.f104027K = AbstractC26237b.m134917b(8);
        float[] fArr = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        int i11 = this.f104009W;
        fArr[0] = (i11 * 77.0f) / 765.0f;
        int i12 = this.f104010X;
        fArr[1] = ((i12 * 77.0f) + 72.0f) / 688.0f;
        fArr[2] = ((i11 * 77.0f) + 72.0f) / 765.0f;
        fArr[3] = ((i12 * 77.0f) + 72.0f) / 688.0f;
        fArr[4] = (i11 * 77.0f) / 765.0f;
        fArr[5] = (i12 * 77.0f) / 688.0f;
        fArr[6] = ((i11 * 77.0f) + 72.0f) / 765.0f;
        fArr[7] = (i12 * 77.0f) / 688.0f;
        this.f104026J = AbstractC26237b.m134918c(fArr);
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: d0 */
    public JSONObject mo110584d0() {
        JSONObject mo110584d0 = super.mo110584d0();
        mo110584d0.put(C18711c.f94014e, this.f104009W);
        mo110584d0.put("r", this.f104010X);
        return mo110584d0;
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: k0 */
    protected void mo110585k0(float[] fArr, C18610q c18610q) {
        C0789i c0789i;
        int m1988G;
        if (!this.f104035S || (c0789i = this.f104011Y) == null || (m1988G = c0789i.m1988G()) == -1) {
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
        GLES20.glBindTexture(3553, m1988G);
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
        this.f104009W = jSONObject.optInt(C18711c.f94014e);
        int optInt = jSONObject.optInt("r");
        this.f104010X = optInt;
        m110591z0(optInt, this.f104009W);
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: v0 */
    public void mo110587v0(C20612c c20612c) {
        c20612c.m107300x().add(new C20622m(this.f104007U, this.f104008V));
    }

    /* renamed from: w0 */
    public Bitmap m110588w0() {
        return this.f104012Z;
    }

    /* renamed from: x0 */
    public void m110589x0(Bitmap bitmap) {
        this.f104012Z = bitmap;
    }

    /* renamed from: y0 */
    public void m110590y0(C0789i c0789i) {
        this.f104011Y = c0789i;
    }

    /* renamed from: z0 */
    public void m110591z0(int i11, int i12) {
        this.f104010X = i11;
        this.f104009W = i12;
    }

    public C21349d(int i11, int i12) {
        this(i11, i12, 1.0f, 0.0f);
    }

    public C21349d(int i11, int i12, float f11, float f12) {
        super(i11, i12, f11, f12);
        m110612o0(72, 72);
        this.f104029M = new Rect(-32, 32, 32, -32);
    }
}
