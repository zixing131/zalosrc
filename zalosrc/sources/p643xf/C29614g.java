package p643xf;

import ag.AbstractC0784d;
import ag.C0792l;
import android.opengl.GLES20;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.gl.ZGLSurfaceView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import p546uf.InterfaceC27243b;
import p575vf.C27998a;
import p575vf.C28000c;
import se0.AbstractC26236a;

/* renamed from: xf.g */
/* loaded from: classes3.dex */
public final class C29614g extends AbstractC29616i {

    /* renamed from: G */
    private C29612e f136743G;

    /* renamed from: H */
    private C27998a f136744H;

    /* renamed from: J */
    private boolean f136746J;

    /* renamed from: I */
    private final C0792l f136745I = new C0792l();

    /* renamed from: K */
    private float f136747K = 1.0f;

    public C29614g(C29612e c29612e) {
        this.f136743G = c29612e;
    }

    /* renamed from: l0 */
    public static final void m147196l0(C29614g c29614g, float f11) {
        AbstractC19074t.m100208f(c29614g, "this$0");
        c29614g.f136747K = f11;
    }

    /* renamed from: n0 */
    private final C29612e m147197n0() {
        C29612e c29612e = this.f136743G;
        AbstractC19074t.m100205c(c29612e);
        return c29612e;
    }

