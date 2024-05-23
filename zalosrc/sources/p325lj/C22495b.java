package p325lj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p133ek.AbstractC18458a;

/* renamed from: lj.b */
/* loaded from: classes3.dex */
public final class C22495b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f110030a;

    /* renamed from: b */
    private final String f110031b;

    /* renamed from: lj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22495b m116291a(JSONObject jSONObject) {
            int i11 = 3;
            String str = null;
            byte b11 = 0;
            byte b12 = 0;
            byte b13 = 0;
            byte b14 = 0;
            byte b15 = 0;
            if (jSONObject == null) {
                return new C22495b(str, b15 == true ? 1 : 0, i11, b14 == true ? 1 : 0);
            }
            try {
                String optString = jSONObject.optString("vi");
                String optString2 = jSONObject.optString("en");
                AbstractC19074t.m100205c(optString);
                AbstractC19074t.m100205c(optString2);
                return new C22495b(optString, optString2);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                return new C22495b(b13 == true ? 1 : 0, b12 == true ? 1 : 0, i11, b11 == true ? 1 : 0);
            }
        }
    }

    public C22495b(String str, String str2) {
        AbstractC19074t.m100208f(str, "vi");
        AbstractC19074t.m100208f(str2, "en");
        this.f110030a = str;
        this.f110031b = str2;
    }

    /* renamed from: a */
    public final String m116290a(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "defaultDesc");
        if (AbstractC19074t.m100204b(AbstractC18458a.f93019a, "vi")) {
            str2 = this.f110030a;
            if (str2.length() == 0) {
                String str3 = this.f110031b;
                if (str3.length() != 0) {
                    return str3;
                }
                return str;
            }
        } else {
            str2 = this.f110031b;
            if (str2.length() == 0) {
                String str4 = this.f110030a;
                if (str4.length() != 0) {
                    return str4;
                }
                return str;
            }
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22495b)) {
            return false;
        }
        C22495b c22495b = (C22495b) obj;
        return AbstractC19074t.m100204b(this.f110030a, c22495b.f110030a) && AbstractC19074t.m100204b(this.f110031b, c22495b.f110031b);
    }

    public int hashCode() {
        return (this.f110030a.hashCode() * 31) + this.f110031b.hashCode();
    }

    public String toString() {
        return "AttachmentDescription(vi=" + this.f110030a + ", en=" + this.f110031b + ")";
    }

    public /* synthetic */ C22495b(String str, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2);
    }
}
