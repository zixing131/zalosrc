package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C5334d3;
import com.google.android.gms.internal.measurement.C5370f5;
import com.google.android.gms.internal.measurement.C5453k3;
import com.google.android.gms.internal.measurement.C5649vc;

/* renamed from: com.google.android.gms.measurement.internal.ca */
/* loaded from: classes2.dex */
public final class C5956ca extends AbstractC5944ba {

    /* renamed from: g */
    private final C5453k3 f33841g;

    /* renamed from: h */
    final /* synthetic */ C5933b f33842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5956ca(C5933b c5933b, String str, int i11, C5453k3 c5453k3) {
        super(str, i11);
        this.f33842h = c5933b;
        this.f33841g = c5453k3;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: a */
    public final int mo30795a() {
        return this.f33841g.m29334A();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: b */
    public final boolean mo30796b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5944ba
    /* renamed from: c */
    public final boolean mo30797c() {
        return true;
    }

    /* renamed from: k */
    public final boolean m30826k(Long l11, Long l12, C5370f5 c5370f5, boolean z11) {
        boolean z12;
        Object obj;
        C5649vc.m29807b();
        boolean m30913B = this.f33842h.f34158a.m31401z().m30913B(this.f33796a, AbstractC5972e3.f33905Y);
        boolean m29337G = this.f33841g.m29337G();
        boolean m29338H = this.f33841g.m29338H();
        boolean m29339I = this.f33841g.m29339I();
        if (m29337G || m29338H || m29339I) {
            z12 = true;
        } else {
            z12 = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z11 && !z12) {
            C6060m3 m31201u = this.f33842h.f34158a.mo31033c().m31201u();
            Integer valueOf = Integer.valueOf(this.f33797b);
            if (this.f33841g.m29340J()) {
                num = Integer.valueOf(this.f33841g.m29334A());
            }
            m31201u.m31110c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
            return true;
        }
        C5334d3 m29335B = this.f33841g.m29335B();
        boolean m29049G = m29335B.m29049G();
        if (c5370f5.m29132R()) {
            if (!m29335B.m29051I()) {
                this.f33842h.f34158a.mo31033c().m31202w().m31109b("No number filter for long property. property", this.f33842h.f34158a.m31372D().m30966f(c5370f5.m29129F()));
            } else {
                bool = AbstractC5944ba.m30813j(AbstractC5944ba.m30811h(c5370f5.m29127B(), m29335B.m29046C()), m29049G);
            }
        } else if (c5370f5.m29131Q()) {
            if (!m29335B.m29051I()) {
                this.f33842h.f34158a.mo31033c().m31202w().m31109b("No number filter for double property. property", this.f33842h.f34158a.m31372D().m30966f(c5370f5.m29129F()));
            } else {
                bool = AbstractC5944ba.m30813j(AbstractC5944ba.m30810g(c5370f5.m29126A(), m29335B.m29046C()), m29049G);
            }
        } else if (c5370f5.m29134T()) {
            if (!m29335B.m29053L()) {
                if (!m29335B.m29051I()) {
                    this.f33842h.f34158a.mo31033c().m31202w().m31109b("No string or number filter defined. property", this.f33842h.f34158a.m31372D().m30966f(c5370f5.m29129F()));
                } else if (C6077n9.m31154N(c5370f5.m29130G())) {
                    bool = AbstractC5944ba.m30813j(AbstractC5944ba.m30812i(c5370f5.m29130G(), m29335B.m29046C()), m29049G);
                } else {
                    this.f33842h.f34158a.mo31033c().m31202w().m31110c("Invalid user property value for Numeric number filter. property, value", this.f33842h.f34158a.m31372D().m30966f(c5370f5.m29129F()), c5370f5.m29130G());
                }
            } else {
                bool = AbstractC5944ba.m30813j(AbstractC5944ba.m30809f(c5370f5.m29130G(), m29335B.m29047D(), this.f33842h.f34158a.mo31033c()), m29049G);
            }
        } else {
            this.f33842h.f34158a.mo31033c().m31202w().m31109b("User property has no value, property", this.f33842h.f34158a.m31372D().m30966f(c5370f5.m29129F()));
        }
        C6060m3 m31201u2 = this.f33842h.f34158a.mo31033c().m31201u();
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        m31201u2.m31109b("Property filter result", obj);
        if (bool == null) {
            return false;
        }
        this.f33798c = Boolean.TRUE;
        if (m29339I && !bool.booleanValue()) {
            return true;
        }
        if (!z11 || this.f33841g.m29337G()) {
            this.f33799d = bool;
        }
        if (bool.booleanValue() && z12 && c5370f5.m29133S()) {
            long m29128C = c5370f5.m29128C();
            if (l11 != null) {
                m29128C = l11.longValue();
            }
            if (m30913B && this.f33841g.m29337G() && !this.f33841g.m29338H() && l12 != null) {
                m29128C = l12.longValue();
            }
            if (this.f33841g.m29338H()) {
                this.f33801f = Long.valueOf(m29128C);
            } else {
                this.f33800e = Long.valueOf(m29128C);
            }
        }
        return true;
    }
}
