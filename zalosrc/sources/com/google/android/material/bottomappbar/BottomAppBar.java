package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6359z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p382o6.InterfaceC24051k;
import p599w6.AbstractC28774c;
import p664y.AbstractC30228a;
import p706z6.AbstractC31690i;
import p706z6.C31689h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.InterfaceC1303b {

    /* renamed from: B0 */
    private static final int f34894B0 = AbstractC23586k.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: A0 */
    InterfaceC24051k f34895A0;

    /* renamed from: g0 */
    private final int f34896g0;

    /* renamed from: h0 */
    private final C31689h f34897h0;

    /* renamed from: i0 */
    private Animator f34898i0;

    /* renamed from: j0 */
    private Animator f34899j0;

    /* renamed from: k0 */
    private int f34900k0;

    /* renamed from: l0 */
    private int f34901l0;

    /* renamed from: m0 */
    private boolean f34902m0;

    /* renamed from: n0 */
    private final boolean f34903n0;

    /* renamed from: o0 */
    private final boolean f34904o0;

    /* renamed from: p0 */
    private final boolean f34905p0;

    /* renamed from: q0 */
    private int f34906q0;

    /* renamed from: r0 */
    private ArrayList f34907r0;

    /* renamed from: s0 */
    private int f34908s0;

    /* renamed from: t0 */
    private boolean f34909t0;

    /* renamed from: u0 */
    private boolean f34910u0;

    /* renamed from: v0 */
    private Behavior f34911v0;

    /* renamed from: w0 */
    private int f34912w0;

    /* renamed from: x0 */
    private int f34913x0;

    /* renamed from: y0 */
    private int f34914y0;

    /* renamed from: z0 */
    AnimatorListenerAdapter f34915z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6242a();

        /* renamed from: r */
        int f34921r;

        /* renamed from: s */
        boolean f34922s;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6242a implements Parcelable.ClassLoaderCreator {
            C6242a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f34921r);
            parcel.writeInt(this.f34922s ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34921r = parcel.readInt();
            this.f34922s = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    /* loaded from: classes3.dex */
    class C6243a extends AnimatorListenerAdapter {
        C6243a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f34909t0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m31745J0(bottomAppBar.f34900k0, BottomAppBar.this.f34910u0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    /* loaded from: classes3.dex */
    class C6244b implements InterfaceC24051k {
        C6244b() {
        }

        @Override // p382o6.InterfaceC24051k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo31799a(FloatingActionButton floatingActionButton) {
            float f11;
            C31689h c31689h = BottomAppBar.this.f34897h0;
            if (floatingActionButton.getVisibility() == 0) {
                f11 = floatingActionButton.getScaleY();
            } else {
                f11 = 0.0f;
            }
            c31689h.m152443d0(f11);
        }

        @Override // p382o6.InterfaceC24051k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo31800b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().m31812i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().m31818o(translationX);
                BottomAppBar.this.f34897h0.invalidateSelf();
            }
            float f11 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().m31807c() != max) {
                BottomAppBar.this.getTopEdgeTreatment().m31813j(max);
                BottomAppBar.this.f34897h0.invalidateSelf();
            }
            C31689h c31689h = BottomAppBar.this.f34897h0;
            if (floatingActionButton.getVisibility() == 0) {
                f11 = floatingActionButton.getScaleY();
            }
            c31689h.m152443d0(f11);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    /* loaded from: classes3.dex */
    class C6245c implements AbstractC6359z.d {
        C6245c() {
        }

        @Override // com.google.android.material.internal.AbstractC6359z.d
        /* renamed from: a */
        public C1580n1 mo31803a(View view, C1580n1 c1580n1, AbstractC6359z.e eVar) {
            boolean z11;
            if (BottomAppBar.this.f34903n0) {
                BottomAppBar.this.f34912w0 = c1580n1.m8058j();
            }
            boolean z12 = true;
            boolean z13 = false;
            if (BottomAppBar.this.f34904o0) {
                if (BottomAppBar.this.f34914y0 != c1580n1.m8059k()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                BottomAppBar.this.f34914y0 = c1580n1.m8059k();
            } else {
                z11 = false;
            }
            if (BottomAppBar.this.f34905p0) {
                if (BottomAppBar.this.f34913x0 == c1580n1.m8060l()) {
                    z12 = false;
                }
                BottomAppBar.this.f34913x0 = c1580n1.m8060l();
                z13 = z12;
            }
            if (z11 || z13) {
                BottomAppBar.this.m31785y0();
                BottomAppBar.this.m31748N0();
                BottomAppBar.this.m31747M0();
            }
            return c1580n1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    /* loaded from: classes3.dex */
    public class C6246d extends AnimatorListenerAdapter {
        C6246d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m31739C0();
            BottomAppBar.this.f34898i0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m31740D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    /* loaded from: classes3.dex */
    public class C6247e extends FloatingActionButton.AbstractC6317b {

        /* renamed from: a */
        final /* synthetic */ int f34927a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        /* loaded from: classes3.dex */
        class a extends FloatingActionButton.AbstractC6317b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC6317b
            /* renamed from: b */
            public void mo31805b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m31739C0();
            }
        }

        C6247e(int i11) {
            this.f34927a = i11;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC6317b
        /* renamed from: a */
        public void mo31804a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m31743H0(this.f34927a));
            floatingActionButton.m32343u(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    /* loaded from: classes3.dex */
    public class C6248f extends AnimatorListenerAdapter {
        C6248f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m31739C0();
            BottomAppBar.this.f34909t0 = false;
            BottomAppBar.this.f34899j0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m31740D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    /* loaded from: classes3.dex */
    public class C6249g extends AnimatorListenerAdapter {

        /* renamed from: p */
        public boolean f34931p;

        /* renamed from: q */
        final /* synthetic */ ActionMenuView f34932q;

        /* renamed from: r */
        final /* synthetic */ int f34933r;

        /* renamed from: s */
        final /* synthetic */ boolean f34934s;

        C6249g(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f34932q = actionMenuView;
            this.f34933r = i11;
            this.f34934s = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f34931p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z11;
            if (!this.f34931p) {
                if (BottomAppBar.this.f34908s0 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m31787L0(bottomAppBar.f34908s0);
                BottomAppBar.this.m31752R0(this.f34932q, this.f34933r, this.f34934s, z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    /* loaded from: classes3.dex */
    public class RunnableC6250h implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ActionMenuView f34936p;

        /* renamed from: q */
        final /* synthetic */ int f34937q;

        /* renamed from: r */
        final /* synthetic */ boolean f34938r;

        RunnableC6250h(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f34936p = actionMenuView;
            this.f34937q = i11;
            this.f34938r = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34936p.setTranslationX(BottomAppBar.this.m31786G0(r0, this.f34937q, this.f34938r));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    /* loaded from: classes3.dex */
    public class C6251i extends AnimatorListenerAdapter {
        C6251i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f34915z0.onAnimationStart(animator);
            FloatingActionButton m31741E0 = BottomAppBar.this.m31741E0();
            if (m31741E0 != null) {
                m31741E0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.bottomAppBarStyle);
    }

    /* renamed from: A0 */
    private void m31737A0(int i11, List list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m31741E0(), "translationX", m31743H0(i11));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    /* renamed from: B0 */
    private void m31738B0(int i11, boolean z11, List list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - m31786G0(actionMenuView, i11, z11)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            ofFloat2.addListener(new C6249g(actionMenuView, i11, z11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
            return;
        }
        if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public void m31739C0() {
        ArrayList arrayList;
        int i11 = this.f34906q0 - 1;
        this.f34906q0 = i11;
        if (i11 == 0 && (arrayList = this.f34907r0) != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m31740D0() {
        ArrayList arrayList;
        int i11 = this.f34906q0;
        this.f34906q0 = i11 + 1;
        if (i11 == 0 && (arrayList = this.f34907r0) != null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC30228a.m149044a(it.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public FloatingActionButton m31741E0() {
        View m31742F0 = m31742F0();
        if (m31742F0 instanceof FloatingActionButton) {
            return (FloatingActionButton) m31742F0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public View m31742F0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).m6537y(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public float m31743H0(int i11) {
        int i12;
        boolean m32653h = AbstractC6359z.m32653h(this);
        int i13 = 1;
        if (i11 == 1) {
            if (m32653h) {
                i12 = this.f34914y0;
            } else {
                i12 = this.f34913x0;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (this.f34896g0 + i12);
            if (m32653h) {
                i13 = -1;
            }
            return measuredWidth * i13;
        }
        return 0.0f;
    }

    /* renamed from: I0 */
    private boolean m31744I0() {
        FloatingActionButton m31741E0 = m31741E0();
        if (m31741E0 != null && m31741E0.m32342p()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public void m31745J0(int i11, boolean z11) {
        if (!AbstractC1579n0.m7865e0(this)) {
            this.f34909t0 = false;
            m31787L0(this.f34908s0);
            return;
        }
        Animator animator = this.f34899j0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m31744I0()) {
            i11 = 0;
            z11 = false;
        }
        m31738B0(i11, z11, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f34899j0 = animatorSet;
        animatorSet.addListener(new C6248f());
        this.f34899j0.start();
    }

    /* renamed from: K0 */
    private void m31746K0(int i11) {
        if (this.f34900k0 != i11 && AbstractC1579n0.m7865e0(this)) {
            Animator animator = this.f34898i0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f34901l0 == 1) {
                m31737A0(i11, arrayList);
            } else {
                m31790z0(i11, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f34898i0 = animatorSet;
            animatorSet.addListener(new C6246d());
            this.f34898i0.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public void m31747M0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f34899j0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m31744I0()) {
                m31750Q0(actionMenuView, 0, false);
            } else {
                m31750Q0(actionMenuView, this.f34900k0, this.f34910u0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public void m31748N0() {
        float f11;
        getTopEdgeTreatment().m31818o(getFabTranslationX());
        View m31742F0 = m31742F0();
        C31689h c31689h = this.f34897h0;
        if (this.f34910u0 && m31744I0()) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        c31689h.m152443d0(f11);
        if (m31742F0 != null) {
            m31742F0.setTranslationY(getFabTranslationY());
            m31742F0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: Q0 */
    private void m31750Q0(ActionMenuView actionMenuView, int i11, boolean z11) {
        m31752R0(actionMenuView, i11, z11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public void m31752R0(ActionMenuView actionMenuView, int i11, boolean z11, boolean z12) {
        RunnableC6250h runnableC6250h = new RunnableC6250h(actionMenuView, i11, z11);
        if (z12) {
            actionMenuView.post(runnableC6250h);
        } else {
            runnableC6250h.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f34912w0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return m31743H0(this.f34900k0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m31807c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f34914y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f34913x0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6252a getTopEdgeTreatment() {
        return (C6252a) this.f34897h0.m152427F().m152486p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public void m31784x0(FloatingActionButton floatingActionButton) {
        floatingActionButton.m32334e(this.f34915z0);
        floatingActionButton.m32335f(new C6251i());
        floatingActionButton.m32336g(this.f34895A0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public void m31785y0() {
        Animator animator = this.f34899j0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f34898i0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: G0 */
    protected int m31786G0(ActionMenuView actionMenuView, int i11, boolean z11) {
        int i12;
        int left;
        int i13;
        if (i11 != 1 || !z11) {
            return 0;
        }
        boolean m32653h = AbstractC6359z.m32653h(this);
        if (m32653h) {
            i12 = getMeasuredWidth();
        } else {
            i12 = 0;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f3623a & 8388615) == 8388611) {
                if (m32653h) {
                    i12 = Math.min(i12, childAt.getLeft());
                } else {
                    i12 = Math.max(i12, childAt.getRight());
                }
            }
        }
        if (m32653h) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (m32653h) {
            i13 = this.f34913x0;
        } else {
            i13 = -this.f34914y0;
        }
        return i12 - (left + i13);
    }

    /* renamed from: L0 */
    public void m31787L0(int i11) {
        if (i11 != 0) {
            this.f34908s0 = 0;
            getMenu().clear();
            m5440z(i11);
        }
    }

    /* renamed from: O0 */
    public void m31788O0(int i11, int i12) {
        this.f34908s0 = i12;
        this.f34909t0 = true;
        m31745J0(i11, this.f34910u0);
        m31746K0(i11);
        this.f34900k0 = i11;
    }

    /* renamed from: P0 */
    boolean m31789P0(int i11) {
        float f11 = i11;
        if (f11 != getTopEdgeTreatment().m31811h()) {
            getTopEdgeTreatment().m31817n(f11);
            this.f34897h0.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.f34897h0.m152430J();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m31807c();
    }

    public int getFabAlignmentMode() {
        return this.f34900k0;
    }

    public int getFabAnimationMode() {
        return this.f34901l0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m31809f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().m31810g();
    }

    public boolean getHideOnScroll() {
        return this.f34902m0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152470f(this, this.f34897h0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            m31785y0();
            m31748N0();
        }
        m31747M0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        this.f34900k0 = savedState.f34921r;
        this.f34910u0 = savedState.f34922s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34921r = this.f34900k0;
        savedState.f34922s = this.f34910u0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        AbstractC1414a.m7197o(this.f34897h0, colorStateList);
    }

    public void setCradleVerticalOffset(float f11) {
        if (f11 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().m31813j(f11);
            this.f34897h0.invalidateSelf();
            m31748N0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        this.f34897h0.m152441b0(f11);
        getBehavior().m31724G(this, this.f34897h0.m152426E() - this.f34897h0.m152425D());
    }

    public void setFabAlignmentMode(int i11) {
        m31788O0(i11, 0);
    }

    public void setFabAnimationMode(int i11) {
        this.f34901l0 = i11;
    }

    void setFabCornerSize(float f11) {
        if (f11 != getTopEdgeTreatment().m31808e()) {
            getTopEdgeTreatment().m31814k(f11);
            this.f34897h0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f11) {
        if (f11 != getFabCradleMargin()) {
            getTopEdgeTreatment().m31815l(f11);
            this.f34897h0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f11) {
        if (f11 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m31816m(f11);
            this.f34897h0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.f34902m0 = z11;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: z0 */
    protected void m31790z0(int i11, List list) {
        FloatingActionButton m31741E0 = m31741E0();
        if (m31741E0 != null && !m31741E0.m32341n()) {
            m31740D0();
            m31741E0.m32339l(new C6247e(i11));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r6), attributeSet, i11);
        int i12 = f34894B0;
        C31689h c31689h = new C31689h();
        this.f34897h0 = c31689h;
        this.f34906q0 = 0;
        this.f34908s0 = 0;
        this.f34909t0 = false;
        this.f34910u0 = true;
        this.f34915z0 = new C6243a();
        this.f34895A0 = new C6244b();
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.BottomAppBar, i11, i12, new int[0]);
        ColorStateList m143973a = AbstractC28774c.m143973a(context2, m32639h, AbstractC23587l.BottomAppBar_backgroundTint);
        int dimensionPixelSize = m32639h.getDimensionPixelSize(AbstractC23587l.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = m32639h.getDimensionPixelOffset(AbstractC23587l.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = m32639h.getDimensionPixelOffset(AbstractC23587l.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = m32639h.getDimensionPixelOffset(AbstractC23587l.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f34900k0 = m32639h.getInt(AbstractC23587l.BottomAppBar_fabAlignmentMode, 0);
        this.f34901l0 = m32639h.getInt(AbstractC23587l.BottomAppBar_fabAnimationMode, 0);
        this.f34902m0 = m32639h.getBoolean(AbstractC23587l.BottomAppBar_hideOnScroll, false);
        this.f34903n0 = m32639h.getBoolean(AbstractC23587l.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f34904o0 = m32639h.getBoolean(AbstractC23587l.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f34905p0 = m32639h.getBoolean(AbstractC23587l.BottomAppBar_paddingRightSystemWindowInsets, false);
        m32639h.recycle();
        this.f34896g0 = getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_bottomappbar_fabOffsetEndMode);
        c31689h.setShapeAppearanceModel(C31694m.m152471a().m152510B(new C6252a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m152519m());
        c31689h.m152450j0(2);
        c31689h.m152445f0(Paint.Style.FILL);
        c31689h.m152435R(context2);
        setElevation(dimensionPixelSize);
        AbstractC1414a.m7197o(c31689h, m143973a);
        AbstractC1579n0.m7807D0(this, c31689h);
        AbstractC6359z.m32646a(this, attributeSet, i11, i12, new C6245c());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1303b
    public Behavior getBehavior() {
        if (this.f34911v0 == null) {
            this.f34911v0 = new Behavior();
        }
        return this.f34911v0;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        private final Rect f34916e;

        /* renamed from: f */
        private WeakReference f34917f;

        /* renamed from: g */
        private int f34918g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f34919h;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        /* loaded from: classes3.dex */
        class ViewOnLayoutChangeListenerC6241a implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC6241a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f34917f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.m32338j(Behavior.this.f34916e);
                    int height = Behavior.this.f34916e.height();
                    bottomAppBar.m31789P0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().m152488r().mo152392a(new RectF(Behavior.this.f34916e)));
                    CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) view.getLayoutParams();
                    if (Behavior.this.f34918g == 0) {
                        ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(AbstractC23579d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) c1306e).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) c1306e).rightMargin = bottomAppBar.getRightInset();
                        if (AbstractC6359z.m32653h(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) c1306e).leftMargin += bottomAppBar.f34896g0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c1306e).rightMargin += bottomAppBar.f34896g0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f34919h = new ViewOnLayoutChangeListenerC6241a();
            this.f34916e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo6554l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i11) {
            this.f34917f = new WeakReference(bottomAppBar);
            View m31742F0 = bottomAppBar.m31742F0();
            if (m31742F0 != null && !AbstractC1579n0.m7865e0(m31742F0)) {
                CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) m31742F0.getLayoutParams();
                c1306e.f5816d = 49;
                this.f34918g = ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin;
                if (m31742F0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) m31742F0;
                    floatingActionButton.addOnLayoutChangeListener(this.f34919h);
                    bottomAppBar.m31784x0(floatingActionButton);
                }
                bottomAppBar.m31748N0();
            }
            coordinatorLayout.m6524O(bottomAppBar, i11);
            return super.mo6554l(coordinatorLayout, bottomAppBar, i11);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean mo6539A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i11, int i12) {
            if (bottomAppBar.getHideOnScroll() && super.mo6539A(coordinatorLayout, bottomAppBar, view, view2, i11, i12)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34919h = new ViewOnLayoutChangeListenerC6241a();
            this.f34916e = new Rect();
        }
    }
}
