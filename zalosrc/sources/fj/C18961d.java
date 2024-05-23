package fj;

import ag0.AbstractC0826k;
import ag0.C0804b;
import ag0.C0843s0;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.C1335e1;
import androidx.work.AbstractC2144f;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7027c3;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalocore.CoreUtility;
import d60.C17799h;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17984n0;
import dj.C17999s0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19636i1;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23011a5;
import me0.AbstractC23034c6;
import me0.AbstractC23059e9;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23184q2;
import me0.AbstractC23192r;
import me0.C23081g9;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p161fg.C18922m;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p716zh.C31924g1;
import p716zh.C31954i1;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import st.C26386a;
import tg.C26664o;
import th.AbstractC26681b;
import th.AbstractC26683d;
import v50.C27870vb;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: fj.d */
/* loaded from: classes3.dex */
public final class C18961d {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final InterfaceC24854k f94655g;

    /* renamed from: a */
    private final C28023b6 f94656a;

    /* renamed from: b */
    private final C11318b f94657b;

    /* renamed from: c */
    private final C28203u6 f94658c;

    /* renamed from: d */
    private final g f94659d;

    /* renamed from: e */
    private final f f94660e;

    /* renamed from: f */
    private final d f94661f;

    /* renamed from: fj.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f94662q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18961d mo12V4() {
            return c.f94663a.m99498a();
        }
    }

    /* renamed from: fj.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18961d m99497a() {
            return (C18961d) C18961d.f94655g.getValue();
        }
    }

    /* renamed from: fj.d$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f94663a = new c();

        /* renamed from: b */
        private static final C18961d f94664b;

        static {
            C28023b6 m120611Q0 = AbstractC23306f.m120611Q0();
            AbstractC19074t.m100207e(m120611Q0, "provideNotiManager(...)");
            C26386a m120673i0 = AbstractC23306f.m120673i0();
            AbstractC19074t.m100207e(m120673i0, "provideInAppNotiManager(...)");
            C18922m m120596L0 = AbstractC23306f.m120596L0();
            AbstractC19074t.m100207e(m120596L0, "provideMiniChatController(...)");
            C11318b m120640a = AbstractC23306f.m120640a();
            AbstractC19074t.m100207e(m120640a, "provideActiveChatController(...)");
            C28203u6 m120642a1 = AbstractC23306f.m120642a1();
            AbstractC19074t.m100207e(m120642a1, "provideProfileManager(...)");
            f94664b = new C18961d(m120611Q0, m120673i0, m120596L0, m120640a, m120642a1, null);
        }

        private c() {
        }

