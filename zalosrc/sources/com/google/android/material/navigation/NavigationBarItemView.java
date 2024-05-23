package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1074g;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.AbstractC1220w1;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1567k0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.widget.AbstractC1640l;
import com.google.android.material.badge.AbstractC6236a;
import com.google.android.material.badge.BadgeDrawable;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23580e;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23585j;

/* loaded from: classes3.dex */
public abstract class NavigationBarItemView extends FrameLayout implements InterfaceC1078k.a {

    /* renamed from: F */
    private static final int[] f35613F = {R.attr.state_checked};

    /* renamed from: A */
    private C1074g f35614A;

    /* renamed from: B */
    private ColorStateList f35615B;

    /* renamed from: C */
    private Drawable f35616C;

    /* renamed from: D */
    private Drawable f35617D;

    /* renamed from: E */
    private BadgeDrawable f35618E;

    /* renamed from: p */
    private final int f35619p;

    /* renamed from: q */
    private float f35620q;

    /* renamed from: r */
    private float f35621r;

    /* renamed from: s */
    private float f35622s;

    /* renamed from: t */
    private int f35623t;

    /* renamed from: u */
    private boolean f35624u;

    /* renamed from: v */
    private ImageView f35625v;

    /* renamed from: w */
    private final ViewGroup f35626w;

    /* renamed from: x */
    private final TextView f35627x;

    /* renamed from: y */
    private final TextView f35628y;

