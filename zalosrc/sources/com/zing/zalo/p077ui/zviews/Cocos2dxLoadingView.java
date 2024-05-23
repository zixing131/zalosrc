package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.os.Bundle;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.zview.ZaloView;
import me0.AbstractC23044d5;

/* loaded from: classes6.dex */
public class Cocos2dxLoadingView extends BaseZaloView implements ZaloView.InterfaceC17421f, InterfaceC0733x {

    /* renamed from: M0 */
    Bundle f72770M0 = null;

    /* renamed from: N0 */
    boolean f72771N0 = false;

    /* renamed from: fM */
    private void m78838fM() {
        this.f72770M0 = this.f72421L0.m92642L3();
        if (AbstractC23044d5.m118229b(EnumC16739a.f84898x)) {
            m78840hM();
        } else {
            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.p6
                public /* synthetic */ RunnableC16008p6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Cocos2dxLoadingView.this.m78839gM();
                }
            });
        }
    }

    /* renamed from: gM */
    public /* synthetic */ void m78839gM() {
        AbstractC23044d5.m118231d(this.f72421L0.getContext(), EnumC16739a.f84898x);
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.q6
            public /* synthetic */ RunnableC16045q6() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Cocos2dxLoadingView.this.m78840hM();
            }
        });
    }

    /* renamed from: hM */
    public void m78840hM() {
        if (!this.f72771N0 && !this.f72421L0.mo60294yp()) {
            this.f72421L0.finish();
            this.f72421L0.m92662fJ().m93069k2(Cocos2dxView.class, this.f72770M0, 0, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f72771N0 = true;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f72771N0 = true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11 && !z12) {
            m78838fM();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "Cocos2dxLoadingView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (this.f72771N0) {
            finish();
        }
    }
}
