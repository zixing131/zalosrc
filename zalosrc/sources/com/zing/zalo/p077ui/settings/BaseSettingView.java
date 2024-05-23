package com.zing.zalo.p077ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.graphics.C1421e;
import com.zing.zalo.p077ui.settings.BaseSettingView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.utils.systemui.SystemUIUtils;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import la0.C22340u;
import la0.InterfaceC22266l;
import la0.InterfaceC22275m;
import mm0.AbstractC23350e;
import na0.C23642c;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p558uu.InterfaceC27367c;
import p649xl.C29774e0;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public abstract class BaseSettingView extends SlidableZaloView implements InterfaceC22275m, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b {

    /* renamed from: P0 */
    public C13306b f67551P0;

    /* renamed from: Q0 */
    public InterfaceC22266l f67552Q0;

    /* renamed from: R0 */
    private C29774e0 f67553R0;

    /* renamed from: S0 */
    private final sh0 f67554S0 = new sh0();

    /* renamed from: com.zing.zalo.ui.settings.BaseSettingView$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC13111a implements Runnable {

        /* renamed from: q */
        final /* synthetic */ C22340u f67556q;

        RunnableC13111a(C22340u c22340u) {
            this.f67556q = c22340u;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                sh0 m73554nM = BaseSettingView.this.m73554nM();
                C29774e0 c29774e0 = BaseSettingView.this.f67553R0;
                C29774e0 c29774e02 = null;
                if (c29774e0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29774e0 = null;
                }
                if (m73554nM.m87411l(c29774e0.getRoot(), this)) {
                    return;
                }
                sh0 m73554nM2 = BaseSettingView.this.m73554nM();
                View mo74373L8 = BaseSettingView.this.m73556pM().mo74373L8();
                C29774e0 c29774e03 = BaseSettingView.this.f67553R0;
                if (c29774e03 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29774e02 = c29774e03;
                }
                m73554nM2.m87410k(mo74373L8, c29774e02.f137621q, this.f67556q, BaseSettingView.this.m73555oM());
                BaseSettingView.this.m73556pM().mo74374MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: kM */
    public static final void m73546kM(BaseSettingView baseSettingView) {
        AbstractC19074t.m100208f(baseSettingView, "this$0");
        baseSettingView.mo73553lM();
    }

    /* renamed from: sM */
    public static final void m73547sM(BaseSettingView baseSettingView, C1421e c1421e) {
        AbstractC19074t.m100208f(baseSettingView, "this$0");
        AbstractC19074t.m100208f(c1421e, "it");
        C29774e0 c29774e0 = baseSettingView.f67553R0;
        if (c29774e0 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e0 = null;
        }
        LinearLayout linearLayout = c29774e0.f137622r;
        AbstractC19074t.m100207e(linearLayout, "llContentSettings");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), c1421e.f6233d);
    }

    /* renamed from: tM */
    public static final void m73548tM(BaseSettingView baseSettingView) {
        AbstractC19074t.m100208f(baseSettingView, "this$0");
        baseSettingView.mo73526uM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m73557vM(new C13306b(m92648SI()));
        C23642c m120714t1 = AbstractC23306f.m120714t1();
        AbstractC19074t.m100207e(m120714t1, "provideSettingRepo(...)");
        m73558wM(new C13202a(this, m120714t1));
        m73556pM().mo74379Vp();
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: Cd */
    public void mo73549Cd(C22340u c22340u) {
        AbstractC19074t.m100208f(c22340u, "highlightSetting");
        C29774e0 c29774e0 = this.f67553R0;
        if (c29774e0 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e0 = null;
        }
        c29774e0.getRoot().postDelayed(new RunnableC13111a(c22340u), 300L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29774e0 m147877c = C29774e0.m147877c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147877c, "inflate(...)");
        this.f67553R0 = m147877c;
        C29774e0 c29774e0 = null;
        if (m147877c == null) {
            try {
                AbstractC19074t.m100223u("binding");
                m147877c = null;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        LinearLayout linearLayout = m147877c.f137622r;
        AbstractC19074t.m100207e(linearLayout, "llContentSettings");
        mo73525rM(layoutInflater, linearLayout, bundle);
        C29774e0 c29774e02 = this.f67553R0;
        if (c29774e02 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e02 = null;
        }
        c29774e02.f137624t.setOnScrollStateChangedListener(this);
        sh0 sh0Var = this.f67554S0;
        C29774e0 c29774e03 = this.f67553R0;
        if (c29774e03 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e03 = null;
        }
        sh0Var.m87415u(c29774e03.f137624t);
        C13306b m73555oM = m73555oM();
        C29774e0 c29774e04 = this.f67553R0;
        if (c29774e04 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e04 = null;
        }
        m73555oM.m74687C(c29774e04.f137625u);
        mo73524qM();
        m73556pM().mo74388vd();
        C29774e0 c29774e05 = this.f67553R0;
        if (c29774e05 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29774e0 = c29774e05;
        }
        return c29774e0.getRoot();
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67554S0.m87408i());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m73556pM().mo74379Vp();
            m73556pM().mo74388vd();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67554S0.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        mo73553lM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        C29774e0 c29774e0 = this.f67553R0;
        if (c29774e0 == null) {
            AbstractC19074t.m100223u("binding");
            c29774e0 = null;
        }
        AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, c29774e0.f137624t.getArrayChildViewVisible(), m92656bJ()), true);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        SystemUIUtils.f85039a.m89451i(AbstractC16768f.m89489a(view), null, 0);
        AbstractC16768f.m89489a(view).m89430n(new InterfaceC27367c() { // from class: la0.r
            public /* synthetic */ C22316r() {
            }

            @Override // p558uu.InterfaceC27367c
            /* renamed from: b */
            public final void mo87294b(C1421e c1421e) {
                BaseSettingView.m73547sM(BaseSettingView.this, c1421e);
            }
        });
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: ao */
    public void mo73550ao() {
        mo70710wy(new Runnable() { // from class: la0.t
            public /* synthetic */ RunnableC22332t() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BaseSettingView.m73548tM(BaseSettingView.this);
            }
        });
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        return m73556pM().mo57170bb(i11);
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: k */
    public ZaloView mo73551k() {
        return this;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: l4 */
    public void mo73552l4(Class cls, Bundle bundle, int i11, boolean z11) {
        AbstractC19074t.m100208f(cls, "zClass");
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(cls, bundle, i11, z11);
        }
    }

    /* renamed from: lM */
    public void mo73553lM() {
        try {
            m73556pM().mo74382Xm();
            this.f67554S0.m87405e(this, mo73522mM());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("CommonZaloview", e11);
        }
    }

    /* renamed from: mM */
    public abstract int mo73522mM();

    /* renamed from: nM */
    public final sh0 m73554nM() {
        return this.f67554S0;
    }

    /* renamed from: oM */
    public final C13306b m73555oM() {
        C13306b c13306b = this.f67551P0;
        if (c13306b != null) {
            return c13306b;
        }
        AbstractC19074t.m100223u("mShowcaseManager");
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f67554S0.m87413s();
    }

    /* renamed from: pM */
    public final InterfaceC22266l m73556pM() {
        InterfaceC22266l interfaceC22266l = this.f67552Q0;
        if (interfaceC22266l != null) {
            return interfaceC22266l;
        }
        AbstractC19074t.m100223u("presenter");
        return null;
    }

    /* renamed from: qM */
    public abstract void mo73524qM();

    /* renamed from: rM */
    public abstract View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    /* renamed from: uM */
    public abstract void mo73526uM();

    /* renamed from: vM */
    public final void m73557vM(C13306b c13306b) {
        AbstractC19074t.m100208f(c13306b, "<set-?>");
        this.f67551P0 = c13306b;
    }

    /* renamed from: wM */
    public final void m73558wM(InterfaceC22266l interfaceC22266l) {
        AbstractC19074t.m100208f(interfaceC22266l, "<set-?>");
        this.f67552Q0 = interfaceC22266l;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6000) {
            AbstractC19444a.m101697e(new Runnable() { // from class: la0.s
                public /* synthetic */ RunnableC22324s() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseSettingView.m73546kM(BaseSettingView.this);
                }
            });
        }
    }
}
