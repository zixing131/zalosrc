package com.zing.zalo.shortvideo.p072ui.view;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.res.AbstractC1401h;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.floating.AbstractC10105a;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.ZChannelFloatingAnimView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19071q;
import gg0.AbstractC19444a;
import l20.C22006a;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import pm0.C24848g0;
import s20.AbstractC26105g;
import v00.C27415j;

/* loaded from: classes5.dex */
public final class ZChannelFloatingAnimView extends ZaloView implements ZaloView.InterfaceC17421f {
    public static final C10618a Companion = new C10618a(null);

    /* renamed from: A0 */
    private ViewGroup f53825A0;

    /* renamed from: C0 */
    private int f53827C0;

    /* renamed from: D0 */
    private float f53828D0;

    /* renamed from: E0 */
    private float f53829E0;

    /* renamed from: F0 */
    private float f53830F0;

    /* renamed from: G0 */
    private float f53831G0;

    /* renamed from: H0 */
    private float f53832H0;

    /* renamed from: I0 */
    private float f53833I0;

    /* renamed from: J0 */
    private float f53834J0;

    /* renamed from: K0 */
    private float f53835K0;

    /* renamed from: L0 */
    private boolean f53836L0;

    /* renamed from: M0 */
    private Rect f53837M0;

    /* renamed from: N0 */
    private final int f53838N0;

    /* renamed from: O0 */
    private int f53839O0;

    /* renamed from: x0 */
    private C27415j f53841x0;

    /* renamed from: y0 */
    private RoundedImageView f53842y0;

    /* renamed from: z0 */
    private ImageView f53843z0;

    /* renamed from: w0 */
    private final C23528a f53840w0 = new C23528a(CoreUtility.getAppContext());

    /* renamed from: B0 */
    private boolean f53826B0 = true;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ZChannelFloatingAnimView$a */
    /* loaded from: classes5.dex */
    public static final class C10618a {
        private C10618a() {
        }

