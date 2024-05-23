package wd0;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import gw.C19669z;
import p019aj.C0872f;
import p019aj.C0876j;
import p185gc.AbstractC19383g;
import p348mi.AbstractC23309i;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import wd0.C28923c;
import wd0.C28925e;

/* renamed from: wd0.f */
/* loaded from: classes4.dex */
public final class C28926f extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19669z f133925a;

    /* renamed from: b */
    private final C19636i1 f133926b;

    /* renamed from: c */
    private final C0872f f133927c;

    /* renamed from: d */
    private final C28923c f133928d;

    /* renamed from: e */
    private final C28925e f133929e;

    /* renamed from: f */
    private final C0876j f133930f;

    /* renamed from: wd0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133931a;

        /* renamed from: b */
        private final MessageId f133932b;

        /* renamed from: c */
        private final long f133933c;

        /* renamed from: d */
        private final boolean f133934d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            this(str, null, 0L, false, 14, null);
            AbstractC19074t.m100208f(str, "userId");
        }

        /* renamed from: a */
        public final boolean m144530a() {
            return this.f133934d;
        }

        /* renamed from: b */
        public final MessageId m144531b() {
            return this.f133932b;
        }

        /* renamed from: c */
        public final long m144532c() {
            return this.f133933c;
        }

        /* renamed from: d */
        public final String m144533d() {
            return this.f133931a;
        }

        public b(String str, MessageId messageId, long j11, boolean z11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f133931a = str;
            this.f133932b = messageId;
            this.f133933c = j11;
            this.f133934d = z11;
        }

        public /* synthetic */ b(String str, MessageId messageId, long j11, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : messageId, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? false : z11);
        }
    }

    public C28926f(C19669z c19669z, C19636i1 c19636i1, C0872f c0872f, C28923c c28923c, C28925e c28925e, C0876j c0876j) {
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c28923c, "deleteConversationUseCase");
        AbstractC19074t.m100208f(c28925e, "deleteConversationByLastMsgUseCase");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f133925a = c19669z;
        this.f133926b = c19636i1;
        this.f133927c = c0872f;
        this.f133928d = c28923c;
        this.f133929e = c28925e;
        this.f133930f = c0876j;
    }

    /* renamed from: c */
    private final void m144527c(int i11) {
        for (Conversation conversation : C7959d.Companion.m41850e().m41747S0(i11)) {
            this.f133928d.m101508a(new C28923c.b(conversation.f42893q, "DeleteTabMsgConversation", false, false, false, 28, null));
            this.f133926b.m102792v0(conversation.f42893q);
        }
        m144528d(i11);
    }

    /* renamed from: d */
    private final void m144528d(int i11) {
        C7959d.Companion.m41850e().m41724L2(i11);
        this.f133925a.m103203S0(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        String m144533d = bVar.m144533d();
        MessageId m144531b = bVar.m144531b();
        long m144532c = bVar.m144532c();
        boolean m144530a = bVar.m144530a();
        if (AbstractC25495a.m132084i(m144533d)) {
            m144527c(2);
            return;
        }
        if (AbstractC25495a.m132081f(m144533d)) {
            m144527c(3);
            AbstractC23309i.m121924fz(0);
            return;
        }
        C17945a0 m2603B = this.f133930f.m2603B(m144533d);
        if (m144531b != null && m144532c > 0 && m2603B != null && m2603B.m94974P4() > m144532c) {
            this.f133929e.m101508a(new C28925e.b(m144533d, m144531b, "DeleteTabMsgConversation", true, false, 16, null));
        } else {
            this.f133928d.m101508a(new C28923c.b(m144533d, "DeleteTabMsgConversation", false, false, m144530a, 12, null));
        }
        if (AbstractC25495a.m132079d(m144533d)) {
            C25489b.m132042t(m144533d);
        }
    }
}
