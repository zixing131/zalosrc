package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC1220w1;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.C1485g;
import androidx.core.util.C1486h;
import androidx.core.util.InterfaceC1484f;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1613w;
import androidx.core.view.C1567k0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.widget.AbstractC1640l;
import androidx.viewpager.widget.AbstractC2065a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.AbstractC6236a;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p013a7.AbstractC0638a;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23583h;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p599w6.AbstractC28774c;
import p634x6.AbstractC29387b;
import p706z6.AbstractC31690i;
import p706z6.C31689h;

@ViewPager.InterfaceC2057e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: i0 */
    private static final int f35887i0 = AbstractC23586k.Widget_Design_TabLayout;

    /* renamed from: j0 */
    private static final InterfaceC1484f f35888j0 = new C1486h(16);

    /* renamed from: A */
    Drawable f35889A;

    /* renamed from: B */
    private int f35890B;

    /* renamed from: C */
    PorterDuff.Mode f35891C;

    /* renamed from: D */
    float f35892D;

    /* renamed from: E */
    float f35893E;

    /* renamed from: F */
    final int f35894F;

    /* renamed from: G */
    int f35895G;

    /* renamed from: H */
    private final int f35896H;

    /* renamed from: I */
    private final int f35897I;

    /* renamed from: J */
    private final int f35898J;

    /* renamed from: K */
    private int f35899K;

    /* renamed from: L */
    int f35900L;

    /* renamed from: M */
    int f35901M;

    /* renamed from: N */
    int f35902N;

    /* renamed from: O */
    int f35903O;

    /* renamed from: P */
    boolean f35904P;

    /* renamed from: Q */
    boolean f35905Q;

    /* renamed from: R */
    int f35906R;

    /* renamed from: S */
    boolean f35907S;

    /* renamed from: T */
    private C6418b f35908T;

    /* renamed from: U */
    private InterfaceC6410c f35909U;

    /* renamed from: V */
    private final ArrayList f35910V;

    /* renamed from: W */
    private InterfaceC6410c f35911W;

    /* renamed from: a0 */
    private ValueAnimator f35912a0;

    /* renamed from: b0 */
    ViewPager f35913b0;

    /* renamed from: c0 */
    private AbstractC2065a f35914c0;

    /* renamed from: d0 */
    private DataSetObserver f35915d0;

    /* renamed from: e0 */
    private C6415h f35916e0;

    /* renamed from: f0 */
    private C6409b f35917f0;

    /* renamed from: g0 */
    private boolean f35918g0;

    /* renamed from: h0 */
    private final InterfaceC1484f f35919h0;

    /* renamed from: p */
    private final ArrayList f35920p;

    /* renamed from: q */
    private C6414g f35921q;

    /* renamed from: r */
    final C6413f f35922r;

    /* renamed from: s */
    int f35923s;

    /* renamed from: t */
    int f35924t;

    /* renamed from: u */
    int f35925u;

    /* renamed from: v */
    int f35926v;

    /* renamed from: w */
    int f35927w;

    /* renamed from: x */
    ColorStateList f35928x;

    /* renamed from: y */
    ColorStateList f35929y;

    /* renamed from: z */
    ColorStateList f35930z;

    /* loaded from: classes3.dex */
    public final class TabView extends LinearLayout {

        /* renamed from: p */
        private C6414g f35931p;

        /* renamed from: q */
        private TextView f35932q;

        /* renamed from: r */
        private ImageView f35933r;

        /* renamed from: s */
        private View f35934s;

        /* renamed from: t */
        private BadgeDrawable f35935t;

        /* renamed from: u */
        private View f35936u;

        /* renamed from: v */
        private TextView f35937v;

        /* renamed from: w */
        private ImageView f35938w;

        /* renamed from: x */
        private Drawable f35939x;

        /* renamed from: y */
        private int f35940y;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        /* loaded from: classes3.dex */
        public class ViewOnLayoutChangeListenerC6407a implements View.OnLayoutChangeListener {

            /* renamed from: p */
            final /* synthetic */ View f35942p;

            ViewOnLayoutChangeListenerC6407a(View view) {
                this.f35942p = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                if (this.f35942p.getVisibility() == 0) {
                    TabView.this.m33000u(this.f35942p);
                }
            }
        }

        public TabView(Context context) {
            super(context);
            this.f35940y = 2;
            m33001w(context);
            AbstractC1579n0.m7837S0(this, TabLayout.this.f35923s, TabLayout.this.f35924t, TabLayout.this.f35925u, TabLayout.this.f35926v);
            setGravity(17);
            setOrientation(!TabLayout.this.f35904P ? 1 : 0);
            setClickable(true);
            AbstractC1579n0.m7843V0(this, C1567k0.m7785b(getContext(), ZAbstractBase.ZVU_BLEND_PERCENTAGE));
        }

        /* renamed from: f */
        private void m32988f(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC6407a(view));
        }

        /* renamed from: g */
        private float m32989g(Layout layout, int i11, float f11) {
            return layout.getLineWidth(i11) * (f11 / layout.getPaint().getTextSize());
        }

        private BadgeDrawable getBadge() {
            return this.f35935t;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f35935t == null) {
                this.f35935t = BadgeDrawable.m31662c(getContext());
            }
            m32999s();
            BadgeDrawable badgeDrawable = this.f35935t;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m32990h(boolean z11) {
            setClipChildren(z11);
            setClipToPadding(z11);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z11);
                viewGroup.setClipToPadding(z11);
            }
        }

        /* renamed from: i */
        private FrameLayout m32991i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: j */
        public void m32992j(Canvas canvas) {
            Drawable drawable = this.f35939x;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f35939x.draw(canvas);
            }
        }

        /* renamed from: k */
        private FrameLayout m32993k(View view) {
            if ((view != this.f35933r && view != this.f35932q) || !AbstractC6236a.f34872a) {
                return null;
            }
            return (FrameLayout) view.getParent();
        }

        /* renamed from: l */
        public boolean m32994l() {
            return this.f35935t != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m */
        private void m32995m() {
            FrameLayout frameLayout;
            if (AbstractC6236a.f34872a) {
                frameLayout = m32991i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(AbstractC23583h.design_layout_tab_icon, (ViewGroup) frameLayout, false);
            this.f35933r = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: n */
        private void m32996n() {
            FrameLayout frameLayout;
            if (AbstractC6236a.f34872a) {
                frameLayout = m32991i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(AbstractC23583h.design_layout_tab_text, (ViewGroup) frameLayout, false);
            this.f35932q = textView;
            frameLayout.addView(textView);
        }

        /* renamed from: q */
        private void m32997q(View view) {
            if (m32994l() && view != null) {
                m32990h(false);
                AbstractC6236a.m31716a(this.f35935t, view, m32993k(view));
                this.f35934s = view;
            }
        }

        /* renamed from: r */
        private void m32998r() {
            if (!m32994l()) {
                return;
            }
            m32990h(true);
            View view = this.f35934s;
            if (view != null) {
                AbstractC6236a.m31719d(this.f35935t, view);
                this.f35934s = null;
            }
        }

        /* renamed from: s */
        private void m32999s() {
            C6414g c6414g;
            C6414g c6414g2;
            if (!m32994l()) {
                return;
            }
            if (this.f35936u != null) {
                m32998r();
                return;
            }
            if (this.f35933r != null && (c6414g2 = this.f35931p) != null && c6414g2.m33023f() != null) {
                View view = this.f35934s;
                ImageView imageView = this.f35933r;
                if (view != imageView) {
                    m32998r();
                    m32997q(this.f35933r);
                    return;
                } else {
                    m33000u(imageView);
                    return;
                }
            }
            if (this.f35932q != null && (c6414g = this.f35931p) != null && c6414g.m33025h() == 1) {
                View view2 = this.f35934s;
                TextView textView = this.f35932q;
                if (view2 != textView) {
                    m32998r();
                    m32997q(this.f35932q);
                    return;
                } else {
                    m33000u(textView);
                    return;
                }
            }
            m32998r();
        }

        /* renamed from: u */
        public void m33000u(View view) {
            if (m32994l() && view == this.f35934s) {
                AbstractC6236a.m31720e(this.f35935t, view, m32993k(view));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* renamed from: w */
        public void m33001w(Context context) {
            int i11 = TabLayout.this.f35894F;
            GradientDrawable gradientDrawable = null;
            if (i11 != 0) {
                Drawable m103336d = AbstractC19694b.m103336d(context, i11);
                this.f35939x = m103336d;
                if (m103336d != null && m103336d.isStateful()) {
                    this.f35939x.setState(getDrawableState());
                }
            } else {
                this.f35939x = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.f35930z != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList m146551a = AbstractC29387b.m146551a(TabLayout.this.f35930z);
                boolean z11 = TabLayout.this.f35907S;
                if (z11) {
                    gradientDrawable2 = null;
                }
                if (!z11) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(m146551a, gradientDrawable2, gradientDrawable);
            }
            AbstractC1579n0.m7807D0(this, gradientDrawable2);
            TabLayout.this.invalidate();
        }

        /* renamed from: y */
        private void m33002y(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            int i11;
            C6414g c6414g = this.f35931p;
            CharSequence charSequence2 = null;
            if (c6414g != null && c6414g.m33023f() != null) {
                drawable = AbstractC1414a.m7200r(this.f35931p.m33023f()).mutate();
            } else {
                drawable = null;
            }
            C6414g c6414g2 = this.f35931p;
            if (c6414g2 != null) {
                charSequence = c6414g2.m33026i();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z11 = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z11) {
                    textView.setText(charSequence);
                    if (this.f35931p.f35964g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z11 && imageView.getVisibility() == 0) {
                    i11 = (int) AbstractC6359z.m32648c(getContext(), 8);
                } else {
                    i11 = 0;
                }
                if (TabLayout.this.f35904P) {
                    if (i11 != AbstractC1613w.m8234a(marginLayoutParams)) {
                        AbstractC1613w.m8236c(marginLayoutParams, i11);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i11 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i11;
                    AbstractC1613w.m8236c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C6414g c6414g3 = this.f35931p;
            if (c6414g3 != null) {
                charSequence2 = c6414g3.f35961d;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z11) {
                    charSequence = charSequence2;
                }
                AbstractC1220w1.m5757a(this, charSequence);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f35939x;
            if (drawable != null && drawable.isStateful() && this.f35939x.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f35932q, this.f35933r, this.f35936u};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    if (z11) {
                        i12 = Math.min(i12, view.getTop());
                    } else {
                        i12 = view.getTop();
                    }
                    if (z11) {
                        i11 = Math.max(i11, view.getBottom());
                    } else {
                        i11 = view.getBottom();
                    }
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f35932q, this.f35933r, this.f35936u};
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            for (int i13 = 0; i13 < 3; i13++) {
                View view = viewArr[i13];
                if (view != null && view.getVisibility() == 0) {
                    if (z11) {
                        i12 = Math.min(i12, view.getLeft());
                    } else {
                        i12 = view.getLeft();
                    }
                    if (z11) {
                        i11 = Math.max(i11, view.getRight());
                    } else {
                        i11 = view.getRight();
                    }
                    z11 = true;
                }
            }
            return i11 - i12;
        }

        public C6414g getTab() {
            return this.f35931p;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f35935t;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f35935t.m31674h()));
            }
            C1507g0 m7571I0 = C1507g0.m7571I0(accessibilityNodeInfo);
            m7571I0.m7623g0(C1507g0.c.m7662a(0, 1, this.f35931p.m33024g(), 1, false, isSelected()));
            if (isSelected()) {
                m7571I0.m7620e0(false);
                m7571I0.m7608U(C1507g0.a.f6447i);
            }
            m7571I0.m7649w0(getResources().getString(AbstractC23585j.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i11 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f35895G, Integer.MIN_VALUE);
            }
            super.onMeasure(i11, i12);
            if (this.f35932q != null) {
                float f11 = TabLayout.this.f35892D;
                int i13 = this.f35940y;
                ImageView imageView = this.f35933r;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i13 = 1;
                } else {
                    TextView textView = this.f35932q;
                    if (textView != null && textView.getLineCount() > 1) {
                        f11 = TabLayout.this.f35893E;
                    }
                }
                float textSize = this.f35932q.getTextSize();
                int lineCount = this.f35932q.getLineCount();
                int m8413d = AbstractC1640l.m8413d(this.f35932q);
                if (f11 != textSize || (m8413d >= 0 && i13 != m8413d)) {
                    if (TabLayout.this.f35903O != 1 || f11 <= textSize || lineCount != 1 || ((layout = this.f35932q.getLayout()) != null && m32989g(layout, 0, f11) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f35932q.setTextSize(0, f11);
                        this.f35932q.setMaxLines(i13);
                        super.onMeasure(i11, i12);
                    }
                }
            }
        }

        /* renamed from: p */
        void m33003p() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f35931p != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f35931p.m33029l();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            isSelected();
            super.setSelected(z11);
            TextView textView = this.f35932q;
            if (textView != null) {
                textView.setSelected(z11);
            }
            ImageView imageView = this.f35933r;
            if (imageView != null) {
                imageView.setSelected(z11);
            }
            View view = this.f35936u;
            if (view != null) {
                view.setSelected(z11);
            }
        }

        void setTab(C6414g c6414g) {
            if (c6414g != this.f35931p) {
                this.f35931p = c6414g;
                m33004v();
            }
        }

        /* renamed from: v */
        final void m33004v() {
            View view;
            boolean z11;
            C6414g c6414g = this.f35931p;
            Drawable drawable = null;
            if (c6414g != null) {
                view = c6414g.m33022e();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f35936u = view;
                TextView textView = this.f35932q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f35933r;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f35933r.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.f35937v = textView2;
                if (textView2 != null) {
                    this.f35940y = AbstractC1640l.m8413d(textView2);
                }
                this.f35938w = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view2 = this.f35936u;
                if (view2 != null) {
                    removeView(view2);
                    this.f35936u = null;
                }
                this.f35937v = null;
                this.f35938w = null;
            }
            if (this.f35936u == null) {
                if (this.f35933r == null) {
                    m32995m();
                }
                if (c6414g != null && c6414g.m33023f() != null) {
                    drawable = AbstractC1414a.m7200r(c6414g.m33023f()).mutate();
                }
                if (drawable != null) {
                    AbstractC1414a.m7197o(drawable, TabLayout.this.f35929y);
                    PorterDuff.Mode mode = TabLayout.this.f35891C;
                    if (mode != null) {
                        AbstractC1414a.m7198p(drawable, mode);
                    }
                }
                if (this.f35932q == null) {
                    m32996n();
                    this.f35940y = AbstractC1640l.m8413d(this.f35932q);
                }
                AbstractC1640l.m8424o(this.f35932q, TabLayout.this.f35927w);
                ColorStateList colorStateList = TabLayout.this.f35928x;
                if (colorStateList != null) {
                    this.f35932q.setTextColor(colorStateList);
                }
                m33002y(this.f35932q, this.f35933r);
                m32999s();
                m32988f(this.f35933r);
                m32988f(this.f35932q);
            } else {
                TextView textView3 = this.f35937v;
                if (textView3 != null || this.f35938w != null) {
                    m33002y(textView3, this.f35938w);
                }
            }
            if (c6414g != null && !TextUtils.isEmpty(c6414g.f35961d)) {
                setContentDescription(c6414g.f35961d);
            }
            if (c6414g != null && c6414g.m33027j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            setSelected(z11);
        }

        /* renamed from: x */
        final void m33005x() {
            setOrientation(!TabLayout.this.f35904P ? 1 : 0);
            TextView textView = this.f35937v;
            if (textView == null && this.f35938w == null) {
                m33002y(this.f35932q, this.f35933r);
            } else {
                m33002y(textView, this.f35938w);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    /* loaded from: classes3.dex */
    public class C6408a implements ValueAnimator.AnimatorUpdateListener {
        C6408a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    /* loaded from: classes3.dex */
    public class C6409b implements ViewPager.InterfaceC2060h {

        /* renamed from: p */
        private boolean f35945p;

        C6409b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2060h
        /* renamed from: a */
        public void mo11158a(ViewPager viewPager, AbstractC2065a abstractC2065a, AbstractC2065a abstractC2065a2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35913b0 == viewPager) {
                tabLayout.m32971I(abstractC2065a2, this.f35945p);
            }
        }

        /* renamed from: b */
        void m33006b(boolean z11) {
            this.f35945p = z11;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6410c {
        /* renamed from: a */
        void mo33007a(C6414g c6414g);

        /* renamed from: b */
        void mo33008b(C6414g c6414g);

        /* renamed from: c */
        void mo33009c(C6414g c6414g);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6411d extends InterfaceC6410c {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    /* loaded from: classes3.dex */
    public class C6412e extends DataSetObserver {
        C6412e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m32965B();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m32965B();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    /* loaded from: classes3.dex */
    public class C6413f extends LinearLayout {

        /* renamed from: p */
        ValueAnimator f35948p;

        /* renamed from: q */
        int f35949q;

        /* renamed from: r */
        float f35950r;

        /* renamed from: s */
        private int f35951s;

        /* renamed from: com.google.android.material.tabs.TabLayout$f$a */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: p */
            final /* synthetic */ View f35953p;

            /* renamed from: q */
            final /* synthetic */ View f35954q;

            a(View view, View view2) {
                this.f35953p = view;
                this.f35954q = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C6413f.this.m33012g(this.f35953p, this.f35954q, valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$f$b */
        /* loaded from: classes3.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ int f35956p;

            b(int i11) {
                this.f35956p = i11;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C6413f.this.f35949q = this.f35956p;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C6413f.this.f35949q = this.f35956p;
            }
        }

        C6413f(Context context) {
            super(context);
            this.f35949q = -1;
            this.f35951s = -1;
            setWillNotDraw(false);
        }

        /* renamed from: d */
        private void m33011d() {
            View childAt = getChildAt(this.f35949q);
            C6418b c6418b = TabLayout.this.f35908T;
            TabLayout tabLayout = TabLayout.this;
            c6418b.m33043d(tabLayout, childAt, tabLayout.f35889A);
        }

        /* renamed from: g */
        public void m33012g(View view, View view2, float f11) {
            if (view != null && view.getWidth() > 0) {
                C6418b c6418b = TabLayout.this.f35908T;
                TabLayout tabLayout = TabLayout.this;
                c6418b.mo33040c(tabLayout, view, view2, f11, tabLayout.f35889A);
            } else {
                Drawable drawable = TabLayout.this.f35889A;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f35889A.getBounds().bottom);
            }
            AbstractC1579n0.m7898r0(this);
        }

        /* renamed from: h */
        private void m33013h(boolean z11, int i11, int i12) {
            View childAt = getChildAt(this.f35949q);
            View childAt2 = getChildAt(i11);
            if (childAt2 == null) {
                m33011d();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z11) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f35948p = valueAnimator;
                valueAnimator.setInterpolator(AbstractC24041a.f116359b);
                valueAnimator.setDuration(i12);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i11));
                valueAnimator.start();
                return;
            }
            this.f35948p.removeAllUpdateListeners();
            this.f35948p.addUpdateListener(aVar);
        }

        /* renamed from: b */
        void m33014b(int i11, int i12) {
            ValueAnimator valueAnimator = this.f35948p;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35948p.cancel();
            }
            m33013h(true, i11, i12);
        }

        /* renamed from: c */
        boolean m33015c() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int height2 = TabLayout.this.f35889A.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.f35889A.getIntrinsicHeight();
            }
            int i11 = TabLayout.this.f35902N;
            if (i11 != 0) {
                if (i11 != 1) {
                    height = 0;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.f35889A.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f35889A.getBounds();
                TabLayout.this.f35889A.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.f35889A;
                if (tabLayout.f35890B != 0) {
                    drawable = AbstractC1414a.m7200r(drawable);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawable.setColorFilter(TabLayout.this.f35890B, PorterDuff.Mode.SRC_IN);
                    } else {
                        AbstractC1414a.m7196n(drawable, TabLayout.this.f35890B);
                    }
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        /* renamed from: e */
        void m33016e(int i11, float f11) {
            ValueAnimator valueAnimator = this.f35948p;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35948p.cancel();
            }
            this.f35949q = i11;
            this.f35950r = f11;
            m33012g(getChildAt(i11), getChildAt(this.f35949q + 1), this.f35950r);
        }

        /* renamed from: f */
        void m33017f(int i11) {
            Rect bounds = TabLayout.this.f35889A.getBounds();
            TabLayout.this.f35889A.setBounds(bounds.left, 0, bounds.right, i11);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            ValueAnimator valueAnimator = this.f35948p;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                m33013h(false, this.f35949q, -1);
            } else {
                m33011d();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (View.MeasureSpec.getMode(i11) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f35900L == 1 || tabLayout.f35903O == 2) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    if (childAt.getVisibility() == 0) {
                        i13 = Math.max(i13, childAt.getMeasuredWidth());
                    }
                }
                if (i13 <= 0) {
                    return;
                }
                if (i13 * childCount <= getMeasuredWidth() - (((int) AbstractC6359z.m32648c(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i15 = 0; i15 < childCount; i15++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i15).getLayoutParams();
                        if (layoutParams.width != i13 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i13;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        return;
                    }
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f35900L = 0;
                    tabLayout2.m32975P(false);
                }
                super.onMeasure(i11, i12);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i11) {
            super.onRtlPropertiesChanged(i11);
            if (Build.VERSION.SDK_INT < 23 && this.f35951s != i11) {
                requestLayout();
                this.f35951s = i11;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    /* loaded from: classes3.dex */
    public static class C6414g {

        /* renamed from: a */
        private Object f35958a;

        /* renamed from: b */
        private Drawable f35959b;

        /* renamed from: c */
        private CharSequence f35960c;

        /* renamed from: d */
        private CharSequence f35961d;

        /* renamed from: f */
        private View f35963f;

        /* renamed from: h */
        public TabLayout f35965h;

        /* renamed from: i */
        public TabView f35966i;

        /* renamed from: e */
        private int f35962e = -1;

        /* renamed from: g */
        private int f35964g = 1;

        /* renamed from: j */
        private int f35967j = -1;

        /* renamed from: e */
        public View m33022e() {
            return this.f35963f;
        }

        /* renamed from: f */
        public Drawable m33023f() {
            return this.f35959b;
        }

        /* renamed from: g */
        public int m33024g() {
            return this.f35962e;
        }

        /* renamed from: h */
        public int m33025h() {
            return this.f35964g;
        }

        /* renamed from: i */
        public CharSequence m33026i() {
            return this.f35960c;
        }

        /* renamed from: j */
        public boolean m33027j() {
            TabLayout tabLayout = this.f35965h;
            if (tabLayout != null) {
                if (tabLayout.getSelectedTabPosition() == this.f35962e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        void m33028k() {
            this.f35965h = null;
            this.f35966i = null;
            this.f35958a = null;
            this.f35959b = null;
            this.f35967j = -1;
            this.f35960c = null;
            this.f35961d = null;
            this.f35962e = -1;
            this.f35963f = null;
        }

        /* renamed from: l */
        public void m33029l() {
            TabLayout tabLayout = this.f35965h;
            if (tabLayout != null) {
                tabLayout.m32969G(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: m */
        public C6414g m33030m(CharSequence charSequence) {
            this.f35961d = charSequence;
            m33036s();
            return this;
        }

        /* renamed from: n */
        public C6414g m33031n(int i11) {
            return m33032o(LayoutInflater.from(this.f35966i.getContext()).inflate(i11, (ViewGroup) this.f35966i, false));
        }

        /* renamed from: o */
        public C6414g m33032o(View view) {
            this.f35963f = view;
            m33036s();
            return this;
        }

        /* renamed from: p */
        public C6414g m33033p(Drawable drawable) {
            this.f35959b = drawable;
            TabLayout tabLayout = this.f35965h;
            if (tabLayout.f35900L == 1 || tabLayout.f35903O == 2) {
                tabLayout.m32975P(true);
            }
            m33036s();
            if (AbstractC6236a.f34872a && this.f35966i.m32994l() && this.f35966i.f35935t.isVisible()) {
                this.f35966i.invalidate();
            }
            return this;
        }

        /* renamed from: q */
        void m33034q(int i11) {
            this.f35962e = i11;
        }

        /* renamed from: r */
        public C6414g m33035r(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f35961d) && !TextUtils.isEmpty(charSequence)) {
                this.f35966i.setContentDescription(charSequence);
            }
            this.f35960c = charSequence;
            m33036s();
            return this;
        }

        /* renamed from: s */
        void m33036s() {
            TabView tabView = this.f35966i;
            if (tabView != null) {
                tabView.m33004v();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    /* loaded from: classes3.dex */
    public static class C6415h implements ViewPager.InterfaceC2061i {

        /* renamed from: p */
        private final WeakReference f35968p;

        /* renamed from: q */
        private int f35969q;

        /* renamed from: r */
        private int f35970r;

        public C6415h(TabLayout tabLayout) {
            this.f35968p = new WeakReference(tabLayout);
        }

        /* renamed from: a */
        void m33037a() {
            this.f35970r = 0;
            this.f35969q = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrollStateChanged(int i11) {
            this.f35969q = this.f35970r;
            this.f35970r = i11;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageScrolled(int i11, float f11, int i12) {
            boolean z11;
            TabLayout tabLayout = (TabLayout) this.f35968p.get();
            if (tabLayout != null) {
                int i13 = this.f35970r;
                boolean z12 = false;
                if (i13 == 2 && this.f35969q != 1) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i13 != 2 || this.f35969q != 0) {
                    z12 = true;
                }
                tabLayout.m32973K(i11, f11, z11, z12);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC2061i
        public void onPageSelected(int i11) {
            boolean z11;
            TabLayout tabLayout = (TabLayout) this.f35968p.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i11 && i11 < tabLayout.getTabCount()) {
                int i12 = this.f35970r;
                if (i12 != 0 && (i12 != 2 || this.f35969q != 0)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                tabLayout.m32970H(tabLayout.m32981y(i11), z11);
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    /* loaded from: classes3.dex */
    public static class C6416i implements InterfaceC6411d {

        /* renamed from: a */
        private final ViewPager f35971a;

        public C6416i(ViewPager viewPager) {
            this.f35971a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC6410c
        /* renamed from: a */
        public void mo33007a(C6414g c6414g) {
            this.f35971a.setCurrentItem(c6414g.m33024g());
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC6410c
        /* renamed from: b */
        public void mo33008b(C6414g c6414g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC6410c
        /* renamed from: c */
        public void mo33009c(C6414g c6414g) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.tabStyle);
    }

    /* renamed from: F */
    private void m32943F(int i11) {
        TabView tabView = (TabView) this.f35922r.getChildAt(i11);
        this.f35922r.removeViewAt(i11);
        if (tabView != null) {
            tabView.m33003p();
            this.f35919h0.mo7483a(tabView);
        }
        requestLayout();
    }

    /* renamed from: M */
    private void m32944M(ViewPager viewPager, boolean z11, boolean z12) {
        ViewPager viewPager2 = this.f35913b0;
        if (viewPager2 != null) {
            C6415h c6415h = this.f35916e0;
            if (c6415h != null) {
                viewPager2.m11188P(c6415h);
            }
            C6409b c6409b = this.f35917f0;
            if (c6409b != null) {
                this.f35913b0.m11187O(c6409b);
            }
        }
        InterfaceC6410c interfaceC6410c = this.f35911W;
        if (interfaceC6410c != null) {
            m32968E(interfaceC6410c);
            this.f35911W = null;
        }
        if (viewPager != null) {
            this.f35913b0 = viewPager;
            if (this.f35916e0 == null) {
                this.f35916e0 = new C6415h(this);
            }
            this.f35916e0.m33037a();
            viewPager.m11198c(this.f35916e0);
            C6416i c6416i = new C6416i(viewPager);
            this.f35911W = c6416i;
            m32976c(c6416i);
            AbstractC2065a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m32971I(adapter, z11);
            }
            if (this.f35917f0 == null) {
                this.f35917f0 = new C6409b();
            }
            this.f35917f0.m33006b(z11);
            viewPager.m11197b(this.f35917f0);
            m32972J(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f35913b0 = null;
            m32971I(null, false);
        }
        this.f35918g0 = z12;
    }

    /* renamed from: N */
    private void m32945N() {
        int size = this.f35920p.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C6414g) this.f35920p.get(i11)).m33036s();
        }
    }

    /* renamed from: O */
    private void m32946O(LinearLayout.LayoutParams layoutParams) {
        if (this.f35903O == 1 && this.f35900L == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* renamed from: g */
    private void m32949g(TabItem tabItem) {
        C6414g m32964A = m32964A();
        CharSequence charSequence = tabItem.f35884p;
        if (charSequence != null) {
            m32964A.m33035r(charSequence);
        }
        Drawable drawable = tabItem.f35885q;
        if (drawable != null) {
            m32964A.m33033p(drawable);
        }
        int i11 = tabItem.f35886r;
        if (i11 != 0) {
            m32964A.m33031n(i11);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            m32964A.m33030m(tabItem.getContentDescription());
        }
        m32977d(m32964A);
    }

    private int getDefaultHeight() {
        int size = this.f35920p.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            C6414g c6414g = (C6414g) this.f35920p.get(i11);
            if (c6414g != null && c6414g.m33023f() != null && !TextUtils.isEmpty(c6414g.m33026i())) {
                if (!this.f35904P) {
                    return 72;
                }
            } else {
                i11++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i11 = this.f35896H;
        if (i11 != -1) {
            return i11;
        }
        int i12 = this.f35903O;
        if (i12 == 0 || i12 == 2) {
            return this.f35898J;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f35922r.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m32950h(C6414g c6414g) {
        TabView tabView = c6414g.f35966i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f35922r.addView(tabView, c6414g.m33024g(), m32958q());
    }

    /* renamed from: i */
    private void m32951i(View view) {
        if (view instanceof TabItem) {
            m32949g((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: j */
    private void m32952j(int i11) {
        if (i11 == -1) {
            return;
        }
        if (getWindowToken() != null && AbstractC1579n0.m7865e0(this) && !this.f35922r.m33015c()) {
            int scrollX = getScrollX();
            int m32955m = m32955m(i11, 0.0f);
            if (scrollX != m32955m) {
                m32963x();
                this.f35912a0.setIntValues(scrollX, m32955m);
                this.f35912a0.start();
            }
            this.f35922r.m33014b(i11, this.f35901M);
            return;
        }
        m32972J(i11, 0.0f, true);
    }

    /* renamed from: k */
    private void m32953k(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
            } else {
                this.f35922r.setGravity(1);
                return;
            }
        }
        this.f35922r.setGravity(8388611);
    }

    /* renamed from: l */
    private void m32954l() {
        int max;
        int i11 = this.f35903O;
        if (i11 != 0 && i11 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.f35899K - this.f35923s);
        }
        AbstractC1579n0.m7837S0(this.f35922r, max, 0, 0, 0);
        int i12 = this.f35903O;
        if (i12 != 0) {
            if (i12 == 1 || i12 == 2) {
                this.f35922r.setGravity(1);
            }
        } else {
            m32953k(this.f35900L);
        }
        m32975P(true);
    }

    /* renamed from: m */
    private int m32955m(int i11, float f11) {
        View view;
        int i12;
        int i13 = this.f35903O;
        int i14 = 0;
        if (i13 != 0 && i13 != 2) {
            return 0;
        }
        View childAt = this.f35922r.getChildAt(i11);
        int i15 = i11 + 1;
        if (i15 < this.f35922r.getChildCount()) {
            view = this.f35922r.getChildAt(i15);
        } else {
            view = null;
        }
        if (childAt != null) {
            i12 = childAt.getWidth();
        } else {
            i12 = 0;
        }
        if (view != null) {
            i14 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i12 / 2)) - (getWidth() / 2);
        int i16 = (int) ((i12 + i14) * 0.5f * f11);
        if (AbstractC1579n0.m7812G(this) == 0) {
            return left + i16;
        }
        return left - i16;
    }

    /* renamed from: n */
    private void m32956n(C6414g c6414g, int i11) {
        c6414g.m33034q(i11);
        this.f35920p.add(i11, c6414g);
        int size = this.f35920p.size();
        while (true) {
            i11++;
            if (i11 < size) {
                ((C6414g) this.f35920p.get(i11)).m33034q(i11);
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private static ColorStateList m32957p(int i11, int i12) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i12, i11});
    }

    /* renamed from: q */
    private LinearLayout.LayoutParams m32958q() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m32946O(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    private TabView m32959s(C6414g c6414g) {
        TabView tabView;
        InterfaceC1484f interfaceC1484f = this.f35919h0;
        if (interfaceC1484f != null) {
            tabView = (TabView) interfaceC1484f.mo7484b();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(c6414g);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c6414g.f35961d)) {
            tabView.setContentDescription(c6414g.f35960c);
        } else {
            tabView.setContentDescription(c6414g.f35961d);
        }
        return tabView;
    }

    private void setSelectedTabView(int i11) {
        boolean z11;
        int childCount = this.f35922r.getChildCount();
        if (i11 < childCount) {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f35922r.getChildAt(i12);
                boolean z12 = true;
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                childAt.setSelected(z11);
                if (i12 != i11) {
                    z12 = false;
                }
                childAt.setActivated(z12);
            }
        }
    }

    /* renamed from: u */
    private void m32960u(C6414g c6414g) {
        for (int size = this.f35910V.size() - 1; size >= 0; size--) {
            ((InterfaceC6410c) this.f35910V.get(size)).mo33009c(c6414g);
        }
    }

    /* renamed from: v */
    private void m32961v(C6414g c6414g) {
        for (int size = this.f35910V.size() - 1; size >= 0; size--) {
            ((InterfaceC6410c) this.f35910V.get(size)).mo33007a(c6414g);
        }
    }

    /* renamed from: w */
    private void m32962w(C6414g c6414g) {
        for (int size = this.f35910V.size() - 1; size >= 0; size--) {
            ((InterfaceC6410c) this.f35910V.get(size)).mo33008b(c6414g);
        }
    }

    /* renamed from: x */
    private void m32963x() {
        if (this.f35912a0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f35912a0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC24041a.f116359b);
            this.f35912a0.setDuration(this.f35901M);
            this.f35912a0.addUpdateListener(new C6408a());
        }
    }

    /* renamed from: A */
    public C6414g m32964A() {
        C6414g m32980r = m32980r();
        m32980r.f35965h = this;
        m32980r.f35966i = m32959s(m32980r);
        if (m32980r.f35967j != -1) {
            m32980r.f35966i.setId(m32980r.f35967j);
        }
        return m32980r;
    }

    /* renamed from: B */
    void m32965B() {
        int currentItem;
        m32967D();
        AbstractC2065a abstractC2065a = this.f35914c0;
        if (abstractC2065a != null) {
            int mo11220d = abstractC2065a.mo11220d();
            for (int i11 = 0; i11 < mo11220d; i11++) {
                m32979f(m32964A().m33035r(this.f35914c0.m11222f(i11)), false);
            }
            ViewPager viewPager = this.f35913b0;
            if (viewPager != null && mo11220d > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                m32969G(m32981y(currentItem));
            }
        }
    }

    /* renamed from: C */
    protected boolean m32966C(C6414g c6414g) {
        return f35888j0.mo7483a(c6414g);
    }

    /* renamed from: D */
    public void m32967D() {
        for (int childCount = this.f35922r.getChildCount() - 1; childCount >= 0; childCount--) {
            m32943F(childCount);
        }
        Iterator it = this.f35920p.iterator();
        while (it.hasNext()) {
            C6414g c6414g = (C6414g) it.next();
            it.remove();
            c6414g.m33028k();
            m32966C(c6414g);
        }
        this.f35921q = null;
    }

    /* renamed from: E */
    public void m32968E(InterfaceC6410c interfaceC6410c) {
        this.f35910V.remove(interfaceC6410c);
    }

    /* renamed from: G */
    public void m32969G(C6414g c6414g) {
        m32970H(c6414g, true);
    }

    /* renamed from: H */
    public void m32970H(C6414g c6414g, boolean z11) {
        int i11;
        C6414g c6414g2 = this.f35921q;
        if (c6414g2 == c6414g) {
            if (c6414g2 != null) {
                m32960u(c6414g);
                m32952j(c6414g.m33024g());
                return;
            }
            return;
        }
        if (c6414g != null) {
            i11 = c6414g.m33024g();
        } else {
            i11 = -1;
        }
        if (z11) {
            if ((c6414g2 == null || c6414g2.m33024g() == -1) && i11 != -1) {
                m32972J(i11, 0.0f, true);
            } else {
                m32952j(i11);
            }
            if (i11 != -1) {
                setSelectedTabView(i11);
            }
        }
        this.f35921q = c6414g;
        if (c6414g2 != null) {
            m32962w(c6414g2);
        }
        if (c6414g != null) {
            m32961v(c6414g);
        }
    }

    /* renamed from: I */
    void m32971I(AbstractC2065a abstractC2065a, boolean z11) {
        DataSetObserver dataSetObserver;
        AbstractC2065a abstractC2065a2 = this.f35914c0;
        if (abstractC2065a2 != null && (dataSetObserver = this.f35915d0) != null) {
            abstractC2065a2.m11235s(dataSetObserver);
        }
        this.f35914c0 = abstractC2065a;
        if (z11 && abstractC2065a != null) {
            if (this.f35915d0 == null) {
                this.f35915d0 = new C6412e();
            }
            abstractC2065a.m11227k(this.f35915d0);
        }
        m32965B();
    }

    /* renamed from: J */
    public void m32972J(int i11, float f11, boolean z11) {
        m32973K(i11, f11, z11, true);
    }

    /* renamed from: K */
    public void m32973K(int i11, float f11, boolean z11, boolean z12) {
        int round = Math.round(i11 + f11);
        if (round >= 0 && round < this.f35922r.getChildCount()) {
            if (z12) {
                this.f35922r.m33016e(i11, f11);
            }
            ValueAnimator valueAnimator = this.f35912a0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f35912a0.cancel();
            }
            scrollTo(m32955m(i11, f11), 0);
            if (z11) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: L */
    public void m32974L(ViewPager viewPager, boolean z11) {
        m32944M(viewPager, z11, false);
    }

    /* renamed from: P */
    void m32975P(boolean z11) {
        for (int i11 = 0; i11 < this.f35922r.getChildCount(); i11++) {
            View childAt = this.f35922r.getChildAt(i11);
            childAt.setMinimumWidth(getTabMinWidth());
            m32946O((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z11) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m32951i(view);
    }

    /* renamed from: c */
    public void m32976c(InterfaceC6410c interfaceC6410c) {
        if (!this.f35910V.contains(interfaceC6410c)) {
            this.f35910V.add(interfaceC6410c);
        }
    }

    /* renamed from: d */
    public void m32977d(C6414g c6414g) {
        m32979f(c6414g, this.f35920p.isEmpty());
    }

    /* renamed from: e */
    public void m32978e(C6414g c6414g, int i11, boolean z11) {
        if (c6414g.f35965h == this) {
            m32956n(c6414g, i11);
            m32950h(c6414g);
            if (z11) {
                c6414g.m33029l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: f */
    public void m32979f(C6414g c6414g, boolean z11) {
        m32978e(c6414g, this.f35920p.size(), z11);
    }

    public int getSelectedTabPosition() {
        C6414g c6414g = this.f35921q;
        if (c6414g != null) {
            return c6414g.m33024g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f35920p.size();
    }

    public int getTabGravity() {
        return this.f35900L;
    }

    public ColorStateList getTabIconTint() {
        return this.f35929y;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f35906R;
    }

    public int getTabIndicatorGravity() {
        return this.f35902N;
    }

    int getTabMaxWidth() {
        return this.f35895G;
    }

    public int getTabMode() {
        return this.f35903O;
    }

    public ColorStateList getTabRippleColor() {
        return this.f35930z;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f35889A;
    }

    public ColorStateList getTabTextColors() {
        return this.f35928x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152469e(this);
        if (this.f35913b0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m32944M((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f35918g0) {
            setupWithViewPager(null);
            this.f35918g0 = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i11 = 0; i11 < this.f35922r.getChildCount(); i11++) {
            View childAt = this.f35922r.getChildAt(i11);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m32992j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1507g0.m7571I0(accessibilityNodeInfo).m7622f0(C1507g0.b.m7661b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int round = Math.round(AbstractC6359z.m32648c(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i12 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i12) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) != 0) {
            int i13 = this.f35897I;
            if (i13 <= 0) {
                i13 = (int) (size - AbstractC6359z.m32648c(getContext(), 56));
            }
            this.f35895G = i13;
        }
        super.onMeasure(i11, i12);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i14 = this.f35903O;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    /* renamed from: r */
    protected C6414g m32980r() {
        C6414g c6414g = (C6414g) f35888j0.mo7484b();
        if (c6414g == null) {
            return new C6414g();
        }
        return c6414g;
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        AbstractC31690i.m152468d(this, f11);
    }

    public void setInlineLabel(boolean z11) {
        if (this.f35904P != z11) {
            this.f35904P = z11;
            for (int i11 = 0; i11 < this.f35922r.getChildCount(); i11++) {
                View childAt = this.f35922r.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m33005x();
                }
            }
            m32954l();
        }
    }

    public void setInlineLabelResource(int i11) {
        setInlineLabel(getResources().getBoolean(i11));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC6411d interfaceC6411d) {
        setOnTabSelectedListener((InterfaceC6410c) interfaceC6411d);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m32963x();
        this.f35912a0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f35889A != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f35889A = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i11) {
        this.f35890B = i11;
    }

    public void setSelectedTabIndicatorGravity(int i11) {
        if (this.f35902N != i11) {
            this.f35902N = i11;
            AbstractC1579n0.m7898r0(this.f35922r);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i11) {
        this.f35922r.m33017f(i11);
    }

    public void setTabGravity(int i11) {
        if (this.f35900L != i11) {
            this.f35900L = i11;
            m32954l();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f35929y != colorStateList) {
            this.f35929y = colorStateList;
            m32945N();
        }
    }

    public void setTabIconTintResource(int i11) {
        setTabIconTint(AbstractC19694b.m103335c(getContext(), i11));
    }

    public void setTabIndicatorAnimationMode(int i11) {
        this.f35906R = i11;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f35908T = new C6417a();
                return;
            }
            throw new IllegalArgumentException(i11 + " is not a valid TabIndicatorAnimationMode");
        }
        this.f35908T = new C6418b();
    }

    public void setTabIndicatorFullWidth(boolean z11) {
        this.f35905Q = z11;
        AbstractC1579n0.m7898r0(this.f35922r);
    }

    public void setTabMode(int i11) {
        if (i11 != this.f35903O) {
            this.f35903O = i11;
            m32954l();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f35930z != colorStateList) {
            this.f35930z = colorStateList;
            for (int i11 = 0; i11 < this.f35922r.getChildCount(); i11++) {
                View childAt = this.f35922r.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m33001w(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i11) {
        setTabRippleColor(AbstractC19694b.m103335c(getContext(), i11));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f35928x != colorStateList) {
            this.f35928x = colorStateList;
            m32945N();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC2065a abstractC2065a) {
        m32971I(abstractC2065a, false);
    }

    public void setUnboundedRipple(boolean z11) {
        if (this.f35907S != z11) {
            this.f35907S = z11;
            for (int i11 = 0; i11 < this.f35922r.getChildCount(); i11++) {
                View childAt = this.f35922r.getChildAt(i11);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m33001w(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i11) {
        setUnboundedRipple(getResources().getBoolean(i11));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m32974L(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public C6414g m32981y(int i11) {
        if (i11 >= 0 && i11 < getTabCount()) {
            return (C6414g) this.f35920p.get(i11);
        }
        return null;
    }

    /* renamed from: z */
    public boolean m32982z() {
        return this.f35905Q;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f35887i0;
        this.f35920p = new ArrayList();
        this.f35889A = new GradientDrawable();
        this.f35890B = 0;
        this.f35895G = Integer.MAX_VALUE;
        this.f35910V = new ArrayList();
        this.f35919h0 = new C1485g(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C6413f c6413f = new C6413f(context2);
        this.f35922r = c6413f;
        super.addView(c6413f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.TabLayout, i11, i12, AbstractC23587l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C31689h c31689h = new C31689h();
            c31689h.m152442c0(ColorStateList.valueOf(colorDrawable.getColor()));
            c31689h.m152435R(context2);
            c31689h.m152441b0(AbstractC1579n0.m7800A(this));
            AbstractC1579n0.m7807D0(this, c31689h);
        }
        setSelectedTabIndicator(AbstractC28774c.m143976d(context2, m32639h, AbstractC23587l.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(m32639h.getColor(AbstractC23587l.TabLayout_tabIndicatorColor, 0));
        c6413f.m33017f(m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(m32639h.getInt(AbstractC23587l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(m32639h.getBoolean(AbstractC23587l.TabLayout_tabIndicatorFullWidth, true));
        setTabIndicatorAnimationMode(m32639h.getInt(AbstractC23587l.TabLayout_tabIndicatorAnimationMode, 0));
        int dimensionPixelSize = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabPadding, 0);
        this.f35926v = dimensionPixelSize;
        this.f35925u = dimensionPixelSize;
        this.f35924t = dimensionPixelSize;
        this.f35923s = dimensionPixelSize;
        this.f35923s = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f35924t = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabPaddingTop, this.f35924t);
        this.f35925u = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabPaddingEnd, this.f35925u);
        this.f35926v = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabPaddingBottom, this.f35926v);
        int resourceId = m32639h.getResourceId(AbstractC23587l.TabLayout_tabTextAppearance, AbstractC23586k.TextAppearance_Design_Tab);
        this.f35927w = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, AbstractC19187j.TextAppearance);
        try {
            this.f35892D = obtainStyledAttributes.getDimensionPixelSize(AbstractC19187j.TextAppearance_android_textSize, 0);
            this.f35928x = AbstractC28774c.m143973a(context2, obtainStyledAttributes, AbstractC19187j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (m32639h.hasValue(AbstractC23587l.TabLayout_tabTextColor)) {
                this.f35928x = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.TabLayout_tabTextColor);
            }
            if (m32639h.hasValue(AbstractC23587l.TabLayout_tabSelectedTextColor)) {
                this.f35928x = m32957p(this.f35928x.getDefaultColor(), m32639h.getColor(AbstractC23587l.TabLayout_tabSelectedTextColor, 0));
            }
            this.f35929y = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.TabLayout_tabIconTint);
            this.f35891C = AbstractC6359z.m32654i(m32639h.getInt(AbstractC23587l.TabLayout_tabIconTintMode, -1), null);
            this.f35930z = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.TabLayout_tabRippleColor);
            this.f35901M = m32639h.getInt(AbstractC23587l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f35896H = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabMinWidth, -1);
            this.f35897I = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabMaxWidth, -1);
            this.f35894F = m32639h.getResourceId(AbstractC23587l.TabLayout_tabBackground, 0);
            this.f35899K = m32639h.getDimensionPixelSize(AbstractC23587l.TabLayout_tabContentStart, 0);
            this.f35903O = m32639h.getInt(AbstractC23587l.TabLayout_tabMode, 1);
            this.f35900L = m32639h.getInt(AbstractC23587l.TabLayout_tabGravity, 0);
            this.f35904P = m32639h.getBoolean(AbstractC23587l.TabLayout_tabInlineLabel, false);
            this.f35907S = m32639h.getBoolean(AbstractC23587l.TabLayout_tabUnboundedRipple, false);
            m32639h.recycle();
            Resources resources = getResources();
            this.f35893E = resources.getDimensionPixelSize(AbstractC23579d.design_tab_text_size_2line);
            this.f35898J = resources.getDimensionPixelSize(AbstractC23579d.design_tab_scrollable_min_width);
            m32954l();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i11) {
        m32951i(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC6410c interfaceC6410c) {
        InterfaceC6410c interfaceC6410c2 = this.f35909U;
        if (interfaceC6410c2 != null) {
            m32968E(interfaceC6410c2);
        }
        this.f35909U = interfaceC6410c;
        if (interfaceC6410c != null) {
            m32976c(interfaceC6410c);
        }
    }

    public void setSelectedTabIndicator(int i11) {
        if (i11 != 0) {
            setSelectedTabIndicator(AbstractC19694b.m103336d(getContext(), i11));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m32951i(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        m32951i(view);
    }
}
