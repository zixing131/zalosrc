package com.zing.zalo.uicontrol.zinstant;

import ak0.InterfaceC0887b;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ck0.C3568b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenu;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import gd0.InterfaceC19396a;
import gd0.InterfaceC19397b;
import gg0.AbstractC19444a;
import hk0.InterfaceC20083a;
import ho0.AbstractC20110a;
import ik0.C20599v;
import ik0.InterfaceC20578a0;
import java.util.concurrent.atomic.AtomicBoolean;
import lk0.InterfaceC22508f;
import ll0.C22514b;
import me0.AbstractC23136l9;
import p266jg.C21243a;
import pj0.InterfaceC24775a;

/* loaded from: classes4.dex */
public class ZinstantOAFullMenu extends FrameLayout implements InterfaceC19396a {

    /* renamed from: p */
    private ZaloZinstantLayout f84586p;

    /* renamed from: q */
    private C17244x0 f84587q;

    /* renamed from: r */
    private final Handler f84588r;

    /* renamed from: s */
    private boolean f84589s;

    /* renamed from: t */
    private boolean f84590t;

    /* renamed from: u */
    private boolean f84591u;

    /* renamed from: v */
    private int f84592v;

    /* renamed from: w */
    private InterfaceC19397b f84593w;

    /* renamed from: x */
    private final AtomicBoolean f84594x;

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenu$a */
    /* loaded from: classes4.dex */
    class HandlerC16685a extends Handler {
        HandlerC16685a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (ZinstantOAFullMenu.this.f84594x.get()) {
                return;
            }
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    ZinstantOAFullMenu.this.m88890x();
                }
            } else {
                C17244x0 c17244x0 = (C17244x0) message.obj;
                if (c17244x0 == null) {
                    ZinstantOAFullMenu.this.m88868A();
                } else {
                    ZinstantOAFullMenu.this.m88888v(c17244x0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenu$b */
    /* loaded from: classes4.dex */
    public class C16686b implements C3568b.b {
        C16686b() {
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            AbstractC20110a.m104539h(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            ZinstantOAFullMenu zinstantOAFullMenu = ZinstantOAFullMenu.this;
            zinstantOAFullMenu.f84589s = zinstantOAFullMenu.m88886s(zinstantOAFullMenu.f84587q);
            ZinstantOAFullMenu.this.m88891y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenu$c */
    /* loaded from: classes4.dex */
    public class C16687c implements InterfaceC24775a {
        C16687c() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            ZinstantOAFullMenu.this.f84588r.removeMessages(2);
            if (ZinstantOAFullMenu.this.f84593w != null) {
                ZinstantOAFullMenu.this.f84593w.mo60355f(ZinstantOAFullMenu.this.f84589s);
                ZinstantOAFullMenu.this.f84593w.mo60353c();
            }
            if (!ZinstantOAFullMenu.this.f84586p.m91989T()) {
                ZinstantOAFullMenu.this.f84586p.onStart();
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            ZinstantOAFullMenu.this.m88889w(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenu$d */
    /* loaded from: classes4.dex */
    public class C16688d implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ C17244x0 f84598a;

        C16688d(C17244x0 c17244x0) {
            this.f84598a = c17244x0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m88896d(InterfaceC20578a0 interfaceC20578a0, C17244x0 c17244x0) {
            ZinstantOAFullMenu.this.m88869B(interfaceC20578a0, c17244x0);
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(final InterfaceC20578a0 interfaceC20578a0) {
            final C17244x0 c17244x0 = this.f84598a;
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.uicontrol.zinstant.a
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenu.C16688d.this.m88896d(interfaceC20578a0, c17244x0);
                }
            });
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            ZinstantOAFullMenu.this.m88889w(exc);
        }
    }

    public ZinstantOAFullMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84589s = false;
        this.f84590t = false;
        this.f84591u = false;
        this.f84592v = 0;
        this.f84594x = new AtomicBoolean(false);
        this.f84588r = new HandlerC16685a(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public void m88868A() {
        this.f84588r.removeMessages(2);
        this.f84588r.sendMessageDelayed(this.f84588r.obtainMessage(2), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m88869B(InterfaceC20578a0 interfaceC20578a0, C17244x0 c17244x0) {
        InterfaceC22508f m92064b = c17244x0.m92064b();
        if (!this.f84594x.get() && m92064b != null) {
            this.f84586p.m91447b1(m92064b, interfaceC20578a0);
            this.f84586p.m91446Z0(new C16687c());
        }
    }

    private int getScreenWidth() {
        int m118722k0 = AbstractC23136l9.m118722k0();
        if (!(getContext() instanceof Activity) && getContext().getResources().getConfiguration().orientation == 2) {
            return m118722k0 - (C21243a.f103541p + (C21243a.f103542q * 2));
        }
        return m118722k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public boolean m88886s(C17244x0 c17244x0) {
        return !C20599v.m107204a().m107215g(c17244x0.m92064b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m88887u() {
        C3568b.m18124b().m18127d(new C16686b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m88888v(C17244x0 c17244x0) {
        try {
            if (c17244x0.m92064b() == null) {
                m88889w(new Exception("Data model is null."));
            } else {
                AbstractC17148f0.m91694m(c17244x0.m92064b(), getScreenWidth(), new C16688d(c17244x0));
            }
        } catch (Exception e11) {
            m88889w(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m88889w(Exception exc) {
        AbstractC20110a.m104539h(exc);
        InterfaceC19397b interfaceC19397b = this.f84593w;
        if (interfaceC19397b != null) {
            interfaceC19397b.mo60357h(exc);
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: gd0.c
            @Override // java.lang.Runnable
            public final void run() {
                ZinstantOAFullMenu.this.m88868A();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m88890x() {
        int i11 = this.f84592v;
        if (i11 >= 5) {
            return;
        }
        this.f84592v = i11 + 1;
        AbstractC20110a.m104535d("Retry loading OA menu...", new Object[0]);
        C17244x0 c17244x0 = this.f84587q;
        if (c17244x0 != null && c17244x0.m92064b() != null) {
            m88891y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m88891y() {
        m88892z(16L);
    }

    /* renamed from: z */
    private void m88892z(long j11) {
        this.f84588r.removeMessages(1);
        this.f84588r.sendMessageDelayed(this.f84588r.obtainMessage(1, this.f84587q), j11);
    }

    @Override // gd0.InterfaceC19396a
    /* renamed from: a */
    public void mo88893a(InterfaceC0887b interfaceC0887b) {
        C17244x0 c17244x0;
        if (this.f84590t) {
            return;
        }
        this.f84590t = true;
        this.f84586p = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_oa_menu_picker);
        if (interfaceC0887b.mo2742f() == 1) {
            c17244x0 = interfaceC0887b.mo2738b();
        } else {
            c17244x0 = null;
        }
        this.f84587q = c17244x0;
        InterfaceC19397b interfaceC19397b = this.f84593w;
        if (interfaceC19397b != null) {
            this.f84586p.setOnZinstantClickListener(interfaceC19397b);
        }
        C17244x0 c17244x02 = this.f84587q;
        if (c17244x02 == null || c17244x02.m92064b() == null) {
            this.f84590t = false;
        }
    }

    @Override // gd0.InterfaceC19396a
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ZaloZinstantLayout zaloZinstantLayout = this.f84586p;
        if (zaloZinstantLayout != null && zaloZinstantLayout.m91989T()) {
            this.f84586p.onStop();
        }
    }

    @Override // gd0.InterfaceC19396a
    public void setZinstantOAListener(InterfaceC19397b interfaceC19397b) {
        this.f84593w = interfaceC19397b;
        ZaloZinstantLayout zaloZinstantLayout = this.f84586p;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.setOnZinstantClickListener(interfaceC19397b);
        }
    }

    @Override // gd0.InterfaceC19396a
    public void start() {
        if (!this.f84591u && this.f84590t) {
            this.f84591u = true;
            AbstractC20110a.m104535d("Begin load Zinstant OA Menu", new Object[0]);
            C17244x0 c17244x0 = this.f84587q;
            if (c17244x0 != null && c17244x0.m92064b() != null) {
                C22514b.m116415b().m116416a(new Runnable() { // from class: gd0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantOAFullMenu.this.m88887u();
                    }
                });
            } else {
                m88868A();
            }
        }
    }

    @Override // gd0.InterfaceC19396a
    public void stop() {
        this.f84594x.set(true);
        ZaloZinstantLayout zaloZinstantLayout = this.f84586p;
        if (zaloZinstantLayout != null && zaloZinstantLayout.m91989T()) {
            this.f84586p.onStop();
        }
    }
}
