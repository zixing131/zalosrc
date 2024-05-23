package yd0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import bg0.C2797c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import p185gc.AbstractC19378b;
import p348mi.AbstractC23306f;
import p623ww.C29252b;
import p623ww.C29253c;
import p623ww.C29255e;
import p716zh.C31986k3;
import pm0.C24848g0;
import qe0.AbstractC25251g;
import qm0.AbstractC25332a0;
import th.C26680a;
import xd0.C29593i;
import yd0.C30912e;
import yd0.C30913f;

/* renamed from: yd0.e */
/* loaded from: classes4.dex */
public final class C30912e extends AbstractC19378b {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final Map f142549b;

    /* renamed from: c */
    private static final C2797c f142550c;

    /* renamed from: a */
    private final C29593i f142551a;

    /* renamed from: yd0.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private String[] f142552a;

        /* renamed from: b */
        private volatile c f142553b;

        /* renamed from: c */
        private volatile long f142554c;

        public a(String[] strArr, c cVar, long j11) {
            AbstractC19074t.m100208f(cVar, "messageStatus");
            this.f142552a = strArr;
            this.f142553b = cVar;
            this.f142554c = j11;
        }

        /* renamed from: a */
        public final c m150184a() {
            return this.f142553b;
        }

        /* renamed from: b */
        public final String[] m150185b() {
            return this.f142552a;
        }

        /* renamed from: c */
        public final long m150186c() {
            return this.f142554c;
        }

        /* renamed from: d */
        public final void m150187d(c cVar) {
            AbstractC19074t.m100208f(cVar, "<set-?>");
            this.f142553b = cVar;
        }

        /* renamed from: e */
        public final void m150188e(String[] strArr) {
            this.f142552a = strArr;
        }

