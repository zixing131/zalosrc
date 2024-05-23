package wf;

import p643xf.AbstractC29608a;
import xh0.InterfaceC29654l;

/* renamed from: wf.g */
/* loaded from: classes3.dex */
public abstract class AbstractC28955g extends AbstractC29608a {

    /* renamed from: F */
    private a f134033F;

    /* renamed from: G */
    private int f134034G;

    /* renamed from: H */
    private int f134035H;

    /* renamed from: I */
    private int f134036I;

    /* renamed from: J */
    private boolean f134037J;

    /* renamed from: K */
    private boolean f134038K = false;

    /* renamed from: L */
    private int f134039L = 1;

    /* renamed from: M */
    private long f134040M;

    /* renamed from: wf.g$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: r */
        void mo144619r(InterfaceC29654l interfaceC29654l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        this.f134040M = -1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        this.f134040M = Thread.currentThread().getId();
    }

    /* renamed from: b0 */
    protected boolean m144609b0() {
        if (this.f134040M == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public int m144610c0() {
        return this.f134039L;
    }

    /* renamed from: d0 */
    public int m144611d0() {
        return this.f134035H;
    }

    /* renamed from: e0 */
    public int m144612e0() {
        return this.f134036I;
    }

    /* renamed from: f0 */
    public int m144613f0() {
        return this.f134034G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g0 */
    public boolean m144614g0() {
        return this.f134038K;
    }

    /* renamed from: h0 */
    public boolean m144615h0() {
        return this.f134037J;
    }

    /* renamed from: i0 */
    public void m144616i0(int i11, int i12, int i13, boolean z11) {
        this.f134034G = i11;
        this.f134035H = i12;
        this.f134036I = i13;
        this.f134037J = z11;
        this.f134038K = true;
        if (m144609b0()) {
            mo144598k0();
        } else {
            m1952U(new Runnable() { // from class: wf.f
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC28955g.this.mo144598k0();
                }
            });
        }
    }

    /* renamed from: j0 */
    public void m144617j0(a aVar) {
        this.f134033F = aVar;
    }

    /* renamed from: k0 */
    public abstract void mo144598k0();

    /* renamed from: r */
    public void m144618r(InterfaceC29654l interfaceC29654l) {
        a aVar = this.f134033F;
        if (aVar != null) {
            aVar.mo144619r(interfaceC29654l);
        }
    }
}
