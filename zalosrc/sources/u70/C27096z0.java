package u70;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import en0.InterfaceC18494a;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashSet;
import java.util.PriorityQueue;
import lk.EnumC22502a;
import mk.AbstractC23323a;
import nh0.InterfaceC23792b;
import p205hc.AbstractC19963b;
import pm0.AbstractC24856m;
import pm0.C24860q;
import pm0.InterfaceC24854k;

/* renamed from: u70.z0 */
/* loaded from: classes5.dex */
public final class C27096z0 extends AbstractC19963b {

    /* renamed from: t */
    private final InterfaceC23792b f127773t;

    /* renamed from: u */
    private final C1761c0 f127774u;

    /* renamed from: v */
    private final InterfaceC24854k f127775v;

    /* renamed from: w */
    private final InterfaceC24854k f127776w;

    /* renamed from: u70.z0$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f127777q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PriorityQueue mo12V4() {
            return new PriorityQueue();
        }
    }

    /* renamed from: u70.z0$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f127778q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashSet mo12V4() {
            return new HashSet();
        }
    }

    public C27096z0(InterfaceC23792b interfaceC23792b) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f127773t = interfaceC23792b;
        this.f127774u = new C1761c0();
        m129210a = AbstractC24856m.m129210a(a.f127777q);
        this.f127775v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f127778q);
        this.f127776w = m129210a2;
    }

    /* renamed from: R */
    private final PriorityQueue m139209R() {
        return (PriorityQueue) this.f127775v.getValue();
    }

    /* renamed from: T */
    private final HashSet m139210T() {
        return (HashSet) this.f127776w.getValue();
    }

    /* renamed from: W */
    private final void m139211W() {
        while (!m139209R().isEmpty()) {
            if (!m139210T().contains(((AbstractC23323a) m139209R().element()).m122715d())) {
                m139209R().remove();
            } else {
                return;
            }
        }
    }

    /* renamed from: O */
    public final void m139212O(AbstractC23323a abstractC23323a) {
        EnumC22502a enumC22502a;
        boolean z11;
        AbstractC19074t.m100208f(abstractC23323a, "newItem");
        AbstractC23323a abstractC23323a2 = (AbstractC23323a) m139209R().peek();
        m139209R().add(abstractC23323a);
        m139210T().add(abstractC23323a.m122715d());
        AbstractC23323a abstractC23323a3 = (AbstractC23323a) m139209R().element();
        if (!AbstractC19074t.m100204b(abstractC23323a3, abstractC23323a2)) {
            if (abstractC23323a2 != null) {
                m139210T().add(abstractC23323a2.m122715d());
            }
            m139210T().remove(abstractC23323a3.m122715d());
            EnumC22502a m122715d = abstractC23323a3.m122715d();
            if (abstractC23323a2 != null) {
                enumC22502a = abstractC23323a2.m122715d();
            } else {
                enumC22502a = null;
            }
            if (m122715d != enumC22502a) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f127774u.mo9224q(new C24860q(Boolean.valueOf(z11), abstractC23323a3));
        }
    }

    /* renamed from: P */
    public final LiveData m139213P() {
        return this.f127774u;
    }

    /* renamed from: Q */
    public final long m139214Q() {
        return this.f127773t.mo124314i();
    }

    /* renamed from: S */
    public final AbstractC23323a m139215S() {
        return (AbstractC23323a) m139209R().peek();
    }

    /* renamed from: U */
    public final boolean m139216U(EnumC22502a enumC22502a) {
        EnumC22502a enumC22502a2;
        AbstractC19074t.m100208f(enumC22502a, "bannerType");
        AbstractC23323a abstractC23323a = (AbstractC23323a) m139209R().peek();
        if (abstractC23323a != null) {
            enumC22502a2 = abstractC23323a.m122715d();
        } else {
            enumC22502a2 = null;
        }
        if (enumC22502a == enumC22502a2) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public final void m139217V(AbstractC23323a abstractC23323a) {
        EnumC22502a enumC22502a;
        AbstractC19074t.m100208f(abstractC23323a, "bannerItem");
        AbstractC23323a abstractC23323a2 = (AbstractC23323a) m139209R().peek();
        m139210T().remove(abstractC23323a.m122715d());
        EnumC22502a m122715d = abstractC23323a.m122715d();
        EnumC22502a enumC22502a2 = null;
        if (abstractC23323a2 != null) {
            enumC22502a = abstractC23323a2.m122715d();
        } else {
            enumC22502a = null;
        }
        if (m122715d == enumC22502a) {
            m139211W();
        }
        AbstractC23323a abstractC23323a3 = (AbstractC23323a) m139209R().peek();
        if (!AbstractC19074t.m100204b(abstractC23323a3, abstractC23323a2)) {
            HashSet m139210T = m139210T();
            if (abstractC23323a3 != null) {
                enumC22502a2 = abstractC23323a3.m122715d();
            }
            AbstractC19069o0.m100184a(m139210T).remove(enumC22502a2);
            this.f127774u.mo9224q(new C24860q(Boolean.TRUE, abstractC23323a3));
        }
    }
}
