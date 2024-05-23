package p276jt;

import ag.AbstractC0784d;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.zing.zalo.imgdecor.model.model.PaintData;
import et.C18610q;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import me0.AbstractC23140m2;
import p305kt.InterfaceC21942b;
import p575vf.C27998a;
import p643xf.C29609b;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: jt.c */
/* loaded from: classes4.dex */
public class C21348c extends AbstractC0784d {

    /* renamed from: F */
    private float[] f103965F;

    /* renamed from: G */
    private float[] f103966G;

    /* renamed from: H */
    private float[] f103967H;

    /* renamed from: I */
    private C27998a f103968I;

    /* renamed from: J */
    private FloatBuffer f103969J;

    /* renamed from: K */
    protected FloatBuffer f103970K;

    /* renamed from: L */
    private C29609b f103971L;

    /* renamed from: M */
    private RectF f103972M;

    /* renamed from: N */
    private float[] f103973N;

    /* renamed from: O */
    private PaintData.Position f103974O;

    /* renamed from: P */
    private PaintData.Position f103975P;

    /* renamed from: Q */
    private PaintData.Position f103976Q;

    /* renamed from: R */
    private PaintData.Position f103977R;

    /* renamed from: S */
    private int f103978S;

    /* renamed from: T */
    private int f103979T;

    /* renamed from: U */
    private float f103980U;

    /* renamed from: V */
    private float f103981V;

    /* renamed from: W */
    private float f103982W;

    /* renamed from: X */
    private float f103983X;

    /* renamed from: Y */
    private float f103984Y;

    /* renamed from: Z */
    private int f103985Z;

    /* renamed from: a0 */
    private final Object f103986a0;

    /* renamed from: b0 */
    private C21347b[] f103987b0;

    /* renamed from: c0 */
    private int f103988c0;

    /* renamed from: d0 */
    private float f103989d0;

    /* renamed from: e0 */
    private VelocityTracker f103990e0;

    /* renamed from: f0 */
    private PaintData f103991f0;

    /* renamed from: g0 */
    private Queue f103992g0;

    /* renamed from: h0 */
    private int f103993h0;

    /* renamed from: i0 */
    private PaintData f103994i0;

    /* renamed from: j0 */
    private Path f103995j0;

    /* renamed from: k0 */
    private float f103996k0;

    /* renamed from: l0 */
    private float f103997l0;

    /* renamed from: m0 */
    private float[] f103998m0;

    /* renamed from: n0 */
    private float f103999n0;

    /* renamed from: o0 */
    private final List f104000o0;

    /* renamed from: p0 */
    private InterfaceC21942b f104001p0;

    /* renamed from: q0 */
    private Path f104002q0;

    /* renamed from: r0 */
    private PathMeasure f104003r0;

    /* renamed from: s0 */
    private float f104004s0;

    /* renamed from: t0 */
    private float f104005t0;

    /* renamed from: u0 */
    private float[] f104006u0;

    public C21348c() {
        this.f103965F = new float[16];
        this.f103966G = new float[16];
        this.f103967H = new float[16];
        this.f103972M = new RectF(-3.0f, -3.0f, 3.0f, 3.0f);
        this.f103973N = new float[8];
        this.f103974O = new PaintData.Position();
        this.f103975P = new PaintData.Position();
        this.f103976Q = new PaintData.Position();
        this.f103977R = new PaintData.Position();
        this.f103985Z = 0;
        this.f103986a0 = new Object();
        this.f103990e0 = null;
        this.f103991f0 = new PaintData();
        this.f103992g0 = new LinkedBlockingQueue();
        this.f103993h0 = -1;
        this.f103994i0 = new PaintData();
        this.f103995j0 = new Path();
        this.f103998m0 = new float[]{0.0f, 0.0f};
        this.f104000o0 = new ArrayList();
        this.f104002q0 = new Path();
        this.f104004s0 = 0.0f;
        this.f104005t0 = 0.0f;
        this.f104006u0 = new float[]{0.0f, 0.0f};
    }

