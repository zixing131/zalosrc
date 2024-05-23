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

/* renamed from: zy.m */
/* loaded from: classes4.dex */
public final class C32597m extends AbstractC1796t0 {

    /* renamed from: s */
    private C32596l f150661s;

    /* renamed from: t */
    private final C1761c0 f150662t = new C1761c0();

    /* renamed from: u */
    private final C1761c0 f150663u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f150664v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f150665w = new C1761c0();

    /* renamed from: zy.m$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f150666a;

        /* renamed from: b */
        private final Long f150667b;

        public a(String str, Long l11) {
            AbstractC19074t.m100208f(str, "src");
            this.f150666a = str;
            this.f150667b = l11;
        }

        /* renamed from: a */
        public final Long m157877a() {
            return this.f150667b;
        }

        /* renamed from: b */
        public final String m157878b() {
            return this.f150666a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f150666a, aVar.f150666a) && AbstractC19074t.m100204b(this.f150667b, aVar.f150667b);
        }

        public int hashCode() {
            int hashCode = this.f150666a.hashCode() * 31;
            Long l11 = this.f150667b;
            return hashCode + (l11 == null ? 0 : l11.hashCode());
        }

        public String toString() {
            return "OpenCreatingQuickMessageData(src=" + this.f150666a + ", idToUpdate=" + this.f150667b + ")";
        }

        public /* synthetic */ a(String str, Long l11, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? null : l11);
        }
    }

    /* renamed from: zy.m$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                C32597m.this.f150665w.mo9221n(c20096c.m104492d());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: O */
    private final C32606v m157861O() {
        return C32600p.f150676a.m157898e();
    }

    /* renamed from: N */
    public final LiveData m157862N() {
        return m157861O().m157926o();
    }

    /* renamed from: P */
    public final void m157863P() {
        this.f150662t.mo9221n(new a("qm_viewfull_button_create_empty", null, 2, 0 == true ? 1 : 0));
    }

    /* renamed from: Q */
    public final void m157864Q() {
        this.f150661s = null;
    }

    /* renamed from: R */
    public final void m157865R() {
        C32596l c32596l = this.f150661s;
        if (c32596l != null) {
            this.f150664v.mo9221n("/" + c32596l.m157831f());
        }
    }

    /* renamed from: S */
    public final void m157866S() {
        Long l11;
        C1761c0 c1761c0 = this.f150662t;
        C32596l c32596l = this.f150661s;
        if (c32596l != null) {
            l11 = Long.valueOf(c32596l.m157830e());
        } else {
            l11 = null;
        }
        c1761c0.mo9221n(new a("qm_viewfull", l11));
        this.f150661s = null;
    }

    /* renamed from: T */
    public final void m157867T() {
        C32596l c32596l = this.f150661s;
        if (c32596l != null) {
            m157872Y(c32596l.m157830e());
        }
        this.f150661s = null;
    }

    /* renamed from: U */
    public final void m157868U() {
        this.f150662t.mo9221n(new a("qm_viewfull_button_plus", null, 2, 0 == true ? 1 : 0));
    }

    /* renamed from: V */
    public final void m157869V(C32596l c32596l) {
        AbstractC19074t.m100208f(c32596l, "item");
        this.f150662t.mo9221n(new a("qm_viewfull", Long.valueOf(c32596l.m157830e())));
    }

    /* renamed from: W */
    public final void m157870W(C32596l c32596l) {
        AbstractC19074t.m100208f(c32596l, "item");
        this.f150661s = c32596l;
        this.f150663u.mo9221n(Boolean.TRUE);
    }

    /* renamed from: X */
    public final LiveData m157871X() {
        return this.f150662t;
    }

    /* renamed from: Y */
    public final void m157872Y(long j11) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", "qm_context_menu");
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1536Sa(j11, jSONObject2);
    }

    /* renamed from: Z */
    public final void m157873Z() {
        m157861O().m157921E(true);
    }

    /* renamed from: a0 */
    public final LiveData m157874a0() {
        return this.f150664v;
    }

    /* renamed from: b0 */
    public final LiveData m157875b0() {
        return this.f150663u;
    }

    /* renamed from: c0 */
    public final LiveData m157876c0() {
        return this.f150665w;
    }
}
