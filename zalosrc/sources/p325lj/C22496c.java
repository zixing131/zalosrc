package p325lj;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p105dn.EnumC18030a;

/* renamed from: lj.c */
/* loaded from: classes3.dex */
public final class C22496c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f110032a;

    /* renamed from: b */
    private final int f110033b;

    /* renamed from: c */
    private final boolean f110034c;

    /* renamed from: d */
    private final C22495b f110035d;

    /* renamed from: e */
    private final String f110036e;

    /* renamed from: f */
    private final String f110037f;

    /* renamed from: g */
    private final String f110038g;

    /* renamed from: h */
    private final b f110039h;

    /* renamed from: lj.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22496c m116299a(String str, String str2) {
            boolean z11;
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "jsonString");
            if (str2.length() == 0) {
                return null;
            }
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt < 100) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.optInt("enable") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C22495b m116291a = C22495b.Companion.m116291a(jSONObject.optJSONObject("title"));
                String optString = jSONObject.optString("iconUrl");
                AbstractC19074t.m100207e(optString, "optString(...)");
                String optString2 = jSONObject.optString("action");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                String optString3 = jSONObject.optString("actionData");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                b.a aVar = b.Companion;
                String optString4 = jSONObject.optString("conditions");
                AbstractC19074t.m100207e(optString4, "optString(...)");
                return new C22496c(str2, parseInt, z11, m116291a, optString, optString2, optString3, aVar.m116303a(optString4));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
    }

    /* renamed from: lj.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final int f110040a;

        /* renamed from: b */
        private final int f110041b;

        /* renamed from: c */
        private final int f110042c;

        /* renamed from: lj.c$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m116303a(String str) {
                int i11;
                int i12;
                AbstractC19074t.m100208f(str, "jsonString");
                if (str.length() == 0) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i13 = -1;
                    if (jSONObject.has("chatType")) {
                        i11 = jSONObject.optInt("chatType", 0);
                    } else {
                        i11 = -1;
                    }
                    if (jSONObject.has("isFriend")) {
                        Integer valueOf = Integer.valueOf(jSONObject.optInt("isFriend", 0));
                        int intValue = valueOf.intValue();
                        if (intValue < 0 || intValue >= 2) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            i12 = valueOf.intValue();
                        } else {
                            i12 = 0;
                        }
                    } else {
                        i12 = -1;
                    }
                    if (jSONObject.has("available_e2ee")) {
                        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("available_e2ee", 0));
                        int intValue2 = valueOf2.intValue();
                        if (intValue2 < 0 || intValue2 >= 2) {
                            valueOf2 = null;
                        }
                        if (valueOf2 != null) {
                            i13 = valueOf2.intValue();
                        } else {
                            i13 = 0;
                        }
                    }
                    return new b(i11, i12, i13);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return null;
                }
            }
        }

        public b(int i11, int i12, int i13) {
            this.f110040a = i11;
            this.f110041b = i12;
            this.f110042c = i13;
        }

        /* renamed from: a */
        private final boolean m116300a(boolean z11, boolean z12, EnumC18030a enumC18030a) {
            int i11 = this.f110040a;
            if (i11 == -1) {
                return true;
            }
            if (enumC18030a == EnumC18030a.SINGLE_USER && !z12 && (i11 & 1) > 0) {
                int i12 = this.f110041b;
                if (i12 == -1) {
                    return true;
                }
                if ((z11 && i12 == 1) || (!z11 && i12 == 0)) {
                    return true;
                }
                return false;
            }
            if (enumC18030a == EnumC18030a.GROUP && (i11 & 2) > 0) {
                return true;
            }
            if (enumC18030a == EnumC18030a.SINGLE_PAGE && (i11 & 4) > 0) {
                return true;
            }
            if (z12 && (i11 & 8) > 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        private final boolean m116301c(EnumC18030a enumC18030a, boolean z11) {
            int i11;
            if ((enumC18030a != EnumC18030a.SINGLE_USER && enumC18030a != EnumC18030a.GROUP) || (i11 = this.f110042c) == -1) {
                return true;
            }
            if (z11 && i11 == 1) {
                return true;
            }
            if (!z11 && i11 == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m116302b(boolean z11, boolean z12, EnumC18030a enumC18030a, boolean z13) {
            AbstractC19074t.m100208f(enumC18030a, "chatMode");
            if (!m116300a(z11, z12, enumC18030a) || !m116301c(enumC18030a, z13)) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f110040a == bVar.f110040a && this.f110041b == bVar.f110041b && this.f110042c == bVar.f110042c;
        }

        public int hashCode() {
            return (((this.f110040a * 31) + this.f110041b) * 31) + this.f110042c;
        }

        public String toString() {
            return "Condition(chatTypeCon=" + this.f110040a + ", isFriendCon=" + this.f110041b + ", isAvailableE2eeCon=" + this.f110042c + ")";
        }
    }

    public C22496c(String str, int i11, boolean z11, C22495b c22495b, String str2, String str3, String str4, b bVar) {
        AbstractC19074t.m100208f(str, "jsonString");
        AbstractC19074t.m100208f(c22495b, "title");
        AbstractC19074t.m100208f(str2, "iconUrl");
        AbstractC19074t.m100208f(str3, "action");
        AbstractC19074t.m100208f(str4, "actionData");
        this.f110032a = str;
        this.f110033b = i11;
        this.f110034c = z11;
        this.f110035d = c22495b;
        this.f110036e = str2;
        this.f110037f = str3;
        this.f110038g = str4;
        this.f110039h = bVar;
    }

    /* renamed from: a */
    public final String m116292a() {
        return this.f110037f;
    }

    /* renamed from: b */
    public final String m116293b() {
        return this.f110038g;
    }

    /* renamed from: c */
    public final b m116294c() {
        return this.f110039h;
    }

    /* renamed from: d */
    public final boolean m116295d() {
        return this.f110034c;
    }

    /* renamed from: e */
    public final String m116296e() {
        return this.f110036e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22496c)) {
            return false;
        }
        C22496c c22496c = (C22496c) obj;
        return AbstractC19074t.m100204b(this.f110032a, c22496c.f110032a) && this.f110033b == c22496c.f110033b && this.f110034c == c22496c.f110034c && AbstractC19074t.m100204b(this.f110035d, c22496c.f110035d) && AbstractC19074t.m100204b(this.f110036e, c22496c.f110036e) && AbstractC19074t.m100204b(this.f110037f, c22496c.f110037f) && AbstractC19074t.m100204b(this.f110038g, c22496c.f110038g) && AbstractC19074t.m100204b(this.f110039h, c22496c.f110039h);
    }

    /* renamed from: f */
    public final int m116297f() {
        return this.f110033b;
    }

    /* renamed from: g */
    public final C22495b m116298g() {
        return this.f110035d;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f110032a.hashCode() * 31) + this.f110033b) * 31) + AbstractC2144f.m11520a(this.f110034c)) * 31) + this.f110035d.hashCode()) * 31) + this.f110036e.hashCode()) * 31) + this.f110037f.hashCode()) * 31) + this.f110038g.hashCode()) * 31;
        b bVar = this.f110039h;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "DynamicChatInputItem(jsonString=" + this.f110032a + ", id=" + this.f110033b + ", enable=" + this.f110034c + ", title=" + this.f110035d + ", iconUrl=" + this.f110036e + ", action=" + this.f110037f + ", actionData=" + this.f110038g + ", conditions=" + this.f110039h + ")";
    }
}
