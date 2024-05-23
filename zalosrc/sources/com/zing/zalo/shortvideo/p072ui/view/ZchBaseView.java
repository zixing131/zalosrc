package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.shortvideo.p072ui.state.StateManager;
import com.zing.zalo.shortvideo.p072ui.state.ZchMasterView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p542ub.InterfaceC27218a;
import v00.AbstractC27418m;

/* loaded from: classes5.dex */
public abstract class ZchBaseView extends ZaloView {

    /* renamed from: w0 */
    private final C10631i f53846w0 = C10631i.Companion.m55602a();

    /* renamed from: x0 */
    private boolean f53847x0;

    /* renamed from: y0 */
    private boolean f53848y0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ZchBaseView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10622a {
        /* renamed from: Mh */
        boolean m55554Mh();

        /* renamed from: OC */
        void m55555OC(boolean z11);

        /* renamed from: lz */
        boolean mo53979lz();
    }

    /* renamed from: JK */
    private final void m55542JK() {
        if ((m92650VI() instanceof ZchBaseView) || (m92650VI() instanceof ZchMasterView)) {
        } else {
            throw new IllegalStateException("Must be opened by ZchMasterView instead of ZaloLauncherActivity ");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle == null) {
            m55542JK();
        }
        StateManager.Companion.m53802f(this);
        this.f53846w0.m55588C(bundle, this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f53846w0.m55590F(this);
    }

    /* renamed from: KK */
    public final ZchMasterView m55543KK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZchMasterView) {
            return (ZchMasterView) m92650VI;
        }
        if (m92650VI instanceof ZchBaseView) {
            return ((ZchBaseView) m92650VI).m55543KK();
        }
        return null;
    }

    /* renamed from: LK */
    public final String m55544LK() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            return m92642L3.getString("xViewStateId");
        }
        return null;
    }

    /* renamed from: MK */
    public final boolean m55545MK() {
        ZchMasterView m55543KK = m55543KK();
        if (m55543KK == null || !m55543KK.m53821OK()) {
            return false;
        }
        return true;
    }

    /* renamed from: Mh */
    public final boolean m55546Mh() {
        return this.f53848y0;
    }

    /* renamed from: NK */
    public final boolean m55547NK() {
        ZaloView zaloView;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZchMasterView) {
            return ((ZchMasterView) m92650VI).m53822PK(this);
        }
        if ((m92650VI instanceof ZchBaseView) && ((ZchBaseView) m92650VI).m55547NK()) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                zaloView = m92662fJ.m93012K0();
            } else {
                zaloView = null;
            }
            if (AbstractC19074t.m100204b(zaloView, this)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OC */
    public final void m55548OC(boolean z11) {
        this.f53848y0 = z11;
    }

    /* renamed from: OK */
    public final void m55549OK(boolean z11) {
        this.f53848y0 = z11;
    }

    /* renamed from: PK */
    public final void m55550PK() {
        ZchMasterView m55543KK;
        if (m55553x0() && (m55543KK = m55543KK()) != null) {
            m55543KK.m53824WK(new SuggestUpdateView());
        }
    }

    /* renamed from: QK */
    public final void m55551QK(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
        ZchMasterView m55543KK = m55543KK();
        if (m55543KK != null) {
            m55543KK.m53824WK(zchBaseView);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f53846w0.m55592H(this);
    }

    /* renamed from: RK */
    public final void m55552RK(ZchBaseView zchBaseView) {
        AbstractC19074t.m100208f(zchBaseView, "view");
        ZchMasterView m55543KK = m55543KK();
        if (m55543KK != null) {
            m55543KK.m53826YK(zchBaseView);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        this.f53846w0.m55595K(this);
        this.f53847x0 = false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f53846w0.m55597M(this);
        this.f53847x0 = true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        ZaloActivity zaloActivity;
        ZchMasterView m55543KK;
        InterfaceC27218a m92676n2;
        C17487o0 mo35579p;
        C17487o0 m92649TI;
        StateManager.C10098a c10098a = StateManager.Companion;
        c10098a.m53803g(m55544LK());
        String m55544LK = m55544LK();
        InterfaceC27218a m92676n22 = m92676n2();
        C17487o0 c17487o0 = null;
        if (m92676n22 instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92676n22;
        } else {
            zaloActivity = null;
        }
        c10098a.m53806j(m55544LK, zaloActivity);
        if (!(this instanceof MainPageView)) {
            ZchMasterView m55543KK2 = m55543KK();
            if (m55543KK2 != null) {
                c17487o0 = m55543KK2.m92649TI();
            }
            if (!c10098a.m53807k(c17487o0) && (((m55543KK = m55543KK()) == null || (m92649TI = m55543KK.m92649TI()) == null || !m92649TI.m93029Q(MainPageView.class)) && (m92676n2 = m92676n2()) != null && (mo35579p = m92676n2.mo35579p()) != null)) {
                AbstractC27418m.Companion.m140405d(mo35579p);
            }
        }
        super.finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f53846w0.m55594J(this);
    }

    /* renamed from: x0 */
    public final boolean m55553x0() {
        if (m92687sJ() && !this.f53847x0 && !mo60294yp()) {
            return true;
        }
        return false;
    }
}
