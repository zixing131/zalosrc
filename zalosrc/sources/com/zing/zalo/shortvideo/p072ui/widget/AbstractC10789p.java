package com.zing.zalo.shortvideo.p072ui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b10.AbstractC2487f;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import pm0.C24860q;
import z10.C31189w;

/* renamed from: com.zing.zalo.shortvideo.ui.widget.p */
/* loaded from: classes5.dex */
public abstract class AbstractC10789p {
    /* renamed from: c */
    private static final float m56023c(View view) {
        double height = (r0.height() / view.getMeasuredHeight()) * 100;
        if (view.getLocalVisibleRect(new Rect())) {
            return (float) height;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Integer m56024d(RecyclerView recyclerView) {
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager;
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof OverScrollableRecyclerView.LinearLayoutManager) {
            linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return null;
        }
        return Integer.valueOf(linearLayoutManager.m9745c2());
    }

    /* renamed from: e */
    private static final C24860q m56025e(RecyclerView recyclerView, Integer num) {
        OverScrollableRecyclerView.LinearLayoutManager linearLayoutManager;
        int m9740Y1;
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof OverScrollableRecyclerView.LinearLayoutManager) {
            linearLayoutManager = (OverScrollableRecyclerView.LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null) {
            return null;
        }
        if (num != null) {
            m9740Y1 = num.intValue();
        } else {
            m9740Y1 = linearLayoutManager.m9740Y1();
        }
        recyclerView.getGlobalVisibleRect(new Rect());
        View mo9732P = linearLayoutManager.mo9732P(m9740Y1);
        if (mo9732P == null) {
            return null;
        }
        return new C24860q(Integer.valueOf(m9740Y1), Float.valueOf(m56023c(mo9732P)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ C24860q m56026f(RecyclerView recyclerView, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return m56025e(recyclerView, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Integer m56027g(RecyclerView recyclerView) {
        C31189w c31189w;
        AbstractC2487f m151943j0;
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        if (adapter instanceof C31189w) {
            c31189w = (C31189w) adapter;
        } else {
            c31189w = null;
        }
        if (c31189w == null || (m151943j0 = c31189w.m151943j0()) == null) {
            return null;
        }
        int m12570a = m151943j0.m12570a();
        int mo10003k = c31189w.mo10003k();
        if (m12570a == 1) {
            mo10003k--;
        }
        if (mo10003k < 0) {
            return null;
        }
        return Integer.valueOf(mo10003k);
    }
}
