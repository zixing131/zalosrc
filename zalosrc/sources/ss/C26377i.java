package ss;

import ae.C0766k;
import am.AbstractC0924m0;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import nh0.C23793c;
import org.json.JSONObject;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ss.i */
/* loaded from: classes4.dex */
public final class C26377i extends AbstractC1796t0 {

    /* renamed from: A */
    private final C1761c0 f125339A;

    /* renamed from: s */
    private String f125340s = "";

    /* renamed from: t */
    private final InterfaceC24854k f125341t;

    /* renamed from: u */
    private C26376h f125342u;

    /* renamed from: v */
    private final C1761c0 f125343v;

    /* renamed from: w */
    private final C1761c0 f125344w;

    /* renamed from: x */
    private final C1761c0 f125345x;

    /* renamed from: y */
    private final C1761c0 f125346y;

    /* renamed from: z */
    private final C1761c0 f125347z;

    /* renamed from: ss.i$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final Long f125348a;

        public a(Long l11) {
            this.f125348a = l11;
        }

        /* renamed from: a */
        public final Long m135928a() {
            return this.f125348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f125348a, ((a) obj).f125348a);
        }

        public int hashCode() {
            Long l11 = this.f125348a;
            if (l11 == null) {
                return 0;
            }
            return l11.hashCode();
        }

        public String toString() {
            return "OpenCreatingAutoReplyData(idToUpdate=" + this.f125348a + ")";
        }

        public /* synthetic */ a(Long l11, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? null : l11);
        }
    }

    /* renamed from: ss.i$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f125349q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return CoreUtility.f89233i + "_" + C23793c.Companion.m124321a().mo124310e();
        }
    }

    /* renamed from: ss.i$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {
        c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            if (c20096c != null && (m104492d = c20096c.m104492d()) != null) {
                C26377i.this.f125345x.mo9221n(m104492d);
            }
            C26377i.this.f125346y.mo9221n(Boolean.TRUE);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    public C26377i() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f125349q);
        this.f125341t = m129210a;
        this.f125343v = new C1761c0();
        this.f125344w = new C1761c0();
        this.f125345x = new C1761c0();
        this.f125346y = new C1761c0();
        this.f125347z = new C1761c0();
        this.f125339A = new C1761c0();
    }

    /* renamed from: O */
    private final boolean m135907O() {
        if (!AbstractC0924m0.m3277N8()) {
            this.f125347z.mo9221n(Boolean.TRUE);
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private final C26385q m135908Q() {
        return C26379k.f125351a.m135935f();
    }

    /* renamed from: j0 */
    private final void m135909j0(C26376h c26376h, boolean z11) {
        boolean z12;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new c());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", this.f125340s);
        jSONObject.put("sessionId", m135911R());
        if (z11 != c26376h.m135878e()) {
            z12 = true;
        } else {
            z12 = false;
        }
        jSONObject.put("message_updated", z12);
        jSONObject.put("enable_updated", false);
        jSONObject.put("time_updated", false);
        jSONObject.put("receiver_updated", false);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        c0766k.mo1533S7(c26376h.m135880g(), z11, c26376h.m135888p(), c26376h.m135879f(), c26376h.m135876c(), c26376h.m135884l(), c26376h.m135883k(), c26376h.m135886n(), jSONObject2);
    }

    /* renamed from: P */
    public final LiveData m135910P() {
        return m135908Q().m135959n();
    }

    /* renamed from: R */
    public final String m135911R() {
        return (String) this.f125341t.getValue();
    }

    /* renamed from: S */
    public final String m135912S() {
        return this.f125340s;
    }

    /* renamed from: T */
    public final void m135913T(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("EXTRA_SHOW_ONBOARDING", false)) {
            bundle.remove("EXTRA_SHOW_ONBOARDING");
            int i11 = bundle.getInt("EXTRA_SHOW_ONBOARDING_ITEM_ID", 0);
            if (i11 != 0) {
                this.f125339A.mo9221n(Integer.valueOf(i11));
                return;
            }
        }
        m135907O();
    }

    /* renamed from: U */
    public final void m135914U(long j11) {
        this.f125343v.mo9221n(new a(Long.valueOf(j11)));
    }

    /* renamed from: V */
    public final void m135915V() {
        this.f125343v.mo9221n(new a(null, 1, 0 == true ? 1 : 0));
    }

    /* renamed from: W */
    public final void m135916W() {
        C26376h c26376h = this.f125342u;
        if (c26376h != null) {
            m135909j0(c26376h, false);
        }
        this.f125342u = null;
    }

    /* renamed from: X */
    public final void m135917X() {
        this.f125343v.mo9221n(new a(null, 1, 0 == true ? 1 : 0));
    }

    /* renamed from: Y */
    public final void m135918Y() {
        this.f125346y.mo9221n(Boolean.TRUE);
        this.f125342u = null;
    }

    /* renamed from: Z */
    public final void m135919Z(C26376h c26376h, boolean z11) {
        AbstractC19074t.m100208f(c26376h, "arItem");
        if (c26376h.m135878e() == z11) {
            return;
        }
        if (z11) {
            if (C26379k.f125351a.m135931b(true)) {
                this.f125346y.mo9221n(Boolean.TRUE);
                this.f125342u = null;
                return;
            } else {
                this.f125342u = null;
                m135909j0(c26376h, z11);
                return;
            }
        }
        this.f125342u = c26376h;
        this.f125344w.mo9221n(Boolean.TRUE);
    }

    /* renamed from: a0 */
    public final LiveData m135920a0() {
        return this.f125343v;
    }

    /* renamed from: b0 */
    public final void m135921b0() {
        m135908Q().m135964y(true);
    }

    /* renamed from: c0 */
    public final LiveData m135922c0() {
        return this.f125346y;
    }

    /* renamed from: e0 */
    public final void m135923e0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f125340s = str;
    }

    /* renamed from: f0 */
    public final LiveData m135924f0() {
        return this.f125344w;
    }

    /* renamed from: g0 */
    public final LiveData m135925g0() {
        return this.f125347z;
    }

    /* renamed from: h0 */
    public final LiveData m135926h0() {
        return this.f125339A;
    }

    /* renamed from: i0 */
    public final LiveData m135927i0() {
        return this.f125345x;
    }
}
