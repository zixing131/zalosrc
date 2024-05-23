package com.zing.zalo.uicontrol.zinstant;

import ak0.InterfaceC0887b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ck0.C3568b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.AbstractC17153h;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.component.p081ui.scrollview.ZinstantScrollViewImpl;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import gd0.C19406k;
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
import org.json.JSONException;
import org.json.JSONObject;
import p266jg.C21243a;
import pj0.InterfaceC24775a;

/* loaded from: classes4.dex */
public class ZinstantOAFullMenuV2 extends FrameLayout implements InterfaceC19396a {

    /* renamed from: A */
    private int f84612A;

    /* renamed from: B */
    private boolean f84613B;

    /* renamed from: p */
    private ZaloZinstantLayout f84614p;

    /* renamed from: q */
    private ZinstantScrollViewImpl f84615q;

    /* renamed from: r */
    private boolean f84616r;

    /* renamed from: s */
    private boolean f84617s;

    /* renamed from: t */
    private boolean f84618t;

    /* renamed from: u */
    private final C19406k f84619u;

    /* renamed from: v */
    private InterfaceC0887b f84620v;

    /* renamed from: w */
    private InterfaceC20578a0 f84621w;

    /* renamed from: x */
    private InterfaceC20578a0 f84622x;

    /* renamed from: y */
    private boolean f84623y;

    /* renamed from: z */
    private final AtomicBoolean f84624z;

    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$a */
    /* loaded from: classes4.dex */
    class C16690a extends C19406k {
        C16690a() {
        }

