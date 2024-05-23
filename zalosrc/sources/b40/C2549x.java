package b40;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import androidx.work.AbstractC2144f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17990p0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p263jc.C21216s;
import p296kc.C21654a;
import p304ks.AbstractC21935u;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import pm0.C24848g0;
import qm0.AbstractC25332a0;

/* renamed from: b40.x */
/* loaded from: classes5.dex */
public final class C2549x {

    /* renamed from: d */
    private static boolean f10400d;

    /* renamed from: a */
    public static final C2549x f10397a = new C2549x();

    /* renamed from: b */
    private static final Set f10398b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private static final Set f10399c = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    private static a f10401e = new a(false, false, 0, 0, 0, 0, 63, null);

    /* renamed from: b40.x$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private boolean f10402a;

        /* renamed from: b */
        private boolean f10403b;

        /* renamed from: c */
        private int f10404c;

        /* renamed from: d */
        private int f10405d;

        /* renamed from: e */
        private int f10406e;

        /* renamed from: f */
        private int f10407f;

        public a(boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
            this.f10402a = z11;
            this.f10403b = z12;
            this.f10404c = i11;
            this.f10405d = i12;
            this.f10406e = i13;
            this.f10407f = i14;
        }

        /* renamed from: a */
        public final boolean m12857a() {
            return this.f10402a;
        }

        /* renamed from: b */
        public final boolean m12858b() {
            return this.f10403b;
        }

        /* renamed from: c */
        public final int m12859c() {
            return this.f10406e;
        }

        /* renamed from: d */
        public final int m12860d() {
            return this.f10407f;
        }

        /* renamed from: e */
        public final int m12861e() {
            return this.f10404c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10402a == aVar.f10402a && this.f10403b == aVar.f10403b && this.f10404c == aVar.f10404c && this.f10405d == aVar.f10405d && this.f10406e == aVar.f10406e && this.f10407f == aVar.f10407f;
        }

        /* renamed from: f */
        public final int m12862f() {
            return this.f10405d;
        }

        /* renamed from: g */
        public final void m12863g(boolean z11) {
            this.f10402a = z11;
        }

        /* renamed from: h */
        public final void m12864h(boolean z11) {
            this.f10403b = z11;
        }

        public int hashCode() {
            return (((((((((AbstractC2144f.m11520a(this.f10402a) * 31) + AbstractC2144f.m11520a(this.f10403b)) * 31) + this.f10404c) * 31) + this.f10405d) * 31) + this.f10406e) * 31) + this.f10407f;
        }

        /* renamed from: i */
        public final void m12865i(int i11) {
            this.f10406e = i11;
        }

        /* renamed from: j */
        public final void m12866j(int i11) {
            this.f10407f = i11;
        }

        /* renamed from: k */
        public final void m12867k(int i11) {
            this.f10404c = i11;
        }

        /* renamed from: l */
        public final void m12868l(int i11) {
            this.f10405d = i11;
        }

        public String toString() {
            return "Config(enable=" + this.f10402a + ", enableQOS=" + this.f10403b + ", msgTypes=" + this.f10404c + ", threadTypes=" + this.f10405d + ", groupSize=" + this.f10406e + ", msgCountPerLogRecord=" + this.f10407f + ")";
        }

