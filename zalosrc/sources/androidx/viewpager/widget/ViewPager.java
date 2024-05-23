package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import androidx.core.view.accessibility.C1507g0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: A */
    private C2063k f8790A;

    /* renamed from: B */
    private int f8791B;

    /* renamed from: C */
    private Drawable f8792C;

    /* renamed from: D */
    private int f8793D;

    /* renamed from: E */
    private int f8794E;

    /* renamed from: F */
    private float f8795F;

    /* renamed from: G */
    private float f8796G;

    /* renamed from: H */
    private int f8797H;

    /* renamed from: I */
    private int f8798I;

    /* renamed from: J */
    private boolean f8799J;

    /* renamed from: K */
    private boolean f8800K;

    /* renamed from: L */
    private boolean f8801L;

    /* renamed from: M */
    private int f8802M;

    /* renamed from: N */
    private boolean f8803N;

    /* renamed from: O */
    private boolean f8804O;

    /* renamed from: P */
    private int f8805P;

    /* renamed from: Q */
    private int f8806Q;

    /* renamed from: R */
    private int f8807R;

    /* renamed from: S */
    private float f8808S;

    /* renamed from: T */
    private float f8809T;

    /* renamed from: U */
    private float f8810U;

    /* renamed from: V */
    private float f8811V;

    /* renamed from: W */
    private int f8812W;

    /* renamed from: a0 */
    private VelocityTracker f8813a0;

    /* renamed from: b0 */
    private int f8814b0;

    /* renamed from: c0 */
    private int f8815c0;

    /* renamed from: d0 */
    private int f8816d0;

    /* renamed from: e0 */
    private int f8817e0;

    /* renamed from: f0 */
    private boolean f8818f0;

    /* renamed from: g0 */
    private long f8819g0;

    /* renamed from: h0 */
    private EdgeEffect f8820h0;

    /* renamed from: i0 */
    private EdgeEffect f8821i0;

    /* renamed from: j0 */
    private boolean f8822j0;

    /* renamed from: k0 */
    private boolean f8823k0;

    /* renamed from: l0 */
    private boolean f8824l0;

    /* renamed from: m0 */
    private int f8825m0;

    /* renamed from: n0 */
    private List f8826n0;

    /* renamed from: o0 */
    private InterfaceC2061i f8827o0;

    /* renamed from: p */
    private int f8828p;

    /* renamed from: p0 */
    private InterfaceC2061i f8829p0;

    /* renamed from: q */
    private final ArrayList f8830q;

    /* renamed from: q0 */
    private List f8831q0;

    /* renamed from: r */
    private final C2058f f8832r;

    /* renamed from: r0 */
    private InterfaceC2062j f8833r0;

    /* renamed from: s */
    private final Rect f8834s;

    /* renamed from: s0 */
    private int f8835s0;

    /* renamed from: t */
    AbstractC2065a f8836t;

    /* renamed from: t0 */
    private int f8837t0;

    /* renamed from: u */
    int f8838u;

    /* renamed from: u0 */
    private ArrayList f8839u0;

    /* renamed from: v */
    private int f8840v;

    /* renamed from: v0 */
    private final Runnable f8841v0;

    /* renamed from: w */
    private Parcelable f8842w;

    /* renamed from: w0 */
    private int f8843w0;

    /* renamed from: x */
    private ClassLoader f8844x;

    /* renamed from: y */
    private Scroller f8845y;

    /* renamed from: z */
    private boolean f8846z;

    /* renamed from: x0 */
    static final int[] f8787x0 = {R.attr.layout_gravity};

    /* renamed from: y0 */
    private static final Comparator f8788y0 = new C2053a();

    /* renamed from: z0 */
    private static final Interpolator f8789z0 = new InterpolatorC2054b();

    /* renamed from: A0 */
    private static final C2064l f8786A0 = new C2064l();

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f8847a;

        /* renamed from: b */
        public int f8848b;

        /* renamed from: c */
        float f8849c;

        /* renamed from: d */
        boolean f8850d;

        /* renamed from: e */
        int f8851e;

        /* renamed from: f */
        int f8852f;

        public LayoutParams() {
            super(-1, -1);
            this.f8849c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8849c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f8787x0);
            this.f8848b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2052a();

        /* renamed from: r */
        int f8853r;

        /* renamed from: s */
        Parcelable f8854s;

        /* renamed from: t */
        ClassLoader f8855t;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        /* loaded from: classes2.dex */
        static class C2052a implements Parcelable.ClassLoaderCreator {
            C2052a() {
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

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f8853r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f8853r);
            parcel.writeParcelable(this.f8854s, i11);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f8853r = parcel.readInt();
            this.f8854s = parcel.readParcelable(classLoader);
            this.f8855t = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    /* loaded from: classes2.dex */
    static class C2053a implements Comparator {
        C2053a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2058f c2058f, C2058f c2058f2) {
            return c2058f.f8860b - c2058f2.f8860b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    /* loaded from: classes2.dex */
    static class InterpolatorC2054b implements Interpolator {
        InterpolatorC2054b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    /* loaded from: classes2.dex */
    class RunnableC2055c implements Runnable {
        RunnableC2055c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m11185K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    /* loaded from: classes2.dex */
    public class C2056d implements InterfaceC1551g0 {

        /* renamed from: a */
        private final Rect f8857a = new Rect();

        C2056d() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            C1580n1 m7888m0 = AbstractC1579n0.m7888m0(view, c1580n1);
            if (m7888m0.m8064q()) {
                return m7888m0;
            }
            Rect rect = this.f8857a;
            rect.left = m7888m0.m8059k();
            rect.top = m7888m0.m8061m();
            rect.right = m7888m0.m8060l();
            rect.bottom = m7888m0.m8058j();
            int childCount = ViewPager.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                C1580n1 m7879j = AbstractC1579n0.m7879j(ViewPager.this.getChildAt(i11), m7888m0);
                rect.left = Math.min(m7879j.m8059k(), rect.left);
                rect.top = Math.min(m7879j.m8061m(), rect.top);
                rect.right = Math.min(m7879j.m8060l(), rect.right);
                rect.bottom = Math.min(m7879j.m8058j(), rect.bottom);
            }
            return m7888m0.m8066s(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    /* loaded from: classes2.dex */
    public @interface InterfaceC2057e {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    /* loaded from: classes2.dex */
    public static class C2058f {

        /* renamed from: a */
        Object f8859a;

        /* renamed from: b */
        int f8860b;

        /* renamed from: c */
        boolean f8861c;

        /* renamed from: d */
        float f8862d;

        /* renamed from: e */
        float f8863e;

        C2058f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    /* loaded from: classes2.dex */
    public class C2059g extends C1490a {
        C2059g() {
        }

        /* renamed from: n */
        private boolean m11214n() {
            AbstractC2065a abstractC2065a = ViewPager.this.f8836t;
            if (abstractC2065a != null && abstractC2065a.mo11220d() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC2065a abstractC2065a;
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m11214n());
            if (accessibilityEvent.getEventType() == 4096 && (abstractC2065a = ViewPager.this.f8836t) != null) {
                accessibilityEvent.setItemCount(abstractC2065a.mo11220d());
                accessibilityEvent.setFromIndex(ViewPager.this.f8838u);
                accessibilityEvent.setToIndex(ViewPager.this.f8838u);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7619d0(ViewPager.class.getName());
            c1507g0.m7653y0(m11214n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c1507g0.m7612a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c1507g0.m7612a(8192);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: j */
        public boolean mo7513j(View view, int i11, Bundle bundle) {
            if (super.mo7513j(view, i11, bundle)) {
                return true;
            }
            if (i11 != 4096) {
                if (i11 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f8838u - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f8838u + 1);
            return true;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    /* loaded from: classes2.dex */
    public interface InterfaceC2060h {
        /* renamed from: a */
        void mo11158a(ViewPager viewPager, AbstractC2065a abstractC2065a, AbstractC2065a abstractC2065a2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    /* loaded from: classes2.dex */
    public interface InterfaceC2061i {
        void onPageScrollStateChanged(int i11);

        void onPageScrolled(int i11, float f11, int i12);

        void onPageSelected(int i11);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC2062j {
        /* renamed from: a */
        void mo11215a(View view, float f11);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    /* loaded from: classes2.dex */
    private class C2063k extends DataSetObserver {
        C2063k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m11202i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m11202i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    /* loaded from: classes2.dex */
    public static class C2064l implements Comparator {
        C2064l() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z11 = layoutParams.f8847a;
            if (z11 != layoutParams2.f8847a) {
                if (z11) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f8851e - layoutParams2.f8851e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8830q = new ArrayList();
        this.f8832r = new C2058f();
        this.f8834s = new Rect();
        this.f8840v = -1;
        this.f8842w = null;
        this.f8844x = null;
        this.f8795F = -3.4028235E38f;
        this.f8796G = Float.MAX_VALUE;
        this.f8802M = 1;
        this.f8812W = -1;
        this.f8822j0 = true;
        this.f8823k0 = false;
        this.f8841v0 = new RunnableC2055c();
        this.f8843w0 = 0;
        m11180A();
    }

    /* renamed from: B */
    private static boolean m11159B(View view) {
        if (view.getClass().getAnnotation(InterfaceC2057e.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private boolean m11160D(float f11, float f12) {
        if ((f11 < this.f8806Q && f12 > 0.0f) || (f11 > getWidth() - this.f8806Q && f12 < 0.0f)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private void m11161F(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f8812W) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f8808S = motionEvent.getX(i11);
            this.f8812W = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.f8813a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: I */
    private boolean m11162I(int i11) {
        if (this.f8830q.size() == 0) {
            if (this.f8822j0) {
                return false;
            }
            this.f8824l0 = false;
            m11182E(0, 0.0f, 0);
            if (this.f8824l0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C2058f m11179y = m11179y();
        int clientWidth = getClientWidth();
        int i12 = this.f8791B;
        int i13 = clientWidth + i12;
        float f11 = clientWidth;
        int i14 = m11179y.f8860b;
        float f12 = ((i11 / f11) - m11179y.f8863e) / (m11179y.f8862d + (i12 / f11));
        this.f8824l0 = false;
        m11182E(i14, f12, (int) (i13 * f12));
        if (this.f8824l0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: J */
    private boolean m11163J(float f11) {
        boolean z11;
        boolean z12;
        float f12 = this.f8808S - f11;
        this.f8808S = f11;
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.f8795F * clientWidth;
        float f14 = this.f8796G * clientWidth;
        boolean z13 = false;
        C2058f c2058f = (C2058f) this.f8830q.get(0);
        ArrayList arrayList = this.f8830q;
        C2058f c2058f2 = (C2058f) arrayList.get(arrayList.size() - 1);
        if (c2058f.f8860b != 0) {
            f13 = c2058f.f8863e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (c2058f2.f8860b != this.f8836t.mo11220d() - 1) {
            f14 = c2058f2.f8863e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.f8820h0.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.f8821i0.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.f8808S += scrollX - i11;
        scrollTo(i11, getScrollY());
        m11162I(i11);
        return z13;
    }

    /* renamed from: M */
    private void m11164M(int i11, int i12, int i13, int i14) {
        float f11;
        if (i12 > 0 && !this.f8830q.isEmpty()) {
            if (!this.f8845y.isFinished()) {
                this.f8845y.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
            return;
        }
        C2058f m11209z = m11209z(this.f8838u);
        if (m11209z != null) {
            f11 = Math.min(m11209z.f8863e, this.f8796G);
        } else {
            f11 = 0.0f;
        }
        int paddingLeft = (int) (f11 * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            m11171h(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    /* renamed from: N */
    private void m11165N() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i11).getLayoutParams()).f8847a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    /* renamed from: Q */
    private void m11166Q(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    /* renamed from: R */
    private boolean m11167R() {
        this.f8812W = -1;
        m11177q();
        this.f8820h0.onRelease();
        this.f8821i0.onRelease();
        if (!this.f8820h0.isFinished() && !this.f8821i0.isFinished()) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    private void m11168S(int i11, boolean z11, int i12, boolean z12) {
        int i13;
        C2058f m11209z = m11209z(i11);
        if (m11209z != null) {
            i13 = (int) (getClientWidth() * Math.max(this.f8795F, Math.min(m11209z.f8863e, this.f8796G)));
        } else {
            i13 = 0;
        }
        if (z11) {
            m11195Z(i13, 0, i12);
            if (z12) {
                m11174l(i11);
                return;
            }
            return;
        }
        if (z12) {
            m11174l(i11);
        }
        m11171h(false);
        scrollTo(i13, 0);
        m11162I(i13);
    }

    /* renamed from: a0 */
    private void m11169a0() {
        if (this.f8837t0 != 0) {
            ArrayList arrayList = this.f8839u0;
            if (arrayList == null) {
                this.f8839u0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.f8839u0.add(getChildAt(i11));
            }
            Collections.sort(this.f8839u0, f8786A0);
        }
    }

    /* renamed from: f */
    private void m11170f(C2058f c2058f, int i11, C2058f c2058f2) {
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        C2058f c2058f3;
        C2058f c2058f4;
        int mo11220d = this.f8836t.mo11220d();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f11 = this.f8791B / clientWidth;
        } else {
            f11 = 0.0f;
        }
        if (c2058f2 != null) {
            int i14 = c2058f2.f8860b;
            int i15 = c2058f.f8860b;
            if (i14 < i15) {
                float f14 = c2058f2.f8863e + c2058f2.f8862d + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= c2058f.f8860b && i17 < this.f8830q.size()) {
                    Object obj = this.f8830q.get(i17);
                    while (true) {
                        c2058f4 = (C2058f) obj;
                        if (i16 <= c2058f4.f8860b || i17 >= this.f8830q.size() - 1) {
                            break;
                        }
                        i17++;
                        obj = this.f8830q.get(i17);
                    }
                    while (i16 < c2058f4.f8860b) {
                        f14 += this.f8836t.m11223g(i16) + f11;
                        i16++;
                    }
                    c2058f4.f8863e = f14;
                    f14 += c2058f4.f8862d + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.f8830q.size() - 1;
                float f15 = c2058f2.f8863e;
                while (true) {
                    i14--;
                    if (i14 < c2058f.f8860b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f8830q.get(size);
                    while (true) {
                        c2058f3 = (C2058f) obj2;
                        if (i14 >= c2058f3.f8860b || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = this.f8830q.get(size);
                    }
                    while (i14 > c2058f3.f8860b) {
                        f15 -= this.f8836t.m11223g(i14) + f11;
                        i14--;
                    }
                    f15 -= c2058f3.f8862d + f11;
                    c2058f3.f8863e = f15;
                }
            }
        }
        int size2 = this.f8830q.size();
        float f16 = c2058f.f8863e;
        int i18 = c2058f.f8860b;
        int i19 = i18 - 1;
        if (i18 == 0) {
            f12 = f16;
        } else {
            f12 = -3.4028235E38f;
        }
        this.f8795F = f12;
        int i21 = mo11220d - 1;
        if (i18 == i21) {
            f13 = (c2058f.f8862d + f16) - 1.0f;
        } else {
            f13 = Float.MAX_VALUE;
        }
        this.f8796G = f13;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            C2058f c2058f5 = (C2058f) this.f8830q.get(i22);
            while (true) {
                i13 = c2058f5.f8860b;
                if (i19 <= i13) {
                    break;
                }
                f16 -= this.f8836t.m11223g(i19) + f11;
                i19--;
            }
            f16 -= c2058f5.f8862d + f11;
            c2058f5.f8863e = f16;
            if (i13 == 0) {
                this.f8795F = f16;
            }
            i22--;
            i19--;
        }
        float f17 = c2058f.f8863e + c2058f.f8862d + f11;
        int i23 = c2058f.f8860b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            C2058f c2058f6 = (C2058f) this.f8830q.get(i24);
            while (true) {
                i12 = c2058f6.f8860b;
                if (i23 >= i12) {
                    break;
                }
                f17 += this.f8836t.m11223g(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.f8796G = (c2058f6.f8862d + f17) - 1.0f;
            }
            c2058f6.f8863e = f17;
            f17 += c2058f6.f8862d + f11;
            i24++;
            i23++;
        }
        this.f8823k0 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m11171h(boolean z11) {
        boolean z12;
        if (this.f8843w0 == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.f8845y.isFinished()) {
                this.f8845y.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f8845y.getCurrX();
                int currY = this.f8845y.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m11162I(currX);
                    }
                }
            }
        }
        this.f8801L = false;
        for (int i11 = 0; i11 < this.f8830q.size(); i11++) {
            C2058f c2058f = (C2058f) this.f8830q.get(i11);
            if (c2058f.f8861c) {
                c2058f.f8861c = false;
                z12 = true;
            }
        }
        if (z12) {
            if (z11) {
                AbstractC1579n0.m7900s0(this, this.f8841v0);
            } else {
                this.f8841v0.run();
            }
        }
    }

    /* renamed from: j */
    private int m11172j(int i11, float f11, int i12, int i13) {
        float f12;
        if (Math.abs(i13) > this.f8816d0 && Math.abs(i12) > this.f8814b0) {
            if (i12 <= 0) {
                i11++;
            }
        } else {
            if (i11 >= this.f8838u) {
                f12 = 0.4f;
            } else {
                f12 = 0.6f;
            }
            i11 += (int) (f11 + f12);
        }
        if (this.f8830q.size() > 0) {
            return Math.max(((C2058f) this.f8830q.get(0)).f8860b, Math.min(i11, ((C2058f) this.f8830q.get(r4.size() - 1)).f8860b));
        }
        return i11;
    }

    /* renamed from: k */
    private void m11173k(int i11, float f11, int i12) {
        InterfaceC2061i interfaceC2061i = this.f8827o0;
        if (interfaceC2061i != null) {
            interfaceC2061i.onPageScrolled(i11, f11, i12);
        }
        List list = this.f8826n0;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                InterfaceC2061i interfaceC2061i2 = (InterfaceC2061i) this.f8826n0.get(i13);
                if (interfaceC2061i2 != null) {
                    interfaceC2061i2.onPageScrolled(i11, f11, i12);
                }
            }
        }
        InterfaceC2061i interfaceC2061i3 = this.f8829p0;
        if (interfaceC2061i3 != null) {
            interfaceC2061i3.onPageScrolled(i11, f11, i12);
        }
    }

    /* renamed from: l */
    private void m11174l(int i11) {
        InterfaceC2061i interfaceC2061i = this.f8827o0;
        if (interfaceC2061i != null) {
            interfaceC2061i.onPageSelected(i11);
        }
        List list = this.f8826n0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC2061i interfaceC2061i2 = (InterfaceC2061i) this.f8826n0.get(i12);
                if (interfaceC2061i2 != null) {
                    interfaceC2061i2.onPageSelected(i11);
                }
            }
        }
        InterfaceC2061i interfaceC2061i3 = this.f8829p0;
        if (interfaceC2061i3 != null) {
            interfaceC2061i3.onPageSelected(i11);
        }
    }

    /* renamed from: m */
    private void m11175m(int i11) {
        InterfaceC2061i interfaceC2061i = this.f8827o0;
        if (interfaceC2061i != null) {
            interfaceC2061i.onPageScrollStateChanged(i11);
        }
        List list = this.f8826n0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC2061i interfaceC2061i2 = (InterfaceC2061i) this.f8826n0.get(i12);
                if (interfaceC2061i2 != null) {
                    interfaceC2061i2.onPageScrollStateChanged(i11);
                }
            }
        }
        InterfaceC2061i interfaceC2061i3 = this.f8829p0;
        if (interfaceC2061i3 != null) {
            interfaceC2061i3.onPageScrollStateChanged(i11);
        }
    }

    /* renamed from: p */
    private void m11176p(boolean z11) {
        int i11;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (z11) {
                i11 = this.f8835s0;
            } else {
                i11 = 0;
            }
            getChildAt(i12).setLayerType(i11, null);
        }
    }

    /* renamed from: q */
    private void m11177q() {
        this.f8803N = false;
        this.f8804O = false;
        VelocityTracker velocityTracker = this.f8813a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8813a0 = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.f8800K != z11) {
            this.f8800K = z11;
        }
    }

    /* renamed from: v */
    private Rect m11178v(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: y */
    private C2058f m11179y() {
        float f11;
        float f12;
        int i11;
        int clientWidth = getClientWidth();
        float f13 = 0.0f;
        if (clientWidth > 0) {
            f11 = getScrollX() / clientWidth;
        } else {
            f11 = 0.0f;
        }
        if (clientWidth > 0) {
            f12 = this.f8791B / clientWidth;
        } else {
            f12 = 0.0f;
        }
        C2058f c2058f = null;
        float f14 = 0.0f;
        int i12 = -1;
        int i13 = 0;
        boolean z11 = true;
        while (i13 < this.f8830q.size()) {
            C2058f c2058f2 = (C2058f) this.f8830q.get(i13);
            if (!z11 && c2058f2.f8860b != (i11 = i12 + 1)) {
                c2058f2 = this.f8832r;
                c2058f2.f8863e = f13 + f14 + f12;
                c2058f2.f8860b = i11;
                c2058f2.f8862d = this.f8836t.m11223g(i11);
                i13--;
            }
            C2058f c2058f3 = c2058f2;
            f13 = c2058f3.f8863e;
            float f15 = c2058f3.f8862d + f13 + f12;
            if (!z11 && f11 < f13) {
                return c2058f;
            }
            if (f11 >= f15 && i13 != this.f8830q.size() - 1) {
                int i14 = c2058f3.f8860b;
                float f16 = c2058f3.f8862d;
                i13++;
                z11 = false;
                i12 = i14;
                f14 = f16;
                c2058f = c2058f3;
            } else {
                return c2058f3;
            }
        }
        return c2058f;
    }

    /* renamed from: A */
    void m11180A() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f8845y = new Scroller(context, f8789z0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f8807R = viewConfiguration.getScaledPagingTouchSlop();
        this.f8814b0 = (int) (400.0f * f11);
        this.f8815c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8820h0 = new EdgeEffect(context);
        this.f8821i0 = new EdgeEffect(context);
        this.f8816d0 = (int) (25.0f * f11);
        this.f8817e0 = (int) (2.0f * f11);
        this.f8805P = (int) (f11 * 16.0f);
        AbstractC1579n0.m7801A0(this, new C2059g());
        if (AbstractC1579n0.m7808E(this) == 0) {
            AbstractC1579n0.m7823L0(this, 1);
        }
        AbstractC1579n0.m7833Q0(this, new C2056d());
    }

    /* renamed from: C */
    public boolean m11181C() {
        return this.f8818f0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void m11182E(int i11, float f11, int i12) {
        int max;
        int i13;
        int left;
        if (this.f8825m0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f8847a) {
                    int i15 = layoutParams.f8848b & 7;
                    if (i15 != 1) {
                        if (i15 != 3) {
                            if (i15 != 5) {
                                i13 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i13 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i13;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i13 = paddingLeft;
                    paddingLeft = i16;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i13;
                }
            }
        }
        m11173k(i11, f11, i12);
        if (this.f8833r0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!((LayoutParams) childAt2.getLayoutParams()).f8847a) {
                    this.f8833r0.mo11215a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.f8824l0 = true;
    }

    /* renamed from: G */
    boolean m11183G() {
        int i11 = this.f8838u;
        if (i11 > 0) {
            m11189T(i11 - 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: H */
    boolean m11184H() {
        AbstractC2065a abstractC2065a = this.f8836t;
        if (abstractC2065a != null && this.f8838u < abstractC2065a.mo11220d() - 1) {
            m11189T(this.f8838u + 1, true);
            return true;
        }
        return false;
    }

    /* renamed from: K */
    void m11185K() {
        m11186L(this.f8838u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:            if (r9 == r10) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:            r8 = null;     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m11186L(int i11) {
        C2058f c2058f;
        String hexString;
        C2058f c2058f2;
        C2058f c2058f3;
        C2058f m11208x;
        C2058f c2058f4;
        float paddingLeft;
        C2058f c2058f5;
        float paddingRight;
        C2058f c2058f6;
        int i12 = this.f8838u;
        if (i12 != i11) {
            c2058f = m11209z(i12);
            this.f8838u = i11;
        } else {
            c2058f = null;
        }
        if (this.f8836t == null) {
            m11169a0();
            return;
        }
        if (this.f8801L) {
            m11169a0();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f8836t.m11234r(this);
        int i13 = this.f8802M;
        int max = Math.max(0, this.f8838u - i13);
        int mo11220d = this.f8836t.mo11220d();
        int min = Math.min(mo11220d - 1, this.f8838u + i13);
        if (mo11220d == this.f8828p) {
            int i14 = 0;
            while (true) {
                if (i14 >= this.f8830q.size()) {
                    break;
                }
                c2058f2 = (C2058f) this.f8830q.get(i14);
                int i15 = c2058f2.f8860b;
                int i16 = this.f8838u;
                if (i15 < i16) {
                    i14++;
                }
            }
            if (c2058f2 == null && mo11220d > 0) {
                c2058f2 = m11196a(this.f8838u, i14);
            }
            if (c2058f2 != null) {
                int i17 = i14 - 1;
                if (i17 >= 0) {
                    c2058f4 = (C2058f) this.f8830q.get(i17);
                } else {
                    c2058f4 = null;
                }
                int clientWidth = getClientWidth();
                if (clientWidth <= 0) {
                    paddingLeft = 0.0f;
                } else {
                    paddingLeft = (2.0f - c2058f2.f8862d) + (getPaddingLeft() / clientWidth);
                }
                float f11 = 0.0f;
                for (int i18 = this.f8838u - 1; i18 >= 0; i18--) {
                    if (f11 >= paddingLeft && i18 < max) {
                        if (c2058f4 == null) {
                            break;
                        }
                        if (i18 == c2058f4.f8860b && !c2058f4.f8861c) {
                            this.f8830q.remove(i17);
                            this.f8836t.mo11217a(this, i18, c2058f4.f8859a);
                            i17--;
                            i14--;
                            if (i17 >= 0) {
                                c2058f6 = (C2058f) this.f8830q.get(i17);
                                c2058f4 = c2058f6;
                            }
                            c2058f6 = null;
                            c2058f4 = c2058f6;
                        }
                    } else if (c2058f4 != null && i18 == c2058f4.f8860b) {
                        f11 += c2058f4.f8862d;
                        i17--;
                        if (i17 >= 0) {
                            c2058f6 = (C2058f) this.f8830q.get(i17);
                            c2058f4 = c2058f6;
                        }
                        c2058f6 = null;
                        c2058f4 = c2058f6;
                    } else {
                        f11 += m11196a(i18, i17 + 1).f8862d;
                        i14++;
                        if (i17 >= 0) {
                            c2058f6 = (C2058f) this.f8830q.get(i17);
                            c2058f4 = c2058f6;
                        }
                        c2058f6 = null;
                        c2058f4 = c2058f6;
                    }
                }
                float f12 = c2058f2.f8862d;
                int i19 = i14 + 1;
                if (f12 < 2.0f) {
                    if (i19 < this.f8830q.size()) {
                        c2058f5 = (C2058f) this.f8830q.get(i19);
                    } else {
                        c2058f5 = null;
                    }
                    if (clientWidth <= 0) {
                        paddingRight = 0.0f;
                    } else {
                        paddingRight = (getPaddingRight() / clientWidth) + 2.0f;
                    }
                    int i21 = this.f8838u;
                    while (true) {
                        i21++;
                        if (i21 >= mo11220d) {
                            break;
                        }
                        if (f12 >= paddingRight && i21 > min) {
                            if (c2058f5 == null) {
                                break;
                            }
                            if (i21 == c2058f5.f8860b && !c2058f5.f8861c) {
                                this.f8830q.remove(i19);
                                this.f8836t.mo11217a(this, i21, c2058f5.f8859a);
                                if (i19 < this.f8830q.size()) {
                                    c2058f5 = (C2058f) this.f8830q.get(i19);
                                } else {
                                    c2058f5 = null;
                                }
                            }
                        } else if (c2058f5 != null && i21 == c2058f5.f8860b) {
                            f12 += c2058f5.f8862d;
                            i19++;
                            if (i19 >= this.f8830q.size()) {
                                c2058f5 = null;
                            } else {
                                c2058f5 = (C2058f) this.f8830q.get(i19);
                            }
                        } else {
                            C2058f m11196a = m11196a(i21, i19);
                            i19++;
                            f12 += m11196a.f8862d;
                            if (i19 >= this.f8830q.size()) {
                                c2058f5 = null;
                            } else {
                                c2058f5 = (C2058f) this.f8830q.get(i19);
                            }
                        }
                    }
                }
                m11170f(c2058f2, i14, c2058f);
                this.f8836t.m11231o(this, this.f8838u, c2058f2.f8859a);
            }
            this.f8836t.m11219c(this);
            int childCount = getChildCount();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt = getChildAt(i22);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f8852f = i22;
                if (!layoutParams.f8847a && layoutParams.f8849c == 0.0f && (m11208x = m11208x(childAt)) != null) {
                    layoutParams.f8849c = m11208x.f8862d;
                    layoutParams.f8851e = m11208x.f8860b;
                }
            }
            m11169a0();
            if (hasFocus()) {
                View findFocus = findFocus();
                if (findFocus != null) {
                    c2058f3 = m11207w(findFocus);
                } else {
                    c2058f3 = null;
                }
                if (c2058f3 == null || c2058f3.f8860b != this.f8838u) {
                    for (int i23 = 0; i23 < getChildCount(); i23++) {
                        View childAt2 = getChildAt(i23);
                        C2058f m11208x2 = m11208x(childAt2);
                        if (m11208x2 != null && m11208x2.f8860b == this.f8838u && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f8828p + ", found: " + mo11220d + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f8836t.getClass());
    }

    /* renamed from: O */
    public void m11187O(InterfaceC2060h interfaceC2060h) {
        List list = this.f8831q0;
        if (list != null) {
            list.remove(interfaceC2060h);
        }
    }

    /* renamed from: P */
    public void m11188P(InterfaceC2061i interfaceC2061i) {
        List list = this.f8826n0;
        if (list != null) {
            list.remove(interfaceC2061i);
        }
    }

    /* renamed from: T */
    public void m11189T(int i11, boolean z11) {
        this.f8801L = false;
        m11190U(i11, z11, false);
    }

    /* renamed from: U */
    void m11190U(int i11, boolean z11, boolean z12) {
        m11191V(i11, z11, z12, 0);
    }

    /* renamed from: V */
    void m11191V(int i11, boolean z11, boolean z12, int i12) {
        AbstractC2065a abstractC2065a = this.f8836t;
        boolean z13 = false;
        if (abstractC2065a != null && abstractC2065a.mo11220d() > 0) {
            if (!z12 && this.f8838u == i11 && this.f8830q.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i11 < 0) {
                i11 = 0;
            } else if (i11 >= this.f8836t.mo11220d()) {
                i11 = this.f8836t.mo11220d() - 1;
            }
            int i13 = this.f8802M;
            int i14 = this.f8838u;
            if (i11 > i14 + i13 || i11 < i14 - i13) {
                for (int i15 = 0; i15 < this.f8830q.size(); i15++) {
                    ((C2058f) this.f8830q.get(i15)).f8861c = true;
                }
            }
            if (this.f8838u != i11) {
                z13 = true;
            }
            if (this.f8822j0) {
                this.f8838u = i11;
                if (z13) {
                    m11174l(i11);
                }
                requestLayout();
                return;
            }
            m11186L(i11);
            m11168S(i11, z11, i12, z13);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public InterfaceC2061i m11192W(InterfaceC2061i interfaceC2061i) {
        InterfaceC2061i interfaceC2061i2 = this.f8829p0;
        this.f8829p0 = interfaceC2061i;
        return interfaceC2061i2;
    }

    /* renamed from: X */
    public void m11193X(boolean z11, InterfaceC2062j interfaceC2062j) {
        m11194Y(z11, interfaceC2062j, 2);
    }

    /* renamed from: Y */
    public void m11194Y(boolean z11, InterfaceC2062j interfaceC2062j, int i11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i12 = 1;
        if (interfaceC2062j != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f8833r0 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 != z13) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f8833r0 = interfaceC2062j;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            if (z11) {
                i12 = 2;
            }
            this.f8837t0 = i12;
            this.f8835s0 = i11;
        } else {
            this.f8837t0 = 0;
        }
        if (z14) {
            m11185K();
        }
    }

    /* renamed from: Z */
    void m11195Z(int i11, int i12, int i13) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f8845y;
        if (scroller != null && !scroller.isFinished()) {
            if (this.f8846z) {
                scrollX = this.f8845y.getCurrX();
            } else {
                scrollX = this.f8845y.getStartX();
            }
            this.f8845y.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            m11171h(false);
            m11185K();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i17;
        float m11203n = f12 + (m11203n(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f11)) * f12);
        int abs2 = Math.abs(i13);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(m11203n / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i15) / ((f11 * this.f8836t.m11223g(this.f8838u)) + this.f8791B)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.f8846z = false;
        this.f8845y.startScroll(i14, scrollY, i15, i16, min);
        AbstractC1579n0.m7898r0(this);
    }

    /* renamed from: a */
    C2058f m11196a(int i11, int i12) {
        C2058f c2058f = new C2058f();
        c2058f.f8860b = i11;
        c2058f.f8859a = this.f8836t.mo11224h(this, i11);
        c2058f.f8862d = this.f8836t.m11223g(i11);
        if (i12 >= 0 && i12 < this.f8830q.size()) {
            this.f8830q.add(i12, c2058f);
        } else {
            this.f8830q.add(c2058f);
        }
        return c2058f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i11, int i12) {
        C2058f m11208x;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (m11208x = m11208x(childAt)) != null && m11208x.f8860b == this.f8838u) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList arrayList) {
        C2058f m11208x;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (m11208x = m11208x(childAt)) != null && m11208x.f8860b == this.f8838u) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean m11159B = layoutParams2.f8847a | m11159B(view);
        layoutParams2.f8847a = m11159B;
        if (this.f8799J) {
            if (!m11159B) {
                layoutParams2.f8850d = true;
                addViewInLayout(view, i11, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i11, layoutParams);
    }

    /* renamed from: b */
    public void m11197b(InterfaceC2060h interfaceC2060h) {
        if (this.f8831q0 == null) {
            this.f8831q0 = new ArrayList();
        }
        this.f8831q0.add(interfaceC2060h);
    }

    /* renamed from: c */
    public void m11198c(InterfaceC2061i interfaceC2061i) {
        if (this.f8826n0 == null) {
            this.f8826n0 = new ArrayList();
        }
        this.f8826n0.add(interfaceC2061i);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.f8836t == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            if (scrollX <= ((int) (clientWidth * this.f8795F))) {
                return false;
            }
            return true;
        }
        if (i11 <= 0 || scrollX >= ((int) (clientWidth * this.f8796G))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f8846z = true;
        if (!this.f8845y.isFinished() && this.f8845y.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f8845y.getCurrX();
            int currY = this.f8845y.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m11162I(currX)) {
                    this.f8845y.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            AbstractC1579n0.m7898r0(this);
            return;
        }
        m11171h(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m11199d(int i11) {
        View findNextFocus;
        boolean m11183G;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("arrowScroll tried to find focus based on non-child current focused view ");
                sb3.append(sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i11 == 17) {
                    int i12 = m11178v(this.f8834s, findNextFocus).left;
                    int i13 = m11178v(this.f8834s, findFocus).left;
                    if (findFocus != null && i12 >= i13) {
                        m11183G = m11183G();
                    } else {
                        m11183G = findNextFocus.requestFocus();
                    }
                } else {
                    if (i11 == 66) {
                        int i14 = m11178v(this.f8834s, findNextFocus).left;
                        int i15 = m11178v(this.f8834s, findFocus).left;
                        if (findFocus != null && i14 <= i15) {
                            m11183G = m11184H();
                        } else {
                            m11183G = findNextFocus.requestFocus();
                        }
                    }
                    m11183G = false;
                }
            } else if (i11 == 17 && i11 != 1) {
                if (i11 == 66 || i11 == 2) {
                    m11183G = m11184H();
                }
                m11183G = false;
            } else {
                m11183G = m11183G();
            }
            if (m11183G) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
            }
            return m11183G;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        if (findNextFocus == null) {
        }
        if (i11 == 17) {
        }
        m11183G = m11183G();
        if (m11183G) {
        }
        return m11183G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !m11205s(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C2058f m11208x;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (m11208x = m11208x(childAt)) != null && m11208x.f8860b == this.f8838u && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        AbstractC2065a abstractC2065a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC2065a = this.f8836t) == null || abstractC2065a.mo11220d() <= 1)) {
            this.f8820h0.finish();
            this.f8821i0.finish();
            return;
        }
        if (!this.f8820h0.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.f8795F * width);
            this.f8820h0.setSize(height, width);
            z11 = this.f8820h0.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z11 = false;
        }
        if (!this.f8821i0.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f8796G + 1.0f)) * width2);
            this.f8821i0.setSize(height2, width2);
            z11 |= this.f8821i0.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z11) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8792C;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean m11200e() {
        if (this.f8803N) {
            return false;
        }
        this.f8818f0 = true;
        setScrollState(1);
        this.f8808S = 0.0f;
        this.f8810U = 0.0f;
        VelocityTracker velocityTracker = this.f8813a0;
        if (velocityTracker == null) {
            this.f8813a0 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f8813a0.addMovement(obtain);
        obtain.recycle();
        this.f8819g0 = uptimeMillis;
        return true;
    }

    /* renamed from: g */
    protected boolean m11201g(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && m11201g(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z11 && view.canScrollHorizontally(-i11)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2065a getAdapter() {
        return this.f8836t;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        if (this.f8837t0 == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((LayoutParams) ((View) this.f8839u0.get(i12)).getLayoutParams()).f8852f;
    }

    public int getCurrentItem() {
        return this.f8838u;
    }

    public int getOffscreenPageLimit() {
        return this.f8802M;
    }

    public int getPageMargin() {
        return this.f8791B;
    }

    /* renamed from: i */
    void m11202i() {
        boolean z11;
        int mo11220d = this.f8836t.mo11220d();
        this.f8828p = mo11220d;
        if (this.f8830q.size() < (this.f8802M * 2) + 1 && this.f8830q.size() < mo11220d) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.f8838u;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.f8830q.size()) {
            C2058f c2058f = (C2058f) this.f8830q.get(i12);
            int mo11221e = this.f8836t.mo11221e(c2058f.f8859a);
            if (mo11221e != -1) {
                if (mo11221e == -2) {
                    this.f8830q.remove(i12);
                    i12--;
                    if (!z12) {
                        this.f8836t.m11234r(this);
                        z12 = true;
                    }
                    this.f8836t.mo11217a(this, c2058f.f8860b, c2058f.f8859a);
                    int i13 = this.f8838u;
                    if (i13 == c2058f.f8860b) {
                        i11 = Math.max(0, Math.min(i13, mo11220d - 1));
                    }
                } else {
                    int i14 = c2058f.f8860b;
                    if (i14 != mo11221e) {
                        if (i14 == this.f8838u) {
                            i11 = mo11221e;
                        }
                        c2058f.f8860b = mo11221e;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.f8836t.m11219c(this);
        }
        Collections.sort(this.f8830q, f8788y0);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i15).getLayoutParams();
                if (!layoutParams.f8847a) {
                    layoutParams.f8849c = 0.0f;
                }
            }
            m11190U(i11, false, true);
            requestLayout();
        }
    }

    /* renamed from: n */
    float m11203n(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8822j0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f8841v0);
        Scroller scroller = this.f8845y;
        if (scroller != null && !scroller.isFinished()) {
            this.f8845y.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.f8791B > 0 && this.f8792C != null && this.f8830q.size() > 0 && this.f8836t != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f13 = this.f8791B / width;
            int i12 = 0;
            C2058f c2058f = (C2058f) this.f8830q.get(0);
            float f14 = c2058f.f8863e;
            int size = this.f8830q.size();
            int i13 = c2058f.f8860b;
            int i14 = ((C2058f) this.f8830q.get(size - 1)).f8860b;
            while (i13 < i14) {
                while (true) {
                    i11 = c2058f.f8860b;
                    if (i13 <= i11 || i12 >= size) {
                        break;
                    }
                    i12++;
                    c2058f = (C2058f) this.f8830q.get(i12);
                }
                if (i13 == i11) {
                    float f15 = c2058f.f8863e;
                    float f16 = c2058f.f8862d;
                    f11 = (f15 + f16) * width;
                    f14 = f15 + f16 + f13;
                } else {
                    float m11223g = this.f8836t.m11223g(i13);
                    f11 = (f14 + m11223g) * width;
                    f14 += m11223g + f13;
                }
                if (this.f8791B + f11 > scrollX) {
                    f12 = f13;
                    this.f8792C.setBounds(Math.round(f11), this.f8793D, Math.round(this.f8791B + f11), this.f8794E);
                    this.f8792C.draw(canvas);
                } else {
                    f12 = f13;
                }
                if (f11 <= scrollX + r2) {
                    i13++;
                    f13 = f12;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f11;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f8803N) {
                    return true;
                }
                if (this.f8804O) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m11161F(motionEvent);
                    }
                } else {
                    int i11 = this.f8812W;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float f12 = x11 - this.f8808S;
                        float abs = Math.abs(f12);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.f8811V);
                        if (f12 != 0.0f && !m11160D(this.f8808S, f12) && m11201g(this, false, (int) f12, (int) x11, (int) y11)) {
                            this.f8808S = x11;
                            this.f8809T = y11;
                            this.f8804O = true;
                            return false;
                        }
                        int i12 = this.f8807R;
                        if (abs > i12 && abs * 0.5f > abs2) {
                            this.f8803N = true;
                            m11166Q(true);
                            setScrollState(1);
                            float f13 = this.f8810U;
                            float f14 = this.f8807R;
                            if (f12 > 0.0f) {
                                f11 = f13 + f14;
                            } else {
                                f11 = f13 - f14;
                            }
                            this.f8808S = f11;
                            this.f8809T = y11;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i12) {
                            this.f8804O = true;
                        }
                        if (this.f8803N && m11163J(x11)) {
                            AbstractC1579n0.m7898r0(this);
                        }
                    }
                }
            } else {
                float x12 = motionEvent.getX();
                this.f8810U = x12;
                this.f8808S = x12;
                float y12 = motionEvent.getY();
                this.f8811V = y12;
                this.f8809T = y12;
                this.f8812W = motionEvent.getPointerId(0);
                this.f8804O = false;
                this.f8846z = true;
                this.f8845y.computeScrollOffset();
                if (this.f8843w0 == 2 && Math.abs(this.f8845y.getFinalX() - this.f8845y.getCurrX()) > this.f8817e0) {
                    this.f8845y.abortAnimation();
                    this.f8801L = false;
                    m11185K();
                    this.f8803N = true;
                    m11166Q(true);
                    setScrollState(1);
                } else {
                    m11171h(false);
                    this.f8803N = false;
                }
            }
            if (this.f8813a0 == null) {
                this.f8813a0 = VelocityTracker.obtain();
            }
            this.f8813a0.addMovement(motionEvent);
            return this.f8803N;
        }
        m11167R();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        C2058f m11208x;
        int max;
        int i15;
        int max2;
        int i16;
        int childCount = getChildCount();
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f8847a) {
                    int i22 = layoutParams.f8848b;
                    int i23 = i22 & 7;
                    int i24 = i22 & 112;
                    if (i23 != 1) {
                        if (i23 != 3) {
                            if (i23 != 5) {
                                i15 = paddingLeft;
                            } else {
                                max = (i17 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i15 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i24 == 16) {
                            if (i24 != 48) {
                                if (i24 != 80) {
                                    i16 = paddingTop;
                                } else {
                                    max2 = (i18 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i16 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i25 = paddingLeft + scrollX;
                            childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                            i19++;
                            paddingTop = i16;
                            paddingLeft = i15;
                        } else {
                            max2 = Math.max((i18 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i26 = max2;
                        i16 = paddingTop;
                        paddingTop = i26;
                        int i252 = paddingLeft + scrollX;
                        childAt.layout(i252, paddingTop, childAt.getMeasuredWidth() + i252, paddingTop + childAt.getMeasuredHeight());
                        i19++;
                        paddingTop = i16;
                        paddingLeft = i15;
                    } else {
                        max = Math.max((i17 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i27 = max;
                    i15 = paddingLeft;
                    paddingLeft = i27;
                    if (i24 == 16) {
                    }
                    int i262 = max2;
                    i16 = paddingTop;
                    paddingTop = i262;
                    int i2522 = paddingLeft + scrollX;
                    childAt.layout(i2522, paddingTop, childAt.getMeasuredWidth() + i2522, paddingTop + childAt.getMeasuredHeight());
                    i19++;
                    paddingTop = i16;
                    paddingLeft = i15;
                }
            }
        }
        int i28 = (i17 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f8847a && (m11208x = m11208x(childAt2)) != null) {
                    float f11 = i28;
                    int i31 = ((int) (m11208x.f8863e * f11)) + paddingLeft;
                    if (layoutParams2.f8850d) {
                        layoutParams2.f8850d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f11 * layoutParams2.f8849c), 1073741824), View.MeasureSpec.makeMeasureSpec((i18 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i31, paddingTop, childAt2.getMeasuredWidth() + i31, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f8793D = paddingTop;
        this.f8794E = i18 - paddingBottom;
        this.f8825m0 = i19;
        if (this.f8822j0) {
            z12 = false;
            m11168S(this.f8838u, false, 0, false);
        } else {
            z12 = false;
        }
        this.f8822j0 = z12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i11, int i12) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.f8806Q = Math.min(measuredWidth / 10, this.f8805P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            boolean z12 = true;
            int i17 = 1073741824;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f8847a) {
                int i18 = layoutParams2.f8848b;
                int i19 = i18 & 7;
                int i21 = i18 & 112;
                if (i21 != 48 && i21 != 80) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i19 != 3 && i19 != 5) {
                    z12 = false;
                }
                int i22 = Integer.MIN_VALUE;
                if (z11) {
                    i22 = 1073741824;
                } else if (z12) {
                    i13 = 1073741824;
                    i14 = ((ViewGroup.LayoutParams) layoutParams2).width;
                    if (i14 == -2) {
                        if (i14 == -1) {
                            i14 = paddingLeft;
                        }
                        i22 = 1073741824;
                    } else {
                        i14 = paddingLeft;
                    }
                    i15 = ((ViewGroup.LayoutParams) layoutParams2).height;
                    if (i15 == -2) {
                        if (i15 == -1) {
                            i15 = measuredHeight;
                        }
                    } else {
                        i15 = measuredHeight;
                        i17 = i13;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i22), View.MeasureSpec.makeMeasureSpec(i15, i17));
                    if (!z11) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z12) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i13 = Integer.MIN_VALUE;
                i14 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i14 == -2) {
                }
                i15 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i15 == -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i22), View.MeasureSpec.makeMeasureSpec(i15, i17));
                if (!z11) {
                }
            }
            i16++;
        }
        this.f8797H = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f8798I = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f8799J = true;
        m11185K();
        this.f8799J = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f8847a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.f8849c), 1073741824), this.f8798I);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        C2058f m11208x;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (m11208x = m11208x(childAt)) != null && m11208x.f8860b == this.f8838u && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        AbstractC2065a abstractC2065a = this.f8836t;
        if (abstractC2065a != null) {
            abstractC2065a.m11228l(savedState.f8854s, savedState.f8855t);
            m11190U(savedState.f8853r, false, true);
        } else {
            this.f8840v = savedState.f8853r;
            this.f8842w = savedState.f8854s;
            this.f8844x = savedState.f8855t;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f8853r = this.f8838u;
        AbstractC2065a abstractC2065a = this.f8836t;
        if (abstractC2065a != null) {
            savedState.f8854s = abstractC2065a.m11229m();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.f8791B;
            m11164M(i11, i13, i15, i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC2065a abstractC2065a;
        boolean m11167R;
        float f11;
        if (this.f8818f0) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC2065a = this.f8836t) == null || abstractC2065a.mo11220d() == 0) {
            return false;
        }
        if (this.f8813a0 == null) {
            this.f8813a0 = VelocityTracker.obtain();
        }
        this.f8813a0.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m11161F(motionEvent);
                                this.f8808S = motionEvent.getX(motionEvent.findPointerIndex(this.f8812W));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f8808S = motionEvent.getX(actionIndex);
                            this.f8812W = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.f8803N) {
                        m11168S(this.f8838u, true, 0, false);
                        m11167R = m11167R();
                        if (m11167R) {
                            AbstractC1579n0.m7898r0(this);
                        }
                    }
                } else {
                    if (!this.f8803N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f8812W);
                        if (findPointerIndex == -1) {
                            m11167R = m11167R();
                            if (m11167R) {
                            }
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.f8808S);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.f8809T);
                            if (abs > this.f8807R && abs > abs2) {
                                this.f8803N = true;
                                m11166Q(true);
                                float f12 = this.f8810U;
                                if (x11 - f12 > 0.0f) {
                                    f11 = f12 + this.f8807R;
                                } else {
                                    f11 = f12 - this.f8807R;
                                }
                                this.f8808S = f11;
                                this.f8809T = y11;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.f8803N) {
                        m11167R = m11163J(motionEvent.getX(motionEvent.findPointerIndex(this.f8812W)));
                        if (m11167R) {
                        }
                    }
                }
            } else if (this.f8803N) {
                VelocityTracker velocityTracker = this.f8813a0;
                velocityTracker.computeCurrentVelocity(1000, this.f8815c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f8812W);
                this.f8801L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C2058f m11179y = m11179y();
                float f13 = clientWidth;
                m11191V(m11172j(m11179y.f8860b, ((scrollX / f13) - m11179y.f8863e) / (m11179y.f8862d + (this.f8791B / f13)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f8812W)) - this.f8810U)), true, true, xVelocity);
                m11167R = m11167R();
                if (m11167R) {
                }
            }
        } else {
            this.f8845y.abortAnimation();
            this.f8801L = false;
            m11185K();
            float x12 = motionEvent.getX();
            this.f8810U = x12;
            this.f8808S = x12;
            float y12 = motionEvent.getY();
            this.f8811V = y12;
            this.f8809T = y12;
            this.f8812W = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* renamed from: r */
    public void m11204r() {
        if (this.f8818f0) {
            if (this.f8836t != null) {
                VelocityTracker velocityTracker = this.f8813a0;
                velocityTracker.computeCurrentVelocity(1000, this.f8815c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f8812W);
                this.f8801L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C2058f m11179y = m11179y();
                m11191V(m11172j(m11179y.f8860b, ((scrollX / clientWidth) - m11179y.f8863e) / m11179y.f8862d, xVelocity, (int) (this.f8808S - this.f8810U)), true, true, xVelocity);
            }
            m11177q();
            this.f8818f0 = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f8799J) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public boolean m11205s(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return m11199d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return m11199d(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return m11184H();
                    }
                    return m11199d(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return m11183G();
                }
                return m11199d(17);
            }
        }
        return false;
    }

    public void setAdapter(AbstractC2065a abstractC2065a) {
        AbstractC2065a abstractC2065a2 = this.f8836t;
        if (abstractC2065a2 != null) {
            abstractC2065a2.m11232p(null);
            this.f8836t.m11234r(this);
            for (int i11 = 0; i11 < this.f8830q.size(); i11++) {
                C2058f c2058f = (C2058f) this.f8830q.get(i11);
                this.f8836t.mo11217a(this, c2058f.f8860b, c2058f.f8859a);
            }
            this.f8836t.m11219c(this);
            this.f8830q.clear();
            m11165N();
            this.f8838u = 0;
            scrollTo(0, 0);
        }
        AbstractC2065a abstractC2065a3 = this.f8836t;
        this.f8836t = abstractC2065a;
        this.f8828p = 0;
        if (abstractC2065a != null) {
            if (this.f8790A == null) {
                this.f8790A = new C2063k();
            }
            this.f8836t.m11232p(this.f8790A);
            this.f8801L = false;
            boolean z11 = this.f8822j0;
            this.f8822j0 = true;
            this.f8828p = this.f8836t.mo11220d();
            if (this.f8840v >= 0) {
                this.f8836t.m11228l(this.f8842w, this.f8844x);
                m11190U(this.f8840v, false, true);
                this.f8840v = -1;
                this.f8842w = null;
                this.f8844x = null;
            } else if (!z11) {
                m11185K();
            } else {
                requestLayout();
            }
        }
        List list = this.f8831q0;
        if (list != null && !list.isEmpty()) {
            int size = this.f8831q0.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC2060h) this.f8831q0.get(i12)).mo11158a(this, abstractC2065a3, abstractC2065a);
            }
        }
    }

    public void setCurrentItem(int i11) {
        this.f8801L = false;
        m11190U(i11, !this.f8822j0, false);
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Requested offscreen page limit ");
            sb2.append(i11);
            sb2.append(" too small; defaulting to ");
            sb2.append(1);
            i11 = 1;
        }
        if (i11 != this.f8802M) {
            this.f8802M = i11;
            m11185K();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC2061i interfaceC2061i) {
        this.f8827o0 = interfaceC2061i;
    }

    public void setPageMargin(int i11) {
        int i12 = this.f8791B;
        this.f8791B = i11;
        int width = getWidth();
        m11164M(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f8792C = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i11) {
        boolean z11;
        if (this.f8843w0 == i11) {
            return;
        }
        this.f8843w0 = i11;
        if (this.f8833r0 != null) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m11176p(z11);
        }
        m11175m(i11);
    }

    /* renamed from: u */
    public void m11206u(float f11) {
        if (this.f8818f0) {
            if (this.f8836t == null) {
                return;
            }
            this.f8808S += f11;
            float scrollX = getScrollX() - f11;
            float clientWidth = getClientWidth();
            float f12 = this.f8795F * clientWidth;
            float f13 = this.f8796G * clientWidth;
            C2058f c2058f = (C2058f) this.f8830q.get(0);
            C2058f c2058f2 = (C2058f) this.f8830q.get(r4.size() - 1);
            if (c2058f.f8860b != 0) {
                f12 = c2058f.f8863e * clientWidth;
            }
            if (c2058f2.f8860b != this.f8836t.mo11220d() - 1) {
                f13 = c2058f2.f8863e * clientWidth;
            }
            if (scrollX < f12) {
                scrollX = f12;
            } else if (scrollX > f13) {
                scrollX = f13;
            }
            int i11 = (int) scrollX;
            this.f8808S += scrollX - i11;
            scrollTo(i11, getScrollY());
            m11162I(i11);
            MotionEvent obtain = MotionEvent.obtain(this.f8819g0, SystemClock.uptimeMillis(), 2, this.f8808S, 0.0f, 0);
            this.f8813a0.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f8792C) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    C2058f m11207w(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return m11208x(view);
            }
        }
    }

    /* renamed from: x */
    C2058f m11208x(View view) {
        for (int i11 = 0; i11 < this.f8830q.size(); i11++) {
            C2058f c2058f = (C2058f) this.f8830q.get(i11);
            if (this.f8836t.mo11225i(view, c2058f.f8859a)) {
                return c2058f;
            }
        }
        return null;
    }

    /* renamed from: z */
    C2058f m11209z(int i11) {
        for (int i12 = 0; i12 < this.f8830q.size(); i12++) {
            C2058f c2058f = (C2058f) this.f8830q.get(i12);
            if (c2058f.f8860b == i11) {
                return c2058f;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(AbstractC1388a.m6964f(getContext(), i11));
    }
}
