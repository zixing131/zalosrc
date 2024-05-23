package com.zing.zalo.uicontrol.zinstant;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import com.zing.zalo.uicontrol.zinstant.ZinstantQuickMenu;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import gd0.InterfaceC19397b;
import gg0.AbstractC19444a;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.InterfaceC20578a0;
import me0.AbstractC23136l9;
import p266jg.C21243a;
import pj0.InterfaceC24775a;

/* loaded from: classes4.dex */
public class ZinstantQuickMenu extends ZaloZinstantLayout {

    /* renamed from: g0 */
    private C17244x0 f84635g0;

    /* renamed from: h0 */
    private int f84636h0;

    /* renamed from: i0 */
    private InterfaceC19397b f84637i0;

    /* renamed from: j0 */
    private final Handler f84638j0;

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantQuickMenu$a */
    /* loaded from: classes4.dex */
    class HandlerC16699a extends Handler {
        HandlerC16699a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message.what == 1 && ZinstantQuickMenu.this.f84636h0 < 5 && (obj = message.obj) != null) {
                ZinstantQuickMenu.this.f84636h0++;
                ZinstantQuickMenu.this.m88966n1((C17244x0) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantQuickMenu$b */
    /* loaded from: classes4.dex */
    public class C16700b implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ C17244x0 f84640a;

        C16700b(C17244x0 c17244x0) {
            this.f84640a = c17244x0;
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            ZinstantQuickMenu.this.m88967o1(interfaceC20578a0, this.f84640a);
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            ZinstantQuickMenu.this.m88964l1(this.f84640a, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantQuickMenu$c */
    /* loaded from: classes4.dex */
    public class C16701c implements InterfaceC24775a {

        /* renamed from: a */
        final /* synthetic */ C17244x0 f84642a;

        C16701c(C17244x0 c17244x0) {
            this.f84642a = c17244x0;
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            if (ZinstantQuickMenu.this.f84637i0 != null) {
                ZinstantQuickMenu.this.f84637i0.mo60353c();
            }
            if (!ZinstantQuickMenu.this.m91989T()) {
                ZinstantQuickMenu.this.onStart();
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            ZinstantQuickMenu.this.m88964l1(this.f84642a, exc);
        }
    }

    public ZinstantQuickMenu(Context context) {
        super(context);
        this.f84636h0 = 0;
        this.f84638j0 = new HandlerC16699a(Looper.getMainLooper());
    }

    private int getScreenWidth() {
        int m118725l0 = AbstractC23136l9.m118725l0(getContext());
        if (!(getContext() instanceof Activity) && getContext().getResources().getConfiguration().orientation == 2) {
            return m118725l0 - (C21243a.f103541p + (C21243a.f103542q * 2));
        }
        return m118725l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ void m88963j1(Exception exc) {
        InterfaceC19397b interfaceC19397b = this.f84637i0;
        if (interfaceC19397b != null) {
            interfaceC19397b.mo60357h(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public void m88964l1(C17244x0 c17244x0, final Exception exc) {
        AbstractC20110a.m104539h(exc);
        AbstractC19444a.m101697e(new Runnable() { // from class: gd0.l
            @Override // java.lang.Runnable
            public final void run() {
                ZinstantQuickMenu.this.m88963j1(exc);
            }
        });
        m88965m1(c17244x0, 2000L);
    }

    /* renamed from: m1 */
    private void m88965m1(C17244x0 c17244x0, long j11) {
        this.f84638j0.removeMessages(1);
        this.f84638j0.sendMessageDelayed(this.f84638j0.obtainMessage(1, c17244x0), j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public void m88966n1(C17244x0 c17244x0) {
        if (c17244x0 != null && c17244x0.m92064b() != null && !c17244x0.equals(this.f84635g0)) {
            this.f84635g0 = c17244x0;
            try {
                AbstractC17148f0.m91694m(c17244x0.m92064b(), getScreenWidth(), new C16700b(c17244x0));
            } catch (Exception e11) {
                m88964l1(c17244x0, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public void m88967o1(InterfaceC20578a0 interfaceC20578a0, C17244x0 c17244x0) {
        if (c17244x0.m92064b() == null) {
            m88964l1(c17244x0, new IllegalArgumentException("Zinstant model is null."));
        } else {
            if (interfaceC20578a0.getHeight() == 0) {
                return;
            }
            m91447b1(c17244x0.m92064b(), interfaceC20578a0);
            m91446Z0(new C16701c(c17244x0));
        }
    }

    /* renamed from: k1 */
    public void m88968k1(C17244x0 c17244x0) {
        AbstractC20110a.m104535d("Begin load Zinstant Quick Menu", new Object[0]);
        this.f84636h0 = 0;
        m88965m1(c17244x0, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (m91989T()) {
            onStop();
        }
    }

    public void setZinstantOAListener(InterfaceC19397b interfaceC19397b) {
        this.f84637i0 = interfaceC19397b;
        setOnClickListener(interfaceC19397b);
    }

    public ZinstantQuickMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84636h0 = 0;
        this.f84638j0 = new HandlerC16699a(Looper.getMainLooper());
    }

    public ZinstantQuickMenu(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f84636h0 = 0;
        this.f84638j0 = new HandlerC16699a(Looper.getMainLooper());
    }
}