        /* renamed from: a */
        public final C18961d m99498a() {
            return f94664b;
        }
    }

    /* renamed from: fj.d$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final C26386a f94665a;

        /* renamed from: b */
        private final C11318b f94666b;

        public d(C26386a c26386a, C11318b c11318b) {
            AbstractC19074t.m100208f(c26386a, "inAppNotiManager");
            AbstractC19074t.m100208f(c11318b, "activeChatController");
            this.f94665a = c26386a;
            this.f94666b = c11318b;
        }

        /* renamed from: a */
        private final boolean m99499a(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, e eVar) {
            if (AbstractC26683d.f126399r && !eVar.m99506a() && !c17945a0.m95031V5() && !c17945a0.m95161i7() && !c17945a0.m95074Z6()) {
                if (c17945a0.m95274v3() == 0) {
                    if (!AbstractC23309i.m122156m3()) {
                        return false;
                    }
                    if ((!z11 && this.f94665a.m135971f()) || !AbstractC23059e9.m118329h()) {
                        return false;
                    }
                }
                C11318b c11318b = this.f94666b;
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                if (!c11318b.m60515j(mo2478b) && !this.f94666b.m60522q() && !this.f94666b.m60519n() && !this.f94666b.m60521p()) {
                    if ((AbstractC23034c6.m118125K() && AbstractC23192r.m119490a()) || !m99505f()) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        private final C31924g1 m99500c(C17945a0 c17945a0) {
            C31954i1 c31954i1 = new C31954i1(c17945a0);
            String str = c31954i1.f146855a;
            AbstractC19074t.m100207e(str, "richContent");
            if (str.length() > 0) {
                return new C31924g1(new JSONObject(c31954i1.f146855a));
            }
            return null;
        }

        /* renamed from: d */
        private final String m99501d(C17945a0 c17945a0) {
            String str = "";
            if (c17945a0.m95032V6()) {
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile != null) {
                    str = contactProfile.f42437s;
                    AbstractC19074t.m100207e(str, "dpn");
                }
            } else {
                String str2 = null;
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
                if (m141798e != null) {
                    str = m141798e.f42437s;
                }
                if (m141798e != null) {
                    str2 = m141798e.f42455y;
                }
                String m94862C4 = c17945a0.m94862C4();
                if (str.length() == 0) {
                    str = c17945a0.m94854B4();
                }
                str = AbstractC21935u.m114539f(str2, m94862C4, str);
                AbstractC19074t.m100207e(str, "convertNameUsePhoneOrId(...)");
            }
            String m119453k = AbstractC23184q2.m119453k(c17945a0.m94862C4(), str, c17945a0.mo95039W2());
            AbstractC19074t.m100207e(m119453k, "getNicknameInGroup(...)");
            return m119453k;
        }

        /* renamed from: g */
        private final void m99502g(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11) {
            ContactProfile m40350X0 = ContactProfile.m40350X0(contactProfile, c17945a0, AbstractC19620d0.m102700t(c17945a0));
            AbstractC19074t.m100207e(m40350X0, "newConversationContact(...)");
            if (contactProfile.m40374K0()) {
                m40350X0.f42413h1 = m99501d(c17945a0);
            }
            m40350X0.f42384V = m99500c(c17945a0);
            C7027c3.b bVar = new C7027c3.b(0, m40350X0);
            bVar.f38419c = z11;
            this.f94665a.m135967a(bVar);
        }

        /* renamed from: b */
        public final void m99503b(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, e eVar) {
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(eVar, "inputData");
            try {
                if (!m99499a(contactProfile, c17945a0, z11, eVar)) {
                    return;
                }
                m99502g(contactProfile, c17945a0, z11);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
            }
        }

        /* renamed from: e */
        public final void m99504e(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11) {
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            try {
                if (z11) {
                    m99502g(contactProfile, c17945a0, true);
                } else if (AbstractC26683d.f126399r) {
                    this.f94665a.m135972g(c17945a0.m95029V3());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
            }
        }

        /* renamed from: f */
        public final boolean m99505f() {
            MainTabView m67645lM = MainTabView.m67645lM();
            if (m67645lM == null) {
                return false;
            }
            if ((!(m67645lM.m92693xK().m93012K0() instanceof MainTabView) || m67645lM.m67715wM()) && !(m67645lM.m92693xK().m93012K0() instanceof ChatView)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: fj.d$e */
    /* loaded from: classes3.dex */
    public static final class e {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final boolean f94667a;

        /* renamed from: b */
        private final boolean f94668b;

        /* renamed from: c */
        private final boolean f94669c;

        /* renamed from: d */
        private final boolean f94670d;

        /* renamed from: e */
        private final boolean f94671e;

        /* renamed from: f */
        private final boolean f94672f;

        /* renamed from: fj.d$e$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final e m99512a(ContactProfile contactProfile, C17945a0 c17945a0) {
                boolean z11;
                AbstractC19074t.m100208f(contactProfile, "contact");
                AbstractC19074t.m100208f(c17945a0, "msg");
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                boolean m94995R6 = c17945a0.m94995R6();
                boolean m94986Q6 = c17945a0.m94986Q6();
                boolean m103052A = AbstractC19656s0.m103052A(contactProfile.m40374K0());
                if (C0804b.m2025g().m2033i(mo2478b) && !AbstractC23011a5.m117977a(mo2478b, m94995R6, m94986Q6)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new e(m103052A, m94995R6, m94986Q6, z11, AbstractC21935u.m114515E(mo2478b), AbstractC21935u.m114550q(mo2478b));
            }
        }

        public e(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f94667a = z11;
            this.f94668b = z12;
            this.f94669c = z13;
            this.f94670d = z14;
            this.f94671e = z15;
            this.f94672f = z16;
        }

        /* renamed from: a */
        public final boolean m99506a() {
            return this.f94672f;
        }

        /* renamed from: b */
        public final boolean m99507b() {
            return this.f94669c;
        }

        /* renamed from: c */
        public final boolean m99508c() {
            return this.f94668b;
        }

        /* renamed from: d */
        public final boolean m99509d() {
            return this.f94670d;
        }

        /* renamed from: e */
        public final boolean m99510e() {
            return this.f94667a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f94667a == eVar.f94667a && this.f94668b == eVar.f94668b && this.f94669c == eVar.f94669c && this.f94670d == eVar.f94670d && this.f94671e == eVar.f94671e && this.f94672f == eVar.f94672f;
        }

        /* renamed from: f */
        public final boolean m99511f() {
            return this.f94671e;
        }

        public int hashCode() {
            return (((((((((AbstractC2144f.m11520a(this.f94667a) * 31) + AbstractC2144f.m11520a(this.f94668b)) * 31) + AbstractC2144f.m11520a(this.f94669c)) * 31) + AbstractC2144f.m11520a(this.f94670d)) * 31) + AbstractC2144f.m11520a(this.f94671e)) * 31) + AbstractC2144f.m11520a(this.f94672f);
        }

        public String toString() {
            return "InputDataHolder(isOffNotiSetting=" + this.f94667a + ", isMentionMe=" + this.f94668b + ", isMentionAll=" + this.f94669c + ", isMutedChat=" + this.f94670d + ", isStranger=" + this.f94671e + ", isHiddenChat=" + this.f94672f + ")";
        }
    }

    /* renamed from: fj.d$f */
    /* loaded from: classes3.dex */
    public static final class f {

        /* renamed from: a */
        private final C18922m f94673a;

        public f(C18922m c18922m) {
            AbstractC19074t.m100208f(c18922m, "miniChatController");
            this.f94673a = c18922m;
        }

        /* renamed from: a */
        private final boolean m99513a(ContactProfile contactProfile, C17945a0 c17945a0, e eVar) {
            boolean z11;
            if (!AbstractC26683d.f126391B && AbstractC26681b.f126356a) {
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                boolean m99161v = this.f94673a.m99161v(mo2478b);
                if ((!AbstractC23304d.f113330T0 && !m99161v) || m99517f() || !C18922m.m99140n(contactProfile)) {
                    return false;
                }
                if ((eVar.m99509d() || eVar.m99511f() || eVar.m99510e() || eVar.m99506a()) && !m99161v) {
                    return false;
                }
                if (!c17945a0.m95304y6() && !AbstractC25495a.m132086k(c17945a0.m94862C4())) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!c17945a0.m95180k8() && !z11) {
                    if ((c17945a0.m95118e4() == 0 || c17945a0.m95118e4() == -1) && !C18922m.m99141t().m99164y()) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private final boolean m99514b(e eVar) {
            if (!eVar.m99510e() && !eVar.m99509d() && !eVar.m99511f() && AbstractC23059e9.m118329h() && !eVar.m99506a() && AbstractC23304d.f113330T0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        private final Bundle m99515d(ContactProfile contactProfile) {
            String mo2478b = contactProfile.mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            Bundle m140776b = new C27870vb(mo2478b).m140780g(contactProfile).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", mo2478b);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            if (contactProfile.m40374K0()) {
                m140776b.putString("SOURCE_ACTION", "15200");
            } else if (contactProfile.m40387S0()) {
                m140776b.putString("SOURCE_ACTION", "15300");
            } else {
                m140776b.putString("SOURCE_ACTION", "15100");
            }
            return m140776b;
        }

        /* renamed from: e */
        private final int m99516e(ContactProfile contactProfile, boolean z11) {
            if (z11) {
                return 0;
            }
            C19636i1 m102800a = C19636i1.Companion.m102800a();
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            return m102800a.m102747F(str);
        }

        /* renamed from: f */
        private final boolean m99517f() {
            if (AbstractC23309i.m122044j5() == AbstractC23309i.m121812d0()) {
                if (System.currentTimeMillis() - AbstractC23309i.m122082k5() < AbstractC23309i.m121774c0() * 1000) {
                    return true;
                }
                AbstractC21244b.m110056f();
                return false;
            }
            return false;
        }

        /* renamed from: g */
        private final void m99518g(ContactProfile contactProfile, C17945a0 c17945a0, e eVar) {
            CharSequence charSequence;
            boolean m99160u = this.f94673a.m99160u(contactProfile.mo2478b());
            Bundle m99515d = m99515d(contactProfile);
            int m99516e = m99516e(contactProfile, m99160u);
            if (m99514b(eVar) && !m99160u) {
                charSequence = AbstractC19620d0.m102694n(contactProfile, c17945a0);
            } else {
                charSequence = "";
            }
            CharSequence charSequence2 = charSequence;
            C17799h.m94029a().f90031f = true;
            this.f94673a.m99150T(m99515d, new Conversation(contactProfile), m99516e, charSequence2, false, false, false);
        }

        /* renamed from: c */
        public final boolean m99519c(ContactProfile contactProfile, C17945a0 c17945a0, e eVar) {
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(eVar, "inputData");
            try {
                if (!m99513a(contactProfile, c17945a0, eVar)) {
                    return false;
                }
                m99518g(contactProfile, c17945a0, eVar);
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
                return false;
            }
        }
    }

    /* renamed from: fj.d$g */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        private final C28023b6 f94674a;

        /* renamed from: b */
        private final C18922m f94675b;

        /* renamed from: fj.d$g$a */
        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a */
            private CharSequence f94676a;

            /* renamed from: b */
            private CharSequence f94677b;

            /* renamed from: c */
            private boolean f94678c;

            /* renamed from: d */
            private int f94679d;

            /* renamed from: e */
            private String f94680e;

            /* renamed from: f */
            private String f94681f;

            public a(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, String str, String str2) {
                AbstractC19074t.m100208f(charSequence, "tickerText");
                AbstractC19074t.m100208f(charSequence2, "displayText");
                AbstractC19074t.m100208f(str, "senderName");
                AbstractC19074t.m100208f(str2, "senderNameAppendMsg");
                this.f94676a = charSequence;
                this.f94677b = charSequence2;
                this.f94678c = z11;
                this.f94679d = i11;
                this.f94680e = str;
                this.f94681f = str2;
            }

            /* renamed from: a */
            public final int m99531a() {
                return this.f94679d;
            }

            /* renamed from: b */
            public final CharSequence m99532b() {
                return this.f94677b;
            }

            /* renamed from: c */
            public final String m99533c() {
                return this.f94680e;
            }

            /* renamed from: d */
            public final CharSequence m99534d() {
                return this.f94676a;
            }

            /* renamed from: e */
            public final boolean m99535e() {
                return this.f94678c;
            }

            /* renamed from: f */
            public final void m99536f(int i11) {
                this.f94679d = i11;
            }

            /* renamed from: g */
            public final void m99537g(CharSequence charSequence) {
                AbstractC19074t.m100208f(charSequence, "<set-?>");
                this.f94677b = charSequence;
            }

            /* renamed from: h */
            public final void m99538h(boolean z11) {
                this.f94678c = z11;
            }

            /* renamed from: i */
            public final void m99539i(String str) {
                AbstractC19074t.m100208f(str, "<set-?>");
                this.f94680e = str;
            }

            /* renamed from: j */
            public final void m99540j(String str) {
                AbstractC19074t.m100208f(str, "<set-?>");
                this.f94681f = str;
            }

            /* renamed from: k */
            public final void m99541k(CharSequence charSequence) {
                AbstractC19074t.m100208f(charSequence, "<set-?>");
                this.f94676a = charSequence;
            }
        }

        public g(C28023b6 c28023b6, C18922m c18922m) {
            AbstractC19074t.m100208f(c28023b6, "notiManager");
            AbstractC19074t.m100208f(c18922m, "miniChatController");
            this.f94674a = c28023b6;
            this.f94675b = c18922m;
        }

        /* renamed from: a */
        private final String m99520a(String str, C17945a0 c17945a0, e eVar) {
            boolean z11;
            if (!eVar.m99508c() && !eVar.m99507b()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!this.f94674a.m141329a0() && AbstractC23309i.m120850D2() && z11) {
                return "chat_group_mention_me";
            }
            if (c17945a0.m95286w6()) {
                return "chat_urgent";
            }
            String m103043x0 = AbstractC19646n0.m103043x0(str);
            AbstractC19074t.m100205c(m103043x0);
            return m103043x0;
        }

        /* renamed from: b */
        private final boolean m99521b(C17945a0 c17945a0, boolean z11, boolean z12) {
            if (c17945a0.m94941L6() || c17945a0.m95306y8() || c17945a0.m95110d8() || c17945a0.m94890F7() || c17945a0.m95015T7() || c17945a0.m95120e6() || c17945a0.m95316z8() || c17945a0.m95276v6() || c17945a0.m94949M6() || c17945a0.m95219o8() || c17945a0.m95226p6() || c17945a0.m95314z6() || c17945a0.m95298x8() || c17945a0.m95031V5()) {
                return false;
            }
            if (c17945a0.m94871D7() && (z12 || !z11 || c17945a0.m94929K2() == null)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m99522c(C17945a0 c17945a0, boolean z11, boolean z12) {
            if (c17945a0.m94941L6() || c17945a0.m95306y8() || c17945a0.m95110d8() || c17945a0.m94890F7() || c17945a0.m95015T7() || c17945a0.m95120e6() || c17945a0.m95316z8() || c17945a0.m95276v6() || c17945a0.m94949M6() || c17945a0.m95219o8() || c17945a0.m95226p6() || c17945a0.m95314z6() || c17945a0.m94977P7() || c17945a0.m95298x8()) {
                return false;
            }
            if (c17945a0.m94871D7() && (z12 || !z11 || c17945a0.m94929K2() == null)) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        private final void m99523d(ContactProfile contactProfile, C17945a0 c17945a0, e eVar, int i11, boolean z11, String str) {
            String str2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            C17999s0 c17999s0;
            boolean z16;
            int i12;
            boolean m119333b = AbstractC23165o5.m119333b();
            String m102668E = AbstractC19620d0.m102668E(contactProfile, c17945a0, m119333b);
            a aVar = new a(contactProfile.m40383Q(true, false) + m102668E, m102668E, false, 0, "", "");
            m99525h(aVar, contactProfile, c17945a0, eVar, m119333b);
            m99526i(aVar, c17945a0);
            m99527j(aVar, c17945a0);
            if (aVar.m99535e()) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_missCall);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f94674a.m141279D1(contactProfile, m118743r0, AbstractC3102n.m15589h(MainApplication.Companion.m35500c(), contactProfile), aVar.m99534d().toString(), contactProfile.f42446v, c17945a0.m95029V3().m41046j(), aVar.m99531a());
                return;
            }
            if (!contactProfile.m40374K0()) {
                str2 = "";
            } else {
                if (contactProfile.m40363E0()) {
                    i12 = AbstractC8020f0.str_prefix_community_dpn;
                } else {
                    i12 = AbstractC8020f0.str_prefix_group_dpn;
                }
                str2 = AbstractC23136l9.m118743r0(i12);
            }
            AbstractC19074t.m100205c(str2);
            String str3 = str2 + contactProfile.m40383Q(true, false);
            if (m119333b && AbstractC23304d.f113266D0) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!AbstractC23059e9.m118329h() && !c17945a0.m95286w6()) {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_new_massages);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                aVar.m99537g(m118743r02);
                aVar.m99541k(m118743r02);
                aVar.m99539i("");
                z14 = false;
                z13 = false;
                z15 = false;
            } else {
                z13 = z12;
                z14 = true;
                z15 = true;
            }
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17999s0) {
                c17999s0 = (C17999s0) m94929K2;
            } else {
                c17999s0 = null;
            }
            if (c17999s0 != null && c17999s0.f91168B) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.f94674a.m141286G1(contactProfile, str3, aVar.m99532b().toString(), aVar.m99534d().toString(), contactProfile.f42446v, c17945a0.m95029V3(), z14, z13, i11, aVar.m99533c(), z16, z11, c17945a0.m95233q4(), z15, new C28023b6.o(c17945a0), str, c17945a0.m95141g4(), c17945a0.m95108d4());
        }

        /* renamed from: e */
        private final void m99524e(ContactProfile contactProfile, C17945a0 c17945a0, int i11, boolean z11, String str) {
            C17999s0 c17999s0;
            boolean z12;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_new_massages);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17999s0) {
                c17999s0 = (C17999s0) m94929K2;
            } else {
                c17999s0 = null;
            }
            if (c17999s0 != null && c17999s0.f91168B) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f94674a.m141281E1(contactProfile, "Zalo", m118743r0, m118743r0, null, c17945a0.m95029V3(), false, false, i11, "", z12, z11, new C28023b6.o(c17945a0), str, c17945a0.m95108d4());
        }

        /* renamed from: h */
        private final void m99525h(a aVar, ContactProfile contactProfile, C17945a0 c17945a0, e eVar, boolean z11) {
            String str;
            int i11;
            String format;
            int i12;
            String format2;
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, c17945a0.m94862C4(), null, 2, null);
            if (m141798e == null) {
                return;
            }
            boolean m99508c = eVar.m99508c();
            String m94862C4 = c17945a0.m94862C4();
            String m40383Q = m141798e.m40383Q(true, false);
            if (contactProfile.m40374K0()) {
                str = contactProfile.mo2478b();
            } else {
                str = "";
            }
            String m119453k = AbstractC23184q2.m119453k(m94862C4, m40383Q, str);
            String str2 = "%1$s: %2$s";
            if (m99521b(c17945a0, m99508c, z11) && (m99508c || eVar.m99507b())) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (m99508c) {
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_mention_with_emoji_prefix);
                        AbstractC19074t.m100207e(m118743r0, "getString(...)");
                        format2 = String.format(m118743r0, Arrays.copyOf(new Object[]{m119453k}, 1));
                        AbstractC19074t.m100207e(format2, "format(...)");
                    } else {
                        C19067n0 c19067n02 = C19067n0.f94947a;
                        if (contactProfile.m40363E0()) {
                            i12 = AbstractC8020f0.str_noti_msg_mention_all_community_with_emoji_prefix;
                        } else {
                            i12 = AbstractC8020f0.str_noti_msg_mention_all_with_emoji_prefix;
                        }
                        String m118743r02 = AbstractC23136l9.m118743r0(i12);
                        AbstractC19074t.m100207e(m118743r02, "getString(...)");
                        format2 = String.format(m118743r02, Arrays.copyOf(new Object[]{m119453k}, 1));
                        AbstractC19074t.m100207e(format2, "format(...)");
                    }
                    aVar.m99539i(format2);
                    String format3 = String.format("%1$s: %2$s", Arrays.copyOf(new Object[]{aVar.m99533c(), aVar.m99532b()}, 2));
                    AbstractC19074t.m100207e(format3, "format(...)");
                    aVar.m99537g(format3);
                    return;
                }
                if (m99508c) {
                    C19067n0 c19067n03 = C19067n0.f94947a;
                    String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_msg_mention);
                    AbstractC19074t.m100207e(m118743r03, "getString(...)");
                    format = String.format(m118743r03, Arrays.copyOf(new Object[]{m119453k, aVar.m99532b()}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                } else {
                    C19067n0 c19067n04 = C19067n0.f94947a;
                    if (contactProfile.m40363E0()) {
                        i11 = AbstractC8020f0.str_noti_msg_mention_all_community;
                    } else {
                        i11 = AbstractC8020f0.str_noti_msg_mention_all;
                    }
                    String m118743r04 = AbstractC23136l9.m118743r0(i11);
                    AbstractC19074t.m100207e(m118743r04, "getString(...)");
                    format = String.format(m118743r04, Arrays.copyOf(new Object[]{m119453k, aVar.m99532b()}, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                }
                aVar.m99537g(format);
                return;
            }
            if (contactProfile.m40374K0()) {
                AbstractC19074t.m100205c(m119453k);
                if (m119453k.length() > 0 && m119453k.length() > 20) {
                    AbstractC19074t.m100205c(m119453k);
                    String substring = m119453k.substring(0, Math.min(m119453k.length(), 17));
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    m119453k = substring + "...";
                }
                AbstractC19074t.m100205c(m119453k);
                aVar.m99540j(m119453k);
                AbstractC19074t.m100205c(m119453k);
                aVar.m99539i(m119453k);
                if (!m99522c(c17945a0, m99508c, z11)) {
                    str2 = "%1$s %2$s";
                }
                C19067n0 c19067n05 = C19067n0.f94947a;
                String format4 = String.format(str2, Arrays.copyOf(new Object[]{m119453k, aVar.m99532b()}, 2));
                AbstractC19074t.m100207e(format4, "format(...)");
                aVar.m99537g(format4);
            }
        }

        /* renamed from: i */
        private final void m99526i(a aVar, C17945a0 c17945a0) {
            String str;
            if (c17945a0.m95226p6()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if (!(m94929K2 instanceof C17984n0)) {
                    return;
                }
                C17984n0 c17984n0 = (C17984n0) m94929K2;
                String str2 = c17984n0.f91082E;
                AbstractC19074t.m100205c(str2);
                if (str2.length() == 0) {
                    return;
                }
                C7907e c7907e = c17984n0.f91087J;
                if (c7907e != null) {
                    List m40857g = c7907e.m40857g();
                    AbstractC19074t.m100205c(m40857g);
                    AbstractC19074t.m100205c(str2);
                    if (!c17945a0.m94847A6()) {
                        str = "";
                    } else {
                        str = c17945a0.mo95039W2();
                    }
                    AbstractC19074t.m100205c(str);
                    str2 = AbstractC19620d0.m102678O(m40857g, str2, str);
                }
                AbstractC19074t.m100205c(str2);
                aVar.m99541k(str2);
                AbstractC19074t.m100205c(str2);
                aVar.m99537g(str2);
                aVar.m99539i("");
                return;
            }
            if (c17945a0.m95261t6()) {
                if (c17945a0.m95205n3() != null) {
                    String str3 = c17945a0.m95205n3().m14322a0().f12049c0;
                    AbstractC19074t.m100207e(str3, "notifyTxt");
                    if (str3.length() != 0) {
                        CharSequence charSequence = c17945a0.m95205n3().m14322a0().f12049c0;
                        AbstractC19074t.m100207e(charSequence, "notifyTxt");
                        aVar.m99541k(charSequence);
                        CharSequence charSequence2 = c17945a0.m95205n3().m14322a0().f12049c0;
                        AbstractC19074t.m100207e(charSequence2, "notifyTxt");
                        aVar.m99537g(charSequence2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (c17945a0.m95042W5()) {
                if (c17945a0.m95074Z6()) {
                    aVar.m99538h(true);
                    if (c17945a0.m94929K2().f91017v.length() > 0) {
                        JSONObject jSONObject = new JSONObject(c17945a0.m94929K2().f91017v);
                        if (jSONObject.has("calltype")) {
                            aVar.m99536f(jSONObject.optInt("calltype"));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (c17945a0.m94899G7()) {
                CharSequence m95019U3 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                aVar.m99541k(m95019U3);
                CharSequence m95019U32 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U32, "getMessage(...)");
                aVar.m99537g(m95019U32);
                return;
            }
            if (c17945a0.m95161i7()) {
                CharSequence m95019U33 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U33, "getMessage(...)");
                aVar.m99541k(m95019U33);
                CharSequence m95019U34 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U34, "getMessage(...)");
                aVar.m99537g(m95019U34);
                aVar.m99539i("");
                return;
            }
            if (c17945a0.m94872D8()) {
                String m95019U35 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U35, "getMessage(...)");
                if (m95019U35.length() == 0) {
                    return;
                }
                CharSequence m95019U36 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U36, "getMessage(...)");
                aVar.m99541k(m95019U36);
                CharSequence m95019U37 = c17945a0.m95019U3();
                AbstractC19074t.m100207e(m95019U37, "getMessage(...)");
                aVar.m99537g(m95019U37);
                aVar.m99539i("");
            }
        }

        /* renamed from: j */
        private final void m99527j(a aVar, C17945a0 c17945a0) {
            String m95130f4 = c17945a0.m95130f4();
            if (m95130f4 != null && m95130f4.length() != 0) {
                String m95130f42 = c17945a0.m95130f4();
                AbstractC19074t.m100207e(m95130f42, "getNotifyText(...)");
                aVar.m99541k(m95130f42);
                String m95130f43 = c17945a0.m95130f4();
                AbstractC19074t.m100207e(m95130f43, "getNotifyText(...)");
                aVar.m99537g(m95130f43);
                aVar.m99539i("");
            }
        }

        /* renamed from: f */
        public final void m99528f(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, String str) {
            boolean z12;
            int i11;
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(str, "notifType");
            try {
                e m99512a = e.Companion.m99512a(contactProfile, c17945a0);
                if (!m99512a.m99511f() && !this.f94675b.m99164y()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11) {
                    i11 = 1;
                } else {
                    i11 = 2;
                }
                if (m99512a.m99506a()) {
                    m99524e(contactProfile, c17945a0, i11, z12, str);
                } else {
                    m99523d(contactProfile, c17945a0, m99512a, i11, z12, str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
            }
        }

        /* renamed from: g */
        public final void m99529g(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, int i11, e eVar) {
            boolean z12;
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(eVar, "inputData");
            try {
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                if (!z11 && !eVar.m99511f() && !this.f94675b.m99164y()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                String m99520a = m99520a(mo2478b, c17945a0, eVar);
                if (eVar.m99506a()) {
                    m99524e(contactProfile, c17945a0, i11, z12, m99520a);
                } else {
                    m99523d(contactProfile, c17945a0, eVar, i11, z12, m99520a);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
            }
        }

        /* renamed from: k */
        public final void m99530k(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, boolean z12) {
            boolean z13;
            int m118423d;
            AbstractC19074t.m100208f(contactProfile, "contact");
            AbstractC19074t.m100208f(c17945a0, "msg");
            try {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                if (z11 && this.f94674a.m141288H0(mo95039W2, c17945a0.m95029V3())) {
                    this.f94674a.m141372q(mo95039W2);
                    return;
                }
                boolean m141291I0 = this.f94674a.m141291I0(mo95039W2, c17945a0.m95029V3());
                String str = "chat_group_mention_me";
                if (AbstractC23309i.m120850D2()) {
                    z13 = this.f94674a.m141294J0(mo95039W2, c17945a0.m95029V3(), "chat_group_mention_me");
                } else {
                    z13 = false;
                }
                if (m141291I0 || z13) {
                    if (z13 && m141291I0 && (m118423d = AbstractC23088h5.m118423d("chat_group_mention_me", mo95039W2)) != 0) {
                        this.f94674a.m141290I(m118423d);
                        C28023b6.q.m141409f(m118423d);
                    }
                    if (m141291I0) {
                        str = AbstractC19646n0.m103043x0(mo95039W2);
                    }
                    AbstractC19074t.m100205c(str);
                    m99528f(contactProfile, c17945a0, z12, str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("NotificationProcessor", e11);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f94662q);
        f94655g = m129210a;
    }

    public /* synthetic */ C18961d(C28023b6 c28023b6, C26386a c26386a, C18922m c18922m, C11318b c11318b, C28203u6 c28203u6, AbstractC19060k abstractC19060k) {
        this(c28023b6, c26386a, c18922m, c11318b, c28203u6);
    }

    /* renamed from: e */
    public static /* synthetic */ void m99483e(C18961d c18961d, C17945a0 c17945a0, ContactProfile contactProfile, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        c18961d.m99491d(c17945a0, contactProfile, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:12:0x0026, B:14:0x002d, B:16:0x0033, B:20:0x0044, B:22:0x004a, B:24:0x0050, B:28:0x0056, B:32:0x005e, B:34:0x0073, B:36:0x0095, B:38:0x00a7, B:40:0x00ad, B:41:0x00bc, B:43:0x00c0, B:45:0x00c6, B:47:0x00d6, B:48:0x00d9, B:51:0x003d), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df A[ORIG_RETURN, RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m99484g(ContactProfile contactProfile, C17945a0 c17945a0, boolean z11) {
        String mo2478b = contactProfile.mo2478b();
        AbstractC19074t.m100207e(mo2478b, "getUid(...)");
        if (c17945a0.m95187l6() || this.f94657b.m60515j(mo2478b) || C26664o.m136836a().m136838c()) {
            return;
        }
        try {
            if (!c17945a0.m95180k8()) {
                if (c17945a0.m95118e4() == -1 && !c17945a0.m95286w6()) {
                }
                if (z11) {
                    if ((c17945a0.m95286w6() || (c17945a0.m95118e4() != 0 && c17945a0.m95118e4() != -1)) && !c17945a0.m95180k8()) {
                        C19636i1 m102800a = C19636i1.Companion.m102800a();
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        if (m102800a.m102758O(mo2478b, m95029V3)) {
                            C24559a.m127933c("NotificationProcessor", "Skip noti for msg (" + c17945a0.m95029V3().m41046j() + ") that has seen from PC");
                            return;
                        }
                        e m99512a = e.Companion.m99512a(contactProfile, c17945a0);
                        boolean m99519c = this.f94660e.m99519c(contactProfile, c17945a0, m99512a);
                        if (m99489m(c17945a0, m99512a)) {
                            if (m99488l(c17945a0, m99512a)) {
                                this.f94659d.m99529g(contactProfile, c17945a0, m99519c, 0, m99512a);
                                this.f94661f.m99503b(contactProfile, c17945a0, false, m99512a);
                            }
                            if (!AbstractC26681b.f126362g && c17945a0.m95083a8() && C1335e1.m6691e(MainApplication.Companion.m35500c()).m6695a()) {
                                C23081g9.m118409f(contactProfile);
                            }
                        }
                        this.f94656a.m141280E();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f94656a.m141293J(mo2478b);
            if (z11) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("NotificationProcessor", e11);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m99485h(C18961d c18961d, ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c18961d.m99484g(contactProfile, c17945a0, z11);
    }

    /* renamed from: i */
    public static final C18961d m99486i() {
        return Companion.m99497a();
    }

    /* renamed from: k */
    public static final void m99487k(C18961d c18961d, ContactProfile contactProfile, C17945a0 c17945a0, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c18961d, "this$0");
        AbstractC19074t.m100208f(contactProfile, "$contact");
        AbstractC19074t.m100208f(c17945a0, "$targetMsg");
        c18961d.f94661f.m99504e(contactProfile, c17945a0, z11);
        c18961d.f94659d.m99530k(contactProfile, c17945a0, z12, z11);
    }

    /* renamed from: l */
    private final boolean m99488l(C17945a0 c17945a0, e eVar) {
        if (eVar.m99510e() && !c17945a0.m95286w6()) {
            return false;
        }
        MainTabView m67645lM = MainTabView.m67645lM();
        if ((m67645lM != null && m67645lM.m67715wM()) || MessagesView.f63532m3) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private final boolean m99489m(C17945a0 c17945a0, e eVar) {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return false;
        }
        if (c17945a0.m95286w6()) {
            return true;
        }
        return !eVar.m99509d();
    }

    /* renamed from: p */
    public static final void m99490p(C18961d c18961d, C17945a0 c17945a0, ContactProfile contactProfile) {
        AbstractC19074t.m100208f(c18961d, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$targetMsg");
        AbstractC19074t.m100208f(contactProfile, "$contact");
        c18961d.m99491d(c17945a0, contactProfile, 4);
    }

    /* renamed from: d */
    public final void m99491d(C17945a0 c17945a0, ContactProfile contactProfile, int i11) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(contactProfile, "contact");
        this.f94659d.m99529g(contactProfile, c17945a0, false, i11, e.Companion.m99512a(contactProfile, c17945a0));
    }

    /* renamed from: f */
    public final void m99492f(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        boolean m132079d = AbstractC25495a.m132079d(mo95039W2);
        ContactProfile m141802p = C28203u6.m141802p(this.f94658c, mo95039W2, null, 2, null);
        m141802p.m40411j1(c17945a0.m95089b4());
        boolean z11 = true;
        if (m132079d) {
            String mo2475c = m141802p.mo2475c();
            AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
            if (mo2475c.length() == 0) {
                C0843s0.m2286r().m2294e(new AbstractC0826k.a(mo95039W2, 0));
            } else {
                z11 = false;
            }
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100205c(m94862C4);
            if (m94862C4.length() > 0 && !AbstractC19074t.m100204b(m94862C4, CoreUtility.f89233i)) {
                C28203u6.f131407a.m141810d(m94862C4, new TrackingSource((short) 1013));
            }
        } else {
            String mo2475c2 = m141802p.mo2475c();
            AbstractC19074t.m100207e(mo2475c2, "getDpn(...)");
            if (mo2475c2.length() == 0) {
                m141802p.mo2476e(c17945a0.m94854B4());
            } else {
                z11 = false;
            }
        }
        m99484g(m141802p, c17945a0, z11);
    }

    /* renamed from: j */
    public final void m99493j(C17945a0 c17945a0, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(c17945a0, "targetMsg");
        C28203u6 c28203u6 = this.f94658c;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC19444a.m101697e(new Runnable() { // from class: fj.c

            /* renamed from: q */
            public final /* synthetic */ ContactProfile f94651q;

            /* renamed from: r */
            public final /* synthetic */ C17945a0 f94652r;

            /* renamed from: s */
            public final /* synthetic */ boolean f94653s;

            /* renamed from: t */
            public final /* synthetic */ boolean f94654t;

            public /* synthetic */ RunnableC18960c(ContactProfile contactProfile, C17945a0 c17945a02, boolean z122, boolean z112) {
                r2 = contactProfile;
                r3 = c17945a02;
                r4 = z122;
                r5 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18961d.m99487k(C18961d.this, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: n */
    public final void m99494n(String str, String str2, String str3, String str4) {
        ContactProfile contactProfile = new ContactProfile("group_" + str);
        contactProfile.f42437s = str2;
        contactProfile.f42446v = str3;
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String str5 = contactProfile.f42434r;
        AbstractC19074t.m100207e(str5, "uid");
        String str6 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str6, "currentUserUid");
        C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", str5, str6), 20).m95382r(str4).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m99485h(this, contactProfile, m95365a, false, 4, null);
    }

    /* renamed from: o */
    public final void m99495o(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "targetMsg");
        C28203u6 c28203u6 = this.f94658c;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        AbstractC19444a.m101697e(new Runnable() { // from class: fj.b

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f94646q;

            /* renamed from: r */
            public final /* synthetic */ ContactProfile f94647r;

            public /* synthetic */ RunnableC18958b(C17945a0 c17945a02, ContactProfile contactProfile) {
                r2 = c17945a02;
                r3 = contactProfile;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C18961d.m99490p(C18961d.this, r2, r3);
            }
        });
    }

    private C18961d(C28023b6 c28023b6, C26386a c26386a, C18922m c18922m, C11318b c11318b, C28203u6 c28203u6) {
        this.f94656a = c28023b6;
        this.f94657b = c11318b;
        this.f94658c = c28203u6;
        this.f94659d = new g(c28023b6, c18922m);
        this.f94660e = new f(c18922m);
        this.f94661f = new d(c26386a, c11318b);
    }
}
