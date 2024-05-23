package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import p252j1.AbstractC20900a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: d */
    private Runnable f34808d;

    /* renamed from: e */
    OverScroller f34809e;

    /* renamed from: f */
    private boolean f34810f;

    /* renamed from: g */
    private int f34811g;

    /* renamed from: h */
    private int f34812h;

    /* renamed from: i */
    private int f34813i;

    /* renamed from: j */
    private VelocityTracker f34814j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    /* loaded from: classes3.dex */
    public class RunnableC6226a implements Runnable {

        /* renamed from: p */
        private final CoordinatorLayout f34815p;

        /* renamed from: q */
        private final View f34816q;

        RunnableC6226a(CoordinatorLayout coordinatorLayout, View view) {
            this.f34815p = coordinatorLayout;
            this.f34816q = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f34816q != null && (overScroller = HeaderBehavior.this.f34809e) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.m31629P(this.f34815p, this.f34816q, headerBehavior.f34809e.getCurrY());
                    AbstractC1579n0.m7900s0(this.f34816q, this);
                    return;
                }
                HeaderBehavior.this.mo31571N(this.f34815p, this.f34816q);
            }
        }
    }

    public HeaderBehavior() {
        this.f34811g = -1;
        this.f34813i = -1;
    }

    /* renamed from: I */
    private void m31626I() {
        if (this.f34814j == null) {
            this.f34814j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo6542D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z11;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        if (motionEvent.getActionIndex() == 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        this.f34811g = motionEvent.getPointerId(i11);
                        this.f34812h = (int) (motionEvent.getY(i11) + 0.5f);
                    }
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.f34811g);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y11 = (int) motionEvent.getY(findPointerIndex);
                int i12 = this.f34812h - y11;
                this.f34812h = y11;
                m31628O(coordinatorLayout, view, i12, mo31568K(view), 0);
            }
            z11 = false;
            velocityTracker2 = this.f34814j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (!this.f34810f && !z11) {
                return false;
            }
        }
        VelocityTracker velocityTracker3 = this.f34814j;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.f34814j.computeCurrentVelocity(1000);
            m31627J(coordinatorLayout, view, -mo31569L(view), 0, this.f34814j.getYVelocity(this.f34811g));
            z11 = true;
            this.f34810f = false;
            this.f34811g = -1;
            velocityTracker = this.f34814j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f34814j = null;
            }
            velocityTracker2 = this.f34814j;
            if (velocityTracker2 != null) {
            }
            return !this.f34810f ? true : true;
        }
        z11 = false;
        this.f34810f = false;
        this.f34811g = -1;
        velocityTracker = this.f34814j;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.f34814j;
        if (velocityTracker2 != null) {
        }
        if (!this.f34810f) {
        }
    }

    /* renamed from: H */
    boolean mo31567H(View view) {
        return false;
    }

    /* renamed from: J */
    final boolean m31627J(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, float f11) {
        Runnable runnable = this.f34808d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f34808d = null;
        }
        if (this.f34809e == null) {
            this.f34809e = new OverScroller(view.getContext());
        }
        this.f34809e.fling(0, mo31589E(), 0, Math.round(f11), 0, 0, i11, i12);
        if (this.f34809e.computeScrollOffset()) {
            RunnableC6226a runnableC6226a = new RunnableC6226a(coordinatorLayout, view);
            this.f34808d = runnableC6226a;
            AbstractC1579n0.m7900s0(view, runnableC6226a);
            return true;
        }
        mo31571N(coordinatorLayout, view);
        return false;
    }

    /* renamed from: K */
    int mo31568K(View view) {
        return -view.getHeight();
    }

    /* renamed from: L */
    int mo31569L(View view) {
        return view.getHeight();
    }

    /* renamed from: M */
    int mo31570M() {
        return mo31589E();
    }

    /* renamed from: N */
    void mo31571N(CoordinatorLayout coordinatorLayout, View view) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final int m31628O(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        return mo31572Q(coordinatorLayout, view, mo31570M() - i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public int m31629P(CoordinatorLayout coordinatorLayout, View view, int i11) {
        return mo31572Q(coordinatorLayout, view, i11, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: Q */
    int mo31572Q(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        int m109345b;
        int mo31589E = mo31589E();
        if (i12 != 0 && mo31589E >= i12 && mo31589E <= i13 && mo31589E != (m109345b = AbstractC20900a.m109345b(i11, i12, i13))) {
            mo31590G(m109345b);
            return mo31589E - m109345b;
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public boolean mo6553k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z11;
        int findPointerIndex;
        if (this.f34813i < 0) {
            this.f34813i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f34810f) {
            int i11 = this.f34811g;
            if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) == -1) {
                return false;
            }
            int y11 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y11 - this.f34812h) > this.f34813i) {
                this.f34812h = y11;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f34811g = -1;
            int x11 = (int) motionEvent.getX();
            int y12 = (int) motionEvent.getY();
            if (mo31567H(view) && coordinatorLayout.m6521H(view, x11, y12)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f34810f = z11;
            if (z11) {
                this.f34812h = y12;
                this.f34811g = motionEvent.getPointerId(0);
                m31626I();
                OverScroller overScroller = this.f34809e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f34809e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f34814j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34811g = -1;
        this.f34813i = -1;
    }
}
