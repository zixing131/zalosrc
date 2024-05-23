package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p337m1.C22712c;
import p664y.AbstractC30228a;

/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup {

    /* renamed from: c0 */
    private static final int[] f6747c0 = {R.attr.colorPrimaryDark};

    /* renamed from: d0 */
    static final int[] f6748d0 = {R.attr.layout_gravity};

    /* renamed from: e0 */
    static final boolean f6749e0 = true;

    /* renamed from: f0 */
    private static final boolean f6750f0 = true;

    /* renamed from: A */
    private boolean f6751A;

    /* renamed from: B */
    private boolean f6752B;

    /* renamed from: C */
    private int f6753C;

    /* renamed from: D */
    private int f6754D;

    /* renamed from: E */
    private int f6755E;

    /* renamed from: F */
    private int f6756F;

    /* renamed from: G */
    private boolean f6757G;

    /* renamed from: H */
    private boolean f6758H;

    /* renamed from: I */
    private List f6759I;

    /* renamed from: J */
    private float f6760J;

    /* renamed from: K */
    private float f6761K;

    /* renamed from: L */
    private Drawable f6762L;

    /* renamed from: M */
    private Drawable f6763M;

    /* renamed from: N */
    private Drawable f6764N;

    /* renamed from: O */
    private CharSequence f6765O;

    /* renamed from: P */
    private CharSequence f6766P;

    /* renamed from: Q */
    private Object f6767Q;

    /* renamed from: R */
    private boolean f6768R;

    /* renamed from: S */
    private Drawable f6769S;

    /* renamed from: T */
    private Drawable f6770T;

    /* renamed from: U */
    private Drawable f6771U;

    /* renamed from: V */
    private Drawable f6772V;

    /* renamed from: W */
    private final ArrayList f6773W;

    /* renamed from: a0 */
    private Rect f6774a0;

    /* renamed from: b0 */
    private Matrix f6775b0;

    /* renamed from: p */
    private final C1686c f6776p;

    /* renamed from: q */
    private float f6777q;

    /* renamed from: r */
    private int f6778r;

    /* renamed from: s */
    private int f6779s;

    /* renamed from: t */
    private float f6780t;

    /* renamed from: u */
    private Paint f6781u;

    /* renamed from: v */
    private final C22712c f6782v;

    /* renamed from: w */
    private final C22712c f6783w;

    /* renamed from: x */
    private final C1688e f6784x;

    /* renamed from: y */
    private final C1688e f6785y;

    /* renamed from: z */
    private int f6786z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    /* loaded from: classes2.dex */
    class ViewOnApplyWindowInsetsListenerC1684a implements View.OnApplyWindowInsetsListener {
        ViewOnApplyWindowInsetsListenerC1684a() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z11;
            DrawerLayout drawerLayout = (DrawerLayout) view;
            if (windowInsets.getSystemWindowInsetTop() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            drawerLayout.m8598N(windowInsets, z11);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    /* loaded from: classes2.dex */
    class C1685b extends C1490a {

        /* renamed from: d */
        private final Rect f6797d = new Rect();

        C1685b() {
        }

        /* renamed from: n */
        private void m8623n(C1507g0 c1507g0, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (DrawerLayout.m8578A(childAt)) {
                    c1507g0.m7616c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m8624o(C1507g0 c1507g0, C1507g0 c1507g02) {
            Rect rect = this.f6797d;
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
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: a */
        public boolean mo7506a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View m8614n = DrawerLayout.this.m8614n();
                if (m8614n != null) {
                    CharSequence m8617r = DrawerLayout.this.m8617r(DrawerLayout.this.m8618s(m8614n));
                    if (m8617r != null) {
                        text.add(m8617r);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.mo7506a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            if (DrawerLayout.f6749e0) {
                super.mo7510g(view, c1507g0);
            } else {
                C1507g0 m7574R = C1507g0.m7574R(c1507g0);
                super.mo7510g(view, m7574R);
                c1507g0.m7586B0(view);
                Object m7822L = AbstractC1579n0.m7822L(view);
                if (m7822L instanceof View) {
                    c1507g0.m7645t0((View) m7822L);
                }
                m8624o(c1507g0, m7574R);
                m7574R.m7607T();
                m8623n(c1507g0, (ViewGroup) view);
            }
            c1507g0.m7619d0(DrawerLayout.class.getName());
            c1507g0.m7629k0(false);
            c1507g0.m7630l0(false);
            c1507g0.m7608U(C1507g0.a.f6443e);
            c1507g0.m7608U(C1507g0.a.f6444f);
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: i */
        public boolean mo7512i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.f6749e0 && !DrawerLayout.m8578A(view)) {
                return false;
            }
            return super.mo7512i(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    /* loaded from: classes2.dex */
    static final class C1686c extends C1490a {
        C1686c() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            if (!DrawerLayout.m8578A(view)) {
                c1507g0.m7645t0(null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1687d {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    /* loaded from: classes2.dex */
    public class C1688e extends C22712c.c {

        /* renamed from: a */
        private final int f6799a;

        /* renamed from: b */
        private C22712c f6800b;

        /* renamed from: c */
        private final Runnable f6801c = new a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1688e.this.m8637o();
            }
        }

        C1688e(int i11) {
            this.f6799a = i11;
        }

        /* renamed from: n */
        private void m8625n() {
            int i11 = 3;
            if (this.f6799a == 3) {
                i11 = 5;
            }
            View m8612l = DrawerLayout.this.m8612l(i11);
            if (m8612l != null) {
                DrawerLayout.this.m8605d(m8612l);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: a */
        public int mo8626a(View view, int i11, int i12) {
            if (DrawerLayout.this.m8604c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i11, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i11, width));
        }

        @Override // p337m1.C22712c.c
        /* renamed from: b */
        public int mo8627b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: d */
        public int mo8628d(View view) {
            if (DrawerLayout.this.m8593D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: f */
        public void mo8629f(int i11, int i12) {
            View m8612l;
            if ((i11 & 1) == 1) {
                m8612l = DrawerLayout.this.m8612l(3);
            } else {
                m8612l = DrawerLayout.this.m8612l(5);
            }
            if (m8612l != null && DrawerLayout.this.m8616q(m8612l) == 0) {
                this.f6800b.m117515c(m8612l, i12);
            }
        }

        @Override // p337m1.C22712c.c
        /* renamed from: g */
        public boolean mo8630g(int i11) {
            return false;
        }

        @Override // p337m1.C22712c.c
        /* renamed from: h */
        public void mo8631h(int i11, int i12) {
            DrawerLayout.this.postDelayed(this.f6801c, 160L);
        }

        @Override // p337m1.C22712c.c
        /* renamed from: i */
        public void mo8632i(View view, int i11) {
            ((LayoutParams) view.getLayoutParams()).f6789c = false;
            m8625n();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: j */
        public void mo8633j(int i11) {
            DrawerLayout.this.m8601R(this.f6799a, i11, this.f6800b.m117520w());
        }

        @Override // p337m1.C22712c.c
        /* renamed from: k */
        public void mo8634k(View view, int i11, int i12, int i13, int i14) {
            float width;
            int i15;
            int width2 = view.getWidth();
            if (DrawerLayout.this.m8604c(view, 3)) {
                width = i11 + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i11;
            }
            float f11 = width / width2;
            DrawerLayout.this.m8600P(view, f11);
            if (f11 == 0.0f) {
                i15 = 4;
            } else {
                i15 = 0;
            }
            view.setVisibility(i15);
            DrawerLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: l */
        public void mo8635l(View view, float f11, float f12) {
            int i11;
            float m8619u = DrawerLayout.this.m8619u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.m8604c(view, 3)) {
                if (f11 <= 0.0f && (f11 != 0.0f || m8619u <= 0.5f)) {
                    i11 = -width;
                } else {
                    i11 = 0;
                }
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f11 < 0.0f || (f11 == 0.0f && m8619u > 0.5f)) {
                    width2 -= width;
                }
                i11 = width2;
            }
            this.f6800b.m117509N(i11, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // p337m1.C22712c.c
        /* renamed from: m */
        public boolean mo8636m(View view, int i11) {
            if (DrawerLayout.this.m8593D(view) && DrawerLayout.this.m8604c(view, this.f6799a) && DrawerLayout.this.m8616q(view) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: o */
        void m8637o() {
            boolean z11;
            View m8612l;
            int width;
            int m117521x = this.f6800b.m117521x();
            int i11 = 0;
            if (this.f6799a == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                m8612l = DrawerLayout.this.m8612l(3);
                if (m8612l != null) {
                    i11 = -m8612l.getWidth();
                }
                width = i11 + m117521x;
            } else {
                m8612l = DrawerLayout.this.m8612l(5);
                width = DrawerLayout.this.getWidth() - m117521x;
            }
            if (m8612l != null) {
                if (((z11 && m8612l.getLeft() < width) || (!z11 && m8612l.getLeft() > width)) && DrawerLayout.this.m8616q(m8612l) == 0) {
                    LayoutParams layoutParams = (LayoutParams) m8612l.getLayoutParams();
                    this.f6800b.m117511P(m8612l, width, m8612l.getTop());
                    layoutParams.f6789c = true;
                    DrawerLayout.this.invalidate();
                    m8625n();
                    DrawerLayout.this.m8603b();
                }
            }
        }

        /* renamed from: p */
        public void m8638p() {
            DrawerLayout.this.removeCallbacks(this.f6801c);
        }

        /* renamed from: q */
        public void m8639q(C22712c c22712c) {
            this.f6800b = c22712c;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    static boolean m8578A(View view) {
        if (AbstractC1579n0.m7808E(view) != 4 && AbstractC1579n0.m7808E(view) != 2) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private boolean m8579F(float f11, float f12, View view) {
        if (this.f6774a0 == null) {
            this.f6774a0 = new Rect();
        }
        view.getHitRect(this.f6774a0);
        return this.f6774a0.contains((int) f11, (int) f12);
    }

    /* renamed from: G */
    private boolean m8580G(Drawable drawable, int i11) {
        if (drawable != null && AbstractC1414a.m7190h(drawable)) {
            AbstractC1414a.m7195m(drawable, i11);
            return true;
        }
        return false;
    }

    /* renamed from: K */
    private Drawable m8581K() {
        int m7812G = AbstractC1579n0.m7812G(this);
        if (m7812G == 0) {
            Drawable drawable = this.f6769S;
            if (drawable != null) {
                m8580G(drawable, m7812G);
                return this.f6769S;
            }
        } else {
            Drawable drawable2 = this.f6770T;
            if (drawable2 != null) {
                m8580G(drawable2, m7812G);
                return this.f6770T;
            }
        }
        return this.f6771U;
    }

    /* renamed from: L */
    private Drawable m8582L() {
        int m7812G = AbstractC1579n0.m7812G(this);
        if (m7812G == 0) {
            Drawable drawable = this.f6770T;
            if (drawable != null) {
                m8580G(drawable, m7812G);
                return this.f6770T;
            }
        } else {
            Drawable drawable2 = this.f6769S;
            if (drawable2 != null) {
                m8580G(drawable2, m7812G);
                return this.f6769S;
            }
        }
        return this.f6772V;
    }

    /* renamed from: M */
    private void m8583M() {
        if (f6750f0) {
            return;
        }
        this.f6763M = m8581K();
        this.f6764N = m8582L();
    }

    /* renamed from: Q */
    private void m8584Q(View view, boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((!z11 && !m8593D(childAt)) || (z11 && childAt == view)) {
                AbstractC1579n0.m7823L0(childAt, 1);
            } else {
                AbstractC1579n0.m7823L0(childAt, 4);
            }
        }
    }

    /* renamed from: k */
    private boolean m8585k(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent m8586v = m8586v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(m8586v);
            m8586v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: v */
    private MotionEvent m8586v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f6775b0 == null) {
                this.f6775b0 = new Matrix();
            }
            matrix.invert(this.f6775b0);
            obtain.transform(this.f6775b0);
        }
        return obtain;
    }

    /* renamed from: w */
    static String m8587w(int i11) {
        if ((i11 & 3) == 3) {
            return "LEFT";
        }
        if ((i11 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i11);
    }

    /* renamed from: x */
    private static boolean m8588x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m8589y() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((LayoutParams) getChildAt(i11).getLayoutParams()).f6789c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m8590z() {
        if (m8614n() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    boolean m8591B(View view) {
        if (((LayoutParams) view.getLayoutParams()).f6787a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m8592C(View view) {
        if (m8593D(view)) {
            if ((((LayoutParams) view.getLayoutParams()).f6790d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: D */
    boolean m8593D(View view) {
        int m8182b = AbstractC1602t.m8182b(((LayoutParams) view.getLayoutParams()).f6787a, AbstractC1579n0.m7812G(view));
        if ((m8182b & 3) != 0 || (m8182b & 5) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m8594E(View view) {
        if (m8593D(view)) {
            if (((LayoutParams) view.getLayoutParams()).f6788b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: H */
    void m8595H(View view, float f11) {
        float m8619u = m8619u(view);
        float width = view.getWidth();
        int i11 = ((int) (width * f11)) - ((int) (m8619u * width));
        if (!m8604c(view, 3)) {
            i11 = -i11;
        }
        view.offsetLeftAndRight(i11);
        m8600P(view, f11);
    }

    /* renamed from: I */
    public void m8596I(View view) {
        m8597J(view, true);
    }

    /* renamed from: J */
    public void m8597J(View view, boolean z11) {
        if (m8593D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f6752B) {
                layoutParams.f6788b = 1.0f;
                layoutParams.f6790d = 1;
                m8584Q(view, true);
            } else if (z11) {
                layoutParams.f6790d |= 2;
                if (m8604c(view, 3)) {
                    this.f6782v.m117511P(view, 0, view.getTop());
                } else {
                    this.f6783w.m117511P(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                m8595H(view, 1.0f);
                m8601R(layoutParams.f6787a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: N */
    public void m8598N(Object obj, boolean z11) {
        boolean z12;
        this.f6767Q = obj;
        this.f6768R = z11;
        if (!z11 && getBackground() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
        requestLayout();
    }

    /* renamed from: O */
    public void m8599O(int i11, int i12) {
        View m8612l;
        C22712c c22712c;
        int m8182b = AbstractC1602t.m8182b(i12, AbstractC1579n0.m7812G(this));
        if (i12 != 3) {
            if (i12 != 5) {
                if (i12 != 8388611) {
                    if (i12 == 8388613) {
                        this.f6756F = i11;
                    }
                } else {
                    this.f6755E = i11;
                }
            } else {
                this.f6754D = i11;
            }
        } else {
            this.f6753C = i11;
        }
        if (i11 != 0) {
            if (m8182b == 3) {
                c22712c = this.f6782v;
            } else {
                c22712c = this.f6783w;
            }
            c22712c.m117514b();
        }
        if (i11 != 1) {
            if (i11 == 2 && (m8612l = m8612l(m8182b)) != null) {
                m8596I(m8612l);
                return;
            }
            return;
        }
        View m8612l2 = m8612l(m8182b);
        if (m8612l2 != null) {
            m8605d(m8612l2);
        }
    }

    /* renamed from: P */
    void m8600P(View view, float f11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f11 == layoutParams.f6788b) {
            return;
        }
        layoutParams.f6788b = f11;
        m8611j(view, f11);
    }

    /* renamed from: R */
    void m8601R(int i11, int i12, View view) {
        int i13;
        int size;
        int m117501A = this.f6782v.m117501A();
        int m117501A2 = this.f6783w.m117501A();
        if (m117501A != 1 && m117501A2 != 1) {
            i13 = 2;
            if (m117501A != 2 && m117501A2 != 2) {
                i13 = 0;
            }
        } else {
            i13 = 1;
        }
        if (view != null && i12 == 0) {
            float f11 = ((LayoutParams) view.getLayoutParams()).f6788b;
            if (f11 == 0.0f) {
                m8609h(view);
            } else if (f11 == 1.0f) {
                m8610i(view);
            }
        }
        if (i13 != this.f6786z) {
            this.f6786z = i13;
            List list = this.f6759I;
            if (list != null && (size = list.size() - 1) >= 0) {
                AbstractC30228a.m149044a(this.f6759I.get(size));
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void m8602a(InterfaceC1687d interfaceC1687d) {
        if (interfaceC1687d == null) {
            return;
        }
        if (this.f6759I == null) {
            this.f6759I = new ArrayList();
        }
        this.f6759I.add(interfaceC1687d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i11, int i12) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (m8593D(childAt)) {
                if (m8592C(childAt)) {
                    childAt.addFocusables(arrayList, i11, i12);
                    z11 = true;
                }
            } else {
                this.f6773W.add(childAt);
            }
        }
        if (!z11) {
            int size = this.f6773W.size();
            for (int i14 = 0; i14 < size; i14++) {
                View view = (View) this.f6773W.get(i14);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i11, i12);
                }
            }
        }
        this.f6773W.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (m8613m() == null && !m8593D(view)) {
            AbstractC1579n0.m7823L0(view, 1);
        } else {
            AbstractC1579n0.m7823L0(view, 4);
        }
        if (!f6749e0) {
            AbstractC1579n0.m7801A0(view, this.f6776p);
        }
    }

    /* renamed from: b */
    void m8603b() {
        if (!this.f6758H) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f6758H = true;
        }
    }

    /* renamed from: c */
    boolean m8604c(View view, int i11) {
        if ((m8618s(view) & i11) == i11) {
            return true;
        }
        return false;
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
        int childCount = getChildCount();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            f11 = Math.max(f11, ((LayoutParams) getChildAt(i11).getLayoutParams()).f6788b);
        }
        this.f6780t = f11;
        boolean m117518n = this.f6782v.m117518n(true);
        boolean m117518n2 = this.f6783w.m117518n(true);
        if (m117518n || m117518n2) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: d */
    public void m8605d(View view) {
        m8606e(view, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f6780t > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                for (int i11 = childCount - 1; i11 >= 0; i11--) {
                    View childAt = getChildAt(i11);
                    if (m8579F(x11, y11, childAt) && !m8591B(childAt) && m8585k(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        int height = getHeight();
        boolean m8591B = m8591B(view);
        int width = getWidth();
        int save = canvas.save();
        int i11 = 0;
        if (m8591B) {
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt != view && childAt.getVisibility() == 0 && m8588x(childAt) && m8593D(childAt) && childAt.getHeight() >= height) {
                    if (m8604c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i12) {
                            i12 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i12, 0, width, getHeight());
            i11 = i12;
        }
        boolean drawChild = super.drawChild(canvas, view, j11);
        canvas.restoreToCount(save);
        float f11 = this.f6780t;
        if (f11 > 0.0f && m8591B) {
            this.f6781u.setColor((this.f6779s & 16777215) | (((int) ((((-16777216) & r2) >>> 24) * f11)) << 24));
            canvas.drawRect(i11, 0.0f, width, getHeight(), this.f6781u);
        } else if (this.f6763M != null && m8604c(view, 3)) {
            int intrinsicWidth = this.f6763M.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f6782v.m117521x(), 1.0f));
            this.f6763M.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f6763M.setAlpha((int) (max * 255.0f));
            this.f6763M.draw(canvas);
        } else if (this.f6764N != null && m8604c(view, 5)) {
            int intrinsicWidth2 = this.f6764N.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f6783w.m117521x(), 1.0f));
            this.f6764N.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f6764N.setAlpha((int) (max2 * 255.0f));
            this.f6764N.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void m8606e(View view, boolean z11) {
        if (m8593D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f6752B) {
                layoutParams.f6788b = 0.0f;
                layoutParams.f6790d = 0;
            } else if (z11) {
                layoutParams.f6790d |= 4;
                if (m8604c(view, 3)) {
                    this.f6782v.m117511P(view, -view.getWidth(), view.getTop());
                } else {
                    this.f6783w.m117511P(view, getWidth(), view.getTop());
                }
            } else {
                m8595H(view, 0.0f);
                m8601R(layoutParams.f6787a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: f */
    public void m8607f() {
        m8608g(false);
    }

    /* renamed from: g */
    void m8608g(boolean z11) {
        boolean m117511P;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (m8593D(childAt) && (!z11 || layoutParams.f6789c)) {
                int width = childAt.getWidth();
                if (m8604c(childAt, 3)) {
                    m117511P = this.f6782v.m117511P(childAt, -width, childAt.getTop());
                } else {
                    m117511P = this.f6783w.m117511P(childAt, getWidth(), childAt.getTop());
                }
                z12 |= m117511P;
                layoutParams.f6789c = false;
            }
        }
        this.f6784x.m8638p();
        this.f6785y.m8638p();
        if (z12) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f6750f0) {
            return this.f6777q;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f6762L;
    }

    /* renamed from: h */
    void m8609h(View view) {
        View rootView;
        int size;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f6790d & 1) == 1) {
            layoutParams.f6790d = 0;
            List list = this.f6759I;
            if (list != null && (size = list.size() - 1) >= 0) {
                AbstractC30228a.m149044a(this.f6759I.get(size));
                throw null;
            }
            m8584Q(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: i */
    void m8610i(View view) {
        int size;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f6790d & 1) == 0) {
            layoutParams.f6790d = 1;
            List list = this.f6759I;
            if (list != null && (size = list.size() - 1) >= 0) {
                AbstractC30228a.m149044a(this.f6759I.get(size));
                throw null;
            }
            m8584Q(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: j */
    void m8611j(View view, float f11) {
        int size;
        if (this.f6759I != null && r1.size() - 1 >= 0) {
            AbstractC30228a.m149044a(this.f6759I.get(size));
            throw null;
        }
    }

    /* renamed from: l */
    View m8612l(int i11) {
        int m8182b = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this)) & 7;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if ((m8618s(childAt) & 7) == m8182b) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: m */
    View m8613m() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((((LayoutParams) childAt.getLayoutParams()).f6790d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: n */
    View m8614n() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (m8593D(childAt) && m8594E(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6752B = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6752B = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (this.f6768R && this.f6762L != null) {
            Object obj = this.f6767Q;
            if (obj != null) {
                i11 = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                this.f6762L.setBounds(0, 0, getWidth(), i11);
                this.f6762L.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:            if (r0 != 3) goto L13;     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View m117519u;
        int actionMasked = motionEvent.getActionMasked();
        boolean m117510O = this.f6782v.m117510O(motionEvent) | this.f6783w.m117510O(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f6782v.m117516e(3)) {
                        this.f6784x.m8638p();
                        this.f6785y.m8638p();
                    }
                }
                z11 = false;
            }
            m8608g(true);
            this.f6757G = false;
            this.f6758H = false;
            z11 = false;
        } else {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            this.f6760J = x11;
            this.f6761K = y11;
            if (this.f6780t > 0.0f && (m117519u = this.f6782v.m117519u((int) x11, (int) y11)) != null && m8591B(m117519u)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f6757G = false;
            this.f6758H = false;
        }
        if (m117510O || z11 || m8589y() || this.f6758H) {
            return true;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m8590z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            View m8614n = m8614n();
            if (m8614n != null && m8616q(m8614n) == 0) {
                m8607f();
            }
            if (m8614n != null) {
                return true;
            }
            return false;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        float f11;
        int i15;
        boolean z12;
        int i16;
        this.f6751A = true;
        int i17 = i13 - i11;
        int childCount = getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m8591B(childAt)) {
                    int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i19, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i19, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m8604c(childAt, 3)) {
                        float f12 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (layoutParams.f6788b * f12));
                        f11 = (measuredWidth + i15) / f12;
                    } else {
                        float f13 = measuredWidth;
                        f11 = (i17 - r11) / f13;
                        i15 = i17 - ((int) (layoutParams.f6788b * f13));
                    }
                    if (f11 != layoutParams.f6788b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i21 = layoutParams.f6787a & 112;
                    if (i21 != 16) {
                        if (i21 != 80) {
                            int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            childAt.layout(i15, i22, measuredWidth + i15, measuredHeight + i22);
                        } else {
                            int i23 = i14 - i12;
                            childAt.layout(i15, (i23 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i23 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        }
                    } else {
                        int i24 = i14 - i12;
                        int i25 = (i24 - measuredHeight) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i25 < i26) {
                            i25 = i26;
                        } else {
                            int i27 = i25 + measuredHeight;
                            int i28 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i27 > i24 - i28) {
                                i25 = (i24 - i28) - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i25, measuredWidth + i15, measuredHeight + i25);
                    }
                    if (z12) {
                        m8600P(childAt, f11);
                    }
                    if (layoutParams.f6788b > 0.0f) {
                        i16 = 0;
                    } else {
                        i16 = 4;
                    }
                    if (childAt.getVisibility() != i16) {
                        childAt.setVisibility(i16);
                    }
                }
            }
        }
        this.f6751A = false;
        this.f6752B = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        boolean z12;
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        if (this.f6767Q != null && AbstractC1579n0.m7806D(this)) {
            z11 = true;
        } else {
            z11 = false;
        }
        int m7812G = AbstractC1579n0.m7812G(this);
        int childCount = getChildCount();
        boolean z13 = false;
        boolean z14 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z11) {
                    int m8182b = AbstractC1602t.m8182b(layoutParams.f6787a, m7812G);
                    if (AbstractC1579n0.m7806D(childAt)) {
                        WindowInsets windowInsets = (WindowInsets) this.f6767Q;
                        if (m8182b == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                        } else if (m8182b == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        WindowInsets windowInsets2 = (WindowInsets) this.f6767Q;
                        if (m8182b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), 0, windowInsets2.getSystemWindowInsetBottom());
                        } else if (m8182b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (m8591B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else if (m8593D(childAt)) {
                    if (f6750f0) {
                        float m7800A = AbstractC1579n0.m7800A(childAt);
                        float f11 = this.f6777q;
                        if (m7800A != f11) {
                            AbstractC1579n0.m7817I0(childAt, f11);
                        }
                    }
                    int m8618s = m8618s(childAt) & 7;
                    if (m8618s == 3) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((z12 && z13) || (!z12 && z14)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m8587w(m8618s) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z12) {
                        z13 = true;
                    } else {
                        z14 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i11, this.f6778r + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i12, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i13 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View m8612l;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        int i11 = savedState.f6791r;
        if (i11 != 0 && (m8612l = m8612l(i11)) != null) {
            m8596I(m8612l);
        }
        int i12 = savedState.f6792s;
        if (i12 != 3) {
            m8599O(i12, 3);
        }
        int i13 = savedState.f6793t;
        if (i13 != 3) {
            m8599O(i13, 5);
        }
        int i14 = savedState.f6794u;
        if (i14 != 3) {
            m8599O(i14, 8388611);
        }
        int i15 = savedState.f6795v;
        if (i15 != 3) {
            m8599O(i15, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        m8583M();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z11;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i11).getLayoutParams();
            int i12 = layoutParams.f6790d;
            boolean z12 = true;
            if (i12 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i12 != 2) {
                z12 = false;
            }
            if (z11 || z12) {
                savedState.f6791r = layoutParams.f6787a;
                break;
            }
        }
        savedState.f6792s = this.f6753C;
        savedState.f6793t = this.f6754D;
        savedState.f6794u = this.f6755E;
        savedState.f6795v = this.f6756F;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        View m8613m;
        this.f6782v.m117505F(motionEvent);
        this.f6783w.m117505F(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    m8608g(true);
                    this.f6757G = false;
                    this.f6758H = false;
                }
            } else {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                View m117519u = this.f6782v.m117519u((int) x11, (int) y11);
                if (m117519u != null && m8591B(m117519u)) {
                    float f11 = x11 - this.f6760J;
                    float f12 = y11 - this.f6761K;
                    int m117522z = this.f6782v.m117522z();
                    if ((f11 * f11) + (f12 * f12) < m117522z * m117522z && (m8613m = m8613m()) != null && m8616q(m8613m) != 2) {
                        z11 = false;
                        m8608g(z11);
                        this.f6757G = false;
                    }
                }
                z11 = true;
                m8608g(z11);
                this.f6757G = false;
            }
        } else {
            float x12 = motionEvent.getX();
            float y12 = motionEvent.getY();
            this.f6760J = x12;
            this.f6761K = y12;
            this.f6757G = false;
            this.f6758H = false;
        }
        return true;
    }

    /* renamed from: p */
    public int m8615p(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int m7812G = AbstractC1579n0.m7812G(this);
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        int i16 = this.f6756F;
                        if (i16 != 3) {
                            return i16;
                        }
                        if (m7812G == 0) {
                            i15 = this.f6754D;
                        } else {
                            i15 = this.f6753C;
                        }
                        if (i15 != 3) {
                            return i15;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i17 = this.f6755E;
                if (i17 != 3) {
                    return i17;
                }
                if (m7812G == 0) {
                    i14 = this.f6753C;
                } else {
                    i14 = this.f6754D;
                }
                if (i14 != 3) {
                    return i14;
                }
                return 0;
            }
            int i18 = this.f6754D;
            if (i18 != 3) {
                return i18;
            }
            if (m7812G == 0) {
                i13 = this.f6756F;
            } else {
                i13 = this.f6755E;
            }
            if (i13 != 3) {
                return i13;
            }
            return 0;
        }
        int i19 = this.f6753C;
        if (i19 != 3) {
            return i19;
        }
        if (m7812G == 0) {
            i12 = this.f6755E;
        } else {
            i12 = this.f6756F;
        }
        if (i12 != 3) {
            return i12;
        }
        return 0;
    }

    /* renamed from: q */
    public int m8616q(View view) {
        if (m8593D(view)) {
            return m8615p(((LayoutParams) view.getLayoutParams()).f6787a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: r */
    public CharSequence m8617r(int i11) {
        int m8182b = AbstractC1602t.m8182b(i11, AbstractC1579n0.m7812G(this));
        if (m8182b == 3) {
            return this.f6765O;
        }
        if (m8182b == 5) {
            return this.f6766P;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        this.f6757G = z11;
        if (z11) {
            m8608g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.f6751A) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    int m8618s(View view) {
        return AbstractC1602t.m8182b(((LayoutParams) view.getLayoutParams()).f6787a, AbstractC1579n0.m7812G(this));
    }

    public void setDrawerElevation(float f11) {
        this.f6777q = f11;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (m8593D(childAt)) {
                AbstractC1579n0.m7817I0(childAt, this.f6777q);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(InterfaceC1687d interfaceC1687d) {
        if (interfaceC1687d != null) {
            m8602a(interfaceC1687d);
        }
    }

    public void setDrawerLockMode(int i11) {
        m8599O(i11, 3);
        m8599O(i11, 5);
    }

    public void setScrimColor(int i11) {
        this.f6779s = i11;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f6762L = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i11) {
        this.f6762L = new ColorDrawable(i11);
        invalidate();
    }

    /* renamed from: u */
    float m8619u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f6788b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f6776p = new C1686c();
        this.f6779s = -1728053248;
        this.f6781u = new Paint();
        this.f6752B = true;
        this.f6753C = 3;
        this.f6754D = 3;
        this.f6755E = 3;
        this.f6756F = 3;
        this.f6769S = null;
        this.f6770T = null;
        this.f6771U = null;
        this.f6772V = null;
        setDescendantFocusability(262144);
        float f11 = getResources().getDisplayMetrics().density;
        this.f6778r = (int) ((64.0f * f11) + 0.5f);
        float f12 = 400.0f * f11;
        C1688e c1688e = new C1688e(3);
        this.f6784x = c1688e;
        C1688e c1688e2 = new C1688e(5);
        this.f6785y = c1688e2;
        C22712c m117493o = C22712c.m117493o(this, 1.0f, c1688e);
        this.f6782v = m117493o;
        m117493o.m117507L(1);
        m117493o.m117508M(f12);
        c1688e.m8639q(m117493o);
        C22712c m117493o2 = C22712c.m117493o(this, 1.0f, c1688e2);
        this.f6783w = m117493o2;
        m117493o2.m117507L(2);
        m117493o2.m117508M(f12);
        c1688e2.m8639q(m117493o2);
        setFocusableInTouchMode(true);
        AbstractC1579n0.m7823L0(this, 1);
        AbstractC1579n0.m7801A0(this, new C1685b());
        setMotionEventSplittingEnabled(false);
        if (AbstractC1579n0.m7806D(this)) {
            setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC1684a());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6747c0);
            try {
                this.f6762L = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6777q = f11 * 10.0f;
        this.f6773W = new ArrayList();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setStatusBarBackground(int i11) {
        this.f6762L = i11 != 0 ? AbstractC1388a.m6964f(getContext(), i11) : null;
        invalidate();
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f6787a;

        /* renamed from: b */
        float f6788b;

        /* renamed from: c */
        boolean f6789c;

        /* renamed from: d */
        int f6790d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6787a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f6748d0);
            this.f6787a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f6787a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f6787a = 0;
            this.f6787a = layoutParams.f6787a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6787a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f6787a = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1683a();

        /* renamed from: r */
        int f6791r;

        /* renamed from: s */
        int f6792s;

        /* renamed from: t */
        int f6793t;

        /* renamed from: u */
        int f6794u;

        /* renamed from: v */
        int f6795v;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1683a implements Parcelable.ClassLoaderCreator {
            C1683a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6791r = 0;
            this.f6791r = parcel.readInt();
            this.f6792s = parcel.readInt();
            this.f6793t = parcel.readInt();
            this.f6794u = parcel.readInt();
            this.f6795v = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f6791r);
            parcel.writeInt(this.f6792s);
            parcel.writeInt(this.f6793t);
            parcel.writeInt(this.f6794u);
            parcel.writeInt(this.f6795v);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f6791r = 0;
        }
    }
}