        /* renamed from: f */
        public final void m150189f(long j11) {
            this.f142554c = j11;
        }
    }

    /* renamed from: yd0.e$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yd0.e$c */
    /* loaded from: classes4.dex */
    public interface c {

        /* renamed from: yd0.e$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements c {

            /* renamed from: a */
            public static final a f142555a = new a();

            private a() {
            }
        }

        /* renamed from: yd0.e$c$b */
        /* loaded from: classes4.dex */
        public static final class b implements c {

            /* renamed from: a */
            public static final b f142556a = new b();

            private b() {
            }
        }

        /* renamed from: yd0.e$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33052c implements c {

            /* renamed from: a */
            public static final C33052c f142557a = new C33052c();

            private C33052c() {
            }
        }

        /* renamed from: yd0.e$c$d */
        /* loaded from: classes4.dex */
        public static final class d implements c {

            /* renamed from: a */
            public static final d f142558a = new d();

            private d() {
            }
        }
    }

    /* renamed from: yd0.e$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private final String f142559a;

        /* renamed from: b */
        private final C17945a0 f142560b;

        /* renamed from: c */
        private final String f142561c;

        /* renamed from: d */
        private final c f142562d;

        public d(String str, C17945a0 c17945a0, String str2, c cVar) {
            AbstractC19074t.m100208f(str, "threadId");
            AbstractC19074t.m100208f(c17945a0, "msgSent");
            AbstractC19074t.m100208f(str2, "sentEntryPoint");
            AbstractC19074t.m100208f(cVar, "messageStatus");
            this.f142559a = str;
            this.f142560b = c17945a0;
            this.f142561c = str2;
            this.f142562d = cVar;
        }

        /* renamed from: a */
        public final c m150190a() {
            return this.f142562d;
        }

        /* renamed from: b */
        public final C17945a0 m150191b() {
            return this.f142560b;
        }

        /* renamed from: c */
        public final String m150192c() {
            return this.f142561c;
        }

        /* renamed from: d */
        public final String m150193d() {
            return this.f142559a;
        }
    }

    /* renamed from: yd0.e$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f142563a;

        public e(InterfaceC18509p interfaceC18509p) {
            this.f142563a = interfaceC18509p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            this.f142563a.mo240pC(obj, null);
        }
    }

    /* renamed from: yd0.e$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18509p f142564a;

        public f(InterfaceC18509p interfaceC18509p) {
            this.f142564a = interfaceC18509p;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            this.f142564a.mo240pC(null, c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: yd0.e$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ int f142565q;

        /* renamed from: r */
        final /* synthetic */ C30912e f142566r;

        /* renamed from: s */
        final /* synthetic */ d f142567s;

        /* renamed from: t */
        final /* synthetic */ String[] f142568t;

        /* renamed from: u */
        final /* synthetic */ long f142569u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, C30912e c30912e, d dVar, String[] strArr, long j11) {
            super(2);
            this.f142565q = i11;
            this.f142566r = c30912e;
            this.f142567s = dVar;
            this.f142568t = strArr;
            this.f142569u = j11;
        }

        /* renamed from: a */
        public final void m150194a(Object obj, C20096c c20096c) {
            int i11;
            if ((obj == null || (c20096c != null && c20096c.m104491c() == 50001)) && (i11 = this.f142565q) < 0) {
                this.f142566r.m150178r(this.f142567s, this.f142568t, this.f142569u, i11 + 1);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m150194a(obj, (C20096c) obj2);
            return C24848g0.f119245a;
        }
    }

    static {
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        f142549b = synchronizedMap;
        f142550c = new C2797c(AbstractC0837p0.Companion.m2237f());
    }

    public C30912e(C29593i c29593i) {
        AbstractC19074t.m100208f(c29593i, "insertMessage");
        this.f142551a = c29593i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:            if (r3 != null) goto L13;     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m150169i(final d dVar) {
        String[] strArr;
        Object m131206f0;
        Map map = f142549b;
        if (!map.containsKey(dVar.m150191b().m95029V3())) {
            MessageId m95029V3 = dVar.m150191b().m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            a aVar = new a(null, dVar.m150190a(), 0L);
            C29253c m146094g = C29255e.f135512a.m146094g();
            if (m146094g != null) {
                String m95019U3 = dVar.m150191b().m95019U3();
                AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                List m146055i = m146094g.m146055i(m95019U3);
                if (m146055i != null) {
                    m131206f0 = AbstractC25332a0.m131206f0(m146055i);
                    C29253c.j jVar = (C29253c.j) m131206f0;
                    if (jVar != null) {
                        strArr = jVar.m146079a();
                    }
                }
            }
            strArr = new String[0];
            aVar.m150188e(strArr);
            aVar.m150189f(System.currentTimeMillis());
            AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: yd0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C30912e.m150170j(C30912e.this, dVar);
                }
            }, 5000L);
            map.put(m95029V3, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m150170j(C30912e c30912e, d dVar) {
        AbstractC19074t.m100208f(c30912e, "this$0");
        AbstractC19074t.m100208f(dVar, "$params");
        AbstractC19378b.m101499c(new C30912e(c30912e.f142551a), new d(dVar.m150193d(), dVar.m150191b(), dVar.m150192c(), c.d.f142558a), null, 2, null);
    }

    /* renamed from: k */
    private final void m150171k(d dVar) {
        Map map = f142549b;
        a aVar = (a) map.get(dVar.m150191b().m95029V3());
        if (aVar == null) {
            return;
        }
        map.remove(dVar.m150191b().m95029V3());
        if (!AbstractC19074t.m100204b(aVar.m150184a(), c.d.f142558a)) {
            if (aVar.m150186c() == 0 || System.currentTimeMillis() - aVar.m150186c() <= 5000) {
                String[] m150185b = aVar.m150185b();
                if (m150185b == null || m150185b.length < 4) {
                    m150185b = null;
                }
                if (m150185b != null && AbstractC19074t.m100204b(dVar.m150190a(), c.C33052c.f142557a)) {
                    m150182w(dVar, m150185b);
                }
            }
        }
    }

    /* renamed from: l */
    private final void m150172l(d dVar) {
        a aVar = (a) f142549b.get(dVar.m150191b().m95029V3());
        if (aVar == null) {
            return;
        }
        c m150184a = aVar.m150184a();
        c.d dVar2 = c.d.f142558a;
        if (AbstractC19074t.m100204b(m150184a, dVar2)) {
            return;
        }
        aVar.m150187d(dVar2);
    }

    /* renamed from: m */
    private final boolean m150173m(d dVar) {
        C26680a c26680a = C26680a.f126349a;
        if (c26680a.m137026a()) {
            return true;
        }
        if (c26680a.m137027b()) {
            C31986k3 c31986k3 = C31986k3.f147083a;
            String mo95039W2 = dVar.m150191b().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (c31986k3.m154105P1(mo95039W2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final boolean m150174n() {
        int m4337x5 = AbstractC0924m0.m4337x5();
        if (m4337x5 == 2 || m4337x5 == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final boolean m150175o(String str) {
        if (C31986k3.f147083a.m154105P1(str)) {
            C26680a c26680a = C26680a.f126349a;
            if (!c26680a.m137027b() && !c26680a.m137026a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    private final boolean m150176p(String[] strArr) {
        String str = strArr[0];
        List m137032j = C26680a.f126349a.m137032j();
        List list = m137032j;
        if (list != null && !list.isEmpty() && m137032j.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private final void m150177q(String str, String str2, long j11, String str3, String str4, String str5, String str6, long j12, String str7, InterfaceC18509p interfaceC18509p) {
        int i11;
        C0766k c0766k = new C0766k();
        AbstractC25251g.m130681a(c0766k, new e(interfaceC18509p));
        AbstractC25251g.m130681a(c0766k, new f(interfaceC18509p));
        if (C26680a.m137023g() == 1) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c0766k.m1872u0(str, str2, j11, str3, str5, str6, i11, j12, j11, C29252b.f135467a.m146046a(str7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m150178r(final d dVar, final String[] strArr, final long j11, final int i11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yd0.c
            @Override // java.lang.Runnable
            public final void run() {
                C30912e.m150180t(C30912e.this, dVar, strArr, j11, i11);
            }
        });
    }

    /* renamed from: s */
    static /* synthetic */ void m150179s(C30912e c30912e, d dVar, String[] strArr, long j11, int i11, int i12, Object obj) {
        int i13;
        if ((i12 & 8) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        c30912e.m150178r(dVar, strArr, j11, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m150180t(C30912e c30912e, d dVar, String[] strArr, long j11, int i11) {
        AbstractC19074t.m100208f(c30912e, "this$0");
        AbstractC19074t.m100208f(dVar, "$params");
        AbstractC19074t.m100208f(strArr, "$results");
        String m94862C4 = dVar.m150191b().m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        String mo95039W2 = dVar.m150191b().mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        c30912e.m150177q(m94862C4, mo95039W2, dVar.m150191b().m95029V3().m41045i(), strArr[0], strArr[1], strArr[2], strArr[3], j11, dVar.m150192c(), new g(i11, c30912e, dVar, strArr, j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m150181v(d dVar, C30912e c30912e) {
        AbstractC19074t.m100208f(dVar, "$params");
        AbstractC19074t.m100208f(c30912e, "this$0");
        try {
            c m150190a = dVar.m150190a();
            if (AbstractC19074t.m100204b(m150190a, c.b.f142556a)) {
                c30912e.m150169i(dVar);
            } else {
                if (!AbstractC19074t.m100204b(m150190a, c.C33052c.f142557a) && !AbstractC19074t.m100204b(m150190a, c.a.f142555a)) {
                    if (AbstractC19074t.m100204b(m150190a, c.d.f142558a)) {
                        c30912e.m150172l(dVar);
                    }
                }
                c30912e.m150171k(dVar);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: w */
    private final void m150182w(d dVar, String[] strArr) {
        if (m150173m(dVar)) {
            if (m150176p(strArr)) {
                C30913f m120698o1 = AbstractC23306f.m120698o1();
                String m94862C4 = dVar.m150191b().m94862C4();
                AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
                m120698o1.m101508a(new C30913f.b(m94862C4, dVar.m150193d(), new C30913f.a(strArr[0], strArr[1], strArr[2], strArr[3])));
                return;
            }
            return;
        }
        m150179s(this, dVar, strArr, 5000L, 0, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19378b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo1884d(final d dVar, AbstractC19378b.a aVar) {
        AbstractC19074t.m100208f(dVar, "params");
        if (C29255e.f135512a.m146094g() != null && C26680a.m137023g() != 0 && dVar.m150191b().m95208n8()) {
            String mo95039W2 = dVar.m150191b().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (!m150175o(mo95039W2)) {
                if (C26680a.m137023g() != 1 || m150174n()) {
                    f142550c.mo13474a(new Runnable() { // from class: yd0.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C30912e.m150181v(C30912e.d.this, this);
                        }
                    });
                }
            }
        }
    }
}
