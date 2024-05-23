package ag;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import cg.AbstractC3455c;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import mm0.AbstractC23350e;
import p546uf.InterfaceC27243b;
import p643xf.AbstractC29608a;
import p643xf.AbstractC29616i;
import p643xf.C29611d;
import p643xf.C29612e;
import p643xf.C29614g;
import p643xf.C29618k;
import p714zf.InterfaceC31818i;

/* renamed from: ag.h */
/* loaded from: classes3.dex */
public class C0788h extends AbstractC0784d implements GLSurfaceView.Renderer, InterfaceC31818i {

    /* renamed from: F */
    protected Context f2714F;

    /* renamed from: G */
    private AbstractC29608a f2715G;

    /* renamed from: H */
    private AbstractC29616i f2716H;

    /* renamed from: I */
    private final a f2717I;

    /* renamed from: J */
    private final InterfaceC0796p f2718J;

    /* renamed from: K */
    private int f2719K = 0;

    /* renamed from: L */
    private long f2720L = 0;

    /* renamed from: M */
    private long f2721M = 0;

    /* renamed from: N */
    private int f2722N = 0;

    /* renamed from: ag.h$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: d */
        void mo1986d();

        /* renamed from: g */
        void mo1987g();
    }

    public C0788h(Context context, InterfaceC0796p interfaceC0796p, a aVar) {
        this.f2714F = context;
        this.f2718J = interfaceC0796p;
        this.f2717I = aVar;
    }

    /* renamed from: g0 */
    private void m1960g0(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        if (interfaceC27243b == null) {
            return;
        }
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            if (!abstractC29616i.mo147201e0()) {
                this.f2716H.mo147198b0(this.f2715G);
            }
            this.f2716H.mo147189f0(interfaceC27243b, colorFilterConfig);
            return;
        }
        throw new IllegalStateException("ColorFilterGLInput is not initialized yet!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ void m1961q0() {
        int i11 = this.f2719K + 1;
        this.f2719K = i11;
        if (i11 > 1) {
            AbstractC23350e.m122774d(this.f2727p, "wrong to use video recoding");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public /* synthetic */ void m1962r0() {
        this.f2719K--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m1963s0() {
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            abstractC29616i.mo147190g0();
        }
    }

    /* renamed from: x0 */
    private AbstractC29616i m1964x0() {
        C29614g c29614g = new C29614g(new C29612e(this.f2717I));
        c29614g.mo147198b0(this.f2715G);
        c29614g.m1995x();
        return c29614g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        m1970f0();
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.destroy();
            this.f2715G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: B */
    public void mo1965B() {
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.m1993v();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: C */
    public void mo1966C() {
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.m1994w();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.m1996y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: R */
    public void mo1909R() {
        m1974j0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.mo1956Z(m1949M(), m1948L());
        }
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            abstractC29616i.mo1956Z(m1949M(), m1948L());
        }
    }

    @Override // p714zf.InterfaceC31818i
    /* renamed from: c */
    public void mo1967c() {
        m1952U(new Runnable() { // from class: ag.f
            @Override // java.lang.Runnable
            public final void run() {
                C0788h.this.m1962r0();
            }
        });
    }

    /* renamed from: d0 */
    public void m1968d0(int i11) {
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i instanceof C29614g) {
            ((C29614g) abstractC29616i).m147203o0(i11 / 100.0f);
        }
    }

    /* renamed from: e0 */
    public void m1969e0(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        m1960g0(interfaceC27243b, colorFilterConfig);
    }

    /* renamed from: f0 */
    protected void m1970f0() {
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            abstractC29616i.mo147199c0();
            this.f2716H.destroy();
            this.f2716H = null;
        }
    }

    @Override // p714zf.InterfaceC31818i
    /* renamed from: h */
    public boolean mo1971h() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        m1972h0();
        return true;
    }

    /* renamed from: h0 */
    public void m1972h0() {
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null) {
            abstractC29608a.m1946J();
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i0 */
    public void m1973i0() {
        m1972h0();
    }

    /* renamed from: j0 */
    public void m1974j0() {
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            abstractC29616i.m1946J();
        } else {
            m1972h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k0 */
    public AbstractC29608a m1975k0() {
        return this.f2715G;
    }

    /* renamed from: l0 */
    public AbstractC29616i m1976l0() {
        return this.f2716H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public boolean m1977m0() {
        AbstractC29608a abstractC29608a = this.f2715G;
        if (abstractC29608a != null && abstractC29608a.mo147176a0()) {
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    public boolean m1978n0() {
        return this.f2715G instanceof C29611d;
    }

    /* renamed from: o0 */
    public boolean m1979o0() {
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null && abstractC29616i.mo1997z()) {
            return true;
        }
        return false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        m1946J();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        mo1956Z(i11, i12);
        InterfaceC0796p interfaceC0796p = this.f2718J;
        if (interfaceC0796p != null) {
            interfaceC0796p.mo2011i(i11, i12);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        m1995x();
        InterfaceC0796p interfaceC0796p = this.f2718J;
        if (interfaceC0796p != null) {
            interfaceC0796p.mo2010h();
        }
    }

    /* renamed from: p0 */
    public boolean m1980p0() {
        return this.f2715G instanceof C29618k;
    }

    @Override // p714zf.InterfaceC31818i
    /* renamed from: t */
    public void mo1981t() {
        m1952U(new Runnable() { // from class: ag.g
            @Override // java.lang.Runnable
            public final void run() {
                C0788h.this.m1961q0();
            }
        });
    }

    /* renamed from: t0 */
    public void m1982t0() {
        if (!m1992u()) {
            if (mo1997z()) {
                AbstractC3455c.m17397a("setBackground in non-gl thread");
            }
        } else {
            AbstractC29608a abstractC29608a = this.f2715G;
            if (abstractC29608a instanceof C29611d) {
                abstractC29608a.destroy();
                this.f2715G = null;
            }
        }
    }

    /* renamed from: u0 */
    public void m1983u0() {
        m1952U(new Runnable() { // from class: ag.e
            @Override // java.lang.Runnable
            public final void run() {
                C0788h.this.m1963s0();
            }
        });
    }

    /* renamed from: v0 */
    public void m1984v0(AbstractC29608a abstractC29608a) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setBackground: ");
        sb2.append(abstractC29608a);
        if (!m1992u()) {
            if (mo1997z()) {
                AbstractC3455c.m17397a("setBackground in non-gl thread");
                return;
            }
            return;
        }
        AbstractC29608a abstractC29608a2 = this.f2715G;
        AbstractC29616i abstractC29616i = this.f2716H;
        if (abstractC29616i != null) {
            abstractC29616i.mo147199c0();
        }
        if (abstractC29608a2 != null) {
            abstractC29608a2.destroy();
        }
        if (abstractC29608a != null) {
            abstractC29608a.m1995x();
            abstractC29608a.mo1956Z(this.f2704t, this.f2705u);
            this.f2715G = abstractC29608a;
            AbstractC29616i abstractC29616i2 = this.f2716H;
            if (abstractC29616i2 != null) {
                abstractC29616i2.mo147198b0(abstractC29608a);
            }
        }
    }

    /* renamed from: w0 */
    public void m1985w0() {
        this.f2716H = m1964x0();
    }
}
