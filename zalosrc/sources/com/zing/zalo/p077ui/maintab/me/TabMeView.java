package com.zing.zalo.p077ui.maintab.me;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0815e1;
import ah0.C0860a;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bo.C2972f2;
import bo.C2973f3;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.business_account.business_tools.BusinessToolsActivationView;
import com.zing.zalo.business_account.business_tools.BusinessToolsView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.me.C12159b;
import com.zing.zalo.p077ui.maintab.me.TabMeAdapter;
import com.zing.zalo.p077ui.maintab.me.TabMeView;
import com.zing.zalo.p077ui.maintab.widget.MainTabChildView;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.settings.SettingPrivateV2View;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zalocloud.recover.C16888a;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fi.C18953k;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import is.C20795g;
import is.EnumC20799i;
import j30.C20912a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23179p8;
import me0.AbstractC23211s7;
import me0.C23212s8;
import mg0.AbstractC23291c;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import nh0.C23793c;
import o70.C24099q0;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p055ce.C3432a;
import p055ce.C3433b;
import p131ei.C18434b;
import p133ek.AbstractC18458a;
import p140ev.C18613b;
import p140ev.C18620i;
import p163fl.C18989a;
import p172fy.C19171b;
import p262jb.AbstractC21196a;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p320ld.C22438j;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p363nh.C23744a;
import p479rc.C25727d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p649xl.C30038sd;
import p716zh.C31862c;
import p716zh.C31877d;
import p716zh.C32002l4;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24865v;
import pm0.InterfaceC24854k;
import qe0.AbstractC25251g;
import qh0.C25287a;
import qh0.C25288b;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.C25345g0;
import r70.AbstractC25672d;
import r70.C25669a;
import r70.C25670b;
import r70.C25673e;
import r70.C25687s;
import sy.AbstractC26412d;
import tb0.C26626l;
import tg0.C26676b;
import v50.C27870vb;
import vg.AbstractC28025b8;
import vg.AbstractC28207v1;
import vg.C28035c8;
import vg.C28203u6;
import vg.C28212v6;
import vg.InterfaceC28231x7;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.AbstractC28982e;
import wg0.C28989l;
import wg0.InterfaceC28990m;
import wm0.AbstractC29104l;
import za0.C31747a;

/* loaded from: classes5.dex */
public final class TabMeView extends MainTabChildView implements MainTabView.InterfaceC12111i, C23744a.c, InterfaceC0733x {
    public static final C12144a Companion = new C12144a(null);

    /* renamed from: M0 */
    private String f63398M0;

    /* renamed from: N0 */
    private boolean f63399N0;

    /* renamed from: O0 */
    private boolean f63400O0;

    /* renamed from: P0 */
    private List f63401P0;

    /* renamed from: Q0 */
    private C31862c f63402Q0;

    /* renamed from: R0 */
    private C30038sd f63403R0;

    /* renamed from: S0 */
    private TabMeAdapter f63404S0;

    /* renamed from: T0 */
    private TooltipView f63405T0;

    /* renamed from: U0 */
    private Handler f63406U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f63407V0;

    /* renamed from: W0 */
    private final InterfaceC24854k f63408W0;

    /* renamed from: X0 */
    private AbstractC28981d f63409X0;

    /* renamed from: Y0 */
    private AbstractC23291c f63410Y0;

    /* renamed from: Z0 */
    private ZaloCloudRecoverCloudMediaWorker.AbstractC16884f f63411Z0;

    /* renamed from: a1 */
    private int f63412a1;

    /* renamed from: b1 */
    private C18434b.d f63413b1;

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$a */
    /* loaded from: classes5.dex */
    public static final class C12144a {
        private C12144a() {
        }

        public /* synthetic */ C12144a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$b */
    /* loaded from: classes5.dex */
    public static final class C12145b implements TooltipView.InterfaceC16938b {

        /* renamed from: b */
        final /* synthetic */ C28212v6 f63415b;

