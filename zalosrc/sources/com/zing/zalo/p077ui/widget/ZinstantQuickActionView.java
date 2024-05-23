package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ck0.C3568b;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import ho0.AbstractC20110a;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import nj0.AbstractC23803b;
import p716zh.C31862c;
import pj0.AbstractC24788n;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24785k;
import th.AbstractC26683d;

/* loaded from: classes6.dex */
public class ZinstantQuickActionView extends LinearLayout implements InterfaceC13567b1 {

    /* renamed from: p */
    ImageView f69873p;

    /* renamed from: q */
    ZaloZinstantLayout f69874q;

    /* renamed from: r */
    C31862c f69875r;

    /* renamed from: s */
    InterfaceC13567b1.a f69876s;

    /* renamed from: t */
    int f69877t;

    /* renamed from: u */
    int f69878u;

    /* renamed from: v */
    boolean f69879v;

    /* renamed from: w */
    private final C17170o f69880w;

    /* renamed from: com.zing.zalo.ui.widget.ZinstantQuickActionView$a */
    /* loaded from: classes6.dex */
    class C13556a extends C17170o {
        C13556a() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return AbstractC23136l9.m118731n0(ZinstantQuickActionView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ZinstantQuickActionView$b */
    /* loaded from: classes6.dex */
    public class C13557b extends AbstractC23803b {
        C13557b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: a */
        public void mo61861a() {
            try {
                if (ZinstantQuickActionView.this.getParent() instanceof View.OnLongClickListener) {
                    ((View.OnLongClickListener) ZinstantQuickActionView.this.getParent()).onLongClick(ZinstantQuickActionView.this);
                } else if (ZinstantQuickActionView.this.getParent() instanceof View) {
                    ((View) ZinstantQuickActionView.this.getParent()).performLongClick();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            try {
                ZinstantQuickActionView zinstantQuickActionView = ZinstantQuickActionView.this;
                InterfaceC13567b1.a aVar = zinstantQuickActionView.f69876s;
                if (aVar != null) {
                    aVar.mo36332B5(zinstantQuickActionView.f69875r, str3, str4, 2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ZinstantQuickActionView$c */
    /* loaded from: classes6.dex */
    public class C13558c extends AbstractC24788n {
        C13558c() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            try {
                ZinstantQuickActionView zinstantQuickActionView = ZinstantQuickActionView.this;
                InterfaceC13567b1.a aVar = zinstantQuickActionView.f69876s;
                if (aVar != null) {
                    aVar.mo36332B5(zinstantQuickActionView.f69875r, str, str2, 2);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104536e(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ZinstantQuickActionView$d */
    /* loaded from: classes6.dex */
    public class C13559d implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC22508f f69884a;

        /* renamed from: com.zing.zalo.ui.widget.ZinstantQuickActionView$d$a */
        /* loaded from: classes6.dex */
        class a implements InterfaceC24775a {
            a() {
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: a */
            public void onSuccess(Void r12) {
                ZinstantQuickActionView.this.m76007k();
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: c */
            public void mo15338c(Exception exc) {
                ZinstantQuickActionView.this.m76006j();
            }
        }

        C13559d(InterfaceC22508f interfaceC22508f) {
            this.f69884a = interfaceC22508f;
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
            ZinstantQuickActionView.this.m76006j();
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            try {
                ZinstantQuickActionView.this.f69874q.m91447b1(this.f69884a, null);
                ZinstantQuickActionView zinstantQuickActionView = ZinstantQuickActionView.this;
                zinstantQuickActionView.f69874q.m91445Y0(zinstantQuickActionView.f69880w, new a());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public ZinstantQuickActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69873p = null;
        this.f69877t = 0;
        this.f69878u = 0;
        this.f69879v = false;
        this.f69880w = new C13556a();
    }

    /* renamed from: f */
    private void m76002f() {
        this.f69877t = getResources().getConfiguration().screenLayout;
        this.f69878u = getResources().getConfiguration().orientation;
        this.f69873p = (ImageView) findViewById(AbstractC6918a0.btn_close_quick_action_banner);
        ZaloZinstantLayout zaloZinstantLayout = (ZaloZinstantLayout) findViewById(AbstractC6918a0.zinstant_layout);
        this.f69874q = zaloZinstantLayout;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.setOnZinstantClickListener(new C13557b());
            this.f69874q.setExternalScriptListener(new C13558c());
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m76003g() {
        ZaloZinstantLayout zaloZinstantLayout = this.f69874q;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.onStop();
            this.f69874q.m91973J0();
        }
    }

    /* renamed from: h */
    public /* synthetic */ void m76004h() {
        try {
            ZaloZinstantLayout zaloZinstantLayout = this.f69874q;
            if (zaloZinstantLayout != null) {
                zaloZinstantLayout.onStart();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: b */
    public void mo75823b(C31862c c31862c, InterfaceC13567b1.a aVar) {
        InterfaceC22508f interfaceC22508f;
        if (this.f69875r != c31862c) {
            this.f69874q.onStop();
            this.f69874q.m91973J0();
            this.f69874q.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        }
        this.f69875r = c31862c;
        this.f69876s = aVar;
        C17244x0 c17244x0 = c31862c.f146305G;
        if (c17244x0 != null) {
            interfaceC22508f = c17244x0.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (interfaceC22508f == null) {
            m76006j();
            return;
        }
        if (this.f69874q.m91989T()) {
            this.f69874q.onStop();
        }
        this.f69879v = false;
        AbstractC26683d.m137045e();
        if (AbstractC26683d.f126394m) {
            try {
                C3568b.m18124b().m18127d(new C13559d(interfaceC22508f));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    /* renamed from: d */
    public boolean mo75824d() {
        return this.f69879v;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1
    public View getCloseBtnView() {
        return this.f69873p;
    }

    /* renamed from: i */
    public void m76005i() {
        ZaloZinstantLayout zaloZinstantLayout = this.f69874q;
        if (zaloZinstantLayout != null) {
            zaloZinstantLayout.m91993g0();
        }
    }

    /* renamed from: j */
    void m76006j() {
        this.f69879v = true;
        post(new Runnable() { // from class: com.zing.zalo.ui.widget.m3
            public /* synthetic */ RunnableC13691m3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantQuickActionView.this.m76003g();
            }
        });
    }

    /* renamed from: k */
    void m76007k() {
        post(new Runnable() { // from class: com.zing.zalo.ui.widget.n3
            public /* synthetic */ RunnableC13696n3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZinstantQuickActionView.this.m76004h();
            }
        });
    }

    /* renamed from: l */
    public void m76008l() {
        ZaloZinstantLayout zaloZinstantLayout = this.f69874q;
        if (zaloZinstantLayout != null && zaloZinstantLayout.getZinstantRootTree() != null) {
            this.f69874q.onStart();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i11 = getResources().getConfiguration().orientation;
        if (this.f69878u != i11) {
            this.f69878u = i11;
            mo75823b(this.f69875r, this.f69876s);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        boolean z11;
        if (this.f69877t == configuration.screenLayout && this.f69878u == configuration.orientation) {
            z11 = false;
        } else {
            z11 = true;
        }
        super.onConfigurationChanged(configuration);
        this.f69877t = configuration.screenLayout;
        this.f69878u = configuration.orientation;
        if (z11) {
            mo75823b(this.f69875r, this.f69876s);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m76002f();
    }

    public ZinstantQuickActionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69873p = null;
        this.f69877t = 0;
        this.f69878u = 0;
        this.f69879v = false;
        this.f69880w = new C13556a();
    }
}
