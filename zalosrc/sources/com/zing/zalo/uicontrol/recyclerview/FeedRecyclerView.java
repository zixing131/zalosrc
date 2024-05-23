package com.zing.zalo.uicontrol.recyclerview;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class FeedRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    long f83921V0;

    /* renamed from: W0 */
    private final boolean f83922W0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.recyclerview.FeedRecyclerView$a */
    /* loaded from: classes4.dex */
    public class C16645a extends RecyclerView.AbstractC1892s {
        C16645a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            FeedRecyclerView.this.f83921V0 = SystemClock.elapsedRealtime();
        }
    }

    public FeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a2 */
    public boolean m88422a2(int i11) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f83921V0 == 0) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f83921V0;
        int m9737T1 = ((LinearLayoutManager) getLayoutManager()).m9737T1();
        int m9741Z1 = ((LinearLayoutManager) getLayoutManager()).m9741Z1();
        if (getAdapter() != null) {
            int mo10003k = getAdapter().mo10003k();
            if (m9737T1 == 0 && i11 > 0 && elapsedRealtime > 1000) {
                return false;
            }
            if (m9741Z1 == mo10003k - 1 && i11 < 0 && elapsedRealtime > 1000) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void scrollTo(int i11, int i12) {
        if (getScrollX() != i11) {
            this.f83921V0 = SystemClock.elapsedRealtime();
        }
        super.scrollTo(i11, i12);
    }

    public FeedRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83921V0 = 0L;
        this.f83922W0 = true;
        super.m9826E(new C16645a());
    }
}
