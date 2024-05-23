package eg;

import ae.C0757b;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Iterator;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p405ov.C24559a;
import p424pj.C24774a;
import p454qn.AbstractC25384a;
import p461qu.AbstractC25495a;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import wd0.C28929i;
import wd0.C28931k;

/* renamed from: eg.b */
/* loaded from: classes3.dex */
public final class C18425b {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final C18425b f92909b = b.f92911a.m97656a();

    /* renamed from: a */
    private final ArrayList f92910a = new ArrayList();

    /* renamed from: eg.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18425b m97655a() {
            return C18425b.f92909b;
        }
    }

    /* renamed from: eg.b$b */
    /* loaded from: classes3.dex */
    private static final class b {

        /* renamed from: a */
        public static final b f92911a = new b();

        /* renamed from: b */
        private static final InterfaceC24854k f92912b;

        /* renamed from: eg.b$b$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f92913q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C18425b mo12V4() {
                return new C18425b();
            }
        }

        static {
            InterfaceC24854k m129210a;
            m129210a = AbstractC24856m.m129210a(a.f92913q);
            f92912b = m129210a;
        }

        private b() {
        }

        /* renamed from: a */
        public final C18425b m97656a() {
            return (C18425b) f92912b.getValue();
        }
    }

    /* renamed from: eg.b$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Conversation f92914a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f92915b;

        /* renamed from: c */
        final /* synthetic */ C24774a f92916c;

