package zm.voip.service;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zview.C17429a;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.InterfaceC17502s;
import com.zing.zalo.zview.animation.AnimationTarget;
import h40.AbstractC19783c;
import li.AbstractC22490a;
import me0.C23212s8;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import xl0.InterfaceC30162c;
import zl0.AbstractC32232i;
import zm.voip.widgets.FloatingAudioCallView;
import zm.voip.widgets.FloatingVideoCallView;
import zm.voip.widgets.HostVoIPFrameLayout;
import zm.voip.widgets.PhysicCallView;
import zm.voip.widgets.VoIPFloatingTipText;

/* renamed from: zm.voip.service.y */
/* loaded from: classes7.dex */
public class C32369y implements InterfaceC27218a {

    /* renamed from: A */
    private boolean f149303A;

    /* renamed from: B */
    private boolean f149304B;

    /* renamed from: C */
    private int f149305C;

    /* renamed from: D */
    private final int[] f149306D;

    /* renamed from: E */
    private final Runnable f149307E;

    /* renamed from: p */
    private final Context f149308p;

    /* renamed from: q */
    private final C17429a f149309q;

    /* renamed from: r */
    private final HostVoIPFrameLayout f149310r;

    /* renamed from: s */
    private PhysicCallView f149311s;

    /* renamed from: t */
    private final Handler f149312t;

    /* renamed from: u */
    private final View f149313u;

    /* renamed from: v */
    private WindowManager f149314v;

    /* renamed from: w */
    private VoIPFloatingTipText f149315w;

    /* renamed from: x */
    private final boolean f149316x;

    /* renamed from: y */
    public boolean f149317y;

