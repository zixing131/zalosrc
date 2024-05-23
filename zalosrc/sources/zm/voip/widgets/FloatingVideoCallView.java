package zm.voip.widgets;

import android.content.Context;
import android.graphics.RectF;
import kg.AbstractC21707d;
import kg.AbstractC21717n;
import kg.C21709f;
import p266jg.AbstractC21245c;
import zm.voip.service.C32369y;
import zm.voip.widgets.PhysicCallView;

/* loaded from: classes7.dex */
public class FloatingVideoCallView extends PhysicCallView {

    /* renamed from: N */
    private boolean f149993N;

    /* renamed from: O */
    private boolean f149994O;

    /* renamed from: P */
    private double f149995P;

    /* renamed from: Q */
    private double f149996Q;

    /* renamed from: zm.voip.widgets.FloatingVideoCallView$a */
    /* loaded from: classes7.dex */
    class C32488a extends AbstractC21707d {
        C32488a() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            PhysicCallView.InterfaceC32495a interfaceC32495a;
            super.mo39827a(c21709f);
            if (FloatingVideoCallView.this.m157375k() && (interfaceC32495a = FloatingVideoCallView.this.f150058K) != null) {
                interfaceC32495a.mo156436a((int) c21709f.m112033d(), (int) FloatingVideoCallView.this.f150066w.m112033d());
                if (!FloatingVideoCallView.this.f149993N && c21709f.m112040m()) {
                    FloatingVideoCallView.this.f149993N = true;
                    FloatingVideoCallView.this.f149995P = c21709f.m112034f();
                }
                if (FloatingVideoCallView.this.f149993N && !c21709f.m112040m() && c21709f.m112034f() == FloatingVideoCallView.this.f149995P) {
                    FloatingVideoCallView.this.f149993N = false;
                    c21709f.m112044q(c21709f.m112034f());
                }
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            FloatingVideoCallView.this.f149993N = false;
        }
    }

    /* renamed from: zm.voip.widgets.FloatingVideoCallView$b */
    /* loaded from: classes7.dex */
    class C32489b extends AbstractC21707d {
        C32489b() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            FloatingVideoCallView floatingVideoCallView;
            PhysicCallView.InterfaceC32495a interfaceC32495a;
            super.mo39827a(c21709f);
            if (FloatingVideoCallView.this.m157375k() && (interfaceC32495a = (floatingVideoCallView = FloatingVideoCallView.this).f150058K) != null) {
                interfaceC32495a.mo156436a((int) floatingVideoCallView.f150065v.m112033d(), (int) c21709f.m112033d());
                if (!FloatingVideoCallView.this.f149994O && c21709f.m112040m()) {
                    FloatingVideoCallView.this.f149994O = true;
                    FloatingVideoCallView.this.f149996Q = c21709f.m112034f();
                }
                if (FloatingVideoCallView.this.f149994O && !c21709f.m112040m() && c21709f.m112034f() == FloatingVideoCallView.this.f149996Q) {
                    FloatingVideoCallView.this.f149994O = false;
                    c21709f.m112044q(c21709f.m112034f());
                }
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            FloatingVideoCallView.this.f149994O = false;
        }
    }

    public FloatingVideoCallView(Context context, C32369y c32369y) {
        super(context, c32369y);
        this.f149993N = false;
        this.f149994O = false;
        this.f149995P = -1.0d;
        this.f149996Q = -1.0d;
    }

