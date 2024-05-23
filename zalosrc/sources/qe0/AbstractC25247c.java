package qe0;

import com.zing.zalo.zdesign.component.BottomSheet;
import fn0.AbstractC19074t;

/* renamed from: qe0.c */
/* loaded from: classes4.dex */
public abstract class AbstractC25247c {
    /* renamed from: a */
    public static final void m130673a(BottomSheet bottomSheet, BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(bottomSheet, "<this>");
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        BottomSheet.AbstractC16910a m130674b = m130674b(bottomSheet);
        if (!AbstractC19074t.m100204b(m130674b, abstractC16910a)) {
            if (m130674b instanceof C25245a) {
                ((C25245a) m130674b).m130671c(abstractC16910a);
                return;
            }
            if (m130674b == null) {
                C25245a c25245a = new C25245a();
                c25245a.m130671c(abstractC16910a);
                m130676d(bottomSheet, c25245a);
            } else {
                C25245a c25245a2 = new C25245a();
                c25245a2.m130671c(m130674b);
                c25245a2.m130671c(abstractC16910a);
                m130676d(bottomSheet, c25245a2);
            }
        }
    }

    /* renamed from: b */
    public static final BottomSheet.AbstractC16910a m130674b(BottomSheet bottomSheet) {
        AbstractC19074t.m100208f(bottomSheet, "<this>");
        return bottomSheet.m90515eL();
    }

    /* renamed from: c */
    public static final void m130675c(BottomSheet bottomSheet, BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(bottomSheet, "<this>");
        AbstractC19074t.m100208f(abstractC16910a, "listener");
        BottomSheet.AbstractC16910a m130674b = m130674b(bottomSheet);
        if (AbstractC19074t.m100204b(m130674b, abstractC16910a)) {
            m130676d(bottomSheet, null);
        } else if (m130674b instanceof C25245a) {
            ((C25245a) m130674b).m130672d(abstractC16910a);
        } else if (m130674b != null) {
            m130676d(bottomSheet, null);
        }
    }

    /* renamed from: d */
    public static final void m130676d(BottomSheet bottomSheet, BottomSheet.AbstractC16910a abstractC16910a) {
        AbstractC19074t.m100208f(bottomSheet, "<this>");
        bottomSheet.m90530xL(abstractC16910a);
    }
}
