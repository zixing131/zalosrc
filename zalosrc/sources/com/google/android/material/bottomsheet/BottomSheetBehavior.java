package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.InterfaceC1513j0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.AbstractC6359z;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p252j1.AbstractC20900a;
import p337m1.C22712c;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23585j;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p599w6.AbstractC28774c;
import p664y.AbstractC30228a;
import p706z6.C31689h;
import p706z6.C31694m;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: Y */
    private static final int f34954Y = AbstractC23586k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    float f34955A;

    /* renamed from: B */
    int f34956B;

    /* renamed from: C */
    float f34957C;

    /* renamed from: D */
    boolean f34958D;

    /* renamed from: E */
    private boolean f34959E;

    /* renamed from: F */
    private boolean f34960F;

    /* renamed from: G */
    int f34961G;

    /* renamed from: H */
    C22712c f34962H;

    /* renamed from: I */
    private boolean f34963I;

    /* renamed from: J */
    private int f34964J;

    /* renamed from: K */
    private boolean f34965K;

    /* renamed from: L */
    private int f34966L;

    /* renamed from: M */
    int f34967M;

    /* renamed from: N */
    int f34968N;

    /* renamed from: O */
    WeakReference f34969O;

    /* renamed from: P */
    WeakReference f34970P;

    /* renamed from: Q */
    private final ArrayList f34971Q;

    /* renamed from: R */
    private VelocityTracker f34972R;

    /* renamed from: S */
    int f34973S;

    /* renamed from: T */
    private int f34974T;

    /* renamed from: U */
    boolean f34975U;

    /* renamed from: V */
    private Map f34976V;

    /* renamed from: W */
    private int f34977W;

    /* renamed from: X */
    private final C22712c.c f34978X;

    /* renamed from: a */
    private int f34979a;

    /* renamed from: b */
    private boolean f34980b;

    /* renamed from: c */
    private boolean f34981c;

    /* renamed from: d */
    private float f34982d;

    /* renamed from: e */
    private int f34983e;

    /* renamed from: f */
    private boolean f34984f;

    /* renamed from: g */
    private int f34985g;

    /* renamed from: h */
    private int f34986h;

    /* renamed from: i */
    private boolean f34987i;

    /* renamed from: j */
    private C31689h f34988j;

    /* renamed from: k */
    private int f34989k;

    /* renamed from: l */
    private int f34990l;

    /* renamed from: m */
    private boolean f34991m;

    /* renamed from: n */
    private boolean f34992n;

    /* renamed from: o */
    private boolean f34993o;

    /* renamed from: p */
    private boolean f34994p;

    /* renamed from: q */
    private boolean f34995q;

    /* renamed from: r */
    private int f34996r;

    /* renamed from: s */
    private int f34997s;

    /* renamed from: t */
    private C31694m f34998t;

    /* renamed from: u */
    private boolean f34999u;

    /* renamed from: v */
    private RunnableC6262g f35000v;

    /* renamed from: w */
    private ValueAnimator f35001w;

    /* renamed from: x */
    int f35002x;

    /* renamed from: y */
    int f35003y;

    /* renamed from: z */
    int f35004z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: classes3.dex */
    class RunnableC6256a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f35010p;

        /* renamed from: q */
        final /* synthetic */ ViewGroup.LayoutParams f35011q;

        RunnableC6256a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f35010p = view;
            this.f35011q = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35010p.setLayoutParams(this.f35011q);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: classes3.dex */
    public class RunnableC6257b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f35013p;

        /* renamed from: q */
        final /* synthetic */ int f35014q;

        RunnableC6257b(View view, int i11) {
            this.f35013p = view;
            this.f35014q = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m31872v0(this.f35013p, this.f35014q);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: classes3.dex */
    public class C6258c implements ValueAnimator.AnimatorUpdateListener {
        C6258c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f34988j != null) {
                BottomSheetBehavior.this.f34988j.m152443d0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: classes3.dex */
    public class C6259d implements AbstractC6359z.d {

        /* renamed from: a */
        final /* synthetic */ boolean f35017a;

        C6259d(boolean z11) {
            this.f35017a = z11;
        }

        @Override // com.google.android.material.internal.AbstractC6359z.d
        /* renamed from: a */
        public C1580n1 mo31803a(View view, C1580n1 c1580n1, AbstractC6359z.e eVar) {
            int i11;
            int i12;
            BottomSheetBehavior.this.f34997s = c1580n1.m8061m();
            boolean m32653h = AbstractC6359z.m32653h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f34992n) {
                BottomSheetBehavior.this.f34996r = c1580n1.m8058j();
                paddingBottom = eVar.f35612d + BottomSheetBehavior.this.f34996r;
            }
            if (BottomSheetBehavior.this.f34993o) {
                if (m32653h) {
                    i12 = eVar.f35611c;
                } else {
                    i12 = eVar.f35609a;
                }
                paddingLeft = i12 + c1580n1.m8059k();
            }
            if (BottomSheetBehavior.this.f34994p) {
                if (m32653h) {
                    i11 = eVar.f35609a;
                } else {
                    i11 = eVar.f35611c;
                }
                paddingRight = i11 + c1580n1.m8060l();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f35017a) {
                BottomSheetBehavior.this.f34990l = c1580n1.m8056h().f6233d;
            }
            if (BottomSheetBehavior.this.f34992n || this.f35017a) {
                BottomSheetBehavior.this.m31826C0(false);
            }
            return c1580n1;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: classes3.dex */
    class C6260e extends C22712c.c {
        C6260e() {
        }

        /* renamed from: n */
        private boolean m31878n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f34968N + bottomSheetBehavior.m31857b0()) / 2) {
                return true;
            }
            return false;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: a */
        public int mo8626a(View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: b */
        public int mo8627b(View view, int i11, int i12) {
            int i13;
            int m31857b0 = BottomSheetBehavior.this.m31857b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f34958D) {
                i13 = bottomSheetBehavior.f34968N;
            } else {
                i13 = bottomSheetBehavior.f34956B;
            }
            return AbstractC20900a.m109345b(i11, m31857b0, i13);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: e */
        public int mo31879e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f34958D) {
                return bottomSheetBehavior.f34968N;
            }
            return bottomSheetBehavior.f34956B;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: j */
        public void mo8633j(int i11) {
            if (i11 == 1 && BottomSheetBehavior.this.f34960F) {
                BottomSheetBehavior.this.m31871t0(1);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: k */
        public void mo8634k(View view, int i11, int i12, int i13, int i14) {
            BottomSheetBehavior.this.m31855Z(i12);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
            int i11;
            int i12 = 6;
            if (f12 < 0.0f) {
                if (BottomSheetBehavior.this.f34980b) {
                    i11 = BottomSheetBehavior.this.f35003y;
                } else {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i13 = bottomSheetBehavior.f35004z;
                    if (top > i13) {
                        i11 = i13;
                    } else {
                        i11 = bottomSheetBehavior.m31857b0();
                    }
                }
                i12 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                if (bottomSheetBehavior2.f34958D && bottomSheetBehavior2.m31873x0(view, f12)) {
                    if ((Math.abs(f11) < Math.abs(f12) && f12 > 500.0f) || m31878n(view)) {
                        i11 = BottomSheetBehavior.this.f34968N;
                        i12 = 5;
                    } else {
                        if (BottomSheetBehavior.this.f34980b) {
                            i11 = BottomSheetBehavior.this.f35003y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.m31857b0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f35004z)) {
                            i11 = BottomSheetBehavior.this.m31857b0();
                        } else {
                            i11 = BottomSheetBehavior.this.f35004z;
                        }
                        i12 = 3;
                    }
                } else if (f12 != 0.0f && Math.abs(f11) <= Math.abs(f12)) {
                    if (BottomSheetBehavior.this.f34980b) {
                        i11 = BottomSheetBehavior.this.f34956B;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.f35004z) < Math.abs(top2 - BottomSheetBehavior.this.f34956B)) {
                            i11 = BottomSheetBehavior.this.f35004z;
                        } else {
                            i11 = BottomSheetBehavior.this.f34956B;
                        }
                    }
                    i12 = 4;
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f34980b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f35003y) < Math.abs(top3 - BottomSheetBehavior.this.f34956B)) {
                            i11 = BottomSheetBehavior.this.f35003y;
                            i12 = 3;
                        } else {
                            i11 = BottomSheetBehavior.this.f34956B;
                            i12 = 4;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                        int i14 = bottomSheetBehavior3.f35004z;
                        if (top3 < i14) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior3.f34956B)) {
                                i11 = BottomSheetBehavior.this.m31857b0();
                                i12 = 3;
                            } else {
                                i11 = BottomSheetBehavior.this.f35004z;
                            }
                        } else if (Math.abs(top3 - i14) < Math.abs(top3 - BottomSheetBehavior.this.f34956B)) {
                            i11 = BottomSheetBehavior.this.f35004z;
                        } else {
                            i11 = BottomSheetBehavior.this.f34956B;
                            i12 = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior.this.m31874y0(view, i12, i11, true);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: m */
        public boolean mo8636m(View view, int i11) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i12 = bottomSheetBehavior.f34961G;
            if (i12 == 1 || bottomSheetBehavior.f34975U) {
                return false;
            }
            if (i12 == 3 && bottomSheetBehavior.f34973S == i11) {
                WeakReference weakReference = bottomSheetBehavior.f34970P;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference weakReference2 = BottomSheetBehavior.this.f34969O;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: classes3.dex */
    public class C6261f implements InterfaceC1513j0 {

        /* renamed from: a */
        final /* synthetic */ int f35020a;

        C6261f(int i11) {
            this.f35020a = i11;
        }

        @Override // androidx.core.view.accessibility.InterfaceC1513j0
        /* renamed from: a */
        public boolean mo7681a(View view, InterfaceC1513j0.a aVar) {
            BottomSheetBehavior.this.m31870s0(this.f35020a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: classes3.dex */
    public class RunnableC6262g implements Runnable {

        /* renamed from: p */
        private final View f35022p;

        /* renamed from: q */
        private boolean f35023q;

        /* renamed from: r */
        int f35024r;

        RunnableC6262g(View view, int i11) {
            this.f35022p = view;
            this.f35024r = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            C22712c c22712c = BottomSheetBehavior.this.f34962H;
            if (c22712c != null && c22712c.m117518n(true)) {
                AbstractC1579n0.m7900s0(this.f35022p, this);
            } else {
                BottomSheetBehavior.this.m31871t0(this.f35024r);
            }
            this.f35023q = false;
        }
    }

    public BottomSheetBehavior() {
        this.f34979a = 0;
        this.f34980b = true;
        this.f34981c = false;
        this.f34989k = -1;
        this.f35000v = null;
        this.f34955A = 0.5f;
        this.f34957C = -1.0f;
        this.f34960F = true;
        this.f34961G = 4;
        this.f34971Q = new ArrayList();
        this.f34977W = -1;
        this.f34978X = new C6260e();
    }

    /* renamed from: A0 */
    private void m31824A0(int i11) {
        boolean z11;
        ValueAnimator valueAnimator;
        float f11;
        if (i11 == 2) {
            return;
        }
        if (i11 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f34999u != z11) {
            this.f34999u = z11;
            if (this.f34988j != null && (valueAnimator = this.f35001w) != null) {
                if (valueAnimator.isRunning()) {
                    this.f35001w.reverse();
                    return;
                }
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                this.f35001w.setFloatValues(1.0f - f11, f11);
                this.f35001w.start();
            }
        }
    }

    /* renamed from: B0 */
    private void m31825B0(boolean z11) {
        Map map;
        WeakReference weakReference = this.f34969O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z11) {
            if (this.f34976V == null) {
                this.f34976V = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = coordinatorLayout.getChildAt(i11);
            if (childAt != this.f34969O.get()) {
                if (z11) {
                    this.f34976V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f34981c) {
                        AbstractC1579n0.m7823L0(childAt, 4);
                    }
                } else if (this.f34981c && (map = this.f34976V) != null && map.containsKey(childAt)) {
                    AbstractC1579n0.m7823L0(childAt, ((Integer) this.f34976V.get(childAt)).intValue());
                }
            }
        }
        if (!z11) {
            this.f34976V = null;
        } else if (this.f34981c) {
            ((View) this.f34969O.get()).sendAccessibilityEvent(8);
        }
    }

    /* renamed from: C0 */
    public void m31826C0(boolean z11) {
        View view;
        if (this.f34969O != null) {
            m31841S();
            if (this.f34961G == 4 && (view = (View) this.f34969O.get()) != null) {
                if (z11) {
                    m31853w0(this.f34961G);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: R */
    private int m31840R(View view, int i11, int i12) {
        return AbstractC1579n0.m7858c(view, view.getResources().getString(i11), m31844V(i12));
    }

    /* renamed from: S */
    private void m31841S() {
        int m31843U = m31843U();
        if (this.f34980b) {
            this.f34956B = Math.max(this.f34968N - m31843U, this.f35003y);
        } else {
            this.f34956B = this.f34968N - m31843U;
        }
    }

    /* renamed from: T */
    private void m31842T() {
        this.f35004z = (int) (this.f34968N * (1.0f - this.f34955A));
    }

    /* renamed from: U */
    private int m31843U() {
        int i11;
        if (this.f34984f) {
            return Math.min(Math.max(this.f34985g, this.f34968N - ((this.f34967M * 9) / 16)), this.f34966L) + this.f34996r;
        }
        if (!this.f34991m && !this.f34992n && (i11 = this.f34990l) > 0) {
            return Math.max(this.f34983e, i11 + this.f34986h);
        }
        return this.f34983e + this.f34996r;
    }

    /* renamed from: V */
    private InterfaceC1513j0 m31844V(int i11) {
        return new C6261f(i11);
    }

    /* renamed from: W */
    private void m31845W(Context context, AttributeSet attributeSet, boolean z11) {
        m31846X(context, attributeSet, z11, null);
    }

    /* renamed from: X */
    private void m31846X(Context context, AttributeSet attributeSet, boolean z11, ColorStateList colorStateList) {
        if (this.f34987i) {
            this.f34998t = C31694m.m152475e(context, attributeSet, AbstractC23577b.bottomSheetStyle, f34954Y).m152519m();
            C31689h c31689h = new C31689h(this.f34998t);
            this.f34988j = c31689h;
            c31689h.m152435R(context);
            if (z11 && colorStateList != null) {
                this.f34988j.m152442c0(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.f34988j.setTint(typedValue.data);
        }
    }

    /* renamed from: Y */
    private void m31847Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f35001w = ofFloat;
        ofFloat.setDuration(500L);
        this.f35001w.addUpdateListener(new C6258c());
    }

    /* renamed from: c0 */
    private float m31848c0() {
        VelocityTracker velocityTracker = this.f34972R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f34982d);
        return this.f34972R.getYVelocity(this.f34973S);
    }

    /* renamed from: e0 */
    private void m31849e0(View view, C1507g0.a aVar, int i11) {
        AbstractC1579n0.m7908w0(view, aVar, null, m31844V(i11));
    }

    /* renamed from: f0 */
    private void m31850f0() {
        this.f34973S = -1;
        VelocityTracker velocityTracker = this.f34972R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34972R = null;
        }
    }

    /* renamed from: g0 */
    private void m31851g0(SavedState savedState) {
        int i11 = this.f34979a;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.f34983e = savedState.f35006s;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.f34980b = savedState.f35007t;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.f34958D = savedState.f35008u;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.f34959E = savedState.f35009v;
        }
    }

    /* renamed from: u0 */
    private void m31852u0(View view) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 29 && !m31858d0() && !this.f34984f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f34992n && !this.f34993o && !this.f34994p && !z11) {
            return;
        }
        AbstractC6359z.m32647b(view, new C6259d(z11));
    }

    /* renamed from: w0 */
    private void m31853w0(int i11) {
        View view = (View) this.f34969O.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && AbstractC1579n0.m7862d0(view)) {
            view.post(new RunnableC6257b(view, i11));
        } else {
            m31872v0(view, i11);
        }
    }

    /* renamed from: z0 */
    private void m31854z0() {
        View view;
        WeakReference weakReference = this.f34969O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1579n0.m7904u0(view, 524288);
        AbstractC1579n0.m7904u0(view, 262144);
        AbstractC1579n0.m7904u0(view, ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE);
        int i11 = this.f34977W;
        if (i11 != -1) {
            AbstractC1579n0.m7904u0(view, i11);
        }
        int i12 = 6;
        if (!this.f34980b && this.f34961G != 6) {
            this.f34977W = m31840R(view, AbstractC23585j.bottomsheet_action_expand_halfway, 6);
        }
        if (this.f34958D && this.f34961G != 5) {
            m31849e0(view, C1507g0.a.f6463y, 5);
        }
        int i13 = this.f34961G;
        if (i13 != 3) {
            if (i13 != 4) {
                if (i13 == 6) {
                    m31849e0(view, C1507g0.a.f6462x, 4);
                    m31849e0(view, C1507g0.a.f6461w, 3);
                    return;
                }
                return;
            }
            if (this.f34980b) {
                i12 = 3;
            }
            m31849e0(view, C1507g0.a.f6461w, i12);
            return;
        }
        if (this.f34980b) {
            i12 = 4;
        }
        m31849e0(view, C1507g0.a.f6462x, i12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: A */
    public boolean mo6539A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        this.f34964J = 0;
        this.f34965K = false;
        return (i11 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: C */
    public void mo6541C(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
        int i12;
        int i13 = 3;
        if (view.getTop() == m31857b0()) {
            m31871t0(3);
            return;
        }
        WeakReference weakReference = this.f34970P;
        if (weakReference != null && view2 == weakReference.get() && this.f34965K) {
            if (this.f34964J > 0) {
                if (this.f34980b) {
                    i12 = this.f35003y;
                } else {
                    int top = view.getTop();
                    int i14 = this.f35004z;
                    if (top > i14) {
                        i12 = i14;
                        i13 = 6;
                    } else {
                        i12 = m31857b0();
                    }
                }
            } else if (this.f34958D && m31873x0(view, m31848c0())) {
                i12 = this.f34968N;
                i13 = 5;
            } else if (this.f34964J == 0) {
                int top2 = view.getTop();
                if (this.f34980b) {
                    if (Math.abs(top2 - this.f35003y) < Math.abs(top2 - this.f34956B)) {
                        i12 = this.f35003y;
                    } else {
                        i12 = this.f34956B;
                        i13 = 4;
                    }
                } else {
                    int i15 = this.f35004z;
                    if (top2 < i15) {
                        if (top2 < Math.abs(top2 - this.f34956B)) {
                            i12 = m31857b0();
                        } else {
                            i12 = this.f35004z;
                        }
                    } else if (Math.abs(top2 - i15) < Math.abs(top2 - this.f34956B)) {
                        i12 = this.f35004z;
                    } else {
                        i12 = this.f34956B;
                        i13 = 4;
                    }
                    i13 = 6;
                }
            } else {
                if (this.f34980b) {
                    i12 = this.f34956B;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - this.f35004z) < Math.abs(top3 - this.f34956B)) {
                        i12 = this.f35004z;
                        i13 = 6;
                    } else {
                        i12 = this.f34956B;
                    }
                }
                i13 = 4;
            }
            m31874y0(view, i13, i12, false);
            this.f34965K = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: D */
    public boolean mo6542D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f34961G == 1 && actionMasked == 0) {
            return true;
        }
        C22712c c22712c = this.f34962H;
        if (c22712c != null) {
            c22712c.m117505F(motionEvent);
        }
        if (actionMasked == 0) {
            m31850f0();
        }
        if (this.f34972R == null) {
            this.f34972R = VelocityTracker.obtain();
        }
        this.f34972R.addMovement(motionEvent);
        if (this.f34962H != null && actionMasked == 2 && !this.f34963I && Math.abs(this.f34974T - motionEvent.getY()) > this.f34962H.m117522z()) {
            this.f34962H.m117515c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f34963I;
    }

    /* renamed from: Z */
    void m31855Z(int i11) {
        if (((View) this.f34969O.get()) != null && !this.f34971Q.isEmpty()) {
            int i12 = this.f34956B;
            if (i11 <= i12 && i12 != m31857b0()) {
                m31857b0();
            }
            if (this.f34971Q.size() > 0) {
                AbstractC30228a.m149044a(this.f34971Q.get(0));
                throw null;
            }
        }
    }

    /* renamed from: a0 */
    View m31856a0(View view) {
        if (AbstractC1579n0.m7868f0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View m31856a0 = m31856a0(viewGroup.getChildAt(i11));
                if (m31856a0 != null) {
                    return m31856a0;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: b0 */
    public int m31857b0() {
        int i11;
        if (this.f34980b) {
            return this.f35003y;
        }
        int i12 = this.f35002x;
        if (this.f34995q) {
            i11 = 0;
        } else {
            i11 = this.f34997s;
        }
        return Math.max(i12, i11);
    }

    /* renamed from: d0 */
    public boolean m31858d0() {
        return this.f34991m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: g */
    public void mo6549g(CoordinatorLayout.C1306e c1306e) {
        super.mo6549g(c1306e);
        this.f34969O = null;
        this.f34962H = null;
    }

    /* renamed from: h0 */
    public void m31859h0(boolean z11) {
        this.f34960F = z11;
    }

    /* renamed from: i0 */
    public void m31860i0(int i11) {
        if (i11 >= 0) {
            this.f35002x = i11;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: j */
    public void mo6552j() {
        super.mo6552j();
        this.f34969O = null;
        this.f34962H = null;
    }

    /* renamed from: j0 */
    public void m31861j0(boolean z11) {
        int i11;
        if (this.f34980b == z11) {
            return;
        }
        this.f34980b = z11;
        if (this.f34969O != null) {
            m31841S();
        }
        if (this.f34980b && this.f34961G == 6) {
            i11 = 3;
        } else {
            i11 = this.f34961G;
        }
        m31871t0(i11);
        m31854z0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public boolean mo6553k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z11;
        View view2;
        C22712c c22712c;
        if (view.isShown() && this.f34960F) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m31850f0();
            }
            if (this.f34972R == null) {
                this.f34972R = VelocityTracker.obtain();
            }
            this.f34972R.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f34975U = false;
                    this.f34973S = -1;
                    if (this.f34963I) {
                        this.f34963I = false;
                        return false;
                    }
                }
            } else {
                int x11 = (int) motionEvent.getX();
                this.f34974T = (int) motionEvent.getY();
                if (this.f34961G != 2) {
                    WeakReference weakReference = this.f34970P;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.m6521H(view2, x11, this.f34974T)) {
                        this.f34973S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f34975U = true;
                    }
                }
                if (this.f34973S == -1 && !coordinatorLayout.m6521H(view, x11, this.f34974T)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f34963I = z11;
            }
            if (!this.f34963I && (c22712c = this.f34962H) != null && c22712c.m117510O(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f34970P;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f34963I || this.f34961G == 1 || coordinatorLayout.m6521H(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f34962H == null || Math.abs(this.f34974T - motionEvent.getY()) <= this.f34962H.m117522z()) {
                return false;
            }
            return true;
        }
        this.f34963I = true;
        return false;
    }

    /* renamed from: k0 */
    public void m31862k0(boolean z11) {
        this.f34991m = z11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        boolean z11;
        float f11;
        C31689h c31689h;
        if (AbstractC1579n0.m7806D(coordinatorLayout) && !AbstractC1579n0.m7806D(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f34969O == null) {
            this.f34985g = coordinatorLayout.getResources().getDimensionPixelSize(AbstractC23579d.design_bottom_sheet_peek_height_min);
            m31852u0(view);
            this.f34969O = new WeakReference(view);
            if (this.f34987i && (c31689h = this.f34988j) != null) {
                AbstractC1579n0.m7807D0(view, c31689h);
            }
            C31689h c31689h2 = this.f34988j;
            if (c31689h2 != null) {
                float f12 = this.f34957C;
                if (f12 == -1.0f) {
                    f12 = AbstractC1579n0.m7800A(view);
                }
                c31689h2.m152441b0(f12);
                if (this.f34961G == 3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f34999u = z11;
                C31689h c31689h3 = this.f34988j;
                if (z11) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                c31689h3.m152443d0(f11);
            }
            m31854z0();
            if (AbstractC1579n0.m7808E(view) == 0) {
                AbstractC1579n0.m7823L0(view, 1);
            }
            int measuredWidth = view.getMeasuredWidth();
            int i12 = this.f34989k;
            if (measuredWidth > i12 && i12 != -1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = this.f34989k;
                view.post(new RunnableC6256a(view, layoutParams));
            }
        }
        if (this.f34962H == null) {
            this.f34962H = C22712c.m117494p(coordinatorLayout, this.f34978X);
        }
        int top = view.getTop();
        coordinatorLayout.m6524O(view, i11);
        this.f34967M = coordinatorLayout.getWidth();
        this.f34968N = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f34966L = height;
        int i13 = this.f34968N;
        int i14 = i13 - height;
        int i15 = this.f34997s;
        if (i14 < i15) {
            if (this.f34995q) {
                this.f34966L = i13;
            } else {
                this.f34966L = i13 - i15;
            }
        }
        this.f35003y = Math.max(0, i13 - this.f34966L);
        m31842T();
        m31841S();
        int i16 = this.f34961G;
        if (i16 == 3) {
            AbstractC1579n0.m7886l0(view, m31857b0());
        } else if (i16 == 6) {
            AbstractC1579n0.m7886l0(view, this.f35004z);
        } else if (this.f34958D && i16 == 5) {
            AbstractC1579n0.m7886l0(view, this.f34968N);
        } else if (i16 == 4) {
            AbstractC1579n0.m7886l0(view, this.f34956B);
        } else if (i16 == 1 || i16 == 2) {
            AbstractC1579n0.m7886l0(view, top - view.getTop());
        }
        this.f34970P = new WeakReference(m31856a0(view));
        return true;
    }

    /* renamed from: l0 */
    public void m31863l0(float f11) {
        if (f11 > 0.0f && f11 < 1.0f) {
            this.f34955A = f11;
            if (this.f34969O != null) {
                m31842T();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: m0 */
    public void m31864m0(boolean z11) {
        if (this.f34958D != z11) {
            this.f34958D = z11;
            if (!z11 && this.f34961G == 5) {
                m31870s0(4);
            }
            m31854z0();
        }
    }

    /* renamed from: n0 */
    public void m31865n0(int i11) {
        this.f34989k = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: o */
    public boolean mo6557o(CoordinatorLayout coordinatorLayout, View view, View view2, float f11, float f12) {
        WeakReference weakReference = this.f34970P;
        if (weakReference == null || view2 != weakReference.get()) {
            return false;
        }
        if (this.f34961G == 3 && !super.mo6557o(coordinatorLayout, view, view2, f11, f12)) {
            return false;
        }
        return true;
    }

    /* renamed from: o0 */
    public void m31866o0(int i11) {
        m31867p0(i11, false);
    }

    /* renamed from: p0 */
    public final void m31867p0(int i11, boolean z11) {
        if (i11 == -1) {
            if (!this.f34984f) {
                this.f34984f = true;
            } else {
                return;
            }
        } else if (this.f34984f || this.f34983e != i11) {
            this.f34984f = false;
            this.f34983e = Math.max(0, i11);
        } else {
            return;
        }
        m31826C0(z11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: q */
    public void mo6559q(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
        View view3;
        if (i13 == 1) {
            return;
        }
        WeakReference weakReference = this.f34970P;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i14 = top - i12;
        if (i12 > 0) {
            if (i14 < m31857b0()) {
                int m31857b0 = top - m31857b0();
                iArr[1] = m31857b0;
                AbstractC1579n0.m7886l0(view, -m31857b0);
                m31871t0(3);
            } else {
                if (!this.f34960F) {
                    return;
                }
                iArr[1] = i12;
                AbstractC1579n0.m7886l0(view, -i12);
                m31871t0(1);
            }
        } else if (i12 < 0 && !view2.canScrollVertically(-1)) {
            int i15 = this.f34956B;
            if (i14 > i15 && !this.f34958D) {
                int i16 = top - i15;
                iArr[1] = i16;
                AbstractC1579n0.m7886l0(view, -i16);
                m31871t0(4);
            } else {
                if (!this.f34960F) {
                    return;
                }
                iArr[1] = i12;
                AbstractC1579n0.m7886l0(view, -i12);
                m31871t0(1);
            }
        }
        m31855Z(view.getTop());
        this.f34964J = i12;
        this.f34965K = true;
    }

    /* renamed from: q0 */
    public void m31868q0(int i11) {
        this.f34979a = i11;
    }

    /* renamed from: r0 */
    public void m31869r0(boolean z11) {
        this.f34959E = z11;
    }

    /* renamed from: s0 */
    public void m31870s0(int i11) {
        if (i11 == this.f34961G) {
            return;
        }
        if (this.f34969O == null) {
            if (i11 == 4 || i11 == 3 || i11 == 6 || (this.f34958D && i11 == 5)) {
                this.f34961G = i11;
                return;
            }
            return;
        }
        m31853w0(i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: t */
    public void mo6562t(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
    }

    /* renamed from: t0 */
    void m31871t0(int i11) {
        if (this.f34961G == i11) {
            return;
        }
        this.f34961G = i11;
        WeakReference weakReference = this.f34969O;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            m31825B0(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            m31825B0(false);
        }
        m31824A0(i11);
        if (this.f34971Q.size() <= 0) {
            m31854z0();
        } else {
            AbstractC30228a.m149044a(this.f34971Q.get(0));
            throw null;
        }
    }

    /* renamed from: v0 */
    void m31872v0(View view, int i11) {
        int i12;
        int i13;
        if (i11 == 4) {
            i12 = this.f34956B;
        } else if (i11 == 6) {
            i12 = this.f35004z;
            if (this.f34980b && i12 <= (i13 = this.f35003y)) {
                i12 = i13;
                i11 = 3;
            }
        } else if (i11 == 3) {
            i12 = m31857b0();
        } else if (this.f34958D && i11 == 5) {
            i12 = this.f34968N;
        } else {
            throw new IllegalArgumentException("Illegal state argument: " + i11);
        }
        m31874y0(view, i11, i12, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: x */
    public void mo6566x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo6566x(coordinatorLayout, view, savedState.m8457a());
        m31851g0(savedState);
        int i11 = savedState.f35005r;
        if (i11 != 1 && i11 != 2) {
            this.f34961G = i11;
        } else {
            this.f34961G = 4;
        }
    }

    /* renamed from: x0 */
    boolean m31873x0(View view, float f11) {
        if (this.f34959E) {
            return true;
        }
        if (view.getTop() < this.f34956B) {
            return false;
        }
        if (Math.abs((view.getTop() + (f11 * 0.1f)) - this.f34956B) / m31843U() > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: y */
    public Parcelable mo6567y(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.mo6567y(coordinatorLayout, view), this);
    }

    /* renamed from: y0 */
    void m31874y0(View view, int i11, int i12, boolean z11) {
        C22712c c22712c = this.f34962H;
        if (c22712c != null && (!z11 ? c22712c.m117511P(view, view.getLeft(), i12) : c22712c.m117509N(view.getLeft(), i12))) {
            m31871t0(2);
            m31824A0(i11);
            if (this.f35000v == null) {
                this.f35000v = new RunnableC6262g(view, i11);
            }
            if (!this.f35000v.f35023q) {
                RunnableC6262g runnableC6262g = this.f35000v;
                runnableC6262g.f35024r = i11;
                AbstractC1579n0.m7900s0(view, runnableC6262g);
                this.f35000v.f35023q = true;
                return;
            }
            this.f35000v.f35024r = i11;
            return;
        }
        m31871t0(i11);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        this.f34979a = 0;
        this.f34980b = true;
        this.f34981c = false;
        this.f34989k = -1;
        this.f35000v = null;
        this.f34955A = 0.5f;
        this.f34957C = -1.0f;
        this.f34960F = true;
        this.f34961G = 4;
        this.f34971Q = new ArrayList();
        this.f34977W = -1;
        this.f34978X = new C6260e();
        this.f34986h = context.getResources().getDimensionPixelSize(AbstractC23579d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC23587l.BottomSheetBehavior_Layout);
        this.f34987i = obtainStyledAttributes.hasValue(AbstractC23587l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(AbstractC23587l.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m31846X(context, attributeSet, hasValue, AbstractC28774c.m143973a(context, obtainStyledAttributes, AbstractC23587l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m31845W(context, attributeSet, hasValue);
        }
        m31847Y();
        this.f34957C = obtainStyledAttributes.getDimension(AbstractC23587l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(AbstractC23587l.BottomSheetBehavior_Layout_android_maxWidth)) {
            m31865n0(obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(AbstractC23587l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            m31866o0(i11);
        } else {
            m31866o0(obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        m31864m0(obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_behavior_hideable, false));
        m31862k0(obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        m31861j0(obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m31869r0(obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        m31859h0(obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_behavior_draggable, true));
        m31868q0(obtainStyledAttributes.getInt(AbstractC23587l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        m31863l0(obtainStyledAttributes.getFloat(AbstractC23587l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(AbstractC23587l.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            m31860i0(peekValue2.data);
        } else {
            m31860i0(obtainStyledAttributes.getDimensionPixelOffset(AbstractC23587l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        this.f34992n = obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f34993o = obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f34994p = obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f34995q = obtainStyledAttributes.getBoolean(AbstractC23587l.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.f34982d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6255a();

        /* renamed from: r */
        final int f35005r;

        /* renamed from: s */
        int f35006s;

        /* renamed from: t */
        boolean f35007t;

        /* renamed from: u */
        boolean f35008u;

        /* renamed from: v */
        boolean f35009v;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        /* loaded from: classes3.dex */
        static class C6255a implements Parcelable.ClassLoaderCreator {
            C6255a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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
            this.f35005r = parcel.readInt();
            this.f35006s = parcel.readInt();
            this.f35007t = parcel.readInt() == 1;
            this.f35008u = parcel.readInt() == 1;
            this.f35009v = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f35005r);
            parcel.writeInt(this.f35006s);
            parcel.writeInt(this.f35007t ? 1 : 0);
            parcel.writeInt(this.f35008u ? 1 : 0);
            parcel.writeInt(this.f35009v ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f35005r = bottomSheetBehavior.f34961G;
            this.f35006s = bottomSheetBehavior.f34983e;
            this.f35007t = bottomSheetBehavior.f34980b;
            this.f35008u = bottomSheetBehavior.f34958D;
            this.f35009v = bottomSheetBehavior.f34959E;
        }
    }
}
