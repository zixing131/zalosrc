package com.zing.zalo.shortvideo.p072ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.shortvideo.ui.widget.m */
/* loaded from: classes5.dex */
public final class C10762m extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final int f54393a;

    public C10762m(int i11) {
        this.f54393a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        int m9817A0 = recyclerView.m9817A0(view);
        if (m9817A0 == -1) {
            return;
        }
        if (recyclerView.getAdapter() != null && m9817A0 == r4.mo10003k() - 1) {
            rect.right = 0;
        } else {
            rect.right = this.f54393a;
        }
    }
}