        public /* synthetic */ a(boolean z11, boolean z12, int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
            this((i15 & 1) != 0 ? false : z11, (i15 & 2) != 0 ? true : z12, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) == 0 ? i12 : 0, (i15 & 16) != 0 ? 1000 : i13, (i15 & 32) != 0 ? 50 : i14);
        }
    }

    /* renamed from: b40.x$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f10408a;

        /* renamed from: b */
        private final String f10409b;

        /* renamed from: c */
        private final List f10410c;

        /* renamed from: d */
        private final List f10411d;

        /* renamed from: e */
        private final List f10412e;

        /* renamed from: f */
        private final List f10413f;

        public b(String str, String str2) {
            AbstractC19074t.m100208f(str, "entryPoint");
            AbstractC19074t.m100208f(str2, "conversationId");
            this.f10408a = str;
            this.f10409b = str2;
            this.f10410c = new ArrayList();
            this.f10411d = new ArrayList();
            this.f10412e = new ArrayList();
            this.f10413f = new ArrayList();
        }

        /* renamed from: a */
        public final String m12869a() {
            return this.f10409b;
        }

        /* renamed from: b */
        public final String m12870b() {
            return this.f10408a;
        }

        /* renamed from: c */
        public final List m12871c() {
            return this.f10412e;
        }

        /* renamed from: d */
        public final List m12872d() {
            return this.f10410c;
        }

        /* renamed from: e */
        public final List m12873e() {
            return this.f10411d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f10408a, bVar.f10408a) && AbstractC19074t.m100204b(this.f10409b, bVar.f10409b);
        }

        /* renamed from: f */
        public final List m12874f() {
            return this.f10413f;
        }

        public int hashCode() {
            return (this.f10408a.hashCode() * 31) + this.f10409b.hashCode();
        }

        public String toString() {
            return "ConversationRolledMedia(entryPoint=" + this.f10408a + ", conversationId=" + this.f10409b + ")";
        }
    }

    /* renamed from: b40.x$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final String f10414a;

        /* renamed from: b */
        private final String f10415b;

        /* renamed from: c */
        private final String f10416c;

        /* renamed from: d */
        private int f10417d;

        /* renamed from: e */
        private long f10418e;

        /* renamed from: f */
        private long f10419f;

        /* renamed from: g */
        private boolean f10420g;

        /* renamed from: h */
        private boolean f10421h;

        /* renamed from: i */
        private boolean f10422i;

        /* renamed from: j */
        private boolean f10423j;

        /* renamed from: k */
        private boolean f10424k;

        /* renamed from: l */
        private boolean f10425l;

        /* renamed from: m */
        private int f10426m;

        /* renamed from: n */
        private Integer f10427n;

        /* renamed from: o */
        private Boolean f10428o;

        public c(String str, String str2, String str3) {
            AbstractC19074t.m100208f(str, "entryPoint");
            AbstractC19074t.m100208f(str2, "conversationId");
            AbstractC19074t.m100208f(str3, "msgId");
            this.f10414a = str;
            this.f10415b = str2;
            this.f10416c = str3;
            this.f10417d = 10000;
        }

        /* renamed from: a */
        public final String m12875a() {
            return this.f10415b;
        }

        /* renamed from: b */
        public final String m12876b() {
            return this.f10414a;
        }

        /* renamed from: c */
        public final JSONObject m12877c() {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f10416c);
            jSONObject.put("ts", this.f10418e);
            jSONObject.put("sz", this.f10419f);
            String str = "0";
            if (!this.f10420g) {
                obj = "0";
            } else {
                obj = "1";
            }
            jSONObject.put("rcv", obj);
            if (!this.f10421h) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            jSONObject.put("rst", obj2);
            if (!this.f10422i) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            jSONObject.put("pc", obj3);
            if (!this.f10423j) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            jSONObject.put("lmd", obj4);
            if (!this.f10425l) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            jSONObject.put("iqa", obj5);
            if (!this.f10424k) {
                obj6 = "0";
            } else {
                obj6 = "1";
            }
            jSONObject.put("qrd", obj6);
            jSONObject.put("ac", String.valueOf(this.f10426m));
            Boolean bool = this.f10428o;
            if (bool != null) {
                if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                    str = "1";
                }
                jSONObject.put("ivc", str);
            }
            Integer num = this.f10427n;
            if (num != null) {
                jSONObject.put("pt", num);
            }
            return jSONObject;
        }

        /* renamed from: d */
        public final String m12878d() {
            return this.f10414a + " - " + this.f10415b;
        }

        /* renamed from: e */
        public final int m12879e() {
            return this.f10417d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f10414a, cVar.f10414a) && AbstractC19074t.m100204b(this.f10415b, cVar.f10415b) && AbstractC19074t.m100204b(this.f10416c, cVar.f10416c);
        }

        /* renamed from: f */
        public final void m12880f(int i11) {
            this.f10426m = i11;
        }

        /* renamed from: g */
        public final void m12881g(boolean z11) {
            this.f10422i = z11;
        }

        /* renamed from: h */
        public final void m12882h(boolean z11) {
            this.f10425l = z11;
        }

        public int hashCode() {
            return (((this.f10414a.hashCode() * 31) + this.f10415b.hashCode()) * 31) + this.f10416c.hashCode();
        }

        /* renamed from: i */
        public final void m12883i(boolean z11) {
            this.f10423j = z11;
        }

        /* renamed from: j */
        public final void m12884j(Integer num) {
            this.f10427n = num;
        }

        /* renamed from: k */
        public final void m12885k(boolean z11) {
            this.f10420g = z11;
        }

        /* renamed from: l */
        public final void m12886l(boolean z11) {
            this.f10421h = z11;
        }

        /* renamed from: m */
        public final void m12887m(long j11) {
            this.f10419f = j11;
        }

        /* renamed from: n */
        public final void m12888n(long j11) {
            this.f10418e = j11;
        }

        /* renamed from: o */
        public final void m12889o(int i11) {
            this.f10417d = i11;
        }

        /* renamed from: p */
        public final void m12890p(boolean z11) {
            this.f10424k = z11;
        }

        /* renamed from: q */
        public final void m12891q(Boolean bool) {
            this.f10428o = bool;
        }

        public String toString() {
            return "RolledMediaRecord(entryPoint=" + this.f10414a + ", conversationId=" + this.f10415b + ", msgId=" + this.f10416c + ")";
        }
    }

    private C2549x() {
    }

    /* renamed from: c */
    private final int m12844c(C17945a0 c17945a0) {
        if (AbstractC19646n0.m103031t1(c17945a0.m95041W4()) || AbstractC19646n0.m102995k1(c17945a0.m95041W4())) {
            return 2;
        }
        if (AbstractC19646n0.m102886D1(c17945a0.m95041W4())) {
            return 4;
        }
        if (AbstractC19646n0.m103003m1(c17945a0.m95041W4())) {
            return 8;
        }
        if (AbstractC19646n0.m102889E1(c17945a0.m95041W4())) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    private final int m12845d(String str) {
        ContactProfile contactProfile = new ContactProfile(str);
        if (contactProfile.m40384Q0()) {
            return 4;
        }
        if (contactProfile.m40374K0()) {
            return 16;
        }
        if (AbstractC21935u.m114515E(contactProfile.f42434r)) {
            return 2;
        }
        if (AbstractC21935u.m114558y(contactProfile.f42434r)) {
            return 1;
        }
        if (AbstractC21935u.m114518H(contactProfile.f42434r)) {
            return 8;
        }
        return 0;
    }

    /* renamed from: e */
    private final String m12846e(String str) {
        int m12845d = m12845d(str);
        if (m12845d == 1 || m12845d == 2) {
            return "1";
        }
        if (m12845d != 4) {
            if (m12845d != 8) {
                if (m12845d != 16) {
                    return "0";
                }
                return "2";
            }
            return "3";
        }
        return "4";
    }

    /* renamed from: h */
    public static final void m12847h(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "$entryPoint");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        f10397a.m12848i(str, c17945a0);
    }

    /* renamed from: i */
    private final void m12848i(String str, C17945a0 c17945a0) {
        long j11;
        C31973j5 m4472f;
        String m3478U6;
        try {
            boolean z11 = false;
            if (!f10400d && (m3478U6 = AbstractC0924m0.m3478U6()) != null && m3478U6.length() > 0) {
                m12849k(this, new JSONObject(m3478U6), false, 2, null);
            }
            C17969i0 m94929K2 = c17945a0.m94929K2();
            C21654a.f105046a.m111587j(c17945a0, f10401e.m12858b());
            if (!f10401e.m12857a() || (m12844c(c17945a0) & f10401e.m12861e()) <= 0) {
                return;
            }
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if ((m12845d(mo95039W2) & f10401e.m12862f()) <= 0) {
                return;
            }
            if (AbstractC25495a.m132079d(c17945a0.mo95039W2()) && ((m4472f = C0943w.m4462l().m4472f(c17945a0.mo95039W2())) == null || m4472f.m153732O() > f10401e.m12859c())) {
                return;
            }
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            c cVar = new c(str, mo95039W22, c17945a0.m94862C4() + "_" + c17945a0.m95029V3().m41044h());
            cVar.m12888n(c17945a0.m94974P4());
            cVar.m12889o(c17945a0.m95041W4());
            if (m94929K2 instanceof C17990p0) {
                j11 = ((C17990p0) m94929K2).f91113B;
            } else if (m94929K2 instanceof C17961f1) {
                j11 = ((C17961f1) m94929K2).m95453G();
            } else if (m94929K2 instanceof C17964g1) {
                j11 = ((C17964g1) m94929K2).m95531h();
            } else {
                j11 = 0;
            }
            cVar.m12887m(j11);
            cVar.m12885k(!c17945a0.m95032V6());
            cVar.m12886l(false);
            cVar.m12881g(c17945a0.m95180k8());
            C2535j c2535j = C2535j.f10308a;
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            cVar.m12883i(c2535j.m12770m(m95029V3));
            cVar.m12890p(f10399c.contains(c17945a0.m95029V3()));
            C21216s.a aVar = C21216s.Companion;
            cVar.m12882h(((C21216s) aVar.m122672a()).m109864R0(c17945a0));
            cVar.m12880f(((C21216s) aVar.m122672a()).m109853E(c17945a0));
            if (c17945a0.m95306y8()) {
                MessageId m95029V32 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                if (c2535j.m12769k(m95029V32) == 1) {
                    z11 = true;
                }
                cVar.m12891q(Boolean.valueOf(z11));
            }
            cVar.m12884j(Integer.valueOf(c17945a0.m95196m4()));
            f10398b.add(cVar);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m12849k(C2549x c2549x, JSONObject jSONObject, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c2549x.m12854j(jSONObject, z11);
    }

    /* renamed from: m */
    private final void m12850m(String str, String str2, String str3, List list) {
        String m12846e = m12846e(str2);
        JSONObject jSONObject = new JSONObject();
        if (AbstractC25495a.m132079d(str2)) {
            jSONObject.put("tid", AbstractC25495a.m132089n(str2));
            C31973j5 m4473g = C0943w.m4462l().m4473g(str2);
            if (m4473g != null) {
                jSONObject.put("tsz", m4473g.m153732O());
            }
        } else {
            jSONObject.put("tid", str2);
            if (!AbstractC25495a.m132078c(str2)) {
                jSONObject.put("isFriend", AbstractC21935u.m114554u(str2) ? 1 : 0);
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((c) it.next()).m12877c());
        }
        jSONObject.put("items", jSONArray);
        C0815e1.m2075D().m2100V(new C23648e(44, str, 1, str3, m12846e, jSONObject.toString()), false);
    }

    /* renamed from: o */
    public static final void m12851o() {
        HashSet<c> hashSet;
        List m131195U;
        List m131195U2;
        List m131195U3;
        List m131195U4;
        try {
            Set set = f10398b;
            AbstractC19074t.m100207e(set, "rolledMediaSet");
            synchronized (set) {
                hashSet = new HashSet(set);
                set.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            HashMap hashMap = new HashMap();
            for (c cVar : hashSet) {
                String m12878d = cVar.m12878d();
                b bVar = (b) hashMap.get(m12878d);
                if (bVar == null) {
                    bVar = new b(cVar.m12876b(), cVar.m12875a());
                    hashMap.put(m12878d, bVar);
                }
                if (AbstractC19646n0.m103031t1(cVar.m12879e())) {
                    bVar.m12872d().add(cVar);
                } else if (AbstractC19646n0.m102995k1(cVar.m12879e())) {
                    bVar.m12872d().add(cVar);
                } else if (AbstractC19646n0.m102886D1(cVar.m12879e())) {
                    bVar.m12873e().add(cVar);
                } else if (AbstractC19646n0.m103003m1(cVar.m12879e())) {
                    bVar.m12871c().add(cVar);
                } else if (AbstractC19646n0.m102889E1(cVar.m12879e())) {
                    bVar.m12874f().add(cVar);
                }
            }
            Collection<b> values = hashMap.values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            for (b bVar2 : values) {
                if (!bVar2.m12872d().isEmpty()) {
                    m131195U4 = AbstractC25332a0.m131195U(bVar2.m12872d(), f10401e.m12860d());
                    Iterator it = m131195U4.iterator();
                    while (it.hasNext()) {
                        f10397a.m12850m(bVar2.m12870b(), bVar2.m12869a(), "media_roll_detect_photo", (List) it.next());
                    }
                }
                if (!bVar2.m12873e().isEmpty()) {
                    m131195U3 = AbstractC25332a0.m131195U(bVar2.m12873e(), f10401e.m12860d());
                    Iterator it2 = m131195U3.iterator();
                    while (it2.hasNext()) {
                        f10397a.m12850m(bVar2.m12870b(), bVar2.m12869a(), "media_roll_detect_video", (List) it2.next());
                    }
                }
                if (!bVar2.m12871c().isEmpty()) {
                    m131195U2 = AbstractC25332a0.m131195U(bVar2.m12871c(), f10401e.m12860d());
                    Iterator it3 = m131195U2.iterator();
                    while (it3.hasNext()) {
                        f10397a.m12850m(bVar2.m12870b(), bVar2.m12869a(), "media_roll_detect_file", (List) it3.next());
                    }
                }
                if (!bVar2.m12874f().isEmpty()) {
                    m131195U = AbstractC25332a0.m131195U(bVar2.m12874f(), f10401e.m12860d());
                    Iterator it4 = m131195U.iterator();
                    while (it4.hasNext()) {
                        f10397a.m12850m(bVar2.m12870b(), bVar2.m12869a(), "media_roll_detect_voice", (List) it4.next());
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    public final void m12852f(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        f10399c.add(messageId);
    }

    /* renamed from: g */
    public final void m12853g(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "entryPoint");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.v

            /* renamed from: p */
            public final /* synthetic */ String f10395p;

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f10396q;

            public /* synthetic */ RunnableC2547v(String str2, C17945a0 c17945a02) {
                r1 = str2;
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2549x.m12847h(r1, r2);
            }
        });
    }

    /* renamed from: j */
    public final void m12854j(JSONObject jSONObject, boolean z11) {
        boolean z12;
        try {
            if (jSONObject == null) {
                f10401e = new a(false, false, 0, 0, 0, 0, 63, null);
                if (z11) {
                    AbstractC0924m0.m3178Jp("");
                }
                f10400d = true;
                return;
            }
            a aVar = f10401e;
            boolean z13 = false;
            if (jSONObject.optInt("enable") >= 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            aVar.m12863g(z12);
            a aVar2 = f10401e;
            if (jSONObject.optInt("enableQoS") >= 1) {
                z13 = true;
            }
            aVar2.m12864h(z13);
            f10401e.m12867k(jSONObject.optInt("msg_types"));
            f10401e.m12868l(jSONObject.optInt("thread_types"));
            f10401e.m12865i(jSONObject.optInt("group_size", 1000));
            f10401e.m12866j(jSONObject.optInt("msg_count_threshold", 50));
            f10400d = true;
            if (z11) {
                AbstractC0924m0.m3178Jp(jSONObject.toString());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: l */
    public final void m12855l() {
        f10400d = false;
        f10401e = new a(false, false, 0, 0, 0, 0, 63, null);
        f10398b.clear();
        f10399c.clear();
    }

    /* renamed from: n */
    public final void m12856n() {
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: b40.w
            @Override // java.lang.Runnable
            public final void run() {
                C2549x.m12851o();
            }
        });
    }
}
