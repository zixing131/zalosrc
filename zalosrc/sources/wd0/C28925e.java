package wd0;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import android.text.TextUtils;
import androidx.work.AbstractC2144f;
import ch0.AbstractC3489d;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import d60.C17795d;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17996r0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import gw.C19610a;
import gw.C19669z;
import i60.C20338d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import p019aj.C0876j;
import p056cj.C3535c;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p405ov.C24559a;
import p716zh.C32034n6;
import p716zh.C32090r5;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import wd0.C28921a;
import wd0.C28927g;
import wd0.C28931k;
import ws.C29210k;

/* renamed from: wd0.e */
/* loaded from: classes4.dex */
public final class C28925e extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C24261h f133904a;

    /* renamed from: b */
    private final C0876j f133905b;

    /* renamed from: c */
    private final C19669z f133906c;

    /* renamed from: d */
    private final C32034n6 f133907d;

    /* renamed from: e */
    private final C28927g f133908e;

    /* renamed from: f */
    private final C19610a f133909f;

    /* renamed from: g */
    private final C29210k f133910g;

    /* renamed from: h */
    private final C21216s f133911h;

    /* renamed from: wd0.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.e$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133912a;

        /* renamed from: b */
        private final MessageId f133913b;

        /* renamed from: c */
        private final String f133914c;

        /* renamed from: d */
        private final boolean f133915d;

        /* renamed from: e */
        private final boolean f133916e;

        public b(String str, MessageId messageId, String str2, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(messageId, "lastMsgId");
            AbstractC19074t.m100208f(str2, "entryPoint");
            this.f133912a = str;
            this.f133913b = messageId;
            this.f133914c = str2;
            this.f133915d = z11;
            this.f133916e = z12;
        }

        /* renamed from: a */
        public final boolean m144521a() {
            return this.f133916e;
        }

        /* renamed from: b */
        public final MessageId m144522b() {
            return this.f133913b;
        }

        /* renamed from: c */
        public final boolean m144523c() {
            return this.f133915d;
        }

        /* renamed from: d */
        public final String m144524d() {
            return this.f133912a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f133912a, bVar.f133912a) && AbstractC19074t.m100204b(this.f133913b, bVar.f133913b) && AbstractC19074t.m100204b(this.f133914c, bVar.f133914c) && this.f133915d == bVar.f133915d && this.f133916e == bVar.f133916e;
        }

        public int hashCode() {
            return (((((((this.f133912a.hashCode() * 31) + this.f133913b.hashCode()) * 31) + this.f133914c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f133915d)) * 31) + AbstractC2144f.m11520a(this.f133916e);
        }

        public String toString() {
            return "Params(ownerId=" + this.f133912a + ", lastMsgId=" + this.f133913b + ", entryPoint=" + this.f133914c + ", needSyncToPC=" + this.f133915d + ", deleteMediaOnly=" + this.f133916e + ")";
        }

        public /* synthetic */ b(String str, MessageId messageId, String str2, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
            this(str, messageId, str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
        }
    }

    /* renamed from: wd0.e$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f133918r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f133918r = str;
        }

        /* renamed from: a */
        public final void m144525a(List list) {
            AbstractC19074t.m100208f(list, "listMsgToClean");
            C28925e.this.m144518p(this.f133918r, C28925e.this.m144513k(list));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144525a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wd0.e$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C19055h0 f133919q;

        /* renamed from: r */
        final /* synthetic */ C28925e f133920r;

        /* renamed from: s */
        final /* synthetic */ String f133921s;

        /* renamed from: t */
        final /* synthetic */ C3535c f133922t;

        /* renamed from: u */
        final /* synthetic */ C19051f0 f133923u;

        /* renamed from: v */
        final /* synthetic */ List f133924v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C19055h0 c19055h0, C28925e c28925e, String str, C3535c c3535c, C19051f0 c19051f0, List list) {
            super(1);
            this.f133919q = c19055h0;
            this.f133920r = c28925e;
            this.f133921s = str;
            this.f133922t = c3535c;
            this.f133923u = c19051f0;
            this.f133924v = list;
        }

        /* renamed from: a */
        public final void m144526a(List list) {
            int m131511r;
            boolean z11;
            AbstractC19074t.m100208f(list, "listMsgToDelete");
            this.f133919q.f94931p += list.size();
            List<C17945a0> list2 = list;
            C3535c c3535c = this.f133922t;
            C28925e c28925e = this.f133920r;
            String str = this.f133921s;
            C19051f0 c19051f0 = this.f133923u;
            List list3 = this.f133924v;
            for (C17945a0 c17945a0 : list2) {
                if (c3535c != null) {
                    c3535c.mo17960Z(c17945a0);
                }
                c28925e.m144511i(str, c17945a0);
                if (!c19051f0.f94928p && c17945a0.m95032V6()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                c19051f0.f94928p = z11;
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                list3.add(m95029V3);
            }
            this.f133920r.m144513k(list);
            C28925e c28925e2 = this.f133920r;
            String str2 = this.f133921s;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                MessageId m95029V32 = ((C17945a0) it.next()).m95029V3();
                AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                arrayList.add(m95029V32);
            }
            c28925e2.m144510h(str2, arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144526a((List) obj);
            return C24848g0.f119245a;
        }
    }

    public C28925e(C24261h c24261h, C0876j c0876j, C19669z c19669z, C32034n6 c32034n6, C28927g c28927g, C19610a c19610a, C29210k c29210k, C21216s c21216s) {
        AbstractC19074t.m100208f(c24261h, "reactionMessageManager");
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c32034n6, "fileCleaner");
        AbstractC19074t.m100208f(c28927g, "deleteTabMsgItemUseCase");
        AbstractC19074t.m100208f(c19610a, "deleteMessageManager");
        AbstractC19074t.m100208f(c29210k, "pullMsgManager");
        AbstractC19074t.m100208f(c21216s, "autoDownloadMsgController");
        this.f133904a = c24261h;
        this.f133905b = c0876j;
        this.f133906c = c19669z;
        this.f133907d = c32034n6;
        this.f133908e = c28927g;
        this.f133909f = c19610a;
        this.f133910g = c29210k;
        this.f133911h = c21216s;
    }

    /* renamed from: h */
    public final void m144510h(String str, List list) {
        this.f133904a.m126647n(str, list, false);
    }

    /* renamed from: i */
    public final void m144511i(String str, C17945a0 c17945a0) {
        C17996r0 c17996r0;
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
        C23744a.Companion.m124119a().m124116d(9, new C20338d(c17945a0.m95041W4(), c17945a0, c17945a0.m95029V3(), null, 8, null));
        if (C32090r5.m154810i().m154824o()) {
            C32090r5.m154810i().m154825p(c17945a0.m95029V3(), str);
        }
    }

    /* renamed from: j */
    private final void m144512j(String str, List list) {
        C7956b.Companion.m41573b().m41547m(str, list);
    }

    /* renamed from: k */
    public final List m144513k(List list) {
        List m131502j;
        if (list.isEmpty()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C17945a0) obj).m94906H5()) {
                arrayList.add(obj);
            }
        }
        m144514l(arrayList);
        return arrayList;
    }

    /* renamed from: l */
    private final void m144514l(List list) {
        if (list.isEmpty()) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: wd0.d

            /* renamed from: q */
            public final /* synthetic */ List f133903q;

            public /* synthetic */ RunnableC28924d(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28925e.m144515m(C28925e.this, r2);
            }
        });
    }

    /* renamed from: m */
    public static final void m144515m(C28925e c28925e, List list) {
        AbstractC19074t.m100208f(c28925e, "this$0");
        AbstractC19074t.m100208f(list, "$mediaMsgList");
        c28925e.f133907d.m154504h(list);
        c28925e.f133911h.m109885k1(list);
    }

    /* renamed from: n */
    private final void m144516n(String str, MessageId messageId, boolean z11, InterfaceC18505l interfaceC18505l) {
        boolean z12;
        int i11 = 0;
        do {
            List m41566y = C7956b.Companion.m41573b().m41566y(str, messageId, z11, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
            if (!m41566y.isEmpty()) {
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(m41566y);
                }
                if (m41566y.size() == 500) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i11 += ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
            } else {
                return;
            }
        } while (z12);
    }

    /* renamed from: o */
    private final Conversation m144517o(String str) {
        return this.f133906c.m103201R(str);
    }

    /* renamed from: p */
    public final void m144518p(String str, List list) {
        int i11;
        if (AbstractC3489d.m17501i()) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        C0876j c0876j = this.f133905b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((C17945a0) obj).m95022U7()) {
                arrayList.add(obj);
            }
        }
        c0876j.m2620X(str, arrayList, i11);
        this.f133905b.m2621Z(str, list, "");
    }

    /* renamed from: q */
    private final void m144519q(String str) {
        this.f133905b.m2629l(str);
        this.f133908e.m101508a(new C28927g.b(str, false, 2, null));
        this.f133910g.m145835H0(str);
        new C28921a().m101508a(new C28921a.b(str));
        C23744a.Companion.m124119a().m124116d(92, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0191 A[Catch: all -> 0x0144, Exception -> 0x0149, TryCatch #11 {Exception -> 0x0149, all -> 0x0144, blocks: (B:50:0x0140, B:23:0x015f, B:25:0x0165, B:27:0x016d, B:28:0x0172, B:30:0x0178, B:34:0x0188, B:36:0x0191, B:37:0x0194, B:40:0x01a2, B:41:0x01ba, B:45:0x0182), top: B:49:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a0  */
    @Override // p185gc.AbstractC19383g
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12006b(b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        int i11;
        C17795d m120730z;
        String str5;
        MessageId messageId;
        String str6;
        C17945a0 m2603B;
        C17945a0 m2635r;
        AbstractC19074t.m100208f(bVar, "params");
        String m144524d = bVar.m144524d();
        MessageId m144522b = bVar.m144522b();
        boolean z11 = !bVar.m144523c();
        if (!TextUtils.isEmpty(m144524d) && m144522b.m41059z()) {
            C24559a.m127933c("DeleteConversationByLas", "Start delete conversation (" + bVar + ")");
            C17795d m120730z2 = AbstractC23306f.m120730z();
            AbstractC19074t.m100207e(m120730z2, "provideChatPerfLogger(...)");
            C17795d.m93991l(m120730z2, "DELETE_CONVERSATION_BY_LAST_MSG", null, 2, null);
            try {
            } catch (Exception e11) {
                e = e11;
                str = null;
                str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                str3 = "provideChatPerfLogger(...)";
                str4 = "DeleteConversationByLas";
            } catch (Throwable th2) {
                th = th2;
                str = null;
                str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                str3 = "provideChatPerfLogger(...)";
            }
            if (bVar.m144521a()) {
                m144516n(m144524d, m144522b, z11, new c(m144524d));
                C23744a.Companion.m124119a().m124116d(4, m144524d);
                C17795d m120730z3 = AbstractC23306f.m120730z();
                AbstractC19074t.m100207e(m120730z3, "provideChatPerfLogger(...)");
                C17795d.m93984d(m120730z3, "DELETE_CONVERSATION_BY_LAST_MSG", null, 2, null);
                return;
            }
            C17945a0 m2603B2 = this.f133905b.m2603B(m144524d);
            C19055h0 c19055h0 = new C19055h0();
            C19051f0 c19051f0 = new C19051f0();
            C3535c m2634q = this.f133905b.m2634q(m144524d);
            ArrayList arrayList = new ArrayList();
            try {
                m144516n(m144524d, m144522b, z11, new d(c19055h0, this, m144524d, m2634q, c19051f0, arrayList));
                C24559a.m127933c("DeleteConversationByLas", "Found " + c19055h0.f94931p + " msg(s)");
            } catch (Exception e12) {
                e = e12;
                str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                str3 = "provideChatPerfLogger(...)";
                str4 = "DeleteConversationByLas";
                str = null;
                i11 = 2;
                try {
                    AbstractC23350e.m122776f(str4, e);
                    m120730z = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z, str3);
                    C17795d.m93984d(m120730z, str2, str, i11, str);
                } catch (Throwable th3) {
                    th = th3;
                    C17795d m120730z4 = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z4, str3);
                    C17795d.m93984d(m120730z4, str2, str, i11, str);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                str3 = "provideChatPerfLogger(...)";
                str = null;
                i11 = 2;
                C17795d m120730z42 = AbstractC23306f.m120730z();
                AbstractC19074t.m100207e(m120730z42, str3);
                C17795d.m93984d(m120730z42, str2, str, i11, str);
                throw th;
            }
            if (c19055h0.f94931p == 0) {
                try {
                    C23744a.Companion.m124119a().m124116d(1, m144524d);
                    C17795d m120730z5 = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z5, "provideChatPerfLogger(...)");
                    C17795d.m93984d(m120730z5, "DELETE_CONVERSATION_BY_LAST_MSG", null, 2, null);
                    return;
                } catch (Exception e13) {
                    e = e13;
                    str = null;
                    i11 = 2;
                    str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    str4 = "DeleteConversationByLas";
                    AbstractC23350e.m122776f(str4, e);
                    m120730z = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z, str3);
                    C17795d.m93984d(m120730z, str2, str, i11, str);
                } catch (Throwable th5) {
                    th = th5;
                    str = null;
                    i11 = 2;
                    str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    C17795d m120730z422 = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z422, str3);
                    C17795d.m93984d(m120730z422, str2, str, i11, str);
                    throw th;
                }
            }
            str = null;
            i11 = 2;
            if (m2634q != null) {
                try {
                    m2634q.m17961Z0();
                } catch (Exception e14) {
                    e = e14;
                    str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    str4 = "DeleteConversationByLas";
                    AbstractC23350e.m122776f(str4, e);
                    m120730z = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z, str3);
                    C17795d.m93984d(m120730z, str2, str, i11, str);
                } catch (Throwable th6) {
                    th = th6;
                    str2 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    C17795d m120730z4222 = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z4222, str3);
                    C17795d.m93984d(m120730z4222, str2, str, i11, str);
                    throw th;
                }
            }
            C23744a.Companion.m124119a().m124116d(1, m144524d);
            Conversation m144517o = m144517o(m144524d);
            if (m144517o == null) {
                try {
                    str5 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    str4 = "DeleteConversationByLas";
                    messageId = m144522b;
                    str6 = m144524d;
                } catch (Exception e15) {
                    e = e15;
                    str5 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                    str4 = "DeleteConversationByLas";
                } catch (Throwable th7) {
                    th = th7;
                    str5 = "DELETE_CONVERSATION_BY_LAST_MSG";
                    str3 = "provideChatPerfLogger(...)";
                }
                try {
                    m144517o = new Conversation(m144524d, null, null, null, 14, null);
                } catch (Exception e16) {
                    e = e16;
                    str2 = str5;
                    AbstractC23350e.m122776f(str4, e);
                    m120730z = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z, str3);
                    C17795d.m93984d(m120730z, str2, str, i11, str);
                } catch (Throwable th8) {
                    th = th8;
                    str2 = str5;
                    C17795d m120730z42222 = AbstractC23306f.m120730z();
                    AbstractC19074t.m100207e(m120730z42222, str3);
                    C17795d.m93984d(m120730z42222, str2, str, i11, str);
                    throw th;
                }
            } else {
                str5 = "DELETE_CONVERSATION_BY_LAST_MSG";
                str3 = "provideChatPerfLogger(...)";
                messageId = m144522b;
                str6 = m144524d;
            }
            if (bVar.m144523c() && (m2635r = this.f133905b.m2635r(messageId)) != null) {
                this.f133909f.m102640n(m2635r);
            }
            if (!m144517o.m41013q()) {
                if (m144517o.m41015u()) {
                }
                m144512j(str6, arrayList);
                if (c19051f0.f94928p) {
                    C0814e0.m2073s(str6);
                }
                m2603B = this.f133905b.m2603B(str6);
                if (!AbstractC19074t.m100204b(m2603B, m2603B2)) {
                    if (m2603B != null) {
                        C28931k m120612Q1 = AbstractC23306f.m120612Q1();
                        AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
                        AbstractC19378b.m101499c(m120612Q1, new C28931k.b(m144517o, m2603B, C28931k.d.Companion.m144586b()), null, 2, null);
                    } else {
                        m144519q(str6);
                    }
                }
                m120730z = AbstractC23306f.m120730z();
                AbstractC19074t.m100207e(m120730z, str3);
                str2 = str5;
                C17795d.m93984d(m120730z, str2, str, i11, str);
            }
            this.f133910g.m145860a1(str6, messageId);
            m144512j(str6, arrayList);
            if (c19051f0.f94928p) {
            }
            m2603B = this.f133905b.m2603B(str6);
            if (!AbstractC19074t.m100204b(m2603B, m2603B2)) {
            }
            m120730z = AbstractC23306f.m120730z();
            AbstractC19074t.m100207e(m120730z, str3);
            str2 = str5;
            C17795d.m93984d(m120730z, str2, str, i11, str);
        }
    }
}