        C12145b(C28212v6 c28212v6) {
            this.f63415b = c28212v6;
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            if (TabMeView.this.f63405T0 == tooltipView) {
                TabMeView.this.f63405T0 = null;
            }
            AbstractC28025b8.m141463s(this.f63415b, i11, i12);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$c */
    /* loaded from: classes5.dex */
    public static final class C12146c implements InterfaceC20094a {
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            if (obj != null) {
                try {
                    ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                    String str = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    if (str.length() > 0) {
                        C7960e.m41971c6().m42221O7(contactProfile, false);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$d */
    /* loaded from: classes5.dex */
    public static final class C12147d extends AbstractC19075u implements InterfaceC18505l {
        C12147d() {
            super(1);
        }

        /* renamed from: a */
        public final void m67964a(long j11) {
            C26626l.m136659W(C26626l.Companion.m136712a(), TabMeView.this.m92693xK(), TabMeView.this.m92692wK(), j11, true, false, false, 48, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m67964a(((Number) obj).longValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$e */
    /* loaded from: classes5.dex */
    public static final class C12148e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12148e f63417q = new C12148e();

        C12148e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m67965a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m67965a() {
            C22438j.m115954w(C13958c.b.f71925q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$f */
    /* loaded from: classes5.dex */
    public static final class C12149f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12149f f63418q = new C12149f();

        C12149f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m67966a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m67966a() {
            C26626l.m136689z(C26626l.Companion.m136712a(), true, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$g */
    /* loaded from: classes5.dex */
    public static final class C12150g extends AbstractC19075u implements InterfaceC18494a {
        C12150g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m67967a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m67967a() {
            InterfaceC27218a m92676n2 = TabMeView.this.m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(ZCloudHomeView.class, null, 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$h */
    /* loaded from: classes5.dex */
    public static final class C12151h implements C18434b.d {
        C12151h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m67969c(TabMeView tabMeView) {
            AbstractC19074t.m100208f(tabMeView, "this$0");
            tabMeView.m67955FN();
        }

        @Override // p131ei.C18434b.d
        /* renamed from: a */
        public void mo47509a(int i11, List list) {
            Object m131207g0;
            AbstractC19074t.m100208f(list, "result");
            try {
                TabMeView tabMeView = TabMeView.this;
                m131207g0 = AbstractC25332a0.m131207g0(list, 0);
                tabMeView.f63402Q0 = (C31862c) m131207g0;
                final TabMeView tabMeView2 = TabMeView.this;
                tabMeView2.mo70710wy(new Runnable() { // from class: r70.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabMeView.C12151h.m67969c(TabMeView.this);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$i */
    /* loaded from: classes5.dex */
    public static final class C12152i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f63421t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$i$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f63423t;

            /* renamed from: u */
            private /* synthetic */ Object f63424u;

            /* renamed from: v */
            final /* synthetic */ TabMeView f63425v;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32765a extends AbstractC29104l implements InterfaceC18511r {

                /* renamed from: t */
                int f63426t;

                /* renamed from: u */
                /* synthetic */ Object f63427u;

                /* renamed from: v */
                /* synthetic */ Object f63428v;

                /* renamed from: w */
                /* synthetic */ Object f63429w;

                C32765a(Continuation continuation) {
                    super(4, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f63426t == 0) {
                        AbstractC24862s.m129228b(obj);
                        return new C24865v((AbstractC28981d) this.f63427u, (AbstractC23291c) this.f63428v, (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) this.f63429w);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18511r
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo49340Uc(AbstractC28981d abstractC28981d, AbstractC23291c abstractC23291c, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, Continuation continuation) {
                    C32765a c32765a = new C32765a(continuation);
                    c32765a.f63427u = abstractC28981d;
                    c32765a.f63428v = abstractC23291c;
                    c32765a.f63429w = abstractC16884f;
                    return c32765a.mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$i$a$b */
            /* loaded from: classes5.dex */
            public static final class b implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ TabMeView f63430p;

                /* renamed from: q */
                final /* synthetic */ CoroutineScope f63431q;

                b(TabMeView tabMeView, CoroutineScope coroutineScope) {
                    this.f63430p = tabMeView;
                    this.f63431q = coroutineScope;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C24865v c24865v, Continuation continuation) {
                    Iterable m131194T0;
                    Object obj;
                    AbstractC28981d abstractC28981d;
                    AbstractC20110a.f98889a.m104564x("CommonZaloview").mo104556o(8, "TabMeState: Onboarding State-" + c24865v.m129232d() + ", Change key State-" + c24865v.m129233e() + ", Recover State-" + c24865v.m129234f(), new Object[0]);
                    AbstractC23291c abstractC23291c = (AbstractC23291c) c24865v.m129233e();
                    AbstractC28981d abstractC28981d2 = (AbstractC28981d) c24865v.m129232d();
                    ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f = (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f) c24865v.m129234f();
                    TabMeAdapter tabMeAdapter = this.f63430p.f63404S0;
                    C24848g0 c24848g0 = null;
                    TabMeAdapter tabMeAdapter2 = null;
                    if (tabMeAdapter == null) {
                        AbstractC19074t.m100223u("adapter");
                        tabMeAdapter = null;
                    }
                    m131194T0 = AbstractC25332a0.m131194T0(tabMeAdapter.m67855M());
                    Iterator it = m131194T0.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            C25345g0 c25345g0 = (C25345g0) obj;
                            if (((AbstractC25672d) c25345g0.m131264b()).m132556a() == 5) {
                                Object m131264b = c25345g0.m131264b();
                                AbstractC19074t.m100206d(m131264b, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.me.SettingData");
                                if (((C25673e) m131264b).m132568h() == EnumC20799i.f102200A) {
                                    break;
                                }
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C25345g0 c25345g02 = (C25345g0) obj;
                    if (c25345g02 != null) {
                        TabMeView tabMeView = this.f63430p;
                        if (!(abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) && !(abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d)) {
                            tabMeView.f63411Z0 = abstractC16884f;
                            Object m131264b2 = c25345g02.m131264b();
                            AbstractC19074t.m100206d(m131264b2, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.me.SettingData");
                            tabMeView.m67902RM((C25673e) m131264b2);
                        } else if (!(abstractC23291c instanceof AbstractC23291c.b) && !(abstractC23291c instanceof AbstractC23291c.d)) {
                            tabMeView.f63410Y0 = abstractC23291c;
                            Object m131264b3 = c25345g02.m131264b();
                            AbstractC19074t.m100206d(m131264b3, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.me.SettingData");
                            tabMeView.m67901QM((C25673e) m131264b3);
                        } else {
                            if (abstractC28981d2.m144697d() && !(abstractC28981d2 instanceof AbstractC28981d.e)) {
                                abstractC28981d = new AbstractC28981d.e(-1, new InterfaceC28990m[0]);
                            } else {
                                abstractC28981d = abstractC28981d2;
                            }
                            if (!AbstractC28982e.m144700a(abstractC28981d, tabMeView.f63409X0) && AbstractC19074t.m100204b(tabMeView.f63410Y0, abstractC23291c) && AbstractC19074t.m100204b(tabMeView.f63411Z0, abstractC16884f)) {
                                return C24848g0.f119245a;
                            }
                            int m144695b = (int) (abstractC28981d.m144695b() * 100.0f);
                            if (!(abstractC28981d instanceof AbstractC28981d.b) || tabMeView.f63412a1 != m144695b) {
                                tabMeView.f63410Y0 = abstractC23291c;
                                tabMeView.f63409X0 = abstractC28981d;
                                tabMeView.f63411Z0 = abstractC16884f;
                                tabMeView.f63412a1 = m144695b;
                                Object m131264b4 = c25345g02.m131264b();
                                AbstractC19074t.m100206d(m131264b4, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.me.SettingData");
                                tabMeView.m67899PM((C25673e) m131264b4);
                            } else {
                                return C24848g0.f119245a;
                            }
                        }
                        TabMeAdapter tabMeAdapter3 = tabMeView.f63404S0;
                        if (tabMeAdapter3 == null) {
                            AbstractC19074t.m100223u("adapter");
                        } else {
                            tabMeAdapter2 = tabMeAdapter3;
                        }
                        tabMeAdapter2.m10009q(c25345g02.m131263a());
                        c24848g0 = C24848g0.f119245a;
                    }
                    if (c24848g0 == null) {
                        TabMeView tabMeView2 = this.f63430p;
                        tabMeView2.f63410Y0 = abstractC23291c;
                        tabMeView2.f63409X0 = abstractC28981d2;
                        tabMeView2.f63411Z0 = abstractC16884f;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TabMeView tabMeView, Continuation continuation) {
                super(2, continuation);
                this.f63425v = tabMeView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f63425v, continuation);
                aVar.f63424u = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f63423t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f63424u;
                    Flow m113293k = FlowKt.m113293k(C28989l.Companion.m144769a().m144765r(), C25727d.Companion.m132783f(), ZaloCloudRecoverCloudMediaWorker.Companion.m90201h(), new C32765a(null));
                    b bVar = new b(this.f63425v, coroutineScope);
                    this.f63423t = 1;
                    if (m113293k.mo97893a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C12152i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C12152i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f63421t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = TabMeView.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(TabMeView.this, null);
                this.f63421t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C12152i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$j */
    /* loaded from: classes5.dex */
    public static final class C12153j implements TabMeAdapter.InterfaceC12140b {

        /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$j$a */
        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f63433a;

            static {
                int[] iArr = new int[EnumC20799i.values().length];
                try {
                    iArr[EnumC20799i.f102205s.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC20799i.f102206t.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC20799i.f102204r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC20799i.f102210x.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC20799i.f102211y.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC20799i.f102207u.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC20799i.f102208v.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC20799i.f102209w.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC20799i.f102212z.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC20799i.f102200A.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC20799i.f102203q.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                f63433a = iArr;
            }
        }

        C12153j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m67975f(TabMeView tabMeView) {
            AbstractC19074t.m100208f(tabMeView, "this$0");
            tabMeView.m67955FN();
        }

        @Override // com.zing.zalo.p077ui.maintab.me.SettingItemNewView.InterfaceC12137a
        /* renamed from: a */
        public void mo67853a(C25673e c25673e) {
            AbstractC19074t.m100208f(c25673e, "settingData");
            switch (a.f63433a[c25673e.m132568h().ordinal()]) {
                case 1:
                    TabMeView.this.m67873BN();
                    break;
                case 2:
                    TabMeView.this.m67950xN();
                    break;
                case 3:
                    TabMeView.this.m67900Pi();
                    break;
                case 4:
                    TabMeView.this.m67906TM();
                    break;
                case 5:
                    InterfaceC27218a m92692wK = TabMeView.this.m92692wK();
                    AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                    AbstractC3439h.m17286t(m92692wK, 120);
                    break;
                case 6:
                    TabMeView.this.m67942tN();
                    break;
                case 7:
                    TabMeView.this.m67952yN();
                    break;
                case 8:
                    TabMeView.this.m67954zN();
                    break;
                case 9:
                    TabMeView.this.m67877DN();
                    break;
                case 10:
                    TabMeView.this.m67939rN();
                    break;
            }
            TabMeView.this.m67959YM(c25673e);
            if (c25673e.m132580t() != 5) {
                TabMeView.this.m67957QN();
            }
            C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open_item", new String[0]).m123926s(String.valueOf(c25673e.m132574n()), String.valueOf(c25673e.m132572l()), String.valueOf(c25673e.m132568h().m108530d())), false);
        }

        @Override // com.zing.zalo.p077ui.maintab.me.UserInfoItemView.InterfaceC12157a
        /* renamed from: b */
        public void mo67976b() {
            C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open_switch_account", new String[0]), false);
            TabMeView.this.m67875CN();
        }

        @Override // com.zing.zalo.p077ui.maintab.me.QuickActionView.InterfaceC12135a
        /* renamed from: c */
        public void mo67848c() {
            TabMeView.this.f63402Q0 = null;
            final TabMeView tabMeView = TabMeView.this;
            tabMeView.mo70710wy(new Runnable() { // from class: r70.r
                @Override // java.lang.Runnable
                public final void run() {
                    TabMeView.C12153j.m67975f(TabMeView.this);
                }
            });
        }

        @Override // com.zing.zalo.p077ui.maintab.me.UserInfoItemView.InterfaceC12157a
        /* renamed from: d */
        public void mo67977d() {
            C0815e1.m2075D().m2100V(new C23648e(18, "social_tab_me", 0, "tab_me_open_profile", new String[0]).m123926s(String.valueOf(TabMeView.this.f63399N0)), false);
            TabMeView.this.m67948wN();
        }

        @Override // com.zing.zalo.p077ui.maintab.me.QuickActionView.InterfaceC12135a
        /* renamed from: k0 */
        public void mo67849k0(String str, String str2) {
            TabMeView.this.m67962nN(str, str2);
            C0815e1 m2075D = C0815e1.m2075D();
            C23648e c23648e = new C23648e(18, "social_tab_me", 0, "tab_me_open_quick_action", new String[0]);
            String[] strArr = new String[1];
            if (str2 == null) {
                str2 = "";
            }
            strArr[0] = str2;
            m2075D.m2100V(c23648e.m123926s(strArr), false);
        }

        @Override // com.zing.zalo.p077ui.maintab.me.TabMeAdapter.InterfaceC12141c
        /* renamed from: v4 */
        public AbstractC1785o mo67862v4() {
            AbstractC1785o lifecycle = TabMeView.this.getLifecycle();
            AbstractC19074t.m100207e(lifecycle, "<get-lifecycle>(...)");
            return lifecycle;
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$k */
    /* loaded from: classes5.dex */
    public static final class C12154k extends RecyclerView.AbstractC1892s {
        C12154k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            TabMeAdapter tabMeAdapter = null;
            try {
                if (i11 == 0) {
                    TabMeAdapter tabMeAdapter2 = TabMeView.this.f63404S0;
                    if (tabMeAdapter2 == null) {
                        AbstractC19074t.m100223u("adapter");
                    } else {
                        tabMeAdapter = tabMeAdapter2;
                    }
                    tabMeAdapter.m67861S(false);
                    return;
                }
                if (i11 == 1) {
                    TabMeAdapter tabMeAdapter3 = TabMeView.this.f63404S0;
                    if (tabMeAdapter3 == null) {
                        AbstractC19074t.m100223u("adapter");
                    } else {
                        tabMeAdapter = tabMeAdapter3;
                    }
                    tabMeAdapter.m67861S(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$l */
    /* loaded from: classes5.dex */
    static final class C12155l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12155l f63435q = new C12155l();

        C12155l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C20912a mo12V4() {
            return AbstractC23306f.m120732z1();
        }
    }

    /* renamed from: com.zing.zalo.ui.maintab.me.TabMeView$m */
    /* loaded from: classes5.dex */
    static final class C12156m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12156m f63436q = new C12156m();

        C12156m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18989a mo12V4() {
            return AbstractC23306f.m120567B1();
        }
    }

    public TabMeView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_default_status);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f63398M0 = m118743r0;
        this.f63401P0 = new ArrayList();
        this.f63406U0 = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: r70.i
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m67937qN;
                m67937qN = TabMeView.m67937qN(TabMeView.this, message);
                return m67937qN;
            }
        });
        m129210a = AbstractC24856m.m129210a(C12155l.f63435q);
        this.f63407V0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C12156m.f63436q);
        this.f63408W0 = m129210a2;
        this.f63409X0 = AbstractC28981d.f.f134110d;
        this.f63410Y0 = AbstractC23291c.b.f113053b;
        this.f63411Z0 = ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b;
        this.f63412a1 = -1;
        this.f63413b1 = new C12151h();
        if (AbstractC23304d.f113368c0 == null) {
            try {
                String m121675Zd = AbstractC23309i.m121675Zd();
                if (!TextUtils.isEmpty(m121675Zd)) {
                    AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: AN */
    private final void m67871AN() {
        ContactProfile m67916eN = m67916eN(this, null, 1, null);
        String mo2478b = m67916eN.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        Bundle m140776b = new C27870vb(mo2478b).m140780g(m67916eN).m140776b();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(ChatView.class, m140776b, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public final void m67873BN() {
        try {
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, "204278670", null, 2, null);
            Bundle m140776b = new C27870vb("204278670").m140780g(m141798e).m140776b();
            m140776b.putString("STR_SOURCE_START_VIEW", "tab_me");
            AbstractC23211s7.m119583p(m92676n2(), m140776b, m141798e);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public final void m67875CN() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(SwitchAccountView.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DN */
    public final void m67877DN() {
        if (m67923iN().m109405l()) {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(ToolStorageView.class, null, 1, true);
            }
        } else {
            InterfaceC27218a m92676n22 = m92676n2();
            if (m92676n22 != null) {
                m92676n22.mo35573l4(StorageSummaryView.class, null, 1, true);
            }
        }
        C31747a.m152721t("tab_me");
    }

    /* renamed from: EN */
    private final void m67879EN() {
        try {
            C20795g.c m108500d = C20795g.f102172a.m108500d();
            if (m108500d == null) {
                return;
            }
            C31877d c31877d = new C31877d();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_SOURCE_OPEN_MA", C18620i.f93671N);
            c31877d.m153185d(bundle);
            AbstractC28207v1.m141994i3(m108500d.m108523b(), 4, m92676n2(), this, m108500d.m108522a(), c31877d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: GN */
    private final void m67882GN() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C12152i(null), 3, null);
    }

    /* renamed from: HN */
    private final void m67884HN() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C30038sd c30038sd = this.f63403R0;
        if (c30038sd == null) {
            AbstractC19074t.m100223u("binding");
            c30038sd = null;
        }
        RecyclerView recyclerView = c30038sd.f139343q;
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f72421L0.m92648SI());
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
        recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
        RecyclerView recyclerView2 = c30038sd.f139343q;
        TabMeAdapter tabMeAdapter = new TabMeAdapter(m92689tK);
        this.f63404S0 = tabMeAdapter;
        tabMeAdapter.m67860R(new C12153j());
        recyclerView2.setAdapter(tabMeAdapter);
        c30038sd.f139343q.m9826E(new C12154k());
        RecyclerView.AbstractC1885l itemAnimator = c30038sd.f139343q.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.m10058x(0L);
        }
    }

    /* renamed from: IN */
    private final void m67886IN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: r70.k
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67888JN(TabMeView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JN */
    public static final void m67888JN(final TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        List m119419e = AbstractC23179p8.m119419e();
        AbstractC19074t.m100207e(m119419e, "getListAccount(...)");
        tabMeView.f63401P0 = m119419e;
        tabMeView.mo70710wy(new Runnable() { // from class: r70.p
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67890KN(TabMeView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public static final void m67890KN(TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        tabMeView.m67955FN();
    }

    /* renamed from: LN */
    private final void m67892LN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: r70.g
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67894MN();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public static final void m67894MN() {
        C20795g.f102172a.m108502f();
    }

    /* renamed from: NN */
    private final void m67896NN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: r70.j
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67898ON(TabMeView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ON */
    public static final void m67898ON(TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        tabMeView.m67960hN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final void m67899PM(C25673e c25673e) {
        boolean z11;
        int i11;
        int i12;
        String m92652XI;
        String m118746s0;
        AbstractC28981d abstractC28981d = this.f63409X0;
        if (AbstractC3489d.m17513u() && !(abstractC28981d instanceof AbstractC28981d.e) && !AbstractC19074t.m100204b(abstractC28981d, AbstractC28981d.f.f134110d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        c25673e.m132562D(z11);
        if (c25673e.m132576p()) {
            c25673e.m132583w((int) (abstractC28981d.m144695b() * 100.0f));
            String m89800f = C16805b.Companion.m89811a().m89800f();
            if ((abstractC28981d instanceof AbstractC28981d.d) || (abstractC28981d instanceof AbstractC28981d.b)) {
                c25673e.m132560B(false);
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_progressing, m89800f, c25673e.m132569i() + "%");
                AbstractC19074t.m100205c(m118746s0);
            } else {
                c25673e.m132560B(true);
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_migration_pause, m89800f);
                AbstractC19074t.m100205c(m118746s0);
            }
            c25673e.m132584x(m118746s0);
            return;
        }
        if (AbstractC23306f.m120636Y1().m128530o()) {
            if (AbstractC23306f.m120636Y1().m128531p()) {
                m92652XI = m92652XI(AbstractC8020f0.str_zcloud_you_are_not_connect_to_zcloud);
                AbstractC19074t.m100205c(m92652XI);
            } else {
                m92652XI = m92652XI(AbstractC8020f0.str_zcloud_banner_remind_restore_title);
                AbstractC19074t.m100205c(m92652XI);
            }
            c25673e.m132581u(m92652XI);
            c25673e.m132560B(true);
            return;
        }
        if (AbstractC23306f.m120636Y1().m128529n()) {
            String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_setup_incomplete);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            c25673e.m132581u(m92652XI2);
            c25673e.m132560B(true);
            return;
        }
        if (C16888a.Companion.m90256a().m90244o()) {
            if (this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                i11 = AbstractC8020f0.str_tab_me_zcloud_desc;
            } else {
                i11 = AbstractC8020f0.str_zcloud_grace_period_tab_me_desc;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c25673e.m132581u(m118743r0);
            if (this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                i12 = AbstractC2807a.list_item_subtitle;
            } else {
                i12 = AbstractC2807a.error_text;
            }
            c25673e.m132582v(C23212s8.m119606n(i12));
            c25673e.m132560B(false);
            return;
        }
        if (AbstractC3489d.m17513u()) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_me_zcloud_desc);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            c25673e.m132581u(m118743r02);
            c25673e.m132560B(false);
            return;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_tab_me_subtitle);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        c25673e.m132581u(m118743r03);
        c25673e.m132560B(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Pi */
    public final void m67900Pi() {
        AbstractC26412d.Companion.m136232D(m92676n2(), new Bundle(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public final void m67901QM(C25673e c25673e) {
        int i11;
        String m118746s0;
        AbstractC23291c abstractC23291c = this.f63410Y0;
        if (abstractC23291c instanceof AbstractC23291c.b) {
            i11 = 0;
        } else if (abstractC23291c instanceof AbstractC23291c.a) {
            i11 = abstractC23291c.mo120404a();
        } else if (abstractC23291c instanceof AbstractC23291c.c) {
            i11 = abstractC23291c.mo120404a();
        } else if (AbstractC19074t.m100204b(abstractC23291c, AbstractC23291c.d.f113055b)) {
            i11 = 100;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        c25673e.m132562D(true);
        c25673e.m132560B(this.f63410Y0 instanceof AbstractC23291c.a);
        if (c25673e.m132574n()) {
            m118746s0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_change_pass_pause);
            AbstractC19074t.m100205c(m118746s0);
        } else {
            m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_zcloud_change_pass_progressing, i11 + "%");
            AbstractC19074t.m100205c(m118746s0);
        }
        c25673e.m132584x(m118746s0);
        c25673e.m132583w(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: RM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m67902RM(C25673e c25673e) {
        int i11;
        float m90259b;
        String str;
        ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f = this.f63411Z0;
        if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
            AbstractC19074t.m100206d(abstractC16884f, "null cannot be cast to non-null type com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker.State.Downloading");
            m90259b = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) abstractC16884f).m90209b();
        } else if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
            AbstractC19074t.m100206d(abstractC16884f, "null cannot be cast to non-null type com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker.State.Error");
            m90259b = ((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) abstractC16884f).m90210b().m90259b();
        } else {
            if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c) {
                i11 = 0;
            } else if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                i11 = 100;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (!(this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) && i11 == c25673e.m132569i()) {
                return;
            }
            c25673e.m132562D(true);
            c25673e.m132560B(this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b);
            if (!c25673e.m132574n()) {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_media_download_paused);
                AbstractC19074t.m100205c(str);
            } else {
                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_downloading_media) + " " + i11 + "%";
            }
            c25673e.m132584x(str);
            c25673e.m132583w(i11);
        }
        i11 = (int) m90259b;
        if (!(this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a)) {
        }
        c25673e.m132562D(true);
        c25673e.m132560B(this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b);
        if (!c25673e.m132574n()) {
        }
        c25673e.m132584x(str);
        c25673e.m132583w(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RN */
    public static final void m67903RN(final TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        tabMeView.f63398M0 = tabMeView.m67920gN();
        Object m108755E = AbstractC20826v0.m108755E();
        boolean z11 = true;
        if (m108755E instanceof C2972f2) {
            C2972f2 c2972f2 = (C2972f2) m108755E;
            if (!c2972f2.m14062a() || c2972f2.m14063b() || c2972f2.m14064c() || c2972f2.m14065d()) {
                z11 = false;
            }
            tabMeView.f63399N0 = z11;
        } else if (m108755E instanceof C2973f3) {
            C2973f3 c2973f3 = (C2973f3) m108755E;
            if (c2973f3.m14070c() || c2973f3.m14071d()) {
                z11 = false;
            }
            tabMeView.f63399N0 = z11;
        } else {
            tabMeView.f63399N0 = false;
        }
        tabMeView.f63400O0 = AbstractC20826v0.m108814i0();
        tabMeView.mo70710wy(new Runnable() { // from class: r70.o
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67905SN(TabMeView.this);
            }
        });
    }

    /* renamed from: SM */
    private final boolean m67904SM() {
        return AbstractC23306f.m120636Y1().m128520b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SN */
    public static final void m67905SN(TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        tabMeView.m67955FN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public final void m67906TM() {
        if (AbstractC0924m0.m4135q9()) {
            AbstractC0924m0.m3632Zf(false);
            m67944uN();
        } else {
            m67946vN();
        }
    }

    /* renamed from: VM */
    private final void m67907VM(List list) {
        C30038sd c30038sd;
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            c30038sd = null;
            if (it.hasNext()) {
                obj = it.next();
                AbstractC25672d abstractC25672d = (AbstractC25672d) obj;
                if (!C16805b.Companion.m89811a().m89808w() && abstractC25672d.m132556a() == 5 && (abstractC25672d instanceof C25673e) && ((C25673e) abstractC25672d).m132568h() == EnumC20799i.f102200A) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            C30038sd c30038sd2 = this.f63403R0;
            if (c30038sd2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30038sd = c30038sd2;
            }
            c30038sd.f139343q.postDelayed(new Runnable() { // from class: r70.h
                @Override // java.lang.Runnable
                public final void run() {
                    TabMeView.m67908WM(TabMeView.this);
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WM */
    public static final void m67908WM(TabMeView tabMeView) {
        int m131511r;
        AbstractC19074t.m100208f(tabMeView, "this$0");
        ArrayList arrayList = new ArrayList();
        TabMeAdapter tabMeAdapter = tabMeView.f63404S0;
        if (tabMeAdapter == null) {
            AbstractC19074t.m100223u("adapter");
            tabMeAdapter = null;
        }
        List m67855M = tabMeAdapter.m67855M();
        ArrayList<AbstractC25672d> arrayList2 = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        for (Object obj : m67855M) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            arrayList.add(Integer.valueOf(i12));
            if (((AbstractC25672d) obj).m132556a() == 5) {
                arrayList2.add(obj);
            }
            i12 = i13;
        }
        m131511r = AbstractC25370t.m131511r(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(m131511r);
        for (AbstractC25672d abstractC25672d : arrayList2) {
            AbstractC19074t.m100206d(abstractC25672d, "null cannot be cast to non-null type com.zing.zalo.ui.maintab.me.SettingData");
            arrayList3.add((C25673e) abstractC25672d);
        }
        for (Object obj2 : arrayList3) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            TabMeAdapter tabMeAdapter2 = tabMeView.f63404S0;
            if (tabMeAdapter2 == null) {
                AbstractC19074t.m100223u("adapter");
                tabMeAdapter2 = null;
            }
            tabMeAdapter2.m10009q(((Number) arrayList.get(i11)).intValue());
            i11 = i14;
        }
    }

    /* renamed from: XM */
    private final void m67909XM() {
        for (C28212v6 c28212v6 : C20795g.f102172a.m108501e()) {
            InterfaceC28231x7 interfaceC28231x7 = c28212v6.f131589o;
            AbstractC19074t.m100206d(interfaceC28231x7, "null cannot be cast to non-null type com.zing.zalo.common.TipTabMeAttach");
            C28035c8 c28035c8 = (C28035c8) interfaceC28231x7;
            if (c28035c8.m141476e()) {
                c28035c8.m141478g(false);
                AbstractC28025b8.m141437H(c28212v6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public static final void m67910ZM(TabMeView tabMeView, Object[] objArr) {
        String str;
        boolean m131390w;
        AbstractC19074t.m100208f(tabMeView, "this$0");
        AbstractC19074t.m100208f(objArr, "$args");
        tabMeView.m67955FN();
        Object obj = objArr[0];
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (MainTabView.m67645lM() != null && MainTabView.m67645lM().m67696kM() == C24099q0.Companion.m125984a().m125969m()) {
            String[] strArr = AbstractC28025b8.f130829F;
            AbstractC19074t.m100207e(strArr, "ARR_TABME_VIEW_TIPS");
            m131390w = AbstractC25358n.m131390w(strArr, str);
            if (m131390w) {
                Message obtainMessage = tabMeView.f63406U0.obtainMessage(1, str);
                AbstractC19074t.m100207e(obtainMessage, "obtainMessage(...)");
                tabMeView.f63406U0.sendMessage(obtainMessage);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aN */
    public static final void m67911aN(TabMeView tabMeView) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        tabMeView.m67955FN();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a2  */
    /* renamed from: bN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m67912bN() {
        boolean z11;
        C25673e c25673e;
        boolean z12;
        EnumC20799i enumC20799i;
        boolean z13;
        int size;
        int size2;
        C25673e c25673e2;
        C12158a c12158a;
        C25673e c25673e3;
        int i11;
        List list;
        List m68006c;
        boolean z14;
        ArrayList<AbstractC25672d> arrayList = new ArrayList();
        ContactProfile m67961lN = m67961lN();
        int i12 = 0;
        if (m67961lN != null) {
            String str = m67961lN.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            String str2 = m67961lN.f42437s;
            AbstractC19074t.m100207e(str2, "dpn");
            C25687s c25687s = new C25687s(str, str2, this.f63398M0);
            c25687s.m132596m(this.f63401P0);
            c25687s.m132595l(this.f63400O0);
            if (this.f63399N0 && !AbstractC0924m0.m3988lc()) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (C3432a.f14402a.m17234c() && m67961lN.m40357A0() && z14) {
                String str3 = m67961lN.f42434r;
                AbstractC19074t.m100207e(str3, "uid");
                c25687s.m132594k(AbstractC3439h.m17277k(str3));
                c25687s.m132597n(false);
            } else {
                c25687s.m132597n(this.f63399N0);
            }
            arrayList.add(c25687s);
        }
        arrayList.add(new C25669a(0, 1, null));
        C25670b c25670b = new C25670b(this.f63402Q0);
        if (c25670b.m132555d() != null) {
            C31862c m132555d = c25670b.m132555d();
            AbstractC19074t.m100205c(m132555d);
            if (!m132555d.m153154f()) {
                C31862c m132555d2 = c25670b.m132555d();
                AbstractC19074t.m100205c(m132555d2);
                if (!m132555d2.f146332y) {
                    z11 = false;
                    c25670b.m132558c(z11);
                    arrayList.add(c25670b);
                    arrayList.add(new C25669a(0, 1, null));
                    EnumC20799i enumC20799i2 = EnumC20799i.f102210x;
                    int i13 = AbstractC23322a.zds_ic_business_suite_line_24;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_business_tools);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    C25673e c25673e4 = new C25673e(enumC20799i2, i13, m118743r0, null, 0, 24, null);
                    String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_business_tools_desc);
                    AbstractC19074t.m100207e(m118743r02, "getString(...)");
                    c25673e4.m132581u(m118743r02);
                    c25673e4.m132563E("tab_me_business_tools");
                    c25673e4.m132585y(false);
                    c25673e4.m132558c(!AbstractC3439h.m17275i());
                    arrayList.add(c25673e4);
                    C25673e c25673e5 = new C25673e(EnumC20799i.f102209w, AbstractC23322a.zds_ic_qr_wallet_line_24, C25288b.f121272a.m130862a(), null, 0, 24, null);
                    c25673e5.m132581u(m67918fN());
                    c25673e5.m132563E("tab_me_qr_wallet");
                    c25673e5.m132585y(false);
                    c25673e5.m132558c(!r6.m108529c());
                    arrayList.add(c25673e5);
                    EnumC20799i enumC20799i3 = EnumC20799i.f102205s;
                    int i14 = AbstractC23322a.zds_ic_my_cloud_line_24;
                    String m114547n = AbstractC21935u.m114547n();
                    AbstractC19074t.m100207e(m114547n, "getSendToMeDPN(...)");
                    C25673e c25673e6 = new C25673e(enumC20799i3, i14, m114547n, null, 2, 8, null);
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_savedmessage_desc);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    c25673e6.m132581u(m118743r03);
                    c25673e6.m132563E("tab_me_saved_message");
                    c25673e6.m132585y(true);
                    c25673e6.m132558c(!(enumC20799i3.m108529c() & (!m67904SM()) & C21373a.f104231a.m110802n()));
                    arrayList.add(c25673e6);
                    C16805b.b bVar = C16805b.Companion;
                    boolean m89807v = bVar.m89811a().m89807v();
                    C0860a.Companion.m2473a().m2468s();
                    c25673e = new C25673e(EnumC20799i.f102200A, AbstractC23322a.zds_ic_zcloud_line_24, bVar.m89811a().m89800f(), null, 5, 8, null);
                    c25673e.m132563E("tab_me_z_cloud");
                    c25673e.m132585y(true);
                    c25673e.m132586z(true);
                    c25673e.m132558c(!m67904SM());
                    if (AbstractC19074t.m100204b(this.f63411Z0, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b) && !(this.f63411Z0 instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d)) {
                        m67902RM(c25673e);
                    } else if (AbstractC19074t.m100204b(this.f63410Y0, AbstractC23291c.b.f113053b) && !(this.f63410Y0 instanceof AbstractC23291c.d)) {
                        m67901QM(c25673e);
                    } else {
                        m67899PM(c25673e);
                    }
                    arrayList.add(c25673e);
                    arrayList.add(new C25669a(0, 1, null));
                    AbstractC25672d m67913cN = m67913cN(m89807v);
                    if (!EnumC20799i.f102212z.m108529c() && C20912a.Companion.m109411a().m109406m()) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    m67913cN.m132558c(z12);
                    arrayList.add(m67913cN);
                    arrayList.add(new C25669a(0, 1, null));
                    ContactProfile m67961lN2 = m67961lN();
                    enumC20799i = EnumC20799i.f102211y;
                    int i15 = AbstractC23322a.zds_ic_business_suite_line_24;
                    String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_ba_iap_title);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    C25673e c25673e7 = new C25673e(enumC20799i, i15, m118743r04, null, 0, 24, null);
                    c25673e7.m132563E("tab_me_ba_iap");
                    c25673e7.m132585y(false);
                    if (!enumC20799i.m108529c() && C3432a.f14402a.m17234c() && m67961lN2 != null && !m67961lN2.m40357A0()) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    c25673e7.m132558c(z13);
                    arrayList.add(c25673e7);
                    arrayList.add(new C25669a(0, 1, null));
                    EnumC20799i enumC20799i4 = EnumC20799i.f102207u;
                    int i16 = AbstractC23322a.zds_ic_shield_star_line_24;
                    String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_account_security);
                    AbstractC19074t.m100207e(m118743r05, "getString(...)");
                    C25673e c25673e8 = new C25673e(enumC20799i4, i16, m118743r05, null, 0, 24, null);
                    c25673e8.m132563E("tab_me_account_and_security");
                    c25673e8.m132585y(true);
                    arrayList.add(c25673e8);
                    EnumC20799i enumC20799i5 = EnumC20799i.f102208v;
                    int i17 = AbstractC23322a.zds_ic_lock_line_24;
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_privacy);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    C25673e c25673e9 = new C25673e(enumC20799i5, i17, m118743r06, null, 0, 24, null);
                    c25673e9.m132563E("tab_me_privacy");
                    c25673e9.m132585y(true);
                    arrayList.add(c25673e9);
                    C12159b.f63441a.m67999c();
                    for (size = arrayList.size() - 1; -1 < size; size--) {
                        AbstractC25672d abstractC25672d = (AbstractC25672d) arrayList.get(size);
                        if (abstractC25672d instanceof C25687s) {
                            i11 = 100;
                        } else if (abstractC25672d instanceof C25670b) {
                            i11 = 101;
                        } else if (abstractC25672d instanceof C25673e) {
                            i11 = ((C25673e) abstractC25672d).m132568h().m108530d();
                        } else {
                            i11 = -1;
                        }
                        if (i11 >= 0) {
                            Integer valueOf = Integer.valueOf(i11);
                            C12159b c12159b = C12159b.f63441a;
                            if (c12159b.m67998b().containsKey(valueOf)) {
                                C12159b.b bVar2 = (C12159b.b) c12159b.m67998b().get(Integer.valueOf(i11));
                                if (bVar2 != null && (m68006c = bVar2.m68006c()) != null) {
                                    for (int size3 = m68006c.size() - 1; -1 < size3; size3--) {
                                        if (((C12159b.a) m68006c.get(size3)).m68002c()) {
                                            m68006c.remove(size3);
                                        }
                                    }
                                }
                                if (bVar2 != null) {
                                    list = bVar2.m68006c();
                                } else {
                                    list = null;
                                }
                                List list2 = list;
                                if (list2 != null && !list2.isEmpty()) {
                                    int i18 = size + 1;
                                    if (bVar2 != null && bVar2.m68007d()) {
                                        arrayList.add(i18, new C25669a(0, 1, null));
                                        i18 = size + 2;
                                    }
                                    AbstractC19074t.m100205c(bVar2);
                                    Iterator it = bVar2.m68006c().iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(i18, new C12158a((C12159b.a) it.next()));
                                        i18++;
                                    }
                                    if (bVar2.m68007d() && i18 < arrayList.size() && !(arrayList.get(i18) instanceof C25669a)) {
                                        arrayList.add(i18, new C25669a(0, 1, null));
                                    }
                                }
                            }
                        }
                    }
                    for (size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        if (((AbstractC25672d) arrayList.get(size2)).m132557b()) {
                            arrayList.remove(size2);
                            if (size2 > 0 && size2 < arrayList.size() && (arrayList.get(size2) instanceof C25669a) && (arrayList.get(size2 - 1) instanceof C25669a)) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                    for (AbstractC25672d abstractC25672d2 : arrayList) {
                        if (abstractC25672d2 instanceof C25673e) {
                            c25673e3 = (C25673e) abstractC25672d2;
                        } else {
                            c25673e3 = null;
                        }
                        if (c25673e3 != null) {
                            m67956PN(c25673e3);
                        }
                    }
                    for (Object obj : arrayList) {
                        int i19 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        if (i19 < arrayList.size() && !(arrayList.get(i12) instanceof C25669a) && !(arrayList.get(i19) instanceof C25669a)) {
                            Object obj2 = arrayList.get(i12);
                            if (obj2 instanceof C25673e) {
                                c25673e2 = (C25673e) obj2;
                            } else {
                                c25673e2 = null;
                            }
                            if (c25673e2 != null) {
                                c25673e2.m132561C(true);
                            }
                            Object obj3 = arrayList.get(i12);
                            if (obj3 instanceof C12158a) {
                                c12158a = (C12158a) obj3;
                            } else {
                                c12158a = null;
                            }
                            if (c12158a != null) {
                                c12158a.m67996f(true);
                            }
                        }
                        i12 = i19;
                    }
                    m67907VM(arrayList);
                    return arrayList;
                }
            }
        }
        z11 = true;
        c25670b.m132558c(z11);
        arrayList.add(c25670b);
        arrayList.add(new C25669a(0, 1, null));
        EnumC20799i enumC20799i22 = EnumC20799i.f102210x;
        int i132 = AbstractC23322a.zds_ic_business_suite_line_24;
        String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_business_tools);
        AbstractC19074t.m100207e(m118743r07, "getString(...)");
        C25673e c25673e42 = new C25673e(enumC20799i22, i132, m118743r07, null, 0, 24, null);
        String m118743r022 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_business_tools_desc);
        AbstractC19074t.m100207e(m118743r022, "getString(...)");
        c25673e42.m132581u(m118743r022);
        c25673e42.m132563E("tab_me_business_tools");
        c25673e42.m132585y(false);
        c25673e42.m132558c(!AbstractC3439h.m17275i());
        arrayList.add(c25673e42);
        C25673e c25673e52 = new C25673e(EnumC20799i.f102209w, AbstractC23322a.zds_ic_qr_wallet_line_24, C25288b.f121272a.m130862a(), null, 0, 24, null);
        c25673e52.m132581u(m67918fN());
        c25673e52.m132563E("tab_me_qr_wallet");
        c25673e52.m132585y(false);
        c25673e52.m132558c(!r6.m108529c());
        arrayList.add(c25673e52);
        EnumC20799i enumC20799i32 = EnumC20799i.f102205s;
        int i142 = AbstractC23322a.zds_ic_my_cloud_line_24;
        String m114547n2 = AbstractC21935u.m114547n();
        AbstractC19074t.m100207e(m114547n2, "getSendToMeDPN(...)");
        C25673e c25673e62 = new C25673e(enumC20799i32, i142, m114547n2, null, 2, 8, null);
        String m118743r032 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_savedmessage_desc);
        AbstractC19074t.m100207e(m118743r032, "getString(...)");
        c25673e62.m132581u(m118743r032);
        c25673e62.m132563E("tab_me_saved_message");
        c25673e62.m132585y(true);
        c25673e62.m132558c(!(enumC20799i32.m108529c() & (!m67904SM()) & C21373a.f104231a.m110802n()));
        arrayList.add(c25673e62);
        C16805b.b bVar3 = C16805b.Companion;
        boolean m89807v2 = bVar3.m89811a().m89807v();
        C0860a.Companion.m2473a().m2468s();
        c25673e = new C25673e(EnumC20799i.f102200A, AbstractC23322a.zds_ic_zcloud_line_24, bVar3.m89811a().m89800f(), null, 5, 8, null);
        c25673e.m132563E("tab_me_z_cloud");
        c25673e.m132585y(true);
        c25673e.m132586z(true);
        c25673e.m132558c(!m67904SM());
        if (AbstractC19074t.m100204b(this.f63411Z0, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b)) {
        }
        if (AbstractC19074t.m100204b(this.f63410Y0, AbstractC23291c.b.f113053b)) {
        }
        m67899PM(c25673e);
        arrayList.add(c25673e);
        arrayList.add(new C25669a(0, 1, null));
        AbstractC25672d m67913cN2 = m67913cN(m89807v2);
        if (!EnumC20799i.f102212z.m108529c()) {
        }
        z12 = true;
        m67913cN2.m132558c(z12);
        arrayList.add(m67913cN2);
        arrayList.add(new C25669a(0, 1, null));
        ContactProfile m67961lN22 = m67961lN();
        enumC20799i = EnumC20799i.f102211y;
        int i152 = AbstractC23322a.zds_ic_business_suite_line_24;
        String m118743r042 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_ba_iap_title);
        AbstractC19074t.m100207e(m118743r042, "getString(...)");
        C25673e c25673e72 = new C25673e(enumC20799i, i152, m118743r042, null, 0, 24, null);
        c25673e72.m132563E("tab_me_ba_iap");
        c25673e72.m132585y(false);
        if (!enumC20799i.m108529c()) {
        }
        z13 = true;
        c25673e72.m132558c(z13);
        arrayList.add(c25673e72);
        arrayList.add(new C25669a(0, 1, null));
        EnumC20799i enumC20799i42 = EnumC20799i.f102207u;
        int i162 = AbstractC23322a.zds_ic_shield_star_line_24;
        String m118743r052 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_account_security);
        AbstractC19074t.m100207e(m118743r052, "getString(...)");
        C25673e c25673e82 = new C25673e(enumC20799i42, i162, m118743r052, null, 0, 24, null);
        c25673e82.m132563E("tab_me_account_and_security");
        c25673e82.m132585y(true);
        arrayList.add(c25673e82);
        EnumC20799i enumC20799i52 = EnumC20799i.f102208v;
        int i172 = AbstractC23322a.zds_ic_lock_line_24;
        String m118743r062 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_privacy);
        AbstractC19074t.m100207e(m118743r062, "getString(...)");
        C25673e c25673e92 = new C25673e(enumC20799i52, i172, m118743r062, null, 0, 24, null);
        c25673e92.m132563E("tab_me_privacy");
        c25673e92.m132585y(true);
        arrayList.add(c25673e92);
        C12159b.f63441a.m67999c();
        while (-1 < size) {
        }
        while (-1 < size2) {
        }
        while (r2.hasNext()) {
        }
        while (r2.hasNext()) {
        }
        m67907VM(arrayList);
        return arrayList;
    }

    /* renamed from: cN */
    private final AbstractC25672d m67913cN(boolean z11) {
        boolean z12;
        int i11;
        if (m67923iN().m109409p() && m67925jN().m99704i()) {
            z12 = true;
        } else {
            z12 = false;
        }
        EnumC20799i enumC20799i = EnumC20799i.f102212z;
        int i12 = AbstractC23322a.zds_ic_storage_line_24;
        if (z11) {
            i11 = AbstractC8020f0.str_tool_storage_title_ver_zcloud;
        } else {
            i11 = AbstractC8020f0.str_tool_storage_title;
        }
        String m92652XI = m92652XI(i11);
        AbstractC19074t.m100205c(m92652XI);
        C25673e c25673e = new C25673e(enumC20799i, i12, m92652XI, null, 0, 24, null);
        if (z12) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_storage_tab_me_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            c25673e.m132581u(m118743r0);
            c25673e.m132582v(AbstractC23136l9.m118641B(m92689tK(), AbstractC2808b.f150839y60));
            c25673e.m132560B(true);
        } else {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_storage_subtitle);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            c25673e.m132581u(m118743r02);
            c25673e.m132582v(C23212s8.m119606n(AbstractC21196a.TextColor2));
            c25673e.m132560B(false);
        }
        c25673e.m132585y(true);
        c25673e.m132563E("tab_me_tool_storage");
        return c25673e;
    }

    /* renamed from: dN */
    private final ContactProfile m67914dN(String str) {
        ContactProfile contactProfile = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            String str2 = m141798e.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            if (str2.length() != 0) {
                contactProfile = m141798e;
            }
        }
        if (contactProfile == null) {
            C0766k c0766k = new C0766k();
            AbstractC25251g.m130681a(c0766k, new C12146c());
            c0766k.mo1514Q4(str, 0, new TrackingSource((short) 1020));
            return new ContactProfile(str);
        }
        return contactProfile;
    }

    /* renamed from: eN */
    static /* synthetic */ ContactProfile m67916eN(TabMeView tabMeView, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "322967126";
        }
        return tabMeView.m67914dN(str);
    }

    /* renamed from: fN */
    private final String m67918fN() {
        String m130857a;
        if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
            m130857a = C25287a.f121271a.m130858b();
        } else {
            m130857a = C25287a.f121271a.m130857a();
        }
        if (m130857a.length() == 0) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_qr_wallet_desc);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        return m130857a;
    }

    /* renamed from: gN */
    private final String m67920gN() {
        int i11;
        Object m108755E = AbstractC20826v0.m108755E();
        if (m108755E instanceof C2972f2) {
            String m108785T = AbstractC20826v0.m108785T();
            if (!TextUtils.isEmpty(m108785T)) {
                AbstractC19074t.m100205c(m108785T);
                return m108785T;
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_default_status);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
        if (m108755E instanceof C2973f3) {
            if (!((C2973f3) m108755E).m14070c()) {
                i11 = AbstractC8020f0.str_story_archive_promote_profile;
            } else {
                i11 = AbstractC8020f0.str_tabme_default_status;
            }
            String m118743r02 = AbstractC23136l9.m118743r0(i11);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tabme_default_status);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        return m118743r03;
    }

    /* renamed from: iN */
    private final C20912a m67923iN() {
        return (C20912a) this.f63407V0.getValue();
    }

    /* renamed from: jN */
    private final C18989a m67925jN() {
        return (C18989a) this.f63408W0.getValue();
    }

    /* renamed from: kN */
    private final View m67927kN(String str) {
        if (AbstractC19074t.m100204b(str, "tip.tabme.businesstool.activation")) {
            return m67930mN(EnumC20799i.f102210x);
        }
        return null;
    }

    /* renamed from: mN */
    private final View m67930mN(EnumC20799i enumC20799i) {
        TabMeAdapter tabMeAdapter = this.f63404S0;
        if (tabMeAdapter == null) {
            AbstractC19074t.m100223u("adapter");
            tabMeAdapter = null;
        }
        List m67855M = tabMeAdapter.m67855M();
        int i11 = -1;
        int i12 = 0;
        for (Object obj : m67855M) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            AbstractC25672d abstractC25672d = (AbstractC25672d) m67855M.get(i12);
            if ((abstractC25672d instanceof C25673e) && ((C25673e) abstractC25672d).m132568h() == enumC20799i) {
                i11 = i12;
            }
            i12 = i13;
        }
        if (i11 < 0) {
            return null;
        }
        C30038sd c30038sd = this.f63403R0;
        if (c30038sd == null) {
            AbstractC19074t.m100223u("binding");
            c30038sd = null;
        }
        RecyclerView.AbstractC1888o layoutManager = c30038sd.f139343q.getLayoutManager();
        if (layoutManager == null) {
            return null;
        }
        return layoutManager.mo9732P(i11);
    }

    /* renamed from: oN */
    private final boolean m67933oN() {
        if (!m92672lJ() || this.f72421L0.mo60294yp() || MainTabView.m67645lM() == null || MainTabView.m67645lM().m67696kM() != C24099q0.Companion.m125984a().m125969m() || mo67726A2()) {
            return false;
        }
        return true;
    }

    /* renamed from: pN */
    private final boolean m67935pN(String str) {
        if (AbstractC19074t.m100204b(str, "tip.tabme.businesstool.activation")) {
            if (!AbstractC0924m0.m4284va()) {
                return false;
            }
            AbstractC0924m0.m4173rh(false);
            AbstractC0924m0.m4143qh(false);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final boolean m67937qN(TabMeView tabMeView, Message message) {
        AbstractC19074t.m100208f(tabMeView, "this$0");
        AbstractC19074t.m100208f(message, "msg");
        try {
            if (message.what == 1) {
                Object obj = message.obj;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                TooltipView tooltipView = tabMeView.f63405T0;
                if (tooltipView != null && tooltipView.getParent() != null && AbstractC19074t.m100204b(str, tooltipView.getTooltipId())) {
                    tooltipView.m90727Q();
                    tabMeView.f63405T0 = null;
                }
                tabMeView.m67958UM(str);
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public final void m67939rN() {
        C26626l.Companion.m136712a().m136705k0(new C12147d(), C12148e.f63417q, C12149f.f63418q, new C12150g());
        C26676b.f126324a.m136988a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public final void m67942tN() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(SettingAccountAndSecurityV2View.class, null, 1, true);
        }
    }

    /* renamed from: uN */
    private final void m67944uN() {
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(BusinessToolsActivationView.class, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: vN */
    private final void m67946vN() {
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(BusinessToolsView.class, null, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public final void m67948wN() {
        String str;
        C32002l4 m154287a = C32002l4.Companion.m154287a(60001);
        Object m108755E = AbstractC20826v0.m108755E();
        if (m108755E instanceof C2972f2) {
            str = "action.open.memorylist";
        } else if (m108755E instanceof C2973f3) {
            str = "action.open.story_archive";
        } else {
            str = "";
        }
        AbstractC20826v0.m108813i();
        AbstractC20826v0.m108815j();
        new C19171b().m101508a(new C19171b.a(this.f72421L0.m92676n2(), new C26365a.b(CoreUtility.f89233i, m154287a).m135737D(str).m135743b(), 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public final void m67950xN() {
        C20795g.b m108499c = C20795g.f102172a.m108499c();
        if (m108499c == null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93596A);
            bundle.putString("EXTRA_WEB_URL", "https://h5.zdn.vn/zapps/220259427665569271/");
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35581q(ZaloWebView.class, bundle, 0, 1, true);
                return;
            }
            return;
        }
        m67962nN(m108499c.m108521b(), m108499c.m108520a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public final void m67952yN() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(SettingPrivateV2View.class, null, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public final void m67954zN() {
        C20795g c20795g = C20795g.f102172a;
        c20795g.m108502f();
        C20795g.c m108500d = c20795g.m108500d();
        if (m108500d != null && m108500d.m108524c() == 2) {
            m67879EN();
        } else {
            m67871AN();
        }
    }

    @Override // com.zing.zalo.p077ui.maintab.MainTabView.InterfaceC12111i
    /* renamed from: A2 */
    public boolean mo67726A2() {
        C13306b c13306b;
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM == null || (c13306b = m67645lM.f63219I1) == null || !c13306b.m74707p()) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72830E0 = C24099q0.Companion.m125984a().m125969m();
        if (this.f72421L0.m92642L3() != null) {
            Bundle m92642L3 = this.f72421L0.m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            this.f72830E0 = m92642L3.getInt("position");
        }
    }

    /* renamed from: FN */
    public final void m67955FN() {
        TabMeAdapter tabMeAdapter = this.f63404S0;
        if (tabMeAdapter != null) {
            TabMeAdapter tabMeAdapter2 = null;
            if (tabMeAdapter == null) {
                AbstractC19074t.m100223u("adapter");
                tabMeAdapter = null;
            }
            tabMeAdapter.m67859Q(m67912bN());
            TabMeAdapter tabMeAdapter3 = this.f63404S0;
            if (tabMeAdapter3 == null) {
                AbstractC19074t.m100223u("adapter");
            } else {
                tabMeAdapter2 = tabMeAdapter3;
            }
            tabMeAdapter2.m10008p();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30038sd m148503c = C30038sd.m148503c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148503c, "inflate(...)");
        this.f63403R0 = m148503c;
        m67884HN();
        m67882GN();
        C30038sd c30038sd = this.f63403R0;
        if (c30038sd == null) {
            AbstractC19074t.m100223u("binding");
            c30038sd = null;
        }
        RelativeLayout root = c30038sd.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: PN */
    public final void m67956PN(C25673e c25673e) {
        C28035c8 c28035c8;
        int m127173b0;
        AbstractC19074t.m100208f(c25673e, "settingData");
        for (C28212v6 c28212v6 : C20795g.f102172a.m108501e()) {
            InterfaceC28231x7 interfaceC28231x7 = c28212v6.f131589o;
            if (interfaceC28231x7 instanceof C28035c8) {
                c28035c8 = (C28035c8) interfaceC28231x7;
            } else {
                c28035c8 = null;
            }
            if (c28035c8 != null && c28035c8.m141475d() == c25673e.m132568h()) {
                String str = c28212v6.f131577c;
                AbstractC19074t.m100207e(str, "tipCat");
                m127173b0 = AbstractC24342w.m127173b0(str, "tip.tabme.new_feature", 0, false, 6, null);
                if (m127173b0 >= 0) {
                    c25673e.m132586z(c28212v6.f131580f);
                } else {
                    c25673e.m132559A(c28212v6.f131580f);
                }
                if (c28035c8.m141474c().length() > 0) {
                    c25673e.m132581u(c28035c8.m141474c());
                    c25673e.m132582v(c28035c8.m141473b());
                }
            }
        }
    }

    /* renamed from: QN */
    public final void m67957QN() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: r70.l
            @Override // java.lang.Runnable
            public final void run() {
                TabMeView.m67903RN(TabMeView.this);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        bundle.putBoolean("hasRestore", true);
    }

    /* renamed from: UM */
    public final void m67958UM(String str) {
        AbstractC19074t.m100208f(str, "requestedTipCat");
        try {
            if (!m67933oN()) {
                return;
            }
            Iterator it = AbstractC28025b8.m141457m(AbstractC28025b8.f130829F).iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                C28212v6 c28212v6 = (C28212v6) it.next();
                if (c28212v6 != null && c28212v6.m142167f() && c28212v6.f131579e && (AbstractC19074t.m100204b(str, "tip.any") || AbstractC19074t.m100204b(str, c28212v6.f131577c))) {
                    String str2 = c28212v6.f131577c;
                    AbstractC19074t.m100207e(str2, "tipCat");
                    View m67927kN = m67927kN(str2);
                    if (m67927kN != null && !z11 && m67927kN.isShown()) {
                        String str3 = c28212v6.f131577c;
                        AbstractC19074t.m100207e(str3, "tipCat");
                        if (m67935pN(str3)) {
                            C25297f m130959a = C25297f.Companion.m130959a(m67927kN.getContext());
                            Context context = m67927kN.getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            m130959a.m130907M(c28212v6, context);
                            m130959a.m130925c0(m67927kN);
                            if (AbstractC19074t.m100204b(c28212v6.f131577c, "tip.tabme.businesstool.activation")) {
                                m130959a.m130918X(EnumC25294c.BOTTOM);
                                m130959a.m130920Z(true);
                                m130959a.m130912R(EnumC25293b.RECTANGLE);
                                m130959a.m130943l0(0);
                            }
                            Context context2 = m67927kN.getContext();
                            AbstractC19074t.m100207e(context2, "getContext(...)");
                            TooltipView tooltipView = new TooltipView(context2);
                            tooltipView.setConfigs(m130959a);
                            tooltipView.m90734d0();
                            tooltipView.setOnTooltipFinishedListener(new C12145b(c28212v6));
                            tooltipView.setTooltipId(m130959a.m130946n());
                            C13306b c13306b = MainTabView.m67645lM().f63219I1;
                            AbstractC19074t.m100207e(c13306b, "mShowcaseManager");
                            tooltipView.setTooltipManager(c13306b);
                            tooltipView.m90733c0();
                            this.f63405T0 = tooltipView;
                            z11 = true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 44);
        bVar.m124119a().m124117e(this, 6020);
        bVar.m124119a().m124117e(this, 6006);
        bVar.m124119a().m124117e(this, 60060);
        bVar.m124119a().m124117e(this, 5400);
        bVar.m124119a().m124117e(this, 6090);
        bVar.m124119a().m124117e(this, 150803);
    }

    /* renamed from: YM */
    public final void m67959YM(C25673e c25673e) {
        C28035c8 c28035c8;
        AbstractC19074t.m100208f(c25673e, "settingData");
        for (C28212v6 c28212v6 : C20795g.f102172a.m108501e()) {
            InterfaceC28231x7 interfaceC28231x7 = c28212v6.f131589o;
            if (interfaceC28231x7 instanceof C28035c8) {
                c28035c8 = (C28035c8) interfaceC28231x7;
            } else {
                c28035c8 = null;
            }
            if (c28035c8 != null && c28035c8.m141475d() == c25673e.m132568h()) {
                c28212v6.f131580f = false;
                c28035c8.m141478g(false);
                AbstractC28025b8.m141437H(c28212v6);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "TabMeView";
    }

    /* renamed from: hN */
    public final void m67960hN() {
        List m131496e;
        try {
            C18434b.c cVar = new C18434b.c(-1, C18953k.Companion.m99424c(C28203u6.m141798e(C28203u6.f131407a, CoreUtility.f89233i, null, 2, null)), AbstractC23160o0.m119306z(), -1, -1, AbstractC23160o0.m119234a0());
            C18434b m97695b = C18434b.Companion.m97695b();
            m131496e = AbstractC25366r.m131496e(28);
            m97695b.m97687p(m131496e, null, cVar, null, this.f63413b1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: lN */
    public final ContactProfile m67961lN() {
        return AbstractC23304d.f113368c0;
    }

    /* renamed from: nN */
    public final void m67962nN(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str)) {
                AbstractC28207v1.m141994i3(str, 4, m92676n2(), this, m68758dM(str, str2, 4006), new C31877d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m67957QN();
        m67886IN();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 44);
        bVar.m124119a().m124115b(this, 6020);
        bVar.m124119a().m124115b(this, 6006);
        bVar.m124119a().m124115b(this, 60060);
        bVar.m124119a().m124115b(this, 5400);
        bVar.m124119a().m124115b(this, 6090);
        bVar.m124119a().m124115b(this, 150803);
    }

    /* renamed from: sN */
    public void m67963sN(boolean z11) {
        ContactProfile contactProfile;
        C3433b m40364F;
        if (z11) {
            m67955FN();
            if (mo45894h0()) {
                m67909XM();
            }
            if (C3432a.f14402a.m17234c() && (contactProfile = AbstractC23304d.f113368c0) != null && contactProfile.m40357A0() && (m40364F = AbstractC23304d.f113368c0.m40364F()) != null && m40364F.m17254g() > 0 && C23793c.Companion.m124321a().mo124314i() > m40364F.m17254g()) {
                AbstractC23309i.m121541Vr(0L);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, final Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        try {
            if (i11 != 44) {
                if (i11 != 5400) {
                    if (i11 != 6006) {
                        if (i11 != 6020) {
                            if (i11 != 6090) {
                                if (i11 != 60060) {
                                    if (i11 != 150803) {
                                        return;
                                    }
                                }
                            }
                        } else {
                            m67896NN();
                            return;
                        }
                    }
                    this.f63400O0 = false;
                    C30038sd c30038sd = this.f63403R0;
                    if (c30038sd == null) {
                        AbstractC19074t.m100223u("binding");
                        c30038sd = null;
                    }
                    int childCount = c30038sd.f139343q.getChildCount();
                    if (childCount >= 0) {
                        int i12 = 0;
                        while (true) {
                            C30038sd c30038sd2 = this.f63403R0;
                            if (c30038sd2 == null) {
                                AbstractC19074t.m100223u("binding");
                                c30038sd2 = null;
                            }
                            View childAt = c30038sd2.f139343q.getChildAt(i12);
                            if (childAt != null && (childAt instanceof UserInfoItemView)) {
                                ((UserInfoItemView) childAt).setRunAnimRedDot(false);
                            }
                            if (i12 == childCount) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                    m67957QN();
                    return;
                }
                mo70710wy(new Runnable() { // from class: r70.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        TabMeView.m67911aN(TabMeView.this);
                    }
                });
                return;
            }
            mo70710wy(new Runnable() { // from class: r70.m
                @Override // java.lang.Runnable
                public final void run() {
                    TabMeView.m67910ZM(TabMeView.this, objArr);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null && !bundle.getBoolean("hasRestore", false)) {
            m67909XM();
        }
        m67957QN();
        m67896NN();
        m67892LN();
    }
}
