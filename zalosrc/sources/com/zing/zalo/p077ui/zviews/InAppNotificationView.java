package com.zing.zalo.p077ui.zviews;

import am.C0943w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ap0.C2279a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7027c3;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.moduleview.inappnoti.InAppNotiChatModuleView;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.C17503s0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import me0.AbstractC23211s7;
import me0.C23055e5;
import p207he.C20024r;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import st.C26386a;
import v50.C27870vb;
import vg.C28203u6;
import zc0.C31784b;
import zl0.AbstractC32226c;

/* loaded from: classes.dex */
public class InAppNotificationView extends DragToCloseLayout implements C23744a.c, InAppNotiChatModuleView.InterfaceC12418a, DragToCloseLayout.InterfaceC16432a, C17503s0.a, C17487o0.l, DragToCloseLayout.InterfaceC16433b {

    /* renamed from: c0 */
    private static InAppNotificationView f74393c0;

    /* renamed from: M */
    CountDownTimer f74394M;

    /* renamed from: N */
    C7027c3 f74395N;

    /* renamed from: O */
    RecyclerView f74396O;

    /* renamed from: P */
    C17487o0 f74397P;

    /* renamed from: Q */
    LinearLayoutManager f74398Q;

    /* renamed from: R */
    C23528a f74399R;

    /* renamed from: S */
    boolean f74400S;

    /* renamed from: T */
    boolean f74401T;

    /* renamed from: U */
    boolean f74402U;

    /* renamed from: V */
    boolean f74403V;

    /* renamed from: W */
    ContactProfile f74404W;

    /* renamed from: a0 */
    boolean f74405a0;

