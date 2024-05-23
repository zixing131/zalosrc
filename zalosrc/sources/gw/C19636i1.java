package gw;

import ag0.AbstractC0837p0;
import ag0.C0810d;
import am.AbstractC0939u;
import bg0.C2797c;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.C11318b;
import dg0.AbstractC17927b;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p019aj.C0872f;
import p056cj.C3556x;
import p161fg.C18922m;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p405ov.C24559a;
import p424pj.C24774a;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import vg.C28023b6;
import ws.C29210k;

/* renamed from: gw.i1 */
/* loaded from: classes4.dex */
public final class C19636i1 {
    public static final b Companion = new b(null);

    /* renamed from: q */
    private static final InterfaceC24854k f97435q;

    /* renamed from: a */
    private final C0872f f97436a;

    /* renamed from: b */
    private final C11318b f97437b;

    /* renamed from: c */
    private final C2797c f97438c;

    /* renamed from: d */
    private final Map f97439d;

    /* renamed from: e */
    private final Map f97440e;

    /* renamed from: f */
    private final Map f97441f;

    /* renamed from: g */
    private final Map f97442g;

    /* renamed from: h */
    private final Map f97443h;

    /* renamed from: i */
    private final Map f97444i;

    /* renamed from: j */
    private final Map f97445j;

    /* renamed from: k */
    private int f97446k;

    /* renamed from: l */
    private int f97447l;

    /* renamed from: m */
    private boolean f97448m;

    /* renamed from: n */
    private final Map f97449n;

    /* renamed from: o */
    private final Map f97450o;

    /* renamed from: p */
    private final AtomicBoolean f97451p;

    /* renamed from: gw.i1$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f97452q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19636i1 mo12V4() {
            return c.f97453a.m102801a();
        }
    }

    /* renamed from: gw.i1$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19636i1 m102800a() {
            return (C19636i1) C19636i1.f97435q.getValue();
        }
    }

    /* renamed from: gw.i1$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f97453a = new c();

        /* renamed from: b */
        private static final C19636i1 f97454b;

        static {
            C0872f m120562A = AbstractC23306f.m120562A();
            AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
            C11318b m120640a = AbstractC23306f.m120640a();
            AbstractC19074t.m100207e(m120640a, "provideActiveChatController(...)");
            f97454b = new C19636i1(m120562A, m120640a);
        }

        private c() {
        }

