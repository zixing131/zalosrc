package com.zing.zalo.p077ui.zalocloud.restore;

import android.os.Bundle;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zalocloud.restore.AbstractC13956a;
import com.zing.zalo.p077ui.zalocloud.restore.C13958c;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fc0.AbstractC18869a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import p205hc.C19965d;
import p348mi.AbstractC23306f;
import p645xh.C29628e;
import p649xl.AbstractC29844hg;
import p664y.AbstractC30228a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class ZCloudRestoreContainerView extends BaseZCloudView<AbstractC29844hg> {

    /* renamed from: R0 */
    private final InterfaceC24854k f71902R0;

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13947a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71903a;

        static {
            int[] iArr = new int[C13958c.b.values().length];
            try {
                iArr[C13958c.b.f71924p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71903a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView$b */
    /* loaded from: classes6.dex */
    static final class C13948b extends AbstractC19075u implements InterfaceC18494a {
        C13948b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13957b mo12V4() {
            return (C13957b) new C1802w0(ZCloudRestoreContainerView.this).m9378a(C13957b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView$c */
    /* loaded from: classes6.dex */
    static final class C13949c extends AbstractC19075u implements InterfaceC18505l {
        C13949c() {
            super(1);
        }

        /* renamed from: a */
        public final void m77689a(AbstractC13956a abstractC13956a) {
            AbstractC19074t.m100208f(abstractC13956a, "event");
            if (AbstractC19074t.m100204b(abstractC13956a, AbstractC13956a.b.f71918a)) {
                ZCloudRestoreContainerView.this.m77684vM();
            } else if (AbstractC19074t.m100204b(abstractC13956a, AbstractC13956a.a.f71917a)) {
                ZCloudRestoreContainerView.this.finish();
            } else if (AbstractC19074t.m100204b(abstractC13956a, AbstractC13956a.c.f71919a)) {
                ZCloudRestoreContainerView.this.m77685wM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77689a((AbstractC13956a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView$d */
    /* loaded from: classes6.dex */
    static final class C13950d extends AbstractC19075u implements InterfaceC18505l {
        C13950d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77690a(AbstractC18869a abstractC18869a) {
            throw null;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            AbstractC30228a.m149044a(obj);
            m77690a(null);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.restore.ZCloudRestoreContainerView$e */
    /* loaded from: classes6.dex */
    static final class C13951e implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71907p;

        C13951e(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71907p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71907p;
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
            this.f71907p.mo205i9(obj);
        }
    }

    public ZCloudRestoreContainerView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13948b());
        this.f71902R0 = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public final void m77684vM() {
        if (AbstractC3489d.m17512t() && !AbstractC23306f.m120668h().m132668G()) {
            AbstractC23306f.m120676j().m128408Z(false);
            C29628e.m147249E0().m147293v1();
            m77685wM();
            return;
        }
        m92649TI().m93062f2(AbstractC6918a0.container, ZaloCloudRestoreView.class, new Bundle(), 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m77685wM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        C13958c.b bVar;
        if (!(m92649TI().m93012K0() instanceof ZaloCloudRestoreView)) {
            return false;
        }
        C13958c m77712O = m77686uM().m77712O();
        if (m77712O != null) {
            bVar = m77712O.m77718a();
        } else {
            bVar = null;
        }
        if (bVar != null && C13947a.f71903a[bVar.ordinal()] == 1) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m77686uM().m77715R(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        m77686uM().m77716S(C13958c.Companion.m77720b(m92642L3()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zcloud_restore_container_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
        super.mo57576lM(bundle);
        m77686uM().m77711N(bundle);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77686uM().m77713P().m9219j(m92657cJ(), new C19965d(new C13949c()));
        m77686uM().m77714Q().m9219j(m92657cJ(), new C13951e(new C13950d()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        ZaloView m93012K0 = m92649TI().m93012K0();
        if (m93012K0 instanceof BaseZCloudView) {
            ((BaseZCloudView) m93012K0).mo57606qM();
        } else {
            super.mo57606qM();
        }
    }

    /* renamed from: uM */
    public final C13957b m77686uM() {
        return (C13957b) this.f71902R0.getValue();
    }

    /* renamed from: xM */
    public final void m77687xM(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "extras");
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
        }
    }
}
