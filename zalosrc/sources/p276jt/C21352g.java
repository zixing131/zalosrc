package p276jt;

import ag.AbstractC0784d;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.view.MotionEvent;
import com.zing.zalo.imgdecor.model.model.ArrowData;
import com.zing.zalo.imgdecor.model.model.CircleData;
import com.zing.zalo.imgdecor.model.model.RectData;
import et.C18610q;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import me0.AbstractC23140m2;
import mt.AbstractC23442b;
import p305kt.InterfaceC21942b;
import p370nt.C23934a;
import p403ot.C24549a;
import p403ot.C24550b;
import p403ot.C24553e;
import p575vf.C27998a;
import se0.AbstractC26236a;

/* renamed from: jt.g */
/* loaded from: classes4.dex */
public class C21352g extends AbstractC0784d {

    /* renamed from: F */
    private final Object f104037F;

    /* renamed from: G */
    private float[] f104038G;

    /* renamed from: H */
    private float[] f104039H;

    /* renamed from: I */
    private float[] f104040I;

    /* renamed from: J */
    private C27998a f104041J;

    /* renamed from: K */
    private C24553e f104042K;

    /* renamed from: L */
    private C24550b f104043L;

    /* renamed from: M */
    private C24549a f104044M;

    /* renamed from: N */
    private int f104045N;

    /* renamed from: O */
    private int f104046O;

    /* renamed from: P */
    private int f104047P;

    /* renamed from: Q */
    private C23934a[] f104048Q;

    /* renamed from: R */
    private int f104049R;

    /* renamed from: S */
    private float f104050S;

    /* renamed from: T */
    private float f104051T;

    /* renamed from: U */
    private float f104052U;

    /* renamed from: V */
    private float f104053V;

    /* renamed from: W */
    private Matrix f104054W;

    /* renamed from: X */
    private final float[] f104055X;

    /* renamed from: Y */
    private final Queue f104056Y;

    /* renamed from: Z */
    private final List f104057Z;

    /* renamed from: a0 */
    private InterfaceC21942b f104058a0;

    public C21352g() {
        this.f104037F = new Object();
        this.f104038G = new float[16];
        this.f104039H = new float[16];
        this.f104040I = new float[16];
        this.f104047P = 0;
        this.f104049R = -1;
        this.f104051T = -221296.0f;
        this.f104053V = -221296.0f;
        this.f104055X = new float[14];
        this.f104056Y = new LinkedBlockingQueue();
        this.f104057Z = new ArrayList();
    }

