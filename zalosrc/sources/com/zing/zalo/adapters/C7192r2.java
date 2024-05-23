package com.zing.zalo.adapters;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.zing.zalo.adapters.r2 */
/* loaded from: classes3.dex */
public class C7192r2 extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    b f39414a;

    /* renamed from: b */
    int f39415b;

    /* renamed from: c */
    public int f39416c = 0;

    /* renamed from: d */
    public int f39417d = 0;

    /* renamed from: e */
    public int f39418e = -1;

    /* renamed from: com.zing.zalo.adapters.r2$a */
    /* loaded from: classes3.dex */
    class a implements RecyclerView.InterfaceC1891r {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: a */
        public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: c */
        public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (motionEvent.getY() <= C7192r2.this.f39415b) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: e */
        public void mo954e(boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.r2$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        boolean mo36528a(int i11);

        /* renamed from: b */
        void mo36530b(View view, int i11);

        /* renamed from: c */
        int mo36532c(int i11);

        /* renamed from: d */
        View mo36534d(int i11, ViewGroup viewGroup);

        /* renamed from: e */
        boolean mo36536e(int i11);
    }

    public C7192r2(RecyclerView recyclerView, b bVar) {
        this.f39414a = bVar;
        recyclerView.m9825D(new a());
    }

    /* renamed from: l */
    private void m36599l(Canvas canvas, View view) {
        canvas.save();
        canvas.translate(0.0f, this.f39416c);
        view.draw(canvas);
        canvas.restore();
    }

    /* renamed from: m */
    private void m36600m(ViewGroup viewGroup, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        this.f39415b = measuredHeight;
        view.layout(0, 0, measuredWidth, measuredHeight);
    }

    /* renamed from: n */
    private View m36601n(int i11, RecyclerView recyclerView) {
        int mo36532c = this.f39414a.mo36532c(i11);
        this.f39418e = mo36532c;
        if (mo36532c >= 0) {
            View mo36534d = this.f39414a.mo36534d(mo36532c, recyclerView);
            this.f39414a.mo36530b(mo36534d, this.f39418e);
            return mo36534d;
        }
        return null;
    }

    /* renamed from: o */
    private View m36602o(RecyclerView recyclerView, int i11) {
        View view = null;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < recyclerView.getChildCount(); i13++) {
            View childAt = recyclerView.getChildAt(i13);
            if (childAt.getTop() > i11 && childAt.getTop() - i11 < i12) {
                i12 = childAt.getTop() - i11;
                view = childAt;
            }
        }
        return view;
    }

    /* renamed from: p */
    private void m36603p(Canvas canvas, View view, View view2) {
        canvas.save();
        canvas.translate(0.0f, (view2.getTop() - view.getHeight()) + this.f39417d);
        view.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        View m36602o;
        int m9817A0;
        View m36601n;
        super.mo10070k(canvas, recyclerView, c1899z);
        try {
            if (recyclerView.getChildAt(0) == null || (m36602o = m36602o(recyclerView, this.f39416c)) == null || (m9817A0 = recyclerView.m9817A0(m36602o)) == -1) {
                return;
            }
            boolean mo36528a = this.f39414a.mo36528a(m9817A0);
            if (mo36528a) {
                m9817A0--;
            }
            if (!this.f39414a.mo36536e(m9817A0) && (m36601n = m36601n(m9817A0, recyclerView)) != null) {
                m36600m(recyclerView, m36601n);
                if (mo36528a && m36602o.getTop() < (m36601n.getHeight() + this.f39416c) - this.f39417d) {
                    m36603p(canvas, m36601n, m36602o);
                } else {
                    m36599l(canvas, m36601n);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
