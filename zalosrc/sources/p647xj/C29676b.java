package p647xj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: xj.b */
/* loaded from: classes3.dex */
public final class C29676b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final HashSet f137099a;

    /* renamed from: b */
    private String f137100b;

    /* renamed from: c */
    private String f137101c;

    /* renamed from: d */
    private int f137102d;

    /* renamed from: e */
    private int f137103e;

    /* renamed from: xj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29676b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "data");
        this.f137099a = new HashSet();
        this.f137100b = "";
        this.f137101c = "";
        this.f137103e = 15;
        JSONArray optJSONArray = jSONObject.optJSONArray("id");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                this.f137099a.add(Integer.valueOf(optJSONArray.optInt(i11)));
            }
        }
        String optString = jSONObject.optString("keyword");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f137100b = optString;
        String optString2 = jSONObject.optString("txtP");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f137101c = optString2;
        this.f137102d = jSONObject.optInt("showType", 0);
        int optInt = jSONObject.optInt("truncatedSize", 15);
        this.f137103e = optInt > 0 ? optInt : 15;
    }

    /* renamed from: a */
    public final HashSet m147603a() {
        return this.f137099a;
    }

    /* renamed from: b */
    public final String m147604b() {
        return this.f137100b;
    }

    /* renamed from: c */
    public final int m147605c() {
        return this.f137102d;
    }

    /* renamed from: d */
    public final String m147606d() {
        return this.f137101c;
    }

    /* renamed from: e */
    public final String m147607e() {
        int length = this.f137101c.length();
        int i11 = this.f137103e;
        if (length <= i11) {
            return this.f137101c;
        }
        Pattern compile = Pattern.compile("\\W+", 64);
        String substring = this.f137101c.substring(0, this.f137103e + 1);
        AbstractC19074t.m100207e(substring, "substring(...)");
        Matcher matcher = compile.matcher(new StringBuilder(substring).reverse().toString());
        if (matcher.find() && matcher.end() >= 0 && (i11 = (this.f137103e + 1) - matcher.end()) < 0) {
            i11 = this.f137103e;
        }
        return ((Object) this.f137101c.subSequence(0, i11)) + "…";
    }
}
