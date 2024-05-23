package ph;

import androidx.work.AbstractC2147g0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.Map;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0874h;
import p394oj.C24277c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ph.f */
/* loaded from: classes3.dex */
public final class C24753f {
    public static final b Companion = new b(null);

    /* renamed from: i */
    private static final InterfaceC24854k f118852i;

    /* renamed from: a */
    private final int f118853a;

    /* renamed from: b */
    private String f118854b;

    /* renamed from: c */
    private final int f118855c;

    /* renamed from: d */
    private int f118856d;

    /* renamed from: e */
    private long f118857e;

    /* renamed from: f */
    private final String f118858f;

    /* renamed from: g */
    private boolean f118859g;

    /* renamed from: h */
    private boolean f118860h;

    /* renamed from: ph.f$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f118861q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map mo12V4() {
            return C24753f.Companion.m128614j();
        }
    }

    /* renamed from: ph.f$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public final Map m128614j() {
            HashMap hashMap = new HashMap();
            hashMap.put(":>", 0);
            hashMap.put(":-((", 2);
            hashMap.put("/-strong", 3);
            hashMap.put("/-heart", 5);
            hashMap.put(":-h", 20);
            hashMap.put(":o", 32);
            for (C24277c c24277c : C0874h.f3217a.m2588c()) {
                String str = c24277c.f117241b;
                AbstractC19074t.m100207e(str, "emojiContent");
                hashMap.put(str, Integer.valueOf(c24277c.f117242c));
            }
            return hashMap;
        }

        /* renamed from: b */
        public final C24753f m128615b(int i11, String str) {
            AbstractC19074t.m100208f(str, "icon");
            return new C24753f(i11, str, 0, 0, 0L, 12, null);
        }

        /* renamed from: c */
        public final C24753f m128616c(int i11, String str, int i12) {
            AbstractC19074t.m100208f(str, "icon");
            return new C24753f(-2, str, i11, i12, 0L, 16, null);
        }

        /* renamed from: d */
        public final C24753f m128617d(int i11, String str, int i12, long j11) {
            AbstractC19074t.m100208f(str, "icon");
            C24753f c24753f = new C24753f(i11, str, i12, 1, j11);
            c24753f.f118859g = true;
            c24753f.f118860h = true;
            return c24753f;
        }

        /* renamed from: e */
        public final C24753f m128618e(JSONObject jSONObject) {
            String str;
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            int i11 = -1;
            try {
                i11 = jSONObject.getInt("rType");
                str = jSONObject.getString("rIcon");
                AbstractC19074t.m100207e(str, "getString(...)");
            } catch (JSONException e11) {
                e11.printStackTrace();
                str = "";
            }
            return new C24753f(i11, str, 0, 0, 0L, 28, null);
        }

        /* renamed from: f */
        public final C24753f m128619f(int i11, String str) {
            AbstractC19074t.m100208f(str, "icon");
            if (str.length() == 0) {
                return new C24753f(-1, null, i11, 0, 0L, 26, null);
            }
            return new C24753f(-1, str, i11, 0, 0L, 24, null);
        }

        /* renamed from: g */
        public final int m128620g(String str) {
            AbstractC19074t.m100208f(str, "icon");
            Integer num = (Integer) m128622i().get(str);
            if (num != null) {
                return num.intValue();
            }
            return 100;
        }

        /* renamed from: h */
        public final String m128621h(C24753f c24753f) {
            AbstractC19074t.m100208f(c24753f, "reactionMsgType");
            if (c24753f.m128605s() && !c24753f.m128606t()) {
                return m128620g(c24753f.m128595h()) + "_" + c24753f.m128595h();
            }
            return "";
        }

