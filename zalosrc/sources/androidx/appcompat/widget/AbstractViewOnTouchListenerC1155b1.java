package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p336m0.InterfaceC22701e;

/* renamed from: androidx.appcompat.widget.b1 */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC1155b1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    private final float f4603p;

    /* renamed from: q */
    private final int f4604q;

    /* renamed from: r */
    private final int f4605r;

    /* renamed from: s */
    final View f4606s;

    /* renamed from: t */
    private Runnable f4607t;

    /* renamed from: u */
    private Runnable f4608u;

    /* renamed from: v */
    private boolean f4609v;

    /* renamed from: w */
    private int f4610w;

    /* renamed from: x */
    private final int[] f4611x = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.b1$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC1155b1.this.f4606s.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.b1$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC1155b1.this.m5497e();
        }
    }

    public AbstractViewOnTouchListenerC1155b1(View view) {
        this.f4606s = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f4603p = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f4604q = tapTimeout;
        this.f4605r = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m5491a() {
        Runnable runnable = this.f4608u;
        if (runnable != null) {
            this.f4606s.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f4607t;
        if (runnable2 != null) {
            this.f4606s.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m5492f(MotionEvent motionEvent) {
        C1228z0 c1228z0;
        boolean z11;
        View view = this.f4606s;
        InterfaceC22701e mo4976b = mo4976b();
        if (mo4976b == null || !mo4976b.mo5012b() || (c1228z0 = (C1228z0) mo4976b.mo5018p()) == null || !c1228z0.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m5495i(view, obtainNoHistory);
        m5496j(c1228z0, obtainNoHistory);
        boolean mo5327e = c1228z0.mo5327e(obtainNoHistory, this.f4610w);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!mo5327e || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:            if (r1 != 3) goto L28;     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m5493g(MotionEvent motionEvent) {
        View view = this.f4606s;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4610w);
                    if (findPointerIndex >= 0 && !m5494h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f4603p)) {
                        m5491a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            m5491a();
        } else {
            this.f4610w = motionEvent.getPointerId(0);
            if (this.f4607t == null) {
                this.f4607t = new a();
            }
            view.postDelayed(this.f4607t, this.f4604q);
            if (this.f4608u == null) {
                this.f4608u = new b();
            }
            view.postDelayed(this.f4608u, this.f4605r);
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m5494h(View view, float f11, float f12, float f13) {
        float f14 = -f13;
        if (f11 >= f14 && f12 >= f14 && f11 < (view.getRight() - view.getLeft()) + f13 && f12 < (view.getBottom() - view.getTop()) + f13) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private boolean m5495i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f4611x);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m5496j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f4611x);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    /* renamed from: b */
    public abstract InterfaceC22701e mo4976b();

    /* renamed from: c */
    protected abstract boolean mo4977c();

    /* renamed from: d */
    protected boolean mo5210d() {
        InterfaceC22701e mo4976b = mo4976b();
        if (mo4976b != null && mo4976b.mo5012b()) {
            mo4976b.dismiss();
            return true;
        }
        return true;
    }

    /* renamed from: e */
    void m5497e() {
        m5491a();
        View view = this.f4606s;
        if (!view.isEnabled() || view.isLongClickable() || !mo4977c()) {
            return;
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        view.onTouchEvent(obtain);
        obtain.recycle();
        this.f4609v = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f4609v;
        if (z12) {
            if (!m5492f(motionEvent) && mo5210d()) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            if (m5493g(motionEvent) && mo4977c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f4606s.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f4609v = z11;
        if (z11 || z12) {
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f4609v = false;
        this.f4610w = -1;
        Runnable runnable = this.f4607t;
        if (runnable != null) {
            this.f4606s.removeCallbacks(runnable);
        }
    }
}