    /* renamed from: z */
    private int f35629z;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    /* loaded from: classes3.dex */
    class ViewOnLayoutChangeListenerC6360a implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC6360a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            if (NavigationBarItemView.this.f35625v.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.m32666m(navigationBarItemView.f35625v);
            }
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.f35629z = -1;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f35625v = (ImageView) findViewById(AbstractC23581f.navigation_bar_item_icon_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC23581f.navigation_bar_item_labels_group);
        this.f35626w = viewGroup;
        TextView textView = (TextView) findViewById(AbstractC23581f.navigation_bar_item_small_label_view);
        this.f35627x = textView;
        TextView textView2 = (TextView) findViewById(AbstractC23581f.navigation_bar_item_large_label_view);
        this.f35628y = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f35619p = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(AbstractC23581f.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        AbstractC1579n0.m7823L0(textView, 2);
        AbstractC1579n0.m7823L0(textView2, 2);
        setFocusable(true);
        m32659d(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f35625v;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6360a());
        }
    }

    /* renamed from: d */
    private void m32659d(float f11, float f12) {
        this.f35620q = f11 - f12;
        this.f35621r = (f12 * 1.0f) / f11;
        this.f35622s = (f11 * 1.0f) / f12;
    }

    /* renamed from: f */
    private FrameLayout m32660f(View view) {
        ImageView imageView = this.f35625v;
        if (view != imageView || !AbstractC6236a.f34872a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: g */
    private boolean m32661g() {
        return this.f35618E != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i11 = 0;
        for (int i12 = 0; i12 < indexOfChild; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i11++;
            }
        }
        return i11;
    }

    private int getSuggestedIconHeight() {
        int i11;
        BadgeDrawable badgeDrawable = this.f35618E;
        if (badgeDrawable != null) {
            i11 = badgeDrawable.getMinimumHeight() / 2;
        } else {
            i11 = 0;
        }
        return Math.max(i11, ((FrameLayout.LayoutParams) this.f35625v.getLayoutParams()).topMargin) + this.f35625v.getMeasuredWidth() + i11;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        BadgeDrawable badgeDrawable = this.f35618E;
        if (badgeDrawable == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = badgeDrawable.getMinimumWidth() - this.f35618E.m31676j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35625v.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f35625v.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* renamed from: i */
    private static void m32662i(View view, int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i11;
        layoutParams.gravity = i12;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    private static void m32663j(View view, float f11, float f12, int i11) {
        view.setScaleX(f11);
        view.setScaleY(f12);
        view.setVisibility(i11);
    }

    /* renamed from: k */
    private void m32664k(View view) {
        if (m32661g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            AbstractC6236a.m31716a(this.f35618E, view, m32660f(view));
        }
    }

    /* renamed from: l */
    private void m32665l(View view) {
        if (!m32661g()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            AbstractC6236a.m31719d(this.f35618E, view);
        }
        this.f35618E = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m32666m(View view) {
        if (!m32661g()) {
            return;
        }
        AbstractC6236a.m31720e(this.f35618E, view, m32660f(view));
    }

    /* renamed from: n */
    private static void m32667n(View view, int i11) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i11);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: b */
    public void mo4971b(C1074g c1074g, int i11) {
        CharSequence title;
        int i12;
        this.f35614A = c1074g;
        setCheckable(c1074g.isCheckable());
        setChecked(c1074g.isChecked());
        setEnabled(c1074g.isEnabled());
        setIcon(c1074g.getIcon());
        setTitle(c1074g.getTitle());
        setId(c1074g.getItemId());
        if (!TextUtils.isEmpty(c1074g.getContentDescription())) {
            setContentDescription(c1074g.getContentDescription());
        }
        if (!TextUtils.isEmpty(c1074g.getTooltipText())) {
            title = c1074g.getTooltipText();
        } else {
            title = c1074g.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1220w1.m5757a(this, title);
        }
        if (c1074g.isVisible()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setVisibility(i12);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: e */
    public boolean mo4974e() {
        return false;
    }

    public BadgeDrawable getBadge() {
        return this.f35618E;
    }

    protected int getItemBackgroundResId() {
        return AbstractC23580e.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    public C1074g getItemData() {
        return this.f35614A;
    }

    protected int getItemDefaultMarginResId() {
        return AbstractC23579d.mtrl_navigation_bar_item_default_margin;
    }

    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f35629z;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35626w.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f35626w.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35626w.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f35626w.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m32668h() {
        m32665l(this.f35625v);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        C1074g c1074g = this.f35614A;
        if (c1074g != null && c1074g.isCheckable() && this.f35614A.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f35613F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f35618E;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f35614A.getTitle();
            if (!TextUtils.isEmpty(this.f35614A.getContentDescription())) {
                title = this.f35614A.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f35618E.m31674h()));
        }
        C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
        m7571I0.m7623g0(C1507g0.c.m7662a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            m7571I0.m7620e0(false);
            m7571I0.m7608U(C1507g0.a.f6447i);
        }
        m7571I0.m7649w0(getResources().getString(AbstractC23585j.item_view_role_description));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f35618E = badgeDrawable;
        ImageView imageView = this.f35625v;
        if (imageView != null) {
            m32664k(imageView);
        }
    }

    public void setCheckable(boolean z11) {
        refreshDrawableState();
    }

    public void setChecked(boolean z11) {
        this.f35628y.setPivotX(r0.getWidth() / 2);
        this.f35628y.setPivotY(r0.getBaseline());
        this.f35627x.setPivotX(r0.getWidth() / 2);
        this.f35627x.setPivotY(r0.getBaseline());
        int i11 = this.f35623t;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        m32662i(this.f35625v, this.f35619p, 17);
                        this.f35628y.setVisibility(8);
                        this.f35627x.setVisibility(8);
                    }
                } else {
                    ViewGroup viewGroup = this.f35626w;
                    m32667n(viewGroup, ((Integer) viewGroup.getTag(AbstractC23581f.mtrl_view_tag_bottom_padding)).intValue());
                    if (z11) {
                        m32662i(this.f35625v, (int) (this.f35619p + this.f35620q), 49);
                        m32663j(this.f35628y, 1.0f, 1.0f, 0);
                        TextView textView = this.f35627x;
                        float f11 = this.f35621r;
                        m32663j(textView, f11, f11, 4);
                    } else {
                        m32662i(this.f35625v, this.f35619p, 49);
                        TextView textView2 = this.f35628y;
                        float f12 = this.f35622s;
                        m32663j(textView2, f12, f12, 4);
                        m32663j(this.f35627x, 1.0f, 1.0f, 0);
                    }
                }
            } else {
                if (z11) {
                    m32662i(this.f35625v, this.f35619p, 49);
                    ViewGroup viewGroup2 = this.f35626w;
                    m32667n(viewGroup2, ((Integer) viewGroup2.getTag(AbstractC23581f.mtrl_view_tag_bottom_padding)).intValue());
                    this.f35628y.setVisibility(0);
                } else {
                    m32662i(this.f35625v, this.f35619p, 17);
                    m32667n(this.f35626w, 0);
                    this.f35628y.setVisibility(4);
                }
                this.f35627x.setVisibility(4);
            }
        } else if (this.f35624u) {
            if (z11) {
                m32662i(this.f35625v, this.f35619p, 49);
                ViewGroup viewGroup3 = this.f35626w;
                m32667n(viewGroup3, ((Integer) viewGroup3.getTag(AbstractC23581f.mtrl_view_tag_bottom_padding)).intValue());
                this.f35628y.setVisibility(0);
            } else {
                m32662i(this.f35625v, this.f35619p, 17);
                m32667n(this.f35626w, 0);
                this.f35628y.setVisibility(4);
            }
            this.f35627x.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f35626w;
            m32667n(viewGroup4, ((Integer) viewGroup4.getTag(AbstractC23581f.mtrl_view_tag_bottom_padding)).intValue());
            if (z11) {
                m32662i(this.f35625v, (int) (this.f35619p + this.f35620q), 49);
                m32663j(this.f35628y, 1.0f, 1.0f, 0);
                TextView textView3 = this.f35627x;
                float f13 = this.f35621r;
                m32663j(textView3, f13, f13, 4);
            } else {
                m32662i(this.f35625v, this.f35619p, 49);
                TextView textView4 = this.f35628y;
                float f14 = this.f35622s;
                m32663j(textView4, f14, f14, 4);
                m32663j(this.f35627x, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f35627x.setEnabled(z11);
        this.f35628y.setEnabled(z11);
        this.f35625v.setEnabled(z11);
        if (z11) {
            AbstractC1579n0.m7843V0(this, C1567k0.m7785b(getContext(), ZAbstractBase.ZVU_BLEND_PERCENTAGE));
        } else {
            AbstractC1579n0.m7843V0(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f35616C) {
            return;
        }
        this.f35616C = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC1414a.m7200r(drawable).mutate();
            this.f35617D = drawable;
            ColorStateList colorStateList = this.f35615B;
            if (colorStateList != null) {
                AbstractC1414a.m7197o(drawable, colorStateList);
            }
        }
        this.f35625v.setImageDrawable(drawable);
    }

    public void setIconSize(int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35625v.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i11;
        this.f35625v.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f35615B = colorStateList;
        if (this.f35614A != null && (drawable = this.f35617D) != null) {
            AbstractC1414a.m7197o(drawable, colorStateList);
            this.f35617D.invalidateSelf();
        }
    }

    public void setItemBackground(int i11) {
        setItemBackground(i11 == 0 ? null : AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setItemPosition(int i11) {
        this.f35629z = i11;
    }

    public void setLabelVisibilityMode(int i11) {
        if (this.f35623t != i11) {
            this.f35623t = i11;
            C1074g c1074g = this.f35614A;
            if (c1074g != null) {
                setChecked(c1074g.isChecked());
            }
        }
    }

    public void setShifting(boolean z11) {
        if (this.f35624u != z11) {
            this.f35624u = z11;
            C1074g c1074g = this.f35614A;
            if (c1074g != null) {
                setChecked(c1074g.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i11) {
        AbstractC1640l.m8424o(this.f35628y, i11);
        m32659d(this.f35627x.getTextSize(), this.f35628y.getTextSize());
    }

    public void setTextAppearanceInactive(int i11) {
        AbstractC1640l.m8424o(this.f35627x, i11);
        m32659d(this.f35627x.getTextSize(), this.f35628y.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f35627x.setTextColor(colorStateList);
            this.f35628y.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f35627x.setText(charSequence);
        this.f35628y.setText(charSequence);
        C1074g c1074g = this.f35614A;
        if (c1074g == null || TextUtils.isEmpty(c1074g.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C1074g c1074g2 = this.f35614A;
        if (c1074g2 != null && !TextUtils.isEmpty(c1074g2.getTooltipText())) {
            charSequence = this.f35614A.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            AbstractC1220w1.m5757a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        AbstractC1579n0.m7807D0(this, drawable);
    }
}
