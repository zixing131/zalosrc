package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1587p0;

/* renamed from: androidx.appcompat.widget.x1 */
/* loaded from: classes2.dex */
class ViewOnLongClickListenerC1223x1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: y */
    private static ViewOnLongClickListenerC1223x1 f4747y;

    /* renamed from: z */
    private static ViewOnLongClickListenerC1223x1 f4748z;

    /* renamed from: p */
    private final View f4749p;

    /* renamed from: q */
    private final CharSequence f4750q;

    /* renamed from: r */
    private final int f4751r;

    /* renamed from: s */
    private final Runnable f4752s = new a();

    /* renamed from: t */
    private final Runnable f4753t = new b();

    /* renamed from: u */
    private int f4754u;

    /* renamed from: v */
    private int f4755v;

    /* renamed from: w */
    private C1226y1 f4756w;

    /* renamed from: x */
    private boolean f4757x;

    /* renamed from: androidx.appcompat.widget.x1$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC1223x1.this.m5767g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.x1$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerC1223x1.this.m5766c();
        }
    }

    private ViewOnLongClickListenerC1223x1(View view, CharSequence charSequence) {
        this.f4749p = view;
        this.f4750q = charSequence;
        this.f4751r = AbstractC1587p0.m8127c(ViewConfiguration.get(view.getContext()));
        m5761b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m5760a() {
        this.f4749p.removeCallbacks(this.f4752s);
    }

    /* renamed from: b */
    private void m5761b() {
        this.f4754u = Integer.MAX_VALUE;
        this.f4755v = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m5762d() {
        this.f4749p.postDelayed(this.f4752s, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m5763e(ViewOnLongClickListenerC1223x1 viewOnLongClickListenerC1223x1) {
        ViewOnLongClickListenerC1223x1 viewOnLongClickListenerC1223x12 = f4747y;
        if (viewOnLongClickListenerC1223x12 != null) {
            viewOnLongClickListenerC1223x12.m5760a();
        }
        f4747y = viewOnLongClickListenerC1223x1;
        if (viewOnLongClickListenerC1223x1 != null) {
            viewOnLongClickListenerC1223x1.m5762d();
        }
    }

    /* renamed from: f */
    public static void m5764f(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC1223x1 viewOnLongClickListenerC1223x1 = f4747y;
        if (viewOnLongClickListenerC1223x1 != null && viewOnLongClickListenerC1223x1.f4749p == view) {
            m5763e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC1223x1 viewOnLongClickListenerC1223x12 = f4748z;
            if (viewOnLongClickListenerC1223x12 != null && viewOnLongClickListenerC1223x12.f4749p == view) {
                viewOnLongClickListenerC1223x12.m5766c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC1223x1(view, charSequence);
    }

    /* renamed from: h */
    private boolean m5765h(MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (Math.abs(x11 - this.f4754u) <= this.f4751r && Math.abs(y11 - this.f4755v) <= this.f4751r) {
            return false;
        }
        this.f4754u = x11;
        this.f4755v = y11;
        return true;
    }

    /* renamed from: c */
    void m5766c() {
        if (f4748z == this) {
            f4748z = null;
            C1226y1 c1226y1 = this.f4756w;
            if (c1226y1 != null) {
                c1226y1.m5776c();
                this.f4756w = null;
                m5761b();
                this.f4749p.removeOnAttachStateChangeListener(this);
            }
        }
        if (f4747y == this) {
            m5763e(null);
        }
        this.f4749p.removeCallbacks(this.f4753t);
    }

    /* renamed from: g */
    void m5767g(boolean z11) {
        long longPressTimeout;
        long j11;
        long j12;
        if (!AbstractC1579n0.m7862d0(this.f4749p)) {
            return;
        }
        m5763e(null);
        ViewOnLongClickListenerC1223x1 viewOnLongClickListenerC1223x1 = f4748z;
        if (viewOnLongClickListenerC1223x1 != null) {
            viewOnLongClickListenerC1223x1.m5766c();
        }
        f4748z = this;
        this.f4757x = z11;
        C1226y1 c1226y1 = new C1226y1(this.f4749p.getContext());
        this.f4756w = c1226y1;
        c1226y1.m5778e(this.f4749p, this.f4754u, this.f4755v, this.f4757x, this.f4750q);
        this.f4749p.addOnAttachStateChangeListener(this);
        if (this.f4757x) {
            j12 = 2500;
        } else {
            if ((AbstractC1579n0.m7842V(this.f4749p) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j11 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j11 = 15000;
            }
            j12 = j11 - longPressTimeout;
        }
        this.f4749p.removeCallbacks(this.f4753t);
        this.f4749p.postDelayed(this.f4753t, j12);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f4756w != null && this.f4757x) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f4749p.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m5761b();
                m5766c();
            }
        } else if (this.f4749p.isEnabled() && this.f4756w == null && m5765h(motionEvent)) {
            m5763e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f4754u = view.getWidth() / 2;
        this.f4755v = view.getHeight() / 2;
        m5767g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m5766c();
    }
}
