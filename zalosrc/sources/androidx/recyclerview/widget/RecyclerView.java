package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.os.AbstractC1452r;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1587p0;
import androidx.core.view.AbstractC1622z;
import androidx.core.view.C1490a;
import androidx.core.view.C1535c0;
import androidx.core.view.InterfaceC1491a0;
import androidx.core.view.InterfaceC1531b0;
import androidx.core.view.accessibility.AbstractC1496b;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.widget.AbstractC1634f;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1905a;
import androidx.recyclerview.widget.C1908b0;
import androidx.recyclerview.widget.C1910c0;
import androidx.recyclerview.widget.C1913f;
import androidx.recyclerview.widget.C1931x;
import androidx.recyclerview.widget.RunnableC1918k;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p701z1.AbstractC31148a;
import p701z1.AbstractC31149b;
import p701z1.AbstractC31151d;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC1531b0, InterfaceC1491a0 {

    /* renamed from: M0 */
    private static final int[] f7681M0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: N0 */
    static final boolean f7682N0;

    /* renamed from: O0 */
    static final boolean f7683O0;

    /* renamed from: P0 */
    static final boolean f7684P0;

    /* renamed from: Q0 */
    static final boolean f7685Q0;

    /* renamed from: R0 */
    private static final boolean f7686R0;

    /* renamed from: S0 */
    private static final boolean f7687S0;

    /* renamed from: T0 */
    private static final Class[] f7688T0;

    /* renamed from: U0 */
    static final Interpolator f7689U0;

    /* renamed from: A */
    AbstractC1880g f7690A;

    /* renamed from: A0 */
    private AbstractC1885l.b f7691A0;

    /* renamed from: B */
    AbstractC1888o f7692B;

    /* renamed from: B0 */
    boolean f7693B0;

    /* renamed from: C */
    final ArrayList f7694C;

    /* renamed from: C0 */
    C1931x f7695C0;

    /* renamed from: D */
    private final ArrayList f7696D;

    /* renamed from: D0 */
    private InterfaceC1883j f7697D0;

    /* renamed from: E */
    private InterfaceC1891r f7698E;

    /* renamed from: E0 */
    private final int[] f7699E0;

    /* renamed from: F */
    boolean f7700F;

    /* renamed from: F0 */
    private C1535c0 f7701F0;

    /* renamed from: G */
    boolean f7702G;

    /* renamed from: G0 */
    private final int[] f7703G0;

    /* renamed from: H */
    boolean f7704H;

    /* renamed from: H0 */
    private final int[] f7705H0;

    /* renamed from: I */
    boolean f7706I;

    /* renamed from: I0 */
    final int[] f7707I0;

    /* renamed from: J */
    private int f7708J;

    /* renamed from: J0 */
    final List f7709J0;

    /* renamed from: K */
    boolean f7710K;

    /* renamed from: K0 */
    private Runnable f7711K0;

    /* renamed from: L */
    boolean f7712L;

    /* renamed from: L0 */
    private final C1910c0.b f7713L0;

    /* renamed from: M */
    private boolean f7714M;

    /* renamed from: N */
    private int f7715N;

    /* renamed from: O */
    boolean f7716O;

    /* renamed from: P */
    private final AccessibilityManager f7717P;

    /* renamed from: Q */
    private List f7718Q;

    /* renamed from: R */
    boolean f7719R;

    /* renamed from: S */
    boolean f7720S;

    /* renamed from: T */
    private int f7721T;

    /* renamed from: U */
    private int f7722U;

    /* renamed from: V */
    private C1884k f7723V;

    /* renamed from: W */
    private EdgeEffect f7724W;

    /* renamed from: a0 */
    private EdgeEffect f7725a0;

    /* renamed from: b0 */
    private EdgeEffect f7726b0;

    /* renamed from: c0 */
    private EdgeEffect f7727c0;

    /* renamed from: d0 */
    AbstractC1885l f7728d0;

    /* renamed from: e0 */
    private int f7729e0;

    /* renamed from: f0 */
    private int f7730f0;

    /* renamed from: g0 */
    private VelocityTracker f7731g0;

    /* renamed from: h0 */
    private int f7732h0;

    /* renamed from: i0 */
    private int f7733i0;

    /* renamed from: j0 */
    private int f7734j0;

    /* renamed from: k0 */
    private int f7735k0;

    /* renamed from: l0 */
    private int f7736l0;

    /* renamed from: m0 */
    private AbstractC1890q f7737m0;

    /* renamed from: n0 */
    private final int f7738n0;

    /* renamed from: o0 */
    private final int f7739o0;

    /* renamed from: p */
    private final C1896w f7740p;

    /* renamed from: p0 */
    private float f7741p0;

    /* renamed from: q */
    final C1894u f7742q;

    /* renamed from: q0 */
    private float f7743q0;

    /* renamed from: r */
    private SavedState f7744r;

    /* renamed from: r0 */
    private boolean f7745r0;

    /* renamed from: s */
    C1905a f7746s;

    /* renamed from: s0 */
    final RunnableC1874b0 f7747s0;

    /* renamed from: t */
    C1913f f7748t;

    /* renamed from: t0 */
    RunnableC1918k f7749t0;

    /* renamed from: u */
    final C1910c0 f7750u;

    /* renamed from: u0 */
    RunnableC1918k.b f7751u0;

    /* renamed from: v */
    boolean f7752v;

    /* renamed from: v0 */
    final C1899z f7753v0;

    /* renamed from: w */
    final Runnable f7754w;

    /* renamed from: w0 */
    private AbstractC1892s f7755w0;

    /* renamed from: x */
    final Rect f7756x;

    /* renamed from: x0 */
    private List f7757x0;

    /* renamed from: y */
    private final Rect f7758y;

    /* renamed from: y0 */
    boolean f7759y0;

    /* renamed from: z */
    final RectF f7760z;

    /* renamed from: z0 */
    boolean f7761z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    /* loaded from: classes.dex */
    public class RunnableC1871a implements Runnable {
        RunnableC1871a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f7706I && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f7700F) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f7712L) {
                    recyclerView2.f7710K = true;
                } else {
                    recyclerView2.m9846P();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1872a0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    /* loaded from: classes.dex */
    public class RunnableC1873b implements Runnable {
        RunnableC1873b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1885l abstractC1885l = RecyclerView.this.f7728d0;
            if (abstractC1885l != null) {
                abstractC1885l.mo10056v();
            }
            RecyclerView.this.f7693B0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    /* loaded from: classes.dex */
    public class RunnableC1874b0 implements Runnable {

        /* renamed from: p */
        private int f7769p;

        /* renamed from: q */
        private int f7770q;

        /* renamed from: r */
        OverScroller f7771r;

        /* renamed from: s */
        Interpolator f7772s;

        /* renamed from: t */
        private boolean f7773t;

        /* renamed from: u */
        private boolean f7774u;

        RunnableC1874b0() {
            Interpolator interpolator = RecyclerView.f7689U0;
            this.f7772s = interpolator;
            this.f7773t = false;
            this.f7774u = false;
            this.f7771r = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m9921a(int i11, int i12, int i13, int i14) {
            boolean z11;
            int height;
            int i15;
            int abs = Math.abs(i11);
            int abs2 = Math.abs(i12);
            if (abs > abs2) {
                z11 = true;
            } else {
                z11 = false;
            }
            int sqrt = (int) Math.sqrt((i13 * i13) + (i14 * i14));
            int sqrt2 = (int) Math.sqrt((i11 * i11) + (i12 * i12));
            RecyclerView recyclerView = RecyclerView.this;
            if (z11) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i16 = height / 2;
            float f11 = height;
            float f12 = i16;
            float m9922b = f12 + (m9922b(Math.min(1.0f, (sqrt2 * 1.0f) / f11)) * f12);
            if (sqrt > 0) {
                i15 = Math.round(Math.abs(m9922b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z11) {
                    abs = abs2;
                }
                i15 = (int) (((abs / f11) + 1.0f) * 300.0f);
            }
            return Math.min(i15, ZAbstractBase.ZVU_PROCESS_FLUSH);
        }

        /* renamed from: b */
        private float m9922b(float f11) {
            return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
        }

        /* renamed from: d */
        private void m9923d() {
            RecyclerView.this.removeCallbacks(this);
            AbstractC1579n0.m7900s0(RecyclerView.this, this);
        }

        /* renamed from: c */
        public void m9924c(int i11, int i12) {
            RecyclerView.this.setScrollState(2);
            this.f7770q = 0;
            this.f7769p = 0;
            Interpolator interpolator = this.f7772s;
            Interpolator interpolator2 = RecyclerView.f7689U0;
            if (interpolator != interpolator2) {
                this.f7772s = interpolator2;
                this.f7771r = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f7771r.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m9925e();
        }

        /* renamed from: e */
        void m9925e() {
            if (this.f7773t) {
                this.f7774u = true;
            } else {
                m9923d();
            }
        }

        /* renamed from: f */
        public void m9926f(int i11, int i12, int i13, Interpolator interpolator) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = m9921a(i11, i12, 0, 0);
            }
            int i14 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.f7689U0;
            }
            if (this.f7772s != interpolator) {
                this.f7772s = interpolator;
                this.f7771r = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f7770q = 0;
            this.f7769p = 0;
            RecyclerView.this.setScrollState(2);
            this.f7771r.startScroll(0, 0, i11, i12, i14);
            if (Build.VERSION.SDK_INT < 23) {
                this.f7771r.computeScrollOffset();
            }
            m9925e();
        }

        /* renamed from: g */
        public void m9927g() {
            RecyclerView.this.removeCallbacks(this);
            this.f7771r.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            int i12;
            boolean z11;
            boolean z12;
            boolean z13;
            int i13;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f7692B == null) {
                m9927g();
                return;
            }
            this.f7774u = false;
            this.f7773t = true;
            recyclerView.m9846P();
            OverScroller overScroller = this.f7771r;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i14 = currX - this.f7769p;
                int i15 = currY - this.f7770q;
                this.f7769p = currX;
                this.f7770q = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f7707I0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.m9870a0(i14, i15, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f7707I0;
                    i14 -= iArr2[0];
                    i15 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m9844O(i14, i15);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f7690A != null) {
                    int[] iArr3 = recyclerView3.f7707I0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.m9836J1(i14, i15, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f7707I0;
                    i12 = iArr4[0];
                    i11 = iArr4[1];
                    i14 -= i12;
                    i15 -= i11;
                    AbstractC1898y abstractC1898y = recyclerView4.f7692B.f7817g;
                    if (abstractC1898y != null && !abstractC1898y.m10235g() && abstractC1898y.m10236h()) {
                        int m10253b = RecyclerView.this.f7753v0.m10253b();
                        if (m10253b == 0) {
                            abstractC1898y.m10246r();
                        } else if (abstractC1898y.m10234f() >= m10253b) {
                            abstractC1898y.m10244p(m10253b - 1);
                            abstractC1898y.m10238j(i12, i11);
                        } else {
                            abstractC1898y.m10238j(i12, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (!RecyclerView.this.f7694C.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f7707I0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.m9872b0(i12, i11, i14, i15, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f7707I0;
                int i16 = i14 - iArr6[0];
                int i17 = i15 - iArr6[1];
                if (i12 != 0 || i11 != 0) {
                    recyclerView6.m9876d0(i12, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!overScroller.isFinished() && ((!z11 && i16 == 0) || (!z12 && i17 == 0))) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                AbstractC1898y abstractC1898y2 = RecyclerView.this.f7692B.f7817g;
                if ((abstractC1898y2 == null || !abstractC1898y2.m10235g()) && z13) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i16 < 0) {
                            i13 = -currVelocity;
                        } else if (i16 > 0) {
                            i13 = currVelocity;
                        } else {
                            i13 = 0;
                        }
                        if (i17 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i17 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.m9887j(i13, currVelocity);
                    }
                    if (RecyclerView.f7685Q0) {
                        RecyclerView.this.f7751u0.m10543b();
                    }
                } else {
                    m9925e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC1918k runnableC1918k = recyclerView7.f7749t0;
                    if (runnableC1918k != null) {
                        runnableC1918k.m10539f(recyclerView7, i12, i11);
                    }
                }
            }
            AbstractC1898y abstractC1898y3 = RecyclerView.this.f7692B.f7817g;
            if (abstractC1898y3 != null && abstractC1898y3.m10235g()) {
                abstractC1898y3.m10238j(0, 0);
            }
            this.f7773t = false;
            if (this.f7774u) {
                m9923d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.m9864W1(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    /* loaded from: classes.dex */
    static class InterpolatorC1875c implements Interpolator {
        InterpolatorC1875c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1876c0 {

        /* renamed from: H */
        private static final List f7776H = Collections.emptyList();

        /* renamed from: G */
        RecyclerView f7783G;

        /* renamed from: p */
        public final View f7784p;

        /* renamed from: q */
        WeakReference f7785q;

        /* renamed from: y */
        int f7793y;

        /* renamed from: r */
        int f7786r = -1;

        /* renamed from: s */
        int f7787s = -1;

        /* renamed from: t */
        long f7788t = -1;

        /* renamed from: u */
        int f7789u = -1;

        /* renamed from: v */
        int f7790v = -1;

        /* renamed from: w */
        AbstractC1876c0 f7791w = null;

        /* renamed from: x */
        AbstractC1876c0 f7792x = null;

        /* renamed from: z */
        List f7794z = null;

        /* renamed from: A */
        List f7777A = null;

        /* renamed from: B */
        private int f7778B = 0;

        /* renamed from: C */
        C1894u f7779C = null;

        /* renamed from: D */
        boolean f7780D = false;

        /* renamed from: E */
        private int f7781E = 0;

        /* renamed from: F */
        int f7782F = -1;

        public AbstractC1876c0(View view) {
            if (view != null) {
                this.f7784p = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: x */
        private void m9928x() {
            if (this.f7794z == null) {
                ArrayList arrayList = new ArrayList();
                this.f7794z = arrayList;
                this.f7777A = Collections.unmodifiableList(arrayList);
            }
        }

        /* renamed from: A */
        public final int m9929A() {
            RecyclerView recyclerView = this.f7783G;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.m9908y0(this);
        }

        /* renamed from: B */
        public final long m9930B() {
            return this.f7788t;
        }

        /* renamed from: C */
        public final int m9931C() {
            return this.f7789u;
        }

        /* renamed from: F */
        public final int m9932F() {
            int i11 = this.f7790v;
            return i11 == -1 ? this.f7786r : i11;
        }

        /* renamed from: G */
        public final int m9933G() {
            return this.f7787s;
        }

        /* renamed from: H */
        List m9934H() {
            if ((this.f7793y & 1024) == 0) {
                List list = this.f7794z;
                if (list != null && list.size() != 0) {
                    return this.f7777A;
                }
                return f7776H;
            }
            return f7776H;
        }

        /* renamed from: J */
        boolean m9935J(int i11) {
            return (i11 & this.f7793y) != 0;
        }

        /* renamed from: L */
        boolean m9936L() {
            if ((this.f7793y & 512) == 0 && !m9939O()) {
                return false;
            }
            return true;
        }

        /* renamed from: M */
        boolean m9937M() {
            if (this.f7784p.getParent() != null && this.f7784p.getParent() != this.f7783G) {
                return true;
            }
            return false;
        }

        /* renamed from: N */
        public boolean m9938N() {
            return (this.f7793y & 1) != 0;
        }

        /* renamed from: O */
        public boolean m9939O() {
            return (this.f7793y & 4) != 0;
        }

        /* renamed from: P */
        public final boolean m9940P() {
            if ((this.f7793y & 16) == 0 && !AbstractC1579n0.m7856b0(this.f7784p)) {
                return true;
            }
            return false;
        }

        /* renamed from: Q */
        public boolean m9941Q() {
            return (this.f7793y & 8) != 0;
        }

        /* renamed from: R */
        boolean m9942R() {
            return this.f7779C != null;
        }

        /* renamed from: S */
        boolean m9943S() {
            return (this.f7793y & 256) != 0;
        }

        /* renamed from: T */
        boolean m9944T() {
            return (this.f7793y & 2) != 0;
        }

        /* renamed from: U */
        boolean m9945U() {
            return (this.f7793y & 2) != 0;
        }

        /* renamed from: V */
        void m9946V(int i11, boolean z11) {
            if (this.f7787s == -1) {
                this.f7787s = this.f7786r;
            }
            if (this.f7790v == -1) {
                this.f7790v = this.f7786r;
            }
            if (z11) {
                this.f7790v += i11;
            }
            this.f7786r += i11;
            if (this.f7784p.getLayoutParams() != null) {
                ((LayoutParams) this.f7784p.getLayoutParams()).f7764c = true;
            }
        }

        /* renamed from: W */
        void m9947W(RecyclerView recyclerView) {
            int i11 = this.f7782F;
            if (i11 != -1) {
                this.f7781E = i11;
            } else {
                this.f7781E = AbstractC1579n0.m7808E(this.f7784p);
            }
            recyclerView.m9840M1(this, 4);
        }

        /* renamed from: X */
        void m9948X(RecyclerView recyclerView) {
            recyclerView.m9840M1(this, this.f7781E);
            this.f7781E = 0;
        }

        /* renamed from: Y */
        void m9949Y() {
            this.f7793y = 0;
            this.f7786r = -1;
            this.f7787s = -1;
            this.f7788t = -1L;
            this.f7790v = -1;
            this.f7778B = 0;
            this.f7791w = null;
            this.f7792x = null;
            m9961s();
            this.f7781E = 0;
            this.f7782F = -1;
            RecyclerView.m9787L(this);
        }

        /* renamed from: a0 */
        void m9950a0() {
            if (this.f7787s == -1) {
                this.f7787s = this.f7786r;
            }
        }

        /* renamed from: b0 */
        void m9951b0(int i11, int i12) {
            this.f7793y = (i11 & i12) | (this.f7793y & (~i12));
        }

        /* renamed from: c0 */
        public final void m9952c0(boolean z11) {
            int i11;
            int i12 = this.f7778B;
            if (z11) {
                i11 = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
            this.f7778B = i11;
            if (i11 < 0) {
                this.f7778B = 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb2.append(this);
                return;
            }
            if (!z11 && i11 == 1) {
                this.f7793y |= 16;
            } else if (z11 && i11 == 0) {
                this.f7793y &= -17;
            }
        }

        /* renamed from: d0 */
        void m9953d0(C1894u c1894u, boolean z11) {
            this.f7779C = c1894u;
            this.f7780D = z11;
        }

        /* renamed from: e0 */
        boolean m9954e0() {
            return (this.f7793y & 16) != 0;
        }

        /* renamed from: f0 */
        public boolean m9955f0() {
            return (this.f7793y & 128) != 0;
        }

        /* renamed from: g0 */
        void m9956g0() {
            this.f7779C.m10201J(this);
        }

        /* renamed from: h0 */
        boolean m9957h0() {
            return (this.f7793y & 32) != 0;
        }

        /* renamed from: o */
        void m9958o(Object obj) {
            if (obj == null) {
                m9959q(1024);
            } else if ((1024 & this.f7793y) == 0) {
                m9928x();
                this.f7794z.add(obj);
            }
        }

        /* renamed from: q */
        void m9959q(int i11) {
            this.f7793y = i11 | this.f7793y;
        }

        /* renamed from: r */
        void m9960r() {
            this.f7787s = -1;
            this.f7790v = -1;
        }

        /* renamed from: s */
        void m9961s() {
            List list = this.f7794z;
            if (list != null) {
                list.clear();
            }
            this.f7793y &= -1025;
        }

        /* renamed from: t */
        void m9962t() {
            this.f7793y &= -33;
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f7786r + " id=" + this.f7788t + ", oldPos=" + this.f7787s + ", pLpos:" + this.f7790v);
            if (m9942R()) {
                sb2.append(" scrap ");
                if (this.f7780D) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (m9939O()) {
                sb2.append(" invalid");
            }
            if (!m9938N()) {
                sb2.append(" unbound");
            }
            if (m9945U()) {
                sb2.append(" update");
            }
            if (m9941Q()) {
                sb2.append(" removed");
            }
            if (m9955f0()) {
                sb2.append(" ignored");
            }
            if (m9943S()) {
                sb2.append(" tmpDetached");
            }
            if (!m9940P()) {
                sb2.append(" not recyclable(" + this.f7778B + ")");
            }
            if (m9936L()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f7784p.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* renamed from: v */
        void m9963v() {
            this.f7793y &= -257;
        }

        /* renamed from: y */
        boolean m9964y() {
            if ((this.f7793y & 16) == 0 && AbstractC1579n0.m7856b0(this.f7784p)) {
                return true;
            }
            return false;
        }

        /* renamed from: z */
        void m9965z(int i11, int i12, boolean z11) {
            m9959q(8);
            m9946V(i12, z11);
            this.f7786r = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    /* loaded from: classes.dex */
    public class C1877d implements C1910c0.b {
        C1877d() {
        }

        @Override // androidx.recyclerview.widget.C1910c0.b
        /* renamed from: a */
        public void mo9966a(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar, AbstractC1885l.c cVar2) {
            RecyclerView.this.m9828F(abstractC1876c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C1910c0.b
        /* renamed from: b */
        public void mo9967b(AbstractC1876c0 abstractC1876c0) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f7692B.m10134k1(abstractC1876c0.f7784p, recyclerView.f7742q);
        }

        @Override // androidx.recyclerview.widget.C1910c0.b
        /* renamed from: c */
        public void mo9968c(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar, AbstractC1885l.c cVar2) {
            RecyclerView.this.f7742q.m10201J(abstractC1876c0);
            RecyclerView.this.m9829H(abstractC1876c0, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.C1910c0.b
        /* renamed from: d */
        public void mo9969d(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar, AbstractC1885l.c cVar2) {
            abstractC1876c0.m9952c0(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f7719R) {
                if (recyclerView.f7728d0.mo10037b(abstractC1876c0, abstractC1876c0, cVar, cVar2)) {
                    RecyclerView.this.m9896n1();
                }
            } else if (recyclerView.f7728d0.mo10039d(abstractC1876c0, cVar, cVar2)) {
                RecyclerView.this.m9896n1();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    /* loaded from: classes.dex */
    public class C1878e implements C1913f.b {
        C1878e() {
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: a */
        public int mo9970a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: b */
        public View mo9971b(int i11) {
            return RecyclerView.this.getChildAt(i11);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: c */
        public void mo9972c(View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0 != null) {
                m9776D0.m9947W(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: d */
        public AbstractC1876c0 mo9973d(View view) {
            return RecyclerView.m9776D0(view);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: e */
        public void mo9974e(int i11) {
            AbstractC1876c0 m9776D0;
            View mo9971b = mo9971b(i11);
            if (mo9971b != null && (m9776D0 = RecyclerView.m9776D0(mo9971b)) != null) {
                if (m9776D0.m9943S() && !m9776D0.m9955f0()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m9776D0 + RecyclerView.this.m9890k0());
                }
                m9776D0.m9959q(256);
            }
            RecyclerView.this.detachViewFromParent(i11);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: f */
        public void mo9975f(View view, int i11) {
            RecyclerView.this.addView(view, i11);
            RecyclerView.this.m9855T(view);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: g */
        public void mo9976g() {
            int mo9970a = mo9970a();
            for (int i11 = 0; i11 < mo9970a; i11++) {
                View mo9971b = mo9971b(i11);
                RecyclerView.this.m9858U(mo9971b);
                mo9971b.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: h */
        public int mo9977h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: i */
        public void mo9978i(View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0 != null) {
                m9776D0.m9948X(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: j */
        public void mo9979j(int i11) {
            View childAt = RecyclerView.this.getChildAt(i11);
            if (childAt != null) {
                RecyclerView.this.m9858U(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i11);
        }

        @Override // androidx.recyclerview.widget.C1913f.b
        /* renamed from: k */
        public void mo9980k(View view, int i11, ViewGroup.LayoutParams layoutParams) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0 != null) {
                if (!m9776D0.m9943S() && !m9776D0.m9955f0()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + m9776D0 + RecyclerView.this.m9890k0());
                }
                m9776D0.m9963v();
            }
            RecyclerView.this.attachViewToParent(view, i11, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    /* loaded from: classes.dex */
    public class C1879f implements C1905a.a {
        C1879f() {
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: a */
        public void mo9981a(int i11, int i12) {
            RecyclerView.this.m9877d1(i11, i12);
            RecyclerView.this.f7759y0 = true;
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: b */
        public void mo9982b(C1905a.b bVar) {
            m9989i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: c */
        public void mo9983c(C1905a.b bVar) {
            m9989i(bVar);
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: d */
        public void mo9984d(int i11, int i12) {
            RecyclerView.this.m9879e1(i11, i12, false);
            RecyclerView.this.f7759y0 = true;
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: e */
        public void mo9985e(int i11, int i12, Object obj) {
            RecyclerView.this.m9869Z1(i11, i12, obj);
            RecyclerView.this.f7761z0 = true;
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: f */
        public AbstractC1876c0 mo9986f(int i11) {
            AbstractC1876c0 m9904w0 = RecyclerView.this.m9904w0(i11, true);
            if (m9904w0 == null || RecyclerView.this.f7748t.m10464n(m9904w0.f7784p)) {
                return null;
            }
            return m9904w0;
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: g */
        public void mo9987g(int i11, int i12) {
            RecyclerView.this.m9875c1(i11, i12);
            RecyclerView.this.f7759y0 = true;
        }

        @Override // androidx.recyclerview.widget.C1905a.a
        /* renamed from: h */
        public void mo9988h(int i11, int i12) {
            RecyclerView.this.m9879e1(i11, i12, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f7759y0 = true;
            recyclerView.f7753v0.f7868d += i12;
        }

        /* renamed from: i */
        void m9989i(C1905a.b bVar) {
            int i11 = bVar.f7946a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            RecyclerView recyclerView = RecyclerView.this;
                            recyclerView.f7692B.mo9661R0(recyclerView, bVar.f7947b, bVar.f7949d, 1);
                            return;
                        }
                        return;
                    }
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.f7692B.mo9664U0(recyclerView2, bVar.f7947b, bVar.f7949d, bVar.f7948c);
                    return;
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f7692B.mo9663S0(recyclerView3, bVar.f7947b, bVar.f7949d);
                return;
            }
            RecyclerView recyclerView4 = RecyclerView.this;
            recyclerView4.f7692B.mo9657P0(recyclerView4, bVar.f7947b, bVar.f7949d);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1880g {

        /* renamed from: p */
        private final C1881h f7798p = new C1881h();

        /* renamed from: q */
        private boolean f7799q = false;

        /* renamed from: A */
        public abstract void mo9990A(AbstractC1876c0 abstractC1876c0, int i11);

        /* renamed from: B */
        public void mo9991B(AbstractC1876c0 abstractC1876c0, int i11, List list) {
            mo9990A(abstractC1876c0, i11);
        }

        /* renamed from: C */
        public abstract AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11);

        /* renamed from: D */
        public void mo9993D(RecyclerView recyclerView) {
        }

        /* renamed from: E */
        public boolean m9994E(AbstractC1876c0 abstractC1876c0) {
            return false;
        }

        /* renamed from: F */
        public void mo9995F(AbstractC1876c0 abstractC1876c0) {
        }

        /* renamed from: G */
        public void mo9996G(AbstractC1876c0 abstractC1876c0) {
        }

        /* renamed from: H */
        public void mo9997H(AbstractC1876c0 abstractC1876c0) {
        }

        /* renamed from: I */
        public void m9998I(AbstractC1882i abstractC1882i) {
            this.f7798p.registerObserver(abstractC1882i);
        }

        /* renamed from: J */
        public void m9999J(boolean z11) {
            if (!m10006n()) {
                this.f7799q = z11;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: K */
        public void m10000K(AbstractC1882i abstractC1882i) {
            this.f7798p.unregisterObserver(abstractC1882i);
        }

        /* renamed from: i */
        public final void m10001i(AbstractC1876c0 abstractC1876c0, int i11) {
            abstractC1876c0.f7786r = i11;
            if (m10007o()) {
                abstractC1876c0.f7788t = mo10004l(i11);
            }
            abstractC1876c0.m9951b0(1, 519);
            AbstractC1452r.m7366a("RV OnBindView");
            mo9991B(abstractC1876c0, i11, abstractC1876c0.m9934H());
            abstractC1876c0.m9961s();
            ViewGroup.LayoutParams layoutParams = abstractC1876c0.f7784p.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).f7764c = true;
            }
            AbstractC1452r.m7367b();
        }

        /* renamed from: j */
        public final AbstractC1876c0 m10002j(ViewGroup viewGroup, int i11) {
            try {
                AbstractC1452r.m7366a("RV CreateView");
                AbstractC1876c0 mo9992C = mo9992C(viewGroup, i11);
                if (mo9992C.f7784p.getParent() == null) {
                    mo9992C.f7789u = i11;
                    return mo9992C;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                AbstractC1452r.m7367b();
            }
        }

        /* renamed from: k */
        public abstract int mo10003k();

        /* renamed from: l */
        public long mo10004l(int i11) {
            return -1L;
        }

        /* renamed from: m */
        public int mo10005m(int i11) {
            return 0;
        }

        /* renamed from: n */
        public final boolean m10006n() {
            return this.f7798p.m10019a();
        }

        /* renamed from: o */
        public final boolean m10007o() {
            return this.f7799q;
        }

        /* renamed from: p */
        public final void m10008p() {
            this.f7798p.m10020b();
        }

        /* renamed from: q */
        public final void m10009q(int i11) {
            this.f7798p.m10022d(i11, 1);
        }

        /* renamed from: r */
        public final void m10010r(int i11, Object obj) {
            this.f7798p.m10023e(i11, 1, obj);
        }

        /* renamed from: s */
        public final void m10011s(int i11) {
            this.f7798p.m10024f(i11, 1);
        }

        /* renamed from: t */
        public final void m10012t(int i11, int i12) {
            this.f7798p.m10021c(i11, i12);
        }

        /* renamed from: u */
        public final void m10013u(int i11, int i12) {
            this.f7798p.m10022d(i11, i12);
        }

        /* renamed from: v */
        public final void m10014v(int i11, int i12, Object obj) {
            this.f7798p.m10023e(i11, i12, obj);
        }

        /* renamed from: w */
        public final void m10015w(int i11, int i12) {
            this.f7798p.m10024f(i11, i12);
        }

        /* renamed from: x */
        public final void m10016x(int i11, int i12) {
            this.f7798p.m10025g(i11, i12);
        }

        /* renamed from: y */
        public final void m10017y(int i11) {
            this.f7798p.m10025g(i11, 1);
        }

        /* renamed from: z */
        public void mo10018z(RecyclerView recyclerView) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    /* loaded from: classes.dex */
    public static class C1881h extends Observable {
        C1881h() {
        }

        /* renamed from: a */
        public boolean m10019a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* renamed from: b */
        public void m10020b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1882i) ((Observable) this).mObservers.get(size)).mo10026a();
            }
        }

        /* renamed from: c */
        public void m10021c(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1882i) ((Observable) this).mObservers.get(size)).mo10030e(i11, i12, 1);
            }
        }

        /* renamed from: d */
        public void m10022d(int i11, int i12) {
            m10023e(i11, i12, null);
        }

        /* renamed from: e */
        public void m10023e(int i11, int i12, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1882i) ((Observable) this).mObservers.get(size)).mo10028c(i11, i12, obj);
            }
        }

        /* renamed from: f */
        public void m10024f(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1882i) ((Observable) this).mObservers.get(size)).mo10029d(i11, i12);
            }
        }

        /* renamed from: g */
        public void m10025g(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1882i) ((Observable) this).mObservers.get(size)).mo10031f(i11, i12);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1882i {
        /* renamed from: a */
        public void mo10026a() {
        }

        /* renamed from: b */
        public void mo10027b(int i11, int i12) {
        }

        /* renamed from: c */
        public void mo10028c(int i11, int i12, Object obj) {
            mo10027b(i11, i12);
        }

        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
        }

        /* renamed from: e */
        public void mo10030e(int i11, int i12, int i13) {
        }

        /* renamed from: f */
        public void mo10031f(int i11, int i12) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    /* loaded from: classes2.dex */
    public interface InterfaceC1883j {
        /* renamed from: a */
        int m10032a(int i11, int i12);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    /* loaded from: classes.dex */
    public static class C1884k {
        /* renamed from: a */
        protected EdgeEffect m10033a(RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1885l {

        /* renamed from: a */
        private b f7800a = null;

        /* renamed from: b */
        private ArrayList f7801b = new ArrayList();

        /* renamed from: c */
        private long f7802c = 120;

        /* renamed from: d */
        private long f7803d = 120;

        /* renamed from: e */
        private long f7804e = 250;

        /* renamed from: f */
        private long f7805f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        /* loaded from: classes2.dex */
        public interface a {
            /* renamed from: a */
            void mo10061a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        /* loaded from: classes2.dex */
        public interface b {
            /* renamed from: a */
            void mo10062a(AbstractC1876c0 abstractC1876c0);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        /* loaded from: classes2.dex */
        public static class c {

            /* renamed from: a */
            public int f7806a;

            /* renamed from: b */
            public int f7807b;

            /* renamed from: c */
            public int f7808c;

            /* renamed from: d */
            public int f7809d;

            /* renamed from: a */
            public c m10063a(AbstractC1876c0 abstractC1876c0) {
                return m10064b(abstractC1876c0, 0);
            }

            /* renamed from: b */
            public c m10064b(AbstractC1876c0 abstractC1876c0, int i11) {
                View view = abstractC1876c0.f7784p;
                this.f7806a = view.getLeft();
                this.f7807b = view.getTop();
                this.f7808c = view.getRight();
                this.f7809d = view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m10034e(AbstractC1876c0 abstractC1876c0) {
            int i11 = abstractC1876c0.f7793y;
            int i12 = i11 & 14;
            if (abstractC1876c0.m9939O()) {
                return 4;
            }
            if ((i11 & 4) == 0) {
                int m9933G = abstractC1876c0.m9933G();
                int m9929A = abstractC1876c0.m9929A();
                if (m9933G != -1 && m9929A != -1 && m9933G != m9929A) {
                    return i12 | ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
                }
                return i12;
            }
            return i12;
        }

        /* renamed from: A */
        public void m10035A(long j11) {
            this.f7803d = j11;
        }

        /* renamed from: a */
        public abstract boolean mo10036a(AbstractC1876c0 abstractC1876c0, c cVar, c cVar2);

        /* renamed from: b */
        public abstract boolean mo10037b(AbstractC1876c0 abstractC1876c0, AbstractC1876c0 abstractC1876c02, c cVar, c cVar2);

        /* renamed from: c */
        public abstract boolean mo10038c(AbstractC1876c0 abstractC1876c0, c cVar, c cVar2);

        /* renamed from: d */
        public abstract boolean mo10039d(AbstractC1876c0 abstractC1876c0, c cVar, c cVar2);

        /* renamed from: f */
        public abstract boolean mo10040f(AbstractC1876c0 abstractC1876c0);

        /* renamed from: g */
        public boolean mo10041g(AbstractC1876c0 abstractC1876c0, List list) {
            return mo10040f(abstractC1876c0);
        }

        /* renamed from: h */
        public final void m10042h(AbstractC1876c0 abstractC1876c0) {
            mo10053s(abstractC1876c0);
            b bVar = this.f7800a;
            if (bVar != null) {
                bVar.mo10062a(abstractC1876c0);
            }
        }

        /* renamed from: i */
        public final void m10043i() {
            int size = this.f7801b.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((a) this.f7801b.get(i11)).mo10061a();
            }
            this.f7801b.clear();
        }

        /* renamed from: j */
        public abstract void mo10044j(AbstractC1876c0 abstractC1876c0);

        /* renamed from: k */
        public abstract void mo10045k();

        /* renamed from: l */
        public long m10046l() {
            return this.f7802c;
        }

        /* renamed from: m */
        public long m10047m() {
            return this.f7805f;
        }

        /* renamed from: n */
        public long m10048n() {
            return this.f7804e;
        }

        /* renamed from: o */
        public long m10049o() {
            return this.f7803d;
        }

        /* renamed from: p */
        public abstract boolean mo10050p();

        /* renamed from: q */
        public final boolean m10051q(a aVar) {
            boolean mo10050p = mo10050p();
            if (aVar != null) {
                if (!mo10050p) {
                    aVar.mo10061a();
                } else {
                    this.f7801b.add(aVar);
                }
            }
            return mo10050p;
        }

        /* renamed from: r */
        public c m10052r() {
            return new c();
        }

        /* renamed from: s */
        public void mo10053s(AbstractC1876c0 abstractC1876c0) {
        }

        /* renamed from: t */
        public c m10054t(C1899z c1899z, AbstractC1876c0 abstractC1876c0) {
            return m10052r().m10063a(abstractC1876c0);
        }

        /* renamed from: u */
        public c m10055u(C1899z c1899z, AbstractC1876c0 abstractC1876c0, int i11, List list) {
            return m10052r().m10063a(abstractC1876c0);
        }

        /* renamed from: v */
        public abstract void mo10056v();

        /* renamed from: w */
        public void m10057w(long j11) {
            this.f7802c = j11;
        }

        /* renamed from: x */
        public void m10058x(long j11) {
            this.f7805f = j11;
        }

        /* renamed from: y */
        void m10059y(b bVar) {
            this.f7800a = bVar;
        }

        /* renamed from: z */
        public void m10060z(long j11) {
            this.f7804e = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    /* loaded from: classes.dex */
    public class C1886m implements AbstractC1885l.b {
        C1886m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1885l.b
        /* renamed from: a */
        public void mo10062a(AbstractC1876c0 abstractC1876c0) {
            abstractC1876c0.m9952c0(true);
            if (abstractC1876c0.f7791w != null && abstractC1876c0.f7792x == null) {
                abstractC1876c0.f7791w = null;
            }
            abstractC1876c0.f7792x = null;
            if (!abstractC1876c0.m9954e0() && !RecyclerView.this.m9905w1(abstractC1876c0.f7784p) && abstractC1876c0.m9943S()) {
                RecyclerView.this.removeDetachedView(abstractC1876c0.f7784p, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1887n {
        /* renamed from: f */
        public void m10065f(Rect rect, int i11, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, C1899z c1899z) {
            m10065f(rect, ((LayoutParams) view.getLayoutParams()).m9913b(), recyclerView);
        }

        /* renamed from: h */
        public void m10067h(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        public void mo10068i(Canvas canvas, RecyclerView recyclerView, C1899z c1899z) {
            m10067h(canvas, recyclerView);
        }

        /* renamed from: j */
        public void m10069j(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: k */
        public void mo10070k(Canvas canvas, RecyclerView recyclerView, C1899z c1899z) {
            m10069j(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1888o {

        /* renamed from: a */
        C1913f f7811a;

        /* renamed from: b */
        RecyclerView f7812b;

        /* renamed from: c */
        private final C1908b0.b f7813c;

        /* renamed from: d */
        private final C1908b0.b f7814d;

        /* renamed from: e */
        C1908b0 f7815e;

        /* renamed from: f */
        C1908b0 f7816f;

        /* renamed from: g */
        AbstractC1898y f7817g;

        /* renamed from: h */
        boolean f7818h;

        /* renamed from: i */
        boolean f7819i;

        /* renamed from: j */
        boolean f7820j;

        /* renamed from: k */
        private boolean f7821k;

        /* renamed from: l */
        private boolean f7822l;

        /* renamed from: m */
        int f7823m;

        /* renamed from: n */
        boolean f7824n;

        /* renamed from: o */
        private int f7825o;

        /* renamed from: p */
        private int f7826p;

        /* renamed from: q */
        private int f7827q;

        /* renamed from: r */
        private int f7828r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        /* loaded from: classes.dex */
        public class a implements C1908b0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: a */
            public int mo10167a(View view) {
                return AbstractC1888o.this.m10121f(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: b */
            public View mo10168b(int i11) {
                return AbstractC1888o.this.m10105V(i11);
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: c */
            public int mo10169c() {
                return AbstractC1888o.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: d */
            public int mo10170d() {
                return AbstractC1888o.this.getWidth() - AbstractC1888o.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: e */
            public int mo10171e(View view) {
                return AbstractC1888o.this.m10132k(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        /* loaded from: classes.dex */
        public class b implements C1908b0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: a */
            public int mo10167a(View view) {
                return AbstractC1888o.this.m10135l(view) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: b */
            public View mo10168b(int i11) {
                return AbstractC1888o.this.m10105V(i11);
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: c */
            public int mo10169c() {
                return AbstractC1888o.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: d */
            public int mo10170d() {
                return AbstractC1888o.this.getHeight() - AbstractC1888o.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C1908b0.b
            /* renamed from: e */
            public int mo10171e(View view) {
                return AbstractC1888o.this.m10130j(view) + ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        /* loaded from: classes2.dex */
        public interface c {
            /* renamed from: a */
            void mo10172a(int i11, int i12);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        /* loaded from: classes2.dex */
        public static class d {

            /* renamed from: a */
            public int f7831a;

            /* renamed from: b */
            public int f7832b;

            /* renamed from: c */
            public boolean f7833c;

            /* renamed from: d */
            public boolean f7834d;
        }

        public AbstractC1888o() {
            a aVar = new a();
            this.f7813c = aVar;
            b bVar = new b();
            this.f7814d = bVar;
            this.f7815e = new C1908b0(aVar);
            this.f7816f = new C1908b0(bVar);
            this.f7818h = false;
            this.f7819i = false;
            this.f7820j = false;
            this.f7821k = true;
            this.f7822l = true;
        }

        /* renamed from: A */
        public static int m10071A(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i12, i13);
                }
                return size;
            }
            return Math.min(size, Math.max(i12, i13));
        }

        /* renamed from: L */
        private void m10072L(int i11, View view) {
            this.f7811a.m10456d(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:            if (r5 == 1073741824) goto L37;     */
        /* renamed from: W */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m10073W(int i11, int i12, int i13, int i14, boolean z11) {
            int max = Math.max(0, i11 - i13);
            if (z11) {
                if (i14 < 0) {
                    if (i14 == -1) {
                        if (i12 != Integer.MIN_VALUE) {
                            if (i12 != 0) {
                            }
                        }
                        i14 = max;
                    }
                    i12 = 0;
                    i14 = 0;
                }
                i12 = 1073741824;
            } else {
                if (i14 < 0) {
                    if (i14 != -1) {
                        if (i14 == -2) {
                            if (i12 != Integer.MIN_VALUE && i12 != 1073741824) {
                                i12 = 0;
                            } else {
                                i12 = Integer.MIN_VALUE;
                            }
                        }
                        i12 = 0;
                        i14 = 0;
                    }
                    i14 = max;
                }
                i12 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i14, i12);
        }

        /* renamed from: X */
        private int[] m10074X(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i11 = left - paddingLeft;
            int min = Math.min(0, i11);
            int i12 = top - paddingTop;
            int min2 = Math.min(0, i12);
            int i13 = width2 - width;
            int max = Math.max(0, i13);
            int max2 = Math.max(0, height2 - height);
            if (m10116d0() == 1) {
                if (max == 0) {
                    max = Math.max(min, i13);
                }
            } else {
                if (min == 0) {
                    min = Math.min(i11, max);
                }
                max = min;
            }
            if (min2 == 0) {
                min2 = Math.min(i12, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: h0 */
        public static d m10075h0(Context context, AttributeSet attributeSet, int i11, int i12) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC31151d.RecyclerView, i11, i12);
            dVar.f7831a = obtainStyledAttributes.getInt(AbstractC31151d.RecyclerView_android_orientation, 1);
            dVar.f7832b = obtainStyledAttributes.getInt(AbstractC31151d.RecyclerView_spanCount, 1);
            dVar.f7833c = obtainStyledAttributes.getBoolean(AbstractC31151d.RecyclerView_reverseLayout, false);
            dVar.f7834d = obtainStyledAttributes.getBoolean(AbstractC31151d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: r0 */
        private boolean m10076r0(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.f7812b.f7756x;
            m10111a0(focusedChild, rect);
            if (rect.left - i11 >= width || rect.right - i11 <= paddingLeft || rect.top - i12 >= height || rect.bottom - i12 <= paddingTop) {
                return false;
            }
            return true;
        }

        /* renamed from: s */
        private void m10077s(View view, int i11, boolean z11) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (!z11 && !m9776D0.m9941Q()) {
                this.f7812b.f7750u.m10437p(m9776D0);
            } else {
                this.f7812b.f7750u.m10424b(m9776D0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!m9776D0.m9957h0() && !m9776D0.m9942R()) {
                if (view.getParent() == this.f7812b) {
                    int m10463m = this.f7811a.m10463m(view);
                    if (i11 == -1) {
                        i11 = this.f7811a.m10459g();
                    }
                    if (m10463m != -1) {
                        if (m10463m != i11) {
                            this.f7812b.f7692B.m10165z0(m10463m, i11);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f7812b.indexOfChild(view) + this.f7812b.m9890k0());
                    }
                } else {
                    this.f7811a.m10453a(view, i11, false);
                    layoutParams.f7764c = true;
                    AbstractC1898y abstractC1898y = this.f7817g;
                    if (abstractC1898y != null && abstractC1898y.m10236h()) {
                        this.f7817g.m10239k(view);
                    }
                }
            } else {
                if (m9776D0.m9942R()) {
                    m9776D0.m9956g0();
                } else {
                    m9776D0.m9962t();
                }
                this.f7811a.m10455c(view, i11, view.getLayoutParams(), false);
            }
            if (layoutParams.f7765d) {
                m9776D0.f7784p.invalidate();
                layoutParams.f7765d = false;
            }
        }

        /* renamed from: t1 */
        private void m10078t1(C1894u c1894u, int i11, View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0.m9955f0()) {
                return;
            }
            if (m9776D0.m9939O() && !m9776D0.m9941Q() && !this.f7812b.f7690A.m10007o()) {
                m10145o1(i11);
                c1894u.m10195C(m9776D0);
            } else {
                m10094K(i11);
                c1894u.m10196D(view);
                this.f7812b.f7750u.m10433k(m9776D0);
            }
        }

        /* renamed from: u0 */
        private static boolean m10079u0(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 > 0 && i11 != i13) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i11) {
                    return false;
                }
                return true;
            }
            if (size < i11) {
                return false;
            }
            return true;
        }

        /* renamed from: A0 */
        public void mo10080A0(int i11) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                recyclerView.m9871a1(i11);
            }
        }

        /* renamed from: A1 */
        public void mo9647A1(Rect rect, int i11, int i12) {
            m10166z1(m10071A(i11, rect.width() + getPaddingLeft() + getPaddingRight(), m10124g0()), m10071A(i12, rect.height() + getPaddingTop() + getPaddingBottom(), m10122f0()));
        }

        /* renamed from: B */
        public abstract void mo9720B(int i11, int i12, C1899z c1899z, c cVar);

        /* renamed from: B0 */
        public void mo10081B0(int i11) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                recyclerView.m9873b1(i11);
            }
        }

        /* renamed from: B1 */
        void m10082B1(int i11, int i12) {
            int m10110a = m10110a();
            if (m10110a == 0) {
                this.f7812b.m9850R(i11, i12);
                return;
            }
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = 0; i17 < m10110a; i17++) {
                View m10105V = m10105V(i17);
                Rect rect = this.f7812b.f7756x;
                m10111a0(m10105V, rect);
                int i18 = rect.left;
                if (i18 < i15) {
                    i15 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i16) {
                    i16 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i14) {
                    i14 = i22;
                }
            }
            this.f7812b.f7756x.set(i15, i16, i13, i14);
            mo9647A1(this.f7812b.f7756x, i11, i12);
        }

        /* renamed from: C */
        public void mo9722C(int i11, c cVar) {
        }

        /* renamed from: C0 */
        public void m10083C0(AbstractC1880g abstractC1880g, AbstractC1880g abstractC1880g2) {
        }

        /* renamed from: C1 */
        void m10084C1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f7812b = null;
                this.f7811a = null;
                this.f7827q = 0;
                this.f7828r = 0;
            } else {
                this.f7812b = recyclerView;
                this.f7811a = recyclerView.f7748t;
                this.f7827q = recyclerView.getWidth();
                this.f7828r = recyclerView.getHeight();
            }
            this.f7825o = 1073741824;
            this.f7826p = 1073741824;
        }

        /* renamed from: D */
        public abstract int mo9724D(C1899z c1899z);

        /* renamed from: D0 */
        public boolean m10085D0(RecyclerView recyclerView, ArrayList arrayList, int i11, int i12) {
            return false;
        }

        /* renamed from: D1 */
        public boolean m10086D1(View view, int i11, int i12, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.f7821k && m10079u0(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m10079u0(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: E */
        public abstract int mo9648E(C1899z c1899z);

        /* renamed from: E0 */
        public void mo10087E0(RecyclerView recyclerView) {
        }

        /* renamed from: E1 */
        boolean mo9726E1() {
            return false;
        }

        /* renamed from: F */
        public abstract int mo9650F(C1899z c1899z);

        /* renamed from: F0 */
        public void m10088F0(RecyclerView recyclerView) {
        }

        /* renamed from: F1 */
        public boolean m10089F1(View view, int i11, int i12, LayoutParams layoutParams) {
            if (this.f7821k && m10079u0(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) layoutParams).width) && m10079u0(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* renamed from: G */
        public abstract int mo9727G(C1899z c1899z);

        /* renamed from: G0 */
        public void mo9728G0(RecyclerView recyclerView, C1894u c1894u) {
            m10088F0(recyclerView);
        }

        /* renamed from: G1 */
        public abstract void mo9729G1(RecyclerView recyclerView, C1899z c1899z, int i11);

        /* renamed from: H */
        public abstract int mo9651H(C1899z c1899z);

        /* renamed from: H0 */
        public abstract View mo9652H0(View view, int i11, C1894u c1894u, C1899z c1899z);

        /* renamed from: H1 */
        public void m10090H1(AbstractC1898y abstractC1898y) {
            AbstractC1898y abstractC1898y2 = this.f7817g;
            if (abstractC1898y2 != null && abstractC1898y != abstractC1898y2 && abstractC1898y2.m10236h()) {
                this.f7817g.m10246r();
            }
            this.f7817g = abstractC1898y;
            abstractC1898y.m10245q(this.f7812b, this);
        }

        /* renamed from: I */
        public abstract int mo9653I(C1899z c1899z);

        /* renamed from: I0 */
        public void mo9730I0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f7812b;
            m10093J0(recyclerView.f7742q, recyclerView.f7753v0, accessibilityEvent);
        }

        /* renamed from: I1 */
        void m10091I1() {
            AbstractC1898y abstractC1898y = this.f7817g;
            if (abstractC1898y != null) {
                abstractC1898y.m10246r();
            }
        }

        /* renamed from: J */
        public void m10092J(C1894u c1894u) {
            for (int m10110a = m10110a() - 1; m10110a >= 0; m10110a--) {
                m10078t1(c1894u, m10110a, m10105V(m10110a));
            }
        }

        /* renamed from: J0 */
        public void m10093J0(C1894u c1894u, C1899z c1899z, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z11 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f7812b.canScrollVertically(-1) && !this.f7812b.canScrollHorizontally(-1) && !this.f7812b.canScrollHorizontally(1)) {
                    z11 = false;
                }
                accessibilityEvent.setScrollable(z11);
                AbstractC1880g abstractC1880g = this.f7812b.f7690A;
                if (abstractC1880g != null) {
                    accessibilityEvent.setItemCount(abstractC1880g.mo10003k());
                }
            }
        }

        /* renamed from: J1 */
        public abstract boolean mo9654J1();

        /* renamed from: K */
        public void m10094K(int i11) {
            m10072L(i11, m10105V(i11));
        }

        /* renamed from: K0 */
        public void m10095K0(C1507g0 c1507g0) {
            RecyclerView recyclerView = this.f7812b;
            mo10096L0(recyclerView.f7742q, recyclerView.f7753v0, c1507g0);
        }

        /* renamed from: L0 */
        public void mo10096L0(C1894u c1894u, C1899z c1899z, C1507g0 c1507g0) {
            if (this.f7812b.canScrollVertically(-1) || this.f7812b.canScrollHorizontally(-1)) {
                c1507g0.m7612a(8192);
                c1507g0.m7653y0(true);
            }
            if (this.f7812b.canScrollVertically(1) || this.f7812b.canScrollHorizontally(1)) {
                c1507g0.m7612a(4096);
                c1507g0.m7653y0(true);
            }
            c1507g0.m7622f0(C1507g0.b.m7661b(mo9673j0(c1894u, c1899z), mo9669Z(c1894u, c1899z), m10155t0(c1894u, c1899z), m10133k0(c1894u, c1899z)));
        }

        /* renamed from: M */
        void m10097M(RecyclerView recyclerView) {
            this.f7819i = true;
            mo10087E0(recyclerView);
        }

        /* renamed from: M0 */
        public void m10098M0(View view, C1507g0 c1507g0) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0 != null && !m9776D0.m9941Q() && !this.f7811a.m10464n(m9776D0.f7784p)) {
                RecyclerView recyclerView = this.f7812b;
                mo9656N0(recyclerView.f7742q, recyclerView.f7753v0, view, c1507g0);
            }
        }

        /* renamed from: N */
        void m10099N(RecyclerView recyclerView, C1894u c1894u) {
            this.f7819i = false;
            mo9728G0(recyclerView, c1894u);
        }

        /* renamed from: N0 */
        public void mo9656N0(C1894u c1894u, C1899z c1899z, View view, C1507g0 c1507g0) {
            int i11;
            int i12;
            if (mo9758y()) {
                i11 = m10112b(view);
            } else {
                i11 = 0;
            }
            if (mo9757x()) {
                i12 = m10112b(view);
            } else {
                i12 = 0;
            }
            c1507g0.m7623g0(C1507g0.c.m7662a(i11, 1, i12, 1, false, false));
        }

        /* renamed from: O */
        public View m10100O(View view) {
            View m9895n0;
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null || (m9895n0 = recyclerView.m9895n0(view)) == null || this.f7811a.m10464n(m9895n0)) {
                return null;
            }
            return m9895n0;
        }

        /* renamed from: O0 */
        public View m10101O0(View view, int i11) {
            return null;
        }

        /* renamed from: P */
        public View mo9732P(int i11) {
            int m10110a = m10110a();
            for (int i12 = 0; i12 < m10110a; i12++) {
                View m10105V = m10105V(i12);
                AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(m10105V);
                if (m9776D0 != null && m9776D0.m9932F() == i11 && !m9776D0.m9955f0() && (this.f7812b.f7753v0.m10256e() || !m9776D0.m9941Q())) {
                    return m10105V;
                }
            }
            return null;
        }

        /* renamed from: P0 */
        public void mo9657P0(RecyclerView recyclerView, int i11, int i12) {
        }

        /* renamed from: Q */
        public abstract LayoutParams mo9658Q();

        /* renamed from: Q0 */
        public void mo9659Q0(RecyclerView recyclerView) {
        }

        /* renamed from: R */
        public LayoutParams mo9660R(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: R0 */
        public void mo9661R0(RecyclerView recyclerView, int i11, int i12, int i13) {
        }

        /* renamed from: S */
        public LayoutParams mo9662S(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: S0 */
        public void mo9663S0(RecyclerView recyclerView, int i11, int i12) {
        }

        /* renamed from: T */
        public int m10102T() {
            return -1;
        }

        /* renamed from: T0 */
        public void m10103T0(RecyclerView recyclerView, int i11, int i12) {
        }

        /* renamed from: U */
        public int m10104U(View view) {
            return ((LayoutParams) view.getLayoutParams()).f7763b.bottom;
        }

        /* renamed from: U0 */
        public void mo9664U0(RecyclerView recyclerView, int i11, int i12, Object obj) {
            m10103T0(recyclerView, i11, i12);
        }

        /* renamed from: V */
        public View m10105V(int i11) {
            C1913f c1913f = this.f7811a;
            if (c1913f != null) {
                return c1913f.m10458f(i11);
            }
            return null;
        }

        /* renamed from: V0 */
        public abstract void mo9665V0(C1894u c1894u, C1899z c1899z);

        /* renamed from: W0 */
        public void mo9666W0(C1899z c1899z) {
        }

        /* renamed from: X0 */
        public void m10106X0(C1894u c1894u, C1899z c1899z, int i11, int i12) {
            this.f7812b.m9850R(i11, i12);
        }

        /* renamed from: Y */
        public boolean m10107Y() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null && recyclerView.f7752v) {
                return true;
            }
            return false;
        }

        /* renamed from: Y0 */
        public boolean m10108Y0(RecyclerView recyclerView, View view, View view2) {
            if (!m10158v0() && !recyclerView.m9861V0()) {
                return false;
            }
            return true;
        }

        /* renamed from: Z */
        public int mo9669Z(C1894u c1894u, C1899z c1899z) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null || recyclerView.f7690A == null || !mo9757x()) {
                return 1;
            }
            return this.f7812b.f7690A.mo10003k();
        }

        /* renamed from: Z0 */
        public boolean m10109Z0(RecyclerView recyclerView, C1899z c1899z, View view, View view2) {
            return m10108Y0(recyclerView, view, view2);
        }

        /* renamed from: a */
        public int m10110a() {
            C1913f c1913f = this.f7811a;
            if (c1913f != null) {
                return c1913f.m10459g();
            }
            return 0;
        }

        /* renamed from: a0 */
        public void m10111a0(View view, Rect rect) {
            RecyclerView.m9779F0(view, rect);
        }

        /* renamed from: a1 */
        public abstract void mo9742a1(Parcelable parcelable);

        /* renamed from: b */
        public int m10112b(View view) {
            return ((LayoutParams) view.getLayoutParams()).m9913b();
        }

        /* renamed from: b0 */
        public View m10113b0() {
            View focusedChild;
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f7811a.m10464n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: b1 */
        public abstract Parcelable mo9743b1();

        /* renamed from: c0 */
        public int m10114c0() {
            return this.f7826p;
        }

        /* renamed from: c1 */
        public void mo10115c1(int i11) {
        }

        /* renamed from: d0 */
        public int m10116d0() {
            return AbstractC1579n0.m7812G(this.f7812b);
        }

        /* renamed from: d1 */
        void m10117d1(AbstractC1898y abstractC1898y) {
            if (this.f7817g == abstractC1898y) {
                this.f7817g = null;
            }
        }

        /* renamed from: e */
        public int m10118e(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f7763b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: e0 */
        public int m10119e0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f7763b.left;
        }

        /* renamed from: e1 */
        public boolean m10120e1(int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f7812b;
            return mo10123f1(recyclerView.f7742q, recyclerView.f7753v0, i11, bundle);
        }

        /* renamed from: f */
        public int m10121f(View view) {
            return view.getLeft() - m10119e0(view);
        }

        /* renamed from: f0 */
        public int m10122f0() {
            return AbstractC1579n0.m7814H(this.f7812b);
        }

        /* renamed from: f1 */
        public boolean mo10123f1(C1894u c1894u, C1899z c1899z, int i11, Bundle bundle) {
            int i12;
            int width;
            int i13;
            int i14;
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null) {
                return false;
            }
            if (i11 != 4096) {
                if (i11 != 8192) {
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (recyclerView.canScrollVertically(-1)) {
                        i12 = -((getHeight() - getPaddingTop()) - getPaddingBottom());
                    } else {
                        i12 = 0;
                    }
                    if (this.f7812b.canScrollHorizontally(-1)) {
                        width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                        i13 = i12;
                        i14 = width;
                    }
                    i13 = i12;
                    i14 = 0;
                }
            } else {
                if (recyclerView.canScrollVertically(1)) {
                    i12 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                } else {
                    i12 = 0;
                }
                if (this.f7812b.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i13 = i12;
                    i14 = width;
                }
                i13 = i12;
                i14 = 0;
            }
            if (i13 == 0 && i14 == 0) {
                return false;
            }
            this.f7812b.m9852R1(i14, i13, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* renamed from: g0 */
        public int m10124g0() {
            return AbstractC1579n0.m7816I(this.f7812b);
        }

        /* renamed from: g1 */
        public boolean m10125g1(View view, int i11, Bundle bundle) {
            RecyclerView recyclerView = this.f7812b;
            return m10126h1(recyclerView.f7742q, recyclerView.f7753v0, view, i11, bundle);
        }

        public int getHeight() {
            return this.f7828r;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getWidth() {
            return this.f7827q;
        }

        /* renamed from: h1 */
        public boolean m10126h1(C1894u c1894u, C1899z c1899z, View view, int i11, Bundle bundle) {
            return false;
        }

        /* renamed from: i */
        public int m10127i() {
            AbstractC1880g abstractC1880g;
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                abstractC1880g = recyclerView.getAdapter();
            } else {
                abstractC1880g = null;
            }
            if (abstractC1880g != null) {
                return abstractC1880g.mo10003k();
            }
            return 0;
        }

        /* renamed from: i0 */
        public int m10128i0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f7763b.right;
        }

        /* renamed from: i1 */
        public void m10129i1(C1894u c1894u) {
            for (int m10110a = m10110a() - 1; m10110a >= 0; m10110a--) {
                if (!RecyclerView.m9776D0(m10105V(m10110a)).m9955f0()) {
                    m10137l1(m10110a, c1894u);
                }
            }
        }

        /* renamed from: j */
        public int m10130j(View view) {
            return view.getBottom() + m10104U(view);
        }

        /* renamed from: j0 */
        public int mo9673j0(C1894u c1894u, C1899z c1899z) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null || recyclerView.f7690A == null || !mo9758y()) {
                return 1;
            }
            return this.f7812b.f7690A.mo10003k();
        }

        /* renamed from: j1 */
        void m10131j1(C1894u c1894u) {
            int m10213j = c1894u.m10213j();
            for (int i11 = m10213j - 1; i11 >= 0; i11--) {
                View m10217n = c1894u.m10217n(i11);
                AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(m10217n);
                if (!m9776D0.m9955f0()) {
                    m9776D0.m9952c0(false);
                    if (m9776D0.m9943S()) {
                        this.f7812b.removeDetachedView(m10217n, false);
                    }
                    AbstractC1885l abstractC1885l = this.f7812b.f7728d0;
                    if (abstractC1885l != null) {
                        abstractC1885l.mo10044j(m9776D0);
                    }
                    m9776D0.m9952c0(true);
                    c1894u.m10226y(m10217n);
                }
            }
            c1894u.m10208e();
            if (m10213j > 0) {
                this.f7812b.invalidate();
            }
        }

        /* renamed from: k */
        public int m10132k(View view) {
            return view.getRight() + m10128i0(view);
        }

        /* renamed from: k0 */
        public int m10133k0(C1894u c1894u, C1899z c1899z) {
            return 0;
        }

        /* renamed from: k1 */
        public void m10134k1(View view, C1894u c1894u) {
            m10142n1(view);
            c1894u.m10194B(view);
        }

        /* renamed from: l */
        public int m10135l(View view) {
            return view.getTop() - m10136l0(view);
        }

        /* renamed from: l0 */
        public int m10136l0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f7763b.top;
        }

        /* renamed from: l1 */
        public void m10137l1(int i11, C1894u c1894u) {
            View m10105V = m10105V(i11);
            m10145o1(i11);
            c1894u.m10194B(m10105V);
        }

        /* renamed from: m0 */
        public void m10138m0(View view, boolean z11, Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f7763b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f7812b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f7812b.f7760z;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: m1 */
        public boolean m10139m1(Runnable runnable) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: n */
        public int m10140n(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f7763b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: n0 */
        public int m10141n0() {
            return this.f7825o;
        }

        /* renamed from: n1 */
        public void m10142n1(View view) {
            this.f7811a.m10466p(view);
        }

        /* renamed from: o */
        public void m10143o(View view) {
            m10146p(view, -1);
        }

        /* renamed from: o0 */
        public boolean m10144o0() {
            int m10110a = m10110a();
            for (int i11 = 0; i11 < m10110a; i11++) {
                ViewGroup.LayoutParams layoutParams = m10105V(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: o1 */
        public void m10145o1(int i11) {
            if (m10105V(i11) != null) {
                this.f7811a.m10467q(i11);
            }
        }

        /* renamed from: p */
        public void m10146p(View view, int i11) {
            m10077s(view, i11, true);
        }

        /* renamed from: p0 */
        public boolean m10147p0() {
            return this.f7819i;
        }

        /* renamed from: p1 */
        public boolean m10148p1(RecyclerView recyclerView, View view, Rect rect, boolean z11) {
            return mo10150q1(recyclerView, view, rect, z11, false);
        }

        /* renamed from: q */
        public void m10149q(View view) {
            m10151r(view, -1);
        }

        /* renamed from: q0 */
        public abstract boolean mo9753q0();

        /* renamed from: q1 */
        public boolean mo10150q1(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            int[] m10074X = m10074X(view, rect);
            int i11 = m10074X[0];
            int i12 = m10074X[1];
            if ((z12 && !m10076r0(recyclerView, i11, i12)) || (i11 == 0 && i12 == 0)) {
                return false;
            }
            if (z11) {
                recyclerView.scrollBy(i11, i12);
            } else {
                recyclerView.m9845O1(i11, i12);
            }
            return true;
        }

        /* renamed from: r */
        public void m10151r(View view, int i11) {
            m10077s(view, i11, false);
        }

        /* renamed from: r1 */
        public void m10152r1() {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: s0 */
        public final boolean m10153s0() {
            return this.f7822l;
        }

        /* renamed from: s1 */
        public void m10154s1() {
            this.f7818h = true;
        }

        /* renamed from: t */
        public void mo9755t(String str) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView != null) {
                recyclerView.m9831I(str);
            }
        }

        /* renamed from: t0 */
        public boolean m10155t0(C1894u c1894u, C1899z c1899z) {
            return false;
        }

        /* renamed from: u */
        public void m10156u(View view, int i11) {
            m10157v(view, i11, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: u1 */
        public abstract int mo9676u1(int i11, C1894u c1894u, C1899z c1899z);

        /* renamed from: v */
        public void m10157v(View view, int i11, LayoutParams layoutParams) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0.m9941Q()) {
                this.f7812b.f7750u.m10424b(m9776D0);
            } else {
                this.f7812b.f7750u.m10437p(m9776D0);
            }
            this.f7811a.m10455c(view, i11, layoutParams, m9776D0.m9941Q());
        }

        /* renamed from: v0 */
        public boolean m10158v0() {
            AbstractC1898y abstractC1898y = this.f7817g;
            if (abstractC1898y != null && abstractC1898y.m10236h()) {
                return true;
            }
            return false;
        }

        /* renamed from: v1 */
        public abstract void mo9756v1(int i11);

        /* renamed from: w */
        public void m10159w(View view, Rect rect) {
            RecyclerView recyclerView = this.f7812b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.m9832I0(view));
            }
        }

        /* renamed from: w0 */
        public boolean m10160w0(View view, boolean z11, boolean z12) {
            boolean z13;
            if (this.f7815e.m10411b(view, 24579) && this.f7816f.m10411b(view, 24579)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z11) {
                return z13;
            }
            return !z13;
        }

        /* renamed from: w1 */
        public abstract int mo9677w1(int i11, C1894u c1894u, C1899z c1899z);

        /* renamed from: x */
        public abstract boolean mo9757x();

        /* renamed from: x0 */
        public void mo10161x0(View view, int i11, int i12, int i13, int i14) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f7763b;
            view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        /* renamed from: x1 */
        void m10162x1(RecyclerView recyclerView) {
            m10164y1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: y */
        public abstract boolean mo9758y();

        /* renamed from: y0 */
        public void m10163y0(View view, int i11, int i12) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect m9832I0 = this.f7812b.m9832I0(view);
            int i13 = i11 + m9832I0.left + m9832I0.right;
            int i14 = i12 + m9832I0.top + m9832I0.bottom;
            int m10073W = m10073W(getWidth(), m10141n0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i13, ((ViewGroup.MarginLayoutParams) layoutParams).width, mo9757x());
            int m10073W2 = m10073W(getHeight(), m10114c0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) layoutParams).height, mo9758y());
            if (m10086D1(view, m10073W, m10073W2, layoutParams)) {
                view.measure(m10073W, m10073W2);
            }
        }

        /* renamed from: y1 */
        void m10164y1(int i11, int i12) {
            this.f7827q = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.f7825o = mode;
            if (mode == 0 && !RecyclerView.f7683O0) {
                this.f7827q = 0;
            }
            this.f7828r = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f7826p = mode2;
            if (mode2 == 0 && !RecyclerView.f7683O0) {
                this.f7828r = 0;
            }
        }

        /* renamed from: z */
        public boolean mo9678z(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: z0 */
        public void m10165z0(int i11, int i12) {
            View m10105V = m10105V(i11);
            if (m10105V != null) {
                m10094K(i11);
                m10156u(m10105V, i12);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.f7812b.toString());
            }
        }

        /* renamed from: z1 */
        public void m10166z1(int i11, int i12) {
            this.f7812b.setMeasuredDimension(i11, i12);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    /* loaded from: classes2.dex */
    public interface InterfaceC1889p {
        /* renamed from: b */
        void mo10173b(View view);

        /* renamed from: d */
        void mo10174d(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1890q {
        /* renamed from: a */
        public abstract boolean mo10175a(int i11, int i12);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    /* loaded from: classes2.dex */
    public interface InterfaceC1891r {
        /* renamed from: a */
        void mo951a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: c */
        boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: e */
        void mo954e(boolean z11);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1892s {
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
        }

        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    /* loaded from: classes.dex */
    public static class C1893t {

        /* renamed from: a */
        SparseArray f7835a = new SparseArray();

        /* renamed from: b */
        private int f7836b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$t$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList f7837a = new ArrayList();

            /* renamed from: b */
            int f7838b = 5;

            /* renamed from: c */
            long f7839c = 0;

            /* renamed from: d */
            long f7840d = 0;

            a() {
            }
        }

        /* renamed from: g */
        private a m10177g(int i11) {
            a aVar = (a) this.f7835a.get(i11);
            if (aVar == null) {
                a aVar2 = new a();
                this.f7835a.put(i11, aVar2);
                return aVar2;
            }
            return aVar;
        }

        /* renamed from: a */
        void m10178a() {
            this.f7836b++;
        }

        /* renamed from: b */
        public void m10179b() {
            for (int i11 = 0; i11 < this.f7835a.size(); i11++) {
                ((a) this.f7835a.valueAt(i11)).f7837a.clear();
            }
        }

        /* renamed from: c */
        void m10180c() {
            this.f7836b--;
        }

        /* renamed from: d */
        void m10181d(int i11, long j11) {
            a m10177g = m10177g(i11);
            m10177g.f7840d = m10186j(m10177g.f7840d, j11);
        }

        /* renamed from: e */
        void m10182e(int i11, long j11) {
            a m10177g = m10177g(i11);
            m10177g.f7839c = m10186j(m10177g.f7839c, j11);
        }

        /* renamed from: f */
        public AbstractC1876c0 m10183f(int i11) {
            a aVar = (a) this.f7835a.get(i11);
            if (aVar != null && !aVar.f7837a.isEmpty()) {
                ArrayList arrayList = aVar.f7837a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((AbstractC1876c0) arrayList.get(size)).m9937M()) {
                        return (AbstractC1876c0) arrayList.remove(size);
                    }
                }
                return null;
            }
            return null;
        }

        /* renamed from: h */
        void m10184h(AbstractC1880g abstractC1880g, AbstractC1880g abstractC1880g2, boolean z11) {
            if (abstractC1880g != null) {
                m10180c();
            }
            if (!z11 && this.f7836b == 0) {
                m10179b();
            }
            if (abstractC1880g2 != null) {
                m10178a();
            }
        }

        /* renamed from: i */
        public void m10185i(AbstractC1876c0 abstractC1876c0) {
            int m9931C = abstractC1876c0.m9931C();
            ArrayList arrayList = m10177g(m9931C).f7837a;
            if (((a) this.f7835a.get(m9931C)).f7838b <= arrayList.size()) {
                return;
            }
            abstractC1876c0.m9949Y();
            arrayList.add(abstractC1876c0);
        }

        /* renamed from: j */
        long m10186j(long j11, long j12) {
            if (j11 == 0) {
                return j12;
            }
            return ((j11 / 4) * 3) + (j12 / 4);
        }

        /* renamed from: k */
        boolean m10187k(int i11, long j11, long j12) {
            long j13 = m10177g(i11).f7840d;
            if (j13 != 0 && j11 + j13 >= j12) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        boolean m10188l(int i11, long j11, long j12) {
            long j13 = m10177g(i11).f7839c;
            if (j13 != 0 && j11 + j13 >= j12) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    /* loaded from: classes.dex */
    public final class C1894u {

        /* renamed from: a */
        final ArrayList f7841a;

        /* renamed from: b */
        ArrayList f7842b;

        /* renamed from: c */
        final ArrayList f7843c;

        /* renamed from: d */
        private final List f7844d;

        /* renamed from: e */
        private int f7845e;

        /* renamed from: f */
        int f7846f;

        /* renamed from: g */
        C1893t f7847g;

        public C1894u() {
            ArrayList arrayList = new ArrayList();
            this.f7841a = arrayList;
            this.f7842b = null;
            this.f7843c = new ArrayList();
            this.f7844d = Collections.unmodifiableList(arrayList);
            this.f7845e = 2;
            this.f7846f = 2;
        }

        /* renamed from: H */
        private boolean m10189H(AbstractC1876c0 abstractC1876c0, int i11, int i12, long j11) {
            abstractC1876c0.f7783G = RecyclerView.this;
            int m9931C = abstractC1876c0.m9931C();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j11 != Long.MAX_VALUE && !this.f7847g.m10187k(m9931C, nanoTime, j11)) {
                return false;
            }
            RecyclerView.this.f7690A.m10001i(abstractC1876c0, i11);
            this.f7847g.m10181d(abstractC1876c0.m9931C(), RecyclerView.this.getNanoTime() - nanoTime);
            m10190b(abstractC1876c0);
            if (RecyclerView.this.f7753v0.m10256e()) {
                abstractC1876c0.f7790v = i12;
                return true;
            }
            return true;
        }

        /* renamed from: b */
        private void m10190b(AbstractC1876c0 abstractC1876c0) {
            if (RecyclerView.this.m9856T0()) {
                View view = abstractC1876c0.f7784p;
                if (AbstractC1579n0.m7808E(view) == 0) {
                    AbstractC1579n0.m7823L0(view, 1);
                }
                C1931x c1931x = RecyclerView.this.f7695C0;
                if (c1931x == null) {
                    return;
                }
                C1490a m10671n = c1931x.m10671n();
                if (m10671n instanceof C1931x.a) {
                    ((C1931x.a) m10671n).m10674o(view);
                }
                AbstractC1579n0.m7801A0(view, m10671n);
            }
        }

        /* renamed from: q */
        private void m10191q(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m10191q((ViewGroup) childAt, true);
                }
            }
            if (!z11) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m10192r(AbstractC1876c0 abstractC1876c0) {
            View view = abstractC1876c0.f7784p;
            if (view instanceof ViewGroup) {
                m10191q((ViewGroup) view, false);
            }
        }

        /* renamed from: A */
        void m10193A(int i11) {
            m10205a((AbstractC1876c0) this.f7843c.get(i11), true);
            this.f7843c.remove(i11);
        }

        /* renamed from: B */
        public void m10194B(View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (m9776D0.m9943S()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (m9776D0.m9942R()) {
                m9776D0.m9956g0();
            } else if (m9776D0.m9957h0()) {
                m9776D0.m9962t();
            }
            m10195C(m9776D0);
            if (RecyclerView.this.f7728d0 != null && !m9776D0.m9940P()) {
                RecyclerView.this.f7728d0.mo10044j(m9776D0);
            }
        }

        /* renamed from: C */
        void m10195C(AbstractC1876c0 abstractC1876c0) {
            boolean z11;
            boolean z12;
            boolean z13 = false;
            boolean z14 = true;
            if (!abstractC1876c0.m9942R() && abstractC1876c0.f7784p.getParent() == null) {
                if (!abstractC1876c0.m9943S()) {
                    if (!abstractC1876c0.m9955f0()) {
                        boolean m9964y = abstractC1876c0.m9964y();
                        AbstractC1880g abstractC1880g = RecyclerView.this.f7690A;
                        if (abstractC1880g != null && m9964y && abstractC1880g.m9994E(abstractC1876c0)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11 || abstractC1876c0.m9940P()) {
                            if (this.f7846f > 0 && !abstractC1876c0.m9935J(526)) {
                                int size = this.f7843c.size();
                                if (size >= this.f7846f && size > 0) {
                                    m10193A(0);
                                    size--;
                                }
                                if (RecyclerView.f7685Q0 && size > 0 && !RecyclerView.this.f7751u0.m10545d(abstractC1876c0.f7786r)) {
                                    int i11 = size - 1;
                                    while (i11 >= 0) {
                                        if (!RecyclerView.this.f7751u0.m10545d(((AbstractC1876c0) this.f7843c.get(i11)).f7786r)) {
                                            break;
                                        } else {
                                            i11--;
                                        }
                                    }
                                    size = i11 + 1;
                                }
                                this.f7843c.add(size, abstractC1876c0);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                m10205a(abstractC1876c0, true);
                                z13 = z12;
                                RecyclerView.this.f7750u.m10438q(abstractC1876c0);
                                if (z13 && !z14 && m9964y) {
                                    abstractC1876c0.f7783G = null;
                                    return;
                                }
                                return;
                            }
                            z13 = z12;
                        }
                        z14 = false;
                        RecyclerView.this.f7750u.m10438q(abstractC1876c0);
                        if (z13) {
                            return;
                        } else {
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.m9890k0());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC1876c0 + RecyclerView.this.m9890k0());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(abstractC1876c0.m9942R());
            sb2.append(" isAttached:");
            if (abstractC1876c0.f7784p.getParent() != null) {
                z13 = true;
            }
            sb2.append(z13);
            sb2.append(RecyclerView.this.m9890k0());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* renamed from: D */
        void m10196D(View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            if (!m9776D0.m9935J(12) && m9776D0.m9944T() && !RecyclerView.this.m9834J(m9776D0)) {
                if (this.f7842b == null) {
                    this.f7842b = new ArrayList();
                }
                m9776D0.m9953d0(this, true);
                this.f7842b.add(m9776D0);
                return;
            }
            if (m9776D0.m9939O() && !m9776D0.m9941Q() && !RecyclerView.this.f7690A.m10007o()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.m9890k0());
            }
            m9776D0.m9953d0(this, false);
            this.f7841a.add(m9776D0);
        }

        /* renamed from: E */
        void m10197E(C1893t c1893t) {
            C1893t c1893t2 = this.f7847g;
            if (c1893t2 != null) {
                c1893t2.m10180c();
            }
            this.f7847g = c1893t;
            if (c1893t != null && RecyclerView.this.getAdapter() != null) {
                this.f7847g.m10178a();
            }
        }

        /* renamed from: F */
        void m10198F(AbstractC1872a0 abstractC1872a0) {
        }

        /* renamed from: G */
        public void m10199G(int i11) {
            this.f7845e = i11;
            m10202K();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x01d4 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
        /* renamed from: I */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC1876c0 m10200I(int i11, boolean z11, long j11) {
            AbstractC1876c0 abstractC1876c0;
            boolean z12;
            AbstractC1876c0 abstractC1876c02;
            boolean z13;
            boolean m10189H;
            ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            RecyclerView m9808r0;
            if (i11 >= 0 && i11 < RecyclerView.this.f7753v0.m10253b()) {
                boolean z14 = true;
                if (RecyclerView.this.f7753v0.m10256e()) {
                    abstractC1876c0 = m10211h(i11);
                    if (abstractC1876c0 != null) {
                        z12 = true;
                        if (abstractC1876c0 == null && (abstractC1876c0 = m10216m(i11, z11)) != null) {
                            if (m10203L(abstractC1876c0)) {
                                if (!z11) {
                                    abstractC1876c0.m9959q(4);
                                    if (abstractC1876c0.m9942R()) {
                                        RecyclerView.this.removeDetachedView(abstractC1876c0.f7784p, false);
                                        abstractC1876c0.m9956g0();
                                    } else if (abstractC1876c0.m9957h0()) {
                                        abstractC1876c0.m9962t();
                                    }
                                    m10195C(abstractC1876c0);
                                }
                                abstractC1876c0 = null;
                            } else {
                                z12 = true;
                            }
                        }
                        if (abstractC1876c0 == null) {
                            int m10381m = RecyclerView.this.f7746s.m10381m(i11);
                            if (m10381m >= 0 && m10381m < RecyclerView.this.f7690A.mo10003k()) {
                                int mo10005m = RecyclerView.this.f7690A.mo10005m(m10381m);
                                if (RecyclerView.this.f7690A.m10007o() && (abstractC1876c0 = m10215l(RecyclerView.this.f7690A.mo10004l(m10381m), mo10005m, z11)) != null) {
                                    abstractC1876c0.f7786r = m10381m;
                                    z12 = true;
                                }
                                if (abstractC1876c0 == null) {
                                    AbstractC1876c0 m10183f = m10212i().m10183f(mo10005m);
                                    if (m10183f != null) {
                                        m10183f.m9949Y();
                                        if (RecyclerView.f7682N0) {
                                            m10192r(m10183f);
                                        }
                                    }
                                    abstractC1876c0 = m10183f;
                                }
                                if (abstractC1876c0 == null) {
                                    long nanoTime = RecyclerView.this.getNanoTime();
                                    if (j11 != Long.MAX_VALUE && !this.f7847g.m10188l(mo10005m, nanoTime, j11)) {
                                        return null;
                                    }
                                    RecyclerView recyclerView = RecyclerView.this;
                                    AbstractC1876c0 m10002j = recyclerView.f7690A.m10002j(recyclerView, mo10005m);
                                    if (RecyclerView.f7685Q0 && (m9808r0 = RecyclerView.m9808r0(m10002j.f7784p)) != null) {
                                        m10002j.f7785q = new WeakReference(m9808r0);
                                    }
                                    this.f7847g.m10182e(mo10005m, RecyclerView.this.getNanoTime() - nanoTime);
                                    abstractC1876c02 = m10002j;
                                    z13 = z12;
                                    if (z13 && !RecyclerView.this.f7753v0.m10256e() && abstractC1876c02.m9935J(8192)) {
                                        abstractC1876c02.m9951b0(0, 8192);
                                        if (RecyclerView.this.f7753v0.f7875k) {
                                            int m10034e = AbstractC1885l.m10034e(abstractC1876c02) | 4096;
                                            RecyclerView recyclerView2 = RecyclerView.this;
                                            RecyclerView.this.m9899s1(abstractC1876c02, recyclerView2.f7728d0.m10055u(recyclerView2.f7753v0, abstractC1876c02, m10034e, abstractC1876c02.m9934H()));
                                        }
                                    }
                                    if (!RecyclerView.this.f7753v0.m10256e() && abstractC1876c02.m9938N()) {
                                        abstractC1876c02.f7790v = i11;
                                    } else if (abstractC1876c02.m9938N() || abstractC1876c02.m9945U() || abstractC1876c02.m9939O()) {
                                        m10189H = m10189H(abstractC1876c02, RecyclerView.this.f7746s.m10381m(i11), i11, j11);
                                        layoutParams = abstractC1876c02.f7784p.getLayoutParams();
                                        if (layoutParams != null) {
                                            layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                                            abstractC1876c02.f7784p.setLayoutParams(layoutParams2);
                                        } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                            layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                                            abstractC1876c02.f7784p.setLayoutParams(layoutParams2);
                                        } else {
                                            layoutParams2 = (LayoutParams) layoutParams;
                                        }
                                        layoutParams2.f7762a = abstractC1876c02;
                                        if (z13 || !m10189H) {
                                            z14 = false;
                                        }
                                        layoutParams2.f7765d = z14;
                                        return abstractC1876c02;
                                    }
                                    m10189H = false;
                                    layoutParams = abstractC1876c02.f7784p.getLayoutParams();
                                    if (layoutParams != null) {
                                    }
                                    layoutParams2.f7762a = abstractC1876c02;
                                    if (z13) {
                                    }
                                    z14 = false;
                                    layoutParams2.f7765d = z14;
                                    return abstractC1876c02;
                                }
                            } else {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i11 + "(offset:" + m10381m + ").state:" + RecyclerView.this.f7753v0.m10253b() + RecyclerView.this.m9890k0());
                            }
                        }
                        abstractC1876c02 = abstractC1876c0;
                        z13 = z12;
                        if (z13) {
                            abstractC1876c02.m9951b0(0, 8192);
                            if (RecyclerView.this.f7753v0.f7875k) {
                            }
                        }
                        if (!RecyclerView.this.f7753v0.m10256e()) {
                        }
                        if (abstractC1876c02.m9938N()) {
                        }
                        m10189H = m10189H(abstractC1876c02, RecyclerView.this.f7746s.m10381m(i11), i11, j11);
                        layoutParams = abstractC1876c02.f7784p.getLayoutParams();
                        if (layoutParams != null) {
                        }
                        layoutParams2.f7762a = abstractC1876c02;
                        if (z13) {
                        }
                        z14 = false;
                        layoutParams2.f7765d = z14;
                        return abstractC1876c02;
                    }
                } else {
                    abstractC1876c0 = null;
                }
                z12 = false;
                if (abstractC1876c0 == null) {
                    if (m10203L(abstractC1876c0)) {
                    }
                }
                if (abstractC1876c0 == null) {
                }
                abstractC1876c02 = abstractC1876c0;
                z13 = z12;
                if (z13) {
                }
                if (!RecyclerView.this.f7753v0.m10256e()) {
                }
                if (abstractC1876c02.m9938N()) {
                }
                m10189H = m10189H(abstractC1876c02, RecyclerView.this.f7746s.m10381m(i11), i11, j11);
                layoutParams = abstractC1876c02.f7784p.getLayoutParams();
                if (layoutParams != null) {
                }
                layoutParams2.f7762a = abstractC1876c02;
                if (z13) {
                }
                z14 = false;
                layoutParams2.f7765d = z14;
                return abstractC1876c02;
            }
            throw new IndexOutOfBoundsException("Invalid item position " + i11 + "(" + i11 + "). Item count:" + RecyclerView.this.f7753v0.m10253b() + RecyclerView.this.m9890k0());
        }

        /* renamed from: J */
        void m10201J(AbstractC1876c0 abstractC1876c0) {
            if (abstractC1876c0.f7780D) {
                this.f7842b.remove(abstractC1876c0);
            } else {
                this.f7841a.remove(abstractC1876c0);
            }
            abstractC1876c0.f7779C = null;
            abstractC1876c0.f7780D = false;
            abstractC1876c0.m9962t();
        }

        /* renamed from: K */
        public void m10202K() {
            int i11;
            AbstractC1888o abstractC1888o = RecyclerView.this.f7692B;
            if (abstractC1888o != null) {
                i11 = abstractC1888o.f7823m;
            } else {
                i11 = 0;
            }
            this.f7846f = this.f7845e + i11;
            for (int size = this.f7843c.size() - 1; size >= 0 && this.f7843c.size() > this.f7846f; size--) {
                m10193A(size);
            }
        }

        /* renamed from: L */
        boolean m10203L(AbstractC1876c0 abstractC1876c0) {
            if (abstractC1876c0.m9941Q()) {
                return RecyclerView.this.f7753v0.m10256e();
            }
            int i11 = abstractC1876c0.f7786r;
            if (i11 >= 0 && i11 < RecyclerView.this.f7690A.mo10003k()) {
                if (!RecyclerView.this.f7753v0.m10256e() && RecyclerView.this.f7690A.mo10005m(abstractC1876c0.f7786r) != abstractC1876c0.m9931C()) {
                    return false;
                }
                if (RecyclerView.this.f7690A.m10007o() && abstractC1876c0.m9930B() != RecyclerView.this.f7690A.mo10004l(abstractC1876c0.f7786r)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC1876c0 + RecyclerView.this.m9890k0());
        }

        /* renamed from: M */
        void m10204M(int i11, int i12) {
            int i13;
            int i14 = i12 + i11;
            for (int size = this.f7843c.size() - 1; size >= 0; size--) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7843c.get(size);
                if (abstractC1876c0 != null && (i13 = abstractC1876c0.f7786r) >= i11 && i13 < i14) {
                    abstractC1876c0.m9959q(2);
                    m10193A(size);
                }
            }
        }

        /* renamed from: a */
        public void m10205a(AbstractC1876c0 abstractC1876c0, boolean z11) {
            C1490a c1490a;
            RecyclerView.m9787L(abstractC1876c0);
            View view = abstractC1876c0.f7784p;
            C1931x c1931x = RecyclerView.this.f7695C0;
            if (c1931x != null) {
                C1490a m10671n = c1931x.m10671n();
                if (m10671n instanceof C1931x.a) {
                    c1490a = ((C1931x.a) m10671n).m10673n(view);
                } else {
                    c1490a = null;
                }
                AbstractC1579n0.m7801A0(view, c1490a);
            }
            if (z11) {
                m10210g(abstractC1876c0);
            }
            abstractC1876c0.f7783G = null;
            m10212i().m10185i(abstractC1876c0);
        }

        /* renamed from: c */
        public void m10206c() {
            this.f7841a.clear();
            m10227z();
        }

        /* renamed from: d */
        void m10207d() {
            int size = this.f7843c.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC1876c0) this.f7843c.get(i11)).m9960r();
            }
            int size2 = this.f7841a.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((AbstractC1876c0) this.f7841a.get(i12)).m9960r();
            }
            ArrayList arrayList = this.f7842b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ((AbstractC1876c0) this.f7842b.get(i13)).m9960r();
                }
            }
        }

        /* renamed from: e */
        void m10208e() {
            this.f7841a.clear();
            ArrayList arrayList = this.f7842b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int m10209f(int i11) {
            if (i11 >= 0 && i11 < RecyclerView.this.f7753v0.m10253b()) {
                if (!RecyclerView.this.f7753v0.m10256e()) {
                    return i11;
                }
                return RecyclerView.this.f7746s.m10381m(i11);
            }
            throw new IndexOutOfBoundsException("invalid position " + i11 + ". State item count is " + RecyclerView.this.f7753v0.m10253b() + RecyclerView.this.m9890k0());
        }

        /* renamed from: g */
        void m10210g(AbstractC1876c0 abstractC1876c0) {
            RecyclerView.this.getClass();
            AbstractC1880g abstractC1880g = RecyclerView.this.f7690A;
            if (abstractC1880g != null) {
                abstractC1880g.mo9997H(abstractC1876c0);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f7753v0 != null) {
                recyclerView.f7750u.m10438q(abstractC1876c0);
            }
        }

        /* renamed from: h */
        AbstractC1876c0 m10211h(int i11) {
            int size;
            int m10381m;
            ArrayList arrayList = this.f7842b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7842b.get(i12);
                    if (!abstractC1876c0.m9957h0() && abstractC1876c0.m9932F() == i11) {
                        abstractC1876c0.m9959q(32);
                        return abstractC1876c0;
                    }
                }
                if (RecyclerView.this.f7690A.m10007o() && (m10381m = RecyclerView.this.f7746s.m10381m(i11)) > 0 && m10381m < RecyclerView.this.f7690A.mo10003k()) {
                    long mo10004l = RecyclerView.this.f7690A.mo10004l(m10381m);
                    for (int i13 = 0; i13 < size; i13++) {
                        AbstractC1876c0 abstractC1876c02 = (AbstractC1876c0) this.f7842b.get(i13);
                        if (!abstractC1876c02.m9957h0() && abstractC1876c02.m9930B() == mo10004l) {
                            abstractC1876c02.m9959q(32);
                            return abstractC1876c02;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: i */
        C1893t m10212i() {
            if (this.f7847g == null) {
                this.f7847g = new C1893t();
            }
            return this.f7847g;
        }

        /* renamed from: j */
        int m10213j() {
            return this.f7841a.size();
        }

        /* renamed from: k */
        public List m10214k() {
            return this.f7844d;
        }

        /* renamed from: l */
        AbstractC1876c0 m10215l(long j11, int i11, boolean z11) {
            for (int size = this.f7841a.size() - 1; size >= 0; size--) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7841a.get(size);
                if (abstractC1876c0.m9930B() == j11 && !abstractC1876c0.m9957h0()) {
                    if (i11 == abstractC1876c0.m9931C()) {
                        abstractC1876c0.m9959q(32);
                        if (abstractC1876c0.m9941Q() && !RecyclerView.this.f7753v0.m10256e()) {
                            abstractC1876c0.m9951b0(2, 14);
                        }
                        return abstractC1876c0;
                    }
                    if (!z11) {
                        this.f7841a.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC1876c0.f7784p, false);
                        m10226y(abstractC1876c0.f7784p);
                    }
                }
            }
            int size2 = this.f7843c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC1876c0 abstractC1876c02 = (AbstractC1876c0) this.f7843c.get(size2);
                if (abstractC1876c02.m9930B() == j11 && !abstractC1876c02.m9937M()) {
                    if (i11 == abstractC1876c02.m9931C()) {
                        if (!z11) {
                            this.f7843c.remove(size2);
                        }
                        return abstractC1876c02;
                    }
                    if (!z11) {
                        m10193A(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: m */
        AbstractC1876c0 m10216m(int i11, boolean z11) {
            View m10457e;
            int size = this.f7841a.size();
            for (int i12 = 0; i12 < size; i12++) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7841a.get(i12);
                if (!abstractC1876c0.m9957h0() && abstractC1876c0.m9932F() == i11 && !abstractC1876c0.m9939O() && (RecyclerView.this.f7753v0.f7872h || !abstractC1876c0.m9941Q())) {
                    abstractC1876c0.m9959q(32);
                    return abstractC1876c0;
                }
            }
            if (!z11 && (m10457e = RecyclerView.this.f7748t.m10457e(i11)) != null) {
                AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(m10457e);
                RecyclerView.this.f7748t.m10469s(m10457e);
                int m10463m = RecyclerView.this.f7748t.m10463m(m10457e);
                if (m10463m != -1) {
                    RecyclerView.this.f7748t.m10456d(m10463m);
                    m10196D(m10457e);
                    m9776D0.m9959q(8224);
                    return m9776D0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + m9776D0 + RecyclerView.this.m9890k0());
            }
            int size2 = this.f7843c.size();
            for (int i13 = 0; i13 < size2; i13++) {
                AbstractC1876c0 abstractC1876c02 = (AbstractC1876c0) this.f7843c.get(i13);
                if (!abstractC1876c02.m9939O() && abstractC1876c02.m9932F() == i11 && !abstractC1876c02.m9937M()) {
                    if (!z11) {
                        this.f7843c.remove(i13);
                    }
                    return abstractC1876c02;
                }
            }
            return null;
        }

        /* renamed from: n */
        View m10217n(int i11) {
            return ((AbstractC1876c0) this.f7841a.get(i11)).f7784p;
        }

        /* renamed from: o */
        public View m10218o(int i11) {
            return m10219p(i11, false);
        }

        /* renamed from: p */
        View m10219p(int i11, boolean z11) {
            return m10200I(i11, z11, Long.MAX_VALUE).f7784p;
        }

        /* renamed from: s */
        void m10220s() {
            int size = this.f7843c.size();
            for (int i11 = 0; i11 < size; i11++) {
                LayoutParams layoutParams = (LayoutParams) ((AbstractC1876c0) this.f7843c.get(i11)).f7784p.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f7764c = true;
                }
            }
        }

        /* renamed from: t */
        void m10221t() {
            int size = this.f7843c.size();
            for (int i11 = 0; i11 < size; i11++) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7843c.get(i11);
                if (abstractC1876c0 != null) {
                    abstractC1876c0.m9959q(6);
                    abstractC1876c0.m9958o(null);
                }
            }
            AbstractC1880g abstractC1880g = RecyclerView.this.f7690A;
            if (abstractC1880g == null || !abstractC1880g.m10007o()) {
                m10227z();
            }
        }

        /* renamed from: u */
        void m10222u(int i11, int i12) {
            int size = this.f7843c.size();
            for (int i13 = 0; i13 < size; i13++) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7843c.get(i13);
                if (abstractC1876c0 != null && abstractC1876c0.f7786r >= i11) {
                    abstractC1876c0.m9946V(i12, true);
                }
            }
        }

        /* renamed from: v */
        void m10223v(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (i11 < i12) {
                i13 = -1;
                i15 = i11;
                i14 = i12;
            } else {
                i13 = 1;
                i14 = i11;
                i15 = i12;
            }
            int size = this.f7843c.size();
            for (int i17 = 0; i17 < size; i17++) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7843c.get(i17);
                if (abstractC1876c0 != null && (i16 = abstractC1876c0.f7786r) >= i15 && i16 <= i14) {
                    if (i16 == i11) {
                        abstractC1876c0.m9946V(i12 - i11, false);
                    } else {
                        abstractC1876c0.m9946V(i13, false);
                    }
                }
            }
        }

        /* renamed from: w */
        void m10224w(int i11, int i12, boolean z11) {
            int i13 = i11 + i12;
            for (int size = this.f7843c.size() - 1; size >= 0; size--) {
                AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7843c.get(size);
                if (abstractC1876c0 != null) {
                    int i14 = abstractC1876c0.f7786r;
                    if (i14 >= i13) {
                        abstractC1876c0.m9946V(-i12, z11);
                    } else if (i14 >= i11) {
                        abstractC1876c0.m9959q(8);
                        m10193A(size);
                    }
                }
            }
        }

        /* renamed from: x */
        void m10225x(AbstractC1880g abstractC1880g, AbstractC1880g abstractC1880g2, boolean z11) {
            m10206c();
            m10212i().m10184h(abstractC1880g, abstractC1880g2, z11);
        }

        /* renamed from: y */
        void m10226y(View view) {
            AbstractC1876c0 m9776D0 = RecyclerView.m9776D0(view);
            m9776D0.f7779C = null;
            m9776D0.f7780D = false;
            m9776D0.m9962t();
            m10195C(m9776D0);
        }

        /* renamed from: z */
        void m10227z() {
            for (int size = this.f7843c.size() - 1; size >= 0; size--) {
                m10193A(size);
            }
            this.f7843c.clear();
            if (RecyclerView.f7685Q0) {
                RecyclerView.this.f7751u0.m10543b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    /* loaded from: classes2.dex */
    public interface InterfaceC1895v {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    /* loaded from: classes.dex */
    public class C1896w extends AbstractC1882i {
        C1896w() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: a */
        public void mo10026a() {
            RecyclerView.this.m9831I(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f7753v0.f7871g = true;
            recyclerView.m9898q1(true);
            if (!RecyclerView.this.f7746s.m10384p()) {
                RecyclerView.this.requestLayout();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: c */
        public void mo10028c(int i11, int i12, Object obj) {
            RecyclerView.this.m9831I(null);
            if (RecyclerView.this.f7746s.m10386r(i11, i12, obj)) {
                m10228g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: d */
        public void mo10029d(int i11, int i12) {
            RecyclerView.this.m9831I(null);
            if (RecyclerView.this.f7746s.m10387s(i11, i12)) {
                m10228g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: e */
        public void mo10030e(int i11, int i12, int i13) {
            RecyclerView.this.m9831I(null);
            if (RecyclerView.this.f7746s.m10388t(i11, i12, i13)) {
                m10228g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1882i
        /* renamed from: f */
        public void mo10031f(int i11, int i12) {
            RecyclerView.this.m9831I(null);
            if (RecyclerView.this.f7746s.m10389u(i11, i12)) {
                m10228g();
            }
        }

        /* renamed from: g */
        void m10228g() {
            if (RecyclerView.f7684P0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f7702G && recyclerView.f7700F) {
                    AbstractC1579n0.m7900s0(recyclerView, recyclerView.f7754w);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f7716O = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    /* loaded from: classes2.dex */
    public static class C1897x implements InterfaceC1891r {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: a */
        public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: c */
        public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: e */
        public void mo954e(boolean z11) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1898y {

        /* renamed from: b */
        private RecyclerView f7851b;

        /* renamed from: c */
        private AbstractC1888o f7852c;

        /* renamed from: d */
        private boolean f7853d;

        /* renamed from: e */
        private boolean f7854e;

        /* renamed from: f */
        private View f7855f;

        /* renamed from: h */
        private boolean f7857h;

        /* renamed from: a */
        private int f7850a = -1;

        /* renamed from: g */
        private final a f7856g = new a(0, 0);

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            private int f7858a;

            /* renamed from: b */
            private int f7859b;

            /* renamed from: c */
            private int f7860c;

            /* renamed from: d */
            private int f7861d;

            /* renamed from: e */
            private Interpolator f7862e;

            /* renamed from: f */
            private boolean f7863f;

            /* renamed from: g */
            private int f7864g;

            public a(int i11, int i12) {
                this(i11, i12, Integer.MIN_VALUE, null);
            }

            /* renamed from: e */
            private void m10247e() {
                if (this.f7862e != null && this.f7860c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f7860c >= 1) {
                } else {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            boolean m10248a() {
                return this.f7861d >= 0;
            }

            /* renamed from: b */
            public void m10249b(int i11) {
                this.f7861d = i11;
            }

            /* renamed from: c */
            void m10250c(RecyclerView recyclerView) {
                int i11 = this.f7861d;
                if (i11 >= 0) {
                    this.f7861d = -1;
                    recyclerView.m9865X0(i11);
                    this.f7863f = false;
                } else {
                    if (this.f7863f) {
                        m10247e();
                        recyclerView.f7747s0.m9926f(this.f7858a, this.f7859b, this.f7860c, this.f7862e);
                        this.f7864g++;
                        this.f7863f = false;
                        return;
                    }
                    this.f7864g = 0;
                }
            }

            /* renamed from: d */
            public void m10251d(int i11, int i12, int i13, Interpolator interpolator) {
                this.f7858a = i11;
                this.f7859b = i12;
                this.f7860c = i13;
                this.f7862e = interpolator;
                this.f7863f = true;
            }

            public a(int i11, int i12, int i13, Interpolator interpolator) {
                this.f7861d = -1;
                this.f7863f = false;
                this.f7864g = 0;
                this.f7858a = i11;
                this.f7859b = i12;
                this.f7860c = i13;
                this.f7862e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        /* loaded from: classes2.dex */
        public interface b {
            /* renamed from: d */
            PointF mo9746d(int i11);
        }

        /* renamed from: a */
        public PointF mo10229a(int i11) {
            Object m10233e = m10233e();
            if (m10233e instanceof b) {
                return ((b) m10233e).mo9746d(i11);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb2.append(b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View m10230b(int i11) {
            return this.f7851b.f7692B.mo9732P(i11);
        }

        /* renamed from: c */
        public int m10231c() {
            return this.f7851b.f7692B.m10110a();
        }

        /* renamed from: d */
        public int m10232d(View view) {
            return this.f7851b.m9820B0(view);
        }

        /* renamed from: e */
        public AbstractC1888o m10233e() {
            return this.f7852c;
        }

        /* renamed from: f */
        public int m10234f() {
            return this.f7850a;
        }

        /* renamed from: g */
        public boolean m10235g() {
            return this.f7853d;
        }

        /* renamed from: h */
        public boolean m10236h() {
            return this.f7854e;
        }

        /* renamed from: i */
        public void m10237i(PointF pointF) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* renamed from: j */
        void m10238j(int i11, int i12) {
            PointF mo10229a;
            RecyclerView recyclerView = this.f7851b;
            if (this.f7850a == -1 || recyclerView == null) {
                m10246r();
            }
            if (this.f7853d && this.f7855f == null && this.f7852c != null && (mo10229a = mo10229a(this.f7850a)) != null) {
                float f11 = mo10229a.x;
                if (f11 != 0.0f || mo10229a.y != 0.0f) {
                    recyclerView.m9836J1((int) Math.signum(f11), (int) Math.signum(mo10229a.y), null);
                }
            }
            this.f7853d = false;
            View view = this.f7855f;
            if (view != null) {
                if (m10232d(view) == this.f7850a) {
                    mo10243o(this.f7855f, recyclerView.f7753v0, this.f7856g);
                    this.f7856g.m10250c(recyclerView);
                    m10246r();
                } else {
                    this.f7855f = null;
                }
            }
            if (this.f7854e) {
                mo10240l(i11, i12, recyclerView.f7753v0, this.f7856g);
                boolean m10248a = this.f7856g.m10248a();
                this.f7856g.m10250c(recyclerView);
                if (m10248a && this.f7854e) {
                    this.f7853d = true;
                    recyclerView.f7747s0.m9925e();
                }
            }
        }

        /* renamed from: k */
        protected void m10239k(View view) {
            if (m10232d(view) == m10234f()) {
                this.f7855f = view;
            }
        }

        /* renamed from: l */
        protected abstract void mo10240l(int i11, int i12, C1899z c1899z, a aVar);

        /* renamed from: m */
        protected abstract void mo10241m();

        /* renamed from: n */
        protected abstract void mo10242n();

        /* renamed from: o */
        protected abstract void mo10243o(View view, C1899z c1899z, a aVar);

        /* renamed from: p */
        public void m10244p(int i11) {
            this.f7850a = i11;
        }

        /* renamed from: q */
        void m10245q(RecyclerView recyclerView, AbstractC1888o abstractC1888o) {
            recyclerView.f7747s0.m9927g();
            if (this.f7857h) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("An instance of ");
                sb2.append(getClass().getSimpleName());
                sb2.append(" was started more than once. Each instance of");
                sb2.append(getClass().getSimpleName());
                sb2.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.f7851b = recyclerView;
            this.f7852c = abstractC1888o;
            int i11 = this.f7850a;
            if (i11 != -1) {
                recyclerView.f7753v0.f7865a = i11;
                this.f7854e = true;
                this.f7853d = true;
                this.f7855f = m10230b(m10234f());
                mo10241m();
                this.f7851b.f7747s0.m9925e();
                this.f7857h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: r */
        public final void m10246r() {
            if (!this.f7854e) {
                return;
            }
            this.f7854e = false;
            mo10242n();
            this.f7851b.f7753v0.f7865a = -1;
            this.f7855f = null;
            this.f7850a = -1;
            this.f7853d = false;
            this.f7852c.m10117d1(this);
            this.f7852c = null;
            this.f7851b = null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    /* loaded from: classes.dex */
    public static class C1899z {

        /* renamed from: b */
        private SparseArray f7866b;

        /* renamed from: m */
        int f7877m;

        /* renamed from: n */
        long f7878n;

        /* renamed from: o */
        int f7879o;

        /* renamed from: p */
        int f7880p;

        /* renamed from: q */
        int f7881q;

        /* renamed from: a */
        int f7865a = -1;

        /* renamed from: c */
        int f7867c = 0;

        /* renamed from: d */
        int f7868d = 0;

        /* renamed from: e */
        int f7869e = 1;

        /* renamed from: f */
        int f7870f = 0;

        /* renamed from: g */
        boolean f7871g = false;

        /* renamed from: h */
        boolean f7872h = false;

        /* renamed from: i */
        boolean f7873i = false;

        /* renamed from: j */
        boolean f7874j = false;

        /* renamed from: k */
        boolean f7875k = false;

        /* renamed from: l */
        boolean f7876l = false;

        /* renamed from: a */
        void m10252a(int i11) {
            if ((this.f7869e & i11) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f7869e));
        }

        /* renamed from: b */
        public int m10253b() {
            return this.f7872h ? this.f7867c - this.f7868d : this.f7870f;
        }

        /* renamed from: c */
        public int m10254c() {
            return this.f7865a;
        }

        /* renamed from: d */
        public boolean m10255d() {
            return this.f7865a != -1;
        }

        /* renamed from: e */
        public boolean m10256e() {
            return this.f7872h;
        }

        /* renamed from: f */
        public void m10257f(AbstractC1880g abstractC1880g) {
            this.f7869e = 1;
            this.f7870f = abstractC1880g.mo10003k();
            this.f7872h = false;
            this.f7873i = false;
            this.f7874j = false;
        }

        /* renamed from: g */
        public boolean m10258g() {
            return this.f7876l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f7865a + ", mData=" + this.f7866b + ", mItemCount=" + this.f7870f + ", mIsMeasuring=" + this.f7874j + ", mPreviousLayoutItemCount=" + this.f7867c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7868d + ", mStructureChanged=" + this.f7871g + ", mInPreLayout=" + this.f7872h + ", mRunSimpleAnimations=" + this.f7875k + ", mRunPredictiveAnimations=" + this.f7876l + '}';
        }
    }

    static {
        boolean z11;
        int i11 = Build.VERSION.SDK_INT;
        f7682N0 = false;
        if (i11 >= 23) {
            z11 = true;
        } else {
            z11 = false;
        }
        f7683O0 = z11;
        f7684P0 = true;
        f7685Q0 = true;
        f7686R0 = false;
        f7687S0 = false;
        Class cls = Integer.TYPE;
        f7688T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f7689U0 = new InterpolatorC1875c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* renamed from: D0 */
    public static AbstractC1876c0 m9776D0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f7762a;
    }

    /* renamed from: D1 */
    private void m9777D1(View view, View view2) {
        View view3;
        boolean z11;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f7756x.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f7764c) {
                Rect rect = layoutParams2.f7763b;
                Rect rect2 = this.f7756x;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f7756x);
            offsetRectIntoDescendantCoords(view, this.f7756x);
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        Rect rect3 = this.f7756x;
        boolean z12 = !this.f7706I;
        if (view2 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        abstractC1888o.mo10150q1(this, view, rect3, z12, z11);
    }

    /* renamed from: E1 */
    private void m9778E1() {
        C1899z c1899z = this.f7753v0;
        c1899z.f7878n = -1L;
        c1899z.f7877m = -1;
        c1899z.f7879o = -1;
    }

    /* renamed from: F0 */
    static void m9779F0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f7763b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    /* renamed from: F1 */
    private void m9780F1() {
        VelocityTracker velocityTracker = this.f7731g0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        m9864W1(0);
        m9813u1();
    }

    /* renamed from: G */
    private void m9781G(AbstractC1876c0 abstractC1876c0, AbstractC1876c0 abstractC1876c02, AbstractC1885l.c cVar, AbstractC1885l.c cVar2, boolean z11, boolean z12) {
        abstractC1876c0.m9952c0(false);
        if (z11) {
            m9815z(abstractC1876c0);
        }
        if (abstractC1876c0 != abstractC1876c02) {
            if (z12) {
                m9815z(abstractC1876c02);
            }
            abstractC1876c0.f7791w = abstractC1876c02;
            m9815z(abstractC1876c0);
            this.f7742q.m10201J(abstractC1876c0);
            abstractC1876c02.m9952c0(false);
            abstractC1876c02.f7792x = abstractC1876c0;
        }
        if (this.f7728d0.mo10037b(abstractC1876c0, abstractC1876c02, cVar, cVar2)) {
            m9896n1();
        }
    }

    /* renamed from: G0 */
    private int m9782G0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    /* renamed from: G1 */
    private void m9783G1() {
        View view;
        long j11;
        int m9929A;
        AbstractC1876c0 abstractC1876c0 = null;
        if (this.f7745r0 && hasFocus() && this.f7690A != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            abstractC1876c0 = m9897o0(view);
        }
        if (abstractC1876c0 == null) {
            m9778E1();
            return;
        }
        C1899z c1899z = this.f7753v0;
        if (this.f7690A.m10007o()) {
            j11 = abstractC1876c0.m9930B();
        } else {
            j11 = -1;
        }
        c1899z.f7878n = j11;
        C1899z c1899z2 = this.f7753v0;
        if (this.f7719R) {
            m9929A = -1;
        } else if (abstractC1876c0.m9941Q()) {
            m9929A = abstractC1876c0.f7787s;
        } else {
            m9929A = abstractC1876c0.m9929A();
        }
        c1899z2.f7877m = m9929A;
        this.f7753v0.f7879o = m9782G0(abstractC1876c0.f7784p);
    }

    /* renamed from: H0 */
    private String m9784H0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    /* renamed from: K */
    private void m9785K() {
        m9780F1();
        setScrollState(0);
    }

    /* renamed from: K0 */
    private void m9786K0(long j11, AbstractC1876c0 abstractC1876c0, AbstractC1876c0 abstractC1876c02) {
        int m10459g = this.f7748t.m10459g();
        for (int i11 = 0; i11 < m10459g; i11++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10458f(i11));
            if (m9776D0 != abstractC1876c0 && m9910z0(m9776D0) == j11) {
                AbstractC1880g abstractC1880g = this.f7690A;
                if (abstractC1880g != null && abstractC1880g.m10007o()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + m9776D0 + " \n View Holder 2:" + abstractC1876c0 + m9890k0());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + m9776D0 + " \n View Holder 2:" + abstractC1876c0 + m9890k0());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb2.append(abstractC1876c02);
        sb2.append(" cannot be found but it is necessary for ");
        sb2.append(abstractC1876c0);
        sb2.append(m9890k0());
    }

    /* renamed from: L */
    static void m9787L(AbstractC1876c0 abstractC1876c0) {
        WeakReference weakReference = abstractC1876c0.f7785q;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC1876c0.f7784p) {
                    return;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            abstractC1876c0.f7785q = null;
        }
    }

    /* renamed from: L1 */
    private void m9788L1(AbstractC1880g abstractC1880g, boolean z11, boolean z12) {
        AbstractC1880g abstractC1880g2 = this.f7690A;
        if (abstractC1880g2 != null) {
            abstractC1880g2.m10000K(this.f7740p);
            this.f7690A.mo9993D(this);
        }
        if (!z11 || z12) {
            m9903v1();
        }
        this.f7746s.m10392y();
        AbstractC1880g abstractC1880g3 = this.f7690A;
        this.f7690A = abstractC1880g;
        if (abstractC1880g != null) {
            abstractC1880g.m9998I(this.f7740p);
            abstractC1880g.mo10018z(this);
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.m10083C0(abstractC1880g3, this.f7690A);
        }
        this.f7742q.m10225x(abstractC1880g3, this.f7690A, z11);
        this.f7753v0.f7871g = true;
    }

    /* renamed from: M0 */
    private boolean m9789M0() {
        int m10459g = this.f7748t.m10459g();
        for (int i11 = 0; i11 < m10459g; i11++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10458f(i11));
            if (m9776D0 != null && !m9776D0.m9955f0() && m9776D0.m9944T()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O0 */
    private void m9790O0() {
        if (AbstractC1579n0.m7810F(this) == 0) {
            AbstractC1579n0.m7825M0(this, 8);
        }
    }

    /* renamed from: P0 */
    private void m9791P0() {
        this.f7748t = new C1913f(new C1878e());
    }

    /* renamed from: Q */
    private void m9792Q(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String m9784H0 = m9784H0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(m9784H0, false, classLoader).asSubclass(AbstractC1888o.class);
                    try {
                        constructor = asSubclass.getConstructor(f7688T0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                    } catch (NoSuchMethodException e11) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e12) {
                            e12.initCause(e11);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + m9784H0, e12);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC1888o) constructor.newInstance(objArr));
                } catch (ClassCastException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + m9784H0, e13);
                } catch (ClassNotFoundException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + m9784H0, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + m9784H0, e15);
                } catch (InstantiationException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m9784H0, e16);
                } catch (InvocationTargetException e17) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + m9784H0, e17);
                }
            }
        }
    }

    /* renamed from: S */
    private boolean m9793S(int i11, int i12) {
        m9806q0(this.f7699E0);
        int[] iArr = this.f7699E0;
        if (iArr[0] == i11 && iArr[1] == i12) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    private void m9794V() {
        int i11 = this.f7715N;
        this.f7715N = 0;
        if (i11 != 0 && m9856T0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
            AbstractC1496b.m7556b(obtain, i11);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: W0 */
    private boolean m9795W0(View view, View view2, int i11) {
        int i12;
        int i13;
        if (view2 == null || view2 == this || m9895n0(view2) == null) {
            return false;
        }
        if (view == null || m9895n0(view) == null) {
            return true;
        }
        this.f7756x.set(0, 0, view.getWidth(), view.getHeight());
        this.f7758y.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f7756x);
        offsetDescendantRectToMyCoords(view2, this.f7758y);
        char c11 = 65535;
        if (this.f7692B.m10116d0() == 1) {
            i12 = -1;
        } else {
            i12 = 1;
        }
        Rect rect = this.f7756x;
        int i14 = rect.left;
        Rect rect2 = this.f7758y;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i13 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            if ((i16 > i17 || i14 >= i17) && i14 > i15) {
                i13 = -1;
            } else {
                i13 = 0;
            }
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            c11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                c11 = 0;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 17) {
                    if (i11 != 33) {
                        if (i11 != 66) {
                            if (i11 == 130) {
                                if (c11 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            throw new IllegalArgumentException("Invalid direction: " + i11 + m9890k0());
                        }
                        if (i13 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c11 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i13 >= 0) {
                    return false;
                }
                return true;
            }
            if (c11 <= 0 && (c11 != 0 || i13 * i12 < 0)) {
                return false;
            }
            return true;
        }
        if (c11 >= 0 && (c11 != 0 || i13 * i12 > 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private void m9796X() {
        boolean z11 = true;
        this.f7753v0.m10252a(1);
        m9891l0(this.f7753v0);
        this.f7753v0.f7874j = false;
        m9857T1();
        this.f7750u.m10428f();
        m9884h1();
        m9805p1();
        m9783G1();
        C1899z c1899z = this.f7753v0;
        if (!c1899z.f7875k || !this.f7761z0) {
            z11 = false;
        }
        c1899z.f7873i = z11;
        this.f7761z0 = false;
        this.f7759y0 = false;
        c1899z.f7872h = c1899z.f7876l;
        c1899z.f7870f = this.f7690A.mo10003k();
        m9806q0(this.f7699E0);
        if (this.f7753v0.f7875k) {
            int m10459g = this.f7748t.m10459g();
            for (int i11 = 0; i11 < m10459g; i11++) {
                AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10458f(i11));
                if (!m9776D0.m9955f0() && (!m9776D0.m9939O() || this.f7690A.m10007o())) {
                    this.f7750u.m10427e(m9776D0, this.f7728d0.m10055u(this.f7753v0, m9776D0, AbstractC1885l.m10034e(m9776D0), m9776D0.m9934H()));
                    if (this.f7753v0.f7873i && m9776D0.m9944T() && !m9776D0.m9941Q() && !m9776D0.m9955f0() && !m9776D0.m9939O()) {
                        this.f7750u.m10425c(m9910z0(m9776D0), m9776D0);
                    }
                }
            }
        }
        if (this.f7753v0.f7876l) {
            m9830H1();
            C1899z c1899z2 = this.f7753v0;
            boolean z12 = c1899z2.f7871g;
            c1899z2.f7871g = false;
            this.f7692B.mo9665V0(this.f7742q, c1899z2);
            this.f7753v0.f7871g = z12;
            for (int i12 = 0; i12 < this.f7748t.m10459g(); i12++) {
                AbstractC1876c0 m9776D02 = m9776D0(this.f7748t.m10458f(i12));
                if (!m9776D02.m9955f0() && !this.f7750u.m10431i(m9776D02)) {
                    int m10034e = AbstractC1885l.m10034e(m9776D02);
                    boolean m9935J = m9776D02.m9935J(8192);
                    if (!m9935J) {
                        m10034e |= 4096;
                    }
                    AbstractC1885l.c m10055u = this.f7728d0.m10055u(this.f7753v0, m9776D02, m10034e, m9776D02.m9934H());
                    if (m9935J) {
                        m9899s1(m9776D02, m10055u);
                    } else {
                        this.f7750u.m10423a(m9776D02, m10055u);
                    }
                }
            }
            m9839M();
        } else {
            m9839M();
        }
        m9886i1();
        m9862V1(false);
        this.f7753v0.f7869e = 2;
    }

    /* renamed from: Y */
    private void m9797Y() {
        boolean z11;
        m9857T1();
        m9884h1();
        this.f7753v0.m10252a(6);
        this.f7746s.m10379j();
        this.f7753v0.f7870f = this.f7690A.mo10003k();
        C1899z c1899z = this.f7753v0;
        c1899z.f7868d = 0;
        c1899z.f7872h = false;
        this.f7692B.mo9665V0(this.f7742q, c1899z);
        C1899z c1899z2 = this.f7753v0;
        c1899z2.f7871g = false;
        this.f7744r = null;
        if (c1899z2.f7875k && this.f7728d0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        c1899z2.f7875k = z11;
        c1899z2.f7869e = 4;
        m9886i1();
        m9862V1(false);
    }

    /* renamed from: Y1 */
    private void m9798Y1() {
        this.f7747s0.m9927g();
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.m10091I1();
        }
    }

    /* renamed from: Z */
    private void m9799Z() {
        this.f7753v0.m10252a(4);
        m9857T1();
        m9884h1();
        C1899z c1899z = this.f7753v0;
        c1899z.f7869e = 1;
        if (c1899z.f7875k) {
            for (int m10459g = this.f7748t.m10459g() - 1; m10459g >= 0; m10459g--) {
                AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10458f(m10459g));
                if (!m9776D0.m9955f0()) {
                    long m9910z0 = m9910z0(m9776D0);
                    AbstractC1885l.c m10054t = this.f7728d0.m10054t(this.f7753v0, m9776D0);
                    AbstractC1876c0 m10429g = this.f7750u.m10429g(m9910z0);
                    if (m10429g != null && !m10429g.m9955f0()) {
                        boolean m10430h = this.f7750u.m10430h(m10429g);
                        boolean m10430h2 = this.f7750u.m10430h(m9776D0);
                        if (m10430h && m10429g == m9776D0) {
                            this.f7750u.m10426d(m9776D0, m10054t);
                        } else {
                            AbstractC1885l.c m10435n = this.f7750u.m10435n(m10429g);
                            this.f7750u.m10426d(m9776D0, m10054t);
                            AbstractC1885l.c m10434m = this.f7750u.m10434m(m9776D0);
                            if (m10435n == null) {
                                m9786K0(m9910z0, m9776D0, m10429g);
                            } else {
                                m9781G(m10429g, m9776D0, m10435n, m10434m, m10430h, m10430h2);
                            }
                        }
                    } else {
                        this.f7750u.m10426d(m9776D0, m10054t);
                    }
                }
            }
            this.f7750u.m10436o(this.f7713L0);
        }
        this.f7692B.m10131j1(this.f7742q);
        C1899z c1899z2 = this.f7753v0;
        c1899z2.f7867c = c1899z2.f7870f;
        this.f7719R = false;
        this.f7720S = false;
        c1899z2.f7875k = false;
        c1899z2.f7876l = false;
        this.f7692B.f7818h = false;
        ArrayList arrayList = this.f7742q.f7842b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o.f7824n) {
            abstractC1888o.f7823m = 0;
            abstractC1888o.f7824n = false;
            this.f7742q.m10202K();
        }
        this.f7692B.mo9666W0(this.f7753v0);
        m9886i1();
        m9862V1(false);
        this.f7750u.m10428f();
        int[] iArr = this.f7699E0;
        if (m9793S(iArr[0], iArr[1])) {
            m9876d0(0, 0);
        }
        m9812t1();
        m9778E1();
    }

    /* renamed from: f0 */
    private boolean m9800f0(MotionEvent motionEvent) {
        InterfaceC1891r interfaceC1891r = this.f7698E;
        if (interfaceC1891r == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m9804p0(motionEvent);
        }
        interfaceC1891r.mo951a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f7698E = null;
        }
        return true;
    }

    private C1535c0 getScrollingChildHelper() {
        if (this.f7701F0 == null) {
            this.f7701F0 = new C1535c0(this);
        }
        return this.f7701F0;
    }

    /* renamed from: k1 */
    private void m9802k1(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7730f0) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.f7730f0 = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.f7734j0 = x11;
            this.f7732h0 = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.f7735k0 = y11;
            this.f7733i0 = y11;
        }
    }

    /* renamed from: o1 */
    private boolean m9803o1() {
        if (this.f7728d0 != null && this.f7692B.mo9654J1()) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private boolean m9804p0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f7696D.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1891r interfaceC1891r = (InterfaceC1891r) this.f7696D.get(i11);
            if (interfaceC1891r.mo953c(this, motionEvent) && action != 3) {
                this.f7698E = interfaceC1891r;
                return true;
            }
        }
        return false;
    }

    /* renamed from: p1 */
    private void m9805p1() {
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f7719R) {
            this.f7746s.m10392y();
            if (this.f7720S) {
                this.f7692B.mo9659Q0(this);
            }
        }
        if (m9803o1()) {
            this.f7746s.m10390w();
        } else {
            this.f7746s.m10379j();
        }
        boolean z14 = true;
        if (!this.f7759y0 && !this.f7761z0) {
            z11 = false;
        } else {
            z11 = true;
        }
        C1899z c1899z = this.f7753v0;
        if (this.f7706I && this.f7728d0 != null && (((z13 = this.f7719R) || z11 || this.f7692B.f7818h) && (!z13 || this.f7690A.m10007o()))) {
            z12 = true;
        } else {
            z12 = false;
        }
        c1899z.f7875k = z12;
        C1899z c1899z2 = this.f7753v0;
        if (!c1899z2.f7875k || !z11 || this.f7719R || !m9803o1()) {
            z14 = false;
        }
        c1899z2.f7876l = z14;
    }

    /* renamed from: q0 */
    private void m9806q0(int[] iArr) {
        int m10459g = this.f7748t.m10459g();
        if (m10459g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < m10459g; i13++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10458f(i13));
            if (!m9776D0.m9955f0()) {
                int m9932F = m9776D0.m9932F();
                if (m9932F < i11) {
                    i11 = m9932F;
                }
                if (m9932F > i12) {
                    i12 = m9932F;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    /* renamed from: r0 */
    static RecyclerView m9808r0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView m9808r0 = m9808r0(viewGroup.getChildAt(i11));
            if (m9808r0 != null) {
                return m9808r0;
            }
        }
        return null;
    }

    /* renamed from: r1 */
    private void m9809r1(float f11, float f12, float f13, float f14) {
        boolean z11 = true;
        if (f12 < 0.0f) {
            m9883h0();
            AbstractC1634f.m8383c(this.f7724W, (-f12) / getWidth(), 1.0f - (f13 / getHeight()));
        } else if (f12 > 0.0f) {
            m9885i0();
            AbstractC1634f.m8383c(this.f7726b0, f12 / getWidth(), f13 / getHeight());
        } else {
            z11 = false;
        }
        if (f14 < 0.0f) {
            m9888j0();
            AbstractC1634f.m8383c(this.f7725a0, (-f14) / getHeight(), f11 / getWidth());
        } else if (f14 > 0.0f) {
            m9881g0();
            AbstractC1634f.m8383c(this.f7727c0, f14 / getHeight(), 1.0f - (f11 / getWidth()));
        } else if (!z11 && f12 == 0.0f && f14 == 0.0f) {
            return;
        }
        AbstractC1579n0.m7898r0(this);
    }

    /* renamed from: s0 */
    private View m9811s0() {
        AbstractC1876c0 m9900t0;
        C1899z c1899z = this.f7753v0;
        int i11 = c1899z.f7877m;
        if (i11 == -1) {
            i11 = 0;
        }
        int m10253b = c1899z.m10253b();
        for (int i12 = i11; i12 < m10253b; i12++) {
            AbstractC1876c0 m9900t02 = m9900t0(i12);
            if (m9900t02 == null) {
                break;
            }
            if (m9900t02.f7784p.hasFocusable()) {
                return m9900t02.f7784p;
            }
        }
        int min = Math.min(m10253b, i11);
        do {
            min--;
            if (min < 0 || (m9900t0 = m9900t0(min)) == null) {
                return null;
            }
        } while (!m9900t0.f7784p.hasFocusable());
        return m9900t0.f7784p;
    }

    /* renamed from: t1 */
    private void m9812t1() {
        AbstractC1876c0 abstractC1876c0;
        View findViewById;
        if (this.f7745r0 && this.f7690A != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (f7687S0 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.f7748t.m10459g() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.f7748t.m10464n(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.f7753v0.f7878n != -1 && this.f7690A.m10007o()) {
                    abstractC1876c0 = m9901u0(this.f7753v0.f7878n);
                } else {
                    abstractC1876c0 = null;
                }
                if (abstractC1876c0 != null && !this.f7748t.m10464n(abstractC1876c0.f7784p) && abstractC1876c0.f7784p.hasFocusable()) {
                    view = abstractC1876c0.f7784p;
                } else if (this.f7748t.m10459g() > 0) {
                    view = m9811s0();
                }
                if (view != null) {
                    int i11 = this.f7753v0.f7879o;
                    if (i11 != -1 && (findViewById = view.findViewById(i11)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: u1 */
    private void m9813u1() {
        boolean z11;
        EdgeEffect edgeEffect = this.f7724W;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = this.f7724W.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.f7725a0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 |= this.f7725a0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7726b0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 |= this.f7726b0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7727c0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z11 |= this.f7727c0.isFinished();
        }
        if (z11) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: z */
    private void m9815z(AbstractC1876c0 abstractC1876c0) {
        boolean z11;
        View view = abstractC1876c0.f7784p;
        if (view.getParent() == this) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f7742q.m10201J(m9823C0(view));
        if (abstractC1876c0.m9943S()) {
            this.f7748t.m10455c(view, -1, view.getLayoutParams(), true);
        } else if (!z11) {
            this.f7748t.m10454b(view, true);
        } else {
            this.f7748t.m10462k(view);
        }
    }

    /* renamed from: A */
    public void m9816A(AbstractC1887n abstractC1887n) {
        m9819B(abstractC1887n, -1);
    }

    /* renamed from: A0 */
    public int m9817A0(View view) {
        AbstractC1876c0 m9776D0 = m9776D0(view);
        if (m9776D0 != null) {
            return m9776D0.m9929A();
        }
        return -1;
    }

    /* renamed from: A1 */
    public void m9818A1(InterfaceC1891r interfaceC1891r) {
        this.f7696D.remove(interfaceC1891r);
        if (this.f7698E == interfaceC1891r) {
            this.f7698E = null;
        }
    }

    /* renamed from: B */
    public void m9819B(AbstractC1887n abstractC1887n, int i11) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.mo9755t("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f7694C.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.f7694C.add(abstractC1887n);
        } else {
            this.f7694C.add(i11, abstractC1887n);
        }
        m9867Y0();
        requestLayout();
    }

    /* renamed from: B0 */
    public int m9820B0(View view) {
        AbstractC1876c0 m9776D0 = m9776D0(view);
        if (m9776D0 != null) {
            return m9776D0.m9932F();
        }
        return -1;
    }

    /* renamed from: B1 */
    public void m9821B1(AbstractC1892s abstractC1892s) {
        List list = this.f7757x0;
        if (list != null) {
            list.remove(abstractC1892s);
        }
    }

    /* renamed from: C */
    public void m9822C(InterfaceC1889p interfaceC1889p) {
        if (this.f7718Q == null) {
            this.f7718Q = new ArrayList();
        }
        this.f7718Q.add(interfaceC1889p);
    }

    /* renamed from: C0 */
    public AbstractC1876c0 m9823C0(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return m9776D0(view);
    }

    /* renamed from: C1 */
    void m9824C1() {
        AbstractC1876c0 abstractC1876c0;
        int m10459g = this.f7748t.m10459g();
        for (int i11 = 0; i11 < m10459g; i11++) {
            View m10458f = this.f7748t.m10458f(i11);
            AbstractC1876c0 m9823C0 = m9823C0(m10458f);
            if (m9823C0 != null && (abstractC1876c0 = m9823C0.f7792x) != null) {
                View view = abstractC1876c0.f7784p;
                int left = m10458f.getLeft();
                int top = m10458f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* renamed from: D */
    public void m9825D(InterfaceC1891r interfaceC1891r) {
        this.f7696D.add(interfaceC1891r);
    }

    /* renamed from: E */
    public void m9826E(AbstractC1892s abstractC1892s) {
        if (this.f7757x0 == null) {
            this.f7757x0 = new ArrayList();
        }
        this.f7757x0.add(abstractC1892s);
    }

    /* renamed from: E0 */
    public void m9827E0(View view, Rect rect) {
        m9779F0(view, rect);
    }

    /* renamed from: F */
    void m9828F(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar, AbstractC1885l.c cVar2) {
        abstractC1876c0.m9952c0(false);
        if (this.f7728d0.mo10036a(abstractC1876c0, cVar, cVar2)) {
            m9896n1();
        }
    }

    /* renamed from: H */
    void m9829H(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar, AbstractC1885l.c cVar2) {
        m9815z(abstractC1876c0);
        abstractC1876c0.m9952c0(false);
        if (this.f7728d0.mo10038c(abstractC1876c0, cVar, cVar2)) {
            m9896n1();
        }
    }

    /* renamed from: H1 */
    void m9830H1() {
        int m10461j = this.f7748t.m10461j();
        for (int i11 = 0; i11 < m10461j; i11++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i11));
            if (!m9776D0.m9955f0()) {
                m9776D0.m9950a0();
            }
        }
    }

    /* renamed from: I */
    void m9831I(String str) {
        if (m9861V0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m9890k0());
            }
            throw new IllegalStateException(str);
        }
        if (this.f7722U > 0) {
            new IllegalStateException("" + m9890k0());
        }
    }

    /* renamed from: I0 */
    Rect m9832I0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f7764c) {
            return layoutParams.f7763b;
        }
        if (this.f7753v0.m10256e() && (layoutParams.m9914c() || layoutParams.m9916e())) {
            return layoutParams.f7763b;
        }
        Rect rect = layoutParams.f7763b;
        rect.set(0, 0, 0, 0);
        int size = this.f7694C.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f7756x.set(0, 0, 0, 0);
            ((AbstractC1887n) this.f7694C.get(i11)).mo10066g(this.f7756x, view, this, this.f7753v0);
            int i12 = rect.left;
            Rect rect2 = this.f7756x;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f7764c = false;
        return rect;
    }

    /* renamed from: I1 */
    boolean m9833I1(int i11, int i12, MotionEvent motionEvent) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11;
        m9846P();
        if (this.f7690A != null) {
            int[] iArr = this.f7707I0;
            iArr[0] = 0;
            iArr[1] = 0;
            m9836J1(i11, i12, iArr);
            int[] iArr2 = this.f7707I0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i11 - i17;
            i16 = i12 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f7694C.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f7707I0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        m9872b0(i14, i13, i15, i16, this.f7703G0, 0, iArr3);
        int[] iArr4 = this.f7707I0;
        int i19 = iArr4[0];
        int i21 = i15 - i19;
        int i22 = iArr4[1];
        int i23 = i16 - i22;
        if (i19 == 0 && i22 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        int i24 = this.f7734j0;
        int[] iArr5 = this.f7703G0;
        int i25 = iArr5[0];
        this.f7734j0 = i24 - i25;
        int i26 = this.f7735k0;
        int i27 = iArr5[1];
        this.f7735k0 = i26 - i27;
        int[] iArr6 = this.f7705H0;
        iArr6[0] = iArr6[0] + i25;
        iArr6[1] = iArr6[1] + i27;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC1622z.m8279g(motionEvent, 8194)) {
                m9809r1(motionEvent.getX(), i21, motionEvent.getY(), i23);
            }
            m9844O(i11, i12);
        }
        if (i14 != 0 || i13 != 0) {
            m9876d0(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z11 || i14 != 0 || i13 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    boolean m9834J(AbstractC1876c0 abstractC1876c0) {
        AbstractC1885l abstractC1885l = this.f7728d0;
        if (abstractC1885l != null && !abstractC1885l.mo10041g(abstractC1876c0, abstractC1876c0.m9934H())) {
            return false;
        }
        return true;
    }

    /* renamed from: J0 */
    public AbstractC1887n m9835J0(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return (AbstractC1887n) this.f7694C.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: J1 */
    void m9836J1(int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        m9857T1();
        m9884h1();
        AbstractC1452r.m7366a("RV Scroll");
        m9891l0(this.f7753v0);
        if (i11 != 0) {
            i13 = this.f7692B.mo9676u1(i11, this.f7742q, this.f7753v0);
        } else {
            i13 = 0;
        }
        if (i12 != 0) {
            i14 = this.f7692B.mo9677w1(i12, this.f7742q, this.f7753v0);
        } else {
            i14 = 0;
        }
        AbstractC1452r.m7367b();
        m9824C1();
        m9886i1();
        m9862V1(false);
        if (iArr != null) {
            iArr[0] = i13;
            iArr[1] = i14;
        }
    }

    /* renamed from: K1 */
    public void m9837K1(int i11) {
        if (this.f7712L) {
            return;
        }
        m9866X1();
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null) {
            return;
        }
        abstractC1888o.mo9756v1(i11);
        awakenScrollBars();
    }

    /* renamed from: L0 */
    public boolean m9838L0() {
        if (this.f7706I && !this.f7719R && !this.f7746s.m10384p()) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    void m9839M() {
        int m10461j = this.f7748t.m10461j();
        for (int i11 = 0; i11 < m10461j; i11++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i11));
            if (!m9776D0.m9955f0()) {
                m9776D0.m9960r();
            }
        }
        this.f7742q.m10207d();
    }

    /* renamed from: M1 */
    boolean m9840M1(AbstractC1876c0 abstractC1876c0, int i11) {
        if (m9861V0()) {
            abstractC1876c0.f7782F = i11;
            this.f7709J0.add(abstractC1876c0);
            return false;
        }
        AbstractC1579n0.m7823L0(abstractC1876c0.f7784p, i11);
        return true;
    }

    /* renamed from: N */
    public void m9841N() {
        List list = this.f7757x0;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: N0 */
    void m9842N0() {
        this.f7746s = new C1905a(new C1879f());
    }

    /* renamed from: N1 */
    boolean m9843N1(AccessibilityEvent accessibilityEvent) {
        int i11;
        int i12 = 0;
        if (!m9861V0()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i11 = AbstractC1496b.m7555a(accessibilityEvent);
        } else {
            i11 = 0;
        }
        if (i11 != 0) {
            i12 = i11;
        }
        this.f7715N |= i12;
        return true;
    }

    /* renamed from: O */
    void m9844O(int i11, int i12) {
        boolean z11;
        EdgeEffect edgeEffect = this.f7724W;
        if (edgeEffect != null && !edgeEffect.isFinished() && i11 > 0) {
            this.f7724W.onRelease();
            z11 = this.f7724W.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.f7726b0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.f7726b0.onRelease();
            z11 |= this.f7726b0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f7725a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.f7725a0.onRelease();
            z11 |= this.f7725a0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f7727c0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.f7727c0.onRelease();
            z11 |= this.f7727c0.isFinished();
        }
        if (z11) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: O1 */
    public void m9845O1(int i11, int i12) {
        m9847P1(i11, i12, null);
    }

    /* renamed from: P */
    void m9846P() {
        if (this.f7706I && !this.f7719R) {
            if (!this.f7746s.m10384p()) {
                return;
            }
            if (this.f7746s.m10383o(4) && !this.f7746s.m10383o(11)) {
                AbstractC1452r.m7366a("RV PartialInvalidate");
                m9857T1();
                m9884h1();
                this.f7746s.m10390w();
                if (!this.f7710K) {
                    if (m9789M0()) {
                        m9863W();
                    } else {
                        this.f7746s.m10378i();
                    }
                }
                m9862V1(true);
                m9886i1();
                AbstractC1452r.m7367b();
                return;
            }
            if (this.f7746s.m10384p()) {
                AbstractC1452r.m7366a("RV FullInvalidate");
                m9863W();
                AbstractC1452r.m7367b();
                return;
            }
            return;
        }
        AbstractC1452r.m7366a("RV FullInvalidate");
        m9863W();
        AbstractC1452r.m7367b();
    }

    /* renamed from: P1 */
    public void m9847P1(int i11, int i12, Interpolator interpolator) {
        m9849Q1(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: Q0 */
    void m9848Q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C1917j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC31149b.fastscroll_default_thickness), resources.getDimensionPixelSize(AbstractC31149b.fastscroll_minimum_range), resources.getDimensionPixelOffset(AbstractC31149b.fastscroll_margin));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m9890k0());
        }
    }

    /* renamed from: Q1 */
    public void m9849Q1(int i11, int i12, Interpolator interpolator, int i13) {
        m9852R1(i11, i12, interpolator, i13, false);
    }

    /* renamed from: R */
    void m9850R(int i11, int i12) {
        setMeasuredDimension(AbstractC1888o.m10071A(i11, getPaddingLeft() + getPaddingRight(), AbstractC1579n0.m7816I(this)), AbstractC1888o.m10071A(i12, getPaddingTop() + getPaddingBottom(), AbstractC1579n0.m7814H(this)));
    }

    /* renamed from: R0 */
    void m9851R0() {
        this.f7727c0 = null;
        this.f7725a0 = null;
        this.f7726b0 = null;
        this.f7724W = null;
    }

    /* renamed from: R1 */
    void m9852R1(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || this.f7712L) {
            return;
        }
        int i14 = 0;
        if (!abstractC1888o.mo9757x()) {
            i11 = 0;
        }
        if (!this.f7692B.mo9758y()) {
            i12 = 0;
        }
        if (i11 != 0 || i12 != 0) {
            if (i13 != Integer.MIN_VALUE && i13 <= 0) {
                scrollBy(i11, i12);
                return;
            }
            if (z11) {
                if (i11 != 0) {
                    i14 = 1;
                }
                if (i12 != 0) {
                    i14 |= 2;
                }
                m9860U1(i14, 1);
            }
            this.f7747s0.m9926f(i11, i12, i13, interpolator);
        }
    }

    /* renamed from: S0 */
    public void m9853S0() {
        if (this.f7694C.size() == 0) {
            return;
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.mo9755t("Cannot invalidate item decorations during a scroll or layout");
        }
        m9867Y0();
        requestLayout();
    }

    /* renamed from: S1 */
    public void mo9854S1(int i11) {
        AbstractC1888o abstractC1888o;
        if (this.f7712L || (abstractC1888o = this.f7692B) == null) {
            return;
        }
        abstractC1888o.mo9729G1(this, this.f7753v0, i11);
    }

    /* renamed from: T */
    void m9855T(View view) {
        AbstractC1876c0 m9776D0 = m9776D0(view);
        mo9880f1(view);
        AbstractC1880g abstractC1880g = this.f7690A;
        if (abstractC1880g != null && m9776D0 != null) {
            abstractC1880g.mo9995F(m9776D0);
        }
        List list = this.f7718Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC1889p) this.f7718Q.get(size)).mo10174d(view);
            }
        }
    }

    /* renamed from: T0 */
    boolean m9856T0() {
        AccessibilityManager accessibilityManager = this.f7717P;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: T1 */
    void m9857T1() {
        int i11 = this.f7708J + 1;
        this.f7708J = i11;
        if (i11 != 1 || this.f7712L) {
            return;
        }
        this.f7710K = false;
    }

    /* renamed from: U */
    void m9858U(View view) {
        AbstractC1876c0 m9776D0 = m9776D0(view);
        m9882g1(view);
        AbstractC1880g abstractC1880g = this.f7690A;
        if (abstractC1880g != null && m9776D0 != null) {
            abstractC1880g.mo9996G(m9776D0);
        }
        List list = this.f7718Q;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC1889p) this.f7718Q.get(size)).mo10173b(view);
            }
        }
    }

    /* renamed from: U0 */
    public boolean m9859U0() {
        AbstractC1885l abstractC1885l = this.f7728d0;
        if (abstractC1885l != null && abstractC1885l.mo10050p()) {
            return true;
        }
        return false;
    }

    /* renamed from: U1 */
    public boolean m9860U1(int i11, int i12) {
        return getScrollingChildHelper().m7726p(i11, i12);
    }

    /* renamed from: V0 */
    public boolean m9861V0() {
        return this.f7721T > 0;
    }

    /* renamed from: V1 */
    void m9862V1(boolean z11) {
        if (this.f7708J < 1) {
            this.f7708J = 1;
        }
        if (!z11 && !this.f7712L) {
            this.f7710K = false;
        }
        if (this.f7708J == 1) {
            if (z11 && this.f7710K && !this.f7712L && this.f7692B != null && this.f7690A != null) {
                m9863W();
            }
            if (!this.f7712L) {
                this.f7710K = false;
            }
        }
        this.f7708J--;
    }

    /* renamed from: W */
    void m9863W() {
        if (this.f7690A == null || this.f7692B == null) {
            return;
        }
        C1899z c1899z = this.f7753v0;
        c1899z.f7874j = false;
        if (c1899z.f7869e == 1) {
            m9796X();
            this.f7692B.m10162x1(this);
            m9797Y();
        } else if (!this.f7746s.m10385q() && this.f7692B.getWidth() == getWidth() && this.f7692B.getHeight() == getHeight()) {
            this.f7692B.m10162x1(this);
        } else {
            this.f7692B.m10162x1(this);
            m9797Y();
        }
        m9799Z();
    }

    /* renamed from: W1 */
    public void m9864W1(int i11) {
        getScrollingChildHelper().m7728r(i11);
    }

    /* renamed from: X0 */
    void m9865X0(int i11) {
        if (this.f7692B == null) {
            return;
        }
        setScrollState(2);
        this.f7692B.mo9756v1(i11);
        awakenScrollBars();
    }

    /* renamed from: X1 */
    public void m9866X1() {
        setScrollState(0);
        m9798Y1();
    }

    /* renamed from: Y0 */
    void m9867Y0() {
        int m10461j = this.f7748t.m10461j();
        for (int i11 = 0; i11 < m10461j; i11++) {
            ((LayoutParams) this.f7748t.m10460i(i11).getLayoutParams()).f7764c = true;
        }
        this.f7742q.m10220s();
    }

    /* renamed from: Z0 */
    void m9868Z0() {
        int m10461j = this.f7748t.m10461j();
        for (int i11 = 0; i11 < m10461j; i11++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i11));
            if (m9776D0 != null && !m9776D0.m9955f0()) {
                m9776D0.m9959q(6);
            }
        }
        m9867Y0();
        this.f7742q.m10221t();
    }

    /* renamed from: Z1 */
    void m9869Z1(int i11, int i12, Object obj) {
        int i13;
        int m10461j = this.f7748t.m10461j();
        int i14 = i11 + i12;
        for (int i15 = 0; i15 < m10461j; i15++) {
            View m10460i = this.f7748t.m10460i(i15);
            AbstractC1876c0 m9776D0 = m9776D0(m10460i);
            if (m9776D0 != null && !m9776D0.m9955f0() && (i13 = m9776D0.f7786r) >= i11 && i13 < i14) {
                m9776D0.m9959q(2);
                m9776D0.m9958o(obj);
                ((LayoutParams) m10460i.getLayoutParams()).f7764c = true;
            }
        }
        this.f7742q.m10204M(i11, i12);
    }

    /* renamed from: a0 */
    public boolean m9870a0(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().m7718d(i11, i12, iArr, iArr2, i13);
    }

    /* renamed from: a1 */
    public void m9871a1(int i11) {
        int m10459g = this.f7748t.m10459g();
        for (int i12 = 0; i12 < m10459g; i12++) {
            this.f7748t.m10458f(i12).offsetLeftAndRight(i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i11, int i12) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.m10085D0(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    /* renamed from: b0 */
    public final void m9872b0(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        getScrollingChildHelper().m7719e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    /* renamed from: b1 */
    public void m9873b1(int i11) {
        int m10459g = this.f7748t.m10459g();
        for (int i12 = 0; i12 < m10459g; i12++) {
            this.f7748t.m10458f(i12).offsetTopAndBottom(i11);
        }
    }

    /* renamed from: c0 */
    void m9874c0(int i11) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.mo10115c1(i11);
        }
        mo9892l1(i11);
        AbstractC1892s abstractC1892s = this.f7755w0;
        if (abstractC1892s != null) {
            abstractC1892s.mo952b(this, i11);
        }
        List list = this.f7757x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1892s) this.f7757x0.get(size)).mo952b(this, i11);
            }
        }
    }

    /* renamed from: c1 */
    void m9875c1(int i11, int i12) {
        int m10461j = this.f7748t.m10461j();
        for (int i13 = 0; i13 < m10461j; i13++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i13));
            if (m9776D0 != null && !m9776D0.m9955f0() && m9776D0.f7786r >= i11) {
                m9776D0.m9946V(i12, false);
                this.f7753v0.f7871g = true;
            }
        }
        this.f7742q.m10222u(i11, i12);
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && this.f7692B.mo9678z((LayoutParams) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9757x()) {
            return 0;
        }
        return this.f7692B.mo9724D(this.f7753v0);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9757x()) {
            return 0;
        }
        return this.f7692B.mo9648E(this.f7753v0);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9757x()) {
            return 0;
        }
        return this.f7692B.mo9650F(this.f7753v0);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9758y()) {
            return 0;
        }
        return this.f7692B.mo9727G(this.f7753v0);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9758y()) {
            return 0;
        }
        return this.f7692B.mo9651H(this.f7753v0);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || !abstractC1888o.mo9758y()) {
            return 0;
        }
        return this.f7692B.mo9653I(this.f7753v0);
    }

    /* renamed from: d0 */
    void m9876d0(int i11, int i12) {
        this.f7722U++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        mo9894m1(i11, i12);
        AbstractC1892s abstractC1892s = this.f7755w0;
        if (abstractC1892s != null) {
            abstractC1892s.mo10176d(this, i11, i12);
        }
        List list = this.f7757x0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1892s) this.f7757x0.get(size)).mo10176d(this, i11, i12);
            }
        }
        this.f7722U--;
    }

    /* renamed from: d1 */
    void m9877d1(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int m10461j = this.f7748t.m10461j();
        if (i11 < i12) {
            i15 = -1;
            i14 = i11;
            i13 = i12;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i17 = 0; i17 < m10461j; i17++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i17));
            if (m9776D0 != null && (i16 = m9776D0.f7786r) >= i14 && i16 <= i13) {
                if (i16 == i11) {
                    m9776D0.m9946V(i12 - i11, false);
                } else {
                    m9776D0.m9946V(i15, false);
                }
                this.f7753v0.f7871g = true;
            }
        }
        this.f7742q.m10223v(i11, i12);
        requestLayout();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().m7715a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().m7716b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m7717c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().m7720f(i11, i12, i13, i14, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        int i12;
        super.draw(canvas);
        int size = this.f7694C.size();
        boolean z14 = false;
        for (int i13 = 0; i13 < size; i13++) {
            ((AbstractC1887n) this.f7694C.get(i13)).mo10070k(canvas, this, this.f7753v0);
        }
        EdgeEffect edgeEffect = this.f7724W;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f7752v) {
                i12 = getPaddingBottom();
            } else {
                i12 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i12, 0.0f);
            EdgeEffect edgeEffect2 = this.f7724W;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect3 = this.f7725a0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f7752v) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f7725a0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z13 = true;
            } else {
                z13 = false;
            }
            z11 |= z13;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f7726b0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f7752v) {
                i11 = getPaddingTop();
            } else {
                i11 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-i11, -width);
            EdgeEffect edgeEffect6 = this.f7726b0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z11 |= z12;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f7727c0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f7752v) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f7727c0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z14 = true;
            }
            z11 |= z14;
            canvas.restoreToCount(save4);
        }
        if ((!z11 && this.f7728d0 != null && this.f7694C.size() > 0 && this.f7728d0.mo10050p()) || z11) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    /* renamed from: e0 */
    void m9878e0() {
        int i11;
        for (int size = this.f7709J0.size() - 1; size >= 0; size--) {
            AbstractC1876c0 abstractC1876c0 = (AbstractC1876c0) this.f7709J0.get(size);
            if (abstractC1876c0.f7784p.getParent() == this && !abstractC1876c0.m9955f0() && (i11 = abstractC1876c0.f7782F) != -1) {
                AbstractC1579n0.m7823L0(abstractC1876c0.f7784p, i11);
                abstractC1876c0.f7782F = -1;
            }
        }
        this.f7709J0.clear();
    }

    /* renamed from: e1 */
    void m9879e1(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int m10461j = this.f7748t.m10461j();
        for (int i14 = 0; i14 < m10461j; i14++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i14));
            if (m9776D0 != null && !m9776D0.m9955f0()) {
                int i15 = m9776D0.f7786r;
                if (i15 >= i13) {
                    m9776D0.m9946V(-i12, z11);
                    this.f7753v0.f7871g = true;
                } else if (i15 >= i11) {
                    m9776D0.m9965z(i11 - 1, -i12, z11);
                    this.f7753v0.f7871g = true;
                }
            }
        }
        this.f7742q.m10224w(i11, i12, z11);
        requestLayout();
    }

    /* renamed from: f1 */
    public void mo9880f1(View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        boolean z11;
        View view2;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        int i13;
        View m10101O0 = this.f7692B.m10101O0(view, i11);
        if (m10101O0 != null) {
            return m10101O0;
        }
        boolean z15 = true;
        if (this.f7690A != null && this.f7692B != null && !m9861V0() && !this.f7712L) {
            z11 = true;
        } else {
            z11 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i11 == 2 || i11 == 1)) {
            if (this.f7692B.mo9758y()) {
                if (i11 == 2) {
                    i13 = 130;
                } else {
                    i13 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i13) == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (f7686R0) {
                    i11 = i13;
                }
            } else {
                z12 = false;
            }
            if (!z12 && this.f7692B.mo9757x()) {
                if (this.f7692B.m10116d0() == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i11 == 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z13 ^ z14) {
                    i12 = 66;
                } else {
                    i12 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i12) != null) {
                    z15 = false;
                }
                if (f7686R0) {
                    i11 = i12;
                }
                z12 = z15;
            }
            if (z12) {
                m9846P();
                if (m9895n0(view) == null) {
                    return null;
                }
                m9857T1();
                this.f7692B.mo9652H0(view, i11, this.f7742q, this.f7753v0);
                m9862V1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i11);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (findNextFocus == null && z11) {
                m9846P();
                if (m9895n0(view) == null) {
                    return null;
                }
                m9857T1();
                view2 = this.f7692B.mo9652H0(view, i11, this.f7742q, this.f7753v0);
                m9862V1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i11);
            }
            m9777D1(view2, null);
            return view;
        }
        if (!m9795W0(view, view2, i11)) {
            return super.focusSearch(view, i11);
        }
        return view2;
    }

    /* renamed from: g0 */
    void m9881g0() {
        if (this.f7727c0 != null) {
            return;
        }
        EdgeEffect m10033a = this.f7723V.m10033a(this, 3);
        this.f7727c0 = m10033a;
        if (this.f7752v) {
            m10033a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m10033a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: g1 */
    public void m9882g1(View view) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            return abstractC1888o.mo9658Q();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9890k0());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            return abstractC1888o.mo9660R(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9890k0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1880g getAdapter() {
        return this.f7690A;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            return abstractC1888o.m10102T();
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        InterfaceC1883j interfaceC1883j = this.f7697D0;
        if (interfaceC1883j == null) {
            return super.getChildDrawingOrder(i11, i12);
        }
        return interfaceC1883j.m10032a(i11, i12);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f7752v;
    }

    public C1931x getCompatAccessibilityDelegate() {
        return this.f7695C0;
    }

    public C1884k getEdgeEffectFactory() {
        return this.f7723V;
    }

    public AbstractC1885l getItemAnimator() {
        return this.f7728d0;
    }

    public int getItemDecorationCount() {
        return this.f7694C.size();
    }

    public AbstractC1888o getLayoutManager() {
        return this.f7692B;
    }

    public int getMaxFlingVelocity() {
        return this.f7739o0;
    }

    public int getMinFlingVelocity() {
        return this.f7738n0;
    }

    public long getNanoTime() {
        if (f7685Q0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC1890q getOnFlingListener() {
        return this.f7737m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f7745r0;
    }

    public C1893t getRecycledViewPool() {
        return this.f7742q.m10212i();
    }

    public int getScrollState() {
        return this.f7729e0;
    }

    /* renamed from: h0 */
    void m9883h0() {
        if (this.f7724W != null) {
            return;
        }
        EdgeEffect m10033a = this.f7723V.m10033a(this, 0);
        this.f7724W = m10033a;
        if (this.f7752v) {
            m10033a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m10033a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: h1 */
    public void m9884h1() {
        this.f7721T++;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m7721j();
    }

    /* renamed from: i0 */
    void m9885i0() {
        if (this.f7726b0 != null) {
            return;
        }
        EdgeEffect m10033a = this.f7723V.m10033a(this, 2);
        this.f7726b0 = m10033a;
        if (this.f7752v) {
            m10033a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            m10033a.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: i1 */
    void m9886i1() {
        m9889j1(true);
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f7700F;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f7712L;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m7723l();
    }

    /* renamed from: j */
    void m9887j(int i11, int i12) {
        if (i11 < 0) {
            m9883h0();
            if (this.f7724W.isFinished()) {
                this.f7724W.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            m9885i0();
            if (this.f7726b0.isFinished()) {
                this.f7726b0.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            m9888j0();
            if (this.f7725a0.isFinished()) {
                this.f7725a0.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            m9881g0();
            if (this.f7727c0.isFinished()) {
                this.f7727c0.onAbsorb(i12);
            }
        }
        if (i11 != 0 || i12 != 0) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    /* renamed from: j0 */
    void m9888j0() {
        if (this.f7725a0 != null) {
            return;
        }
        EdgeEffect m10033a = this.f7723V.m10033a(this, 1);
        this.f7725a0 = m10033a;
        if (this.f7752v) {
            m10033a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            m10033a.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: j1 */
    public void m9889j1(boolean z11) {
        int i11 = this.f7721T - 1;
        this.f7721T = i11;
        if (i11 < 1) {
            this.f7721T = 0;
            if (z11) {
                m9794V();
                m9878e0();
            }
        }
    }

    /* renamed from: k0 */
    String m9890k0() {
        return " " + super.toString() + ", adapter:" + this.f7690A + ", layout:" + this.f7692B + ", context:" + getContext();
    }

    /* renamed from: l0 */
    final void m9891l0(C1899z c1899z) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f7747s0.f7771r;
            c1899z.f7880p = overScroller.getFinalX() - overScroller.getCurrX();
            c1899z.f7881q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            c1899z.f7880p = 0;
            c1899z.f7881q = 0;
        }
    }

    /* renamed from: l1 */
    public void mo9892l1(int i11) {
    }

    /* renamed from: m0 */
    public View m9893m0(float f11, float f12) {
        for (int m10459g = this.f7748t.m10459g() - 1; m10459g >= 0; m10459g--) {
            View m10458f = this.f7748t.m10458f(m10459g);
            float translationX = m10458f.getTranslationX();
            float translationY = m10458f.getTranslationY();
            if (f11 >= m10458f.getLeft() + translationX && f11 <= m10458f.getRight() + translationX && f12 >= m10458f.getTop() + translationY && f12 <= m10458f.getBottom() + translationY) {
                return m10458f;
            }
        }
        return null;
    }

    /* renamed from: m1 */
    public void mo9894m1(int i11, int i12) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:            return r3;     */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View m9895n0(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        return null;
    }

    /* renamed from: n1 */
    void m9896n1() {
        if (!this.f7693B0 && this.f7700F) {
            AbstractC1579n0.m7900s0(this, this.f7711K0);
            this.f7693B0 = true;
        }
    }

    /* renamed from: o0 */
    public AbstractC1876c0 m9897o0(View view) {
        View m9895n0 = m9895n0(view);
        if (m9895n0 == null) {
            return null;
        }
        return m9823C0(m9895n0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:            if (r1 >= 30.0f) goto L48;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float f11;
        super.onAttachedToWindow();
        this.f7721T = 0;
        boolean z11 = true;
        this.f7700F = true;
        if (!this.f7706I || isLayoutRequested()) {
            z11 = false;
        }
        this.f7706I = z11;
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.m10097M(this);
        }
        this.f7693B0 = false;
        if (f7685Q0) {
            ThreadLocal threadLocal = RunnableC1918k.f8116t;
            RunnableC1918k runnableC1918k = (RunnableC1918k) threadLocal.get();
            this.f7749t0 = runnableC1918k;
            if (runnableC1918k == null) {
                this.f7749t0 = new RunnableC1918k();
                Display m7913z = AbstractC1579n0.m7913z(this);
                if (!isInEditMode() && m7913z != null) {
                    f11 = m7913z.getRefreshRate();
                }
                f11 = 60.0f;
                RunnableC1918k runnableC1918k2 = this.f7749t0;
                runnableC1918k2.f8120r = 1.0E9f / f11;
                threadLocal.set(runnableC1918k2);
            }
            this.f7749t0.m10538a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        RunnableC1918k runnableC1918k;
        super.onDetachedFromWindow();
        AbstractC1885l abstractC1885l = this.f7728d0;
        if (abstractC1885l != null) {
            abstractC1885l.mo10045k();
        }
        m9866X1();
        this.f7700F = false;
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.m10099N(this, this.f7742q);
        }
        this.f7709J0.clear();
        removeCallbacks(this.f7711K0);
        this.f7750u.m10432j();
        if (f7685Q0 && (runnableC1918k = this.f7749t0) != null) {
            runnableC1918k.m10541j(this);
            this.f7749t0 = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f7694C.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((AbstractC1887n) this.f7694C.get(i11)).mo10068i(canvas, this, this.f7753v0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f11;
        float f12;
        if (this.f7692B != null && !this.f7712L && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f7692B.mo9758y()) {
                    f11 = -motionEvent.getAxisValue(9);
                } else {
                    f11 = 0.0f;
                }
                if (this.f7692B.mo9757x()) {
                    f12 = motionEvent.getAxisValue(10);
                    if (f11 == 0.0f || f12 != 0.0f) {
                        m9833I1((int) (f12 * this.f7741p0), (int) (f11 * this.f7743q0), motionEvent);
                    }
                }
                f12 = 0.0f;
                if (f11 == 0.0f) {
                }
                m9833I1((int) (f12 * this.f7741p0), (int) (f11 * this.f7743q0), motionEvent);
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f7692B.mo9758y()) {
                        f11 = -axisValue;
                        f12 = 0.0f;
                        if (f11 == 0.0f) {
                        }
                        m9833I1((int) (f12 * this.f7741p0), (int) (f11 * this.f7743q0), motionEvent);
                    } else if (this.f7692B.mo9757x()) {
                        f12 = axisValue;
                        f11 = 0.0f;
                        if (f11 == 0.0f) {
                        }
                        m9833I1((int) (f12 * this.f7741p0), (int) (f11 * this.f7743q0), motionEvent);
                    }
                }
                f11 = 0.0f;
                f12 = 0.0f;
                if (f11 == 0.0f) {
                }
                m9833I1((int) (f12 * this.f7741p0), (int) (f11 * this.f7743q0), motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:            if (r0 != false) goto L109;     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.f7712L) {
            return false;
        }
        this.f7698E = null;
        if (m9804p0(motionEvent)) {
            m9785K();
            return true;
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null) {
            return false;
        }
        boolean mo9757x = abstractC1888o.mo9757x();
        boolean mo9758y = this.f7692B.mo9758y();
        if (this.f7731g0 == null) {
            this.f7731g0 = VelocityTracker.obtain();
        }
        this.f7731g0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m9802k1(motionEvent);
                            }
                        } else {
                            this.f7730f0 = motionEvent.getPointerId(actionIndex);
                            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f7734j0 = x11;
                            this.f7732h0 = x11;
                            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f7735k0 = y11;
                            this.f7733i0 = y11;
                        }
                    } else {
                        m9785K();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7730f0);
                    if (findPointerIndex < 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error processing scroll; pointer index for id ");
                        sb2.append(this.f7730f0);
                        sb2.append(" not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f7729e0 != 1) {
                        int i11 = x12 - this.f7732h0;
                        int i12 = y12 - this.f7733i0;
                        if (mo9757x != 0 && Math.abs(i11) > this.f7736l0) {
                            this.f7734j0 = x12;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (mo9758y && Math.abs(i12) > this.f7736l0) {
                            this.f7735k0 = y12;
                        }
                        setScrollState(1);
                    }
                }
            } else {
                this.f7731g0.clear();
                m9864W1(0);
            }
        } else {
            if (this.f7714M) {
                this.f7714M = false;
            }
            this.f7730f0 = motionEvent.getPointerId(0);
            int x13 = (int) (motionEvent.getX() + 0.5f);
            this.f7734j0 = x13;
            this.f7732h0 = x13;
            int y13 = (int) (motionEvent.getY() + 0.5f);
            this.f7735k0 = y13;
            this.f7733i0 = y13;
            if (this.f7729e0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m9864W1(1);
            }
            int[] iArr = this.f7705H0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i13 = mo9757x;
            if (mo9758y) {
                i13 = (mo9757x ? 1 : 0) | 2;
            }
            m9860U1(i13, 0);
        }
        if (this.f7729e0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC1452r.m7366a("RV OnLayout");
        m9863W();
        AbstractC1452r.m7367b();
        this.f7706I = true;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null) {
            m9850R(i11, i12);
            return;
        }
        if (abstractC1888o.mo9753q0()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.f7692B.m10106X0(this.f7742q, this.f7753v0, i11, i12);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f7690A == null) {
                return;
            }
            if (this.f7753v0.f7869e == 1) {
                m9796X();
            }
            this.f7692B.m10164y1(i11, i12);
            this.f7753v0.f7874j = true;
            m9797Y();
            this.f7692B.m10082B1(i11, i12);
            if (this.f7692B.mo9726E1()) {
                this.f7692B.m10164y1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f7753v0.f7874j = true;
                m9797Y();
                this.f7692B.m10082B1(i11, i12);
                return;
            }
            return;
        }
        if (this.f7702G) {
            this.f7692B.m10106X0(this.f7742q, this.f7753v0, i11, i12);
            return;
        }
        if (this.f7716O) {
            m9857T1();
            m9884h1();
            m9805p1();
            m9886i1();
            C1899z c1899z = this.f7753v0;
            if (c1899z.f7876l) {
                c1899z.f7872h = true;
            } else {
                this.f7746s.m10379j();
                this.f7753v0.f7872h = false;
            }
            this.f7716O = false;
            m9862V1(false);
        } else if (this.f7753v0.f7876l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1880g abstractC1880g = this.f7690A;
        if (abstractC1880g != null) {
            this.f7753v0.f7870f = abstractC1880g.mo10003k();
        } else {
            this.f7753v0.f7870f = 0;
        }
        m9857T1();
        this.f7692B.m10106X0(this.f7742q, this.f7753v0, i11, i12);
        m9862V1(false);
        this.f7753v0.f7872h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (m9861V0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f7744r = savedState;
        super.onRestoreInstanceState(savedState.m8457a());
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null && (parcelable2 = this.f7744r.f7766r) != null) {
            abstractC1888o.mo9742a1(parcelable2);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f7744r;
        if (savedState2 != null) {
            savedState.m9917b(savedState2);
        } else {
            AbstractC1888o abstractC1888o = this.f7692B;
            if (abstractC1888o != null) {
                savedState.f7766r = abstractC1888o.mo9743b1();
            } else {
                savedState.f7766r = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13 || i12 != i14) {
            m9851R0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14 = 0;
        if (this.f7712L || this.f7714M) {
            return false;
        }
        if (m9800f0(motionEvent)) {
            m9785K();
            return true;
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null) {
            return false;
        }
        boolean mo9757x = abstractC1888o.mo9757x();
        boolean mo9758y = this.f7692B.mo9758y();
        if (this.f7731g0 == null) {
            this.f7731g0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f7705H0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f7705H0;
        obtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                m9802k1(motionEvent);
                            }
                        } else {
                            this.f7730f0 = motionEvent.getPointerId(actionIndex);
                            int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f7734j0 = x11;
                            this.f7732h0 = x11;
                            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f7735k0 = y11;
                            this.f7733i0 = y11;
                        }
                    } else {
                        m9785K();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f7730f0);
                    if (findPointerIndex < 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error processing scroll; pointer index for id ");
                        sb2.append(this.f7730f0);
                        sb2.append(" not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    int i15 = this.f7734j0 - x12;
                    int i16 = this.f7735k0 - y12;
                    if (this.f7729e0 != 1) {
                        if (mo9757x != 0) {
                            if (i15 > 0) {
                                i15 = Math.max(0, i15 - this.f7736l0);
                            } else {
                                i15 = Math.min(0, i15 + this.f7736l0);
                            }
                            if (i15 != 0) {
                                z11 = true;
                                if (mo9758y) {
                                    if (i16 > 0) {
                                        i16 = Math.max(0, i16 - this.f7736l0);
                                    } else {
                                        i16 = Math.min(0, i16 + this.f7736l0);
                                    }
                                    if (i16 != 0) {
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    setScrollState(1);
                                }
                            }
                        }
                        z11 = false;
                        if (mo9758y) {
                        }
                        if (z11) {
                        }
                    }
                    int i17 = i15;
                    int i18 = i16;
                    if (this.f7729e0 == 1) {
                        int[] iArr3 = this.f7707I0;
                        iArr3[0] = 0;
                        iArr3[1] = 0;
                        if (mo9757x != 0) {
                            i11 = i17;
                        } else {
                            i11 = 0;
                        }
                        if (mo9758y) {
                            i12 = i18;
                        } else {
                            i12 = 0;
                        }
                        if (m9870a0(i11, i12, iArr3, this.f7703G0, 0)) {
                            int[] iArr4 = this.f7707I0;
                            i17 -= iArr4[0];
                            i18 -= iArr4[1];
                            int[] iArr5 = this.f7705H0;
                            int i19 = iArr5[0];
                            int[] iArr6 = this.f7703G0;
                            iArr5[0] = i19 + iArr6[0];
                            iArr5[1] = iArr5[1] + iArr6[1];
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        int i21 = i18;
                        int[] iArr7 = this.f7703G0;
                        this.f7734j0 = x12 - iArr7[0];
                        this.f7735k0 = y12 - iArr7[1];
                        if (mo9757x != 0) {
                            i13 = i17;
                        } else {
                            i13 = 0;
                        }
                        if (mo9758y) {
                            i14 = i21;
                        }
                        if (m9833I1(i13, i14, motionEvent)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        }
                        RunnableC1918k runnableC1918k = this.f7749t0;
                        if (runnableC1918k != null && (i17 != 0 || i21 != 0)) {
                            runnableC1918k.m10539f(this, i17, i21);
                        }
                    }
                }
            } else {
                this.f7731g0.addMovement(obtain);
                this.f7731g0.computeCurrentVelocity(1000, this.f7739o0);
                if (mo9757x != 0) {
                    f11 = -this.f7731g0.getXVelocity(this.f7730f0);
                } else {
                    f11 = 0.0f;
                }
                if (mo9758y) {
                    f12 = -this.f7731g0.getYVelocity(this.f7730f0);
                } else {
                    f12 = 0.0f;
                }
                if ((f11 == 0.0f && f12 == 0.0f) || !mo9906x0((int) f11, (int) f12)) {
                    setScrollState(0);
                }
                m9780F1();
                obtain.recycle();
                return true;
            }
        } else {
            this.f7730f0 = motionEvent.getPointerId(0);
            int x13 = (int) (motionEvent.getX() + 0.5f);
            this.f7734j0 = x13;
            this.f7732h0 = x13;
            int y13 = (int) (motionEvent.getY() + 0.5f);
            this.f7735k0 = y13;
            this.f7733i0 = y13;
            int i22 = mo9757x;
            if (mo9758y) {
                i22 = (mo9757x ? 1 : 0) | 2;
            }
            m9860U1(i22, 0);
        }
        this.f7731g0.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    /* renamed from: q1 */
    void m9898q1(boolean z11) {
        this.f7720S = z11 | this.f7720S;
        this.f7719R = true;
        m9868Z0();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z11) {
        AbstractC1876c0 m9776D0 = m9776D0(view);
        if (m9776D0 != null) {
            if (m9776D0.m9943S()) {
                m9776D0.m9963v();
            } else if (!m9776D0.m9955f0()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + m9776D0 + m9890k0());
            }
        }
        view.clearAnimation();
        m9858U(view);
        super.removeDetachedView(view, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f7692B.m10109Z0(this, this.f7753v0, view, view2) && view2 != null) {
            m9777D1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.f7692B.m10148p1(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.f7696D.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((InterfaceC1891r) this.f7696D.get(i11)).mo954e(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f7708J == 0 && !this.f7712L) {
            super.requestLayout();
        } else {
            this.f7710K = true;
        }
    }

    /* renamed from: s1 */
    void m9899s1(AbstractC1876c0 abstractC1876c0, AbstractC1885l.c cVar) {
        abstractC1876c0.m9951b0(0, 8192);
        if (this.f7753v0.f7873i && abstractC1876c0.m9944T() && !abstractC1876c0.m9941Q() && !abstractC1876c0.m9955f0()) {
            this.f7750u.m10425c(m9910z0(abstractC1876c0), abstractC1876c0);
        }
        this.f7750u.m10427e(abstractC1876c0, cVar);
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || this.f7712L) {
            return;
        }
        boolean mo9757x = abstractC1888o.mo9757x();
        boolean mo9758y = this.f7692B.mo9758y();
        if (mo9757x || mo9758y) {
            if (!mo9757x) {
                i11 = 0;
            }
            if (!mo9758y) {
                i12 = 0;
            }
            m9833I1(i11, i12, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (m9843N1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C1931x c1931x) {
        this.f7695C0 = c1931x;
        AbstractC1579n0.m7801A0(this, c1931x);
    }

    public void setAdapter(AbstractC1880g abstractC1880g) {
        setLayoutFrozen(false);
        m9788L1(abstractC1880g, false, true);
        m9898q1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC1883j interfaceC1883j) {
        boolean z11;
        if (interfaceC1883j == this.f7697D0) {
            return;
        }
        if (interfaceC1883j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setChildrenDrawingOrderEnabled(z11);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.f7752v) {
            m9851R0();
        }
        this.f7752v = z11;
        super.setClipToPadding(z11);
        if (this.f7706I) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1884k c1884k) {
        AbstractC1487i.m7492g(c1884k);
        this.f7723V = c1884k;
        m9851R0();
    }

    public void setHasFixedSize(boolean z11) {
        this.f7702G = z11;
    }

    public void setItemAnimator(AbstractC1885l abstractC1885l) {
        AbstractC1885l abstractC1885l2 = this.f7728d0;
        if (abstractC1885l2 != null) {
            abstractC1885l2.mo10045k();
            this.f7728d0.m10059y(null);
        }
        this.f7728d0 = abstractC1885l;
        if (abstractC1885l != null) {
            abstractC1885l.m10059y(this.f7691A0);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.f7742q.m10199G(i11);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(AbstractC1888o abstractC1888o) {
        if (abstractC1888o == this.f7692B) {
            return;
        }
        m9866X1();
        if (this.f7692B != null) {
            AbstractC1885l abstractC1885l = this.f7728d0;
            if (abstractC1885l != null) {
                abstractC1885l.mo10045k();
            }
            this.f7692B.m10129i1(this.f7742q);
            this.f7692B.m10131j1(this.f7742q);
            this.f7742q.m10206c();
            if (this.f7700F) {
                this.f7692B.m10099N(this, this.f7742q);
            }
            this.f7692B.m10084C1(null);
            this.f7692B = null;
        } else {
            this.f7742q.m10206c();
        }
        this.f7748t.m10465o();
        this.f7692B = abstractC1888o;
        if (abstractC1888o != null) {
            if (abstractC1888o.f7812b == null) {
                abstractC1888o.m10084C1(this);
                if (this.f7700F) {
                    this.f7692B.m10097M(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + abstractC1888o + " is already attached to a RecyclerView:" + abstractC1888o.f7812b.m9890k0());
            }
        }
        this.f7742q.m10202K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().m7724m(z11);
    }

    public void setOnFlingListener(AbstractC1890q abstractC1890q) {
        this.f7737m0 = abstractC1890q;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC1892s abstractC1892s) {
        this.f7755w0 = abstractC1892s;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.f7745r0 = z11;
    }

    public void setRecycledViewPool(C1893t c1893t) {
        this.f7742q.m10197E(c1893t);
    }

    public void setRecyclerListener(InterfaceC1895v interfaceC1895v) {
    }

    void setScrollState(int i11) {
        if (i11 == this.f7729e0) {
            return;
        }
        this.f7729e0 = i11;
        if (i11 != 2) {
            m9798Y1();
        }
        m9874c0(i11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setScrollingTouchSlop(): bad argument constant ");
                sb2.append(i11);
                sb2.append("; using default value");
            } else {
                this.f7736l0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f7736l0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC1872a0 abstractC1872a0) {
        this.f7742q.m10198F(abstractC1872a0);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().m7725o(i11);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m7727q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.f7712L) {
            m9831I("Do not suppressLayout in layout or scroll");
            if (!z11) {
                this.f7712L = false;
                if (this.f7710K && this.f7692B != null && this.f7690A != null) {
                    requestLayout();
                }
                this.f7710K = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f7712L = true;
            this.f7714M = true;
            m9866X1();
        }
    }

    /* renamed from: t0 */
    public AbstractC1876c0 m9900t0(int i11) {
        AbstractC1876c0 abstractC1876c0 = null;
        if (this.f7719R) {
            return null;
        }
        int m10461j = this.f7748t.m10461j();
        for (int i12 = 0; i12 < m10461j; i12++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i12));
            if (m9776D0 != null && !m9776D0.m9941Q() && m9908y0(m9776D0) == i11) {
                if (this.f7748t.m10464n(m9776D0.f7784p)) {
                    abstractC1876c0 = m9776D0;
                } else {
                    return m9776D0;
                }
            }
        }
        return abstractC1876c0;
    }

    /* renamed from: u0 */
    public AbstractC1876c0 m9901u0(long j11) {
        AbstractC1880g abstractC1880g = this.f7690A;
        AbstractC1876c0 abstractC1876c0 = null;
        if (abstractC1880g != null && abstractC1880g.m10007o()) {
            int m10461j = this.f7748t.m10461j();
            for (int i11 = 0; i11 < m10461j; i11++) {
                AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i11));
                if (m9776D0 != null && !m9776D0.m9941Q() && m9776D0.m9930B() == j11) {
                    if (this.f7748t.m10464n(m9776D0.f7784p)) {
                        abstractC1876c0 = m9776D0;
                    } else {
                        return m9776D0;
                    }
                }
            }
        }
        return abstractC1876c0;
    }

    /* renamed from: v0 */
    public AbstractC1876c0 m9902v0(int i11) {
        return m9904w0(i11, false);
    }

    /* renamed from: v1 */
    public void m9903v1() {
        AbstractC1885l abstractC1885l = this.f7728d0;
        if (abstractC1885l != null) {
            abstractC1885l.mo10045k();
        }
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.m10129i1(this.f7742q);
            this.f7692B.m10131j1(this.f7742q);
        }
        this.f7742q.m10206c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AbstractC1876c0 m9904w0(int i11, boolean z11) {
        int m10461j = this.f7748t.m10461j();
        AbstractC1876c0 abstractC1876c0 = null;
        for (int i12 = 0; i12 < m10461j; i12++) {
            AbstractC1876c0 m9776D0 = m9776D0(this.f7748t.m10460i(i12));
            if (m9776D0 != null && !m9776D0.m9941Q()) {
                if (z11) {
                    if (m9776D0.f7786r != i11) {
                        continue;
                    }
                    if (!this.f7748t.m10464n(m9776D0.f7784p)) {
                        abstractC1876c0 = m9776D0;
                    } else {
                        return m9776D0;
                    }
                } else {
                    if (m9776D0.m9932F() != i11) {
                        continue;
                    }
                    if (!this.f7748t.m10464n(m9776D0.f7784p)) {
                    }
                }
            }
        }
        return abstractC1876c0;
    }

    /* renamed from: w1 */
    boolean m9905w1(View view) {
        m9857T1();
        boolean m10468r = this.f7748t.m10468r(view);
        if (m10468r) {
            AbstractC1876c0 m9776D0 = m9776D0(view);
            this.f7742q.m10201J(m9776D0);
            this.f7742q.m10195C(m9776D0);
        }
        m9862V1(!m10468r);
        return m10468r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: x0 */
    public boolean mo9906x0(int i11, int i12) {
        boolean z11;
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o == null || this.f7712L) {
            return false;
        }
        int mo9757x = abstractC1888o.mo9757x();
        boolean mo9758y = this.f7692B.mo9758y();
        if (mo9757x == 0 || Math.abs(i11) < this.f7738n0) {
            i11 = 0;
        }
        if (!mo9758y || Math.abs(i12) < this.f7738n0) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        float f11 = i11;
        float f12 = i12;
        if (!dispatchNestedPreFling(f11, f12)) {
            if (mo9757x == 0 && !mo9758y) {
                z11 = false;
            } else {
                z11 = true;
            }
            dispatchNestedFling(f11, f12, z11);
            AbstractC1890q abstractC1890q = this.f7737m0;
            if (abstractC1890q != null && abstractC1890q.mo10175a(i11, i12)) {
                return true;
            }
            if (z11) {
                if (mo9758y) {
                    mo9757x = (mo9757x == true ? 1 : 0) | 2;
                }
                m9860U1(mo9757x, 1);
                int i13 = this.f7739o0;
                int max = Math.max(-i13, Math.min(i11, i13));
                int i14 = this.f7739o0;
                this.f7747s0.m9924c(max, Math.max(-i14, Math.min(i12, i14)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: x1 */
    public void m9907x1(AbstractC1887n abstractC1887n) {
        boolean z11;
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            abstractC1888o.mo9755t("Cannot remove item decoration during a scroll  or layout");
        }
        this.f7694C.remove(abstractC1887n);
        if (this.f7694C.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            setWillNotDraw(z11);
        }
        m9867Y0();
        requestLayout();
    }

    /* renamed from: y0 */
    int m9908y0(AbstractC1876c0 abstractC1876c0) {
        if (!abstractC1876c0.m9935J(524) && abstractC1876c0.m9938N()) {
            return this.f7746s.m10377e(abstractC1876c0.f7786r);
        }
        return -1;
    }

    /* renamed from: y1 */
    public void m9909y1(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            m9907x1(m9835J0(i11));
            return;
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: z0 */
    long m9910z0(AbstractC1876c0 abstractC1876c0) {
        if (this.f7690A.m10007o()) {
            return abstractC1876c0.m9930B();
        }
        return abstractC1876c0.f7786r;
    }

    /* renamed from: z1 */
    public void m9911z1(InterfaceC1889p interfaceC1889p) {
        List list = this.f7718Q;
        if (list == null) {
            return;
        }
        list.remove(interfaceC1889p);
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC1876c0 f7762a;

        /* renamed from: b */
        final Rect f7763b;

        /* renamed from: c */
        boolean f7764c;

        /* renamed from: d */
        boolean f7765d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7763b = new Rect();
            this.f7764c = true;
            this.f7765d = false;
        }

        /* renamed from: a */
        public int m9912a() {
            return this.f7762a.m9929A();
        }

        /* renamed from: b */
        public int m9913b() {
            return this.f7762a.m9932F();
        }

        /* renamed from: c */
        public boolean m9914c() {
            return this.f7762a.m9944T();
        }

        /* renamed from: d */
        public boolean m9915d() {
            return this.f7762a.m9941Q();
        }

        /* renamed from: e */
        public boolean m9916e() {
            return this.f7762a.m9939O();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f7763b = new Rect();
            this.f7764c = true;
            this.f7765d = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7763b = new Rect();
            this.f7764c = true;
            this.f7765d = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7763b = new Rect();
            this.f7764c = true;
            this.f7765d = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f7763b = new Rect();
            this.f7764c = true;
            this.f7765d = false;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC31148a.recyclerViewStyle);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1870a();

        /* renamed from: r */
        Parcelable f7766r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        /* loaded from: classes2.dex */
        static class C1870a implements Parcelable.ClassLoaderCreator {
            C1870a() {
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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7766r = parcel.readParcelable(classLoader == null ? AbstractC1888o.class.getClassLoader() : classLoader);
        }

        /* renamed from: b */
        void m9917b(SavedState savedState) {
            this.f7766r = savedState.f7766r;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f7766r, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f7740p = new C1896w();
        this.f7742q = new C1894u();
        this.f7750u = new C1910c0();
        this.f7754w = new RunnableC1871a();
        this.f7756x = new Rect();
        this.f7758y = new Rect();
        this.f7760z = new RectF();
        this.f7694C = new ArrayList();
        this.f7696D = new ArrayList();
        this.f7708J = 0;
        this.f7719R = false;
        this.f7720S = false;
        this.f7721T = 0;
        this.f7722U = 0;
        this.f7723V = new C1884k();
        this.f7728d0 = new C1914g();
        this.f7729e0 = 0;
        this.f7730f0 = -1;
        this.f7741p0 = Float.MIN_VALUE;
        this.f7743q0 = Float.MIN_VALUE;
        this.f7745r0 = true;
        this.f7747s0 = new RunnableC1874b0();
        this.f7751u0 = f7685Q0 ? new RunnableC1918k.b() : null;
        this.f7753v0 = new C1899z();
        this.f7759y0 = false;
        this.f7761z0 = false;
        this.f7691A0 = new C1886m();
        this.f7693B0 = false;
        this.f7699E0 = new int[2];
        this.f7703G0 = new int[2];
        this.f7705H0 = new int[2];
        this.f7707I0 = new int[2];
        this.f7709J0 = new ArrayList();
        this.f7711K0 = new RunnableC1873b();
        this.f7713L0 = new C1877d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f7736l0 = viewConfiguration.getScaledTouchSlop();
        this.f7741p0 = AbstractC1587p0.m8126b(viewConfiguration, context);
        this.f7743q0 = AbstractC1587p0.m8129e(viewConfiguration, context);
        this.f7738n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f7739o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f7728d0.m10059y(this.f7691A0);
        m9842N0();
        m9791P0();
        m9790O0();
        if (AbstractC1579n0.m7808E(this) == 0) {
            AbstractC1579n0.m7823L0(this, 1);
        }
        this.f7717P = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1931x(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC31151d.RecyclerView, i11, 0);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, AbstractC31151d.RecyclerView, attributeSet, obtainStyledAttributes, i11, 0);
        }
        String string = obtainStyledAttributes.getString(AbstractC31151d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(AbstractC31151d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f7752v = obtainStyledAttributes.getBoolean(AbstractC31151d.RecyclerView_android_clipToPadding, true);
        boolean z11 = obtainStyledAttributes.getBoolean(AbstractC31151d.RecyclerView_fastScrollEnabled, false);
        this.f7704H = z11;
        if (z11) {
            m9848Q0((StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC31151d.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(AbstractC31151d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(AbstractC31151d.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(AbstractC31151d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        m9792Q(context, string, attributeSet, i11, 0);
        int[] iArr = f7681M0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        if (i12 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes2, i11, 0);
        }
        boolean z12 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1888o abstractC1888o = this.f7692B;
        if (abstractC1888o != null) {
            return abstractC1888o.mo9662S(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m9890k0());
    }
}
