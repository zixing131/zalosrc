package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1072e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1611v0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19187j;
import p310l0.AbstractC21981b;

/* loaded from: classes2.dex */
public class ActionBarContextView extends AbstractC1149a {

    /* renamed from: A */
    private View f4125A;

    /* renamed from: B */
    private LinearLayout f4126B;

    /* renamed from: C */
    private TextView f4127C;

    /* renamed from: D */
    private TextView f4128D;

    /* renamed from: E */
    private int f4129E;

    /* renamed from: F */
    private int f4130F;

    /* renamed from: G */
    private boolean f4131G;

    /* renamed from: H */
    private int f4132H;

    /* renamed from: x */
    private CharSequence f4133x;

    /* renamed from: y */
    private CharSequence f4134y;

    /* renamed from: z */
    private View f4135z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1081a implements View.OnClickListener {

        /* renamed from: p */
        final /* synthetic */ AbstractC21981b f4136p;

        ViewOnClickListenerC1081a(AbstractC21981b abstractC21981b) {
            this.f4136p = abstractC21981b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f4136p.mo4954c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    private void m5152i() {
        int i11;
        if (this.f4126B == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC19184g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4126B = linearLayout;
            this.f4127C = (TextView) linearLayout.findViewById(AbstractC19183f.action_bar_title);
            this.f4128D = (TextView) this.f4126B.findViewById(AbstractC19183f.action_bar_subtitle);
            if (this.f4129E != 0) {
                this.f4127C.setTextAppearance(getContext(), this.f4129E);
            }
            if (this.f4130F != 0) {
                this.f4128D.setTextAppearance(getContext(), this.f4130F);
            }
        }
        this.f4127C.setText(this.f4133x);
        this.f4128D.setText(this.f4134y);
        boolean z11 = !TextUtils.isEmpty(this.f4133x);
        boolean z12 = !TextUtils.isEmpty(this.f4134y);
        TextView textView = this.f4128D;
        int i12 = 8;
        if (z12) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        LinearLayout linearLayout2 = this.f4126B;
        if (z11 || z12) {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        if (this.f4126B.getParent() == null) {
            addView(this.f4126B);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1149a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C1611v0 mo5153f(int i11, long j11) {
        return super.mo5153f(i11, j11);
    }

    /* renamed from: g */
    public void m5154g() {
        if (this.f4135z == null) {
            m5157k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1149a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1149a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4134y;
    }

    public CharSequence getTitle() {
        return this.f4133x;
    }

    /* renamed from: h */
    public void m5155h(AbstractC21981b abstractC21981b) {
        View view = this.f4135z;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4132H, (ViewGroup) this, false);
            this.f4135z = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4135z);
        }
        this.f4135z.findViewById(AbstractC19183f.action_mode_close_button).setOnClickListener(new ViewOnClickListenerC1081a(abstractC21981b));
        C1072e c1072e = (C1072e) abstractC21981b.mo4956e();
        ActionMenuPresenter actionMenuPresenter = this.f4576s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m5195C();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f4576s = actionMenuPresenter2;
        actionMenuPresenter2.m5205N(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c1072e.m5076c(this.f4576s, this.f4574q);
        ActionMenuView actionMenuView = (ActionMenuView) this.f4576s.mo5001s(this);
        this.f4575r = actionMenuView;
        AbstractC1579n0.m7807D0(actionMenuView, null);
        addView(this.f4575r, layoutParams);
    }

    /* renamed from: j */
    public boolean m5156j() {
        return this.f4131G;
    }

    /* renamed from: k */
    public void m5157k() {
        removeAllViews();
        this.f4125A = null;
        this.f4575r = null;
    }

    /* renamed from: l */
    public boolean m5158l() {
        ActionMenuPresenter actionMenuPresenter = this.f4576s;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.m5206O();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f4576s;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m5197F();
            this.f4576s.m5198G();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1149a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f4133x);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int paddingRight;
        int i15;
        int i16;
        boolean m5459b = AbstractC1152a2.m5459b(this);
        if (m5459b) {
            paddingLeft = (i13 - i11) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4135z;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4135z.getLayoutParams();
            if (m5459b) {
                i15 = marginLayoutParams.rightMargin;
            } else {
                i15 = marginLayoutParams.leftMargin;
            }
            if (m5459b) {
                i16 = marginLayoutParams.leftMargin;
            } else {
                i16 = marginLayoutParams.rightMargin;
            }
            int m5451d = AbstractC1149a.m5451d(paddingLeft, i15, m5459b);
            paddingLeft = AbstractC1149a.m5451d(m5451d + m5453e(this.f4135z, m5451d, paddingTop, paddingTop2, m5459b), i16, m5459b);
        }
        int i17 = paddingLeft;
        LinearLayout linearLayout = this.f4126B;
        if (linearLayout != null && this.f4125A == null && linearLayout.getVisibility() != 8) {
            i17 += m5453e(this.f4126B, i17, paddingTop, paddingTop2, m5459b);
        }
        int i18 = i17;
        View view2 = this.f4125A;
        if (view2 != null) {
            m5453e(view2, i18, paddingTop, paddingTop2, m5459b);
        }
        if (m5459b) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i13 - i11) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f4575r;
        if (actionMenuView != null) {
            m5453e(actionMenuView, paddingRight, paddingTop, paddingTop2, !m5459b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int i14;
        int i15 = 1073741824;
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            if (View.MeasureSpec.getMode(i12) != 0) {
                int size = View.MeasureSpec.getSize(i11);
                int i16 = this.f4577t;
                if (i16 <= 0) {
                    i16 = View.MeasureSpec.getSize(i12);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i17 = i16 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE);
                View view = this.f4135z;
                if (view != null) {
                    int m5452c = m5452c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4135z.getLayoutParams();
                    paddingLeft = m5452c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f4575r;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = m5452c(this.f4575r, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f4126B;
                if (linearLayout != null && this.f4125A == null) {
                    if (this.f4131G) {
                        this.f4126B.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f4126B.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f4126B;
                        if (z11) {
                            i14 = 0;
                        } else {
                            i14 = 8;
                        }
                        linearLayout2.setVisibility(i14);
                    } else {
                        paddingLeft = m5452c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f4125A;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i18 = layoutParams.width;
                    if (i18 != -2) {
                        i13 = 1073741824;
                    } else {
                        i13 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        paddingLeft = Math.min(i18, paddingLeft);
                    }
                    int i19 = layoutParams.height;
                    if (i19 == -2) {
                        i15 = Integer.MIN_VALUE;
                    }
                    if (i19 >= 0) {
                        i17 = Math.min(i19, i17);
                    }
                    this.f4125A.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(i17, i15));
                }
                if (this.f4577t <= 0) {
                    int childCount = getChildCount();
                    int i21 = 0;
                    for (int i22 = 0; i22 < childCount; i22++) {
                        int measuredHeight = getChildAt(i22).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i21) {
                            i21 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i21);
                    return;
                }
                setMeasuredDimension(size, i16);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbstractC1149a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1149a
    public void setContentHeight(int i11) {
        this.f4577t = i11;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4125A;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4125A = view;
        if (view != null && (linearLayout = this.f4126B) != null) {
            removeView(linearLayout);
            this.f4126B = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4134y = charSequence;
        m5152i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4133x = charSequence;
        m5152i();
    }

    public void setTitleOptional(boolean z11) {
        if (z11 != this.f4131G) {
            requestLayout();
        }
        this.f4131G = z11;
    }

    @Override // androidx.appcompat.widget.AbstractC1149a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.ActionMode, i11, 0);
        AbstractC1579n0.m7807D0(this, m5716v.m5723g(AbstractC19187j.ActionMode_background));
        this.f4129E = m5716v.m5730n(AbstractC19187j.ActionMode_titleTextStyle, 0);
        this.f4130F = m5716v.m5730n(AbstractC19187j.ActionMode_subtitleTextStyle, 0);
        this.f4577t = m5716v.m5729m(AbstractC19187j.ActionMode_height, 0);
        this.f4132H = m5716v.m5730n(AbstractC19187j.ActionMode_closeItemLayout, AbstractC19184g.abc_action_mode_close_item_material);
        m5716v.m5736w();
    }
}
