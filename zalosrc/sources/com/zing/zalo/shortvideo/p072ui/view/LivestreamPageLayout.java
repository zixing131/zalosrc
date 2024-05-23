package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c20.C3226p;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import q10.C25002e2;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class LivestreamPageLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC10282a f52922p;

    /* renamed from: q */
    private final int f52923q;

    /* renamed from: r */
    private final int f52924r;

    /* renamed from: s */
    private int f52925s;

    /* renamed from: t */
    private C25002e2 f52926t;

    /* renamed from: u */
    private ArrayList f52927u;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.LivestreamPageLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10282a {
        /* renamed from: a */
        void mo54424a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f52923q = AbstractC26112n.m134365F(this);
        this.f52924r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_padding);
        this.f52925s = -1;
        this.f52927u = new ArrayList();
    }

    public final InterfaceC10282a getCallback() {
        return this.f52922p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25002e2 m129801a = C25002e2.m129801a(this);
        AbstractC19074t.m100207e(m129801a, "bind(...)");
        this.f52926t = m129801a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25002e2 c25002e2 = this.f52926t;
        if (c25002e2 == null) {
            AbstractC19074t.m100223u("binding");
            c25002e2 = null;
        }
        LoadingLayout loadingLayout = c25002e2.f119890t;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        AbstractC26112n.m134383X(loadingLayout, 0, 0);
        FrameLayout frameLayout = c25002e2.f119889s;
        AbstractC19074t.m100207e(frameLayout, "lytContent");
        AbstractC26112n.m134383X(frameLayout, 0, 0);
        CommentBox commentBox = c25002e2.f119887q;
        AbstractC19074t.m100207e(commentBox, "boxComment");
        if (AbstractC26112n.m134378S(commentBox)) {
            int measuredHeight = getMeasuredHeight();
            CommentBox commentBox2 = c25002e2.f119887q;
            AbstractC19074t.m100207e(commentBox2, "boxComment");
            AbstractC26112n.m134381V(commentBox2, measuredHeight, 0);
        }
        for (View view : this.f52927u) {
            AbstractC26112n.m134383X(view, (getMeasuredHeight() - view.getMeasuredHeight()) / 2, (getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25002e2 c25002e2 = this.f52926t;
        if (c25002e2 == null) {
            AbstractC19074t.m100223u("binding");
            c25002e2 = null;
        }
        int m16358a = C3226p.Companion.m16358a(size, size2, 0, 0);
        FrameLayout frameLayout = c25002e2.f119889s;
        AbstractC19074t.m100207e(frameLayout, "lytContent");
        AbstractC26112n.m134387a0(frameLayout, size, 1073741824, m16358a, 1073741824);
        CommentBox commentBox = c25002e2.f119887q;
        AbstractC19074t.m100207e(commentBox, "boxComment");
        if (AbstractC26112n.m134378S(commentBox)) {
            CommentBox commentBox2 = c25002e2.f119887q;
            AbstractC19074t.m100207e(commentBox2, "boxComment");
            AbstractC26112n.m134387a0(commentBox2, size, 1073741824, 0, 0);
        }
        LoadingLayout loadingLayout = c25002e2.f119890t;
        AbstractC19074t.m100207e(loadingLayout, "lytLoading");
        AbstractC26112n.m134387a0(loadingLayout, size, 1073741824, size2, 1073741824);
        Iterator it = this.f52927u.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        InterfaceC10282a interfaceC10282a = this.f52922p;
        if (interfaceC10282a != null) {
            interfaceC10282a.mo54424a();
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52926t != null) {
            this.f52927u.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52926t != null) {
            this.f52927u.remove(view);
        }
    }

    public final void setCallback(InterfaceC10282a interfaceC10282a) {
        this.f52922p = interfaceC10282a;
    }
}
