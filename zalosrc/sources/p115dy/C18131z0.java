package p115dy;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.productcatalog.utils.DeleteCatalogSource;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p115dy.AbstractC18114r;
import p115dy.C18131z0;
import p534u1.AbstractC26941a;
import p589vx.AbstractC28671p;
import p589vx.C28669n;
import p624wx.C29259b;
import pm0.C24848g0;

/* renamed from: dy.z0 */
/* loaded from: classes4.dex */
public final class C18131z0 extends C18113q0 {

    /* renamed from: L */
    private final ArrayList f91771L = new ArrayList();

    /* renamed from: M */
    private final AtomicBoolean f91772M = new AtomicBoolean(false);

    /* renamed from: dy.z0$a */
    /* loaded from: classes4.dex */
    public static final class a implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C18131z0();
        }
    }

    /* renamed from: dy.z0$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f91774r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f91774r = interfaceC18505l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m96432c(AbstractC28671p abstractC28671p, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(abstractC28671p, "$result");
            AbstractC19074t.m100208f(interfaceC18505l, "$listener");
            if (abstractC28671p instanceof AbstractC28671p.b) {
                interfaceC18505l.mo205i9(AbstractC18114r.c.f91719a);
            } else if (abstractC28671p instanceof AbstractC28671p.a) {
                interfaceC18505l.mo205i9(new AbstractC18114r.a(((AbstractC28671p.a) abstractC28671p).m143579a()));
            }
        }

        /* renamed from: b */
        public final void m96433b(final AbstractC28671p abstractC28671p) {
            AbstractC19074t.m100208f(abstractC28671p, "result");
            C18131z0.this.f91772M.compareAndSet(true, false);
            final InterfaceC18505l interfaceC18505l = this.f91774r;
            AbstractC19444a.m101697e(new Runnable() { // from class: dy.a1
                @Override // java.lang.Runnable
                public final void run() {
                    C18131z0.b.m96432c(AbstractC28671p.this, interfaceC18505l);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m96433b((AbstractC28671p) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: T0 */
    public final void m96427T0(C29259b c29259b, DeleteCatalogSource deleteCatalogSource, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        AbstractC19074t.m100208f(deleteCatalogSource, "source");
        AbstractC19074t.m100208f(interfaceC18505l, "listener");
        if (!this.f91772M.compareAndSet(false, true)) {
            return;
        }
        interfaceC18505l.mo205i9(AbstractC18114r.b.f91718a);
        String str = CoreUtility.f89233i;
        C28669n m96349A0 = m96349A0();
        AbstractC19074t.m100205c(str);
        m96349A0().m143537K(str, c29259b.m146158m(), m96349A0.m143551e0(str).m146253h(), deleteCatalogSource, new b(interfaceC18505l));
    }

    /* renamed from: U0 */
    public final boolean m96428U0(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        C28669n m96349A0 = m96349A0();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return m96349A0.m143535I(str, c29259b.m146158m());
    }

    /* renamed from: V0 */
    public final List m96429V0() {
        return new ArrayList(this.f91771L);
    }

    @Override // p115dy.C18113q0
    /* renamed from: W */
    public void mo96362W() {
        super.mo96362W();
        synchronized (this.f91771L) {
            this.f91771L.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: W0 */
    public final void m96430W0(List list) {
        AbstractC19074t.m100208f(list, "movingProducts");
        this.f91771L.clear();
        this.f91771L.addAll(list);
    }

    @Override // p115dy.C18113q0
    /* renamed from: X */
    public void mo96363X(List list) {
        AbstractC19074t.m100208f(list, "productIds");
        super.mo96363X(list);
        synchronized (this.f91771L) {
            this.f91771L.removeAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p115dy.C18113q0
    /* renamed from: o0 */
    public void mo96376o0() {
        super.mo96376o0();
        synchronized (this.f91771L) {
            this.f91771L.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    @Override // p115dy.C18113q0
    /* renamed from: r0 */
    protected boolean mo96377r0() {
        return true;
    }
}
