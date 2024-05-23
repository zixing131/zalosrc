package p643xf;

import ag.AbstractC0784d;
import ag.C0788h;
import android.opengl.GLES20;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalo.cameradecor.gl.ZGLSurfaceView;
import mm0.AbstractC23350e;
import p546uf.InterfaceC27243b;
import p575vf.C27998a;
import p575vf.C28000c;
import se0.AbstractC26236a;

/* renamed from: xf.e */
/* loaded from: classes3.dex */
public class C29612e extends AbstractC29616i {

    /* renamed from: G */
    public C27998a f136736G;

    /* renamed from: H */
    private InterfaceC27243b f136737H;

    /* renamed from: I */
    private boolean f136738I = false;

    /* renamed from: J */
    private ColorFilterConfig f136739J = new ColorFilterConfig();

    /* renamed from: K */
    private C0788h.a f136740K;

    public C29612e(C0788h.a aVar) {
        this.f136740K = aVar;
    }

    @Override // p643xf.AbstractC29619l, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        if (this.f136736G != null) {
            C28000c.m141116b().m141119d(this.f136736G);
            this.f136736G = null;
        }
        try {
            InterfaceC27243b interfaceC27243b = this.f136737H;
            if (interfaceC27243b != null) {
                interfaceC27243b.destroy();
                this.f136737H = null;
            }
            C0788h.a aVar = this.f136740K;
            if (aVar != null) {
                aVar.mo1986d();
            }
            this.f136740K = null;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        AbstractC26236a.m134894a("onDrawFrame");
        AbstractC29608a mo147200d0 = mo147200d0();
        if (mo147200d0 == null) {
            AbstractC23350e.m122774d("ColorFilterGLInput", "Not wrapped any GLInput");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            return;
        }
        if (!mo147200d0.mo147176a0()) {
            ZGLSurfaceView.f41833A.set(Boolean.FALSE);
            mo147200d0.m1951T();
            return;
        }
        C27998a c27998a = this.f136736G;
        if (c27998a == null) {
            return;
        }
        if (this.f136737H != null) {
            c27998a.m141108a();
            mo147200d0.m1946J();
            this.f136736G.m141115j();
            InterfaceC27243b interfaceC27243b = this.f136737H;
            if (interfaceC27243b != null) {
                interfaceC27243b.mo98207a(this.f136736G.m141113g(), AbstractC0784d.f2698A, AbstractC0784d.f2701D);
            }
        } else {
            mo147200d0.m1946J();
        }
        m147194k0();
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        if (this.f136736G != null) {
            C28000c.m141116b().m141119d(this.f136736G);
            this.f136736G = null;
        }
        C27998a m141118c = C28000c.m141116b().m141118c(m1949M(), m1948L());
        this.f136736G = m141118c;
        m141118c.m141109c();
        InterfaceC27243b interfaceC27243b = this.f136737H;
        if (interfaceC27243b != null) {
            interfaceC27243b.mo98208b(m1949M(), m1948L());
        }
    }

    @Override // p643xf.AbstractC29608a
    /* renamed from: a0 */
    public boolean mo147176a0() {
        AbstractC29608a mo147200d0 = mo147200d0();
        if (mo147200d0 != null && mo147200d0.mo147176a0()) {
            return true;
        }
        return false;
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: f0 */
    public void mo147189f0(InterfaceC27243b interfaceC27243b, ColorFilterConfig colorFilterConfig) {
        InterfaceC27243b interfaceC27243b2 = this.f136737H;
        if (interfaceC27243b2 != null) {
            interfaceC27243b2.destroy();
        }
        this.f136737H = interfaceC27243b;
        this.f136739J = colorFilterConfig;
        interfaceC27243b.mo98209c();
        interfaceC27243b.mo98208b(m1949M(), m1948L());
        this.f136738I = true;
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: g0 */
    public void mo147190g0() {
        InterfaceC27243b interfaceC27243b = this.f136737H;
        if (interfaceC27243b != null) {
            interfaceC27243b.destroy();
            this.f136737H = null;
            C0788h.a aVar = this.f136740K;
            if (aVar != null) {
                aVar.mo1986d();
            }
        }
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: h0 */
    public InterfaceC27243b mo147191h0() {
        return this.f136737H;
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: i0 */
    public ColorFilterConfig mo147192i0() {
        return this.f136739J;
    }

    @Override // p643xf.AbstractC29616i
    /* renamed from: j0 */
    public boolean mo147193j0() {
        return this.f136737H != null;
    }

    /* renamed from: k0 */
    public void m147194k0() {
        if (this.f136738I) {
            this.f136738I = false;
            C0788h.a aVar = this.f136740K;
            if (aVar != null) {
                aVar.mo1987g();
            }
        }
    }
}
