package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.AbstractC1220w1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.widget.AbstractC1640l;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import p175g0.AbstractC19178a;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23580e;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23583h;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC1078k.a {

    /* renamed from: U */
    private static final int[] f35449U = {R.attr.state_checked};

    /* renamed from: K */
    private int f35450K;

    /* renamed from: L */
    private boolean f35451L;

    /* renamed from: M */
    boolean f35452M;

    /* renamed from: N */
    private final CheckedTextView f35453N;

    /* renamed from: O */
    private FrameLayout f35454O;

    /* renamed from: P */
    private C1074g f35455P;

    /* renamed from: Q */
    private ColorStateList f35456Q;

    /* renamed from: R */
    private boolean f35457R;

    /* renamed from: S */
    private Drawable f35458S;

    /* renamed from: T */
    private final C1490a f35459T;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: classes3.dex */
    class C6329a extends C1490a {
        C6329a() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7615b0(NavigationMenuItemView.this.f35452M);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: D */
    private void m32458D() {
        if (m32460G()) {
            this.f35453N.setVisibility(8);
            FrameLayout frameLayout = this.f35454O;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).width = -1;
                this.f35454O.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f35453N.setVisibility(0);
        FrameLayout frameLayout2 = this.f35454O;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            this.f35454O.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: E */
    private StateListDrawable m32459E() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(AbstractC19178a.colorControlHighlight, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f35449U, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: G */
    private boolean m32460G() {
        if (this.f35455P.getTitle() == null && this.f35455P.getIcon() == null && this.f35455P.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f35454O == null) {
                this.f35454O = (FrameLayout) ((ViewStub) findViewById(AbstractC23581f.design_menu_item_action_area_stub)).inflate();
            }
            this.f35454O.removeAllViews();
            this.f35454O.addView(view);
        }
    }

    /* renamed from: F */
    public void m32461F() {
        FrameLayout frameLayout = this.f35454O;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f35453N.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: b */
    public void mo4971b(C1074g c1074g, int i11) {
        int i12;
        this.f35455P = c1074g;
        if (c1074g.getItemId() > 0) {
            setId(c1074g.getItemId());
        }
        if (c1074g.isVisible()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setVisibility(i12);
        if (getBackground() == null) {
            AbstractC1579n0.m7807D0(this, m32459E());
        }
        setCheckable(c1074g.isCheckable());
        setChecked(c1074g.isChecked());
        setEnabled(c1074g.isEnabled());
        setTitle(c1074g.getTitle());
        setIcon(c1074g.getIcon());
        setActionView(c1074g.getActionView());
        setContentDescription(c1074g.getContentDescription());
        AbstractC1220w1.m5757a(this, c1074g.getTooltipText());
        m32458D();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: e */
    public boolean mo4974e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    public C1074g getItemData() {
        return this.f35455P;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        C1074g c1074g = this.f35455P;
        if (c1074g != null && c1074g.isCheckable() && this.f35455P.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35449U);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
        if (this.f35452M != z11) {
            this.f35452M = z11;
            this.f35459T.mo7514l(this.f35453N, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        }
    }

    public void setChecked(boolean z11) {
        refreshDrawableState();
        this.f35453N.setChecked(z11);
    }

    public void setHorizontalPadding(int i11) {
        setPadding(i11, 0, i11, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f35457R) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = AbstractC1414a.m7200r(drawable).mutate();
                AbstractC1414a.m7197o(drawable, this.f35456Q);
            }
            int i11 = this.f35450K;
            drawable.setBounds(0, 0, i11, i11);
        } else if (this.f35451L) {
            if (this.f35458S == null) {
                Drawable m7082f = AbstractC1401h.m7082f(getResources(), AbstractC23580e.navigation_empty_icon, getContext().getTheme());
                this.f35458S = m7082f;
                if (m7082f != null) {
                    int i12 = this.f35450K;
                    m7082f.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.f35458S;
        }
        AbstractC1640l.m8419j(this.f35453N, drawable, null, null, null);
    }

    public void setIconPadding(int i11) {
        this.f35453N.setCompoundDrawablePadding(i11);
    }

    public void setIconSize(int i11) {
        this.f35450K = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z11;
        this.f35456Q = colorStateList;
        if (colorStateList != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f35457R = z11;
        C1074g c1074g = this.f35455P;
        if (c1074g != null) {
            setIcon(c1074g.getIcon());
        }
    }

    public void setMaxLines(int i11) {
        this.f35453N.setMaxLines(i11);
    }

    public void setNeedsEmptyIcon(boolean z11) {
        this.f35451L = z11;
    }

    public void setTextAppearance(int i11) {
        AbstractC1640l.m8424o(this.f35453N, i11);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f35453N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f35453N.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C6329a c6329a = new C6329a();
        this.f35459T = c6329a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(AbstractC23583h.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(AbstractC23579d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(AbstractC23581f.design_menu_item_text);
        this.f35453N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC1579n0.m7801A0(checkedTextView, c6329a);
    }
}
