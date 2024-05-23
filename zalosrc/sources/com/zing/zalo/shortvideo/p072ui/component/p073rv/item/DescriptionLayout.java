package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s20.AbstractC26104f;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class DescriptionLayout extends FrameLayout {

    /* renamed from: A */
    private MotionEvent f50627A;

    /* renamed from: p */
    private final int f50628p;

    /* renamed from: q */
    private final DecelerateInterpolator f50629q;

    /* renamed from: r */
    private final int f50630r;

    /* renamed from: s */
    private boolean f50631s;

    /* renamed from: t */
    private int f50632t;

    /* renamed from: u */
    private long f50633u;

    /* renamed from: v */
    private long f50634v;

    /* renamed from: w */
    private final InterfaceC24854k f50635w;

    /* renamed from: x */
    private final InterfaceC24854k f50636x;

    /* renamed from: y */
    private final InterfaceC24854k f50637y;

    /* renamed from: z */
    private final int f50638z;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.DescriptionLayout$a */
    /* loaded from: classes5.dex */
    static final class C9585a extends AbstractC19075u implements InterfaceC18494a {
        C9585a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return DescriptionLayout.this.findViewById(AbstractC27409d.btnCollapse);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.DescriptionLayout$b */
    /* loaded from: classes5.dex */
    static final class C9586b extends AbstractC19075u implements InterfaceC18494a {
        C9586b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ScrollView mo12V4() {
            return (ScrollView) DescriptionLayout.this.findViewById(AbstractC27409d.scrDescription);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.DescriptionLayout$c */
    /* loaded from: classes5.dex */
    static final class C9587c extends AbstractC19075u implements InterfaceC18494a {
        C9587c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextView mo12V4() {
            return (TextView) DescriptionLayout.this.findViewById(AbstractC27409d.txtDescription);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f50628p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_description_to_collapse);
        this.f50629q = new DecelerateInterpolator();
        this.f50630r = 3;
        m129210a = AbstractC24856m.m129210a(new C9586b());
        this.f50635w = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9587c());
        this.f50636x = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C9585a());
        this.f50637y = m129210a3;
        this.f50638z = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m52105b(DescriptionLayout descriptionLayout) {
        AbstractC19074t.m100208f(descriptionLayout, "this$0");
        descriptionLayout.requestLayout();
    }

    private final View getBtnCollapse() {
        Object value = this.f50637y.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    private final ScrollView getScrDescription() {
        Object value = this.f50635w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (ScrollView) value;
    }

    private final TextView getTxtDescription() {
        Object value = this.f50636x.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (TextView) value;
    }

    /* renamed from: c */
    public void m52106c() {
        getTxtDescription().setMaxLines(3);
        AbstractC26112n.m134367H(getBtnCollapse());
        setAllowAnimation$zshort_release(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        AbstractC19074t.m100208f(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && (motionEvent2 = this.f50627A) != null && motionEvent2 != null) {
                float abs = Math.abs(motionEvent2.getX() - motionEvent.getX());
                float abs2 = Math.abs(motionEvent2.getY() - motionEvent.getY());
                int i11 = this.f50638z;
                if (abs >= i11 && abs >= abs2) {
                    this.f50627A = null;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    return true;
                }
                if (abs2 >= i11 && abs2 >= abs) {
                    this.f50627A = null;
                    if ((motionEvent.getY() > motionEvent2.getY() && getScrDescription().getScrollY() == 0) || (motionEvent.getY() < motionEvent2.getY() && getScrDescription().getScrollY() == getTxtDescription().getHeight() - getScrDescription().getHeight())) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return true;
                    }
                }
            }
        } else if (getScrDescription().getHeight() < getTxtDescription().getHeight() && getScrDescription().getHeight() > motionEvent.getY()) {
            this.f50627A = AbstractC26104f.m134330a(motionEvent);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            this.f50627A = null;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC26112n.m134383X(getScrDescription(), 0, 0);
        if (AbstractC26112n.m134378S(getBtnCollapse())) {
            AbstractC26112n.m134383X(getBtnCollapse(), getScrDescription().getMeasuredHeight() + this.f50628p, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float m116587j;
        long j11;
        int size = View.MeasureSpec.getSize(i11);
        AbstractC26112n.m134387a0(getScrDescription(), size, 1073741824, View.MeasureSpec.getSize(i12), Integer.MIN_VALUE);
        if (getScrDescription().getMeasuredHeight() < getTxtDescription().getMeasuredHeight() && getScrDescription().getMeasuredHeight() > getTxtDescription().getMeasuredHeight() - (getTxtDescription().getLineHeight() * this.f50630r)) {
            AbstractC26112n.m134387a0(getScrDescription(), size, 1073741824, getTxtDescription().getMeasuredHeight(), 1073741824);
        }
        int measuredHeight = getScrDescription().getMeasuredHeight();
        if (getTxtDescription().getMaxLines() > 3) {
            AbstractC26112n.m134431w0(getBtnCollapse());
            AbstractC26112n.m134387a0(getBtnCollapse(), size, 1073741824, 0, 0);
            measuredHeight += this.f50628p + getBtnCollapse().getMeasuredHeight();
        } else {
            AbstractC26112n.m134367H(getBtnCollapse());
        }
        if (this.f50631s) {
            if (this.f50633u == 0) {
                this.f50632t = getMeasuredHeight();
                this.f50633u = System.currentTimeMillis();
                if (measuredHeight > this.f50632t) {
                    j11 = 250;
                } else {
                    j11 = 150;
                }
                this.f50634v = j11;
            }
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f50633u)) / ((float) this.f50634v);
            DecelerateInterpolator decelerateInterpolator = this.f50629q;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = decelerateInterpolator.getInterpolation(m116587j);
            int i13 = (int) (((1.0f - interpolation) * this.f50632t) + (interpolation * measuredHeight));
            if (measuredHeight != i13) {
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        DescriptionLayout.m52105b(DescriptionLayout.this);
                    }
                });
                measuredHeight = i13;
            } else {
                setAllowAnimation$zshort_release(false);
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public void setAllowAnimation$zshort_release(boolean z11) {
        this.f50631s = z11;
        this.f50633u = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 == 8) {
            AbstractC26112n.m134367H(getBtnCollapse());
        }
    }
}
