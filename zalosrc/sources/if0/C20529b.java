package if0;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import dj.C17964g1;
import dj.C17969i0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import p363nh.C23744a;
import p716zh.C31967j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import vg.C28212v6;

/* renamed from: if0.b */
/* loaded from: classes5.dex */
public final class C20529b {

    /* renamed from: a */
    public static final C20529b f100835a = new C20529b();

    /* renamed from: b */
    private static int f100836b;

    /* renamed from: c */
    private static int f100837c;

    /* renamed from: d */
    private static long f100838d;

    /* renamed from: e */
    private static int f100839e;

    /* renamed from: f */
    private static final InterfaceC24854k f100840f;

    /* renamed from: g */
    private static final InterfaceC24854k f100841g;

    /* renamed from: h */
    private static final Runnable f100842h;

    /* renamed from: i */
    private static final InterfaceC24854k f100843i;

    /* renamed from: if0.b$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f100844q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            List m131505m;
            m131505m = AbstractC25368s.m131505m(2, 4, 8);
            return m131505m;
        }
    }

    /* renamed from: if0.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f100845q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            int m131511r;
            int m131400e;
            int m116580c;
            Map m131417v;
            List m106650g = C20529b.f100835a.m106650g();
            m131511r = AbstractC25370t.m131511r(m106650g, 10);
            m131400e = AbstractC25361o0.m131400e(m131511r);
            m116580c = AbstractC22543l.m116580c(m131400e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
            for (Object obj : m106650g) {
                ((Number) obj).intValue();
                linkedHashMap.put(obj, new LinkedHashSet());
            }
            m131417v = AbstractC25363p0.m131417v(linkedHashMap);
            return m131417v;
        }
    }

    /* renamed from: if0.b$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f100846q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    static {
        int i11;
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        C20534g c20534g = C20534g.f100864a;
        if (c20534g.m106694h() && c20534g.m106691e()) {
            i11 = AbstractC0924m0.m4103p7();
        } else {
            i11 = 14;
        }
        f100837c = i11;
        f100838d = -1L;
        f100839e = -1;
        m129210a = AbstractC24856m.m129210a(a.f100844q);
        f100840f = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f100845q);
        f100841g = m129210a2;
        f100842h = new Runnable() { // from class: if0.a
            @Override // java.lang.Runnable
            public final void run() {
                C20529b.m106649f();
            }
        };
        m129210a3 = AbstractC24856m.m129210a(c.f100846q);
        f100843i = m129210a3;
    }

    private C20529b() {
    }

    /* renamed from: A */
    private final void m106643A(int i11) {
        int i12 = i11 | f100837c;
        f100837c = i12;
        AbstractC0924m0.m3972kq(i12);
    }

