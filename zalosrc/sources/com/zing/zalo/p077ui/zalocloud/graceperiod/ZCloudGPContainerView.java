package com.zing.zalo.p077ui.zalocloud.graceperiod;

import ac.C0708i;
import ac.C0732w;
import ac0.C0736a;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.zalocloud.graceperiod.ZCloudGPContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import me0.AbstractC23222t7;
import me0.C23283z7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p205hc.C19965d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p649xl.AbstractC30022re;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zb0.AbstractC31773b;
import zb0.C31772a;
import zb0.C31774c;
import zb0.C31775d;

/* loaded from: classes6.dex */
public final class ZCloudGPContainerView extends BaseZCloudView<AbstractC30022re> {
    public static final C13836a Companion = new C13836a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f71545R0;

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$a */
    /* loaded from: classes6.dex */
    public static final class C13836a {
        private C13836a() {
        }

        public /* synthetic */ C13836a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$b */
    /* loaded from: classes6.dex */
    static final class C13837b extends AbstractC19075u implements InterfaceC18494a {
        C13837b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C31774c mo12V4() {
            return (C31774c) new C1802w0(ZCloudGPContainerView.this, new C0736a()).m9378a(C31774c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$c */
    /* loaded from: classes6.dex */
    static final class C13838c extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$c$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f71548t;

            /* renamed from: u */
            final /* synthetic */ ZCloudGPContainerView f71549u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ZCloudGPContainerView zCloudGPContainerView, Continuation continuation) {
                super(2, continuation);
                this.f71549u = zCloudGPContainerView;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f71549u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f71548t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    this.f71548t = 1;
                    if (DelayKt.m112666b(2000L, this) == m142578e) {
                        return m142578e;
                    }
                }
                this.f71549u.mo57606qM();
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$c$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final b f71550q = new b();

            b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long mo12V4() {
                return Long.valueOf(AbstractC0924m0.m4044n8());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$c$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ZCloudGPContainerView f71551q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ZCloudGPContainerView zCloudGPContainerView) {
                super(0);
                this.f71551q = zCloudGPContainerView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m77145a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m77145a() {
                AbstractC0924m0.m2919Ar(this.f71551q.m77757mM().mo124314i());
            }
        }

        C13838c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77142a(AbstractC31773b abstractC31773b) {
            int i11;
            AbstractC19074t.m100208f(abstractC31773b, "event");
            if (AbstractC19074t.m100204b(abstractC31773b, AbstractC31773b.a.f145875a)) {
                Bundle m92642L3 = ZCloudGPContainerView.this.m92642L3();
                if (m92642L3 != null && m92642L3.getBoolean("ARG_IS_SUCCESS", false)) {
                    ZCloudGPContainerView.this.m77132FM(3);
                    return;
                } else if (AbstractC23306f.m120627V1().m90248s()) {
                    ZCloudGPContainerView.this.m77129CM();
                    return;
                } else {
                    ZCloudGPContainerView.this.m77131EM();
                    return;
                }
            }
            if (abstractC31773b instanceof AbstractC31773b.f) {
                int m152772a = ((AbstractC31773b.f) abstractC31773b).m152772a();
                if (m152772a != 1) {
                    if (m152772a != 2) {
                        i11 = 1;
                    } else {
                        i11 = 4;
                    }
                } else {
                    i11 = 5;
                }
                C17487o0 m92662fJ = ZCloudGPContainerView.this.m92662fJ();
                if (m92662fJ != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                    bundle.putInt("zcloud_gp_success_mode", i11);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m92662fJ.m93069k2(ToolStorageView.class, bundle, 1, true);
                    return;
                }
                return;
            }
            if (abstractC31773b instanceof AbstractC31773b.d) {
                ZCloudGPContainerView.this.m77132FM(1);
                return;
            }
            if (abstractC31773b instanceof AbstractC31773b.e) {
                ZCloudGPContainerView.this.m77130DM();
                return;
            }
            if (abstractC31773b instanceof AbstractC31773b.b) {
                Context context = ZCloudGPContainerView.this.getContext();
                if (context != null) {
                    ZCloudGPContainerView zCloudGPContainerView = ZCloudGPContainerView.this;
                    String m92652XI = zCloudGPContainerView.m92652XI(AbstractC8020f0.str_gp_analyzing_error);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    C23283z7.m120376i(zCloudGPContainerView, m92652XI, C27280g.m139660c(context, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2807a.snackbar_custom_color_red), Integer.valueOf(AbstractC23222t7.f112540S));
                }
                BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(ZCloudGPContainerView.this), null, null, new a(ZCloudGPContainerView.this, null), 3, null);
                return;
            }
            if (abstractC31773b instanceof AbstractC31773b.c) {
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                AbstractC31773b.c cVar = (AbstractC31773b.c) abstractC31773b;
                c0708i.m1073d("total_media", cVar.m152771c());
                c0708i.m1073d("total_download_media", cVar.m152770b());
                c0708i.m1073d("local_media", cVar.m152769a());
                C24848g0 c24848g02 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "zcloud_download_analyze_end", null, c0708i, null, 10, null);
                ZCloudGPContainerView zCloudGPContainerView2 = ZCloudGPContainerView.this;
                zCloudGPContainerView2.m77754gM(b.f71550q, new c(zCloudGPContainerView2));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77142a((AbstractC31773b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$d */
    /* loaded from: classes6.dex */
    static final class C13839d extends AbstractC19075u implements InterfaceC18505l {
        C13839d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77146a(C31775d c31775d) {
            if (c31775d.m152797d()) {
                ZCloudGPContainerView.this.mo46829Y();
            } else {
                ZCloudGPContainerView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77146a((C31775d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPContainerView$e */
    /* loaded from: classes6.dex */
    static final class C13840e implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71553p;

        C13840e(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71553p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71553p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f71553p.mo205i9(obj);
        }
    }

    public ZCloudGPContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13837b());
        this.f71545R0 = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m77127AM(ZCloudGPContainerView zCloudGPContainerView) {
        AbstractC19074t.m100208f(zCloudGPContainerView, "this$0");
        zCloudGPContainerView.mo57606qM();
    }

    /* renamed from: BM */
    private final C31774c m77128BM() {
        return (C31774c) this.f71545R0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public final void m77129CM() {
        m92649TI().m93062f2(AbstractC6918a0.container, ZCloudGPDownloadingDataView.class, new Bundle(), 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m77130DM() {
        long j11;
        C31772a m152796c;
        C31772a m152796c2;
        try {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                Bundle bundle = new Bundle();
                C31775d c31775d = (C31775d) m77128BM().m152785Y().mo9215f();
                long j12 = 0;
                if (c31775d != null && (m152796c2 = c31775d.m152796c()) != null) {
                    j11 = m152796c2.m152765b();
                } else {
                    j11 = 0;
                }
                bundle.putLong("ARG_CLOUD_MEDIA_SIZE", j11);
                C31775d c31775d2 = (C31775d) m77128BM().m152785Y().mo9215f();
                if (c31775d2 != null && (m152796c = c31775d2.m152796c()) != null) {
                    j12 = m152796c.m152767d();
                }
                bundle.putLong("ARG_MY_CLOUD_SIZE", j12);
                C24848g0 c24848g0 = C24848g0.f119245a;
                m92662fJ.mo89694j2(ZCloudGPMoreInfoBottomSheet.class, bundle, 0, "SMLSaveKeyZaloCloudBottomSheet", 1, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m77131EM() {
        m92649TI().m93062f2(AbstractC6918a0.container, ZCloudGPProcessingDataView.class, new Bundle(), 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m77132FM(int i11) {
        C17487o0 m92649TI = m92649TI();
        int i12 = AbstractC6918a0.container;
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_MODE", i11);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m92649TI.m93062f2(i12, ZCloudGPDownloadCompleteDataView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static final void m77140zM(ZCloudGPContainerView zCloudGPContainerView) {
        AbstractC19074t.m100208f(zCloudGPContainerView, "this$0");
        if (zCloudGPContainerView.m92649TI().m93012K0() instanceof ZCloudGPDownloadCompleteDataView) {
            return;
        }
        zCloudGPContainerView.m77132FM(2);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 150804);
        bVar.m124119a().m124117e(this, 150803);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_gp_container_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77128BM().m152784X().m9219j(m92657cJ(), new C19965d(new C13838c()));
        m77128BM().m152785Y().m9219j(m92657cJ(), new C13840e(new C13839d()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        super.mo57606qM();
        finish();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        switch (i11) {
            case 150803:
                if (!AbstractC3489d.m17506n()) {
                    if (AbstractC3489d.m17512t()) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: yb0.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZCloudGPContainerView.m77140zM(ZCloudGPContainerView.this);
                            }
                        });
                        return;
                    } else {
                        AbstractC19444a.m101697e(new Runnable() { // from class: yb0.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ZCloudGPContainerView.m77127AM(ZCloudGPContainerView.this);
                            }
                        });
                        return;
                    }
                }
                return;
            case 150804:
                m77128BM().m152783U();
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 150804);
        bVar.m124119a().m124115b(this, 150803);
    }
}
