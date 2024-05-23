package fj;

import androidx.work.AbstractC2144f;
import d60.C17797f;
import eg0.AbstractC18429d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import mg.C23288a;
import org.json.JSONObject;
import p019aj.C0876j;
import p056cj.C3533a;
import p212hj.AbstractC20070a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p645xh.C29628e;
import p716zh.C31986k3;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;

/* renamed from: fj.z */
/* loaded from: classes3.dex */
public final class C18983z {
    public static final c Companion = new c(null);

    /* renamed from: c */
    private static final InterfaceC24854k f94759c;

    /* renamed from: a */
    private final C0876j f94760a;

    /* renamed from: b */
    private final Map f94761b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fj.z$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final int f94762a;

        /* renamed from: b */
        private final int f94763b;

        /* renamed from: c */
        private final JSONObject f94764c;

        /* renamed from: d */
        private boolean f94765d;

        /* renamed from: e */
        private final List f94766e;

        /* renamed from: f */
        private int f94767f;

        public a(int i11, int i12, JSONObject jSONObject, boolean z11, List list, int i13) {
            AbstractC19074t.m100208f(jSONObject, "jsonData");
            AbstractC19074t.m100208f(list, "ackList");
            this.f94762a = i11;
            this.f94763b = i12;
            this.f94764c = jSONObject;
            this.f94765d = z11;
            this.f94766e = list;
            this.f94767f = i13;
        }

        /* renamed from: a */
        public final List m99630a() {
            return this.f94766e;
        }

        /* renamed from: b */
        public final int m99631b() {
            return this.f94762a;
        }

        /* renamed from: c */
        public final JSONObject m99632c() {
            return this.f94764c;
        }

        /* renamed from: d */
        public final int m99633d() {
            return this.f94767f;
        }

        /* renamed from: e */
        public final int m99634e() {
            return this.f94763b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f94762a == aVar.f94762a && this.f94763b == aVar.f94763b && AbstractC19074t.m100204b(this.f94764c, aVar.f94764c) && this.f94765d == aVar.f94765d && AbstractC19074t.m100204b(this.f94766e, aVar.f94766e) && this.f94767f == aVar.f94767f;
        }

        /* renamed from: f */
        public final boolean m99635f() {
            return this.f94765d;
        }

        /* renamed from: g */
        public final void m99636g(int i11) {
            this.f94767f = i11;
        }

        /* renamed from: h */
        public final void m99637h(boolean z11) {
            this.f94765d = z11;
        }

        public int hashCode() {
            return (((((((((this.f94762a * 31) + this.f94763b) * 31) + this.f94764c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f94765d)) * 31) + this.f94766e.hashCode()) * 31) + this.f94767f;
        }

        public String toString() {
            return "AckBatchingRequest(cmd=" + this.f94762a + ", subCmd=" + this.f94763b + ", jsonData=" + this.f94764c + ", isSeen=" + this.f94765d + ", ackList=" + this.f94766e + ", processedCount=" + this.f94767f + ")";
        }

        public /* synthetic */ a(int i11, int i12, JSONObject jSONObject, boolean z11, List list, int i13, int i14, AbstractC19060k abstractC19060k) {
            this(i11, i12, jSONObject, (i14 & 8) != 0 ? false : z11, (i14 & 16) != 0 ? new ArrayList() : list, (i14 & 32) != 0 ? 0 : i13);
        }
    }

    /* renamed from: fj.z$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f94768q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18983z mo12V4() {
            return d.f94769a.m99640a();
        }
    }

    /* renamed from: fj.z$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18983z m99639a() {
            return (C18983z) C18983z.f94759c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fj.z$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f94769a = new d();

        /* renamed from: b */
        private static final C18983z f94770b;

        static {
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
            f94770b = new C18983z(m120584H0);
        }

        private d() {
        }

