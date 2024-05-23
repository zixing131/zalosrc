package nk0;

import android.graphics.Canvas;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import nk0.AbstractC23838k1;
import pm0.C24848g0;
import qj0.InterfaceC25303a;
import qk0.AbstractC25310f;
import qk0.InterfaceC25307c;
import wj0.InterfaceC29061b;

/* renamed from: nk0.k1 */
/* loaded from: classes7.dex */
public abstract class AbstractC23838k1 extends AbstractC25310f {

    /* renamed from: j */
    private WeakHashMap f115162j;

    /* renamed from: nk0.k1$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC25307c.a f115164r;

        /* renamed from: nk0.k1$a$a */
        /* loaded from: classes7.dex */
        public static final class C32902a implements InterfaceC25307c.a {

            /* renamed from: a */
            final /* synthetic */ AbstractC23838k1 f115165a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC25307c.a f115166b;

            C32902a(AbstractC23838k1 abstractC23838k1, InterfaceC25307c.a aVar) {
                this.f115165a = abstractC23838k1;
                this.f115166b = aVar;
            }

            /* renamed from: c */
            public static final void m124598c(InterfaceC25307c.a aVar, ZOMRect zOMRect) {
                AbstractC19074t.m100208f(aVar, "$intersectCallback");
                AbstractC19074t.m100208f(zOMRect, "$rect");
                aVar.mo92118a(zOMRect);
            }

            @Override // qk0.InterfaceC25307c.a
            /* renamed from: a */
            public void mo92118a(ZOMRect zOMRect) {
                AbstractC19074t.m100208f(zOMRect, "rect");
                this.f115165a.m131004G0(new Runnable() { // from class: nk0.j1

                    /* renamed from: q */
                    public final /* synthetic */ ZOMRect f115160q;

                    public /* synthetic */ RunnableC23835j1(ZOMRect zOMRect2) {
                        r2 = zOMRect2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC23838k1.a.C32902a.m124598c(InterfaceC25307c.a.this, r2);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC25307c.a aVar) {
            super(1);
            this.f115164r = aVar;
        }

        /* renamed from: a */
        public final void m124596a(InterfaceC25303a interfaceC25303a) {
            AbstractC19074t.m100208f(interfaceC25303a, "it");
            interfaceC25303a.mo91542c(new C32902a(AbstractC23838k1.this, this.f115164r));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124596a((InterfaceC25303a) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC23838k1(C23855s0 c23855s0, ZOM zom) {
        super(c23855s0, AbstractC25310f.a.ZINSComponent, zom);
        AbstractC19074t.m100208f(c23855s0, "root");
        AbstractC19074t.m100208f(zom, "zom");
        this.f115162j = new WeakHashMap();
    }

    /* renamed from: d1 */
    public static final void m124588d1(AbstractC23838k1 abstractC23838k1, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(abstractC23838k1, "this$0");
        AbstractC19074t.m100208f(interfaceC18505l, "$runnable");
        InterfaceC25303a mo124407X0 = abstractC23838k1.mo124407X0();
        if (mo124407X0 != null) {
            interfaceC18505l.mo205i9(mo124407X0);
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: S0 */
    public void mo124501S0() {
    }

    /* renamed from: V0 */
    public final void m124589V0(InterfaceC29061b interfaceC29061b, InterfaceC29061b interfaceC29061b2) {
        AbstractC19074t.m100208f(interfaceC29061b, "parentNode");
        AbstractC19074t.m100208f(interfaceC29061b2, "node");
        this.f115162j.put(interfaceC29061b, new WeakReference(interfaceC29061b2));
    }

    /* renamed from: W0 */
    public final InterfaceC29061b m124590W0(InterfaceC29061b interfaceC29061b) {
        AbstractC19074t.m100208f(interfaceC29061b, "parentNode");
        WeakReference weakReference = (WeakReference) this.f115162j.get(interfaceC29061b);
        if (weakReference != null) {
            return (InterfaceC29061b) weakReference.get();
        }
        return null;
    }

    /* renamed from: X0 */
    public abstract InterfaceC25303a mo124407X0();

    /* renamed from: Y0 */
    public void mo124591Y0(int i11) {
    }

    /* renamed from: Z0 */
    public void mo124592Z0(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
    }

    /* renamed from: a1 */
    public void mo124408a1() {
    }

    /* renamed from: b1 */
    public void m124593b1() {
    }

    @Override // qk0.InterfaceC25307c
    /* renamed from: c */
    public void mo124506c(InterfaceC25307c.a aVar) {
        AbstractC19074t.m100208f(aVar, "intersectCallback");
        m124594c1(new a(aVar));
    }

    /* renamed from: c1 */
    public final void m124594c1(InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "runnable");
        m131006I0(new Runnable() { // from class: nk0.i1

            /* renamed from: q */
            public final /* synthetic */ InterfaceC18505l f115157q;

            public /* synthetic */ RunnableC23832i1(InterfaceC18505l interfaceC18505l2) {
                r2 = interfaceC18505l2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23838k1.m124588d1(AbstractC23838k1.this, r2);
            }
        });
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: d0 */
    public void mo124507d0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: j0 */
    protected void mo124435j0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: k0 */
    protected void mo124510k0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: l0 */
    protected void mo124511l0(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        InterfaceC25303a mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91548x();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: r0 */
    public final void mo124439r0(int i11) {
        super.mo124439r0(i11);
        mo124591Y0(i11);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: t0 */
    public void mo124514t0() {
        super.mo124514t0();
        m131000E().m124637Z(this);
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: u */
    protected int mo124516u() {
        return 3;
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: u0 */
    public final void mo124517u0() {
        super.mo124517u0();
        mo124408a1();
        InterfaceC25303a mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91545m();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: v0 */
    public final void mo124443v0() {
        super.mo124443v0();
        m124593b1();
        InterfaceC25303a mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91546p();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: x0 */
    public final void mo124444x0(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
        super.mo124444x0(zom, i11);
        mo124592Z0(zom, i11);
        InterfaceC25303a mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91544l(i11);
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: y0 */
    public void mo124595y0() {
        super.mo124595y0();
        InterfaceC25303a mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91543d();
        }
    }
}