        @Override // gd0.C19406k, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            JSONObject jSONObject;
            String str6;
            String zinstantDataId;
            if ("action.click.zinstant.scroll".equals(str3) || "action.oamenu.show".equals(str3)) {
                String str7 = null;
                try {
                    jSONObject = new JSONObject(str4);
                } catch (JSONException e11) {
                    e11.printStackTrace();
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    str7 = jSONObject.optString("zinstantdata_id", "");
                    str6 = jSONObject.optString("id", "");
                } else {
                    str6 = null;
                }
                int i11 = ZinstantOAFullMenuV2.this.f84612A;
                int i12 = 1;
                if (i11 != 0) {
                    if (i11 != 1) {
                        return;
                    }
                    zinstantDataId = ZinstantOAFullMenuV2.this.f84621w.getZinstantDataId();
                    i12 = 0;
                } else {
                    zinstantDataId = ZinstantOAFullMenuV2.this.f84622x.getZinstantDataId();
                }
                if (str7 == null || str7.isEmpty() || str7.equals(zinstantDataId)) {
                    ZinstantOAFullMenuV2.this.m88946x(i12, str6);
                } else {
                    return;
                }
            }
            super.mo43842i(zinstantLayout, str, str2, str3, str4, zOMInsight, str5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$b */
    /* loaded from: classes4.dex */
    public class C16691b implements C3568b.b {
        C16691b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m88950b() {
            ZinstantOAFullMenuV2 zinstantOAFullMenuV2 = ZinstantOAFullMenuV2.this;
            boolean z11 = zinstantOAFullMenuV2.f84623y;
            ZinstantOAFullMenuV2 zinstantOAFullMenuV22 = ZinstantOAFullMenuV2.this;
            zinstantOAFullMenuV2.f84623y = z11 | zinstantOAFullMenuV22.m88947y(zinstantOAFullMenuV22.f84620v.mo2739c());
            ZinstantOAFullMenuV2 zinstantOAFullMenuV23 = ZinstantOAFullMenuV2.this;
            boolean z12 = zinstantOAFullMenuV23.f84623y;
            ZinstantOAFullMenuV2 zinstantOAFullMenuV24 = ZinstantOAFullMenuV2.this;
            zinstantOAFullMenuV23.f84623y = z12 | zinstantOAFullMenuV24.m88947y(zinstantOAFullMenuV24.f84620v.mo2738b());
            ZinstantOAFullMenuV2.this.m88924M();
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            C22514b.m116415b().m116416a(new Runnable() { // from class: com.zing.zalo.uicontrol.zinstant.e
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenuV2.C16691b.this.m88950b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$c */
    /* loaded from: classes4.dex */
    public class C16692c implements InterfaceC24775a {
        C16692c() {
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            if (!ZinstantOAFullMenuV2.this.f84614p.m91989T()) {
                ZinstantOAFullMenuV2.this.f84614p.onStart();
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(Exception exc) {
            ZinstantOAFullMenuV2.this.m88921J(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$d */
    /* loaded from: classes4.dex */
    public class C16693d implements InterfaceC20083a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC16696g f84628a;

        C16693d(InterfaceC16696g interfaceC16696g) {
            this.f84628a = interfaceC16696g;
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            if (!ZinstantOAFullMenuV2.this.f84613B) {
                this.f84628a.mo88953a(interfaceC20578a0);
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            if (!ZinstantOAFullMenuV2.this.f84613B) {
                ZinstantOAFullMenuV2.this.m88921J(exc);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$e */
    /* loaded from: classes4.dex */
    public class C16694e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC16695f f84630p;

        C16694e(InterfaceC16695f interfaceC16695f) {
            this.f84630p = interfaceC16695f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            InterfaceC16695f interfaceC16695f = this.f84630p;
            if (interfaceC16695f != null) {
                interfaceC16695f.mo88952a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$f */
    /* loaded from: classes4.dex */
    public interface InterfaceC16695f {
        /* renamed from: a */
        void mo88952a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2$g */
    /* loaded from: classes4.dex */
    public interface InterfaceC16696g {
        /* renamed from: a */
        void mo88953a(InterfaceC20578a0 interfaceC20578a0);
    }

    public ZinstantOAFullMenuV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f84616r = false;
        this.f84617s = false;
        this.f84618t = false;
        this.f84623y = false;
        this.f84624z = new AtomicBoolean(false);
        this.f84612A = -1;
        this.f84613B = false;
        this.f84619u = new C16690a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m88913B(int i11, final String str, boolean z11) {
        this.f84619u.mo60355f(this.f84623y);
        this.f84619u.mo60354e(i11);
        this.f84619u.mo60353c();
        this.f84623y = false;
        if (str != null) {
            if (z11) {
                m88922K(new InterfaceC16695f() { // from class: com.zing.zalo.uicontrol.zinstant.b
                    @Override // com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2.InterfaceC16695f
                    /* renamed from: a */
                    public final void mo88952a() {
                        ZinstantOAFullMenuV2.this.m88912A(str);
                    }
                });
            } else {
                m88912A(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m88914C(String str) {
        this.f84615q.mo91519u(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m88915D(InterfaceC20578a0 interfaceC20578a0) {
        this.f84621w = interfaceC20578a0;
        m88925N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m88916E() {
        m88919H(this.f84620v.mo2739c(), new InterfaceC16696g() { // from class: com.zing.zalo.uicontrol.zinstant.c
            @Override // com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2.InterfaceC16696g
            /* renamed from: a */
            public final void mo88953a(InterfaceC20578a0 interfaceC20578a0) {
                ZinstantOAFullMenuV2.this.m88915D(interfaceC20578a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m88917F(InterfaceC20578a0 interfaceC20578a0) {
        this.f84622x = interfaceC20578a0;
        m88925N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m88918G() {
        m88919H(this.f84620v.mo2738b(), new InterfaceC16696g() { // from class: com.zing.zalo.uicontrol.zinstant.d
            @Override // com.zing.zalo.uicontrol.zinstant.ZinstantOAFullMenuV2.InterfaceC16696g
            /* renamed from: a */
            public final void mo88953a(InterfaceC20578a0 interfaceC20578a0) {
                ZinstantOAFullMenuV2.this.m88917F(interfaceC20578a0);
            }
        });
    }

    /* renamed from: H */
    private void m88919H(C17244x0 c17244x0, InterfaceC16696g interfaceC16696g) {
        if (this.f84613B) {
            return;
        }
        if (c17244x0.m92064b() == null) {
            m88921J(new Exception("Data model is null."));
        } else {
            AbstractC17148f0.m91694m(c17244x0.m92064b(), getScreenWidth(), new C16693d(interfaceC16696g));
        }
    }

    /* renamed from: I */
    private void m88920I(InterfaceC22508f interfaceC22508f, InterfaceC20578a0 interfaceC20578a0) {
        if (this.f84614p.m91989T()) {
            this.f84614p.onStop();
        }
        this.f84614p.m91447b1(interfaceC22508f, interfaceC20578a0);
        this.f84614p.m91446Z0(new C16692c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public void m88921J(Exception exc) {
        AbstractC20110a.m104539h(exc);
        this.f84619u.mo60357h(exc);
        if (!this.f84624z.get()) {
            this.f84624z.set(true);
            AbstractC17153h.m91731w(exc);
        }
    }

    /* renamed from: K */
    private void m88922K(InterfaceC16695f interfaceC16695f) {
        this.f84614p.setAlpha(0.0f);
        this.f84614p.setScaleX(0.5f);
        this.f84614p.setScaleY(0.5f);
        this.f84614p.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setListener(new C16694e(interfaceC16695f)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m88912A(final String str) {
        C22514b.m116415b().m116416a(new Runnable() { // from class: gd0.h
            @Override // java.lang.Runnable
            public final void run() {
                ZinstantOAFullMenuV2.this.m88914C(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public void m88924M() {
        InterfaceC0887b interfaceC0887b = this.f84620v;
        if (interfaceC0887b != null && interfaceC0887b.mo2739c() != null && this.f84620v.mo2738b() != null && !this.f84613B) {
            C22514b.m116415b().m116416a(new Runnable() { // from class: gd0.i
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenuV2.this.m88916E();
                }
            });
            C22514b.m116415b().m116416a(new Runnable() { // from class: gd0.j
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenuV2.this.m88918G();
                }
            });
        }
    }

    /* renamed from: N */
    private void m88925N() {
        if (this.f84621w != null && this.f84622x != null && !this.f84613B) {
            if (!this.f84624z.get()) {
                AbstractC17153h.m91732x();
            }
            if (this.f84621w.getHeight() != 0 && this.f84622x.getHeight() != 0) {
                m88946x(0, null);
            }
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
    /* renamed from: x */
    public void m88946x(int i11, final String str) {
        final int i12;
        InterfaceC0887b interfaceC0887b;
        if (this.f84612A != i11 && !this.f84613B) {
            this.f84612A = i11;
            AbstractC19444a.m101697e(new Runnable() { // from class: gd0.f
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenuV2.this.m88948z();
                }
            });
            int i13 = this.f84612A;
            final boolean z11 = false;
            if (i13 != 0) {
                if (i13 == 1 && (interfaceC0887b = this.f84620v) != null && interfaceC0887b.mo2738b() != null && this.f84620v.mo2738b().m92064b() != null) {
                    InterfaceC20578a0 interfaceC20578a0 = this.f84622x;
                    if (interfaceC20578a0 != null) {
                        i12 = interfaceC20578a0.getHeight();
                    } else {
                        i12 = 0;
                    }
                    m88920I(this.f84620v.mo2738b().m92064b(), this.f84622x);
                } else {
                    return;
                }
            } else {
                InterfaceC0887b interfaceC0887b2 = this.f84620v;
                if (interfaceC0887b2 != null && interfaceC0887b2.mo2739c() != null && this.f84620v.mo2739c().m92064b() != null) {
                    InterfaceC20578a0 interfaceC20578a02 = this.f84621w;
                    if (interfaceC20578a02 != null) {
                        i12 = interfaceC20578a02.getHeight();
                    } else {
                        i12 = 0;
                    }
                    m88920I(this.f84620v.mo2739c().m92064b(), this.f84621w);
                } else {
                    return;
                }
            }
            AbstractC19444a.m101697e(new Runnable() { // from class: gd0.g
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantOAFullMenuV2.this.m88913B(i12, str, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m88947y(C17244x0 c17244x0) {
        return !C20599v.m107204a().m107215g(c17244x0.m92064b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m88948z() {
        this.f84614p.removeAllViews();
    }

    @Override // gd0.InterfaceC19396a
    /* renamed from: a */
    public void mo88893a(InterfaceC0887b interfaceC0887b) {
        if (this.f84616r) {
            return;
        }
        this.f84616r = true;
        this.f84614p = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_oa_menu_picker_v2);
        this.f84615q = (ZinstantScrollViewImpl) findViewById(AbstractC6918a0.parentScrollView);
        this.f84614p.setOnZinstantClickListener(this.f84619u);
        this.f84620v = interfaceC0887b;
        if (interfaceC0887b.mo2742f() == 2 && this.f84620v.mo2738b() != null && this.f84620v.mo2739c() != null && this.f84620v.mo2738b().m92064b() != null && this.f84620v.mo2739c().m92064b() != null) {
            this.f84618t = true;
        } else {
            this.f84616r = false;
            this.f84618t = false;
        }
    }

    @Override // gd0.InterfaceC19396a
    public View getView() {
        return this;
    }

    @Override // gd0.InterfaceC19396a
    public void setZinstantOAListener(InterfaceC19397b interfaceC19397b) {
        this.f84619u.m101523k(interfaceC19397b);
    }

    @Override // gd0.InterfaceC19396a
    public void start() {
        if (this.f84616r && !this.f84617s && this.f84618t) {
            this.f84617s = true;
            InterfaceC0887b interfaceC0887b = this.f84620v;
            if (interfaceC0887b != null && interfaceC0887b.mo2739c() != null && this.f84620v.mo2738b() != null) {
                C3568b.m18124b().m18127d(new C16691b());
            }
        }
    }

    @Override // gd0.InterfaceC19396a
    public void stop() {
        this.f84613B = true;
        ZaloZinstantLayout zaloZinstantLayout = this.f84614p;
        if (zaloZinstantLayout != null && zaloZinstantLayout.m91989T()) {
            this.f84614p.onStop();
        }
    }

    public ZinstantOAFullMenuV2(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f84616r = false;
        this.f84617s = false;
        this.f84618t = false;
        this.f84623y = false;
        this.f84624z = new AtomicBoolean(false);
        this.f84612A = -1;
        this.f84613B = false;
        this.f84619u = new C16690a();
    }
}
