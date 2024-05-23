package com.zing.zalo.adapters;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import p148f3.C18711c;
import pm0.C24848g0;

/* renamed from: com.zing.zalo.adapters.s8 */
/* loaded from: classes3.dex */
public final class C7209s8 extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private a f39542a;

    /* renamed from: b */
    private int f39543b;

    /* renamed from: com.zing.zalo.adapters.s8$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        boolean mo36685a(int i11);

        /* renamed from: b */
        void mo36686b(View view, int i11);

        /* renamed from: c */
        int mo36687c(int i11);

        /* renamed from: d */
        View mo36688d(int i11, ViewGroup viewGroup);

        /* renamed from: e */
        boolean mo36689e(int i11);
    }

    public C7209s8(a aVar) {
        AbstractC19074t.m100208f(aVar, "delegate");
        this.f39542a = aVar;
    }

    /* renamed from: l */
    private final void m36680l(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        view.draw(canvas);
        canvas.restore();
    }

    /* renamed from: m */
    private final View m36681m(RecyclerView recyclerView, int i11) {
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (childAt.getBottom() > i11 && childAt.getTop() <= i11) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    private final View m36682n(int i11, RecyclerView recyclerView) {
        int mo36687c = this.f39542a.mo36687c(i11);
        View mo36688d = this.f39542a.mo36688d(mo36687c, recyclerView);
        this.f39542a.mo36686b(mo36688d, mo36687c);
        return mo36688d;
    }

    /* renamed from: o */
    private final void m36683o(ViewGroup viewGroup, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        this.f39543b = measuredHeight;
        C24848g0 c24848g0 = C24848g0.f119245a;
        view.layout(0, 0, measuredWidth, measuredHeight);
    }

    /* renamed from: p */
    private final void m36684p(Canvas canvas, View view, View view2) {
        canvas.save();
        canvas.translate(0.0f, view2.getTop() - view.getHeight());
        view.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m9817A0;
        AbstractC19074t.m100208f(canvas, C18711c.f94014e);
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        super.mo10070k(canvas, recyclerView, c1899z);
        View childAt = recyclerView.getChildAt(0);
        if (childAt != null && (m9817A0 = recyclerView.m9817A0(childAt)) != -1 && !this.f39542a.mo36689e(m9817A0)) {
            View m36682n = m36682n(m9817A0, recyclerView);
            m36683o(recyclerView, m36682n);
            View m36681m = m36681m(recyclerView, m36682n.getBottom());
            if (m36681m != null && this.f39542a.mo36685a(recyclerView.m9817A0(m36681m)) && m36681m.getTop() > 0) {
                m36684p(canvas, m36682n, m36681m);
            } else {
                m36680l(canvas, m36682n);
            }
        }
    }
}
