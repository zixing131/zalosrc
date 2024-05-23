package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public class HeaderLayout extends FrameLayout {

    /* renamed from: p */
    private final int f54079p;

    /* renamed from: q */
    private final InterfaceC24854k f54080q;

    /* renamed from: r */
    private final InterfaceC24854k f54081r;

    /* renamed from: s */
    private final InterfaceC24854k f54082s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.HeaderLayout$a */
    /* loaded from: classes5.dex */
    public static final class C10680a extends AbstractC19075u implements InterfaceC18494a {
        C10680a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final View mo12V4() {
            return HeaderLayout.this.findViewById(AbstractC27409d.lytCenter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.HeaderLayout$b */
    /* loaded from: classes5.dex */
    public static final class C10681b extends AbstractC19075u implements InterfaceC18494a {
        C10681b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final View mo12V4() {
            return HeaderLayout.this.findViewById(AbstractC27409d.lytLeft);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.HeaderLayout$c */
    /* loaded from: classes5.dex */
    public static final class C10682c extends AbstractC19075u implements InterfaceC18494a {
        C10682c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final View mo12V4() {
            return HeaderLayout.this.findViewById(AbstractC27409d.lytRight);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f54079p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        m129210a = AbstractC24856m.m129210a(new C10681b());
        this.f54080q = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10682c());
        this.f54081r = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C10680a());
        this.f54082s = m129210a3;
    }

    public final int getHeaderHeight() {
        return this.f54079p;
    }

    public final View getLytCenter() {
        return (View) this.f54082s.getValue();
    }

    public final View getLytLeft() {
        return (View) this.f54080q.getValue();
    }

    public final View getLytRight() {
        return (View) this.f54081r.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        View lytLeft = getLytLeft();
        if (lytLeft != null) {
            AbstractC26112n.m134383X(lytLeft, 0, 0);
        }
        View lytRight = getLytRight();
        if (lytRight != null) {
            AbstractC26112n.m134384Y(lytRight, 0, getMeasuredWidth());
        }
        View lytCenter = getLytCenter();
        if (lytCenter != null) {
            AbstractC26112n.m134383X(lytCenter, 0, (getMeasuredWidth() - lytCenter.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        View lytLeft = getLytLeft();
        if (lytLeft != null && AbstractC26112n.m134378S(lytLeft)) {
            AbstractC26112n.m134387a0(lytLeft, 0, 0, this.f54079p, 1073741824);
            i13 = lytLeft.getMeasuredWidth();
        } else {
            i13 = 0;
        }
        View lytRight = getLytRight();
        if (lytRight != null && AbstractC26112n.m134378S(lytRight)) {
            AbstractC26112n.m134387a0(lytRight, 0, 0, this.f54079p, 1073741824);
            i13 = AbstractC22543l.m116580c(lytRight.getMeasuredWidth(), i13);
        }
        View lytCenter = getLytCenter();
        if (lytCenter != null && AbstractC26112n.m134378S(lytCenter)) {
            AbstractC26112n.m134387a0(lytCenter, size - (i13 * 2), 1073741824, this.f54079p, 1073741824);
        }
        setMeasuredDimension(size, this.f54079p);
    }
}
