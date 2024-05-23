package com.zing.zalo.p077ui.zalocloud.resetcloud;

import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zalocloud.resetcloud.AbstractC13945c;
import com.zing.zalo.p077ui.zalocloud.restore.ZCloudRestoreContainerView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p205hc.C19965d;
import p649xl.AbstractC29915lf;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class ZaloCloudResetContainerView extends BaseZCloudView<AbstractC29915lf> {

    /* renamed from: R0 */
    private final InterfaceC24854k f71880R0;

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZaloCloudResetContainerView$a */
    /* loaded from: classes6.dex */
    static final class C13941a extends AbstractC19075u implements InterfaceC18494a {
        C13941a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13946d mo12V4() {
            return (C13946d) new C1802w0(ZaloCloudResetContainerView.this).m9378a(C13946d.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZaloCloudResetContainerView$b */
    /* loaded from: classes6.dex */
    static final class C13942b extends AbstractC19075u implements InterfaceC18505l {
        C13942b() {
            super(1);
        }

        /* renamed from: a */
        public final void m77661a(AbstractC13945c abstractC13945c) {
            AbstractC19074t.m100208f(abstractC13945c, "event");
            if (AbstractC19074t.m100204b(abstractC13945c, AbstractC13945c.a.f71893a)) {
                ZaloCloudResetContainerView.this.m92649TI().m93062f2(AbstractC6918a0.container, ZCloudStartResetCloudView.class, new Bundle(), 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77661a((AbstractC13945c) obj);
            return C24848g0.f119245a;
        }
    }

    public ZaloCloudResetContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13941a());
        this.f71880R0 = m129210a;
    }

    /* renamed from: sM */
    private final C13946d m77658sM() {
        return (C13946d) this.f71880R0.getValue();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m77658sM().m77679Q(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zalo_cloud_restore_container_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        m77658sM().m77677N(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77658sM().m77678O().m9219j(m92657cJ(), new C19965d(new C13942b()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 != null) {
            if (m93012K0 instanceof BaseZCloudView) {
                ((BaseZCloudView) m93012K0).mo57606qM();
                return;
            } else {
                m93012K0.finish();
                return;
            }
        }
        finish();
    }

    /* renamed from: tM */
    public final void m77659tM(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "extras");
        if (m92650VI() instanceof ZCloudRestoreContainerView) {
            ZaloView m92650VI = m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView");
            ((ZCloudRestoreContainerView) m92650VI).m77687xM(bundle);
        } else {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
            }
        }
    }
}
