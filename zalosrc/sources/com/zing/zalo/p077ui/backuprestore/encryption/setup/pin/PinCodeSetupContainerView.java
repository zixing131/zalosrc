package com.zing.zalo.p077ui.backuprestore.encryption.setup.pin;

import am.AbstractC0924m0;
import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.pin.AbstractC11066a;
import com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import hc0.EnumC19985o;
import p205hc.C19965d;
import p649xl.AbstractC30075v;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import r40.C25647a;

/* loaded from: classes5.dex */
public final class PinCodeSetupContainerView extends BaseSetupZaloCloudView<AbstractC30075v> {

    /* renamed from: U0 */
    private final InterfaceC24854k f55752U0;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$a */
    /* loaded from: classes5.dex */
    static final class C11047a extends AbstractC19075u implements InterfaceC18494a {
        C11047a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C11067b mo12V4() {
            return (C11067b) new C1802w0(PinCodeSetupContainerView.this, new C25647a()).m9378a(C11067b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$b */
    /* loaded from: classes5.dex */
    static final class C11048b extends AbstractC19075u implements InterfaceC18505l {
        C11048b() {
            super(1);
        }

        /* renamed from: a */
        public final void m57692a(PinCodeSetupContainerViewState pinCodeSetupContainerViewState) {
            if (pinCodeSetupContainerViewState.m57699c()) {
                PinCodeSetupContainerView.this.mo49282B8(null, false);
            } else {
                PinCodeSetupContainerView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57692a((PinCodeSetupContainerViewState) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$c */
    /* loaded from: classes5.dex */
    static final class C11049c extends AbstractC19075u implements InterfaceC18505l {
        C11049c() {
            super(1);
        }

        /* renamed from: a */
        public final void m57693a(AbstractC11066a abstractC11066a) {
            AbstractC19074t.m100208f(abstractC11066a, "it");
            if (abstractC11066a instanceof AbstractC11066a.c) {
                PinCodeSetupContainerView.this.m57687EM(false);
                return;
            }
            if (abstractC11066a instanceof AbstractC11066a.d) {
                PinCodeSetupContainerView.this.m57687EM(true);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC11066a, AbstractC11066a.b.f55780a)) {
                BaseSetupZaloCloudView.m77746xM(PinCodeSetupContainerView.this, EnumC19985o.f98297z, null, 2, null);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC11066a, AbstractC11066a.e.f55783a)) {
                AbstractC2379w.m12430d(PinCodeSetupContainerView.m57689yM(PinCodeSetupContainerView.this).getRoot());
                PinCodeSetupContainerView.this.m57688FM();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC11066a, AbstractC11066a.g.f55785a)) {
                ZaloView m92650VI = PinCodeSetupContainerView.this.m92650VI();
                AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.setup.ZCloudSetupContainerView");
                ((ZCloudSetupContainerView) m92650VI).m77887DM(true);
            } else if (AbstractC19074t.m100204b(abstractC11066a, AbstractC11066a.a.f55779a)) {
                PinCodeSetupContainerView.this.m57687EM(false);
            } else if (abstractC11066a instanceof AbstractC11066a.f) {
                PinCodeSetupContainerView.this.m77748tM().m77937k0(((AbstractC11066a.f) abstractC11066a).m57733a(), 2);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m57693a((AbstractC11066a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$d */
    /* loaded from: classes5.dex */
    static final class C11050d implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f55756p;

        C11050d(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f55756p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f55756p;
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
            this.f55756p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$e */
    /* loaded from: classes5.dex */
    public static final class C11051e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f55757q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11051e(boolean z11) {
            super(0);
            this.f55757q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long mo12V4() {
            long m3714c8;
            if (this.f55757q) {
                m3714c8 = AbstractC0924m0.m3684b8();
            } else {
                m3714c8 = AbstractC0924m0.m3714c8();
            }
            return Long.valueOf(m3714c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.pin.PinCodeSetupContainerView$f */
    /* loaded from: classes5.dex */
    public static final class C11052f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f55758q;

        /* renamed from: r */
        final /* synthetic */ PinCodeSetupContainerView f55759r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11052f(boolean z11, PinCodeSetupContainerView pinCodeSetupContainerView) {
            super(0);
            this.f55758q = z11;
            this.f55759r = pinCodeSetupContainerView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m57695a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m57695a() {
            if (this.f55758q) {
                AbstractC0924m0.m4063nr(this.f55759r.m77757mM().mo124314i());
            } else {
                AbstractC0924m0.m4093or(this.f55759r.m77757mM().mo124314i());
            }
        }
    }

    public PinCodeSetupContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C11047a());
        this.f55752U0 = m129210a;
    }

    /* renamed from: DM */
    private final C11067b m57686DM() {
        return (C11067b) this.f55752U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m57687EM(boolean z11) {
        m77754gM(new C11051e(z11), new C11052f(z11, this));
        C17487o0 m92649TI = m92649TI();
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        bundle.putBoolean("ARG_IS_CONFIRM_MODE", z11);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m92649TI.mo89694j2(PinCodeSetupView.class, bundle, 0, "SMLPinCodeSetupView" + z11, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m57688FM() {
        m92649TI().mo89694j2(ZCloudSetUpPinRemind.class, new Bundle(), 0, "SMLZCloudSetUpPinRemind", 1, true);
    }

    /* renamed from: yM */
    public static final /* synthetic */ AbstractC30075v m57689yM(PinCodeSetupContainerView pinCodeSetupContainerView) {
        return (AbstractC30075v) pinCodeSetupContainerView.m77756kM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (m92649TI().m93012K0() instanceof PinCodeSetupView) {
            return !((PinCodeSetupView) r0).m57716DM();
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m57686DM().m57751e0(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView, com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        m57686DM().m57753g0(m77747sM());
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
        m57686DM().m57745X(bundle, m77748tM().m77929b0(), m77748tM().m77930c0());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m57686DM().m57744W().m9219j(m92657cJ(), new C11050d(new C11048b()));
        m57686DM().m57743V().m9219j(m92657cJ(), new C19965d(new C11049c()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 instanceof PinCodeSetupView) {
            ((PinCodeSetupView) m93012K0).mo57606qM();
        } else if (m93012K0 instanceof ZCloudSetUpPinRemind) {
            ((ZCloudSetUpPinRemind) m93012K0).mo57606qM();
        } else {
            super.mo57606qM();
        }
    }
}
