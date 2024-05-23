package com.zing.zalo.shortvideo.p072ui.state;

import ac.InterfaceC0733x;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.AbstractC1759b1;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.zviews.TempShareViaView;
import com.zing.zalo.shortvideo.data.model.InAppNotification;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.shortvideo.p072ui.state.floating.FloatingManager;
import com.zing.zalo.shortvideo.p072ui.view.C10631i;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageView;
import com.zing.zalo.shortvideo.p072ui.view.NotificationChannelView;
import com.zing.zalo.shortvideo.p072ui.view.NotificationPageView;
import com.zing.zalo.shortvideo.p072ui.view.NotificationUserView;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.shortvideo.p072ui.widget.SwipeAndPullDismissLayout;
import com.zing.zalo.shortvideo.p072ui.widget.ZchInAppNotificationView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import on0.AbstractC24341v;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import p594w1.C28685a;
import pm0.AbstractC24862s;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import q10.C25033m1;
import q20.C25093p;
import qm0.AbstractC25358n;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import t20.C26465b;
import t20.InterfaceC26464a;
import u10.C26947a;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import v00.C27417l;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;

/* loaded from: classes5.dex */
public final class ZchMasterView extends ZaloView implements ZaloView.InterfaceC17421f {
    public static final C10099a Companion = new C10099a(null);

    /* renamed from: w0 */
    private C25033m1 f52485w0;

    /* renamed from: x0 */
    private boolean f52486x0;

    /* renamed from: y0 */
    private Handler f52487y0 = new Handler(Looper.getMainLooper());

