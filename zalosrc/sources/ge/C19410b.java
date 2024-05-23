package ge;

import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ge.b */
/* loaded from: classes3.dex */
public final class C19410b {

    /* renamed from: a */
    public int f96252a;

    /* renamed from: b */
    public String f96253b;

    /* renamed from: c */
    private String f96254c;

    /* renamed from: d */
    public boolean f96255d;

    /* renamed from: e */
    public String f96256e;

    /* renamed from: f */
    private int f96257f;

    /* renamed from: g */
    public String f96258g;

    public C19410b(int i11, String str, String str2, String str3, boolean z11, int i12, String str4) {
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, "desc");
        AbstractC19074t.m100208f(str3, "thumb");
        AbstractC19074t.m100208f(str4, "ownerName");
        this.f96252a = i11;
        this.f96253b = str;
        this.f96254c = str2;
        this.f96255d = z11;
        this.f96256e = str3;
        this.f96257f = i12;
        this.f96258g = str4;
    }

    /* renamed from: a */
    public final JSONObject m101525a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.f96252a);
        jSONObject.put("title", this.f96253b);
        jSONObject.put("desc", this.f96254c);
        jSONObject.put("isFollow", Byte.valueOf(this.f96255d ? (byte) 1 : (byte) 0));
        jSONObject.put("thumb", this.f96256e);
        jSONObject.put("ownerId", this.f96257f);
        jSONObject.put("ownerName", this.f96258g);
        return jSONObject;
    }

    public C19410b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f96252a = jSONObject.optInt("id", 0);
        String optString = jSONObject.optString("title", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f96253b = optString;
        String optString2 = jSONObject.optString("desc", "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        this.f96254c = optString2;
        this.f96255d = jSONObject.optInt("isFollow", 0) == 1;
        String optString3 = jSONObject.optString("thumb", "");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        this.f96256e = optString3;
        this.f96257f = jSONObject.optInt("ownerId", 0);
        String optString4 = jSONObject.optString("ownerName", "");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        this.f96258g = optString4;
    }
}
