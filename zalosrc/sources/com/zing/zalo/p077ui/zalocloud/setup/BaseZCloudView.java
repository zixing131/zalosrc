package com.zing.zalo.p077ui.zalocloud.setup;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC1673g;
import androidx.databinding.ViewDataBinding;
import au.AbstractC2379w;
import ch0.AbstractC3489d;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import nh0.InterfaceC23792b;
import p348mi.AbstractC23306f;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import tb0.C26626l;

/* loaded from: classes6.dex */
public abstract class BaseZCloudView<T extends ViewDataBinding> extends SlidableZaloView {

    /* renamed from: P0 */
    private ViewDataBinding f71945P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f71946Q0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.BaseZCloudView$a */
    /* loaded from: classes6.dex */
    static final class C13967a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13967a f71947q = new C13967a();

        C13967a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    public BaseZCloudView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C13967a.f71947q);
        this.f71946Q0 = m129210a;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        mo57631iM();
        mo57576lM(bundle);
        mo77755hM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        ViewDataBinding m8554e = AbstractC1673g.m8554e(layoutInflater, mo57575jM(), viewGroup, false);
        AbstractC19074t.m100207e(m8554e, "inflate(...)");
        this.f71945P0 = m8554e;
        InterfaceC27218a m92676n2 = m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        m92676n2.mo35554O(18);
        return m77756kM().getRoot();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            mo57606qM();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        mo57717rM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        mo57577oM();
        mo57729nM();
        mo57605pM();
    }

    /* renamed from: gM */
    public final void m77754gM(InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(interfaceC18494a, "isFirstTime");
        AbstractC19074t.m100208f(interfaceC18494a2, "onFirstTime");
        if (((Number) interfaceC18494a.mo12V4()).longValue() == 0) {
            interfaceC18494a2.mo12V4();
        }
    }

    public String getTrackingKey() {
        return "";
    }

    /* renamed from: hM */
    public void mo77755hM() {
    }

    /* renamed from: iM */
    public void mo57631iM() {
    }

    /* renamed from: jM */
    public abstract int mo57575jM();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: kM */
    public final ViewDataBinding m77756kM() {
        ViewDataBinding viewDataBinding = this.f71945P0;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        AbstractC19074t.m100223u("mBinding");
        return null;
    }

    /* renamed from: lM */
    public void mo57576lM(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: mM */
    public final InterfaceC23792b m77757mM() {
        return (InterfaceC23792b) this.f71946Q0.getValue();
    }

    /* renamed from: nM */
    public void mo57729nM() {
    }

    /* renamed from: oM */
    public void mo57577oM() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            mo57606qM();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (AbstractC3489d.m17510r()) {
            C26626l.Companion.m136712a().m136708u();
        }
    }

    /* renamed from: pM */
    public void mo57605pM() {
    }

    /* renamed from: qM */
    public void mo57606qM() {
        if (m92649TI().m93012K0() != null) {
            ZaloView m93012K0 = m92649TI().m93012K0();
            if (m93012K0 != null) {
                m93012K0.finish();
                return;
            }
            return;
        }
        finish();
    }

    /* renamed from: rM */
    public void mo57717rM() {
        AbstractC2379w.m12430d(m92656bJ());
    }
}
