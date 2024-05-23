package com.zing.zalo.feed.formpostfeed.p063ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.feed.formpostfeed.p063ui.C8459a;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.formpostfeed.ui.b */
/* loaded from: classes4.dex */
public final class C8460b extends RecyclerView.AbstractC1887n {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m45050b;
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        super.mo10066g(rect, view, recyclerView, c1899z);
        int m9817A0 = recyclerView.m9817A0(view);
        C8459a.a aVar = C8459a.Companion;
        if (m9817A0 == 0) {
            m45050b = aVar.m45049a();
        } else {
            m45050b = aVar.m45050b();
        }
        rect.left = m45050b;
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        int i12 = 0;
        if (adapter != null) {
            i11 = adapter.mo10003k();
        } else {
            i11 = 0;
        }
        if (m9817A0 == i11 - 1) {
            i12 = C8459a.Companion.m45049a();
        }
        rect.right = i12;
    }
}