    /* renamed from: z0 */
    private ZchMasterView$toastReceiver$1 f52488z0 = new BroadcastReceiver() { // from class: com.zing.zalo.shortvideo.ui.state.ZchMasterView$toastReceiver$1
        public ZchMasterView$toastReceiver$1() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            String stringExtra;
            boolean m127128x;
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if (AbstractC19074t.m100204b(str, "com.zing.zalo.zchannel.toast") && (stringExtra = intent.getStringExtra("msg")) != null) {
                m127128x = AbstractC24341v.m127128x(stringExtra);
                if (!m127128x) {
                    ZchMasterView.this.m53819UK(stringExtra, intent.getIntExtra("gravity", 17), intent.getIntExtra("xOffset", 0), intent.getIntExtra("yOffset", 0), intent.getLongExtra("duration", 2000L));
                }
            }
        }
    };

    /* renamed from: com.zing.zalo.shortvideo.ui.state.ZchMasterView$a */
    /* loaded from: classes5.dex */
    public static final class C10099a {
        private C10099a() {
        }

        public /* synthetic */ C10099a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.state.ZchMasterView$b */
    /* loaded from: classes5.dex */
    public static final class C10100b implements InterfaceC1764d0 {
        C10100b() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public void mo8524qp(InterfaceC1801w interfaceC1801w) {
            AbstractC19074t.m100208f(interfaceC1801w, "value");
            View m92656bJ = ZchMasterView.this.m92656bJ();
            if (m92656bJ != null && !AbstractC19074t.m100204b(AbstractC1759b1.m9259a(m92656bJ), interfaceC1801w)) {
                AbstractC1759b1.m9260b(m92656bJ, interfaceC1801w);
                ZchMasterView.this.m92659dJ().mo9222o(this);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.state.ZchMasterView$c */
    /* loaded from: classes5.dex */
    static final class C10101c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f52490t;

        C10101c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10101c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f52490t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    C27417l.f129055a.m140387k();
                } catch (Exception unused) {
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10101c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.state.ZchMasterView$d */
    /* loaded from: classes5.dex */
    public static final class C10102d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InAppNotification f52491q;

        /* renamed from: r */
        final /* synthetic */ ZchMasterView f52492r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC29280a f52493s;

        /* renamed from: t */
        final /* synthetic */ C25033m1 f52494t;

        /* renamed from: u */
        final /* synthetic */ boolean f52495u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10102d(InAppNotification inAppNotification, ZchMasterView zchMasterView, InterfaceC29280a interfaceC29280a, C25033m1 c25033m1, boolean z11) {
            super(1);
            this.f52491q = inAppNotification;
            this.f52492r = zchMasterView;
            this.f52493s = interfaceC29280a;
            this.f52494t = c25033m1;
            this.f52495u = z11;
        }

        /* renamed from: a */
        public final void m53829a(View view) {
            String m50969c;
            Map m131407l;
            AbstractC19074t.m100208f(view, "it");
            int m50970d = this.f52491q.m50970d();
            if (m50970d == ZchInAppNotificationView.EnumC10715a.f54217q.m55820c()) {
                if (!(this.f52492r.m92649TI().m93012K0() instanceof NotificationChannelView)) {
                    this.f52492r.m53824WK(NotificationPageView.Companion.m54582a());
                    this.f52493s.mo146302D(false);
                    NotificationReceiver.C10088a c10088a = NotificationReceiver.Companion;
                    c10088a.m53754b(false, false);
                    if (!this.f52493s.mo146304F()) {
                        this.f52493s.mo146315Q(false);
                        c10088a.m53755c(false);
                    }
                }
            } else if (m50970d == ZchInAppNotificationView.EnumC10715a.f54218r.m55820c()) {
                if (!(this.f52492r.m92649TI().m93012K0() instanceof NotificationUserView)) {
                    this.f52492r.m53824WK(NotificationPageView.Companion.m54583b());
                    this.f52493s.mo146324Z(false);
                    NotificationReceiver.C10088a c10088a2 = NotificationReceiver.Companion;
                    c10088a2.m53756d(false, false);
                    if (!this.f52493s.mo146332g()) {
                        this.f52493s.mo146315Q(false);
                        c10088a2.m53755c(false);
                    }
                }
            } else if (m50970d == ZchInAppNotificationView.EnumC10715a.f54219s.m55820c() && (m50969c = this.f52491q.m50969c()) != null) {
                this.f52492r.m53810Bt(m50969c);
            }
            this.f52494t.f120103q.m55804d(false);
            String m92652XI = this.f52492r.m92652XI(AbstractC27413h.zch_action_key_noti_banner_tap);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            int i11 = 2;
            C24860q[] c24860qArr = new C24860q[2];
            if (this.f52495u) {
                i11 = 1;
            }
            c24860qArr[0] = AbstractC24866w.m129235a("show_type", Integer.valueOf(i11));
            c24860qArr[1] = AbstractC24866w.m129235a("banner_type", Integer.valueOf(this.f52491q.m50970d()));
            m131407l = AbstractC25363p0.m131407l(c24860qArr);
            c19205a.m100713L(m92652XI, m131407l);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m53829a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: Bt */
    public final void m53810Bt(String str) {
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), str, this, null, null, null, null, 480, null);
        }
    }

    /* renamed from: NK */
    private final void m53815NK() {
        ZaloView zaloView;
        InterfaceC0733x interfaceC0733x;
        boolean m131390w;
        C17487o0 mo35579p;
        InterfaceC1801w m93012K0 = m92649TI().m93012K0();
        if (!(m93012K0 instanceof ZchBaseView.InterfaceC10622a)) {
            return;
        }
        ZchBaseView.InterfaceC10622a interfaceC10622a = (ZchBaseView.InterfaceC10622a) m93012K0;
        InterfaceC27218a m92676n2 = m92676n2();
        String str = null;
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            zaloView = mo35579p.m93012K0();
        } else {
            zaloView = null;
        }
        if (zaloView instanceof InterfaceC0733x) {
            interfaceC0733x = (InterfaceC0733x) zaloView;
        } else {
            interfaceC0733x = null;
        }
        if (interfaceC0733x != null) {
            str = interfaceC0733x.getTrackingKey();
        }
        if (!interfaceC10622a.m55554Mh() && interfaceC10622a.mo53979lz() && !(zaloView instanceof ZchMasterView)) {
            m131390w = AbstractC25358n.m131390w(new String[]{TempShareViaView.f78250n1, "ZaloWebView", "ZaloCameraView"}, str);
            if (!m131390w) {
                Map m131401f = m93012K0 instanceof LivestreamPageView ? AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 2)) : AbstractC25361o0.m131401f(AbstractC24866w.m129235a("from_item", 1));
                C19205a c19205a = C19205a.f95429a;
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_floating_interrupt);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                c19205a.m100713L(m92652XI, m131401f);
                StateManager.Companion.m53805i();
                FloatingManager.Companion.m53871m();
            }
        }
    }

    /* renamed from: QK */
    public static final void m53816QK(View view) {
    }

    /* renamed from: RK */
    private final void m53817RK() {
        EllipsizedTextView ellipsizedTextView;
        this.f52487y0.removeCallbacksAndMessages(null);
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 != null && (ellipsizedTextView = c25033m1.f120110x) != null) {
            AbstractC26112n.m134367H(ellipsizedTextView);
        }
    }

    /* renamed from: SK */
    private final void m53818SK() {
        String str;
        boolean m127128x;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("xRestoration")) {
            this.f52486x0 = true;
            StateManager.Companion.m53807k(m92649TI());
            return;
        }
        Bundle m92642L32 = m92642L3();
        Class<?> cls = null;
        if (m92642L32 != null) {
            str = m92642L32.getString("xTarget");
        } else {
            str = null;
        }
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                try {
                    Class<?> cls2 = Class.forName(str);
                    if (!ZchBaseView.class.isAssignableFrom(cls2)) {
                        cls2 = null;
                    }
                    if (cls2 instanceof Class) {
                        cls = cls2;
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (cls == null) {
                    return;
                }
                m53825XK(cls, m92642L3());
            }
        }
    }

    /* renamed from: UK */
    public final void m53819UK(String str, int i11, int i12, int i13, long j11) {
        EllipsizedTextView ellipsizedTextView;
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 != null && (ellipsizedTextView = c25033m1.f120110x) != null) {
            ViewGroup.LayoutParams layoutParams = ellipsizedTextView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i11 | 1;
                ellipsizedTextView.setLayoutParams(layoutParams2);
                ellipsizedTextView.setTranslationX(i12);
                ellipsizedTextView.setTranslationY(i13);
                ellipsizedTextView.setText(str);
                ellipsizedTextView.setVisibility(0);
                this.f52487y0.removeCallbacksAndMessages(null);
                this.f52487y0.postDelayed(new Runnable() { // from class: j20.b
                    public /* synthetic */ RunnableC20908b() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ZchMasterView.m53820VK(EllipsizedTextView.this);
                    }
                }, j11);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: VK */
    public static final void m53820VK(EllipsizedTextView ellipsizedTextView) {
        AbstractC19074t.m100208f(ellipsizedTextView, "$this_apply");
        ellipsizedTextView.setVisibility(8);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ZaloActivity zaloActivity;
        ZaloActivity zaloActivity2;
        super.mo37111CJ(bundle);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92676n2;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity != null) {
            FloatingManager.Companion.m53862d().m53858t(zaloActivity);
        }
        C10631i.Companion.m55602a().m55589D();
        StateManager.Companion.m53797a(this);
        C26947a.Companion.m138845j();
        C25093p.Companion.m130111g();
        Context m92648SI = m92648SI();
        if (m92648SI instanceof ZaloActivity) {
            zaloActivity2 = (ZaloActivity) m92648SI;
        } else {
            zaloActivity2 = null;
        }
        if (zaloActivity2 != null) {
            m92659dJ().m9219j(zaloActivity2, new C10100b());
        }
        if (bundle == null) {
            m53818SK();
        }
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), Dispatchers.m112680b(), null, new C10101c(null), 2, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout root;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25033m1 m129887c = C25033m1.m129887c(layoutInflater);
        this.f52485w0 = m129887c;
        if (m129887c != null && (root = m129887c.getRoot()) != null) {
            root.setOnClickListener(new View.OnClickListener() { // from class: j20.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZchMasterView.m53816QK(view);
                }
            });
        }
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 != null) {
            return c25033m1.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        ComponentActivity componentActivity;
        AbstractC1785o lifecycle;
        Object m92676n2 = m92676n2();
        AbstractC1785o.b bVar = null;
        if (m92676n2 instanceof ComponentActivity) {
            componentActivity = (ComponentActivity) m92676n2;
        } else {
            componentActivity = null;
        }
        if (componentActivity != null && (lifecycle = componentActivity.getLifecycle()) != null) {
            bVar = lifecycle.mo9336b();
        }
        if (bVar == AbstractC1785o.b.RESUMED) {
            C10631i.Companion.m55602a().m55599O();
        }
        C10631i.Companion.m55602a().m55591G();
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        this.f52485w0 = null;
        super.mo37484JJ();
    }

    /* renamed from: OK */
    public final boolean m53821OK() {
        SwipeAndPullDismissLayout swipeAndPullDismissLayout;
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 == null || (swipeAndPullDismissLayout = c25033m1.f120103q) == null || swipeAndPullDismissLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        m53818SK();
    }

    /* renamed from: PK */
    public final boolean m53822PK(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "view");
        return AbstractC19074t.m100204b(m92649TI().m93012K0(), zaloView);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        C10631i.Companion.m55602a().m55593I();
        C28685a.m143693b(m92689tK()).m143697e(this.f52488z0);
        m53817RK();
        super.mo13886RJ();
    }

    /* renamed from: TK */
    public final void m53823TK(InAppNotification inAppNotification, boolean z11) {
        Map m131407l;
        AbstractC19074t.m100208f(inAppNotification, "data");
        if (m92649TI().m93012K0() instanceof NotificationPageView) {
            return;
        }
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 != null) {
            c25033m1.f120103q.m55804d(false);
            ZchInAppNotificationView zchInAppNotificationView = c25033m1.f120104r;
            zchInAppNotificationView.m55818b(inAppNotification);
            InterfaceC29280a m143681o = AbstractC28684a.Companion.m143681o();
            AbstractC19074t.m100205c(zchInAppNotificationView);
            AbstractC26112n.m134407k0(zchInAppNotificationView, new C10102d(inAppNotification, this, m143681o, c25033m1, z11));
            c25033m1.f120103q.m55806f(500L, inAppNotification.m50971e());
        }
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_noti_banner);
        C19205a c19205a = C19205a.f95429a;
        AbstractC19074t.m100205c(m92652XI);
        int i11 = 2;
        C24860q[] c24860qArr = new C24860q[2];
        if (z11) {
            i11 = 1;
        }
        c24860qArr[0] = AbstractC24866w.m129235a("show_type", Integer.valueOf(i11));
        c24860qArr[1] = AbstractC24866w.m129235a("banner_type", Integer.valueOf(inAppNotification.m50970d()));
        m131407l = AbstractC25363p0.m131407l(c24860qArr);
        c19205a.m100713L(m92652XI, m131407l);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C10631i.Companion.m55602a().m55596L();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        C10631i.Companion.m55602a().m55598N();
        m53815NK();
        super.mo37712VJ();
    }

    /* renamed from: WK */
    public final void m53824WK(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "view");
        m92649TI().m93060e2(AbstractC27409d.masterFrame, zaloView, null, 1, true);
    }

    /* renamed from: XK */
    public final void m53825XK(Class cls, Bundle bundle) {
        AbstractC19074t.m100208f(cls, "klass");
        m92649TI().m93062f2(AbstractC27409d.masterFrame, cls, bundle, 1, true);
    }

    /* renamed from: YK */
    public final void m53826YK(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "view");
        m92649TI().m93060e2(AbstractC27409d.masterFrame, zaloView, null, 2, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        SwipeAndPullDismissLayout swipeAndPullDismissLayout;
        ViewGroup.LayoutParams layoutParams;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (!AbstractC19074t.m100204b(AbstractC1759b1.m9259a(view), m92657cJ())) {
            AbstractC1759b1.m9260b(view, m92657cJ());
        }
        InterfaceC26464a m136378a = C26465b.f125661a.m136378a();
        if (m136378a != null) {
            m136378a.mo17389a(view);
        }
        C25033m1 c25033m1 = this.f52485w0;
        if (c25033m1 != null && (swipeAndPullDismissLayout = c25033m1.f120103q) != null) {
            SwipeAndPullDismissLayout swipeAndPullDismissLayout2 = null;
            if (c25033m1 != null && swipeAndPullDismissLayout != null) {
                layoutParams = swipeAndPullDismissLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, AbstractC26112n.m134365F(swipeAndPullDismissLayout) + AbstractC26105g.m134347n(8), 0, 0);
            C25033m1 c25033m12 = this.f52485w0;
            if (c25033m12 != null) {
                swipeAndPullDismissLayout2 = c25033m12.f120103q;
            }
            if (swipeAndPullDismissLayout2 != null) {
                swipeAndPullDismissLayout2.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if ((m93012K0 != null && m93012K0.onKeyUp(i11, keyEvent)) || m92649TI().m93018M0() > 1) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m53817RK();
        C28685a.m143693b(m92689tK()).m143695c(this.f52488z0, new IntentFilter("com.zing.zalo.zchannel.toast"));
    }
}
