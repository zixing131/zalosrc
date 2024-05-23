package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
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
public final class ExtraActionLayout extends FrameLayout {

    /* renamed from: p */
    private final int f50647p;

    /* renamed from: q */
    private final DecelerateInterpolator f50648q;

    /* renamed from: r */
    private long f50649r;

    /* renamed from: s */
    private long f50650s;

    /* renamed from: t */
    private final InterfaceC24854k f50651t;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.ExtraActionLayout$a */
    /* loaded from: classes5.dex */
    static final class C9588a extends AbstractC19075u implements InterfaceC18494a {
        C9588a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View mo12V4() {
            return ExtraActionLayout.this.findViewById(AbstractC27409d.btnExtraAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraActionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f50647p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_extra_btn_margin);
        this.f50648q = new DecelerateInterpolator();
        this.f50650s = 300L;
        m129210a = AbstractC24856m.m129210a(new C9588a());
        this.f50651t = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m52111b(ExtraActionLayout extraActionLayout) {
        AbstractC19074t.m100208f(extraActionLayout, "this$0");
        extraActionLayout.requestLayout();
    }

    private final View getBtnAction() {
        Object value = this.f50651t.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (View) value;
    }

    /* renamed from: c */
    public final void m52112c() {
        this.f50649r = System.currentTimeMillis();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC26112n.m134383X(getBtnAction(), this.f50647p, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float m116587j;
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f50647p;
        AbstractC26112n.m134387a0(getBtnAction(), size, 1073741824, 0, 0);
        int measuredHeight = i13 + getBtnAction().getMeasuredHeight();
        if (this.f50649r > 0) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f50649r)) / ((float) this.f50650s);
            DecelerateInterpolator decelerateInterpolator = this.f50648q;
            m116587j = AbstractC22543l.m116587j(currentTimeMillis, 0.0f, 1.0f);
            float interpolation = decelerateInterpolator.getInterpolation(m116587j);
            if (interpolation < 1.0f) {
                measuredHeight = (int) (measuredHeight * interpolation);
                post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExtraActionLayout.m52111b(ExtraActionLayout.this);
                    }
                });
            } else {
                this.f50649r = 0L;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }
}
