package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class FeedRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    InterfaceC8863b f47352V0;

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedRecyclerView$a */
    /* loaded from: classes4.dex */
    class C8862a extends RecyclerView.AbstractC1892s {
        C8862a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            InterfaceC8863b interfaceC8863b;
            super.mo952b(recyclerView, i11);
            if (i11 == 0 && (interfaceC8863b = FeedRecyclerView.this.f47352V0) != null) {
                interfaceC8863b.mo43267c();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedRecyclerView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8863b {
        /* renamed from: a */
        void mo43265a();

        /* renamed from: b */
        void mo43266b();

        /* renamed from: c */
        void mo43267c();
    }

    public FeedRecyclerView(Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC8863b interfaceC8863b;
        InterfaceC8863b interfaceC8863b2;
        if (motionEvent != null && motionEvent.getActionMasked() == 0 && (interfaceC8863b2 = this.f47352V0) != null) {
            interfaceC8863b2.mo43265a();
        }
        if (motionEvent != null && ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (interfaceC8863b = this.f47352V0) != null)) {
            interfaceC8863b.mo43266b();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setCatchTouchEventListener(InterfaceC8863b interfaceC8863b) {
        this.f47352V0 = interfaceC8863b;
    }

    public FeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m9826E(new C8862a());
    }
}
