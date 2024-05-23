package zm.voip.widgets;

import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kg.AbstractC21705b;
import kg.AbstractC21717n;
import kg.C21709f;
import kg.C21715l;
import kg.InterfaceC21713j;
import kg.InterfaceC21716m;
import me0.AbstractC23136l9;
import p266jg.AbstractC21245c;
import zm.voip.service.C32369y;
import zm.voip.widgets.PhysicCallView;

/* loaded from: classes7.dex */
public abstract class PhysicCallView extends FrameLayout implements InterfaceC21713j, InterfaceC21716m {

    /* renamed from: L */
    public static int f150046L;

    /* renamed from: M */
    public static int f150047M;

    /* renamed from: A */
    private boolean f150048A;

    /* renamed from: B */
    public boolean f150049B;

    /* renamed from: C */
    private float f150050C;

    /* renamed from: D */
    private float f150051D;

    /* renamed from: E */
    private double f150052E;

    /* renamed from: F */
    private double f150053F;

    /* renamed from: G */
    private int f150054G;

    /* renamed from: H */
    public InterfaceC32496b f150055H;

    /* renamed from: I */
    final Handler f150056I;

    /* renamed from: J */
    Runnable f150057J;

    /* renamed from: K */
    public InterfaceC32495a f150058K;

    /* renamed from: p */
    public final int f150059p;

    /* renamed from: q */
    public RectF f150060q;

    /* renamed from: r */
    private VelocityTracker f150061r;

    /* renamed from: s */
    public C21715l f150062s;

    /* renamed from: t */
    public InterfaceC21713j f150063t;

    /* renamed from: u */
    public InterfaceC21713j f150064u;

    /* renamed from: v */
    public C21709f f150065v;

    /* renamed from: w */
    public C21709f f150066w;

    /* renamed from: x */
    private final C32369y f150067x;

    /* renamed from: y */
    private boolean f150068y;

    /* renamed from: z */
    private boolean f150069z;

    /* renamed from: zm.voip.widgets.PhysicCallView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC32495a {
        /* renamed from: a */
        void mo156436a(float f11, float f12);