        /* renamed from: i */
        public final Map m128622i() {
            return (Map) C24753f.f118852i.getValue();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f118861q);
        f118852i = m129210a;
    }

    public C24753f(int i11, String str, int i12, int i13, long j11) {
        AbstractC19074t.m100208f(str, "icon");
        this.f118853a = i11;
        this.f118854b = str;
        this.f118855c = i12;
        this.f118856d = i13;
        this.f118857e = j11;
        this.f118858f = m128599l() + "_" + this.f118854b;
    }

    /* renamed from: d */
    public static final C24753f m128590d(int i11, String str) {
        return Companion.m128615b(i11, str);
    }

    /* renamed from: e */
    public static final C24753f m128591e(int i11, String str, int i12, long j11) {
        return Companion.m128617d(i11, str, i12, j11);
    }

    /* renamed from: f */
    private final int m128592f(String str) {
        int i11 = 0;
        for (int length = str.length() - 1; -1 < length; length--) {
            i11 = (i11 * 31) + str.charAt(length);
        }
        return i11;
    }

    /* renamed from: p */
    public static /* synthetic */ C24753f m128593p(C24753f c24753f, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if ((i12 & 2) != 0) {
            j11 = C23793c.Companion.m124321a().mo124314i();
        }
        return c24753f.m128602o(i11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24753f)) {
            return false;
        }
        C24753f c24753f = (C24753f) obj;
        return this.f118853a == c24753f.f118853a && AbstractC19074t.m100204b(this.f118854b, c24753f.f118854b) && this.f118855c == c24753f.f118855c && this.f118856d == c24753f.f118856d && this.f118857e == c24753f.f118857e;
    }

    /* renamed from: g */
    public final int m128594g() {
        return this.f118856d;
    }

    /* renamed from: h */
    public final String m128595h() {
        return this.f118854b;
    }

    public int hashCode() {
        return (((((((this.f118853a * 31) + this.f118854b.hashCode()) * 31) + this.f118855c) * 31) + this.f118856d) * 31) + AbstractC2147g0.m11521a(this.f118857e);
    }

    /* renamed from: i */
    public final String m128596i() {
        return this.f118854b;
    }

    /* renamed from: j */
    public final String m128597j() {
        return this.f118858f;
    }

    /* renamed from: k */
    public final long m128598k() {
        return this.f118857e;
    }

    /* renamed from: l */
    public final int m128599l() {
        int i11 = this.f118853a;
        if (i11 != -1 && i11 != -2) {
            return Companion.m128620g(this.f118854b);
        }
        return i11;
    }

    /* renamed from: m */
    public final int m128600m() {
        if (Companion.m128620g(this.f118854b) == 100) {
            return m128592f(this.f118854b);
        }
        return m128599l();
    }

    /* renamed from: n */
    public final int m128601n() {
        return this.f118855c;
    }

    /* renamed from: o */
    public final C24753f m128602o(int i11, long j11) {
        this.f118860h = this.f118860h || this.f118856d == 0;
        this.f118856d += i11;
        this.f118857e = j11;
        this.f118859g = true;
        return this;
    }

    /* renamed from: q */
    public final boolean m128603q() {
        return this.f118859g;
    }

    /* renamed from: r */
    public final boolean m128604r() {
        return this.f118860h;
    }

    /* renamed from: s */
    public final boolean m128605s() {
        if (m128599l() == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m128606t() {
        if (m128605s() && this.f118854b.length() == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ReactionMsgType{uid=" + this.f118855c + ", type=" + m128599l() + " , icon='" + this.f118854b + "', number=" + this.f118856d + ", timestamp=" + this.f118857e + " isDataChanged=" + this.f118859g + " isNewItem=" + this.f118860h + "}";
    }

    /* renamed from: u */
    public final void m128607u() {
        this.f118860h = false;
        this.f118859g = false;
    }

    /* renamed from: v */
    public final void m128608v() {
        this.f118859g = false;
    }

    /* renamed from: w */
    public final void m128609w(int i11) {
        this.f118856d = i11;
    }

    /* renamed from: x */
    public final void m128610x(long j11) {
        this.f118857e = j11;
    }

    /* renamed from: y */
    public final JSONObject m128611y() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rType", m128599l());
        JSONObject put = jSONObject.put("rIcon", this.f118854b);
        AbstractC19074t.m100207e(put, "let(...)");
        return put;
    }

    public /* synthetic */ C24753f(int i11, String str, int i12, int i13, long j11, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? -1 : i11, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) == 0 ? i13 : 0, (i14 & 16) != 0 ? C23793c.Companion.m124321a().mo124314i() : j11);
    }
}