        c(Conversation conversation, C17945a0 c17945a0, C24774a c24774a) {
            this.f92914a = conversation;
            this.f92915b = c17945a0;
            this.f92916c = c24774a;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList m131500h;
            C28931k m120612Q1 = AbstractC23306f.m120612Q1();
            AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
            AbstractC19378b.m101499c(m120612Q1, new C28931k.b(this.f92914a, this.f92915b, C28931k.d.Companion.m144587c()), null, 2, null);
            C19636i1 m102800a = C19636i1.Companion.m102800a();
            m131500h = AbstractC25368s.m131500h(this.f92916c);
            m102800a.m102768Z(m131500h);
            C23744a.Companion.m124119a().m124116d(36, new Object[0]);
        }
    }

    /* renamed from: eg.b$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92917a;

        /* renamed from: b */
        final /* synthetic */ C28929i.a f92918b;

        d(ArrayList arrayList, C28929i.a aVar) {
            this.f92917a = arrayList;
            this.f92918b = aVar;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[UnreadMessage]", "markConversationsAsUnread submit2Server failed error = " + c20096c);
            this.f92918b.mo68406b(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject m131571b = AbstractC25384a.m131571b(String.valueOf(obj));
            if (m131571b == null) {
                return;
            }
            C24559a.m127933c("[UnreadMessage]", "markConversationsAsUnread submit2Server success res = " + m131571b);
            if (m131571b.optInt("error_code") == 0) {
                Iterator it = this.f92917a.iterator();
                while (it.hasNext()) {
                    ((C24774a) it.next()).m128764e(2);
                }
                C19636i1.Companion.m102800a().m102768Z(this.f92917a);
                this.f92918b.mo68405a();
            }
        }
    }

    /* renamed from: eg.b$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f92919a;

        /* renamed from: b */
        final /* synthetic */ C18425b f92920b;

        e(ArrayList arrayList, C18425b c18425b) {
            this.f92919a = arrayList;
            this.f92920b = c18425b;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C24559a.m127933c("[UnreadMessage]", "submitListActionsClearMarkAsUnreadConversations submit2Server failed error = " + c20096c);
            this.f92920b.m97654n(this.f92919a);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject m131571b = AbstractC25384a.m131571b(String.valueOf(obj));
            if (m131571b == null) {
                return;
            }
            C24559a.m127933c("[UnreadMessage]", "submitListActionsClearMarkAsUnreadConversations submit2Server success res = " + m131571b);
            if (m131571b.optInt("error_code") == 0) {
                C19636i1.Companion.m102800a().m102786s(this.f92919a);
            }
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m97638f(C18425b c18425b, ArrayList arrayList, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c18425b.m97649e(arrayList, z11);
    }

    /* renamed from: g */
    private final void m97639g(C24774a c24774a) {
        Conversation conversation = new Conversation(c24774a.m128763d(), null, null, null, 14, null);
        MessageId.C7932a c7932a = MessageId.Companion;
        String m103086b = AbstractC23306f.m120599M0().m103086b();
        String m128763d = c24774a.m128763d();
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C17945a0 m95365a = new C17945a0.w(c7932a.m41064b(m103086b, "", m128763d, str), 0).m95382r(MainApplication.Companion.m35500c().getString(AbstractC8020f0.str_conversation_has_no_message)).m95359K(0L).m95365a();
        AbstractC19074t.m100207e(m95365a, "build(...)");
        m95365a.m94951M9();
        C0824j.m2153b(new c(conversation, m95365a, c24774a));
    }

    /* renamed from: h */
    private final void m97640h() {
        ArrayList arrayList = new ArrayList(this.f92910a);
        this.f92910a.clear();
        m97644q(arrayList);
    }

    /* renamed from: i */
    private final JSONObject m97641i(ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            JSONObject jSONObject2 = new JSONObject();
            if (AbstractC25495a.m132079d(c24774a.m128763d())) {
                jSONObject2.put("id", Long.parseLong(AbstractC25495a.m132088m(c24774a.m128763d())));
                jSONObject2.put("ts", c24774a.m128761b());
                jSONArray.put(jSONObject2);
            } else {
                jSONObject2.put("id", Long.parseLong(c24774a.m128763d()));
                jSONObject2.put("ts", c24774a.m128761b());
                jSONArray2.put(jSONObject2);
            }
        }
        jSONObject.put("convsGroup", jSONArray);
        jSONObject.put("convsUser", jSONArray2);
        return jSONObject;
    }

    /* renamed from: o */
    private final void m97642o() {
        AbstractC17930e.Companion.m94551d().mo94529c("CLEAR_MARK_UNREAD", new Runnable() { // from class: eg.a
            @Override // java.lang.Runnable
            public final void run() {
                C18425b.m97643p(C18425b.this);
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m97643p(C18425b c18425b) {
        AbstractC19074t.m100208f(c18425b, "this$0");
        c18425b.m97645r();
    }

    /* renamed from: q */
    private final void m97644q(ArrayList arrayList) {
        e eVar = new e(arrayList, this);
        JSONObject m97641i = m97641i(arrayList);
        C24559a.m127933c("[UnreadMessage]", "submitListActionsClearMarkAsUnreadConversations data: " + m97641i);
        C0757b c0757b = new C0757b();
        c0757b.m1341j(eVar);
        c0757b.m1348o((byte) 0, m97641i);
    }

    /* renamed from: r */
    private final void m97645r() {
        if (this.f92910a.isEmpty()) {
            return;
        }
        if (!C29628e.m147249E0().m93432x()) {
            if (!C29628e.m147249E0().m93433y()) {
                AbstractC29633j.m147365n();
                m97646s();
            }
            m97646s();
            m97642o();
            return;
        }
        m97640h();
    }

    /* renamed from: s */
    private final void m97646s() {
        try {
            Thread.sleep(2000L);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ClearMarkUnread", e11);
        }
    }

    /* renamed from: c */
    public final void m97647c() {
        C19669z.Companion.m103232a().m103229t0();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C24774a c24774a : C19636i1.Companion.m102800a().m102739A().values()) {
            if (c24774a.m128760a() == 1) {
                arrayList.add(c24774a);
            } else if (c24774a.m128760a() == 2) {
                arrayList2.add(c24774a.m128763d());
            }
        }
        if (System.currentTimeMillis() - AbstractC0924m0.m4098p2() > 604800000) {
            C7959d.Companion.m41850e().m41827t0(arrayList2);
        }
        m97649e(arrayList, false);
    }

    /* renamed from: d */
    public final void m97648d(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listInfo");
        C19636i1.Companion.m102800a().m102786s(arrayList);
    }

    /* renamed from: e */
    public final void m97649e(ArrayList arrayList, boolean z11) {
        AbstractC19074t.m100208f(arrayList, "listInfo");
        if (z11) {
            C19636i1.Companion.m102800a().m102796y0(arrayList);
        }
        m97654n(arrayList);
    }

    /* renamed from: j */
    public final void m97650j() {
        C19636i1.Companion.m102800a().m102767X();
    }

    /* renamed from: k */
    public final void m97651k(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listInfo");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            if (C19669z.Companion.m103232a().m103202S(c24774a.m128763d()) == null) {
                AbstractC19074t.m100205c(c24774a);
                m97639g(c24774a);
            }
        }
        C19636i1.Companion.m102800a().m102768Z(arrayList);
    }

    /* renamed from: l */
    public final void m97652l(ArrayList arrayList, C28929i.a aVar) {
        AbstractC19074t.m100208f(arrayList, "listInfo");
        AbstractC19074t.m100208f(aVar, "callback");
        d dVar = new d(arrayList, aVar);
        JSONObject m97641i = m97641i(arrayList);
        C24559a.m127933c("[UnreadMessage]", "markConversationsAsUnread data: " + m97641i);
        C0757b c0757b = new C0757b();
        c0757b.m1341j(dVar);
        c0757b.m1348o((byte) 1, m97641i);
    }

    /* renamed from: m */
    public final void m97653m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        ArrayList m128765b = C24774a.a.m128765b(C24774a.Companion, jSONObject, 0, 2, null);
        C19636i1.Companion.m102800a().m102783q();
        Iterator it = m128765b.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            if (C19669z.Companion.m103232a().m103202S(c24774a.m128763d()) == null) {
                AbstractC19074t.m100205c(c24774a);
                m97639g(c24774a);
            }
        }
        C19636i1.Companion.m102800a().m102768Z(m128765b);
        C23744a.Companion.m124119a().m124116d(36, new Object[0]);
    }

    /* renamed from: n */
    public final synchronized void m97654n(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "request");
        this.f92910a.addAll(arrayList);
        m97642o();
    }
}
