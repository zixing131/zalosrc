package zm.voip.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import bp0.AbstractC3104p;
import kg.AbstractC21707d;
import kg.AbstractC21717n;
import kg.C21709f;
import p266jg.AbstractC21245c;
import zm.voip.service.C32369y;
import zm.voip.widgets.PhysicCallView;

/* loaded from: classes7.dex */
public class FloatingAudioCallView extends PhysicCallView {

    /* renamed from: R */
    public static int f149984R = 0;

    /* renamed from: S */
    public static int f149985S = 1;

    /* renamed from: N */
    private ValueAnimator f149986N;

    /* renamed from: O */
    private final int f149987O;

    /* renamed from: P */
    private boolean f149988P;

    /* renamed from: Q */
    private double f149989Q;

    /* renamed from: zm.voip.widgets.FloatingAudioCallView$a */
    /* loaded from: classes7.dex */
    class C32486a extends AbstractC21707d {
        C32486a() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            FloatingAudioCallView floatingAudioCallView;
            PhysicCallView.InterfaceC32495a interfaceC32495a;
            float f11;
            super.mo39827a(c21709f);
            if (FloatingAudioCallView.this.m157375k() && (interfaceC32495a = (floatingAudioCallView = FloatingAudioCallView.this).f150058K) != null) {
                if (floatingAudioCallView.f149987O == FloatingAudioCallView.f149984R) {
                    f11 = FloatingAudioCallView.this.f150060q.left;
                } else {
                    f11 = FloatingAudioCallView.this.f150060q.right;
                }
                interfaceC32495a.mo156436a(f11, (int) c21709f.m112033d());
                if (!FloatingAudioCallView.this.f149988P && c21709f.m112040m()) {
                    FloatingAudioCallView.this.f149988P = true;
                    FloatingAudioCallView.this.f149989Q = c21709f.m112034f();
                }
                if (FloatingAudioCallView.this.f149988P && !c21709f.m112040m() && c21709f.m112034f() == FloatingAudioCallView.this.f149989Q) {
                    FloatingAudioCallView.this.f149988P = false;
                    c21709f.m112044q(c21709f.m112034f());
                }
            }
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: c */
        public void mo39829c(C21709f c21709f) {
            super.mo39829c(c21709f);
            FloatingAudioCallView.this.f149988P = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.widgets.FloatingAudioCallView$b */
    /* loaded from: classes7.dex */
    public class C32487b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f149991p;

        C32487b(boolean z11) {
            this.f149991p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            RectF m15671k0 = AbstractC3104p.m15671k0(AbstractC3104p.m15692v(), AbstractC3104p.m15694w(), false, this.f149991p);
            FloatingAudioCallView.this.m157378q((int) m15671k0.left, (int) m15671k0.top, (int) m15671k0.right, (int) m15671k0.bottom);
        }
    }

    public FloatingAudioCallView(Context context, C32369y c32369y, int i11) {
        super(context, c32369y);
        this.f149988P = false;
        this.f149989Q = -1.0d;
        this.f149987O = i11;
    }

    /* renamed from: B */
    public /* synthetic */ void m157331B(boolean z11, float f11, int i11, ValueAnimator valueAnimator) {
        float f12;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PhysicCallView.InterfaceC32495a interfaceC32495a = this.f150058K;
        if (interfaceC32495a != null) {
            RectF rectF = this.f150060q;
            if (z11) {
                f12 = f11 - (floatValue * i11);
            } else {
                f12 = f11 + (floatValue * i11);
            }
            rectF.left = f12;
            interfaceC32495a.mo156437b(f12);
        }
    }