    /* renamed from: c */
    private final boolean m106646c(C17945a0 c17945a0) {
        C17964g1 c17964g1;
        if (c17945a0.m95316z8()) {
            C20534g c20534g = C20534g.f100864a;
            if ((c20534g.m106695i() || !c17945a0.m95170j6()) && c17945a0.m95107d3() != 2 && c17945a0.m95107d3() != 4 && !c17945a0.m95022U7()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                String str = null;
                if (m94929K2 instanceof C17964g1) {
                    c17964g1 = (C17964g1) m94929K2;
                } else {
                    c17964g1 = null;
                }
                if (c17964g1 != null) {
                    str = c17964g1.m95538p();
                }
                if (str == null || str.length() == 0) {
                    if (c17945a0.m95170j6()) {
                        String m94983Q3 = c17945a0.m94983Q3();
                        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                        return c20534g.m106696j(m94983Q3);
                    }
                    return c20534g.m106697k(c20534g.m106692f(c17945a0, false));
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m106647d(int i11, long j11) {
        f100836b = i11;
        if (j11 > 0) {
            Runnable runnable = f100842h;
            AbstractC19444a.m101696d(runnable);
            AbstractC19444a.m101694b(runnable, j11);
            return;
        }
        f100842h.run();
    }

    /* renamed from: e */
    static /* synthetic */ void m106648e(C20529b c20529b, int i11, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = 500;
        }
        c20529b.m106647d(i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m106649f() {
        Collection collection;
        int i11 = f100836b;
        C20529b c20529b = f100835a;
        if (c20529b.m106659y(i11) && (collection = (Collection) c20529b.m106651h().get(Integer.valueOf(i11))) != null && !collection.isEmpty() && !C31967j.m153687a().m153688b()) {
            C23744a.Companion.m124119a().m124116d(78, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final List m106650g() {
        return (List) f100840f.getValue();
    }

    /* renamed from: h */
    private final Map m106651h() {
        return (Map) f100841g.getValue();
    }

    /* renamed from: i */
    private final int m106652i() {
        int i11 = f100839e;
        if (i11 == -1) {
            int m4133q7 = AbstractC0924m0.m4133q7();
            f100839e = m4133q7;
            return m4133q7;
        }
        return i11;
    }

    /* renamed from: j */
    private final long m106653j() {
        long j11 = f100838d;
        if (j11 == -1) {
            long m4073o7 = AbstractC0924m0.m4073o7();
            f100838d = m4073o7;
            return m4073o7;
        }
        return j11;
    }

    /* renamed from: k */
    private final HashMap m106654k() {
        return (HashMap) f100843i.getValue();
    }

    /* renamed from: n */
    private final boolean m106655n() {
        if (m106658q() < m106653j() + 259200000) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final boolean m106656o(int i11) {
        return (f100837c & i11) == i11;
    }

    /* renamed from: p */
    private final boolean m106657p() {
        if (m106652i() >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private final long m106658q() {
        return System.currentTimeMillis();
    }

    /* renamed from: y */
    private final boolean m106659y(int i11) {
        if (!m106656o(i11) && !m106657p() && !m106655n()) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private final void m106660z(long j11) {
        f100838d = j11;
        AbstractC0924m0.m3942jq(m106653j());
    }

    /* renamed from: l */
    public final C28212v6 m106661l() {
        int i11;
        int i12 = f100836b;
        if (i12 != 2) {
            if (i12 != 4) {
                i11 = AbstractC8020f0.str_voice_to_text_tooltip_title_3;
            } else {
                i11 = AbstractC8020f0.str_voice_to_text_tooltip_title_2;
            }
        } else {
            i11 = AbstractC8020f0.str_voice_to_text_tooltip_title_1;
        }
        C28212v6 c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(i11));
        c28212v6.f131577c = "tip.csc.voice.to.text";
        c28212v6.f131590p = 3;
        c28212v6.f131582h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_tooltip_des);
        return c28212v6;
    }

    /* renamed from: m */
    public final boolean m106662m(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        LinkedHashSet linkedHashSet = (LinkedHashSet) m106651h().get(Integer.valueOf(f100836b));
        if (linkedHashSet != null) {
            return linkedHashSet.contains(c17945a0.m95029V3());
        }
        return false;
    }

    /* renamed from: r */
    public final void m106663r() {
        AbstractC19444a.m101696d(f100842h);
    }

    /* renamed from: s */
    public final void m106664s() {
        if (m106657p()) {
            return;
        }
        f100839e = m106652i() + 1;
        AbstractC0924m0.m4002lq(m106652i());
    }

    /* renamed from: t */
    public final void m106665t(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (!m106656o(2) && m106646c(c17945a0)) {
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            m106654k().put(m95029V3, Boolean.valueOf(m106654k().containsKey(m95029V3)));
        }
    }

    /* renamed from: u */
    public final void m106666u(MessageId messageId) {
        if (messageId != null && m106659y(2) && AbstractC19074t.m100204b(m106654k().get(messageId), Boolean.TRUE)) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) m106651h().get(2);
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) m106651h().get(2);
            if (linkedHashSet2 != null) {
                linkedHashSet2.add(messageId);
            }
            m106648e(this, 2, 0L, 2, null);
        }
    }

    /* renamed from: v */
    public final void m106667v(C17945a0 c17945a0, boolean z11) {
        C17964g1 c17964g1;
        AbstractC19074t.m100208f(c17945a0, "message");
        if (m106659y(4) && !c17945a0.m95032V6() && m106646c(c17945a0)) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17964g1) {
                c17964g1 = (C17964g1) m94929K2;
            } else {
                c17964g1 = null;
            }
            if (c17964g1 != null && c17964g1.m95530g() > C20534g.f100864a.m106688b()) {
                LinkedHashSet linkedHashSet = (LinkedHashSet) m106651h().get(4);
                if (linkedHashSet != null) {
                    linkedHashSet.add(c17945a0.m95029V3());
                }
                if (!z11) {
                    m106648e(this, 4, 0L, 2, null);
                }
            }
        }
    }

    /* renamed from: w */
    public final void m106668w(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (m106659y(8) && m106646c(c17945a0)) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) m106651h().get(8);
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) m106651h().get(8);
            if (linkedHashSet2 != null) {
                linkedHashSet2.add(c17945a0.m95029V3());
            }
            m106648e(this, 8, 0L, 2, null);
        }
    }

    /* renamed from: x */
    public final void m106669x(String str) {
        AbstractC19074t.m100208f(str, "chatType");
        m106643A(f100836b);
        m106660z(m106658q());
        int i11 = f100836b;
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 == 8) {
                    C20534g.f100864a.m106701p(str, 3);
                }
            } else {
                C20534g.f100864a.m106701p(str, 2);
            }
        } else {
            m106654k().clear();
            C20534g.f100864a.m106701p(str, 1);
        }
        LinkedHashSet linkedHashSet = (LinkedHashSet) m106651h().get(Integer.valueOf(f100836b));
        if (linkedHashSet != null) {
            linkedHashSet.clear();
        }
        f100836b = 0;
    }
}
