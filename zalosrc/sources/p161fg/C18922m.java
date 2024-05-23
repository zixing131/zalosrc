package p161fg;

import ac.C0711j0;
import ac.C0722p;
import am.C0943w;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.chathead.ChatHeadUI.ChatHead;
import com.zing.zalo.chathead.ChatHeadUI.ChatHeadTextView;
import com.zing.zalo.chathead.MiniChatService;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import d60.C17799h;
import gg.C19442e;
import gg.C19443f;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23165o5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p209hg.C20052c;
import p238ig.C20548b;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p645xh.C29628e;
import p681yh.C30981a;
import p716zh.C31973j5;
import th.AbstractC26681b;
import th.AbstractC26683d;
import u00.C26939u;

/* renamed from: fg.m */
/* loaded from: classes.dex */
public class C18922m implements InterfaceC18910a {

    /* renamed from: e */
    public static boolean f94409e = true;

    /* renamed from: a */
    private C20052c f94410a;

    /* renamed from: b */
    private final Handler f94411b;

    /* renamed from: c */
    private int f94412c;

    /* renamed from: d */
    private boolean f94413d;

    /* renamed from: fg.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static C18922m f94414a = new C18922m();
    }

    /* synthetic */ C18922m(AbstractC18923n abstractC18923n) {
        this();
    }

