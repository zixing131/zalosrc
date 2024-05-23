package com.zing.zalo.adapters;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.adapters.d2 */
/* loaded from: classes3.dex */
public class C7038d2 extends RecyclerView.AbstractC1887n {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        super.mo10066g(rect, view, recyclerView, c1899z);
        int m9817A0 = recyclerView.m9817A0(view);
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        C7026c2 c7026c2 = (C7026c2) recyclerView.getAdapter();
        if (m9817A0 == layoutManager.m10127i() - 1 && c7026c2.m35908R() != 0) {
            rect.set(0, 0, 0, 0);
        } else if (m9817A0 == 0) {
            rect.top = AbstractC23136l9.m118742r(18.0f);
        } else {
            rect.top = AbstractC23136l9.m118742r(28.0f);
        }
    }
}
