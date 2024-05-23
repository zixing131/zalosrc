package ja0;

import android.content.Context;
import android.view.ViewGroup;
import com.zing.zalo.uidrawing.C16719g;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import kd0.C21693c;
import p612wk.AbstractC29069a;
import q80.C25162a;

/* renamed from: ja0.t */
/* loaded from: classes6.dex */
public final class C21185t extends AbstractC20484a {

    /* renamed from: J */
    private final InterfaceC18319c f103320J;

    /* renamed from: K */
    private AbstractC29069a.f f103321K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21185t(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25162a(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103320J = interfaceC18319c;
        final C25162a.a m130304q1 = ((C25162a) m106522i0()).m130304q1();
        m130304q1.mo89109M0(new C16719g.c() { // from class: ja0.r
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C21185t.m109739n0(C25162a.a.this, this, c16719g);
            }
        });
        final C25162a.a m130303p1 = ((C25162a) m106522i0()).m130303p1();
        m130303p1.mo89109M0(new C16719g.c() { // from class: ja0.s
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C21185t.m109740o0(C25162a.a.this, this, c16719g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m109739n0(C25162a.a aVar, C21185t c21185t, C16719g c16719g) {
        String str;
        AbstractC19074t.m100208f(aVar, "$this_apply");
        AbstractC19074t.m100208f(c21185t, "this$0");
        aVar.m130305o1().mo89091D0(!aVar.m130305o1().m89141i0());
        int m109742m0 = c21185t.m109742m0(((C25162a) c21185t.m106522i0()).m130304q1().m130305o1().m89141i0(), ((C25162a) c21185t.m106522i0()).m130303p1().m130305o1().m89141i0());
        InterfaceC18319c interfaceC18319c = c21185t.f103320J;
        if (interfaceC18319c != null) {
            AbstractC29069a.f fVar = c21185t.f103321K;
            if (fVar != null) {
                str = fVar.m145179e();
            } else {
                str = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m109740o0(C25162a.a aVar, C21185t c21185t, C16719g c16719g) {
        String str;
        AbstractC19074t.m100208f(aVar, "$this_apply");
        AbstractC19074t.m100208f(c21185t, "this$0");
        aVar.m130305o1().mo89091D0(!aVar.m130305o1().m89141i0());
        int m109742m0 = c21185t.m109742m0(((C25162a) c21185t.m106522i0()).m130304q1().m130305o1().m89141i0(), ((C25162a) c21185t.m106522i0()).m130303p1().m130305o1().m89141i0());
        InterfaceC18319c interfaceC18319c = c21185t.f103320J;
        if (interfaceC18319c != null) {
            AbstractC29069a.f fVar = c21185t.f103321K;
            if (fVar != null) {
                str = fVar.m145179e();
            } else {
                str = null;
            }
        }
    }

    /* renamed from: l0 */
    public final void m109741l0(AbstractC29069a.f fVar) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(fVar, "data");
        this.f103321K = fVar;
        boolean z13 = false;
        if (fVar.m145178d() == 15) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC29069a.b bVar = AbstractC29069a.Companion;
        boolean m145171a = bVar.m145171a(fVar.m145178d(), 2);
        boolean m145171a2 = bVar.m145171a(fVar.m145178d(), 4);
        C21693c m130305o1 = ((C25162a) m106522i0()).m130304q1().m130305o1();
        if (m145171a && !z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        m130305o1.mo89091D0(z12);
        C21693c m130305o12 = ((C25162a) m106522i0()).m130303p1().m130305o1();
        if (m145171a2 && !z11) {
            z13 = true;
        }
        m130305o12.mo89091D0(z13);
    }

    /* renamed from: m0 */
    public final int m109742m0(boolean z11, boolean z12) {
        if (z11 && z12) {
            return 6;
        }
        if (z11) {
            return 2;
        }
        return z12 ? 4 : 15;
    }
}
