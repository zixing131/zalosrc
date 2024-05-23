package ja0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import kd0.C21693c;
import mj0.AbstractC23322a;
import p612wk.AbstractC29069a;
import q80.C25181t;

/* renamed from: ja0.r0 */
/* loaded from: classes6.dex */
public final class C21182r0 extends AbstractC20484a {

    /* renamed from: J */
    private AbstractC29069a.s f103314J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21182r0(ViewGroup viewGroup, final InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25181t(r1));
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: ja0.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21182r0.m109732k0(InterfaceC18319c.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m109732k0(InterfaceC18319c interfaceC18319c, C21182r0 c21182r0, View view) {
        AbstractC19074t.m100208f(c21182r0, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: l0 */
    public final void m109733l0(AbstractC29069a.s sVar) {
        AbstractC19074t.m100208f(sVar, "data");
        C21693c m130340o1 = ((C25181t) m106522i0()).m130340o1();
        if (sVar instanceof AbstractC29069a.s.o) {
            m130340o1.mo111926w1(AbstractC23322a.zds_ic_chevron_right_line_16);
        } else {
            m130340o1.mo111926w1(AbstractC23322a.zds_ic_chevron_down_line_16);
        }
        this.f103314J = sVar;
    }
}
