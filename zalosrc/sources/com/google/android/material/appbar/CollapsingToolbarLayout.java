package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.AbstractC1482d;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.AbstractC6336c;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.C6334a;
import p013a7.AbstractC0638a;
import p175g0.AbstractC19186i;
import p252j1.AbstractC20900a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p505s6.C26159a;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: S */
    private static final int f34773S = AbstractC23586k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    final C26159a f34774A;

    /* renamed from: B */
    private boolean f34775B;

    /* renamed from: C */
    private boolean f34776C;

    /* renamed from: D */
    private Drawable f34777D;

    /* renamed from: E */
    Drawable f34778E;

    /* renamed from: F */
    private int f34779F;

    /* renamed from: G */
    private boolean f34780G;

    /* renamed from: H */
    private ValueAnimator f34781H;

    /* renamed from: I */
    private long f34782I;

    /* renamed from: J */
    private int f34783J;

    /* renamed from: K */
    private AppBarLayout.InterfaceC6222d f34784K;

    /* renamed from: L */
    int f34785L;

    /* renamed from: M */
    private int f34786M;

    /* renamed from: N */
    C1580n1 f34787N;

    /* renamed from: O */
    private int f34788O;

    /* renamed from: P */
    private boolean f34789P;

    /* renamed from: Q */
    private int f34790Q;

    /* renamed from: R */
    private boolean f34791R;

    /* renamed from: p */
    private boolean f34792p;

    /* renamed from: q */
    private int f34793q;

    /* renamed from: r */
    private ViewGroup f34794r;

    /* renamed from: s */
    private View f34795s;

    /* renamed from: t */
    private View f34796t;

    /* renamed from: u */
    private int f34797u;

    /* renamed from: v */
    private int f34798v;

    /* renamed from: w */
    private int f34799w;

    /* renamed from: x */
    private int f34800x;

    /* renamed from: y */
    private final Rect f34801y;

    /* renamed from: z */
    final C6334a f34802z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    /* loaded from: classes3.dex */
    class C6223a implements InterfaceC1551g0 {
        C6223a() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            return CollapsingToolbarLayout.this.m31622n(c1580n1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    /* loaded from: classes3.dex */
    public class C6224b implements ValueAnimator.AnimatorUpdateListener {
        C6224b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    /* loaded from: classes3.dex */
    private class C6225c implements AppBarLayout.InterfaceC6222d {
        C6225c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC6221c
        /* renamed from: a */
        public void mo31601a(AppBarLayout appBarLayout, int i11) {
            int i12;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f34785L = i11;
            C1580n1 c1580n1 = collapsingToolbarLayout.f34787N;
            if (c1580n1 != null) {
                i12 = c1580n1.m8061m();
            } else {
                i12 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i13);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                C6232f m31608j = CollapsingToolbarLayout.m31608j(childAt);
                int i14 = layoutParams.f34803a;
                if (i14 != 1) {
                    if (i14 == 2) {
                        m31608j.m31652f(Math.round((-i11) * layoutParams.f34804b));
                    }
                } else {
                    m31608j.m31652f(AbstractC20900a.m109345b(-i11, 0, CollapsingToolbarLayout.this.m31621h(childAt)));
                }
            }
            CollapsingToolbarLayout.this.m31624w();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f34778E != null && i12 > 0) {
                AbstractC1579n0.m7898r0(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - AbstractC1579n0.m7814H(CollapsingToolbarLayout.this)) - i12;
            float f11 = height;
            CollapsingToolbarLayout.this.f34802z.m32541r0(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f11));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f34802z.m32527f0(collapsingToolbarLayout3.f34785L + height);
            CollapsingToolbarLayout.this.f34802z.m32537p0(Math.abs(i11) / f11);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.collapsingToolbarLayoutStyle);
    }

    /* renamed from: a */
    private void m31602a(int i11) {
        TimeInterpolator timeInterpolator;
        m31604c();
        ValueAnimator valueAnimator = this.f34781H;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f34781H = valueAnimator2;
            valueAnimator2.setDuration(this.f34782I);
            ValueAnimator valueAnimator3 = this.f34781H;
            if (i11 > this.f34779F) {
                timeInterpolator = AbstractC24041a.f116360c;
            } else {
                timeInterpolator = AbstractC24041a.f116361d;
            }
            valueAnimator3.setInterpolator(timeInterpolator);
            this.f34781H.addUpdateListener(new C6224b());
        } else if (valueAnimator.isRunning()) {
            this.f34781H.cancel();
        }
        this.f34781H.setIntValues(this.f34779F, i11);
        this.f34781H.start();
    }

    /* renamed from: b */
    private void m31603b(AppBarLayout appBarLayout) {
        if (m31609k()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* renamed from: c */
    private void m31604c() {
        if (!this.f34792p) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f34794r = null;
        this.f34795s = null;
        int i11 = this.f34793q;
        if (i11 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i11);
            this.f34794r = viewGroup2;
            if (viewGroup2 != null) {
                this.f34795s = m31605d(viewGroup2);
            }
        }
        if (this.f34794r == null) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i12);
                if (m31610l(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i12++;
            }
            this.f34794r = viewGroup;
        }
        m31616v();
        this.f34792p = false;
    }

    /* renamed from: d */
    private View m31605d(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    /* renamed from: g */
    private static int m31606g(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: i */
    private static CharSequence m31607i(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    /* renamed from: j */
    static C6232f m31608j(View view) {
        C6232f c6232f = (C6232f) view.getTag(AbstractC23581f.view_offset_helper);
        if (c6232f == null) {
            C6232f c6232f2 = new C6232f(view);
            view.setTag(AbstractC23581f.view_offset_helper, c6232f2);
            return c6232f2;
        }
        return c6232f;
    }

    /* renamed from: k */
    private boolean m31609k() {
        return this.f34786M == 1;
    }

    /* renamed from: l */
    private static boolean m31610l(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m31611m(View view) {
        View view2 = this.f34795s;
        if (view2 == null || view2 == this) {
            if (view != this.f34794r) {
                return false;
            }
        } else if (view != view2) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private void m31612q(boolean z11) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view = this.f34795s;
        if (view == null) {
            view = this.f34794r;
        }
        int m31621h = m31621h(view);
        AbstractC6336c.m32555a(this, this.f34796t, this.f34801y);
        ViewGroup viewGroup = this.f34794r;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i11 = toolbar.getTitleMarginStart();
            i13 = toolbar.getTitleMarginEnd();
            i14 = toolbar.getTitleMarginTop();
            i12 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i11 = toolbar2.getTitleMarginStart();
            i13 = toolbar2.getTitleMarginEnd();
            i14 = toolbar2.getTitleMarginTop();
            i12 = toolbar2.getTitleMarginBottom();
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        C6334a c6334a = this.f34802z;
        Rect rect = this.f34801y;
        int i16 = rect.left;
        if (z11) {
            i15 = i13;
        } else {
            i15 = i11;
        }
        int i17 = i16 + i15;
        int i18 = rect.top + m31621h + i14;
        int i19 = rect.right;
        if (!z11) {
            i11 = i13;
        }
        c6334a.m32520X(i17, i18, i19 - i11, (rect.bottom + m31621h) - i12);
    }

    /* renamed from: r */
    private void m31613r() {
        setContentDescription(getTitle());
    }

    /* renamed from: s */
    private void m31614s(Drawable drawable, int i11, int i12) {
        m31615u(drawable, this.f34794r, i11, i12);
    }

    /* renamed from: u */
    private void m31615u(Drawable drawable, View view, int i11, int i12) {
        if (m31609k() && view != null && this.f34775B) {
            i12 = view.getBottom();
        }
        drawable.setBounds(0, 0, i11, i12);
    }

    /* renamed from: v */
    private void m31616v() {
        View view;
        if (!this.f34775B && (view = this.f34796t) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f34796t);
            }
        }
        if (this.f34775B && this.f34794r != null) {
            if (this.f34796t == null) {
                this.f34796t = new View(getContext());
            }
            if (this.f34796t.getParent() == null) {
                this.f34794r.addView(this.f34796t, -1, -1);
            }
        }
    }

    /* renamed from: x */
    private void m31617x(int i11, int i12, int i13, int i14, boolean z11) {
        View view;
        boolean z12;
        int i15;
        int i16;
        if (this.f34775B && (view = this.f34796t) != null) {
            boolean z13 = false;
            if (AbstractC1579n0.m7862d0(view) && this.f34796t.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f34776C = z12;
            if (z12 || z11) {
                if (AbstractC1579n0.m7812G(this) == 1) {
                    z13 = true;
                }
                m31612q(z13);
                C6334a c6334a = this.f34802z;
                if (z13) {
                    i15 = this.f34799w;
                } else {
                    i15 = this.f34797u;
                }
                int i17 = this.f34801y.top + this.f34798v;
                int i18 = i13 - i11;
                if (z13) {
                    i16 = this.f34797u;
                } else {
                    i16 = this.f34799w;
                }
                c6334a.m32528g0(i15, i17, i18 - i16, (i14 - i12) - this.f34800x);
                this.f34802z.m32519V(z11);
            }
        }
    }

    /* renamed from: y */
    private void m31618y() {
        if (this.f34794r != null && this.f34775B && TextUtils.isEmpty(this.f34802z.m32515K())) {
            setTitle(m31607i(this.f34794r));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i11;
        Drawable drawable;
        super.draw(canvas);
        m31604c();
        if (this.f34794r == null && (drawable = this.f34777D) != null && this.f34779F > 0) {
            drawable.mutate().setAlpha(this.f34779F);
            this.f34777D.draw(canvas);
        }
        if (this.f34775B && this.f34776C) {
            if (this.f34794r != null && this.f34777D != null && this.f34779F > 0 && m31609k() && this.f34802z.m32508D() < this.f34802z.m32509E()) {
                int save = canvas.save();
                canvas.clipRect(this.f34777D.getBounds(), Region.Op.DIFFERENCE);
                this.f34802z.m32533m(canvas);
                canvas.restoreToCount(save);
            } else {
                this.f34802z.m32533m(canvas);
            }
        }
        if (this.f34778E != null && this.f34779F > 0) {
            C1580n1 c1580n1 = this.f34787N;
            if (c1580n1 != null) {
                i11 = c1580n1.m8061m();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                this.f34778E.setBounds(0, -this.f34785L, getWidth(), i11 - this.f34785L);
                this.f34778E.mutate().setAlpha(this.f34779F);
                this.f34778E.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        boolean z11;
        if (this.f34777D != null && this.f34779F > 0 && m31611m(view)) {
            m31615u(this.f34777D, view, getWidth(), getHeight());
            this.f34777D.mutate().setAlpha(this.f34779F);
            this.f34777D.draw(canvas);
            z11 = true;
        } else {
            z11 = false;
        }
        if (super.drawChild(canvas, view, j11) || z11) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z11;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34778E;
        if (drawable != null && drawable.isStateful()) {
            z11 = drawable.setState(drawableState);
        } else {
            z11 = false;
        }
        Drawable drawable2 = this.f34777D;
        if (drawable2 != null && drawable2.isStateful()) {
            z11 |= drawable2.setState(drawableState);
        }
        C6334a c6334a = this.f34802z;
        if (c6334a != null) {
            z11 |= c6334a.m32552z0(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f34802z.m32540r();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f34802z.m32545v();
    }

    public Drawable getContentScrim() {
        return this.f34777D;
    }

    public int getExpandedTitleGravity() {
        return this.f34802z.m32502A();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f34800x;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f34799w;
    }

    public int getExpandedTitleMarginStart() {
        return this.f34797u;
    }

    public int getExpandedTitleMarginTop() {
        return this.f34798v;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f34802z.m32506C();
    }

    public int getHyphenationFrequency() {
        return this.f34802z.m32510F();
    }

    public int getLineCount() {
        return this.f34802z.m32511G();
    }

    public float getLineSpacingAdd() {
        return this.f34802z.m32512H();
    }

    public float getLineSpacingMultiplier() {
        return this.f34802z.m32513I();
    }

    public int getMaxLines() {
        return this.f34802z.m32514J();
    }

    int getScrimAlpha() {
        return this.f34779F;
    }

    public long getScrimAnimationDuration() {
        return this.f34782I;
    }

    public int getScrimVisibleHeightTrigger() {
        int i11;
        int i12 = this.f34783J;
        if (i12 >= 0) {
            return i12 + this.f34788O + this.f34790Q;
        }
        C1580n1 c1580n1 = this.f34787N;
        if (c1580n1 != null) {
            i11 = c1580n1.m8061m();
        } else {
            i11 = 0;
        }
        int m7814H = AbstractC1579n0.m7814H(this);
        if (m7814H > 0) {
            return Math.min((m7814H * 2) + i11, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f34778E;
    }

    public CharSequence getTitle() {
        if (this.f34775B) {
            return this.f34802z.m32515K();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f34786M;
    }

    /* renamed from: h */
    final int m31621h(View view) {
        return ((getHeight() - m31608j(view).m31648b()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: n */
    C1580n1 m31622n(C1580n1 c1580n1) {
        C1580n1 c1580n12;
        if (AbstractC1579n0.m7806D(this)) {
            c1580n12 = c1580n1;
        } else {
            c1580n12 = null;
        }
        if (!AbstractC1482d.m7475a(this.f34787N, c1580n12)) {
            this.f34787N = c1580n12;
            requestLayout();
        }
        return c1580n1.m8051c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            m31603b(appBarLayout);
            AbstractC1579n0.m7819J0(this, AbstractC1579n0.m7806D(appBarLayout));
            if (this.f34784K == null) {
                this.f34784K = new C6225c();
            }
            appBarLayout.m31537b(this.f34784K);
            AbstractC1579n0.m7910x0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC6222d interfaceC6222d = this.f34784K;
        if (interfaceC6222d != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).m31547q(interfaceC6222d);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C1580n1 c1580n1 = this.f34787N;
        if (c1580n1 != null) {
            int m8061m = c1580n1.m8061m();
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt(i15);
                if (!AbstractC1579n0.m7806D(childAt) && childAt.getTop() < m8061m) {
                    AbstractC1579n0.m7886l0(childAt, m8061m);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i16 = 0; i16 < childCount2; i16++) {
            m31608j(getChildAt(i16)).m31650d();
        }
        m31617x(i11, i12, i13, i14, false);
        m31618y();
        m31624w();
        int childCount3 = getChildCount();
        for (int i17 = 0; i17 < childCount3; i17++) {
            m31608j(getChildAt(i17)).m31647a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        m31604c();
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        C1580n1 c1580n1 = this.f34787N;
        if (c1580n1 != null) {
            i13 = c1580n1.m8061m();
        } else {
            i13 = 0;
        }
        if ((mode == 0 || this.f34789P) && i13 > 0) {
            this.f34788O = i13;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i13, 1073741824));
        }
        if (this.f34791R && this.f34802z.m32514J() > 1) {
            m31618y();
            m31617x(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int m32511G = this.f34802z.m32511G();
            if (m32511G > 1) {
                this.f34790Q = Math.round(this.f34802z.m32551z()) * (m32511G - 1);
                super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f34790Q, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f34794r;
        if (viewGroup != null) {
            View view = this.f34795s;
            if (view != null && view != this) {
                setMinimumHeight(m31606g(view));
            } else {
                setMinimumHeight(m31606g(viewGroup));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        Drawable drawable = this.f34777D;
        if (drawable != null) {
            m31614s(drawable, i11, i12);
        }
    }

    /* renamed from: p */
    public void m31623p(boolean z11, boolean z12) {
        if (this.f34780G != z11) {
            int i11 = 0;
            if (z12) {
                if (z11) {
                    i11 = 255;
                }
                m31602a(i11);
            } else {
                if (z11) {
                    i11 = 255;
                }
                setScrimAlpha(i11);
            }
            this.f34780G = z11;
        }
    }

    public void setCollapsedTitleGravity(int i11) {
        this.f34802z.m32525c0(i11);
    }

    public void setCollapsedTitleTextAppearance(int i11) {
        this.f34802z.m32522Z(i11);
    }

    public void setCollapsedTitleTextColor(int i11) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f34802z.m32526d0(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f34777D;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34777D = drawable3;
            if (drawable3 != null) {
                m31614s(drawable3, getWidth(), getHeight());
                this.f34777D.setCallback(this);
                this.f34777D.setAlpha(this.f34779F);
            }
            AbstractC1579n0.m7898r0(this);
        }
    }

    public void setContentScrimColor(int i11) {
        setContentScrim(new ColorDrawable(i11));
    }

    public void setContentScrimResource(int i11) {
        setContentScrim(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setExpandedTitleColor(int i11) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i11));
    }

    public void setExpandedTitleGravity(int i11) {
        this.f34802z.m32532l0(i11);
    }

    public void setExpandedTitleMarginBottom(int i11) {
        this.f34800x = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i11) {
        this.f34799w = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i11) {
        this.f34797u = i11;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i11) {
        this.f34798v = i11;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i11) {
        this.f34802z.m32530i0(i11);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f34802z.m32531k0(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f34802z.m32535n0(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z11) {
        this.f34791R = z11;
    }

    public void setForceApplySystemWindowInsetTop(boolean z11) {
        this.f34789P = z11;
    }

    public void setHyphenationFrequency(int i11) {
        this.f34802z.m32543s0(i11);
    }

    public void setLineSpacingAdd(float f11) {
        this.f34802z.m32544u0(f11);
    }

    public void setLineSpacingMultiplier(float f11) {
        this.f34802z.m32546v0(f11);
    }

    public void setMaxLines(int i11) {
        this.f34802z.m32548w0(i11);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z11) {
        this.f34802z.m32550y0(z11);
    }

    void setScrimAlpha(int i11) {
        ViewGroup viewGroup;
        if (i11 != this.f34779F) {
            if (this.f34777D != null && (viewGroup = this.f34794r) != null) {
                AbstractC1579n0.m7898r0(viewGroup);
            }
            this.f34779F = i11;
            AbstractC1579n0.m7898r0(this);
        }
    }

    public void setScrimAnimationDuration(long j11) {
        this.f34782I = j11;
    }

    public void setScrimVisibleHeightTrigger(int i11) {
        if (this.f34783J != i11) {
            this.f34783J = i11;
            m31624w();
        }
    }

    public void setScrimsShown(boolean z11) {
        boolean z12;
        if (AbstractC1579n0.m7865e0(this) && !isInEditMode()) {
            z12 = true;
        } else {
            z12 = false;
        }
        m31623p(z11, z12);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z11;
        Drawable drawable2 = this.f34778E;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34778E = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f34778E.setState(getDrawableState());
                }
                AbstractC1414a.m7195m(this.f34778E, AbstractC1579n0.m7812G(this));
                Drawable drawable4 = this.f34778E;
                if (getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                drawable4.setVisible(z11, false);
                this.f34778E.setCallback(this);
                this.f34778E.setAlpha(this.f34779F);
            }
            AbstractC1579n0.m7898r0(this);
        }
    }

    public void setStatusBarScrimColor(int i11) {
        setStatusBarScrim(new ColorDrawable(i11));
    }

    public void setStatusBarScrimResource(int i11) {
        setStatusBarScrim(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setTitle(CharSequence charSequence) {
        this.f34802z.m32503A0(charSequence);
        m31613r();
    }

    public void setTitleCollapseMode(int i11) {
        this.f34786M = i11;
        boolean m31609k = m31609k();
        this.f34802z.m32539q0(m31609k);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            m31603b((AppBarLayout) parent);
        }
        if (m31609k && this.f34777D == null) {
            setContentScrimColor(this.f34774A.m134514d(getResources().getDimension(AbstractC23579d.design_appbar_elevation)));
        }
    }

    public void setTitleEnabled(boolean z11) {
        if (z11 != this.f34775B) {
            this.f34775B = z11;
            m31613r();
            m31616v();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.f34778E;
        if (drawable != null && drawable.isVisible() != z11) {
            this.f34778E.setVisible(z11, false);
        }
        Drawable drawable2 = this.f34777D;
        if (drawable2 != null && drawable2.isVisible() != z11) {
            this.f34777D.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f34777D && drawable != this.f34778E) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    final void m31624w() {
        boolean z11;
        if (this.f34777D != null || this.f34778E != null) {
            if (getHeight() + this.f34785L < getScrimVisibleHeightTrigger()) {
                z11 = true;
            } else {
                z11 = false;
            }
            setScrimsShown(z11);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f34773S;
        this.f34792p = true;
        this.f34801y = new Rect();
        this.f34783J = -1;
        this.f34788O = 0;
        this.f34790Q = 0;
        Context context2 = getContext();
        C6334a c6334a = new C6334a(this);
        this.f34802z = c6334a;
        c6334a.m32505B0(AbstractC24041a.f116362e);
        c6334a.m32550y0(false);
        this.f34774A = new C26159a(context2);
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.CollapsingToolbarLayout, i11, i12, new int[0]);
        c6334a.m32532l0(m32639h.getInt(AbstractC23587l.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        c6334a.m32525c0(m32639h.getInt(AbstractC23587l.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f34800x = dimensionPixelSize;
        this.f34799w = dimensionPixelSize;
        this.f34798v = dimensionPixelSize;
        this.f34797u = dimensionPixelSize;
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f34797u = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f34799w = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f34798v = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f34800x = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f34775B = m32639h.getBoolean(AbstractC23587l.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(m32639h.getText(AbstractC23587l.CollapsingToolbarLayout_title));
        c6334a.m32530i0(AbstractC23586k.TextAppearance_Design_CollapsingToolbar_Expanded);
        c6334a.m32522Z(AbstractC19186i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            c6334a.m32530i0(m32639h.getResourceId(AbstractC23587l.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            c6334a.m32522Z(m32639h.getResourceId(AbstractC23587l.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f34783J = m32639h.getDimensionPixelSize(AbstractC23587l.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (m32639h.hasValue(AbstractC23587l.CollapsingToolbarLayout_maxLines)) {
            c6334a.m32548w0(m32639h.getInt(AbstractC23587l.CollapsingToolbarLayout_maxLines, 1));
        }
        this.f34782I = m32639h.getInt(AbstractC23587l.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(m32639h.getDrawable(AbstractC23587l.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(m32639h.getDrawable(AbstractC23587l.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(m32639h.getInt(AbstractC23587l.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.f34793q = m32639h.getResourceId(AbstractC23587l.CollapsingToolbarLayout_toolbarId, -1);
        this.f34789P = m32639h.getBoolean(AbstractC23587l.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.f34791R = m32639h.getBoolean(AbstractC23587l.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        m32639h.recycle();
        setWillNotDraw(false);
        AbstractC1579n0.m7833Q0(this, new C6223a());
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f34802z.m32523b0(colorStateList);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f34803a;

        /* renamed from: b */
        float f34804b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34803a = 0;
            this.f34804b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.CollapsingToolbarLayout_Layout);
            this.f34803a = obtainStyledAttributes.getInt(AbstractC23587l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            m31625a(obtainStyledAttributes.getFloat(AbstractC23587l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m31625a(float f11) {
            this.f34804b = f11;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f34803a = 0;
            this.f34804b = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34803a = 0;
            this.f34804b = 0.5f;
        }
    }
}
