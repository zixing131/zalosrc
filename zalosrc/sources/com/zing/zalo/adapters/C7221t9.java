package com.zing.zalo.adapters;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.zing.zalo.adapters.t9 */
/* loaded from: classes3.dex */
public class C7221t9 extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final int f39599a;

    public C7221t9(int i11) {
        this.f39599a = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        super.mo10066g(rect, view, recyclerView, c1899z);
        int m9817A0 = recyclerView.m9817A0(view);
        int m10127i = recyclerView.getLayoutManager().m10127i();
        if (m10127i != 1 && m9817A0 != m10127i - 1) {
            rect.right = this.f39599a;
        }
    }
}