    /* renamed from: z */
    private boolean f149318z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.y$a */
    /* loaded from: classes7.dex */
    public class a extends FloatingVideoCallView {
        a(Context context, C32369y c32369y) {
            super(context, c32369y);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            C32369y.this.m156408T();
            if (C32369y.this.f149309q != null) {
                C32369y.this.f149309q.m92704p2(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.y$b */
    /* loaded from: classes7.dex */
    public class b extends FloatingAudioCallView {
        b(Context context, C32369y c32369y, int i11) {
            super(context, c32369y, i11);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            C32369y.this.m156408T();
            if (C32369y.this.f149309q != null) {
                C32369y.this.f149309q.m92704p2(configuration);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.y$c */
    /* loaded from: classes7.dex */
    public class c implements PhysicCallView.InterfaceC32495a {
        c() {
        }

        @Override // zm.voip.widgets.PhysicCallView.InterfaceC32495a
        /* renamed from: a */
        public void mo156436a(float f11, float f12) {
            if (C32369y.m156397E()) {
                C32369y.this.m156403N((int) f11, (int) f12);
            } else {
                C32369y.this.m156401L((int) f11);
                C32369y.this.m156404P((int) f12);
            }
            C32369y.this.m156407S();
        }

        @Override // zm.voip.widgets.PhysicCallView.InterfaceC32495a
        /* renamed from: b */
        public void mo156437b(float f11) {
            if (C32369y.m156397E()) {
                C32369y.this.m156402M((int) f11);
            } else {
                C32369y.this.m156401L((int) f11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.y$d */
    /* loaded from: classes7.dex */
    public class d implements PhysicCallView.InterfaceC32496b {
        d() {
        }

        @Override // zm.voip.widgets.PhysicCallView.InterfaceC32496b
        /* renamed from: a */
        public void mo156438a() {
            if (C32369y.this.f149311s instanceof FloatingAudioCallView) {
                C32369y c32369y = C32369y.this;
                if (c32369y.f149317y) {
                    c32369y.f149317y = false;
                    ((FloatingAudioCallView) c32369y.f149311s).m157340A(false);
                    return;
                }
            }
            if (C32369y.this.f149311s instanceof FloatingVideoCallView) {
                C32369y c32369y2 = C32369y.this;
                if (c32369y2.f149317y) {
                    c32369y2.f149317y = false;
                    RectF m15671k0 = AbstractC3104p.m15671k0(AbstractC3104p.f13191h, AbstractC3104p.f13190g, c32369y2.f149316x, false);
                    C32369y.this.f149311s.m157378q((int) m15671k0.left, (int) m15671k0.top, (int) m15671k0.right, (int) m15671k0.bottom);
                    C23744a.m124114c().m124116d(10011, Boolean.valueOf(C32369y.this.f149317y));
                    return;
                }
            }
            C23744a.m124114c().m124116d(10016, new Object[0]);
            AbstractC32273e3.m155748Q().mo155893k2();
        }

        @Override // zm.voip.widgets.PhysicCallView.InterfaceC32496b
        /* renamed from: b */
        public void mo156439b() {
            C32369y c32369y = C32369y.this;
            c32369y.f149317y = !c32369y.f149317y;
            if (c32369y.f149311s instanceof FloatingAudioCallView) {
                ((FloatingAudioCallView) C32369y.this.f149311s).m157340A(C32369y.this.f149317y);
            } else if (C32369y.this.f149311s instanceof FloatingVideoCallView) {
                RectF m15671k0 = AbstractC3104p.m15671k0(AbstractC3104p.f13191h, AbstractC3104p.f13190g, C32369y.this.f149316x, C32369y.this.f149317y);
                C32369y.this.f149311s.m157378q((int) m15671k0.left, (int) m15671k0.top, (int) m15671k0.right, (int) m15671k0.bottom);
                C23744a.m124114c().m124116d(10011, Boolean.valueOf(C32369y.this.f149317y));
            }
        }
    }

    /* renamed from: zm.voip.service.y$e */
    /* loaded from: classes7.dex */
    protected class e implements View.OnTouchListener {

        /* renamed from: p */
        int[] f149323p = new int[2];

        protected e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            motionEvent.offsetLocation(C32369y.this.m156428z(view), C32369y.this.m156395A(view));
            C32369y.this.f149310r.getLocationOnScreen(this.f149323p);
            int[] iArr = this.f149323p;
            motionEvent.offsetLocation(-iArr[0], -iArr[1]);
            return C32369y.this.f149310r.dispatchTouchEvent(motionEvent);
        }
    }

    public C32369y(Context context) {
        this(context, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public int m156395A(View view) {
        return m156396B(view).y;
    }

    /* renamed from: B */
    private WindowManager.LayoutParams m156396B(View view) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            WindowManager.LayoutParams m156426w = m156426w(false);
            view.setLayoutParams(m156426w);
            return m156426w;
        }
        return layoutParams;
    }

    /* renamed from: E */
    public static boolean m156397E() {
        return Build.VERSION.SDK_INT >= 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ View m156398F(int i11) {
        m156427x();
        this.f149310r.addView(this.f149311s);
        m156425t();
        if (i11 != 16908290 && i11 != AbstractC6918a0.zalo_view_container) {
            return this.f149311s.findViewById(i11);
        }
        return this.f149311s;
    }

    /* renamed from: J */
    private void m156399J(View view, int i11) {
        if (m156429C() != null && !this.f149318z) {
            WindowManager.LayoutParams m156396B = m156396B(view);
            m156396B.x = i11;
            m156429C().updateViewLayout(view, m156396B);
        }
    }

    /* renamed from: K */
    private void m156400K(View view, int i11) {
        if (m156429C() != null && !this.f149318z) {
            WindowManager.LayoutParams m156396B = m156396B(view);
            m156396B.y = i11;
            m156429C().updateViewLayout(view, m156396B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m156401L(int i11) {
        this.f149311s.setTranslationX(i11);
        this.f149311s.getRootView().getLocationOnScreen(this.f149306D);
        m156399J(this.f149313u, i11 + this.f149306D[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m156402M(int i11) {
        m156399J(this.f149313u, this.f149306D[1] + i11);
        WindowManager.LayoutParams m156396B = m156396B(this.f149310r);
        m156396B.x = i11;
        m156429C().updateViewLayout(this.f149310r, m156396B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m156403N(int i11, int i12) {
        m156399J(this.f149313u, this.f149306D[0] + i11);
        WindowManager.LayoutParams m156396B = m156396B(this.f149310r);
        if (m156396B.x != i11 || m156396B.y != i12) {
            m156396B.x = i11;
            m156396B.y = i12;
            m156429C().updateViewLayout(this.f149310r, m156396B);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m156404P(int i11) {
        this.f149311s.setTranslationY(i11);
        this.f149311s.getRootView().getLocationOnScreen(this.f149306D);
        m156400K(this.f149313u, i11 + this.f149306D[1]);
    }

    /* renamed from: Q */
    private void m156405Q(CharSequence charSequence) {
        int i11;
        if (this.f149304B && (i11 = this.f149305C) < 7 && this.f149316x) {
            int i12 = i11 + 1;
            this.f149305C = i12;
            AbstractC23309i.m121832dj(i12);
            this.f149304B = false;
            m156430D();
            if (this.f149315w == null) {
                FrameLayout.LayoutParams m15698a = AbstractC3105q.m15698a(-2, -2);
                m15698a.gravity = 8388659;
                VoIPFloatingTipText voIPFloatingTipText = new VoIPFloatingTipText(this.f149308p);
                this.f149315w = voIPFloatingTipText;
                voIPFloatingTipText.setText(charSequence);
                this.f149315w.setLayoutParams(m15698a);
                this.f149310r.addView(this.f149315w);
            }
            this.f149315w.setVisibility(0);
            this.f149315w.f150131D = AbstractC3104p.m15692v() / 2;
            this.f149315w.f150130C = AbstractC3104p.m15694w() / 2;
            m156408T();
            this.f149312t.postDelayed(this.f149307E, 5000L);
        }
    }

    /* renamed from: R */
    private void m156406R(float f11, float f12) {
        PhysicCallView physicCallView = this.f149311s;
        if (physicCallView == null) {
            return;
        }
        physicCallView.mo157344p(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m156407S() {
        VoIPFloatingTipText voIPFloatingTipText = this.f149315w;
        if (voIPFloatingTipText != null && voIPFloatingTipText.getVisibility() == 0) {
            this.f149315w.m157428c(this.f149311s.getTranslationX(), this.f149311s.getTranslationY());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m156408T() {
        VoIPFloatingTipText voIPFloatingTipText = this.f149315w;
        if (voIPFloatingTipText != null && voIPFloatingTipText.getVisibility() == 0) {
            this.f149315w.setNeedUpdatePosition(true);
            this.f149315w.setXAnchorView(this.f149311s.getTranslationX());
            this.f149315w.setYAnchorView(this.f149311s.getTranslationY());
        }
    }

    /* renamed from: U */
    private void m156409U(RectF rectF) {
        try {
            if (m156397E()) {
                WindowManager.LayoutParams m156396B = m156396B(this.f149310r);
                this.f149311s.m157379r(m156396B.x, m156396B.y, rectF);
            } else {
                PhysicCallView physicCallView = this.f149311s;
                physicCallView.m157379r((int) physicCallView.getTranslationX(), (int) this.f149311s.getTranslationY(), rectF);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    private void m156423r(View view, WindowManager.LayoutParams layoutParams) {
        if (m156429C() != null && !this.f149318z) {
            view.setLayoutParams(layoutParams);
            m156429C().addView(view, layoutParams);
        }
    }

    /* renamed from: s */
    private void m156424s(View view, boolean z11) {
        m156423r(view, m156426w(z11));
    }

    /* renamed from: t */
    private void m156425t() {
        int m15677n0;
        int m15629F;
        if (m156429C() != null && !this.f149318z) {
            m156424s(this.f149313u, true);
            WindowManager.LayoutParams m156396B = m156396B(this.f149313u);
            if (this.f149316x) {
                m15677n0 = AbstractC3104p.m15687s0(this.f149317y);
            } else {
                m15677n0 = AbstractC3104p.m15677n0();
            }
            m156396B.width = m15677n0;
            if (this.f149316x) {
                m15629F = AbstractC3104p.m15636M(this.f149317y);
            } else {
                m15629F = AbstractC3104p.m15629F();
            }
            m156396B.height = m15629F;
            m156429C().updateViewLayout(this.f149313u, m156396B);
        }
    }

    /* renamed from: w */
    private WindowManager.LayoutParams m156426w(boolean z11) {
        int i11;
        WindowManager.LayoutParams layoutParams;
        if (z11) {
            i11 = R.attr.radius;
        } else if (!m156397E()) {
            i11 = R.attr.duration;
        } else {
            i11 = R.attr.layout_alignTop;
        }
        if (m156397E()) {
            layoutParams = new WindowManager.LayoutParams(-2, -2, AbstractC32232i.f148649a, i11, -3);
        } else {
            layoutParams = new WindowManager.LayoutParams(-1, -1, AbstractC32232i.f148649a, i11, -3);
        }
        AbstractC32232i.m155461i(this.f149308p, layoutParams);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    /* renamed from: x */
    private void m156427x() {
        if (this.f149311s == null) {
            if (this.f149316x) {
                this.f149311s = new a(getContext(), this);
            } else {
                this.f149311s = new b(getContext(), this, FloatingAudioCallView.f149985S);
            }
        }
        this.f149311s.setAnimationUpdateListener(new c());
        this.f149311s.setOnClickListener(new d());
        this.f149311s.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        AbstractC19783c.m103535f(true);
        AbstractC22490a.m116283f("floating_call", Boolean.toString(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public int m156428z(View view) {
        return m156396B(view).x;
    }

    /* renamed from: C */
    public WindowManager m156429C() {
        if (this.f149314v == null) {
            this.f149314v = (WindowManager) this.f149308p.getSystemService("window");
        }
        return this.f149314v;
    }

    /* renamed from: D */
    public void m156430D() {
        VoIPFloatingTipText voIPFloatingTipText = this.f149315w;
        if (voIPFloatingTipText != null) {
            voIPFloatingTipText.setVisibility(8);
            this.f149312t.removeCallbacks(this.f149307E);
        }
    }

    /* renamed from: G */
    public void m156431G(int i11, int i12) {
        boolean z11;
        if ((i12 != AbstractC3104p.f13191h || i11 != AbstractC3104p.f13190g) && i11 != 0 && i12 != 0) {
            m156432H();
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC3104p.f13191h = i12;
        AbstractC3104p.f13190g = i11;
        VoIPFloatingTipText voIPFloatingTipText = this.f149315w;
        if (voIPFloatingTipText != null && voIPFloatingTipText.getVisibility() == 0) {
            VoIPFloatingTipText voIPFloatingTipText2 = this.f149315w;
            voIPFloatingTipText2.f150131D = i12 / 2;
            voIPFloatingTipText2.f150130C = i11 / 2;
        }
        if (AbstractC3104p.f13191h > 0 && AbstractC3104p.f13190g > 0 && z11) {
            RectF m15671k0 = AbstractC3104p.m15671k0(AbstractC3104p.f13191h, AbstractC3104p.f13190g, this.f149316x, this.f149317y);
            m156409U(m15671k0);
            if (!this.f149303A) {
                m156406R(m15671k0.right, AbstractC3104p.m15689t0((int) m15671k0.top));
                this.f149303A = true;
            }
            if (!m156397E()) {
                m156405Q(getString(AbstractC8020f0.str_call_longhold_miniview_toast));
            }
        }
    }

    /* renamed from: H */
    public void m156432H() {
        if (Build.VERSION.SDK_INT >= 28) {
            View view = this.f149313u;
            if (view != null) {
                WindowManager.LayoutParams m156396B = m156396B(view);
                AbstractC32232i.m155461i(this.f149308p, m156396B);
                this.f149314v.updateViewLayout(this.f149313u, m156396B);
            }
            HostVoIPFrameLayout hostVoIPFrameLayout = this.f149310r;
            if (hostVoIPFrameLayout != null) {
                WindowManager.LayoutParams m156396B2 = m156396B(hostVoIPFrameLayout);
                AbstractC32232i.m155461i(this.f149308p, m156396B2);
                this.f149314v.updateViewLayout(this.f149310r, m156396B2);
            }
        }
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: H2 */
    public void mo35551H2(AnimationTarget animationTarget, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
    }

    /* renamed from: I */
    public void m156433I(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f149311s.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f149311s.setLayoutParams(layoutParams);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) this.f149313u.getLayoutParams();
        layoutParams2.width = i11;
        layoutParams2.height = i12;
        this.f149313u.setLayoutParams(layoutParams2);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: K0 */
    public int mo35552K0() {
        return C23212s8.m119601h();
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: O */
    public void mo35554O(int i11) {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: V */
    public void mo35556V(ImageView imageView, String str, Bundle bundle, InterfaceC30162c interfaceC30162c, int i11) {
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: a */
    public boolean mo35559a() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: d1 */
    public boolean mo35567d1() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public View findViewById(int i11) {
        return this.f149310r.findViewById(i11);
    }

    @Override // p542ub.InterfaceC27218a
    public void finish() {
        try {
            mo35579p().m93050Z();
            AbstractC19783c.m103535f(false);
            AbstractC22490a.m116283f("floating_call", Boolean.toString(false));
            m156434u();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: g0 */
    public View mo35570g0() {
        return this.f149310r;
    }

    @Override // p542ub.InterfaceC27218a
    public AssetManager getAssets() {
        return this.f149308p.getAssets();
    }

    @Override // p542ub.InterfaceC27218a
    public Context getContext() {
        return this.f149308p;
    }

    @Override // p542ub.InterfaceC27218a
    public View getCurrentFocus() {
        return this.f149310r.findFocus();
    }

    @Override // p542ub.InterfaceC27218a
    public Intent getIntent() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    public LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(this.f149308p);
    }

    @Override // p542ub.InterfaceC27218a
    public int getRequestedOrientation() {
        return 1;
    }

    @Override // p542ub.InterfaceC27218a
    public Resources getResources() {
        return getContext().getResources();
    }

    @Override // p542ub.InterfaceC27218a
    public String getString(int i11) {
        return this.f149308p.getResources().getString(i11);
    }

    @Override // p542ub.InterfaceC27218a
    public Window getWindow() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: i0 */
    public boolean mo35572i0() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public boolean isDestroyed() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public boolean isFinishing() {
        return this.f149318z;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: l4 */
    public void mo35573l4(Class cls, Bundle bundle, int i11, boolean z11) {
    }

    @Override // p542ub.InterfaceC27219b
    /* renamed from: n1 */
    public Activity mo35575n1() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: n3 */
    public boolean mo35576n3() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: o */
    public boolean mo35577o() {
        return false;
    }

    @Override // p542ub.InterfaceC27218a
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.f149309q.m93088w1(i11, i12, intent);
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: p */
    public C17487o0 mo35579p() {
        return this.f149309q;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: q */
    public void mo35581q(Class cls, Bundle bundle, int i11, int i12, boolean z11) {
    }

    @Override // p542ub.InterfaceC27219b
    public void requestPermissions(String[] strArr, int i11) {
    }

    @Override // p542ub.InterfaceC27218a
    public void runOnUiThread(Runnable runnable) {
        this.f149312t.post(runnable);
    }

    @Override // p542ub.InterfaceC27218a
    public void setRequestedOrientation(int i11) {
    }

    @Override // p542ub.InterfaceC27219b
    public boolean shouldShowRequestPermissionRationale(String str) {
        return false;
    }

    @Override // p542ub.InterfaceC27218a, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
    }

    @Override // p542ub.InterfaceC27218a
    public void startActivityForResult(Intent intent, int i11) {
    }

    /* renamed from: u */
    public void m156434u() {
        this.f149314v.removeViewImmediate(this.f149313u);
        m156435y();
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v */
    public View mo35585v() {
        return null;
    }

    @Override // p542ub.InterfaceC27218a
    /* renamed from: v2 */
    public boolean mo35586v2() {
        return false;
    }

    /* renamed from: y */
    public void m156435y() {
        this.f149318z = true;
        try {
            HostVoIPFrameLayout hostVoIPFrameLayout = this.f149310r;
            if (hostVoIPFrameLayout != null && hostVoIPFrameLayout.getParent() != null) {
                WindowManager windowManager = (WindowManager) this.f149308p.getSystemService("window");
                this.f149310r.removeAllViews();
                this.f149312t.removeCallbacksAndMessages(null);
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.f149310r);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32369y(Context context, boolean z11) {
        C17429a c17429a = new C17429a();
        this.f149309q = c17429a;
        this.f149318z = false;
        this.f149306D = new int[2];
        this.f149307E = new Runnable() { // from class: zm.voip.service.w
            @Override // java.lang.Runnable
            public final void run() {
                C32369y.this.m156430D();
            }
        };
        this.f149308p = context;
        this.f149316x = z11;
        this.f149303A = false;
        this.f149304B = true;
        this.f149305C = AbstractC23309i.m121440T0();
        AbstractC3104p.f13190g = 0;
        AbstractC3104p.f13191h = 0;
        HostVoIPFrameLayout hostVoIPFrameLayout = new HostVoIPFrameLayout(context, this);
        this.f149310r = hostVoIPFrameLayout;
        hostVoIPFrameLayout.setId(AbstractC6918a0.call_floatingMainFrame);
        hostVoIPFrameLayout.setDescendantFocusability(262144);
        m156424s(hostVoIPFrameLayout, false);
        View view = new View(context);
        this.f149313u = view;
        view.setId(AbstractC6918a0.call_motionCaptureView);
        view.setOnTouchListener(new e());
        this.f149312t = new Handler(Looper.getMainLooper());
        c17429a.m92989C(this, new InterfaceC17502s() { // from class: zm.voip.service.x
            @Override // com.zing.zalo.zview.InterfaceC17502s
            public final View findViewById(int i11) {
                View m156398F;
                m156398F = C32369y.this.m156398F(i11);
                return m156398F;
            }
        }, null);
        c17429a.m93087w0();
    }
}