    /* renamed from: A */
    public /* synthetic */ void m99119A() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null && !c20052c.f98601M) {
            c20052c.f98601M = true;
            c20052c.m104164m().m106797t(this.f94410a.m104166r());
            this.f94410a.m104142S();
            this.f94410a.m104148a0(null);
        }
        this.f94410a = null;
        C17799h.m94029a().m94030b();
    }

    /* renamed from: B */
    public /* synthetic */ void m99120B() {
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null && c20052c.m104133H()) {
                this.f94410a.m104145W(C19442e.class);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: C */
    public /* synthetic */ void m99121C() {
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null && (c20052c.m104160j() instanceof C19442e)) {
                ((C19442e) this.f94410a.m104160j()).m101678n();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: D */
    public /* synthetic */ void m99122D() {
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null) {
                c20052c.m104158h0(C19636i1.m102737w().m102745D());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: E */
    public /* synthetic */ void m99123E(String str) {
        try {
            if (this.f94410a != null) {
                this.f94410a.m104143T(new C18927r(str, "", 0, null, null, ChatView.class, false));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: F */
    public /* synthetic */ void m99124F(String str) {
        ChatHead m104157h;
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null && (m104157h = c20052c.m104157h(str)) != null) {
                m104157h.m39821J();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: G */
    public /* synthetic */ void m99125G(boolean z11) {
        int i11;
        C20052c c20052c = this.f94410a;
        if (c20052c != null && !c20052c.f98601M) {
            C17799h m94029a = C17799h.m94029a();
            if (z11) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            m94029a.f90039n = i11;
            this.f94410a.m104149b0(z11);
        }
    }

    /* renamed from: H */
    public /* synthetic */ void m99126H(Conversation conversation, boolean z11, int i11, boolean z12, CharSequence charSequence, Bundle bundle, boolean z13) {
        Class cls;
        try {
            if (AbstractC26681b.f126356a && conversation != null && !TextUtils.isEmpty(conversation.f42893q)) {
                if (!AbstractC23304d.f113330T0 && !z11) {
                    if (m99161v(conversation.f42893q) && i11 > 0) {
                        m99154X(conversation.f42893q, i11);
                        return;
                    }
                    return;
                }
                C20052c c20052c = this.f94410a;
                if (c20052c != null && c20052c.f98601M) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                if (conversation.m41013q()) {
                    C31973j5 m41002f = conversation.m41002f();
                    if (m41002f != null) {
                        if (m41002f.m153786t0()) {
                            arrayList.add(m41002f.m153756e());
                        } else {
                            arrayList.addAll(m41002f.m153762h());
                        }
                    } else {
                        arrayList.add(conversation.f42895s);
                    }
                } else {
                    arrayList.add(conversation.f42895s);
                }
                if (this.f94410a == null) {
                    C20052c c20052c2 = new C20052c(MainApplication.getAppContext(), new C20548b(MainApplication.getAppContext()), this);
                    this.f94410a = c20052c2;
                    if (z12) {
                        cls = C19442e.class;
                    } else {
                        cls = C19443f.class;
                    }
                    c20052c2.m104145W(cls);
                    C18927r c18927r = new C18927r("MAIN_CHAT_HEAD", "", C19636i1.m102737w().m102745D(), new ArrayList(), null, MessagesView.class, true);
                    c18927r.f94430u = C23212s8.m119610r(AbstractC16781w.logo_zalo_chathead);
                    this.f94410a.m104152e(c18927r, false);
                }
                C18927r c18927r2 = new C18927r(conversation.f42893q, charSequence, i11, arrayList, bundle, ChatView.class, false, conversation.m41013q(), AbstractC19646n0.m103017q(conversation));
                if (z12) {
                    m99142K();
                }
                this.f94410a.m104152e(c18927r2, z13);
                MiniChatService.m39860c();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
            m99141t().m99156p();
        }
    }

    /* renamed from: I */
    public /* synthetic */ void m99127I(String str, String str2) {
        try {
            ArrayList arrayList = new ArrayList();
            if (AbstractC25495a.m132079d(str)) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(str);
                if (m4472f != null) {
                    if (m4472f.m153786t0()) {
                        arrayList.add(m4472f.m153756e());
                    } else {
                        arrayList.addAll(m4472f.m153762h());
                    }
                } else {
                    arrayList.add(str2);
                }
            } else {
                arrayList.add(str2);
            }
            C20052c c20052c = this.f94410a;
            if (c20052c != null) {
                c20052c.m104153e0(str, arrayList, C19636i1.m102737w().m102747F(str));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: J */
    public /* synthetic */ void m99128J(String str, int i11) {
        ChatHead m104157h;
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null && (m104157h = c20052c.m104157h(str)) != null) {
                m104157h.m39826O(i11);
                m104157h.m39819G();
                m104157h.invalidate();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    /* renamed from: M */
    private void m99129M(boolean z11) {
        Context appContext;
        int i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCurrentThemeChanged(");
        sb2.append(z11);
        sb2.append(")");
        C20052c c20052c = this.f94410a;
        if (c20052c != null) {
            appContext = c20052c.getContext();
        } else {
            appContext = MainApplication.getAppContext();
        }
        ChatHead.m39799I(appContext);
        ChatHeadTextView.m39852c();
        C20052c c20052c2 = this.f94410a;
        if (c20052c2 != null) {
            c20052c2.m104138N();
        }
        if (m99163x()) {
            if (z11) {
                i11 = AbstractC8020f0.str_switching_to_dark_theme;
            } else {
                i11 = AbstractC8020f0.str_switching_to_light_theme;
            }
            ToastUtils.m89266n(i11, new Object[0]);
            m99143L();
        }
    }

    /* renamed from: n */
    public static boolean m99140n(ContactProfile contactProfile) {
        if (AbstractC26683d.f126391B || !AbstractC26681b.f126356a || contactProfile == null || AbstractC23165o5.m119333b() || !AbstractC23034c6.m118126L(MainApplication.getAppContext()) || !AbstractC23309i.m122004i2() || !AbstractC23309i.m121966h2()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static C18922m m99141t() {
        return a.f94414a;
    }

    /* renamed from: K */
    public void m99142K() {
        RunnableC18916g runnableC18916g = new Runnable() { // from class: fg.g
            public /* synthetic */ RunnableC18916g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99120B();
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18916g.run();
        } else {
            this.f94411b.post(runnableC18916g);
        }
    }

    /* renamed from: L */
    public void m99143L() {
        RunnableC18918i runnableC18918i = new Runnable() { // from class: fg.i
            public /* synthetic */ RunnableC18918i() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99121C();
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18918i.run();
        } else {
            this.f94411b.post(runnableC18918i);
        }
    }

    /* renamed from: N */
    public void m99144N() {
        if (!AbstractC26681b.f126356a) {
            return;
        }
        RunnableC18921l runnableC18921l = new Runnable() { // from class: fg.l
            public /* synthetic */ RunnableC18921l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99122D();
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18921l.run();
        } else {
            this.f94411b.post(runnableC18921l);
        }
    }

    /* renamed from: O */
    public void m99145O(String str) {
        if (!AbstractC26681b.f126356a) {
            return;
        }
        RunnableC18917h runnableC18917h = new Runnable() { // from class: fg.h

            /* renamed from: q */
            public final /* synthetic */ String f94396q;

            public /* synthetic */ RunnableC18917h(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99123E(r2);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18917h.run();
        } else {
            this.f94411b.post(runnableC18917h);
        }
    }

    /* renamed from: P */
    public void m99146P(String str) {
        if (!AbstractC26681b.f126356a) {
            return;
        }
        RunnableC18912c runnableC18912c = new Runnable() { // from class: fg.c

            /* renamed from: q */
            public final /* synthetic */ String f94386q;

            public /* synthetic */ RunnableC18912c(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99124F(r2);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18912c.run();
        } else {
            this.f94411b.post(runnableC18912c);
        }
    }

    /* renamed from: Q */
    public void m99147Q(boolean z11) {
        RunnableC18919j runnableC18919j = new Runnable() { // from class: fg.j

            /* renamed from: q */
            public final /* synthetic */ boolean f94399q;

            public /* synthetic */ RunnableC18919j(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99125G(r2);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18919j.run();
        } else {
            this.f94411b.post(runnableC18919j);
        }
    }

    /* renamed from: R */
    public void m99148R(Bundle bundle, ContactProfile contactProfile) {
        m99149S(bundle, new Conversation(contactProfile));
    }

    /* renamed from: S */
    public void m99149S(Bundle bundle, Conversation conversation) {
        m99150T(bundle, conversation, 0, "", true, true, true);
    }

    /* renamed from: T */
    public void m99150T(Bundle bundle, Conversation conversation, int i11, CharSequence charSequence, boolean z11, boolean z12, boolean z13) {
        RunnableC18920k runnableC18920k = new Runnable() { // from class: fg.k

            /* renamed from: q */
            public final /* synthetic */ Conversation f94401q;

            /* renamed from: r */
            public final /* synthetic */ boolean f94402r;

            /* renamed from: s */
            public final /* synthetic */ int f94403s;

            /* renamed from: t */
            public final /* synthetic */ boolean f94404t;

            /* renamed from: u */
            public final /* synthetic */ CharSequence f94405u;

            /* renamed from: v */
            public final /* synthetic */ Bundle f94406v;

            /* renamed from: w */
            public final /* synthetic */ boolean f94407w;

            public /* synthetic */ RunnableC18920k(Conversation conversation2, boolean z132, int i112, boolean z112, CharSequence charSequence2, Bundle bundle2, boolean z122) {
                r2 = conversation2;
                r3 = z132;
                r4 = i112;
                r5 = z112;
                r6 = charSequence2;
                r7 = bundle2;
                r8 = z122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99126H(r2, r3, r4, r5, r6, r7, r8);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18920k.run();
        } else {
            this.f94411b.post(runnableC18920k);
        }
    }

    /* renamed from: U */
    public void m99151U(String str, String str2) {
        RunnableC18913d runnableC18913d = new Runnable() { // from class: fg.d

            /* renamed from: q */
            public final /* synthetic */ String f94388q;

            /* renamed from: r */
            public final /* synthetic */ String f94389r;

            public /* synthetic */ RunnableC18913d(String str3, String str22) {
                r2 = str3;
                r3 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99127I(r2, r3);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18913d.run();
        } else {
            this.f94411b.post(runnableC18913d);
        }
    }

    /* renamed from: V */
    void m99152V() {
        long m122120l5 = AbstractC23309i.m122120l5();
        int m122044j5 = AbstractC23309i.m122044j5();
        long currentTimeMillis = System.currentTimeMillis();
        if (m122044j5 != 0 && currentTimeMillis - m122120l5 <= AbstractC23309i.m121737b0() * 1000) {
            if (m122044j5 >= AbstractC23309i.m121812d0() - 1) {
                AbstractC23309i.m121058Ip(currentTimeMillis);
                AbstractC23309i.m121021Hp(AbstractC23309i.m121812d0());
                return;
            } else {
                AbstractC23309i.m121021Hp(m122044j5 + 1);
                return;
            }
        }
        AbstractC23309i.m121095Jp(currentTimeMillis);
        AbstractC23309i.m121021Hp(1);
    }

    /* renamed from: W */
    public void m99153W() {
        C23744a.m124114c().m124116d(14000, new Object[0]);
    }

    /* renamed from: X */
    public void m99154X(String str, int i11) {
        if (!AbstractC26681b.f126356a) {
            return;
        }
        RunnableC18915f runnableC18915f = new Runnable() { // from class: fg.f

            /* renamed from: q */
            public final /* synthetic */ String f94392q;

            /* renamed from: r */
            public final /* synthetic */ int f94393r;

            public /* synthetic */ RunnableC18915f(String str2, int i112) {
                r2 = str2;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99128J(r2, r3);
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18915f.run();
        } else {
            this.f94411b.post(runnableC18915f);
        }
    }

    @Override // p161fg.InterfaceC18910a
    /* renamed from: a */
    public void mo99114a() {
        AbstractC20110a.m104542k(8, "MiniChat onMaximize: appOnForeground(%s)", Boolean.valueOf(CoreUtility.f89239o));
        try {
            if (C29628e.m147250K0() && C29628e.m147249E0().m93434z()) {
                C29628e.m147249E0().m93399a0();
            }
            C20052c c20052c = this.f94410a;
            if (c20052c != null && c20052c.mo35579p() != null) {
                ZaloAnalytics.Companion.m37219b().m37209i0(this.f94410a.mo35579p());
            }
            ZaloAnalytics.Companion.m37219b().m37211p0(ZaloAnalytics.EnumC7295d.CHAT_HEAD);
            this.f94413d = false;
            C0711j0.Companion.m1104a().m1102w(C0722p.b.CHAT_HEAD);
            AbstractC23306f.m120652d().m109858L();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
    }

    @Override // p161fg.InterfaceC18910a
    /* renamed from: b */
    public void mo99115b(boolean z11) {
        AbstractC20110a.m104542k(8, "MiniChat onClosed: appOnForeground(%s) - fromMaximizeMode(%s)", Boolean.valueOf(CoreUtility.f89239o), Boolean.valueOf(z11));
        try {
            if (C29628e.m147250K0() && C29628e.m147249E0().m93434z()) {
                C29628e.m147249E0().m93399a0();
            }
            if (C26939u.m138767n()) {
                C26939u.m138770q().m138785z();
            }
            C20052c c20052c = this.f94410a;
            if (c20052c != null && c20052c.mo35579p() != null) {
                ZaloAnalytics.Companion.m37219b().m37213r0(this.f94410a.mo35579p());
            }
            if (ZaloAnalytics.Companion.m37219b().m37199P() == ZaloAnalytics.EnumC7295d.CHAT_HEAD && !this.f94413d) {
                C0711j0.Companion.m1104a().m1094k(C0722p.a.CLOSE_MINI_CHAT);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
        List list = C19669z.f97579a0;
        if (list != null && !list.isEmpty()) {
            AbstractC23059e9.m118321J();
        }
    }

    @Override // p161fg.InterfaceC18910a
    /* renamed from: c */
    public void mo99116c() {
        AbstractC20110a.m104542k(8, "MiniChat onMinimize: appOnForeground(%s)", Boolean.valueOf(CoreUtility.f89239o));
        try {
            if (C29628e.m147250K0() && C29628e.m147249E0().m93434z()) {
                C29628e.m147249E0().m93399a0();
            }
            if (C26939u.m138767n()) {
                C26939u.m138770q().m138785z();
            }
            ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
            if (c7293b.m37219b().m37199P() == ZaloAnalytics.EnumC7295d.CHAT_HEAD) {
                this.f94413d = true;
                C0711j0.Companion.m1104a().m1094k(C0722p.a.NORMAL_END);
            }
            c7293b.m37219b().m37211p0(ZaloAnalytics.EnumC7295d.APP_MODE);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
        List list = C19669z.f97579a0;
        if (list != null && !list.isEmpty()) {
            AbstractC23059e9.m118321J();
        }
    }

    /* renamed from: o */
    public void m99155o(int i11) {
        if (this.f94412c != i11) {
            this.f94412c = i11;
            boolean z11 = true;
            if (i11 != 1) {
                z11 = false;
            }
            m99129M(z11);
        }
    }

    /* renamed from: p */
    public void m99156p() {
        RunnableC18914e runnableC18914e = new Runnable() { // from class: fg.e
            public /* synthetic */ RunnableC18914e() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18922m.this.m99119A();
            }
        };
        if (AbstractC19444a.m101693a()) {
            runnableC18914e.run();
        } else {
            this.f94411b.post(runnableC18914e);
        }
        C30981a.f142932d = null;
    }

    /* renamed from: q */
    public void m99157q() {
        m99152V();
        MiniChatService.m39861d();
    }

    /* renamed from: r */
    public int m99158r() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null) {
            return c20052c.m104165n().size() - this.f94410a.m104167s().f103553k;
        }
        return 0;
    }

    /* renamed from: s */
    public C20052c m99159s() {
        return this.f94410a;
    }

    /* renamed from: u */
    public boolean m99160u(String str) {
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null && c20052c.m104132G()) {
                if (this.f94410a.m104162k().getUser().f94425p.equals(str)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
            return false;
        }
    }

    /* renamed from: v */
    public boolean m99161v(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            C20052c c20052c = this.f94410a;
            if (c20052c != null) {
                if (c20052c.m104157h(str) != null) {
                    return true;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("MiniChatController", e11);
        }
        return false;
    }

    /* renamed from: w */
    public boolean m99162w() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null && c20052c.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean m99163x() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null && c20052c.m104132G()) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public boolean m99164y() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null && !c20052c.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean m99165z() {
        C20052c c20052c = this.f94410a;
        if (c20052c != null && c20052c.m104135J()) {
            return true;
        }
        return false;
    }

    private C18922m() {
        this.f94412c = -1;
        this.f94413d = false;
        this.f94411b = new Handler(Looper.getMainLooper());
    }
}
