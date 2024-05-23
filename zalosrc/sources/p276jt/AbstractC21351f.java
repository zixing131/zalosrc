package p276jt;

import ag.AbstractC0784d;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import et.C18610q;
import im.C20612c;
import java.nio.FloatBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import p227i3.AbstractC20216t;
import se0.AbstractC26237b;

/* renamed from: jt.f */
/* loaded from: classes4.dex */
public abstract class AbstractC21351f extends AbstractC0784d {

    /* renamed from: F */
    protected float f104022F;

    /* renamed from: G */
    protected float f104023G;

    /* renamed from: H */
    protected float f104024H;

    /* renamed from: I */
    protected float f104025I;

    /* renamed from: J */
    protected FloatBuffer f104026J;

    /* renamed from: K */
    protected FloatBuffer f104027K;

    /* renamed from: L */
    protected RectF f104028L;

    /* renamed from: M */
    protected Rect f104029M;

    /* renamed from: N */
    protected float[] f104030N;

    /* renamed from: O */
    private final PointF f104031O;

    /* renamed from: P */
    private final PointF f104032P;

    /* renamed from: Q */
    private final PointF f104033Q;

    /* renamed from: R */
    private final PointF f104034R;

    /* renamed from: S */
    protected boolean f104035S;

    /* renamed from: T */
    protected boolean f104036T;

    public AbstractC21351f() {
        this.f104030N = new float[8];
        this.f104031O = new PointF();
        this.f104032P = new PointF();
        this.f104033Q = new PointF();
        this.f104034R = new PointF();
        this.f104035S = true;
        this.f104036T = true;
    }

