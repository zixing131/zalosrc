package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.AbstractC6336c;
import com.google.android.material.internal.AbstractC6355v;
import java.util.Iterator;
import java.util.List;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23576a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.C24048h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC1303b {

    /* renamed from: V */
    private static final int f35271V = AbstractC23586k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: W */
    static final Property f35272W = new C6307d(Float.class, "width");

    /* renamed from: a0 */
    static final Property f35273a0 = new C6308e(Float.class, "height");

    /* renamed from: b0 */
    static final Property f35274b0 = new C6309f(Float.class, "paddingStart");

    /* renamed from: c0 */
    static final Property f35275c0 = new C6310g(Float.class, "paddingEnd");

    /* renamed from: H */
    private int f35276H;

    /* renamed from: I */
    private final C6320a f35277I;

    /* renamed from: J */
    private final InterfaceC6325f f35278J;

    /* renamed from: K */
    private final InterfaceC6325f f35279K;

    /* renamed from: L */
    private final InterfaceC6325f f35280L;

    /* renamed from: M */
    private final InterfaceC6325f f35281M;

    /* renamed from: N */
    private final int f35282N;

    /* renamed from: O */
    private int f35283O;

    /* renamed from: P */
    private int f35284P;

    /* renamed from: Q */
    private final CoordinatorLayout.Behavior f35285Q;

    /* renamed from: R */
    private boolean f35286R;

    /* renamed from: S */
    private boolean f35287S;

    /* renamed from: T */
    private boolean f35288T;

    /* renamed from: U */
    protected ColorStateList f35289U;

    /* loaded from: classes3.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f35290a;

        /* renamed from: b */
        private boolean f35291b;

        /* renamed from: c */
        private boolean f35292c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f35291b = false;
            this.f35292c = true;
        }

        /* renamed from: G */
        private static boolean m32301G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C1306e) {
                return ((CoordinatorLayout.C1306e) layoutParams).m6580f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m32302J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) extendedFloatingActionButton.getLayoutParams();
            if ((!this.f35291b && !this.f35292c) || c1306e.m6579e() != view.getId()) {
                return false;
            }
            return true;
        }

        /* renamed from: L */
        private boolean m32303L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m32302J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f35290a == null) {
                this.f35290a = new Rect();
            }
            Rect rect = this.f35290a;
            AbstractC6336c.m32555a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m32309K(extendedFloatingActionButton);
                return true;
            }
            m32305E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m32304M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m32302J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1306e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m32309K(extendedFloatingActionButton);
                return true;
            }
            m32305E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: E */
        protected void m32305E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m32285D(this.f35292c ? extendedFloatingActionButton.f35279K : extendedFloatingActionButton.f35280L, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public boolean mo6544b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo6544b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean mo6550h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m32303L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (m32301G(view)) {
                m32304M(view, extendedFloatingActionButton);
                return false;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean mo6554l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i11) {
            List m6536x = coordinatorLayout.m6536x(extendedFloatingActionButton);
            int size = m6536x.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = (View) m6536x.get(i12);
                if (view instanceof AppBarLayout) {
                    if (m32303L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m32301G(view) && m32304M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m6524O(extendedFloatingActionButton, i11);
            return true;
        }

        /* renamed from: K */
        protected void m32309K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m32285D(this.f35292c ? extendedFloatingActionButton.f35278J : extendedFloatingActionButton.f35281M, null);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: g */
        public void mo6549g(CoordinatorLayout.C1306e c1306e) {
            if (c1306e.f5820h == 0) {
                c1306e.f5820h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f35291b = obtainStyledAttributes.getBoolean(AbstractC23587l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f35292c = obtainStyledAttributes.getBoolean(AbstractC23587l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    /* loaded from: classes3.dex */
    class C6304a implements InterfaceC6315l {
        C6304a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f35284P;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f35283O;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f35283O + ExtendedFloatingActionButton.this.f35284P;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    /* loaded from: classes3.dex */
    class C6305b implements InterfaceC6315l {
        C6305b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.InterfaceC6315l
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    /* loaded from: classes3.dex */
    public class C6306c extends AnimatorListenerAdapter {

        /* renamed from: p */
        private boolean f35295p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC6325f f35296q;

        C6306c(InterfaceC6325f interfaceC6325f, AbstractC6313j abstractC6313j) {
            this.f35296q = interfaceC6325f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35295p = true;
            this.f35296q.mo32324c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35296q.mo32318a();
            if (!this.f35295p) {
                this.f35296q.mo32323j(null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f35296q.onAnimationStart(animator);
            this.f35295p = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    /* loaded from: classes3.dex */
    static class C6307d extends Property {
        C6307d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            view.getLayoutParams().width = f11.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    /* loaded from: classes3.dex */
    static class C6308e extends Property {
        C6308e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            view.getLayoutParams().height = f11.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    /* loaded from: classes3.dex */
    static class C6309f extends Property {
        C6309f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1579n0.m7820K(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            AbstractC1579n0.m7837S0(view, f11.intValue(), view.getPaddingTop(), AbstractC1579n0.m7818J(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    /* loaded from: classes3.dex */
    static class C6310g extends Property {
        C6310g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC1579n0.m7818J(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f11) {
            AbstractC1579n0.m7837S0(view, AbstractC1579n0.m7820K(view), view.getPaddingTop(), f11.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    /* loaded from: classes3.dex */
    class C6311h extends AbstractC6321b {

        /* renamed from: g */
        private final InterfaceC6315l f35298g;

        /* renamed from: h */
        private final boolean f35299h;

        C6311h(C6320a c6320a, InterfaceC6315l interfaceC6315l, boolean z11) {
            super(ExtendedFloatingActionButton.this, c6320a);
            this.f35298g = interfaceC6315l;
            this.f35299h = z11;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: a */
        public void mo32318a() {
            super.mo32318a();
            ExtendedFloatingActionButton.this.f35287S = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f35298g.getLayoutParams().width;
            layoutParams.height = this.f35298g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: b */
        public void mo32319b() {
            ExtendedFloatingActionButton.this.f35286R = this.f35299h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f35298g.getLayoutParams().width;
            layoutParams.height = this.f35298g.getLayoutParams().height;
            AbstractC1579n0.m7837S0(ExtendedFloatingActionButton.this, this.f35298g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f35298g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: f */
        public boolean mo32320f() {
            if (this.f35299h != ExtendedFloatingActionButton.this.f35286R && ExtendedFloatingActionButton.this.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: g */
        public int mo32321g() {
            return this.f35299h ? AbstractC23576a.mtrl_extended_fab_change_size_expand_motion_spec : AbstractC23576a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: h */
        public AnimatorSet mo32322h() {
            float f11;
            C24048h m32368m = m32368m();
            if (m32368m.m125931j("width")) {
                PropertyValuesHolder[] m125928g = m32368m.m125928g("width");
                m125928g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f35298g.getWidth());
                m32368m.m125933l("width", m125928g);
            }
            if (m32368m.m125931j("height")) {
                PropertyValuesHolder[] m125928g2 = m32368m.m125928g("height");
                m125928g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f35298g.getHeight());
                m32368m.m125933l("height", m125928g2);
            }
            if (m32368m.m125931j("paddingStart")) {
                PropertyValuesHolder[] m125928g3 = m32368m.m125928g("paddingStart");
                m125928g3[0].setFloatValues(AbstractC1579n0.m7820K(ExtendedFloatingActionButton.this), this.f35298g.getPaddingStart());
                m32368m.m125933l("paddingStart", m125928g3);
            }
            if (m32368m.m125931j("paddingEnd")) {
                PropertyValuesHolder[] m125928g4 = m32368m.m125928g("paddingEnd");
                m125928g4[0].setFloatValues(AbstractC1579n0.m7818J(ExtendedFloatingActionButton.this), this.f35298g.getPaddingEnd());
                m32368m.m125933l("paddingEnd", m125928g4);
            }
            if (m32368m.m125931j("labelOpacity")) {
                PropertyValuesHolder[] m125928g5 = m32368m.m125928g("labelOpacity");
                boolean z11 = this.f35299h;
                float f12 = 1.0f;
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                if (!z11) {
                    f12 = 0.0f;
                }
                m125928g5[0].setFloatValues(f11, f12);
                m32368m.m125933l("labelOpacity", m125928g5);
            }
            return super.m32367l(m32368m);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: j */
        public void mo32323j(AbstractC6313j abstractC6313j) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f35286R = this.f35299h;
            ExtendedFloatingActionButton.this.f35287S = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    /* loaded from: classes3.dex */
    class C6312i extends AbstractC6321b {

        /* renamed from: g */
        private boolean f35301g;

        public C6312i(C6320a c6320a) {
            super(ExtendedFloatingActionButton.this, c6320a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: a */
        public void mo32318a() {
            super.mo32318a();
            ExtendedFloatingActionButton.this.f35276H = 0;
            if (!this.f35301g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: b */
        public void mo32319b() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: c */
        public void mo32324c() {
            super.mo32324c();
            this.f35301g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: f */
        public boolean mo32320f() {
            return ExtendedFloatingActionButton.this.m32283B();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: g */
        public int mo32321g() {
            return AbstractC23576a.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: j */
        public void mo32323j(AbstractC6313j abstractC6313j) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f35301g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f35276H = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6313j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    /* loaded from: classes3.dex */
    class C6314k extends AbstractC6321b {
        public C6314k(C6320a c6320a) {
            super(ExtendedFloatingActionButton.this, c6320a);
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: a */
        public void mo32318a() {
            super.mo32318a();
            ExtendedFloatingActionButton.this.f35276H = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: b */
        public void mo32319b() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: f */
        public boolean mo32320f() {
            return ExtendedFloatingActionButton.this.m32284C();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: g */
        public int mo32321g() {
            return AbstractC23576a.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
        /* renamed from: j */
        public void mo32323j(AbstractC6313j abstractC6313j) {
        }

        @Override // com.google.android.material.floatingactionbutton.AbstractC6321b, com.google.android.material.floatingactionbutton.InterfaceC6325f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f35276H = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    /* loaded from: classes3.dex */
    interface InterfaceC6315l {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.extendedFloatingActionButtonStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public boolean m32283B() {
        if (getVisibility() == 0) {
            if (this.f35276H != 1) {
                return false;
            }
            return true;
        }
        if (this.f35276H == 2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public boolean m32284C() {
        if (getVisibility() != 0) {
            if (this.f35276H != 2) {
                return false;
            }
            return true;
        }
        if (this.f35276H == 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m32285D(InterfaceC6325f interfaceC6325f, AbstractC6313j abstractC6313j) {
        if (interfaceC6325f.mo32320f()) {
            return;
        }
        if (!m32287F()) {
            interfaceC6325f.mo32319b();
            interfaceC6325f.mo32323j(abstractC6313j);
            return;
        }
        measure(0, 0);
        AnimatorSet mo32322h = interfaceC6325f.mo32322h();
        mo32322h.addListener(new C6306c(interfaceC6325f, abstractC6313j));
        Iterator it = interfaceC6325f.mo32366i().iterator();
        while (it.hasNext()) {
            mo32322h.addListener((Animator.AnimatorListener) it.next());
        }
        mo32322h.start();
    }

    /* renamed from: E */
    private void m32286E() {
        this.f35289U = getTextColors();
    }

    /* renamed from: F */
    private boolean m32287F() {
        if ((AbstractC1579n0.m7865e0(this) || (!m32284C() && this.f35288T)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public void m32300G(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1303b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f35285Q;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i11 = this.f35282N;
        if (i11 < 0) {
            return (Math.min(AbstractC1579n0.m7820K(this), AbstractC1579n0.m7818J(this)) * 2) + getIconSize();
        }
        return i11;
    }

    public C24048h getExtendMotionSpec() {
        return this.f35279K.mo32364d();
    }

    public C24048h getHideMotionSpec() {
        return this.f35281M.mo32364d();
    }

    public C24048h getShowMotionSpec() {
        return this.f35280L.mo32364d();
    }

    public C24048h getShrinkMotionSpec() {
        return this.f35278J.mo32364d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35286R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f35286R = false;
            this.f35278J.mo32319b();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.f35288T = z11;
    }

    public void setExtendMotionSpec(C24048h c24048h) {
        this.f35279K.mo32365e(c24048h);
    }

    public void setExtendMotionSpecResource(int i11) {
        setExtendMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        InterfaceC6325f interfaceC6325f;
        if (this.f35286R == z11) {
            return;
        }
        if (z11) {
            interfaceC6325f = this.f35279K;
        } else {
            interfaceC6325f = this.f35278J;
        }
        if (interfaceC6325f.mo32320f()) {
            return;
        }
        interfaceC6325f.mo32319b();
    }

    public void setHideMotionSpec(C24048h c24048h) {
        this.f35281M.mo32365e(c24048h);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (this.f35286R && !this.f35287S) {
            this.f35283O = AbstractC1579n0.m7820K(this);
            this.f35284P = AbstractC1579n0.m7818J(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
        if (this.f35286R && !this.f35287S) {
            this.f35283O = i11;
            this.f35284P = i13;
        }
    }

    public void setShowMotionSpec(C24048h c24048h) {
        this.f35280L.mo32365e(c24048h);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    public void setShrinkMotionSpec(C24048h c24048h) {
        this.f35278J.mo32365e(c24048h);
    }

    public void setShrinkMotionSpecResource(int i11) {
        setShrinkMotionSpec(C24048h.m125925d(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        m32286E();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r9), attributeSet, i11);
        int i12 = f35271V;
        this.f35276H = 0;
        C6320a c6320a = new C6320a();
        this.f35277I = c6320a;
        C6314k c6314k = new C6314k(c6320a);
        this.f35280L = c6314k;
        C6312i c6312i = new C6312i(c6320a);
        this.f35281M = c6312i;
        this.f35286R = true;
        this.f35287S = false;
        this.f35288T = false;
        Context context2 = getContext();
        this.f35285Q = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.ExtendedFloatingActionButton, i11, i12, new int[0]);
        C24048h m125924c = C24048h.m125924c(context2, m32639h, AbstractC23587l.ExtendedFloatingActionButton_showMotionSpec);
        C24048h m125924c2 = C24048h.m125924c(context2, m32639h, AbstractC23587l.ExtendedFloatingActionButton_hideMotionSpec);
        C24048h m125924c3 = C24048h.m125924c(context2, m32639h, AbstractC23587l.ExtendedFloatingActionButton_extendMotionSpec);
        C24048h m125924c4 = C24048h.m125924c(context2, m32639h, AbstractC23587l.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.f35282N = m32639h.getDimensionPixelSize(AbstractC23587l.ExtendedFloatingActionButton_collapsedSize, -1);
        this.f35283O = AbstractC1579n0.m7820K(this);
        this.f35284P = AbstractC1579n0.m7818J(this);
        C6320a c6320a2 = new C6320a();
        C6311h c6311h = new C6311h(c6320a2, new C6304a(), true);
        this.f35279K = c6311h;
        C6311h c6311h2 = new C6311h(c6320a2, new C6305b(), false);
        this.f35278J = c6311h2;
        c6314k.mo32365e(m125924c);
        c6312i.mo32365e(m125924c2);
        c6311h.mo32365e(m125924c3);
        c6311h2.mo32365e(m125924c4);
        m32639h.recycle();
        setShapeAppearanceModel(C31694m.m152477g(context2, attributeSet, i11, i12, C31694m.f145586m).m152519m());
        m32286E();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m32286E();
    }
}
