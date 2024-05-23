package qe0;

import com.zing.zalo.p077ui.zviews.ModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19074t;

/* renamed from: qe0.f */
/* loaded from: classes4.dex */
public abstract class AbstractC25250f {
    /* renamed from: a */
    public static final void m130679a(ModalBottomSheet modalBottomSheet, BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(modalBottomSheet, "<this>");
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        BottomSheet.AbstractC16910a m81929jM = modalBottomSheet.m81929jM();
        if (!AbstractC19074t.m100204b(m81929jM, abstractC16910a)) {
            if (m81929jM instanceof C25248d) {
                ((C25248d) m81929jM).m130677c(abstractC16910a);
                return;
            }
            if (m81929jM == null) {
                C25248d c25248d = new C25248d();
                c25248d.m130677c(abstractC16910a);
                modalBottomSheet.m81933qM(c25248d);
            } else {
                C25248d c25248d2 = new C25248d();
                c25248d2.m130677c(m81929jM);
                c25248d2.m130677c(abstractC16910a);
                modalBottomSheet.m81933qM(c25248d2);
            }
        }
    }

    /* renamed from: b */
    public static final void m130680b(ModalBottomSheet modalBottomSheet, BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(modalBottomSheet, "<this>");
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        BottomSheet.AbstractC16910a m81929jM = modalBottomSheet.m81929jM();
        if (AbstractC19074t.m100204b(m81929jM, abstractC16910a)) {
            modalBottomSheet.m81933qM(null);
        } else if (m81929jM instanceof C25248d) {
            ((C25248d) m81929jM).m130678d(abstractC16910a);
        } else if (m81929jM != null) {
            modalBottomSheet.m81933qM(null);
        }
    }
}
