package xd0;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import dj.C17958e1;
import dj.C17969i0;
import dj.C17996r0;
import fj.C18961d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19636i1;
import gw.C19669z;
import ho0.AbstractC20110a;
import i60.C20338d;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p019aj.C0876j;
import p185gc.AbstractC19383g;
import p241ij.C20568e;
import p263jc.C21216s;
import p348mi.AbstractC23304d;
import p363nh.C23744a;
import p716zh.C32034n6;
import p716zh.C32050o7;
import qm0.AbstractC25366r;

/* renamed from: xd0.r */
/* loaded from: classes4.dex */
public final class C29602r extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f136649a;

    /* renamed from: b */
    private final C32034n6 f136650b;

    /* renamed from: c */
    private final C19636i1 f136651c;

    /* renamed from: d */
    private final C21216s f136652d;

    /* renamed from: e */
    private final C18961d f136653e;

    /* renamed from: xd0.r$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xd0.r$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final C17945a0 f136654a;

        /* renamed from: b */
        private final boolean f136655b;

        /* renamed from: c */
        private final String f136656c;

        public b(C17945a0 c17945a0, boolean z11, String str) {
            AbstractC19074t.m100208f(c17945a0, "message");
            AbstractC19074t.m100208f(str, "customMessage");
            this.f136654a = c17945a0;
            this.f136655b = z11;
            this.f136656c = str;
        }

        /* renamed from: a */
        public final String m147113a() {
            return this.f136656c;
        }

        /* renamed from: b */
        public final C17945a0 m147114b() {
            return this.f136654a;
        }

        /* renamed from: c */
        public final boolean m147115c() {
            return this.f136655b;
        }

        public /* synthetic */ b(C17945a0 c17945a0, boolean z11, String str, int i11, AbstractC19060k abstractC19060k) {
            this(c17945a0, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? "" : str);
        }
    }

    public C29602r(C0876j c0876j, C32034n6 c32034n6, C19636i1 c19636i1, C21216s c21216s, C18961d c18961d) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c32034n6, "localFileCleaner");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c21216s, "autoDownloadMsgController");
        AbstractC19074t.m100208f(c18961d, "chatNotificationManager");
        this.f136649a = c0876j;
        this.f136650b = c32034n6;
        this.f136651c = c19636i1;
        this.f136652d = c21216s;
        this.f136653e = c18961d;
    }

    /* renamed from: e */
    private final void m147107e(MessageId messageId, String str, int i11, String str2, C17969i0 c17969i0, String str3) {
        boolean z11;
        List m131496e;
        if (messageId.m41050n().length() != 0 || str.length() <= 0) {
            str = messageId.m41050n();
        }
        C17945a0 m95365a = new C17945a0.w(MessageId.Companion.m41064b(messageId.m41044h(), messageId.m41046j(), messageId.m41048l(), str), i11).m95368d(c17969i0).m95379o(str2).m95363O(str3).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        if (m95365a.m95276v6() && m95365a.m95032V6()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd0.q

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f136647q;

            /* renamed from: r */
            public final /* synthetic */ boolean f136648r;

            public /* synthetic */ RunnableC29601q(C17945a0 m95365a2, boolean z112) {
                r2 = m95365a2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29602r.m147108f(C29602r.this, r2, r3);
            }
        });
        C21216s c21216s = this.f136652d;
        m131496e = AbstractC25366r.m131496e(m95365a2);
        c21216s.m109885k1(m131496e);
    }

    /* renamed from: f */
    public static final void m147108f(C29602r c29602r, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c29602r, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$cloneMsgToUndo");
        c29602r.f136650b.m154503g(c17945a0, z11);
    }

    /* renamed from: g */
    private final void m147109g(C17945a0 c17945a0) {
        String str;
        C17996r0 c17996r0;
        try {
            c17945a0.m94928K1();
            C0814e0.m2069o(c17945a0);
            c17945a0.m95077Zb();
            if (c17945a0.m94941L6()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if (m94929K2 instanceof C17996r0) {
                    c17996r0 = (C17996r0) m94929K2;
                } else {
                    c17996r0 = null;
                }
                if (c17996r0 != null) {
                    C8967m.m47867E().m47922k0(c17996r0.f91147B);
                }
            }
            C32050o7 m154655h = C32050o7.m154655h();
            if (c17945a0.m94847A6()) {
                str = "2";
            } else {
                str = "1";
            }
            m154655h.m154666p(c17945a0, true, str);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: i */
    public static final void m147110i(C17945a0 c17945a0, C17958e1 c17958e1, boolean z11, MessageId messageId) {
        int i11;
        AbstractC19074t.m100208f(c17945a0, "$msgToUndo");
        AbstractC19074t.m100208f(messageId, "$messageId");
        try {
            c17945a0.m95191la(c17958e1);
            if (c17945a0.m95032V6() && c17945a0.m95208n8()) {
                c17945a0.m95247s2();
            }
            if (z11) {
                i11 = 33;
            } else {
                i11 = 36;
            }
            c17945a0.m94851Ab(i11);
            c17945a0.m94934Ka("");
            c17945a0.m95034V9();
            AbstractC19656s0.m103057F(messageId, z11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("UndoMessage", e11);
        }
    }

    /* renamed from: j */
    private final void m147111j(MessageId messageId, C17958e1 c17958e1) {
        String m118743r0;
        C17945a0 m2603B = this.f136649a.m2603B(messageId.m41048l());
        if (m2603B != null && m2603B.m95135f9(messageId)) {
            if (c17958e1 == null || (m118743r0 = c17958e1.m95420i()) == null) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_bubble_undo_sent_message);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
            C7959d.Companion.m41850e().m41737P3(messageId.m41048l(), 36, m118743r0);
        }
        C23744a.Companion.m124119a().m124116d(6064, new Object[0]);
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: h */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        C17945a0 m147114b = bVar.m147114b();
        boolean m147115c = bVar.m147115c();
        String m147113a = bVar.m147113a();
        MessageId m95029V3 = m147114b.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        String m41048l = m95029V3.m41048l();
        String m94862C4 = m147114b.m94862C4();
        int m95041W4 = m147114b.m95041W4();
        String m94983Q3 = m147114b.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        C17969i0 m94929K2 = m147114b.m94929K2();
        String m95090b5 = m147114b.m95090b5();
        AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
        boolean m94877E3 = m147114b.m94877E3();
        boolean m95042W5 = m147114b.m95042W5();
        C19636i1 c19636i1 = this.f136651c;
        String mo95039W2 = m147114b.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        FirstUnreadMsg m102791v = c19636i1.m102791v(mo95039W2);
        m147109g(m147114b);
        C17958e1 m103062e = AbstractC19656s0.m103062e(m147114b, m147113a, m147115c);
        AbstractC19444a.m101697e(new Runnable() { // from class: xd0.p

            /* renamed from: q */
            public final /* synthetic */ C17958e1 f136643q;

            /* renamed from: r */
            public final /* synthetic */ boolean f136644r;

            /* renamed from: s */
            public final /* synthetic */ MessageId f136645s;

            public /* synthetic */ RunnableC29600p(C17958e1 m103062e2, boolean m147115c2, MessageId m95029V32) {
                r2 = m103062e2;
                r3 = m147115c2;
                r4 = m95029V32;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29602r.m147110i(C17945a0.this, r2, r3, r4);
            }
        });
        try {
            C7956b.Companion.m41573b().m41506E0(m95029V32, m147115c2, m103062e2);
            m147111j(m95029V32, m103062e2);
            AbstractC19656s0.m103056E(m95029V32, m147115c2);
            if (m94877E3) {
                AbstractC19646n0.m102875A(m95029V32);
            }
            if (m102791v != null && m102791v.m41023b() <= m147114b.m94974P4()) {
                this.f136653e.m99493j(m147114b, m95042W5, true);
            }
            AbstractC19074t.m100205c(m94862C4);
            m147107e(m95029V32, m94862C4, m95041W4, m94983Q3, m94929K2, m95090b5);
            C17945a0 m102749H = this.f136651c.m102749H(m41048l);
            if (m102749H != null && m102749H.m95135f9(m95029V32)) {
                this.f136651c.m102780o0(m41048l);
                C19669z.Companion.m103232a().m103198O0();
            }
            C20568e c20568e = new C20568e(m95029V32, m95029V32.m41048l(), m95041W4, !m147115c2, m147115c2, true, null, 64, null);
            AbstractC23304d.f113413n.add(c20568e);
            C23744a.Companion.m124119a().m124116d(9, new C20338d(m95041W4, m147114b, m95029V32, c20568e));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
