package p732zy;

import ae.C0766k;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import org.json.JSONObject;

/* renamed from: zy.f */
/* loaded from: classes4.dex */
public final class C32590f extends AbstractC1796t0 {

    /* renamed from: s */
    private C32596l f150588s;

    /* renamed from: t */
    private final C1761c0 f150589t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f150590u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f150591v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f150592w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f150593x = new C1761c0();

    /* renamed from: y */
    private final C1761c0 f150594y = new C1761c0();

    /* renamed from: zy.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f150595a;

        /* renamed from: b */
        private final Long f150596b;

        public a(String str, Long l11) {
            AbstractC19074t.m100208f(str, "src");
            this.f150595a = str;
            this.f150596b = l11;
        }

        /* renamed from: a */
        public final Long m157752a() {
            return this.f150596b;
        }

        /* renamed from: b */
        public final String m157753b() {
            return this.f150595a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f150595a, aVar.f150595a) && AbstractC19074t.m100204b(this.f150596b, aVar.f150596b);
        }

        public int hashCode() {
            int hashCode = this.f150595a.hashCode() * 31;
            Long l11 = this.f150596b;
            return hashCode + (l11 == null ? 0 : l11.hashCode());
        }

        public String toString() {
            return "OpenCreatingQuickMessageData(src=" + this.f150595a + ", idToUpdate=" + this.f150596b + ")";
        }

        public /* synthetic */ a(String str, Long l11, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : l11);
        }
    }

    /* renamed from: zy.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                C32590f.this.f150593x.mo9221n(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: O */
    private final C32606v m157735O() {
        return C32600p.f150676a.m157898e();
    }

    /* renamed from: N */
    public final LiveData m157736N() {
        return m157735O().m157926o();
    }

    /* renamed from: P */
    public final void m157737P(String str) {
        AbstractC19074t.m100208f(str, "src");
        this.f150589t.mo9221n(new a(str, null, 2, 0 == true ? 1 : 0));
    }

    /* renamed from: Q */
    public final void m157738Q() {
        this.f150590u.mo9221n(Boolean.TRUE);
    }

    /* renamed from: R */
    public final void m157739R() {
        this.f150588s = null;
    }

    /* renamed from: S */
    public final void m157740S() {
        C32596l c32596l = this.f150588s;
        if (c32596l != null) {
            this.f150592w.mo9221n("/" + c32596l.m157831f());
        }
    }

    /* renamed from: T */
    public final void m157741T() {
        Long l11;
        C1761c0 c1761c0 = this.f150589t;
        C32596l c32596l = this.f150588s;
        if (c32596l != null) {
            l11 = Long.valueOf(c32596l.m157830e());
        } else {
            l11 = null;
        }
        c1761c0.mo9221n(new a("qm_csc_bottomsheet", l11));
        this.f150588s = null;
    }

    /* renamed from: U */
    public final void m157742U() {
        C32596l c32596l = this.f150588s;
        if (c32596l != null) {
            m157747Z(c32596l.m157830e());
        }
        this.f150588s = null;
    }

    /* renamed from: V */
    public final void m157743V(C32596l c32596l) {
        AbstractC19074t.m100208f(c32596l, "item");
        this.f150594y.mo9221n(Long.valueOf(c32596l.m157830e()));
    }

    /* renamed from: W */
    public final void m157744W(C32596l c32596l) {
        AbstractC19074t.m100208f(c32596l, "item");
        this.f150588s = c32596l;
        this.f150591v.mo9221n(Boolean.TRUE);
    }

    /* renamed from: X */
    public final LiveData m157745X() {
        return this.f150589t;
    }

    /* renamed from: Y */
    public final LiveData m157746Y() {
        return this.f150590u;
    }

    /* renamed from: Z */
    public final void m157747Z(long j11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", "qm_context_menu");
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1536Sa(j11, jSONObject2);
    }

    /* renamed from: a0 */
    public final LiveData m157748a0() {
        return this.f150594y;
    }

    /* renamed from: b0 */
    public final LiveData m157749b0() {
        return this.f150592w;
    }

    /* renamed from: c0 */
    public final LiveData m157750c0() {
        return this.f150591v;
    }

    /* renamed from: e0 */
    public final LiveData m157751e0() {
        return this.f150593x;
    }
}
