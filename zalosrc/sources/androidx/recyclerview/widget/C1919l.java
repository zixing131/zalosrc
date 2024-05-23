package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1598s;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p701z1.AbstractC31149b;

/* renamed from: androidx.recyclerview.widget.l */
/* loaded from: classes2.dex */
public class C1919l extends RecyclerView.AbstractC1887n implements RecyclerView.InterfaceC1889p {

    /* renamed from: A */
    private f f8131A;

    /* renamed from: C */
    private Rect f8133C;

    /* renamed from: D */
    private long f8134D;

    /* renamed from: d */
    float f8138d;

    /* renamed from: e */
    float f8139e;

    /* renamed from: f */
    private float f8140f;

    /* renamed from: g */
    private float f8141g;

    /* renamed from: h */
    float f8142h;

    /* renamed from: i */
    float f8143i;

    /* renamed from: j */
    private float f8144j;

    /* renamed from: k */
    private float f8145k;

    /* renamed from: m */
    e f8147m;

    /* renamed from: o */
    int f8149o;

    /* renamed from: q */
    private int f8151q;

    /* renamed from: r */
    RecyclerView f8152r;

    /* renamed from: t */
    VelocityTracker f8154t;

    /* renamed from: u */
    private List f8155u;

    /* renamed from: v */
    private List f8156v;

    /* renamed from: w */
    private RecyclerView.InterfaceC1883j f8157w;

    /* renamed from: z */
    C1598s f8160z;

    /* renamed from: a */
    final List f8135a = new ArrayList();

    /* renamed from: b */
    private final float[] f8136b = new float[2];

    /* renamed from: c */
    RecyclerView.AbstractC1876c0 f8137c = null;

    /* renamed from: l */
    int f8146l = -1;

    /* renamed from: n */
    private int f8148n = 0;

    /* renamed from: p */
    List f8150p = new ArrayList();

    /* renamed from: s */
    final Runnable f8153s = new a();

    /* renamed from: x */
    View f8158x = null;

    /* renamed from: y */
    int f8159y = -1;