    /* renamed from: b0 */
    private void m110563b0(int i11, int i12) {
        Matrix.orthoM(this.f103965F, 0, 0.0f, i11, 0.0f, i12, 0.0f, 100.0f);
        Matrix.setLookAtM(this.f103966G, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(this.f103967H, 0, this.f103965F, 0, this.f103966G, 0);
    }

    /* renamed from: f0 */
    private float m110564f0(C21347b c21347b) {
        if (c21347b.f103955F == 1) {
            return 0.4f;
        }
        return 1.0f;
    }

    /* renamed from: g0 */
    private C21347b m110565g0() {
        C21347b c21347b;
        synchronized (this.f103986a0) {
            c21347b = this.f103987b0[this.f103985Z];
        }
        return c21347b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m110566h0(C21347b c21347b, C18610q c18610q, List list, boolean z11) {
        int i11;
        int i12;
        C29609b c29609b;
        int i13;
        int i14;
        if (!c21347b.mo1997z()) {
            c21347b.m1995x();
        }
        c21347b.m1946J();
        int i15 = 3;
        if (c21347b.f103955F != 3) {
            GLES20.glUseProgram(c18610q.f93578a);
            GLES20.glEnableVertexAttribArray(c18610q.f93581d);
            GLES20.glEnableVertexAttribArray(c18610q.f93582e);
            GLES20.glVertexAttribPointer(c18610q.f93582e, 2, 5126, false, 0, (Buffer) this.f103970K);
            GLES20.glUniformMatrix4fv(c18610q.f93580c, 1, false, this.f103967H, 0);
            GLES20.glUniform1f(c18610q.f93587j, 1.0f);
            GLES20.glUniform1i(c18610q.f93583f, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
        }
        int i16 = c21347b.f103955F;
        if (i16 != 0 && i16 != 1) {
            if (i16 == 2) {
                if (z11) {
                    GLES20.glBindTexture(3553, c21347b.m110562l());
                } else {
                    GLES20.glBindTexture(3553, c21347b.m110560c0());
                }
            }
        } else {
            GLES20.glBindTexture(3553, c21347b.m110562l());
        }
        System.currentTimeMillis();
        if (c21347b.f103955F == 2) {
            if (z11) {
                m110567r0(c21347b, ((c21347b.f103959J * 70.0f) / 100.0f) + 17.0f, this.f103978S);
                i11 = 3;
                i12 = 0;
                int i17 = 0;
                while (i12 < list.size()) {
                    PaintData.Position position = (PaintData.Position) list.get(i12);
                    if (i12 > 0) {
                        double m118806c = AbstractC23140m2.m118806c((PaintData.Position) list.get(i17), position);
                        i13 = i12;
                        if (m118806c >= (r13.f47741r + position.f47741r) / 7.5f || m118806c >= 10.0f || ((i14 = c21347b.f103955F) != 0 && i14 != 2)) {
                            i17 = i13;
                        }
                        i12 = i13 + i11;
                        i15 = 3;
                    } else {
                        i13 = i12;
                    }
                    int i18 = c21347b.f103955F;
                    if (i18 == i15) {
                        C29609b c29609b2 = this.f103971L;
                        if (c29609b2 != null) {
                            c29609b2.m147177b0(position);
                        }
                    } else if (i18 == 4) {
                        this.f103984Y += 1.5f;
                        GLES20.glBindTexture(3553, c21347b.m110562l());
                        GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110569u0(position.f47739p, position.f47740q, this.f103984Y));
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glBindTexture(3553, c21347b.m110560c0());
                        GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110569u0(position.f47739p, position.f47740q, 0.0f));
                        GLES20.glDrawArrays(5, 0, 4);
                    } else {
                        if (i18 == 1) {
                            GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110569u0(position.f47739p, position.f47740q, 0.0f));
                            GLES20.glDrawArrays(5, 0, 4);
                        } else if (i18 == 2) {
                            GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110569u0(position.f47739p, position.f47740q, 0.0f));
                            GLES20.glDrawArrays(5, 0, 4);
                        } else if (i18 == 0) {
                            m110567r0(c21347b, position.f47741r, this.f103978S);
                            GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110569u0(position.f47739p, position.f47740q, 0.0f));
                            GLES20.glDrawArrays(5, 0, 4);
                        }
                        i12 = i13 + i11;
                        i15 = 3;
                    }
                    i12 = i13 + i11;
                    i15 = 3;
                }
                if (c21347b.f103955F != 3) {
                    GLES20.glDisableVertexAttribArray(c18610q.f93581d);
                    GLES20.glDisableVertexAttribArray(c18610q.f93582e);
                    GLES20.glBindTexture(3553, 0);
                }
                c29609b = this.f103971L;
                if (c29609b == null && c29609b.m147178c0()) {
                    this.f103971L.m1946J();
                    return;
                }
            }
            m110567r0(c21347b, c21347b.f103959J, this.f103978S);
        }
        i11 = 1;
        i12 = 0;
        int i172 = 0;
        while (i12 < list.size()) {
        }
        if (c21347b.f103955F != 3) {
        }
        c29609b = this.f103971L;
        if (c29609b == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:            if (r3 == 3) goto L4;     */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m110567r0(C21347b c21347b, float f11, int i11) {
        int i12 = c21347b.f103955F;
        if (i12 != 0 && i12 != 1) {
            if (i12 == 2) {
                f11 = (i11 * f11) / 350.0f;
            } else if (i12 == 4) {
                float f12 = i11;
                f11 = (f12 / 25.0f) + ((f12 * f11) / 800.0f);
            }
            float width = f11 / this.f103972M.width();
            RectF rectF = this.f103972M;
            this.f103980U = rectF.left * width;
            this.f103981V = rectF.right * width;
            this.f103982W = rectF.top * width;
            this.f103983X = rectF.bottom * width;
        }
        f11 = (i11 * f11) / 700.0f;
        float width2 = f11 / this.f103972M.width();
        RectF rectF2 = this.f103972M;
        this.f103980U = rectF2.left * width2;
        this.f103981V = rectF2.right * width2;
        this.f103982W = rectF2.top * width2;
        this.f103983X = rectF2.bottom * width2;
    }

    /* renamed from: s0 */
    private void m110568s0(C21347b c21347b, float f11, int... iArr) {
        int i11;
        if (c21347b != null) {
            c21347b.f103959J = f11;
            if (iArr != null && iArr.length == 1 && (i11 = iArr[0]) > 0) {
                m110567r0(c21347b, f11, i11);
                return;
            }
            int i12 = this.f103978S;
            if (i12 > 0) {
                m110567r0(c21347b, f11, i12);
            }
        }
    }

    /* renamed from: u0 */
    private FloatBuffer m110569u0(float f11, float f12, float f13) {
        double radians = Math.toRadians(f13);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        PaintData.Position position = this.f103974O;
        float f14 = this.f103980U;
        float f15 = this.f103982W;
        position.f47739p = (f14 * cos) - (f15 * sin);
        position.f47740q = (f14 * sin) + (f15 * cos);
        PaintData.Position position2 = this.f103975P;
        float f16 = this.f103981V;
        position2.f47739p = (f16 * cos) - (f15 * sin);
        position2.f47740q = (f16 * sin) + (f15 * cos);
        PaintData.Position position3 = this.f103976Q;
        float f17 = this.f103983X;
        position3.f47739p = (f14 * cos) - (f17 * sin);
        position3.f47740q = (f14 * sin) + (f17 * cos);
        PaintData.Position position4 = this.f103977R;
        position4.f47739p = (f16 * cos) - (f17 * sin);
        position4.f47740q = (f16 * sin) + (f17 * cos);
        position.f47739p += f11;
        position.f47740q += f12;
        position2.f47739p += f11;
        position2.f47740q += f12;
        position3.f47739p += f11;
        position3.f47740q += f12;
        float f18 = position4.f47739p + f11;
        position4.f47739p = f18;
        float f19 = position4.f47740q + f12;
        position4.f47740q = f19;
        float[] fArr = this.f103973N;
        fArr[0] = position.f47739p;
        fArr[1] = position.f47740q;
        fArr[2] = position2.f47739p;
        fArr[3] = position2.f47740q;
        fArr[4] = position3.f47739p;
        fArr[5] = position3.f47740q;
        fArr[6] = f18;
        fArr[7] = f19;
        this.f103969J.clear();
        this.f103969J.put(this.f103973N);
        this.f103969J.position(0);
        return this.f103969J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        C27998a c27998a = this.f103968I;
        if (c27998a != null) {
            AbstractC26236a.m134900g(c27998a);
            this.f103968I = null;
        }
        this.f103971L = null;
        synchronized (this.f103986a0) {
            try {
                for (C21347b c21347b : this.f103987b0) {
                    c21347b.destroy();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        if (this.f103978S != 0 && this.f103979T != 0) {
            C27998a c27998a = this.f103968I;
            if (c27998a != null) {
                AbstractC26236a.m134900g(c27998a);
                this.f103968I = null;
            }
            this.f103968I = AbstractC26236a.m134906m(this.f103978S, this.f103979T);
            synchronized (this.f103986a0) {
                try {
                    for (C21347b c21347b : this.f103987b0) {
                        c21347b.m1995x();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        int i11;
        super.mo1897S(z11);
        int i12 = this.f103978S;
        if (i12 != 0 && (i11 = this.f103979T) != 0) {
            m110563b0(i12, i11);
            this.f103970K = AbstractC26237b.m134918c(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
            this.f103969J = AbstractC26237b.m134917b(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m110570a0(C18610q c18610q, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        C21347b m110565g0 = m110565g0();
        if (m110565g0.f103955F == 1) {
            c18610q.m98343b(this.f103968I.m141113g(), floatBuffer, floatBuffer2, m110564f0(m110565g0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m110571c0() {
        this.f103968I.m141108a();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        this.f103968I.m141115j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public PaintData m110572d0(PaintData paintData) {
        float max;
        PaintData paintData2 = new PaintData(paintData.f47735r, paintData.f47736s, paintData.mo47636c());
        this.f104002q0.reset();
        float mo47636c = paintData2.mo47636c();
        float f11 = 0.0f;
        boolean z11 = true;
        float f12 = 0.0f;
        for (PaintData.Position position : paintData.f47738u) {
            char c11 = 0;
            if (z11) {
                float f13 = position.f47739p;
                this.f104004s0 = f13;
                float f14 = position.f47740q;
                this.f104005t0 = f14;
                this.f104002q0.moveTo(f13, f14);
                PathMeasure pathMeasure = new PathMeasure(this.f104002q0, false);
                this.f104003r0 = pathMeasure;
                f12 = pathMeasure.getLength();
                z11 = false;
            } else {
                Path path = this.f104002q0;
                float f15 = this.f104004s0;
                float f16 = this.f104005t0;
                path.quadTo(f15, f16, (position.f47739p + f15) / 2.0f, (position.f47740q + f16) / 2.0f);
                this.f104004s0 = position.f47739p;
                this.f104005t0 = position.f47740q;
                PathMeasure pathMeasure2 = new PathMeasure(this.f104002q0, false);
                this.f104003r0 = pathMeasure2;
                float length = pathMeasure2.getLength();
                int i11 = paintData2.f47735r;
                float[] fArr = null;
                if (i11 == 0) {
                    float f17 = position.f47741r;
                    float mo47636c2 = paintData.mo47636c();
                    if (f17 > 3000.0f) {
                        mo47636c2 = paintData2.mo47636c() / (((f17 - 3000.0f) / 10000.0f) + 1.0f);
                        float mo47636c3 = paintData2.mo47636c() * 0.5f;
                        if (mo47636c2 < mo47636c3) {
                            mo47636c2 = mo47636c3;
                        }
                    }
                    float f18 = (mo47636c2 - mo47636c) / ((length - f12) + 1.0f);
                    if (f18 > f11) {
                        max = Math.min(f18, 0.3f);
                    } else {
                        max = Math.max(f18, -0.3f);
                    }
                    float f19 = f12;
                    while (f19 < length) {
                        this.f104003r0.getPosTan(f19, this.f104006u0, fArr);
                        mo47636c += max;
                        float[] fArr2 = this.f104006u0;
                        paintData2.m47639i(new PaintData.Position(fArr2[0], fArr2[1], mo47636c));
                        f19 += 1.0f;
                        fArr = null;
                    }
                } else if (i11 == 3) {
                    float mo47636c4 = paintData2.mo47636c() + 20.0f;
                    float f21 = mo47636c4 / 2.5f;
                    for (float f22 = f12; f22 < length; f22 += f21) {
                        this.f104003r0.getPosTan(f22, this.f104006u0, null);
                        float[] fArr3 = this.f104006u0;
                        paintData2.m47639i(new PaintData.Position(fArr3[0], fArr3[1], mo47636c4));
                    }
                } else {
                    float f23 = f12;
                    while (f23 < length) {
                        this.f104003r0.getPosTan(f23, this.f104006u0, null);
                        float[] fArr4 = this.f104006u0;
                        paintData2.m47639i(new PaintData.Position(fArr4[c11], fArr4[1], paintData2.mo47636c()));
                        f23 += 1.0f;
                        c11 = 0;
                    }
                }
                if (f12 == length) {
                    paintData2.m47639i(new PaintData.Position(position.f47739p, position.f47740q, mo47636c));
                } else {
                    f12 = length;
                }
            }
            f11 = 0.0f;
        }
        return paintData2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public void m110573e0(C27998a c27998a, C18610q c18610q, FloatBuffer floatBuffer) {
        C21347b m110565g0 = m110565g0();
        this.f104000o0.clear();
        while (this.f103992g0.peek() != null) {
            this.f104000o0.add((PaintData.Position) this.f103992g0.poll());
        }
        float m110564f0 = m110564f0(m110565g0);
        if (m110565g0.f103955F == 1) {
            this.f103968I.m141108a();
            if (this.f103993h0 == 0) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.f103993h0 = -1;
            }
            m110566h0(m110565g0, c18610q, this.f104000o0, true);
            this.f103968I.m141115j();
            if (this.f103993h0 == 1) {
                this.f103993h0 = -1;
                c27998a.m141108a();
                c18610q.m98343b(this.f103968I.m141113g(), this.f103970K, floatBuffer, m110564f0);
                m110571c0();
                c27998a.m141115j();
                return;
            }
            return;
        }
        c27998a.m141108a();
        m110566h0(m110565g0, c18610q, this.f104000o0, true);
        if (m110565g0.f103955F == 2) {
            this.f103968I.m141108a();
            if (this.f103993h0 == 0) {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.f103993h0 = -1;
            }
            m110566h0(m110565g0, c18610q, this.f104000o0, false);
            this.f103968I.m141115j();
            c18610q.m98343b(this.f103968I.m141113g(), this.f103970K, floatBuffer, m110564f0);
        }
        c27998a.m141115j();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x019b A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:49:0x009d, B:51:0x00a1, B:53:0x00cd, B:57:0x00e1, B:59:0x00ec, B:63:0x0102, B:29:0x0189, B:31:0x019b, B:33:0x019f, B:34:0x01a6, B:35:0x01a9, B:66:0x00f7, B:21:0x012c, B:23:0x0131, B:26:0x0142, B:46:0x0164), top: B:48:0x009d }] */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m110574i0(MotionEvent motionEvent, float f11, float f12) {
        float max;
        int i11;
        C21347b m110565g0 = m110565g0();
        float f13 = this.f103978S * f11;
        float f14 = this.f103979T * f12;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        int action = motionEvent.getAction();
        char c11 = 0;
        if (action != 0) {
            if (action == 1 || action == 2 || action == 3) {
                float length = new PathMeasure(this.f103995j0, false).getLength();
                if (Math.abs(f13 - this.f103996k0) < 4.0f && Math.abs(f14 - this.f103997l0) < 4.0f) {
                    if (motionEvent.getAction() != 2) {
                        this.f103995j0.lineTo(this.f103996k0 + 1.0f, this.f103997l0 + 1.0f);
                    }
                } else {
                    if (this.f103995j0.isEmpty()) {
                        this.f103995j0.moveTo(f13, f14);
                    } else {
                        Path path = this.f103995j0;
                        float f15 = this.f103996k0;
                        float f16 = this.f103997l0;
                        path.quadTo(f15, f16, (f13 + f15) / 2.0f, (f14 + f16) / 2.0f);
                    }
                    this.f103996k0 = f13;
                    this.f103997l0 = f14;
                }
                PathMeasure pathMeasure = new PathMeasure(this.f103995j0, false);
                float length2 = pathMeasure.getLength();
                synchronized (this.f103986a0) {
                    if (m110565g0 != null) {
                        try {
                            if (m110565g0.f103955F == 0) {
                                this.f103990e0.addMovement(motionEvent);
                                this.f103990e0.computeCurrentVelocity(1000);
                                int max2 = Math.max(Math.abs((int) this.f103990e0.getXVelocity(pointerId)), Math.abs((int) this.f103990e0.getYVelocity(pointerId)));
                                float f17 = m110565g0.f103959J;
                                if (max2 > 3000) {
                                    max2 -= 3000;
                                    float f18 = f17 / ((max2 / 10000.0f) + 1.0f);
                                    f17 *= 0.5f;
                                    if (f18 >= f17) {
                                        f17 = f18;
                                    }
                                }
                                float f19 = (f17 - this.f103999n0) / ((length2 - length) + 1.0f);
                                if (f19 > 0.0f) {
                                    max = Math.min(f19, 0.3f);
                                } else {
                                    max = Math.max(f19, -0.3f);
                                }
                                while (length < length2) {
                                    pathMeasure.getPosTan(length, this.f103998m0, null);
                                    this.f103999n0 += max;
                                    float[] fArr = this.f103998m0;
                                    PaintData.Position position = new PaintData.Position(fArr[c11], fArr[1], this.f103999n0);
                                    this.f103992g0.add(position);
                                    this.f103991f0.m47639i(position);
                                    length += 1.0f;
                                    c11 = 0;
                                }
                                i11 = max2;
                                this.f103994i0.m47639i(new PaintData.Position(f13, f14, i11));
                                if (motionEvent.getAction() != 2) {
                                    InterfaceC21942b interfaceC21942b = this.f104001p0;
                                    if (interfaceC21942b != null) {
                                        interfaceC21942b.mo110687e(this.f103991f0, this.f103994i0);
                                    }
                                    this.f103993h0 = 1;
                                }
                            }
                        } finally {
                        }
                    }
                    if (m110565g0 != null && m110565g0.f103955F == 3) {
                        float mo47636c = this.f103991f0.mo47636c() + 20.0f;
                        float f21 = mo47636c / 2.5f;
                        while (length < length2) {
                            pathMeasure.getPosTan(length, this.f103998m0, null);
                            float[] fArr2 = this.f103998m0;
                            PaintData.Position position2 = new PaintData.Position(fArr2[0], fArr2[1], mo47636c);
                            this.f103992g0.add(position2);
                            this.f103991f0.m47639i(position2);
                            length += f21;
                        }
                    } else {
                        while (length < length2) {
                            pathMeasure.getPosTan(length, this.f103998m0, null);
                            float[] fArr3 = this.f103998m0;
                            PaintData.Position position3 = new PaintData.Position(fArr3[0], fArr3[1], this.f103991f0.mo47636c());
                            this.f103992g0.add(position3);
                            this.f103991f0.m47639i(position3);
                            length += 1.0f;
                        }
                    }
                    i11 = 0;
                    this.f103994i0.m47639i(new PaintData.Position(f13, f14, i11));
                    if (motionEvent.getAction() != 2) {
                    }
                }
                return;
            }
            return;
        }
        this.f103996k0 = f13;
        this.f103997l0 = f14;
        this.f103995j0.reset();
        this.f103995j0.moveTo(f13, f14);
        this.f103991f0 = new PaintData(m110565g0.f103955F, m110565g0.f103958I, m110565g0.f103959J);
        PaintData paintData = new PaintData(m110565g0.f103955F, m110565g0.f103958I, m110565g0.f103959J);
        this.f103994i0 = paintData;
        paintData.m47639i(new PaintData.Position(f13, f14, 0.0f));
        this.f103984Y = 0.0f;
        this.f103993h0 = 0;
        if (m110565g0.f103955F == 0) {
            this.f103999n0 = m110565g0.f103959J;
            VelocityTracker velocityTracker = this.f103990e0;
            if (velocityTracker == null) {
                this.f103990e0 = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f103990e0.addMovement(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void m110575j0(PaintData paintData, C18610q c18610q, FloatBuffer floatBuffer) {
        C21347b c21347b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("redrawPath() with ");
        sb2.append(paintData.f47738u.size());
        sb2.append(" points of type ");
        sb2.append(paintData.f47735r);
        synchronized (this.f103986a0) {
            c21347b = this.f103987b0[paintData.f47735r];
        }
        m110568s0(c21347b, paintData.mo47636c(), new int[0]);
        c21347b.m110561d0(paintData.f47736s);
        float m110564f0 = m110564f0(c21347b);
        this.f103984Y = 0.0f;
        if (c21347b.f103955F == 1) {
            this.f103968I.m141108a();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            m110566h0(c21347b, c18610q, paintData.f47738u, true);
            this.f103968I.m141115j();
            c18610q.m98343b(this.f103968I.m141113g(), this.f103970K, floatBuffer, m110564f0);
            return;
        }
        m110566h0(c21347b, c18610q, paintData.f47738u, true);
        if (c21347b.f103955F == 2) {
            this.f103968I.m141108a();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            m110566h0(c21347b, c18610q, paintData.f47738u, false);
            this.f103968I.m141115j();
            c18610q.m98343b(this.f103968I.m141113g(), this.f103970K, floatBuffer, m110564f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void m110576k0() {
        C21347b m110565g0 = m110565g0();
        m110568s0(m110565g0, this.f103989d0, new int[0]);
        m110565g0.m110561d0(this.f103988c0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void m110577l0(C29609b c29609b) {
        this.f103971L = c29609b;
    }

    /* renamed from: m0 */
    public void m110578m0(C21347b[] c21347bArr) {
        synchronized (this.f103986a0) {
            this.f103987b0 = c21347bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void m110579n0(int i11) {
        this.f103988c0 = i11;
        m110565g0().m110561d0(i11);
    }

    /* renamed from: o0 */
    public void m110580o0(int i11) {
        int i12;
        float f11;
        synchronized (this.f103986a0) {
            try {
                C21347b m110565g0 = m110565g0();
                if (m110565g0 != null) {
                    i12 = m110565g0.f103958I;
                    f11 = m110565g0.f103959J;
                } else {
                    i12 = -65536;
                    f11 = 50.0f;
                }
                this.f103985Z = i11;
                C21347b m110565g02 = m110565g0();
                if (m110565g02 != null) {
                    float m110559b0 = m110565g02.m110559b0() / 2.0f;
                    float m110558a0 = m110565g02.m110558a0() / 2.0f;
                    RectF rectF = this.f103972M;
                    float f12 = -m110559b0;
                    rectF.left = f12;
                    float f13 = -m110558a0;
                    rectF.top = f13;
                    rectF.right = m110559b0;
                    rectF.bottom = m110558a0;
                    this.f103980U = f12;
                    this.f103981V = m110559b0;
                    this.f103982W = f13;
                    this.f103983X = m110558a0;
                    m110568s0(m110565g02, f11, new int[0]);
                    m110565g02.m110561d0(i12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void m110581p0(int i11, int i12) {
        if (this.f103978S != i11 || this.f103979T != i12) {
            this.f103978S = i11;
            this.f103979T = i12;
            mo1956Z(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m110582q0(float f11, int... iArr) {
        this.f103989d0 = f11;
        m110568s0(m110565g0(), f11, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void m110583t0(InterfaceC21942b interfaceC21942b) {
        this.f104001p0 = interfaceC21942b;
    }

    public C21348c(C21347b[] c21347bArr) {
        this.f103965F = new float[16];
        this.f103966G = new float[16];
        this.f103967H = new float[16];
        this.f103972M = new RectF(-3.0f, -3.0f, 3.0f, 3.0f);
        this.f103973N = new float[8];
        this.f103974O = new PaintData.Position();
        this.f103975P = new PaintData.Position();
        this.f103976Q = new PaintData.Position();
        this.f103977R = new PaintData.Position();
        this.f103985Z = 0;
        this.f103986a0 = new Object();
        this.f103990e0 = null;
        this.f103991f0 = new PaintData();
        this.f103992g0 = new LinkedBlockingQueue();
        this.f103993h0 = -1;
        this.f103994i0 = new PaintData();
        this.f103995j0 = new Path();
        this.f103998m0 = new float[]{0.0f, 0.0f};
        this.f104000o0 = new ArrayList();
        this.f104002q0 = new Path();
        this.f104004s0 = 0.0f;
        this.f104005t0 = 0.0f;
        this.f104006u0 = new float[]{0.0f, 0.0f};
        m110578m0(c21347bArr);
    }
}
