package p643xf;

import ag.InterfaceC0795o;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import cg.AbstractC3460h;
import p679yf.C30922b;
import p679yf.C30923c;
import p679yf.C30924d;
import p679yf.InterfaceC30926f;
import wf.AbstractC28955g;
import wf.C28951c;
import xh0.C29647g0;
import xh0.InterfaceC29654l;

/* renamed from: xf.k */
/* loaded from: classes3.dex */
public class C29618k extends AbstractC29608a implements AbstractC28955g.a {

    /* renamed from: F */
    final String f136761F;

    /* renamed from: G */
    final Context f136762G;

    /* renamed from: H */
    long f136763H;

    /* renamed from: I */
    C30922b f136764I;

    /* renamed from: J */
    C30923c f136765J;

    /* renamed from: K */
    C28951c f136766K;

    /* renamed from: L */
    InterfaceC30926f f136767L;

    /* renamed from: O */
    InterfaceC0795o f136770O;

    /* renamed from: M */
    boolean f136768M = true;

    /* renamed from: N */
    boolean f136769N = false;

    /* renamed from: P */
    float[] f136771P = new float[16];

    /* renamed from: xf.k$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ InterfaceC29654l f136772p;

        a(InterfaceC29654l interfaceC29654l) {
            this.f136772p = interfaceC29654l;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C29618k.this.f136763H != Thread.currentThread().getId()) {
                C29618k.this.m1952U(this);
                return;
            }
            InterfaceC29654l interfaceC29654l = this.f136772p;
            if (interfaceC29654l != null) {
                interfaceC29654l.updateTexImage();
            }
            InterfaceC29654l interfaceC29654l2 = this.f136772p;
            if (interfaceC29654l2 instanceof C29647g0) {
                ((C29647g0) interfaceC29654l2).getTransformMatrix(C29618k.this.f136771P);
            }
            C29618k.this.f136769N = true;
        }
    }

    public C29618k(Context context, String str, C30923c c30923c, InterfaceC30926f interfaceC30926f, C30922b.c cVar, InterfaceC0795o interfaceC0795o) {
        this.f136762G = context;
        this.f136761F = str;
        C30922b c30922b = new C30922b(str);
        this.f136764I = c30922b;
        c30922b.m150219j(cVar);
        this.f136764I.m150218i(context);
        this.f136764I.m150217h(c30923c.f142628j);
        this.f136765J = c30923c;
        this.f136767L = interfaceC30926f;
        this.f136770O = interfaceC0795o;
        Matrix.setIdentityM(this.f136771P, 0);
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        C28951c c28951c = this.f136766K;
        if (c28951c != null) {
            c28951c.destroy();
            this.f136766K = null;
        }
        C30922b c30922b = this.f136764I;
        if (c30922b != null) {
            c30922b.m150215f();
            this.f136764I = null;
        }
        this.f136769N = false;
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        this.f136763H = Thread.currentThread().getId();
        this.f136769N = false;
        this.f136770O.mo2009f(0);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
        C28951c c28951c = this.f136766K;
        if (c28951c != null) {
            if (!this.f136769N) {
                c28951c.m1951T();
                return;
            }
            GLES20.glDisable(3042);
            this.f136766K.m144601n0(this.f136771P);
            this.f136766K.m1946J();
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        if (z11) {
            C28951c c28951c = new C28951c();
            this.f136766K = c28951c;
            c28951c.m144617j0(this);
            this.f136766K.m1995x();
            this.f136766K.mo1956Z(this.f2704t, this.f2705u);
            C30924d c30924d = new C30924d();
            c30924d.f142634a = this.f136766K;
            C30923c c30923c = this.f136765J;
            if (c30923c == null) {
                C30923c c30923c2 = new C30923c();
                c30924d.f142635b = c30923c2;
                c30923c2.f142619a = this.f2704t;
                c30923c2.f142620b = this.f2705u;
                c30923c2.f142621c = AbstractC3460h.m17445m(this.f136761F);
            } else {
                c30924d.f142635b = c30923c;
            }
            c30924d.f142636c = this.f136767L;
            this.f136764I.m150221l(c30924d);
            return;
        }
        this.f136766K.mo1956Z(this.f2704t, this.f2705u);
    }

    @Override // ag.AbstractC0784d
    /* renamed from: W */
    public void mo1953W(float f11) {
        super.mo1953W(f11);
        C28951c c28951c = this.f136766K;
        if (c28951c != null) {
            c28951c.mo1953W(f11);
        }
    }

    @Override // p643xf.AbstractC29608a
    /* renamed from: a0 */
    public boolean mo147176a0() {
        return this.f136769N;
    }

    @Override // wf.AbstractC28955g.a
    /* renamed from: r */
    public void mo144619r(InterfaceC29654l interfaceC29654l) {
        if (this.f136768M) {
            this.f136768M = false;
            if (this.f2708x) {
                mo1953W(0.0f);
                m1955Y(250);
            }
            this.f136770O.mo2009f(1);
            InterfaceC30926f interfaceC30926f = this.f136767L;
            if (interfaceC30926f != null) {
                interfaceC30926f.mo38279i();
            }
        }
        m1952U(new a(interfaceC29654l));
    }
}