    /* renamed from: B */
    private final RecyclerView.InterfaceC1891r f8132B = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.l$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1919l c1919l = C1919l.this;
            if (c1919l.f8137c != null && c1919l.m10564E()) {
                C1919l c1919l2 = C1919l.this;
                RecyclerView.AbstractC1876c0 abstractC1876c0 = c1919l2.f8137c;
                if (abstractC1876c0 != null) {
                    c1919l2.m10574z(abstractC1876c0);
                }
                C1919l c1919l3 = C1919l.this;
                c1919l3.f8152r.removeCallbacks(c1919l3.f8153s);
                AbstractC1579n0.m7900s0(C1919l.this.f8152r, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.l$b */
    /* loaded from: classes2.dex */
    public class b implements RecyclerView.InterfaceC1891r {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: a */
        public void mo951a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1919l.this.f8160z.m8175a(motionEvent);
            VelocityTracker velocityTracker = C1919l.this.f8154t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1919l.this.f8146l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(C1919l.this.f8146l);
            if (findPointerIndex >= 0) {
                C1919l.this.m10569o(actionMasked, motionEvent, findPointerIndex);
            }
            C1919l c1919l = C1919l.this;
            RecyclerView.AbstractC1876c0 abstractC1876c0 = c1919l.f8137c;
            if (abstractC1876c0 == null) {
                return;
            }
            int i11 = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            C1919l c1919l2 = C1919l.this;
                            if (pointerId == c1919l2.f8146l) {
                                if (actionIndex == 0) {
                                    i11 = 1;
                                }
                                c1919l2.f8146l = motionEvent.getPointerId(i11);
                                C1919l c1919l3 = C1919l.this;
                                c1919l3.m10567L(motionEvent, c1919l3.f8149o, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = c1919l.f8154t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    if (findPointerIndex >= 0) {
                        c1919l.m10567L(motionEvent, c1919l.f8149o, findPointerIndex);
                        C1919l.this.m10574z(abstractC1876c0);
                        C1919l c1919l4 = C1919l.this;
                        c1919l4.f8152r.removeCallbacks(c1919l4.f8153s);
                        C1919l.this.f8153s.run();
                        C1919l.this.f8152r.invalidate();
                        return;
                    }
                    return;
                }
            }
            C1919l.this.m10565F(null, 0);
            C1919l.this.f8146l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: c */
        public boolean mo953c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            g m10571s;
            C1919l.this.f8160z.m8175a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1919l.this.f8146l = motionEvent.getPointerId(0);
                C1919l.this.f8138d = motionEvent.getX();
                C1919l.this.f8139e = motionEvent.getY();
                C1919l.this.m10561A();
                C1919l c1919l = C1919l.this;
                if (c1919l.f8137c == null && (m10571s = c1919l.m10571s(motionEvent)) != null) {
                    C1919l c1919l2 = C1919l.this;
                    c1919l2.f8138d -= m10571s.f8186y;
                    c1919l2.f8139e -= m10571s.f8187z;
                    c1919l2.m10570r(m10571s.f8181t, true);
                    if (C1919l.this.f8135a.remove(m10571s.f8181t.f7784p)) {
                        C1919l c1919l3 = C1919l.this;
                        c1919l3.f8147m.mo10583c(c1919l3.f8152r, m10571s.f8181t);
                    }
                    C1919l.this.m10565F(m10571s.f8181t, m10571s.f8182u);
                    C1919l c1919l4 = C1919l.this;
                    c1919l4.m10567L(motionEvent, c1919l4.f8149o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i11 = C1919l.this.f8146l;
                if (i11 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                    C1919l.this.m10569o(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                C1919l c1919l5 = C1919l.this;
                c1919l5.f8146l = -1;
                c1919l5.m10565F(null, 0);
            }
            VelocityTracker velocityTracker = C1919l.this.f8154t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1919l.this.f8137c != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1891r
        /* renamed from: e */
        public void mo954e(boolean z11) {
            if (!z11) {
                return;
            }
            C1919l.this.m10565F(null, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$c */
    /* loaded from: classes2.dex */
    public class c extends g {

        /* renamed from: D */
        final /* synthetic */ int f8163D;

        /* renamed from: E */
        final /* synthetic */ RecyclerView.AbstractC1876c0 f8164E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, float f11, float f12, float f13, float f14, int i13, RecyclerView.AbstractC1876c0 abstractC1876c02) {
            super(abstractC1876c0, i11, i12, f11, f12, f13, f14);
            this.f8163D = i13;
            this.f8164E = abstractC1876c02;
        }

        @Override // androidx.recyclerview.widget.C1919l.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f8174A) {
                return;
            }
            if (this.f8163D <= 0) {
                C1919l c1919l = C1919l.this;
                c1919l.f8147m.mo10583c(c1919l.f8152r, this.f8164E);
            } else {
                C1919l.this.f8135a.add(this.f8164E.f7784p);
                this.f8185x = true;
                int i11 = this.f8163D;
                if (i11 > 0) {
                    C1919l.this.m10562B(this, i11);
                }
            }
            C1919l c1919l2 = C1919l.this;
            View view = c1919l2.f8158x;
            View view2 = this.f8164E.f7784p;
            if (view == view2) {
                c1919l2.m10563D(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$d */
    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ g f8166p;

        /* renamed from: q */
        final /* synthetic */ int f8167q;

        d(g gVar, int i11) {
            this.f8166p = gVar;
            this.f8167q = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C1919l.this.f8152r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                g gVar = this.f8166p;
                if (!gVar.f8174A && gVar.f8181t.m9929A() != -1) {
                    RecyclerView.AbstractC1885l itemAnimator = C1919l.this.f8152r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.m10051q(null)) && !C1919l.this.m10573x()) {
                        C1919l.this.f8147m.mo10580B(this.f8166p.f8181t, this.f8167q);
                    } else {
                        C1919l.this.f8152r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$e */
    /* loaded from: classes2.dex */
    public static abstract class e {

        /* renamed from: b */
        private static final Interpolator f8169b = new a();

        /* renamed from: c */
        private static final Interpolator f8170c = new b();

        /* renamed from: a */
        private int f8171a = -1;

        /* renamed from: androidx.recyclerview.widget.l$e$a */
        /* loaded from: classes2.dex */
        static class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                return f11 * f11 * f11 * f11 * f11;
            }
        }

        /* renamed from: androidx.recyclerview.widget.l$e$b */
        /* loaded from: classes2.dex */
        static class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m10575e(int i11, int i12) {
            int i13;
            int i14 = i11 & 789516;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 << 2;
            } else {
                int i16 = i14 << 1;
                i15 |= (-789517) & i16;
                i13 = (i16 & 789516) << 2;
            }
            return i15 | i13;
        }

        /* renamed from: i */
        private int m10576i(RecyclerView recyclerView) {
            if (this.f8171a == -1) {
                this.f8171a = recyclerView.getResources().getDimensionPixelSize(AbstractC31149b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f8171a;
        }

        /* renamed from: s */
        public static int m10577s(int i11, int i12) {
            return i12 << (i11 * 8);
        }

        /* renamed from: t */
        public static int m10578t(int i11, int i12) {
            return m10577s(2, i11) | m10577s(1, i12) | m10577s(0, i12 | i11);
        }

        /* renamed from: A */
        public void mo10579A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
            if (abstractC1876c0 != null) {
                C1921n.f8189a.mo10610b(abstractC1876c0.f7784p);
            }
        }

        /* renamed from: B */
        public abstract void mo10580B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11);

        /* renamed from: a */
        public boolean m10581a(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.AbstractC1876c0 m10582b(RecyclerView.AbstractC1876c0 abstractC1876c0, List list, int i11, int i12) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i11 + abstractC1876c0.f7784p.getWidth();
            int height = i12 + abstractC1876c0.f7784p.getHeight();
            int left2 = i11 - abstractC1876c0.f7784p.getLeft();
            int top2 = i12 - abstractC1876c0.f7784p.getTop();
            int size = list.size();
            RecyclerView.AbstractC1876c0 abstractC1876c02 = null;
            int i13 = -1;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.AbstractC1876c0 abstractC1876c03 = (RecyclerView.AbstractC1876c0) list.get(i14);
                if (left2 > 0 && (right = abstractC1876c03.f7784p.getRight() - width) < 0 && abstractC1876c03.f7784p.getRight() > abstractC1876c0.f7784p.getRight() && (abs4 = Math.abs(right)) > i13) {
                    abstractC1876c02 = abstractC1876c03;
                    i13 = abs4;
                }
                if (left2 < 0 && (left = abstractC1876c03.f7784p.getLeft() - i11) > 0 && abstractC1876c03.f7784p.getLeft() < abstractC1876c0.f7784p.getLeft() && (abs3 = Math.abs(left)) > i13) {
                    abstractC1876c02 = abstractC1876c03;
                    i13 = abs3;
                }
                if (top2 < 0 && (top = abstractC1876c03.f7784p.getTop() - i12) > 0 && abstractC1876c03.f7784p.getTop() < abstractC1876c0.f7784p.getTop() && (abs2 = Math.abs(top)) > i13) {
                    abstractC1876c02 = abstractC1876c03;
                    i13 = abs2;
                }
                if (top2 > 0 && (bottom = abstractC1876c03.f7784p.getBottom() - height) < 0 && abstractC1876c03.f7784p.getBottom() > abstractC1876c0.f7784p.getBottom() && (abs = Math.abs(bottom)) > i13) {
                    abstractC1876c02 = abstractC1876c03;
                    i13 = abs;
                }
            }
            return abstractC1876c02;
        }

        /* renamed from: c */
        public void mo10583c(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0) {
            C1921n.f8189a.mo10609a(abstractC1876c0.f7784p);
        }

        /* renamed from: d */
        public int m10584d(int i11, int i12) {
            int i13;
            int i14 = i11 & 3158064;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 >> 2;
            } else {
                int i16 = i14 >> 1;
                i15 |= (-3158065) & i16;
                i13 = (i16 & 3158064) >> 2;
            }
            return i15 | i13;
        }

        /* renamed from: f */
        final int m10585f(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0) {
            return m10584d(mo10589k(recyclerView, abstractC1876c0), AbstractC1579n0.m7812G(recyclerView));
        }

        /* renamed from: g */
        public long m10586g(RecyclerView recyclerView, int i11, float f11, float f12) {
            RecyclerView.AbstractC1885l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i11 == 8) {
                    return 200L;
                }
                return 250L;
            }
            if (i11 == 8) {
                return itemAnimator.m10048n();
            }
            return itemAnimator.m10049o();
        }

        /* renamed from: h */
        public int m10587h() {
            return 0;
        }

        /* renamed from: j */
        public float m10588j(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            return 0.5f;
        }

        /* renamed from: k */
        public abstract int mo10589k(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0);

        /* renamed from: l */
        public float m10590l(float f11) {
            return f11;
        }

        /* renamed from: m */
        public float m10591m(RecyclerView.AbstractC1876c0 abstractC1876c0) {
            return 0.5f;
        }

        /* renamed from: n */
        public float m10592n(float f11) {
            return f11;
        }

        /* renamed from: o */
        boolean m10593o(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0) {
            if ((m10585f(recyclerView, abstractC1876c0) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public int m10594p(RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
            int m10576i = m10576i(recyclerView);
            float f11 = 1.0f;
            int signum = (int) (((int) Math.signum(i12)) * m10576i * f8170c.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)));
            if (j11 <= 2000) {
                f11 = ((float) j11) / 2000.0f;
            }
            int interpolation = (int) (signum * f8169b.getInterpolation(f11));
            if (interpolation == 0) {
                if (i12 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        /* renamed from: q */
        public abstract boolean mo10595q();

        /* renamed from: r */
        public abstract boolean mo10596r();

        /* renamed from: u */
        public void mo10597u(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, float f11, float f12, int i11, boolean z11) {
            C1921n.f8189a.mo10611c(canvas, recyclerView, abstractC1876c0.f7784p, f11, f12, i11, z11);
        }

        /* renamed from: v */
        public void m10598v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, float f11, float f12, int i11, boolean z11) {
            C1921n.f8189a.mo10612d(canvas, recyclerView, abstractC1876c0.f7784p, f11, f12, i11, z11);
        }

        /* renamed from: w */
        void m10599w(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, List list, int i11, float f11, float f12) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) list.get(i12);
                gVar.m10608e();
                int save = canvas.save();
                mo10597u(canvas, recyclerView, gVar.f8181t, gVar.f8186y, gVar.f8187z, gVar.f8182u, false);
                canvas.restoreToCount(save);
            }
            if (abstractC1876c0 != null) {
                int save2 = canvas.save();
                mo10597u(canvas, recyclerView, abstractC1876c0, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: x */
        void m10600x(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, List list, int i11, float f11, float f12) {
            int size = list.size();
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                g gVar = (g) list.get(i12);
                int save = canvas.save();
                m10598v(canvas, recyclerView, gVar.f8181t, gVar.f8186y, gVar.f8187z, gVar.f8182u, false);
                canvas.restoreToCount(save);
            }
            if (abstractC1876c0 != null) {
                int save2 = canvas.save();
                m10598v(canvas, recyclerView, abstractC1876c0, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                g gVar2 = (g) list.get(i13);
                boolean z12 = gVar2.f8175B;
                if (z12 && !gVar2.f8185x) {
                    list.remove(i13);
                } else if (!z12) {
                    z11 = true;
                }
            }
            if (z11) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: y */
        public abstract boolean mo10601y(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, RecyclerView.AbstractC1876c0 abstractC1876c02);

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: z */
        public void mo10602z(RecyclerView recyclerView, RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, RecyclerView.AbstractC1876c0 abstractC1876c02, int i12, int i13, int i14) {
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).mo9749g(abstractC1876c0.f7784p, abstractC1876c02.f7784p, i13, i14);
                return;
            }
            if (layoutManager.mo9757x()) {
                if (layoutManager.m10121f(abstractC1876c02.f7784p) <= recyclerView.getPaddingLeft()) {
                    recyclerView.m9837K1(i12);
                }
                if (layoutManager.m10132k(abstractC1876c02.f7784p) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.m9837K1(i12);
                }
            }
            if (layoutManager.mo9758y()) {
                if (layoutManager.m10135l(abstractC1876c02.f7784p) <= recyclerView.getPaddingTop()) {
                    recyclerView.m9837K1(i12);
                }
                if (layoutManager.m10130j(abstractC1876c02.f7784p) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.m9837K1(i12);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$f */
    /* loaded from: classes2.dex */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: p */
        private boolean f8172p = true;

        f() {
        }

        /* renamed from: a */
        void m10603a() {
            this.f8172p = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View m10572t;
            RecyclerView.AbstractC1876c0 m9823C0;
            if (this.f8172p && (m10572t = C1919l.this.m10572t(motionEvent)) != null && (m9823C0 = C1919l.this.f8152r.m9823C0(m10572t)) != null) {
                C1919l c1919l = C1919l.this;
                if (!c1919l.f8147m.m10593o(c1919l.f8152r, m9823C0)) {
                    return;
                }
                int pointerId = motionEvent.getPointerId(0);
                int i11 = C1919l.this.f8146l;
                if (pointerId == i11) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    C1919l c1919l2 = C1919l.this;
                    c1919l2.f8138d = x11;
                    c1919l2.f8139e = y11;
                    c1919l2.f8143i = 0.0f;
                    c1919l2.f8142h = 0.0f;
                    if (c1919l2.f8147m.mo10596r()) {
                        C1919l.this.m10565F(m9823C0, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$g */
    /* loaded from: classes2.dex */
    public static class g implements Animator.AnimatorListener {

        /* renamed from: A */
        boolean f8174A = false;

        /* renamed from: B */
        boolean f8175B = false;

        /* renamed from: C */
        private float f8176C;

        /* renamed from: p */
        final float f8177p;

        /* renamed from: q */
        final float f8178q;

        /* renamed from: r */
        final float f8179r;

        /* renamed from: s */
        final float f8180s;

        /* renamed from: t */
        final RecyclerView.AbstractC1876c0 f8181t;

        /* renamed from: u */
        final int f8182u;

        /* renamed from: v */
        private final ValueAnimator f8183v;

        /* renamed from: w */
        final int f8184w;

        /* renamed from: x */
        boolean f8185x;

        /* renamed from: y */
        float f8186y;

        /* renamed from: z */
        float f8187z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.l$g$a */
        /* loaded from: classes2.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.m10606c(valueAnimator.getAnimatedFraction());
            }
        }

        g(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f8182u = i12;
            this.f8184w = i11;
            this.f8181t = abstractC1876c0;
            this.f8177p = f11;
            this.f8178q = f12;
            this.f8179r = f13;
            this.f8180s = f14;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8183v = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(abstractC1876c0.f7784p);
            ofFloat.addListener(this);
            m10606c(0.0f);
        }

        /* renamed from: a */
        public void m10604a() {
            this.f8183v.cancel();
        }

        /* renamed from: b */
        public void m10605b(long j11) {
            this.f8183v.setDuration(j11);
        }

        /* renamed from: c */
        public void m10606c(float f11) {
            this.f8176C = f11;
        }

        /* renamed from: d */
        public void m10607d() {
            this.f8181t.m9952c0(false);
            this.f8183v.start();
        }

        /* renamed from: e */
        public void m10608e() {
            float f11 = this.f8177p;
            float f12 = this.f8179r;
            if (f11 == f12) {
                this.f8186y = this.f8181t.f7784p.getTranslationX();
            } else {
                this.f8186y = f11 + (this.f8176C * (f12 - f11));
            }
            float f13 = this.f8178q;
            float f14 = this.f8180s;
            if (f13 == f14) {
                this.f8187z = this.f8181t.f7784p.getTranslationY();
            } else {
                this.f8187z = f13 + (this.f8176C * (f14 - f13));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m10606c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f8175B) {
                this.f8181t.m9952c0(true);
            }
            this.f8175B = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.l$h */
    /* loaded from: classes2.dex */
    public interface h {
        /* renamed from: g */
        void mo9749g(View view, View view2, int i11, int i12);
    }

    public C1919l(e eVar) {
        this.f8147m = eVar;
    }

    /* renamed from: C */
    private void m10548C() {
        VelocityTracker velocityTracker = this.f8154t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8154t = null;
        }
    }

    /* renamed from: G */
    private void m10549G() {
        this.f8151q = ViewConfiguration.get(this.f8152r.getContext()).getScaledTouchSlop();
        this.f8152r.m9816A(this);
        this.f8152r.m9825D(this.f8132B);
        this.f8152r.m9822C(this);
        m10550I();
    }

    /* renamed from: I */
    private void m10550I() {
        this.f8131A = new f();
        this.f8160z = new C1598s(this.f8152r.getContext(), this.f8131A);
    }

    /* renamed from: J */
    private void m10551J() {
        f fVar = this.f8131A;
        if (fVar != null) {
            fVar.m10603a();
            this.f8131A = null;
        }
        if (this.f8160z != null) {
            this.f8160z = null;
        }
    }

    /* renamed from: K */
    private int m10552K(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (this.f8148n == 2) {
            return 0;
        }
        int mo10589k = this.f8147m.mo10589k(this.f8152r, abstractC1876c0);
        int m10584d = (this.f8147m.m10584d(mo10589k, AbstractC1579n0.m7812G(this.f8152r)) & 65280) >> 8;
        if (m10584d == 0) {
            return 0;
        }
        int i11 = (mo10589k & 65280) >> 8;
        if (Math.abs(this.f8142h) > Math.abs(this.f8143i)) {
            int m10554n = m10554n(abstractC1876c0, m10584d);
            if (m10554n > 0) {
                if ((i11 & m10554n) == 0) {
                    return e.m10575e(m10554n, AbstractC1579n0.m7812G(this.f8152r));
                }
                return m10554n;
            }
            int m10555p = m10555p(abstractC1876c0, m10584d);
            if (m10555p > 0) {
                return m10555p;
            }
        } else {
            int m10555p2 = m10555p(abstractC1876c0, m10584d);
            if (m10555p2 > 0) {
                return m10555p2;
            }
            int m10554n2 = m10554n(abstractC1876c0, m10584d);
            if (m10554n2 > 0) {
                if ((i11 & m10554n2) == 0) {
                    return e.m10575e(m10554n2, AbstractC1579n0.m7812G(this.f8152r));
                }
                return m10554n2;
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m10553l() {
    }

    /* renamed from: n */
    private int m10554n(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        int i12;
        if ((i11 & 12) != 0) {
            int i13 = 4;
            if (this.f8142h > 0.0f) {
                i12 = 8;
            } else {
                i12 = 4;
            }
            VelocityTracker velocityTracker = this.f8154t;
            if (velocityTracker != null && this.f8146l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f8147m.m10592n(this.f8141g));
                float xVelocity = this.f8154t.getXVelocity(this.f8146l);
                float yVelocity = this.f8154t.getYVelocity(this.f8146l);
                if (xVelocity > 0.0f) {
                    i13 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i13 & i11) != 0 && i12 == i13 && abs >= this.f8147m.m10590l(this.f8140f) && abs > Math.abs(yVelocity)) {
                    return i13;
                }
            }
            float width = this.f8152r.getWidth() * this.f8147m.m10591m(abstractC1876c0);
            if ((i11 & i12) != 0 && Math.abs(this.f8142h) > width) {
                return i12;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: p */
    private int m10555p(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        int i12;
        if ((i11 & 3) != 0) {
            int i13 = 1;
            if (this.f8143i > 0.0f) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            VelocityTracker velocityTracker = this.f8154t;
            if (velocityTracker != null && this.f8146l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f8147m.m10592n(this.f8141g));
                float xVelocity = this.f8154t.getXVelocity(this.f8146l);
                float yVelocity = this.f8154t.getYVelocity(this.f8146l);
                if (yVelocity > 0.0f) {
                    i13 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i13 & i11) != 0 && i13 == i12 && abs >= this.f8147m.m10590l(this.f8140f) && abs > Math.abs(xVelocity)) {
                    return i13;
                }
            }
            float height = this.f8152r.getHeight() * this.f8147m.m10591m(abstractC1876c0);
            if ((i11 & i12) != 0 && Math.abs(this.f8143i) > height) {
                return i12;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: q */
    private void m10556q() {
        this.f8152r.m9907x1(this);
        this.f8152r.m9818A1(this.f8132B);
        this.f8152r.m9911z1(this);
        for (int size = this.f8150p.size() - 1; size >= 0; size--) {
            this.f8147m.mo10583c(this.f8152r, ((g) this.f8150p.get(0)).f8181t);
        }
        this.f8150p.clear();
        this.f8158x = null;
        this.f8159y = -1;
        m10548C();
        m10551J();
    }

    /* renamed from: u */
    private List m10557u(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        RecyclerView.AbstractC1876c0 abstractC1876c02 = abstractC1876c0;
        List list = this.f8155u;
        if (list == null) {
            this.f8155u = new ArrayList();
            this.f8156v = new ArrayList();
        } else {
            list.clear();
            this.f8156v.clear();
        }
        int m10587h = this.f8147m.m10587h();
        int round = Math.round(this.f8144j + this.f8142h) - m10587h;
        int round2 = Math.round(this.f8145k + this.f8143i) - m10587h;
        int i11 = m10587h * 2;
        int width = abstractC1876c02.f7784p.getWidth() + round + i11;
        int height = abstractC1876c02.f7784p.getHeight() + round2 + i11;
        int i12 = (round + width) / 2;
        int i13 = (round2 + height) / 2;
        RecyclerView.AbstractC1888o layoutManager = this.f8152r.getLayoutManager();
        int m10110a = layoutManager.m10110a();
        int i14 = 0;
        while (i14 < m10110a) {
            View m10105V = layoutManager.m10105V(i14);
            if (m10105V != abstractC1876c02.f7784p && m10105V.getBottom() >= round2 && m10105V.getTop() <= height && m10105V.getRight() >= round && m10105V.getLeft() <= width) {
                RecyclerView.AbstractC1876c0 m9823C0 = this.f8152r.m9823C0(m10105V);
                if (this.f8147m.m10581a(this.f8152r, this.f8137c, m9823C0)) {
                    int abs = Math.abs(i12 - ((m10105V.getLeft() + m10105V.getRight()) / 2));
                    int abs2 = Math.abs(i13 - ((m10105V.getTop() + m10105V.getBottom()) / 2));
                    int i15 = (abs * abs) + (abs2 * abs2);
                    int size = this.f8155u.size();
                    int i16 = 0;
                    for (int i17 = 0; i17 < size && i15 > ((Integer) this.f8156v.get(i17)).intValue(); i17++) {
                        i16++;
                    }
                    this.f8155u.add(i16, m9823C0);
                    this.f8156v.add(i16, Integer.valueOf(i15));
                }
            }
            i14++;
            abstractC1876c02 = abstractC1876c0;
        }
        return this.f8155u;
    }

    /* renamed from: v */
    private RecyclerView.AbstractC1876c0 m10558v(MotionEvent motionEvent) {
        View m10572t;
        RecyclerView.AbstractC1888o layoutManager = this.f8152r.getLayoutManager();
        int i11 = this.f8146l;
        if (i11 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        float x11 = motionEvent.getX(findPointerIndex) - this.f8138d;
        float y11 = motionEvent.getY(findPointerIndex) - this.f8139e;
        float abs = Math.abs(x11);
        float abs2 = Math.abs(y11);
        int i12 = this.f8151q;
        if (abs < i12 && abs2 < i12) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo9757x()) {
            return null;
        }
        if ((abs2 > abs && layoutManager.mo9758y()) || (m10572t = m10572t(motionEvent)) == null) {
            return null;
        }
        return this.f8152r.m9823C0(m10572t);
    }

    /* renamed from: w */
    private void m10559w(float[] fArr) {
        if ((this.f8149o & 12) != 0) {
            fArr[0] = (this.f8144j + this.f8142h) - this.f8137c.f7784p.getLeft();
        } else {
            fArr[0] = this.f8137c.f7784p.getTranslationX();
        }
        if ((this.f8149o & 3) != 0) {
            fArr[1] = (this.f8145k + this.f8143i) - this.f8137c.f7784p.getTop();
        } else {
            fArr[1] = this.f8137c.f7784p.getTranslationY();
        }
    }

    /* renamed from: y */
    private static boolean m10560y(View view, float f11, float f12, float f13, float f14) {
        if (f11 >= f13 && f11 <= f13 + view.getWidth() && f12 >= f14 && f12 <= f14 + view.getHeight()) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    void m10561A() {
        VelocityTracker velocityTracker = this.f8154t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f8154t = VelocityTracker.obtain();
    }

    /* renamed from: B */
    void m10562B(g gVar, int i11) {
        this.f8152r.post(new d(gVar, i11));
    }

    /* renamed from: D */
    void m10563D(View view) {
        if (view == this.f8158x) {
            this.f8158x = null;
            if (this.f8157w != null) {
                this.f8152r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:            if (r1 > 0) goto L90;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    boolean m10564E() {
        long j11;
        int i11;
        int i12;
        int i13;
        int width;
        if (this.f8137c == null) {
            this.f8134D = Long.MIN_VALUE;
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = this.f8134D;
        if (j12 == Long.MIN_VALUE) {
            j11 = 0;
        } else {
            j11 = currentTimeMillis - j12;
        }
        RecyclerView.AbstractC1888o layoutManager = this.f8152r.getLayoutManager();
        if (this.f8133C == null) {
            this.f8133C = new Rect();
        }
        layoutManager.m10159w(this.f8137c.f7784p, this.f8133C);
        if (layoutManager.mo9757x()) {
            int i14 = (int) (this.f8144j + this.f8142h);
            int paddingLeft = (i14 - this.f8133C.left) - this.f8152r.getPaddingLeft();
            float f11 = this.f8142h;
            if (f11 < 0.0f && paddingLeft < 0) {
                i11 = paddingLeft;
            } else if (f11 > 0.0f && (width = ((i14 + this.f8137c.f7784p.getWidth()) + this.f8133C.right) - (this.f8152r.getWidth() - this.f8152r.getPaddingRight())) > 0) {
                i11 = width;
            }
            if (layoutManager.mo9758y()) {
                int i15 = (int) (this.f8145k + this.f8143i);
                int paddingTop = (i15 - this.f8133C.top) - this.f8152r.getPaddingTop();
                float f12 = this.f8143i;
                if (f12 < 0.0f && paddingTop < 0) {
                    i12 = paddingTop;
                } else if (f12 > 0.0f) {
                    i12 = ((i15 + this.f8137c.f7784p.getHeight()) + this.f8133C.bottom) - (this.f8152r.getHeight() - this.f8152r.getPaddingBottom());
                }
                if (i11 != 0) {
                    i11 = this.f8147m.m10594p(this.f8152r, this.f8137c.f7784p.getWidth(), i11, this.f8152r.getWidth(), j11);
                }
                int i16 = i11;
                if (i12 != 0) {
                    i13 = i16;
                    i12 = this.f8147m.m10594p(this.f8152r, this.f8137c.f7784p.getHeight(), i12, this.f8152r.getHeight(), j11);
                } else {
                    i13 = i16;
                }
                if (i13 != 0 && i12 == 0) {
                    this.f8134D = Long.MIN_VALUE;
                    return false;
                }
                if (this.f8134D == Long.MIN_VALUE) {
                    this.f8134D = currentTimeMillis;
                }
                this.f8152r.scrollBy(i13, i12);
                return true;
            }
            i12 = 0;
            if (i11 != 0) {
            }
            int i162 = i11;
            if (i12 != 0) {
            }
            if (i13 != 0) {
            }
            if (this.f8134D == Long.MIN_VALUE) {
            }
            this.f8152r.scrollBy(i13, i12);
            return true;
        }
        i11 = 0;
        if (layoutManager.mo9758y()) {
        }
        i12 = 0;
        if (i11 != 0) {
        }
        int i1622 = i11;
        if (i12 != 0) {
        }
        if (i13 != 0) {
        }
        if (this.f8134D == Long.MIN_VALUE) {
        }
        this.f8152r.scrollBy(i13, i12);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m10565F(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        boolean z11;
        ViewParent parent;
        boolean z12;
        int m10552K;
        float signum;
        float f11;
        int i12;
        if (abstractC1876c0 == this.f8137c && i11 == this.f8148n) {
            return;
        }
        this.f8134D = Long.MIN_VALUE;
        int i13 = this.f8148n;
        m10570r(abstractC1876c0, true);
        this.f8148n = i11;
        if (i11 == 2) {
            if (abstractC1876c0 != null) {
                this.f8158x = abstractC1876c0.f7784p;
                m10553l();
            } else {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
        }
        int i14 = (1 << ((i11 * 8) + 8)) - 1;
        RecyclerView.AbstractC1876c0 abstractC1876c02 = this.f8137c;
        if (abstractC1876c02 != null) {
            if (abstractC1876c02.f7784p.getParent() != null) {
                if (i13 == 2) {
                    m10552K = 0;
                } else {
                    m10552K = m10552K(abstractC1876c02);
                }
                m10548C();
                if (m10552K != 1 && m10552K != 2) {
                    if (m10552K != 4 && m10552K != 8 && m10552K != 16 && m10552K != 32) {
                        f11 = 0.0f;
                    } else {
                        f11 = Math.signum(this.f8142h) * this.f8152r.getWidth();
                    }
                    signum = 0.0f;
                } else {
                    signum = Math.signum(this.f8143i) * this.f8152r.getHeight();
                    f11 = 0.0f;
                }
                if (i13 == 2) {
                    i12 = 8;
                } else if (m10552K > 0) {
                    i12 = 2;
                } else {
                    i12 = 4;
                }
                m10559w(this.f8136b);
                float[] fArr = this.f8136b;
                float f12 = fArr[0];
                float f13 = fArr[1];
                c cVar = new c(abstractC1876c02, i12, i13, f12, f13, f11, signum, m10552K, abstractC1876c02);
                cVar.m10605b(this.f8147m.m10586g(this.f8152r, i12, f11 - f12, signum - f13));
                this.f8150p.add(cVar);
                cVar.m10607d();
                z11 = true;
            } else {
                m10563D(abstractC1876c02.f7784p);
                this.f8147m.mo10583c(this.f8152r, abstractC1876c02);
                z11 = false;
            }
            this.f8137c = null;
        } else {
            z11 = false;
        }
        if (abstractC1876c0 != null) {
            this.f8149o = (this.f8147m.m10585f(this.f8152r, abstractC1876c0) & i14) >> (this.f8148n * 8);
            this.f8144j = abstractC1876c0.f7784p.getLeft();
            this.f8145k = abstractC1876c0.f7784p.getTop();
            this.f8137c = abstractC1876c0;
            if (i11 == 2) {
                abstractC1876c0.f7784p.performHapticFeedback(0);
                parent = this.f8152r.getParent();
                if (parent != null) {
                    if (this.f8137c != null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    parent.requestDisallowInterceptTouchEvent(z12);
                }
                if (!z11) {
                    this.f8152r.getLayoutManager().m10154s1();
                }
                this.f8147m.mo10579A(this.f8137c, this.f8148n);
                this.f8152r.invalidate();
            }
        }
        parent = this.f8152r.getParent();
        if (parent != null) {
        }
        if (!z11) {
        }
        this.f8147m.mo10579A(this.f8137c, this.f8148n);
        this.f8152r.invalidate();
    }

    /* renamed from: H */
    public void m10566H(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (!this.f8147m.m10593o(this.f8152r, abstractC1876c0) || abstractC1876c0.f7784p.getParent() != this.f8152r) {
            return;
        }
        m10561A();
        this.f8143i = 0.0f;
        this.f8142h = 0.0f;
        m10565F(abstractC1876c0, 2);
    }

    /* renamed from: L */
    void m10567L(MotionEvent motionEvent, int i11, int i12) {
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f8138d;
        this.f8142h = f11;
        this.f8143i = y11 - this.f8139e;
        if ((i11 & 4) == 0) {
            this.f8142h = Math.max(0.0f, f11);
        }
        if ((i11 & 8) == 0) {
            this.f8142h = Math.min(0.0f, this.f8142h);
        }
        if ((i11 & 1) == 0) {
            this.f8143i = Math.max(0.0f, this.f8143i);
        }
        if ((i11 & 2) == 0) {
            this.f8143i = Math.min(0.0f, this.f8143i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
    /* renamed from: b */
    public void mo10173b(View view) {
        m10563D(view);
        RecyclerView.AbstractC1876c0 m9823C0 = this.f8152r.m9823C0(view);
        if (m9823C0 == null) {
            return;
        }
        RecyclerView.AbstractC1876c0 abstractC1876c0 = this.f8137c;
        if (abstractC1876c0 != null && m9823C0 == abstractC1876c0) {
            m10565F(null, 0);
            return;
        }
        m10570r(m9823C0, false);
        if (this.f8135a.remove(m9823C0.f7784p)) {
            this.f8147m.mo10583c(this.f8152r, m9823C0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1889p
    /* renamed from: d */
    public void mo10174d(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        rect.setEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: i */
    public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        float f11;
        float f12;
        this.f8159y = -1;
        if (this.f8137c != null) {
            m10559w(this.f8136b);
            float[] fArr = this.f8136b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f8147m.m10599w(canvas, recyclerView, this.f8137c, this.f8150p, this.f8148n, f11, f12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        float f11;
        float f12;
        if (this.f8137c != null) {
            m10559w(this.f8136b);
            float[] fArr = this.f8136b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f8147m.m10600x(canvas, recyclerView, this.f8137c, this.f8150p, this.f8148n, f11, f12);
    }

    /* renamed from: m */
    public void m10568m(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8152r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m10556q();
        }
        this.f8152r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f8140f = resources.getDimension(AbstractC31149b.item_touch_helper_swipe_escape_velocity);
            this.f8141g = resources.getDimension(AbstractC31149b.item_touch_helper_swipe_escape_max_velocity);
            m10549G();
        }
    }

    /* renamed from: o */
    void m10569o(int i11, MotionEvent motionEvent, int i12) {
        RecyclerView.AbstractC1876c0 m10558v;
        int m10585f;
        if (this.f8137c != null || i11 != 2 || this.f8148n == 2 || !this.f8147m.mo10595q() || this.f8152r.getScrollState() == 1 || (m10558v = m10558v(motionEvent)) == null || (m10585f = (this.f8147m.m10585f(this.f8152r, m10558v) & 65280) >> 8) == 0) {
            return;
        }
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f8138d;
        float f12 = y11 - this.f8139e;
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        int i13 = this.f8151q;
        if (abs < i13 && abs2 < i13) {
            return;
        }
        if (abs > abs2) {
            if (f11 < 0.0f && (m10585f & 4) == 0) {
                return;
            }
            if (f11 > 0.0f && (m10585f & 8) == 0) {
                return;
            }
        } else {
            if (f12 < 0.0f && (m10585f & 1) == 0) {
                return;
            }
            if (f12 > 0.0f && (m10585f & 2) == 0) {
                return;
            }
        }
        this.f8143i = 0.0f;
        this.f8142h = 0.0f;
        this.f8146l = motionEvent.getPointerId(0);
        m10565F(m10558v, 1);
    }

    /* renamed from: r */
    void m10570r(RecyclerView.AbstractC1876c0 abstractC1876c0, boolean z11) {
        for (int size = this.f8150p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f8150p.get(size);
            if (gVar.f8181t == abstractC1876c0) {
                gVar.f8174A |= z11;
                if (!gVar.f8175B) {
                    gVar.m10604a();
                }
                this.f8150p.remove(size);
                return;
            }
        }
    }

    /* renamed from: s */
    g m10571s(MotionEvent motionEvent) {
        if (this.f8150p.isEmpty()) {
            return null;
        }
        View m10572t = m10572t(motionEvent);
        for (int size = this.f8150p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f8150p.get(size);
            if (gVar.f8181t.f7784p == m10572t) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: t */
    View m10572t(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        RecyclerView.AbstractC1876c0 abstractC1876c0 = this.f8137c;
        if (abstractC1876c0 != null) {
            View view = abstractC1876c0.f7784p;
            if (m10560y(view, x11, y11, this.f8144j + this.f8142h, this.f8145k + this.f8143i)) {
                return view;
            }
        }
        for (int size = this.f8150p.size() - 1; size >= 0; size--) {
            g gVar = (g) this.f8150p.get(size);
            View view2 = gVar.f8181t.f7784p;
            if (m10560y(view2, x11, y11, gVar.f8186y, gVar.f8187z)) {
                return view2;
            }
        }
        return this.f8152r.m9893m0(x11, y11);
    }

    /* renamed from: x */
    boolean m10573x() {
        int size = this.f8150p.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!((g) this.f8150p.get(i11)).f8175B) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    void m10574z(RecyclerView.AbstractC1876c0 abstractC1876c0) {
        if (this.f8152r.isLayoutRequested() || this.f8148n != 2) {
            return;
        }
        float m10588j = this.f8147m.m10588j(abstractC1876c0);
        int i11 = (int) (this.f8144j + this.f8142h);
        int i12 = (int) (this.f8145k + this.f8143i);
        if (Math.abs(i12 - abstractC1876c0.f7784p.getTop()) < abstractC1876c0.f7784p.getHeight() * m10588j && Math.abs(i11 - abstractC1876c0.f7784p.getLeft()) < abstractC1876c0.f7784p.getWidth() * m10588j) {
            return;
        }
        List m10557u = m10557u(abstractC1876c0);
        if (m10557u.size() == 0) {
            return;
        }
        RecyclerView.AbstractC1876c0 m10582b = this.f8147m.m10582b(abstractC1876c0, m10557u, i11, i12);
        if (m10582b == null) {
            this.f8155u.clear();
            this.f8156v.clear();
            return;
        }
        int m9929A = m10582b.m9929A();
        int m9929A2 = abstractC1876c0.m9929A();
        if (this.f8147m.mo10601y(this.f8152r, abstractC1876c0, m10582b)) {
            this.f8147m.mo10602z(this.f8152r, abstractC1876c0, m9929A2, m10582b, m9929A, i11, i12);
        }
    }
}
