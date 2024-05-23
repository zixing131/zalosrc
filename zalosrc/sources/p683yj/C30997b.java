package p683yj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: yj.b */
/* loaded from: classes3.dex */
public final class C30997b extends AbstractC30996a {
    public static final a Companion = new a(null);

    /* renamed from: h */
    private final b f142979h;

    /* renamed from: i */
    private boolean f142980i;

    /* renamed from: j */
    private int f142981j;

    /* renamed from: k */
    private int f142982k;

    /* renamed from: l */
    private int f142983l;

    /* renamed from: yj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: yj.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private int f142984a = -1;

        /* renamed from: b */
        private int f142985b = -1;

        /* renamed from: c */
        private int[] f142986c = {-1};

        /* renamed from: d */
        private int f142987d = -1;

        /* renamed from: e */
        private int[] f142988e = {-1};

        /* renamed from: f */
        private int f142989f = -1;

        /* renamed from: g */
        private int f142990g = -1;

        /* renamed from: h */
        private int[] f142991h = {-1};

        /* renamed from: i */
        private int f142992i;

        /* renamed from: j */
        private int f142993j;

        /* renamed from: yj.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: c */
            public static /* synthetic */ boolean m150688c(a aVar, b bVar, c cVar, boolean z11, int i11, Object obj) {
                if ((i11 & 4) != 0) {
                    z11 = false;
                }
                return aVar.m150690b(bVar, cVar, z11);
            }

            /* renamed from: a */
            public final b m150689a(JSONObject jSONObject) {
                AbstractC19074t.m100208f(jSONObject, "jsonObject");
                return new b().m150677a(jSONObject);
            }

