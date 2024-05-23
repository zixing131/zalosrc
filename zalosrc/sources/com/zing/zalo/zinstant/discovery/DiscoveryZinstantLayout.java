package com.zing.zalo.zinstant.discovery;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zinstant.AbstractC17153h;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.view.ZinstantRootLayout;
import dk0.C18020c;
import ho0.AbstractC20110a;
import ik0.AbstractC20601x;
import ik0.C20599v;
import ik0.EnumC20598u;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lk0.C22504b;
import lk0.C22505c;
import nk0.C23855s0;
import uk0.InterfaceC27294h;

/* loaded from: classes7.dex */
public class DiscoveryZinstantLayout extends ZinstantRootLayout {

    /* renamed from: a0 */
    private final Handler f87639a0;

    /* renamed from: b0 */
    private final AtomicInteger f87640b0;

    /* renamed from: c0 */
    private InterfaceC17143b f87641c0;

    /* renamed from: d0 */
    private final C18020c f87642d0;

    /* renamed from: e0 */
    InterfaceC27294h f87643e0;

    /* renamed from: f0 */
    private final AtomicBoolean f87644f0;

    /* renamed from: com.zing.zalo.zinstant.discovery.DiscoveryZinstantLayout$a */
    /* loaded from: classes7.dex */
    class HandlerC17142a extends Handler {
        HandlerC17142a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 4) {
                    if (i11 == 5) {
                        removeMessages(4);
                        DiscoveryZinstantLayout.this.m91671e1();
                        return;
                    }
                    return;
                }
                removeMessages(5);
                DiscoveryZinstantLayout.this.m91670d1();
                return;
            }
            removeMessages(1);
            DiscoveryZinstantLayout.this.m91661V0();
        }
    }

    /* renamed from: com.zing.zalo.zinstant.discovery.DiscoveryZinstantLayout$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC17143b {
        /* renamed from: fB */
        void mo68052fB();

        /* renamed from: yC */
        void mo68062yC();
    }

    public DiscoveryZinstantLayout(Context context) {
        super(context);
        this.f87640b0 = new AtomicInteger(0);
        this.f87642d0 = C18020c.m95817m();
        this.f87644f0 = new AtomicBoolean(true);
        this.f87639a0 = new HandlerC17142a(Looper.getMainLooper());
        setUseProgressLoading(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m91661V0() {
        m92006w0(EnumC20598u.LIMIT);
    }

    /* renamed from: a1 */
    private void m91665a1(AbstractC20601x abstractC20601x, Exception exc) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Discovery Error\n");
        C22505c zinstantDataModel = getZinstantDataModel();
        if (zinstantDataModel != null) {
            sb2.append("ZinstantDataConfig: ");
            sb2.append(zinstantDataModel);
            sb2.append("\n");
            C22504b m107213e = C20599v.m107204a().m107213e(zinstantDataModel);
            if (m107213e != null) {
                sb2.append("ZinstantData: ");
                sb2.append(m107213e);
                sb2.append("\n");
            }
        }
        if (abstractC20601x != null) {
            sb2.append("Request: ");
            sb2.append(abstractC20601x);
            sb2.append("\n");
        }
        if (exc != null) {
            sb2.append("Exception: ");
            sb2.append(exc);
            sb2.append("\n");
        }
        AbstractC20110a.m104543l("DiscoveryZinstantLayout").mo104556o(8, sb2.toString(), new Object[0]);
    }

    /* renamed from: c1 */
    private void m91666c1() {
        this.f87640b0.set(0);
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: A0 */
    public void mo91667A0(boolean z11) {
        super.mo91667A0(z11);
        if (z11) {
            this.f87642d0.m95827J(null);
        }
        m91669b1();
    }

    /* renamed from: Z0 */
    public void m91668Z0() {
        C23855s0 m95835q = C18020c.m95817m().m95835q();
        if (m95835q != null) {
            setZinstantRootView(m95835q);
        } else {
            m91661V0();
        }
    }

    /* renamed from: b1 */
    public void m91669b1() {
        this.f87639a0.sendEmptyMessageDelayed(1, 60L);
    }

    /* renamed from: d1 */
    public void m91670d1() {
        Handler handler = this.f87639a0;
        if (handler != null) {
            handler.removeMessages(4);
        }
        InterfaceC17143b interfaceC17143b = this.f87641c0;
        if (interfaceC17143b != null) {
            interfaceC17143b.mo68062yC();
        }
    }

    /* renamed from: e1 */
    protected void m91671e1() {
        Handler handler = this.f87639a0;
        if (handler != null) {
            handler.removeMessages(5);
            if (getZinstantRootTree() == null) {
                m91669b1();
                return;
            }
        }
        InterfaceC17143b interfaceC17143b = this.f87641c0;
        if (interfaceC17143b != null) {
            interfaceC17143b.mo68052fB();
        }
        AbstractC17153h.m91714f();
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    public int getPreferredWidth() {
        return this.f87642d0.m95833o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: h0 */
    public void mo91672h0(int i11) {
        super.mo91672h0(i11);
        this.f87642d0.m95832k().mo91775r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: i0 */
    public void mo91434i0(AbstractC20601x abstractC20601x, Exception exc) {
        String str;
        m91665a1(abstractC20601x, exc);
        if (exc instanceof ZinstantException) {
            ZinstantException zinstantException = (ZinstantException) exc;
            if (zinstantException.m91678c()) {
                C23855s0 c23855s0 = this.f87812s;
                C22505c zinstantDataModel = getZinstantDataModel();
                if (zinstantDataModel != null) {
                    str = zinstantDataModel.mo116353c();
                } else {
                    str = null;
                }
                if (c23855s0 != null && c23855s0.checkIntegrity(getPreferredWidth(), getPreferredHeight(), getCurrentLocale(), getCurrentTheme(), this.f87804S, str)) {
                    super.mo91673k0(c23855s0);
                } else {
                    this.f87642d0.m95827J(null);
                }
            } else if (zinstantException.m91677b() && this.f87644f0.get()) {
                this.f87644f0.set(false);
                this.f87639a0.sendEmptyMessageDelayed(1, 200L);
                return;
            }
        }
        this.f87639a0.sendEmptyMessage(4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: k0 */
    public void mo91673k0(C23855s0 c23855s0) {
        this.f87644f0.set(true);
        this.f87642d0.m95827J(c23855s0);
        this.f87642d0.f91267d = c23855s0.mo124397e();
        super.mo91673k0(c23855s0);
        this.f87639a0.sendEmptyMessage(5);
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, wj0.InterfaceC29061b
    public void onPause() {
        super.onPause();
        m91666c1();
        InterfaceC27294h interfaceC27294h = this.f87643e0;
        if (interfaceC27294h != null) {
            interfaceC27294h.mo91460z3();
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, wj0.InterfaceC29061b
    public void onResume() {
        super.onResume();
        InterfaceC27294h interfaceC27294h = this.f87643e0;
        if (interfaceC27294h != null) {
            interfaceC27294h.mo91458a();
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, wj0.InterfaceC29061b
    public void onStart() {
        super.onStart();
        InterfaceC27294h interfaceC27294h = this.f87643e0;
        if (interfaceC27294h != null) {
            interfaceC27294h.mo91458a();
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, wj0.InterfaceC29061b
    public void onStop() {
        super.onStop();
        Handler handler = this.f87639a0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        InterfaceC27294h interfaceC27294h = this.f87643e0;
        if (interfaceC27294h != null) {
            interfaceC27294h.mo91460z3();
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: r */
    protected boolean mo91674r() {
        return true;
    }

    public void setTimeOnScreenTracker(InterfaceC27294h interfaceC27294h) {
        this.f87643e0 = interfaceC27294h;
    }

    public void setUiImplementationSwitcher(InterfaceC17143b interfaceC17143b) {
        this.f87641c0 = interfaceC17143b;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantRootLayout, com.zing.zalo.zinstant.view.ZinstantLayout
    public void setZinstantRootView(C23855s0 c23855s0) {
        super.setZinstantRootView(c23855s0);
        this.f87639a0.sendEmptyMessage(5);
        m91666c1();
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: y0 */
    public boolean mo91675y0(EnumC20598u enumC20598u) {
        if (this.f87640b0.incrementAndGet() > 5 || !super.mo91675y0(enumC20598u)) {
            return false;
        }
        AbstractC17153h.m91711c();
        return true;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: z0 */
    public void mo91437z0() {
        mo91667A0(false);
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    public C22505c getZinstantDataModel() {
        return this.f87642d0.m95834p();
    }
}