    /* renamed from: l0 */
    public static AbstractC21351f m110601l0(JSONObject jSONObject) {
        AbstractC21351f abstractC21351f;
        String str = (String) jSONObject.get(AbstractC20216t.f99969a);
        if (str.equals(C21354i.class.getSimpleName())) {
            abstractC21351f = new C21354i();
        } else if (str.equals(C21357l.class.getSimpleName())) {
            abstractC21351f = new C21357l();
        } else if (str.equals(C21349d.class.getSimpleName())) {
            abstractC21351f = new C21349d();
        } else {
            abstractC21351f = null;
        }
        if (abstractC21351f != null) {
            abstractC21351f.mo110586m0(jSONObject);
        }
        return abstractC21351f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        mo1953W(1.0f);
        this.f104026J = AbstractC26237b.m134918c(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.f104027K = AbstractC26237b.m134917b(8);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
    }

    /* renamed from: a0 */
    public boolean mo110602a0(float f11, float f12, int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
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
            if (f15 > (f17 * f18) - f19 && f15 < (r7.right * f18) + f19 && f16 > (r7.bottom * f18) - f19) {
                if (f16 < (r7.top * f18) + f19) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: b0 */
    public void m110603b0(float[] fArr, C18610q c18610q) {
        if (!mo1997z()) {
            m1995x();
        }
        m1946J();
        mo110585k0(fArr, c18610q);
    }

    /* renamed from: c0 */
    public float m110604c0() {
        return this.f104025I;
    }

    /* renamed from: d0 */
    public JSONObject mo110584d0() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AbstractC20216t.f99969a, getClass().getSimpleName());
        jSONObject.put("x", this.f104022F);
        jSONObject.put("y", this.f104023G);
        jSONObject.put("sc", this.f104024H);
        jSONObject.put("a", this.f104025I);
        jSONObject.put("sh", this.f104035S);
        return jSONObject;
    }

    /* renamed from: e0 */
    public float m110605e0() {
        return this.f104024H;
    }

    /* renamed from: f0 */
    public float m110606f0() {
        return this.f104022F;
    }

    /* renamed from: g0 */
    public float m110607g0() {
        return this.f104023G;
    }

    /* renamed from: h0 */
    public void m110608h0() {
        this.f104035S = false;
    }

    /* renamed from: i0 */
    public boolean m110609i0() {
        return this.f104036T;
    }

    /* renamed from: j0 */
    public boolean m110610j0() {
        return this.f104035S;
    }

    /* renamed from: k0 */
    protected abstract void mo110585k0(float[] fArr, C18610q c18610q);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public void mo110586m0(JSONObject jSONObject) {
        try {
            this.f104022F = (float) jSONObject.getDouble("x");
            this.f104023G = (float) jSONObject.getDouble("y");
            this.f104024H = (float) jSONObject.getDouble("sc");
            this.f104025I = (float) jSONObject.getDouble("a");
            this.f104035S = jSONObject.getBoolean("sh");
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public void m110611n0(float f11) {
        this.f104025I = f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o0 */
    public void m110612o0(int i11, int i12) {
        float f11 = i11 / 2.0f;
        float f12 = i12 / 2.0f;
        this.f104028L = new RectF(-f11, -f12, f11, f12);
    }

    /* renamed from: p0 */
    public void mo97628p0(float f11) {
        if (f11 > 10.0f) {
            f11 = 10.0f;
        }
        this.f104024H = f11;
    }

    /* renamed from: q0 */
    public void m110613q0(boolean z11) {
        this.f104036T = z11;
    }

    /* renamed from: r0 */
    public void mo110614r0(float f11) {
        this.f104022F = f11;
    }

    /* renamed from: s0 */
    public void m110615s0(float f11) {
        this.f104023G = f11;
    }

    /* renamed from: t0 */
    public void m110616t0() {
        this.f104035S = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u0 */
    public FloatBuffer m110617u0() {
        try {
            RectF rectF = this.f104028L;
            if (rectF != null) {
                float f11 = rectF.left;
                float f12 = this.f104024H;
                float f13 = f11 * f12;
                float f14 = rectF.right * f12;
                float f15 = rectF.top * f12;
                float f16 = rectF.bottom * f12;
                double radians = Math.toRadians(this.f104025I);
                float sin = (float) Math.sin(radians);
                float cos = (float) Math.cos(radians);
                PointF pointF = this.f104031O;
                float f17 = f13 * cos;
                float f18 = f15 * sin;
                pointF.x = f17 - f18;
                float f19 = f13 * sin;
                float f21 = f15 * cos;
                pointF.y = f19 + f21;
                PointF pointF2 = this.f104032P;
                float f22 = f14 * cos;
                pointF2.x = f22 - f18;
                float f23 = f14 * sin;
                pointF2.y = f21 + f23;
                PointF pointF3 = this.f104033Q;
                float f24 = sin * f16;
                pointF3.x = f17 - f24;
                float f25 = f16 * cos;
                pointF3.y = f19 + f25;
                PointF pointF4 = this.f104034R;
                pointF4.x = f22 - f24;
                pointF4.y = f23 + f25;
                float f26 = pointF.x;
                float f27 = this.f104022F;
                pointF.x = f26 + f27;
                float f28 = pointF.y;
                float f29 = this.f104023G;
                pointF.y = f28 + f29;
                pointF2.x += f27;
                pointF2.y += f29;
                pointF3.x += f27;
                pointF3.y += f29;
                float f31 = pointF4.x + f27;
                pointF4.x = f31;
                float f32 = pointF4.y + f29;
                pointF4.y = f32;
                float[] fArr = this.f104030N;
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                fArr[2] = pointF2.x;
                fArr[3] = pointF2.y;
                fArr[4] = pointF3.x;
                fArr[5] = pointF3.y;
                fArr[6] = f31;
                fArr[7] = f32;
                this.f104027K.clear();
                this.f104027K.put(this.f104030N);
                this.f104027K.position(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f104027K;
    }

    /* renamed from: v0 */
    public void mo110587v0(C20612c c20612c) {
    }

    public AbstractC21351f(int i11, int i12, float f11, float f12) {
        this.f104030N = new float[8];
        this.f104031O = new PointF();
        this.f104032P = new PointF();
        this.f104033Q = new PointF();
        this.f104034R = new PointF();
        this.f104035S = true;
        this.f104036T = true;
        this.f104022F = i11;
        this.f104023G = i12;
        this.f104024H = f11;
        this.f104025I = f12;
    }
}
