package p643xf;

import ag.InterfaceC0795o;
import android.content.Context;
import android.graphics.SurfaceTexture;
import com.zing.zalo.SensitiveData;
import wf.C28950b;
import xh0.C29635a0;
import xh0.C29637b0;
import xh0.C29667y;
import xh0.C29668z;
import xh0.InterfaceC29636b;
import xh0.InterfaceC29653k;
import xh0.InterfaceC29654l;

/* renamed from: xf.d */
/* loaded from: classes3.dex */
public class C29611d extends AbstractC29608a implements C29637b0.a {

    /* renamed from: F */
    private C28950b f136721F;

    /* renamed from: G */
    private final Context f136722G;

    /* renamed from: H */
    private long f136723H;

    /* renamed from: I */
    private final boolean f136724I;

    /* renamed from: K */
    private final InterfaceC29653k.a f136726K;

    /* renamed from: L */
    private final int f136727L;

    /* renamed from: M */
    private final InterfaceC29636b f136728M;

    /* renamed from: N */
    private SurfaceTexture f136729N;

    /* renamed from: O */
    private final InterfaceC0795o f136730O;

    /* renamed from: R */
    private final SensitiveData f136733R;

    /* renamed from: J */
    private final Object f136725J = new Object();

    /* renamed from: P */
    private boolean f136731P = true;

    /* renamed from: Q */
    private boolean f136732Q = false;

    /* renamed from: xf.d$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ InterfaceC29654l f136734p;

        a(InterfaceC29654l interfaceC29654l) {
            this.f136734p = interfaceC29654l;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C29611d.this.f136723H == Thread.currentThread().getId()) {
                try {
                    synchronized (C29611d.this.f136725J) {
                        this.f136734p.updateTexImage();
                    }
                    C29611d.this.f136732Q = true;
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            C29611d.this.m1952U(this);
        }
    }

    public C29611d(Context context, int i11, boolean z11, InterfaceC29636b interfaceC29636b, InterfaceC29653k.a aVar, InterfaceC0795o interfaceC0795o, SensitiveData sensitiveData) {
        this.f136722G = context.getApplicationContext();
        this.f136724I = z11;
        this.f136727L = i11;
        this.f136726K = aVar;
        this.f136728M = interfaceC29636b;
        this.f136730O = interfaceC0795o;
        this.f136733R = sensitiveData;
    }

    /* renamed from: f0 */
    private void m147184f0(SurfaceTexture surfaceTexture) {
        m1952U(new Runnable() { // from class: xf.c

            /* renamed from: q */
            public final /* synthetic */ SurfaceTexture f136720q;

            public /* synthetic */ RunnableC29610c(SurfaceTexture surfaceTexture2) {
                r2 = surfaceTexture2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29611d.this.m147185g0(r2);
            }
        });
    }

    /* renamed from: g0 */
    public /* synthetic */ void m147185g0(SurfaceTexture surfaceTexture) {
        try {
            surfaceTexture.attachToGLContext(this.f136721F.m144597l0());
            surfaceTexture.updateTexImage();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f136729N = surfaceTexture;
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        try {
            SurfaceTexture surfaceTexture = this.f136729N;
            if (surfaceTexture != null) {
                surfaceTexture.detachFromGLContext();
                this.f136729N = null;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C28950b c28950b = this.f136721F;
        if (c28950b != null) {
            c28950b.destroy();
            this.f136721F = null;
        }
        this.f136732Q = false;
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        this.f136723H = Thread.currentThread().getId();
        this.f136730O.mo2009f(0);
        this.f136732Q = false;
    }

    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        C28950b c28950b = this.f136721F;
        if (c28950b != null) {
            c28950b.mo144598k0();
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        if (this.f136721F != null) {
            synchronized (this.f136725J) {
                this.f136721F.m1946J();
            }
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        if (z11) {
            C28950b c28950b = new C28950b(this.f136722G);
            this.f136721F = c28950b;
            c28950b.m1954X(this.f2708x);
            this.f136721F.m1995x();
            this.f136721F.mo1956Z(this.f2704t, this.f2705u);
            if (this.f2708x) {
                this.f136721F.mo1953W(0.0f);
            }
            C29635a0 c29635a0 = new C29635a0();
            c29635a0.f136876b.m147387a(this);
            c29635a0.f136876b.m147388b(this.f2704t, this.f2705u);
            c29635a0.f136876b.m147389c(this.f136721F.m144597l0());
            c29635a0.f136876b.m147390d(this.f136724I);
            C29668z c29668z = c29635a0.f136875a;
            c29668z.f136970a = this.f136727L;
            c29668z.f136971b = this;
            c29668z.f136972c = this.f136728M;
            c29668z.f136973d = this.f136726K;
            c29668z.f136974e = this.f136733R;
            C29667y.m147458p().m147477m(c29635a0);
            return;
        }
        this.f136721F.mo1956Z(this.f2704t, this.f2705u);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: W */
    public void mo1953W(float f11) {
        super.mo1953W(f11);
        C28950b c28950b = this.f136721F;
        if (c28950b != null) {
            c28950b.mo1953W(f11);
        }
    }

    @Override // xh0.C29637b0.a
    /* renamed from: a */
    public void mo147186a(InterfaceC29654l interfaceC29654l) {
        if (interfaceC29654l == null) {
            return;
        }
        if (this.f136731P) {
            this.f136731P = false;
            if (this.f2708x) {
                mo1953W(0.0f);
                m1955Y(250);
            }
            this.f136730O.mo2009f(1);
        }
        m1952U(new a(interfaceC29654l));
    }

    @Override // p643xf.AbstractC29608a
    /* renamed from: a0 */
    public boolean mo147176a0() {
        return this.f136732Q;
    }

    @Override // xh0.C29637b0.a
    /* renamed from: g */
    public void mo147187g(boolean z11, int i11, SurfaceTexture surfaceTexture) {
        if (!z11) {
            return;
        }
        if (surfaceTexture != null) {
            m147184f0(surfaceTexture);
            this.f136730O.mo2009f(1);
        } else {
            C28950b c28950b = this.f136721F;
            if (c28950b != null) {
                c28950b.m144599m0(i11, true);
            }
            this.f136730O.mo2009f(1);
        }
    }

    @Override // xh0.C29637b0.a
    /* renamed from: n */
    public void mo147188n(int i11, int i12, int i13, boolean z11) {
        C28950b c28950b = this.f136721F;
        if (c28950b != null) {
            c28950b.m144616i0(i11, i12, i13, z11);
        }
    }
}
