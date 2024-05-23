package p325lj;

import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lj.d */
/* loaded from: classes3.dex */
public final class C22497d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f110043a;

    /* renamed from: b */
    private final String f110044b;

    /* renamed from: c */
    private final String f110045c;

    /* renamed from: d */
    private final C22495b f110046d;

    /* renamed from: lj.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22497d m116308a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                int optInt = jSONObject.optInt("action", 1);
                String optString = jSONObject.optString("actionUrl");
                String optString2 = jSONObject.optString("attachmentIcon");
                C22495b m116291a = C22495b.Companion.m116291a(jSONObject.optJSONObject("attachmentDesc"));
                AbstractC19074t.m100205c(optString);
                AbstractC19074t.m100205c(optString2);
                return new C22497d(optInt, optString, optString2, m116291a);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    public C22497d(int i11, String str, String str2, C22495b c22495b) {
        AbstractC19074t.m100208f(str, "actionUrl");
        AbstractC19074t.m100208f(str2, "attachmentIcon");
        AbstractC19074t.m100208f(c22495b, "attachmentDesc");
        this.f110043a = i11;
        this.f110044b = str;
        this.f110045c = str2;
        this.f110046d = c22495b;
    }

    /* renamed from: a */
    public final int m116304a() {
        return this.f110043a;
    }

    /* renamed from: b */
    public final String m116305b() {
        return this.f110044b;
    }

    /* renamed from: c */
    public final String m116306c() {
        C22495b c22495b = this.f110046d;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_split_money);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return c22495b.m116290a(m118743r0);
    }

    /* renamed from: d */
    public final String m116307d() {
        return this.f110045c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22497d)) {
            return false;
        }
        C22497d c22497d = (C22497d) obj;
        return this.f110043a == c22497d.f110043a && AbstractC19074t.m100204b(this.f110044b, c22497d.f110044b) && AbstractC19074t.m100204b(this.f110045c, c22497d.f110045c) && AbstractC19074t.m100204b(this.f110046d, c22497d.f110046d);
    }

    public int hashCode() {
        return (((((this.f110043a * 31) + this.f110044b.hashCode()) * 31) + this.f110045c.hashCode()) * 31) + this.f110046d.hashCode();
    }

    public String toString() {
        return "SplitMoneyData(action=" + this.f110043a + ", actionUrl=" + this.f110044b + ", attachmentIcon=" + this.f110045c + ", attachmentDesc=" + this.f110046d + ")";
    }
}