        public /* synthetic */ C10618a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ZChannelFloatingAnimView$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10619b extends C19071q implements InterfaceC18494a {
        C10619b(Object obj) {
            super(0, obj, ZChannelFloatingAnimView.class, "collapseCallback", "collapseCallback()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55540h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m55540h() {
            ((ZChannelFloatingAnimView) this.f94922q).m55532QK();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ZChannelFloatingAnimView$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class C10620c extends C19071q implements InterfaceC18494a {
        C10620c(Object obj) {
            super(0, obj, ZChannelFloatingAnimView.class, "expandCallback", "expandCallback()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55541h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m55541h() {
            ((ZChannelFloatingAnimView) this.f94922q).m55533RK();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ZChannelFloatingAnimView$d */
    /* loaded from: classes5.dex */
    public static final class C10621d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18494a f53844p;

        /* renamed from: q */
        final /* synthetic */ ZChannelFloatingAnimView f53845q;

        C10621d(InterfaceC18494a interfaceC18494a, ZChannelFloatingAnimView zChannelFloatingAnimView) {
            this.f53844p = interfaceC18494a;
            this.f53845q = zChannelFloatingAnimView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            InterfaceC18494a interfaceC18494a = this.f53844p;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z11) {
            AbstractC19074t.m100208f(animator, "animation");
            if (this.f53845q.f53827C0 == 2) {
                FloatingManager.Companion.m53861c();
            }
        }
    }

    public ZChannelFloatingAnimView() {
        Rect m53885k;
        AbstractC10105a m53860b = FloatingManager.Companion.m53860b();
        this.f53837M0 = (m53860b == null || (m53885k = m53860b.m53885k()) == null) ? new Rect() : m53885k;
        this.f53838N0 = AbstractC8948a.Companion.m47752e();
    }

    /* renamed from: C */
    private final void m55524C() {
        Activity activity;
        View view;
        Object systemService = m92689tK().getSystemService("input_method");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        Context m92648SI = m92648SI();
        IBinder iBinder = null;
        if (m92648SI instanceof Activity) {
            activity = (Activity) m92648SI;
        } else {
            activity = null;
        }
        if (activity != null) {
            view = activity.getCurrentFocus();
        } else {
            view = null;
        }
        if (view != null) {
            iBinder = view.getWindowToken();
        }
        if (iBinder != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: PK */
    private final InterfaceC18494a m55531PK() {
        int i11 = this.f53827C0;
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return new C10620c(this);
        }
        return new C10619b(this);
    }

    /* renamed from: QK */
    public final void m55532QK() {
        FloatingManager.Companion.m53871m();
        finish();
    }

    /* renamed from: RK */
    public final void m55533RK() {
        C17487o0 c17487o0;
        if (FloatingManager.Companion.m53860b() != null && m92676n2() != null) {
            StateManager.C10098a c10098a = StateManager.Companion;
            InterfaceC27218a m92676n2 = m92676n2();
            C27415j c27415j = null;
            if (m92676n2 != null) {
                c17487o0 = m92676n2.mo35579p();
            } else {
                c17487o0 = null;
            }
            c10098a.m53807k(c17487o0);
            C27415j c27415j2 = this.f53841x0;
            if (c27415j2 == null) {
                AbstractC19074t.m100223u("floatingManager");
            } else {
                c27415j = c27415j2;
            }
            c27415j.m140373b0();
        }
        AbstractC19444a.m101694b(new Runnable() { // from class: m20.y2
            public /* synthetic */ RunnableC22820y2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZChannelFloatingAnimView.this.finish();
            }
        }, 200L);
    }

    /* renamed from: TK */
    public static final void m55534TK(View view) {
    }

    /* renamed from: UK */
    public static final void m55535UK(ZChannelFloatingAnimView zChannelFloatingAnimView) {
        AbstractC19074t.m100208f(zChannelFloatingAnimView, "this$0");
        RoundedImageView roundedImageView = zChannelFloatingAnimView.f53842y0;
        if (roundedImageView == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView = null;
        }
        zChannelFloatingAnimView.m55536VK(roundedImageView, zChannelFloatingAnimView.f53832H0, zChannelFloatingAnimView.f53833I0, zChannelFloatingAnimView.f53834J0, zChannelFloatingAnimView.f53835K0, zChannelFloatingAnimView.f53828D0, zChannelFloatingAnimView.f53829E0, zChannelFloatingAnimView.f53830F0, zChannelFloatingAnimView.f53831G0, zChannelFloatingAnimView.m55531PK());
    }

    /* renamed from: VK */
    private final void m55536VK(RoundedImageView roundedImageView, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, InterfaceC18494a interfaceC18494a) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m20.a3

            /* renamed from: q */
            public final /* synthetic */ float f111310q;

            /* renamed from: r */
            public final /* synthetic */ float f111311r;

            /* renamed from: s */
            public final /* synthetic */ float f111312s;

            /* renamed from: t */
            public final /* synthetic */ float f111313t;

            /* renamed from: u */
            public final /* synthetic */ float f111314u;

            /* renamed from: v */
            public final /* synthetic */ float f111315v;

            /* renamed from: w */
            public final /* synthetic */ float f111316w;

            /* renamed from: x */
            public final /* synthetic */ float f111317x;

            /* renamed from: y */
            public final /* synthetic */ ZChannelFloatingAnimView f111318y;

            public /* synthetic */ C22721a3(float f112, float f132, float f122, float f142, float f152, float f172, float f162, float f182, ZChannelFloatingAnimView this) {
                r2 = f112;
                r3 = f132;
                r4 = f122;
                r5 = f142;
                r6 = f152;
                r7 = f172;
                r8 = f162;
                r9 = f182;
                r10 = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ZChannelFloatingAnimView.m55537WK(RoundedImageView.this, r2, r3, r4, r5, r6, r7, r8, r9, r10, valueAnimator);
            }
        });
        ofFloat.addListener(new C10621d(interfaceC18494a, this));
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    /* renamed from: WK */
    public static final void m55537WK(RoundedImageView roundedImageView, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, ZChannelFloatingAnimView zChannelFloatingAnimView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(roundedImageView, "$animView");
        AbstractC19074t.m100208f(zChannelFloatingAnimView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "mValue");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
        float f19 = 1 - floatValue;
        layoutParams.width = (int) ((f11 * floatValue) + (f12 * f19));
        layoutParams.height = (int) ((f13 * floatValue) + (f14 * f19));
        roundedImageView.setLayoutParams(layoutParams);
        roundedImageView.setX((f15 * floatValue) + (f16 * f19));
        roundedImageView.setY((f17 * floatValue) + (f18 * f19));
        ImageView imageView = zChannelFloatingAnimView.f53843z0;
        if (imageView == null) {
            AbstractC19074t.m100223u("bgView");
            imageView = null;
        }
        if (zChannelFloatingAnimView.f53827C0 != 1) {
            floatValue = f19;
        }
        imageView.setAlpha(floatValue);
    }

    /* renamed from: XK */
    private final void m55538XK() {
        RoundedImageView roundedImageView = this.f53842y0;
        RoundedImageView roundedImageView2 = null;
        if (roundedImageView == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView = null;
        }
        ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
        layoutParams.width = (int) this.f53832H0;
        layoutParams.height = (int) this.f53833I0;
        RoundedImageView roundedImageView3 = this.f53842y0;
        if (roundedImageView3 == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView3 = null;
        }
        roundedImageView3.setLayoutParams(layoutParams);
        RoundedImageView roundedImageView4 = this.f53842y0;
        if (roundedImageView4 == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView4 = null;
        }
        roundedImageView4.setX(this.f53828D0);
        RoundedImageView roundedImageView5 = this.f53842y0;
        if (roundedImageView5 == null) {
            AbstractC19074t.m100223u("imageView");
        } else {
            roundedImageView2 = roundedImageView5;
        }
        roundedImageView2.setY(this.f53829E0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        float f11;
        Bitmap bitmap;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m55524C();
        C27415j.a aVar = C27415j.Companion;
        InterfaceC27218a m92676n2 = m92676n2();
        AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
        this.f53841x0 = aVar.m140375b((ZaloActivity) m92676n2);
        this.f53839O0 = AbstractC1401h.m7080d(m92651WI(), R.color.transparent, m92689tK().getTheme());
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("xAnim4View", 0);
        } else {
            i11 = 0;
        }
        this.f53827C0 = i11;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        RoundedImageView roundedImageView = new RoundedImageView(m92689tK, null, 0, 6, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.width = this.f53837M0.width();
        layoutParams.height = this.f53837M0.height();
        roundedImageView.setX(this.f53837M0.left);
        roundedImageView.setY(this.f53837M0.top);
        roundedImageView.setLayoutParams(layoutParams);
        roundedImageView.setTranslationY(AbstractC8948a.Companion.m47752e());
        roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f53842y0 = roundedImageView;
        ImageView imageView = new ImageView(m92689tK());
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        imageView.setBackgroundColor(-16777216);
        if (this.f53827C0 == 1) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        imageView.setAlpha(f11);
        this.f53843z0 = imageView;
        FrameLayout frameLayout = new FrameLayout(m92689tK());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: m20.x2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZChannelFloatingAnimView.m55534TK(view);
            }
        });
        ImageView imageView2 = this.f53843z0;
        if (imageView2 == null) {
            AbstractC19074t.m100223u("bgView");
            imageView2 = null;
        }
        frameLayout.addView(imageView2);
        RoundedImageView roundedImageView2 = this.f53842y0;
        if (roundedImageView2 == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView2 = null;
        }
        frameLayout.addView(roundedImageView2);
        frameLayout.setBackgroundColor(this.f53839O0);
        this.f53825A0 = frameLayout;
        FloatingManager.C10103a c10103a = FloatingManager.Companion;
        AbstractC10105a m53860b = c10103a.m53860b();
        if (m53860b != null) {
            bitmap = m53860b.m53884j();
        } else {
            bitmap = null;
        }
        if (bitmap != null && !(c10103a.m53860b() instanceof C22006a)) {
            C23528a c23528a = this.f53840w0;
            RoundedImageView roundedImageView3 = this.f53842y0;
            if (roundedImageView3 == null) {
                AbstractC19074t.m100223u("imageView");
                roundedImageView3 = null;
            }
            ((C23528a) c23528a.m123612r(roundedImageView3)).m123614t(bitmap);
        } else {
            this.f53826B0 = false;
            RoundedImageView roundedImageView4 = this.f53842y0;
            if (roundedImageView4 == null) {
                AbstractC19074t.m100223u("imageView");
                roundedImageView4 = null;
            }
            roundedImageView4.setBackgroundColor(this.f53839O0);
        }
        m55539SK();
        ViewGroup viewGroup2 = this.f53825A0;
        if (viewGroup2 == null) {
            AbstractC19074t.m100223u("rootView");
            return null;
        }
        return viewGroup2;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        C27415j c27415j = this.f53841x0;
        if (c27415j == null) {
            AbstractC19074t.m100223u("floatingManager");
            c27415j = null;
        }
        c27415j.m47801V(false);
        super.mo39024IJ();
    }

    /* renamed from: SK */
    public final void m55539SK() {
        C27415j c27415j = this.f53841x0;
        C27415j c27415j2 = null;
        if (c27415j == null) {
            AbstractC19074t.m100223u("floatingManager");
            c27415j = null;
        }
        int m134345l = AbstractC26105g.m134345l(c27415j.mo47812q().m150987n());
        C27415j c27415j3 = this.f53841x0;
        if (c27415j3 == null) {
            AbstractC19074t.m100223u("floatingManager");
            c27415j3 = null;
        }
        int m134345l2 = AbstractC26105g.m134345l(c27415j3.mo47812q().m150985l());
        int i11 = this.f53827C0;
        if (i11 != 1) {
            if (i11 != 2) {
                finish();
                return;
            }
            this.f53832H0 = m134345l;
            this.f53833I0 = m134345l2;
            this.f53834J0 = this.f53837M0.width();
            this.f53835K0 = this.f53837M0.height();
            C27415j c27415j4 = this.f53841x0;
            if (c27415j4 == null) {
                AbstractC19074t.m100223u("floatingManager");
                c27415j4 = null;
            }
            this.f53828D0 = c27415j4.m47815v();
            C27415j c27415j5 = this.f53841x0;
            if (c27415j5 == null) {
                AbstractC19074t.m100223u("floatingManager");
            } else {
                c27415j2 = c27415j5;
            }
            this.f53829E0 = c27415j2.m47816w();
            Rect rect = this.f53837M0;
            this.f53830F0 = rect.left;
            this.f53831G0 = rect.top + this.f53838N0;
            m55538XK();
            return;
        }
        this.f53832H0 = this.f53837M0.width();
        this.f53833I0 = this.f53837M0.height();
        this.f53834J0 = m134345l;
        this.f53835K0 = m134345l2;
        Rect rect2 = this.f53837M0;
        this.f53828D0 = rect2.left;
        this.f53829E0 = rect2.top + this.f53838N0;
        C27415j c27415j6 = this.f53841x0;
        if (c27415j6 == null) {
            AbstractC19074t.m100223u("floatingManager");
            c27415j6 = null;
        }
        this.f53830F0 = c27415j6.m47815v();
        C27415j c27415j7 = this.f53841x0;
        if (c27415j7 == null) {
            AbstractC19074t.m100223u("floatingManager");
        } else {
            c27415j2 = c27415j7;
        }
        this.f53831G0 = c27415j2.m47816w();
        m55538XK();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        int i11 = this.f53827C0;
        if (i11 == 2 && !this.f53826B0) {
            this.f53836L0 = true;
            m55533RK();
        } else if (i11 == 1 && !this.f53826B0) {
            this.f53836L0 = true;
            m55532QK();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public synchronized void onResume() {
        super.onResume();
        if (this.f53836L0) {
            return;
        }
        this.f53836L0 = true;
        if (this.f53827C0 == 1 && !this.f53826B0) {
            m55532QK();
            return;
        }
        RoundedImageView roundedImageView = this.f53842y0;
        if (roundedImageView == null) {
            AbstractC19074t.m100223u("imageView");
            roundedImageView = null;
        }
        roundedImageView.postDelayed(new Runnable() { // from class: m20.z2
            public /* synthetic */ RunnableC22824z2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZChannelFloatingAnimView.m55535UK(ZChannelFloatingAnimView.this);
            }
        }, 200L);
    }
}
