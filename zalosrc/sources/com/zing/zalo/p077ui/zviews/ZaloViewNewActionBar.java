package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1759b1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.floatingmp3.C11891a;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import gi0.C19451a;
import me0.AbstractC23138m0;
import me0.C23212s8;
import p542ub.InterfaceC27218a;

/* loaded from: classes.dex */
public abstract class ZaloViewNewActionBar extends ZaloView {

    /* renamed from: w0 */
    private ZdsActionBar f79675w0;

    /* renamed from: x0 */
    private C19451a f79676x0;

    /* renamed from: y0 */
    private C19451a f79677y0;

    /* renamed from: com.zing.zalo.ui.zviews.ZaloViewNewActionBar$a */
    /* loaded from: classes.dex */
    public static final class C15401a implements InterfaceC1764d0 {
        C15401a() {
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: a */
        public void mo8524qp(InterfaceC1801w interfaceC1801w) {
            AbstractC19074t.m100208f(interfaceC1801w, "value");
            View m92656bJ = ZaloViewNewActionBar.this.m92656bJ();
            if (m92656bJ != null && !AbstractC19074t.m100204b(AbstractC1759b1.m9259a(m92656bJ), interfaceC1801w)) {
                AbstractC1759b1.m9260b(m92656bJ, interfaceC1801w);
                ZaloViewNewActionBar.this.m92659dJ().mo9222o(this);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.ZaloViewNewActionBar$b */
    /* loaded from: classes6.dex */
    public static final class C15402b extends ZdsActionBar.AbstractC16987c {
        C15402b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            if (!ZaloViewNewActionBar.this.m92681pJ() && !ZaloViewNewActionBar.this.m92677nJ()) {
                ZaloViewNewActionBar.this.finish();
            }
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: b */
        public void mo39914b() {
            if (!ZaloViewNewActionBar.this.m92681pJ() && !ZaloViewNewActionBar.this.m92677nJ()) {
                ZaloViewNewActionBar.this.finish();
            }
        }
    }

    public ZaloViewNewActionBar() {
    }

    /* renamed from: JK */
    private final void m87073JK() {
        if ((m92648SI() instanceof ZaloLauncherActivity) && AbstractC23138m0.Companion.m118777d()) {
            C11891a.b bVar = C11891a.Companion;
            if (bVar.m66093p(getClass())) {
                Context m92648SI = m92648SI();
                AbstractC19074t.m100206d(m92648SI, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
                bVar.m66081a((ZaloActivity) m92648SI);
            } else if (bVar.m66091m()) {
                C11891a.b.m66078g(bVar, null, 1, null).m66076t0();
            }
        }
    }

    /* renamed from: KK */
    private final void m87074KK() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ZaloActivity zaloActivity;
        super.mo37111CJ(bundle);
        Context m92648SI = m92648SI();
        if (m92648SI instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92648SI;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity != null) {
            m92659dJ().m9219j(zaloActivity, new C15401a());
        }
    }

    /* renamed from: LK */
    public final void m87075LK() {
        m87074KK();
    }

    /* renamed from: MK */
    public final C19451a m87076MK() {
        return this.f79676x0;
    }

    /* renamed from: NK */
    public final ZdsActionBar m87077NK() {
        return this.f79675w0;
    }

    /* renamed from: OK */
    public void mo39896OK() {
        ZdsActionBar zdsActionBar = this.f79675w0;
        if (zdsActionBar != null) {
            zdsActionBar.setLeadingFunctionCallback(new C15402b());
            Object context = zdsActionBar.getContext();
            if (context != null) {
                AbstractC19074t.m100205c(context);
                if ((context instanceof InterfaceC27218a) && !((InterfaceC27218a) context).mo35576n3()) {
                    zdsActionBar.setOccupyStatusBar(true);
                } else {
                    zdsActionBar.setOccupyStatusBar(false);
                }
            }
        }
    }

    /* renamed from: PK */
    public void mo46028PK() {
        ZdsActionBar zdsActionBar = this.f79675w0;
        if (zdsActionBar != null) {
            C19451a c19451a = new C19451a();
            c19451a.m101752c(true);
            c19451a.m101751b(false);
            this.f79676x0 = c19451a;
            C19451a c19451a2 = new C19451a();
            c19451a2.m101752c(false);
            c19451a2.m101751b(false);
            this.f79677y0 = c19451a2;
            int backgroundType = zdsActionBar.getBackgroundType();
            if (backgroundType == ZdsActionBar.EnumC16985a.BLUE.m91010c()) {
                C19451a c19451a3 = this.f79676x0;
                if (c19451a3 != null) {
                    c19451a3.m101751b(false);
                    return;
                }
                return;
            }
            if (backgroundType == ZdsActionBar.EnumC16985a.WHITE.m91010c()) {
                C19451a c19451a4 = this.f79676x0;
                if (c19451a4 != null) {
                    c19451a4.m101751b(C23212s8.m119603k());
                }
                C19451a c19451a5 = this.f79677y0;
                if (c19451a5 != null) {
                    c19451a5.m101751b(false);
                    return;
                }
                return;
            }
            if (backgroundType == ZdsActionBar.EnumC16985a.TRANSPARENT.m91010c()) {
                C19451a c19451a6 = this.f79676x0;
                if (c19451a6 != null) {
                    c19451a6.m101751b(C23212s8.m119603k());
                }
                C19451a c19451a7 = this.f79677y0;
                if (c19451a7 != null) {
                    c19451a7.m101751b(false);
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        if (!AbstractC19074t.m100204b(AbstractC1759b1.m9259a(view), m92657cJ())) {
            AbstractC1759b1.m9260b(view, m92657cJ());
        }
        AbstractC16768f.m89489a(view).m89425S(true);
        this.f79675w0 = (ZdsActionBar) view.findViewById(AbstractC6918a0.zds_action_bar);
        mo46028PK();
        mo39896OK();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m87074KK();
        m87073JK();
    }

    public ZaloViewNewActionBar(int i11) {
        super(i11);
    }
}
