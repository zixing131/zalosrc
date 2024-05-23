package p186gj;

import ag0.C0804b;
import com.zing.zalo.data.entity.chat.message.C7940a;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fj.C18961d;
import fj.C18980w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import gw.C19669z;
import i60.C20338d;
import java.util.List;
import mm0.AbstractC23350e;
import p019aj.C0876j;
import p241ij.C20568e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import tj.AbstractC26714f;
import tj.C26709a;
import tj.C26711c;
import wd0.C28923c;
import wd0.C28925e;
import ws.C29210k;
import xd0.C29588d;
import xd0.C29602r;

/* renamed from: gj.e */
/* loaded from: classes3.dex */
public final class C19461e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f96585a;

    /* renamed from: b */
    private final C18961d f96586b;

    /* renamed from: c */
    private final InterfaceC24854k f96587c;

    /* renamed from: d */
    private final InterfaceC24854k f96588d;

    /* renamed from: gj.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gj.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f96589q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29588d mo12V4() {
            return AbstractC23306f.m120604O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gj.e$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f96590q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C29602r mo12V4() {
            return AbstractC23306f.m120603N1();
        }
    }

    public C19461e(C0876j c0876j, C18961d c18961d) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c18961d, "chatNotificationManager");
        this.f96585a = c0876j;
        this.f96586b = c18961d;
        m129210a = AbstractC24856m.m129210a(c.f96590q);
        this.f96587c = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f96589q);
        this.f96588d = m129210a2;
    }

    /* renamed from: a */
    private final C29588d m101771a() {
        return (C29588d) this.f96588d.getValue();
    }

    /* renamed from: b */
    private final C29602r m101772b() {
        return (C29602r) this.f96587c.getValue();
    }

    /* renamed from: c */
    private final void m101773c(MessageId messageId, boolean z11, boolean z12, boolean z13, String str) {
        C20568e c20568e = new C20568e(messageId, messageId.m41048l(), -1, z11, z12, z13, str);
        this.f96585a.m2623f(messageId.m41048l(), c20568e);
        C23744a.Companion.m124119a().m124116d(9, new C20338d(-1, null, messageId, c20568e));
    }

    /* renamed from: e */
    public static /* synthetic */ void m101774e(C19461e c19461e, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c19461e.m101778d(c17945a0, z11);
    }

    /* renamed from: f */
    private final void m101775f(C26711c c26711c) {
        if (!AbstractC26714f.m137369f(c26711c.f126654b)) {
            return;
        }
        C0876j c0876j = this.f96585a;
        String str = c26711c.f126657e;
        AbstractC19074t.m100207e(str, "ownerId");
        c0876j.m2622e(str, c26711c);
        C29210k m145896a = C29210k.Companion.m145896a();
        String str2 = c26711c.f126657e;
        AbstractC19074t.m100207e(str2, "ownerId");
        m145896a.m145860a1(str2, c26711c.f126654b);
        C0876j c0876j2 = this.f96585a;
        String str3 = c26711c.f126657e;
        AbstractC19074t.m100207e(str3, "ownerId");
        C17945a0 m2603B = c0876j2.m2603B(str3);
        if (m2603B != null && c26711c.f126654b != null && ((c26711c.f126658f > 0 && m2603B.m94974P4() > 0 && m2603B.m94974P4() <= c26711c.f126658f) || ((c26711c.f126654b.m41053q() && m2603B.m95029V3().m41053q() && m2603B.m95029V3().m41047k() <= c26711c.f126654b.m41047k()) || (c26711c.f126654b.m41052p() && m2603B.m95029V3().m41052p() && m2603B.m95029V3().m41045i() <= c26711c.f126654b.m41045i())))) {
            C19669z m103232a = C19669z.Companion.m103232a();
            String str4 = c26711c.f126657e;
            AbstractC19074t.m100207e(str4, "ownerId");
            m103232a.m103194I(str4);
            C28923c m120601N = AbstractC23306f.m120601N();
            String str5 = c26711c.f126657e;
            AbstractC19074t.m100207e(str5, "ownerId");
            m120601N.m101508a(new C28923c.b(str5, "SpecialMessageProcessor", false, false, false, 24, null));
        } else {
            C28925e m120595L = AbstractC23306f.m120595L();
            AbstractC19074t.m100207e(m120595L, "provideDeleteConversationByLastMsgUseCase(...)");
            String str6 = c26711c.f126657e;
            AbstractC19074t.m100207e(str6, "ownerId");
            MessageId messageId = c26711c.f126654b;
            AbstractC19074t.m100207e(messageId, "delMessageId");
            m120595L.m101508a(new C28925e.b(str6, messageId, "SpecialMessageProcessor", false, false, 24, null));
        }
        C18980w m120727y = AbstractC23306f.m120727y();
        String str7 = c26711c.f126657e;
        AbstractC19074t.m100207e(str7, "ownerId");
        m120727y.m99605L(str7, c26711c.f126654b.m41047k());
    }

    /* renamed from: g */
    private final void m101776g(C17945a0 c17945a0, C26709a c26709a, C26711c c26711c) {
        List m131496e;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        MessageId messageId = c26711c.f126654b;
        boolean m137325f = c26709a.m137325f();
        boolean m137323d = c26709a.m137323d();
        try {
            C17945a0 m2635r = this.f96585a.m2635r(messageId);
            if (m2635r == null) {
                AbstractC19074t.m100205c(messageId);
                m101773c(messageId, false, m137323d, m137325f, c26709a.m137320a());
                return;
            }
            if (!m137325f) {
                C29588d m101771a = m101771a();
                m131496e = AbstractC25366r.m131496e(m2635r);
                m101771a.m101508a(new C29588d.c(mo95039W2, m131496e, C29588d.b.f136554r));
            } else {
                m101772b().m101508a(new C29602r.b(m2635r, true, c26709a.m137320a()));
            }
            if ((AbstractC23309i.m120936Fe() || (c17945a0.m95118e4() != -1 && c17945a0.m95118e4() != 0)) && !c17945a0.m95032V6() && m2635r.m95032V6() && m2635r.m94847A6() && !C0804b.m2025g().m2033i(mo95039W2)) {
                AbstractC19646n0.m102937U1(m2635r, c26709a.m137321b());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m101777i(C19461e c19461e, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c19461e.m101779h(c17945a0, z11);
    }

    /* renamed from: d */
    public final void m101778d(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "msgActionDelete");
        try {
            C26709a m94972P2 = c17945a0.m94972P2();
            if (m94972P2 == null) {
                return;
            }
            if (m94972P2.m137324e() && !AbstractC23309i.m121456Tg()) {
                return;
            }
            if ((m94972P2.m137323d() && !AbstractC23309i.m121010He()) || m94972P2.m137322c().isEmpty()) {
                return;
            }
            for (C26711c c26711c : m94972P2.m137322c()) {
                if (z11) {
                    if (c26711c.m137332c()) {
                        C0876j c0876j = this.f96585a;
                        String str = c26711c.f126657e;
                        AbstractC19074t.m100207e(str, "ownerId");
                        c0876j.m2622e(str, c26711c);
                    } else {
                        MessageId messageId = c26711c.f126654b;
                        AbstractC19074t.m100207e(messageId, "delMessageId");
                        m101773c(messageId, false, m94972P2.m137323d(), m94972P2.m137325f(), m94972P2.m137320a());
                    }
                } else if (c26711c.m137332c()) {
                    m101775f(c26711c);
                } else {
                    m101776g(c17945a0, m94972P2, c26711c);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }

    /* renamed from: h */
    public final void m101779h(C17945a0 c17945a0, boolean z11) {
        List m131496e;
        AbstractC19074t.m100208f(c17945a0, "msgActionUndo");
        try {
            C7940a m95052X4 = c17945a0.m95052X4();
            if (m95052X4 == null) {
                return;
            }
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            MessageId m41078a = m95052X4.m41078a();
            boolean m41079b = m95052X4.m41079b();
            if (m41078a == null) {
                return;
            }
            if (z11) {
                m101773c(m41078a, true, false, m41079b, "");
            }
            C17945a0 m2635r = this.f96585a.m2635r(m41078a);
            if (m2635r == null) {
                m101773c(m41078a, true, false, m41079b, "");
            } else {
                if (!m41079b) {
                    C29588d m101771a = m101771a();
                    m131496e = AbstractC25366r.m131496e(m2635r);
                    m101771a.m101508a(new C29588d.c(mo95039W2, m131496e, C29588d.b.f136553q));
                    return;
                }
                m101772b().m101508a(new C29602r.b(m2635r, false, null, 6, null));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SpecialMessageProcessor", e11);
        }
    }
}