    /* renamed from: B */
    public void m157353B(boolean z11, C21709f c21709f, C21709f c21709f2, C21709f c21709f3, int i11) {
        if (!z11 && Math.abs(i11) < PhysicCallView.f150047M) {
            if (c21709f == c21709f2 && c21709f.m112036h() == AbstractC21245c.f103557d) {
                double m112033d = c21709f2.m112033d();
                if (m112033d > this.f150060q.right) {
                    c21709f2.m112048u(AbstractC21245c.f103554a);
                    c21709f2.m112046s(this.f150060q.right);
                    return;
                } else if (m112033d < r7.left) {
                    c21709f2.m112048u(AbstractC21245c.f103554a);
                    c21709f2.m112046s(this.f150060q.left);
                    return;
                } else if (m112033d > r8 / 2.0f) {
                    c21709f2.m112048u(AbstractC21245c.f103554a);
                    c21709f2.m112046s(this.f150060q.right);
                    return;
                } else {
                    c21709f2.m112048u(AbstractC21245c.f103554a);
                    c21709f2.m112046s(this.f150060q.left);
                    return;
                }
            }
            if (c21709f == c21709f3 && c21709f.m112036h() == AbstractC21245c.f103557d) {
                double m112033d2 = c21709f3.m112033d();
                RectF rectF = this.f150060q;
                if (m112033d2 >= rectF.bottom) {
                    c21709f3.m112048u(AbstractC21245c.f103554a);
                    c21709f3.m112046s(this.f150060q.bottom);
                } else if (m112033d2 <= rectF.top) {
                    c21709f3.m112048u(AbstractC21245c.f103554a);
                    c21709f3.m112046s(this.f150060q.top);
                }
            }
        }
    }

    @Override // zm.voip.widgets.PhysicCallView, kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        C21709f c21709f2;
        C21709f c21709f3 = this.f150065v;
        if (c21709f3 != null && (c21709f2 = this.f150066w) != null) {
            if (c21709f != c21709f3 && c21709f != c21709f2) {
                return;
            }
            double m112063a = AbstractC21717n.m112063a(c21709f3.m112038j(), -10000.0d, 10000.0d);
            double m112063a2 = AbstractC21717n.m112063a(c21709f2.m112038j(), -10000.0d, 10000.0d);
            c21709f3.m112049v(m112063a);
            c21709f2.m112049v(m112063a2);
            m157353B(m157374j(), c21709f, c21709f3, c21709f2, (int) Math.hypot(c21709f3.m112038j(), c21709f2.m112038j()));
        }
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: h */
    public void mo157342h(int i11, int i12) {
        C21709f horizontalSpring = getHorizontalSpring();
        C21709f verticalSpring = getVerticalSpring();
        if (i11 == 0) {
            i11 = PhysicCallView.f150046L;
        }
        horizontalSpring.m112049v(i11);
        if (i12 == 0) {
            i12 = PhysicCallView.f150046L;
        }
        verticalSpring.m112049v(i12);
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: i */
    public void mo157343i() {
        this.f150049B = true;
        this.f150063t = new C32488a();
        C21709f m112019d = this.f150062s.m112019d();
        this.f150065v = m112019d;
        m112019d.m112030a(this.f150063t);
        this.f150065v.m112030a(this);
        this.f150064u = new C32489b();
        C21709f m112019d2 = this.f150062s.m112019d();
        this.f150066w = m112019d2;
        m112019d2.m112030a(this.f150064u);
        this.f150066w.m112030a(this);
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: p */
    public void mo157344p(double d11, double d12) {
        C21709f c21709f = this.f150065v;
        if (c21709f == null && this.f150066w == null) {
            return;
        }
        if (c21709f != null) {
            RectF rectF = this.f150060q;
            float f11 = rectF.left;
            if (d11 < f11) {
                d11 = f11;
            } else {
                float f12 = rectF.right;
                if (d11 > f12) {
                    d11 = f12;
                }
            }
            c21709f.m112050w(d11);
        }
        C21709f c21709f2 = this.f150066w;
        if (c21709f2 != null) {
            RectF rectF2 = this.f150060q;
            float f13 = rectF2.top;
            if (d12 < f13) {
                d12 = f13;
            } else {
                float f14 = rectF2.bottom;
                if (d12 > f14) {
                    d12 = f14;
                }
            }
            c21709f2.m112050w(d12);
        }
        PhysicCallView.InterfaceC32495a interfaceC32495a = this.f150058K;
        if (interfaceC32495a != null) {
            interfaceC32495a.mo156436a((float) d11, (float) d12);
        }
    }
}