        /* renamed from: b */
        void mo156437b(float f11);
    }

    /* renamed from: zm.voip.widgets.PhysicCallView$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC32496b {
        /* renamed from: a */
        void mo156438a();

        /* renamed from: b */
        void mo156439b();
    }

    public PhysicCallView(Context context, C32369y c32369y) {
        super(context);
        this.f150059p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f150060q = new RectF();
        this.f150048A = false;
        this.f150049B = false;
        this.f150050C = -1.0f;
        this.f150051D = -1.0f;
        this.f150056I = new Handler();
        this.f150057J = new Runnable() { // from class: ep0.m
            public /* synthetic */ RunnableC18553m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                PhysicCallView.this.m157373l();
            }
        };
        this.f150062s = C21715l.m112062k();
        f150047M = (int) AbstractC23136l9.m118748t(context, 600.0f);
        f150046L = (int) AbstractC23136l9.m118748t(context, 15.0f);
        this.f150067x = c32369y;
        mo157343i();
    }

    /* renamed from: l */
    public /* synthetic */ void m157373l() {
        InterfaceC32496b interfaceC32496b = this.f150055H;
        if (interfaceC32496b != null) {
            this.f150048A = true;
            interfaceC32496b.mo156439b();
        }
    }

    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: b */
    public void mo39828b(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: c */
    public void mo39829c(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21716m
    /* renamed from: d */
    public void mo65888d(AbstractC21705b abstractC21705b) {
    }

    @Override // kg.InterfaceC21713j
    /* renamed from: e */
    public void mo39830e(C21709f c21709f) {
    }

    @Override // kg.InterfaceC21716m
    /* renamed from: f */
    public void mo65889f(AbstractC21705b abstractC21705b) {
    }

    public C21709f getHorizontalSpring() {
        return this.f150065v;
    }

    public C21709f getVerticalSpring() {
        return this.f150066w;
    }

    /* renamed from: h */
    public abstract void mo157342h(int i11, int i12);

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    /* renamed from: i */
    public abstract void mo157343i();

    /* renamed from: j */
    public boolean m157374j() {
        return this.f150069z;
    }

    /* renamed from: k */
    public boolean m157375k() {
        return this.f150068y;
    }

    /* renamed from: m */
    public void m157376m() {
        C21715l c21715l = this.f150062s;
        if (c21715l != null) {
            c21715l.m112025j();
        }
        C21709f c21709f = this.f150065v;
        if (c21709f != null) {
            c21709f.m112041n();
        }
        C21709f c21709f2 = this.f150066w;
        if (c21709f2 != null) {
            c21709f2.m112041n();
        }
        this.f150068y = false;
    }

    /* renamed from: n */
    public void m157377n() {
        if (this.f150068y) {
            return;
        }
        this.f150068y = true;
        C21715l c21715l = this.f150062s;
        if (c21715l != null) {
            c21715l.m112017b(this);
        }
        C21709f c21709f = this.f150065v;
        if (c21709f != null) {
            c21709f.m112030a(this);
        }
        C21709f c21709f2 = this.f150066w;
        if (c21709f2 != null) {
            c21709f2.m112030a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m157377n();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m157376m();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC32496b interfaceC32496b;
        double d11;
        double d12;
        C21709f c21709f = this.f150065v;
        if (c21709f == null && this.f150066w == null) {
            return false;
        }
        C21709f c21709f2 = this.f150066w;
        int action = motionEvent.getAction();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f11 = rawX - this.f150050C;
        float f12 = rawY - this.f150051D;
        motionEvent.offsetLocation(getX(), getY());
        this.f150067x.m156430D();
        if (action == 0) {
            this.f150048A = false;
            this.f150056I.postDelayed(this.f150057J, ViewConfiguration.getLongPressTimeout());
            this.f150054G = motionEvent.getPointerId(0);
            VelocityTracker velocityTracker = this.f150061r;
            if (velocityTracker == null) {
                this.f150061r = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            if (c21709f != null) {
                c21709f.m112048u(AbstractC21245c.f103554a);
                c21709f.m112043p();
                this.f150052E = c21709f.m112033d();
            }
            if (c21709f2 != null) {
                c21709f2.m112048u(AbstractC21245c.f103554a);
                c21709f2.m112043p();
                this.f150053F = c21709f2.m112033d();
            }
            this.f150050C = rawX;
            this.f150051D = rawY;
            this.f150061r.addMovement(motionEvent);
        } else if (action == 2 && this.f150054G == motionEvent.getPointerId(0)) {
            double d13 = f11;
            double d14 = f12;
            if (Math.hypot(d13, d14) > this.f150059p) {
                setDragging(true);
                this.f150056I.removeCallbacks(this.f150057J);
            }
            if (this.f150061r == null) {
                this.f150061r = VelocityTracker.obtain();
            }
            this.f150061r.addMovement(motionEvent);
            if (m157374j()) {
                if (c21709f != null && c21709f.m112036h() != AbstractC21245c.f103556c) {
                    c21709f.m112048u(AbstractC21245c.f103557d);
                    if (this.f150049B) {
                        double d15 = this.f150052E + d13;
                        RectF rectF = this.f150060q;
                        d12 = AbstractC21717n.m112063a(d15, rectF.left, rectF.right);
                    } else {
                        d12 = d13 + this.f150052E;
                    }
                    c21709f.m112044q(d12);
                }
                if (c21709f2 != null && c21709f2.m112036h() != AbstractC21245c.f103556c) {
                    c21709f2.m112048u(AbstractC21245c.f103557d);
                    if (this.f150049B) {
                        double d16 = this.f150053F + d14;
                        RectF rectF2 = this.f150060q;
                        d11 = AbstractC21717n.m112063a(d16, rectF2.top, rectF2.bottom);
                    } else {
                        d11 = this.f150053F + d14;
                    }
                    c21709f2.m112044q(d11);
                }
            }
        } else if (this.f150054G == motionEvent.getPointerId(0) && (action == 1 || action == 3 || action == 6)) {
            this.f150056I.removeCallbacks(this.f150057J);
            if (this.f150061r == null) {
                this.f150061r = VelocityTracker.obtain();
            }
            this.f150061r.computeCurrentVelocity(1000);
            if (!m157374j() && (interfaceC32496b = this.f150055H) != null && !this.f150048A) {
                interfaceC32496b.mo156438a();
            }
            setDragging(false);
            int xVelocity = (int) this.f150061r.getXVelocity();
            int yVelocity = (int) this.f150061r.getYVelocity();
            this.f150061r.recycle();
            this.f150061r = null;
            if (c21709f != null) {
                c21709f.m112048u(AbstractC21245c.f103557d);
            }
            if (c21709f2 != null) {
                c21709f2.m112048u(AbstractC21245c.f103557d);
            }
            mo157342h(xVelocity, yVelocity);
        }
        return true;
    }

    /* renamed from: p */
    public abstract void mo157344p(double d11, double d12);

    /* renamed from: q */
    public void m157378q(float f11, float f12, float f13, float f14) {
        this.f150060q.set(f11, f12, f13, f14);
    }

    /* renamed from: r */
    public void m157379r(int i11, int i12, RectF rectF) {
        float f11;
        float f12;
        float f13;
        int i13 = (int) rectF.left;
        int i14 = (int) rectF.top;
        int i15 = (int) rectF.right;
        int i16 = (int) rectF.bottom;
        RectF rectF2 = this.f150060q;
        float f14 = rectF2.top;
        if (f14 != 0.0f) {
            float f15 = rectF2.bottom;
            if (f15 != 0.0f) {
                float f16 = (i12 - f14) / (f15 - f14);
                float f17 = i11;
                float f18 = rectF2.left;
                if (f17 > f18 + ((rectF2.right - f18) / 2.0f)) {
                    f11 = i15;
                } else {
                    f11 = i13;
                }
                f12 = i14 + ((i16 - i14) * f16);
                f13 = i13;
                if (rectF2.left == f13 || f14 != i14 || rectF2.right != i15 || rectF2.bottom != i16) {
                    rectF2.left = f13;
                    float f19 = i14;
                    rectF2.top = f19;
                    float f21 = i15;
                    rectF2.right = f21;
                    float f22 = i16;
                    rectF2.bottom = f22;
                    m157378q(f13, f19, f21, f22);
                }
                if (f11 == -1.0f && f12 != -1.0f) {
                    mo157344p(f11, f12);
                    return;
                }
            }
        }
        f11 = -1.0f;
        f12 = -1.0f;
        f13 = i13;
        if (rectF2.left == f13) {
        }
        rectF2.left = f13;
        float f192 = i14;
        rectF2.top = f192;
        float f212 = i15;
        rectF2.right = f212;
        float f222 = i16;
        rectF2.bottom = f222;
        m157378q(f13, f192, f212, f222);
        if (f11 == -1.0f) {
        }
    }

    public void setAnimationUpdateListener(InterfaceC32495a interfaceC32495a) {
        this.f150058K = interfaceC32495a;
    }

    public void setDragging(boolean z11) {
        this.f150069z = z11;
    }

    public void setOnClickListener(InterfaceC32496b interfaceC32496b) {
        this.f150055H = interfaceC32496b;
    }
}
