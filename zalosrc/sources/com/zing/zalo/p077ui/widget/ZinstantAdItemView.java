package com.zing.zalo.p077ui.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bi0.AbstractC2810d;
import ck0.C3568b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.p077ui.widget.ZinstantAdItemView;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import hk0.InterfaceC20083a;
import ik0.InterfaceC20578a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import p133ek.AbstractC18458a;
import p266jg.C21243a;
import p716zh.C32041nd;
import pj0.InterfaceC24775a;
import th.AbstractC26683d;

/* loaded from: classes6.dex */
public class ZinstantAdItemView extends FrameLayout {

    /* renamed from: p */
    ZaloZinstantLayout f69861p;

    /* renamed from: q */
    C32041nd f69862q;

    /* renamed from: r */
    InterfaceC22508f f69863r;

    /* renamed from: s */
    InterfaceC13555d f69864s;

    /* renamed from: t */
    boolean f69865t;

    /* renamed from: u */
    boolean f69866u;

    /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$a */
    /* loaded from: classes6.dex */
    class C13552a extends AbstractC23803b {
        C13552a() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: a */
        public void mo61861a() {
            try {
                InterfaceC13555d interfaceC13555d = ZinstantAdItemView.this.f69864s;
                if (interfaceC13555d != null && interfaceC13555d.mo68350Xn() == 0) {
                    ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                    zinstantAdItemView.f69864s.mo68382sb(zinstantAdItemView.f69862q);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            try {
                InterfaceC13555d interfaceC13555d = ZinstantAdItemView.this.f69864s;
                if (interfaceC13555d != null && interfaceC13555d.mo68350Xn() == 0) {
                    if (TextUtils.equals(str3, "action.open.zinstantview.fullad")) {
                        ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                        InterfaceC13555d interfaceC13555d2 = zinstantAdItemView.f69864s;
                        C32041nd c32041nd = zinstantAdItemView.f69862q;
                        interfaceC13555d2.mo68315Fi(c32041nd, str3, c32041nd.m154578g());
                    } else {
                        ZinstantAdItemView zinstantAdItemView2 = ZinstantAdItemView.this;
                        zinstantAdItemView2.f69864s.mo68315Fi(zinstantAdItemView2.f69862q, str3, str4);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$b */
    /* loaded from: classes6.dex */
    public class C13553b implements C3568b.b {

        /* renamed from: a */
        final /* synthetic */ C23855s0 f69868a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$b$a */
        /* loaded from: classes6.dex */
        public class a implements InterfaceC24775a {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m75992b() {
                ZaloZinstantLayout zaloZinstantLayout = ZinstantAdItemView.this.f69861p;
                if (zaloZinstantLayout != null) {
                    zaloZinstantLayout.setVisibility(0);
                    if (!ZinstantAdItemView.this.f69861p.m91989T()) {
                        ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                        if (zinstantAdItemView.f69866u) {
                            zinstantAdItemView.f69861p.onStart();
                        }
                    }
                }
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: c */
            public void mo15338c(Exception exc) {
                ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                zinstantAdItemView.post(new RunnableC13657j3(zinstantAdItemView));
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                ZinstantAdItemView.this.post(new Runnable() { // from class: com.zing.zalo.ui.widget.i3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantAdItemView.C13553b.a.this.m75992b();
                    }
                });
            }
        }

        C13553b(C23855s0 c23855s0) {
            this.f69868a = c23855s0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m75990b(C23855s0 c23855s0) {
            ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
            InterfaceC22508f interfaceC22508f = zinstantAdItemView.f69863r;
            if (interfaceC22508f == null) {
                zinstantAdItemView.m75987b();
            } else {
                zinstantAdItemView.f69861p.m91447b1(interfaceC22508f, c23855s0);
                ZinstantAdItemView.this.f69861p.m91446Z0(new a());
            }
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(Exception exc) {
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
            final C23855s0 c23855s0 = this.f69868a;
            zinstantAdItemView.post(new Runnable() { // from class: com.zing.zalo.ui.widget.h3
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantAdItemView.C13553b.this.m75990b(c23855s0);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$c */
    /* loaded from: classes6.dex */
    public class C13554c implements InterfaceC20083a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$c$a */
        /* loaded from: classes6.dex */
        public class a implements InterfaceC24775a {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m75997b() {
                try {
                    ZaloZinstantLayout zaloZinstantLayout = ZinstantAdItemView.this.f69861p;
                    if (zaloZinstantLayout == null) {
                        return;
                    }
                    if (!zaloZinstantLayout.m91989T()) {
                        ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                        if (zinstantAdItemView.f69866u) {
                            zinstantAdItemView.f69861p.onStart();
                        }
                    }
                    ZinstantAdItemView.this.f69861p.setVisibility(0);
                    ZinstantAdItemView zinstantAdItemView2 = ZinstantAdItemView.this;
                    zinstantAdItemView2.f69862q.m154583l(zinstantAdItemView2.f69861p.getZinstantRootTree());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: c */
            public void mo15338c(Exception exc) {
                ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                zinstantAdItemView.post(new RunnableC13657j3(zinstantAdItemView));
            }

            @Override // pj0.InterfaceC24775a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r22) {
                ZinstantAdItemView.this.post(new Runnable() { // from class: com.zing.zalo.ui.widget.l3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantAdItemView.C13554c.a.this.m75997b();
                    }
                });
            }
        }

        C13554c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m75995d() {
            ZinstantAdItemView.this.f69861p.m91446Z0(new a());
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            try {
                ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
                zinstantAdItemView.f69861p.m91447b1(zinstantAdItemView.f69863r, interfaceC20578a0);
                ZinstantAdItemView.this.post(new Runnable() { // from class: com.zing.zalo.ui.widget.k3
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZinstantAdItemView.C13554c.this.m75995d();
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            ZinstantAdItemView zinstantAdItemView = ZinstantAdItemView.this;
            zinstantAdItemView.post(new RunnableC13657j3(zinstantAdItemView));
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ZinstantAdItemView$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC13555d {
        /* renamed from: Fi */
        void mo68315Fi(C32041nd c32041nd, String str, String str2);

        /* renamed from: Xn */
        int mo68350Xn();

        /* renamed from: sb */
        void mo68382sb(C32041nd c32041nd);
    }

    public ZinstantAdItemView(Context context) {
        super(context);
        this.f69865t = false;
        this.f69866u = false;
        AbstractC23136l9.m118693a1(this, AbstractC2810d.bg_list_item);
        this.f69861p = new ZaloZinstantLayout(context);
        addView(this.f69861p, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(context);
        view.setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.leftMargin = AbstractC23136l9.m118655I(AbstractC16802y.tabmsg_separate_line_padding_left_type1);
        layoutParams.gravity = 80;
        addView(view, layoutParams);
        this.f69861p.setOnZinstantClickListener(new C13552a());
    }

    /* renamed from: a */
    public void m75986a(C32041nd c32041nd, InterfaceC13555d interfaceC13555d, boolean z11) {
        InterfaceC22508f interfaceC22508f;
        this.f69864s = interfaceC13555d;
        this.f69861p.m91993g0();
        if (this.f69862q == c32041nd && !this.f69865t) {
            m75988c(z11);
            if (z11) {
                this.f69861p.onResume();
                return;
            }
            return;
        }
        this.f69866u = z11;
        if (this.f69861p.m91989T()) {
            this.f69861p.onStop();
        }
        this.f69862q = c32041nd;
        this.f69861p.setVisibility(8);
        C32041nd c32041nd2 = this.f69862q;
        if (c32041nd2 != null && c32041nd2.m154582k()) {
            this.f69865t = false;
            AbstractC26683d.m137045e();
            try {
                int m118722k0 = AbstractC23136l9.m118722k0();
                if (!(getContext() instanceof Activity) && getResources().getConfiguration().orientation == 2) {
                    m118722k0 -= C21243a.f103541p + (C21243a.f103542q * 2);
                }
                C17244x0 m154579h = this.f69862q.m154579h();
                if (m154579h != null) {
                    interfaceC22508f = m154579h.m92064b();
                } else {
                    interfaceC22508f = null;
                }
                this.f69863r = interfaceC22508f;
                if (interfaceC22508f == null) {
                    m75987b();
                    return;
                }
                C23855s0 m154580i = c32041nd.m154580i();
                if (m154580i != null && m154580i.m124621B()) {
                    if (m154580i.checkIntegrity(m118722k0, -1, AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), this.f69861p.f87804S, this.f69863r.mo116353c())) {
                        C3568b.m18124b().m18127d(new C13553b(m154580i));
                        return;
                    }
                }
                AbstractC17148f0.m91694m(this.f69863r, m118722k0, new C13554c());
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        m75987b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m75987b() {
        this.f69865t = true;
    }

    /* renamed from: c */
    public void m75988c(boolean z11) {
        if (this.f69866u != z11) {
            this.f69866u = z11;
            ZaloZinstantLayout zaloZinstantLayout = this.f69861p;
            if (zaloZinstantLayout != null) {
                if (z11) {
                    zaloZinstantLayout.onResume();
                } else if (zaloZinstantLayout.m91989T()) {
                    this.f69861p.m91995m0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f69864s.mo68350Xn() != 0) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