    /* renamed from: b0 */
    private void m110618b0(int i11, int i12) {
        android.opengl.Matrix.orthoM(this.f104038G, 0, 0.0f, i11, 0.0f, i12, 0.0f, 100.0f);
        android.opengl.Matrix.setLookAtM(this.f104039H, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        android.opengl.Matrix.multiplyMM(this.f104040I, 0, this.f104038G, 0, this.f104039H, 0);
    }

    /* renamed from: c0 */
    private void m110619c0() {
        this.f104053V = -221296.0f;
        this.f104052U = -221296.0f;
        this.f104051T = -221296.0f;
        this.f104050S = -221296.0f;
    }

    /* renamed from: e0 */
    private void m110620e0() {
        float[] fArr = C24549a.f118176p;
        float[] fArr2 = this.f104055X;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    /* renamed from: g0 */
    private AbstractC23442b m110621g0() {
        C23934a m110622h0 = m110622h0();
        int m125295c = m110622h0.m125295c();
        if (m125295c != 0) {
            if (m125295c != 1) {
                if (m125295c != 2 || !m110627m0(this.f104050S, this.f104051T, this.f104052U, this.f104053V)) {
                    return null;
                }
                RectData m47644m = RectData.m47644m(m110622h0.m125295c(), this.f104050S, this.f104051T, this.f104052U, this.f104053V);
                m47644m.m123105k(m110622h0.m125293a());
                m47644m.mo47637g(m110622h0.m125294b());
                return m47644m;
            }
            float m118804a = (float) AbstractC23140m2.m118804a(new PointF(this.f104050S, this.f104051T), new PointF(this.f104052U, this.f104053V));
            float m118807d = AbstractC23140m2.m118807d(this.f104050S, this.f104051T, this.f104052U, this.f104053V);
            float m125294b = (m110622h0.m125294b() + 10.0f) / 100.0f;
            if (!m110624j0(m118807d, m125294b)) {
                return null;
            }
            m110620e0();
            this.f104054W.reset();
            this.f104054W.postScale(m125294b, m125294b);
            this.f104054W.mapPoints(this.f104055X);
            float[] fArr = this.f104055X;
            float f11 = 0.0f - m118807d;
            fArr[2] = f11;
            fArr[0] = f11;
            this.f104054W.reset();
            this.f104054W.postRotate(360.0f - m118804a);
            this.f104054W.postTranslate(this.f104052U, this.f104053V);
            this.f104054W.mapPoints(this.f104055X);
            ArrowData m47622m = ArrowData.m47622m(m110622h0.m125295c(), this.f104055X);
            m47622m.m123105k(m110622h0.m125293a());
            m47622m.mo47637g(m110622h0.m125294b());
            return m47622m;
        }
        if (!m110625k0(this.f104050S, this.f104051T, this.f104052U, this.f104053V)) {
            return null;
        }
        CircleData m47630m = CircleData.m47630m(m110622h0.m125295c(), this.f104050S, this.f104051T, this.f104052U, this.f104053V);
        m47630m.m123105k(m110622h0.m125293a());
        m47630m.mo47637g(m110622h0.m125294b());
        return m47630m;
    }

    /* renamed from: h0 */
    private C23934a m110622h0() {
        C23934a c23934a;
        synchronized (this.f104037F) {
            c23934a = this.f104048Q[this.f104047P];
        }
        return c23934a;
    }

    /* renamed from: i0 */
    private void m110623i0() {
        if (this.f104042K == null) {
            this.f104042K = new C24553e();
        }
        if (this.f104043L == null) {
            this.f104043L = new C24550b();
        }
        if (this.f104044M == null) {
            this.f104044M = new C24549a();
        }
    }

    /* renamed from: j0 */
    private boolean m110624j0(float f11, float f12) {
        return f11 >= f12 * 100.0f;
    }

    /* renamed from: k0 */
    private boolean m110625k0(float f11, float f12, float f13, float f14) {
        if (Math.abs(f11 - f13) < 4.0f && Math.abs(f12 - f14) < 4.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: l0 */
    private boolean m110626l0() {
        return (this.f104050S == -221296.0f || this.f104052U == -221296.0f || this.f104051T == -221296.0f || this.f104053V == -221296.0f) ? false : true;
    }

    /* renamed from: m0 */
    private boolean m110627m0(float f11, float f12, float f13, float f14) {
        if (Math.abs(f11 - f13) < 4.0f && Math.abs(f12 - f14) < 4.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    private void m110628n0(AbstractC23442b abstractC23442b) {
        int mo47625j = abstractC23442b.mo47625j();
        if (mo47625j != 0) {
            if (mo47625j != 1) {
                if (mo47625j == 2) {
                    RectData rectData = (RectData) abstractC23442b;
                    this.f104042K.m127926h(rectData.mo47636c());
                    this.f104042K.m127925g(rectData.m123104i());
                    this.f104042K.m127927i(rectData.f47743u, rectData.f47744v, rectData.f47745w, rectData.f47746x);
                    this.f104042K.m127924f(this.f104040I);
                    return;
                }
                return;
            }
            ArrowData arrowData = (ArrowData) abstractC23442b;
            this.f104044M.m127913i(arrowData.f47730u);
            this.f104044M.m127912h(arrowData.mo47636c());
            this.f104044M.m127911g(arrowData.m123104i());
            this.f104044M.m127910f(this.f104040I);
            return;
        }
        CircleData circleData = (CircleData) abstractC23442b;
        this.f104043L.m127917i(circleData.mo47636c());
        this.f104043L.m127916h(circleData.m123104i());
        this.f104043L.m127915g(circleData.f47732u, circleData.f47733v);
        this.f104043L.m127918j(circleData.f47734w);
        this.f104043L.m127914f(this.f104040I);
    }

    /* renamed from: o0 */
    private void m110629o0(C18610q c18610q, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            m110628n0((AbstractC23442b) list.get(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        C27998a c27998a = this.f104041J;
        if (c27998a != null) {
            AbstractC26236a.m134900g(c27998a);
            this.f104041J = null;
        }
        C24553e c24553e = this.f104042K;
        if (c24553e != null) {
            c24553e.m127929b();
            this.f104042K = null;
        }
        C24550b c24550b = this.f104043L;
        if (c24550b != null) {
            c24550b.m127929b();
            this.f104043L = null;
        }
        C24549a c24549a = this.f104044M;
        if (c24549a != null) {
            c24549a.m127929b();
            this.f104044M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        if (this.f104045N != 0 && this.f104046O != 0) {
            C27998a c27998a = this.f104041J;
            if (c27998a != null) {
                AbstractC26236a.m134900g(c27998a);
                this.f104041J = null;
            }
            this.f104041J = AbstractC26236a.m134906m(this.f104045N, this.f104046O);
            this.f104054W = new Matrix();
            m110623i0();
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
        int i12 = this.f104045N;
        if (i12 != 0 && (i11 = this.f104046O) != 0) {
            m110618b0(i12, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m110630a0(C18610q c18610q, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f104049R == 0) {
            c18610q.m98343b(this.f104041J.m141113g(), floatBuffer, floatBuffer2, 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m110631d0() {
        this.f104041J.m141108a();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        this.f104041J.m141115j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m110632f0(C27998a c27998a, C18610q c18610q) {
        this.f104057Z.clear();
        while (this.f104056Y.peek() != null) {
            this.f104057Z.add((AbstractC23442b) this.f104056Y.poll());
        }
        c27998a.m141108a();
        m110629o0(c18610q, this.f104057Z);
        c27998a.m141115j();
        if (m110626l0() && this.f104049R == 0) {
            this.f104041J.m141108a();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            AbstractC23442b m110621g0 = m110621g0();
            if (m110621g0 != null) {
                this.f104057Z.add(m110621g0);
                m110629o0(c18610q, this.f104057Z);
            }
            this.f104041J.m141115j();
        }
    }

    /* renamed from: p0 */
    public void m110633p0(MotionEvent motionEvent, float f11, float f12) {
        float f13 = f11 * this.f104045N;
        float f14 = f12 * this.f104046O;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2 || action == 3) {
                if (Math.abs(f13 - this.f104052U) >= 4.0f || Math.abs(f14 - this.f104053V) >= 4.0f) {
                    this.f104052U = f13;
                    this.f104053V = f14;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AbstractC23442b m110621g0 = m110621g0();
                    if (m110621g0 != null) {
                        InterfaceC21942b interfaceC21942b = this.f104058a0;
                        if (interfaceC21942b != null) {
                            interfaceC21942b.mo110687e(m110621g0, null);
                        }
                        this.f104056Y.add(m110621g0);
                    }
                    this.f104049R = 1;
                    m110619c0();
                    return;
                }
                return;
            }
            return;
        }
        this.f104050S = f13;
        this.f104051T = f14;
        this.f104049R = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public void m110634q0(AbstractC23442b abstractC23442b) {
        m110628n0(abstractC23442b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m110635r0(int i11) {
        synchronized (this.f104037F) {
            try {
                for (C23934a c23934a : this.f104048Q) {
                    c23934a.m125296d(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s0 */
    public void m110636s0(int i11) {
        synchronized (this.f104037F) {
            this.f104047P = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void m110637t0(int i11, int i12) {
        if (this.f104045N != i11 || this.f104046O != i12) {
            this.f104045N = i11;
            this.f104046O = i12;
            mo1956Z(i11, i12);
        }
    }

    /* renamed from: u0 */
    public void m110638u0(C23934a[] c23934aArr) {
        synchronized (this.f104037F) {
            this.f104048Q = c23934aArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void m110639v0(float f11) {
        synchronized (this.f104037F) {
            try {
                for (C23934a c23934a : this.f104048Q) {
                    c23934a.m125297e(f11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void m110640w0(InterfaceC21942b interfaceC21942b) {
        this.f104058a0 = interfaceC21942b;
    }

    public C21352g(C23934a[] c23934aArr) {
        this.f104037F = new Object();
        this.f104038G = new float[16];
        this.f104039H = new float[16];
        this.f104040I = new float[16];
        this.f104047P = 0;
        this.f104049R = -1;
        this.f104051T = -221296.0f;
        this.f104053V = -221296.0f;
        this.f104055X = new float[14];
        this.f104056Y = new LinkedBlockingQueue();
        this.f104057Z = new ArrayList();
        m110638u0(c23934aArr);
    }
}
