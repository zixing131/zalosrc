package ja0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import p612wk.AbstractC29069a;
import q80.C25183v;

/* renamed from: ja0.o0 */
/* loaded from: classes6.dex */
public final class C21176o0 extends AbstractC20484a {

    /* renamed from: J */
    private AbstractC29069a.q f103301J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21176o0(ViewGroup viewGroup, final InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25183v(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ja0.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21176o0.m109720k0(InterfaceC18319c.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m109720k0(InterfaceC18319c interfaceC18319c, C21176o0 c21176o0, View view) {
        AbstractC19074t.m100208f(c21176o0, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: l0 */
    public final void m109721l0(AbstractC29069a.q qVar) {
        AbstractC19074t.m100208f(qVar, "data");
        this.f103301J = qVar;
        ((C25183v) m106522i0()).m130359o1().m111959G1(qVar.m145214b());
    }
}