    /* renamed from: b0 */
    boolean f74406b0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InAppNotificationView$a */
    /* loaded from: classes6.dex */
    public class CountDownTimerC14478a extends CountDownTimer {
        CountDownTimerC14478a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (InAppNotificationView.f74393c0 != null) {
                InAppNotificationView.f74393c0.m80886A(false);
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.InAppNotificationView$b */
    /* loaded from: classes6.dex */
    public class C14479b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f74407p;

        /* renamed from: q */
        final /* synthetic */ long f74408q;

        C14479b(boolean z11, long j11) {
            this.f74407p = z11;
            this.f74408q = j11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            InAppNotificationView.this.f74402U = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            InAppNotificationView inAppNotificationView = InAppNotificationView.this;
            inAppNotificationView.f74402U = false;
            if (!this.f74407p) {
                inAppNotificationView.setVisibility(8);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            InAppNotificationView inAppNotificationView = InAppNotificationView.this;
            inAppNotificationView.f74402U = true;
            if (this.f74407p) {
                inAppNotificationView.setVisibility(0);
            }
            InAppNotificationView inAppNotificationView2 = InAppNotificationView.this;
            inAppNotificationView2.m80888C(inAppNotificationView2, this.f74407p, this.f74408q);
        }
    }

    InAppNotificationView(Context context, C17487o0 c17487o0) {
        super(context);
        this.f74394M = null;
        this.f74400S = false;
        this.f74401T = false;
        this.f74402U = false;
        this.f74403V = false;
        this.f74405a0 = false;
        this.f74406b0 = false;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f74397P = c17487o0;
        this.f74399R = new C23528a(context);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(context);
        this.f74398Q = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f74396O = new RecyclerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(AbstractC23136l9.m118742r(9.0f), 0, AbstractC23136l9.m118742r(9.0f), 0);
        this.f74396O.setLayoutParams(layoutParams);
        this.f74396O.setLayoutManager(this.f74398Q);
        addView(this.f74396O);
        setOnDragToCloseListener(this);
        setOnDragToCloseMoreOption(this);
        setMinDistanceToClose(AbstractC23136l9.m118742r(10.0f));
        setDirection(0);
        C7027c3 c7027c3 = new C7027c3();
        this.f74395N = c7027c3;
        c7027c3.m35921O(this.f74399R);
        this.f74395N.m35922P(this);
        this.f74396O.setAdapter(this.f74395N);
        C31784b.m152808a(this.f74396O).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.fr
            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView, int i11, View view) {
                InAppNotificationView.this.m80881r(recyclerView, i11, view);
            }
        });
        C31784b.m152808a(this.f74396O).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.gr
            @Override // zc0.C31784b.e
            /* renamed from: T3 */
            public final boolean mo81113T3(RecyclerView recyclerView, int i11, View view) {
                boolean m80882s;
                m80882s = InAppNotificationView.this.m80882s(recyclerView, i11, view);
                return m80882s;
            }
        });
        setVisibility(8);
    }

    /* renamed from: D */
    public static void m80868D() {
        if (f74393c0 == null) {
            return;
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.er
            @Override // java.lang.Runnable
            public final void run() {
                InAppNotificationView.m80885w();
            }
        });
    }

    /* renamed from: j */
    private void m80875j() {
        if (getVisibility() != 0) {
            return;
        }
        C7027c3.c m135969d = C26386a.m135966c().m135969d();
        if ((m135969d instanceof C7027c3.b) && C11318b.m60507e().m60515j(((C7027c3.b) m135969d).f38418b.f42434r)) {
            C23744a.m124114c().m124116d(4002, new Object[0]);
        } else if (!m80880q()) {
            C23744a.m124114c().m124116d(4002, new Object[0]);
        }
    }

    /* renamed from: k */
    public static void m80876k() {
        InAppNotificationView inAppNotificationView = f74393c0;
        if (inAppNotificationView != null) {
            inAppNotificationView.f74397P.m93000F1(inAppNotificationView);
            f74393c0 = null;
        }
    }

    /* renamed from: m */
    public static void m80877m() {
        InAppNotificationView inAppNotificationView = f74393c0;
        if (inAppNotificationView != null && !inAppNotificationView.f74400S) {
            inAppNotificationView.f74400S = true;
            C23744a.m124114c().m124115b(f74393c0, 4000);
            C23744a.m124114c().m124115b(f74393c0, 4001);
            C23744a.m124114c().m124115b(f74393c0, 4002);
        }
    }

    /* renamed from: n */
    public static void m80878n(Context context, C17487o0 c17487o0) {
        if (f74393c0 == null) {
            f74393c0 = new InAppNotificationView(context, c17487o0);
        }
    }

    /* renamed from: p */
    public static boolean m80879p() {
        InAppNotificationView inAppNotificationView = f74393c0;
        if (inAppNotificationView == null || inAppNotificationView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m80880q() {
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM == null) {
            return false;
        }
        if ((!(m67645lM.m92693xK().m93012K0() instanceof MainTabView) || m67645lM.m67715wM()) && !(m67645lM.m92693xK().m93012K0() instanceof ChatView)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m80881r(RecyclerView recyclerView, int i11, View view) {
        C7027c3.c m35918L;
        C7027c3 c7027c3;
        C7027c3 c7027c32 = this.f74395N;
        if (c7027c32 != null && c7027c32.mo10003k() > i11 && i11 >= 0 && (m35918L = this.f74395N.m35918L(i11)) != null && m35918L.m35925a() == 0 && (c7027c3 = this.f74395N) != null) {
            c7027c3.f38416t.mo69756a(((C7027c3.b) m35918L).f38418b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ boolean m80882s(RecyclerView recyclerView, int i11, View view) {
        C7027c3.c m35918L;
        C7027c3 c7027c3 = this.f74395N;
        if (c7027c3 == null || c7027c3.mo10003k() <= i11 || i11 < 0 || (m35918L = this.f74395N.m35918L(i11)) == null || m35918L.m35925a() != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m80883u(InterfaceC17463d interfaceC17463d, int i11) {
        m80892y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m80884v(InterfaceC17463d interfaceC17463d, int i11) {
        m80893z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ void m80885w() {
        InAppNotificationView inAppNotificationView = f74393c0;
        if (inAppNotificationView == null) {
            return;
        }
        CountDownTimer countDownTimer = inAppNotificationView.f74394M;
        if (countDownTimer == null) {
            int m121452Tc = AbstractC23309i.m121452Tc();
            f74393c0.f74394M = new CountDownTimerC14478a(m121452Tc * 1000, 200L);
            f74393c0.f74394M.start();
        } else if (!inAppNotificationView.f74405a0) {
            countDownTimer.cancel();
            f74393c0.f74394M.start();
        }
        f74393c0.m80887B();
        InAppNotificationView inAppNotificationView2 = f74393c0;
        if (!inAppNotificationView2.f74401T) {
            inAppNotificationView2.f74401T = true;
            inAppNotificationView2.f74397P.m93086w(inAppNotificationView2, 998, inAppNotificationView2);
        }
        if (f74393c0.getVisibility() != 0) {
            f74393c0.m80886A(true);
        }
    }

    /* renamed from: A */
    void m80886A(boolean z11) {
        int i11;
        long j11;
        int i12;
        if (this.f74402U) {
            return;
        }
        try {
            C17487o0 c17487o0 = this.f74397P;
            int i13 = 0;
            if (c17487o0 != null && c17487o0.m93012K0() != null && this.f74397P.m93012K0().m92646QI() != null) {
                i11 = this.f74397P.m93012K0().m92646QI().getActionBarHeight() + AbstractC32226c.m155405d(this.f74397P.m93021N0());
            } else {
                i11 = 0;
            }
            if (!this.f74403V) {
                this.f74403V = true;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f74396O.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin, i11, layoutParams.rightMargin, layoutParams.bottomMargin);
            }
            if (z11) {
                C17487o0 c17487o02 = this.f74397P;
                if (c17487o02 != null) {
                    if (c17487o02.m93012K0().m92646QI() != null) {
                        i12 = this.f74397P.m93012K0().m92646QI().getActionBarHeight() / 2;
                    } else {
                        i12 = 0;
                    }
                    int m155405d = (i12 + AbstractC32226c.m155405d(this.f74397P.m93021N0())) - i11;
                    setStartDragYPos(0);
                    setTranslationY(m155405d);
                    j11 = 300;
                } else {
                    j11 = 0;
                }
            } else {
                setStartDragYPos(0);
                j11 = 150;
                i13 = -i11;
            }
            AbstractC23202r9.m119546n(this, i13, j11, new C14479b(z11, j11));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: B */
    public void m80887B() {
        C7027c3 c7027c3 = this.f74395N;
        if (c7027c3 != null) {
            c7027c3.m35923Q(C26386a.m135966c().m135970e());
        }
    }

    /* renamed from: C */
    void m80888C(View view, boolean z11, long j11) {
        float f11;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", f11, 1.0f - f11);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(j11);
            ofFloat.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: Dg */
    public void mo38328Dg(float f11) {
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: EC */
    public void mo38329EC(boolean z11) {
        this.f74405a0 = false;
        if (!z11) {
            if (!this.f74402U) {
                m80886A(false);
            } else {
                setVisibility(8);
            }
            CountDownTimer countDownTimer = this.f74394M;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C26386a.m135966c().m135973h();
            return;
        }
        CountDownTimer countDownTimer2 = this.f74394M;
        if (countDownTimer2 != null) {
            countDownTimer2.start();
        }
    }

    @Override // com.zing.zalo.p077ui.moduleview.inappnoti.InAppNotiChatModuleView.InterfaceC12418a
    /* renamed from: a */
    public void mo69756a(ContactProfile contactProfile) {
        if (contactProfile == null) {
            return;
        }
        CountDownTimer countDownTimer = this.f74394M;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        String mo2478b = contactProfile.mo2478b();
        Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
        if (contactProfile.m40374K0()) {
            String m132088m = AbstractC25495a.m132088m(mo2478b);
            if (!m132088m.isEmpty()) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(m132088m);
                if (m4472f != null) {
                    m140776b.putString("groupId", m4472f.m153781r());
                    m140776b.putString("groupName", m4472f.m153793y());
                } else {
                    m140776b.putString("groupId", m132088m);
                    m140776b.putString("groupName", contactProfile.f42437s);
                }
                contactProfile.f42428p = 1;
            }
        }
        AbstractC23211s7.m119583p(this.f74397P.m93021N0(), m140776b, contactProfile);
        if (!this.f74402U) {
            m80886A(false);
        } else {
            setVisibility(8);
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16433b
    /* renamed from: b */
    public void mo80889b() {
        this.f74405a0 = false;
        CountDownTimer countDownTimer = this.f74394M;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16433b
    /* renamed from: c */
    public void mo80890c(int i11, int i12) {
        Rect rect = new Rect();
        this.f74396O.getHitRect(rect);
        if (rect.contains(i11, i12)) {
            CountDownTimer countDownTimer = this.f74394M;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f74405a0 = true;
            return;
        }
        this.f82911q = false;
    }

    @Override // com.zing.zalo.p077ui.moduleview.inappnoti.InAppNotiChatModuleView.InterfaceC12418a
    /* renamed from: c2 */
    public void mo69757c2(String str, int i11) {
        try {
            if (TextUtils.isEmpty(str)) {
                ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
                return;
            }
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            this.f74404W = m141809c;
            if (m141809c == null) {
                this.f74404W = new ContactProfile(str);
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    m80893z();
                    return;
                }
                return;
            }
            m80892y();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: f2 */
    public void mo38330f2() {
        this.f74405a0 = true;
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: gp */
    public void mo35571gp(ZaloView zaloView) {
        m80875j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m80891l() {
        if (getVisibility() == 0) {
            CountDownTimer countDownTimer = this.f74394M;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (!this.f74402U) {
                m80886A(false);
            } else {
                setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: o7 */
    public void mo35578o7(ZaloView zaloView) {
        m80875j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C17487o0 c17487o0 = this.f74397P;
        if (c17487o0 != null) {
            c17487o0.m93092y(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17487o0 c17487o0 = this.f74397P;
        if (c17487o0 != null) {
            c17487o0.m93008I1(this);
        }
        C23744a.m124114c().m124117e(this, 4000);
        C23744a.m124114c().m124117e(this, 4001);
        C23744a.m124114c().m124117e(this, 4002);
    }

    @Override // com.zing.zalo.zview.C17503s0.a
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (!this.f74406b0 || getVisibility() != 0) {
            return;
        }
        this.f74406b0 = false;
        if (i11 != 113) {
            if (i11 == 117) {
                if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(getContext(), new String[]{"android.permission.RECORD_AUDIO"}) == 0) {
                    m80892y();
                    return;
                } else {
                    AbstractC23034c6.m118164l0(this.f74397P.m93021N0(), null, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.cr
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            InAppNotificationView.this.m80883u(interfaceC17463d, i12);
                        }
                    }, null);
                    return;
                }
            }
            return;
        }
        if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(getContext(), AbstractC23034c6.f112033j) == 0) {
            m80893z();
        } else {
            AbstractC23034c6.m118168n0(this.f74397P.m93021N0(), null, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.dr
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    InAppNotificationView.this.m80884v(interfaceC17463d, i12);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: r5 */
    public void mo35582r5(ZaloView zaloView) {
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 4000) {
            if (i11 == 4002) {
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    m80891l();
                    return;
                } else {
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.zviews.br
                        @Override // java.lang.Runnable
                        public final void run() {
                            InAppNotificationView.this.m80891l();
                        }
                    });
                    return;
                }
            }
            return;
        }
        m80868D();
    }

    /* renamed from: y */
    void m80892y() {
        try {
            if (!AbstractC23057e7.m118300g(getContext())) {
                if (C23055e5.m118272g(true)) {
                    if (C20024r.m103941j()) {
                        if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f74404W.f42434r)) {
                            C20024r.m103949w();
                        } else {
                            ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        }
                    } else if (AbstractC23034c6.m118167n(getContext(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                        this.f74406b0 = true;
                        AbstractC23034c6.m118186w0(this.f74397P.m93021N0(), new String[]{"android.permission.RECORD_AUDIO"}, 117);
                    } else {
                        C2279a m120722w0 = AbstractC23306f.m120722w0();
                        ContactProfile contactProfile = this.f74404W;
                        m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f74404W.f42446v, false, 49));
                    }
                }
            } else {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    void m80893z() {
        try {
            if (AbstractC23057e7.m118300g(getContext())) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warningMsgcantuseVoiceCall));
                return;
            }
            if (C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), this.f74404W.f42434r)) {
                        C20024r.m103949w();
                        return;
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return;
                    }
                }
                Context context = getContext();
                String[] strArr = AbstractC23034c6.f112033j;
                if (AbstractC23034c6.m118167n(context, strArr) != 0) {
                    this.f74406b0 = true;
                    AbstractC23034c6.m118186w0(this.f74397P.m93021N0(), strArr, 113);
                } else {
                    C2279a m120722w0 = AbstractC23306f.m120722w0();
                    ContactProfile contactProfile = this.f74404W;
                    m120722w0.m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), this.f74404W.f42446v, true, 50));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
