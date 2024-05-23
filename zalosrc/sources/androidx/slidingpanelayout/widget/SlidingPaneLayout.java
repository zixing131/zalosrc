package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import p337m1.C22712c;

/* loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: A */
    private int f8240A;

    /* renamed from: B */
    private float f8241B;

    /* renamed from: C */
    private float f8242C;

    /* renamed from: D */
    final C22712c f8243D;

    /* renamed from: E */
    boolean f8244E;

    /* renamed from: F */
    private boolean f8245F;

    /* renamed from: G */
    private final Rect f8246G;

    /* renamed from: H */
    final ArrayList f8247H;

    /* renamed from: p */
    private int f8248p;

    /* renamed from: q */
    private int f8249q;

    /* renamed from: r */
    private Drawable f8250r;

    /* renamed from: s */
    private Drawable f8251s;

    /* renamed from: t */
    private final int f8252t;

    /* renamed from: u */
    private boolean f8253u;

    /* renamed from: v */
    View f8254v;

    /* renamed from: w */
    float f8255w;

    /* renamed from: x */
    private float f8256x;

    /* renamed from: y */
    int f8257y;

    /* renamed from: z */
    boolean f8258z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f8259e = {R.attr.layout_weight};

        /* renamed from: a */
        public float f8260a;

        /* renamed from: b */
        boolean f8261b;

        /* renamed from: c */
        boolean f8262c;

        /* renamed from: d */
        Paint f8263d;

        public LayoutParams() {
            super(-1, -1);
            this.f8260a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f8260a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f8260a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f8260a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8259e);
            this.f8260a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1939a();

        /* renamed from: r */
        boolean f8264r;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1939a implements Parcelable.ClassLoaderCreator {
            C1939a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f8264r ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8264r = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    /* loaded from: classes2.dex */
    class C1940a extends C1490a {

        /* renamed from: d */
        private final Rect f8265d = new Rect();

        C1940a() {
        }

        /* renamed from: n */
        private void m10733n(C1507g0 c1507g0, C1507g0 c1507g02) {
            Rect rect = this.f8265d;
            c1507g02.m7631m(rect);
            c1507g0.m7610Y(rect);
            c1507g02.m7633n(rect);
            c1507g0.m7611Z(rect);
            c1507g0.m7596G0(c1507g02.m7605O());
            c1507g0.m7641r0(c1507g02.m7647v());
            c1507g0.m7619d0(c1507g02.m7637p());
            c1507g0.m7624h0(c1507g02.m7640r());
            c1507g0.m7626i0(c1507g02.m7595G());
            c1507g0.m7620e0(c1507g02.m7593F());
            c1507g0.m7629k0(c1507g02.m7597H());
            c1507g0.m7630l0(c1507g02.m7599I());
            c1507g0.m7609W(c1507g02.m7587C());
            c1507g0.m7655z0(c1507g02.m7603M());
            c1507g0.m7636o0(c1507g02.m7600J());
            c1507g0.m7612a(c1507g02.m7628k());
            c1507g0.m7639q0(c1507g02.m7644t());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            C1507g0 m7574R = C1507g0.m7574R(c1507g0);
            super.mo7510g(view, m7574R);
            m10733n(c1507g0, m7574R);
            m7574R.m7607T();
            c1507g0.m7619d0(SlidingPaneLayout.class.getName());
            c1507g0.m7586B0(view);
            Object m7822L = AbstractC1579n0.m7822L(view);
            if (m7822L instanceof View) {
                c1507g0.m7645t0((View) m7822L);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i11);
                if (!m10734o(childAt) && childAt.getVisibility() == 0) {
                    AbstractC1579n0.m7823L0(childAt, 1);
                    c1507g0.m7616c(childAt);
                }
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: i */
        public boolean mo7512i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!m10734o(view)) {
                return super.mo7512i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: o */
        public boolean m10734o(View view) {
            return SlidingPaneLayout.this.m10721h(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    /* loaded from: classes2.dex */
    public class RunnableC1941b implements Runnable {

        /* renamed from: p */
        final View f8267p;

        RunnableC1941b(View view) {
            this.f8267p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8267p.getParent() == SlidingPaneLayout.this) {
                this.f8267p.setLayerType(0, null);
                SlidingPaneLayout.this.m10720g(this.f8267p);
            }
            SlidingPaneLayout.this.f8247H.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    /* loaded from: classes2.dex */
    private class C1942c extends C22712c.c {
        C1942c() {
        }

        @Override // p337m1.C22712c.c
        /* renamed from: a */
        public int mo8626a(View view, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f8254v.getLayoutParams();
            if (SlidingPaneLayout.this.m10722i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.f8254v.getWidth());
                return Math.max(Math.min(i11, width), width - SlidingPaneLayout.this.f8257y);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i11, paddingLeft), SlidingPaneLayout.this.f8257y + paddingLeft);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: b */
        public int mo8627b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: d */
        public int mo8628d(View view) {
            return SlidingPaneLayout.this.f8257y;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: f */
        public void mo8629f(int i11, int i12) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f8243D.m117515c(slidingPaneLayout.f8254v, i12);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: i */
        public void mo8632i(View view, int i11) {
            SlidingPaneLayout.this.m10727q();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: j */
        public void mo8633j(int i11) {
            if (SlidingPaneLayout.this.f8243D.m117501A() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f8255w == 0.0f) {
                    slidingPaneLayout.m10729s(slidingPaneLayout.f8254v);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.m10717d(slidingPaneLayout2.f8254v);
                    SlidingPaneLayout.this.f8244E = false;
                    return;
                }
                slidingPaneLayout.m10718e(slidingPaneLayout.f8254v);
                SlidingPaneLayout.this.f8244E = true;
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: k */
        public void mo8634k(View view, int i11, int i12, int i13, int i14) {
            SlidingPaneLayout.this.m10725l(i11);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.m10722i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f11 < 0.0f || (f11 == 0.0f && SlidingPaneLayout.this.f8255w > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f8257y;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f8254v.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f11 > 0.0f || (f11 == 0.0f && SlidingPaneLayout.this.f8255w > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f8257y;
                }
            }
            SlidingPaneLayout.this.f8243D.m117509N(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: m */
        public boolean mo8636m(View view, int i11) {
            if (SlidingPaneLayout.this.f8258z) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f8261b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1943d {
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private boolean m10711b(View view, int i11) {
        if (!this.f8245F && !m10728r(0.0f, i11)) {
            return false;
        }
        this.f8244E = false;
        return true;
    }

    /* renamed from: c */
    private void m10712c(View view, float f11, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f11 > 0.0f && i11 != 0) {
            int i12 = (((int) ((((-16777216) & i11) >>> 24) * f11)) << 24) | (i11 & 16777215);
            if (layoutParams.f8263d == null) {
                layoutParams.f8263d = new Paint();
            }
            layoutParams.f8263d.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f8263d);
            }
            m10720g(view);
            return;
        }
        if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f8263d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            RunnableC1941b runnableC1941b = new RunnableC1941b(view);
            this.f8247H.add(runnableC1941b);
            AbstractC1579n0.m7900s0(this, runnableC1941b);
        }
    }

    /* renamed from: n */
    private boolean m10713n(View view, int i11) {
        if (!this.f8245F && !m10728r(1.0f, i11)) {
            return false;
        }
        this.f8244E = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10714p(float f11) {
        boolean z11;
        int childCount;
        float f12;
        int i11;
        boolean m10722i = m10722i();
        LayoutParams layoutParams = (LayoutParams) this.f8254v.getLayoutParams();
        if (layoutParams.f8262c) {
            if (m10722i) {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            }
            if (i11 <= 0) {
                z11 = true;
                childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt != this.f8254v) {
                        float f13 = 1.0f - this.f8256x;
                        int i13 = this.f8240A;
                        this.f8256x = f11;
                        int i14 = ((int) (f13 * i13)) - ((int) ((1.0f - f11) * i13));
                        if (m10722i) {
                            i14 = -i14;
                        }
                        childAt.offsetLeftAndRight(i14);
                        if (z11) {
                            float f14 = this.f8256x;
                            if (m10722i) {
                                f12 = f14 - 1.0f;
                            } else {
                                f12 = 1.0f - f14;
                            }
                            m10712c(childAt, f12, this.f8249q);
                        }
                    }
                }
            }
        }
        z11 = false;
        childCount = getChildCount();
        while (i12 < childCount) {
        }
    }

    /* renamed from: u */
    private static boolean m10715u(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m10716a() {
        return m10711b(this.f8254v, 0);
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
        if (this.f8243D.m117518n(true)) {
            if (!this.f8253u) {
                this.f8243D.m117513a();
            } else {
                AbstractC1579n0.m7898r0(this);
            }
        }
    }

    /* renamed from: d */
    void m10717d(View view) {
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i11;
        int i12;
        super.draw(canvas);
        if (m10722i()) {
            drawable = this.f8251s;
        } else {
            drawable = this.f8250r;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (m10722i()) {
                i12 = view.getRight();
                i11 = intrinsicWidth + i12;
            } else {
                int left = view.getLeft();
                int i13 = left - intrinsicWidth;
                i11 = left;
                i12 = i13;
            }
            drawable.setBounds(i12, top, i11, bottom);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f8253u && !layoutParams.f8261b && this.f8254v != null) {
            canvas.getClipBounds(this.f8246G);
            if (m10722i()) {
                Rect rect = this.f8246G;
                rect.left = Math.max(rect.left, this.f8254v.getRight());
            } else {
                Rect rect2 = this.f8246G;
                rect2.right = Math.min(rect2.right, this.f8254v.getLeft());
            }
            canvas.clipRect(this.f8246G);
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    void m10718e(View view) {
        sendAccessibilityEvent(32);
    }

    /* renamed from: f */
    void m10719f(View view) {
    }

    /* renamed from: g */
    void m10720g(View view) {
        AbstractC1579n0.m7827N0(view, ((LayoutParams) view.getLayoutParams()).f8263d);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f8249q;
    }

    public int getParallaxDistance() {
        return this.f8240A;
    }

    public int getSliderFadeColor() {
        return this.f8248p;
    }

    /* renamed from: h */
    boolean m10721h(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f8253u || !layoutParams.f8262c || this.f8255w <= 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    boolean m10722i() {
        if (AbstractC1579n0.m7812G(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m10723j() {
        return !this.f8253u || this.f8255w == 1.0f;
    }

    /* renamed from: k */
    public boolean m10724k() {
        return this.f8253u;
    }

    /* renamed from: l */
    void m10725l(int i11) {
        int paddingLeft;
        int i12;
        if (this.f8254v == null) {
            this.f8255w = 0.0f;
            return;
        }
        boolean m10722i = m10722i();
        LayoutParams layoutParams = (LayoutParams) this.f8254v.getLayoutParams();
        int width = this.f8254v.getWidth();
        if (m10722i) {
            i11 = (getWidth() - i11) - width;
        }
        if (m10722i) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m10722i) {
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        float f11 = (i11 - (paddingLeft + i12)) / this.f8257y;
        this.f8255w = f11;
        if (this.f8240A != 0) {
            m10714p(f11);
        }
        if (layoutParams.f8262c) {
            m10712c(this.f8254v, this.f8255w, this.f8248p);
        }
        m10719f(this.f8254v);
    }

    /* renamed from: m */
    public boolean m10726m() {
        return m10713n(this.f8254v, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8245F = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8245F = true;
        int size = this.f8247H.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((RunnableC1941b) this.f8247H.get(i11)).run();
        }
        this.f8247H.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f8253u && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f8244E = !this.f8243D.m117504E(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f8253u && (!this.f8258z || actionMasked == 0)) {
            if (actionMasked != 3 && actionMasked != 1) {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        float x11 = motionEvent.getX();
                        float y11 = motionEvent.getY();
                        float abs = Math.abs(x11 - this.f8241B);
                        float abs2 = Math.abs(y11 - this.f8242C);
                        if (abs > this.f8243D.m117522z() && abs2 > abs) {
                            this.f8243D.m117514b();
                            this.f8258z = true;
                            return false;
                        }
                    }
                } else {
                    this.f8258z = false;
                    float x12 = motionEvent.getX();
                    float y12 = motionEvent.getY();
                    this.f8241B = x12;
                    this.f8242C = y12;
                    if (this.f8243D.m117504E(this.f8254v, (int) x12, (int) y12) && m10721h(this.f8254v)) {
                        z11 = true;
                        if (this.f8243D.m117510O(motionEvent) && !z11) {
                            return false;
                        }
                    }
                }
                z11 = false;
                return this.f8243D.m117510O(motionEvent) ? true : true;
            }
            this.f8243D.m117514b();
            return false;
        }
        this.f8243D.m117514b();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int paddingRight;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        float f11;
        boolean m10722i = m10722i();
        if (m10722i) {
            this.f8243D.m117507L(2);
        } else {
            this.f8243D.m117507L(1);
        }
        int i21 = i13 - i11;
        if (m10722i) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m10722i) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f8245F) {
            if (this.f8253u && this.f8244E) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            this.f8255w = f11;
        }
        int i22 = paddingLeft;
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f8261b) {
                    int i24 = i21 - paddingRight;
                    int min = (Math.min(paddingLeft, i24 - this.f8252t) - i22) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f8257y = min;
                    if (m10722i) {
                        i19 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        i19 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    }
                    if (i22 + i19 + min + (measuredWidth / 2) > i24) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    layoutParams.f8262c = z12;
                    int i25 = (int) (min * this.f8255w);
                    i22 += i19 + i25;
                    this.f8255w = i25 / min;
                    i15 = 0;
                } else if (this.f8253u && (i16 = this.f8240A) != 0) {
                    i15 = (int) ((1.0f - this.f8255w) * i16);
                    i22 = paddingLeft;
                } else {
                    i22 = paddingLeft;
                    i15 = 0;
                }
                if (m10722i) {
                    i18 = (i21 - i22) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i22 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft += childAt.getWidth();
            }
        }
        if (this.f8245F) {
            if (this.f8253u) {
                if (this.f8240A != 0) {
                    m10714p(this.f8255w);
                }
                if (((LayoutParams) this.f8254v.getLayoutParams()).f8262c) {
                    m10712c(this.f8254v, this.f8255w, this.f8248p);
                }
            } else {
                for (int i26 = 0; i26 < childCount; i26++) {
                    m10712c(getChildAt(i26), 0.0f, this.f8248p);
                }
            }
            m10729s(this.f8254v);
        }
        this.f8245F = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int paddingTop;
        int i13;
        int i14;
        boolean z11;
        int measuredWidth;
        int makeMeasureSpec;
        int i15;
        int i16;
        int makeMeasureSpec2;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        boolean z12;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
            } else {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
        } else if (mode2 == 0) {
            if (isInEditMode()) {
                if (mode2 == 0) {
                    mode2 = Integer.MIN_VALUE;
                    size2 = 300;
                }
            } else {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
        boolean z13 = false;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                i13 = 0;
                paddingTop = 0;
            } else {
                i13 = (size2 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i13;
            }
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i13 = 0;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f8254v = null;
        int i17 = paddingLeft;
        int i18 = 0;
        boolean z14 = false;
        float f11 = 0.0f;
        while (true) {
            i14 = 8;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f8262c = z13;
            } else {
                float f12 = layoutParams.f8260a;
                if (f12 > 0.0f) {
                    f11 += f12;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i21 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i21 == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i19, Integer.MIN_VALUE);
                } else if (i21 == -1) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i19, 1073741824);
                } else {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                }
                int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i22 == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                } else if (i22 == -1) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                } else {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i13) {
                    i13 = Math.min(measuredHeight, paddingTop);
                }
                i17 -= measuredWidth2;
                if (i17 < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                layoutParams.f8261b = z12;
                z14 |= z12;
                if (z12) {
                    this.f8254v = childAt;
                }
            }
            i18++;
            z13 = false;
        }
        if (z14 || f11 > 0.0f) {
            int i23 = paddingLeft - this.f8252t;
            int i24 = 0;
            while (i24 < childCount) {
                View childAt2 = getChildAt(i24);
                if (childAt2.getVisibility() != i14) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i14) {
                        if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.f8260a > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            measuredWidth = 0;
                        } else {
                            measuredWidth = childAt2.getMeasuredWidth();
                        }
                        if (z14 && childAt2 != this.f8254v) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth > i23 || layoutParams2.f8260a > 0.0f)) {
                                if (z11) {
                                    int i25 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    if (i25 == -2) {
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                        i16 = 1073741824;
                                    } else if (i25 == -1) {
                                        i16 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                    } else {
                                        i16 = 1073741824;
                                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                                    }
                                } else {
                                    i16 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(i23, i16), makeMeasureSpec2);
                            }
                        } else if (layoutParams2.f8260a > 0.0f) {
                            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                int i26 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i26 == -2) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE);
                                } else if (i26 == -1) {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                                }
                            } else {
                                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            if (z14) {
                                int i27 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                i15 = i23;
                                int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
                                if (measuredWidth != i27) {
                                    childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                }
                                i24++;
                                i23 = i15;
                                i14 = 8;
                            } else {
                                i15 = i23;
                                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth + ((int) ((layoutParams2.f8260a * Math.max(0, i17)) / f11)), 1073741824), makeMeasureSpec);
                                i24++;
                                i23 = i15;
                                i14 = 8;
                            }
                        }
                    }
                }
                i15 = i23;
                i24++;
                i23 = i15;
                i14 = 8;
            }
        }
        setMeasuredDimension(size, i13 + getPaddingTop() + getPaddingBottom());
        this.f8253u = z14;
        if (this.f8243D.m117501A() != 0 && !z14) {
            this.f8243D.m117513a();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        if (savedState.f8264r) {
            m10726m();
        } else {
            m10716a();
        }
        this.f8244E = savedState.f8264r;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z11;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m10724k()) {
            z11 = m10723j();
        } else {
            z11 = this.f8244E;
        }
        savedState.f8264r = z11;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            this.f8245F = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f8253u) {
            return super.onTouchEvent(motionEvent);
        }
        this.f8243D.m117505F(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && m10721h(this.f8254v)) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float f11 = x11 - this.f8241B;
                float f12 = y11 - this.f8242C;
                int m117522z = this.f8243D.m117522z();
                if ((f11 * f11) + (f12 * f12) < m117522z * m117522z && this.f8243D.m117504E(this.f8254v, (int) x11, (int) y11)) {
                    m10711b(this.f8254v, 0);
                }
            }
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f8241B = x12;
            this.f8242C = y12;
        }
        return true;
    }

    /* renamed from: q */
    void m10727q() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: r */
    boolean m10728r(float f11, int i11) {
        int paddingLeft;
        if (!this.f8253u) {
            return false;
        }
        boolean m10722i = m10722i();
        LayoutParams layoutParams = (LayoutParams) this.f8254v.getLayoutParams();
        if (m10722i) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f11 * this.f8257y)) + this.f8254v.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f11 * this.f8257y));
        }
        C22712c c22712c = this.f8243D;
        View view = this.f8254v;
        if (!c22712c.m117511P(view, paddingLeft, view.getTop())) {
            return false;
        }
        m10727q();
        AbstractC1579n0.m7898r0(this);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        boolean z11;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f8253u) {
            if (view == this.f8254v) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f8244E = z11;
        }
    }

    /* renamed from: s */
    void m10729s(View view) {
        int paddingLeft;
        int width;
        int i11;
        int i12;
        int i13;
        int i14;
        View childAt;
        int i15;
        boolean z11;
        int i16;
        int i17;
        View view2 = view;
        boolean m10722i = m10722i();
        if (m10722i) {
            paddingLeft = getWidth() - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (m10722i) {
            width = getPaddingLeft();
        } else {
            width = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 != null && m10715u(view)) {
            i11 = view.getLeft();
            i12 = view.getRight();
            i13 = view.getTop();
            i14 = view.getBottom();
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int childCount = getChildCount();
        int i18 = 0;
        while (i18 < childCount && (childAt = getChildAt(i18)) != view2) {
            if (childAt.getVisibility() == 8) {
                z11 = m10722i;
            } else {
                if (m10722i) {
                    i15 = width;
                } else {
                    i15 = paddingLeft;
                }
                int max = Math.max(i15, childAt.getLeft());
                int max2 = Math.max(paddingTop, childAt.getTop());
                z11 = m10722i;
                if (m10722i) {
                    i16 = paddingLeft;
                } else {
                    i16 = width;
                }
                int min = Math.min(i16, childAt.getRight());
                int min2 = Math.min(height, childAt.getBottom());
                if (max >= i11 && max2 >= i13 && min <= i12 && min2 <= i14) {
                    i17 = 4;
                } else {
                    i17 = 0;
                }
                childAt.setVisibility(i17);
            }
            i18++;
            view2 = view;
            m10722i = z11;
        }
    }

    public void setCoveredFadeColor(int i11) {
        this.f8249q = i11;
    }

    public void setPanelSlideListener(InterfaceC1943d interfaceC1943d) {
    }

    public void setParallaxDistance(int i11) {
        this.f8240A = i11;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f8250r = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f8251s = drawable;
    }

    @Deprecated
    public void setShadowResource(int i11) {
        setShadowDrawable(getResources().getDrawable(i11));
    }

    public void setShadowResourceLeft(int i11) {
        setShadowDrawableLeft(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setShadowResourceRight(int i11) {
        setShadowDrawableRight(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setSliderFadeColor(int i11) {
        this.f8248p = i11;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f8248p = -858993460;
        this.f8245F = true;
        this.f8246G = new Rect();
        this.f8247H = new ArrayList();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f8252t = (int) ((32.0f * f11) + 0.5f);
        setWillNotDraw(false);
        AbstractC1579n0.m7801A0(this, new C1940a());
        AbstractC1579n0.m7823L0(this, 1);
        C22712c m117493o = C22712c.m117493o(this, 0.5f, new C1942c());
        this.f8243D = m117493o;
        m117493o.m117508M(f11 * 400.0f);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
