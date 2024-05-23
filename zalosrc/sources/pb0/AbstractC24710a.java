package pb0;

import ad0.InterfaceC0745g;
import ad0.InterfaceC0747i;
import ad0.InterfaceC0753o;
import bd0.C2771b;
import fn0.AbstractC19074t;

/* renamed from: pb0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC24710a extends AbstractC24712c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24710a(C2771b c2771b) {
        super(c2771b);
        AbstractC19074t.m100208f(c2771b, "args");
    }

    /* renamed from: x */
    public static /* synthetic */ void m128318x(AbstractC24710a abstractC24710a, boolean z11, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            abstractC24710a.m128326w(z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetRenderData");
    }

    /* renamed from: A */
    public final void m128319A(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "animationId");
        mo128323t().mo1262v(str, z11, z12);
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: l */
    public InterfaceC0753o mo128320l() {
        return super.mo128320l();
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: p */
    public void mo128321p() {
        InterfaceC0745g interfaceC0745g;
        super.mo128321p();
        InterfaceC0747i mo128323t = mo128323t();
        if (mo128323t instanceof InterfaceC0745g) {
            interfaceC0745g = (InterfaceC0745g) mo128323t;
        } else {
            interfaceC0745g = null;
        }
        if (interfaceC0745g != null) {
            interfaceC0745g.mo1287d();
        }
    }

    @Override // pb0.AbstractC24712c
    /* renamed from: r */
    public void mo128322r(InterfaceC0753o interfaceC0753o) {
        super.mo128322r(interfaceC0753o);
        mo128323t().mo1261t(interfaceC0753o);
    }

    /* renamed from: t */
    public abstract InterfaceC0747i mo128323t();

    /* renamed from: u */
    public final boolean m128324u() {
        return mo128323t().mo1258j();
    }

    /* renamed from: v */
    public final void m128325v() {
        mo128323t().mo1259p();
        InterfaceC0747i.a.m1291a(mo128323t(), false, 1, null);
    }

    /* renamed from: w */
    public final void m128326w(boolean z11) {
        mo128323t().mo1257i(z11);
    }

    /* renamed from: y */
    public final void m128327y() {
        mo128323t().mo1260q();
    }

    /* renamed from: z */
    public final void m128328z(boolean z11) {
        mo128323t().mo1251c(z11);
    }
}
