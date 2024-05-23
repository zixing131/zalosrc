package com.zing.zalo.p077ui.widget;

import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import l00.AbstractC21994b;

/* renamed from: com.zing.zalo.ui.widget.h0 */
/* loaded from: classes6.dex */
public abstract class AbstractC13642h0 {
    /* renamed from: a */
    public static final AbstractC21994b m76247a(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "<this>");
        int itemDecorationCount = recyclerView.getItemDecorationCount();
        for (int i11 = 0; i11 < itemDecorationCount; i11++) {
            RecyclerView.AbstractC1887n m9835J0 = recyclerView.m9835J0(i11);
            AbstractC19074t.m100207e(m9835J0, "getItemDecorationAt(...)");
            if (m9835J0 instanceof AbstractC21994b) {
                return (AbstractC21994b) m9835J0;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final void m76248b(RecyclerView recyclerView, AbstractC21994b abstractC21994b) {
        AbstractC19074t.m100208f(recyclerView, "<this>");
        AbstractC21994b m76247a = m76247a(recyclerView);
        if (!AbstractC19074t.m100204b(abstractC21994b, m76247a)) {
            if (m76247a != null) {
                m76247a.m114863n(null);
                recyclerView.m9907x1(m76247a);
            }
            if (abstractC21994b != null) {
                abstractC21994b.m114863n(recyclerView);
            }
        }
    }
}
