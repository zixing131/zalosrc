package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.graphics.C1421e;
import androidx.core.view.C1580n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p176g1.AbstractC19201c;

/* renamed from: androidx.core.view.a1 */
/* loaded from: classes2.dex */
public final class C1492a1 {

    /* renamed from: a */
    private e f6385a;

    /* renamed from: androidx.core.view.a1$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final C1421e f6386a;

        /* renamed from: b */
        private final C1421e f6387b;

        public a(C1421e c1421e, C1421e c1421e2) {
            this.f6386a = c1421e;
            this.f6387b = c1421e2;
        }

        /* renamed from: d */
        public static a m7524d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        /* renamed from: a */
        public C1421e m7525a() {
            return this.f6386a;
        }

        /* renamed from: b */
        public C1421e m7526b() {
            return this.f6387b;
        }

        /* renamed from: c */
        public WindowInsetsAnimation.Bounds m7527c() {
            return d.m7544e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f6386a + " upper=" + this.f6387b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f6386a = d.m7546g(bounds);
            this.f6387b = d.m7545f(bounds);
        }
    }

    /* renamed from: androidx.core.view.a1$b */
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a */
        WindowInsets f6388a;

        /* renamed from: b */
        private final int f6389b;

        public b(int i11) {
            this.f6389b = i11;
        }

        /* renamed from: a */
        public final int m7528a() {
            return this.f6389b;
        }

        /* renamed from: b */
        public abstract void mo7529b(C1492a1 c1492a1);

        /* renamed from: d */
        public void mo7530d(C1492a1 c1492a1) {
        }

        /* renamed from: e */
        public abstract C1580n1 mo7531e(C1580n1 c1580n1, List list);

        /* renamed from: f */
        public a m7532f(C1492a1 c1492a1, a aVar) {
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.a1$c */
    /* loaded from: classes2.dex */
    public static class c extends e {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.a1$c$a */
        /* loaded from: classes2.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            final b f6390a;

            /* renamed from: b */
            private C1580n1 f6391b;

            /* renamed from: androidx.core.view.a1$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class C32628a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: p */
                final /* synthetic */ C1492a1 f6392p;

                /* renamed from: q */
                final /* synthetic */ C1580n1 f6393q;

                /* renamed from: r */
                final /* synthetic */ C1580n1 f6394r;

                /* renamed from: s */
                final /* synthetic */ int f6395s;

                /* renamed from: t */
                final /* synthetic */ View f6396t;

                C32628a(C1492a1 c1492a1, C1580n1 c1580n1, C1580n1 c1580n12, int i11, View view) {
                    this.f6392p = c1492a1;
                    this.f6393q = c1580n1;
                    this.f6394r = c1580n12;
                    this.f6395s = i11;
                    this.f6396t = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f6392p.m7523e(valueAnimator.getAnimatedFraction());
                    c.m7538j(this.f6396t, c.m7542n(this.f6393q, this.f6394r, this.f6392p.m7521b(), this.f6395s), Collections.singletonList(this.f6392p));
                }
            }

            /* renamed from: androidx.core.view.a1$c$a$b */
            /* loaded from: classes2.dex */
            class b extends AnimatorListenerAdapter {

                /* renamed from: p */
                final /* synthetic */ C1492a1 f6398p;

                /* renamed from: q */
                final /* synthetic */ View f6399q;

                b(C1492a1 c1492a1, View view) {
                    this.f6398p = c1492a1;
                    this.f6399q = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f6398p.m7523e(1.0f);
                    c.m7536h(this.f6399q, this.f6398p);
                }
            }

            /* renamed from: androidx.core.view.a1$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            class RunnableC32629c implements Runnable {

                /* renamed from: p */
                final /* synthetic */ View f6401p;

                /* renamed from: q */
                final /* synthetic */ C1492a1 f6402q;

                /* renamed from: r */
                final /* synthetic */ a f6403r;

                /* renamed from: s */
                final /* synthetic */ ValueAnimator f6404s;

                RunnableC32629c(View view, C1492a1 c1492a1, a aVar, ValueAnimator valueAnimator) {
                    this.f6401p = view;
                    this.f6402q = c1492a1;
                    this.f6403r = aVar;
                    this.f6404s = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.m7539k(this.f6401p, this.f6402q, this.f6403r);
                    this.f6404s.start();
                }
            }

            a(View view, b bVar) {
                C1580n1 c1580n1;
                this.f6390a = bVar;
                C1580n1 m7824M = AbstractC1579n0.m7824M(view);
                if (m7824M != null) {
                    c1580n1 = new C1580n1.b(m7824M).m8073a();
                } else {
                    c1580n1 = null;
                }
                this.f6391b = c1580n1;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f6391b = C1580n1.m8048z(windowInsets, view);
                    return c.m7540l(view, windowInsets);
                }
                C1580n1 m8048z = C1580n1.m8048z(windowInsets, view);
                if (this.f6391b == null) {
                    this.f6391b = AbstractC1579n0.m7824M(view);
                }
                if (this.f6391b == null) {
                    this.f6391b = m8048z;
                    return c.m7540l(view, windowInsets);
                }
                b m7541m = c.m7541m(view);
                if (m7541m != null && Objects.equals(m7541m.f6388a, windowInsets)) {
                    return c.m7540l(view, windowInsets);
                }
                int m7533e = c.m7533e(m8048z, this.f6391b);
                if (m7533e == 0) {
                    return c.m7540l(view, windowInsets);
                }
                C1580n1 c1580n1 = this.f6391b;
                C1492a1 c1492a1 = new C1492a1(m7533e, new DecelerateInterpolator(), 160L);
                c1492a1.m7523e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1492a1.m7520a());
                a m7534f = c.m7534f(m8048z, c1580n1, m7533e);
                c.m7537i(view, c1492a1, windowInsets, false);
                duration.addUpdateListener(new C32628a(c1492a1, m8048z, c1580n1, m7533e, view));
                duration.addListener(new b(c1492a1, view));
                ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(view, new RunnableC32629c(view, c1492a1, m7534f, duration));
                this.f6391b = m8048z;
                return c.m7540l(view, windowInsets);
            }
        }

        c(int i11, Interpolator interpolator, long j11) {
            super(i11, interpolator, j11);
        }

        /* renamed from: e */
        static int m7533e(C1580n1 c1580n1, C1580n1 c1580n12) {
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if (!c1580n1.m8054f(i12).equals(c1580n12.m8054f(i12))) {
                    i11 |= i12;
                }
            }
            return i11;
        }

        /* renamed from: f */
        static a m7534f(C1580n1 c1580n1, C1580n1 c1580n12, int i11) {
            C1421e m8054f = c1580n1.m8054f(i11);
            C1421e m8054f2 = c1580n12.m8054f(i11);
            return new a(C1421e.m7230b(Math.min(m8054f.f6230a, m8054f2.f6230a), Math.min(m8054f.f6231b, m8054f2.f6231b), Math.min(m8054f.f6232c, m8054f2.f6232c), Math.min(m8054f.f6233d, m8054f2.f6233d)), C1421e.m7230b(Math.max(m8054f.f6230a, m8054f2.f6230a), Math.max(m8054f.f6231b, m8054f2.f6231b), Math.max(m8054f.f6232c, m8054f2.f6232c), Math.max(m8054f.f6233d, m8054f2.f6233d)));
        }

        /* renamed from: g */
        private static View.OnApplyWindowInsetsListener m7535g(View view, b bVar) {
            return new a(view, bVar);
        }

        /* renamed from: h */
        static void m7536h(View view, C1492a1 c1492a1) {
            b m7541m = m7541m(view);
            if (m7541m != null) {
                m7541m.mo7529b(c1492a1);
                if (m7541m.m7528a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m7536h(viewGroup.getChildAt(i11), c1492a1);
                }
            }
        }

        /* renamed from: i */
        static void m7537i(View view, C1492a1 c1492a1, WindowInsets windowInsets, boolean z11) {
            b m7541m = m7541m(view);
            if (m7541m != null) {
                m7541m.f6388a = windowInsets;
                if (!z11) {
                    m7541m.mo7530d(c1492a1);
                    if (m7541m.m7528a() == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m7537i(viewGroup.getChildAt(i11), c1492a1, windowInsets, z11);
                }
            }
        }

        /* renamed from: j */
        static void m7538j(View view, C1580n1 c1580n1, List list) {
            b m7541m = m7541m(view);
            if (m7541m != null) {
                c1580n1 = m7541m.mo7531e(c1580n1, list);
                if (m7541m.m7528a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m7538j(viewGroup.getChildAt(i11), c1580n1, list);
                }
            }
        }

        /* renamed from: k */
        static void m7539k(View view, C1492a1 c1492a1, a aVar) {
            b m7541m = m7541m(view);
            if (m7541m != null) {
                m7541m.m7532f(c1492a1, aVar);
                if (m7541m.m7528a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m7539k(viewGroup.getChildAt(i11), c1492a1, aVar);
                }
            }
        }

        /* renamed from: l */
        static WindowInsets m7540l(View view, WindowInsets windowInsets) {
            if (view.getTag(AbstractC19201c.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: m */
        static b m7541m(View view) {
            Object tag = view.getTag(AbstractC19201c.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f6390a;
            }
            return null;
        }

        /* renamed from: n */
        static C1580n1 m7542n(C1580n1 c1580n1, C1580n1 c1580n12, float f11, int i11) {
            C1580n1.b bVar = new C1580n1.b(c1580n1);
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) == 0) {
                    bVar.m8074b(i12, c1580n1.m8054f(i12));
                } else {
                    C1421e m8054f = c1580n1.m8054f(i12);
                    C1421e m8054f2 = c1580n12.m8054f(i12);
                    float f12 = 1.0f - f11;
                    bVar.m8074b(i12, C1580n1.m8046p(m8054f, (int) (((m8054f.f6230a - m8054f2.f6230a) * f12) + 0.5d), (int) (((m8054f.f6231b - m8054f2.f6231b) * f12) + 0.5d), (int) (((m8054f.f6232c - m8054f2.f6232c) * f12) + 0.5d), (int) (((m8054f.f6233d - m8054f2.f6233d) * f12) + 0.5d)));
                }
            }
            return bVar.m8073a();
        }

        /* renamed from: o */
        static void m7543o(View view, b bVar) {
            Object tag = view.getTag(AbstractC19201c.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(AbstractC19201c.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener m7535g = m7535g(view, bVar);
            view.setTag(AbstractC19201c.tag_window_insets_animation_callback, m7535g);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(m7535g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.a1$d */
    /* loaded from: classes2.dex */
    public static class d extends e {

        /* renamed from: e */
        private final WindowInsetsAnimation f6406e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.view.a1$d$a */
        /* loaded from: classes2.dex */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            private final b f6407a;

            /* renamed from: b */
            private List f6408b;

            /* renamed from: c */
            private ArrayList f6409c;

            /* renamed from: d */
            private final HashMap f6410d;

            a(b bVar) {
                super(bVar.m7528a());
                this.f6410d = new HashMap();
                this.f6407a = bVar;
            }

            /* renamed from: a */
            private C1492a1 m7552a(WindowInsetsAnimation windowInsetsAnimation) {
                C1492a1 c1492a1 = (C1492a1) this.f6410d.get(windowInsetsAnimation);
                if (c1492a1 == null) {
                    C1492a1 m7519f = C1492a1.m7519f(windowInsetsAnimation);
                    this.f6410d.put(windowInsetsAnimation, m7519f);
                    return m7519f;
                }
                return c1492a1;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f6407a.mo7529b(m7552a(windowInsetsAnimation));
                this.f6410d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f6407a.mo7530d(m7552a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f6409c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f6409c = arrayList2;
                    this.f6408b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation m7794a = AbstractC1572l1.m7794a(list.get(size));
                    C1492a1 m7552a = m7552a(m7794a);
                    fraction = m7794a.getFraction();
                    m7552a.m7523e(fraction);
                    this.f6409c.add(m7552a);
                }
                return this.f6407a.mo7531e(C1580n1.m8047y(windowInsets), this.f6408b).m8071x();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f6407a.m7532f(m7552a(windowInsetsAnimation), a.m7524d(bounds)).m7527c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f6406e = windowInsetsAnimation;
        }

        /* renamed from: e */
        public static WindowInsetsAnimation.Bounds m7544e(a aVar) {
            AbstractC1560i1.m7777a();
            return AbstractC1556h1.m7773a(aVar.m7525a().m7234f(), aVar.m7526b().m7234f());
        }

        /* renamed from: f */
        public static C1421e m7545f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return C1421e.m7233e(upperBound);
        }

        /* renamed from: g */
        public static C1421e m7546g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return C1421e.m7233e(lowerBound);
        }

        /* renamed from: h */
        public static void m7547h(View view, b bVar) {
            a aVar;
            if (bVar != null) {
                aVar = new a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        @Override // androidx.core.view.C1492a1.e
        /* renamed from: a */
        public long mo7548a() {
            long durationMillis;
            durationMillis = this.f6406e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.C1492a1.e
        /* renamed from: b */
        public float mo7549b() {
            float interpolatedFraction;
            interpolatedFraction = this.f6406e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.C1492a1.e
        /* renamed from: c */
        public int mo7550c() {
            int typeMask;
            typeMask = this.f6406e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.C1492a1.e
        /* renamed from: d */
        public void mo7551d(float f11) {
            this.f6406e.setFraction(f11);
        }

        d(int i11, Interpolator interpolator, long j11) {
            this(AbstractC1552g1.m7769a(i11, interpolator, j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.a1$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        private final int f6411a;

        /* renamed from: b */
        private float f6412b;

        /* renamed from: c */
        private final Interpolator f6413c;

        /* renamed from: d */
        private final long f6414d;

        e(int i11, Interpolator interpolator, long j11) {
            this.f6411a = i11;
            this.f6413c = interpolator;
            this.f6414d = j11;
        }

        /* renamed from: a */
        public long mo7548a() {
            return this.f6414d;
        }

        /* renamed from: b */
        public float mo7549b() {
            Interpolator interpolator = this.f6413c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f6412b);
            }
            return this.f6412b;
        }

        /* renamed from: c */
        public int mo7550c() {
            return this.f6411a;
        }

        /* renamed from: d */
        public void mo7551d(float f11) {
            this.f6412b = f11;
        }
    }

    public C1492a1(int i11, Interpolator interpolator, long j11) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6385a = new d(i11, interpolator, j11);
        } else {
            this.f6385a = new c(i11, interpolator, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m7518d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.m7547h(view, bVar);
        } else {
            c.m7543o(view, bVar);
        }
    }

    /* renamed from: f */
    static C1492a1 m7519f(WindowInsetsAnimation windowInsetsAnimation) {
        return new C1492a1(windowInsetsAnimation);
    }

    /* renamed from: a */
    public long m7520a() {
        return this.f6385a.mo7548a();
    }

    /* renamed from: b */
    public float m7521b() {
        return this.f6385a.mo7549b();
    }

    /* renamed from: c */
    public int m7522c() {
        return this.f6385a.mo7550c();
    }

    /* renamed from: e */
    public void m7523e(float f11) {
        this.f6385a.mo7551d(f11);
    }

    private C1492a1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f6385a = new d(windowInsetsAnimation);
        }
    }
}
