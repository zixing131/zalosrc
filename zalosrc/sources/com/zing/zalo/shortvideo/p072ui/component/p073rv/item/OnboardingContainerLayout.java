package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27409d;

/* loaded from: classes5.dex */
public final class OnboardingContainerLayout extends FrameLayout {

    /* renamed from: p */
    private final int f50858p;

    /* renamed from: q */
    private final int f50859q;

    /* renamed from: r */
    private final int f50860r;

    /* renamed from: s */
    private final int f50861s;

    /* renamed from: t */
    private final int f50862t;

    /* renamed from: u */
    private final int f50863u;

    /* renamed from: v */
    private final InterfaceC24854k f50864v;

    /* renamed from: w */
    private final InterfaceC24854k f50865w;

    /* renamed from: x */
    private final InterfaceC24854k f50866x;

    /* renamed from: y */
    private boolean f50867y;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingContainerLayout$a */
    /* loaded from: classes5.dex */
    static final class C9646a extends AbstractC19075u implements InterfaceC18494a {
        C9646a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) OnboardingContainerLayout.this.findViewById(AbstractC27409d.btnExpand);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingContainerLayout$b */
    /* loaded from: classes5.dex */
    static final class C9647b extends AbstractC19075u implements InterfaceC18494a {
        C9647b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OnboardingOptionLayout mo12V4() {
            return (OnboardingOptionLayout) OnboardingContainerLayout.this.findViewById(AbstractC27409d.lytOption);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.rv.item.OnboardingContainerLayout$c */
    /* loaded from: classes5.dex */
    static final class C9648c extends AbstractC19075u implements InterfaceC18494a {
        C9648c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleShadowTextView mo12V4() {
            return (SimpleShadowTextView) OnboardingContainerLayout.this.findViewById(AbstractC27409d.txtTitle);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        this.f50858p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_padding);
        this.f50859q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_title_margin);
        this.f50860r = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_option_margin);
        this.f50861s = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_option_spacing);
        this.f50862t = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_option_extra);
        this.f50863u = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_expand_margin);
        m129210a = AbstractC24856m.m129210a(new C9648c());
        this.f50864v = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C9647b());
        this.f50865w = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C9646a());
        this.f50866x = m129210a3;
    }

    private final SimpleShadowTextView getBtnExpand() {
        Object value = this.f50866x.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    private final OnboardingOptionLayout getLytOption() {
        Object value = this.f50865w.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (OnboardingOptionLayout) value;
    }

    private final SimpleShadowTextView getTxtTitle() {
        Object value = this.f50864v.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (SimpleShadowTextView) value;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = this.f50858p;
        int i16 = this.f50859q;
        AbstractC26112n.m134383X(getTxtTitle(), i16, i15);
        int measuredHeight = i16 + getTxtTitle().getMeasuredHeight() + this.f50860r;
        AbstractC26112n.m134383X(getLytOption(), measuredHeight, i15);
        if (AbstractC26112n.m134378S(getBtnExpand())) {
            AbstractC26112n.m134383X(getBtnExpand(), measuredHeight + (getLytOption().getMeasuredHeight() - this.f50861s) + this.f50860r, i15);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (this.f50867y) {
            int i13 = size - (this.f50858p * 2);
            AbstractC26112n.m134387a0(getTxtTitle(), (i13 * 3) / 4, 1073741824, 0, 0);
            C24848g0 c24848g0 = C24848g0.f119245a;
            int measuredHeight = this.f50859q + getTxtTitle().getMeasuredHeight();
            AbstractC26112n.m134387a0(getLytOption(), i13, 1073741824, 0, 0);
            size2 = this.f50860r + getLytOption().getMeasuredHeight() + this.f50862t + measuredHeight;
            AbstractC26112n.m134367H(getBtnExpand());
        } else {
            int i14 = size - (this.f50858p * 2);
            int i15 = (size2 - this.f50859q) - this.f50862t;
            AbstractC26112n.m134387a0(getTxtTitle(), (i14 * 3) / 4, 1073741824, 0, 0);
            C24848g0 c24848g02 = C24848g0.f119245a;
            int measuredHeight2 = i15 - (getTxtTitle().getMeasuredHeight() + this.f50860r);
            if (AbstractC26112n.m134378S(getBtnExpand())) {
                AbstractC26112n.m134387a0(getBtnExpand(), 0, 0, 0, 0);
                measuredHeight2 -= (getBtnExpand().getMeasuredHeight() + this.f50860r) + this.f50863u;
            }
            AbstractC26112n.m134387a0(getLytOption(), i14, 1073741824, measuredHeight2, Integer.MIN_VALUE);
            if (AbstractC26112n.m134376Q(getBtnExpand()) && getLytOption().getHiddenOptionCount() >= 5) {
                AbstractC26112n.m134431w0(getBtnExpand());
                AbstractC26112n.m134387a0(getBtnExpand(), 0, 0, 0, 0);
                AbstractC26112n.m134387a0(getLytOption(), i14, 1073741824, measuredHeight2 - ((getBtnExpand().getMeasuredHeight() + this.f50860r) + this.f50863u), Integer.MIN_VALUE);
            }
        }
        setMeasuredDimension(size, size2);
    }

    public final void setExpanding(boolean z11) {
        this.f50867y = z11;
        requestLayout();
    }
}
