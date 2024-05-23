package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import cg.C3456d;
import java.io.Serializable;
import mm0.AbstractC23355j;
import zh0.AbstractC32212c;

/* loaded from: classes6.dex */
public abstract class RotatableZaloView extends SlidableZaloView {

    /* renamed from: P0 */
    EnumC14966b f77079P0 = EnumC14966b.Default;

    /* renamed from: Q0 */
    C3456d f77080Q0 = new C3456d();

    /* renamed from: R0 */
    int f77081R0 = -1;

    /* renamed from: S0 */
    Handler f77082S0 = new HandlerC14965a(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.RotatableZaloView$a */
    /* loaded from: classes6.dex */
    public class HandlerC14965a extends Handler {
        HandlerC14965a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        RotatableZaloView.this.mo39063nM(message.arg1);
                    }
                } else {
                    RotatableZaloView.this.m83789qM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RotatableZaloView$b */
    /* loaded from: classes6.dex */
    public enum EnumC14966b {
        Default,
        Auto,
        Portrait,
        Landscape,
        Locked
    }

    /* renamed from: mM */
    public /* synthetic */ void m83784mM(int i11) {
        if (m83786kM()) {
            this.f77082S0.removeMessages(1);
            this.f77082S0.removeMessages(2);
            Message message = new Message();
            message.what = 1;
            this.f77082S0.sendMessageDelayed(message, 0L);
            return;
        }
        this.f77082S0.removeMessages(2);
        Message message2 = new Message();
        message2.what = 2;
        message2.arg1 = i11;
        this.f77082S0.sendMessageDelayed(message2, 0L);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle == null) {
            this.f77081R0 = m92676n2().getRequestedOrientation();
            return;
        }
        Serializable serializable = bundle.getSerializable("orientationType");
        if (serializable instanceof EnumC14966b) {
            this.f77079P0 = (EnumC14966b) serializable;
        }
        this.f77081R0 = bundle.getInt("orientationBackup");
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m92676n2().setRequestedOrientation(this.f77081R0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C3456d c3456d = this.f77080Q0;
        if (c3456d != null) {
            c3456d.m17404g();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putSerializable("orientationType", this.f77079P0);
        bundle.putInt("orientationBackup", this.f77081R0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        if (m92662fJ().m93012K0() == this || !(m92662fJ().m93012K0() instanceof RotatableZaloView)) {
            m92676n2().setRequestedOrientation(this.f77081R0);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        C3456d c3456d = this.f77080Q0;
        if (c3456d != null) {
            c3456d.m17403f(m92648SI());
            this.f77080Q0.m17406i(new C3456d.c() { // from class: com.zing.zalo.ui.zviews.od0
                public /* synthetic */ od0() {
                }

                @Override // cg.C3456d.c
                /* renamed from: h2 */
                public final void mo17407h2(int i11) {
                    RotatableZaloView.this.m83784mM(i11);
                }
            });
        }
    }

    /* renamed from: hM */
    protected EnumC14966b mo39050hM() {
        return EnumC14966b.Portrait;
    }

    /* renamed from: iM */
    public int m83785iM() {
        return this.f77080Q0.m17402e();
    }

    /* renamed from: jM */
    public EnumC14966b mo39053jM() {
        EnumC14966b enumC14966b = this.f77079P0;
        if (enumC14966b == null || enumC14966b == EnumC14966b.Default) {
            return mo39050hM();
        }
        return enumC14966b;
    }

    /* renamed from: kM */
    protected boolean m83786kM() {
        return false;
    }

    /* renamed from: lM */
    protected boolean mo39058lM() {
        return false;
    }

    /* renamed from: nM */
    public void mo39063nM(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onOrientationChanged: ");
        sb2.append(i11);
    }

    /* renamed from: oM */
    void m83787oM(int i11) {
        boolean z11;
        if (i11 != AbstractC32212c.m155331a(m92648SI())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 90) {
            m92676n2().setRequestedOrientation(0);
        } else if (i11 == 270) {
            m92676n2().setRequestedOrientation(8);
        } else if (i11 == 180) {
            m92676n2().setRequestedOrientation(9);
        } else {
            m92676n2().setRequestedOrientation(1);
        }
        if (z11) {
            this.f77082S0.removeMessages(2);
            Message message = new Message();
            message.what = 2;
            message.arg1 = i11;
            this.f77082S0.sendMessageDelayed(message, 0L);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C3456d c3456d = this.f77080Q0;
        if (c3456d != null) {
            c3456d.m17405h();
        }
        m83789qM();
    }

    /* renamed from: pM */
    public void m83788pM(EnumC14966b enumC14966b) {
        if (enumC14966b == null) {
            return;
        }
        try {
            this.f77079P0 = enumC14966b;
            if (m92662fJ() != null && m92662fJ().m93012K0() != this) {
                return;
            }
            m83789qM();
        } catch (Exception e11) {
            AbstractC23355j.m122794b(e11);
        }
    }

    /* renamed from: qM */
    protected void m83789qM() {
        EnumC14966b mo39053jM = mo39053jM();
        if (mo39053jM == EnumC14966b.Portrait) {
            m83787oM(0);
            return;
        }
        if (mo39053jM == EnumC14966b.Landscape) {
            m83787oM(90);
            return;
        }
        if (mo39053jM == EnumC14966b.Locked) {
            m92676n2().setRequestedOrientation(14);
            return;
        }
        if (mo39058lM() && m83786kM()) {
            this.f77082S0.removeMessages(1);
            this.f77082S0.removeMessages(2);
            m83787oM(this.f77080Q0.m17402e());
            return;
        }
        m92676n2().setRequestedOrientation(2);
    }
}