            /* renamed from: b */
            public final boolean m150690b(b bVar, c cVar, boolean z11) {
                AbstractC19074t.m100208f(bVar, "condition");
                AbstractC19074t.m100208f(cVar, "userInputData");
                if (bVar.m150687k() != -1 && bVar.m150687k() != cVar.m150700j()) {
                    return false;
                }
                if (bVar.m150683g() != -1 && cVar.m150695e() > bVar.m150683g()) {
                    return false;
                }
                if (bVar.m150681e()[0] != -1) {
                    if (cVar.m150700j() == 1) {
                        return false;
                    }
                    for (int i11 : bVar.m150681e()) {
                        if (i11 != cVar.m150694d()) {
                        }
                    }
                    return false;
                }
                if (bVar.m150680d() != -1 && (cVar.m150700j() == 1 || bVar.m150680d() != cVar.m150693c())) {
                    return false;
                }
                if (bVar.m150686j() != -1 && (cVar.m150700j() == 1 || bVar.m150686j() != cVar.m150699i())) {
                    return false;
                }
                if (bVar.m150685i() != -1 && (cVar.m150700j() == 1 || bVar.m150685i() != cVar.m150698h())) {
                    return false;
                }
                if (bVar.m150684h()[0] != -1) {
                    for (int i12 : bVar.m150684h()) {
                        if (i12 != cVar.m150692b()) {
                        }
                    }
                    return false;
                }
                if (bVar.m150679c()[0] != -1) {
                    for (int i13 : bVar.m150679c()) {
                        if (i13 != cVar.m150691a()) {
                        }
                    }
                    return false;
                }
                if (z11) {
                    if ((bVar.m150678b() != 0 && bVar.m150678b() == 1 && cVar.m150696f() < 30) || (bVar.m150678b() == 2 && cVar.m150696f() >= 30)) {
                        return false;
                    }
                    if (bVar.m150682f() != 0 && bVar.m150682f() != cVar.m150697g()) {
                        return false;
                    }
                }
                return true;
            }
        }

        /* renamed from: a */
        public final b m150677a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "dataJs");
            this.f142984a = jSONObject.optInt("group", this.f142984a);
            this.f142985b = jSONObject.optInt("max_member_enable_group_call", this.f142985b);
            JSONArray optJSONArray = jSONObject.optJSONArray("chatgender");
            if (optJSONArray != null) {
                AbstractC19074t.m100205c(optJSONArray);
                this.f142986c = new int[optJSONArray.length()];
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    int[] iArr = this.f142986c;
                    iArr[i11] = optJSONArray.optInt(i11, iArr[i11]);
                }
            }
            this.f142987d = jSONObject.optInt("friendbirthday", this.f142987d);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("chattime");
            if (optJSONArray2 != null) {
                AbstractC19074t.m100205c(optJSONArray2);
                this.f142988e = new int[optJSONArray2.length()];
                int length2 = optJSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    int[] iArr2 = this.f142988e;
                    iArr2[i12] = optJSONArray2.optInt(i12, iArr2[i12]);
                }
            }
            this.f142989f = jSONObject.optInt("isfriend", this.f142989f);
            this.f142990g = jSONObject.optInt("isclosefriend", this.f142990g);
            JSONArray optJSONArray3 = jSONObject.optJSONArray("dayofweek");
            if (optJSONArray3 != null) {
                AbstractC19074t.m100205c(optJSONArray3);
                this.f142991h = new int[optJSONArray3.length()];
                int length3 = optJSONArray3.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    int[] iArr3 = this.f142991h;
                    iArr3[i13] = optJSONArray3.optInt(i13, iArr3[i13]);
                }
            }
            this.f142992i = jSONObject.optInt("age", this.f142992i);
            this.f142993j = jSONObject.optInt("gender", this.f142993j);
            return this;
        }

        /* renamed from: b */
        public final int m150678b() {
            return this.f142992i;
        }

        /* renamed from: c */
        public final int[] m150679c() {
            return this.f142988e;
        }

        /* renamed from: d */
        public final int m150680d() {
            return this.f142987d;
        }

        /* renamed from: e */
        public final int[] m150681e() {
            return this.f142986c;
        }

        /* renamed from: f */
        public final int m150682f() {
            return this.f142993j;
        }

        /* renamed from: g */
        public final int m150683g() {
            return this.f142985b;
        }

        /* renamed from: h */
        public final int[] m150684h() {
            return this.f142991h;
        }

        /* renamed from: i */
        public final int m150685i() {
            return this.f142990g;
        }

        /* renamed from: j */
        public final int m150686j() {
            return this.f142989f;
        }

        /* renamed from: k */
        public final int m150687k() {
            return this.f142984a;
        }
    }

    /* renamed from: yj.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private int f142994a;

        /* renamed from: b */
        private int f142995b;

        /* renamed from: c */
        private int f142996c;

        /* renamed from: d */
        private int f142997d;

        /* renamed from: e */
        private int f142998e;

        /* renamed from: f */
        private int f142999f;

        /* renamed from: g */
        private int f143000g;

        /* renamed from: h */
        private int f143001h;

        /* renamed from: i */
        private int f143002i;

        /* renamed from: j */
        private int f143003j;

        public c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
            this.f142994a = i11;
            this.f142995b = i12;
            this.f142996c = i13;
            this.f142997d = i14;
            this.f142998e = i15;
            this.f142999f = i16;
            this.f143000g = i17;
            this.f143001h = i18;
            this.f143002i = i19;
            this.f143003j = i21;
        }

        /* renamed from: a */
        public final int m150691a() {
            return this.f142998e;
        }

        /* renamed from: b */
        public final int m150692b() {
            return this.f143001h;
        }

        /* renamed from: c */
        public final int m150693c() {
            return this.f142997d;
        }

        /* renamed from: d */
        public final int m150694d() {
            return this.f142996c;
        }

        /* renamed from: e */
        public final int m150695e() {
            return this.f142995b;
        }

        /* renamed from: f */
        public final int m150696f() {
            return this.f143002i;
        }

        /* renamed from: g */
        public final int m150697g() {
            return this.f143003j;
        }

        /* renamed from: h */
        public final int m150698h() {
            return this.f143000g;
        }

        /* renamed from: i */
        public final int m150699i() {
            return this.f142999f;
        }

        /* renamed from: j */
        public final int m150700j() {
            return this.f142994a;
        }

        public /* synthetic */ c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, AbstractC19060k abstractC19060k) {
            this((i22 & 1) != 0 ? -1 : i11, (i22 & 2) != 0 ? -1 : i12, (i22 & 4) != 0 ? -1 : i13, (i22 & 8) != 0 ? -1 : i14, (i22 & 16) != 0 ? -1 : i15, (i22 & 32) != 0 ? -1 : i16, (i22 & 64) != 0 ? -1 : i17, (i22 & 128) == 0 ? i18 : -1, (i22 & 256) != 0 ? 0 : i19, (i22 & 512) == 0 ? i21 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30997b(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f142979h = new b();
        this.f142981j = -1;
        this.f142982k = -1;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("condition");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    AbstractC19074t.m100205c(jSONObject2);
                    m150668p(jSONObject2);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    private final void m150668p(JSONObject jSONObject) {
        try {
            this.f142979h.m150677a(jSONObject);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p683yj.AbstractC30996a
    /* renamed from: c */
    protected String mo150659c() {
        StringBuilder sb2 = new StringBuilder(this.f142972a);
        sb2.append("_");
        sb2.append(this.f142979h.m150687k());
        sb2.append("_");
        int length = this.f142979h.m150681e().length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(this.f142979h.m150681e()[i11]);
        }
        sb2.append("_");
        sb2.append(this.f142979h.m150680d());
        sb2.append("_");
        int length2 = this.f142979h.m150679c().length;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(this.f142979h.m150679c()[i12]);
        }
        sb2.append("_");
        sb2.append(this.f142979h.m150686j());
        sb2.append("_");
        sb2.append(this.f142979h.m150685i());
        sb2.append("_");
        int length3 = this.f142979h.m150684h().length;
        for (int i13 = 0; i13 < length3; i13++) {
            sb2.append(this.f142979h.m150684h()[i13]);
        }
        if (this.f142979h.m150683g() != -1) {
            sb2.append("_");
            sb2.append(this.f142979h.m150683g());
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    @Override // p683yj.AbstractC30996a
    /* renamed from: g */
    public int mo150663g() {
        return 0;
    }

    /* renamed from: l */
    public final b m150669l() {
        return this.f142979h;
    }

    /* renamed from: m */
    public final int m150670m() {
        return this.f142983l;
    }

    /* renamed from: n */
    public final int m150671n() {
        return this.f142982k;
    }

    /* renamed from: o */
    public final int m150672o() {
        return this.f142981j;
    }

    /* renamed from: q */
    public final boolean m150673q() {
        return this.f142980i;
    }

    /* renamed from: r */
    public final void m150674r(int i11) {
        this.f142983l = i11;
    }

    /* renamed from: s */
    public final void m150675s(boolean z11) {
        this.f142980i = z11;
    }

    /* renamed from: t */
    public final void m150676t(int i11, int i12) {
        this.f142981j = i11;
        this.f142982k = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30997b(String str, int i11, JSONObject jSONObject) {
        super(str, i11);
        AbstractC19074t.m100208f(str, "keyword");
        this.f142979h = new b();
        this.f142981j = -1;
        this.f142982k = -1;
        if (jSONObject != null) {
            try {
                m150668p(jSONObject);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
