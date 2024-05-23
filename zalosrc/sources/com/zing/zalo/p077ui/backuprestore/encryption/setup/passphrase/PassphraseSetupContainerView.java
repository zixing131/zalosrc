package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.AbstractC11044a;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SaveBackupKeyBottomSheet;
import com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import p205hc.C19965d;
import p649xl.AbstractC30075v;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import q40.C25112a;

/* loaded from: classes5.dex */
public final class PassphraseSetupContainerView extends BaseSetupZaloCloudView<AbstractC30075v> {
    public static final C11026a Companion = new C11026a(null);

    /* renamed from: U0 */
    private final InterfaceC24854k f55699U0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$a */
    /* loaded from: classes5.dex */
    public static final class C11026a {
        private C11026a() {
        }

        public /* synthetic */ C11026a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$b */
    /* loaded from: classes5.dex */
    static final class C11027b extends AbstractC19075u implements InterfaceC18494a {
        C11027b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C11046c mo12V4() {
            return (C11046c) new C1802w0(PassphraseSetupContainerView.this, new C25112a()).m9378a(C11046c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$c */
    /* loaded from: classes5.dex */
    static final class C11028c extends AbstractC19075u implements InterfaceC18505l {
        C11028c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57608a(PassPhraseSetupContainerViewState passPhraseSetupContainerViewState) {
            if (passPhraseSetupContainerViewState.m57597b()) {
                PassphraseSetupContainerView.this.mo46829Y();
            } else {
                PassphraseSetupContainerView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57608a((PassPhraseSetupContainerViewState) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$d */
    /* loaded from: classes5.dex */
    static final class C11029d extends AbstractC19075u implements InterfaceC18505l {
        C11029d() {
            super(1);
        }

        /* renamed from: a */
        public final void m57609a(AbstractC11044a abstractC11044a) {
            C17487o0 m92662fJ;
            AbstractC19074t.m100208f(abstractC11044a, "it");
            if (abstractC11044a instanceof AbstractC11044a.a) {
                PassphraseSetupContainerView.this.m57601DM().m57677j0(PassphraseSetupContainerView.this.m77747sM());
                PassphraseSetupContainerView.this.m57601DM().m57675h0(PassphraseSetupContainerView.this.m77748tM().m77929b0());
                PassphraseSetupContainerView.this.m57601DM().m57676i0(PassphraseSetupContainerView.this.m77748tM().m77930c0());
                PassphraseSetupContainerView.this.m57602EM(false);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC11044a, AbstractC11044a.c.f55729a)) {
                ZaloView m92650VI = PassphraseSetupContainerView.this.m92650VI();
                if (m92650VI != null && (m92662fJ = m92650VI.m92662fJ()) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("EXTRA_MODE", 4);
                    bundle.putBoolean("extra_need_fetch_metadata", false);
                    bundle.putBoolean("extra_from_zcloud", true);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m92662fJ.m93066i2(ManageGoogleAccountView.class, bundle, 18061, 1, true);
                    return;
                }
                return;
            }
            if (AbstractC19074t.m100204b(abstractC11044a, AbstractC11044a.b.f55728a)) {
                PassphraseSetupContainerView.this.m57602EM(true);
            } else if (AbstractC19074t.m100204b(abstractC11044a, AbstractC11044a.d.f55730a)) {
                ZaloView m92650VI2 = PassphraseSetupContainerView.this.m92650VI();
                AbstractC19074t.m100206d(m92650VI2, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
                ((ZCloudSetupContainerView) m92650VI2).m77887DM(true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57609a((AbstractC11044a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$e */
    /* loaded from: classes5.dex */
    static final class C11030e implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55703p;

        C11030e(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55703p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55703p;
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
            this.f55703p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$f */
    /* loaded from: classes5.dex */
    public static final class C11031f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f55704q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11031f(boolean z11) {
            super(0);
            this.f55704q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            long m3654a8;
            if (this.f55704q) {
                m3654a8 = AbstractC0924m0.m3624Z7();
            } else {
                m3654a8 = AbstractC0924m0.m3654a8();
            }
            return Long.valueOf(m3654a8);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.PassphraseSetupContainerView$g */
    /* loaded from: classes5.dex */
    public static final class C11032g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f55705q;

        /* renamed from: r */
        final /* synthetic */ PassphraseSetupContainerView f55706r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11032g(boolean z11, PassphraseSetupContainerView passphraseSetupContainerView) {
            super(0);
            this.f55705q = z11;
            this.f55706r = passphraseSetupContainerView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57611a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57611a() {
            if (this.f55705q) {
                AbstractC0924m0.m4003lr(this.f55706r.m77757mM().mo124314i());
            } else {
                AbstractC0924m0.m4033mr(this.f55706r.m77757mM().mo124314i());
            }
        }
    }

    public PassphraseSetupContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C11027b());
        this.f55699U0 = m129210a;
    }

    /* renamed from: DM */
    public final C11046c m57601DM() {
        return (C11046c) this.f55699U0.getValue();
    }

    /* renamed from: EM */
    public final void m57602EM(boolean z11) {
        m77754gM(new C11031f(z11), new C11032g(z11, this));
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_CONFIRM_MODE", z11);
        bundle.putInt("SHOW_WITH_FLAGS", 134217728);
        m92649TI().m93062f2(AbstractC6918a0.container, PassphraseSetupView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (m92649TI().m93012K0() instanceof PassphraseSetupView) {
            return !((PassphraseSetupView) r0).m57629GM();
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m57601DM().m57674g0(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.backup_pin_code_setup_container_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        m57601DM().m57668Z(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == -1 && intent != null) {
            m57601DM().m57671c0(SaveBackupKeyBottomSheet.EnumC11042b.Companion.m57649a(intent.getIntExtra("EXTRA_PARAM_TYPE", SaveBackupKeyBottomSheet.EnumC11042b.f55720q.m57648c())));
        }
        if (i11 == 18061 && intent != null) {
            m57601DM().m57662R();
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m57601DM().m57670b0().m9219j(m92657cJ(), new C11030e(new C11028c()));
        m57601DM().m57669a0().m9219j(m92657cJ(), new C19965d(new C11029d()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 instanceof PassphraseSetupView) {
            ((PassphraseSetupView) m93012K0).mo57606qM();
        } else {
            super.mo57606qM();
        }
    }
}
