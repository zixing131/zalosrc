package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2814h;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ButtonWithProgress extends RelativeLayout {

    /* renamed from: p */
    public Button f86236p;

    /* renamed from: q */
    public ProgressBar f86237q;

    /* renamed from: r */
    private RelativeLayout f86238r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonWithProgress(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m90542c() {
        View findViewById = LayoutInflater.from(getContext()).inflate(AbstractC2812f.layout_button_progress, (ViewGroup) this, true).findViewById(AbstractC2811e.rl_button_progress);
        AbstractC19074t.m100207e(findViewById, "root.findViewById(R.id.rl_button_progress)");
        this.f86238r = (RelativeLayout) findViewById;
    }

    /* renamed from: d */
    private final void m90543d(AttributeSet attributeSet, int i11) {
        setPadding(0, 0, 0, 0);
        RelativeLayout relativeLayout = null;
        setBackground(null);
        m90542c();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        setButton(new Button(context, attributeSet, i11));
        RelativeLayout relativeLayout2 = this.f86238r;
        if (relativeLayout2 == null) {
            AbstractC19074t.m100223u("relativeLayout");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.addView(getButton());
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        setProgressBar(new ProgressBar(context2, getDefaultProgressBarStyle()));
        getProgressBar().setIndeterminate(true);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.zdesign.component.r
            public /* synthetic */ ViewOnLayoutChangeListenerC17041r() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                ButtonWithProgress.m90544e(ButtonWithProgress.this, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }

    /* renamed from: e */
    public static final void m90544e(ButtonWithProgress buttonWithProgress, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        AbstractC19074t.m100208f(buttonWithProgress, "this$0");
        if (buttonWithProgress.getButton().getLayoutParams().width != buttonWithProgress.getLayoutParams().width || buttonWithProgress.getButton().getLayoutParams().height != buttonWithProgress.getLayoutParams().height) {
            buttonWithProgress.post(new Runnable() { // from class: com.zing.zalo.zdesign.component.s
                public /* synthetic */ RunnableC17043s() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ButtonWithProgress.m90545f(ButtonWithProgress.this);
                }
            });
        }
    }

    /* renamed from: f */
    public static final void m90545f(ButtonWithProgress buttonWithProgress) {
        AbstractC19074t.m100208f(buttonWithProgress, "this$0");
        buttonWithProgress.getButton().setLayoutParams(new RelativeLayout.LayoutParams(buttonWithProgress.getLayoutParams().width, buttonWithProgress.getLayoutParams().height));
    }

    /* renamed from: g */
    private final void m90546g() {
        RelativeLayout relativeLayout = this.f86238r;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("relativeLayout");
            relativeLayout = null;
        }
        int childCount = relativeLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RelativeLayout relativeLayout2 = this.f86238r;
            if (relativeLayout2 == null) {
                AbstractC19074t.m100223u("relativeLayout");
                relativeLayout2 = null;
            }
            View childAt = relativeLayout2.getChildAt(i11);
            if (childAt instanceof ProgressBar) {
                RelativeLayout relativeLayout3 = this.f86238r;
                if (relativeLayout3 == null) {
                    AbstractC19074t.m100223u("relativeLayout");
                    relativeLayout3 = null;
                }
                relativeLayout3.removeView(childAt);
            }
        }
    }

    private final int getDefaultProgressBarStyle() {
        if (getButton().getBtnTypeSize() != EnumC17025p.BUTTON_SIZE_LARGE.m91163c() && getButton().getBtnTypeSize() != EnumC17025p.BUTTON_SIZE_MEDIUM.m91163c()) {
            if (getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_PRIMARY.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_PRIMARY_DANGER.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_SECONDARY_DANGER.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA_NEUTRAL.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA.m91223c()) {
                return AbstractC2814h.ProgressBar_Size16_Blue;
            }
            return AbstractC2814h.ProgressBar_Size16_White;
        }
        if (getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_PRIMARY.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_PRIMARY_DANGER.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_SECONDARY_DANGER.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA_NEUTRAL.m91223c() && getButton().getBtnType() != EnumC17039q.BUTTON_TYPE_TERTIARY_ALPHA.m91223c()) {
            return AbstractC2814h.ProgressBar_Size24_Blue;
        }
        return AbstractC2814h.ProgressBar_Size24_White;
    }

    public final Button getButton() {
        Button button = this.f86236p;
        if (button != null) {
            return button;
        }
        AbstractC19074t.m100223u("button");
        return null;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.f86237q;
        if (progressBar != null) {
            return progressBar;
        }
        AbstractC19074t.m100223u("progressBar");
        return null;
    }

    /* renamed from: h */
    public final void m90547h(boolean z11) {
        RelativeLayout relativeLayout = null;
        if (z11) {
            setBackground(getButton().getBackground());
            m90546g();
            getButton().setVisibility(4);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            getProgressBar().setVisibility(0);
            getProgressBar().setLayoutParams(layoutParams);
            RelativeLayout relativeLayout2 = this.f86238r;
            if (relativeLayout2 == null) {
                AbstractC19074t.m100223u("relativeLayout");
            } else {
                relativeLayout = relativeLayout2;
            }
            relativeLayout.addView(getProgressBar());
            setSelected(true);
            setClickable(false);
        } else {
            setBackground(null);
            m90546g();
            getButton().setVisibility(0);
            setSelected(false);
            setClickable(true);
        }
        requestLayout();
    }

    public final void setButton(Button button) {
        AbstractC19074t.m100208f(button, "<set-?>");
        this.f86236p = button;
    }

    public final void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        getButton().setIdTracking(str);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        getButton().setOnClickListener(onClickListener);
    }

    public final void setProgressBar(ProgressBar progressBar) {
        AbstractC19074t.m100208f(progressBar, "<set-?>");
        this.f86237q = progressBar;
    }

    public final void setTrackingExtraData(C0708i c0708i) {
        getButton().setTrackingExtraData(c0708i);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        getButton().setVisibility(i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonWithProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.buttonDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithProgress(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        m90543d(attributeSet, i11);
    }
}
