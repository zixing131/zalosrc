package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1622z;
import androidx.core.view.C1490a;
import androidx.core.view.C1535c0;
import androidx.core.view.C1547f0;
import androidx.core.view.InterfaceC1491a0;
import androidx.core.view.InterfaceC1543e0;
import androidx.core.view.accessibility.AbstractC1511i0;
import androidx.core.view.accessibility.C1507g0;
import java.util.ArrayList;
import p176g1.AbstractC19199a;

/* loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1543e0, InterfaceC1491a0 {

    /* renamed from: Q */
    private static final float f6604Q = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: R */
    private static final C1626a f6605R = new C1626a();

    /* renamed from: S */
    private static final int[] f6606S = {R.attr.fillViewport};

    /* renamed from: A */
    private VelocityTracker f6607A;

    /* renamed from: B */
    private boolean f6608B;

    /* renamed from: C */
    private boolean f6609C;

    /* renamed from: D */
    private int f6610D;

    /* renamed from: E */
    private int f6611E;

    /* renamed from: F */
    private int f6612F;

    /* renamed from: G */
    private int f6613G;

    /* renamed from: H */
    private final int[] f6614H;

    /* renamed from: I */
    private final int[] f6615I;

    /* renamed from: J */
    private int f6616J;

    /* renamed from: K */
    private int f6617K;

    /* renamed from: L */
    private SavedState f6618L;

    /* renamed from: M */
    private final C1547f0 f6619M;

    /* renamed from: N */
    private final C1535c0 f6620N;

    /* renamed from: O */
    private float f6621O;

    /* renamed from: P */
    private InterfaceC1628c f6622P;

    /* renamed from: p */
    private final float f6623p;

    /* renamed from: q */
    private long f6624q;

    /* renamed from: r */
    private final Rect f6625r;

    /* renamed from: s */
    private OverScroller f6626s;

    /* renamed from: t */
    public EdgeEffect f6627t;

    /* renamed from: u */
    public EdgeEffect f6628u;

    /* renamed from: v */
    private int f6629v;

    /* renamed from: w */
    private boolean f6630w;

    /* renamed from: x */
    private boolean f6631x;

    /* renamed from: y */
    private View f6632y;

    /* renamed from: z */
    private boolean f6633z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1625a();

        /* renamed from: p */
        public int f6634p;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        /* loaded from: classes2.dex */
        class C1625a implements Parcelable.Creator {
            C1625a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f6634p + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f6634p);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f6634p = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes2.dex */
    static class C1626a extends C1490a {
        C1626a() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z11;
            super.mo7509f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AbstractC1511i0.m7672a(accessibilityEvent, nestedScrollView.getScrollX());
            AbstractC1511i0.m7673b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            int scrollRange;
            super.mo7510g(view, c1507g0);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c1507g0.m7619d0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                c1507g0.m7653y0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    c1507g0.m7614b(C1507g0.a.f6456r);
                    c1507g0.m7614b(C1507g0.a.f6424C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    c1507g0.m7614b(C1507g0.a.f6455q);
                    c1507g0.m7614b(C1507g0.a.f6426E);
                }
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: j */
        public boolean mo7513j(View view, int i11, Bundle bundle) {
            if (super.mo7513j(view, i11, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i11 != 4096) {
                if (i11 != 8192 && i11 != 16908344) {
                    if (i11 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m8331l0(0, max, true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m8331l0(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes2.dex */
    static class C1627b {
        /* renamed from: a */
        static boolean m8336a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1628c {
        /* renamed from: a */
        void mo4736a(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private boolean m8290A() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin <= (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private static int m8291B(int i11, int i12, int i13) {
        if (i12 >= i13 || i11 < 0) {
            return 0;
        }
        return i12 + i11 > i13 ? i13 - i12 : i11;
    }

    /* renamed from: G */
    private void m8292G(int i11) {
        if (i11 != 0) {
            if (this.f6609C) {
                m8328h0(0, i11);
            } else {
                scrollBy(0, i11);
            }
        }
    }

    /* renamed from: H */
    private boolean m8293H(int i11) {
        if (AbstractC1634f.m8382b(this.f6627t) != 0.0f) {
            if (m8313g0(this.f6627t, i11)) {
                this.f6627t.onAbsorb(i11);
            } else {
                m8322L(-i11);
            }
        } else if (AbstractC1634f.m8382b(this.f6628u) != 0.0f) {
            int i12 = -i11;
            if (m8313g0(this.f6628u, i12)) {
                this.f6628u.onAbsorb(i12);
            } else {
                m8322L(i12);
            }
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private void m8294I() {
        this.f6633z = false;
        m8306a0();
        m8333o0(0);
        this.f6627t.onRelease();
        this.f6628u.onRelease();
    }

    /* renamed from: K */
    private View m8295K(boolean z11, int i11, int i12) {
        boolean z12;
        boolean z13;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: N */
    private float m8296N(int i11) {
        double log = Math.log((Math.abs(i11) * 0.35f) / (this.f6623p * 0.015f));
        float f11 = f6604Q;
        return (float) (this.f6623p * 0.015f * Math.exp((f11 / (f11 - 1.0d)) * log));
    }

    /* renamed from: P */
    private boolean m8297P(int i11, int i12) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i12 < childAt.getTop() - scrollY || i12 >= childAt.getBottom() - scrollY || i11 < childAt.getLeft() || i11 >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m8298Q() {
        VelocityTracker velocityTracker = this.f6607A;
        if (velocityTracker == null) {
            this.f6607A = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: R */
    private void m8299R() {
        this.f6626s = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f6610D = viewConfiguration.getScaledTouchSlop();
        this.f6611E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f6612F = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: S */
    private void m8300S() {
        if (this.f6607A == null) {
            this.f6607A = VelocityTracker.obtain();
        }
    }

    /* renamed from: T */
    private boolean m8301T(View view) {
        return !m8303V(view, 0, getHeight());
    }

    /* renamed from: U */
    private static boolean m8302U(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && m8302U((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m8303V(View view, int i11, int i12) {
        view.getDrawingRect(this.f6625r);
        offsetDescendantRectToMyCoords(view, this.f6625r);
        if (this.f6625r.bottom + i11 >= getScrollY() && this.f6625r.top - i11 <= getScrollY() + i12) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private void m8304W(int i11, int i12, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i11);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f6620N.m7719e(0, scrollY2, 0, i11 - scrollY2, null, i12, iArr);
    }

    /* renamed from: X */
    private void m8305X(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6613G) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f6629v = (int) motionEvent.getY(i11);
            this.f6613G = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.f6607A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a0 */
    private void m8306a0() {
        VelocityTracker velocityTracker = this.f6607A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6607A = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m8307b0(int i11, float f11) {
        float m8384d;
        int round;
        float width = f11 / getWidth();
        float height = i11 / getHeight();
        float f12 = 0.0f;
        if (AbstractC1634f.m8382b(this.f6627t) != 0.0f) {
            m8384d = -AbstractC1634f.m8384d(this.f6627t, -height, width);
            if (AbstractC1634f.m8382b(this.f6627t) == 0.0f) {
                this.f6627t.onRelease();
            }
        } else {
            if (AbstractC1634f.m8382b(this.f6628u) != 0.0f) {
                m8384d = AbstractC1634f.m8384d(this.f6628u, height, 1.0f - width);
                if (AbstractC1634f.m8382b(this.f6628u) == 0.0f) {
                    this.f6628u.onRelease();
                }
            }
            round = Math.round(f12 * getHeight());
            if (round != 0) {
                invalidate();
            }
            return round;
        }
        f12 = m8384d;
        round = Math.round(f12 * getHeight());
        if (round != 0) {
        }
        return round;
    }

    /* renamed from: c0 */
    private void m8308c0(boolean z11) {
        if (z11) {
            m8332m0(2, 1);
        } else {
            m8333o0(1);
        }
        this.f6617K = getScrollY();
        AbstractC1579n0.m7898r0(this);
    }

    /* renamed from: d0 */
    private boolean m8309d0(int i11, int i12, int i13) {
        boolean z11;
        int i14;
        int height = getHeight();
        int scrollY = getScrollY();
        int i15 = height + scrollY;
        boolean z12 = false;
        if (i11 == 33) {
            z11 = true;
        } else {
            z11 = false;
        }
        View m8295K = m8295K(z11, i12, i13);
        if (m8295K == null) {
            m8295K = this;
        }
        if (i12 < scrollY || i13 > i15) {
            if (z11) {
                i14 = i12 - scrollY;
            } else {
                i14 = i13 - i15;
            }
            m8292G(i14);
            z12 = true;
        }
        if (m8295K != findFocus()) {
            m8295K.requestFocus(i11);
        }
        return z12;
    }

    /* renamed from: e0 */
    private void m8310e0(View view) {
        view.getDrawingRect(this.f6625r);
        offsetDescendantRectToMyCoords(view, this.f6625r);
        int m8317C = m8317C(this.f6625r);
        if (m8317C != 0) {
            scrollBy(0, m8317C);
        }
    }

    /* renamed from: f0 */
    private boolean m8311f0(Rect rect, boolean z11) {
        boolean z12;
        int m8317C = m8317C(rect);
        if (m8317C != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                scrollBy(0, m8317C);
            } else {
                m8328h0(0, m8317C);
            }
        }
        return z12;
    }

    /* renamed from: g */
    private void m8312g() {
        this.f6626s.abortAnimation();
        m8333o0(1);
    }

    /* renamed from: g0 */
    private boolean m8313g0(EdgeEffect edgeEffect, int i11) {
        if (i11 > 0) {
            return true;
        }
        if (m8296N(-i11) < AbstractC1634f.m8382b(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f6621O == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.f6621O = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f6621O;
    }

    /* renamed from: i0 */
    private void m8314i0(int i11, int i12, int i13, boolean z11) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f6624q > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f6626s.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i12 + scrollY, Math.max(0, height - height2))) - scrollY, i13);
            m8308c0(z11);
        } else {
            if (!this.f6626s.isFinished()) {
                m8312g();
            }
            scrollBy(i11, i12);
        }
        this.f6624q = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: n0 */
    private boolean m8315n0(MotionEvent motionEvent) {
        boolean z11;
        if (AbstractC1634f.m8382b(this.f6627t) != 0.0f) {
            AbstractC1634f.m8384d(this.f6627t, 0.0f, motionEvent.getX() / getWidth());
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC1634f.m8382b(this.f6628u) != 0.0f) {
            AbstractC1634f.m8384d(this.f6628u, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z11;
    }

    /* renamed from: z */
    private boolean m8316z() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode == 1 && getScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    protected int m8317C(Rect rect) {
        int i11;
        int i12;
        int i13;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i11 = i14 - verticalFadingEdgeLength;
        } else {
            i11 = i14;
        }
        int i15 = rect.bottom;
        if (i15 > i11 && rect.top > scrollY) {
            if (rect.height() > height) {
                i13 = rect.top - scrollY;
            } else {
                i13 = rect.bottom - i11;
            }
            return Math.min(i13, (childAt.getBottom() + layoutParams.bottomMargin) - i14);
        }
        if (rect.top >= scrollY || i15 >= i11) {
            return 0;
        }
        if (rect.height() > height) {
            i12 = 0 - (i11 - rect.bottom);
        } else {
            i12 = 0 - (scrollY - rect.top);
        }
        return Math.max(i12, -getScrollY());
    }

    /* renamed from: D */
    int m8318D(int i11) {
        int height = getHeight();
        if (i11 > 0 && AbstractC1634f.m8382b(this.f6627t) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * AbstractC1634f.m8384d(this.f6627t, ((-i11) * 4.0f) / height, 0.5f));
            if (round != i11) {
                this.f6627t.finish();
            }
            return i11 - round;
        }
        if (i11 < 0 && AbstractC1634f.m8382b(this.f6628u) != 0.0f) {
            float f11 = height;
            int round2 = Math.round((f11 / 4.0f) * AbstractC1634f.m8384d(this.f6628u, (i11 * 4.0f) / f11, 0.5f));
            if (round2 != i11) {
                this.f6628u.finish();
            }
            return i11 - round2;
        }
        return i11;
    }

    /* renamed from: E */
    public boolean m8319E(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return this.f6620N.m7718d(i11, i12, iArr, iArr2, i13);
    }

    /* renamed from: F */
    public void m8320F(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        this.f6620N.m7719e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    /* renamed from: J */
    public boolean m8321J(KeyEvent keyEvent) {
        this.f6625r.setEmpty();
        int i11 = 130;
        if (!m8290A()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19) {
            if (keyCode != 20) {
                if (keyCode != 62) {
                    return false;
                }
                if (keyEvent.isShiftPressed()) {
                    i11 = 33;
                }
                m8326Z(i11);
                return false;
            }
            if (!keyEvent.isAltPressed()) {
                return m8327h(130);
            }
            return m8323M(130);
        }
        if (!keyEvent.isAltPressed()) {
            return m8327h(33);
        }
        return m8323M(33);
    }

    /* renamed from: L */
    public void m8322L(int i11) {
        if (getChildCount() > 0) {
            this.f6626s.fling(getScrollX(), getScrollY(), 0, i11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m8308c0(true);
        }
    }

    /* renamed from: M */
    public boolean m8323M(int i11) {
        boolean z11;
        int childCount;
        if (i11 == 130) {
            z11 = true;
        } else {
            z11 = false;
        }
        int height = getHeight();
        Rect rect = this.f6625r;
        rect.top = 0;
        rect.bottom = height;
        if (z11 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f6625r.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f6625r;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f6625r;
        return m8309d0(i11, rect3.top, rect3.bottom);
    }

    /* renamed from: O */
    public boolean m8324O(int i11) {
        return this.f6620N.m7722k(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m8325Y(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i19;
        int i21;
        boolean z16;
        boolean z17;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z12)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z13)) {
            z15 = false;
        } else {
            z15 = true;
        }
        int i22 = i13 + i11;
        if (!z14) {
            i19 = 0;
        } else {
            i19 = i17;
        }
        int i23 = i14 + i12;
        if (!z15) {
            i21 = 0;
        } else {
            i21 = i18;
        }
        int i24 = -i19;
        int i25 = i19 + i15;
        int i26 = -i21;
        int i27 = i21 + i16;
        if (i22 > i25) {
            i22 = i25;
        } else if (i22 < i24) {
            i22 = i24;
        } else {
            z16 = false;
            if (i23 <= i27) {
                i23 = i27;
            } else if (i23 < i26) {
                i23 = i26;
            } else {
                z17 = false;
                if (z17 && !m8324O(1)) {
                    this.f6626s.springBack(i22, i23, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i22, i23, z16, z17);
                if (z16 && !z17) {
                    return false;
                }
                return true;
            }
            z17 = true;
            if (z17) {
                this.f6626s.springBack(i22, i23, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i22, i23, z16, z17);
            if (z16) {
            }
            return true;
        }
        z16 = true;
        if (i23 <= i27) {
        }
        z17 = true;
        if (z17) {
        }
        onOverScrolled(i22, i23, z16, z17);
        if (z16) {
        }
        return true;
    }

    /* renamed from: Z */
    public boolean m8326Z(int i11) {
        boolean z11;
        if (i11 == 130) {
            z11 = true;
        } else {
            z11 = false;
        }
        int height = getHeight();
        if (z11) {
            this.f6625r.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f6625r;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f6625r.top = getScrollY() - height;
            Rect rect2 = this.f6625r;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f6625r;
        int i12 = rect3.top;
        int i13 = height + i12;
        rect3.bottom = i13;
        return m8309d0(i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6626s.isFinished()) {
            return;
        }
        this.f6626s.computeScrollOffset();
        int currY = this.f6626s.getCurrY();
        int m8318D = m8318D(currY - this.f6617K);
        this.f6617K = currY;
        int[] iArr = this.f6615I;
        iArr[1] = 0;
        m8319E(0, m8318D, iArr, null, 1);
        int i11 = m8318D - this.f6615I[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            m8325Y(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f6615I;
            iArr2[1] = 0;
            m8320F(0, scrollY2, 0, i12, this.f6614H, 1, iArr2);
            i11 = i12 - this.f6615I[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i11 < 0) {
                    if (this.f6627t.isFinished()) {
                        this.f6627t.onAbsorb((int) this.f6626s.getCurrVelocity());
                    }
                } else if (this.f6628u.isFinished()) {
                    this.f6628u.onAbsorb((int) this.f6626s.getCurrVelocity());
                }
            }
            m8312g();
        }
        if (!this.f6626s.isFinished()) {
            AbstractC1579n0.m7898r0(this);
        } else {
            m8333o0(1);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m8321J(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f6620N.m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f6620N.m7716b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return m8319E(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f6620N.m7720f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i11;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i12 = 0;
        if (!this.f6627t.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C1627b.m8336a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i11 = getPaddingLeft();
            } else {
                i11 = 0;
            }
            if (C1627b.m8336a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i11, min);
            this.f6627t.setSize(width, height);
            if (this.f6627t.draw(canvas)) {
                AbstractC1579n0.m7898r0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f6628u.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C1627b.m8336a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i12 = getPaddingLeft();
            }
            if (C1627b.m8336a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate(i12 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f6628u.setSize(width2, height2);
            if (this.f6628u.draw(canvas)) {
                AbstractC1579n0.m7898r0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f6619M.m7761a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m8327h(int i11) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m8303V(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f6625r);
            offsetDescendantRectToMyCoords(findNextFocus, this.f6625r);
            m8292G(m8317C(this.f6625r));
            findNextFocus.requestFocus(i11);
        } else {
            if (i11 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i11 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i11 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m8292G(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && m8301T(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
            return true;
        }
        return true;
    }

    /* renamed from: h0 */
    public final void m8328h0(int i11, int i12) {
        m8314i0(i11, i12, 250, false);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m8324O(0);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: i */
    public void mo5176i(View view, View view2, int i11, int i12) {
        this.f6619M.m7763c(view, view2, i11, i12);
        m8332m0(2, i12);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f6620N.m7723l();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: j */
    public void mo5177j(View view, int i11) {
        this.f6619M.m7765e(view, i11);
        m8333o0(i11);
    }

    /* renamed from: j0 */
    public final void m8329j0(int i11, int i12) {
        m8330k0(i11, i12, 250, false);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: k */
    public void mo5178k(View view, int i11, int i12, int[] iArr, int i13) {
        m8319E(i11, i12, iArr, null, i13);
    }

    /* renamed from: k0 */
    void m8330k0(int i11, int i12, int i13, boolean z11) {
        m8314i0(i11 - getScrollX(), i12 - getScrollY(), i13, z11);
    }

    /* renamed from: l0 */
    void m8331l0(int i11, int i12, boolean z11) {
        m8330k0(i11, i12, 250, z11);
    }

    /* renamed from: m0 */
    public boolean m8332m0(int i11, int i12) {
        return this.f6620N.m7726p(i11, i12);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i11, int i12) {
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o0 */
    public void m8333o0(int i11) {
        this.f6620N.m7728r(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6631x = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f11;
        boolean z11;
        int i11 = 0;
        if (motionEvent.getAction() == 8 && !this.f6633z) {
            if (AbstractC1622z.m8279g(motionEvent, 2)) {
                f11 = motionEvent.getAxisValue(9);
            } else if (AbstractC1622z.m8279g(motionEvent, 4194304)) {
                f11 = motionEvent.getAxisValue(26);
            } else {
                f11 = 0.0f;
            }
            if (f11 != 0.0f) {
                int verticalScrollFactorCompat = (int) (f11 * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i12 = scrollY - verticalScrollFactorCompat;
                if (i12 < 0) {
                    if (m8316z() && !AbstractC1622z.m8279g(motionEvent, 8194)) {
                        AbstractC1634f.m8384d(this.f6627t, (-i12) / getHeight(), 0.5f);
                        this.f6627t.onRelease();
                        invalidate();
                        z11 = 1;
                    }
                    z11 = 0;
                } else if (i12 > scrollRange) {
                    if (m8316z() && !AbstractC1622z.m8279g(motionEvent, 8194)) {
                        AbstractC1634f.m8384d(this.f6628u, (i12 - scrollRange) / getHeight(), 0.5f);
                        this.f6628u.onRelease();
                        invalidate();
                        i11 = 1;
                    }
                    z11 = i11;
                    i11 = scrollRange;
                } else {
                    i11 = i12;
                    z11 = 0;
                }
                if (i11 != scrollY) {
                    super.scrollTo(getScrollX(), i11);
                    return true;
                }
                return z11;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action == 2 && this.f6633z) {
            return true;
        }
        int i11 = action & 255;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 6) {
                            m8305X(motionEvent);
                        }
                    }
                } else {
                    int i12 = this.f6613G;
                    if (i12 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i12);
                        if (findPointerIndex == -1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid pointerId=");
                            sb2.append(i12);
                            sb2.append(" in onInterceptTouchEvent");
                        } else {
                            int y11 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y11 - this.f6629v) > this.f6610D && (2 & getNestedScrollAxes()) == 0) {
                                this.f6633z = true;
                                this.f6629v = y11;
                                m8300S();
                                this.f6607A.addMovement(motionEvent);
                                this.f6616J = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f6633z = false;
            this.f6613G = -1;
            m8306a0();
            if (this.f6626s.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AbstractC1579n0.m7898r0(this);
            }
            m8333o0(0);
        } else {
            int y12 = (int) motionEvent.getY();
            if (!m8297P((int) motionEvent.getX(), y12)) {
                if (!m8315n0(motionEvent) && this.f6626s.isFinished()) {
                    z11 = false;
                }
                this.f6633z = z11;
                m8306a0();
            } else {
                this.f6629v = y12;
                this.f6613G = motionEvent.getPointerId(0);
                m8298Q();
                this.f6607A.addMovement(motionEvent);
                this.f6626s.computeScrollOffset();
                if (!m8315n0(motionEvent) && this.f6626s.isFinished()) {
                    z11 = false;
                }
                this.f6633z = z11;
                m8332m0(2, 0);
            }
        }
        return this.f6633z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int i15 = 0;
        this.f6630w = false;
        View view = this.f6632y;
        if (view != null && m8302U(view, this)) {
            m8310e0(this.f6632y);
        }
        this.f6632y = null;
        if (!this.f6631x) {
            if (this.f6618L != null) {
                scrollTo(getScrollX(), this.f6618L.f6634p);
                this.f6618L = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i15 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i14 - i12) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m8291B = m8291B(scrollY, paddingTop, i15);
            if (m8291B != scrollY) {
                scrollTo(getScrollX(), m8291B);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f6631x = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f6608B && View.MeasureSpec.getMode(i12) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        if (!z11) {
            dispatchNestedFling(0.0f, f12, true);
            m8322L((int) f12);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        mo5178k(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        m8304W(i14, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        mo5176i(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i11, int i12, boolean z11, boolean z12) {
        super.scrollTo(i11, i12);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        View findNextFocusFromRect;
        if (i11 == 2) {
            i11 = 130;
        } else if (i11 == 1) {
            i11 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i11);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i11);
        }
        if (findNextFocusFromRect == null || m8301T(findNextFocusFromRect)) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i11, rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f6618L = savedState;
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6634p = getScrollY();
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        InterfaceC1628c interfaceC1628c = this.f6622P;
        if (interfaceC1628c != null) {
            interfaceC1628c.mo4736a(this, i11, i12, i13, i14);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m8303V(findFocus, 0, i14)) {
            findFocus.getDrawingRect(this.f6625r);
            offsetDescendantRectToMyCoords(findFocus, this.f6625r);
            m8292G(m8317C(this.f6625r));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return mo5184v(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mo5177j(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z11;
        boolean z12;
        m8300S();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6616J = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f6616J);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m8305X(motionEvent);
                                this.f6629v = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f6613G));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f6629v = (int) motionEvent.getY(actionIndex);
                            this.f6613G = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f6633z && getChildCount() > 0 && this.f6626s.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            AbstractC1579n0.m7898r0(this);
                        }
                        this.f6613G = -1;
                        m8294I();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f6613G);
                    if (findPointerIndex == -1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid pointerId=");
                        sb2.append(this.f6613G);
                        sb2.append(" in onTouchEvent");
                    } else {
                        int y11 = (int) motionEvent.getY(findPointerIndex);
                        int i11 = this.f6629v - y11;
                        int m8307b0 = i11 - m8307b0(i11, motionEvent.getX(findPointerIndex));
                        if (!this.f6633z && Math.abs(m8307b0) > this.f6610D) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f6633z = true;
                            m8307b0 = m8307b0 > 0 ? m8307b0 - this.f6610D : m8307b0 + this.f6610D;
                        }
                        int i12 = m8307b0;
                        if (this.f6633z) {
                            if (m8319E(0, i12, this.f6615I, this.f6614H, 0)) {
                                i12 -= this.f6615I[1];
                                this.f6616J += this.f6614H[1];
                            }
                            int i13 = i12;
                            this.f6629v = y11 - this.f6614H[1];
                            int scrollY = getScrollY();
                            int scrollRange = getScrollRange();
                            int overScrollMode = getOverScrollMode();
                            if (overScrollMode != 0 && (overScrollMode != 1 || scrollRange <= 0)) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (m8325Y(0, i13, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !m8324O(0)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            int scrollY2 = getScrollY() - scrollY;
                            int[] iArr = this.f6615I;
                            iArr[1] = 0;
                            m8320F(0, scrollY2, 0, i13 - scrollY2, this.f6614H, 0, iArr);
                            int i14 = this.f6629v;
                            int i15 = this.f6614H[1];
                            this.f6629v = i14 - i15;
                            this.f6616J += i15;
                            if (z11) {
                                int i16 = i13 - this.f6615I[1];
                                int i17 = scrollY + i16;
                                if (i17 < 0) {
                                    AbstractC1634f.m8384d(this.f6627t, (-i16) / getHeight(), motionEvent.getX(findPointerIndex) / getWidth());
                                    if (!this.f6628u.isFinished()) {
                                        this.f6628u.onRelease();
                                    }
                                } else if (i17 > scrollRange) {
                                    AbstractC1634f.m8384d(this.f6628u, i16 / getHeight(), 1.0f - (motionEvent.getX(findPointerIndex) / getWidth()));
                                    if (!this.f6627t.isFinished()) {
                                        this.f6627t.onRelease();
                                    }
                                }
                                if (!this.f6627t.isFinished() || !this.f6628u.isFinished()) {
                                    AbstractC1579n0.m7898r0(this);
                                }
                            }
                            if (z12) {
                                this.f6607A.clear();
                            }
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.f6607A;
                velocityTracker.computeCurrentVelocity(1000, this.f6612F);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f6613G);
                if (Math.abs(yVelocity) >= this.f6611E) {
                    if (!m8293H(yVelocity)) {
                        int i18 = -yVelocity;
                        float f11 = i18;
                        if (!dispatchNestedPreFling(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            m8322L(i18);
                        }
                    }
                } else if (this.f6626s.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AbstractC1579n0.m7898r0(this);
                }
                this.f6613G = -1;
                m8294I();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f6633z && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f6626s.isFinished()) {
                m8312g();
            }
            this.f6629v = (int) motionEvent.getY();
            this.f6613G = motionEvent.getPointerId(0);
            m8332m0(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f6607A;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // androidx.core.view.InterfaceC1543e0
    /* renamed from: r */
    public void mo5182r(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        m8304W(i14, i15, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f6630w) {
            m8310e0(view2);
        } else {
            this.f6632y = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m8311f0(rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (z11) {
            m8306a0();
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f6630w = true;
        super.requestLayout();
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: s */
    public void mo5183s(View view, int i11, int i12, int i13, int i14, int i15) {
        m8304W(i14, i15, null);
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m8291B = m8291B(i11, width, width2);
            int m8291B2 = m8291B(i12, height, height2);
            if (m8291B != getScrollX() || m8291B2 != getScrollY()) {
                super.scrollTo(m8291B, m8291B2);
            }
        }
    }

    public void setFillViewport(boolean z11) {
        if (z11 != this.f6608B) {
            this.f6608B = z11;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        this.f6620N.m7724m(z11);
    }

    public void setOnScrollChangeListener(InterfaceC1628c interfaceC1628c) {
        this.f6622P = interfaceC1628c;
    }

    public void setSmoothScrollingEnabled(boolean z11) {
        this.f6609C = z11;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return m8332m0(i11, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        m8333o0(0);
    }

    @Override // androidx.core.view.InterfaceC1539d0
    /* renamed from: v */
    public boolean mo5184v(View view, View view2, int i11, int i12) {
        return (i11 & 2) != 0;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19199a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6625r = new Rect();
        this.f6630w = true;
        this.f6631x = false;
        this.f6632y = null;
        this.f6633z = false;
        this.f6609C = true;
        this.f6613G = -1;
        this.f6614H = new int[2];
        this.f6615I = new int[2];
        this.f6627t = AbstractC1634f.m8381a(context, attributeSet);
        this.f6628u = AbstractC1634f.m8381a(context, attributeSet);
        this.f6623p = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m8299R();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6606S, i11, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f6619M = new C1547f0(this);
        this.f6620N = new C1535c0(this);
        setNestedScrollingEnabled(true);
        AbstractC1579n0.m7801A0(this, f6605R);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        if (getChildCount() <= 0) {
            super.addView(view, i11);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i11, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
