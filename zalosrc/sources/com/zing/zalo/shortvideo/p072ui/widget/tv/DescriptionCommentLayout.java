package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q20.C25100w;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class DescriptionCommentLayout extends FrameLayout {

    /* renamed from: p */
    private boolean f54710p;

    /* renamed from: q */
    private boolean f54711q;

    /* renamed from: r */
    private final DecelerateInterpolator f54712r;

    /* renamed from: s */
    private int f54713s;

    /* renamed from: t */
    private long f54714t;

    /* renamed from: u */
    private long f54715u;

    /* renamed from: v */
    private final InterfaceC24854k f54716v;

    /* renamed from: w */
    private final InterfaceC24854k f54717w;

    /* renamed from: x */
    private final int f54718x;

    /* renamed from: y */
    private final Handler f54719y;

    /* renamed from: z */
    private InterfaceC18505l f54720z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.DescriptionCommentLayout$a */
    /* loaded from: classes5.dex */
    static final class C10844a extends AbstractC19075u implements InterfaceC18494a {
        C10844a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return DescriptionCommentLayout.this.findViewById(AbstractC27409d.rvCta);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.tv.DescriptionCommentLayout$b */
    /* loaded from: classes5.dex */
    static final class C10845b extends AbstractC19075u implements InterfaceC18494a {
        C10845b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo12V4() {
            return (TextView) DescriptionCommentLayout.this.findViewById(AbstractC27409d.txtDescription);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptionCommentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        this.f54712r = new DecelerateInterpolator();
        m129210a = AbstractC24856m.m129210a(new C10845b());
        this.f54716v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10844a());
        this.f54717w = m129210a2;
        this.f54718x = AbstractC26105g.m134347n(8);
        this.f54719y = new Handler(Looper.getMainLooper());
    }

    /* renamed from: d */
    private final void m56251d(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                this.f54719y.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (motionEvent.getY() > getTxtDescription().getBottom()) {
            return;
        }
        this.f54710p = false;
        this.f54719y.postDelayed(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.e
            @Override // java.lang.Runnable
            public final void run() {
                DescriptionCommentLayout.m56252e(DescriptionCommentLayout.this);
            }
        }, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m56252e(DescriptionCommentLayout descriptionCommentLayout) {
        AbstractC19074t.m100208f(descriptionCommentLayout, "this$0");
        InterfaceC18505l interfaceC18505l = descriptionCommentLayout.f54720z;
        if (interfaceC18505l != null) {
            interfaceC18505l.mo205i9(Boolean.TRUE);
        }
        C25100w c25100w = C25100w.f120572a;
        Context context = descriptionCommentLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c25100w.m130168a(context, 30L);
        descriptionCommentLayout.f54710p = true;
        descriptionCommentLayout.getParent().requestDisallowInterceptTouchEvent(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m56253g(DescriptionCommentLayout descriptionCommentLayout, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(descriptionCommentLayout, "this$0");
        AbstractC19074t.m100205c(motionEvent);
        descriptionCommentLayout.m56251d(motionEvent);
        return true;
    }

    private final View getRvCta() {
        Object value = this.f54717w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final TextView getTxtDescription() {
        Object value = this.f54716v.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m56254h(DescriptionCommentLayout descriptionCommentLayout) {
        AbstractC19074t.m100208f(descriptionCommentLayout, "this$0");
        descriptionCommentLayout.requestLayout();
    }

    /* renamed from: f */
    public final boolean m56255f() {
        return this.f54711q;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m56253g;
                m56253g = DescriptionCommentLayout.m56253g(DescriptionCommentLayout.this, view, motionEvent);
                return m56253g;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (AbstractC26112n.m134378S(getTxtDescription())) {
            AbstractC26112n.m134383X(getTxtDescription(), 0, 0);
        }
        if (AbstractC26112n.m134378S(getRvCta())) {
            AbstractC26112n.m134383X(getRvCta(), getTxtDescription().getBottom() + this.f54718x, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m134433y;
        float m116587j;
        long j11;
        int size = View.MeasureSpec.getSize(i11);
        AbstractC26112n.m134387a0(getTxtDescription(), size, 1073741824, View.MeasureSpec.getSize(i12), Integer.MIN_VALUE);
        int measuredHeight = getTxtDescription().getMeasuredHeight();
        if (this.f54711q) {
            if (this.f54714t == 0) {
                this.f54713s = getMeasuredHeight();
                this.f54714t = System.currentTimeMillis();
                if (measuredHeight > this.f54713s) {
                    j11 = 250;
                } else {
                    j11 = 150;
                }
                this.f54715u = j11;
            }
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f54714t)) / ((float) this.f54715u);
            DecelerateInterpolator decelerateInterpolator = this.f54712r;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = decelerateInterpolator.getInterpolation(m116587j);
            int i13 = (int) (((1.0f - interpolation) * this.f54713s) + (interpolation * measuredHeight));
            if (measuredHeight != i13) {
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.widget.tv.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        DescriptionCommentLayout.m56254h(DescriptionCommentLayout.this);
                    }
                });
                measuredHeight = i13;
            } else {
                setAllowAnimation$zshort_release(false);
            }
        }
        if (AbstractC26112n.m134378S(getRvCta())) {
            ViewGroup.LayoutParams layoutParams = getRvCta().getLayoutParams();
            if (layoutParams != null) {
                m134433y = layoutParams.height;
            } else {
                m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_channel_cta_height);
            }
            int i14 = m134433y + this.f54718x;
            AbstractC26112n.m134387a0(getRvCta(), size, 1073741824, i14, 1073741824);
            measuredHeight += i14;
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setAllowAnimation$zshort_release(boolean z11) {
        this.f54711q = z11;
        this.f54714t = 0L;
    }

    public final void setOnLongTouchDesc(InterfaceC18505l interfaceC18505l) {
        this.f54720z = interfaceC18505l;
    }
}
