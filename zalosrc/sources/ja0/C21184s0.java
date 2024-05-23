package ja0;

import android.content.Context;
import android.view.ViewGroup;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import q80.C25186y;

/* renamed from: ja0.s0 */
/* loaded from: classes6.dex */
public final class C21184s0 extends AbstractC20484a implements C25186y.d {

    /* renamed from: J */
    private final InterfaceC18319c f103317J;

    /* renamed from: K */
    private AbstractC29069a.v f103318K;

    /* renamed from: L */
    private final boolean f103319L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21184s0(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25186y(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103317J = interfaceC18319c;
        this.f103319L = true;
        ((C25186y) m106522i0()).m130369A1(this);
    }

    @Override // q80.C25186y.d
    /* renamed from: a */
    public void mo109734a() {
        InterfaceC18319c interfaceC18319c = this.f103317J;
        if (interfaceC18319c != null) {
        }
    }

    @Override // q80.C25186y.d
    /* renamed from: c */
    public void mo109735c() {
        InterfaceC18319c interfaceC18319c = this.f103317J;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: j0 */
    public final void m109736j0(AbstractC29069a.v vVar, AbstractC29080l abstractC29080l) {
        AbstractC19074t.m100208f(vVar, "data");
        this.f103318K = vVar;
        ((C25186y) m106522i0()).m130370v1(vVar);
        C18333g1.f92667a.m97293j(((C25186y) m106522i0()).m130371x1(), ((C25186y) m106522i0()).m130372z1(), vVar, abstractC29080l);
    }
}
