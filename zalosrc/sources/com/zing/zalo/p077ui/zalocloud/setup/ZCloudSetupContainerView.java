package com.zing.zalo.p077ui.zalocloud.setup;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.configbackup.ConfigBackupView;
import com.zing.zalo.p077ui.backuprestore.detail.BackupDetailView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.p077ui.zalocloud.setup.AbstractC14007c;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudCompleteSetupBottomSheetView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hc0.EnumC19985o;
import kc0.C21685x;
import o70.C24099q0;
import p205hc.C19965d;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import p649xl.AbstractC29916lg;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;

/* loaded from: classes6.dex */
public final class ZCloudSetupContainerView extends BaseZCloudView<AbstractC29916lg> {
    public static final C13998a Companion = new C13998a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f72003R0;

    /* renamed from: S0 */
    private boolean f72004S0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView$a */
    /* loaded from: classes6.dex */
    public static final class C13998a {
        private C13998a() {
        }

        public /* synthetic */ C13998a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView$b */
    /* loaded from: classes6.dex */
    static final class C13999b extends AbstractC19075u implements InterfaceC18494a {
        C13999b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C14008d mo12V4() {
            return (C14008d) new C1802w0(ZCloudSetupContainerView.this, new C21685x()).m9378a(C14008d.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView$c */
    /* loaded from: classes6.dex */
    static final class C14000c extends AbstractC19075u implements InterfaceC18505l {
        C14000c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77890a(AbstractC14007c abstractC14007c) {
            AbstractC19074t.m100208f(abstractC14007c, "event");
            if (AbstractC19074t.m100204b(abstractC14007c, AbstractC14007c.c.f72022a)) {
                if (ZCloudSetupContainerView.this.m77888xM().m77929b0() || ZCloudSetupContainerView.this.m77888xM().m77930c0()) {
                    ZCloudSetupContainerView.this.m77879FM();
                    return;
                }
                if (ZCloudSetupContainerView.this.m77888xM().m77932f0()) {
                    ZCloudSetupContainerView.this.m77875AM();
                    return;
                } else if (AbstractC23306f.m120636Y1().m128525i() != EnumC19985o.f98289r) {
                    ZCloudSetupContainerView.this.m77886zM(1);
                    return;
                } else {
                    ZCloudSetupContainerView.this.m77888xM().m77939m0();
                    return;
                }
            }
            if (AbstractC19074t.m100204b(abstractC14007c, AbstractC14007c.a.f72020a)) {
                C26676b.f126324a.m137009w();
                ZCloudSetupContainerView.this.m77876BM();
            } else if (AbstractC19074t.m100204b(abstractC14007c, AbstractC14007c.e.f72024a)) {
                C26676b.f126324a.m137009w();
                ZCloudSetupContainerView.m77878EM(ZCloudSetupContainerView.this, false, 1, null);
            } else if (AbstractC19074t.m100204b(abstractC14007c, AbstractC14007c.b.f72021a)) {
                ZCloudSetupContainerView.this.finish();
            } else if (AbstractC19074t.m100204b(abstractC14007c, AbstractC14007c.d.f72023a)) {
                ZCloudSetupContainerView.this.m77875AM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77890a((AbstractC14007c) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView$d */
    /* loaded from: classes6.dex */
    public static final class C14001d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14001d f72007q = new C14001d();

        C14001d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m3537W7());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView$e */
    /* loaded from: classes6.dex */
    public static final class C14002e extends AbstractC19075u implements InterfaceC18494a {
        C14002e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77892a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77892a() {
            AbstractC0924m0.m3883hr(ZCloudSetupContainerView.this.m77757mM().mo124314i());
        }
    }

    public ZCloudSetupContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13999b());
        this.f72003R0 = m129210a;
    }

    /* renamed from: AM */
    public final void m77875AM() {
        AbstractC23306f.m120636Y1().m128510B(EnumC19985o.f98289r);
        C17487o0 m92649TI = m92649TI();
        int i11 = AbstractC6918a0.container;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_BACK_BUTTON", m77888xM().m77933g0());
        C24848g0 c24848g0 = C24848g0.f119245a;
        m92649TI.m93062f2(i11, KeepBackupDataZCloudView.class, bundle, 1, true);
    }

    /* renamed from: BM */
    public final void m77876BM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        bundle.putInt("TAB_ID", C24099q0.Companion.m125984a().m125969m());
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
        AbstractC19444a.m101694b(new Runnable() { // from class: hc0.v
            public /* synthetic */ RunnableC19992v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZCloudSetupContainerView.m77877CM(ZCloudSetupContainerView.this);
            }
        }, 200L);
    }

    /* renamed from: CM */
    public static final void m77877CM(ZCloudSetupContainerView zCloudSetupContainerView) {
        AbstractC19074t.m100208f(zCloudSetupContainerView, "this$0");
        zCloudSetupContainerView.m77885yM();
    }

    /* renamed from: EM */
    public static /* synthetic */ void m77878EM(ZCloudSetupContainerView zCloudSetupContainerView, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        zCloudSetupContainerView.m77887DM(z11);
    }

    /* renamed from: FM */
    public final void m77879FM() {
        m92649TI().m93062f2(AbstractC6918a0.container, ZCloudSetupSelectPwdView.class, new Bundle(), 1, true);
    }

    /* renamed from: yM */
    private final void m77885yM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 == null) {
            return;
        }
        ZCloudCompleteSetupBottomSheetView.C13982a.m77817b(ZCloudCompleteSetupBottomSheetView.Companion, m92676n2, 0, 2, null);
    }