        /* renamed from: a */
        public final C18983z m99640a() {
            return f94770b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f94768q);
        f94759c = m129210a;
    }

    public C18983z(C0876j c0876j) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        this.f94760a = c0876j;
        this.f94761b = new TreeMap();
    }

    /* renamed from: c */
    private final void m99618c(long j11, final a aVar, final long j12) {
        if (j11 > 0 && aVar.m99633d() >= aVar.m99630a().size()) {
            this.f94761b.remove(Long.valueOf(j11));
            AbstractC18429d.m97660a(C23288a.f113033a, new Runnable() { // from class: fj.y
                @Override // java.lang.Runnable
                public final void run() {
                    C18983z.m99619d(C18983z.this, aVar, j12);
                }
            });
            C17797f.f90007a.m94002c(j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m99619d(C18983z c18983z, a aVar, long j11) {
        AbstractC19074t.m100208f(c18983z, "this$0");
        AbstractC19074t.m100208f(aVar, "$request");
        c18983z.m99621h(aVar, j11);
    }

    /* renamed from: e */
    private final void m99620e(int i11, int i12, JSONObject jSONObject, long j11) {
        boolean z11;
        boolean z12;
        JSONObject optJSONObject;
        boolean z13 = true;
        if (jSONObject.optInt("hasMore") == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 10209) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (i11 != 10109) {
            z13 = false;
        }
        if (z11) {
            Long valueOf = Long.valueOf(jSONObject.optLong("lastMsgId"));
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                j11 = valueOf.longValue();
            }
            C29628e.m147249E0().m147282k1(i11, i12, j11);
            return;
        }
        if (z12) {
            C31986k3.f147083a.m154133l0();
            return;
        }
        if (z13 && (optJSONObject = jSONObject.optJSONObject("nextQueue")) != null) {
            int optInt = optJSONObject.optInt("nextCmd");
            int optInt2 = optJSONObject.optInt("nextSubCmd");
            if (optInt == 10117) {
                C29628e.m147249E0().m147284m1(false, 0L, (byte) optInt2);
            }
        }
    }

    /* renamed from: h */
    private final synchronized void m99621h(a aVar, long j11) {
        try {
            int m99631b = aVar.m99631b();
            List m99622i = m99622i(aVar.m99630a());
            boolean m104312b = AbstractC20070a.m104312b(m99631b);
            boolean m104311a = AbstractC20070a.m104311a(m99631b);
            if (!m99622i.isEmpty()) {
                this.f94760a.m2618V(m99622i, m104312b, m104311a, aVar.m99635f());
            }
            if (AbstractC20070a.m104315e(m99631b)) {
                m99620e(m99631b, aVar.m99634e(), aVar.m99632c(), j11);
            } else if (AbstractC20070a.m104314d(m99631b) && (!m99622i.isEmpty())) {
                AbstractC23304d.m120554y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    private final List m99622i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3533a c3533a = (C3533a) it.next();
            if (!c3533a.m17920o()) {
                arrayList.add(c3533a);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static final C18983z m99623j() {
        return Companion.m99639a();
    }

    /* renamed from: l */
    public static /* synthetic */ void m99624l(C18983z c18983z, long j11, int i11, boolean z11, long j12, int i12, Object obj) {
        int i13;
        boolean z12;
        if ((i12 & 2) != 0) {
            i13 = 1;
        } else {
            i13 = i11;
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        } else {
            z12 = z11;
        }
        if ((i12 & 8) != 0) {
            j12 = 0;
        }
        c18983z.m99627k(j11, i13, z12, j12);
    }

    /* renamed from: f */
    public final synchronized void m99625f(C3533a c3533a, boolean z11, boolean z12, boolean z13) {
        List m131496e;
        AbstractC19074t.m100208f(c3533a, "ack");
        C0876j c0876j = this.f94760a;
        m131496e = AbstractC25366r.m131496e(c3533a);
        c0876j.m2618V(m131496e, z11, z12, z13);
    }

    /* renamed from: g */
    public final synchronized void m99626g(List list, boolean z11, boolean z12, boolean z13) {
        AbstractC19074t.m100208f(list, "ackList");
        this.f94760a.m2618V(list, z11, z12, z13);
    }

    /* renamed from: k */
    public final synchronized void m99627k(long j11, int i11, boolean z11, long j12) {
        if (j11 > 0 && i11 >= 0) {
            a aVar = (a) this.f94761b.get(Long.valueOf(j11));
            if (aVar != null) {
                aVar.m99636g(aVar.m99633d() + i11);
                aVar.m99637h(z11);
                m99618c(j11, aVar, j12);
            }
        }
    }

    /* renamed from: m */
    public final synchronized void m99628m(long j11, C3533a c3533a) {
        List m99630a;
        AbstractC19074t.m100208f(c3533a, "ack");
        if (j11 <= 0) {
            return;
        }
        a aVar = (a) this.f94761b.get(Long.valueOf(j11));
        if (aVar != null && (m99630a = aVar.m99630a()) != null) {
            m99630a.add(c3533a);
        }
    }

    /* renamed from: n */
    public final synchronized void m99629n(long j11, int i11, int i12, JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonData");
        if (j11 < 0) {
            return;
        }
        this.f94761b.put(Long.valueOf(j11), new a(i11, i12, jSONObject, false, null, 0, 56, null));
    }
}
