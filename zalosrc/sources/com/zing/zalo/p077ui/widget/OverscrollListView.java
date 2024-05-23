package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;

/* loaded from: classes6.dex */
public class OverscrollListView extends ListView {

    /* renamed from: p */
    boolean f69406p;

    /* renamed from: q */
    AbsListView.OnScrollListener f69407q;

    /* renamed from: r */
    float f69408r;

    /* renamed from: s */
    boolean f69409s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.OverscrollListView$a */
    /* loaded from: classes6.dex */
    public class C13511a implements AbsListView.OnScrollListener {
        C13511a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
            AbsListView.OnScrollListener onScrollListener = OverscrollListView.this.f69407q;
            if (onScrollListener != null) {
                onScrollListener.onScroll(absListView, i11, i12, i13);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i11) {
            boolean z11;
            OverscrollListView overscrollListView = OverscrollListView.this;
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            overscrollListView.f69406p = z11;
            if (i11 != 0) {
                overscrollListView.f69409s = false;
            }
            AbsListView.OnScrollListener onScrollListener = overscrollListView.f69407q;
            if (onScrollListener != null) {
                onScrollListener.onScrollStateChanged(absListView, i11);
            }
        }
    }

    public OverscrollListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69406p = false;
        this.f69408r = 0.0f;
        this.f69409s = false;
        m75804a();
    }

    /* renamed from: a */
    void m75804a() {
        super.setOnScrollListener(new C13511a());
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (this.f69408r - motionEvent.getRawY() > 0.0f && this.f69409s) {
                    this.f69409s = false;
                }
                this.f69408r = motionEvent.getRawY();
            }
        } else {
            this.f69408r = motionEvent.getRawY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f69407q = onScrollListener;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public void setSelection(int i11) {
        super.setSelection(i11);
        this.f69409s = false;
    }
}
