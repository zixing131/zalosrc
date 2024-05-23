package bo;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import tj.C26712d;
import tj.C26713e;
import vg.C28212v6;

/* renamed from: bo.u0 */
/* loaded from: classes4.dex */
public final class C3043u0 {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static boolean f12259e;

    /* renamed from: a */
    private C26713e f12260a;

    /* renamed from: b */
    private b f12261b;

    /* renamed from: c */
    private boolean f12262c;

    /* renamed from: d */
    private final InterfaceC29232g f12263d = AbstractC29233h.m145990a(c.f12268q);

    /* renamed from: bo.u0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: bo.u0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final String f12264a;

        /* renamed from: b */
        private final String f12265b;

        /* renamed from: c */
        private final String f12266c;

        /* renamed from: d */
        private final int f12267d;

        /* renamed from: bo.u0$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m14628a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "json");
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("desc");
                String optString3 = jSONObject.optString("icon");
                int optInt = jSONObject.optInt("version");
                AbstractC19074t.m100205c(optString);
                AbstractC19074t.m100205c(optString2);
                AbstractC19074t.m100205c(optString3);
                return new b(optString, optString2, optString3, optInt);
            }
        }

        public b(String str, String str2, String str3, int i11) {
            AbstractC19074t.m100208f(str, "title");
            AbstractC19074t.m100208f(str2, "subTitle");
            AbstractC19074t.m100208f(str3, "icon");
            this.f12264a = str;
            this.f12265b = str2;
            this.f12266c = str3;
            this.f12267d = i11;
        }

        /* renamed from: a */
        public final String m14624a() {
            return this.f12266c;
        }

        /* renamed from: b */
        public final String m14625b() {
            return this.f12265b;
        }

        /* renamed from: c */
        public final int m14626c() {
            return this.f12267d;
        }

        /* renamed from: d */
        public final String m14627d() {
            return this.f12264a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f12264a, bVar.f12264a) && AbstractC19074t.m100204b(this.f12265b, bVar.f12265b) && AbstractC19074t.m100204b(this.f12266c, bVar.f12266c) && this.f12267d == bVar.f12267d;
        }

        public int hashCode() {
            return (((((this.f12264a.hashCode() * 31) + this.f12265b.hashCode()) * 31) + this.f12266c.hashCode()) * 31) + this.f12267d;
        }

        public String toString() {
            return "FeedFooterTip(title=" + this.f12264a + ", subTitle=" + this.f12265b + ", icon=" + this.f12266c + ", tipVersion=" + this.f12267d + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, int i11, int i12, AbstractC19060k abstractC19060k) {
            this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? -1 : i11);
        }
    }

    /* renamed from: bo.u0$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f12268q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC0924m0.m3678b2());
        }
    }

    public C3043u0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        this.f12261b = new b(null, null, null, 0, 15, null);
        if (jSONObject != null) {
            try {
                this.f12260a = new C26713e(jSONObject);
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("footerList")) != null) {
                    AbstractC19074t.m100205c(optJSONArray);
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                        if (optJSONObject2 != null) {
                            AbstractC19074t.m100205c(optJSONObject2);
                            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("tip");
                            if (optJSONObject3 != null) {
                                AbstractC19074t.m100205c(optJSONObject3);
                                this.f12261b = b.Companion.m14628a(optJSONObject3);
                            }
                            boolean z11 = true;
                            if (optJSONObject2.optInt("notShowInDetailView") != 1) {
                                z11 = false;
                            }
                            this.f12262c = z11;
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: a */
    public final C28212v6 m14616a() {
        C28212v6 c28212v6 = new C28212v6();
        c28212v6.f131577c = "tip.timeline.footerzaloconnect";
        c28212v6.f131575a = 1;
        long mo124311f = C23793c.Companion.m124321a().mo124311f();
        c28212v6.f131587m = mo124311f;
        c28212v6.f131588n = mo124311f + 86400000;
        c28212v6.f131579e = true;
        c28212v6.f131581g = this.f12261b.m14627d();
        c28212v6.f131582h = this.f12261b.m14625b();
        C28212v6.a aVar = new C28212v6.a();
        aVar.f131596a = 0;
        aVar.f131597b = this.f12261b.m14624a();
        aVar.f131598c = 48;
        aVar.f131599d = 48;
        c28212v6.f131584j = aVar;
        c28212v6.f131576b = this.f12261b.m14626c();
        c28212v6.f131590p = 3;
        return c28212v6;
    }

    /* renamed from: b */
    public final C26712d m14617b() {
        List m137358c;
        C26713e c26713e;
        List m137358c2;
        C26713e c26713e2 = this.f12260a;
        if (c26713e2 == null || (m137358c = c26713e2.m137358c()) == null || !(!m137358c.isEmpty()) || (c26713e = this.f12260a) == null || (m137358c2 = c26713e.m137358c()) == null) {
            return null;
        }
        return (C26712d) m137358c2.get(0);
    }

    /* renamed from: c */
    public final C26713e m14618c() {
        return this.f12260a;
    }

    /* renamed from: d */
    public final boolean m14619d() {
        C26712d m14617b = m14617b();
        if (m14617b != null && m14617b.m137349q()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m14620e() {
        if (f12259e) {
            if (this.f12261b.m14626c() < ((Number) this.f12263d.getValue()).intValue()) {
                return false;
            }
        } else if (this.f12261b.m14626c() <= ((Number) this.f12263d.getValue()).intValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m14621f() {
        this.f12263d.reset();
    }

    /* renamed from: g */
    public final boolean m14622g() {
        return !this.f12262c;
    }

    /* renamed from: h */
    public final JSONObject m14623h() {
        JSONObject m137363h;
        C26713e c26713e = this.f12260a;
        if (c26713e == null || (m137363h = c26713e.m137363h()) == null) {
            return new JSONObject();
        }
        return m137363h;
    }
}