    /* renamed from: C */
    public /* synthetic */ void m157332C(boolean z11, float f11, int i11, ValueAnimator valueAnimator) {
        float f12;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PhysicCallView.InterfaceC32495a interfaceC32495a = this.f150058K;
        if (interfaceC32495a != null) {
            RectF rectF = this.f150060q;
            if (z11) {
                f12 = f11 + (floatValue * i11);
            } else {
                f12 = f11 - (floatValue * i11);
            }
            rectF.right = f12;
            interfaceC32495a.mo156437b(f12);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: ep0.g.<init>(zm.voip.widgets.FloatingAudioCallView, boolean, float, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: A */
    public void m157340A(boolean r5) {
        /*
            r4 = this;
            android.animation.ValueAnimator r0 = r4.f149986N
            if (r0 != 0) goto L1d
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0078: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r4.f149986N = r0
            r0.removeAllUpdateListeners()
            android.animation.ValueAnimator r0 = r4.f149986N
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
        L1d:
            android.animation.ValueAnimator r0 = r4.f149986N
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            int r0 = bp0.AbstractC3104p.m15695x()
            int r1 = r4.f149987O
            int r2 = zm.voip.widgets.FloatingAudioCallView.f149984R
            if (r1 != r2) goto L42
            android.graphics.RectF r1 = r4.f150060q
            float r1 = r1.left
            android.animation.ValueAnimator r2 = r4.f149986N
            ep0.g r3 = new ep0.g
            r3.<init>()
            r2.addUpdateListener(r3)
            android.animation.ValueAnimator r0 = r4.f149986N
            r0.start()
            goto L59
        L42:
            int r2 = zm.voip.widgets.FloatingAudioCallView.f149985S
            if (r1 != r2) goto L59
            android.graphics.RectF r1 = r4.f150060q
            float r1 = r1.right
            android.animation.ValueAnimator r2 = r4.f149986N
            ep0.h r3 = new ep0.h
            r3.<init>()
            r2.addUpdateListener(r3)
            android.animation.ValueAnimator r0 = r4.f149986N
            r0.start()
        L59:
            android.animation.ValueAnimator r0 = r4.f149986N
            zm.voip.widgets.FloatingAudioCallView$b r1 = new zm.voip.widgets.FloatingAudioCallView$b
            r1.<init>(r5)
            r0.addListener(r1)
            nh.a r0 = p363nh.C23744a.m124114c()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1[r2] = r5
            r5 = 10017(0x2721, float:1.4037E-41)
            r0.m124116d(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zm.voip.widgets.FloatingAudioCallView.m157340A(boolean):void");
    }

    /* renamed from: D */
    public void m157341D(C21709f c21709f, C21709f c21709f2) {
        if (!m157374j() && c21709f == c21709f2 && c21709f.m112036h() == AbstractC21245c.f103557d && Math.abs(c21709f2.m112038j()) < PhysicCallView.f150047M) {
            double m112033d = c21709f2.m112033d();
            RectF rectF = this.f150060q;
            if (m112033d >= rectF.bottom) {
                c21709f2.m112048u(AbstractC21245c.f103554a);
                c21709f2.m112046s(this.f150060q.bottom);
            } else if (m112033d <= rectF.top) {
                c21709f2.m112048u(AbstractC21245c.f103554a);
                c21709f2.m112046s(this.f150060q.top);
            }
        }
    }

    @Override // zm.voip.widgets.PhysicCallView, kg.InterfaceC21713j
    /* renamed from: a */
    public void mo39827a(C21709f c21709f) {
        C21709f c21709f2 = this.f150066w;
        if (c21709f2 == null || c21709f != c21709f2) {
            return;
        }
        c21709f2.m112049v(AbstractC21717n.m112063a(c21709f2.m112038j(), -15000.0d, 15000.0d));
        m157341D(c21709f, c21709f2);
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: h */
    public void mo157342h(int i11, int i12) {
        C21709f verticalSpring = getVerticalSpring();
        verticalSpring.m112049v(i12);
        m157341D(verticalSpring, verticalSpring);
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: i */
    public void mo157343i() {
        this.f150064u = new C32486a();
        C21709f m112019d = this.f150062s.m112019d();
        this.f150066w = m112019d;
        m112019d.m112030a(this.f150064u);
        this.f150066w.m112030a(this);
    }

    @Override // zm.voip.widgets.PhysicCallView
    /* renamed from: p */
    public void mo157344p(double d11, double d12) {
        float f11;
        if (this.f150065v == null && this.f150066w == null) {
            return;
        }
        C21709f c21709f = this.f150066w;
        if (c21709f != null) {
            RectF rectF = this.f150060q;
            float f12 = rectF.top;
            if (d12 < f12) {
                d12 = f12;
            } else {
                float f13 = rectF.bottom;
                if (d12 > f13) {
                    d12 = f13;
                }
            }
            c21709f.m112050w(d12);
        }
        PhysicCallView.InterfaceC32495a interfaceC32495a = this.f150058K;
        if (interfaceC32495a != null) {
            if (this.f149987O == f149984R) {
                f11 = this.f150060q.left;
            } else {
                f11 = this.f150060q.right;
            }
            interfaceC32495a.mo156436a(f11, (float) d12);
        }
    }
}
