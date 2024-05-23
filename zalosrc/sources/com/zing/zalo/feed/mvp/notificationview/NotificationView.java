package com.zing.zalo.feed.mvp.notificationview;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C2287g;
import aq.C2288h;
import aq.InterfaceC2283c;
import aq.InterfaceC2284d;
import ar.AbstractC2298a0;
import ar.C2297a;
import ar.C2300b0;
import ar.C2304e;
import ar.C2306g;
import ar.C2308i;
import ar.C2316q;
import ar.C2318s;
import ar.C2320u;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.NotificationBasicInfo;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.mvp.notificationview.NotificationView;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetSettingView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.uicontrol.Snackbar;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import en0.InterfaceC18494a;
import ho0.AbstractC20110a;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23136l9;
import p172fy.C19171b;
import p205hc.C19964c;
import p354n3.C23528a;
import p363nh.C23744a;
import p458qr.C25479l;
import p458qr.C25485r;
import p509sp.C26359h;
import p510sq.C26365a;
import p653xp.C30190a;
import p716zh.C31877d;
import p716zh.C32002l4;
import p716zh.C32078q7;
import p724zp.C32541a;
import v20.C27484l;

/* loaded from: classes4.dex */
public class NotificationView extends SlidableZaloView implements InterfaceC2284d, C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    private SwipeRefreshListView f46409P0;

    /* renamed from: Q0 */
    private RecyclerView f46410Q0;

    /* renamed from: R0 */
    private LinearLayoutManager f46411R0;

    /* renamed from: S0 */
    private MultiStateView f46412S0;

    /* renamed from: T0 */
    private C27484l f46413T0;

    /* renamed from: U0 */
    private C23528a f46414U0;

    /* renamed from: V0 */
    private InterfaceC2283c f46415V0;

    /* renamed from: W0 */
    private C32541a f46416W0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationview.NotificationView$a */
    /* loaded from: classes4.dex */
    public class C8621a implements C27484l.a {
        C8621a() {
        }

        @Override // v20.C27484l.a
        /* renamed from: a */
        public void mo45895a(int i11, C32078q7 c32078q7, View view) {
            NotificationView.this.f46415V0.mo12023Ei(i11);
        }

        @Override // v20.C27484l.a
        /* renamed from: b */
        public void mo45896b(C32078q7 c32078q7) {
            NotificationView.this.f46415V0.mo12030Wn(c32078q7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationview.NotificationView$b */
    /* loaded from: classes4.dex */
    public class C8622b extends RecyclerView.AbstractC1892s {
        C8622b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                try {
                    NotificationView.this.f46413T0.m10008p();
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    return;
                }
            }
            if (i11 != 0) {
                NotificationView.this.f46409P0.m88202K();
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.notificationview.NotificationView$c */
    /* loaded from: classes4.dex */
    class C8623c implements C22033k0.i {

        /* renamed from: a */
        final /* synthetic */ View f46419a;

        /* renamed from: b */
        final /* synthetic */ boolean f46420b;

        /* renamed from: c */
        final /* synthetic */ int f46421c;

        /* renamed from: d */
        final /* synthetic */ C32078q7 f46422d;

        /* renamed from: com.zing.zalo.feed.mvp.notificationview.NotificationView$c$a */
        /* loaded from: classes4.dex */
        class a implements AbstractC22055v0.j {
            a() {
            }

            @Override // l30.AbstractC22055v0.j
            public int getPopulatePosition() {
                return 1;
            }

            @Override // l30.AbstractC22055v0.j
            public C16719g getThumbModule() {
                return null;
            }

            @Override // l30.AbstractC22055v0.j
            public int getThumbRoundCorner() {
                return 0;
            }

            @Override // l30.AbstractC22055v0.j
            public View getThumbView() {
                View mo9732P = NotificationView.this.f46411R0.mo9732P(C8623c.this.f46421c);
                if (mo9732P != null) {
                    return mo9732P.findViewById(AbstractC6918a0.thumb_action_item);
                }
                return null;
            }
        }

        C8623c(View view, boolean z11, int i11, C32078q7 c32078q7) {
            this.f46419a = view;
            this.f46420b = z11;
            this.f46421c = i11;
            this.f46422d = c32078q7;
        }

        @Override // l30.C22033k0.i
        /* renamed from: O */
        public void mo45897O() {
            try {
                if (NotificationView.this.f46413T0 != null) {
                    NotificationView.this.f46413T0.m10008p();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // l30.C22033k0.i
        /* renamed from: a */
        public void mo45898a(String str, C22033k0.g gVar) {
            if (NotificationView.this.m92672lJ() && NotificationView.this.m92687sJ()) {
                ToastUtils.showMess(str);
            }
            if (gVar == C22033k0.g.ERROR_CODE_STORY_DELETED_OR_EXPIRED) {
                NotificationView.this.f46415V0.mo12029Um(this.f46422d.m154769z());
            }
            mo45897O();
        }

        @Override // l30.C22033k0.i
        /* renamed from: b */
        public void mo45899b(Bundle bundle, C22033k0.h hVar) {
            if (NotificationView.this.m92672lJ() && NotificationView.this.m92687sJ() && hVar != null && this.f46419a != null) {
                bundle.putBoolean("extra_show_list_viewer", this.f46420b);
                a aVar = new a();
                bundle.putInt("srcType", 339);
                AbstractC22055v0.m115127Q(hVar, aVar, NotificationView.this.f72421L0.m92676n2(), bundle, 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationview.NotificationView$d */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8624d {

        /* renamed from: a */
        static final /* synthetic */ int[] f46425a;

        static {
            int[] iArr = new int[C32541a.b.values().length];
            f46425a = iArr;
            try {
                iArr[C32541a.b.f150325q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46425a[C32541a.b.f150326r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46425a[C32541a.b.f150329u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46425a[C32541a.b.f150328t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46425a[C32541a.b.f150327s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46425a[C32541a.b.f150330v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public /* synthetic */ void m45869AM(List list) {
        C27484l c27484l = this.f46413T0;
        if (c27484l != null) {
            c27484l.m140575P(list);
            this.f46413T0.m10008p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m45870BM(C25479l c25479l, View view) {
        this.f46415V0.mo12036xm(c25479l.m131963a());
    }

    /* renamed from: CM */
    private void m45871CM() {
        m45872DM();
        m45873EM();
    }

    /* renamed from: DM */
    private void m45872DM() {
        this.f46416W0.m157542b0().m9219j(this, new InterfaceC1764d0() { // from class: aq.i
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                NotificationView.this.m45891xM((Boolean) obj);
            }
        });
    }

    /* renamed from: EM */
    private void m45873EM() {
        this.f46416W0.m157540Z().m9219j(this, new InterfaceC1764d0() { // from class: aq.l
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                NotificationView.this.m45893zM((C19964c) obj);
            }
        });
    }

    /* renamed from: sM */
    private void m45886sM(Intent intent) {
        if (intent.hasExtra("setting_notification_result")) {
            int i11 = C8624d.f46425a[((C32541a.b) intent.getSerializableExtra("setting_notification_result")).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f46415V0.mo12022Ci();
                            return;
                        }
                        return;
                    }
                    this.f46415V0.mo12031ca(intent.getStringExtra("user_id"));
                    return;
                }
                this.f46415V0.mo12035vm(intent.getStringExtra("feed_id"));
                return;
            }
            this.f46415V0.mo12034id(intent.getLongExtra("notification_id", 0L));
        }
    }

    /* renamed from: tM */
    private void m45887tM(View view) {
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f46409P0 = swipeRefreshListView;
        swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: aq.j
            @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
            /* renamed from: a */
            public final void mo12137a() {
                NotificationView.this.m45888uM();
            }
        });
        MultiStateView multiStateView = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        this.f46412S0 = multiStateView;
        multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.empty_list));
        this.f46412S0.setLoadingString(AbstractC23136l9.m118743r0(AbstractC8020f0.PROCESSING));
        this.f46412S0.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: aq.k
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                NotificationView.this.m45889vM();
            }
        });
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        this.f46411R0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        C27484l c27484l = new C27484l(getContext());
        this.f46413T0 = c27484l;
        c27484l.m140576R(new C8621a());
        RecyclerView recyclerView = this.f46409P0.f83582p0;
        this.f46410Q0 = recyclerView;
        recyclerView.setLayoutManager(this.f46411R0);
        this.f46410Q0.setOverScrollMode(2);
        this.f46410Q0.setVisibility(0);
        this.f46410Q0.setAdapter(this.f46413T0);
        this.f46410Q0.setBackgroundResource(AbstractC16803z.rectangle_white);
        this.f46410Q0.m9826E(new C8622b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m45888uM() {
        this.f46415V0.mo12024M7(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m45889vM() {
        this.f46415V0.mo12028Sc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static /* synthetic */ String m45890wM(Boolean bool) {
        return "Receive loading state: " + bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m45891xM(final Boolean bool) {
        if (bool.booleanValue()) {
            mo46829Y();
        } else {
            mo49315c4();
        }
        C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_NOTIFICATION_VIEW", new InterfaceC18494a() { // from class: aq.o
            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public final Object mo12V4() {
                String m45890wM;
                m45890wM = NotificationView.m45890wM(bool);
                return m45890wM;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static /* synthetic */ String m45892yM(C32541a.d dVar) {
        return "Receive result: " + dVar.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public /* synthetic */ void m45893zM(C19964c c19964c) {
        final C32541a.d dVar = (C32541a.d) c19964c.m103749a();
        if (dVar != null) {
            int i11 = C8624d.f46425a[dVar.m157551a().ordinal()];
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        this.f46415V0.mo12037yf(dVar.m157552b().m40641e());
                    }
                } else {
                    this.f46415V0.mo12026Mg(dVar.m157552b().m40639c());
                }
            } else {
                this.f46415V0.mo12022Ci();
            }
            C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_NOTIFICATION_VIEW", new InterfaceC18494a() { // from class: aq.p
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m45892yM;
                    m45892yM = NotificationView.m45892yM(C32541a.d.this);
                    return m45892yM;
                }
            });
        }
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: A0 */
    public void mo12038A0(C26365a c26365a) {
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), c26365a, 0, 1));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f46414U0 = new C23528a(m92648SI());
        m92637BK(true);
        C2287g c2287g = new C2287g(this, C2288h.m12125s());
        this.f46415V0 = c2287g;
        c2287g.mo995Nd(null, null);
        C32541a c32541a = (C32541a) new C1802w0(this, new C32541a.a()).m9378a(C32541a.class);
        this.f46416W0 = c32541a;
        c32541a.m157538X(C32002l4.m154264g(10028));
        m45871CM();
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Ce */
    public void mo12039Ce(C2300b0 c2300b0) {
        AbstractC2298a0.m12153e(c2300b0, m92676n2(), m92648SI(), 0);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Di */
    public void mo12040Di(C32078q7 c32078q7) {
        if (mo45894h0() && !TextUtils.isEmpty(c32078q7.f147756V)) {
            m78959pL(c32078q7.f147756V, c32078q7.f147757W, 5, new C31877d(new TrackingSource(15)));
        }
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: EG */
    public void mo12041EG(boolean z11, boolean z12) {
        MultiStateView.EnumC15914e enumC15914e;
        if (!mo45894h0()) {
            return;
        }
        SwipeRefreshListView swipeRefreshListView = this.f46409P0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(z11);
            this.f46409P0.m88202K();
        }
        MultiStateView multiStateView = this.f46412S0;
        if (multiStateView != null) {
            if (z11) {
                multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            } else {
                if (z12) {
                    enumC15914e = MultiStateView.EnumC15914e.CONTENT;
                } else {
                    enumC15914e = MultiStateView.EnumC15914e.EMPTY;
                }
                multiStateView.setState(enumC15914e);
            }
        }
        if (z12) {
            AbstractC23136l9.m118744r1(this.f46409P0, 0);
            AbstractC23136l9.m118744r1(this.f46412S0, 8);
        } else {
            AbstractC23136l9.m118744r1(this.f46409P0, 8);
            AbstractC23136l9.m118744r1(this.f46412S0, 0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            int i11 = AbstractC16803z.icon_header_settings;
            actionBarMenu.m92738e(i11, i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.notification_page_view, viewGroup, false);
        m45887tM(inflate);
        return inflate;
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Hs */
    public void mo12042Hs(C2308i c2308i) {
        AbstractC2298a0.m12152d(c2308i, m92662fJ(), 1);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Im */
    public void mo12043Im(C2304e c2304e) {
        AbstractC2298a0.m12152d(c2304e, m92662fJ(), 1);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: J5 */
    public void mo12044J5(int i11, C32078q7 c32078q7, boolean z11) {
        try {
            if (!mo45894h0()) {
                return;
            }
            C22033k0.m115006h().m115017q(3, c32078q7, new C8623c(this.f46411R0.mo9732P(i11), z11, i11, c32078q7));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 6005);
        C23744a.m124114c().m124117e(this, 6042);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        SwipeRefreshListView swipeRefreshListView;
        if (super.mo37488Li() && (swipeRefreshListView = this.f46409P0) != null && !swipeRefreshListView.m35363j()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        this.f46415V0.mo12024M7(0L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC16803z.icon_header_settings) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SETTING_ID", 14);
            bundle.putBoolean("EXTRA_BOL_PRIVACY", false);
            m92662fJ().m93069k2(BottomSheetSettingView.class, bundle, 1, true);
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Rc */
    public void mo12045Rc(C32078q7 c32078q7) {
        this.f46416W0.m157548n0(new NotificationBasicInfo(c32078q7));
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: T6 */
    public void mo12046T6() {
        this.f46416W0.m157545k0();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.more_title_notification));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: V9 */
    public void mo12047V9(C32078q7 c32078q7) {
        if (mo45894h0() && !TextUtils.isEmpty(c32078q7.f147759Y)) {
            m78959pL(c32078q7.f147759Y, c32078q7.f147760Z, 5, new C31877d(new TrackingSource(15)));
        }
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: Z3 */
    public void mo12048Z3(C2297a c2297a) {
        AbstractC2298a0.m12152d(c2297a, m92662fJ(), 0);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: c6 */
    public void mo12049c6(final List list) {
        if (!mo45894h0()) {
            return;
        }
        this.f72827B0.post(new Runnable() { // from class: aq.n
            @Override // java.lang.Runnable
            public final void run() {
                NotificationView.this.m45869AM(list);
            }
        });
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: ez */
    public void mo12050ez(C2320u c2320u) {
        AbstractC2298a0.m12152d(c2320u, m92662fJ(), 0);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: fC */
    public void mo12051fC(C2318s c2318s) {
        AbstractC2298a0.m12153e(c2318s, m92676n2(), m92648SI(), 0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "NotificationView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p205hc.InterfaceC19970i
    /* renamed from: h0 */
    public boolean mo45894h0() {
        return !mo60294yp();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str;
        try {
            if (i11 == 1 && i12 == -1) {
                Bundle extras = intent.getExtras();
                boolean z11 = false;
                String str2 = "";
                if (extras == null) {
                    str = "";
                } else {
                    String string = extras.getString("feedId", "");
                    String string2 = extras.getString("photoId", "");
                    z11 = extras.getBoolean("deleted", false);
                    str = string2;
                    str2 = string;
                }
                this.f46415V0.mo12025M9(str2, str, z11);
            } else if (i11 == 2 && i12 == -1) {
                this.f46415V0.mo12027Pe(intent.getStringArrayListExtra("EXTRA_RESULT_UPDATE_SEEN_STORIES"));
            } else if (i11 == 3 && i12 == -1) {
                m45886sM(intent);
            }
            super.onActivityResult(i11, i12, intent);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: ov */
    public void mo12052ov(C2316q c2316q) {
        AbstractC2298a0.m12152d(c2316q, m92662fJ(), 0);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: r9 */
    public void mo12053r9(C32078q7 c32078q7) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 11);
        bundle.putParcelable("notification_item", new NotificationBasicInfo(c32078q7));
        bundle.putString("extra_entry_point_flow", C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154277l());
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 3, 1, true);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: ry */
    public void mo12054ry() {
        this.f46416W0.m157544j0();
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: t7 */
    public void mo12055t7(C2306g c2306g) {
        AbstractC2298a0.m12153e(c2306g, m92676n2(), m92648SI(), 0);
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: wh */
    public void mo12056wh(int i11, boolean z11) {
        boolean z12;
        MultiStateView.EnumC15915f enumC15915f;
        int i12;
        if (!mo45894h0()) {
            return;
        }
        if (i11 == 50001) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
        } else {
            enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
        }
        MultiStateView multiStateView = this.f46412S0;
        if (multiStateView != null) {
            if (z12) {
                i12 = AbstractC8020f0.NETWORK_ERROR_MSG;
            } else {
                i12 = AbstractC8020f0.notification_error;
            }
            multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i12));
            this.f46412S0.setErrorType(enumC15915f);
            this.f46412S0.setState(MultiStateView.EnumC15914e.ERROR);
        }
        SwipeRefreshListView swipeRefreshListView = this.f46409P0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(false);
            if (z11) {
                this.f46409P0.m88209V();
            }
        }
        if (z11) {
            AbstractC23136l9.m118744r1(this.f46409P0, 0);
            AbstractC23136l9.m118744r1(this.f46412S0, 8);
        } else {
            AbstractC23136l9.m118744r1(this.f46409P0, 8);
            AbstractC23136l9.m118744r1(this.f46412S0, 0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        try {
            if (i11 != 6005) {
                if (i11 == 6042 && objArr != null) {
                    if (objArr.length > 0) {
                        Object obj = objArr[0];
                        if (obj instanceof String) {
                            this.f46415V0.mo12032cc((String) obj);
                        }
                    }
                }
            } else {
                this.f46415V0.mo12033gm();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f46415V0.mo12028Sc();
    }

    @Override // aq.InterfaceC2284d
    /* renamed from: zF */
    public void mo12057zF(final C25479l c25479l) {
        Snackbar m148857b = C30190a.f140233a.m148857b(m92656bJ(), new View.OnClickListener() { // from class: aq.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationView.this.m45870BM(c25479l, view);
            }
        }, c25479l);
        if (m148857b != null) {
            C25485r.f122083a.m132024f(m148857b, AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(12.0f) * 2));
            m148857b.m88019B();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 6005);
        C23744a.m124114c().m124115b(this, 6042);
    }
}
