package p716zh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: zh.f4 */
/* loaded from: classes3.dex */
public final class C31912f4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C31852b4 f146621a;

    /* renamed from: b */
    private int f146622b;

    /* renamed from: c */
    private int f146623c;

    /* renamed from: zh.f4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C31912f4 m153374a(JSONObject jSONObject) {
            C31852b4 m153135i;
            AbstractC19074t.m100208f(jSONObject, "data");
            JSONObject optJSONObject = jSONObject.optJSONObject("client");
            if (optJSONObject == null || (m153135i = C31852b4.Companion.m153129b(optJSONObject)) == null) {
                m153135i = C31852b4.Companion.m153135i(jSONObject.optInt("client"));
            }
            return new C31912f4(m153135i, jSONObject.optInt("state", 3), jSONObject.optInt("retry"));
        }
    }

    public C31912f4(C31852b4 c31852b4, int i11, int i12) {
        AbstractC19074t.m100208f(c31852b4, "client");
        this.f146621a = c31852b4;
        this.f146622b = i11;
        this.f146623c = i12;
    }

    /* renamed from: a */
    public final C31852b4 m153368a() {
        return this.f146621a;
    }

    /* renamed from: b */
    public final int m153369b() {
        return this.f146623c;
    }

    /* renamed from: c */
    public final int m153370c() {
        return this.f146622b;
    }

    /* renamed from: d */
    public final void m153371d(int i11) {
        this.f146623c = i11;
    }

    /* renamed from: e */
    public final void m153372e(int i11) {
        this.f146622b = i11;
    }

    /* renamed from: f */
    public final JSONObject m153373f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("client", this.f146621a.m153125g());
        jSONObject.put("state", this.f146622b);
        jSONObject.put("retry", this.f146623c);
        return jSONObject;
    }

    public /* synthetic */ C31912f4(C31852b4 c31852b4, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(c31852b4, i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
