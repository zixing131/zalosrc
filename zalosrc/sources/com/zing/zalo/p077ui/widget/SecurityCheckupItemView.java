package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ck0.C3568b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.SecurityCheckupItemView;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17177r0;
import com.zing.zalo.zinstant.C17210v;
import com.zing.zalo.zinstant.ZaloZinstantRootLayout;
import com.zing.zalo.zinstant.utils.AbstractC17201m;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import ik0.AbstractC20597t;
import ik0.AbstractC20601x;
import ik0.C20588k;
import ik0.C20592o;
import ik0.C20599v;
import ik0.InterfaceC20578a0;
import lk0.C22504b;
import ll0.C22514b;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import p133ek.AbstractC18458a;
import p667y2.C30268e;
import pj0.AbstractC24788n;
import pj0.InterfaceC24785k;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class SecurityCheckupItemView extends FrameLayout {

    /* renamed from: p */
    private ZaloZinstantRootLayout f69582p;

    /* renamed from: q */
    private InterfaceC13522a f69583q;

    /* renamed from: r */
    private C20592o f69584r;

    /* renamed from: s */
    private final C17177r0 f69585s;

    /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13522a {
        /* renamed from: n1 */
        void mo75877n1();

        /* renamed from: o1 */
        void mo75878o1(String str, String str2, AbstractC28207v1.h0 h0Var);
    }

    /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$b */
    /* loaded from: classes6.dex */
    public static final class C13523b implements C3568b.b {

        /* renamed from: b */
        final /* synthetic */ C22504b f69587b;

        /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends C20588k {

            /* renamed from: b */
            final /* synthetic */ SecurityCheckupItemView f69588b;

            a(SecurityCheckupItemView securityCheckupItemView) {
                this.f69588b = securityCheckupItemView;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public static final void m75882h(SecurityCheckupItemView securityCheckupItemView, C23855s0 c23855s0) {
                AbstractC19074t.m100208f(securityCheckupItemView, "this$0");
                try {
                    ZaloZinstantRootLayout zaloZinstantRootLayout = securityCheckupItemView.f69582p;
                    ZaloZinstantRootLayout zaloZinstantRootLayout2 = null;
                    if (zaloZinstantRootLayout == null) {
                        AbstractC19074t.m100223u("zinstantLayout");
                        zaloZinstantRootLayout = null;
                    }
                    zaloZinstantRootLayout.setBackgroundResource(0);
                    ZaloZinstantRootLayout zaloZinstantRootLayout3 = securityCheckupItemView.f69582p;
                    if (zaloZinstantRootLayout3 == null) {
                        AbstractC19074t.m100223u("zinstantLayout");
                        zaloZinstantRootLayout3 = null;
                    }
                    zaloZinstantRootLayout3.m91942Z(c23855s0);
                    ZaloZinstantRootLayout zaloZinstantRootLayout4 = securityCheckupItemView.f69582p;
                    if (zaloZinstantRootLayout4 == null) {
                        AbstractC19074t.m100223u("zinstantLayout");
                    } else {
                        zaloZinstantRootLayout2 = zaloZinstantRootLayout4;
                    }
                    zaloZinstantRootLayout2.onStart();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // ik0.AbstractC20602y, ik0.InterfaceC20587j
            /* renamed from: c */
            public void mo61859c(AbstractC20601x abstractC20601x, InterfaceC20578a0 interfaceC20578a0) {
                AbstractC19074t.m100208f(abstractC20601x, "request");
                AbstractC19074t.m100208f(interfaceC20578a0, "zinstantResult");
                super.mo61859c(abstractC20601x, interfaceC20578a0);
                final C23855s0 m124606T = C23855s0.m124606T(interfaceC20578a0);
                if (m124606T == null) {
                    mo61858b(abstractC20601x, new Exception("Can't create instance of Zinstant"));
                } else {
                    final SecurityCheckupItemView securityCheckupItemView = this.f69588b;
                    AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.widget.w1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SecurityCheckupItemView.C13523b.a.m75882h(SecurityCheckupItemView.this, m124606T);
                        }
                    });
                }
            }
        }

        C13523b(C22504b c22504b) {
            this.f69587b = c22504b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m75880b(SecurityCheckupItemView securityCheckupItemView) {
            AbstractC19074t.m100208f(securityCheckupItemView, "this$0");
            try {
                ZaloZinstantRootLayout zaloZinstantRootLayout = securityCheckupItemView.f69582p;
                ZaloZinstantRootLayout zaloZinstantRootLayout2 = null;
                if (zaloZinstantRootLayout == null) {
                    AbstractC19074t.m100223u("zinstantLayout");
                    zaloZinstantRootLayout = null;
                }
                zaloZinstantRootLayout.onStop();
                ZaloZinstantRootLayout zaloZinstantRootLayout3 = securityCheckupItemView.f69582p;
                if (zaloZinstantRootLayout3 == null) {
                    AbstractC19074t.m100223u("zinstantLayout");
                } else {
                    zaloZinstantRootLayout2 = zaloZinstantRootLayout3;
                }
                zaloZinstantRootLayout2.m91973J0();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            final SecurityCheckupItemView securityCheckupItemView = SecurityCheckupItemView.this;
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.ui.widget.v1
                @Override // java.lang.Runnable
                public final void run() {
                    SecurityCheckupItemView.C13523b.m75880b(SecurityCheckupItemView.this);
                }
            });
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC19074t.m100208f(c3568b, "zinstantDagger");
            ZaloZinstantRootLayout zaloZinstantRootLayout = SecurityCheckupItemView.this.f69582p;
            if (zaloZinstantRootLayout == null) {
                AbstractC19074t.m100223u("zinstantLayout");
                zaloZinstantRootLayout = null;
            }
            C20599v.m107204a().m107219m(AbstractC20601x.m107226d(AbstractC20597t.m107198a(this.f69587b).mo107081a()).mo107112l(AbstractC20601x.b.m107228a(zaloZinstantRootLayout.getPreferredWidth(), AbstractC17148f0.m91684c()).mo107129d(AbstractC18458a.f93019a).mo107128c(SecurityCheckupItemView.this.f69585s).mo107126a()).mo107107g(this.f69587b.f110131e).mo107103c(), new a(SecurityCheckupItemView.this));
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$c */
    /* loaded from: classes6.dex */
    public static final class C13524c extends C17170o {
        C13524c() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return AbstractC17201m.m91811c();
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$d */
    /* loaded from: classes6.dex */
    public static final class C13525d extends AbstractC23803b {
        C13525d() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: a */
        public void mo61861a() {
            try {
                if (SecurityCheckupItemView.this.getParent() instanceof View.OnLongClickListener) {
                    ViewParent parent = SecurityCheckupItemView.this.getParent();
                    AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View.OnLongClickListener");
                    ((View.OnLongClickListener) parent).onLongClick(SecurityCheckupItemView.this);
                } else if (SecurityCheckupItemView.this.getParent() instanceof View) {
                    Object parent2 = SecurityCheckupItemView.this.getParent();
                    AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.View");
                    ((View) parent2).performLongClick();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            AbstractC19074t.m100208f(zinstantLayout, "thisLayout");
            AbstractC19074t.m100208f(str, "zinstantDataId");
            AbstractC19074t.m100208f(str3, "action");
            try {
                InterfaceC13522a actionProcessDelegate = SecurityCheckupItemView.this.getActionProcessDelegate();
                if (actionProcessDelegate != null) {
                    ZaloZinstantRootLayout zaloZinstantRootLayout = SecurityCheckupItemView.this.f69582p;
                    if (zaloZinstantRootLayout == null) {
                        AbstractC19074t.m100223u("zinstantLayout");
                        zaloZinstantRootLayout = null;
                    }
                    actionProcessDelegate.mo75878o1(str3, str4, zaloZinstantRootLayout.m91448V0(str3, str4, null));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.SecurityCheckupItemView$e */
    /* loaded from: classes6.dex */
    public static final class C13526e extends AbstractC24788n {
        C13526e() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            try {
                InterfaceC13522a actionProcessDelegate = SecurityCheckupItemView.this.getActionProcessDelegate();
                if (actionProcessDelegate != null) {
                    ZaloZinstantRootLayout zaloZinstantRootLayout = SecurityCheckupItemView.this.f69582p;
                    if (zaloZinstantRootLayout == null) {
                        AbstractC19074t.m100223u("zinstantLayout");
                        zaloZinstantRootLayout = null;
                    }
                    actionProcessDelegate.mo75878o1(str, str2, zaloZinstantRootLayout.m91448V0(str, str2, interfaceC24785k));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104549b(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityCheckupItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f69584r = new C20592o(context2, C17210v.f87767a);
        this.f69585s = new C17177r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m75871e(SecurityCheckupItemView securityCheckupItemView, C22504b c22504b) {
        AbstractC19074t.m100208f(securityCheckupItemView, "this$0");
        AbstractC19074t.m100208f(c22504b, "$zinstantData");
        C3568b.m18124b().m18127d(new C13523b(c22504b));
    }

    /* renamed from: d */
    public final void m75872d(final C22504b c22504b) {
        AbstractC19074t.m100208f(c22504b, "zinstantData");
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f69582p;
        ZaloZinstantRootLayout zaloZinstantRootLayout2 = null;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.setLayoutGateway(this.f69585s);
        ZaloZinstantRootLayout zaloZinstantRootLayout3 = this.f69582p;
        if (zaloZinstantRootLayout3 == null) {
            AbstractC19074t.m100223u("zinstantLayout");
        } else {
            zaloZinstantRootLayout2 = zaloZinstantRootLayout3;
        }
        zaloZinstantRootLayout2.setZinstantDataModel(c22504b);
        C22514b.m116415b().m116416a(new Runnable() { // from class: com.zing.zalo.ui.widget.u1
            @Override // java.lang.Runnable
            public final void run() {
                SecurityCheckupItemView.m75871e(SecurityCheckupItemView.this, c22504b);
            }
        });
    }

    /* renamed from: f */
    public void m75873f() {
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f69582p;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.onPause();
    }

    /* renamed from: g */
    public void m75874g() {
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f69582p;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.onResume();
    }

    public final InterfaceC13522a getActionProcessDelegate() {
        return this.f69583q;
    }

    /* renamed from: h */
    public void m75875h() {
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f69582p;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.onStart();
    }

    /* renamed from: i */
    public void m75876i() {
        ZaloZinstantRootLayout zaloZinstantRootLayout = this.f69582p;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.onStop();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(AbstractC6918a0.zinstant_layout);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        ZaloZinstantRootLayout zaloZinstantRootLayout = (ZaloZinstantRootLayout) findViewById;
        this.f69582p = zaloZinstantRootLayout;
        ZaloZinstantRootLayout zaloZinstantRootLayout2 = null;
        if (zaloZinstantRootLayout == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout = null;
        }
        zaloZinstantRootLayout.setImageLoader(this.f69584r);
        ZaloZinstantRootLayout zaloZinstantRootLayout3 = this.f69582p;
        if (zaloZinstantRootLayout3 == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout3 = null;
        }
        zaloZinstantRootLayout3.setContextProvider(new C13524c());
        ZaloZinstantRootLayout zaloZinstantRootLayout4 = this.f69582p;
        if (zaloZinstantRootLayout4 == null) {
            AbstractC19074t.m100223u("zinstantLayout");
            zaloZinstantRootLayout4 = null;
        }
        zaloZinstantRootLayout4.setOnZinstantClickListener(new C13525d());
        ZaloZinstantRootLayout zaloZinstantRootLayout5 = this.f69582p;
        if (zaloZinstantRootLayout5 == null) {
            AbstractC19074t.m100223u("zinstantLayout");
        } else {
            zaloZinstantRootLayout2 = zaloZinstantRootLayout5;
        }
        zaloZinstantRootLayout2.setExternalScriptListener(new C13526e());
        InterfaceC13522a interfaceC13522a = this.f69583q;
        if (interfaceC13522a != null) {
            interfaceC13522a.mo75877n1();
        }
    }

    public final void setActionProcessDelegate(InterfaceC13522a interfaceC13522a) {
        this.f69583q = interfaceC13522a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityCheckupItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f69584r = new C20592o(context2, C17210v.f87767a);
        this.f69585s = new C17177r0();
    }
}
