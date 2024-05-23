package ja0;

import android.content.Context;
import android.view.ViewGroup;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import q80.C25177p;

/* renamed from: ja0.a0 */
/* loaded from: classes6.dex */
public final class C21148a0 extends AbstractC20484a implements C25177p.d {

    /* renamed from: J */
    private final InterfaceC18319c f103234J;

    /* renamed from: K */
    private AbstractC29069a.m f103235K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21148a0(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25177p(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103234J = interfaceC18319c;
        ((C25177p) m106522i0()).m130318y1(this);
    }

    /* renamed from: k0 */
    private final void m109638k0(AbstractC29069a.m mVar) {
        if (mVar instanceof AbstractC29069a.n) {
            ((C25177p) m106522i0()).m130319z1(((AbstractC29069a.n) mVar).m145194d());
        }
    }

    @Override // q80.C25177p.d
    /* renamed from: a */
    public void mo109639a() {
        InterfaceC18319c interfaceC18319c = this.f103234J;
        if (interfaceC18319c != null) {
        }
    }

    @Override // q80.C25177p.d
    /* renamed from: c */
    public void mo109640c() {
        InterfaceC18319c interfaceC18319c = this.f103234J;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: j0 */
    public final void m109641j0(AbstractC29069a.m mVar, AbstractC29080l abstractC29080l) {
        AbstractC19074t.m100208f(mVar, "data");
        this.f103235K = mVar;
        ((C25177p) m106522i0()).m130315u1(mVar.m145192b());
        C18333g1.f92667a.m97293j(((C25177p) m106522i0()).m130316v1(), ((C25177p) m106522i0()).m130317x1(), mVar, abstractC29080l);
        m109638k0(mVar);
    }
}