        /* renamed from: a */
        public final C19636i1 m102801a() {
            return f97454b;
        }
    }

    /* renamed from: gw.i1$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f97455a;

        /* renamed from: b */
        final /* synthetic */ LastDeliveredSeenData f97456b;

        d(String str, LastDeliveredSeenData lastDeliveredSeenData) {
            this.f97455a = str;
            this.f97456b = lastDeliveredSeenData;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41798j3(this.f97455a, this.f97456b);
        }
    }

    /* renamed from: gw.i1$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f97457a;

        /* renamed from: b */
        final /* synthetic */ LastDeliveredSeenData f97458b;

        e(String str, LastDeliveredSeenData lastDeliveredSeenData) {
            this.f97457a = str;
            this.f97458b = lastDeliveredSeenData;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41798j3(this.f97457a, this.f97458b);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f97452q);
        f97435q = m129210a;
    }

    public C19636i1(C0872f c0872f, C11318b c11318b) {
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c11318b, "activeChatController");
        this.f97436a = c0872f;
        this.f97437b = c11318b;
        this.f97438c = new C2797c(AbstractC0837p0.Companion.m2237f());
        this.f97439d = Collections.synchronizedMap(new HashMap());
        this.f97440e = Collections.synchronizedMap(new HashMap());
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f97441f = synchronizedMap;
        Map synchronizedMap2 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f97442g = synchronizedMap2;
        Map synchronizedMap3 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap3, "synchronizedMap(...)");
        this.f97443h = synchronizedMap3;
        Map synchronizedMap4 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap4, "synchronizedMap(...)");
        this.f97444i = synchronizedMap4;
        Map synchronizedMap5 = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap5, "synchronizedMap(...)");
        this.f97445j = synchronizedMap5;
        this.f97449n = Collections.synchronizedMap(new HashMap());
        this.f97450o = Collections.synchronizedMap(new HashMap());
        this.f97451p = new AtomicBoolean(false);
    }

    /* renamed from: D0 */
    public static final void m102707D0(String str, FirstUnreadMsg firstUnreadMsg) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(firstUnreadMsg, "$it");
        C7959d.Companion.m41850e().m41794i3(str, firstUnreadMsg);
    }

    /* renamed from: E0 */
    private final void m102708E0(C24774a c24774a) {
        this.f97438c.mo13474a(new Runnable() { // from class: gw.g1
            public /* synthetic */ RunnableC19630g1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19636i1.m102709F0(C24774a.this);
            }
        });
    }

    /* renamed from: F0 */
    public static final void m102709F0(C24774a c24774a) {
        AbstractC19074t.m100208f(c24774a, "$info");
        C7959d.Companion.m41850e().m41829t3(c24774a);
    }

    /* renamed from: G0 */
    private final int m102710G0(String str, int i11) {
        int m102746E = m102746E(str);
        if (m102746E == i11) {
            return m102746E;
        }
        m102713K0(str, i11);
        this.f97438c.mo13474a(new Runnable() { // from class: gw.c1

            /* renamed from: p */
            public final /* synthetic */ String f97422p;

            /* renamed from: q */
            public final /* synthetic */ int f97423q;

            public /* synthetic */ RunnableC19618c1(String str2, int i112) {
                r1 = str2;
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19636i1.m102711H0(r1, r2);
            }
        });
        return m102746E;
    }

    /* renamed from: H0 */
    public static final void m102711H0(String str, int i11) {
        AbstractC19074t.m100208f(str, "$uid");
        C7959d.Companion.m41850e().m41746R3(str, i11);
        if (i11 == 0) {
            C7860a.Companion.m40303b().m40289k0(str);
        }
    }

    /* renamed from: J0 */
    public static final void m102712J0() {
        C19669z.Companion.m103232a().m103198O0();
    }

    /* renamed from: K0 */
    private final int m102713K0(String str, int i11) {
        int i12 = 0;
        C23744a.Companion.m124119a().m124116d(6028, str, Integer.valueOf(i11));
        Map map = this.f97439d;
        AbstractC19074t.m100207e(map, "unreadCountMap");
        synchronized (map) {
            try {
                if (i11 >= 1) {
                    Integer num = (Integer) this.f97439d.put(str, Integer.valueOf(i11));
                    if (num != null) {
                        i12 = num.intValue();
                    }
                } else {
                    Integer num2 = (Integer) this.f97439d.remove(str);
                    if (num2 != null) {
                        i12 = num2.intValue();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    /* renamed from: M0 */
    private final void m102714M0(String str) {
        this.f97438c.mo13474a(new Runnable() { // from class: gw.z0

            /* renamed from: p */
            public final /* synthetic */ String f97628p;

            public /* synthetic */ RunnableC19670z0(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C19636i1.m102715N0(r1);
            }
        });
    }

    /* renamed from: N0 */
    public static final void m102715N0(String str) {
        AbstractC19074t.m100208f(str, "$uid");
        C7959d.Companion.m41850e().m41777c3(str);
    }

    /* renamed from: Y */
    private final void m102716Y() {
        if (this.f97451p.get()) {
            return;
        }
        Map m42388f6 = C7960e.m41971c6().m42388f6();
        Map map = this.f97449n;
        AbstractC19074t.m100205c(m42388f6);
        map.putAll(m42388f6);
        this.f97451p.set(true);
    }

    /* renamed from: a0 */
    private final void m102718a0(Map map) {
        synchronized (this.f97441f) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    FirstUnreadMsg firstUnreadMsg = (FirstUnreadMsg) entry.getValue();
                    if (C19669z.Companion.m103232a().m103228r0(str)) {
                        this.f97441f.put(str, firstUnreadMsg);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b0 */
    private final void m102720b0(Map map) {
        Map map2 = this.f97440e;
        AbstractC19074t.m100207e(map2, "countUnreadModeMap");
        synchronized (map2) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (C19669z.Companion.m103232a().m103228r0(str)) {
                        Map map3 = this.f97440e;
                        AbstractC19074t.m100207e(map3, "countUnreadModeMap");
                        map3.put(str, Integer.valueOf(intValue));
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c0 */
    private final void m102722c0(Map map) {
        Map map2 = this.f97439d;
        AbstractC19074t.m100207e(map2, "unreadCountMap");
        synchronized (map2) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (C19669z.Companion.m103232a().m103228r0(str)) {
                        m102713K0(str, intValue);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d0 */
    private final void m102724d0(Map map) {
        synchronized (this.f97443h) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    C17945a0 c17945a0 = (C17945a0) entry.getValue();
                    if (C19669z.Companion.m103232a().m103228r0(str)) {
                        this.f97443h.put(str, c17945a0);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e0 */
    private final void m102726e0(Map map) {
        synchronized (this.f97444i) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    C28266a c28266a = (C28266a) entry.getValue();
                    if (C19669z.Companion.m103232a().m103228r0(str)) {
                        this.f97444i.put(str, c28266a);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i0 */
    public static final void m102731i0() {
        C18922m.m99141t().m99144N();
        C28023b6.m141262r2();
    }

    /* renamed from: k */
    private final void m102733k(String str, long j11) {
        C17945a0 m102749H;
        if (!AbstractC19646n0.m103050z1(j11) || (m102749H = m102749H(str)) == null) {
            return;
        }
        MessageId m95029V3 = m102749H.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        if (AbstractC19646n0.m103050z1(m95029V3.m41047k()) && j11 >= m95029V3.m41047k()) {
            m102780o0(str);
        }
    }

    /* renamed from: k0 */
    public static final void m102734k0(String str, FirstUnreadMsg firstUnreadMsg) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(firstUnreadMsg, "$it");
        C7959d.Companion.m41850e().m41794i3(str, null);
        C24559a.m127933c("UnreadManager", "removeFirstUnreadMsg in DB msgId: " + firstUnreadMsg.m41022a());
    }

    /* renamed from: q0 */
    public static final void m102735q0(String str) {
        AbstractC19074t.m100208f(str, "$uid");
        C7959d.Companion.m41850e().m41777c3(str);
    }

    /* renamed from: t0 */
    public static final void m102736t0(String str) {
        AbstractC19074t.m100208f(str, "$uid");
        C7959d.Companion.m41850e().m41811n3(str, 1);
    }

    /* renamed from: w */
    public static final C19636i1 m102737w() {
        return Companion.m102800a();
    }

    /* renamed from: y */
    private final long m102738y(String str) {
        m102716Y();
        Long l11 = (Long) this.f97449n.get(str);
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    /* renamed from: A */
    public final Map m102739A() {
        return this.f97445j;
    }

    /* renamed from: A0 */
    public final void m102740A0(int i11) {
        this.f97447l = i11;
    }

    /* renamed from: B */
    public final int m102741B() {
        return this.f97446k;
    }

    /* renamed from: B0 */
    public final void m102742B0(C3556x c3556x) {
        AbstractC19074t.m100208f(c3556x, "tabMsgDataHolder");
        m102722c0(c3556x.m18072e());
        m102720b0(c3556x.m18071d());
        m102718a0(c3556x.m18070c());
        m102726e0(c3556x.m18074g());
        m102724d0(c3556x.m18073f());
    }

    /* renamed from: C */
    public final List m102743C(int i11) {
        List<String> m102789u = m102789u();
        ArrayList arrayList = new ArrayList();
        for (String str : m102789u) {
            if (i11 == 1 && !AbstractC25495a.m132079d(str)) {
                arrayList.add(str);
            } else if (i11 == 2 && AbstractC25495a.m132079d(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: C0 */
    public final void m102744C0(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        long m41047k = c17945a0.m95029V3().m41047k();
        long mo95213o = c17945a0.mo95213o();
        if (m41047k != 0 && m41047k != -1 && mo95213o != 0 && mo95213o != -1) {
            FirstUnreadMsg firstUnreadMsg = new FirstUnreadMsg(m41047k, mo95213o);
            this.f97441f.put(str, firstUnreadMsg);
            this.f97438c.mo13474a(new Runnable() { // from class: gw.b1

                /* renamed from: p */
                public final /* synthetic */ String f97410p;

                /* renamed from: q */
                public final /* synthetic */ FirstUnreadMsg f97411q;

                public /* synthetic */ RunnableC19615b1(String str2, FirstUnreadMsg firstUnreadMsg2) {
                    r1 = str2;
                    r2 = firstUnreadMsg2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19636i1.m102707D0(r1, r2);
                }
            });
        }
    }

    /* renamed from: D */
    public final int m102745D() {
        return this.f97447l;
    }

    /* renamed from: E */
    public final int m102746E(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Integer num = (Integer) this.f97439d.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: F */
    public final int m102747F(String str) {
        AbstractC19074t.m100208f(str, "uid");
        int m102746E = m102746E(str);
        if (m102746E == 0 && m102765V(str)) {
            return -1;
        }
        return m102746E;
    }

    /* renamed from: G */
    public final C17945a0 m102748G(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C17945a0) this.f97442g.get(str);
    }

    /* renamed from: H */
    public final C17945a0 m102749H(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C17945a0) this.f97443h.get(str);
    }

    /* renamed from: I */
    public final List m102750I() {
        int m131511r;
        List m103206U = C19669z.Companion.m103232a().m103206U(3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m103206U) {
            if (m102761R(((Conversation) obj).f42893q)) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Conversation) it.next()).f42893q);
        }
        return arrayList2;
    }

    /* renamed from: I0 */
    public final void m102751I0(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        m102710G0(str, i11);
        C18922m.m99141t().m99154X(str, i11);
        AbstractC17927b.Companion.m94536b().mo94529c("UPDATE_UNREAD_COUNT_UI" + str, new Runnable() { // from class: gw.e1
            @Override // java.lang.Runnable
            public final void run() {
                C19636i1.m102712J0();
            }
        }, 500L);
    }

    /* renamed from: J */
    public final C28266a m102752J(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C28266a) this.f97444i.get(str);
    }

    /* renamed from: K */
    public final List m102753K() {
        int m131511r;
        List m103206U = C19669z.Companion.m103232a().m103206U(2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : m103206U) {
            if (m102764U(((Conversation) obj).f42893q)) {
                arrayList.add(obj);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Conversation) it.next()).f42893q);
        }
        return arrayList2;
    }

    /* renamed from: L */
    public final boolean m102754L(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        LastDeliveredSeenData m102794x = m102794x(mo95039W2);
        if (m102794x != null && m102794x.m41028a() >= c17945a0.mo95213o()) {
            return true;
        }
        return false;
    }

    /* renamed from: L0 */
    public final void m102755L0(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "mentionMsg");
        C17945a0 c17945a02 = (C17945a0) this.f97443h.get(str);
        if (c17945a02 == null || c17945a02.mo95213o() > c17945a0.mo95213o()) {
            this.f97443h.put(str, c17945a0);
            m102714M0(str);
        }
    }

    /* renamed from: M */
    public final boolean m102756M(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return this.f97441f.containsKey(str);
    }

    /* renamed from: N */
    public final boolean m102757N(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        boolean m60515j = this.f97437b.m60515j(str);
        if (!this.f97436a.m2525T()) {
            return m60515j;
        }
        FirstUnreadMsg m102791v = m102791v(str);
        if (m102791v == null || c17945a0.mo95213o() >= m102791v.m41023b()) {
            return false;
        }
        return m60515j;
    }

    /* renamed from: O */
    public final boolean m102758O(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(messageId, "msgId");
        if (!messageId.m41053q()) {
            return false;
        }
        long m102738y = m102738y(str);
        if (!AbstractC19646n0.m103050z1(m102738y) || m102738y < messageId.m41047k()) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    public final boolean m102759P(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        LastDeliveredSeenData m102794x = m102794x(mo95039W2);
        if (m102794x != null && m102794x.m41029b() >= c17945a0.mo95213o()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final boolean m102760Q(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        if (!m102758O(str, m95029V3) && !m102757N(str, c17945a0)) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public final boolean m102761R(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (m102746E(str) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean m102762S(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!m102761R(str) && !m102765V(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public final int m102763T(String str, int i11) {
        int m102746E;
        AbstractC19074t.m100208f(str, "uid");
        Map map = this.f97439d;
        AbstractC19074t.m100207e(map, "unreadCountMap");
        synchronized (map) {
            m102746E = m102746E(str) + i11;
            m102713K0(str, m102746E);
            C18922m.m99141t().m99154X(str, m102746E);
        }
        return m102746E;
    }

    /* renamed from: U */
    public final boolean m102764U(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!m102762S(str) && !m102766W(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public final boolean m102765V(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Integer num = (Integer) this.f97440e.get(str);
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m102766W(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C24774a m102797z = m102797z(str);
        if (m102797z != null && m102797z.m128762c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final void m102767X() {
        for (C24774a c24774a : C7959d.Companion.m41850e().m41726M0()) {
            this.f97445j.put(c24774a.m128763d(), c24774a);
        }
    }

    /* renamed from: Z */
    public final void m102768Z(List list) {
        long j11;
        AbstractC19074t.m100208f(list, "infoList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            C24774a c24774a2 = (C24774a) this.f97445j.get(c24774a.m128763d());
            long m128761b = c24774a.m128761b();
            if (c24774a2 != null) {
                j11 = c24774a2.m128761b();
            } else {
                j11 = 0;
            }
            if (m128761b >= j11) {
                this.f97445j.put(c24774a.m128763d(), c24774a);
                m102708E0(c24774a);
            }
        }
    }

    /* renamed from: f0 */
    public final void m102769f0(String str, LastDeliveredSeenData lastDeliveredSeenData) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(lastDeliveredSeenData, "lastDeliveredSeenData");
        Map map = this.f97450o;
        AbstractC19074t.m100207e(map, "lastDeliveredSeenMap");
        map.put(str, lastDeliveredSeenData);
    }

    /* renamed from: g0 */
    public final void m102770g0(String str, C28266a c28266a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c28266a, "lastUnreadReactionInfo");
        this.f97444i.put(str, c28266a);
    }

    /* renamed from: h0 */
    public final void m102771h0() {
        this.f97438c.mo13474a(new Runnable() { // from class: gw.h1
            @Override // java.lang.Runnable
            public final void run() {
                C19636i1.m102731i0();
            }
        });
    }

    /* renamed from: j0 */
    public final FirstUnreadMsg m102772j0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        FirstUnreadMsg m102774l0 = m102774l0(str);
        if (m102774l0 != null) {
            this.f97438c.mo13474a(new Runnable() { // from class: gw.d1

                /* renamed from: p */
                public final /* synthetic */ String f97425p;

                /* renamed from: q */
                public final /* synthetic */ FirstUnreadMsg f97426q;

                public /* synthetic */ RunnableC19621d1(String str2, FirstUnreadMsg m102774l02) {
                    r1 = str2;
                    r2 = m102774l02;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19636i1.m102734k0(r1, r2);
                }
            });
            return m102774l02;
        }
        return null;
    }

    /* renamed from: l */
    public final void m102773l(String str, long j11) {
        MessageId m41065d;
        AbstractC19074t.m100208f(str, "uid");
        long m102738y = m102738y(str);
        if (!AbstractC19646n0.m103050z1(m102738y) || j11 > m102738y) {
            Map map = this.f97449n;
            AbstractC19074t.m100207e(map, "lastPCSeenMsgMap");
            map.put(str, Long.valueOf(j11));
            if (AbstractC25495a.m132079d(str)) {
                C29210k.b bVar = C29210k.Companion;
                if (bVar.m145896a().m145859a0() && (m41065d = MessageId.Companion.m41065d(0L, j11, str, "")) != null) {
                    bVar.m145896a().m145866e1(str, m41065d);
                }
            }
            C7960e.m41971c6().m42475n8(str, j11);
        }
        m102733k(str, j11);
    }

    /* renamed from: l0 */
    public final FirstUnreadMsg m102774l0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (FirstUnreadMsg) this.f97441f.remove(str);
    }

    /* renamed from: m */
    public final FirstUnreadMsg m102775m(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        long m41047k = c17945a0.m95029V3().m41047k();
        long mo95213o = c17945a0.mo95213o();
        synchronized (this.f97441f) {
            FirstUnreadMsg firstUnreadMsg = (FirstUnreadMsg) this.f97441f.get(str);
            if (firstUnreadMsg != null) {
                long m41022a = firstUnreadMsg.m41022a();
                long m41023b = firstUnreadMsg.m41023b();
                if (mo95213o <= m41023b && (mo95213o != m41023b || m41047k <= m41022a)) {
                    if (this.f97437b.m60515j(str)) {
                        return firstUnreadMsg;
                    }
                }
                return firstUnreadMsg;
            }
            FirstUnreadMsg firstUnreadMsg2 = new FirstUnreadMsg(m41047k, mo95213o);
            this.f97441f.put(str, firstUnreadMsg2);
            return firstUnreadMsg2;
        }
    }

    /* renamed from: m0 */
    public final LastDeliveredSeenData m102776m0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (LastDeliveredSeenData) this.f97450o.remove(str);
    }

    /* renamed from: n */
    public final boolean m102777n(String str, long j11) {
        long j12;
        AbstractC19074t.m100208f(str, "uid");
        LastDeliveredSeenData m102794x = m102794x(str);
        if (m102794x != null && j11 < m102794x.m41028a()) {
            return false;
        }
        if (m102794x != null) {
            j12 = m102794x.m41029b();
        } else {
            j12 = 0;
        }
        LastDeliveredSeenData lastDeliveredSeenData = new LastDeliveredSeenData(j11, j12);
        Map map = this.f97450o;
        AbstractC19074t.m100207e(map, "lastDeliveredSeenMap");
        map.put(str, lastDeliveredSeenData);
        C0810d.m2053b(new d(str, lastDeliveredSeenData));
        return true;
    }

    /* renamed from: n0 */
    public final C17945a0 m102778n0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C17945a0) this.f97442g.remove(str);
    }

    /* renamed from: o */
    public final boolean m102779o(String str, long j11) {
        long j12;
        AbstractC19074t.m100208f(str, "uid");
        LastDeliveredSeenData m102794x = m102794x(str);
        if (m102794x != null && j11 < m102794x.m41029b()) {
            return false;
        }
        if (m102794x != null) {
            j12 = m102794x.m41028a();
        } else {
            j12 = 0;
        }
        LastDeliveredSeenData lastDeliveredSeenData = new LastDeliveredSeenData(j12, j11);
        Map map = this.f97450o;
        AbstractC19074t.m100207e(map, "lastDeliveredSeenMap");
        map.put(str, lastDeliveredSeenData);
        C0810d.m2053b(new e(str, lastDeliveredSeenData));
        return true;
    }

    /* renamed from: o0 */
    public final C17945a0 m102780o0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C17945a0 c17945a0 = (C17945a0) this.f97443h.remove(str);
        if (c17945a0 != null) {
            m102714M0(str);
            return c17945a0;
        }
        return null;
    }

    /* renamed from: p */
    public final void m102781p(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        long m41047k = c17945a0.m95029V3().m41047k();
        long mo95213o = c17945a0.mo95213o();
        synchronized (this.f97442g) {
            C17945a0 c17945a02 = (C17945a0) this.f97442g.get(str);
            if (c17945a02 != null) {
                long m41047k2 = c17945a02.m95029V3().m41047k();
                long mo95213o2 = c17945a02.mo95213o();
                if (mo95213o > mo95213o2 || (mo95213o == mo95213o2 && m41047k > m41047k2)) {
                    return;
                }
            }
            this.f97442g.put(str, c17945a0);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: p0 */
    public final C28266a m102782p0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C28266a m102785r0 = m102785r0(str);
        if (m102785r0 != null) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: gw.f1

                /* renamed from: p */
                public final /* synthetic */ String f97427p;

                public /* synthetic */ RunnableC19627f1(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19636i1.m102735q0(r1);
                }
            });
            return m102785r0;
        }
        return null;
    }

    /* renamed from: q */
    public final void m102783q() {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(this.f97445j.values());
        m102786s(m131185M0);
    }

    /* renamed from: r */
    public final void m102784r() {
        C24559a.m127933c("UnreadManager", "clearAllMemCache()");
        this.f97439d.clear();
        this.f97440e.clear();
        this.f97441f.clear();
        this.f97442g.clear();
        this.f97443h.clear();
        this.f97444i.clear();
        this.f97446k = 0;
        this.f97447l = 0;
        this.f97449n.clear();
        this.f97450o.clear();
        this.f97451p.set(false);
    }

    /* renamed from: r0 */
    public final C28266a m102785r0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C28266a) this.f97444i.remove(str);
    }

    /* renamed from: s */
    public final void m102786s(List list) {
        long j11;
        AbstractC19074t.m100208f(list, "infoList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            C24774a c24774a2 = (C24774a) this.f97445j.get(c24774a.m128763d());
            long m128761b = c24774a.m128761b();
            if (c24774a2 != null) {
                j11 = c24774a2.m128761b();
            } else {
                j11 = 0;
            }
            if (m128761b >= j11) {
                c24774a.m128764e(2);
                this.f97445j.put(c24774a.m128763d(), c24774a);
                m102708E0(c24774a);
            }
        }
    }

    /* renamed from: s0 */
    public final boolean m102787s0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Integer num = (Integer) this.f97440e.get(str);
        if (num != null && num.intValue() != 1) {
            m102793w0(str, 1);
            this.f97438c.mo13474a(new Runnable() { // from class: gw.a1

                /* renamed from: p */
                public final /* synthetic */ String f97407p;

                public /* synthetic */ RunnableC19612a1(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19636i1.m102736t0(r1);
                }
            });
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final int m102788t(String str) {
        AbstractC19074t.m100208f(str, "uid");
        Map map = this.f97439d;
        AbstractC19074t.m100207e(map, "unreadCountMap");
        synchronized (map) {
            int m102746E = m102746E(str);
            if (m102746E > 0) {
                int i11 = m102746E - 1;
                m102751I0(str, i11);
                return i11;
            }
            return 0;
        }
    }

    /* renamed from: u */
    public final List m102789u() {
        List m131185M0;
        m131185M0 = AbstractC25332a0.m131185M0(this.f97439d.keySet());
        return m131185M0;
    }

    /* renamed from: u0 */
    public final int m102790u0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return m102710G0(str, 0);
    }

    /* renamed from: v */
    public final FirstUnreadMsg m102791v(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (FirstUnreadMsg) this.f97441f.get(str);
    }

    /* renamed from: v0 */
    public final int m102792v0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return m102713K0(str, 0);
    }

    /* renamed from: w0 */
    public final void m102793w0(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        Map map = this.f97440e;
        AbstractC19074t.m100207e(map, "countUnreadModeMap");
        map.put(str, Integer.valueOf(i11));
    }

    /* renamed from: x */
    public final LastDeliveredSeenData m102794x(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (LastDeliveredSeenData) this.f97450o.get(str);
    }

    /* renamed from: x0 */
    public final void m102795x0(boolean z11) {
        this.f97448m = z11;
    }

    /* renamed from: y0 */
    public final void m102796y0(List list) {
        AbstractC19074t.m100208f(list, "infoList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24774a c24774a = (C24774a) it.next();
            c24774a.m128764e(1);
            this.f97445j.put(c24774a.m128763d(), c24774a);
            m102708E0(c24774a);
        }
    }

    /* renamed from: z */
    public final C24774a m102797z(String str) {
        AbstractC19074t.m100208f(str, "uid");
        return (C24774a) this.f97445j.get(str);
    }

    /* renamed from: z0 */
    public final void m102798z0(int i11) {
        this.f97446k = i11;
    }
}
