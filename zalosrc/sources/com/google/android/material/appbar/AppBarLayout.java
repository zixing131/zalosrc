package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.util.AbstractC1482d;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1531b0;
import androidx.core.view.InterfaceC1551g0;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.InterfaceC1513j0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6355v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p013a7.AbstractC0638a;
import p193h0.AbstractC19694b;
import p252j1.AbstractC20900a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23582g;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.AbstractC24041a;
import p706z6.AbstractC31690i;
import p706z6.C31689h;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.InterfaceC1303b {

    /* renamed from: G */
    private static final int f34729G = AbstractC23586k.Widget_Design_AppBarLayout;

    /* renamed from: A */
    private boolean f34730A;

    /* renamed from: B */
    private int f34731B;

    /* renamed from: C */
    private WeakReference f34732C;

    /* renamed from: D */
    private ValueAnimator f34733D;

    /* renamed from: E */
    private int[] f34734E;

    /* renamed from: F */
    private Drawable f34735F;

    /* renamed from: p */
    private int f34736p;

    /* renamed from: q */
    private int f34737q;

    /* renamed from: r */
    private int f34738r;

    /* renamed from: s */
    private int f34739s;

    /* renamed from: t */
    private boolean f34740t;

    /* renamed from: u */
    private int f34741u;

    /* renamed from: v */
    private C1580n1 f34742v;

    /* renamed from: w */
    private List f34743w;

    /* renamed from: x */
    private boolean f34744x;

    /* renamed from: y */
    private boolean f34745y;

    /* renamed from: z */
    private boolean f34746z;

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: k */
        private int f34747k;

        /* renamed from: l */
        private int f34748l;

        /* renamed from: m */
        private ValueAnimator f34749m;

        /* renamed from: n */
        private int f34750n;

        /* renamed from: o */
        private boolean f34751o;

        /* renamed from: p */
        private float f34752p;

        /* renamed from: q */
        private WeakReference f34753q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        /* loaded from: classes3.dex */
        public class C6216a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: p */
            final /* synthetic */ CoordinatorLayout f34757p;

            /* renamed from: q */
            final /* synthetic */ AppBarLayout f34758q;

            C6216a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f34757p = coordinatorLayout;
                this.f34758q = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.m31629P(this.f34757p, this.f34758q, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        /* loaded from: classes3.dex */
        public class C6217b implements InterfaceC1513j0 {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f34760a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f34761b;

            /* renamed from: c */
            final /* synthetic */ View f34762c;

            /* renamed from: d */
            final /* synthetic */ int f34763d;

            C6217b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
                this.f34760a = coordinatorLayout;
                this.f34761b = appBarLayout;
                this.f34762c = view;
                this.f34763d = i11;
            }

            @Override // androidx.core.view.accessibility.InterfaceC1513j0
            /* renamed from: a */
            public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
                BaseBehavior.this.mo6559q(this.f34760a, this.f34761b, this.f34762c, 0, this.f34763d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        /* loaded from: classes3.dex */
        public class C6218c implements InterfaceC1513j0 {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f34765a;

            /* renamed from: b */
            final /* synthetic */ boolean f34766b;

            C6218c(AppBarLayout appBarLayout, boolean z11) {
                this.f34765a = appBarLayout;
                this.f34766b = z11;
            }

            @Override // androidx.core.view.accessibility.InterfaceC1513j0
            /* renamed from: a */
            public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
                this.f34765a.setExpanded(this.f34766b);
                return true;
            }
        }

        public BaseBehavior() {
            this.f34750n = -1;
        }

        /* renamed from: S */
        private void m31553S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (mo31570M() != (-appBarLayout.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m31554T(coordinatorLayout, appBarLayout, C1507g0.a.f6455q, false);
            }
            if (mo31570M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i11 = -appBarLayout.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        AbstractC1579n0.m7908w0(coordinatorLayout, C1507g0.a.f6456r, null, new C6217b(coordinatorLayout, appBarLayout, view, i11));
                        return;
                    }
                    return;
                }
                m31554T(coordinatorLayout, appBarLayout, C1507g0.a.f6456r, true);
            }
        }

        /* renamed from: T */
        private void m31554T(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, C1507g0.a aVar, boolean z11) {
            AbstractC1579n0.m7908w0(coordinatorLayout, aVar, null, new C6218c(appBarLayout, z11));
        }

        /* renamed from: U */
        private void m31555U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, float f11) {
            int height;
            int abs = Math.abs(mo31570M() - i11);
            float abs2 = Math.abs(f11);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            m31556V(coordinatorLayout, appBarLayout, i11, height);
        }

        /* renamed from: V */
        private void m31556V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12) {
            int mo31570M = mo31570M();
            if (mo31570M == i11) {
                ValueAnimator valueAnimator = this.f34749m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f34749m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f34749m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f34749m = valueAnimator3;
                valueAnimator3.setInterpolator(AbstractC24041a.f116362e);
                this.f34749m.addUpdateListener(new C6216a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f34749m.setDuration(Math.min(i12, 600));
            this.f34749m.setIntValues(mo31570M, i11);
            this.f34749m.start();
        }

        /* renamed from: X */
        private boolean m31557X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            if (appBarLayout.m31542j() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: Y */
        private static boolean m31558Y(int i11, int i12) {
            return (i11 & i12) == i12;
        }

        /* renamed from: Z */
        private View m31559Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof InterfaceC1531b0) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        private static View m31560a0(AppBarLayout appBarLayout, int i11) {
            int abs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: b0 */
        private int m31561b0(AppBarLayout appBarLayout, int i11) {
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m31558Y(layoutParams.m31591a(), 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i13 = -i11;
                if (top <= i13 && bottom >= i13) {
                    return i12;
                }
            }
            return -1;
        }

        /* renamed from: e0 */
        private int m31562e0(AppBarLayout appBarLayout, int i11) {
            int abs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i13);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator m31592b = layoutParams.m31592b();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (m31592b != null) {
                        int m31591a = layoutParams.m31591a();
                        if ((m31591a & 1) != 0) {
                            i12 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            if ((m31591a & 2) != 0) {
                                i12 -= AbstractC1579n0.m7814H(childAt);
                            }
                        }
                        if (AbstractC1579n0.m7806D(childAt)) {
                            i12 -= appBarLayout.getTopInset();
                        }
                        if (i12 > 0) {
                            float f11 = i12;
                            return Integer.signum(i11) * (childAt.getTop() + Math.round(f11 * m31592b.getInterpolation((abs - childAt.getTop()) / f11)));
                        }
                    }
                } else {
                    i13++;
                }
            }
            return i11;
        }

        /* renamed from: p0 */
        private boolean m31563p0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List m6537y = coordinatorLayout.m6537y(appBarLayout);
            int size = m6537y.size();
            for (int i11 = 0; i11 < size; i11++) {
                CoordinatorLayout.Behavior m6580f = ((CoordinatorLayout.C1306e) ((View) m6537y.get(i11)).getLayoutParams()).m6580f();
                if (m6580f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) m6580f).m31633K() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q0 */
        private void m31564q0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int mo31570M = mo31570M();
            int m31561b0 = m31561b0(appBarLayout, mo31570M);
            if (m31561b0 >= 0) {
                View childAt = appBarLayout.getChildAt(m31561b0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int m31591a = layoutParams.m31591a();
                if ((m31591a & 17) == 17) {
                    int i11 = -childAt.getTop();
                    int i12 = -childAt.getBottom();
                    if (m31561b0 == appBarLayout.getChildCount() - 1) {
                        i12 += appBarLayout.getTopInset();
                    }
                    if (m31558Y(m31591a, 2)) {
                        i12 += AbstractC1579n0.m7814H(childAt);
                    } else if (m31558Y(m31591a, 5)) {
                        int m7814H = AbstractC1579n0.m7814H(childAt) + i12;
                        if (mo31570M < m7814H) {
                            i11 = m7814H;
                        } else {
                            i12 = m7814H;
                        }
                    }
                    if (m31558Y(m31591a, 32)) {
                        i11 += ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        i12 -= ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    }
                    if (mo31570M < (i12 + i11) / 2) {
                        i11 = i12;
                    }
                    m31555U(coordinatorLayout, appBarLayout, AbstractC20900a.m109345b(i11, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: r0 */
        private void m31565r0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            AbstractC1579n0.m7904u0(coordinatorLayout, C1507g0.a.f6455q.m7657b());
            AbstractC1579n0.m7904u0(coordinatorLayout, C1507g0.a.f6456r.m7657b());
            View m31559Z = m31559Z(coordinatorLayout);
            if (m31559Z == null || appBarLayout.getTotalScrollRange() == 0 || !(((CoordinatorLayout.C1306e) m31559Z.getLayoutParams()).m6580f() instanceof ScrollingViewBehavior)) {
                return;
            }
            m31553S(coordinatorLayout, appBarLayout, m31559Z);
        }

        /* renamed from: s0 */
        private void m31566s0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12, boolean z11) {
            View m31560a0 = m31560a0(appBarLayout, i11);
            if (m31560a0 != null) {
                int m31591a = ((LayoutParams) m31560a0.getLayoutParams()).m31591a();
                boolean z12 = false;
                if ((m31591a & 1) != 0) {
                    int m7814H = AbstractC1579n0.m7814H(m31560a0);
                    if (i12 <= 0 || (m31591a & 12) == 0 ? !((m31591a & 2) == 0 || (-i11) < (m31560a0.getBottom() - m7814H) - appBarLayout.getTopInset()) : (-i11) >= (m31560a0.getBottom() - m7814H) - appBarLayout.getTopInset()) {
                        z12 = true;
                    }
                }
                if (appBarLayout.m31543l()) {
                    z12 = appBarLayout.m31551y(m31559Z(coordinatorLayout));
                }
                boolean m31550w = appBarLayout.m31550w(z12);
                if (z11 || (m31550w && m31563p0(coordinatorLayout, appBarLayout))) {
                    appBarLayout.jumpDrawablesToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: M */
        int mo31570M() {
            return mo31589E() + this.f34747k;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: W */
        public boolean mo31567H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f34753q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: c0 */
        public int mo31568K(AppBarLayout appBarLayout) {
            return -appBarLayout.getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: d0 */
        public int mo31569L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: f0 */
        public void mo31571N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            m31564q0(coordinatorLayout, appBarLayout);
            if (appBarLayout.m31543l()) {
                appBarLayout.m31550w(appBarLayout.m31551y(m31559Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: g0 */
        public boolean mo6554l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11) {
            boolean z11;
            int round;
            boolean mo6554l = super.mo6554l(coordinatorLayout, appBarLayout, i11);
            int pendingAction = appBarLayout.getPendingAction();
            int i12 = this.f34750n;
            if (i12 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i12);
                int i13 = -childAt.getBottom();
                if (this.f34751o) {
                    round = AbstractC1579n0.m7814H(childAt) + appBarLayout.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f34752p);
                }
                m31629P(coordinatorLayout, appBarLayout, i13 + round);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i14 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z11) {
                        m31555U(coordinatorLayout, appBarLayout, i14, 0.0f);
                    } else {
                        m31629P(coordinatorLayout, appBarLayout, i14);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z11) {
                        m31555U(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        m31629P(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.m31548r();
            this.f34750n = -1;
            mo31590G(AbstractC20900a.m109345b(mo31589E(), -appBarLayout.getTotalScrollRange(), 0));
            m31566s0(coordinatorLayout, appBarLayout, mo31589E(), 0, true);
            appBarLayout.m31544m(mo31589E());
            m31565r0(coordinatorLayout, appBarLayout);
            return mo6554l;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h0 */
        public boolean mo6555m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12, int i13, int i14) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C1306e) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.m6525P(appBarLayout, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
                return true;
            }
            return super.mo6555m(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: i0 */
        public void mo6559q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
            int i14;
            int i15;
            if (i12 != 0) {
                if (i12 < 0) {
                    int i16 = -appBarLayout.getTotalScrollRange();
                    i14 = i16;
                    i15 = appBarLayout.getDownNestedPreScrollRange() + i16;
                } else {
                    i14 = -appBarLayout.getUpNestedPreScrollRange();
                    i15 = 0;
                }
                if (i14 != i15) {
                    iArr[1] = m31628O(coordinatorLayout, appBarLayout, i12, i14, i15);
                }
            }
            if (appBarLayout.m31543l()) {
                appBarLayout.m31550w(appBarLayout.m31551y(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: j0 */
        public void mo6562t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            if (i14 < 0) {
                iArr[1] = m31628O(coordinatorLayout, appBarLayout, i14, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i14 == 0) {
                m31565r0(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: k0 */
        public void mo6566x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo6566x(coordinatorLayout, appBarLayout, savedState.m8457a());
                this.f34750n = savedState.f34754r;
                this.f34752p = savedState.f34755s;
                this.f34751o = savedState.f34756t;
                return;
            }
            super.mo6566x(coordinatorLayout, appBarLayout, parcelable);
            this.f34750n = -1;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l0 */
        public Parcelable mo6567y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable mo6567y = super.mo6567y(coordinatorLayout, appBarLayout);
            int mo31589E = mo31589E();
            int childCount = appBarLayout.getChildCount();
            boolean z11 = false;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int bottom = childAt.getBottom() + mo31589E;
                if (childAt.getTop() + mo31589E <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(mo6567y);
                    savedState.f34754r = i11;
                    if (bottom == AbstractC1579n0.m7814H(childAt) + appBarLayout.getTopInset()) {
                        z11 = true;
                    }
                    savedState.f34756t = z11;
                    savedState.f34755s = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return mo6567y;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m0 */
        public boolean mo6539A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i11, int i12) {
            boolean z11;
            ValueAnimator valueAnimator;
            if ((i11 & 2) != 0 && (appBarLayout.m31543l() || m31557X(coordinatorLayout, appBarLayout, view))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.f34749m) != null) {
                valueAnimator.cancel();
            }
            this.f34753q = null;
            this.f34748l = i12;
            return z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: n0 */
        public void mo6541C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
            if (this.f34748l == 0 || i11 == 1) {
                m31564q0(coordinatorLayout, appBarLayout);
                if (appBarLayout.m31543l()) {
                    appBarLayout.m31550w(appBarLayout.m31551y(view));
                }
            }
            this.f34753q = new WeakReference(view);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* renamed from: o0 */
        public int mo31572Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12, int i13) {
            int i14;
            int i15;
            int mo31570M = mo31570M();
            int i16 = 0;
            if (i12 != 0 && mo31570M >= i12 && mo31570M <= i13) {
                int m109345b = AbstractC20900a.m109345b(i11, i12, i13);
                if (mo31570M != m109345b) {
                    if (appBarLayout.m31541h()) {
                        i14 = m31562e0(appBarLayout, m109345b);
                    } else {
                        i14 = m109345b;
                    }
                    boolean mo31590G = mo31590G(i14);
                    i16 = mo31570M - m109345b;
                    this.f34747k = m109345b - i14;
                    if (!mo31590G && appBarLayout.m31541h()) {
                        coordinatorLayout.m6530m(appBarLayout);
                    }
                    appBarLayout.m31544m(mo31589E());
                    if (m109345b < mo31570M) {
                        i15 = -1;
                    } else {
                        i15 = 1;
                    }
                    m31566s0(coordinatorLayout, appBarLayout, m109345b, i15, false);
                }
            } else {
                this.f34747k = 0;
            }
            m31565r0(coordinatorLayout, appBarLayout);
            return i16;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34750n = -1;
        }

        /* loaded from: classes3.dex */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C6215a();

            /* renamed from: r */
            int f34754r;

            /* renamed from: s */
            float f34755s;

            /* renamed from: t */
            boolean f34756t;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            /* loaded from: classes3.dex */
            static class C6215a implements Parcelable.ClassLoaderCreator {
                C6215a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i11) {
                    return new SavedState[i11];
                }
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f34754r = parcel.readInt();
                this.f34755s = parcel.readFloat();
                this.f34756t = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeInt(this.f34754r);
                parcel.writeFloat(this.f34755s);
                parcel.writeByte(this.f34756t ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo31589E() {
            return super.mo31589E();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo31590G(int i11) {
            return super.mo31590G(i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ boolean mo6554l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11) {
            return super.mo6554l(coordinatorLayout, appBarLayout, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ boolean mo6555m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i11, int i12, int i13, int i14) {
            return super.mo6555m(coordinatorLayout, appBarLayout, i11, i12, i13, i14);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo6559q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int[] iArr, int i13) {
            super.mo6559q(coordinatorLayout, appBarLayout, view, i11, i12, iArr, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ void mo6562t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            super.mo6562t(coordinatorLayout, appBarLayout, view, i11, i12, i13, i14, i15, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ void mo6566x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo6566x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ Parcelable mo6567y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo6567y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: m0 */
        public /* bridge */ /* synthetic */ boolean mo6539A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i11, int i12) {
            return super.mo6539A(coordinatorLayout, appBarLayout, view, view2, i11, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* renamed from: n0 */
        public /* bridge */ /* synthetic */ void mo6541C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
            super.mo6541C(coordinatorLayout, appBarLayout, view, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m31594R(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior m6580f = ((CoordinatorLayout.C1306e) appBarLayout.getLayoutParams()).m6580f();
            if (m6580f instanceof BaseBehavior) {
                return ((BaseBehavior) m6580f).mo31570M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m31595S(View view, View view2) {
            CoordinatorLayout.Behavior m6580f = ((CoordinatorLayout.C1306e) view2.getLayoutParams()).m6580f();
            if (m6580f instanceof BaseBehavior) {
                AbstractC1579n0.m7886l0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) m6580f).f34747k) + m31634M()) - m31632I(view2));
            }
        }

        /* renamed from: T */
        private void m31596T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m31543l()) {
                    appBarLayout.m31550w(appBarLayout.m31551y(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: J */
        float mo31598J(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int m31594R = m31594R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + m31594R > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (m31594R / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: L */
        public int mo31599L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo31599L(view);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: Q */
        public AppBarLayout mo31597H(List list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: e */
        public boolean mo6547e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: h */
        public boolean mo6550h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m31595S(view, view2);
            m31596T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: i */
        public void mo6551i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AbstractC1579n0.m7904u0(coordinatorLayout, C1507g0.a.f6455q.m7657b());
                AbstractC1579n0.m7904u0(coordinatorLayout, C1507g0.a.f6456r.m7657b());
            }
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
            return super.mo6554l(coordinatorLayout, view, i11);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo6555m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int i14) {
            return super.mo6555m(coordinatorLayout, view, i11, i12, i13, i14);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: w */
        public boolean mo6565w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
            AppBarLayout mo31597H = mo31597H(coordinatorLayout.m6536x(view));
            if (mo31597H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f34818d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    mo31597H.m31549s(false, !z11);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.ScrollingViewBehavior_Layout);
            m31635O(obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    /* loaded from: classes3.dex */
    public class C6219a implements InterfaceC1551g0 {
        C6219a() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            return AppBarLayout.this.m31545n(c1580n1);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    /* loaded from: classes3.dex */
    public class C6220b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        final /* synthetic */ C31689h f34771p;

        C6220b(C31689h c31689h) {
            this.f34771p = c31689h;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34771p.m152441b0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6221c {
        /* renamed from: a */
        void mo31601a(AppBarLayout appBarLayout, int i11);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6222d extends InterfaceC6221c {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.appBarLayoutStyle);
    }

    /* renamed from: A */
    private void m31526A(C31689h c31689h, boolean z11) {
        float f11;
        float dimension = getResources().getDimension(AbstractC23579d.design_appbar_elevation);
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = dimension;
        }
        if (!z11) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f34733D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, dimension);
        this.f34733D = ofFloat;
        ofFloat.setDuration(getResources().getInteger(AbstractC23582g.app_bar_elevation_anim_duration));
        this.f34733D.setInterpolator(AbstractC24041a.f116358a);
        this.f34733D.addUpdateListener(new C6220b(c31689h));
        this.f34733D.start();
    }

    /* renamed from: B */
    private void m31527B() {
        setWillNotDraw(!m31534x());
    }

    /* renamed from: c */
    private void m31528c() {
        WeakReference weakReference = this.f34732C;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34732C = null;
    }

    /* renamed from: d */
    private View m31529d(View view) {
        int i11;
        View view2;
        if (this.f34732C == null && (i11 = this.f34731B) != -1) {
            if (view != null) {
                view2 = view.findViewById(i11);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f34731B);
            }
            if (view2 != null) {
                this.f34732C = new WeakReference(view2);
            }
        }
        WeakReference weakReference = this.f34732C;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* renamed from: i */
    private boolean m31530i() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((LayoutParams) getChildAt(i11).getLayoutParams()).m31593c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m31531k() {
        this.f34737q = -1;
        this.f34738r = -1;
        this.f34739s = -1;
    }

    /* renamed from: u */
    private void m31532u(boolean z11, boolean z12, boolean z13) {
        int i11;
        int i12;
        if (z11) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        int i13 = 0;
        if (z12) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        int i14 = i11 | i12;
        if (z13) {
            i13 = 8;
        }
        this.f34741u = i14 | i13;
        requestLayout();
    }

    /* renamed from: v */
    private boolean m31533v(boolean z11) {
        if (this.f34745y != z11) {
            this.f34745y = z11;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private boolean m31534x() {
        if (this.f34735F != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private boolean m31535z() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || AbstractC1579n0.m7806D(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m31536a(InterfaceC6221c interfaceC6221c) {
        if (this.f34743w == null) {
            this.f34743w = new ArrayList();
        }
        if (interfaceC6221c != null && !this.f34743w.contains(interfaceC6221c)) {
            this.f34743w.add(interfaceC6221c);
        }
    }

    /* renamed from: b */
    public void m31537b(InterfaceC6222d interfaceC6222d) {
        m31536a(interfaceC6222d);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m31534x()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f34736p);
            this.f34735F.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f34735F;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1303b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int i11;
        int m7814H;
        int i12 = this.f34738r;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = layoutParams.f34768a;
            if ((i14 & 5) == 5) {
                int i15 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i14 & 8) != 0) {
                    m7814H = AbstractC1579n0.m7814H(childAt);
                } else if ((i14 & 2) != 0) {
                    m7814H = measuredHeight - AbstractC1579n0.m7814H(childAt);
                } else {
                    i11 = i15 + measuredHeight;
                    if (childCount == 0 && AbstractC1579n0.m7806D(childAt)) {
                        i11 = Math.min(i11, measuredHeight - getTopInset());
                    }
                    i13 += i11;
                }
                i11 = i15 + m7814H;
                if (childCount == 0) {
                    i11 = Math.min(i11, measuredHeight - getTopInset());
                }
                i13 += i11;
            } else if (i13 > 0) {
                break;
            }
        }
        int max = Math.max(0, i13);
        this.f34738r = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i11 = this.f34739s;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            int i14 = layoutParams.f34768a;
            if ((i14 & 1) == 0) {
                break;
            }
            i13 += measuredHeight;
            if ((i14 & 2) != 0) {
                i13 -= AbstractC1579n0.m7814H(childAt);
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f34739s = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f34731B;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int m7814H = AbstractC1579n0.m7814H(this);
        if (m7814H == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                m7814H = AbstractC1579n0.m7814H(getChildAt(childCount - 1));
            } else {
                m7814H = 0;
            }
            if (m7814H == 0) {
                return getHeight() / 3;
            }
        }
        return (m7814H * 2) + topInset;
    }

    int getPendingAction() {
        return this.f34741u;
    }

    public Drawable getStatusBarForeground() {
        return this.f34735F;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        C1580n1 c1580n1 = this.f34742v;
        if (c1580n1 != null) {
            return c1580n1.m8061m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f34737q;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = layoutParams.f34768a;
            if ((i14 & 1) == 0) {
                break;
            }
            i13 += measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            if (i12 == 0 && AbstractC1579n0.m7806D(childAt)) {
                i13 -= getTopInset();
            }
            if ((i14 & 2) != 0) {
                i13 -= AbstractC1579n0.m7814H(childAt);
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f34737q = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    boolean m31541h() {
        return this.f34740t;
    }

    /* renamed from: j */
    boolean m31542j() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m31543l() {
        return this.f34730A;
    }

    /* renamed from: m */
    void m31544m(int i11) {
        this.f34736p = i11;
        if (!willNotDraw()) {
            AbstractC1579n0.m7898r0(this);
        }
        List list = this.f34743w;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC6221c interfaceC6221c = (InterfaceC6221c) this.f34743w.get(i12);
                if (interfaceC6221c != null) {
                    interfaceC6221c.mo31601a(this, i11);
                }
            }
        }
    }

    /* renamed from: n */
    C1580n1 m31545n(C1580n1 c1580n1) {
        C1580n1 c1580n12;
        if (AbstractC1579n0.m7806D(this)) {
            c1580n12 = c1580n1;
        } else {
            c1580n12 = null;
        }
        if (!AbstractC1482d.m7475a(this.f34742v, c1580n12)) {
            this.f34742v = c1580n12;
            m31527B();
            requestLayout();
        }
        return c1580n1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152469e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int i12;
        int i13;
        if (this.f34734E == null) {
            this.f34734E = new int[4];
        }
        int[] iArr = this.f34734E;
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f34745y;
        int i14 = AbstractC23577b.state_liftable;
        if (!z11) {
            i14 = -i14;
        }
        iArr[0] = i14;
        if (z11 && this.f34746z) {
            i12 = AbstractC23577b.state_lifted;
        } else {
            i12 = -AbstractC23577b.state_lifted;
        }
        iArr[1] = i12;
        int i15 = AbstractC23577b.state_collapsible;
        if (!z11) {
            i15 = -i15;
        }
        iArr[2] = i15;
        if (z11 && this.f34746z) {
            i13 = AbstractC23577b.state_collapsed;
        } else {
            i13 = -AbstractC23577b.state_collapsed;
        }
        iArr[3] = i13;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m31528c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (AbstractC1579n0.m7806D(this) && m31535z()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                AbstractC1579n0.m7886l0(getChildAt(childCount), topInset);
            }
        }
        m31531k();
        this.f34740t = false;
        int childCount2 = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i15).getLayoutParams()).m31592b() != null) {
                this.f34740t = true;
                break;
            }
            i15++;
        }
        Drawable drawable = this.f34735F;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f34744x) {
            if (!this.f34730A && !m31530i()) {
                z12 = false;
            }
            m31533v(z12);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && AbstractC1579n0.m7806D(this) && m31535z()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = AbstractC20900a.m109345b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i12));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m31531k();
    }

    /* renamed from: p */
    public void m31546p(InterfaceC6221c interfaceC6221c) {
        List list = this.f34743w;
        if (list != null && interfaceC6221c != null) {
            list.remove(interfaceC6221c);
        }
    }

    /* renamed from: q */
    public void m31547q(InterfaceC6222d interfaceC6222d) {
        m31546p(interfaceC6222d);
    }

    /* renamed from: r */
    void m31548r() {
        this.f34741u = 0;
    }

    /* renamed from: s */
    public void m31549s(boolean z11, boolean z12) {
        m31532u(z11, z12, true);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        AbstractC31690i.m152468d(this, f11);
    }

    public void setExpanded(boolean z11) {
        m31549s(z11, AbstractC1579n0.m7865e0(this));
    }

    public void setLiftOnScroll(boolean z11) {
        this.f34730A = z11;
    }

    public void setLiftOnScrollTargetViewId(int i11) {
        this.f34731B = i11;
        m31528c();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 == 1) {
            super.setOrientation(i11);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z11;
        Drawable drawable2 = this.f34735F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f34735F = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f34735F.setState(getDrawableState());
                }
                AbstractC1414a.m7195m(this.f34735F, AbstractC1579n0.m7812G(this));
                Drawable drawable4 = this.f34735F;
                if (getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                drawable4.setVisible(z11, false);
                this.f34735F.setCallback(this);
            }
            m31527B();
            AbstractC1579n0.m7898r0(this);
        }
    }

    public void setStatusBarForegroundColor(int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(int i11) {
        setStatusBarForeground(AbstractC19694b.m103336d(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        AbstractC6233g.m31654b(this, f11);
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
        Drawable drawable = this.f34735F;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f34735F) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    boolean m31550w(boolean z11) {
        if (this.f34746z != z11) {
            this.f34746z = z11;
            refreshDrawableState();
            if (this.f34730A && (getBackground() instanceof C31689h)) {
                m31526A((C31689h) getBackground(), z11);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    boolean m31551y(View view) {
        View m31529d = m31529d(view);
        if (m31529d != null) {
            view = m31529d;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f34729G;
        this.f34737q = -1;
        this.f34738r = -1;
        this.f34739s = -1;
        this.f34741u = 0;
        Context context2 = getContext();
        setOrientation(1);
        int i13 = Build.VERSION.SDK_INT;
        AbstractC6233g.m31653a(this);
        AbstractC6233g.m31655c(this, attributeSet, i11, i12);
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.AppBarLayout, i11, i12, new int[0]);
        AbstractC1579n0.m7807D0(this, m32639h.getDrawable(AbstractC23587l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C31689h c31689h = new C31689h();
            c31689h.m152442c0(ColorStateList.valueOf(colorDrawable.getColor()));
            c31689h.m152435R(context2);
            AbstractC1579n0.m7807D0(this, c31689h);
        }
        if (m32639h.hasValue(AbstractC23587l.AppBarLayout_expanded)) {
            m31532u(m32639h.getBoolean(AbstractC23587l.AppBarLayout_expanded, false), false, false);
        }
        if (m32639h.hasValue(AbstractC23587l.AppBarLayout_elevation)) {
            AbstractC6233g.m31654b(this, m32639h.getDimensionPixelSize(AbstractC23587l.AppBarLayout_elevation, 0));
        }
        if (i13 >= 26) {
            if (m32639h.hasValue(AbstractC23587l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(m32639h.getBoolean(AbstractC23587l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (m32639h.hasValue(AbstractC23587l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(m32639h.getBoolean(AbstractC23587l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f34730A = m32639h.getBoolean(AbstractC23587l.AppBarLayout_liftOnScroll, false);
        this.f34731B = m32639h.getResourceId(AbstractC23587l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(m32639h.getDrawable(AbstractC23587l.AppBarLayout_statusBarForeground));
        m32639h.recycle();
        AbstractC1579n0.m7833Q0(this, new C6219a());
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f34768a;

        /* renamed from: b */
        Interpolator f34769b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34768a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.AppBarLayout_Layout);
            this.f34768a = obtainStyledAttributes.getInt(AbstractC23587l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(AbstractC23587l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f34769b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(AbstractC23587l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m31591a() {
            return this.f34768a;
        }

        /* renamed from: b */
        public Interpolator m31592b() {
            return this.f34769b;
        }

        /* renamed from: c */
        boolean m31593c() {
            int i11 = this.f34768a;
            return (i11 & 1) == 1 && (i11 & 10) != 0;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f34768a = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34768a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f34768a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f34768a = 1;
        }
    }
}
