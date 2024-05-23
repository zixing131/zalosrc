package com.zing.zalo.shortvideo.p072ui.widget.p075rv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public final class ListClickableRecyclerView extends OverScrollableRecyclerView {

    /* renamed from: e1 */
    private InterfaceC18494a f54615e1;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.rv.ListClickableRecyclerView$a */
    /* loaded from: classes5.dex */
    static final class C10823a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10823a f54616q = new C10823a();

        C10823a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m56138a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m56138a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListClickableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54615e1 = C10823a.f54616q;
    }

    /* renamed from: j2 */
    public final void m56137j2() {
        this.f54615e1.mo12V4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (motionEvent.getActionMasked() == 1 && getScrollState() == 0) {
            m56137j2();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOnListClickListener(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "listener");
        this.f54615e1 = interfaceC18494a;
    }
}
