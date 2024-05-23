package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.view.CommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import q10.C24993c1;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class CommentLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC10177a f52666p;

    /* renamed from: q */
    private final int f52667q;

    /* renamed from: r */
    private final int f52668r;

    /* renamed from: s */
    private C24993c1 f52669s;

    /* renamed from: t */
    private ArrayList f52670t;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.CommentLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10177a {
        /* renamed from: a */
        void mo54130a();

        /* renamed from: b */
        void mo54131b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f52667q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_bts_header_height);
        this.f52670t = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m54129b(C24993c1 c24993c1, View view) {
        AbstractC19074t.m100208f(c24993c1, "$this_apply");
        c24993c1.f119809q.m55703x();
    }

    public final InterfaceC10177a getCallback() {
        return this.f52666p;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        final C24993c1 m129775a = C24993c1.m129775a(this);
        AbstractC19074t.m100207e(m129775a, "bind(...)");
        m129775a.f119810r.setOnClickListener(new View.OnClickListener() { // from class: m20.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommentLayout.m54129b(C24993c1.this, view);
            }
        });
        this.f52669s = m129775a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C24993c1 c24993c1 = this.f52669s;
        if (c24993c1 == null) {
            AbstractC19074t.m100223u("binding");
            c24993c1 = null;
        }
        View view = c24993c1.f119810r;
        AbstractC19074t.m100207e(view, "dimContent");
        if (AbstractC26112n.m134378S(view)) {
            View view2 = c24993c1.f119810r;
            AbstractC19074t.m100207e(view2, "dimContent");
            AbstractC26112n.m134383X(view2, 0, 0);
        }
        SimpleShadowTextView simpleShadowTextView = c24993c1.f119815w;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtTitle");
        AbstractC26112n.m134383X(simpleShadowTextView, 0, 0);
        int i15 = this.f52667q + this.f52668r;
        FrameLayout frameLayout = c24993c1.f119811s;
        AbstractC19074t.m100207e(frameLayout, "flComment");
        AbstractC26112n.m134383X(frameLayout, i15, 0);
        CommentBox commentBox = c24993c1.f119809q;
        AbstractC19074t.m100207e(commentBox, "boxComment");
        if (AbstractC26112n.m134378S(commentBox)) {
            CommentBox commentBox2 = c24993c1.f119809q;
            AbstractC19074t.m100207e(commentBox2, "boxComment");
            AbstractC26112n.m134381V(commentBox2, getMeasuredHeight(), 0);
        }
        for (View view3 : this.f52670t) {
            AbstractC26112n.m134383X(view3, (getMeasuredHeight() - view3.getMeasuredHeight()) / 2, (getMeasuredWidth() - view3.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C24993c1 c24993c1 = this.f52669s;
        if (c24993c1 == null) {
            AbstractC19074t.m100223u("binding");
            c24993c1 = null;
        }
        SimpleShadowTextView simpleShadowTextView = c24993c1.f119815w;
        AbstractC19074t.m100207e(simpleShadowTextView, "txtTitle");
        AbstractC26112n.m134387a0(simpleShadowTextView, size, 1073741824, this.f52667q, 1073741824);
        int i13 = (size2 - this.f52667q) - this.f52668r;
        CommentBox commentBox = c24993c1.f119809q;
        AbstractC19074t.m100207e(commentBox, "boxComment");
        if (AbstractC26112n.m134378S(commentBox)) {
            CommentBox commentBox2 = c24993c1.f119809q;
            AbstractC19074t.m100207e(commentBox2, "boxComment");
            AbstractC26112n.m134387a0(commentBox2, size, 1073741824, i13, Integer.MIN_VALUE);
            i13 -= c24993c1.f119809q.getMeasuredHeight();
            if (!c24993c1.f119809q.m55694E()) {
                InterfaceC10177a interfaceC10177a = this.f52666p;
                if (interfaceC10177a != null) {
                    interfaceC10177a.mo54131b();
                }
            } else if (i13 < 0) {
                InterfaceC10177a interfaceC10177a2 = this.f52666p;
                if (interfaceC10177a2 != null) {
                    interfaceC10177a2.mo54130a();
                }
                i13 = 0;
            }
        }
        FrameLayout frameLayout = c24993c1.f119811s;
        AbstractC19074t.m100207e(frameLayout, "flComment");
        AbstractC26112n.m134387a0(frameLayout, size, 1073741824, i13, 1073741824);
        View view = c24993c1.f119810r;
        AbstractC19074t.m100207e(view, "dimContent");
        if (AbstractC26112n.m134378S(view)) {
            View view2 = c24993c1.f119810r;
            AbstractC19074t.m100207e(view2, "dimContent");
            AbstractC26112n.m134387a0(view2, size, 1073741824, this.f52667q + this.f52668r + i13, 1073741824);
        }
        Iterator it = this.f52670t.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52669s != null) {
            this.f52670t.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52669s != null) {
            this.f52670t.remove(view);
        }
    }

    public final void setCallback(InterfaceC10177a interfaceC10177a) {
        this.f52666p = interfaceC10177a;
    }
}
