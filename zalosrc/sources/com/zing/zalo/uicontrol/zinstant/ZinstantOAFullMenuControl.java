package com.zing.zalo.uicontrol.zinstant;

import ak0.InterfaceC0887b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuControl;
import gd0.C19406k;
import gd0.InterfaceC19396a;
import gd0.InterfaceC19397b;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class ZinstantOAFullMenuControl extends FrameLayout {

    /* renamed from: p */
    private InterfaceC0887b f84600p;

    /* renamed from: q */
    private InterfaceC0887b f84601q;

    /* renamed from: r */
    private InterfaceC19396a f84602r;

    /* renamed from: s */
    private InterfaceC19396a f84603s;

    /* renamed from: t */
    private boolean f84604t;

    /* renamed from: u */
    private boolean f84605u;

    /* renamed from: v */
    private C19406k f84606v;

    /* renamed from: w */
    private boolean f84607w;

    /* renamed from: x */
    private int f84608x;

    /* renamed from: y */
    private final AtomicBoolean f84609y;

    /* renamed from: z */
    private int f84610z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuControl$a */
    /* loaded from: classes4.dex */
    public class C16689a extends C19406k {
        C16689a() {
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: c */
        public void mo60353c() {
            ZinstantOAFullMenuControl.this.f84609y.set(true);
            if (ZinstantOAFullMenuControl.this.f84610z != 9 && ZinstantOAFullMenuControl.this.f84609y.getAndSet(false)) {
                ZinstantOAFullMenuControl.this.m88907n();
            }
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: e */
        public void mo60354e(int i11) {
            ZinstantOAFullMenuControl.this.f84608x = i11;
        }

        @Override // gd0.C19406k, gd0.InterfaceC19397b
        /* renamed from: f */
        public void mo60355f(boolean z11) {
            ZinstantOAFullMenuControl.this.f84607w = z11;
        }
    }

    public ZinstantOAFullMenuControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84600p = null;
        this.f84601q = null;
        this.f84604t = false;
        this.f84605u = false;
        this.f84607w = false;
        this.f84608x = -1;
        this.f84609y = new AtomicBoolean(false);
        this.f84610z = -1;
        m88904i();
    }

    /* renamed from: g */
    private InterfaceC19396a m88903g(InterfaceC0887b interfaceC0887b) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int mo2742f = interfaceC0887b.mo2742f();
        if (mo2742f != 1) {
            if (mo2742f != 2) {
                return null;
            }
            return (InterfaceC19396a) from.inflate(AbstractC7409c0.zinstant_oa_layout_v2, (ViewGroup) this, false);
        }
        return (InterfaceC19396a) from.inflate(AbstractC7409c0.zinstant_oa_layout_v1, (ViewGroup) this, false);
    }

    /* renamed from: i */
    private void m88904i() {
        this.f84606v = new C19406k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m88905j() {
        InterfaceC19396a interfaceC19396a = this.f84602r;
        if (interfaceC19396a != null && this.f84603s != null) {
            interfaceC19396a.stop();
            removeView(this.f84602r.getView());
            InterfaceC19396a interfaceC19396a2 = this.f84603s;
            this.f84602r = interfaceC19396a2;
            addView(interfaceC19396a2.getView());
            this.f84603s = null;
            this.f84602r.setZinstantOAListener(this.f84606v);
            this.f84606v.mo60355f(this.f84607w);
            this.f84606v.mo60353c();
            this.f84606v.mo60354e(this.f84608x);
        }
    }

    /* renamed from: m */
    private void m88906m(InterfaceC0887b interfaceC0887b) {
        if (this.f84600p.mo2742f() == interfaceC0887b.mo2742f() && ((this.f84600p.mo2738b() == null && interfaceC0887b.mo2738b() == null) || (this.f84600p.mo2738b() != null && this.f84600p.mo2738b().equals(interfaceC0887b.mo2738b())))) {
            if (this.f84600p.mo2739c() != null || interfaceC0887b.mo2739c() != null) {
                if (this.f84600p.mo2739c() != null && this.f84600p.mo2739c().equals(interfaceC0887b.mo2739c())) {
                    return;
                }
            } else {
                return;
            }
        }
        InterfaceC19396a m88903g = m88903g(interfaceC0887b);
        this.f84603s = m88903g;
        if (m88903g != null) {
            m88903g.setZinstantOAListener(new C16689a());
            this.f84603s.mo88893a(interfaceC0887b);
            this.f84603s.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m88907n() {
        AbstractC20110a.m104535d("Replace caching Zinstant OA Menu with new Zinstant OA Menu", new Object[0]);
        AbstractC19444a.m101694b(new Runnable() { // from class: gd0.e
            @Override // java.lang.Runnable
            public final void run() {
                ZinstantOAFullMenuControl.this.m88905j();
            }
        }, 16L);
    }

    public int getCurrentZinstantDataVersion() {
        InterfaceC0887b interfaceC0887b = this.f84600p;
        if (interfaceC0887b != null) {
            return interfaceC0887b.mo2742f();
        }
        return -1;
    }

    /* renamed from: h */
    public void m88908h(InterfaceC0887b interfaceC0887b) {
        if (this.f84604t) {
            this.f84601q = interfaceC0887b;
            return;
        }
        this.f84604t = true;
        this.f84600p = interfaceC0887b;
        InterfaceC19396a m88903g = m88903g(interfaceC0887b);
        this.f84602r = m88903g;
        if (m88903g == null) {
            return;
        }
        m88903g.setZinstantOAListener(this.f84606v);
        addView(this.f84602r.getView());
        this.f84602r.mo88893a(interfaceC0887b);
    }

    /* renamed from: k */
    public void m88909k(int i11) {
        this.f84610z = i11;
        if (i11 != 9 && this.f84609y.getAndSet(false)) {
            m88907n();
        }
    }

    /* renamed from: l */
    public void m88910l() {
        InterfaceC19396a interfaceC19396a = this.f84602r;
        if (interfaceC19396a != null) {
            interfaceC19396a.stop();
        }
        InterfaceC19396a interfaceC19396a2 = this.f84603s;
        if (interfaceC19396a2 != null) {
            interfaceC19396a2.stop();
        }
        this.f84602r = null;
        this.f84603s = null;
        this.f84604t = false;
    }

    /* renamed from: p */
    public void m88911p() {
        InterfaceC19396a interfaceC19396a;
        if (this.f84604t) {
            InterfaceC0887b interfaceC0887b = this.f84601q;
            if (interfaceC0887b != null) {
                m88906m(interfaceC0887b);
                this.f84601q = null;
            }
            if (!this.f84605u && (interfaceC19396a = this.f84602r) != null) {
                this.f84605u = true;
                interfaceC19396a.start();
                return;
            }
            return;
        }
        throw new RuntimeException("ZinstantOAControl is not initialized.");
    }

    public void setZinstantOAListener(InterfaceC19397b interfaceC19397b) {
        this.f84606v.m101523k(interfaceC19397b);
    }

    public ZinstantOAFullMenuControl(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f84600p = null;
        this.f84601q = null;
        this.f84604t = false;
        this.f84605u = false;
        this.f84607w = false;
        this.f84608x = -1;
        this.f84609y = new AtomicBoolean(false);
        this.f84610z = -1;
        m88904i();
    }
}
