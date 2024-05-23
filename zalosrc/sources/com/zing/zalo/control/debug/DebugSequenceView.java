package com.zing.zalo.control.debug;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class DebugSequenceView extends FrameLayout {

    /* renamed from: p */
    private RecyclerView f42787p;

    public final RecyclerView getRecyclerView() {
        return this.f42787p;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "<set-?>");
        this.f42787p = recyclerView;
    }
}