    /* renamed from: zM */
    public final void m77886zM(int i11) {
        m77754gM(C14001d.f72007q, new C14002e());
        C17487o0 m92649TI = m92649TI();
        int i12 = AbstractC6918a0.container;
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_BACK_BUTTON", m77888xM().m77933g0());
        bundle.putInt("ARG_CURRENT_STEP", i11);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m92649TI.m93062f2(i12, CheckListSetupZCloudView.class, bundle, 1, true);
    }

    /* renamed from: DM */
    public final void m77887DM(boolean z11) {
        Bundle bundle = new Bundle();
        if (this.f72004S0) {
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        } else if (!m77888xM().m77929b0() && !m77888xM().m77930c0()) {
            bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        } else {
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        }
        if (z11) {
            bundle.putBoolean("KEY_SHOW_RECOGNITION_CHANGE_PROTECT_CODE", true);
            bundle.putBoolean("IS_IN_MIGRATE_FLOW", false);
        } else {
            bundle.putBoolean("IS_IN_MIGRATE_FLOW", true);
        }
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null && m92662fJ.m93029Q(ConfigBackupView.class)) {
            C17487o0 m92662fJ2 = m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(ConfigBackupView.class, bundle, 1, true);
                return;
            }
            return;
        }
        C17487o0 m92662fJ3 = m92662fJ();
        if (m92662fJ3 != null && m92662fJ3.m93029Q(BackupDetailView.class)) {
            C17487o0 m92662fJ4 = m92662fJ();
            if (m92662fJ4 != null) {
                m92662fJ4.m93069k2(BackupDetailView.class, bundle, 1, true);
                return;
            }
            return;
        }
        C17487o0 m92662fJ5 = m92662fJ();
        if (m92662fJ5 != null) {
            m92662fJ5.m93069k2(ZCloudHomeView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 instanceof CheckListSetupZCloudView) {
            return ((CheckListSetupZCloudView) m93012K0).m77784NM();
        }
        if (m93012K0 instanceof KeepBackupDataZCloudView) {
            return ((KeepBackupDataZCloudView) m93012K0).m77806JM();
        }
        if (m93012K0 instanceof ZCloudSetupSelectPwdView) {
            if (m77888xM().m77929b0() || m77888xM().m77930c0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m77888xM().m77935i0(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            boolean z11 = m92642L3.getBoolean("ARG_IS_STILL_NOT_RESTORE_OLD_BACKUP");
            boolean z12 = m92642L3.getBoolean("ARG_IS_CHANGE_KEY", false);
            boolean z13 = m92642L3.getBoolean("ARG_IS_OPT_IN_KEEP_OLD_BACKUP", false);
            boolean z14 = m92642L3.getBoolean("ARG_IS_RESTART_FLOW", false);
            boolean z15 = m92642L3.getBoolean("ARG_IS_FROM_RESET_CLOUD_FLOW", false);
            boolean z16 = m92642L3.getBoolean("ARG_IS_CREATE_PROTECTION_CODE", false);
            this.f72004S0 = m92642L3.getBoolean("ARG_IS_CLEAR_ALL_BACKSTACK", false);
            m77888xM().m77927Z(z11, z14, z12, z15, z13, z16);
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zcloud_setup_container_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        m77888xM().m77925W(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        AbstractC23306f.m120636Y1().m128539z(false);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 != null && (m93012K0 instanceof CheckListSetupZCloudView)) {
            return ((CheckListSetupZCloudView) m93012K0).onKeyUp(i11, keyEvent);
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77888xM().m77926X().m9219j(this, new C19965d(new C14000c()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 != null && (m93012K0 instanceof BaseSetupZaloCloudView)) {
            ((BaseSetupZaloCloudView) m93012K0).mo57606qM();
        } else {
            super.mo57606qM();
        }
    }

    /* renamed from: xM */
    public final C14008d m77888xM() {
        return (C14008d) this.f72003R0.getValue();
    }
}
