package com.zing.zalo.shortvideo.p072ui.component.p073rv.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zing.zalo.shortvideo.data.model.BreakSlot;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import g20.C19205a;
import java.util.Iterator;
import java.util.List;
import ln0.AbstractC22543l;
import s20.AbstractC26112n;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* loaded from: classes5.dex */
public final class OnboardingOptionLayout extends FrameLayout {

    /* renamed from: p */
    private final int f50871p;

    /* renamed from: q */
    private int f50872q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingOptionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f50871p = AbstractC26112n.m134433y(this, AbstractC27407b.zch_item_video_onboarding_option_spacing);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m52329c(OnboardingOptionLayout onboardingOptionLayout, InterfaceC18494a interfaceC18494a, TextView textView, View view) {
        AbstractC19074t.m100208f(onboardingOptionLayout, "this$0");
        AbstractC19074t.m100208f(interfaceC18494a, "$optionAction");
        Object tag = view.getTag();
        AbstractC19074t.m100206d(tag, "null cannot be cast to non-null type com.zing.zalo.shortvideo.data.model.BreakSlot.Option");
        BreakSlot.Option option = (BreakSlot.Option) tag;
        option.m50703d(!option.m50702c());
        AbstractC19074t.m100205c(textView);
        onboardingOptionLayout.m52331d(textView, option.m50702c());
        C19205a.m100675M(C19205a.f95429a, AbstractC26112n.m134366G(onboardingOptionLayout, AbstractC27413h.zch_action_key_onboarding_topic_select, new Object[0]), null, 2, null);
        interfaceC18494a.mo12V4();
    }

    /* renamed from: b */
    public final void m52330b(List list, final InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(list, "options");
        AbstractC19074t.m100208f(interfaceC18494a, "optionAction");
        removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BreakSlot.Option option = (BreakSlot.Option) it.next();
            View m134372M = AbstractC26112n.m134372M(this, AbstractC27410e.zch_item_video_onboarding_option, false, 2, null);
            m134372M.setTag(option);
            final TextView textView = (TextView) m134372M.findViewById(AbstractC27409d.txtOption);
            textView.setText(option.m50701b());
            m134372M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.shortvideo.ui.component.rv.item.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnboardingOptionLayout.m52329c(OnboardingOptionLayout.this, interfaceC18494a, textView, view);
                }
            });
            AbstractC19074t.m100205c(textView);
            m52331d(textView, option.m50702c());
            addView(m134372M);
        }
    }

    /* renamed from: d */
    public final void m52331d(View view, boolean z11) {
        AbstractC19074t.m100208f(view, "view");
        if (z11) {
            view.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue_round);
        } else {
            view.setBackgroundResource(AbstractC27408c.zch_bg_option_onboarding);
        }
    }

    public final int getHiddenOptionCount() {
        return this.f50872q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            measuredWidth += this.f50871p + childAt.getMeasuredWidth();
            if (measuredWidth > getMeasuredWidth()) {
                measuredWidth = childAt.getMeasuredWidth();
                i15 += childAt.getMeasuredHeight();
            }
            AbstractC19074t.m100205c(childAt);
            AbstractC26112n.m134382W(childAt, i15, measuredWidth);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int m116580c;
        int size = View.MeasureSpec.getSize(i11);
        Integer valueOf = Integer.valueOf(View.MeasureSpec.getSize(i12));
        valueOf.intValue();
        if (View.MeasureSpec.getMode(i12) == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i13 = valueOf.intValue();
        } else {
            i13 = Integer.MAX_VALUE;
        }
        this.f50872q = 0;
        int childCount = getChildCount();
        int i14 = size;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            AbstractC19074t.m100205c(childAt);
            AbstractC26112n.m134387a0(childAt, size, Integer.MIN_VALUE, 0, 0);
            i14 += this.f50871p + childAt.getMeasuredWidth();
            if (i14 > size) {
                i14 = childAt.getMeasuredWidth();
                i15 += childAt.getMeasuredHeight();
                if (i15 > i13) {
                    i15 -= childAt.getMeasuredHeight();
                    this.f50872q = getChildCount() - i16;
                }
            }
            if (this.f50872q > 0) {
                break;
            }
        }
        m116580c = AbstractC22543l.m116580c(i15, 0);
        setMeasuredDimension(size, m116580c);
    }
}