    @Override // p643xf.AbstractC29619l, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        m147197n0().destroy();
        this.f136743G = null;
        try {
            this.f136745I.m13459a();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C27998a c27998a = this.f136744H;
        if (c27998a != null) {
            C28000c.m141116b().m141119d(c27998a);
        }
        this.f136744H = null;
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        m147197n0().m1995x();
        try {
            this.f136745I.m2004o();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        AbstractC26236a.m134894a("onDrawFrame");
        AbstractC29608a mo147200d0 = mo147200d0();
        if (mo147200d0 == null) {
            AbstractC20110a.f98889a.mo104551d("Not wrapped any GLInput", new Object[0]);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            return;
        }
        if (!mo147200d0.mo147176a0()) {
            AbstractC20110a.f98889a.mo104559s("Don't has render content", new Object[0]);
            ZGLSurfaceView.f41833A.set(Boolean.FALSE);
            mo147200d0.m1951T();
            return;
        }
        C27998a c27998a = m147197n0().f136736G;
        if (c27998a == null) {
            AbstractC20110a.f98889a.mo104559s("ColorFrameBuffer is not initialized", new Object[0]);
            return;
        }
        C27998a c27998a2 = this.f136744H;
        if (c27998a2 == null) {
            AbstractC20110a.f98889a.mo104559s("FrameBuffer is not initialized", new Object[0]);
            return;
        }
        InterfaceC27243b mo147191h0 = mo147191h0();
        if (mo147191h0 != null) {
            c27998a2.m141108a();
            c27998a.m141108a();
            mo147200d0.m1946J();
            c27998a.m141115j();
            int m141113g = c27998a.m141113g();
            FloatBuffer floatBuffer = AbstractC0784d.f2698A;
            FloatBuffer floatBuffer2 = AbstractC0784d.f2701D;
            mo147191h0.mo98207a(m141113g, floatBuffer, floatBuffer2);
            c27998a2.m141115j();
            int m141113g2 = c27998a.m141113g();
            int m141113g3 = c27998a2.m141113g();
            AbstractC19074t.m100207e(floatBuffer, "CUBE_BUF");
            AbstractC19074t.m100207e(floatBuffer2, "FULL_RECTANGLE_TEX_BUF");
            AbstractC19074t.m100207e(floatBuffer2, "FULL_RECTANGLE_TEX_BUF");
            m147202m0(m141113g2, m141113g3, floatBuffer, floatBuffer2, floatBuffer2);
        } else {
            mo147200d0.m1946J();
        }
        m147197n0().m147194k0();
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        C27998a c27998a = this.f136744H;
        if (c27998a != null) {
            C28000c.m141116b().m141119d(c27998a);
        }
        C27998a m141118c = C28000c.m141116b().m141118c(m1949M(), m1948L());
        m141118c.m141109c();
        this.f136744H = m141118c;
    }

    @Override // ag.AbstractC0784d
    /* renamed from: Z */
    public void mo1956Z(int i11, int i12) {
        if (!this.f136746J) {
            m147197n0().mo1956Z(i11, i12);
        }
        super.mo1956Z(i11, i12);
    }

    @Override // p643xf.AbstractC29608a
    /* renamed from: a0 */
    public boolean mo147176a0() {
        return m147197n0().mo147176a0();
    }

    @Override // p643xf.AbstractC29619l
    /* renamed from: b0 */
    public void mo147198b0(AbstractC29608a abstractC29608a) {
        m147197n0().mo147198b0(abstractC29608a);
        this.f136746J = true;
        if (abstractC29608a != null) {
            mo1956Z(abstractC29608a.m1949M(), abstractC29608a.m1948L());
        }
        this.f136746J = false;
    }

    @Override // p643xf.AbstractC29619l
    /* renamed from: c0 */
    public AbstractC29608a mo147199c0() {
        return m147197n0().mo147199c0();
    }

    @Override // p643xf.AbstractC29619l
    /* renamed from: d0 */
    public AbstractC29608a mo147200d0() {
        return m147197n0().mo147200d0();
    }

    @Override // p643xf.AbstractC29619l
    /* renamed from: e0 */
    public boolean mo147201e0() {
        return m147197n0().mo147201e0();
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: f0 */
    public void mo147189f0(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        AbstractC19074t.m100208f(interfaceC27243b, "colorFilter");
        AbstractC19074t.m100208f(colorFilterConfig, "colorFilterConfig");
        m147197n0().mo147189f0(interfaceC27243b, colorFilterConfig);
        m147203o0(colorFilterConfig.f41832q);
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: g0 */
    public void mo147190g0() {
        m147197n0().mo147190g0();
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: h0 */
    public InterfaceC27243b mo147191h0() {
        return m147197n0().mo147191h0();
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: i0 */
    public ColorFilterConfig mo147192i0() {
        ColorFilterConfig mo147192i0 = m147197n0().mo147192i0();
        AbstractC19074t.m100207e(mo147192i0, "getColorFilterConfig(...)");
        return mo147192i0;
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: j0 */
    public boolean mo147193j0() {
        return m147197n0().mo147193j0();
    }

    /* renamed from: m0 */
    public final void m147202m0(int i11, int i12, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3) {
        AbstractC19074t.m100208f(floatBuffer, "cubeBuffer");
        AbstractC19074t.m100208f(floatBuffer2, "baseTexCoordinateBuffer");
        AbstractC19074t.m100208f(floatBuffer3, "filteredTexCoordinateBuffer");
        this.f136745I.m13466h();
        GLES20.glEnableVertexAttribArray(this.f136745I.m2003n());
        GLES20.glVertexAttribPointer(this.f136745I.m2003n(), 2, 5126, false, 0, (Buffer) floatBuffer);
        AbstractC26236a.m134894a("glEnableVertexAttribArray " + this.f136745I.m2003n());
        GLES20.glEnableVertexAttribArray(this.f136745I.m1998i());
        GLES20.glVertexAttribPointer(this.f136745I.m1998i(), 2, 5126, false, 0, (Buffer) floatBuffer2);
        AbstractC26236a.m134894a("glEnableVertexAttribArray " + this.f136745I.m1998i());
        GLES20.glActiveTexture(33985);
        AbstractC26236a.m134894a("glActiveTexture: 1");
        GLES20.glBindTexture(3553, i11);
        AbstractC26236a.m134894a("glBindTexture: " + i11);
        GLES20.glUniform1i(this.f136745I.m1999j(), 1);
        AbstractC26236a.m134894a("glUniform1i: 1");
        GLES20.glEnableVertexAttribArray(this.f136745I.m2000k());
        GLES20.glVertexAttribPointer(this.f136745I.m2000k(), 2, 5126, false, 0, (Buffer) floatBuffer3);
        AbstractC26236a.m134894a("glEnableVertexAttribArray " + this.f136745I.m2000k());
        GLES20.glActiveTexture(33984);
        AbstractC26236a.m134894a("glActiveTexture: 0");
        GLES20.glBindTexture(3553, i12);
        AbstractC26236a.m134894a("glBindTexture: " + i12);
        GLES20.glUniform1i(this.f136745I.m2001l(), 0);
        AbstractC26236a.m134894a("glUniform1i: 0");
        GLES20.glUniform1f(this.f136745I.m2002m(), this.f136747K);
        AbstractC26236a.m134894a("glUniform1f: " + this.f136745I.m2002m());
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f136745I.m2000k());
        AbstractC26236a.m134894a("glDisableVertexAttribArray " + this.f136745I.m2000k());
        GLES20.glDisableVertexAttribArray(this.f136745I.m1998i());
        AbstractC26236a.m134894a("glDisableVertexAttribArray " + this.f136745I.m1998i());
        GLES20.glDisableVertexAttribArray(this.f136745I.m2003n());
        AbstractC26236a.m134894a("glDisableVertexAttribArray " + this.f136745I.m2003n());
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: o0 */
    public final void m147203o0(float f11) {
        m1952U(new Runnable() { // from class: xf.f

            /* renamed from: q */
            public final /* synthetic */ float f136742q;

            public /* synthetic */ RunnableC29613f(float f112) {
                r2 = f112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29614g.m147196l0(C29614g.this, r2);
            }
        });
        mo147192i0().f41832q = f112;
    }

    @Override // ag.AbstractC0791k
    /* renamed from: z */
    public boolean mo1997z() {
        return m147197n0().mo1997z();
    }
}
