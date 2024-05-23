package com.zing.zalo.zinstant;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import ck0.C3568b;
import gg0.AbstractC19444a;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20592o;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import nk0.C23855s0;
import p133ek.AbstractC18458a;
import pj0.InterfaceC24775a;

/* loaded from: classes7.dex */
public class ZaloZinstantLayout extends ZaloZinstantRootLayout {

    /* renamed from: a0 */
    C20592o f87454a0;

    /* renamed from: b0 */
    C23855s0 f87455b0;

    /* renamed from: c0 */
    InterfaceC24775a f87456c0;

    /* renamed from: d0 */
    C17177r0 f87457d0;

    /* renamed from: e0 */
    C20588k f87458e0;

    /* renamed from: f0 */
    private InterfaceC17098c f87459f0;

    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantLayout$a */
    /* loaded from: classes7.dex */
    class C17096a extends C20588k {
        C17096a() {
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: b */
        public void mo61858b(AbstractC20601x abstractC20601x, Exception exc) {
            super.mo61858b(abstractC20601x, exc);
            InterfaceC24775a interfaceC24775a = ZaloZinstantLayout.this.f87456c0;
            if (interfaceC24775a != null) {
                interfaceC24775a.mo15338c(exc);
            }
        }

        @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
        /* renamed from: c */
        public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
            super.mo61859c(abstractC20601x, interfaceC20578a0);
            InterfaceC24775a interfaceC24775a = ZaloZinstantLayout.this.f87456c0;
            if (interfaceC24775a != null) {
                interfaceC24775a.onSuccess(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantLayout$b */
    /* loaded from: classes7.dex */
    public class C17097b implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C17170o f87461a;

        C17097b(C17170o c17170o) {
            this.f87461a = c17170o;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            ZaloZinstantLayout.this.m91444X0(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            ZaloZinstantLayout zaloZinstantLayout = ZaloZinstantLayout.this;
            zaloZinstantLayout.setLayoutGateway(zaloZinstantLayout.f87457d0);
            ZaloZinstantLayout zaloZinstantLayout2 = ZaloZinstantLayout.this;
            C17170o c17170o = this.f87461a;
            if (c17170o == null) {
                c17170o = new C17170o();
            }
            zaloZinstantLayout2.setContextProvider(c17170o);
            ZaloZinstantLayout zaloZinstantLayout3 = ZaloZinstantLayout.this;
            zaloZinstantLayout3.setImageLoader(zaloZinstantLayout3.f87454a0);
            ZaloZinstantLayout zaloZinstantLayout4 = ZaloZinstantLayout.this;
            zaloZinstantLayout4.setZinstantViewRequestListener(zaloZinstantLayout4.f87458e0);
            ZaloZinstantLayout.this.mo91437z0();
        }
    }

    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantLayout$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC17098c {
        /* renamed from: a */
        void mo87299a();
    }

    public ZaloZinstantLayout(Context context) {
        super(context);
        this.f87457d0 = AbstractC17148f0.m91685d();
        this.f87458e0 = new C17096a();
        this.f87459f0 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public /* synthetic */ void m91443a1() {
        setZinstantRootView(this.f87455b0);
    }

    /* renamed from: X0 */
    void m91444X0(Exception exc) {
        InterfaceC24775a interfaceC24775a = this.f87456c0;
        if (interfaceC24775a != null) {
            interfaceC24775a.mo15338c(exc);
        }
    }

    /* renamed from: Y0 */
    public void m91445Y0(C17170o c17170o, InterfaceC24775a interfaceC24775a) {
        if (getZinstantDataModel() == null && this.f87455b0 == null) {
            m91444X0(new Exception("Input invalid, must call func setupData first."));
            return;
        }
        if (this.f87454a0 == null) {
            this.f87454a0 = new C20592o(getContext(), C17210v.f87767a);
        }
        this.f87456c0 = interfaceC24775a;
        C3568b.m18124b().m18127d(new C17097b(c17170o));
    }

    /* renamed from: Z0 */
    public void m91446Z0(InterfaceC24775a interfaceC24775a) {
        m91445Y0(null, interfaceC24775a);
    }

    /* renamed from: b1 */
    public void m91447b1(InterfaceC22508f interfaceC22508f, InterfaceC20578a0 interfaceC20578a0) {
        setZinstantDataModel(interfaceC22508f);
        this.f87455b0 = C23855s0.m124606T(interfaceC20578a0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new Runnable() { // from class: com.zing.zalo.zinstant.p0
            @Override // java.lang.Runnable
            public final void run() {
                ZaloZinstantLayout.this.mo91437z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        InterfaceC17098c interfaceC17098c = this.f87459f0;
        if (interfaceC17098c != null) {
            interfaceC17098c.mo87299a();
        }
    }

    public void setOnLayoutListener(InterfaceC17098c interfaceC17098c) {
        this.f87459f0 = interfaceC17098c;
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    public void setZinstantViewRequestListener(C20588k c20588k) {
        C20588k c20588k2 = this.f87458e0;
        if (c20588k == c20588k2) {
            super.setZinstantViewRequestListener(c20588k);
        } else {
            c20588k2.m107136f(c20588k);
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: z0 */
    public void mo91437z0() {
        String str;
        int i11;
        super.mo91437z0();
        InterfaceC22508f zinstantDataModel = getZinstantDataModel();
        if (zinstantDataModel != null) {
            str = zinstantDataModel.mo116353c();
        } else {
            str = null;
        }
        C23855s0 c23855s0 = this.f87455b0;
        if (c23855s0 != null && c23855s0.m124626G() && this.f87455b0.checkIntegrity(getPreferredWidth(), getPreferredHeight(), AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), AbstractC17148f0.m91685d(), str)) {
            if (AbstractC19444a.m101693a()) {
                setZinstantRootView(this.f87455b0);
            } else {
                AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.zinstant.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZaloZinstantLayout.this.m91443a1();
                    }
                });
            }
            InterfaceC24775a interfaceC24775a = this.f87456c0;
            if (interfaceC24775a != null) {
                interfaceC24775a.onSuccess(null);
                return;
            }
            return;
        }
        if (zinstantDataModel != null) {
            C23855s0 c23855s02 = this.f87455b0;
            if (c23855s02 != null) {
                i11 = c23855s02.m124651z();
            } else {
                i11 = -1;
            }
            int preferredWidth = getPreferredWidth();
            if (i11 > 0 && preferredWidth <= 0) {
                C17170o c17170o = (C17170o) getContextProvider();
                if (c17170o == null) {
                    c17170o = new C17170o();
                }
                c17170o.f87719a = i11;
                setContextProvider(c17170o);
            }
            if (!m92008x0()) {
                m91444X0(new Exception("input invalid"));
                return;
            }
            return;
        }
        m91444X0(new Exception("input invalid"));
    }

    public ZaloZinstantLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87457d0 = AbstractC17148f0.m91685d();
        this.f87458e0 = new C17096a();
        this.f87459f0 = null;
    }

    public ZaloZinstantLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f87457d0 = AbstractC17148f0.m91685d();
        this.f87458e0 = new C17096a();
        this.f87459f0 = null;
    }
}
